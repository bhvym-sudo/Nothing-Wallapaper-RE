package W;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f8460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0976s f8461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U f8462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C.c.AbstractC0022c f8463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C.c.AbstractC0022c f8464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p190t.b f8465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p190t.b f8466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f8467h;

    private final class a implements InterfaceC0970l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C.c.AbstractC0022c f8468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p190t.b f8470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p190t.b f8471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8472e;

        public a(C.c.AbstractC0022c abstractC0022c, int i10, p190t.b bVar, p190t.b bVar2, boolean z9) {
            this.f8468a = abstractC0022c;
            this.f8469b = i10;
            this.f8470c = bVar;
            this.f8471d = bVar2;
            this.f8472e = z9;
        }

        @Override // W.InterfaceC0970l
        public void a(int i10, int i11) {
            C.c.AbstractC0022c abstractC0022cI = this.f8468a.I();
            kotlin.jvm.internal.n.e(abstractC0022cI);
            S.d(S.this);
            if ((W.a(2) & abstractC0022cI.L()) != 0) {
                U uJ = abstractC0022cI.J();
                kotlin.jvm.internal.n.e(uJ);
                U uQ1 = uJ.q1();
                U uP1 = uJ.p1();
                kotlin.jvm.internal.n.e(uP1);
                if (uQ1 != null) {
                    uQ1.T1(uP1);
                }
                uP1.U1(uQ1);
                S.this.v(this.f8468a, uP1);
            }
            this.f8468a = S.this.h(abstractC0022cI);
        }

        @Override // W.InterfaceC0970l
        public boolean b(int i10, int i11) {
            return T.d((C.c.b) this.f8470c.o()[this.f8469b + i10], (C.c.b) this.f8471d.o()[this.f8469b + i11]) != 0;
        }

        @Override // W.InterfaceC0970l
        public void c(int i10, int i11) {
            C.c.AbstractC0022c abstractC0022cI = this.f8468a.I();
            kotlin.jvm.internal.n.e(abstractC0022cI);
            this.f8468a = abstractC0022cI;
            p190t.b bVar = this.f8470c;
            C.c.b bVar2 = (C.c.b) bVar.o()[this.f8469b + i10];
            p190t.b bVar3 = this.f8471d;
            C.c.b bVar4 = (C.c.b) bVar3.o()[this.f8469b + i11];
            if (kotlin.jvm.internal.n.d(bVar2, bVar4)) {
                S.d(S.this);
            } else {
                S.this.F(bVar2, bVar4, this.f8468a);
                S.d(S.this);
            }
        }

        @Override // W.InterfaceC0970l
        public void d(int i10) {
            int i11 = this.f8469b + i10;
            this.f8468a = S.this.g((C.c.b) this.f8471d.o()[i11], this.f8468a);
            S.d(S.this);
            if (!this.f8472e) {
                this.f8468a.b0(true);
                return;
            }
            C.c.AbstractC0022c abstractC0022cI = this.f8468a.I();
            kotlin.jvm.internal.n.e(abstractC0022cI);
            U uJ = abstractC0022cI.J();
            kotlin.jvm.internal.n.e(uJ);
            InterfaceC0980w interfaceC0980wD = AbstractC0967i.d(this.f8468a);
            if (interfaceC0980wD != null) {
                C0981x c0981x = new C0981x(S.this.m(), interfaceC0980wD);
                this.f8468a.g0(c0981x);
                S.this.v(this.f8468a, c0981x);
                c0981x.U1(uJ.q1());
                c0981x.T1(uJ);
                uJ.U1(c0981x);
            } else {
                this.f8468a.g0(uJ);
            }
            this.f8468a.R();
            this.f8468a.X();
            X.a(this.f8468a);
        }

        public final void e(p190t.b bVar) {
            this.f8471d = bVar;
        }

        public final void f(p190t.b bVar) {
            this.f8470c = bVar;
        }

        public final void g(C.c.AbstractC0022c abstractC0022c) {
            this.f8468a = abstractC0022c;
        }

        public final void h(int i10) {
            this.f8469b = i10;
        }

        public final void i(boolean z9) {
            this.f8472e = z9;
        }
    }

    public interface b {
    }

    public S(B b10) {
        this.f8460a = b10;
        C0976s c0976s = new C0976s(b10);
        this.f8461b = c0976s;
        this.f8462c = c0976s;
        p0 p0VarG2 = c0976s.o1();
        this.f8463d = p0VarG2;
        this.f8464e = p0VarG2;
    }

    private final void A(int i10, p190t.b bVar, p190t.b bVar2, C.c.AbstractC0022c abstractC0022c, boolean z9) {
        P.e(bVar.p() - i10, bVar2.p() - i10, j(abstractC0022c, i10, bVar, bVar2, z9));
        B();
    }

    private final void B() {
        int iL = 0;
        for (C.c.AbstractC0022c abstractC0022cN = this.f8463d.N(); abstractC0022cN != null && abstractC0022cN != T.f8474a; abstractC0022cN = abstractC0022cN.N()) {
            iL |= abstractC0022cN.L();
            abstractC0022cN.Z(iL);
        }
    }

    private final C.c.AbstractC0022c D(C.c.AbstractC0022c abstractC0022c) {
        if (!(abstractC0022c == T.f8474a)) {
            T.a.b("trimChain called on already trimmed chain");
        }
        C.c.AbstractC0022c abstractC0022cI = T.f8474a.I();
        if (abstractC0022cI == null) {
            abstractC0022cI = this.f8463d;
        }
        abstractC0022cI.e0(null);
        T.f8474a.a0(null);
        T.f8474a.Z(-1);
        T.f8474a.g0(null);
        if (!(abstractC0022cI != T.f8474a)) {
            T.a.b("trimChain did not update the head");
        }
        return abstractC0022cI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(C.c.b bVar, C.c.b bVar2, C.c.AbstractC0022c abstractC0022c) {
        if ((bVar instanceof M) && (bVar2 instanceof M)) {
            T.f((M) bVar2, abstractC0022c);
            if (abstractC0022c.Q()) {
                X.e(abstractC0022c);
                return;
            } else {
                abstractC0022c.f0(true);
                return;
            }
        }
        if (!(abstractC0022c instanceof C0961c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((C0961c) abstractC0022c).k0(bVar2);
        if (abstractC0022c.Q()) {
            X.e(abstractC0022c);
        } else {
            abstractC0022c.f0(true);
        }
    }

    public static final /* synthetic */ b d(S s9) {
        s9.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C.c.AbstractC0022c g(C.c.b bVar, C.c.AbstractC0022c abstractC0022c) {
        C.c.AbstractC0022c c0961c;
        if (bVar instanceof M) {
            c0961c = ((M) bVar).d();
            c0961c.c0(X.h(c0961c));
        } else {
            c0961c = new C0961c(bVar);
        }
        if (c0961c.Q()) {
            T.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c0961c.b0(true);
        return r(c0961c, abstractC0022c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C.c.AbstractC0022c h(C.c.AbstractC0022c abstractC0022c) {
        if (abstractC0022c.Q()) {
            X.d(abstractC0022c);
            abstractC0022c.Y();
            abstractC0022c.S();
        }
        return w(abstractC0022c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.f8464e.H();
    }

    private final a j(C.c.AbstractC0022c abstractC0022c, int i10, p190t.b bVar, p190t.b bVar2, boolean z9) {
        a aVar = this.f8467h;
        if (aVar == null) {
            a aVar2 = new a(abstractC0022c, i10, bVar, bVar2, z9);
            this.f8467h = aVar2;
            return aVar2;
        }
        aVar.g(abstractC0022c);
        aVar.h(i10);
        aVar.f(bVar);
        aVar.e(bVar2);
        aVar.i(z9);
        return aVar;
    }

    private final C.c.AbstractC0022c r(C.c.AbstractC0022c abstractC0022c, C.c.AbstractC0022c abstractC0022c2) {
        C.c.AbstractC0022c abstractC0022cI = abstractC0022c2.I();
        if (abstractC0022cI != null) {
            abstractC0022cI.e0(abstractC0022c);
            abstractC0022c.a0(abstractC0022cI);
        }
        abstractC0022c2.a0(abstractC0022c);
        abstractC0022c.e0(abstractC0022c2);
        return abstractC0022c;
    }

    private final C.c.AbstractC0022c u() {
        if (!(this.f8464e != T.f8474a)) {
            T.a.b("padChain called on already padded chain");
        }
        C.c.AbstractC0022c abstractC0022c = this.f8464e;
        abstractC0022c.e0(T.f8474a);
        T.f8474a.a0(abstractC0022c);
        return T.f8474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(C.c.AbstractC0022c abstractC0022c, U u9) {
        for (C.c.AbstractC0022c abstractC0022cN = abstractC0022c.N(); abstractC0022cN != null; abstractC0022cN = abstractC0022cN.N()) {
            if (abstractC0022cN == T.f8474a) {
                B bY = this.f8460a.Y();
                u9.U1(bY != null ? bY.D() : null);
                this.f8462c = u9;
                return;
            } else {
                if ((W.a(2) & abstractC0022cN.L()) != 0) {
                    return;
                }
                abstractC0022cN.g0(u9);
            }
        }
    }

    private final C.c.AbstractC0022c w(C.c.AbstractC0022c abstractC0022c) {
        C.c.AbstractC0022c abstractC0022cI = abstractC0022c.I();
        C.c.AbstractC0022c abstractC0022cN = abstractC0022c.N();
        if (abstractC0022cI != null) {
            abstractC0022cI.e0(abstractC0022cN);
            abstractC0022c.a0(null);
        }
        if (abstractC0022cN != null) {
            abstractC0022cN.a0(abstractC0022cI);
            abstractC0022c.e0(null);
        }
        kotlin.jvm.internal.n.e(abstractC0022cN);
        return abstractC0022cN;
    }

    public final void C() {
        U c0981x;
        U u9 = this.f8461b;
        for (C.c.AbstractC0022c abstractC0022cN = this.f8463d.N(); abstractC0022cN != null; abstractC0022cN = abstractC0022cN.N()) {
            InterfaceC0980w interfaceC0980wD = AbstractC0967i.d(abstractC0022cN);
            if (interfaceC0980wD != null) {
                if (abstractC0022cN.J() != null) {
                    U uJ = abstractC0022cN.J();
                    kotlin.jvm.internal.n.f(uJ, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    c0981x = (C0981x) uJ;
                    InterfaceC0980w interfaceC0980wH2 = c0981x.h2();
                    c0981x.k2(interfaceC0980wD);
                    if (interfaceC0980wH2 != abstractC0022cN) {
                        c0981x.E1();
                    }
                } else {
                    c0981x = new C0981x(this.f8460a, interfaceC0980wD);
                    abstractC0022cN.g0(c0981x);
                }
                u9.U1(c0981x);
                c0981x.T1(u9);
                u9 = c0981x;
            } else {
                abstractC0022cN.g0(u9);
            }
        }
        B bY = this.f8460a.Y();
        u9.U1(bY != null ? bY.D() : null);
        this.f8462c = u9;
    }

    public final void E(C.c cVar) {
        S s9;
        C.c.AbstractC0022c abstractC0022cU = u();
        p190t.b bVar = this.f8465f;
        int i10 = 0;
        int iP = bVar != null ? bVar.p() : 0;
        p190t.b bVar2 = this.f8466g;
        if (bVar2 == null) {
            bVar2 = new p190t.b(new C.c.b[16], 0);
        }
        p190t.b bVarE = T.e(cVar, bVar2);
        p190t.b bVar3 = null;
        if (bVarE.p() == iP) {
            C.c.AbstractC0022c abstractC0022cI = abstractC0022cU.I();
            int i11 = 0;
            while (abstractC0022cI != null && i11 < iP) {
                if (bVar == null) {
                    T.a.c("expected prior modifier list to be non-empty");
                    throw new p079h8.f();
                }
                C.c.b bVar4 = (C.c.b) bVar.o()[i11];
                C.c.b bVar5 = (C.c.b) bVarE.o()[i11];
                int iD = T.d(bVar4, bVar5);
                if (iD == 0) {
                    abstractC0022cI = abstractC0022cI.N();
                    break;
                }
                if (iD == 1) {
                    F(bVar4, bVar5, abstractC0022cI);
                }
                abstractC0022cI = abstractC0022cI.I();
                i11++;
            }
            C.c.AbstractC0022c abstractC0022c = abstractC0022cI;
            if (i11 >= iP) {
                s9 = this;
            } else {
                if (bVar == null) {
                    T.a.c("expected prior modifier list to be non-empty");
                    throw new p079h8.f();
                }
                if (abstractC0022c == null) {
                    T.a.c("structuralUpdate requires a non-null tail");
                    throw new p079h8.f();
                }
                s9 = this;
                s9.A(i11, bVar, bVarE, abstractC0022c, !this.f8460a.t());
                i10 = 1;
            }
        } else {
            s9 = this;
            if (s9.f8460a.t() && iP == 0) {
                C.c.AbstractC0022c abstractC0022cG = abstractC0022cU;
                while (i10 < bVarE.p()) {
                    abstractC0022cG = s9.g((C.c.b) bVarE.o()[i10], abstractC0022cG);
                    i10++;
                }
                s9.B();
            } else if (bVarE.p() != 0) {
                if (bVar == null) {
                    bVar = new p190t.b(new C.c.b[16], 0);
                }
                p190t.b bVar6 = bVar;
                s9.A(0, bVar6, bVarE, abstractC0022cU, !s9.f8460a.t());
                s9 = s9;
                bVar = bVar6;
            } else {
                if (bVar == null) {
                    T.a.c("expected prior modifier list to be non-empty");
                    throw new p079h8.f();
                }
                C.c.AbstractC0022c abstractC0022cI2 = abstractC0022cU.I();
                for (int i12 = 0; abstractC0022cI2 != null && i12 < bVar.p(); i12++) {
                    abstractC0022cI2 = s9.h(abstractC0022cI2).I();
                }
                C0976s c0976s = s9.f8461b;
                B bY = s9.f8460a.Y();
                c0976s.U1(bY != null ? bY.D() : null);
                s9.f8462c = s9.f8461b;
            }
            i10 = 1;
        }
        s9.f8465f = bVarE;
        if (bVar != null) {
            bVar.j();
            bVar3 = bVar;
        }
        s9.f8466g = bVar3;
        s9.f8464e = s9.D(abstractC0022cU);
        if (i10 != 0) {
            s9.C();
        }
    }

    public final C.c.AbstractC0022c k() {
        return this.f8464e;
    }

    public final C0976s l() {
        return this.f8461b;
    }

    public final B m() {
        return this.f8460a;
    }

    public final U n() {
        return this.f8462c;
    }

    public final C.c.AbstractC0022c o() {
        return this.f8463d;
    }

    public final boolean p(int i10) {
        return (i() & i10) != 0;
    }

    public final boolean q(int i10) {
        return (i() & i10) != 0;
    }

    public final void s() {
        for (C.c.AbstractC0022c abstractC0022cK = k(); abstractC0022cK != null; abstractC0022cK = abstractC0022cK.I()) {
            abstractC0022cK.R();
        }
    }

    public final void t() {
        for (C.c.AbstractC0022c abstractC0022cO = o(); abstractC0022cO != null; abstractC0022cO = abstractC0022cO.N()) {
            if (abstractC0022cO.Q()) {
                abstractC0022cO.S();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f8464e == this.f8463d) {
            sb.append("]");
        } else {
            for (C.c.AbstractC0022c abstractC0022cK = k(); abstractC0022cK != null && abstractC0022cK != o(); abstractC0022cK = abstractC0022cK.I()) {
                sb.append(String.valueOf(abstractC0022cK));
                if (abstractC0022cK.I() == this.f8463d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void x() {
        for (C.c.AbstractC0022c abstractC0022cO = o(); abstractC0022cO != null; abstractC0022cO = abstractC0022cO.N()) {
            if (abstractC0022cO.Q()) {
                abstractC0022cO.W();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (C.c.AbstractC0022c abstractC0022cK = k(); abstractC0022cK != null; abstractC0022cK = abstractC0022cK.I()) {
            abstractC0022cK.X();
            if (abstractC0022cK.K()) {
                X.a(abstractC0022cK);
            }
            if (abstractC0022cK.P()) {
                X.e(abstractC0022cK);
            }
            abstractC0022cK.b0(false);
            abstractC0022cK.f0(false);
        }
    }

    public final void z() {
        for (C.c.AbstractC0022c abstractC0022cO = o(); abstractC0022cO != null; abstractC0022cO = abstractC0022cO.N()) {
            if (abstractC0022cO.Q()) {
                abstractC0022cO.Y();
            }
        }
    }
}
