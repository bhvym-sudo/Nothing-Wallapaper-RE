package p170r;

import androidx.collection.D;
import androidx.collection.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class O0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f25351y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f25352z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f25353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f25354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f25355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f25356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap f25357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f25358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25367o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private x f25371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f25372t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25373u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C1706t0 f25376x;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Q f25368p = new Q();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Q f25369q = new Q();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Q f25370r = new Q();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25374v = -1;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(O0 o9, int i10, O0 o10, boolean z9, boolean z10, boolean z11) {
            boolean zJ0;
            List listL;
            int iI0 = o9.i0(i10);
            int i11 = i10 + iI0;
            int iO = o9.O(i10);
            int iO2 = o9.O(i11);
            int i12 = iO2 - iO;
            boolean zL = o9.L(i10);
            o10.m0(iI0);
            o10.n0(i12, o10.Z());
            if (o9.f25359g < i11) {
                o9.v0(i11);
            }
            if (o9.f25363k < iO2) {
                o9.x0(iO2, i11);
            }
            int[] iArr = o10.f25354b;
            int iZ = o10.Z();
            AbstractC1439m.f(o9.f25354b, iArr, iZ * 5, i10 * 5, i11 * 5);
            Object[] objArr = o10.f25355c;
            int i13 = o10.f25361i;
            AbstractC1439m.h(o9.f25355c, objArr, i13, iO, iO2);
            int iA0 = o10.a0();
            N0.b0(iArr, iZ, iA0);
            int i14 = iZ - i10;
            int i15 = iZ + iI0;
            int iP = i13 - o10.P(iArr, iZ);
            int i16 = o10.f25365m;
            int i17 = o10.f25364l;
            int length = objArr.length;
            int i18 = i16;
            int i19 = iZ;
            while (true) {
                zJ0 = false;
                if (i19 >= i15) {
                    break;
                }
                if (i19 != iZ) {
                    N0.b0(iArr, i19, N0.T(iArr, i19) + i14);
                }
                int i20 = i15;
                N0.X(iArr, i19, o10.R(o10.P(iArr, i19) + iP, i18 >= i19 ? o10.f25363k : 0, i17, length));
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                i15 = i20;
                iP = iP;
            }
            int i21 = i15;
            o10.f25365m = i18;
            int iP2 = N0.P(o9.f25356d, i10, o9.b0());
            int iP3 = N0.P(o9.f25356d, i11, o9.b0());
            if (iP2 < iP3) {
                ArrayList arrayList = o9.f25356d;
                ArrayList arrayList2 = new ArrayList(iP3 - iP2);
                for (int i22 = iP2; i22 < iP3; i22++) {
                    C1674d c1674d = (C1674d) arrayList.get(i22);
                    c1674d.c(c1674d.a() + i14);
                    arrayList2.add(c1674d);
                }
                o10.f25356d.addAll(N0.P(o10.f25356d, o10.Z(), o10.b0()), arrayList2);
                arrayList.subList(iP2, iP3).clear();
                listL = arrayList2;
            } else {
                listL = AbstractC1444s.l();
            }
            if (!listL.isEmpty()) {
                HashMap map = o9.f25357e;
                HashMap map2 = o10.f25357e;
                if (map != null && map2 != null) {
                    int size = listL.size();
                    for (int i23 = 0; i23 < size; i23++) {
                    }
                }
            }
            o10.a0();
            o10.b1(iA0);
            int iB0 = o9.B0(i10);
            if (z11) {
                if (z9) {
                    boolean z12 = iB0 >= 0;
                    if (z12) {
                        o9.d1();
                        o9.C(iB0 - o9.Z());
                        o9.d1();
                    }
                    o9.C(i10 - o9.Z());
                    boolean zI0 = o9.I0();
                    if (z12) {
                        o9.T0();
                        o9.S();
                        o9.T0();
                        o9.S();
                    }
                    zJ0 = zI0;
                } else {
                    zJ0 = o9.J0(i10, iI0);
                    o9.K0(iO, i12, i10 - 1);
                }
            }
            if (zJ0) {
                AbstractC1696o.r("Unexpectedly removed anchors");
            }
            o10.f25367o += N0.N(iArr, iZ) ? 1 : N0.Q(iArr, iZ);
            if (z10) {
                o10.f25372t = i21;
                o10.f25361i = i13 + i12;
            }
            if (zL) {
                o10.m1(iA0);
            }
            return listL;
        }

        static /* synthetic */ List c(a aVar, O0 o9, int i10, O0 o10, boolean z9, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z11 = true;
            }
            return aVar.b(o9, i10, o10, z9, z10, z11);
        }

        private a() {
        }
    }

    public O0(L0 l9) {
        this.f25353a = l9;
        this.f25354b = l9.q();
        this.f25355c = l9.s();
        this.f25356d = l9.o();
        this.f25357e = l9.u();
        this.f25358f = l9.p();
        this.f25359g = l9.r();
        this.f25360h = (this.f25354b.length / 5) - l9.r();
        this.f25363k = l9.t();
        this.f25364l = this.f25355c.length - l9.t();
        this.f25365m = l9.r();
        this.f25373u = l9.r();
    }

    private final int A0(int[] iArr, int i10) {
        return P(iArr, i10);
    }

    private final int C0(int[] iArr, int i10) {
        return D0(N0.T(iArr, f0(i10)));
    }

    private final int D0(int i10) {
        return i10 > -2 ? i10 : (b0() + i10) - (-2);
    }

    private final int E0(int i10, int i11) {
        return i10 < i11 ? i10 : -((b0() - i10) + 2);
    }

    private final Object F0(Object obj) {
        Object objR0 = R0();
        Q0(obj);
        return objR0;
    }

    private final int G(int[] iArr, int i10) {
        return P(iArr, i10) + N0.E(N0.H(iArr, i10) >> 29);
    }

    private final void G0() {
        C1706t0 c1706t0 = this.f25376x;
        if (c1706t0 != null) {
            while (c1706t0.b()) {
                n1(c1706t0.d(), c1706t0);
            }
        }
    }

    private final boolean H0(int i10, int i11, HashMap map) {
        int i12 = i11 + i10;
        int iP = N0.P(this.f25356d, i12, X() - this.f25360h);
        if (iP >= this.f25356d.size()) {
            iP--;
        }
        int i13 = iP + 1;
        int i14 = 0;
        while (iP >= 0) {
            C1674d c1674d = (C1674d) this.f25356d.get(iP);
            int iE = E(c1674d);
            if (iE < i10) {
                break;
            }
            if (iE < i12) {
                c1674d.c(Integer.MIN_VALUE);
                if (map != null) {
                }
                if (i14 == 0) {
                    i14 = iP + 1;
                }
                i13 = iP;
            }
            iP--;
        }
        boolean z9 = i13 < i14;
        if (z9) {
            this.f25356d.subList(i13, i14).clear();
        }
        return z9;
    }

    private final boolean I(int i10) {
        int iI0 = i10 + 1;
        int iI1 = i10 + i0(i10);
        while (iI0 < iI1) {
            if (N0.C(this.f25354b, f0(iI0))) {
                return true;
            }
            iI0 += i0(iI0);
        }
        return false;
    }

    private final void J() {
        int i10 = this.f25363k;
        AbstractC1439m.q(this.f25355c, null, i10, this.f25364l + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J0(int i10, int i11) {
        boolean zH0 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f25356d;
            v0(i10);
            zH0 = arrayList.isEmpty() ? false : H0(i10, i11, this.f25357e);
            this.f25359g = i10;
            this.f25360h += i11;
            int i12 = this.f25365m;
            if (i12 > i10) {
                this.f25365m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f25373u;
            if (i13 >= this.f25359g) {
                this.f25373u = i13 - i11;
            }
            int i14 = this.f25374v;
            if (M(i14)) {
                m1(i14);
            }
        }
        return zH0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f25364l;
            int i14 = i10 + i11;
            x0(i14, i12);
            this.f25363k = i10;
            this.f25364l = i13 + i11;
            AbstractC1439m.q(this.f25355c, null, i10, i14);
            int i15 = this.f25362j;
            if (i15 >= i10) {
                this.f25362j = i15 - i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L(int i10) {
        return i10 >= 0 && N0.C(this.f25354b, f0(i10));
    }

    private final boolean M(int i10) {
        return i10 >= 0 && N0.D(this.f25354b, f0(i10));
    }

    private final int M0() {
        int iX = (X() - this.f25360h) - this.f25369q.i();
        this.f25373u = iX;
        return iX;
    }

    private final int N(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    private final void N0() {
        this.f25369q.j((X() - this.f25360h) - this.f25373u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O(int i10) {
        return P(this.f25354b, f0(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int[] iArr, int i10) {
        return i10 >= X() ? this.f25355c.length - this.f25364l : N(N0.F(iArr, i10), this.f25364l, this.f25355c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int i10) {
        return i10 < this.f25363k ? i10 : i10 + this.f25364l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final void W(int i10, int i11, int i12) {
        int iE0 = E0(i10, this.f25359g);
        while (i12 < i11) {
            N0.b0(this.f25354b, f0(i12), iE0);
            int I9 = N0.I(this.f25354b, f0(i12)) + i12;
            W(i12, I9, i12 + 1);
            i12 = I9;
        }
    }

    private final int W0(int[] iArr, int i10) {
        return i10 >= X() ? this.f25355c.length - this.f25364l : N(N0.V(iArr, i10), this.f25364l, this.f25355c.length);
    }

    private final int X() {
        return this.f25354b.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P b1(int i10) {
        C1674d c1674dI1;
        HashMap map = this.f25357e;
        if (map == null || (c1674dI1 = i1(i10)) == null) {
            return null;
        }
        return (P) map.get(c1674dI1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f0(int i10) {
        return i10 < this.f25359g ? i10 : i10 + this.f25360h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void f1(int i10, Object obj, boolean z9, Object obj2) {
        int I9;
        int i11 = this.f25374v;
        Object[] objArr = this.f25366n > 0;
        this.f25370r.j(this.f25367o);
        if (objArr == true) {
            int i12 = this.f25372t;
            int iP = P(this.f25354b, f0(i12));
            m0(1);
            this.f25361i = iP;
            this.f25362j = iP;
            int iF0 = f0(i12);
            InterfaceC1690l.a aVar = InterfaceC1690l.f25468a;
            ?? r12 = obj != aVar.a() ? 1 : 0;
            ?? r13 = (z9 || obj2 == aVar.a()) ? 0 : 1;
            int iR = R(iP, this.f25363k, this.f25364l, this.f25355c.length);
            if (iR >= 0 && this.f25365m < i12) {
                iR = -(((this.f25355c.length - this.f25364l) - iR) + 1);
            }
            N0.M(this.f25354b, iF0, i10, z9, r12, r13, this.f25374v, iR);
            int i13 = (z9 ? 1 : 0) + r12 + r13;
            if (i13 > 0) {
                n0(i13, i12);
                Object[] objArr2 = this.f25355c;
                int i14 = this.f25361i;
                if (z9) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (r12 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (r13 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.f25361i = i14;
            }
            this.f25367o = 0;
            I9 = i12 + 1;
            this.f25374v = i12;
            this.f25372t = I9;
            if (i11 >= 0) {
                b1(i11);
            }
        } else {
            this.f25368p.j(i11);
            N0();
            int i15 = this.f25372t;
            int iF1 = f0(i15);
            if (!n.d(obj2, InterfaceC1690l.f25468a.a())) {
                if (z9) {
                    p1(obj2);
                } else {
                    l1(obj2);
                }
            }
            this.f25361i = W0(this.f25354b, iF1);
            this.f25362j = P(this.f25354b, f0(this.f25372t + 1));
            this.f25367o = N0.Q(this.f25354b, iF1);
            this.f25374v = i15;
            this.f25372t = i15 + 1;
            I9 = i15 + N0.I(this.f25354b, iF1);
        }
        this.f25373u = I9;
    }

    private final void k1(int i10, int i11) {
        C1674d c1674d;
        int iA;
        C1674d c1674d2;
        int iA2;
        int i12;
        int iX = X() - this.f25360h;
        if (i10 >= i11) {
            for (int iP = N0.P(this.f25356d, i11, iX); iP < this.f25356d.size() && (iA = (c1674d = (C1674d) this.f25356d.get(iP)).a()) >= 0; iP++) {
                c1674d.c(-(iX - iA));
            }
            return;
        }
        for (int iP2 = N0.P(this.f25356d, i10, iX); iP2 < this.f25356d.size() && (iA2 = (c1674d2 = (C1674d) this.f25356d.get(iP2)).a()) < 0 && (i12 = iA2 + iX) < i11; iP2++) {
            c1674d2.c(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(int i10) {
        if (i10 > 0) {
            int i11 = this.f25372t;
            v0(i11);
            int i12 = this.f25359g;
            int i13 = this.f25360h;
            int[] iArr = this.f25354b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC1439m.f(iArr, iArr2, 0, 0, i12 * 5);
                AbstractC1439m.f(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f25354b = iArr2;
                i13 = i15;
            }
            int i16 = this.f25373u;
            if (i16 >= i12) {
                this.f25373u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f25359g = i17;
            this.f25360h = i13 - i10;
            int iR = R(i14 > 0 ? O(i11 + i10) : 0, this.f25365m >= i12 ? this.f25363k : 0, this.f25364l, this.f25355c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                N0.X(this.f25354b, i18, iR);
            }
            int i19 = this.f25365m;
            if (i19 >= i12) {
                this.f25365m = i19 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m1(int i10) {
        if (i10 >= 0) {
            C1706t0 c1706t0 = this.f25376x;
            if (c1706t0 == null) {
                c1706t0 = new C1706t0(null, 1, 0 == true ? 1 : 0);
                this.f25376x = c1706t0;
            }
            c1706t0.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(int i10, int i11) {
        if (i10 > 0) {
            x0(this.f25361i, i11);
            int i12 = this.f25363k;
            int i13 = this.f25364l;
            if (i13 < i10) {
                Object[] objArr = this.f25355c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                AbstractC1439m.h(objArr, objArr2, 0, 0, i12);
                AbstractC1439m.h(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.f25355c = objArr2;
                i13 = i16;
            }
            int i17 = this.f25362j;
            if (i17 >= i12) {
                this.f25362j = i17 + i10;
            }
            this.f25363k = i12 + i10;
            this.f25364l = i13 - i10;
        }
    }

    private final void n1(int i10, C1706t0 c1706t0) {
        int iF0 = f0(i10);
        boolean zI = I(i10);
        if (N0.D(this.f25354b, iF0) != zI) {
            N0.W(this.f25354b, iF0, zI);
            int iB0 = B0(i10);
            if (iB0 >= 0) {
                c1706t0.a(iB0);
            }
        }
    }

    private final void o1(int[] iArr, int i10, int i11) {
        N0.X(iArr, i10, R(i11, this.f25363k, this.f25364l, this.f25355c.length));
    }

    private final void q1(int i10, Object obj) {
        int iF0 = f0(i10);
        int[] iArr = this.f25354b;
        if (!(iF0 < iArr.length && N0.N(iArr, iF0))) {
            AbstractC1696o.r("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f25355c[Q(A0(this.f25354b, iF0))] = obj;
    }

    public static /* synthetic */ void r0(O0 o9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = o9.f25374v;
        }
        o9.q0(i10);
    }

    private final void s0(int i10, int i11, int i12) {
        C1674d c1674d;
        int iE;
        int i13 = i12 + i10;
        int iB0 = b0();
        int iP = N0.P(this.f25356d, i10, iB0);
        ArrayList arrayList = new ArrayList();
        if (iP >= 0) {
            while (iP < this.f25356d.size() && (iE = E((c1674d = (C1674d) this.f25356d.get(iP)))) >= i10 && iE < i13) {
                arrayList.add(c1674d);
                this.f25356d.remove(iP);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            C1674d c1674d2 = (C1674d) arrayList.get(i15);
            int iE2 = E(c1674d2) + i14;
            if (iE2 >= this.f25359g) {
                c1674d2.c(-(iB0 - iE2));
            } else {
                c1674d2.c(iE2);
            }
            this.f25356d.add(N0.P(this.f25356d, iE2, iB0), c1674d2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(int i10) {
        int i11 = this.f25360h;
        int i12 = this.f25359g;
        if (i12 != i10) {
            if (!this.f25356d.isEmpty()) {
                k1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f25354b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    AbstractC1439m.f(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    AbstractC1439m.f(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iX = X();
            AbstractC1696o.M(i12 < iX);
            while (i12 < iX) {
                int iT = N0.T(this.f25354b, i12);
                int iE0 = E0(D0(iT), i10);
                if (iE0 != iT) {
                    N0.b0(this.f25354b, i12, iE0);
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f25359g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int i10, int i11) {
        int i12 = this.f25364l;
        int i13 = this.f25363k;
        int i14 = this.f25365m;
        if (i13 != i10) {
            Object[] objArr = this.f25355c;
            if (i10 < i13) {
                AbstractC1439m.h(objArr, objArr, i10 + i12, i10, i13);
            } else {
                AbstractC1439m.h(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
        }
        int iMin = Math.min(i11 + 1, b0());
        if (i14 != iMin) {
            int length = this.f25355c.length - i12;
            if (iMin < i14) {
                int iF0 = f0(iMin);
                int iF1 = f0(i14);
                int i15 = this.f25359g;
                while (iF0 < iF1) {
                    int iF = N0.F(this.f25354b, iF0);
                    if (!(iF >= 0)) {
                        AbstractC1696o.r("Unexpected anchor value, expected a positive anchor");
                    }
                    N0.X(this.f25354b, iF0, -((length - iF) + 1));
                    iF0++;
                    if (iF0 == i15) {
                        iF0 += this.f25360h;
                    }
                }
            } else {
                int iF2 = f0(i14);
                int iF3 = f0(iMin);
                while (iF2 < iF3) {
                    int iF4 = N0.F(this.f25354b, iF2);
                    if (!(iF4 < 0)) {
                        AbstractC1696o.r("Unexpected anchor value, expected a negative anchor");
                    }
                    N0.X(this.f25354b, iF2, iF4 + length + 1);
                    iF2++;
                    if (iF2 == this.f25359g) {
                        iF2 += this.f25360h;
                    }
                }
            }
            this.f25365m = iMin;
        }
        this.f25363k = i10;
    }

    public final int B0(int i10) {
        return C0(this.f25354b, i10);
    }

    public final void C(int i10) {
        boolean z9 = false;
        if (!(i10 >= 0)) {
            AbstractC1696o.r("Cannot seek backwards");
        }
        if (!(this.f25366n <= 0)) {
            AbstractC1701q0.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f25372t + i10;
        if (i11 >= this.f25374v && i11 <= this.f25373u) {
            z9 = true;
        }
        if (!z9) {
            AbstractC1696o.r("Cannot seek outside the current group (" + this.f25374v + '-' + this.f25373u + ')');
        }
        this.f25372t = i11;
        int iP = P(this.f25354b, f0(i11));
        this.f25361i = iP;
        this.f25362j = iP;
    }

    public final C1674d D(int i10) {
        ArrayList arrayList = this.f25356d;
        int iU = N0.U(arrayList, i10, b0());
        if (iU >= 0) {
            return (C1674d) arrayList.get(iU);
        }
        if (i10 > this.f25359g) {
            i10 = -(b0() - i10);
        }
        C1674d c1674d = new C1674d(i10);
        arrayList.add(-(iU + 1), c1674d);
        return c1674d;
    }

    public final int E(C1674d c1674d) {
        int iA = c1674d.a();
        return iA < 0 ? b0() + iA : iA;
    }

    public final void F(C1674d c1674d, Object obj) {
        if (!(this.f25366n == 0)) {
            AbstractC1696o.r("Can only append a slot if not current inserting");
        }
        int i10 = this.f25361i;
        int i11 = this.f25362j;
        int iE = E(c1674d);
        int iP = P(this.f25354b, f0(iE + 1));
        this.f25361i = iP;
        this.f25362j = iP;
        n0(1, iE);
        if (i10 >= iP) {
            i10++;
            i11++;
        }
        this.f25355c[iP] = obj;
        this.f25361i = i10;
        this.f25362j = i11;
    }

    public final void H() {
        int i10 = this.f25366n;
        this.f25366n = i10 + 1;
        if (i10 == 0) {
            N0();
        }
    }

    public final boolean I0() {
        if (!(this.f25366n == 0)) {
            AbstractC1696o.r("Cannot remove group while inserting");
        }
        int i10 = this.f25372t;
        int i11 = this.f25361i;
        int iP = P(this.f25354b, f0(i10));
        int iS0 = S0();
        b1(this.f25374v);
        C1706t0 c1706t0 = this.f25376x;
        if (c1706t0 != null) {
            while (c1706t0.b() && c1706t0.c() >= i10) {
                c1706t0.d();
            }
        }
        boolean zJ0 = J0(i10, this.f25372t - i10);
        K0(iP, this.f25361i - iP, i10 - 1);
        this.f25372t = i10;
        this.f25361i = i11;
        this.f25367o -= iS0;
        return zJ0;
    }

    public final void K(boolean z9) {
        this.f25375w = true;
        if (z9 && this.f25368p.d()) {
            v0(b0());
            x0(this.f25355c.length - this.f25364l, this.f25359g);
            J();
            G0();
        }
        this.f25353a.g(this, this.f25354b, this.f25359g, this.f25355c, this.f25363k, this.f25356d, this.f25357e, this.f25358f);
    }

    public final void L0() {
        if (!(this.f25366n == 0)) {
            AbstractC1696o.r("Cannot reset when inserting");
        }
        G0();
        this.f25372t = 0;
        this.f25373u = X() - this.f25360h;
        this.f25361i = 0;
        this.f25362j = 0;
        this.f25367o = 0;
    }

    public final Object O0(int i10, int i11, Object obj) {
        int iQ = Q(X0(i10, i11));
        Object[] objArr = this.f25355c;
        Object obj2 = objArr[iQ];
        objArr[iQ] = obj;
        return obj2;
    }

    public final Object P0(int i10, Object obj) {
        return O0(this.f25372t, i10, obj);
    }

    public final void Q0(Object obj) {
        if (!(this.f25361i <= this.f25362j)) {
            AbstractC1696o.r("Writing to an invalid slot");
        }
        this.f25355c[Q(this.f25361i - 1)] = obj;
    }

    public final Object R0() {
        if (this.f25366n > 0) {
            n0(1, this.f25374v);
        }
        Object[] objArr = this.f25355c;
        int i10 = this.f25361i;
        this.f25361i = i10 + 1;
        return objArr[Q(i10)];
    }

    public final int S() {
        D d10;
        boolean z9 = this.f25366n > 0;
        int i10 = this.f25372t;
        int i11 = this.f25373u;
        int i12 = this.f25374v;
        int iF0 = f0(i12);
        int i13 = this.f25367o;
        int i14 = i10 - i12;
        boolean zN = N0.N(this.f25354b, iF0);
        if (z9) {
            x xVar = this.f25371s;
            if (xVar != null && (d10 = (D) xVar.c(i12)) != null) {
                Object[] objArr = d10.f11276a;
                int i15 = d10.f11277b;
                for (int i16 = 0; i16 < i15; i16++) {
                    F0(objArr[i16]);
                }
            }
            N0.Y(this.f25354b, iF0, i14);
            N0.a0(this.f25354b, iF0, i13);
            this.f25367o = this.f25370r.i() + (zN ? 1 : i13);
            int iC0 = C0(this.f25354b, i12);
            this.f25374v = iC0;
            int iB0 = iC0 < 0 ? b0() : f0(iC0 + 1);
            int iP = iB0 >= 0 ? P(this.f25354b, iB0) : 0;
            this.f25361i = iP;
            this.f25362j = iP;
            return i13;
        }
        if (!(i10 == i11)) {
            AbstractC1696o.r("Expected to be at the end of a group");
        }
        int I9 = N0.I(this.f25354b, iF0);
        int iQ = N0.Q(this.f25354b, iF0);
        N0.Y(this.f25354b, iF0, i14);
        N0.a0(this.f25354b, iF0, i13);
        int i17 = this.f25368p.i();
        M0();
        this.f25374v = i17;
        int iC1 = C0(this.f25354b, i12);
        int i18 = this.f25370r.i();
        this.f25367o = i18;
        if (iC1 == i17) {
            this.f25367o = i18 + (zN ? 0 : i13 - iQ);
            return i13;
        }
        int i19 = i14 - I9;
        int i20 = zN ? 0 : i13 - iQ;
        if (i19 != 0 || i20 != 0) {
            while (iC1 != 0 && iC1 != i17 && (i20 != 0 || i19 != 0)) {
                int iF1 = f0(iC1);
                if (i19 != 0) {
                    N0.Y(this.f25354b, iF1, N0.I(this.f25354b, iF1) + i19);
                }
                if (i20 != 0) {
                    int[] iArr = this.f25354b;
                    N0.a0(iArr, iF1, N0.Q(iArr, iF1) + i20);
                }
                if (N0.N(this.f25354b, iF1)) {
                    i20 = 0;
                }
                iC1 = C0(this.f25354b, iC1);
            }
        }
        this.f25367o += i20;
        return i13;
    }

    public final int S0() {
        int iF0 = f0(this.f25372t);
        int I9 = this.f25372t + N0.I(this.f25354b, iF0);
        this.f25372t = I9;
        this.f25361i = P(this.f25354b, f0(I9));
        if (N0.N(this.f25354b, iF0)) {
            return 1;
        }
        return N0.Q(this.f25354b, iF0);
    }

    public final void T() {
        if (!(this.f25366n > 0)) {
            AbstractC1701q0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f25366n - 1;
        this.f25366n = i10;
        if (i10 == 0) {
            if (!(this.f25370r.b() == this.f25368p.b())) {
                AbstractC1696o.r("startGroup/endGroup mismatch while inserting");
            }
            M0();
        }
    }

    public final void T0() {
        int i10 = this.f25373u;
        this.f25372t = i10;
        this.f25361i = P(this.f25354b, f0(i10));
    }

    public final void U(int i10) {
        boolean z9 = false;
        if (!(this.f25366n <= 0)) {
            AbstractC1696o.r("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f25374v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f25373u) {
                z9 = true;
            }
            if (!z9) {
                AbstractC1696o.r("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f25372t;
            int i13 = this.f25361i;
            int i14 = this.f25362j;
            this.f25372t = i10;
            d1();
            this.f25372t = i12;
            this.f25361i = i13;
            this.f25362j = i14;
        }
    }

    public final Object U0(int i10, int i11) {
        int iW0 = W0(this.f25354b, f0(i10));
        int iP = P(this.f25354b, f0(i10 + 1));
        int i12 = i11 + iW0;
        if (iW0 > i12 || i12 >= iP) {
            return InterfaceC1690l.f25468a.a();
        }
        return this.f25355c[Q(i12)];
    }

    public final void V(C1674d c1674d) {
        U(c1674d.e(this));
    }

    public final Object V0(C1674d c1674d, int i10) {
        return U0(E(c1674d), i10);
    }

    public final int X0(int i10, int i11) {
        int iW0 = W0(this.f25354b, f0(i10));
        int i12 = iW0 + i11;
        if (!(i12 >= iW0 && i12 < P(this.f25354b, f0(i10 + 1)))) {
            AbstractC1696o.r("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final boolean Y() {
        return this.f25375w;
    }

    public final int Y0(int i10) {
        return P(this.f25354b, f0(i10 + i0(i10)));
    }

    public final int Z() {
        return this.f25372t;
    }

    public final int Z0(int i10) {
        return P(this.f25354b, f0(i10 + 1));
    }

    public final int a0() {
        return this.f25374v;
    }

    public final int a1(int i10) {
        return W0(this.f25354b, f0(i10));
    }

    public final int b0() {
        return X() - this.f25360h;
    }

    public final int c0() {
        return this.f25355c.length - this.f25364l;
    }

    public final void c1(int i10, Object obj, Object obj2) {
        f1(i10, obj, false, obj2);
    }

    public final L0 d0() {
        return this.f25353a;
    }

    public final void d1() {
        if (!(this.f25366n == 0)) {
            AbstractC1696o.r("Key must be supplied when inserting");
        }
        InterfaceC1690l.a aVar = InterfaceC1690l.f25468a;
        f1(0, aVar.a(), false, aVar.a());
    }

    public final Object e0(int i10) {
        int iF0 = f0(i10);
        return N0.J(this.f25354b, iF0) ? this.f25355c[G(this.f25354b, iF0)] : InterfaceC1690l.f25468a.a();
    }

    public final void e1(int i10, Object obj) {
        f1(i10, obj, false, InterfaceC1690l.f25468a.a());
    }

    public final int g0(int i10) {
        return N0.O(this.f25354b, f0(i10));
    }

    public final void g1(int i10, Object obj) {
        f1(i10, obj, true, InterfaceC1690l.f25468a.a());
    }

    public final Object h0(int i10) {
        int iF0 = f0(i10);
        if (N0.L(this.f25354b, iF0)) {
            return this.f25355c[N0.S(this.f25354b, iF0)];
        }
        return null;
    }

    public final void h1(int i10) {
        AbstractC1696o.M(i10 > 0);
        int i11 = this.f25374v;
        int iW0 = W0(this.f25354b, f0(i11));
        int iP = P(this.f25354b, f0(i11 + 1)) - i10;
        AbstractC1696o.M(iP >= iW0);
        K0(iP, i10, i11);
        int i12 = this.f25361i;
        if (i12 >= iW0) {
            this.f25361i = i12 - i10;
        }
    }

    public final int i0(int i10) {
        return N0.I(this.f25354b, f0(i10));
    }

    public final C1674d i1(int i10) {
        if (i10 < 0 || i10 >= b0()) {
            return null;
        }
        return N0.G(this.f25356d, i10, b0());
    }

    public final boolean j0(int i10) {
        return k0(i10, this.f25372t);
    }

    public final Object j1(Object obj) {
        if (this.f25366n <= 0 || this.f25361i == this.f25363k) {
            return F0(obj);
        }
        x xVar = this.f25371s;
        AbstractC1457h abstractC1457h = null;
        int i10 = 1;
        int i11 = 0;
        if (xVar == null) {
            xVar = new x(i11, i10, abstractC1457h);
        }
        this.f25371s = xVar;
        int i12 = this.f25374v;
        Object objC = xVar.c(i12);
        if (objC == null) {
            objC = new D(i11, i10, abstractC1457h);
            xVar.s(i12, objC);
        }
        ((D) objC).e(obj);
        return InterfaceC1690l.f25468a.a();
    }

    public final boolean k0(int i10, int i11) {
        int iC;
        int iX;
        if (i11 == this.f25374v) {
            iX = this.f25373u;
        } else if (i11 <= this.f25368p.h(0) && (iC = this.f25368p.c(i11)) >= 0) {
            iX = (X() - this.f25360h) - this.f25369q.f(iC);
        } else {
            int iI0 = i0(i11);
            iX = iI0 + i11;
        }
        return i10 > i11 && i10 < iX;
    }

    public final boolean l0(int i10) {
        int i11 = this.f25374v;
        if (i10 <= i11 || i10 >= this.f25373u) {
            return i11 == 0 && i10 == 0;
        }
        return true;
    }

    public final void l1(Object obj) {
        int iF0 = f0(this.f25372t);
        if (!N0.J(this.f25354b, iF0)) {
            AbstractC1696o.r("Updating the data of a group that was not created with a data slot");
        }
        this.f25355c[Q(G(this.f25354b, iF0))] = obj;
    }

    public final boolean o0() {
        int i10 = this.f25372t;
        return i10 < this.f25373u && N0.N(this.f25354b, f0(i10));
    }

    public final boolean p0(int i10) {
        return N0.N(this.f25354b, f0(i10));
    }

    public final void p1(Object obj) {
        q1(this.f25372t, obj);
    }

    public final void q0(int i10) {
        int iF0 = f0(i10);
        if (N0.K(this.f25354b, iF0)) {
            return;
        }
        N0.Z(this.f25354b, iF0, true);
        if (N0.D(this.f25354b, iF0)) {
            return;
        }
        m1(B0(i10));
    }

    public final void r1() {
        this.f25357e = this.f25353a.u();
        this.f25358f = this.f25353a.p();
    }

    public final List t0(L0 l9, int i10, boolean z9) {
        boolean z10 = false;
        AbstractC1696o.M(this.f25366n > 0 ? true : z10);
        if (i10 != 0 || this.f25372t != 0 || this.f25353a.r() != 0 || N0.I(l9.q(), i10) != l9.r()) {
            O0 o0Z = l9.z();
            try {
                return f25351y.b(o0Z, i10, this, true, true, z9);
            } finally {
                o0Z.K(z10);
            }
        }
        int[] iArr = this.f25354b;
        Object[] objArr = this.f25355c;
        ArrayList arrayList = this.f25356d;
        HashMap map = this.f25357e;
        x xVar = this.f25358f;
        int[] iArrQ = l9.q();
        int iR = l9.r();
        Object[] objArrS = l9.s();
        int iT = l9.t();
        HashMap mapU = l9.u();
        x xVarP = l9.p();
        this.f25354b = iArrQ;
        this.f25355c = objArrS;
        this.f25356d = l9.o();
        this.f25359g = iR;
        this.f25360h = (iArrQ.length / 5) - iR;
        this.f25363k = iT;
        this.f25364l = objArrS.length - iT;
        this.f25365m = iR;
        this.f25357e = mapU;
        this.f25358f = xVarP;
        l9.B(iArr, 0, objArr, 0, arrayList, map, xVar);
        return this.f25356d;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f25372t + " end=" + this.f25373u + " size = " + b0() + " gap=" + this.f25359g + '-' + (this.f25359g + this.f25360h) + ')';
    }

    public final void u0(int i10) {
        boolean z9 = true;
        if (!(this.f25366n == 0)) {
            AbstractC1696o.r("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            AbstractC1696o.r("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f25372t;
        int i12 = this.f25374v;
        int i13 = this.f25373u;
        int I9 = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            I9 += N0.I(this.f25354b, f0(I9));
            if (!(I9 <= i13)) {
                AbstractC1696o.r("Parameter offset is out of bounds");
            }
        }
        int I10 = N0.I(this.f25354b, f0(I9));
        int iP = P(this.f25354b, f0(this.f25372t));
        int iP2 = P(this.f25354b, f0(I9));
        int i15 = I9 + I10;
        int iP3 = P(this.f25354b, f0(i15));
        int i16 = iP3 - iP2;
        n0(i16, Math.max(this.f25372t - 1, 0));
        m0(I10);
        int[] iArr = this.f25354b;
        int iF0 = f0(i15) * 5;
        AbstractC1439m.f(iArr, iArr, f0(i11) * 5, iF0, (I10 * 5) + iF0);
        if (i16 > 0) {
            Object[] objArr = this.f25355c;
            AbstractC1439m.h(objArr, objArr, iP, Q(iP2 + i16), Q(iP3 + i16));
        }
        int i17 = iP2 + i16;
        int i18 = i17 - iP;
        int i19 = this.f25363k;
        int i20 = this.f25364l;
        int length = this.f25355c.length;
        int i21 = this.f25365m;
        int i22 = i11 + I10;
        int i23 = i11;
        while (i23 < i22) {
            boolean z10 = z9;
            int iF1 = f0(i23);
            int i24 = i23;
            int i25 = i18;
            o1(iArr, iF1, R(P(iArr, iF1) - i18, i21 < iF1 ? 0 : i19, i20, length));
            i23 = i24 + 1;
            z9 = z10;
            i18 = i25;
        }
        s0(i15, i11, I10);
        if (J0(i15, I10)) {
            AbstractC1696o.r("Unexpectedly removed anchors");
        }
        W(i12, this.f25373u, i11);
        if (i16 > 0) {
            K0(i17, i16, i15 - 1);
        }
    }

    public final List w0(int i10, L0 l9, int i11) {
        AbstractC1696o.M(this.f25366n <= 0 && i0(this.f25372t + i10) == 1);
        int i12 = this.f25372t;
        int i13 = this.f25361i;
        int i14 = this.f25362j;
        C(i10);
        d1();
        H();
        O0 o0Z = l9.z();
        try {
            List listC = a.c(f25351y, o0Z, i11, this, false, true, false, 32, null);
            o0Z.K(true);
            T();
            S();
            this.f25372t = i12;
            this.f25361i = i13;
            this.f25362j = i14;
            return listC;
        } catch (Throwable th) {
            o0Z.K(false);
            throw th;
        }
    }

    public final Object y0(int i10) {
        int iF0 = f0(i10);
        if (N0.N(this.f25354b, iF0)) {
            return this.f25355c[Q(A0(this.f25354b, iF0))];
        }
        return null;
    }

    public final int z0(int i10) {
        return N0.Q(this.f25354b, f0(i10));
    }
}
