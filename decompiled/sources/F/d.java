package F;

import W.AbstractC0967i;
import W.q0;
import W.r0;
import W.s0;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends C.c.AbstractC0022c implements r0, F.c {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f1480H = new a(null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f1481I = 8;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final l f1482D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Object f1483E = a.C0058a.f1486a;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private F.c f1484F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private f f1485G;

    public static final class a {

        /* JADX INFO: renamed from: F.d$a$a, reason: collision with other inner class name */
        private static final class C0058a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0058a f1486a = new C0058a();

            private C0058a() {
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ F.a f1487r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f1488s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ A f1489t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(F.a aVar, d dVar, A a10) {
            super(1);
            this.f1487r = aVar;
            this.f1488s = dVar;
            this.f1489t = a10;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 f(d dVar) {
            if (!dVar.Q()) {
                return q0.SkipSubtreeAndContinueTraversal;
            }
            if (!(dVar.f1485G == null)) {
                T.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            dVar.f1485G = (f) dVar.f1482D.f(this.f1487r);
            boolean z9 = dVar.f1485G != null;
            if (z9) {
                AbstractC0967i.i(this.f1488s).getDragAndDropManager().b(dVar);
            }
            A a10 = this.f1489t;
            a10.f22775q = a10.f22775q || z9;
            return q0.ContinueTraversal;
        }
    }

    static final class c extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ F.a f1490r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F.a aVar) {
            super(1);
            this.f1490r = aVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 f(d dVar) {
            if (!dVar.z().Q()) {
                return q0.SkipSubtreeAndContinueTraversal;
            }
            f fVar = dVar.f1485G;
            if (fVar != null) {
                fVar.w(this.f1490r);
            }
            dVar.f1485G = null;
            dVar.f1484F = null;
            return q0.ContinueTraversal;
        }
    }

    /* JADX INFO: renamed from: F.d$d, reason: collision with other inner class name */
    public static final class C0059d extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ E f1491r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f1492s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ F.a f1493t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0059d(E e10, d dVar, F.a aVar) {
            super(1);
            this.f1491r = e10;
            this.f1492s = dVar;
            this.f1493t = aVar;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 f(r0 r0Var) {
            d dVar = (d) r0Var;
            if (!AbstractC0967i.i(this.f1492s).getDragAndDropManager().a(dVar) || !e.d(dVar, g.a(this.f1493t))) {
                return q0.ContinueTraversal;
            }
            this.f1491r.f22779q = r0Var;
            return q0.CancelTraversal;
        }
    }

    public d(l lVar) {
        this.f1482D = lVar;
    }

    @Override // F.f
    public void B(F.a aVar) {
        f fVar = this.f1485G;
        if (fVar != null) {
            fVar.B(aVar);
        }
        F.c cVar = this.f1484F;
        if (cVar != null) {
            cVar.B(aVar);
        }
        this.f1484F = null;
    }

    @Override // F.f
    public void F(F.a aVar) {
        f fVar = this.f1485G;
        if (fVar != null) {
            fVar.F(aVar);
            return;
        }
        F.c cVar = this.f1484F;
        if (cVar != null) {
            cVar.F(aVar);
        }
    }

    @Override // C.c.AbstractC0022c
    public void U() {
        this.f1485G = null;
        this.f1484F = null;
    }

    @Override // F.f
    public boolean b(F.a aVar) {
        F.c cVar = this.f1484F;
        if (cVar != null) {
            return cVar.b(aVar);
        }
        f fVar = this.f1485G;
        if (fVar != null) {
            return fVar.b(aVar);
        }
        return false;
    }

    @Override // W.r0
    public Object c() {
        return this.f1483E;
    }

    public boolean h0(F.a aVar) {
        A a10 = new A();
        e.f(this, new b(aVar, this, a10));
        return a10.f22775q;
    }

    @Override // F.f
    public void t(F.a aVar) {
        r0 r0Var;
        F.c cVar;
        F.c cVar2 = this.f1484F;
        if (cVar2 == null || !e.d(cVar2, g.a(aVar))) {
            if (z().Q()) {
                E e10 = new E();
                s0.a(this, new C0059d(e10, this, aVar));
                r0Var = (r0) e10.f22779q;
            } else {
                r0Var = null;
            }
            cVar = (F.c) r0Var;
        } else {
            cVar = cVar2;
        }
        if (cVar != null && cVar2 == null) {
            e.e(cVar, aVar);
            f fVar = this.f1485G;
            if (fVar != null) {
                fVar.B(aVar);
            }
        } else if (cVar == null && cVar2 != null) {
            f fVar2 = this.f1485G;
            if (fVar2 != null) {
                e.e(fVar2, aVar);
            }
            cVar2.B(aVar);
        } else if (!n.d(cVar, cVar2)) {
            if (cVar != null) {
                e.e(cVar, aVar);
            }
            if (cVar2 != null) {
                cVar2.B(aVar);
            }
        } else if (cVar != null) {
            cVar.t(aVar);
        } else {
            f fVar3 = this.f1485G;
            if (fVar3 != null) {
                fVar3.t(aVar);
            }
        }
        this.f1484F = cVar;
    }

    @Override // F.f
    public void w(F.a aVar) {
        e.f(this, new c(aVar));
    }

    @Override // F.f
    public void x(F.a aVar) {
        f fVar = this.f1485G;
        if (fVar != null) {
            fVar.x(aVar);
            return;
        }
        F.c cVar = this.f1484F;
        if (cVar != null) {
            cVar.x(aVar);
        }
    }
}
