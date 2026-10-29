package H;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2287b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f2288c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f2289d = e(9187343241974906880L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f2290e = e(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2291a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return g.f2289d;
        }

        public final long b() {
            return g.f2290e;
        }

        public final long c() {
            return g.f2288c;
        }

        private a() {
        }
    }

    private /* synthetic */ g(long j9) {
        this.f2291a = j9;
    }

    public static final /* synthetic */ g d(long j9) {
        return new g(j9);
    }

    public static long e(long j9) {
        return j9;
    }

    public static final long f(long j9, float f10, float f11) {
        return e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public static /* synthetic */ long g(long j9, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j9 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j9));
        }
        return f(j9, f10, f11);
    }

    public static boolean h(long j9, Object obj) {
        return (obj instanceof g) && j9 == ((g) obj).s();
    }

    public static final boolean i(long j9, long j10) {
        return j9 == j10;
    }

    public static final float j(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    public static final float k(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float l(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static int m(long j9) {
        return Long.hashCode(j9);
    }

    public static final boolean n(long j9) {
        long j10 = j9 & 9223372034707292159L;
        return (((~j10) & (j10 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long o(long j9, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long p(long j9, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat((int) (j10 & 4294967295L));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static String q(long j9) {
        if (!h.c(j9)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(k(j9), 1) + ", " + c.a(l(j9), 1) + ')';
    }

    public static final long r(long j9) {
        return e(j9 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return h(this.f2291a, obj);
    }

    public int hashCode() {
        return m(this.f2291a);
    }

    public final /* synthetic */ long s() {
        return this.f2291a;
    }

    public String toString() {
        return q(this.f2291a);
    }
}
