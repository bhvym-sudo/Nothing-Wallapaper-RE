package W;

import I.InterfaceC0869m;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p170r.InterfaceC1686j;
import p170r.InterfaceC1711w;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC1686j, e0, U.k, d0.b {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final d f8257Y = new d(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f8258Z = 8;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final f f8259a0 = new c();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final p219v8.a f8260b0 = a.f8297r;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final androidx.compose.ui.platform.q0 f8261c0 = new b();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Comparator f8262d0 = new Comparator() { // from class: W.A
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return B.f((B) obj, (B) obj2);
        }
    };

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AndroidViewHolder f8263A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f8264B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f8265C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p011b0.g f8266D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p190t.b f8267E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f8268F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private U.p f8269G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p111l0.d f8270H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p111l0.s f8271I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private androidx.compose.ui.platform.q0 f8272J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private InterfaceC1711w f8273K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private g f8274L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private g f8275M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f8276N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final S f8277O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final F f8278P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private U f8279Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f8280R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private C.c f8281S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private C.c f8282T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private p219v8.l f8283U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private p219v8.l f8284V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f8285W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f8286X;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f8287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private B f8290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f8291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final O f8292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p190t.b f8293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private B f8295y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d0 f8296z;

    static final class a extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f8297r = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B invoke() {
            return new B(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    public static final class b implements androidx.compose.ui.platform.q0 {
        b() {
        }

        @Override // androidx.compose.ui.platform.q0
        public long a() {
            return p111l0.j.f22826a.a();
        }
    }

    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // U.p
        public /* bridge */ /* synthetic */ U.q a(U.r rVar, List list, long j9) {
            return (U.q) b(rVar, list, j9);
        }

        public Void b(U.r rVar, List list, long j9) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    public static final class d {
        public /* synthetic */ d(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Comparator a() {
            return B.f8262d0;
        }

        private d() {
        }
    }

    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public static abstract class f implements U.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8304a;

        public f(String str) {
            this.f8304a = str;
        }
    }

    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8309a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8309a = iArr;
        }
    }

    static final class i extends kotlin.jvm.internal.o implements p219v8.a {
        i() {
            super(0);
        }

        public final void a() {
            B.this.G().N();
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class j extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f8312s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlin.jvm.internal.E e10) {
            super(0);
            this.f8312s = e10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            S sV = B.this.V();
            int iA = W.a(8);
            kotlin.jvm.internal.E e10 = this.f8312s;
            if ((sV.i() & iA) != 0) {
                for (C.c.AbstractC0022c abstractC0022cO = sV.o(); abstractC0022cO != null; abstractC0022cO = abstractC0022cO.N()) {
                    if ((abstractC0022cO.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cO; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (abstractC0022cF instanceof m0) {
                                m0 m0Var = (m0) abstractC0022cF;
                                if (m0Var.n()) {
                                    p011b0.g gVar = new p011b0.g();
                                    e10.f22779q = gVar;
                                    gVar.s(true);
                                }
                                if (m0Var.E()) {
                                    ((p011b0.g) e10.f22779q).t(true);
                                }
                                m0Var.o((p011b0.g) e10.f22779q);
                            } else {
                                abstractC0022cF.L();
                            }
                        }
                    }
                }
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public B(boolean z9, int i10) {
        this.f8287q = z9;
        this.f8288r = i10;
        this.f8292v = new O(new p190t.b(new B[16], 0), new i());
        this.f8267E = new p190t.b(new B[16], 0);
        this.f8268F = true;
        this.f8269G = f8259a0;
        this.f8270H = E.f8315a;
        this.f8271I = p111l0.s.Ltr;
        this.f8272J = f8261c0;
        this.f8273K = InterfaceC1711w.f25597m.a();
        g gVar = g.NotUsed;
        this.f8274L = gVar;
        this.f8275M = gVar;
        this.f8277O = new S(this);
        this.f8278P = new F(this);
        this.f8280R = true;
        this.f8281S = C.c.f445a;
    }

    private final U E() {
        if (this.f8280R) {
            U uD = D();
            U uQ1 = W().q1();
            this.f8279Q = null;
            while (!kotlin.jvm.internal.n.d(uD, uQ1)) {
                if ((uD != null ? uD.i1() : null) != null) {
                    this.f8279Q = uD;
                    break;
                }
                uD = uD != null ? uD.q1() : null;
            }
        }
        U u9 = this.f8279Q;
        if (u9 == null || u9.i1() != null) {
            return u9;
        }
        T.a.c("layer was not set");
        throw new p079h8.f();
    }

    private final void G0(B b10) {
        if (b10.f8278P.s() > 0) {
            F f10 = this.f8278P;
            f10.W(f10.s() - 1);
        }
        if (this.f8296z != null) {
            b10.p();
        }
        b10.f8295y = null;
        b10.W().U1(null);
        if (b10.f8287q) {
            this.f8291u--;
            p190t.b bVarE = b10.f8292v.e();
            int iP = bVarE.p();
            if (iP > 0) {
                Object[] objArrO = bVarE.o();
                int i10 = 0;
                do {
                    ((B) objArrO[i10]).W().U1(null);
                    i10++;
                } while (i10 < iP);
            }
        }
        s0();
        I0();
    }

    private final void H0() {
        o0();
        B bY = Y();
        if (bY != null) {
            bY.m0();
        }
        n0();
    }

    private final void K0() {
        if (this.f8294x) {
            int i10 = 0;
            this.f8294x = false;
            p190t.b bVar = this.f8293w;
            if (bVar == null) {
                bVar = new p190t.b(new B[16], 0);
                this.f8293w = bVar;
            }
            bVar.j();
            p190t.b bVarE = this.f8292v.e();
            int iP = bVarE.p();
            if (iP > 0) {
                Object[] objArrO = bVarE.o();
                do {
                    B b10 = (B) objArrO[i10];
                    if (b10.f8287q) {
                        bVar.g(bVar.p(), b10.f0());
                    } else {
                        bVar.b(b10);
                    }
                    i10++;
                } while (i10 < iP);
            }
            this.f8278P.N();
        }
    }

    public static /* synthetic */ boolean M0(B b10, p111l0.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b10.f8278P.y();
        }
        return b10.L0(bVar);
    }

    public static /* synthetic */ void R0(B b10, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        b10.Q0(z9);
    }

    public static /* synthetic */ void T0(B b10, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        b10.S0(z9, z10, z11);
    }

    public static /* synthetic */ void V0(B b10, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        b10.U0(z9);
    }

    public static /* synthetic */ void X0(B b10, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        b10.W0(z9, z10, z11);
    }

    private final void Z0() {
        this.f8277O.x();
    }

    private final float d0() {
        return O().t0();
    }

    private final void e1(B b10) {
        if (kotlin.jvm.internal.n.d(b10, this.f8290t)) {
            return;
        }
        this.f8290t = b10;
        if (b10 != null) {
            this.f8278P.q();
            U uP1 = D().p1();
            for (U uW = W(); !kotlin.jvm.internal.n.d(uW, uP1) && uW != null; uW = uW.p1()) {
                uW.Z0();
            }
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(B b10, B b11) {
        return b10.d0() == b11.d0() ? kotlin.jvm.internal.n.i(b10.Z(), b11.Z()) : Float.compare(b10.d0(), b11.d0());
    }

    public static /* synthetic */ void h0(B b10, long j9, C0975q c0975q, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        boolean z11 = z9;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        b10.g0(j9, c0975q, z11, z10);
    }

    private final void j(C.c cVar) {
        this.f8281S = cVar;
        this.f8277O.E(cVar);
        this.f8278P.c0();
        if (this.f8290t == null && this.f8277O.q(W.a(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING))) {
            e1(this);
        }
    }

    public static /* synthetic */ void j0(B b10, long j9, C0975q c0975q, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        b10.i0(j9, c0975q, z9, z10);
    }

    private final void l0() {
        if (this.f8277O.p(W.a(Optimizer.OPTIMIZATION_GROUPING) | W.a(RecyclerView.ItemAnimator.FLAG_MOVED) | W.a(4096))) {
            for (C.c.AbstractC0022c abstractC0022cK = this.f8277O.k(); abstractC0022cK != null; abstractC0022cK = abstractC0022cK.I()) {
                if (((W.a(Optimizer.OPTIMIZATION_GROUPING) & abstractC0022cK.L()) != 0) | ((W.a(RecyclerView.ItemAnimator.FLAG_MOVED) & abstractC0022cK.L()) != 0) | ((W.a(4096) & abstractC0022cK.L()) != 0)) {
                    X.a(abstractC0022cK);
                }
            }
        }
    }

    private final void m() {
        this.f8275M = this.f8274L;
        this.f8274L = g.NotUsed;
        p190t.b bVarF0 = f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                B b10 = (B) objArrO[i10];
                if (b10.f8274L == g.InLayoutBlock) {
                    b10.m();
                }
                i10++;
            } while (i10 < iP);
        }
    }

    private final String n(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        p190t.b bVarF0 = f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i12 = 0;
            do {
                sb.append(((B) objArrO[i12]).n(i10 + 1));
                i12++;
            } while (i12 < iP);
        }
        String string = sb.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    static /* synthetic */ String o(B b10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return b10.n(i10);
    }

    private final void s0() {
        B b10;
        if (this.f8291u > 0) {
            this.f8294x = true;
        }
        if (!this.f8287q || (b10 = this.f8295y) == null) {
            return;
        }
        b10.s0();
    }

    public static /* synthetic */ boolean z0(B b10, p111l0.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b10.f8278P.z();
        }
        return b10.y0(bVar);
    }

    public final int A() {
        return this.f8264B;
    }

    public final void A0() {
        if (this.f8274L == g.NotUsed) {
            m();
        }
        F.a aVarL = L();
        kotlin.jvm.internal.n.e(aVarL);
        aVarL.A0();
    }

    public final boolean B() {
        long jH1 = D().h1();
        return p111l0.b.f(jH1) && p111l0.b.e(jH1);
    }

    public final void B0() {
        this.f8278P.O();
    }

    public int C() {
        return this.f8278P.x();
    }

    public final void C0() {
        this.f8278P.P();
    }

    public final U D() {
        return this.f8277O.l();
    }

    public final void D0() {
        this.f8278P.Q();
    }

    public final void E0() {
        this.f8278P.R();
    }

    public final g F() {
        return this.f8274L;
    }

    public final void F0(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this.f8292v.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, (B) this.f8292v.f(i10 > i11 ? i10 + i13 : i10));
        }
        I0();
        s0();
        o0();
    }

    public final F G() {
        return this.f8278P;
    }

    public final boolean H() {
        return this.f8278P.A();
    }

    public final e I() {
        return this.f8278P.B();
    }

    public final void I0() {
        if (!this.f8287q) {
            this.f8268F = true;
            return;
        }
        B bY = Y();
        if (bY != null) {
            bY.I0();
        }
    }

    public final boolean J() {
        return this.f8278P.F();
    }

    public final void J0(int i10, int i11) {
        U.t.a placementScope;
        U uD;
        if (this.f8274L == g.NotUsed) {
            m();
        }
        B bY = Y();
        if (bY == null || (uD = bY.D()) == null || (placementScope = uD.r0()) == null) {
            placementScope = E.b(this).getPlacementScope();
        }
        U.t.a.l(placementScope, O(), i10, i11, 0.0f, 4, null);
    }

    public final boolean K() {
        return this.f8278P.G();
    }

    public final F.a L() {
        return this.f8278P.H();
    }

    public final boolean L0(p111l0.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f8274L == g.NotUsed) {
            l();
        }
        return O().F0(bVar.m());
    }

    public final B M() {
        return this.f8290t;
    }

    public final D N() {
        return E.b(this).getSharedDrawScope();
    }

    public final void N0() {
        int iD = this.f8292v.d();
        while (true) {
            iD--;
            if (-1 >= iD) {
                this.f8292v.b();
                return;
            }
            G0((B) this.f8292v.c(iD));
        }
    }

    public final F.b O() {
        return this.f8278P.I();
    }

    public final void O0(int i10, int i11) {
        if (!(i11 >= 0)) {
            T.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            G0((B) this.f8292v.c(i12));
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final boolean P() {
        return this.f8278P.J();
    }

    public final void P0() {
        if (this.f8274L == g.NotUsed) {
            m();
        }
        O().G0();
    }

    public U.p Q() {
        return this.f8269G;
    }

    public final void Q0(boolean z9) {
        d0 d0Var;
        if (this.f8287q || (d0Var = this.f8296z) == null) {
            return;
        }
        d0Var.k(this, true, z9);
    }

    public final g R() {
        return O().q0();
    }

    public final g S() {
        g gVarN0;
        F.a aVarL = L();
        return (aVarL == null || (gVarN0 = aVarL.n0()) == null) ? g.NotUsed : gVarN0;
    }

    public final void S0(boolean z9, boolean z10, boolean z11) {
        if (!(this.f8290t != null)) {
            T.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        d0 d0Var = this.f8296z;
        if (d0Var == null || this.f8265C || this.f8287q) {
            return;
        }
        d0Var.e(this, true, z9, z10);
        if (z11) {
            F.a aVarL = L();
            kotlin.jvm.internal.n.e(aVarL);
            aVarL.q0(z9);
        }
    }

    public C.c T() {
        return this.f8281S;
    }

    public final boolean U() {
        return this.f8285W;
    }

    public final void U0(boolean z9) {
        d0 d0Var;
        if (this.f8287q || (d0Var = this.f8296z) == null) {
            return;
        }
        d0.v(d0Var, this, false, z9, 2, null);
    }

    public final S V() {
        return this.f8277O;
    }

    public final U W() {
        return this.f8277O.n();
    }

    public final void W0(boolean z9, boolean z10, boolean z11) {
        d0 d0Var;
        if (this.f8265C || this.f8287q || (d0Var = this.f8296z) == null) {
            return;
        }
        d0.d(d0Var, this, false, z9, z10, 2, null);
        if (z11) {
            O().u0(z9);
        }
    }

    public final d0 X() {
        return this.f8296z;
    }

    public final B Y() {
        B b10 = this.f8295y;
        while (b10 != null && b10.f8287q) {
            b10 = b10.f8295y;
        }
        return b10;
    }

    public final void Y0(B b10) {
        if (h.f8309a[b10.I().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + b10.I());
        }
        if (b10.K()) {
            T0(b10, true, false, false, 6, null);
            return;
        }
        if (b10.J()) {
            b10.Q0(true);
        }
        if (b10.P()) {
            X0(b10, true, false, false, 6, null);
        } else if (b10.H()) {
            b10.U0(true);
        }
    }

    public final int Z() {
        return O().s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // W.d0.b
    public void a() {
        U uD = D();
        int iA = W.a(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        boolean zI = X.i(iA);
        C.c.AbstractC0022c abstractC0022cO1 = uD.o1();
        if (!zI && (abstractC0022cO1 = abstractC0022cO1.N()) == null) {
            return;
        }
        for (C.c.AbstractC0022c abstractC0022cU1 = uD.u1(zI); abstractC0022cU1 != null && (abstractC0022cU1.H() & iA) != 0; abstractC0022cU1 = abstractC0022cU1.I()) {
            if ((abstractC0022cU1.L() & iA) != 0) {
                for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cU1; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                    if (abstractC0022cF instanceof InterfaceC0979v) {
                        ((InterfaceC0979v) abstractC0022cF).j(D());
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

    public int a0() {
        return this.f8288r;
    }

    public final void a1() {
        p190t.b bVarF0 = f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                B b10 = (B) objArrO[i10];
                g gVar = b10.f8275M;
                b10.f8274L = gVar;
                if (gVar != g.NotUsed) {
                    b10.a1();
                }
                i10++;
            } while (i10 < iP);
        }
    }

    @Override // p170r.InterfaceC1686j
    public void b() {
        AndroidViewHolder androidViewHolder = this.f8263A;
        if (androidViewHolder != null) {
            androidViewHolder.b();
        }
        this.f8286X = true;
        Z0();
        if (t0()) {
            r0();
        }
    }

    public androidx.compose.ui.platform.q0 b0() {
        return this.f8272J;
    }

    public final void b1(boolean z9) {
        this.f8276N = z9;
    }

    @Override // U.k
    public boolean c() {
        return O().c();
    }

    public int c0() {
        return this.f8278P.L();
    }

    public void c1(p111l0.d dVar) {
        if (kotlin.jvm.internal.n.d(this.f8270H, dVar)) {
            return;
        }
        this.f8270H = dVar;
        H0();
        for (C.c.AbstractC0022c abstractC0022cK = this.f8277O.k(); abstractC0022cK != null; abstractC0022cK = abstractC0022cK.I()) {
            if ((W.a(16) & abstractC0022cK.L()) != 0) {
                ((j0) abstractC0022cK).v();
            }
        }
    }

    @Override // U.k
    public U.i d() {
        return D();
    }

    public final void d1(boolean z9) {
        this.f8280R = z9;
    }

    public final p190t.b e0() {
        if (this.f8268F) {
            this.f8267E.j();
            p190t.b bVar = this.f8267E;
            bVar.g(bVar.p(), f0());
            this.f8267E.B(f8262d0);
            this.f8268F = false;
        }
        return this.f8267E;
    }

    public final p190t.b f0() {
        i1();
        if (this.f8291u == 0) {
            return this.f8292v.e();
        }
        p190t.b bVar = this.f8293w;
        kotlin.jvm.internal.n.e(bVar);
        return bVar;
    }

    public void f1(U.p pVar) {
        if (kotlin.jvm.internal.n.d(this.f8269G, pVar)) {
            return;
        }
        this.f8269G = pVar;
        o0();
    }

    @Override // W.e0
    public boolean g() {
        return t0();
    }

    public final void g0(long j9, C0975q c0975q, boolean z9, boolean z10) {
        W().x1(U.f8476b0.a(), U.c1(W(), j9, false, 2, null), c0975q, z9, z10);
    }

    public void g1(C.c cVar) {
        if (!(!this.f8287q || T() == C.c.f445a)) {
            T.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (u0()) {
            T.a.a("modifier is updated when deactivated");
        }
        if (t0()) {
            j(cVar);
        } else {
            this.f8282T = cVar;
        }
    }

    @Override // U.k
    public p111l0.s getLayoutDirection() {
        return this.f8271I;
    }

    public final void h1(boolean z9) {
        this.f8285W = z9;
    }

    public final void i0(long j9, C0975q c0975q, boolean z9, boolean z10) {
        W().x1(U.f8476b0.b(), U.c1(W(), j9, false, 2, null), c0975q, true, z10);
    }

    public final void i1() {
        if (this.f8291u > 0) {
            K0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    public final void k(d0 d0Var) {
        boolean z9;
        B b10;
        int i10 = 0;
        if (!(this.f8296z == null)) {
            T.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + o(this, 0, 1, null));
        }
        B b11 = this.f8295y;
        if (b11 == null) {
            z9 = true;
        } else if (kotlin.jvm.internal.n.d(b11 != null ? b11.f8296z : null, d0Var)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(d0Var);
            sb.append(") than the parent's owner(");
            B bY = Y();
            sb.append(bY != null ? bY.f8296z : null);
            sb.append("). This tree: ");
            sb.append(o(this, 0, 1, null));
            sb.append(" Parent tree: ");
            B b12 = this.f8295y;
            sb.append(b12 != null ? o(b12, 0, 1, null) : null);
            T.a.b(sb.toString());
        }
        B bY2 = Y();
        if (bY2 == null) {
            O().J0(true);
            F.a aVarL = L();
            if (aVarL != null) {
                aVarL.E0(true);
            }
        }
        W().U1(bY2 != null ? bY2.D() : null);
        this.f8296z = d0Var;
        this.f8264B = (bY2 != null ? bY2.f8264B : -1) + 1;
        C.c cVar = this.f8282T;
        if (cVar != null) {
            j(cVar);
        }
        this.f8282T = null;
        if (this.f8277O.q(W.a(8))) {
            r0();
        }
        d0Var.s(this);
        if (this.f8289s) {
            e1(this);
        } else {
            B b13 = this.f8295y;
            if (b13 == null || (b10 = b13.f8290t) == null) {
                b10 = this.f8290t;
            }
            e1(b10);
            if (this.f8290t == null && this.f8277O.q(W.a(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING))) {
                e1(this);
            }
        }
        if (!u0()) {
            this.f8277O.s();
        }
        p190t.b bVarE = this.f8292v.e();
        int iP = bVarE.p();
        if (iP > 0) {
            Object[] objArrO = bVarE.o();
            do {
                ((B) objArrO[i10]).k(d0Var);
                i10++;
            } while (i10 < iP);
        }
        if (!u0()) {
            this.f8277O.y();
        }
        o0();
        if (bY2 != null) {
            bY2.o0();
        }
        U uP1 = D().p1();
        for (U uW = W(); !kotlin.jvm.internal.n.d(uW, uP1) && uW != null; uW = uW.p1()) {
            uW.F1();
        }
        p219v8.l lVar = this.f8283U;
        if (lVar != null) {
            lVar.f(d0Var);
        }
        this.f8278P.c0();
        if (u0()) {
            return;
        }
        l0();
    }

    public final void k0(int i10, B b10) {
        if (!(b10.f8295y == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(b10);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(o(this, 0, 1, null));
            sb.append(" Other tree: ");
            B b11 = b10.f8295y;
            sb.append(b11 != null ? o(b11, 0, 1, null) : null);
            T.a.b(sb.toString());
        }
        if (!(b10.f8296z == null)) {
            T.a.b("Cannot insert " + b10 + " because it already has an owner. This tree: " + o(this, 0, 1, null) + " Other tree: " + o(b10, 0, 1, null));
        }
        b10.f8295y = this;
        this.f8292v.a(i10, b10);
        I0();
        if (b10.f8287q) {
            this.f8291u++;
        }
        s0();
        d0 d0Var = this.f8296z;
        if (d0Var != null) {
            b10.k(d0Var);
        }
        if (b10.f8278P.s() > 0) {
            F f10 = this.f8278P;
            f10.W(f10.s() + 1);
        }
    }

    public final void l() {
        this.f8275M = this.f8274L;
        this.f8274L = g.NotUsed;
        p190t.b bVarF0 = f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                B b10 = (B) objArrO[i10];
                if (b10.f8274L != g.NotUsed) {
                    b10.l();
                }
                i10++;
            } while (i10 < iP);
        }
    }

    public final void m0() {
        U uE = E();
        if (uE != null) {
            uE.z1();
            return;
        }
        B bY = Y();
        if (bY != null) {
            bY.m0();
        }
    }

    public final void n0() {
        U uW = W();
        U uD = D();
        while (uW != uD) {
            kotlin.jvm.internal.n.f(uW, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0981x c0981x = (C0981x) uW;
            c0 c0VarI1 = c0981x.i1();
            if (c0VarI1 != null) {
                c0VarI1.invalidate();
            }
            uW = c0981x.p1();
        }
        c0 c0VarI2 = D().i1();
        if (c0VarI2 != null) {
            c0VarI2.invalidate();
        }
    }

    public final void o0() {
        if (this.f8290t != null) {
            T0(this, false, false, false, 7, null);
        } else {
            X0(this, false, false, false, 7, null);
        }
    }

    @Override // p170r.InterfaceC1686j
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.f8263A;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        U uP1 = D().p1();
        for (U uW = W(); !kotlin.jvm.internal.n.d(uW, uP1) && uW != null; uW = uW.p1()) {
            uW.J1();
        }
    }

    public final void p() {
        d0 d0Var = this.f8296z;
        if (d0Var == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            B bY = Y();
            sb.append(bY != null ? o(bY, 0, 1, null) : null);
            T.a.c(sb.toString());
            throw new p079h8.f();
        }
        B bY2 = Y();
        if (bY2 != null) {
            bY2.m0();
            bY2.o0();
            F.b bVarO = O();
            g gVar = g.NotUsed;
            bVarO.I0(gVar);
            F.a aVarL = L();
            if (aVarL != null) {
                aVarL.C0(gVar);
            }
        }
        this.f8278P.V();
        p219v8.l lVar = this.f8284V;
        if (lVar != null) {
            lVar.f(d0Var);
        }
        if (this.f8277O.q(W.a(8))) {
            r0();
        }
        this.f8277O.z();
        this.f8265C = true;
        p190t.b bVarE = this.f8292v.e();
        int iP = bVarE.p();
        if (iP > 0) {
            Object[] objArrO = bVarE.o();
            int i10 = 0;
            do {
                ((B) objArrO[i10]).p();
                i10++;
            } while (i10 < iP);
        }
        this.f8265C = false;
        this.f8277O.t();
        d0Var.h(this);
        this.f8296z = null;
        e1(null);
        this.f8264B = 0;
        O().B0();
        F.a aVarL2 = L();
        if (aVarL2 != null) {
            aVarL2.w0();
        }
    }

    public final void p0() {
        if (H() || P() || this.f8285W) {
            return;
        }
        E.b(this).m(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q() {
        if (I() != e.Idle || H() || P() || u0() || !c()) {
            return;
        }
        S s9 = this.f8277O;
        int iA = W.a(256);
        if ((s9.i() & iA) != 0) {
            for (C.c.AbstractC0022c abstractC0022cK = s9.k(); abstractC0022cK != null; abstractC0022cK = abstractC0022cK.I()) {
                if ((abstractC0022cK.L() & iA) != 0) {
                    for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cK; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                        if (abstractC0022cF instanceof InterfaceC0974p) {
                            InterfaceC0974p interfaceC0974p = (InterfaceC0974p) abstractC0022cF;
                            interfaceC0974p.y(AbstractC0967i.g(interfaceC0974p, W.a(256)));
                        } else {
                            abstractC0022cF.L();
                        }
                    }
                }
                if ((abstractC0022cK.H() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final void q0() {
        this.f8278P.M();
    }

    public final void r(InterfaceC0869m interfaceC0869m, L.c cVar) {
        W().W0(interfaceC0869m, cVar);
    }

    public final void r0() {
        this.f8266D = null;
        E.b(this).q();
    }

    public final boolean s() {
        InterfaceC0960b interfaceC0960bC;
        AbstractC0959a abstractC0959aA;
        F f10 = this.f8278P;
        return f10.r().a().k() || !((interfaceC0960bC = f10.C()) == null || (abstractC0959aA = interfaceC0960bC.a()) == null || !abstractC0959aA.k());
    }

    public final boolean t() {
        return this.f8282T != null;
    }

    public boolean t0() {
        return this.f8296z != null;
    }

    public String toString() {
        return androidx.compose.ui.platform.Y.a(this, null) + " children: " + x().size() + " measurePolicy: " + Q();
    }

    public final boolean u() {
        return this.f8276N;
    }

    public boolean u0() {
        return this.f8286X;
    }

    public final List v() {
        F.a aVarL = L();
        kotlin.jvm.internal.n.e(aVarL);
        return aVarL.j0();
    }

    public final boolean v0() {
        return O().w0();
    }

    public final List w() {
        return O().n0();
    }

    public final Boolean w0() {
        F.a aVarL = L();
        if (aVarL != null) {
            return Boolean.valueOf(aVarL.c());
        }
        return null;
    }

    public final List x() {
        return f0().i();
    }

    public final boolean x0() {
        return this.f8289s;
    }

    public final p011b0.g y() {
        if (!t0() || u0()) {
            return null;
        }
        if (!this.f8277O.q(W.a(8)) || this.f8266D != null) {
            return this.f8266D;
        }
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        e10.f22779q = new p011b0.g();
        E.b(this).getSnapshotObserver().j(this, new j(e10));
        Object obj = e10.f22779q;
        this.f8266D = (p011b0.g) obj;
        return (p011b0.g) obj;
    }

    public final boolean y0(p111l0.b bVar) {
        if (bVar == null || this.f8290t == null) {
            return false;
        }
        F.a aVarL = L();
        kotlin.jvm.internal.n.e(aVarL);
        return aVarL.z0(bVar.m());
    }

    public p111l0.d z() {
        return this.f8270H;
    }

    public /* synthetic */ B(boolean z9, int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? false : z9, (i11 & 2) != 0 ? p011b0.i.a() : i10);
    }
}
