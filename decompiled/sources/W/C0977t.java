package W;

import java.util.Arrays;

/* JADX INFO: renamed from: W.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0977t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f8622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8623b;

    public C0977t(int i10) {
        this.f8622a = new int[i10];
    }

    private final boolean a(int i10, int i11) {
        int[] iArr = this.f8622a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        return i12 < i13 || (i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1]);
    }

    private final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                k(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        k(i14, i11);
        return i14;
    }

    private final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iE = e(i10, i11, i12);
            i(i10, iE - i12, i12);
            i(iE + i12, i11, i12);
        }
    }

    private final void k(int i10, int i11) {
        int[] iArr = this.f8622a;
        P.i(iArr, i10, i11);
        P.i(iArr, i10 + 1, i11 + 1);
        P.i(iArr, i10 + 2, i11 + 2);
    }

    public final int b(int i10) {
        return this.f8622a[i10];
    }

    public final int c() {
        return this.f8623b;
    }

    public final boolean d() {
        return this.f8623b != 0;
    }

    public final int f() {
        int[] iArr = this.f8622a;
        int i10 = this.f8623b - 1;
        this.f8623b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f8623b;
        int i14 = i13 + 3;
        int[] iArr = this.f8622a;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f8622a = iArrCopyOf;
        }
        int[] iArr2 = this.f8622a;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f8623b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f8623b;
        int i15 = i14 + 4;
        int[] iArr = this.f8622a;
        if (i15 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f8622a = iArrCopyOf;
        }
        int[] iArr2 = this.f8622a;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f8623b = i15;
    }

    public final void j() {
        int i10 = this.f8623b;
        if (!(i10 % 3 == 0)) {
            T.a.b("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }
}
