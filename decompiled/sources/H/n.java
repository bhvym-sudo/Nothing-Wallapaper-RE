package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final long a(float f10, float f11) {
        return m.c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(long j9) {
        if (j9 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        return h.a(Float.intBitsToFloat((int) (j9 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j9 & 4294967295L)) / 2.0f);
    }

    public static final i c(long j9) {
        return j.a(g.f2287b.c(), j9);
    }
}
