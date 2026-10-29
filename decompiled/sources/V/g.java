package V;

import W.AbstractC0967i;
import W.B;
import W.InterfaceC0966h;
import W.S;
import W.W;

/* JADX INFO: loaded from: classes.dex */
public interface g extends InterfaceC0966h {
    /* JADX WARN: Multi-variable type inference failed */
    default Object e(c cVar) {
        S sV;
        if (!z().Q()) {
            T.a.a("ModifierLocal accessed from an unattached node");
        }
        int iA = W.a(32);
        if (!z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cN = z().N();
        B bH = AbstractC0967i.h(this);
        while (bH != null) {
            if ((bH.V().k().H() & iA) != 0) {
                while (abstractC0022cN != null) {
                    if ((abstractC0022cN.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cN; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (abstractC0022cF instanceof g) {
                                g gVar = (g) abstractC0022cF;
                                if (gVar.u().a(cVar)) {
                                    return gVar.u().b(cVar);
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
        return cVar.a().invoke();
    }

    default f u() {
        return b.f8088a;
    }
}
