package A;

import p089i8.AbstractC1439m;
import p170r.AbstractC1672c;
import p170r.h1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f97a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f98b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h1[] f99c = new h1[16];

    private final int b(Object obj, int i10) {
        int i11 = this.f97a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f98b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    h1 h1Var = this.f99c[i13];
                    return obj == (h1Var != null ? h1Var.get() : null) ? i13 : c(i13, obj, i10);
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i10, Object obj, int i11) {
        int i12 = i10 - 1;
        while (true) {
            if (-1 >= i12 || this.f98b[i12] != i11) {
                break;
            }
            h1 h1Var = this.f99c[i12];
            if ((h1Var != null ? h1Var.get() : null) == obj) {
                return i12;
            }
            i12--;
        }
        int i13 = this.f97a;
        for (int i14 = i10 + 1; i14 < i13; i14++) {
            if (this.f98b[i14] != i11) {
                return -(i14 + 1);
            }
            h1 h1Var2 = this.f99c[i14];
            if ((h1Var2 != null ? h1Var2.get() : null) == obj) {
                return i14;
            }
        }
        return -(this.f97a + 1);
    }

    public final boolean a(Object obj) {
        int iB;
        int i10 = this.f97a;
        int iC = AbstractC1672c.c(obj);
        if (i10 > 0) {
            iB = b(obj, iC);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i11 = -(iB + 1);
        h1[] h1VarArr = this.f99c;
        int length = h1VarArr.length;
        if (i10 == length) {
            int i12 = length * 2;
            h1[] h1VarArr2 = new h1[i12];
            int[] iArr = new int[i12];
            int i13 = i11 + 1;
            AbstractC1439m.h(h1VarArr, h1VarArr2, i13, i11, i10);
            AbstractC1439m.l(this.f99c, h1VarArr2, 0, 0, i11, 6, null);
            AbstractC1439m.f(this.f98b, iArr, i13, i11, i10);
            AbstractC1439m.k(this.f98b, iArr, 0, 0, i11, 6, null);
            this.f99c = h1VarArr2;
            this.f98b = iArr;
        } else {
            int i14 = i11 + 1;
            AbstractC1439m.h(h1VarArr, h1VarArr, i14, i11, i10);
            int[] iArr2 = this.f98b;
            AbstractC1439m.f(iArr2, iArr2, i14, i11, i10);
        }
        this.f99c[i11] = new h1(obj);
        this.f98b[i11] = iC;
        this.f97a++;
        return true;
    }

    public final int[] d() {
        return this.f98b;
    }

    public final int e() {
        return this.f97a;
    }

    public final h1[] f() {
        return this.f99c;
    }

    public final void g(int i10) {
        this.f97a = i10;
    }
}
