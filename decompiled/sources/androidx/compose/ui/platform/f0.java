package androidx.compose.ui.platform;

import I.AbstractC0859c;
import I.AbstractC0864h;
import I.C0870n;
import I.InterfaceC0869m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements W.c0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final b f11883D = new b(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f11884E = 8;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final p219v8.p f11885F = a.f11899r;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final O f11887B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f11888C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AndroidComposeView f11889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p219v8.p f11890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p219v8.a f11891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11892t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f11894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private I.F f11896x;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C1044c0 f11893u = new C1044c0();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Z f11897y = new Z(f11885F);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final C0870n f11898z = new C0870n();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f11886A = I.P.f2686a.a();

    static final class a extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f11899r = new a();

        a() {
            super(2);
        }

        public final void a(O o9, Matrix matrix) {
            o9.I(matrix);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((O) obj, (Matrix) obj2);
            return p079h8.A.f21846a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.p f11900r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p219v8.p pVar) {
            super(1);
            this.f11900r = pVar;
        }

        public final void a(InterfaceC0869m interfaceC0869m) {
            this.f11900r.invoke(interfaceC0869m, null);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((InterfaceC0869m) obj);
            return p079h8.A.f21846a;
        }
    }

    public f0(AndroidComposeView androidComposeView, p219v8.p pVar, p219v8.a aVar) {
        this.f11889q = androidComposeView;
        this.f11890r = pVar;
        this.f11891s = aVar;
        C1046d0 c1046d0 = new C1046d0(androidComposeView);
        c1046d0.G(true);
        c1046d0.q(false);
        this.f11887B = c1046d0;
    }

    private final void k(InterfaceC0869m interfaceC0869m) {
        if (this.f11887B.E() || this.f11887B.B()) {
            this.f11893u.a(interfaceC0869m);
        }
    }

    private final void l(boolean z9) {
        if (z9 != this.f11892t) {
            this.f11892t = z9;
            this.f11889q.m0(this, z9);
        }
    }

    private final void m() {
        D0.f11702a.a(this.f11889q);
    }

    @Override // W.c0
    public void a() {
        if (this.f11887B.l()) {
            this.f11887B.g();
        }
        this.f11890r = null;
        this.f11891s = null;
        this.f11894v = true;
        l(false);
        this.f11889q.y0();
        this.f11889q.w0(this);
    }

    @Override // W.c0
    public void b(p219v8.p pVar, p219v8.a aVar) {
        l(false);
        this.f11894v = false;
        this.f11895w = false;
        this.f11886A = I.P.f2686a.a();
        this.f11890r = pVar;
        this.f11891s = aVar;
    }

    @Override // W.c0
    public boolean c(long j9) {
        float fK = H.g.k(j9);
        float fL = H.g.l(j9);
        if (this.f11887B.B()) {
            return 0.0f <= fK && fK < ((float) this.f11887B.getWidth()) && 0.0f <= fL && fL < ((float) this.f11887B.getHeight());
        }
        if (this.f11887B.E()) {
            return this.f11893u.f(j9);
        }
        return true;
    }

    @Override // W.c0
    public void d(InterfaceC0869m interfaceC0869m, L.c cVar) {
        Canvas canvasC = AbstractC0859c.c(interfaceC0869m);
        if (canvasC.isHardwareAccelerated()) {
            i();
            boolean z9 = this.f11887B.J() > 0.0f;
            this.f11895w = z9;
            if (z9) {
                interfaceC0869m.n();
            }
            this.f11887B.n(canvasC);
            if (this.f11895w) {
                interfaceC0869m.f();
                return;
            }
            return;
        }
        float fD = this.f11887B.d();
        float fC = this.f11887B.C();
        float fH = this.f11887B.h();
        float fM = this.f11887B.m();
        if (this.f11887B.b() < 1.0f) {
            I.F fA = this.f11896x;
            if (fA == null) {
                fA = AbstractC0864h.a();
                this.f11896x = fA;
            }
            fA.a(this.f11887B.b());
            canvasC.saveLayer(fD, fC, fH, fM, fA.z());
        } else {
            interfaceC0869m.e();
        }
        interfaceC0869m.l(fD, fC);
        interfaceC0869m.g(this.f11897y.b(this.f11887B));
        k(interfaceC0869m);
        p219v8.p pVar = this.f11890r;
        if (pVar != null) {
            pVar.invoke(interfaceC0869m, null);
        }
        interfaceC0869m.m();
        l(false);
    }

    @Override // W.c0
    public long e(long j9, boolean z9) {
        if (!z9) {
            return I.C.f(this.f11897y.b(this.f11887B), j9);
        }
        float[] fArrA = this.f11897y.a(this.f11887B);
        return fArrA != null ? I.C.f(fArrA, j9) : H.g.f2287b.a();
    }

    @Override // W.c0
    public void f(long j9) {
        int iE = p111l0.q.e(j9);
        int iD = p111l0.q.d(j9);
        this.f11887B.p(I.P.d(this.f11886A) * iE);
        this.f11887B.u(I.P.e(this.f11886A) * iD);
        O o9 = this.f11887B;
        if (o9.r(o9.d(), this.f11887B.C(), this.f11887B.d() + iE, this.f11887B.C() + iD)) {
            this.f11887B.z(this.f11893u.b());
            invalidate();
            this.f11897y.c();
        }
    }

    @Override // W.c0
    public void g(H.e eVar, boolean z9) {
        if (!z9) {
            I.C.g(this.f11897y.b(this.f11887B), eVar);
            return;
        }
        float[] fArrA = this.f11897y.a(this.f11887B);
        if (fArrA == null) {
            eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            I.C.g(fArrA, eVar);
        }
    }

    @Override // W.c0
    public void h(long j9) {
        int iD = this.f11887B.d();
        int iC = this.f11887B.C();
        int iD2 = p111l0.m.d(j9);
        int iE = p111l0.m.e(j9);
        if (iD == iD2 && iC == iE) {
            return;
        }
        if (iD != iD2) {
            this.f11887B.k(iD2 - iD);
        }
        if (iC != iE) {
            this.f11887B.x(iE - iC);
        }
        m();
        this.f11897y.c();
    }

    @Override // W.c0
    public void i() {
        if (this.f11892t || !this.f11887B.l()) {
            I.H hD = (!this.f11887B.E() || this.f11893u.e()) ? null : this.f11893u.d();
            p219v8.p pVar = this.f11890r;
            if (pVar != null) {
                this.f11887B.A(this.f11898z, hD, new c(pVar));
            }
            l(false);
        }
    }

    @Override // W.c0
    public void invalidate() {
        if (this.f11892t || this.f11894v) {
            return;
        }
        this.f11889q.invalidate();
        l(true);
    }

    @Override // W.c0
    public void j(I.M m9) {
        p219v8.a aVar;
        int i10 = m9.i() | this.f11888C;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f11886A = m9.G();
        }
        boolean z9 = false;
        boolean z10 = this.f11887B.E() && !this.f11893u.e();
        if ((i10 & 1) != 0) {
            this.f11887B.o(m9.d());
        }
        if ((i10 & 2) != 0) {
            this.f11887B.i(m9.u());
        }
        if ((i10 & 4) != 0) {
            this.f11887B.a(m9.a());
        }
        if ((i10 & 8) != 0) {
            this.f11887B.s(m9.q());
        }
        if ((i10 & 16) != 0) {
            this.f11887B.f(m9.n());
        }
        if ((i10 & 32) != 0) {
            this.f11887B.w(m9.v());
        }
        if ((i10 & 64) != 0) {
            this.f11887B.D(I.t.d(m9.c()));
        }
        if ((i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            this.f11887B.H(I.t.d(m9.z()));
        }
        if ((i10 & Optimizer.OPTIMIZATION_GROUPING) != 0) {
            this.f11887B.e(m9.m());
        }
        if ((i10 & 256) != 0) {
            this.f11887B.v(m9.r());
        }
        if ((i10 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0) {
            this.f11887B.c(m9.k());
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            this.f11887B.t(m9.p());
        }
        if (i11 != 0) {
            this.f11887B.p(I.P.d(this.f11886A) * this.f11887B.getWidth());
            this.f11887B.u(I.P.e(this.f11886A) * this.f11887B.getHeight());
        }
        boolean z11 = m9.e() && m9.y() != I.K.a();
        if ((i10 & 24576) != 0) {
            this.f11887B.F(z11);
            this.f11887B.q(m9.e() && m9.y() == I.K.a());
        }
        if ((131072 & i10) != 0) {
            O o9 = this.f11887B;
            m9.t();
            o9.j(null);
        }
        if ((32768 & i10) != 0) {
            this.f11887B.y(m9.f());
        }
        boolean zH = this.f11893u.h(m9.s(), m9.a(), z11, m9.v(), m9.b());
        if (this.f11893u.c()) {
            this.f11887B.z(this.f11893u.b());
        }
        if (z11 && !this.f11893u.e()) {
            z9 = true;
        }
        if (z10 != z9 || (z9 && zH)) {
            invalidate();
        } else {
            m();
        }
        if (!this.f11895w && this.f11887B.J() > 0.0f && (aVar = this.f11891s) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f11897y.c();
        }
        this.f11888C = m9.i();
    }
}
