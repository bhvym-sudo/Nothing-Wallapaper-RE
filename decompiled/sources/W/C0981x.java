package W;

import I.AbstractC0864h;
import I.InterfaceC0869m;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: W.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981x extends U {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final a f8633n0 = new a(null);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final I.F f8634o0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private InterfaceC0980w f8635j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private p111l0.b f8636k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private K f8637l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private U.d f8638m0;

    /* JADX INFO: renamed from: W.x$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: W.x$b */
    private final class b extends K {
        public b() {
            super(C0981x.this);
        }

        @Override // W.J
        public int g0(U.a aVar) {
            int iB = AbstractC0982y.b(this, aVar);
            I0().put(aVar, Integer.valueOf(iB));
            return iB;
        }

        @Override // U.o
        public U.t y(long j9) {
            C0981x c0981x = C0981x.this;
            e0(j9);
            c0981x.l2(p111l0.b.a(j9));
            InterfaceC0980w interfaceC0980wH2 = c0981x.h2();
            K kJ1 = c0981x.i2().j1();
            kotlin.jvm.internal.n.e(kJ1);
            S0(interfaceC0980wH2.p(this, kJ1, j9));
            return this;
        }
    }

    static {
        I.F fA = AbstractC0864h.a();
        fA.F(I.r.f2740b.b());
        fA.G(1.0f);
        fA.E(I.G.f2645a.b());
        f8634o0 = fA;
    }

    public C0981x(B b10, InterfaceC0980w interfaceC0980w) {
        super(b10);
        this.f8635j0 = interfaceC0980w;
        U.d dVar = null;
        this.f8637l0 = b10.M() != null ? new b() : null;
        if ((interfaceC0980w.z().L() & W.a(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING)) != 0) {
            kotlin.jvm.internal.n.f(interfaceC0980w, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            androidx.appcompat.app.o.a(interfaceC0980w);
            dVar = new U.d(this, null);
        }
        this.f8638m0 = dVar;
    }

    private final void j2() {
        if (z0()) {
            return;
        }
        I1();
        U.d dVar = this.f8638m0;
        if (dVar == null) {
            p0().b();
            i2().Q1(false);
            return;
        }
        dVar.a();
        r0();
        K kJ1 = j1();
        kotlin.jvm.internal.n.e(kJ1);
        kJ1.L0();
        throw null;
    }

    @Override // W.U
    public void K1(InterfaceC0869m interfaceC0869m, L.c cVar) {
        i2().W0(interfaceC0869m, cVar);
        if (E.b(o0()).getShowLayoutBounds()) {
            X0(interfaceC0869m, f8634o0);
        }
    }

    @Override // W.U
    public void Z0() {
        if (j1() == null) {
            m2(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W.U, U.t
    public void b0(long j9, float f10, L.c cVar) {
        super.b0(j9, f10, cVar);
        j2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W.U, U.t
    public void c0(long j9, float f10, p219v8.l lVar) {
        super.c0(j9, f10, lVar);
        j2();
    }

    @Override // W.J
    public int g0(U.a aVar) {
        K kJ1 = j1();
        return kJ1 != null ? kJ1.H0(aVar) : AbstractC0982y.b(this, aVar);
    }

    public final InterfaceC0980w h2() {
        return this.f8635j0;
    }

    public final U i2() {
        U uP1 = p1();
        kotlin.jvm.internal.n.e(uP1);
        return uP1;
    }

    @Override // W.U
    public K j1() {
        return this.f8637l0;
    }

    public final void k2(InterfaceC0980w interfaceC0980w) {
        if (!kotlin.jvm.internal.n.d(interfaceC0980w, this.f8635j0)) {
            C.c.AbstractC0022c abstractC0022cZ = interfaceC0980w.z();
            if ((abstractC0022cZ.L() & W.a(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING)) != 0) {
                kotlin.jvm.internal.n.f(interfaceC0980w, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                androidx.appcompat.app.o.a(interfaceC0980w);
                U.d dVar = this.f8638m0;
                if (dVar != null) {
                    androidx.appcompat.app.o.a(interfaceC0980w);
                    dVar.f(null);
                } else {
                    androidx.appcompat.app.o.a(interfaceC0980w);
                    dVar = new U.d(this, null);
                }
                this.f8638m0 = dVar;
            } else {
                this.f8638m0 = null;
            }
        }
        this.f8635j0 = interfaceC0980w;
    }

    public final void l2(p111l0.b bVar) {
        this.f8636k0 = bVar;
    }

    protected void m2(K k9) {
        this.f8637l0 = k9;
    }

    @Override // W.U
    public C.c.AbstractC0022c o1() {
        return this.f8635j0.z();
    }

    @Override // U.o
    public U.t y(long j9) {
        if (f1()) {
            p111l0.b bVar = this.f8636k0;
            if (bVar == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j9 = bVar.m();
        }
        e0(j9);
        U.d dVar = this.f8638m0;
        if (dVar == null) {
            R1(h2().p(this, i2(), j9));
            H1();
            return this;
        }
        dVar.a();
        dVar.e();
        throw null;
    }
}
