package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n0 f12534f = new n0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f12536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f12537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12539e;

    private n0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f12536b;
        if (i10 > iArr.length) {
            int i11 = this.f12535a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f12536b = Arrays.copyOf(iArr, i10);
            this.f12537c = Arrays.copyOf(this.f12537c, i10);
        }
    }

    public static n0 c() {
        return f12534f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static n0 j(n0 n0Var, n0 n0Var2) {
        int i10 = n0Var.f12535a + n0Var2.f12535a;
        int[] iArrCopyOf = Arrays.copyOf(n0Var.f12536b, i10);
        System.arraycopy(n0Var2.f12536b, 0, iArrCopyOf, n0Var.f12535a, n0Var2.f12535a);
        Object[] objArrCopyOf = Arrays.copyOf(n0Var.f12537c, i10);
        System.arraycopy(n0Var2.f12537c, 0, objArrCopyOf, n0Var.f12535a, n0Var2.f12535a);
        return new n0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static n0 k() {
        return new n0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, s0 s0Var) {
        int iA = r0.a(i10);
        int iB = r0.b(i10);
        if (iB == 0) {
            s0Var.p(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            s0Var.h(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            s0Var.w(iA, (AbstractC1097g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C1115z.e());
            }
            s0Var.d(iA, ((Integer) obj).intValue());
        } else if (s0Var.i() == s0.a.ASCENDING) {
            s0Var.s(iA);
            ((n0) obj).r(s0Var);
            s0Var.F(iA);
        } else {
            s0Var.F(iA);
            ((n0) obj).r(s0Var);
            s0Var.s(iA);
        }
    }

    void a() {
        if (!this.f12539e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iR;
        int i10 = this.f12538d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12535a; i12++) {
            int i13 = this.f12536b[i12];
            int iA = r0.a(i13);
            int iB = r0.b(i13);
            if (iB == 0) {
                iR = AbstractC1100j.R(iA, ((Long) this.f12537c[i12]).longValue());
            } else if (iB == 1) {
                iR = AbstractC1100j.n(iA, ((Long) this.f12537c[i12]).longValue());
            } else if (iB == 2) {
                iR = AbstractC1100j.f(iA, (AbstractC1097g) this.f12537c[i12]);
            } else if (iB == 3) {
                iR = (AbstractC1100j.O(iA) * 2) + ((n0) this.f12537c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C1115z.e());
                }
                iR = AbstractC1100j.l(iA, ((Integer) this.f12537c[i12]).intValue());
            }
            i11 += iR;
        }
        this.f12538d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f12538d;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f12535a; i11++) {
            iD += AbstractC1100j.D(r0.a(this.f12536b[i11]), (AbstractC1097g) this.f12537c[i11]);
        }
        this.f12538d = iD;
        return iD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i10 = this.f12535a;
        return i10 == n0Var.f12535a && o(this.f12536b, n0Var.f12536b, i10) && l(this.f12537c, n0Var.f12537c, this.f12535a);
    }

    public void h() {
        if (this.f12539e) {
            this.f12539e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f12535a;
        return ((((527 + i10) * 31) + f(this.f12536b, i10)) * 31) + g(this.f12537c, this.f12535a);
    }

    n0 i(n0 n0Var) {
        if (n0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f12535a + n0Var.f12535a;
        b(i10);
        System.arraycopy(n0Var.f12536b, 0, this.f12536b, this.f12535a, n0Var.f12535a);
        System.arraycopy(n0Var.f12537c, 0, this.f12537c, this.f12535a, n0Var.f12535a);
        this.f12535a = i10;
        return this;
    }

    final void m(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f12535a; i11++) {
            S.d(sb, i10, String.valueOf(r0.a(this.f12536b[i11])), this.f12537c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f12535a + 1);
        int[] iArr = this.f12536b;
        int i11 = this.f12535a;
        iArr[i11] = i10;
        this.f12537c[i11] = obj;
        this.f12535a = i11 + 1;
    }

    void p(s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            for (int i10 = this.f12535a - 1; i10 >= 0; i10--) {
                s0Var.c(r0.a(this.f12536b[i10]), this.f12537c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f12535a; i11++) {
            s0Var.c(r0.a(this.f12536b[i11]), this.f12537c[i11]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f12535a == 0) {
            return;
        }
        if (s0Var.i() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f12535a; i10++) {
                q(this.f12536b[i10], this.f12537c[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f12535a - 1; i11 >= 0; i11--) {
            q(this.f12536b[i11], this.f12537c[i11], s0Var);
        }
    }

    private n0(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f12538d = -1;
        this.f12535a = i10;
        this.f12536b = iArr;
        this.f12537c = objArr;
        this.f12539e = z9;
    }
}
