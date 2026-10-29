package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.B;
import W.S;
import W.W;
import androidx.constraintlayout.core.widgets.Optimizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11445a;

        static {
            int[] iArr = new int[G.m.values().length];
            try {
                iArr[G.m.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.m.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.m.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11445a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ k f11446r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ k f11447s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f11448t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p219v8.l f11449u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, k kVar2, int i10, p219v8.l lVar) {
            super(1);
            this.f11446r = kVar;
            this.f11447s = kVar2;
            this.f11448t = i10;
            this.f11449u = lVar;
        }

        public final Boolean a(U.e.a aVar) {
            boolean zI = o.i(this.f11446r, this.f11447s, this.f11448t, this.f11449u);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            androidx.appcompat.app.o.a(obj);
            return a(null);
        }
    }

    private static final boolean b(k kVar, p219v8.l lVar) {
        G.m mVarO0 = kVar.o0();
        int[] iArr = a.f11445a;
        int i10 = iArr[mVarO0.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return g(kVar, lVar);
            }
            if (i10 != 4) {
                throw new p079h8.m();
            }
            if (!g(kVar, lVar)) {
                if (!(kVar.m0().i() ? ((Boolean) lVar.f(kVar)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        k kVarF = m.f(kVar);
        if (kVarF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i11 = iArr[kVarF.o0().ordinal()];
        if (i11 == 1) {
            return b(kVarF, lVar) || d(kVar, kVarF, androidx.compose.ui.focus.b.f11397b.f(), lVar) || (kVarF.m0().i() && ((Boolean) lVar.f(kVarF)).booleanValue());
        }
        if (i11 == 2 || i11 == 3) {
            return d(kVar, kVarF, androidx.compose.ui.focus.b.f11397b.f(), lVar);
        }
        if (i11 != 4) {
            throw new p079h8.m();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(k kVar, p219v8.l lVar) {
        int i10 = a.f11445a[kVar.o0().ordinal()];
        if (i10 == 1) {
            k kVarF = m.f(kVar);
            if (kVarF != null) {
                return c(kVarF, lVar) || d(kVar, kVarF, androidx.compose.ui.focus.b.f11397b.e(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i10 == 2 || i10 == 3) {
            return h(kVar, lVar);
        }
        if (i10 == 4) {
            return kVar.m0().i() ? ((Boolean) lVar.f(kVar)).booleanValue() : h(kVar, lVar);
        }
        throw new p079h8.m();
    }

    private static final boolean d(k kVar, k kVar2, int i10, p219v8.l lVar) {
        if (i(kVar, kVar2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(kVar, i10, new b(kVar, kVar2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(k kVar) {
        C.c.AbstractC0022c abstractC0022c;
        S sV;
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C.c.AbstractC0022c abstractC0022cN = kVar.z().N();
        B bH = AbstractC0967i.h(kVar);
        loop0: while (true) {
            abstractC0022c = null;
            if (bH == null) {
                break;
            }
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
        return abstractC0022c == null;
    }

    public static final boolean f(k kVar, int i10, p219v8.l lVar) {
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.e())) {
            return c(kVar, lVar);
        }
        if (androidx.compose.ui.focus.b.l(i10, aVar.f())) {
            return b(kVar, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(k kVar, p219v8.l lVar) {
        p190t.b bVar = new p190t.b(new k[16], 0);
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar2, kVar.z());
        } else {
            bVar2.b(abstractC0022cI);
        }
        while (bVar2.s()) {
            C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar2.w(bVar2.p() - 1);
            if ((abstractC0022cF.H() & iA) == 0) {
                AbstractC0967i.c(bVar2, abstractC0022cF);
            } else {
                while (abstractC0022cF != null) {
                    if ((abstractC0022cF.L() & iA) != 0) {
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                bVar.b((k) abstractC0022cF);
                            } else {
                                abstractC0022cF.L();
                            }
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                        break;
                    }
                    abstractC0022cF = abstractC0022cF.I();
                }
            }
        }
        bVar.B(n.f11444a);
        int iP = bVar.p();
        if (iP > 0) {
            int i10 = iP - 1;
            Object[] objArrO = bVar.o();
            do {
                k kVar2 = (k) objArrO[i10];
                if (m.g(kVar2) && b(kVar2, lVar)) {
                    return true;
                }
                i10--;
            } while (i10 >= 0);
        }
        return false;
    }

    private static final boolean h(k kVar, p219v8.l lVar) {
        p190t.b bVar = new p190t.b(new k[16], 0);
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar2, kVar.z());
        } else {
            bVar2.b(abstractC0022cI);
        }
        while (bVar2.s()) {
            C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar2.w(bVar2.p() - 1);
            if ((abstractC0022cF.H() & iA) == 0) {
                AbstractC0967i.c(bVar2, abstractC0022cF);
            } else {
                while (abstractC0022cF != null) {
                    if ((abstractC0022cF.L() & iA) != 0) {
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                bVar.b((k) abstractC0022cF);
                            } else {
                                abstractC0022cF.L();
                            }
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                        break;
                    }
                    abstractC0022cF = abstractC0022cF.I();
                }
            }
        }
        bVar.B(n.f11444a);
        int iP = bVar.p();
        if (iP > 0) {
            Object[] objArrO = bVar.o();
            int i10 = 0;
            do {
                k kVar2 = (k) objArrO[i10];
                if (m.g(kVar2) && c(kVar2, lVar)) {
                    return true;
                }
                i10++;
            } while (i10 < iP);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(k kVar, k kVar2, int i10, p219v8.l lVar) {
        if (kVar.o0() != G.m.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        p190t.b bVar = new p190t.b(new k[16], 0);
        int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
        if (!kVar.z().Q()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
        C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
        if (abstractC0022cI == null) {
            AbstractC0967i.c(bVar2, kVar.z());
        } else {
            bVar2.b(abstractC0022cI);
        }
        while (bVar2.s()) {
            C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar2.w(bVar2.p() - 1);
            if ((abstractC0022cF.H() & iA) == 0) {
                AbstractC0967i.c(bVar2, abstractC0022cF);
            } else {
                while (abstractC0022cF != null) {
                    if ((abstractC0022cF.L() & iA) != 0) {
                        while (abstractC0022cF != null) {
                            if (abstractC0022cF instanceof k) {
                                bVar.b((k) abstractC0022cF);
                            } else {
                                abstractC0022cF.L();
                            }
                            abstractC0022cF = AbstractC0967i.f(null);
                        }
                        break;
                    }
                    abstractC0022cF = abstractC0022cF.I();
                }
            }
        }
        bVar.B(n.f11444a);
        androidx.compose.ui.focus.b.a aVar = androidx.compose.ui.focus.b.f11397b;
        if (androidx.compose.ui.focus.b.l(i10, aVar.e())) {
            B8.g gVar = new B8.g(0, bVar.p() - 1);
            int iG = gVar.g();
            int iM = gVar.m();
            if (iG <= iM) {
                boolean z9 = false;
                while (true) {
                    if (z9) {
                        k kVar3 = (k) bVar.o()[iG];
                        if (m.g(kVar3) && c(kVar3, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.n.d(bVar.o()[iG], kVar2)) {
                        z9 = true;
                    }
                    if (iG == iM) {
                        break;
                    }
                    iG++;
                }
            }
        } else {
            if (!androidx.compose.ui.focus.b.l(i10, aVar.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            B8.g gVar2 = new B8.g(0, bVar.p() - 1);
            int iG2 = gVar2.g();
            int iM2 = gVar2.m();
            if (iG2 <= iM2) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        k kVar4 = (k) bVar.o()[iM2];
                        if (m.g(kVar4) && b(kVar4, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.n.d(bVar.o()[iM2], kVar2)) {
                        z10 = true;
                    }
                    if (iM2 == iG2) {
                        break;
                    }
                    iM2--;
                }
            }
        }
        if (androidx.compose.ui.focus.b.l(i10, androidx.compose.ui.focus.b.f11397b.e()) || !kVar.m0().i() || e(kVar)) {
            return false;
        }
        return ((Boolean) lVar.f(kVar)).booleanValue();
    }
}
