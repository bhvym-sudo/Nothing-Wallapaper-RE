package F8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: F8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0814h {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final Object a(p129m8.i iVar, p219v8.p pVar) {
        AbstractC0815h0 abstractC0815h0A;
        p129m8.i iVarJ;
        Thread threadCurrentThread = Thread.currentThread();
        p129m8.f fVar = (p129m8.f) iVar.b(p129m8.f.f23250l);
        if (fVar == null) {
            abstractC0815h0A = V0.f1836a.b();
            iVarJ = G.j(C0834r0.f1894q, iVar.z(abstractC0815h0A));
        } else {
            AbstractC0815h0 abstractC0815h0 = fVar instanceof AbstractC0815h0 ? (AbstractC0815h0) fVar : null;
            if (abstractC0815h0 == null) {
                abstractC0815h0A = V0.f1836a.a();
            } else {
                AbstractC0815h0 abstractC0815h1 = abstractC0815h0.w1() ? abstractC0815h0 : null;
                if (abstractC0815h1 == null) {
                    abstractC0815h0A = V0.f1836a.a();
                } else {
                    abstractC0815h0A = abstractC0815h1;
                }
            }
            iVarJ = G.j(C0834r0.f1894q, iVar);
        }
        C0808e c0808e = new C0808e(iVarJ, threadCurrentThread, abstractC0815h0A);
        c0808e.W0(N.DEFAULT, c0808e, pVar);
        return c0808e.Y0();
    }

    public static /* synthetic */ Object b(p129m8.i iVar, p219v8.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = p129m8.j.f23252q;
        }
        return AbstractC0812g.e(iVar, pVar);
    }
}
