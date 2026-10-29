package U;

import W.C0981x;
import W.K;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h, r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0981x f7755q;

    public static final class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f7758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p219v8.l f7759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p219v8.l f7760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f7761f;

        a(int i10, int i11, Map map, p219v8.l lVar, p219v8.l lVar2, d dVar) {
            this.f7760e = lVar2;
            this.f7761f = dVar;
            this.f7756a = i10;
            this.f7757b = i11;
            this.f7758c = map;
            this.f7759d = lVar;
        }

        @Override // U.q
        public Map a() {
            return this.f7758c;
        }

        @Override // U.q
        public void b() {
            this.f7760e.f(this.f7761f.c().r0());
        }

        @Override // U.q
        public p219v8.l c() {
            return this.f7759d;
        }

        @Override // U.q
        public int getHeight() {
            return this.f7757b;
        }

        @Override // U.q
        public int getWidth() {
            return this.f7756a;
        }
    }

    public d(C0981x c0981x, c cVar) {
        this.f7755q = c0981x;
    }

    @Override // p111l0.k
    public float A() {
        return this.f7755q.A();
    }

    @Override // p111l0.d
    public float D(float f10) {
        return this.f7755q.D(f10);
    }

    @Override // p111l0.d
    public long J(long j9) {
        return this.f7755q.J(j9);
    }

    @Override // p111l0.d
    public float L(long j9) {
        return this.f7755q.L(j9);
    }

    public final c a() {
        return null;
    }

    public final C0981x c() {
        return this.f7755q;
    }

    public long e() {
        K kJ1 = this.f7755q.j1();
        kotlin.jvm.internal.n.e(kJ1);
        q qVarP0 = kJ1.p0();
        return p111l0.r.a(qVarP0.getWidth(), qVarP0.getHeight());
    }

    public final void f(c cVar) {
    }

    @Override // p111l0.d
    public float getDensity() {
        return this.f7755q.getDensity();
    }

    @Override // p111l0.k
    public float l(long j9) {
        return this.f7755q.l(j9);
    }

    @Override // U.r
    public q o(int i10, int i11, Map map, p219v8.l lVar, p219v8.l lVar2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            T.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, lVar, lVar2, this);
    }

    @Override // U.r
    public q w(int i10, int i11, Map map, p219v8.l lVar) {
        return this.f7755q.w(i10, i11, map, lVar);
    }
}
