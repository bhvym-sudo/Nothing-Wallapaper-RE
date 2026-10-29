package W;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r0 r0Var, p219v8.l lVar) {
        int iA = W.a(262144);
        if (!r0Var.z().Q()) {
            T.a.b("visitSubtreeIf called on an unattached node");
        }
        p190t.b bVar = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = r0Var.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar, r0Var.z());
        } else {
            bVar.b(abstractC0022cI);
        }
        while (bVar.s()) {
            C.c.AbstractC0022c abstractC0022c = (C.c.AbstractC0022c) bVar.w(bVar.p() - 1);
            if ((abstractC0022c.H() & iA) != 0) {
                C.c.AbstractC0022c abstractC0022cI2 = abstractC0022c;
                while (true) {
                    if (abstractC0022cI2 != null) {
                        if ((abstractC0022cI2.L() & iA) != 0) {
                            for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cI2; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                                if (abstractC0022cF instanceof r0) {
                                    r0 r0Var2 = (r0) abstractC0022cF;
                                    q0 q0Var = (kotlin.jvm.internal.n.d(r0Var.c(), r0Var2.c()) && C.a.a(r0Var, r0Var2)) ? (q0) lVar.f(r0Var2) : q0.ContinueTraversal;
                                    if (q0Var == q0.CancelTraversal) {
                                        return;
                                    }
                                    if (q0Var == q0.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else {
                                    abstractC0022cF.L();
                                }
                            }
                        }
                        abstractC0022cI2 = abstractC0022cI2.I();
                    }
                }
            }
            AbstractC0967i.c(bVar, abstractC0022c);
        }
    }
}
