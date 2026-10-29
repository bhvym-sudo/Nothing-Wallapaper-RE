package p170r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f25311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f25312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object[] f25314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap f25316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Q f25321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25325o;

    public K0(L0 l9) {
        this.f25311a = l9;
        this.f25312b = l9.q();
        int iR = l9.r();
        this.f25313c = iR;
        this.f25314d = l9.s();
        this.f25315e = l9.t();
        this.f25319i = iR;
        this.f25320j = -1;
        this.f25321k = new Q();
    }

    private final Object L(int[] iArr, int i10) {
        return N0.N(iArr, i10) ? this.f25314d[N0.R(iArr, i10)] : InterfaceC1690l.f25468a.a();
    }

    private final Object N(int[] iArr, int i10) {
        if (N0.L(iArr, i10)) {
            return this.f25314d[N0.S(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return N0.J(iArr, i10) ? this.f25314d[N0.B(iArr, i10)] : InterfaceC1690l.f25468a.a();
    }

    public final Object A(int i10, int i11) {
        int iV = N0.V(this.f25312b, i10);
        int i12 = i10 + 1;
        int i13 = iV + i11;
        return i13 < (i12 < this.f25313c ? N0.F(this.f25312b, i12) : this.f25315e) ? this.f25314d[i13] : InterfaceC1690l.f25468a.a();
    }

    public final int B(int i10) {
        return N0.O(this.f25312b, i10);
    }

    public final Object C(int i10) {
        return N(this.f25312b, i10);
    }

    public final int D(int i10) {
        return N0.I(this.f25312b, i10);
    }

    public final boolean E(int i10) {
        return N0.K(this.f25312b, i10);
    }

    public final boolean F(int i10) {
        return N0.L(this.f25312b, i10);
    }

    public final boolean G() {
        return s() || this.f25318h == this.f25319i;
    }

    public final boolean H() {
        return N0.N(this.f25312b, this.f25318h);
    }

    public final boolean I(int i10) {
        return N0.N(this.f25312b, i10);
    }

    public final Object J() {
        int i10;
        if (this.f25322l > 0 || (i10 = this.f25323m) >= this.f25324n) {
            this.f25325o = false;
            return InterfaceC1690l.f25468a.a();
        }
        this.f25325o = true;
        Object[] objArr = this.f25314d;
        this.f25323m = i10 + 1;
        return objArr[i10];
    }

    public final Object K(int i10) {
        if (N0.N(this.f25312b, i10)) {
            return L(this.f25312b, i10);
        }
        return null;
    }

    public final int M(int i10) {
        return N0.Q(this.f25312b, i10);
    }

    public final int O(int i10) {
        return N0.T(this.f25312b, i10);
    }

    public final void P(int i10) {
        if (!(this.f25322l == 0)) {
            AbstractC1696o.r("Cannot reposition while in an empty region");
        }
        this.f25318h = i10;
        int iT = i10 < this.f25313c ? N0.T(this.f25312b, i10) : -1;
        this.f25320j = iT;
        if (iT < 0) {
            this.f25319i = this.f25313c;
        } else {
            this.f25319i = iT + N0.I(this.f25312b, iT);
        }
        this.f25323m = 0;
        this.f25324n = 0;
    }

    public final void Q(int i10) {
        int I9 = N0.I(this.f25312b, i10) + i10;
        int i11 = this.f25318h;
        if (!(i11 >= i10 && i11 <= I9)) {
            AbstractC1696o.r("Index " + i10 + " is not a parent of " + i11);
        }
        this.f25320j = i10;
        this.f25319i = I9;
        this.f25323m = 0;
        this.f25324n = 0;
    }

    public final int R() {
        if (!(this.f25322l == 0)) {
            AbstractC1696o.r("Cannot skip while in an empty region");
        }
        int iQ = N0.N(this.f25312b, this.f25318h) ? 1 : N0.Q(this.f25312b, this.f25318h);
        int i10 = this.f25318h;
        this.f25318h = i10 + N0.I(this.f25312b, i10);
        return iQ;
    }

    public final void S() {
        if (!(this.f25322l == 0)) {
            AbstractC1696o.r("Cannot skip the enclosing group while in an empty region");
        }
        this.f25318h = this.f25319i;
        this.f25323m = 0;
        this.f25324n = 0;
    }

    public final void T() {
        if (this.f25322l <= 0) {
            int i10 = this.f25320j;
            int i11 = this.f25318h;
            if (!(N0.T(this.f25312b, i11) == i10)) {
                AbstractC1701q0.a("Invalid slot table detected");
            }
            HashMap map = this.f25316f;
            if (map != null) {
            }
            Q q9 = this.f25321k;
            int i12 = this.f25323m;
            int i13 = this.f25324n;
            if (i12 == 0 && i13 == 0) {
                q9.j(-1);
            } else {
                q9.j(i12);
            }
            this.f25320j = i11;
            this.f25319i = N0.I(this.f25312b, i11) + i11;
            int i14 = i11 + 1;
            this.f25318h = i14;
            this.f25323m = N0.V(this.f25312b, i11);
            this.f25324n = i11 >= this.f25313c - 1 ? this.f25315e : N0.F(this.f25312b, i14);
        }
    }

    public final void U() {
        if (this.f25322l <= 0) {
            if (!N0.N(this.f25312b, this.f25318h)) {
                AbstractC1701q0.a("Expected a node group");
            }
            T();
        }
    }

    public final C1674d a(int i10) {
        ArrayList arrayListO = this.f25311a.o();
        int iU = N0.U(arrayListO, i10, this.f25313c);
        if (iU >= 0) {
            return (C1674d) arrayListO.get(iU);
        }
        C1674d c1674d = new C1674d(i10);
        arrayListO.add(-(iU + 1), c1674d);
        return c1674d;
    }

    public final void c() {
        this.f25322l++;
    }

    public final void d() {
        this.f25317g = true;
        this.f25311a.f(this, this.f25316f);
    }

    public final boolean e(int i10) {
        return N0.D(this.f25312b, i10);
    }

    public final void f() {
        if (!(this.f25322l > 0)) {
            AbstractC1701q0.a("Unbalanced begin/end empty");
        }
        this.f25322l--;
    }

    public final void g() {
        if (this.f25322l == 0) {
            if (!(this.f25318h == this.f25319i)) {
                AbstractC1696o.r("endGroup() not called at the end of a group");
            }
            int iT = N0.T(this.f25312b, this.f25320j);
            this.f25320j = iT;
            this.f25319i = iT < 0 ? this.f25313c : N0.I(this.f25312b, iT) + iT;
            int i10 = this.f25321k.i();
            if (i10 < 0) {
                this.f25323m = 0;
                this.f25324n = 0;
            } else {
                this.f25323m = i10;
                this.f25324n = iT >= this.f25313c - 1 ? this.f25315e : N0.F(this.f25312b, iT + 1);
            }
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        if (this.f25322l <= 0) {
            int i10 = 0;
            int I9 = this.f25318h;
            while (true) {
                int i11 = i10;
                if (I9 >= this.f25319i) {
                    break;
                }
                i10 = i11 + 1;
                arrayList.add(new V(N0.O(this.f25312b, I9), N(this.f25312b, I9), I9, N0.N(this.f25312b, I9) ? 1 : N0.Q(this.f25312b, I9), i11));
                I9 += N0.I(this.f25312b, I9);
            }
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f25317g;
    }

    public final int j() {
        return this.f25318h;
    }

    public final Object k() {
        int i10 = this.f25318h;
        if (i10 < this.f25319i) {
            return b(this.f25312b, i10);
        }
        return 0;
    }

    public final int l() {
        return this.f25319i;
    }

    public final int m() {
        int i10 = this.f25318h;
        if (i10 < this.f25319i) {
            return N0.O(this.f25312b, i10);
        }
        return 0;
    }

    public final Object n() {
        int i10 = this.f25318h;
        if (i10 < this.f25319i) {
            return N(this.f25312b, i10);
        }
        return null;
    }

    public final int o() {
        return N0.I(this.f25312b, this.f25318h);
    }

    public final int p() {
        return this.f25323m - N0.V(this.f25312b, this.f25320j);
    }

    public final boolean q() {
        return this.f25325o;
    }

    public final boolean r() {
        int i10 = this.f25318h;
        return i10 < this.f25319i && N0.L(this.f25312b, i10);
    }

    public final boolean s() {
        return this.f25322l > 0;
    }

    public final int t() {
        return this.f25320j;
    }

    public String toString() {
        return "SlotReader(current=" + this.f25318h + ", key=" + m() + ", parent=" + this.f25320j + ", end=" + this.f25319i + ')';
    }

    public final int u() {
        int i10 = this.f25320j;
        if (i10 >= 0) {
            return N0.Q(this.f25312b, i10);
        }
        return 0;
    }

    public final int v() {
        return this.f25324n - this.f25323m;
    }

    public final int w() {
        return this.f25313c;
    }

    public final L0 x() {
        return this.f25311a;
    }

    public final Object y(int i10) {
        return b(this.f25312b, i10);
    }

    public final Object z(int i10) {
        return A(this.f25318h, i10);
    }
}
