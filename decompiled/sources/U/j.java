package U;

import W.U;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final H.i a(i iVar) {
        H.i iVarZ;
        i iVarB = iVar.B();
        return (iVarB == null || (iVarZ = i.z(iVarB, iVar, false, 2, null)) == null) ? new H.i(0.0f, 0.0f, p111l0.q.e(iVar.v()), p111l0.q.d(iVar.v())) : iVarZ;
    }

    public static final H.i b(i iVar) {
        return i.z(d(iVar), iVar, false, 2, null);
    }

    public static final H.i c(i iVar) {
        i iVarD = d(iVar);
        float fE = p111l0.q.e(iVarD.v());
        float fD = p111l0.q.d(iVarD.v());
        H.i iVarB = b(iVar);
        float f10 = iVarB.f();
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fE) {
            f10 = fE;
        }
        float fI = iVarB.i();
        if (fI < 0.0f) {
            fI = 0.0f;
        }
        if (fI > fD) {
            fI = fD;
        }
        float fG = iVarB.g();
        if (fG < 0.0f) {
            fG = 0.0f;
        }
        if (fG <= fE) {
            fE = fG;
        }
        float fC = iVarB.c();
        float f11 = fC >= 0.0f ? fC : 0.0f;
        if (f11 <= fD) {
            fD = f11;
        }
        if (f10 == fE || fI == fD) {
            return H.i.f2292e.a();
        }
        long jF = iVarD.f(H.h.a(f10, fI));
        long jF2 = iVarD.f(H.h.a(fE, fI));
        long jF3 = iVarD.f(H.h.a(fE, fD));
        long jF4 = iVarD.f(H.h.a(f10, fD));
        float fK = H.g.k(jF);
        float fK2 = H.g.k(jF2);
        float fK3 = H.g.k(jF4);
        float fK4 = H.g.k(jF3);
        float fMin = Math.min(fK, Math.min(fK2, Math.min(fK3, fK4)));
        float fMax = Math.max(fK, Math.max(fK2, Math.max(fK3, fK4)));
        float fL = H.g.l(jF);
        float fL2 = H.g.l(jF2);
        float fL3 = H.g.l(jF4);
        float fL4 = H.g.l(jF3);
        return new H.i(fMin, Math.min(fL, Math.min(fL2, Math.min(fL3, fL4))), fMax, Math.max(fL, Math.max(fL2, Math.max(fL3, fL4))));
    }

    public static final i d(i iVar) {
        i iVar2;
        i iVarB = iVar.B();
        while (true) {
            i iVar3 = iVarB;
            iVar2 = iVar;
            iVar = iVar3;
            if (iVar == null) {
                break;
            }
            iVarB = iVar.B();
        }
        U u9 = iVar2 instanceof U ? (U) iVar2 : null;
        if (u9 == null) {
            return iVar2;
        }
        U uQ1 = u9.q1();
        while (true) {
            U u10 = uQ1;
            U u11 = u9;
            u9 = u10;
            if (u9 == null) {
                return u11;
            }
            uQ1 = u9.q1();
        }
    }

    public static final long e(i iVar) {
        return iVar.N(H.g.f2287b.c());
    }
}
