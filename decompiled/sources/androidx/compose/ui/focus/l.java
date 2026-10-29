package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.B;
import W.S;
import W.W;
import W.Z;
import androidx.constraintlayout.core.widgets.Optimizer;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11439b;

        static {
            int[] iArr = new int[G.a.values().length];
            try {
                iArr[G.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.a.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.a.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.a.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11438a = iArr;
            int[] iArr2 = new int[G.m.values().length];
            try {
                iArr2[G.m.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[G.m.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[G.m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[G.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f11439b = iArr2;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ k f11440r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(0);
            this.f11440r = kVar;
        }

        public final void a() {
            this.f11440r.m0();
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ k f11441r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(0);
            this.f11441r = kVar;
        }

        public final void a() {
            if (this.f11441r.z().Q()) {
                G.c.c(this.f11441r);
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    private static final boolean a(k kVar, boolean z9, boolean z10) {
        k kVarF = m.f(kVar);
        if (kVarF != null) {
            return c(kVarF, z9, z10);
        }
        return true;
    }

    static /* synthetic */ boolean b(k kVar, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(kVar, z9, z10);
    }

    public static final boolean c(k kVar, boolean z9, boolean z10) {
        int i10 = a.f11439b[kVar.o0().ordinal()];
        if (i10 == 1) {
            kVar.u0(G.m.Inactive);
            if (z10) {
                G.c.c(kVar);
            }
            return true;
        }
        if (i10 == 2) {
            if (z9) {
                kVar.u0(G.m.Inactive);
                if (z10) {
                    G.c.c(kVar);
                }
            }
            return z9;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new p079h8.m();
        }
        if (!a(kVar, z9, z10)) {
            return false;
        }
        kVar.u0(G.m.Inactive);
        if (z10) {
            G.c.c(kVar);
        }
        return true;
    }

    private static final boolean d(k kVar) {
        Z.a(kVar, new b(kVar));
        int i10 = a.f11439b[kVar.o0().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        kVar.u0(G.m.Active);
        return true;
    }

    public static final G.a e(k kVar, int i10) {
        int i11 = a.f11439b[kVar.o0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return G.a.Cancelled;
            }
            if (i11 == 3) {
                G.a aVarE = e(n(kVar), i10);
                if (aVarE == G.a.None) {
                    aVarE = null;
                }
                return aVarE == null ? g(kVar, i10) : aVarE;
            }
            if (i11 != 4) {
                throw new p079h8.m();
            }
        }
        return G.a.None;
    }

    private static final G.a f(k kVar, int i10) {
        if (!kVar.f11432E) {
            kVar.f11432E = true;
            try {
                j jVar = (j) kVar.m0().p().f(androidx.compose.ui.focus.b.i(i10));
                j.a aVar = j.f11426b;
                if (jVar != aVar.b()) {
                    if (jVar == aVar.a()) {
                        return G.a.Cancelled;
                    }
                    return jVar.d() ? G.a.Redirected : G.a.RedirectCancelled;
                }
            } finally {
                kVar.f11432E = false;
            }
        }
        return G.a.None;
    }

    private static final G.a g(k kVar, int i10) {
        if (!kVar.f11431D) {
            kVar.f11431D = true;
            try {
                j jVar = (j) kVar.m0().l().f(androidx.compose.ui.focus.b.i(i10));
                j.a aVar = j.f11426b;
                if (jVar != aVar.b()) {
                    if (jVar == aVar.a()) {
                        return G.a.Cancelled;
                    }
                    return jVar.d() ? G.a.Redirected : G.a.RedirectCancelled;
                }
            } finally {
                kVar.f11431D = false;
            }
        }
        return G.a.None;
    }

    public static final G.a h(k kVar, int i10) {
        C.c.AbstractC0022c abstractC0022cF;
        S sV;
        int i11 = a.f11439b[kVar.o0().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return G.a.None;
        }
        if (i11 == 3) {
            return e(n(kVar), i10);
        }
        if (i11 != 4) {
            throw new p079h8.m();
        }
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cN = kVar.z().N();
        B bH = AbstractC0967i.h(kVar);
        loop0: while (true) {
            if (bH == null) {
                abstractC0022cF = null;
                break;
            }
            if ((bH.V().k().H() & iA) != 0) {
                while (abstractC0022cN != null) {
                    if ((abstractC0022cN.L() & iA) != 0) {
                        abstractC0022cF = abstractC0022cN;
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                break loop0;
                            }
                            abstractC0022cF.L();
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                    }
                    abstractC0022cN = abstractC0022cN.N();
                }
            }
            bH = bH.Y();
            abstractC0022cN = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
        }
        k kVar2 = (k) abstractC0022cF;
        if (kVar2 == null) {
            return G.a.None;
        }
        int i12 = a.f11439b[kVar2.o0().ordinal()];
        if (i12 == 1) {
            return f(kVar2, i10);
        }
        if (i12 == 2) {
            return G.a.Cancelled;
        }
        if (i12 == 3) {
            return h(kVar2, i10);
        }
        if (i12 != 4) {
            throw new p079h8.m();
        }
        G.a aVarH = h(kVar2, i10);
        G.a aVar = aVarH != G.a.None ? aVarH : null;
        return aVar == null ? f(kVar2, i10) : aVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    public static final boolean i(k kVar) {
        S sV;
        int i10 = a.f11439b[kVar.o0().ordinal()];
        boolean zL = true;
        if (i10 != 1 && i10 != 2) {
            C.c.AbstractC0022c abstractC0022c = null;
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new p079h8.m();
                }
                int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
                if (!kVar.z().Q()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                C.c.AbstractC0022c abstractC0022cN = kVar.z().N();
                B bH = AbstractC0967i.h(kVar);
                loop0: while (bH != null) {
                    if ((bH.V().k().H() & iA) != 0) {
                        while (abstractC0022cN != null) {
                            if ((abstractC0022cN.L() & iA) != 0) {
                                for (C.c.AbstractC0022c abstractC0022cF = abstractC0022cN; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                                    if (abstractC0022cF instanceof k) {
                                        abstractC0022c = abstractC0022cF;
                                        break loop0;
                                    }
                                    abstractC0022cF.L();
                                }
                            }
                            abstractC0022cN = abstractC0022cN.N();
                        }
                    }
                    bH = bH.Y();
                    abstractC0022cN = (bH == null || (sV = bH.V()) == null) ? null : sV.o();
                }
                k kVar2 = (k) abstractC0022c;
                if (kVar2 != null) {
                    G.m mVarO0 = kVar2.o0();
                    zL = l(kVar2, kVar);
                    if (zL && mVarO0 != kVar2.o0()) {
                        G.c.c(kVar2);
                    }
                } else if (!m(kVar) || !d(kVar)) {
                    zL = false;
                }
            } else if (!b(kVar, false, false, 3, null) || !d(kVar)) {
                zL = false;
            }
        }
        if (zL) {
            G.c.c(kVar);
        }
        return zL;
    }

    public static final boolean j(k kVar) {
        Boolean boolK = k(kVar, androidx.compose.ui.focus.b.f11397b.b());
        if (boolK != null) {
            return boolK.booleanValue();
        }
        return false;
    }

    public static final Boolean k(k kVar, int i10) {
        Boolean boolValueOf;
        G.o oVarD = G.n.d(kVar);
        c cVar = new c(kVar);
        try {
            if (oVarD.f1932c) {
                oVarD.g();
            }
            oVarD.f();
            oVarD.f1931b.b(cVar);
            int i11 = a.f11438a[h(kVar, i10).ordinal()];
            if (i11 == 1) {
                boolValueOf = Boolean.valueOf(i(kVar));
            } else if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    throw new p079h8.m();
                }
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.TRUE;
            }
            oVarD.h();
            return boolValueOf;
        } catch (Throwable th) {
            oVarD.h();
            throw th;
        }
    }

    private static final boolean l(k kVar, k kVar2) {
        C.c.AbstractC0022c abstractC0022c;
        C.c.AbstractC0022c abstractC0022cF;
        S sV;
        S sV2;
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar2.z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cN = kVar2.z().N();
        B bH = AbstractC0967i.h(kVar2);
        loop0: while (true) {
            abstractC0022c = null;
            if (bH == null) {
                abstractC0022cF = null;
                break;
            }
            if ((bH.V().k().H() & iA) != 0) {
                while (abstractC0022cN != null) {
                    if ((abstractC0022cN.L() & iA) != 0) {
                        abstractC0022cF = abstractC0022cN;
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                break loop0;
                            }
                            abstractC0022cF.L();
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                    }
                    abstractC0022cN = abstractC0022cN.N();
                }
            }
            bH = bH.Y();
            abstractC0022cN = (bH == null || (sV2 = bH.V()) == null) ? null : sV2.o();
        }
        if (!kotlin.jvm.internal.n.d(abstractC0022cF, kVar)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i10 = a.f11439b[kVar.o0().ordinal()];
        if (i10 == 1) {
            boolean zD = d(kVar2);
            if (zD) {
                kVar.u0(G.m.ActiveParent);
            }
            return zD;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new p079h8.m();
                }
                int iA2 = W.a(Optimizer.OPTIMIZATION_GROUPING);
                if (!kVar.z().Q()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                C.c.AbstractC0022c abstractC0022cN2 = kVar.z().N();
                B bH2 = AbstractC0967i.h(kVar);
                loop3: while (bH2 != null) {
                    if ((bH2.V().k().H() & iA2) != 0) {
                        while (abstractC0022cN2 != null) {
                            if ((abstractC0022cN2.L() & iA2) != 0) {
                                for (C.c.AbstractC0022c abstractC0022cF2 = abstractC0022cN2; abstractC0022cF2 != null; abstractC0022cF2 = AbstractC0967i.f(null)) {
                                    if (abstractC0022cF2 instanceof k) {
                                        abstractC0022c = abstractC0022cF2;
                                        break loop3;
                                    }
                                    abstractC0022cF2.L();
                                }
                            }
                            abstractC0022cN2 = abstractC0022cN2.N();
                        }
                    }
                    bH2 = bH2.Y();
                    abstractC0022cN2 = (bH2 == null || (sV = bH2.V()) == null) ? null : sV.o();
                }
                k kVar3 = (k) abstractC0022c;
                if (kVar3 == null && m(kVar)) {
                    boolean zD2 = d(kVar2);
                    if (zD2) {
                        kVar.u0(G.m.ActiveParent);
                    }
                    return zD2;
                }
                if (kVar3 == null || !l(kVar3, kVar)) {
                    return false;
                }
                boolean zL = l(kVar, kVar2);
                if (kVar.o0() != G.m.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zL) {
                    G.c.c(kVar3);
                }
                return zL;
            }
            n(kVar);
            if (b(kVar, false, false, 3, null) && d(kVar2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean m(k kVar) {
        return AbstractC0967i.i(kVar).getFocusOwner().g(null, null);
    }

    private static final k n(k kVar) {
        k kVarF = m.f(kVar);
        if (kVarF != null) {
            return kVarF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
