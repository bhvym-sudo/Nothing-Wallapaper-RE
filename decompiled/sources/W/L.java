package W;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f8440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0969k f8441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f8444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p190t.b f8445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p190t.b f8447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p111l0.b f8448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final H f8449j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final B f8450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f8451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f8452c;

        public a(B b10, boolean z9, boolean z10) {
            this.f8450a = b10;
            this.f8451b = z9;
            this.f8452c = z10;
        }

        public final B a() {
            return this.f8450a;
        }

        public final boolean b() {
            return this.f8452c;
        }

        public final boolean c() {
            return this.f8451b;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8453a;

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
                iArr[B.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[B.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[B.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8453a = iArr;
        }
    }

    public L(B b10) {
        this.f8440a = b10;
        d0.a aVar = d0.f8569h;
        C0969k c0969k = new C0969k(aVar.a());
        this.f8441b = c0969k;
        this.f8444e = new b0();
        this.f8445f = new p190t.b(new d0.b[16], 0);
        this.f8446g = 1L;
        p190t.b bVar = new p190t.b(new a[16], 0);
        this.f8447h = bVar;
        this.f8449j = aVar.a() ? new H(b10, c0969k, bVar.i()) : null;
    }

    public static /* synthetic */ boolean E(L l9, B b10, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return l9.D(b10, z9);
    }

    private final void b() {
        p190t.b bVar = this.f8445f;
        int iP = bVar.p();
        if (iP > 0) {
            Object[] objArrO = bVar.o();
            int i10 = 0;
            do {
                ((d0.b) objArrO[i10]).a();
                i10++;
            } while (i10 < iP);
        }
        this.f8445f.j();
    }

    public static /* synthetic */ void d(L l9, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        l9.c(z9);
    }

    private final boolean e(B b10, p111l0.b bVar) {
        if (b10.M() == null) {
            return false;
        }
        boolean zY0 = bVar != null ? b10.y0(bVar) : B.z0(b10, null, 1, null);
        B bY = b10.Y();
        if (zY0 && bY != null) {
            if (bY.M() == null) {
                B.X0(bY, false, false, false, 3, null);
                return zY0;
            }
            if (b10.S() == B.g.InMeasureBlock) {
                B.T0(bY, false, false, false, 3, null);
                return zY0;
            }
            if (b10.S() == B.g.InLayoutBlock) {
                B.R0(bY, false, 1, null);
            }
        }
        return zY0;
    }

    private final boolean f(B b10, p111l0.b bVar) {
        boolean zL0 = bVar != null ? b10.L0(bVar) : B.M0(b10, null, 1, null);
        B bY = b10.Y();
        if (zL0 && bY != null) {
            if (b10.R() == B.g.InMeasureBlock) {
                B.X0(bY, false, false, false, 3, null);
                return zL0;
            }
            if (b10.R() == B.g.InLayoutBlock) {
                B.V0(bY, false, 1, null);
            }
        }
        return zL0;
    }

    private final void g() {
        if (this.f8447h.s()) {
            p190t.b bVar = this.f8447h;
            int iP = bVar.p();
            if (iP > 0) {
                Object[] objArrO = bVar.o();
                int i10 = 0;
                do {
                    a aVar = (a) objArrO[i10];
                    if (aVar.a().t0()) {
                        if (aVar.c()) {
                            B.T0(aVar.a(), aVar.b(), false, false, 2, null);
                        } else {
                            B.X0(aVar.a(), aVar.b(), false, false, 2, null);
                        }
                    }
                    i10++;
                } while (i10 < iP);
            }
            this.f8447h.j();
        }
    }

    private final void i(B b10, boolean z9) {
        p190t.b bVarF0 = b10.f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                B b11 = (B) objArrO[i10];
                if ((!z9 && n(b11)) || (z9 && o(b11))) {
                    if (G.a(b11) && !z9) {
                        if (b11.K() && this.f8441b.e(b11, true)) {
                            v(b11, true, false);
                        } else {
                            h(b11, true);
                        }
                    }
                    u(b11, z9);
                    if (!s(b11, z9)) {
                        i(b11, z9);
                    }
                }
                i10++;
            } while (i10 < iP);
        }
        u(b10, z9);
    }

    private final boolean j(B b10) {
        return b10.P() && n(b10);
    }

    private final boolean k(B b10) {
        return b10.K() && o(b10);
    }

    private final boolean n(B b10) {
        return b10.R() == B.g.InMeasureBlock || b10.G().r().a().k();
    }

    private final boolean o(B b10) {
        InterfaceC0960b interfaceC0960bC;
        AbstractC0959a abstractC0959aA;
        return b10.S() == B.g.InMeasureBlock || !((interfaceC0960bC = b10.G().C()) == null || (abstractC0959aA = interfaceC0960bC.a()) == null || !abstractC0959aA.k());
    }

    private final boolean s(B b10, boolean z9) {
        return z9 ? b10.K() : b10.P();
    }

    private final void u(B b10, boolean z9) {
        if (s(b10, z9) && this.f8441b.e(b10, z9)) {
            v(b10, z9, false);
        }
    }

    private final boolean v(B b10, boolean z9, boolean z10) {
        p111l0.b bVar;
        boolean zE;
        B bY;
        if (b10.u0()) {
            return false;
        }
        if (!b10.c() && !b10.v0() && !j(b10) && !kotlin.jvm.internal.n.d(b10.w0(), Boolean.TRUE) && !k(b10) && !b10.s()) {
            return false;
        }
        if (b10 == this.f8440a) {
            bVar = this.f8448i;
            kotlin.jvm.internal.n.e(bVar);
        } else {
            bVar = null;
        }
        if (z9) {
            zE = b10.K() ? e(b10, bVar) : false;
            if (z10 && ((zE || b10.J()) && kotlin.jvm.internal.n.d(b10.w0(), Boolean.TRUE))) {
                b10.A0();
            }
        } else {
            boolean zF = b10.P() ? f(b10, bVar) : false;
            if (z10 && b10.H() && (b10 == this.f8440a || ((bY = b10.Y()) != null && bY.c() && b10.v0()))) {
                if (b10 == this.f8440a) {
                    b10.J0(0, 0);
                } else {
                    b10.P0();
                }
                this.f8444e.d(b10);
                H h10 = this.f8449j;
                if (h10 != null) {
                    h10.a();
                }
            }
            zE = zF;
        }
        g();
        return zE;
    }

    static /* synthetic */ boolean w(L l9, B b10, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return l9.v(b10, z9, z10);
    }

    private final void x(B b10) {
        p190t.b bVarF0 = b10.f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                B b11 = (B) objArrO[i10];
                if (n(b11)) {
                    if (G.a(b11)) {
                        y(b11, true);
                    } else {
                        x(b11);
                    }
                }
                i10++;
            } while (i10 < iP);
        }
    }

    private final void y(B b10, boolean z9) {
        p111l0.b bVar;
        if (b10.u0()) {
            return;
        }
        if (b10 == this.f8440a) {
            bVar = this.f8448i;
            kotlin.jvm.internal.n.e(bVar);
        } else {
            bVar = null;
        }
        if (z9) {
            e(b10, bVar);
        } else {
            f(b10, bVar);
        }
    }

    public final boolean A(B b10, boolean z9) {
        B bY;
        B bY2;
        if (!(b10.M() != null)) {
            T.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f8453a[b10.I().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new p079h8.m();
                }
                if (b10.K() && !z9) {
                    return false;
                }
                b10.D0();
                b10.E0();
                if (b10.u0()) {
                    return false;
                }
                if ((kotlin.jvm.internal.n.d(b10.w0(), Boolean.TRUE) || k(b10)) && ((bY = b10.Y()) == null || !bY.K())) {
                    this.f8441b.c(b10, true);
                } else if ((b10.c() || j(b10)) && ((bY2 = b10.Y()) == null || !bY2.P())) {
                    this.f8441b.c(b10, false);
                }
                return !this.f8443d;
            }
            this.f8447h.b(new a(b10, true, z9));
            H h10 = this.f8449j;
            if (h10 != null) {
                h10.a();
            }
        }
        return false;
    }

    public final void B(B b10) {
        this.f8444e.d(b10);
    }

    public final boolean C(B b10, boolean z9) {
        int i10 = b.f8453a[b10.I().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            H h10 = this.f8449j;
            if (h10 != null) {
                h10.a();
            }
            return false;
        }
        if (i10 != 5) {
            throw new p079h8.m();
        }
        if (!z9 && b10.c() == b10.v0() && (b10.P() || b10.H())) {
            H h11 = this.f8449j;
            if (h11 != null) {
                h11.a();
            }
            return false;
        }
        b10.B0();
        if (!b10.u0() && b10.v0()) {
            B bY = b10.Y();
            if ((bY == null || !bY.H()) && (bY == null || !bY.P())) {
                this.f8441b.c(b10, false);
            }
            if (!this.f8443d) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(B b10, boolean z9) {
        int i10 = b.f8453a[b10.I().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new p079h8.m();
                }
                if (b10.P() && !z9) {
                    return false;
                }
                b10.E0();
                if (b10.u0()) {
                    return false;
                }
                if (!b10.c() && !j(b10)) {
                    return false;
                }
                B bY = b10.Y();
                if (bY == null || !bY.P()) {
                    this.f8441b.c(b10, false);
                }
                return !this.f8443d;
            }
            this.f8447h.b(new a(b10, false, z9));
            H h10 = this.f8449j;
            if (h10 != null) {
                h10.a();
            }
        }
        return false;
    }

    public final void F(long j9) {
        p111l0.b bVar = this.f8448i;
        if (bVar == null ? false : p111l0.b.d(bVar.m(), j9)) {
            return;
        }
        if (this.f8442c) {
            T.a.a("updateRootConstraints called while measuring");
        }
        this.f8448i = p111l0.b.a(j9);
        if (this.f8440a.M() != null) {
            this.f8440a.D0();
        }
        this.f8440a.E0();
        C0969k c0969k = this.f8441b;
        B b10 = this.f8440a;
        c0969k.c(b10, b10.M() != null);
    }

    public final void c(boolean z9) {
        if (z9) {
            this.f8444e.e(this.f8440a);
        }
        this.f8444e.a();
    }

    public final void h(B b10, boolean z9) {
        if (this.f8441b.g(z9)) {
            return;
        }
        if (!this.f8442c) {
            T.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (s(b10, z9)) {
            T.a.a("node not yet measured");
        }
        i(b10, z9);
    }

    public final boolean l() {
        return this.f8441b.h();
    }

    public final boolean m() {
        return this.f8444e.c();
    }

    public final long p() {
        if (!this.f8442c) {
            T.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f8446g;
    }

    public final boolean q(p219v8.a aVar) throws Throwable {
        L l9;
        Throwable th;
        boolean z9;
        B bE;
        if (!this.f8440a.t0()) {
            T.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f8440a.c()) {
            T.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f8442c) {
            T.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z10 = false;
        if (this.f8448i != null) {
            this.f8442c = true;
            this.f8443d = true;
            try {
                if (this.f8441b.h()) {
                    C0969k c0969k = this.f8441b;
                    z9 = false;
                    while (c0969k.h()) {
                        boolean zD = c0969k.f8598a.d();
                        boolean z11 = !zD;
                        if (zD) {
                            bE = c0969k.f8599b.e();
                        } else {
                            try {
                                bE = c0969k.f8598a.e();
                            } catch (Throwable th2) {
                                th = th2;
                                l9 = this;
                                l9.f8442c = false;
                                l9.f8443d = false;
                                throw th;
                            }
                        }
                        B b10 = bE;
                        l9 = this;
                        try {
                            boolean zW = w(l9, b10, z11, false, 4, null);
                            if (b10 == l9.f8440a && zW) {
                                z9 = true;
                            }
                            this = l9;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            l9.f8442c = false;
                            l9.f8443d = false;
                            throw th;
                        }
                    }
                    l9 = this;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    l9 = this;
                    z9 = false;
                }
                l9.f8442c = false;
                l9.f8443d = false;
                H h10 = l9.f8449j;
                if (h10 != null) {
                    h10.a();
                }
                z10 = z9;
            } catch (Throwable th4) {
                th = th4;
                l9 = this;
            }
        } else {
            l9 = this;
        }
        l9.b();
        return z10;
    }

    public final void r() {
        if (this.f8441b.h()) {
            if (!this.f8440a.t0()) {
                T.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f8440a.c()) {
                T.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f8442c) {
                T.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f8448i != null) {
                this.f8442c = true;
                this.f8443d = false;
                try {
                    if (!this.f8441b.g(true)) {
                        if (this.f8440a.M() != null) {
                            y(this.f8440a, true);
                        } else {
                            x(this.f8440a);
                        }
                    }
                    y(this.f8440a, false);
                    this.f8442c = false;
                    this.f8443d = false;
                    H h10 = this.f8449j;
                    if (h10 != null) {
                        h10.a();
                    }
                } catch (Throwable th) {
                    this.f8442c = false;
                    this.f8443d = false;
                    throw th;
                }
            }
        }
    }

    public final void t(B b10) {
        this.f8441b.i(b10);
        this.f8444e.f(b10);
    }

    public final boolean z(B b10, boolean z9) {
        int i10 = b.f8453a[b10.I().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new p079h8.m();
                    }
                }
            }
            if ((b10.K() || b10.J()) && !z9) {
                H h10 = this.f8449j;
                if (h10 != null) {
                    h10.a();
                }
                return false;
            }
            b10.C0();
            b10.B0();
            if (b10.u0()) {
                return false;
            }
            B bY = b10.Y();
            if (kotlin.jvm.internal.n.d(b10.w0(), Boolean.TRUE) && ((bY == null || !bY.K()) && (bY == null || !bY.J()))) {
                this.f8441b.c(b10, true);
            } else if (b10.c() && ((bY == null || !bY.H()) && (bY == null || !bY.P()))) {
                this.f8441b.c(b10, false);
            }
            return !this.f8443d;
        }
        H h11 = this.f8449j;
        if (h11 != null) {
            h11.a();
        }
        return false;
    }
}
