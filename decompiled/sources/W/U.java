package W;

import I.InterfaceC0869m;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends J implements U.o, U.i, e0 {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final e f8476b0 = new e(null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final p219v8.l f8477c0 = d.f8507r;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final p219v8.l f8478d0 = c.f8506r;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final I.M f8479e0 = new I.M();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final C0978u f8480f0 = new C0978u();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final float[] f8481g0 = I.C.c(null, 1, null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final f f8482h0 = new a();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final f f8483i0 = new b();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final B f8484F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f8485G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f8486H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private U f8487I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private U f8488J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f8489K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f8490L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p219v8.l f8491M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private U.q f8495Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Map f8496R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f8498T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private H.e f8499U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private C0978u f8500V;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f8503Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private c0 f8504Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private L.c f8505a0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p111l0.d f8492N = o0().z();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private p111l0.s f8493O = o0().getLayoutDirection();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f8494P = 0.8f;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f8497S = p111l0.m.f22829a.a();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final p219v8.p f8501W = new g();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final p219v8.a f8502X = new j();

    public static final class a implements f {
        a() {
        }

        @Override // W.U.f
        public int a() {
            return W.a(16);
        }

        @Override // W.U.f
        public void b(B b10, long j9, C0975q c0975q, boolean z9, boolean z10) {
            b10.g0(j9, c0975q, z9, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // W.U.f
        public boolean c(C.c.AbstractC0022c abstractC0022c) {
            W.a(16);
            for (C.c.AbstractC0022c abstractC0022cF = abstractC0022c; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                if (!(abstractC0022cF instanceof j0)) {
                    abstractC0022cF.L();
                } else if (((j0) abstractC0022cF).r()) {
                    return true;
                }
            }
            return false;
        }

        @Override // W.U.f
        public boolean d(B b10) {
            return true;
        }
    }

    public static final class b implements f {
        b() {
        }

        @Override // W.U.f
        public int a() {
            return W.a(8);
        }

        @Override // W.U.f
        public void b(B b10, long j9, C0975q c0975q, boolean z9, boolean z10) {
            b10.i0(j9, c0975q, z9, z10);
        }

        @Override // W.U.f
        public boolean c(C.c.AbstractC0022c abstractC0022c) {
            return false;
        }

        @Override // W.U.f
        public boolean d(B b10) {
            p011b0.g gVarY = b10.y();
            boolean z9 = false;
            if (gVarY != null && gVarY.p()) {
                z9 = true;
            }
            return !z9;
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f8506r = new c();

        c() {
            super(1);
        }

        public final void a(U u9) {
            c0 c0VarI1 = u9.i1();
            if (c0VarI1 != null) {
                c0VarI1.invalidate();
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((U) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class d extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final d f8507r = new d();

        d() {
            super(1);
        }

        public final void a(U u9) {
            if (u9.g()) {
                C0978u c0978u = u9.f8500V;
                if (c0978u == null) {
                    U.e2(u9, false, 1, null);
                    return;
                }
                U.f8480f0.b(c0978u);
                U.e2(u9, false, 1, null);
                if (U.f8480f0.c(c0978u)) {
                    return;
                }
                B bO0 = u9.o0();
                F fG = bO0.G();
                if (fG.s() > 0) {
                    if (fG.u() || fG.v()) {
                        B.V0(bO0, false, 1, null);
                    }
                    fG.I().z0();
                }
                d0 d0VarX = bO0.X();
                if (d0VarX != null) {
                    d0VarX.m(bO0);
                }
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((U) obj);
            return p079h8.A.f21846a;
        }
    }

    public static final class e {
        public /* synthetic */ e(AbstractC1457h abstractC1457h) {
            this();
        }

        public final f a() {
            return U.f8482h0;
        }

        public final f b() {
            return U.f8483i0;
        }

        private e() {
        }
    }

    public interface f {
        int a();

        void b(B b10, long j9, C0975q c0975q, boolean z9, boolean z10);

        boolean c(C.c.AbstractC0022c abstractC0022c);

        boolean d(B b10);
    }

    static final class g extends kotlin.jvm.internal.o implements p219v8.p {

        static final class a extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ U f8509r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC0869m f8510s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ L.c f8511t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U u9, InterfaceC0869m interfaceC0869m, L.c cVar) {
                super(0);
                this.f8509r = u9;
                this.f8510s = interfaceC0869m;
                this.f8511t = cVar;
            }

            public final void a() {
                this.f8509r.Y0(this.f8510s, this.f8511t);
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        g() {
            super(2);
        }

        public final void a(InterfaceC0869m interfaceC0869m, L.c cVar) {
            if (!U.this.o0().c()) {
                U.this.f8503Y = true;
            } else {
                U.this.n1().i(U.this, U.f8478d0, new a(U.this, interfaceC0869m, cVar));
                U.this.f8503Y = false;
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC0869m) obj, (L.c) obj2);
            return p079h8.A.f21846a;
        }
    }

    static final class h extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ C.c.AbstractC0022c f8513s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f8514t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f8515u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ C0975q f8516v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f8517w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f8518x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C.c.AbstractC0022c abstractC0022c, f fVar, long j9, C0975q c0975q, boolean z9, boolean z10) {
            super(0);
            this.f8513s = abstractC0022c;
            this.f8514t = fVar;
            this.f8515u = j9;
            this.f8516v = c0975q;
            this.f8517w = z9;
            this.f8518x = z10;
        }

        public final void a() {
            U.this.v1(V.b(this.f8513s, this.f8514t.a(), W.a(2)), this.f8514t, this.f8515u, this.f8516v, this.f8517w, this.f8518x);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class i extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ C.c.AbstractC0022c f8520s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f8521t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f8522u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ C0975q f8523v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f8524w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f8525x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ float f8526y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C.c.AbstractC0022c abstractC0022c, f fVar, long j9, C0975q c0975q, boolean z9, boolean z10, float f10) {
            super(0);
            this.f8520s = abstractC0022c;
            this.f8521t = fVar;
            this.f8522u = j9;
            this.f8523v = c0975q;
            this.f8524w = z9;
            this.f8525x = z10;
            this.f8526y = f10;
        }

        public final void a() {
            U.this.w1(V.b(this.f8520s, this.f8521t.a(), W.a(2)), this.f8521t, this.f8522u, this.f8523v, this.f8524w, this.f8525x, this.f8526y);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class j extends kotlin.jvm.internal.o implements p219v8.a {
        j() {
            super(0);
        }

        public final void a() {
            U uQ1 = U.this.q1();
            if (uQ1 != null) {
                uQ1.z1();
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class k extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ C.c.AbstractC0022c f8529s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f8530t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f8531u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ C0975q f8532v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f8533w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ boolean f8534x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ float f8535y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C.c.AbstractC0022c abstractC0022c, f fVar, long j9, C0975q c0975q, boolean z9, boolean z10, float f10) {
            super(0);
            this.f8529s = abstractC0022c;
            this.f8530t = fVar;
            this.f8531u = j9;
            this.f8532v = c0975q;
            this.f8533w = z9;
            this.f8534x = z10;
            this.f8535y = f10;
        }

        public final void a() {
            U.this.W1(V.b(this.f8529s, this.f8530t.a(), W.a(2)), this.f8530t, this.f8531u, this.f8532v, this.f8533w, this.f8534x, this.f8535y);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class l extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f8536r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(p219v8.l lVar) {
            super(0);
            this.f8536r = lVar;
        }

        public final void a() {
            this.f8536r.f(U.f8479e0);
            U.f8479e0.d0();
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public U(B b10) {
        this.f8484F = b10;
    }

    private final long C1(long j9) {
        float fK = H.g.k(j9);
        float fMax = Math.max(0.0f, fK < 0.0f ? -fK : fK - X());
        float fL = H.g.l(j9);
        return H.h.a(fMax, Math.max(0.0f, fL < 0.0f ? -fL : fL - V()));
    }

    private final void L1(long j9, float f10, p219v8.l lVar, L.c cVar) {
        if (cVar != null) {
            if (!(lVar == null)) {
                T.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f8505a0 != cVar) {
                this.f8505a0 = null;
                c2(this, null, false, 2, null);
                this.f8505a0 = cVar;
            }
            if (this.f8504Z == null) {
                c0 c0VarU = E.b(o0()).u(this.f8501W, this.f8502X, cVar);
                c0VarU.f(W());
                c0VarU.h(j9);
                this.f8504Z = c0VarU;
                o0().d1(true);
                this.f8502X.invoke();
            }
        } else {
            if (this.f8505a0 != null) {
                this.f8505a0 = null;
                c2(this, null, false, 2, null);
            }
            c2(this, lVar, false, 2, null);
        }
        if (!p111l0.m.c(s0(), j9)) {
            S1(j9);
            o0().G().I().z0();
            c0 c0Var = this.f8504Z;
            if (c0Var != null) {
                c0Var.h(j9);
            } else {
                U u9 = this.f8488J;
                if (u9 != null) {
                    u9.z1();
                }
            }
            u0(this);
            d0 d0VarX = o0().X();
            if (d0VarX != null) {
                d0VarX.i(o0());
            }
        }
        this.f8498T = f10;
        if (y0()) {
            return;
        }
        i0(p0());
    }

    public static /* synthetic */ void O1(U u9, H.e eVar, boolean z9, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        u9.N1(eVar, z9, z10);
    }

    private final void S0(U u9, H.e eVar, boolean z9) {
        if (u9 == this) {
            return;
        }
        U u10 = this.f8488J;
        if (u10 != null) {
            u10.S0(u9, eVar, z9);
        }
        d1(eVar, z9);
    }

    private final long T0(U u9, long j9, boolean z9) {
        if (u9 == this) {
            return j9;
        }
        U u10 = this.f8488J;
        return (u10 == null || kotlin.jvm.internal.n.d(u9, u10)) ? b1(j9, z9) : b1(u10.T0(u9, j9, z9), z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(C.c.AbstractC0022c abstractC0022c, f fVar, long j9, C0975q c0975q, boolean z9, boolean z10, float f10) {
        if (abstractC0022c == null) {
            y1(fVar, j9, c0975q, z9, z10);
        } else if (fVar.c(abstractC0022c)) {
            c0975q.z(abstractC0022c, f10, z10, new k(abstractC0022c, fVar, j9, c0975q, z9, z10, f10));
        } else {
            W1(V.b(abstractC0022c, fVar.a(), W.a(2)), fVar, j9, c0975q, z9, z10, f10);
        }
    }

    private final U X1(U.i iVar) {
        U uA;
        U.m mVar = iVar instanceof U.m ? (U.m) iVar : null;
        if (mVar != null && (uA = mVar.a()) != null) {
            return uA;
        }
        kotlin.jvm.internal.n.f(iVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (U) iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(InterfaceC0869m interfaceC0869m, L.c cVar) {
        C.c.AbstractC0022c abstractC0022cT1 = t1(W.a(4));
        if (abstractC0022cT1 == null) {
            K1(interfaceC0869m, cVar);
        } else {
            o0().N().a(interfaceC0869m, p111l0.r.c(v()), this, abstractC0022cT1, cVar);
        }
    }

    public static /* synthetic */ long Z1(U u9, long j9, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        return u9.Y1(j9, z9);
    }

    public static /* synthetic */ long c1(U u9, long j9, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        return u9.b1(j9, z9);
    }

    public static /* synthetic */ void c2(U u9, p219v8.l lVar, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        u9.b2(lVar, z9);
    }

    private final void d1(H.e eVar, boolean z9) {
        float fD = p111l0.m.d(s0());
        eVar.i(eVar.b() - fD);
        eVar.j(eVar.c() - fD);
        float fE = p111l0.m.e(s0());
        eVar.k(eVar.d() - fE);
        eVar.h(eVar.a() - fE);
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            c0Var.g(eVar, true);
            if (this.f8490L && z9) {
                eVar.e(0.0f, 0.0f, p111l0.q.e(v()), p111l0.q.d(v()));
                eVar.f();
            }
        }
    }

    private final void d2(boolean z9) {
        d0 d0VarX;
        if (this.f8505a0 != null) {
            return;
        }
        c0 c0Var = this.f8504Z;
        if (c0Var == null) {
            if (this.f8491M == null) {
                return;
            }
            T.a.b("null layer with a non-null layerBlock");
            return;
        }
        p219v8.l lVar = this.f8491M;
        if (lVar == null) {
            T.a.c("updateLayerParameters requires a non-null layerBlock");
            throw new p079h8.f();
        }
        I.M m9 = f8479e0;
        m9.B();
        m9.N(o0().z());
        m9.P(o0().getLayoutDirection());
        m9.Y(p111l0.r.c(v()));
        n1().i(this, f8477c0, new l(lVar));
        C0978u c0978u = this.f8500V;
        if (c0978u == null) {
            c0978u = new C0978u();
            this.f8500V = c0978u;
        }
        c0978u.a(m9);
        c0Var.j(m9);
        this.f8490L = m9.e();
        this.f8494P = m9.a();
        if (!z9 || (d0VarX = o0().X()) == null) {
            return;
        }
        d0VarX.i(o0());
    }

    static /* synthetic */ void e2(U u9, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        u9.d2(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f0 n1() {
        return E.b(o0()).getSnapshotObserver();
    }

    private final boolean s1(int i10) {
        C.c.AbstractC0022c abstractC0022cU1 = u1(X.i(i10));
        return abstractC0022cU1 != null && AbstractC0967i.e(abstractC0022cU1, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C.c.AbstractC0022c u1(boolean z9) {
        C.c.AbstractC0022c abstractC0022cO1;
        if (o0().W() == this) {
            return o0().V().k();
        }
        if (!z9) {
            U u9 = this.f8488J;
            if (u9 != null) {
                return u9.o1();
            }
            return null;
        }
        U u10 = this.f8488J;
        if (u10 == null || (abstractC0022cO1 = u10.o1()) == null) {
            return null;
        }
        return abstractC0022cO1.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(C.c.AbstractC0022c abstractC0022c, f fVar, long j9, C0975q c0975q, boolean z9, boolean z10) {
        if (abstractC0022c == null) {
            y1(fVar, j9, c0975q, z9, z10);
        } else {
            c0975q.t(abstractC0022c, z10, new h(abstractC0022c, fVar, j9, c0975q, z9, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(C.c.AbstractC0022c abstractC0022c, f fVar, long j9, C0975q c0975q, boolean z9, boolean z10, float f10) {
        if (abstractC0022c == null) {
            y1(fVar, j9, c0975q, z9, z10);
        } else {
            c0975q.u(abstractC0022c, f10, z10, new i(abstractC0022c, fVar, j9, c0975q, z9, z10, f10));
        }
    }

    @Override // p111l0.k
    public float A() {
        return o0().z().A();
    }

    protected final boolean A1(long j9) {
        float fK = H.g.k(j9);
        float fL = H.g.l(j9);
        return fK >= 0.0f && fL >= 0.0f && fK < ((float) X()) && fL < ((float) V());
    }

    @Override // U.i
    public final U.i B() {
        if (!t()) {
            T.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        D1();
        return o0().W().f8488J;
    }

    @Override // W.J
    public void B0() {
        L.c cVar = this.f8505a0;
        if (cVar != null) {
            b0(s0(), this.f8498T, cVar);
        } else {
            c0(s0(), this.f8498T, this.f8491M);
        }
    }

    public final boolean B1() {
        if (this.f8504Z != null && this.f8494P <= 0.0f) {
            return true;
        }
        U u9 = this.f8488J;
        if (u9 != null) {
            return u9.B1();
        }
        return false;
    }

    @Override // U.i
    public long C(U.i iVar, long j9) {
        return I(iVar, j9, true);
    }

    public final void D1() {
        o0().G().S();
    }

    public void E1() {
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            c0Var.invalidate();
        }
    }

    @Override // U.i
    public H.i F(U.i iVar, boolean z9) {
        if (!t()) {
            T.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!iVar.t()) {
            T.a.b("LayoutCoordinates " + iVar + " is not attached!");
        }
        U uX1 = X1(iVar);
        uX1.D1();
        U uA1 = a1(uX1);
        H.e eVarM1 = m1();
        eVarM1.i(0.0f);
        eVarM1.k(0.0f);
        eVarM1.j(p111l0.q.e(iVar.v()));
        eVarM1.h(p111l0.q.d(iVar.v()));
        U u9 = uX1;
        while (u9 != uA1) {
            boolean z10 = z9;
            O1(u9, eVarM1, z10, false, 4, null);
            if (eVarM1.f()) {
                return H.i.f2292e.a();
            }
            u9 = u9.f8488J;
            kotlin.jvm.internal.n.e(u9);
            z9 = z10;
        }
        S0(uA1, eVarM1, z9);
        return H.f.a(eVarM1);
    }

    public final void F1() {
        b2(this.f8491M, true);
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            c0Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void G1(int i10, int i11) {
        U u9;
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            c0Var.f(p111l0.r.a(i10, i11));
        } else if (o0().c() && (u9 = this.f8488J) != null) {
            u9.z1();
        }
        d0(p111l0.r.a(i10, i11));
        if (this.f8491M != null) {
            d2(false);
        }
        int iA = W.a(4);
        boolean zI = X.i(iA);
        C.c.AbstractC0022c abstractC0022cO1 = o1();
        if (zI || (abstractC0022cO1 = abstractC0022cO1.N()) != null) {
            for (C.c.AbstractC0022c abstractC0022cU1 = u1(zI); abstractC0022cU1 != null && (abstractC0022cU1.H() & iA) != 0; abstractC0022cU1 = abstractC0022cU1.I()) {
                if ((abstractC0022cU1.L() & iA) != 0) {
                    for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cU1; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                        if (abstractC0022cF instanceof InterfaceC0972n) {
                            ((InterfaceC0972n) abstractC0022cF).q();
                        } else {
                            abstractC0022cF.L();
                        }
                    }
                }
                if (abstractC0022cU1 == abstractC0022cO1) {
                    break;
                }
            }
        }
        d0 d0VarX = o0().X();
        if (d0VarX != null) {
            d0VarX.i(o0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H1() {
        C.c.AbstractC0022c abstractC0022cN;
        if (s1(W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP))) {
            A.k.a aVar = A.k.f25e;
            A.k kVarD = aVar.d();
            p219v8.l lVarH = kVarD != null ? kVarD.h() : null;
            A.k kVarF = aVar.f(kVarD);
            try {
                int iA = W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP);
                boolean zI = X.i(iA);
                if (!zI) {
                    abstractC0022cN = o1().N();
                    if (abstractC0022cN == null) {
                    }
                    p079h8.A a10 = p079h8.A.f21846a;
                }
                abstractC0022cN = o1();
                for (C.c.AbstractC0022c abstractC0022cU1 = u1(zI); abstractC0022cU1 != null && (abstractC0022cU1.H() & iA) != 0; abstractC0022cU1 = abstractC0022cU1.I()) {
                    if ((abstractC0022cU1.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cU1; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (abstractC0022cF instanceof InterfaceC0979v) {
                                ((InterfaceC0979v) abstractC0022cF).d(W());
                            } else {
                                abstractC0022cF.L();
                            }
                        }
                    }
                    if (abstractC0022cU1 == abstractC0022cN) {
                        break;
                    }
                }
                p079h8.A a11 = p079h8.A.f21846a;
            } finally {
                aVar.m(kVarD, kVarF, lVarH);
            }
        }
    }

    @Override // U.i
    public long I(U.i iVar, long j9, boolean z9) {
        if (iVar instanceof U.m) {
            ((U.m) iVar).a().D1();
            return H.g.r(iVar.I(this, H.g.r(j9), z9));
        }
        U uX1 = X1(iVar);
        uX1.D1();
        U uA1 = a1(uX1);
        while (uX1 != uA1) {
            j9 = uX1.Y1(j9, z9);
            uX1 = uX1.f8488J;
            kotlin.jvm.internal.n.e(uX1);
        }
        return T0(uA1, j9, z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I1() {
        int iA = W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        boolean zI = X.i(iA);
        C.c.AbstractC0022c abstractC0022cO1 = o1();
        if (!zI && (abstractC0022cO1 = abstractC0022cO1.N()) == null) {
            return;
        }
        for (C.c.AbstractC0022c abstractC0022cU1 = u1(zI); abstractC0022cU1 != null && (abstractC0022cU1.H() & iA) != 0; abstractC0022cU1 = abstractC0022cU1.I()) {
            if ((abstractC0022cU1.L() & iA) != 0) {
                for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cU1; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                    if (abstractC0022cF instanceof InterfaceC0979v) {
                        ((InterfaceC0979v) abstractC0022cF).j(this);
                    } else {
                        abstractC0022cF.L();
                    }
                }
            }
            if (abstractC0022cU1 == abstractC0022cO1) {
                return;
            }
        }
    }

    public final void J1() {
        this.f8489K = true;
        this.f8502X.invoke();
        P1();
    }

    public abstract void K1(InterfaceC0869m interfaceC0869m, L.c cVar);

    public final void M1(long j9, float f10, p219v8.l lVar, L.c cVar) {
        L1(p111l0.m.g(j9, T()), f10, lVar, cVar);
    }

    @Override // U.i
    public long N(long j9) {
        if (!t()) {
            T.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        D1();
        long jZ1 = j9;
        for (U u9 = this; u9 != null; u9 = u9.f8488J) {
            jZ1 = Z1(u9, jZ1, false, 2, null);
        }
        return jZ1;
    }

    public final void N1(H.e eVar, boolean z9, boolean z10) {
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            if (this.f8490L) {
                if (z10) {
                    long jK1 = k1();
                    float f10 = H.m.f(jK1) / 2.0f;
                    float fE = H.m.e(jK1) / 2.0f;
                    eVar.e(-f10, -fE, p111l0.q.e(v()) + f10, p111l0.q.d(v()) + fE);
                } else if (z9) {
                    eVar.e(0.0f, 0.0f, p111l0.q.e(v()), p111l0.q.d(v()));
                }
                if (eVar.f()) {
                    return;
                }
            }
            c0Var.g(eVar, false);
        }
        float fD = p111l0.m.d(s0());
        eVar.i(eVar.b() + fD);
        eVar.j(eVar.c() + fD);
        float fE2 = p111l0.m.e(s0());
        eVar.k(eVar.d() + fE2);
        eVar.h(eVar.a() + fE2);
    }

    public final void P1() {
        if (this.f8504Z != null) {
            if (this.f8505a0 != null) {
                this.f8505a0 = null;
            }
            c2(this, null, false, 2, null);
            B.V0(o0(), false, 1, null);
        }
    }

    public final void Q1(boolean z9) {
        this.f8485G = z9;
    }

    public void R1(U.q qVar) {
        U.q qVar2 = this.f8495Q;
        if (qVar != qVar2) {
            this.f8495Q = qVar;
            if (qVar2 == null || qVar.getWidth() != qVar2.getWidth() || qVar.getHeight() != qVar2.getHeight()) {
                G1(qVar.getWidth(), qVar.getHeight());
            }
            Map map = this.f8496R;
            if (((map == null || map.isEmpty()) && qVar.a().isEmpty()) || kotlin.jvm.internal.n.d(qVar.a(), this.f8496R)) {
                return;
            }
            e1().a().m();
            Map linkedHashMap = this.f8496R;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f8496R = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(qVar.a());
        }
    }

    protected void S1(long j9) {
        this.f8497S = j9;
    }

    public final void T1(U u9) {
        this.f8487I = u9;
    }

    protected final long U0(long j9) {
        return H.n.a(Math.max(0.0f, (H.m.f(j9) - X()) / 2.0f), Math.max(0.0f, (H.m.e(j9) - V()) / 2.0f));
    }

    public final void U1(U u9) {
        this.f8488J = u9;
    }

    protected final float V0(long j9, long j10) {
        if (X() >= H.m.f(j10) && V() >= H.m.e(j10)) {
            return Float.POSITIVE_INFINITY;
        }
        long jU0 = U0(j10);
        float f10 = H.m.f(jU0);
        float fE = H.m.e(jU0);
        long jC1 = C1(j9);
        if ((f10 > 0.0f || fE > 0.0f) && H.g.k(jC1) <= f10 && H.g.l(jC1) <= fE) {
            return H.g.j(jC1);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean V1() {
        C.c.AbstractC0022c abstractC0022cU1 = u1(X.i(W.a(16)));
        if (abstractC0022cU1 != null && abstractC0022cU1.Q()) {
            int iA = W.a(16);
            if (!abstractC0022cU1.z().Q()) {
                T.a.b("visitLocalDescendants called on an unattached node");
            }
            C.c.AbstractC0022c abstractC0022cZ = abstractC0022cU1.z();
            if ((abstractC0022cZ.H() & iA) != 0) {
                while (abstractC0022cZ != null) {
                    if ((abstractC0022cZ.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cZ; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (!(abstractC0022cF instanceof j0)) {
                                abstractC0022cF.L();
                            } else if (((j0) abstractC0022cF).C()) {
                                return true;
                            }
                        }
                    }
                    abstractC0022cZ = abstractC0022cZ.I();
                }
            }
        }
        return false;
    }

    public final void W0(InterfaceC0869m interfaceC0869m, L.c cVar) {
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            c0Var.d(interfaceC0869m, cVar);
            return;
        }
        float fD = p111l0.m.d(s0());
        float fE = p111l0.m.e(s0());
        interfaceC0869m.l(fD, fE);
        Y0(interfaceC0869m, cVar);
        interfaceC0869m.l(-fD, -fE);
    }

    protected final void X0(InterfaceC0869m interfaceC0869m, I.F f10) {
        interfaceC0869m.j(new H.i(0.5f, 0.5f, p111l0.q.e(W()) - 0.5f, p111l0.q.d(W()) - 0.5f), f10);
    }

    public long Y1(long j9, boolean z9) {
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            j9 = c0Var.e(j9, false);
        }
        return (z9 || !x0()) ? p111l0.n.c(j9, s0()) : j9;
    }

    public abstract void Z0();

    public final U a1(U u9) {
        B bO0 = u9.o0();
        B bO1 = o0();
        if (bO0 == bO1) {
            C.c.AbstractC0022c abstractC0022cO1 = u9.o1();
            C.c.AbstractC0022c abstractC0022cO2 = o1();
            int iA = W.a(2);
            if (!abstractC0022cO2.z().Q()) {
                T.a.b("visitLocalAncestors called on an unattached node");
            }
            for (C.c.AbstractC0022c abstractC0022cN = abstractC0022cO2.z().N(); abstractC0022cN != null; abstractC0022cN = abstractC0022cN.N()) {
                if ((abstractC0022cN.L() & iA) != 0 && abstractC0022cN == abstractC0022cO1) {
                    return u9;
                }
            }
            return this;
        }
        while (bO0.A() > bO1.A()) {
            bO0 = bO0.Y();
            kotlin.jvm.internal.n.e(bO0);
        }
        while (bO1.A() > bO0.A()) {
            bO1 = bO1.Y();
            kotlin.jvm.internal.n.e(bO1);
        }
        while (bO0 != bO1) {
            bO0 = bO0.Y();
            bO1 = bO1.Y();
            if (bO0 == null || bO1 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (bO1 != o0()) {
            if (bO0 != u9.o0()) {
                return bO0.D();
            }
            return u9;
        }
        return this;
    }

    public final H.i a2() {
        if (!t()) {
            return H.i.f2292e.a();
        }
        U.i iVarD = U.j.d(this);
        H.e eVarM1 = m1();
        long jU0 = U0(k1());
        eVarM1.i(-H.m.f(jU0));
        eVarM1.k(-H.m.e(jU0));
        eVarM1.j(X() + H.m.f(jU0));
        eVarM1.h(V() + H.m.e(jU0));
        while (this != iVarD) {
            this.N1(eVarM1, false, true);
            if (eVarM1.f()) {
                return H.i.f2292e.a();
            }
            this = this.f8488J;
            kotlin.jvm.internal.n.e(this);
        }
        return H.f.a(eVarM1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U.t
    public void b0(long j9, float f10, L.c cVar) {
        if (!this.f8485G) {
            L1(j9, f10, null, cVar);
            return;
        }
        K kJ1 = j1();
        kotlin.jvm.internal.n.e(kJ1);
        L1(kJ1.s0(), f10, null, cVar);
    }

    public long b1(long j9, boolean z9) {
        if (z9 || !x0()) {
            j9 = p111l0.n.b(j9, s0());
        }
        c0 c0Var = this.f8504Z;
        return c0Var != null ? c0Var.e(j9, true) : j9;
    }

    public final void b2(p219v8.l lVar, boolean z9) {
        d0 d0VarX;
        if (!(lVar == null || this.f8505a0 == null)) {
            T.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        B bO0 = o0();
        boolean z10 = (!z9 && this.f8491M == lVar && kotlin.jvm.internal.n.d(this.f8492N, bO0.z()) && this.f8493O == bO0.getLayoutDirection()) ? false : true;
        this.f8492N = bO0.z();
        this.f8493O = bO0.getLayoutDirection();
        if (!bO0.t0() || lVar == null) {
            this.f8491M = null;
            c0 c0Var = this.f8504Z;
            if (c0Var != null) {
                c0Var.a();
                bO0.d1(true);
                this.f8502X.invoke();
                if (t() && (d0VarX = bO0.X()) != null) {
                    d0VarX.i(bO0);
                }
            }
            this.f8504Z = null;
            this.f8503Y = false;
            return;
        }
        this.f8491M = lVar;
        if (this.f8504Z != null) {
            if (z10) {
                e2(this, false, 1, null);
                return;
            }
            return;
        }
        c0 c0VarF = d0.f(E.b(bO0), this.f8501W, this.f8502X, null, 4, null);
        c0VarF.f(W());
        c0VarF.h(s0());
        this.f8504Z = c0VarF;
        e2(this, false, 1, null);
        bO0.d1(true);
        this.f8502X.invoke();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U.t
    public void c0(long j9, float f10, p219v8.l lVar) {
        if (!this.f8485G) {
            L1(j9, f10, lVar, null);
            return;
        }
        K kJ1 = j1();
        kotlin.jvm.internal.n.e(kJ1);
        L1(kJ1.s0(), f10, lVar, null);
    }

    public InterfaceC0960b e1() {
        return o0().G().r();
    }

    @Override // U.i
    public long f(long j9) {
        return E.b(o0()).c(N(j9));
    }

    public final boolean f1() {
        return this.f8486H;
    }

    protected final boolean f2(long j9) {
        if (!H.h.b(j9)) {
            return false;
        }
        c0 c0Var = this.f8504Z;
        return c0Var == null || !this.f8490L || c0Var.c(j9);
    }

    @Override // W.e0
    public boolean g() {
        return (this.f8504Z == null || this.f8489K || !o0().t0()) ? false : true;
    }

    public final boolean g1() {
        return this.f8503Y;
    }

    @Override // p111l0.d
    public float getDensity() {
        return o0().z().getDensity();
    }

    @Override // U.h
    public p111l0.s getLayoutDirection() {
        return o0().getLayoutDirection();
    }

    public final long h1() {
        return Y();
    }

    public final c0 i1() {
        return this.f8504Z;
    }

    public abstract K j1();

    public final long k1() {
        return this.f8492N.J(o0().b0().a());
    }

    @Override // W.J
    public J l0() {
        return this.f8487I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object l1() {
        if (!o0().V().q(W.a(64))) {
            return null;
        }
        o1();
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        for (C.c.AbstractC0022c abstractC0022cO = o0().V().o(); abstractC0022cO != null; abstractC0022cO = abstractC0022cO.N()) {
            if ((W.a(64) & abstractC0022cO.L()) != 0) {
                W.a(64);
                for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cO; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                    if (abstractC0022cF instanceof g0) {
                        e10.f22779q = ((g0) abstractC0022cF).s(o0().z(), e10.f22779q);
                    } else {
                        abstractC0022cF.L();
                    }
                }
            }
        }
        return e10.f22779q;
    }

    @Override // W.J
    public U.i m0() {
        return this;
    }

    protected final H.e m1() {
        H.e eVar = this.f8499U;
        if (eVar != null) {
            return eVar;
        }
        H.e eVar2 = new H.e(0.0f, 0.0f, 0.0f, 0.0f);
        this.f8499U = eVar2;
        return eVar2;
    }

    @Override // W.J
    public boolean n0() {
        return this.f8495Q != null;
    }

    @Override // W.J
    public B o0() {
        return this.f8484F;
    }

    public abstract C.c.AbstractC0022c o1();

    @Override // W.J
    public U.q p0() {
        U.q qVar = this.f8495Q;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final U p1() {
        return this.f8487I;
    }

    @Override // W.J
    public J q0() {
        return this.f8488J;
    }

    public final U q1() {
        return this.f8488J;
    }

    public final float r1() {
        return this.f8498T;
    }

    @Override // W.J
    public long s0() {
        return this.f8497S;
    }

    @Override // U.i
    public boolean t() {
        return o1().Q();
    }

    public final C.c.AbstractC0022c t1(int i10) {
        boolean zI = X.i(i10);
        C.c.AbstractC0022c abstractC0022cO1 = o1();
        if (!zI && (abstractC0022cO1 = abstractC0022cO1.N()) == null) {
            return null;
        }
        for (C.c.AbstractC0022c abstractC0022cU1 = u1(zI); abstractC0022cU1 != null && (abstractC0022cU1.H() & i10) != 0; abstractC0022cU1 = abstractC0022cU1.I()) {
            if ((abstractC0022cU1.L() & i10) != 0) {
                return abstractC0022cU1;
            }
            if (abstractC0022cU1 == abstractC0022cO1) {
                return null;
            }
        }
        return null;
    }

    @Override // U.i
    public final long v() {
        return W();
    }

    public final void x1(f fVar, long j9, C0975q c0975q, boolean z9, boolean z10) {
        C.c.AbstractC0022c abstractC0022cT1 = t1(fVar.a());
        if (!f2(j9)) {
            if (z9) {
                float fV0 = V0(j9, k1());
                if (Float.isInfinite(fV0) || Float.isNaN(fV0) || !c0975q.w(fV0, false)) {
                    return;
                }
                w1(abstractC0022cT1, fVar, j9, c0975q, z9, false, fV0);
                return;
            }
            return;
        }
        if (abstractC0022cT1 == null) {
            y1(fVar, j9, c0975q, z9, z10);
            return;
        }
        if (A1(j9)) {
            v1(abstractC0022cT1, fVar, j9, c0975q, z9, z10);
            return;
        }
        float fV1 = !z9 ? Float.POSITIVE_INFINITY : V0(j9, k1());
        if (Float.isInfinite(fV1) || Float.isNaN(fV1) || !c0975q.w(fV1, z10)) {
            W1(abstractC0022cT1, fVar, j9, c0975q, z9, z10, fV1);
        } else {
            w1(abstractC0022cT1, fVar, j9, c0975q, z9, z10, fV1);
        }
    }

    public void y1(f fVar, long j9, C0975q c0975q, boolean z9, boolean z10) {
        U u9 = this.f8487I;
        if (u9 != null) {
            u9.x1(fVar, c1(u9, j9, false, 2, null), c0975q, z9, z10);
        }
    }

    public void z1() {
        c0 c0Var = this.f8504Z;
        if (c0Var != null) {
            c0Var.invalidate();
            return;
        }
        U u9 = this.f8488J;
        if (u9 != null) {
            u9.z1();
        }
    }
}
