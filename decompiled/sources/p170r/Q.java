package p170r;

import java.util.Arrays;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f25379a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25380b;

    public final void a() {
        this.f25380b = 0;
    }

    public final int b() {
        return this.f25380b;
    }

    public final int c(int i10) {
        int i11 = this.f25380b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f25379a[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f25380b == 0;
    }

    public final int e() {
        return this.f25379a[this.f25380b - 1];
    }

    public final int f(int i10) {
        return this.f25379a[i10];
    }

    public final int g() {
        return this.f25379a[this.f25380b - 2];
    }

    public final int h(int i10) {
        return this.f25380b > 0 ? e() : i10;
    }

    public final int i() {
        int[] iArr = this.f25379a;
        int i10 = this.f25380b - 1;
        this.f25380b = i10;
        return iArr[i10];
    }

    public final void j(int i10) {
        int i11 = this.f25380b;
        int[] iArr = this.f25379a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f25379a = iArrCopyOf;
        }
        int[] iArr2 = this.f25379a;
        int i12 = this.f25380b;
        this.f25380b = i12 + 1;
        iArr2[i12] = i10;
    }
}
