package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025c4.AbstractC1202p;
import p035d4.c;
import p085i4.b;
import p085i4.d;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends p035d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static b f16176D = d.a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f16177A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f16178B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Set f16179C = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f16180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f16181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f16182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f16183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f16184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Uri f16185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f16186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f16187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f16188y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    List f16189z;

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j9, String str6, List list, String str7, String str8) {
        this.f16180q = i10;
        this.f16181r = str;
        this.f16182s = str2;
        this.f16183t = str3;
        this.f16184u = str4;
        this.f16185v = uri;
        this.f16186w = str5;
        this.f16187x = j9;
        this.f16188y = str6;
        this.f16189z = list;
        this.f16177A = str7;
        this.f16178B = str8;
    }

    public static GoogleSignInAccount l(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l9, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l9.longValue(), AbstractC1202p.e(str7), new ArrayList((Collection) AbstractC1202p.i(set)), str5, str6);
    }

    public static GoogleSignInAccount m(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j9 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountL = l(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j9), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountL.f16186w = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountL;
    }

    public String a() {
        return this.f16184u;
    }

    public String b() {
        return this.f16183t;
    }

    public String c() {
        return this.f16178B;
    }

    public String d() {
        return this.f16177A;
    }

    public String e() {
        return this.f16181r;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f16188y.equals(this.f16188y) && googleSignInAccount.j().equals(j());
    }

    public String f() {
        return this.f16182s;
    }

    public Uri g() {
        return this.f16185v;
    }

    public int hashCode() {
        return ((this.f16188y.hashCode() + 527) * 31) + j().hashCode();
    }

    public Set j() {
        HashSet hashSet = new HashSet(this.f16189z);
        hashSet.addAll(this.f16179C);
        return hashSet;
    }

    public String k() {
        return this.f16186w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f16180q);
        c.m(parcel, 2, e(), false);
        c.m(parcel, 3, f(), false);
        c.m(parcel, 4, b(), false);
        c.m(parcel, 5, a(), false);
        c.l(parcel, 6, g(), i10, false);
        c.m(parcel, 7, k(), false);
        c.j(parcel, 8, this.f16187x);
        c.m(parcel, 9, this.f16188y, false);
        c.p(parcel, 10, this.f16189z, false);
        c.m(parcel, 11, d(), false);
        c.m(parcel, 12, c(), false);
        c.b(parcel, iA);
    }
}
