package W;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f8474a;

    public static final class a extends C.c.AbstractC0022c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p190t.b f8475r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p190t.b bVar) {
            super(1);
            this.f8475r = bVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(C.c.b bVar) {
            this.f8475r.b(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.Z(-1);
        f8474a = aVar;
    }

    public static final int d(C.c.b bVar, C.c.b bVar2) {
        if (kotlin.jvm.internal.n.d(bVar, bVar2)) {
            return 2;
        }
        return C.a.a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p190t.b e(C.c cVar, p190t.b bVar) {
        p190t.b bVar2 = new p190t.b(new C.c[B8.h.f(bVar.p(), 16)], 0);
        bVar2.b(cVar);
        b bVar3 = null;
        while (bVar2.s()) {
            C.c cVar2 = (C.c) bVar2.w(bVar2.p() - 1);
            if (cVar2 instanceof C.b) {
                C.b bVar4 = (C.b) cVar2;
                bVar2.b(bVar4.d());
                bVar2.b(bVar4.e());
            } else if (cVar2 instanceof C.c.b) {
                bVar.b(cVar2);
            } else {
                if (bVar3 == null) {
                    bVar3 = new b(bVar);
                }
                cVar2.a(bVar3);
                bVar3 = bVar3;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(M m9, C.c.AbstractC0022c abstractC0022c) {
        kotlin.jvm.internal.n.f(abstractC0022c, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        m9.e(abstractC0022c);
    }
}
