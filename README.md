# Reverse Engineering Nothing Wallpaper Studio

This repository documents an analysis of **Wallpaper Studio** in the official Nothing Wallpaper Android application. The goal was to understand what happens after a user combines a subject and a style and taps **Create wallpaper**, then reproduce the same network flow from a computer.

## Summary

The original assumption was that Wallpaper Studio sends the selected subject and style to an AI image-generation service, which creates a new image at that moment.

Reverse engineering showed a different implementation:

1. The application downloads a list of supported subjects and styles.
2. It asks the backend how many wallpapers exist for a selected combination.
3. It chooses an integer called a `clue` from that finite range.
4. It sends the subject, style, and clue to the backend.
5. The backend returns an existing wallpaper record and a signed CloudFront URL.

For example, **Flora + Black and White** returned a count of `984`. Requesting `clue: 0` returned the existing wallpaper with ID `940` and a signed CDN URL.

The available evidence therefore indicates that the app selects from a finite catalog of wallpapers that were likely generated with AI beforehand. It does not appear to run a new AI inference every time the user taps the button.

This distinction is important: the images can still be AI-generated, but the mobile interaction is catalog selection rather than real-time image generation.

## Original Thought Process

Wallpaper Studio describes itself in the app as:

> Wallpaper Studio is a creative playground powered by AI. Here, you can select and combine various subjects and styles to craft wallpaper according to your preference. Dive in and discover the possibilities!

Based on that description and the **Create wallpaper** button, I initially imagined the following flow:

```text
Select subject and style
          |
          v
Send an AI prompt to the server
          |
          v
Generate a new image in real time
          |
          v
Return the new wallpaper
```

That raised a technical question: could the application be reverse engineered so the same API could be called from a laptop?

The experiment began with that objective. During the analysis, it became clear that the API contract was not a normal text-to-image generation contract. It used fixed prompt IDs and an integer clue, and the application contained logic for counting, shuffling, and remembering previously selected indices.

The recovered flow is closer to:

```text
Select subject and style
          |
          v
Ask how many matching wallpapers exist
          |
          v
Choose an unused catalog index (`clue`)
          |
          v
Request that entry from Nothing's backend
          |
          v
Download the existing image from CloudFront
```

## Application Analyzed

| Property | Value |
| --- | --- |
| Package | `com.nothing.wallpaper` |
| Version name | `1.8.24` |
| Version code | `1082400` |
| Feature | Wallpaper Studio |
| API base URL | `https://wallpaper.nothingtech.link` |

The supplied APK was a Play Store base split. Its manifest required ABI and density splits, while the base APK did not contain the native security library needed to read its encrypted configuration.

The installed splits were pulled from a Nothing phone using:

```bash
adb shell pm path com.nothing.wallpaper

mkdir -p nothingwall_splits
adb shell pm path com.nothing.wallpaper |
sed 's/^package://' |
while read -r apk; do
  adb pull "$apk" nothingwall_splits/
done
```

The ARM64 split contained `libsecurityJni.so`.

## Analysis Process

### 1. APK inspection

The APK was inspected with Android tooling including JADX, Apktool, AAPT, Baksmali, `readelf`, LLDB, and standard ELF utilities.

Relevant recovered classes include:

- `com.nothing.wallpaper.picker.creative.network.WallpaperApi`
- `com.nothing.wallpaper.picker.creative.network.a`
- `com.nothing.wallpaper.picker.creative.model.Prompt`
- `com.nothing.wallpaper.picker.creative.model.Wallpaper`
- `Y6.a`, the HTTP authentication interceptor
- `p087i6.e`, which manages the pseudonymous device ID

The decompiled API interface revealed three Retrofit endpoints and their request models.

### 2. Protected configuration

The base APK contained:

```text
assets/config.enc
```

The Java layer loaded the native library and called methods such as:

```java
System.loadLibrary("securityJni");
fetchKey1(context);
fetchCustomData(context);
```

Analysis of `libsecurityJni.so` showed that `config.enc` used AES-256-CBC with PKCS#5 padding. Its binary structure contained the IV, encryption key, ciphertext length, and ciphertext. Decrypting it recovered the package restrictions, API signing material, and custom configuration containing the release URL.

The authentication secret is intentionally not reproduced in this README. Avoid publishing reusable credentials, complete signed CDN URLs, or device identifiers.

### 3. Authentication

Each API request includes these headers:

```http
Accept: application/json;charset=utf-8
Content-Type: application/json
timestamp: <Unix time in milliseconds>
auth: <MD5(secret + timestamp)>
```

The application calculates:

```text
auth = MD5(secretKey + currentTimeMillis)
```

The timestamp and hash must be regenerated for every request.

### 4. Reproducing the requests

The API was replicated successfully from a shell client. The response from `getSettings` returned all prompt categories and IDs. The `getClue` response for Flora and Black and White returned `984`, and `getWallpapers` returned an existing wallpaper ID with a signed CloudFront link.

## API Reference

### Get subjects and styles

```http
POST /wallpaper/aiApi/v2/getSettings
```

Request:

```json
{
  "language": "en-in",
  "version": 0,
  "model": "A063",
  "color": "black"
}
```

Example response structure:

