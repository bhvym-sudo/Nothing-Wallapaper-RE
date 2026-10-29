package W;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends J implements U.o {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final U f8434F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Map f8436H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private U.q f8438J;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f8435G = p111l0.m.f22829a.a();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final U.m f8437I = new U.m(this);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Map f8439K = new LinkedHashMap();

    public K(U u9) {
        this.f8434F = u9;
    }

    private final void O0(long j9) {
        if (!p111l0.m.c(s0(), j9)) {
            R0(j9);
            F.a aVarH = o0().G().H();
            if (aVarH != null) {
                aVarH.u0();
            }
            u0(this.f8434F);
        }
        if (y0()) {
            return;
        }
        i0(p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(U.q qVar) {
        p079h8.A a10;
        Map map;
        if (qVar != null) {
            d0(p111l0.r.a(qVar.getWidth(), qVar.getHeight()));
            a10 = p079h8.A.f21846a;
        } else {
            a10 = null;
        }
        if (a10 == null) {
            d0(p111l0.q.f22837a.a());
        }
        if (!kotlin.jvm.internal.n.d(this.f8438J, qVar) && qVar != null && ((((map = this.f8436H) != null && !map.isEmpty()) || !qVar.a().isEmpty()) && !kotlin.jvm.internal.n.d(qVar.a(), this.f8436H))) {
            G0().a().m();
            Map linkedHashMap = this.f8436H;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f8436H = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(qVar.a());
        }
        this.f8438J = qVar;
    }

    @Override // p111l0.k
    public float A() {
        return this.f8434F.A();
    }

    @Override // W.J
    public void B0() {
        c0(s0(), 0.0f, null);
    }

    public InterfaceC0960b G0() {
        InterfaceC0960b interfaceC0960bC = this.f8434F.o0().G().C();
        kotlin.jvm.internal.n.e(interfaceC0960bC);
        return interfaceC0960bC;
    }

    public final int H0(U.a aVar) {
        Integer num = (Integer) this.f8439K.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    protected final Map I0() {
        return this.f8439K;
    }

    public final long J0() {
        return Y();
    }

    public final U K0() {
        return this.f8434F;
    }

    public final U.m L0() {
        return this.f8437I;
    }

    public Object M0() {
        return this.f8434F.l1();
    }

    protected void N0() {
        p0().b();
    }

    public final void P0(long j9) {
        O0(p111l0.m.g(j9, T()));
    }

    public final long Q0(K k9, boolean z9) {
        long jA = p111l0.m.f22829a.a();
        while (!kotlin.jvm.internal.n.d(this, k9)) {
            if (!this.x0() || !z9) {
                jA = p111l0.m.g(jA, this.s0());
            }
            U uQ1 = this.f8434F.q1();
            kotlin.jvm.internal.n.e(uQ1);
            this = uQ1.j1();
            kotlin.jvm.internal.n.e(this);
        }
        return jA;
    }

    public void R0(long j9) {
        this.f8435G = j9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U.t
    public final void c0(long j9, float f10, p219v8.l lVar) {
        O0(j9);
        if (z0()) {
            return;
        }
        N0();
    }

    @Override // p111l0.d
    public float getDensity() {
        return this.f8434F.getDensity();
    }

    @Override // U.h
    public p111l0.s getLayoutDirection() {
        return this.f8434F.getLayoutDirection();
    }

    @Override // W.J
    public J l0() {
        U uP1 = this.f8434F.p1();
        if (uP1 != null) {
            return uP1.j1();
        }
        return null;
    }

    @Override // W.J
    public U.i m0() {
        return this.f8437I;
    }

    @Override // W.J
    public boolean n0() {
        return this.f8438J != null;
    }

    @Override // W.J
    public B o0() {
        return this.f8434F.o0();
    }

    @Override // W.J
    public U.q p0() {
        U.q qVar = this.f8438J;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // W.J
    public J q0() {
        U uQ1 = this.f8434F.q1();
        if (uQ1 != null) {
            return uQ1.j1();
        }
        return null;
    }

    @Override // W.J
    public long s0() {
        return this.f8435G;
    }

    @Override // W.J
    public boolean w0() {
        return true;
    }
}
