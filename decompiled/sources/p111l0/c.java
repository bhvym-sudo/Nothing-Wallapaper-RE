package p111l0;

import B8.h;
import p079h8.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        boolean z9 = false;
        if (!(i11 >= i10)) {
            l.a("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')');
        }
        if (!(i13 >= i12)) {
            l.a("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')');
        }
        if (i10 >= 0 && i12 >= 0) {
            z9 = true;
        }
        if (!z9) {
            l.a("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0");
        }
        return g(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    private static final int d(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final int e(long j9, int i10) {
        return h.m(i10, b.i(j9), b.g(j9));
    }

    public static final int f(long j9, int i10) {
        return h.m(i10, b.j(j9), b.h(j9));
    }

    public static final long g(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iD = d(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iD2 = d(i15);
        if (iD + iD2 > 31) {
            h(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i16 & (~(i16 >> 31));
        int i18 = i13 + 1;
        int i19 = i18 & (~(i18 >> 31));
        int i20 = 0;
        if (iD2 != 13) {
            if (iD2 == 18) {
                i20 = 3;
            } else if (iD2 == 15) {
                i20 = 1;
            } else if (iD2 == 16) {
                i20 = 2;
            }
        }
        int i21 = ((i20 & 1) << 1) + (((i20 & 2) >> 1) * 3);
        return b.b((((long) i17) << 33) | ((long) i20) | (((long) i10) << 2) | (((long) i12) << (i21 + 15)) | (((long) i19) << (i21 + 46)));
    }

    private static final void h(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    private static final Void i(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(int i10) {
        if (i10 < 8191) {
            return 262142;
        }
        if (i10 < 32767) {
            return 65534;
        }
        if (i10 < 65535) {
            return 32766;
        }
        if (i10 < 262143) {
            return 8190;
        }
        i(i10);
        throw new f();
    }
}
