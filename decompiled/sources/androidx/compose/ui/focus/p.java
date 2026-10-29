package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.InterfaceC0966h;
import W.W;
import androidx.constraintlayout.core.widgets.Optimizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11450a;

        static {
            int[] iArr = new int[G.m.values().length];
            try {
                iArr[G.m.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.m.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.m.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11450a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ k f11451r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ H.i f11452s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11453t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p219v8.l f11454u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, H.i iVar, int i10, p219v8.l lVar) {
            super(1);
            this.f11451r = kVar;
            this.f11452s = iVar;
            this.f11453t = i10;
            this.f11454u = lVar;
        }

        public final Boolean a(U.e.a aVar) {
            boolean zR = p.r(this.f11451r, this.f11452s, this.f11453t, this.f11454u);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            androidx.appcompat.app.o.a(obj);
            return a(null);
        }
    }

    private static final k b(k kVar) {
        if (kVar.o0() != G.m.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        k kVarB = m.b(kVar);
        if (kVarB != null) {
            return kVarB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(H.i iVar, H.i iVar2, H.i iVar3, int i10) {
        if (d(iVar3, i10, iVar) || !d(iVar2, i10, iVar)) {
            return false;
        }
        if (!e(iVar3, i10, iVar)) {
            return true;
        }
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        return androidx.compose.ui.focus.b.l(i10, aVar.d()) || androidx.compose.ui.focus.b.l(i10, aVar.g()) || f(iVar2, i10, iVar) < g(iVar3, i10, iVar);
    }

    private static final boolean d(H.i iVar, int i10, H.i iVar2) {
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            return iVar.c() > iVar2.i() && iVar.i() < iVar2.c();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.h()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.a())) {
            return iVar.g() > iVar2.f() && iVar.f() < iVar2.g();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean e(H.i iVar, int i10, H.i iVar2) {
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            return iVar2.f() >= iVar.g();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            return iVar2.g() <= iVar.f();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
            return iVar2.i() >= iVar.c();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.a())) {
            return iVar2.c() <= iVar.i();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final float f(H.i iVar, int i10, H.i iVar2) {
        float fI;
        float fC;
        float fI2;
        float fC2;
        float f10;
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (!androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
                fI = iVar.f();
                fC = iVar2.g();
            } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
                fI2 = iVar2.i();
                fC2 = iVar.c();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fI = iVar.i();
                fC = iVar2.c();
            }
            f10 = fI - fC;
            return Math.max(0.0f, f10);
        }
        fI2 = iVar2.f();
        fC2 = iVar.g();
        f10 = fI2 - fC2;
        return Math.max(0.0f, f10);
    }

    private static final float g(H.i iVar, int i10, H.i iVar2) {
        float fC;
        float fC2;
        float fI;
        float fI2;
        float f10;
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (!androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
                fC = iVar.g();
                fC2 = iVar2.g();
            } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
                fI = iVar2.i();
                fI2 = iVar.i();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fC = iVar.c();
                fC2 = iVar2.c();
            }
            f10 = fC - fC2;
            return Math.max(1.0f, f10);
        }
        fI = iVar2.f();
        fI2 = iVar.f();
        f10 = fI - fI2;
        return Math.max(1.0f, f10);
    }

    private static final H.i h(H.i iVar) {
        return new H.i(iVar.g(), iVar.c(), iVar.g(), iVar.c());
    }

    private static final void i(InterfaceC0966h interfaceC0966h, p190t.b bVar) {
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!interfaceC0966h.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = interfaceC0966h.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar2, interfaceC0966h.z());
        } else {
            bVar2.b(abstractC0022cI);
        }
        while (bVar2.s()) {
            C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar2.w(bVar2.p() - 1);
            if ((abstractC0022cF.H() & iA) == 0) {
                AbstractC0967i.c(bVar2, abstractC0022cF);
            } else {
                while (abstractC0022cF != null) {
                    if ((abstractC0022cF.L() & iA) != 0) {
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                k kVar = (k) abstractC0022cF;
                                if (kVar.Q() && !AbstractC0967i.h(kVar).u0()) {
                                    if (kVar.m0().i()) {
                                        bVar.b(kVar);
                                    } else {
                                        i(kVar, bVar);
                                    }
                                }
                            } else {
                                abstractC0022cF.L();
                            }
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                        break;
                    }
                    abstractC0022cF = abstractC0022cF.I();
                }
            }
        }
    }

    private static final k j(p190t.b bVar, H.i iVar, int i10) {
        H.i iVarM;
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            iVarM = iVar.m(iVar.j() + 1, 0.0f);
        } else if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            iVarM = iVar.m(-(iVar.j() + 1), 0.0f);
        } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
            iVarM = iVar.m(0.0f, iVar.e() + 1);
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            iVarM = iVar.m(0.0f, -(iVar.e() + 1));
        }
        int iP = bVar.p();
        k kVar = null;
        if (iP > 0) {
            Object[] objArrO = bVar.o();
            int i11 = 0;
            do {
                k kVar2 = (k) objArrO[i11];
                if (m.g(kVar2)) {
                    H.i iVarD = m.d(kVar2);
                    if (m(iVarD, iVarM, iVar, i10)) {
                        kVar = kVar2;
                        iVarM = iVarD;
                    }
                }
                i11++;
            } while (i11 < iP);
        }
        return kVar;
    }

    public static final boolean k(k kVar, int i10, p219v8.l lVar) {
        H.i iVarH;
        p190t.b bVar = new p190t.b(new k[16], 0);
        i(kVar, bVar);
        if (bVar.p() <= 1) {
            k kVar2 = (k) (bVar.r() ? null : bVar.o()[0]);
            if (kVar2 != null) {
                return ((Boolean) lVar.f(kVar2)).booleanValue();
            }
            return false;
        }
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.g()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.a())) {
            iVarH = s(m.d(kVar));
        } else {
            if (!(androidx.compose.ui.focus.b.l(i10, aVar.d()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            iVarH = h(m.d(kVar));
        }
        k kVarJ = j(bVar, iVarH, i10);
        if (kVarJ != null) {
            return ((Boolean) lVar.f(kVarJ)).booleanValue();
        }
        return false;
    }

    private static final boolean l(k kVar, H.i iVar, int i10, p219v8.l lVar) {
        if (r(kVar, iVar, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(kVar, i10, new b(kVar, iVar, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(H.i iVar, H.i iVar2, H.i iVar3, int i10) {
        if (!n(iVar, i10, iVar3)) {
            return false;
        }
        if (n(iVar2, i10, iVar3) && !c(iVar3, iVar, iVar2, i10)) {
            return !c(iVar3, iVar2, iVar, i10) && q(i10, iVar3, iVar) < q(i10, iVar3, iVar2);
        }
        return true;
    }

    private static final boolean n(H.i iVar, int i10, H.i iVar2) {
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            return (iVar2.g() > iVar.g() || iVar2.f() >= iVar.g()) && iVar2.f() > iVar.f();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            return (iVar2.f() < iVar.f() || iVar2.g() <= iVar.f()) && iVar2.g() < iVar.g();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
            return (iVar2.c() > iVar.c() || iVar2.i() >= iVar.c()) && iVar2.i() > iVar.i();
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.a())) {
            return (iVar2.i() < iVar.i() || iVar2.c() <= iVar.i()) && iVar2.c() < iVar.c();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final float o(H.i iVar, int i10, H.i iVar2) {
        float fI;
        float fC;
        float fI2;
        float fC2;
        float f10;
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (!androidx.compose.ui.focus.b.l(i10, aVar.d())) {
            if (androidx.compose.ui.focus.b.l(i10, aVar.g())) {
                fI = iVar.f();
                fC = iVar2.g();
            } else if (androidx.compose.ui.focus.b.l(i10, aVar.h())) {
                fI2 = iVar2.i();
                fC2 = iVar.c();
            } else {
                if (!androidx.compose.ui.focus.b.l(i10, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                fI = iVar.i();
                fC = iVar2.c();
            }
            f10 = fI - fC;
            return Math.max(0.0f, f10);
        }
        fI2 = iVar2.f();
        fC2 = iVar.g();
        f10 = fI2 - fC2;
        return Math.max(0.0f, f10);
    }

    private static final float p(H.i iVar, int i10, H.i iVar2) {
        float f10;
        float f11;
        float f12;
        float fJ;
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.d()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.g())) {
            f10 = 2;
            f11 = iVar2.i() + (iVar2.e() / f10);
            f12 = iVar.i();
            fJ = iVar.e();
        } else {
            if (!(androidx.compose.ui.focus.b.l(i10, aVar.h()) ? true : androidx.compose.ui.focus.b.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = 2;
            f11 = iVar2.f() + (iVar2.j() / f10);
            f12 = iVar.f();
            fJ = iVar.j();
        }
        return f11 - (f12 + (fJ / f10));
    }

    private static final long q(int i10, H.i iVar, H.i iVar2) {
        long jAbs = (long) Math.abs(o(iVar2, i10, iVar));
        long jAbs2 = (long) Math.abs(p(iVar2, i10, iVar));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(k kVar, H.i iVar, int i10, p219v8.l lVar) {
        k kVarJ;
        p190t.b bVar = new p190t.b(new k[16], 0);
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar2, kVar.z());
        } else {
            bVar2.b(abstractC0022cI);
        }
        while (bVar2.s()) {
            C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar2.w(bVar2.p() - 1);
            if ((abstractC0022cF.H() & iA) == 0) {
                AbstractC0967i.c(bVar2, abstractC0022cF);
            } else {
                while (abstractC0022cF != null) {
                    if ((abstractC0022cF.L() & iA) != 0) {
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                k kVar2 = (k) abstractC0022cF;
                                if (kVar2.Q()) {
                                    bVar.b(kVar2);
                                }
                            } else {
                                abstractC0022cF.L();
                            }
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                        break;
                    }
                    abstractC0022cF = abstractC0022cF.I();
                }
            }
        }
        while (bVar.s() && (kVarJ = j(bVar, iVar, i10)) != null) {
            if (kVarJ.m0().i()) {
                return ((Boolean) lVar.f(kVarJ)).booleanValue();
            }
            if (l(kVarJ, iVar, i10, lVar)) {
                return true;
            }
            bVar.u(kVarJ);
        }
        return false;
    }

    private static final H.i s(H.i iVar) {
        return new H.i(iVar.f(), iVar.i(), iVar.f(), iVar.i());
    }

    public static final Boolean t(k kVar, int i10, H.i iVar, p219v8.l lVar) {
        G.m mVarO0 = kVar.o0();
        int[] iArr = a.f11450a;
        int i11 = iArr[mVarO0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(k(kVar, i10, lVar));
            }
            if (i11 != 4) {
                throw new p079h8.m();
            }
            if (kVar.m0().i()) {
                return (Boolean) lVar.f(kVar);
            }
            return iVar == null ? Boolean.valueOf(k(kVar, i10, lVar)) : Boolean.valueOf(r(kVar, iVar, i10, lVar));
        }
        k kVarF = m.f(kVar);
        if (kVarF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[kVarF.o0().ordinal()];
        if (i12 == 1) {
            Boolean boolT = t(kVarF, i10, iVar, lVar);
            if (!kotlin.jvm.internal.n.d(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (iVar == null) {
                iVar = m.d(b(kVarF));
            }
            return Boolean.valueOf(l(kVar, iVar, i10, lVar));
        }
        if (i12 == 2 || i12 == 3) {
            if (iVar == null) {
                iVar = m.d(kVarF);
            }
            return Boolean.valueOf(l(kVar, iVar, i10, lVar));
        }
        if (i12 != 4) {
            throw new p079h8.m();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
