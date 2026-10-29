package W;

/* JADX INFO: renamed from: W.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0967i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p190t.b bVar, C.c.AbstractC0022c abstractC0022c) {
        p190t.b bVarF0 = h(abstractC0022c).f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            int i10 = iP - 1;
            Object[] objArrO = bVarF0.o();
            do {
                bVar.b(((B) objArrO[i10]).V().k());
                i10--;
            } while (i10 >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0980w d(C.c.AbstractC0022c abstractC0022c) {
        if ((W.a(2) & abstractC0022c.L()) == 0 || !(abstractC0022c instanceof InterfaceC0980w)) {
            return null;
        }
        return (InterfaceC0980w) abstractC0022c;
    }

    public static final boolean e(InterfaceC0966h interfaceC0966h, int i10) {
        return (interfaceC0966h.z().H() & i10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C.c.AbstractC0022c f(p190t.b bVar) {
        if (bVar == null || bVar.r()) {
            return null;
        }
        return (C.c.AbstractC0022c) bVar.w(bVar.p() - 1);
    }

    public static final U g(InterfaceC0966h interfaceC0966h, int i10) {
        U uJ = interfaceC0966h.z().J();
        kotlin.jvm.internal.n.e(uJ);
        if (uJ.o1() != interfaceC0966h || !X.i(i10)) {
            return uJ;
        }
        U uP1 = uJ.p1();
        kotlin.jvm.internal.n.e(uP1);
        return uP1;
    }

    public static final B h(InterfaceC0966h interfaceC0966h) {
        U uJ = interfaceC0966h.z().J();
        if (uJ != null) {
            return uJ.o0();
        }
        T.a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new p079h8.f();
    }

    public static final d0 i(InterfaceC0966h interfaceC0966h) {
        d0 d0VarX = h(interfaceC0966h).X();
        if (d0VarX != null) {
            return d0VarX;
        }
        T.a.c("This node does not have an owner.");
        throw new p079h8.f();
    }
}
