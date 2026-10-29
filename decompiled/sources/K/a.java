package K;

import H.m;
import I.AbstractC0864h;
import I.AbstractC0867k;
import I.AbstractC0874s;
import I.F;
import I.G;
import I.InterfaceC0869m;
import I.r;
import I.v;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p111l0.s;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0140a f3968q = new C0140a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d f3969r = new b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private F f3970s;

    /* JADX INFO: renamed from: K.a$a, reason: collision with other inner class name */
    public static final class C0140a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p111l0.d f3971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s f3972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC0869m f3973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f3974d;

        public /* synthetic */ C0140a(p111l0.d dVar, s sVar, InterfaceC0869m interfaceC0869m, long j9, AbstractC1457h abstractC1457h) {
            this(dVar, sVar, interfaceC0869m, j9);
        }

        public final InterfaceC0869m a() {
            return this.f3973c;
        }

        public final p111l0.d b() {
            return this.f3971a;
        }

        public final s c() {
            return this.f3972b;
        }

        public final long d() {
            return this.f3974d;
        }

        public final void e(InterfaceC0869m interfaceC0869m) {
            this.f3973c = interfaceC0869m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0140a)) {
                return false;
            }
            C0140a c0140a = (C0140a) obj;
            return n.d(this.f3971a, c0140a.f3971a) && this.f3972b == c0140a.f3972b && n.d(this.f3973c, c0140a.f3973c) && m.d(this.f3974d, c0140a.f3974d);
        }

        public final void f(p111l0.d dVar) {
            this.f3971a = dVar;
        }

        public final void g(s sVar) {
            this.f3972b = sVar;
        }

        public final void h(long j9) {
            this.f3974d = j9;
        }

        public int hashCode() {
            return (((((this.f3971a.hashCode() * 31) + this.f3972b.hashCode()) * 31) + this.f3973c.hashCode()) * 31) + m.g(this.f3974d);
        }

        public String toString() {
            return "DrawParams(density=" + this.f3971a + ", layoutDirection=" + this.f3972b + ", canvas=" + this.f3973c + ", size=" + ((Object) m.h(this.f3974d)) + ')';
        }

        private C0140a(p111l0.d dVar, s sVar, InterfaceC0869m interfaceC0869m, long j9) {
            this.f3971a = dVar;
            this.f3972b = sVar;
            this.f3973c = interfaceC0869m;
            this.f3974d = j9;
        }

        public /* synthetic */ C0140a(p111l0.d dVar, s sVar, InterfaceC0869m interfaceC0869m, long j9, int i10, AbstractC1457h abstractC1457h) {
            this((i10 & 1) != 0 ? e.a() : dVar, (i10 & 2) != 0 ? s.Ltr : sVar, (i10 & 4) != 0 ? new i() : interfaceC0869m, (i10 & 8) != 0 ? m.f2308a.b() : j9, null);
        }
    }

    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f3975a = K.b.b(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private L.c f3976b;

        b() {
        }

        @Override // K.d
        public long b() {
            return a.this.e().d();
        }

        @Override // K.d
        public h c() {
            return this.f3975a;
        }

        @Override // K.d
        public void d(L.c cVar) {
            this.f3976b = cVar;
        }

        @Override // K.d
        public void e(long j9) {
            a.this.e().h(j9);
        }

        @Override // K.d
        public L.c f() {
            return this.f3976b;
        }

        @Override // K.d
        public void g(p111l0.d dVar) {
            a.this.e().f(dVar);
        }

        @Override // K.d
        public p111l0.d getDensity() {
            return a.this.e().b();
        }

        @Override // K.d
        public s getLayoutDirection() {
            return a.this.e().c();
        }

        @Override // K.d
        public void h(s sVar) {
            a.this.e().g(sVar);
        }

        @Override // K.d
        public InterfaceC0869m i() {
            return a.this.e().a();
        }

        @Override // K.d
        public void j(InterfaceC0869m interfaceC0869m) {
            a.this.e().e(interfaceC0869m);
        }
    }

    private final F a(long j9, g gVar, float f10, AbstractC0874s abstractC0874s, int i10, int i11) {
        F fH = h(gVar);
        long jF = f(j9, f10);
        if (!r.l(fH.c(), jF)) {
            fH.F(jF);
        }
        if (fH.B() != null) {
            fH.A(null);
        }
        fH.h();
        if (!n.d(null, abstractC0874s)) {
            fH.x(abstractC0874s);
        }
        if (!AbstractC0867k.E(fH.w(), i10)) {
            fH.y(i10);
        }
        if (!v.d(fH.D(), i11)) {
            fH.C(i11);
        }
        return fH;
    }

    static /* synthetic */ F c(a aVar, long j9, g gVar, float f10, AbstractC0874s abstractC0874s, int i10, int i11, int i12, Object obj) {
        return aVar.a(j9, gVar, f10, abstractC0874s, i10, (i12 & 32) != 0 ? f.f3980g.b() : i11);
    }

    private final long f(long j9, float f10) {
        return f10 == 1.0f ? j9 : r.j(j9, r.m(j9) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final F g() {
        F f10 = this.f3970s;
        if (f10 != null) {
            return f10;
        }
        F fA = AbstractC0864h.a();
        fA.E(G.f2645a.a());
        this.f3970s = fA;
        return fA;
    }

    private final F h(g gVar) {
        if (n.d(gVar, j.f3984a)) {
            return g();
        }
        throw new p079h8.m();
    }

    @Override // p111l0.k
    public float A() {
        return this.f3968q.b().A();
    }

    @Override // K.f
    public d E() {
        return this.f3969r;
    }

    @Override // K.f
    public void O(long j9, long j10, long j11, float f10, g gVar, AbstractC0874s abstractC0874s, int i10) {
        this.f3968q.a().c(H.g.k(j10), H.g.l(j10), H.g.k(j10) + m.f(j11), H.g.l(j10) + m.e(j11), c(this, j9, gVar, f10, abstractC0874s, i10, 0, 32, null));
    }

    public final C0140a e() {
        return this.f3968q;
    }

    @Override // p111l0.d
    public float getDensity() {
        return this.f3968q.b().getDensity();
    }
}
