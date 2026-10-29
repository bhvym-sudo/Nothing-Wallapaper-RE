package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f12493a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m0 f12494b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m0 f12495c = new o0();

    private static Class A() {
        if (b0.f12446d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static m0 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (m0) clsC.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        if (b0.f12446d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC1106p abstractC1106p, Object obj, Object obj2) {
        C1108s c1108sC = abstractC1106p.c(obj2);
        if (c1108sC.j()) {
            return;
        }
        abstractC1106p.d(obj).p(c1108sC);
    }

    static void E(K k9, Object obj, Object obj2, long j9) {
        p0.O(obj, j9, k9.a(p0.z(obj, j9), p0.z(obj2, j9)));
    }

    static void F(m0 m0Var, Object obj, Object obj2) {
        m0Var.p(obj, m0Var.k(m0Var.g(obj), m0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC1112w.class.isAssignableFrom(cls) && !b0.f12446d && (cls2 = f12493a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static Object I(Object obj, int i10, int i11, Object obj2, m0 m0Var) {
        if (obj2 == null) {
            obj2 = m0Var.f(obj);
        }
        m0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static m0 J() {
        return f12494b;
    }

    public static m0 K() {
        return f12495c;
    }

    public static void L(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.A(i10, list, z9);
    }

    public static void M(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.N(i10, list);
    }

    public static void N(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.K(i10, list, z9);
    }

    public static void O(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i10, list, z9);
    }

    public static void P(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i10, list, z9);
    }

    public static void Q(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.u(i10, list, z9);
    }

    public static void R(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i10, list, z9);
    }

    public static void S(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.l(i10, list, f0Var);
    }

    public static void T(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.o(i10, list, z9);
    }

    public static void U(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i10, list, z9);
    }

    public static void V(int i10, List list, s0 s0Var, f0 f0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i10, list, f0Var);
    }

    public static void W(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.v(i10, list, z9);
    }

    public static void X(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.f(i10, list, z9);
    }

    public static void Y(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i10, list, z9);
    }

    public static void Z(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.C(i10, list, z9);
    }

    static int a(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(size) : size * AbstractC1100j.c(i10, true);
    }

    public static void a0(int i10, List list, s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.k(i10, list);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.B(i10, list, z9);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = size * AbstractC1100j.O(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += AbstractC1100j.g((AbstractC1097g) list.get(i11));
        }
        return iO;
    }

    public static void c0(int i10, List list, s0 s0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i10, list, z9);
    }

    static int d(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(iE) : iE + (size * AbstractC1100j.O(i10));
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1113x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iK += AbstractC1100j.k(((Integer) list.get(i10)).intValue());
        }
        return iK;
    }

    static int f(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(size * 4) : size * AbstractC1100j.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(size * 8) : size * AbstractC1100j.n(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iR += AbstractC1100j.r(i10, (P) list.get(i11), f0Var);
        }
        return iR;
    }

    static int k(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(iL) : iL + (size * AbstractC1100j.O(i10));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1113x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += AbstractC1100j.v(((Integer) list.get(i10)).intValue());
        }
        return iV;
    }

    static int m(int i10, List list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(iN) : iN + (list.size() * AbstractC1100j.O(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += AbstractC1100j.x(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    static int o(int i10, Object obj, f0 f0Var) {
        return AbstractC1100j.z(i10, (P) obj, f0Var);
    }

    static int p(int i10, List list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC1100j.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iO += AbstractC1100j.B((P) list.get(i11), f0Var);
        }
        return iO;
    }

    static int q(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(iR) : iR + (size * AbstractC1100j.O(i10));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1113x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iJ += AbstractC1100j.J(((Integer) list.get(i10)).intValue());
        }
        return iJ;
    }

    static int s(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(iT) : iT + (size * AbstractC1100j.O(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iL = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iL += AbstractC1100j.L(((Long) list.get(i10)).longValue());
        }
        return iL;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC1100j.O(i10) * size;
        if (!(list instanceof C)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iO += obj instanceof AbstractC1097g ? AbstractC1100j.g((AbstractC1097g) obj) : AbstractC1100j.N((String) obj);
                i11++;
            }
            return iO;
        }
        C c10 = (C) list;
        while (i11 < size) {
            Object objK = c10.k(i11);
            iO += objK instanceof AbstractC1097g ? AbstractC1100j.g((AbstractC1097g) objK) : AbstractC1100j.N((String) objK);
            i11++;
        }
        return iO;
    }

    static int v(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(iW) : iW + (size * AbstractC1100j.O(i10));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1113x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iQ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iQ += AbstractC1100j.Q(((Integer) list.get(i10)).intValue());
        }
        return iQ;
    }

    static int x(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z9 ? AbstractC1100j.O(i10) + AbstractC1100j.y(iY) : iY + (size * AbstractC1100j.O(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iS += AbstractC1100j.S(((Long) list.get(i10)).longValue());
        }
        return iS;
    }

    static Object z(Object obj, int i10, List list, AbstractC1114y.a aVar, Object obj2, m0 m0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue)) {
                    obj2 = I(obj, i10, iIntValue, obj2, m0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (aVar.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = I(obj, i10, iIntValue2, obj2, m0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }
}
