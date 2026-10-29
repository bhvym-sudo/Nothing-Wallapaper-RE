package p175r4;

import W4.d;
import java.io.UnsupportedEncodingException;
import p025c4.AbstractC1202p;

/* JADX INFO: renamed from: r4.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1817i9 implements U8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1905r6 f26738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1927t8 f26739b = new C1927t8();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26740c;

    private C1817i9(C1905r6 c1905r6, int i10) {
        this.f26738a = c1905r6;
        r9.a();
        this.f26740c = i10;
    }

    public static U8 e(C1905r6 c1905r6) {
        return new C1817i9(c1905r6, 0);
    }

    public static U8 f(C1905r6 c1905r6, int i10) {
        return new C1817i9(c1905r6, 1);
    }

    @Override // p175r4.U8
    public final U8 a(C1927t8 c1927t8) {
        this.f26739b = c1927t8;
        return this;
    }

    @Override // p175r4.U8
    public final String b() {
        C1947v8 c1947v8G = this.f26738a.k().g();
        return (c1947v8G == null || J3.b(c1947v8G.k())) ? "NA" : (String) AbstractC1202p.i(c1947v8G.k());
    }

    @Override // p175r4.U8
    public final byte[] c(int i10, boolean z9) {
        this.f26739b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f26739b.e(Boolean.FALSE);
        this.f26738a.j(this.f26739b.m());
        try {
            r9.a();
            if (i10 == 0) {
                return new d().g(C1813i5.f26737a).h(true).f().b(this.f26738a.k()).getBytes("utf-8");
            }
            C1925t6 c1925t6K = this.f26738a.k();
            C1830k0 c1830k0 = new C1830k0();
            C1813i5.f26737a.a(c1830k0);
            return c1830k0.b().a(c1925t6K);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // p175r4.U8
    public final U8 d(EnumC1896q6 enumC1896q6) {
        this.f26738a.f(enumC1896q6);
        return this;
    }

    @Override // p175r4.U8
    public final int zza() {
        return this.f26740c;
    }
}