```json
{
  "code": "00000",
  "msg": "success",
  "data": {
    "version": 160,
    "localLanguageCode": "en-in",
    "promptSets": [
      {
        "category": "subject",
        "prompts": [
          {
            "promptWordId": 5,
            "promptWordEn": "Flora",
            "photoLink": "https://<cdn>/prompt-preview-image/...",
            "promptWordForLocale": "Flora"
          }
        ]
      },
      {
        "category": "style",
        "prompts": [
          {
            "promptWordId": 8,
            "promptWordEn": "Black and White",
            "photoLink": "https://<cdn>/prompt-preview-image/...",
            "promptWordForLocale": "Black and White"
          }
        ]
      }
    ]
  }
}
```

Recovered prompt IDs included:

| Category | ID | Prompt |
| --- | ---: | --- |
| Subject | 1 | Sky |
| Subject | 2 | Terrain |
| Subject | 3 | Still Life |
| Subject | 4 | Iridescence |
| Subject | 5 | Flora |
| Style | 8 | Black and White |
| Style | 9 | Photograph |
| Style | 10 | Painting |
| Style | 11 | Graphic |
| Style | 12 | Ink |
| Style | 20 | Modernist |

### Get the catalog size

```http
POST /wallpaper/aiApi/v1/getClue
```

Request:

```json
{
  "subjectId": 5,
  "styleId": 8
}
```

Observed response:

```json
{
  "code": "00000",
  "msg": "success",
  "data": 984
}
```

Despite its name, this endpoint returns the number of available entries for the selected subject and style. The application creates and shuffles indices from `0` through `count - 1`.

### Retrieve a wallpaper

```http
POST /wallpaper/aiApi/v2/getWallpapers
```

Request:

```json
{
  "pseudoUserId": "<UUID>",
  "clue": 0,
  "promptSet": [
    {
      "promptWordId": 5,
      "category": "subject",
      "promptWordEn": "Flora"
    },
    {
      "promptWordId": 8,
      "category": "style",
      "promptWordEn": "Black and White"
    }
  ]
}
```

Observed response structure:

```json
{
  "code": "00000",
  "msg": "success",
  "data": {
    "wallpapers": [
      {
        "link": "https://<cdn>/out/<job-id>/result/image_0.jpg?<signed-query>",
        "id": 940
      }
    ]
  }
}
```

The `pseudoUserId` is a UUID stored by the Android application in the global setting `device_unique_code`.

## What Is a Clue?

`clue` is not a text prompt, model parameter, or wallpaper ID. It behaves as an index or selector within the catalog for a subject/style pair.

For the observed Flora and Black and White combination:

```text
getClue response: 984
expected valid clues: 0 through 983
clue 0 response: wallpaper ID 940
```

The fact that clue `0` maps to wallpaper ID `940` also shows that the clue is not the database ID itself.

## Command-Line Client

The repository includes [nothingwall_api.sh](nothingwall_api.sh), which reproduces the application's request signing and JSON bodies.

Dependencies:

```text
bash
curl
jq
md5sum
```

Get the available prompts:

```bash
./nothingwall_api.sh settings en-in A063 black
```

Get the number of Flora and Black and White wallpapers:

```bash
./nothingwall_api.sh clue 5 8
```

Retrieve clue `0`:

```bash
./nothingwall_api.sh generate \
  5 "Flora" \
  8 "Black and White" \
  0
```

Retrieve and save Sky + Black and White:

```bash
url=$(./nothingwall_api.sh generate \
  1 "Sky" \
  8 "Black and White" \
  0 | jq -r '.data.wallpapers[0].link')

curl -L "$url" -o sky_black_and_white.jpg
```

## Evidence Supporting a Finite Catalog

Several independent observations support the catalog interpretation:

1. `getClue` returns a fixed integer count for each subject/style combination.
2. The app creates a list covering `0` through `count - 1`.
3. It shuffles and stores those indices locally.
4. It tracks request history to reduce repeated results.
5. The request contains fixed prompt IDs and a clue, not a free-form generation prompt or model configuration.
6. The response includes a persistent numeric wallpaper ID.
7. The response points to an existing image hosted through CloudFront.
8. The wallpaper is returned immediately without an asynchronous generation job or polling workflow.

The strongest additional experiment is to request the same subject, style, and clue repeatedly. If the same wallpaper ID is consistently returned, that confirms deterministic catalog selection.

## Conclusion

Wallpaper Studio is presented as an AI-powered creative experience, and the images may indeed have been generated using AI. However, the reverse-engineered runtime behavior indicates that tapping **Create wallpaper** does not create a unique image through real-time AI inference.

Instead, the application combines two predefined categories, selects an entry from a finite server-side catalog, and downloads the corresponding image from a CDN.

In short:

```text
AI-generated content: likely yes
Real-time AI generation on each tap: evidence says no
Finite subject/style catalog: yes
Delivery mechanism: Nothing API + signed CloudFront URL
```

## Responsible Use

This work was performed for educational interoperability and security research on an application and device available to the researcher. The API is a private implementation detail, not a documented public service. Do not overload the service, redistribute credentials, bypass access controls, or use returned content outside its applicable terms and copyright restrictions.

