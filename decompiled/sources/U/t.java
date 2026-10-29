package U;

import W.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f7769s = p111l0.r.a(0, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f7770t = u.f7774b;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f7771u = p111l0.m.f22829a.a();

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f7772a;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(t tVar) {
            if (tVar instanceof N) {
                ((N) tVar).M(this.f7772a);
            }
        }

        public static /* synthetic */ void h(a aVar, t tVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.g(tVar, i10, i11, f10);
        }

        public static /* synthetic */ void j(a aVar, t tVar, long j9, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.i(tVar, j9, f10);
        }

        public static /* synthetic */ void l(a aVar, t tVar, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.k(tVar, i10, i11, f10);
        }

        public static /* synthetic */ void n(a aVar, t tVar, int i10, int i11, float f10, p219v8.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = u.f7773a;
            }
            aVar.m(tVar, i10, i11, f11, lVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract p111l0.s d();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int e();

        public final void g(t tVar, int i10, int i11, float f10) {
            long jA = p111l0.n.a(i10, i11);
            f(tVar);
            tVar.c0(p111l0.m.g(jA, tVar.f7771u), f10, null);
        }

        public final void i(t tVar, long j9, float f10) {
            f(tVar);
            tVar.c0(p111l0.m.g(j9, tVar.f7771u), f10, null);
        }

        public final void k(t tVar, int i10, int i11, float f10) {
            long jA = p111l0.n.a(i10, i11);
            if (d() == p111l0.s.Ltr || e() == 0) {
                f(tVar);
                tVar.c0(p111l0.m.g(jA, tVar.f7771u), f10, null);
            } else {
                long jA2 = p111l0.n.a((e() - tVar.Z()) - p111l0.m.d(jA), p111l0.m.e(jA));
                f(tVar);
                tVar.c0(p111l0.m.g(jA2, tVar.f7771u), f10, null);
            }
        }

        public final void m(t tVar, int i10, int i11, float f10, p219v8.l lVar) {
            long jA = p111l0.n.a(i10, i11);
            if (d() == p111l0.s.Ltr || e() == 0) {
                f(tVar);
                tVar.c0(p111l0.m.g(jA, tVar.f7771u), f10, lVar);
            } else {
                long jA2 = p111l0.n.a((e() - tVar.Z()) - p111l0.m.d(jA), p111l0.m.e(jA));
                f(tVar);
                tVar.c0(p111l0.m.g(jA2, tVar.f7771u), f10, lVar);
            }
        }

        public final void o(t tVar, long j9, float f10, p219v8.l lVar) {
            f(tVar);
            tVar.c0(p111l0.m.g(j9, tVar.f7771u), f10, lVar);
        }

        public final void p(t tVar, long j9, L.c cVar, float f10) {
            f(tVar);
            tVar.b0(p111l0.m.g(j9, tVar.f7771u), f10, cVar);
        }
    }

    private final void a0() {
        this.f7767q = B8.h.m(p111l0.q.e(this.f7769s), p111l0.b.j(this.f7770t), p111l0.b.h(this.f7770t));
        this.f7768r = B8.h.m(p111l0.q.d(this.f7769s), p111l0.b.i(this.f7770t), p111l0.b.g(this.f7770t));
        this.f7771u = p111l0.n.a((this.f7767q - p111l0.q.e(this.f7769s)) / 2, (this.f7768r - p111l0.q.d(this.f7769s)) / 2);
    }

    protected final long T() {
        return this.f7771u;
    }

    public final int U() {
        return this.f7768r;
    }

    public int V() {
        return p111l0.q.d(this.f7769s);
    }

    protected final long W() {
        return this.f7769s;
    }

    public int X() {
        return p111l0.q.e(this.f7769s);
    }

    protected final long Y() {
        return this.f7770t;
    }

    public final int Z() {
        return this.f7767q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0(long j9, float f10, L.c cVar) {
        c0(j9, f10, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c0(long j9, float f10, p219v8.l lVar);

    protected final void d0(long j9) {
        if (p111l0.q.c(this.f7769s, j9)) {
            return;
        }
        this.f7769s = j9;
        a0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e0(long j9) {
        if (p111l0.b.d(this.f7770t, j9)) {
            return;
        }
        this.f7770t = j9;
        a0();
    }
}
