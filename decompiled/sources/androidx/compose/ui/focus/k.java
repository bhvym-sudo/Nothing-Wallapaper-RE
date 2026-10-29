package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.B;
import W.InterfaceC0965g;
import W.InterfaceC0966h;
import W.S;
import W.W;
import W.Y;
import W.Z;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.E;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class k extends C.c.AbstractC0022c implements InterfaceC0965g, InterfaceC0966h, Y, V.g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f11431D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f11432E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private G.m f11433F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f11434G;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11435a;

        static {
            int[] iArr = new int[G.m.values().length];
            try {
                iArr[G.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.m.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11435a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ E f11436r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ k f11437s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E e10, k kVar) {
            super(0);
            this.f11436r = e10;
            this.f11437s = kVar;
        }

        public final void a() {
            this.f11436r.f22779q = this.f11437s.m0();
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    private final void p0() {
        if (s0(this)) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        G.o oVarD = G.n.d(this);
        try {
            if (oVarD.f1932c) {
                oVarD.g();
            }
            oVarD.f();
            u0((r0(this) && q0(this)) ? G.m.ActiveParent : G.m.Inactive);
            A a10 = A.f21846a;
        } finally {
            oVarD.h();
        }
    }

    private static final boolean q0(k kVar) {
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            T.a.b("visitSubtreeIf called on an unattached node");
        }
        p190t.b bVar = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar, kVar.z());
        } else {
            bVar.b(abstractC0022cI);
        }
        while (bVar.s()) {
            C.c.AbstractC0022c abstractC0022c = (C.c.AbstractC0022c) bVar.w(bVar.p() - 1);
            if ((abstractC0022c.H() & iA) != 0) {
                for (C.c.AbstractC0022c abstractC0022cI2 = abstractC0022c; abstractC0022cI2 != null; abstractC0022cI2 = abstractC0022cI2.I()) {
                    if ((abstractC0022cI2.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cI2; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (abstractC0022cF instanceof k) {
                                k kVar2 = (k) abstractC0022cF;
                                if (s0(kVar2)) {
                                    int i10 = a.f11435a[kVar2.o0().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 == 4) {
                                        return false;
                                    }
                                    throw new p079h8.m();
                                }
                            } else {
                                abstractC0022cF.L();
                            }
                        }
                    }
                }
            }
            AbstractC0967i.c(bVar, abstractC0022c);
        }
        return false;
    }

    private static final boolean r0(k kVar) {
        S sV;
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cN = kVar.z().N();
        B bH = AbstractC0967i.h(kVar);
        while (bH != null) {
            if ((bH.V().k().H() & iA) != 0) {
                while (abstractC0022cN != null) {
                    if ((abstractC0022cN.L() & iA) != 0) {
                        for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cN; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                            if (abstractC0022cF instanceof k) {
                                k kVar2 = (k) abstractC0022cF;
                                if (s0(kVar2)) {
                                    int i10 = a.f11435a[kVar2.o0().ordinal()];
                                    if (i10 != 1 && i10 != 2) {
                                        if (i10 == 3) {
                                            return true;
                                        }
                                        if (i10 != 4) {
                                            throw new p079h8.m();
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                abstractC0022cF.L();
                            }
                        }
                    }
                    abstractC0022cN = abstractC0022cN.N();
                }
            }
            bH = bH.Y();
            abstractC0022cN = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
        }
        return false;
    }

    private static final boolean s0(k kVar) {
        return kVar.f11433F != null;
    }

    @Override // W.Y
    public void A() {
        G.m mVarO0 = o0();
        t0();
        if (mVarO0 != o0()) {
            G.c.c(this);
        }
    }

    @Override // C.c.AbstractC0022c
    public boolean O() {
        return this.f11434G;
    }

    @Override // C.c.AbstractC0022c
    public void U() {
        int i10 = a.f11435a[o0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            AbstractC0967i.i(this).getFocusOwner().e(true, true, false, androidx.compose.ui.focus.b.f11397b.c());
            G.n.c(this);
        } else if (i10 == 3) {
            G.o oVarD = G.n.d(this);
            try {
                if (oVarD.f1932c) {
                    oVarD.g();
                }
                oVarD.f();
                u0(G.m.Inactive);
                A a10 = A.f21846a;
                oVarD.h();
            } catch (Throwable th) {
                oVarD.h();
                throw th;
            }
        }
        this.f11433F = null;
    }

    public final void l0() {
        G.m mVarI = G.n.d(this).i(this);
        if (mVarI != null) {
            this.f11433F = mVarI;
        } else {
            T.a.c("committing a node that was not updated in the current transaction");
            throw new p079h8.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f m0() {
        S sV;
        g gVar = new g();
        int iA = W.a(RecyclerView.ItemAnimator.FLAG_MOVED);
        int iA2 = W.a(Optimizer.OPTIMIZATION_GROUPING);
        C.c.AbstractC0022c abstractC0022cZ = z();
        int i10 = iA | iA2;
        if (!z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cZ2 = z();
        B bH = AbstractC0967i.h(this);
        while (bH != null) {
            if ((bH.V().k().H() & i10) != 0) {
                while (abstractC0022cZ2 != null) {
                    if ((abstractC0022cZ2.L() & i10) != 0) {
                        if (abstractC0022cZ2 != abstractC0022cZ && (abstractC0022cZ2.L() & iA2) != 0) {
                            return gVar;
                        }
                        if ((abstractC0022cZ2.L() & iA) != 0) {
                            for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cZ2; abstractC0022cF != 0; abstractC0022cF = AbstractC0967i.f(null)) {
                                if (abstractC0022cF instanceof G.h) {
                                    ((G.h) abstractC0022cF).i(gVar);
                                } else {
                                    abstractC0022cF.L();
                                }
                            }
                        }
                    }
                    abstractC0022cZ2 = abstractC0022cZ2.N();
                }
            }
            bH = bH.Y();
            abstractC0022cZ2 = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
        }
        return gVar;
    }

    public final U.e n0() {
        androidx.appcompat.app.o.a(e(U.f.a()));
        return null;
    }

    public G.m o0() {
        G.m mVarI;
        G.o oVarB = G.n.b(this);
        if (oVarB != null && (mVarI = oVarB.i(this)) != null) {
            return mVarI;
        }
        G.m mVar = this.f11433F;
        return mVar == null ? G.m.Inactive : mVar;
    }

    public final void t0() {
        f fVar;
        if (this.f11433F == null) {
            p0();
        }
        int i10 = a.f11435a[o0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            E e10 = new E();
            Z.a(this, new b(e10, this));
            Object obj = e10.f22779q;
            if (obj == null) {
                kotlin.jvm.internal.n.r("focusProperties");
                fVar = null;
            } else {
                fVar = (f) obj;
            }
            if (fVar.i()) {
                return;
            }
            AbstractC0967i.i(this).getFocusOwner().p(true);
        }
    }

    public void u0(G.m mVar) {
        G.n.d(this).j(this, mVar);
    }
}
