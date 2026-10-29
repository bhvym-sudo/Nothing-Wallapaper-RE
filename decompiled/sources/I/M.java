package I;

import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class M implements z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f2660A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f2661B;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f2665F;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private E f2670K;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2671q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f2675u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f2676v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f2677w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f2680z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2672r = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2673s = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f2674t = 1.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f2678x = A.a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f2679y = A.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f2662C = 8.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f2663D = P.f2686a.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private O f2664E = K.a();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f2666G = u.f2755a.a();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f2667H = H.m.f2308a.a();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p111l0.d f2668I = p111l0.f.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p111l0.s f2669J = p111l0.s.Ltr;

    @Override // p111l0.k
    public float A() {
        return this.f2668I.A();
    }

    public final void B() {
        U(1.0f);
        V(1.0f);
        C(1.0f);
        b0(0.0f);
        c0(0.0f);
        W(0.0f);
        F(A.a());
        Z(A.a());
        R(0.0f);
        S(0.0f);
        T(0.0f);
        H(8.0f);
        a0(P.f2686a.a());
        X(K.a());
        I(false);
        Q(null);
        M(u.f2755a.a());
        Y(H.m.f2308a.a());
        this.f2670K = null;
        this.f2671q = 0;
    }

    public void C(float f10) {
        if (this.f2674t == f10) {
            return;
        }
        this.f2671q |= 4;
        this.f2674t = f10;
    }

    public void F(long j9) {
        if (r.l(this.f2678x, j9)) {
            return;
        }
        this.f2671q |= 64;
        this.f2678x = j9;
    }

    @Override // I.z
    public long G() {
        return this.f2663D;
    }

    public void H(float f10) {
        if (this.f2662C == f10) {
            return;
        }
        this.f2671q |= RecyclerView.ItemAnimator.FLAG_MOVED;
        this.f2662C = f10;
    }

    public void I(boolean z9) {
        if (this.f2665F != z9) {
            this.f2671q |= 16384;
            this.f2665F = z9;
        }
    }

    public void M(int i10) {
        if (u.e(this.f2666G, i10)) {
            return;
        }
        this.f2671q |= 32768;
        this.f2666G = i10;
    }

    public final void N(p111l0.d dVar) {
        this.f2668I = dVar;
    }

    public final void P(p111l0.s sVar) {
        this.f2669J = sVar;
    }

    public void Q(L l9) {
        if (kotlin.jvm.internal.n.d(null, l9)) {
            return;
        }
        this.f2671q |= 131072;
    }

    public void R(float f10) {
        if (this.f2680z == f10) {
            return;
        }
        this.f2671q |= 256;
        this.f2680z = f10;
    }

    public void S(float f10) {
        if (this.f2660A == f10) {
            return;
        }
        this.f2671q |= Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING;
        this.f2660A = f10;
    }

    public void T(float f10) {
        if (this.f2661B == f10) {
            return;
        }
        this.f2671q |= Optimizer.OPTIMIZATION_GROUPING;
        this.f2661B = f10;
    }

    public void U(float f10) {
        if (this.f2672r == f10) {
            return;
        }
        this.f2671q |= 1;
        this.f2672r = f10;
    }

    public void V(float f10) {
        if (this.f2673s == f10) {
            return;
        }
        this.f2671q |= 2;
        this.f2673s = f10;
    }

    public void W(float f10) {
        if (this.f2677w == f10) {
            return;
        }
        this.f2671q |= 32;
        this.f2677w = f10;
    }

    public void X(O o9) {
        if (kotlin.jvm.internal.n.d(this.f2664E, o9)) {
            return;
        }
        this.f2671q |= 8192;
        this.f2664E = o9;
    }

    public void Y(long j9) {
        this.f2667H = j9;
    }

    public void Z(long j9) {
        if (r.l(this.f2679y, j9)) {
            return;
        }
        this.f2671q |= Optimizer.OPTIMIZATION_GRAPH_WRAP;
        this.f2679y = j9;
    }

    public float a() {
        return this.f2674t;
    }

    public void a0(long j9) {
        if (P.c(this.f2663D, j9)) {
            return;
        }
        this.f2671q |= 4096;
        this.f2663D = j9;
    }

    public long b() {
        return this.f2667H;
    }

    public void b0(float f10) {
        if (this.f2675u == f10) {
            return;
        }
        this.f2671q |= 8;
        this.f2675u = f10;
    }

    public long c() {
        return this.f2678x;
    }

    public void c0(float f10) {
        if (this.f2676v == f10) {
            return;
        }
        this.f2671q |= 16;
        this.f2676v = f10;
    }

    @Override // I.z
    public float d() {
        return this.f2672r;
    }

    public final void d0() {
        this.f2670K = y().a(b(), this.f2669J, this.f2668I);
    }

    public boolean e() {
        return this.f2665F;
    }

    public int f() {
        return this.f2666G;
    }

    public final p111l0.d g() {
        return this.f2668I;
    }

    @Override // p111l0.d
    public float getDensity() {
        return this.f2668I.getDensity();
    }

    public final p111l0.s h() {
        return this.f2669J;
    }

    public final int i() {
        return this.f2671q;
    }

    @Override // I.z
    public float k() {
        return this.f2660A;
    }

    @Override // I.z
    public float m() {
        return this.f2661B;
    }

    @Override // I.z
    public float n() {
        return this.f2676v;
    }

    @Override // I.z
    public float p() {
        return this.f2662C;
    }

    @Override // I.z
    public float q() {
        return this.f2675u;
    }

    @Override // I.z
    public float r() {
        return this.f2680z;
    }

    public final E s() {
        return this.f2670K;
    }

    public L t() {
        return null;
    }

    @Override // I.z
    public float u() {
        return this.f2673s;
    }

    public float v() {
        return this.f2677w;
    }

    public O y() {
        return this.f2664E;
    }

    public long z() {
        return this.f2679y;
    }
}
