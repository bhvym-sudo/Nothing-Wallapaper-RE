package com.google.android.datatransport.cct;

import M3.f;
import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f16150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f16151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f16153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f16154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f16155h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16157b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f16150c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f16151d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f16152e = strA3;
        f16153f = Collections.unmodifiableSet(new HashSet(Arrays.asList(K3.b.b("proto"), K3.b.b("json"))));
        f16154g = new a(strA, null);
        f16155h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f16156a = str;
        this.f16157b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Key.STRING_CHARSET_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // M3.f
    public Set a() {
        return f16153f;
    }

    public byte[] b() {
        String str = this.f16157b;
        if (str == null && this.f16156a == null) {
            return null;
        }
        String str2 = this.f16156a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(Key.STRING_CHARSET_NAME));
    }

    public String d() {
        return this.f16157b;
    }

    public String e() {
        return this.f16156a;
    }

    @Override // M3.e
    public byte[] getExtras() {
        return b();
    }

    @Override // M3.e
    public String getName() {
        return "cct";
    }
}
