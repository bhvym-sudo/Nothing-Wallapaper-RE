package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.B;
import W.S;
import W.W;
import androidx.constraintlayout.core.widgets.Optimizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(k kVar, int i10, p219v8.l lVar) {
        C.c.AbstractC0022c abstractC0022cF;
        S sV;
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cN = kVar.z().N();
        B bH = AbstractC0967i.h(kVar);
        loop0: while (true) {
            if (bH == null) {
                abstractC0022cF = null;
                break;
            }
            if ((bH.V().k().H() & iA) != 0) {
                while (abstractC0022cN != null) {
                    if ((abstractC0022cN.L() & iA) != 0) {
                        abstractC0022cF = abstractC0022cN;
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                break loop0;
                            }
                            abstractC0022cF.L();
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                    }
                    abstractC0022cN = abstractC0022cN.N();
                }
            }
            bH = bH.Y();
            abstractC0022cN = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
        }
        k kVar2 = (k) abstractC0022cF;
        if (kVar2 != null) {
            kVar2.n0();
            kVar.n0();
            if (kotlin.jvm.internal.n.d(null, null)) {
                return null;
            }
        }
        kVar.n0();
        return null;
    }
}
