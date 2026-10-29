package W;

import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.HashSet;

/* JADX INFO: renamed from: W.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0961c extends C.c.AbstractC0022c implements InterfaceC0980w, InterfaceC0972n, m0, j0, V.g, g0, InterfaceC0979v, InterfaceC0974p, G.b, G.h, G.k, e0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private C.c.b f8558D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f8559E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private V.a f8560F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private HashSet f8561G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private U.i f8562H;

    /* JADX INFO: renamed from: W.c$a */
    static final class a extends kotlin.jvm.internal.o implements p219v8.a {
        a() {
            super(0);
        }

        public final void a() {
            C.c.b bVarH0 = C0961c.this.h0();
            kotlin.jvm.internal.n.f(bVarH0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            androidx.appcompat.app.o.a(bVarH0);
            throw null;
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public C0961c(C.c.b bVar) {
        c0(X.f(bVar));
        this.f8558D = bVar;
        this.f8559E = true;
        this.f8561G = new HashSet();
    }

    private final void i0(boolean z9) {
        if (!Q()) {
            T.a.b("initializeModifier called on unattached node");
        }
        W.a(32);
        L();
        if ((W.a(4) & L()) != 0 && !z9) {
            AbstractC0983z.a(this);
        }
        if ((W.a(2) & L()) != 0) {
            if (AbstractC0962d.c(this)) {
                U uJ = J();
                kotlin.jvm.internal.n.e(uJ);
                ((C0981x) uJ).k2(this);
                uJ.E1();
            }
            if (!z9) {
                AbstractC0983z.a(this);
                AbstractC0967i.h(this).o0();
            }
        }
        W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        L();
        W.a(256);
        L();
        W.a(16);
        L();
        if ((W.a(8) & L()) != 0) {
            AbstractC0967i.i(this).q();
        }
    }

    private final void l0() {
        if (!Q()) {
            T.a.b("unInitializeModifier called on unattached node");
        }
        W.a(32);
        L();
        if ((W.a(8) & L()) != 0) {
            AbstractC0967i.i(this).q();
        }
    }

    @Override // W.j0
    public boolean C() {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    @Override // G.b
    public void G(G.l lVar) {
        C.c.b bVar = this.f8558D;
        T.a.b("onFocusEvent called on wrong node");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    @Override // C.c.AbstractC0022c
    public void T() {
        i0(true);
    }

    @Override // C.c.AbstractC0022c
    public void U() {
        l0();
    }

    @Override // W.InterfaceC0979v
    public void d(long j9) {
    }

    @Override // W.j0
    public void f(Q.k kVar, Q.m mVar, long j9) {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    @Override // W.e0
    public boolean g() {
        return Q();
    }

    public final C.c.b h0() {
        return this.f8558D;
    }

    @Override // G.h
    public void i(androidx.compose.ui.focus.f fVar) {
        C.c.b bVar = this.f8558D;
        T.a.b("applyFocusProperties called on wrong node");
        androidx.appcompat.app.o.a(bVar);
        new G.f(fVar);
        throw null;
    }

    @Override // W.InterfaceC0979v
    public void j(U.i iVar) {
        this.f8562H = iVar;
    }

    public final void j0() {
        this.f8559E = true;
        AbstractC0973o.a(this);
    }

    public final void k0(C.c.b bVar) {
        if (Q()) {
            l0();
        }
        this.f8558D = bVar;
        c0(X.f(bVar));
        if (Q()) {
            i0(false);
        }
    }

    @Override // W.InterfaceC0972n
    public void l(K.c cVar) {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    @Override // W.j0
    public void m() {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    public final void m0() {
        if (Q()) {
            this.f8561G.clear();
            AbstractC0967i.i(this).getSnapshotObserver().i(this, AbstractC0962d.f8566c, new a());
        }
    }

    @Override // W.m0
    public void o(p011b0.r rVar) {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    @Override // W.InterfaceC0980w
    public U.q p(U.r rVar, U.o oVar, long j9) {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    @Override // W.InterfaceC0972n
    public void q() {
        this.f8559E = true;
        AbstractC0973o.a(this);
    }

    @Override // W.j0
    public boolean r() {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    @Override // W.g0
    public Object s(p111l0.d dVar, Object obj) {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }

    public String toString() {
        return this.f8558D.toString();
    }

    @Override // V.g
    public V.f u() {
        return V.h.a();
    }

    @Override // W.InterfaceC0974p
    public void y(U.i iVar) {
        C.c.b bVar = this.f8558D;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        androidx.appcompat.app.o.a(bVar);
        throw null;
    }
}
