package p111l0;

import H.m;
import H.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final long a(int i10, int i11) {
        return q.b((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j9) {
        int iRound = Math.round(m.f(j9));
        return q.b((((long) Math.round(m.e(j9))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long c(long j9) {
        return n.a(q.e(j9), q.d(j9));
    }
}
