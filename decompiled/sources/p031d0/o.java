package p031d0;

import B8.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return n.c(d(i10, i11));
    }

    public static final long c(long j9, int i10, int i11) {
        int iM = h.m(n.j(j9), i10, i11);
        int iM2 = h.m(n.g(j9), i10, i11);
        return (iM == n.j(j9) && iM2 == n.g(j9)) ? j9 : b(iM, iM2);
    }

    private static final long d(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        if (i11 >= 0) {
            return (((long) i11) & 4294967295L) | (((long) i10) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }
}
