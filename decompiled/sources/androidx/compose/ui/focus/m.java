package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.B;
import W.S;
import W.U;
import W.W;
import androidx.constraintlayout.core.widgets.Optimizer;
import p111l0.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11443b;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11442a = iArr;
            int[] iArr2 = new int[G.m.values().length];
            try {
                iArr2[G.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[G.m.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[G.m.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[G.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f11443b = iArr2;
        }
    }

    public static final j a(k kVar, int i10, s sVar) {
        j jVarM;
        j jVar;
        j jVarA;
        f fVarM0 = kVar.m0();
        b.a aVar = b.f11397b;
        if (b.l(i10, aVar.e())) {
            return fVarM0.e();
        }
        if (b.l(i10, aVar.f())) {
            return fVarM0.j();
        }
        if (b.l(i10, aVar.h())) {
            return fVarM0.k();
        }
        if (b.l(i10, aVar.a())) {
            return fVarM0.n();
        }
        if (b.l(i10, aVar.d())) {
            int i11 = a.f11442a[sVar.ordinal()];
            if (i11 == 1) {
                jVarA = fVarM0.a();
            } else {
                if (i11 != 2) {
                    throw new p079h8.m();
                }
                jVarA = fVarM0.m();
            }
            jVar = jVarA != j.f11426b.b() ? jVarA : null;
            return jVar == null ? fVarM0.d() : jVar;
        }
        if (!b.l(i10, aVar.g())) {
            if (b.l(i10, aVar.b())) {
                return (j) fVarM0.p().f(b.i(i10));
            }
            if (b.l(i10, aVar.c())) {
                return (j) fVarM0.l().f(b.i(i10));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int i12 = a.f11442a[sVar.ordinal()];
        if (i12 == 1) {
            jVarM = fVarM0.m();
        } else {
            if (i12 != 2) {
                throw new p079h8.m();
            }
            jVarM = fVarM0.a();
        }
        jVar = jVarM != j.f11426b.b() ? jVarM : null;
        return jVar == null ? fVarM0.h() : jVar;
    }

    public static final k b(k kVar) {
        int i10 = a.f11443b[kVar.o0().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
                if (!kVar.z().Q()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                p190t.b bVar = new p190t.b(new C.c.AbstractC0022c[16], 0);
                C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
                if (abstractC0022cI == null) {
                    AbstractC0967i.c(bVar, kVar.z());
                } else {
                    bVar.b(abstractC0022cI);
                }
                while (bVar.s()) {
                    C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar.w(bVar.p() - 1);
                    if ((abstractC0022cF.H() & iA) == 0) {
                        AbstractC0967i.c(bVar, abstractC0022cF);
                    } else {
                        while (abstractC0022cF != null) {
                            if ((abstractC0022cF.L() & iA) != 0) {
                                while (abstractC0022cF != null) {
                                    if (abstractC0022cF instanceof k) {
                                        k kVarB = b((k) abstractC0022cF);
                                        if (kVarB != null) {
                                            return kVarB;
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
                return null;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    return null;
                }
                throw new p079h8.m();
            }
        }
        return kVar;
    }

    private static final k c(k kVar) {
        S sV;
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cN = kVar.z().N();
        B bH = AbstractC0967i.h(kVar);
        while (bH != null) {
            if ((bH.V().k().H() & iA) != 0) {
                while (abstractC0022cN != null) {
                    if ((abstractC0022cN.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cN; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (abstractC0022cF instanceof k) {
                                k kVar2 = (k) abstractC0022cF;
                                if (kVar2.m0().i()) {
                                    return kVar2;
                                }
                            } else {
                                abstractC0022cF.L();
                            }
                        }
                    }
                    abstractC0022cN = abstractC0022cN.N();
                }
            }
            bH = bH.Y();
            abstractC0022cN = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
        }
        return null;
    }

    public static final H.i d(k kVar) {
        H.i iVarF;
        U uJ = kVar.J();
        return (uJ == null || (iVarF = U.j.d(uJ).F(uJ, false)) == null) ? H.i.f2292e.a() : iVarF;
    }

    public static final Boolean e(k kVar, int i10, s sVar, H.i iVar, p219v8.l lVar) {
        int iG;
        b.a aVar = b.f11397b;
        if (b.l(i10, aVar.e()) ? true : b.l(i10, aVar.f())) {
            return Boolean.valueOf(o.f(kVar, i10, lVar));
        }
        if (b.l(i10, aVar.d()) ? true : b.l(i10, aVar.g()) ? true : b.l(i10, aVar.h()) ? true : b.l(i10, aVar.a())) {
            return p.t(kVar, i10, iVar, lVar);
        }
        if (!b.l(i10, aVar.b())) {
            if (b.l(i10, aVar.c())) {
                k kVarB = b(kVar);
                k kVarC = kVarB != null ? c(kVarB) : null;
                return Boolean.valueOf((kVarC == null || kotlin.jvm.internal.n.d(kVarC, kVar)) ? false : ((Boolean) lVar.f(kVarC)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.n(i10))).toString());
        }
        int i11 = a.f11442a[sVar.ordinal()];
        if (i11 == 1) {
            iG = aVar.g();
        } else {
            if (i11 != 2) {
                throw new p079h8.m();
            }
            iG = aVar.d();
        }
        k kVarB2 = b(kVar);
        if (kVarB2 != null) {
            return p.t(kVarB2, iG, iVar, lVar);
        }
        return null;
    }

    public static final k f(k kVar) {
        if (!kVar.z().Q()) {
            return null;
        }
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar, kVar.z());
        } else {
            bVar.b(abstractC0022cI);
        }
        while (bVar.s()) {
            C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar.w(bVar.p() - 1);
            if ((abstractC0022cF.H() & iA) == 0) {
                AbstractC0967i.c(bVar, abstractC0022cF);
            } else {
                while (abstractC0022cF != null) {
                    if ((abstractC0022cF.L() & iA) != 0) {
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                k kVar2 = (k) abstractC0022cF;
                                if (kVar2.z().Q()) {
                                    int i10 = a.f11443b[kVar2.o0().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return kVar2;
                                    }
                                } else {
                                    continue;
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
        return null;
    }

    public static final boolean g(k kVar) {
        B bO0;
        U uJ;
        B bO1;
        U uJ2 = kVar.J();
        return (uJ2 == null || (bO0 = uJ2.o0()) == null || !bO0.c() || (uJ = kVar.J()) == null || (bO1 = uJ.o0()) == null || !bO1.t0()) ? false : true;
    }
}
