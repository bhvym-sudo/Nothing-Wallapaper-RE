package G;

import W.AbstractC0967i;
import W.B;
import W.S;
import W.W;
import androidx.constraintlayout.core.widgets.Optimizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1915a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1915a = iArr;
        }
    }

    public static final l a(b bVar) {
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        for (C.c.AbstractC0022c abstractC0022cZ = bVar.z(); abstractC0022cZ != null; abstractC0022cZ = AbstractC0967i.f(null)) {
            if (abstractC0022cZ instanceof androidx.compose.ui.focus.k) {
                m mVarO0 = ((androidx.compose.ui.focus.k) abstractC0022cZ).o0();
                int i10 = a.f1915a[mVarO0.ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return mVarO0;
                }
            } else {
                abstractC0022cZ.L();
            }
        }
        if (!bVar.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = bVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar2, bVar.z());
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
                            if (abstractC0022cF instanceof androidx.compose.ui.focus.k) {
                                m mVarO1 = ((androidx.compose.ui.focus.k) abstractC0022cF).o0();
                                int i11 = a.f1915a[mVarO1.ordinal()];
                                if (i11 == 1 || i11 == 2 || i11 == 3) {
                                    return mVarO1;
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
        return m.Inactive;
    }

    public static final void b(b bVar) {
        AbstractC0967i.i(bVar).getFocusOwner().d(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(androidx.compose.ui.focus.k kVar) {
        S sV;
        int iA = W.a(4096);
        int iA2 = W.a(Optimizer.OPTIMIZATION_GROUPING);
        C.c.AbstractC0022c abstractC0022cZ = kVar.z();
        int i10 = iA | iA2;
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cZ2 = kVar.z();
        B bH = AbstractC0967i.h(kVar);
        while (bH != null) {
            if ((bH.V().k().H() & i10) != 0) {
                while (abstractC0022cZ2 != null) {
                    if ((abstractC0022cZ2.L() & i10) != 0) {
                        if (abstractC0022cZ2 != abstractC0022cZ && (abstractC0022cZ2.L() & iA2) != 0) {
                            return;
                        }
                        if ((abstractC0022cZ2.L() & iA) != 0) {
                            for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cZ2; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                                if (abstractC0022cF instanceof b) {
                                    b bVar = (b) abstractC0022cF;
                                    bVar.G(a(bVar));
                                } else {
                                    abstractC0022cF.L();
                                }
                            }
                        }
                    }
                    abstractC0022cZ2 = abstractC0022cZ2.N();
                }
            }
            bH = bH.Y();
            abstractC0022cZ2 = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
        }
    }
}
