package W;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f8316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8317b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f8330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8332q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f8334s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B.e f8318c = B.e.Idle;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f8333r = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f8335t = p111l0.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p219v8.a f8336u = new d();

    public final class a extends U.t implements U.o, InterfaceC0960b, N {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private boolean f8337A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private boolean f8338B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private p111l0.b f8339C;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private float f8341E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private p219v8.l f8342F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private L.c f8343G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f8344H;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private boolean f8348L;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f8351O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private boolean f8352P;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f8354v;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f8358z;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f8355w = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f8356x = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private B.g f8357y = B.g.NotUsed;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private long f8340D = p111l0.m.f22829a.a();

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private final AbstractC0959a f8345I = new I(this);

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private final p190t.b f8346J = new p190t.b(new a[16], 0);

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private boolean f8347K = true;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private boolean f8349M = true;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private Object f8350N = m0().r0();

        /* JADX INFO: renamed from: W.F$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0297a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8359a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f8360b;

            static {
                int[] iArr = new int[B.e.values().length];
                try {
                    iArr[B.e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[B.e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[B.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[B.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f8359a = iArr;
                int[] iArr2 = new int[B.g.values().length];
                try {
                    iArr2[B.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[B.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f8360b = iArr2;
            }
        }

        static final class b extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ K f8362s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ F f8363t;

            /* JADX INFO: renamed from: W.F$a$b$a, reason: collision with other inner class name */
            static final class C0298a extends kotlin.jvm.internal.o implements p219v8.l {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public static final C0298a f8364r = new C0298a();

                C0298a() {
                    super(1);
                }

                public final void a(InterfaceC0960b interfaceC0960b) {
                    interfaceC0960b.a().t(false);
                }

                @Override // p219v8.l
                public /* bridge */ /* synthetic */ Object f(Object obj) {
                    a((InterfaceC0960b) obj);
                    return p079h8.A.f21846a;
                }
            }

            /* JADX INFO: renamed from: W.F$a$b$b, reason: collision with other inner class name */
            static final class C0299b extends kotlin.jvm.internal.o implements p219v8.l {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public static final C0299b f8365r = new C0299b();

                C0299b() {
                    super(1);
                }

                public final void a(InterfaceC0960b interfaceC0960b) {
                    interfaceC0960b.a().q(interfaceC0960b.a().l());
                }

                @Override // p219v8.l
                public /* bridge */ /* synthetic */ Object f(Object obj) {
                    a((InterfaceC0960b) obj);
                    return p079h8.A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(K k9, F f10) {
                super(0);
                this.f8362s = k9;
                this.f8363t = f10;
            }

            public final void a() {
                a.this.i0();
                a.this.i(C0298a.f8364r);
                K kJ1 = a.this.h().j1();
                if (kJ1 != null) {
                    boolean zY0 = kJ1.y0();
                    List listX = this.f8363t.f8316a.x();
                    int size = listX.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        K kJ2 = ((B) listX.get(i10)).W().j1();
                        if (kJ2 != null) {
                            kJ2.C0(zY0);
                        }
                    }
                }
                this.f8362s.p0().b();
                K kJ3 = a.this.h().j1();
                if (kJ3 != null) {
                    kJ3.y0();
                    List listX2 = this.f8363t.f8316a.x();
                    int size2 = listX2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        K kJ4 = ((B) listX2.get(i11)).W().j1();
                        if (kJ4 != null) {
                            kJ4.C0(false);
                        }
                    }
                }
                a.this.h0();
                a.this.i(C0299b.f8365r);
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        static final class c extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ F f8366r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ d0 f8367s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ long f8368t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(F f10, d0 d0Var, long j9) {
                super(0);
                this.f8366r = f10;
                this.f8367s = d0Var;
                this.f8368t = j9;
            }

            public final void a() {
                K kJ1;
                U.t.a aVarR0 = null;
                if (G.a(this.f8366r.f8316a)) {
                    U uQ1 = this.f8366r.K().q1();
                    if (uQ1 != null) {
                        aVarR0 = uQ1.r0();
                    }
                } else {
                    U uQ2 = this.f8366r.K().q1();
                    if (uQ2 != null && (kJ1 = uQ2.j1()) != null) {
                        aVarR0 = kJ1.r0();
                    }
                }
                if (aVarR0 == null) {
                    aVarR0 = this.f8367s.getPlacementScope();
                }
                F f10 = this.f8366r;
                long j9 = this.f8368t;
                K kJ2 = f10.K().j1();
                kotlin.jvm.internal.n.e(kJ2);
                U.t.a.j(aVarR0, kJ2, j9, 0.0f, 2, null);
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        static final class d extends kotlin.jvm.internal.o implements p219v8.l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final d f8369r = new d();

            d() {
                super(1);
            }

            public final void a(InterfaceC0960b interfaceC0960b) {
                interfaceC0960b.a().u(false);
            }

            @Override // p219v8.l
            public /* bridge */ /* synthetic */ Object f(Object obj) {
                a((InterfaceC0960b) obj);
                return p079h8.A.f21846a;
            }
        }

        public a() {
        }

        private final void F0(B b10) {
            B.g gVar;
            B bY = b10.Y();
            if (bY == null) {
                this.f8357y = B.g.NotUsed;
                return;
            }
            if (!(this.f8357y == B.g.NotUsed || b10.u())) {
                T.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = C0297a.f8359a[bY.I().ordinal()];
            if (i10 == 1 || i10 == 2) {
                gVar = B.g.InMeasureBlock;
            } else {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + bY.I());
                }
                gVar = B.g.InLayoutBlock;
            }
            this.f8357y = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h0() {
            p190t.b bVarF0 = F.this.f8316a.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    a aVarH = ((B) objArrO[i10]).G().H();
                    kotlin.jvm.internal.n.e(aVarH);
                    int i11 = aVarH.f8355w;
                    int i12 = aVarH.f8356x;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        aVarH.t0();
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i0() {
            int i10 = 0;
            F.this.f8325j = 0;
            p190t.b bVarF0 = F.this.f8316a.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                do {
                    a aVarH = ((B) objArrO[i10]).G().H();
                    kotlin.jvm.internal.n.e(aVarH);
                    aVarH.f8355w = aVarH.f8356x;
                    aVarH.f8356x = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    if (aVarH.f8357y == B.g.InLayoutBlock) {
                        aVarH.f8357y = B.g.NotUsed;
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        private final void s0() {
            boolean zC = c();
            E0(true);
            if (!zC && F.this.G()) {
                B.T0(F.this.f8316a, true, false, false, 6, null);
            }
            p190t.b bVarF0 = F.this.f8316a.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    B b10 = (B) objArrO[i10];
                    a aVarL = b10.L();
                    if (aVarL == null) {
                        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                    }
                    if (aVarL.f8356x != Integer.MAX_VALUE) {
                        aVarL.s0();
                        b10.Y0(b10);
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        private final void t0() {
            if (c()) {
                int i10 = 0;
                E0(false);
                p190t.b bVarF0 = F.this.f8316a.f0();
                int iP = bVarF0.p();
                if (iP > 0) {
                    Object[] objArrO = bVarF0.o();
                    do {
                        a aVarH = ((B) objArrO[i10]).G().H();
                        kotlin.jvm.internal.n.e(aVarH);
                        aVarH.t0();
                        i10++;
                    } while (i10 < iP);
                }
            }
        }

        private final void v0() {
            B b10 = F.this.f8316a;
            F f10 = F.this;
            p190t.b bVarF0 = b10.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    B b11 = (B) objArrO[i10];
                    if (b11.K() && b11.S() == B.g.InMeasureBlock) {
                        a aVarH = b11.G().H();
                        kotlin.jvm.internal.n.e(aVarH);
                        p111l0.b bVarZ = b11.G().z();
                        kotlin.jvm.internal.n.e(bVarZ);
                        if (aVarH.z0(bVarZ.m())) {
                            B.T0(f10.f8316a, false, false, false, 7, null);
                        }
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        private final void y0(long j9, float f10, p219v8.l lVar, L.c cVar) {
            if (F.this.f8316a.u0()) {
                T.a.a("place is called on a deactivated node");
            }
            F.this.f8318c = B.e.LookaheadLayingOut;
            this.f8337A = true;
            this.f8352P = false;
            if (!p111l0.m.c(j9, this.f8340D)) {
                if (F.this.D() || F.this.E()) {
                    F.this.f8323h = true;
                }
                u0();
            }
            d0 d0VarB = E.b(F.this.f8316a);
            if (F.this.F() || !c()) {
                F.this.a0(false);
                a().r(false);
                f0.d(d0VarB.getSnapshotObserver(), F.this.f8316a, false, new c(F.this, d0VarB, j9), 2, null);
            } else {
                K kJ1 = F.this.K().j1();
                kotlin.jvm.internal.n.e(kJ1);
                kJ1.P0(j9);
                x0();
            }
            this.f8340D = j9;
            this.f8341E = f10;
            this.f8342F = lVar;
            this.f8343G = cVar;
            F.this.f8318c = B.e.Idle;
        }

        public final void A0() {
            a aVar;
            B bY;
            try {
                this.f8354v = true;
                if (!this.f8337A) {
                    T.a.b("replace() called on item that was not placed");
                }
                this.f8352P = false;
                boolean zC = c();
                aVar = this;
                try {
                    aVar.y0(this.f8340D, 0.0f, this.f8342F, this.f8343G);
                    if (zC && !aVar.f8352P && (bY = F.this.f8316a.Y()) != null) {
                        B.R0(bY, false, 1, null);
                    }
                    aVar.f8354v = false;
                } catch (Throwable th) {
                    th = th;
                    aVar.f8354v = false;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = this;
            }
        }

        public final void B0(boolean z9) {
            this.f8347K = z9;
        }

        public final void C0(B.g gVar) {
            this.f8357y = gVar;
        }

        public final void D0(int i10) {
            this.f8356x = i10;
        }

        public void E0(boolean z9) {
            this.f8344H = z9;
        }

        public final boolean G0() {
            if (o0() == null) {
                K kJ1 = F.this.K().j1();
                kotlin.jvm.internal.n.e(kJ1);
                if (kJ1.M0() == null) {
                    return false;
                }
            }
            if (!this.f8349M) {
                return false;
            }
            this.f8349M = false;
            K kJ2 = F.this.K().j1();
            kotlin.jvm.internal.n.e(kJ2);
            this.f8350N = kJ2.M0();
            return true;
        }

        @Override // W.InterfaceC0960b
        public void H() {
            this.f8348L = true;
            a().o();
            if (F.this.F()) {
                v0();
            }
            K kJ1 = h().j1();
            kotlin.jvm.internal.n.e(kJ1);
            if (F.this.f8324i || (!this.f8358z && !kJ1.y0() && F.this.F())) {
                F.this.f8323h = false;
                B.e eVarB = F.this.B();
                F.this.f8318c = B.e.LookaheadLayingOut;
                d0 d0VarB = E.b(F.this.f8316a);
                F.this.b0(false);
                f0.f(d0VarB.getSnapshotObserver(), F.this.f8316a, false, new b(kJ1, F.this), 2, null);
                F.this.f8318c = eVarB;
                if (F.this.E() && kJ1.y0()) {
                    requestLayout();
                }
                F.this.f8324i = false;
            }
            if (a().l()) {
                a().q(true);
            }
            if (a().g() && a().k()) {
                a().n();
            }
            this.f8348L = false;
        }

        @Override // W.N
        public void M(boolean z9) {
            K kJ1;
            K kJ2 = F.this.K().j1();
            if (!kotlin.jvm.internal.n.d(Boolean.valueOf(z9), kJ2 != null ? Boolean.valueOf(kJ2.x0()) : null) && (kJ1 = F.this.K().j1()) != null) {
                kJ1.M(z9);
            }
            this.f8351O = z9;
        }

        @Override // W.InterfaceC0960b
        public void P() {
            B.T0(F.this.f8316a, false, false, false, 7, null);
        }

        @Override // W.InterfaceC0960b
        public AbstractC0959a a() {
            return this.f8345I;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // U.t
        public void b0(long j9, float f10, L.c cVar) {
            y0(j9, f10, null, cVar);
        }

        @Override // W.InterfaceC0960b
        public boolean c() {
            return this.f8344H;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // U.t
        public void c0(long j9, float f10, p219v8.l lVar) {
            y0(j9, f10, lVar, null);
        }

        @Override // W.InterfaceC0960b
        public Map e() {
            if (!this.f8358z) {
                if (F.this.B() == B.e.LookaheadMeasuring) {
                    a().s(true);
                    if (a().g()) {
                        F.this.P();
                    }
                } else {
                    a().r(true);
                }
            }
            K kJ1 = h().j1();
            if (kJ1 != null) {
                kJ1.C0(true);
            }
            H();
            K kJ2 = h().j1();
            if (kJ2 != null) {
                kJ2.C0(false);
            }
            return a().h();
        }

        @Override // W.InterfaceC0960b
        public U h() {
            return F.this.f8316a.D();
        }

        @Override // W.InterfaceC0960b
        public void i(p219v8.l lVar) {
            p190t.b bVarF0 = F.this.f8316a.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    InterfaceC0960b interfaceC0960bC = ((B) objArrO[i10]).G().C();
                    kotlin.jvm.internal.n.e(interfaceC0960bC);
                    lVar.f(interfaceC0960bC);
                    i10++;
                } while (i10 < iP);
            }
        }

        public final List j0() {
            F.this.f8316a.x();
            if (!this.f8347K) {
                return this.f8346J.i();
            }
            B b10 = F.this.f8316a;
            p190t.b bVar = this.f8346J;
            p190t.b bVarF0 = b10.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    B b11 = (B) objArrO[i10];
                    if (bVar.p() <= i10) {
                        a aVarH = b11.G().H();
                        kotlin.jvm.internal.n.e(aVarH);
                        bVar.b(aVarH);
                    } else {
                        a aVarH2 = b11.G().H();
                        kotlin.jvm.internal.n.e(aVarH2);
                        bVar.z(i10, aVarH2);
                    }
                    i10++;
                } while (i10 < iP);
            }
            bVar.x(b10.x().size(), bVar.p());
            this.f8347K = false;
            return this.f8346J.i();
        }

        public final p111l0.b k0() {
            return this.f8339C;
        }

        public final boolean l0() {
            return this.f8348L;
        }

        public final b m0() {
            return F.this.I();
        }

        public final B.g n0() {
            return this.f8357y;
        }

        public Object o0() {
            return this.f8350N;
        }

        public final boolean p0() {
            return this.f8337A;
        }

        public final void q0(boolean z9) {
            B b10;
            B bY = F.this.f8316a.Y();
            B.g gVarF = F.this.f8316a.F();
            if (bY == null || gVarF == B.g.NotUsed) {
                return;
            }
            do {
                b10 = bY;
                if (b10.F() != gVarF) {
                    break;
                } else {
                    bY = b10.Y();
                }
            } while (bY != null);
            int i10 = C0297a.f8360b[gVarF.ordinal()];
            if (i10 == 1) {
                if (b10.M() != null) {
                    B.T0(b10, z9, false, false, 6, null);
                    return;
                } else {
                    B.X0(b10, z9, false, false, 6, null);
                    return;
                }
            }
            if (i10 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (b10.M() != null) {
                b10.Q0(z9);
            } else {
                b10.U0(z9);
            }
        }

        public final void r0() {
            this.f8349M = true;
        }

        @Override // W.InterfaceC0960b
        public void requestLayout() {
            B.R0(F.this.f8316a, false, 1, null);
        }

        @Override // W.InterfaceC0960b
        public InterfaceC0960b s() {
            F fG;
            B bY = F.this.f8316a.Y();
            if (bY == null || (fG = bY.G()) == null) {
                return null;
            }
            return fG.C();
        }

        public final void u0() {
            p190t.b bVarF0;
            int iP;
            if (F.this.t() <= 0 || (iP = (bVarF0 = F.this.f8316a.f0()).p()) <= 0) {
                return;
            }
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                B b10 = (B) objArrO[i10];
                F fG = b10.G();
                if ((fG.E() || fG.D()) && !fG.F()) {
                    B.R0(b10, false, 1, null);
                }
                a aVarH = fG.H();
                if (aVarH != null) {
                    aVarH.u0();
                }
                i10++;
            } while (i10 < iP);
        }

        public final void w0() {
            this.f8356x = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f8355w = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            E0(false);
        }

        public final void x0() {
            this.f8352P = true;
            B bY = F.this.f8316a.Y();
            if (!c()) {
                s0();
                if (this.f8354v && bY != null) {
                    B.R0(bY, false, 1, null);
                }
            }
            if (bY == null) {
                this.f8356x = 0;
            } else if (!this.f8354v && (bY.I() == B.e.LayingOut || bY.I() == B.e.LookaheadLayingOut)) {
                if (!(this.f8356x == Integer.MAX_VALUE)) {
                    T.a.b("Place was called on a node which was placed already");
                }
                this.f8356x = bY.G().f8325j;
                bY.G().f8325j++;
            }
            H();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        @Override // U.o
        public U.t y(long j9) {
            B bY = F.this.f8316a.Y();
            if ((bY != null ? bY.I() : null) == B.e.LookaheadMeasuring) {
                F.this.f8317b = false;
            } else {
                B bY2 = F.this.f8316a.Y();
                if ((bY2 != null ? bY2.I() : null) == B.e.LookaheadLayingOut) {
                    F.this.f8317b = false;
                }
            }
            F0(F.this.f8316a);
            if (F.this.f8316a.F() == B.g.NotUsed) {
                F.this.f8316a.l();
            }
            z0(j9);
            return this;
        }

        public final boolean z0(long j9) {
            if (F.this.f8316a.u0()) {
                T.a.a("measure is called on a deactivated node");
            }
            B bY = F.this.f8316a.Y();
            F.this.f8316a.b1(F.this.f8316a.u() || (bY != null && bY.u()));
            if (!F.this.f8316a.K()) {
                p111l0.b bVar = this.f8339C;
                if (bVar == null ? false : p111l0.b.d(bVar.m(), j9)) {
                    d0 d0VarX = F.this.f8316a.X();
                    if (d0VarX != null) {
                        d0VarX.o(F.this.f8316a, true);
                    }
                    F.this.f8316a.a1();
                    return false;
                }
            }
            this.f8339C = p111l0.b.a(j9);
            e0(j9);
            a().s(false);
            i(d.f8369r);
            long jW = this.f8338B ? W() : p111l0.r.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f8338B = true;
            K kJ1 = F.this.K().j1();
            if (!(kJ1 != null)) {
                T.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            F.this.T(j9);
            d0(p111l0.r.a(kJ1.Z(), kJ1.U()));
            return (p111l0.q.e(jW) == kJ1.Z() && p111l0.q.d(jW) == kJ1.U()) ? false : true;
        }
    }

    public final class b extends U.t implements U.o, InterfaceC0960b, N {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private boolean f8371B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private long f8372C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private p219v8.l f8373D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private L.c f8374E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private float f8375F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private boolean f8376G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private Object f8377H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private boolean f8378I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private boolean f8379J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private final AbstractC0959a f8380K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final p190t.b f8381L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private boolean f8382M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private boolean f8383N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final p219v8.a f8384O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private float f8385P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private boolean f8386Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private p219v8.l f8387R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private L.c f8388S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private long f8389T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private float f8390U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        private final p219v8.a f8391V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private boolean f8392W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private boolean f8393X;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f8395v;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private boolean f8398y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f8399z;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f8396w = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f8397x = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private B.g f8370A = B.g.NotUsed;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f8401b;

            static {
                int[] iArr = new int[B.e.values().length];
                try {
                    iArr[B.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[B.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8400a = iArr;
                int[] iArr2 = new int[B.g.values().length];
                try {
                    iArr2[B.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[B.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f8401b = iArr2;
            }
        }

        /* JADX INFO: renamed from: W.F$b$b, reason: collision with other inner class name */
        static final class C0300b extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: W.F$b$b$a */
            static final class a extends kotlin.jvm.internal.o implements p219v8.l {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public static final a f8403r = new a();

                a() {
                    super(1);
                }

                public final void a(InterfaceC0960b interfaceC0960b) {
                    interfaceC0960b.a().t(false);
                }

                @Override // p219v8.l
                public /* bridge */ /* synthetic */ Object f(Object obj) {
                    a((InterfaceC0960b) obj);
                    return p079h8.A.f21846a;
                }
            }

            /* JADX INFO: renamed from: W.F$b$b$b, reason: collision with other inner class name */
            static final class C0301b extends kotlin.jvm.internal.o implements p219v8.l {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public static final C0301b f8404r = new C0301b();

                C0301b() {
                    super(1);
                }

                public final void a(InterfaceC0960b interfaceC0960b) {
                    interfaceC0960b.a().q(interfaceC0960b.a().l());
                }

                @Override // p219v8.l
                public /* bridge */ /* synthetic */ Object f(Object obj) {
                    a((InterfaceC0960b) obj);
                    return p079h8.A.f21846a;
                }
            }

            C0300b() {
                super(0);
            }

            public final void a() {
                b.this.m0();
                b.this.i(a.f8403r);
                b.this.h().p0().b();
                b.this.l0();
                b.this.i(C0301b.f8404r);
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        static final class c extends kotlin.jvm.internal.o implements p219v8.a {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ F f8405r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f8406s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(F f10, b bVar) {
                super(0);
                this.f8405r = f10;
                this.f8406s = bVar;
            }

            public final void a() {
                U.t.a placementScope;
                U uQ1 = this.f8405r.K().q1();
                if (uQ1 == null || (placementScope = uQ1.r0()) == null) {
                    placementScope = E.b(this.f8405r.f8316a).getPlacementScope();
                }
                U.t.a aVar = placementScope;
                b bVar = this.f8406s;
                F f10 = this.f8405r;
                p219v8.l lVar = bVar.f8387R;
                L.c cVar = bVar.f8388S;
                if (cVar != null) {
                    aVar.p(f10.K(), bVar.f8389T, cVar, bVar.f8390U);
                } else if (lVar == null) {
                    aVar.i(f10.K(), bVar.f8389T, bVar.f8390U);
                } else {
                    aVar.o(f10.K(), bVar.f8389T, bVar.f8390U, lVar);
                }
            }

            @Override // p219v8.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return p079h8.A.f21846a;
            }
        }

        static final class d extends kotlin.jvm.internal.o implements p219v8.l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final d f8407r = new d();

            d() {
                super(1);
            }

            public final void a(InterfaceC0960b interfaceC0960b) {
                interfaceC0960b.a().u(false);
            }

            @Override // p219v8.l
            public /* bridge */ /* synthetic */ Object f(Object obj) {
                a((InterfaceC0960b) obj);
                return p079h8.A.f21846a;
            }
        }

        public b() {
            l0.m.a aVar = p111l0.m.f22829a;
            this.f8372C = aVar.a();
            this.f8376G = true;
            this.f8380K = new C(this);
            this.f8381L = new p190t.b(new b[16], 0);
            this.f8382M = true;
            this.f8384O = new C0300b();
            this.f8389T = aVar.a();
            this.f8391V = new c(F.this, this);
        }

        private final void A0() {
            B b10 = F.this.f8316a;
            F f10 = F.this;
            p190t.b bVarF0 = b10.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    B b11 = (B) objArrO[i10];
                    if (b11.P() && b11.R() == B.g.InMeasureBlock && B.M0(b11, null, 1, null)) {
                        B.X0(f10.f8316a, false, false, false, 7, null);
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        private final void D0(long j9, float f10, p219v8.l lVar, L.c cVar) {
            if (F.this.f8316a.u0()) {
                T.a.a("place is called on a deactivated node");
            }
            F.this.f8318c = B.e.LayingOut;
            this.f8372C = j9;
            this.f8375F = f10;
            this.f8373D = lVar;
            this.f8374E = cVar;
            this.f8399z = true;
            this.f8386Q = false;
            d0 d0VarB = E.b(F.this.f8316a);
            if (F.this.A() || !c()) {
                a().r(false);
                F.this.Y(false);
                this.f8387R = lVar;
                this.f8389T = j9;
                this.f8390U = f10;
                this.f8388S = cVar;
                d0VarB.getSnapshotObserver().c(F.this.f8316a, false, this.f8391V);
            } else {
                F.this.K().M1(j9, f10, lVar, cVar);
                C0();
            }
            F.this.f8318c = B.e.Idle;
        }

        private final void E0(long j9, float f10, p219v8.l lVar, L.c cVar) {
            U.t.a placementScope;
            this.f8379J = true;
            if (!p111l0.m.c(j9, this.f8372C) || this.f8392W) {
                if (F.this.u() || F.this.v() || this.f8392W) {
                    F.this.f8320e = true;
                    this.f8392W = false;
                }
                z0();
            }
            if (G.a(F.this.f8316a)) {
                U uQ1 = F.this.K().q1();
                if (uQ1 == null || (placementScope = uQ1.r0()) == null) {
                    placementScope = E.b(F.this.f8316a).getPlacementScope();
                }
                U.t.a aVar = placementScope;
                F f11 = F.this;
                a aVarH = f11.H();
                kotlin.jvm.internal.n.e(aVarH);
                B bY = f11.f8316a.Y();
                if (bY != null) {
                    bY.G().f8325j = 0;
                }
                aVarH.D0(SubsamplingScaleImageView.TILE_SIZE_AUTO);
                U.t.a.h(aVar, aVarH, p111l0.m.d(j9), p111l0.m.e(j9), 0.0f, 4, null);
            }
            a aVarH2 = F.this.H();
            if ((aVarH2 == null || aVarH2.p0()) ? false : true) {
                T.a.b("Error: Placement happened before lookahead.");
            }
            D0(j9, f10, lVar, cVar);
        }

        private final void K0(B b10) {
            B.g gVar;
            B bY = b10.Y();
            if (bY == null) {
                this.f8370A = B.g.NotUsed;
                return;
            }
            if (!(this.f8370A == B.g.NotUsed || b10.u())) {
                T.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = a.f8400a[bY.I().ordinal()];
            if (i10 == 1) {
                gVar = B.g.InMeasureBlock;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + bY.I());
                }
                gVar = B.g.InLayoutBlock;
            }
            this.f8370A = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l0() {
            B b10 = F.this.f8316a;
            p190t.b bVarF0 = b10.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    B b11 = (B) objArrO[i10];
                    if (b11.O().f8396w != b11.Z()) {
                        b10.I0();
                        b10.m0();
                        if (b11.Z() == Integer.MAX_VALUE) {
                            b11.O().y0();
                        }
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m0() {
            F.this.f8326k = 0;
            p190t.b bVarF0 = F.this.f8316a.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    b bVarO = ((B) objArrO[i10]).O();
                    bVarO.f8396w = bVarO.f8397x;
                    bVarO.f8397x = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                    bVarO.f8379J = false;
                    if (bVarO.f8370A == B.g.InLayoutBlock) {
                        bVarO.f8370A = B.g.NotUsed;
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        private final void x0() {
            boolean zC = c();
            J0(true);
            B b10 = F.this.f8316a;
            if (!zC) {
                if (b10.P()) {
                    B.X0(b10, true, false, false, 6, null);
                } else if (b10.K()) {
                    B.T0(b10, true, false, false, 6, null);
                }
            }
            U uP1 = b10.D().p1();
            for (U uW = b10.W(); !kotlin.jvm.internal.n.d(uW, uP1) && uW != null; uW = uW.p1()) {
                if (uW.g1()) {
                    uW.z1();
                }
            }
            p190t.b bVarF0 = b10.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    B b11 = (B) objArrO[i10];
                    if (b11.Z() != Integer.MAX_VALUE) {
                        b11.O().x0();
                        b10.Y0(b11);
                    }
                    i10++;
                } while (i10 < iP);
            }
        }

        private final void y0() {
            if (c()) {
                int i10 = 0;
                J0(false);
                B b10 = F.this.f8316a;
                U uP1 = b10.D().p1();
                for (U uW = b10.W(); !kotlin.jvm.internal.n.d(uW, uP1) && uW != null; uW = uW.p1()) {
                    uW.P1();
                }
                p190t.b bVarF0 = F.this.f8316a.f0();
                int iP = bVarF0.p();
                if (iP > 0) {
                    Object[] objArrO = bVarF0.o();
                    do {
                        ((B) objArrO[i10]).O().y0();
                        i10++;
                    } while (i10 < iP);
                }
            }
        }

        public final void B0() {
            this.f8397x = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f8396w = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            J0(false);
        }

        public final void C0() {
            this.f8386Q = true;
            B bY = F.this.f8316a.Y();
            float fR1 = h().r1();
            B b10 = F.this.f8316a;
            U uW = b10.W();
            U uD = b10.D();
            while (uW != uD) {
                kotlin.jvm.internal.n.f(uW, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                C0981x c0981x = (C0981x) uW;
                fR1 += c0981x.r1();
                uW = c0981x.p1();
            }
            if (fR1 != this.f8385P) {
                this.f8385P = fR1;
                if (bY != null) {
                    bY.I0();
                }
                if (bY != null) {
                    bY.m0();
                }
            }
            if (!c()) {
                if (bY != null) {
                    bY.m0();
                }
                x0();
                if (this.f8395v && bY != null) {
                    B.V0(bY, false, 1, null);
                }
            }
            if (bY == null) {
                this.f8397x = 0;
            } else if (!this.f8395v && bY.I() == B.e.LayingOut) {
                if (!(this.f8397x == Integer.MAX_VALUE)) {
                    T.a.b("Place was called on a node which was placed already");
                }
                this.f8397x = bY.G().f8326k;
                bY.G().f8326k++;
            }
            H();
        }

        public final boolean F0(long j9) {
            if (F.this.f8316a.u0()) {
                T.a.a("measure is called on a deactivated node");
            }
            d0 d0VarB = E.b(F.this.f8316a);
            B bY = F.this.f8316a.Y();
            boolean z9 = true;
            F.this.f8316a.b1(F.this.f8316a.u() || (bY != null && bY.u()));
            if (!F.this.f8316a.P() && p111l0.b.d(Y(), j9)) {
                d0.l(d0VarB, F.this.f8316a, false, 2, null);
                F.this.f8316a.a1();
                return false;
            }
            a().s(false);
            i(d.f8407r);
            this.f8398y = true;
            long jV = F.this.K().v();
            e0(j9);
            F.this.U(j9);
            if (p111l0.q.c(F.this.K().v(), jV) && F.this.K().Z() == Z() && F.this.K().U() == U()) {
                z9 = false;
            }
            d0(p111l0.r.a(F.this.K().Z(), F.this.K().U()));
            return z9;
        }

        public final void G0() {
            b bVar;
            B bY;
            try {
                this.f8395v = true;
                if (!this.f8399z) {
                    T.a.b("replace called on unplaced item");
                }
                boolean zC = c();
                bVar = this;
                try {
                    bVar.D0(this.f8372C, this.f8375F, this.f8373D, this.f8374E);
                    if (zC && !bVar.f8386Q && (bY = F.this.f8316a.Y()) != null) {
                        B.V0(bY, false, 1, null);
                    }
                    bVar.f8395v = false;
                } catch (Throwable th) {
                    th = th;
                    bVar.f8395v = false;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
            }
        }

        @Override // W.InterfaceC0960b
        public void H() {
            this.f8383N = true;
            a().o();
            if (F.this.A()) {
                A0();
            }
            if (F.this.f8321f || (!this.f8371B && !h().y0() && F.this.A())) {
                F.this.f8320e = false;
                B.e eVarB = F.this.B();
                F.this.f8318c = B.e.LayingOut;
                F.this.Z(false);
                B b10 = F.this.f8316a;
                E.b(b10).getSnapshotObserver().e(b10, false, this.f8384O);
                F.this.f8318c = eVarB;
                if (h().y0() && F.this.v()) {
                    requestLayout();
                }
                F.this.f8321f = false;
            }
            if (a().l()) {
                a().q(true);
            }
            if (a().g() && a().k()) {
                a().n();
            }
            this.f8383N = false;
        }

        public final void H0(boolean z9) {
            this.f8382M = z9;
        }

        public final void I0(B.g gVar) {
            this.f8370A = gVar;
        }

        public void J0(boolean z9) {
            this.f8378I = z9;
        }

        public final boolean L0() {
            if ((r0() == null && F.this.K().l1() == null) || !this.f8376G) {
                return false;
            }
            this.f8376G = false;
            this.f8377H = F.this.K().l1();
            return true;
        }

        @Override // W.N
        public void M(boolean z9) {
            boolean zX0 = F.this.K().x0();
            if (z9 != zX0) {
                F.this.K().M(zX0);
                this.f8392W = true;
            }
            this.f8393X = z9;
        }

        @Override // W.InterfaceC0960b
        public void P() {
            B.X0(F.this.f8316a, false, false, false, 7, null);
        }

        @Override // W.InterfaceC0960b
        public AbstractC0959a a() {
            return this.f8380K;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // U.t
        public void b0(long j9, float f10, L.c cVar) {
            E0(j9, f10, null, cVar);
        }

        @Override // W.InterfaceC0960b
        public boolean c() {
            return this.f8378I;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // U.t
        public void c0(long j9, float f10, p219v8.l lVar) {
            E0(j9, f10, lVar, null);
        }

        @Override // W.InterfaceC0960b
        public Map e() {
            if (!this.f8371B) {
                if (F.this.B() == B.e.Measuring) {
                    a().s(true);
                    if (a().g()) {
                        F.this.O();
                    }
                } else {
                    a().r(true);
                }
            }
            h().C0(true);
            H();
            h().C0(false);
            return a().h();
        }

        @Override // W.InterfaceC0960b
        public U h() {
            return F.this.f8316a.D();
        }

        @Override // W.InterfaceC0960b
        public void i(p219v8.l lVar) {
            p190t.b bVarF0 = F.this.f8316a.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    lVar.f(((B) objArrO[i10]).G().r());
                    i10++;
                } while (i10 < iP);
            }
        }

        public final List n0() {
            F.this.f8316a.i1();
            if (!this.f8382M) {
                return this.f8381L.i();
            }
            B b10 = F.this.f8316a;
            p190t.b bVar = this.f8381L;
            p190t.b bVarF0 = b10.f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    B b11 = (B) objArrO[i10];
                    if (bVar.p() <= i10) {
                        bVar.b(b11.G().I());
                    } else {
                        bVar.z(i10, b11.G().I());
                    }
                    i10++;
                } while (i10 < iP);
            }
            bVar.x(b10.x().size(), bVar.p());
            this.f8382M = false;
            return this.f8381L.i();
        }

        public final p111l0.b o0() {
            if (this.f8398y) {
                return p111l0.b.a(Y());
            }
            return null;
        }

        public final boolean p0() {
            return this.f8383N;
        }

        public final B.g q0() {
            return this.f8370A;
        }

        public Object r0() {
            return this.f8377H;
        }

        @Override // W.InterfaceC0960b
        public void requestLayout() {
            B.V0(F.this.f8316a, false, 1, null);
        }

        @Override // W.InterfaceC0960b
        public InterfaceC0960b s() {
            F fG;
            B bY = F.this.f8316a.Y();
            if (bY == null || (fG = bY.G()) == null) {
                return null;
            }
            return fG.r();
        }

        public final int s0() {
            return this.f8397x;
        }

        public final float t0() {
            return this.f8385P;
        }

        public final void u0(boolean z9) {
            B b10;
            B bY = F.this.f8316a.Y();
            B.g gVarF = F.this.f8316a.F();
            if (bY == null || gVarF == B.g.NotUsed) {
                return;
            }
            do {
                b10 = bY;
                if (b10.F() != gVarF) {
                    break;
                } else {
                    bY = b10.Y();
                }
            } while (bY != null);
            int i10 = a.f8401b[gVarF.ordinal()];
            if (i10 == 1) {
                B.X0(b10, z9, false, false, 6, null);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                b10.U0(z9);
            }
        }

        public final void v0() {
            this.f8376G = true;
        }

        public final boolean w0() {
            return this.f8379J;
        }

        @Override // U.o
        public U.t y(long j9) {
            B.g gVarF = F.this.f8316a.F();
            B.g gVar = B.g.NotUsed;
            if (gVarF == gVar) {
                F.this.f8316a.l();
            }
            if (G.a(F.this.f8316a)) {
                a aVarH = F.this.H();
                kotlin.jvm.internal.n.e(aVarH);
                aVarH.C0(gVar);
                aVarH.y(j9);
            }
            K0(F.this.f8316a);
            F0(j9);
            return this;
        }

        public final void z0() {
            p190t.b bVarF0;
            int iP;
            if (F.this.s() <= 0 || (iP = (bVarF0 = F.this.f8316a.f0()).p()) <= 0) {
                return;
            }
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                B b10 = (B) objArrO[i10];
                F fG = b10.G();
                if ((fG.v() || fG.u()) && !fG.A()) {
                    B.V0(b10, false, 1, null);
                }
                fG.I().z0();
                i10++;
            } while (i10 < iP);
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f8409s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j9) {
            super(0);
            this.f8409s = j9;
        }

        public final void a() {
            K kJ1 = F.this.K().j1();
            kotlin.jvm.internal.n.e(kJ1);
            kJ1.y(this.f8409s);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class d extends kotlin.jvm.internal.o implements p219v8.a {
        d() {
            super(0);
        }

        public final void a() {
            F.this.K().y(F.this.f8335t);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public F(B b10) {
        this.f8316a = b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long j9) {
        this.f8318c = B.e.LookaheadMeasuring;
        this.f8322g = false;
        f0.h(E.b(this.f8316a).getSnapshotObserver(), this.f8316a, false, new c(j9), 2, null);
        P();
        if (G.a(this.f8316a)) {
            O();
        } else {
            R();
        }
        this.f8318c = B.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long j9) {
        B.e eVar = this.f8318c;
        B.e eVar2 = B.e.Idle;
        if (!(eVar == eVar2)) {
            T.a.b("layout state is not idle before measure starts");
        }
        B.e eVar3 = B.e.Measuring;
        this.f8318c = eVar3;
        this.f8319d = false;
        this.f8335t = j9;
        E.b(this.f8316a).getSnapshotObserver().g(this.f8316a, false, this.f8336u);
        if (this.f8318c == eVar3) {
            O();
            this.f8318c = eVar2;
        }
    }

    public final boolean A() {
        return this.f8320e;
    }

    public final B.e B() {
        return this.f8318c;
    }

    public final InterfaceC0960b C() {
        return this.f8334s;
    }

    public final boolean D() {
        return this.f8331p;
    }

    public final boolean E() {
        return this.f8330o;
    }

    public final boolean F() {
        return this.f8323h;
    }

    public final boolean G() {
        return this.f8322g;
    }

    public final a H() {
        return this.f8334s;
    }

    public final b I() {
        return this.f8333r;
    }

    public final boolean J() {
        return this.f8319d;
    }

    public final U K() {
        return this.f8316a.V().n();
    }

    public final int L() {
        return this.f8333r.Z();
    }

    public final void M() {
        this.f8333r.v0();
        a aVar = this.f8334s;
        if (aVar != null) {
            aVar.r0();
        }
    }

    public final void N() {
        this.f8333r.H0(true);
        a aVar = this.f8334s;
        if (aVar != null) {
            aVar.B0(true);
        }
    }

    public final void O() {
        this.f8320e = true;
        this.f8321f = true;
    }

    public final void P() {
        this.f8323h = true;
        this.f8324i = true;
    }

    public final void Q() {
        this.f8322g = true;
    }

    public final void R() {
        this.f8319d = true;
    }

    public final void S() {
        B.e eVarI = this.f8316a.I();
        if (eVarI == B.e.LayingOut || eVarI == B.e.LookaheadLayingOut) {
            if (this.f8333r.p0()) {
                Z(true);
            } else {
                Y(true);
            }
        }
        if (eVarI == B.e.LookaheadLayingOut) {
            a aVar = this.f8334s;
            if (aVar == null || !aVar.l0()) {
                a0(true);
            } else {
                b0(true);
            }
        }
    }

    public final void V() {
        AbstractC0959a abstractC0959aA;
        this.f8333r.a().p();
        a aVar = this.f8334s;
        if (aVar == null || (abstractC0959aA = aVar.a()) == null) {
            return;
        }
        abstractC0959aA.p();
    }

    public final void W(int i10) {
        int i11 = this.f8329n;
        this.f8329n = i10;
        if ((i11 == 0) != (i10 == 0)) {
            B bY = this.f8316a.Y();
            F fG = bY != null ? bY.G() : null;
            if (fG != null) {
                if (i10 == 0) {
                    fG.W(fG.f8329n - 1);
                } else {
                    fG.W(fG.f8329n + 1);
                }
            }
        }
    }

    public final void X(int i10) {
        int i11 = this.f8332q;
        this.f8332q = i10;
        if ((i11 == 0) != (i10 == 0)) {
            B bY = this.f8316a.Y();
            F fG = bY != null ? bY.G() : null;
            if (fG != null) {
                if (i10 == 0) {
                    fG.X(fG.f8332q - 1);
                } else {
                    fG.X(fG.f8332q + 1);
                }
            }
        }
    }

    public final void Y(boolean z9) {
        if (this.f8328m != z9) {
            this.f8328m = z9;
            if (z9 && !this.f8327l) {
                W(this.f8329n + 1);
            } else {
                if (z9 || this.f8327l) {
                    return;
                }
                W(this.f8329n - 1);
            }
        }
    }

    public final void Z(boolean z9) {
        if (this.f8327l != z9) {
            this.f8327l = z9;
            if (z9 && !this.f8328m) {
                W(this.f8329n + 1);
            } else {
                if (z9 || this.f8328m) {
                    return;
                }
                W(this.f8329n - 1);
            }
        }
    }

    public final void a0(boolean z9) {
        if (this.f8331p != z9) {
            this.f8331p = z9;
            if (z9 && !this.f8330o) {
                X(this.f8332q + 1);
            } else {
                if (z9 || this.f8330o) {
                    return;
                }
                X(this.f8332q - 1);
            }
        }
    }

    public final void b0(boolean z9) {
        if (this.f8330o != z9) {
            this.f8330o = z9;
            if (z9 && !this.f8331p) {
                X(this.f8332q + 1);
            } else {
                if (z9 || this.f8331p) {
                    return;
                }
                X(this.f8332q - 1);
            }
        }
    }

    public final void c0() {
        B bY;
        if (this.f8333r.L0() && (bY = this.f8316a.Y()) != null) {
            B.X0(bY, false, false, false, 7, null);
        }
        a aVar = this.f8334s;
        if (aVar == null || !aVar.G0()) {
            return;
        }
        if (G.a(this.f8316a)) {
            B bY2 = this.f8316a.Y();
            if (bY2 != null) {
                B.X0(bY2, false, false, false, 7, null);
                return;
            }
            return;
        }
        B bY3 = this.f8316a.Y();
        if (bY3 != null) {
            B.T0(bY3, false, false, false, 7, null);
        }
    }

    public final void q() {
        if (this.f8334s == null) {
            this.f8334s = new a();
        }
    }

    public final InterfaceC0960b r() {
        return this.f8333r;
    }

    public final int s() {
        return this.f8329n;
    }

    public final int t() {
        return this.f8332q;
    }

    public final boolean u() {
        return this.f8328m;
    }

    public final boolean v() {
        return this.f8327l;
    }

    public final boolean w() {
        return this.f8317b;
    }

    public final int x() {
        return this.f8333r.U();
    }

    public final p111l0.b y() {
        return this.f8333r.o0();
    }

    public final p111l0.b z() {
        a aVar = this.f8334s;
        if (aVar != null) {
            return aVar.k0();
        }
        return null;
    }
}
