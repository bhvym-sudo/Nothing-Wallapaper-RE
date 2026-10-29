package androidx.compose.ui.platform;

import I.AbstractC0859c;
import I.AbstractC0864h;
import I.AbstractC0866j;
import I.InterfaceC0869m;
import android.graphics.Canvas;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class U implements W.c0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f11792D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private I.E f11794F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private I.H f11795G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private I.F f11796H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f11797I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private L.c f11799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final I.y f11800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AndroidComposeView f11801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p219v8.p f11802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p219v8.a f11803u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11805w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float[] f11807y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11808z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f11804v = p111l0.r.a(SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float[] f11806x = I.C.c(null, 1, null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private p111l0.d f11789A = p111l0.f.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p111l0.s f11790B = p111l0.s.Ltr;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final K.a f11791C = new K.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f11793E = I.P.f2686a.a();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p219v8.l f11798J = new a();

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {
        a() {
            super(1);
        }

        public final void a(K.f fVar) {
            U u9 = U.this;
            InterfaceC0869m interfaceC0869mI = fVar.E().i();
            p219v8.p pVar = u9.f11802t;
            if (pVar != null) {
                pVar.invoke(interfaceC0869mI, fVar.E().f());
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((K.f) obj);
            return p079h8.A.f21846a;
        }
    }

    public U(L.c cVar, I.y yVar, AndroidComposeView androidComposeView, p219v8.p pVar, p219v8.a aVar) {
        this.f11799q = cVar;
        this.f11800r = yVar;
        this.f11801s = androidComposeView;
        this.f11802t = pVar;
        this.f11803u = aVar;
    }

    private final void l(InterfaceC0869m interfaceC0869m) {
        if (this.f11799q.k()) {
            I.E eN = this.f11799q.n();
            if (eN instanceof I.E.b) {
                InterfaceC0869m.h(interfaceC0869m, ((I.E.b) eN).b(), 0, 2, null);
                return;
            }
            if (!(eN instanceof I.E.c)) {
                if (eN instanceof I.E.a) {
                    InterfaceC0869m.d(interfaceC0869m, ((I.E.a) eN).b(), 0, 2, null);
                    return;
                }
                return;
            }
            I.H hA = this.f11795G;
            if (hA == null) {
                hA = AbstractC0866j.a();
                this.f11795G = hA;
            }
            hA.b();
            I.H.e(hA, ((I.E.c) eN).b(), null, 2, null);
            InterfaceC0869m.d(interfaceC0869m, hA, 0, 2, null);
        }
    }

    private final float[] m() {
        float[] fArrN = n();
        float[] fArrC = this.f11807y;
        if (fArrC == null) {
            fArrC = I.C.c(null, 1, null);
            this.f11807y = fArrC;
        }
        if (X.a(fArrN, fArrC)) {
            return fArrC;
        }
        return null;
    }

    private final float[] n() {
        q();
        return this.f11806x;
    }

    private final void o(boolean z9) {
        if (z9 != this.f11808z) {
            this.f11808z = z9;
            this.f11801s.m0(this, z9);
        }
    }

    private final void p() {
        D0.f11702a.a(this.f11801s);
    }

    private final void q() {
        L.c cVar = this.f11799q;
        long jB = H.h.d(cVar.o()) ? H.n.b(p111l0.r.c(this.f11804v)) : cVar.o();
        I.C.h(this.f11806x);
        float[] fArr = this.f11806x;
        float[] fArrC = I.C.c(null, 1, null);
        I.C.q(fArrC, -H.g.k(jB), -H.g.l(jB), 0.0f, 4, null);
        I.C.n(fArr, fArrC);
        float[] fArr2 = this.f11806x;
        float[] fArrC2 = I.C.c(null, 1, null);
        I.C.q(fArrC2, cVar.x(), cVar.y(), 0.0f, 4, null);
        I.C.i(fArrC2, cVar.p());
        I.C.j(fArrC2, cVar.q());
        I.C.k(fArrC2, cVar.r());
        I.C.m(fArrC2, cVar.s(), cVar.t(), 0.0f, 4, null);
        I.C.n(fArr2, fArrC2);
        float[] fArr3 = this.f11806x;
        float[] fArrC3 = I.C.c(null, 1, null);
        I.C.q(fArrC3, H.g.k(jB), H.g.l(jB), 0.0f, 4, null);
        I.C.n(fArr3, fArrC3);
    }

    private final void r() {
        I.E e10 = this.f11794F;
        if (e10 == null) {
            return;
        }
        L.d.b(this.f11799q, e10);
        boolean z9 = e10 instanceof I.E.a;
    }

    @Override // W.c0
    public void a() {
        this.f11802t = null;
        this.f11803u = null;
        this.f11805w = true;
        o(false);
        I.y yVar = this.f11800r;
        if (yVar != null) {
            yVar.a(this.f11799q);
            this.f11801s.w0(this);
        }
    }

    @Override // W.c0
    public void b(p219v8.p pVar, p219v8.a aVar) {
        I.y yVar = this.f11800r;
        if (yVar == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f11799q.z()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f11799q = yVar.b();
        this.f11805w = false;
        this.f11802t = pVar;
        this.f11803u = aVar;
        this.f11793E = I.P.f2686a.a();
        this.f11797I = false;
        this.f11804v = p111l0.r.a(SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        this.f11794F = null;
        this.f11792D = 0;
    }

    @Override // W.c0
    public boolean c(long j9) {
        float fK = H.g.k(j9);
        float fL = H.g.l(j9);
        if (this.f11799q.k()) {
            return k0.c(this.f11799q.n(), fK, fL, null, null, 24, null);
        }
        return true;
    }

    @Override // W.c0
    public void d(InterfaceC0869m interfaceC0869m, L.c cVar) {
        Canvas canvasC = AbstractC0859c.c(interfaceC0869m);
        if (canvasC.isHardwareAccelerated()) {
            i();
            this.f11797I = this.f11799q.u() > 0.0f;
            K.d dVarE = this.f11791C.E();
            dVarE.j(interfaceC0869m);
            dVarE.d(cVar);
            L.d.a(this.f11791C, this.f11799q);
            return;
        }
        float fD = p111l0.m.d(this.f11799q.w());
        float fE = p111l0.m.e(this.f11799q.w());
        float fE2 = fD + p111l0.q.e(this.f11804v);
        float fD2 = fE + p111l0.q.d(this.f11804v);
        if (this.f11799q.i() < 1.0f) {
            I.F fA = this.f11796H;
            if (fA == null) {
                fA = AbstractC0864h.a();
                this.f11796H = fA;
            }
            fA.a(this.f11799q.i());
            canvasC.saveLayer(fD, fE, fE2, fD2, fA.z());
        } else {
            interfaceC0869m.e();
        }
        interfaceC0869m.l(fD, fE);
        interfaceC0869m.g(n());
        if (this.f11799q.k()) {
            l(interfaceC0869m);
        }
        p219v8.p pVar = this.f11802t;
        if (pVar != null) {
            pVar.invoke(interfaceC0869m, null);
        }
        interfaceC0869m.m();
    }

    @Override // W.c0
    public long e(long j9, boolean z9) {
        if (!z9) {
            return I.C.f(n(), j9);
        }
        float[] fArrM = m();
        return fArrM != null ? I.C.f(fArrM, j9) : H.g.f2287b.a();
    }

    @Override // W.c0
    public void f(long j9) {
        if (p111l0.q.c(j9, this.f11804v)) {
            return;
        }
        this.f11804v = j9;
        invalidate();
    }

    @Override // W.c0
    public void g(H.e eVar, boolean z9) {
        if (!z9) {
            I.C.g(n(), eVar);
            return;
        }
        float[] fArrM = m();
        if (fArrM == null) {
            eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            I.C.g(fArrM, eVar);
        }
    }

    @Override // W.c0
    public void h(long j9) {
        this.f11799q.c0(j9);
        p();
    }

    @Override // W.c0
    public void i() {
        if (this.f11808z) {
            if (!I.P.c(this.f11793E, I.P.f2686a.a()) && !p111l0.q.c(this.f11799q.v(), this.f11804v)) {
                this.f11799q.P(H.h.a(I.P.d(this.f11793E) * p111l0.q.e(this.f11804v), I.P.e(this.f11793E) * p111l0.q.d(this.f11804v)));
            }
            this.f11799q.E(this.f11789A, this.f11790B, this.f11804v, this.f11798J);
            o(false);
        }
    }

    @Override // W.c0
    public void invalidate() {
        if (this.f11808z || this.f11805w) {
            return;
        }
        this.f11801s.invalidate();
        o(true);
    }

    @Override // W.c0
    public void j(I.M m9) {
        boolean z9;
        int iB;
        p219v8.a aVar;
        int i10 = m9.i() | this.f11792D;
        this.f11790B = m9.h();
        this.f11789A = m9.g();
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f11793E = m9.G();
        }
        if ((i10 & 1) != 0) {
            this.f11799q.X(m9.d());
        }
        if ((i10 & 2) != 0) {
            this.f11799q.Y(m9.u());
        }
        if ((i10 & 4) != 0) {
            this.f11799q.J(m9.a());
        }
        if ((i10 & 8) != 0) {
            this.f11799q.d0(m9.q());
        }
        if ((i10 & 16) != 0) {
            this.f11799q.e0(m9.n());
        }
        if ((i10 & 32) != 0) {
            this.f11799q.Z(m9.v());
            if (m9.v() > 0.0f && !this.f11797I && (aVar = this.f11803u) != null) {
                aVar.invoke();
            }
        }
        if ((i10 & 64) != 0) {
            this.f11799q.K(m9.c());
        }
        if ((i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            this.f11799q.b0(m9.z());
        }
        if ((i10 & Optimizer.OPTIMIZATION_GROUPING) != 0) {
            this.f11799q.V(m9.m());
        }
        if ((i10 & 256) != 0) {
            this.f11799q.T(m9.r());
        }
        if ((i10 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0) {
            this.f11799q.U(m9.k());
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            this.f11799q.L(m9.p());
        }
        if (i11 != 0) {
            if (I.P.c(this.f11793E, I.P.f2686a.a())) {
                this.f11799q.P(H.g.f2287b.b());
            } else {
                this.f11799q.P(H.h.a(I.P.d(this.f11793E) * p111l0.q.e(this.f11804v), I.P.e(this.f11793E) * p111l0.q.d(this.f11804v)));
            }
        }
        if ((i10 & 16384) != 0) {
            this.f11799q.M(m9.e());
        }
        if ((131072 & i10) != 0) {
            L.c cVar = this.f11799q;
            m9.t();
            cVar.S(null);
        }
        if ((32768 & i10) != 0) {
            L.c cVar2 = this.f11799q;
            int iF = m9.f();
            I.u.a aVar2 = I.u.f2755a;
            if (I.u.e(iF, aVar2.a())) {
                iB = L.b.f4204a.a();
            } else if (I.u.e(iF, aVar2.c())) {
                iB = L.b.f4204a.c();
            } else {
                if (!I.u.e(iF, aVar2.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = L.b.f4204a.b();
            }
            cVar2.N(iB);
        }
        if (kotlin.jvm.internal.n.d(this.f11794F, m9.s())) {
            z9 = false;
        } else {
            this.f11794F = m9.s();
            r();
            z9 = true;
        }
        this.f11792D = m9.i();
        if (i10 != 0 || z9) {
            p();
        }
    }
}
