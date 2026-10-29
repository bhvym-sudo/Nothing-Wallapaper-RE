package W;

/* JADX INFO: renamed from: W.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0971m {
    public static final int a(long j9, long j10) {
        boolean zD = d(j9);
        if (zD != d(j10)) {
            return zD ? -1 : 1;
        }
        return (int) Math.signum(c(j9) - c(j10));
    }

    public static long b(long j9) {
        return j9;
    }

    public static final float c(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final boolean d(long j9) {
        return ((int) (j9 & 4294967295L)) != 0;
    }
}
