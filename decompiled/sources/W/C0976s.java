package W;

import I.AbstractC0864h;
import I.InterfaceC0869m;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: W.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0976s extends U {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final a f8617l0 = new a(null);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final I.F f8618m0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final p0 f8619j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private K f8620k0;

    /* JADX INFO: renamed from: W.s$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: W.s$b */
    private final class b extends K {
        public b() {
            super(C0976s.this);
        }

        @Override // W.K
        protected void N0() {
            F.a aVarL = o0().L();
            kotlin.jvm.internal.n.e(aVarL);
            aVarL.x0();
        }

        @Override // W.J
        public int g0(U.a aVar) {
            Integer num = (Integer) G0().e().get(aVar);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            I0().put(aVar, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // U.o
        public U.t y(long j9) {
            e0(j9);
            p190t.b bVarF0 = o0().f0();
            int iP = bVarF0.p();
            if (iP > 0) {
                Object[] objArrO = bVarF0.o();
                int i10 = 0;
                do {
                    F.a aVarL = ((B) objArrO[i10]).L();
                    kotlin.jvm.internal.n.e(aVarL);
                    aVarL.C0(B.g.NotUsed);
                    i10++;
                } while (i10 < iP);
            }
            S0(o0().Q().a(this, o0().v(), j9));
            return this;
        }
    }

    static {
        I.F fA = AbstractC0864h.a();
        fA.F(I.r.f2740b.c());
        fA.G(1.0f);
        fA.E(I.G.f2645a.b());
        f8618m0 = fA;
    }

    public C0976s(B b10) {
        super(b10);
        this.f8619j0 = new p0();
        o1().g0(this);
        this.f8620k0 = b10.M() != null ? new b() : null;
    }

    private final void h2() {
        if (z0()) {
            return;
        }
        I1();
        o0().O().C0();
    }

    @Override // W.U
    public void K1(InterfaceC0869m interfaceC0869m, L.c cVar) {
        d0 d0VarB = E.b(o0());
        p190t.b bVarE0 = o0().e0();
        int iP = bVarE0.p();
        if (iP > 0) {
            Object[] objArrO = bVarE0.o();
            int i10 = 0;
            do {
                B b10 = (B) objArrO[i10];
                if (b10.c()) {
                    b10.r(interfaceC0869m, cVar);
                }
                i10++;
            } while (i10 < iP);
        }
        if (d0VarB.getShowLayoutBounds()) {
            X0(interfaceC0869m, f8618m0);
        }
    }

    @Override // W.U
    public void Z0() {
        if (j1() == null) {
            i2(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W.U, U.t
    public void b0(long j9, float f10, L.c cVar) {
        super.b0(j9, f10, cVar);
        h2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W.U, U.t
    public void c0(long j9, float f10, p219v8.l lVar) {
        super.c0(j9, f10, lVar);
        h2();
    }

    @Override // W.J
    public int g0(U.a aVar) {
        K kJ1 = j1();
        if (kJ1 != null) {
            return kJ1.g0(aVar);
        }
        Integer num = (Integer) e1().e().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // W.U
    /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
    public p0 o1() {
        return this.f8619j0;
    }

    protected void i2(K k9) {
        this.f8620k0 = k9;
    }

    @Override // W.U
    public K j1() {
        return this.f8620k0;
    }

    @Override // U.o
    public U.t y(long j9) {
        if (f1()) {
            K kJ1 = j1();
            kotlin.jvm.internal.n.e(kJ1);
            j9 = kJ1.J0();
        }
        e0(j9);
        p190t.b bVarF0 = o0().f0();
        int iP = bVarF0.p();
        if (iP > 0) {
            Object[] objArrO = bVarF0.o();
            int i10 = 0;
            do {
                ((B) objArrO[i10]).O().I0(B.g.NotUsed);
                i10++;
            } while (i10 < iP);
        }
        R1(o0().Q().a(this, o0().w(), j9));
        H1();
        return this;
    }

    @Override // W.U
    public void y1(U.f fVar, long j9, C0975q c0975q, boolean z9, boolean z10) {
        U.f fVar2;
        boolean z11 = false;
        if (fVar.d(o0())) {
            if (f2(j9)) {
                z11 = true;
            } else if (z9) {
                float fV0 = V0(j9, k1());
                if (!Float.isInfinite(fV0) && !Float.isNaN(fV0)) {
                    z10 = false;
                    z11 = true;
                }
            }
        }
        if (z11) {
            int i10 = c0975q.f8603s;
            p190t.b bVarE0 = o0().e0();
            int iP = bVarE0.p();
            if (iP > 0) {
                int i11 = iP - 1;
                Object[] objArrO = bVarE0.o();
                while (true) {
                    B b10 = (B) objArrO[i11];
                    if (b10.c()) {
                        fVar2 = fVar;
                        fVar2.b(b10, j9, c0975q, z9, z10);
                        if (c0975q.s()) {
                            if (!c0975q.q()) {
                                break;
                            } else {
                                c0975q.a();
                            }
                        }
                    } else {
                        fVar2 = fVar;
                    }
                    i11--;
                    if (i11 < 0) {
                        break;
                    } else {
                        fVar = fVar2;
                    }
                }
            }
            c0975q.f8603s = i10;
        }
    }
}
