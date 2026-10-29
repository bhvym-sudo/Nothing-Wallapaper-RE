package p111l0;

import H.g;
import H.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final long a(int i10, int i11) {
        return m.b((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j9, long j10) {
        return h.a(g.k(j9) - m.d(j10), g.l(j9) - m.e(j10));
    }

    public static final long c(long j9, long j10) {
        return h.a(g.k(j9) + m.d(j10), g.l(j9) + m.e(j10));
    }

    public static final long d(long j9) {
        int iRound = Math.round(g.k(j9));
        return m.b((((long) Math.round(g.l(j9))) & 4294967295L) | (((long) iRound) << 32));
    }
}
