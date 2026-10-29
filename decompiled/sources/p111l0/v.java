package p111l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final long a(float f10, long j9) {
        return c(j9, f10);
    }

    public static final long b(int i10) {
        return c(4294967296L, i10);
    }

    public static final long c(long j9, float f10) {
        return u.c(j9 | (((long) Float.floatToIntBits(f10)) & 4294967295L));
    }
}
