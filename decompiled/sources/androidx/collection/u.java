package androidx.collection;

import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC1025e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11367e;

    public u(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            p150p.d.a("Capacity must be a positive value.");
        }
        g(M.g(i10));
    }

    private final void e() {
        this.f11367e = M.c(b()) - this.f11316d;
    }

    private final void f(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = M.f11286a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC1439m.s(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f11313a = jArr;
        int i11 = i10 >> 3;
        long j9 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        e();
    }

    private final void g(int i10) {
        int iMax = i10 > 0 ? Math.max(7, M.f(i10)) : 0;
        this.f11315c = iMax;
        f(iMax);
        this.f11314b = new float[iMax];
    }
}
