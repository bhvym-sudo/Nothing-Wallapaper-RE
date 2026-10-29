package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final long a(float f10, float f11) {
        return g.e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final boolean b(long j9) {
        long j10 = (j9 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j10) & (j10 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean c(long j9) {
        return (j9 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean d(long j9) {
        return (j9 & 9223372034707292159L) == 9205357640488583168L;
    }
}
