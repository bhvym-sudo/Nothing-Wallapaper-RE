package androidx.compose.ui.platform;

import I.AbstractC0866j;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    private static final boolean a(H.k kVar) {
        return H.a.d(kVar.h()) + H.a.d(kVar.i()) <= kVar.j() && H.a.d(kVar.b()) + H.a.d(kVar.c()) <= kVar.j() && H.a.e(kVar.h()) + H.a.e(kVar.b()) <= kVar.d() && H.a.e(kVar.i()) + H.a.e(kVar.c()) <= kVar.d();
    }

    public static final boolean b(I.E e10, float f10, float f11, I.H h10, I.H h11) {
        if (e10 instanceof I.E.b) {
            return e(((I.E.b) e10).b(), f10, f11);
        }
        if (e10 instanceof I.E.c) {
            return f((I.E.c) e10, f10, f11, h10, h11);
        }
        if (e10 instanceof I.E.a) {
            return d(((I.E.a) e10).b(), f10, f11, h10, h11);
        }
        throw new p079h8.m();
    }

    public static /* synthetic */ boolean c(I.E e10, float f10, float f11, I.H h10, I.H h11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            h10 = null;
        }
        if ((i10 & 16) != 0) {
            h11 = null;
        }
        return b(e10, f10, f11, h10, h11);
    }

    private static final boolean d(I.H h10, float f10, float f11, I.H h11, I.H h12) {
        H.i iVar = new H.i(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (h11 == null) {
            h11 = AbstractC0866j.a();
        }
        I.H.c(h11, iVar, null, 2, null);
        if (h12 == null) {
            h12 = AbstractC0866j.a();
        }
        h12.f(h10, h11, I.I.f2653a.b());
        boolean zIsEmpty = h12.isEmpty();
        h12.b();
        h11.b();
        return !zIsEmpty;
    }

    private static final boolean e(H.i iVar, float f10, float f11) {
        return iVar.f() <= f10 && f10 < iVar.g() && iVar.i() <= f11 && f11 < iVar.c();
    }

    private static final boolean f(I.E.c cVar, float f10, float f11, I.H h10, I.H h11) {
        H.k kVarB = cVar.b();
        if (f10 < kVarB.e() || f10 >= kVarB.f() || f11 < kVarB.g() || f11 >= kVarB.a()) {
            return false;
        }
        if (!a(kVarB)) {
            I.H hA = h11 == null ? AbstractC0866j.a() : h11;
            I.H.e(hA, kVarB, null, 2, null);
            return d(hA, f10, f11, h10, h11);
        }
        float fD = H.a.d(kVarB.h()) + kVarB.e();
        float fE = H.a.e(kVarB.h()) + kVarB.g();
        float f12 = kVarB.f() - H.a.d(kVarB.i());
        float fG = kVarB.g() + H.a.e(kVarB.i());
        float f13 = kVarB.f() - H.a.d(kVarB.c());
        float fA = kVarB.a() - H.a.e(kVarB.c());
        float fA2 = kVarB.a() - H.a.e(kVarB.b());
        float fE2 = kVarB.e() + H.a.d(kVarB.b());
        if (f10 < fD && f11 < fE) {
            return g(f10, f11, kVarB.h(), fD, fE);
        }
        if (f10 < fE2 && f11 > fA2) {
            return g(f10, f11, kVarB.b(), fE2, fA2);
        }
        if (f10 > f12 && f11 < fG) {
            return g(f10, f11, kVarB.i(), f12, fG);
        }
        if (f10 <= f13 || f11 <= fA) {
            return true;
        }
        return g(f10, f11, kVarB.c(), f13, fA);
    }

    private static final boolean g(float f10, float f11, long j9, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fD = H.a.d(j9);
        float fE = H.a.e(j9);
        return ((f14 * f14) / (fD * fD)) + ((f15 * f15) / (fE * fE)) <= 1.0f;
    }
}
