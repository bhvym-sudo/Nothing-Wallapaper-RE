package p165q4;

import W4.d;
import java.io.UnsupportedEncodingException;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public final class y5 implements InterfaceC1595p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G3 f24997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private K4 f24998b = new K4();

    private y5(G3 g10, int i10) {
        this.f24997a = g10;
        K5.a();
    }

    public static InterfaceC1595p5 e(G3 g10) {
        return new y5(g10, 0);
    }

    @Override // p165q4.InterfaceC1595p5
    public final InterfaceC1595p5 a(K4 k9) {
        this.f24998b = k9;
        return this;
    }

    @Override // p165q4.InterfaceC1595p5
    public final byte[] b(int i10, boolean z9) {
        this.f24998b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f24998b.e(Boolean.FALSE);
        this.f24997a.e(this.f24998b.m());
        try {
            K5.a();
            if (i10 == 0) {
                return new d().g(N2.f24308a).h(true).f().b(this.f24997a.f()).getBytes("utf-8");
            }
            I3 i3F = this.f24997a.f();
            C1575n c1575n = new C1575n();
            N2.f24308a.a(c1575n);
            return c1575n.b().a(i3F);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // p165q4.InterfaceC1595p5
    public final InterfaceC1595p5 c(F3 f10) {
        this.f24997a.c(f10);
        return this;
    }

    @Override // p165q4.InterfaceC1595p5
    public final String d() {
        N4 n4C = this.f24997a.f().c();
        return (n4C == null || AbstractC1536h2.b(n4C.k())) ? "NA" : (String) AbstractC1202p.i(n4C.k());
    }
}
