package U;

import W.K;
import W.U;

/* JADX INFO: loaded from: classes.dex */
public final class m implements i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final K f7765q;

    public m(K k9) {
        this.f7765q = k9;
    }

    private final long b() {
        K kA = n.a(this.f7765q);
        i iVarM0 = kA.m0();
        H.g.a aVar = H.g.f2287b;
        return H.g.o(C(iVarM0, aVar.c()), a().C(kA.K0(), aVar.c()));
    }

    @Override // U.i
    public i B() {
        K kJ1;
        if (!t()) {
            T.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        U uQ1 = a().o0().W().q1();
        if (uQ1 == null || (kJ1 = uQ1.j1()) == null) {
            return null;
        }
        return kJ1.m0();
    }

    @Override // U.i
    public long C(i iVar, long j9) {
        return I(iVar, j9, true);
    }

    @Override // U.i
    public H.i F(i iVar, boolean z9) {
        return a().F(iVar, z9);
    }

    @Override // U.i
    public long I(i iVar, long j9, boolean z9) {
        if (!(iVar instanceof m)) {
            K kA = n.a(this.f7765q);
            return H.g.p(I(kA.L0(), j9, z9), kA.K0().m0().I(iVar, H.g.f2287b.c(), z9));
        }
        K k9 = ((m) iVar).f7765q;
        k9.K0().D1();
        K kJ1 = a().a1(k9.K0()).j1();
        if (kJ1 != null) {
            long jF = p111l0.m.f(p111l0.m.g(k9.Q0(kJ1, !z9), p111l0.n.d(j9)), this.f7765q.Q0(kJ1, !z9));
            return H.h.a(p111l0.m.d(jF), p111l0.m.e(jF));
        }
        K kA2 = n.a(k9);
        long jG = p111l0.m.g(p111l0.m.g(k9.Q0(kA2, !z9), kA2.s0()), p111l0.n.d(j9));
        K kA3 = n.a(this.f7765q);
        long jF2 = p111l0.m.f(jG, p111l0.m.g(this.f7765q.Q0(kA3, !z9), kA3.s0()));
        long jA = H.h.a(p111l0.m.d(jF2), p111l0.m.e(jF2));
        U uQ1 = kA3.K0().q1();
        kotlin.jvm.internal.n.e(uQ1);
        U uQ2 = kA2.K0().q1();
        kotlin.jvm.internal.n.e(uQ2);
        return uQ1.I(uQ2, jA, z9);
    }

    @Override // U.i
    public long N(long j9) {
        return a().N(H.g.p(j9, b()));
    }

    public final U a() {
        return this.f7765q.K0();
    }

    @Override // U.i
    public long f(long j9) {
        return a().f(H.g.p(j9, b()));
    }

    @Override // U.i
    public boolean t() {
        return a().t();
    }

    @Override // U.i
    public long v() {
        K k9 = this.f7765q;
        return p111l0.r.a(k9.Z(), k9.U());
    }
}
