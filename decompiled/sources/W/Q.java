package W;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f8458b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p190t.b[] f8459c = new p190t.b[16];

    public final boolean a() {
        int i10 = this.f8457a;
        return i10 > 0 && this.f8458b[i10 - 1] >= 0;
    }

    public final Object b() {
        int i10 = this.f8457a;
        if (i10 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i11 = i10 - 1;
        int i12 = this.f8458b[i11];
        p190t.b bVar = this.f8459c[i11];
        kotlin.jvm.internal.n.e(bVar);
        if (i12 > 0) {
            int[] iArr = this.f8458b;
            iArr[i11] = iArr[i11] - 1;
        } else if (i12 == 0) {
            this.f8459c[i11] = null;
            this.f8457a--;
        }
        return bVar.o()[i12];
    }

    public final void c(p190t.b bVar) {
        if (bVar.r()) {
            return;
        }
        int i10 = this.f8457a;
        int[] iArr = this.f8458b;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.n.g(iArrCopyOf, "copyOf(this, newSize)");
            this.f8458b = iArrCopyOf;
            p190t.b[] bVarArr = this.f8459c;
            Object[] objArrCopyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
            kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(this, newSize)");
            this.f8459c = (p190t.b[]) objArrCopyOf;
        }
        this.f8458b[i10] = bVar.p() - 1;
        this.f8459c[i10] = bVar;
        this.f8457a++;
    }
}
