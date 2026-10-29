package A;

import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f34b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f35c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f36d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37e;

    public m() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f36d = iArr;
    }

    private final int b() {
        int length = this.f36d.length;
        if (this.f37e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            AbstractC1439m.k(this.f36d, iArr, 0, 0, 0, 14, null);
            this.f36d = iArr;
        }
        int i13 = this.f37e;
        this.f37e = this.f36d[i13];
        return i13;
    }

    private final void c(int i10) {
        int[] iArr = this.f34b;
        int length = iArr.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        AbstractC1439m.k(iArr, iArr2, 0, 0, 0, 14, null);
        AbstractC1439m.k(this.f35c, iArr3, 0, 0, 0, 14, null);
        this.f34b = iArr2;
        this.f35c = iArr3;
    }

    private final void d(int i10) {
        this.f36d[i10] = this.f37e;
        this.f37e = i10;
    }

    private final void g(int i10) {
        int i11;
        int[] iArr = this.f34b;
        int i12 = this.f33a >> 1;
        while (i10 < i12) {
            int i13 = (i10 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.f33a || (i11 = iArr[i13]) >= iArr[i14]) {
                if (iArr[i14] >= iArr[i10]) {
                    return;
                }
                i(i14, i10);
                i10 = i14;
            } else {
                if (i11 >= iArr[i10]) {
                    return;
                }
                i(i13, i10);
                i10 = i13;
            }
        }
    }

    private final void h(int i10) {
        int[] iArr = this.f34b;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] <= i11) {
                return;
            }
            i(i12, i10);
            i10 = i12;
        }
    }

    private final void i(int i10, int i11) {
        int[] iArr = this.f34b;
        int[] iArr2 = this.f35c;
        int[] iArr3 = this.f36d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    public final int a(int i10) {
        c(this.f33a + 1);
        int i11 = this.f33a;
        this.f33a = i11 + 1;
        int iB = b();
        this.f34b[i11] = i10;
        this.f35c[i11] = iB;
        this.f36d[iB] = i11;
        h(i11);
        return iB;
    }

    public final int e(int i10) {
        return this.f33a > 0 ? this.f34b[0] : i10;
    }

    public final void f(int i10) {
        int i11 = this.f36d[i10];
        i(i11, this.f33a - 1);
        this.f33a--;
        h(i11);
        g(i11);
        d(i10);
    }
}
