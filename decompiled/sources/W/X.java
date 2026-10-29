package W;

import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.collection.C f8537a = androidx.collection.I.b();

    public static final void a(C.c.AbstractC0022c abstractC0022c) {
        if (!abstractC0022c.Q()) {
            T.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(abstractC0022c, -1, 1);
    }

    public static final void b(C.c.AbstractC0022c abstractC0022c, int i10, int i11) {
        c(abstractC0022c, i10 & abstractC0022c.L(), i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(C.c.AbstractC0022c abstractC0022c, int i10, int i11) {
        if (i11 != 0 || abstractC0022c.O()) {
            if ((W.a(2) & i10) != 0 && (abstractC0022c instanceof InterfaceC0980w)) {
                AbstractC0983z.b((InterfaceC0980w) abstractC0022c);
                if (i11 == 2) {
                    AbstractC0967i.g(abstractC0022c, W.a(2)).J1();
                }
            }
            if ((W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP) & i10) != 0 && (abstractC0022c instanceof InterfaceC0979v) && i11 != 2) {
                AbstractC0967i.h(abstractC0022c).o0();
            }
            if ((W.a(256) & i10) != 0 && (abstractC0022c instanceof InterfaceC0974p) && i11 != 2) {
                AbstractC0967i.h(abstractC0022c).p0();
            }
            if ((W.a(4) & i10) != 0 && (abstractC0022c instanceof InterfaceC0972n)) {
                AbstractC0973o.a((InterfaceC0972n) abstractC0022c);
            }
            if ((W.a(8) & i10) != 0 && (abstractC0022c instanceof m0)) {
                n0.b((m0) abstractC0022c);
            }
            if ((W.a(64) & i10) != 0 && (abstractC0022c instanceof g0)) {
                h0.a((g0) abstractC0022c);
            }
            if ((W.a(Optimizer.OPTIMIZATION_GROUPING) & i10) != 0 && (abstractC0022c instanceof androidx.compose.ui.focus.k) && i11 != 2) {
                G.n.c((androidx.compose.ui.focus.k) abstractC0022c);
            }
            if ((W.a(RecyclerView.ItemAnimator.FLAG_MOVED) & i10) != 0 && (abstractC0022c instanceof G.h)) {
                G.h hVar = (G.h) abstractC0022c;
                if (k(hVar)) {
                    if (i11 == 2) {
                        j(hVar);
                    } else {
                        G.i.a(hVar);
                    }
                }
            }
            if ((i10 & W.a(4096)) == 0 || !(abstractC0022c instanceof G.b)) {
                return;
            }
            G.c.b((G.b) abstractC0022c);
        }
    }

    public static final void d(C.c.AbstractC0022c abstractC0022c) {
        if (!abstractC0022c.Q()) {
            T.a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(abstractC0022c, -1, 2);
    }

    public static final void e(C.c.AbstractC0022c abstractC0022c) {
        if (!abstractC0022c.Q()) {
            T.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(abstractC0022c, -1, 0);
    }

    public static final int f(C.c.b bVar) {
        return W.a(1);
    }

    public static final int g(C.c.AbstractC0022c abstractC0022c) {
        if (abstractC0022c.L() != 0) {
            return abstractC0022c.L();
        }
        androidx.collection.C c10 = f8537a;
        Object objB = C.a.b(abstractC0022c);
        int iA = c10.a(objB);
        if (iA >= 0) {
            return c10.f11272c[iA];
        }
        int iA2 = W.a(1);
        if (abstractC0022c instanceof InterfaceC0980w) {
            iA2 |= W.a(2);
        }
        if (abstractC0022c instanceof InterfaceC0972n) {
            iA2 |= W.a(4);
        }
        if (abstractC0022c instanceof m0) {
            iA2 |= W.a(8);
        }
        if (abstractC0022c instanceof j0) {
            iA2 |= W.a(16);
        }
        if (abstractC0022c instanceof V.g) {
            iA2 |= W.a(32);
        }
        if (abstractC0022c instanceof g0) {
            iA2 |= W.a(64);
        }
        if (abstractC0022c instanceof InterfaceC0979v) {
            iA2 |= W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        }
        if (abstractC0022c instanceof InterfaceC0974p) {
            iA2 |= W.a(256);
        }
        if (abstractC0022c instanceof androidx.compose.ui.focus.k) {
            iA2 |= W.a(Optimizer.OPTIMIZATION_GROUPING);
        }
        if (abstractC0022c instanceof G.h) {
            iA2 |= W.a(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
        if (abstractC0022c instanceof G.b) {
            iA2 |= W.a(4096);
        }
        if (abstractC0022c instanceof O.e) {
            iA2 |= W.a(8192);
        }
        if (abstractC0022c instanceof S.a) {
            iA2 |= W.a(16384);
        }
        if (abstractC0022c instanceof InterfaceC0965g) {
            iA2 |= W.a(32768);
        }
        if (abstractC0022c instanceof r0) {
            iA2 |= W.a(262144);
        }
        c10.r(objB, iA2);
        return iA2;
    }

    public static final int h(C.c.AbstractC0022c abstractC0022c) {
        return g(abstractC0022c);
    }

    public static final boolean i(int i10) {
        return (i10 & W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP)) != 0;
    }

    private static final void j(G.h hVar) {
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!hVar.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = hVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar, hVar.z());
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
                            if (abstractC0022cF instanceof androidx.compose.ui.focus.k) {
                                G.n.c((androidx.compose.ui.focus.k) abstractC0022cF);
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

    private static final boolean k(G.h hVar) {
        C0963e c0963e = C0963e.f8572a;
        c0963e.c();
        hVar.i(c0963e);
        return c0963e.b();
    }
}
