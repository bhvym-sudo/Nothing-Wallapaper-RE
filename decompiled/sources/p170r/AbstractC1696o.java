package p170r;

import androidx.collection.E;
import androidx.collection.F;
import androidx.collection.O;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: renamed from: r.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1696o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f25532a = new C1689k0("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25533b = new C1689k0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f25534c = new C1689k0("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f25535d = new C1689k0("providerValues");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f25536e = new C1689k0("providers");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f25537f = new C1689k0(TypedValues.Custom.S_REFERENCE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f25538g = new Comparator() { // from class: r.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1696o.b((S) obj, (S) obj2);
        }
    };

    public static final Object A() {
        return f25533b;
    }

    public static final Object B() {
        return f25536e;
    }

    public static final Object C() {
        return f25537f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(List list, int i10, C1714x0 c1714x0, Object obj) {
        int iV = v(list, i10);
        if (iV < 0) {
            int i11 = -(iV + 1);
            if (!(obj instanceof E)) {
                obj = null;
            }
            list.add(i11, new S(c1714x0, i10, obj));
            return;
        }
        S s9 = (S) list.get(iV);
        if (!(obj instanceof E)) {
            s9.e(null);
            return;
        }
        Object objA = s9.a();
        if (objA == null) {
            s9.e(obj);
        } else if (objA instanceof F) {
            ((F) objA).h(obj);
        } else {
            s9.e(O.b(objA, obj));
        }
    }

    public static final boolean E(K0 k9) {
        return k9.j() > k9.t() + 1;
    }

    public static final boolean F(O0 o9) {
        return o9.Z() > o9.a0() + 1;
    }

    public static final boolean G() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E H(int i10) {
        return C1681g0.b(new E(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I(K0 k9, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (k9.O(i10) == i11) {
                return i11;
            }
            if (k9.O(i11) != i10) {
                if (k9.O(i10) == k9.O(i11)) {
                    return k9.O(i10);
                }
                int iT = t(k9, i10, i12);
                int iT2 = t(k9, i11, i12);
                int i13 = iT - iT2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = k9.O(i10);
                }
                int i15 = iT2 - iT;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = k9.O(i11);
                }
                while (i10 != i11) {
                    i10 = k9.O(i10);
                    i11 = k9.O(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    public static final void J(O0 o9, E0 e10) {
        int iC0;
        int iP = o9.P(o9.f25354b, o9.f0(o9.Z() + o9.i0(o9.Z())));
        for (int iP2 = o9.P(o9.f25354b, o9.f0(o9.Z())); iP2 < iP; iP2++) {
            Object obj = o9.f25355c[o9.Q(iP2)];
            int iE = -1;
            if (obj instanceof InterfaceC1686j) {
                e10.c((InterfaceC1686j) obj, o9.c0() - iP2, -1, -1);
            }
            if (obj instanceof G0) {
                int iC1 = o9.c0() - iP2;
                G0 g10 = (G0) obj;
                C1674d c1674dA = g10.a();
                if (c1674dA == null || !c1674dA.b()) {
                    iC0 = -1;
                } else {
                    iE = o9.E(c1674dA);
                    iC0 = o9.c0() - o9.Y0(iE);
                }
                e10.b(g10.b(), iC1, iE, iC0);
            }
            if (obj instanceof C1714x0) {
                ((C1714x0) obj).w();
            }
        }
        o9.I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S K(List list, int i10) {
        int iV = v(list, i10);
        if (iV >= 0) {
            return (S) list.remove(iV);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(List list, int i10, int i11) {
        int iU = u(list, i10);
        while (iU < list.size() && ((S) list.get(iU)).b() < i11) {
            list.remove(iU);
        }
    }

    public static final void M(boolean z9) {
        if (z9) {
            return;
        }
        r("Check failed");
    }

    public static final void N() {
    }

    public static final void O(int i10, int i11, int i12, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(S s9, S s10) {
        return n.i(s9.b(), s10.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(boolean z9) {
        return z9 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(L0 l9, C1674d c1674d) {
        ArrayList arrayList = new ArrayList();
        K0 k0Y = l9.y();
        try {
            q(k0Y, arrayList, l9.b(c1674d));
            A a10 = A.f21846a;
            return arrayList;
        } finally {
            k0Y.d();
        }
    }

    private static final void q(K0 k9, List list, int i10) {
        if (k9.I(i10)) {
            list.add(k9.K(i10));
            return;
        }
        int iD = i10 + 1;
        int iD2 = i10 + k9.D(i10);
        while (iD < iD2) {
            q(k9, list, iD);
            iD += k9.D(iD);
        }
    }

    public static final void r(String str) {
        throw new C1688k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void s(String str) {
        throw new C1688k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    private static final int t(K0 k9, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = k9.O(i10);
            i12++;
        }
        return i12;
    }

    private static final int u(List list, int i10) {
        int iV = v(list, i10);
        return iV < 0 ? -(iV + 1) : iV;
    }

    private static final int v(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = n.i(((S) list.get(i12)).b(), i10);
            if (i13 < 0) {
                i11 = i12 + 1;
            } else {
                if (i13 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S w(List list, int i10, int i11) {
        int iU = u(list, i10);
        if (iU >= list.size()) {
            return null;
        }
        S s9 = (S) list.get(iU);
        if (s9.b() < i11) {
            return s9;
        }
        return null;
    }

    public static final Object x() {
        return f25534c;
    }

    public static final Object y() {
        return f25532a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object z(V v9) {
        return v9.d() != null ? new U(Integer.valueOf(v9.a()), v9.d()) : Integer.valueOf(v9.a());
    }
}
