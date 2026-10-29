package com.google.android.datatransport.cct;

import L3.j;
import L3.k;
import L3.l;
import L3.n;
import L3.o;
import L3.p;
import M3.g;
import M3.h;
import N3.f;
import N3.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bumptech.glide.load.Key;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U4.a f16160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f16161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f16162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f16163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V3.a f16164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V3.a f16165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f16166g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f16167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j f16168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f16169c;

        a(URL url, j jVar, String str) {
            this.f16167a = url;
            this.f16168b = jVar;
            this.f16169c = str;
        }

        a a(URL url) {
            return new a(url, this.f16168b, this.f16169c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f16170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f16171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f16172c;

        b(int i10, URL url, long j9) {
            this.f16170a = i10;
            this.f16171b = url;
            this.f16172c = j9;
        }
    }

    d(Context context, V3.a aVar, V3.a aVar2, int i10) {
        this.f16160a = j.b();
        this.f16162c = context;
        this.f16161b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f16163d = m(com.google.android.datatransport.cct.a.f16150c);
        this.f16164e = aVar2;
        this.f16165f = aVar;
        this.f16166g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b d(a aVar) throws IOException {
        P3.a.a("CctTransportBackend", "Making request to: %s", aVar.f16167a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f16167a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f16166g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.3.3"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f16169c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f16160a.a(aVar.f16168b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    P3.a.e("CctTransportBackend", "Status Code: " + responseCode);
                    P3.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    P3.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamL != null) {
                                try {
                                    inputStreamL.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (U4.b | IOException e10) {
            P3.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e10);
            return new b(400, null, 0L);
        } catch (ConnectException | UnknownHostException e11) {
            P3.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e11);
            return new b(500, null, 0L);
        }
    }

    private static int e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.e();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.e();
        }
        if (o.b.d(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int f(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.e() : networkInfo.getType();
    }

    private static int g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            P3.a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j h(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (h hVar : fVar.b()) {
            String strJ = hVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(hVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            h hVar2 = (h) ((List) entry.getValue()).get(0);
            L3.m.a aVarB = L3.m.a().f(p.DEFAULT).g(this.f16165f.a()).h(this.f16164e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(L3.a.a().m(Integer.valueOf(hVar2.g("sdk-version"))).j(hVar2.b("model")).f(hVar2.b("hardware")).d(hVar2.b("device")).l(hVar2.b("product")).k(hVar2.b("os-uild")).h(hVar2.b("manufacturer")).e(hVar2.b("fingerprint")).c(hVar2.b("country")).g(hVar2.b("locale")).i(hVar2.b("mcc_mnc")).b(hVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar3 : (List) entry.getValue()) {
                g gVarE = hVar3.e();
                K3.b bVarB = gVarE.b();
                if (bVarB.equals(K3.b.b("proto"))) {
                    aVarJ = l.j(gVarE.a());
                } else if (bVarB.equals(K3.b.b("json"))) {
                    aVarJ = l.i(new String(gVarE.a(), Charset.forName(Key.STRING_CHARSET_NAME)));
                } else {
                    P3.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(hVar3.f()).d(hVar3.k()).h(hVar3.h("tz-offset")).e(o.a().c(o.c.d(hVar3.g("net-type"))).b(o.b.d(hVar3.g("mobile-subtype"))).a());
                if (hVar3.d() != null) {
                    aVarJ.b(hVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager i(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long j() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.f16171b;
        if (url == null) {
            return null;
        }
        P3.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f16171b);
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // N3.m
    public h a(h hVar) {
        NetworkInfo activeNetworkInfo = this.f16161b.getActiveNetworkInfo();
        return hVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", j()).a("net-type", f(activeNetworkInfo)).a("mobile-subtype", e(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", i(this.f16162c).getSimOperator()).c("application_build", Integer.toString(g(this.f16162c))).d();
    }

    @Override // N3.m
    public N3.g b(f fVar) {
        j jVarH = h(fVar);
        URL urlM = this.f16163d;
        String strD = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return N3.g.a();
            }
        }
        try {
            b bVar = (b) Q3.b.a(5, new a(urlM, jVarH, strD), com.google.android.datatransport.cct.b.a(this), c.b());
            int i10 = bVar.f16170a;
            if (i10 == 200) {
                return N3.g.d(bVar.f16172c);
            }
            if (i10 < 500 && i10 != 404) {
                return N3.g.a();
            }
            return N3.g.e();
        } catch (IOException e10) {
            P3.a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return N3.g.e();
        }
    }

    d(Context context, V3.a aVar, V3.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }
}
