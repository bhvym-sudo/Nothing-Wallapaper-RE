package H;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2308a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f2309b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f2310c = c(9205357640488583168L);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return m.f2310c;
        }

        public final long b() {
            return m.f2309b;
        }

        private a() {
        }
    }

    public static long c(long j9) {
        return j9;
    }

    public static final boolean d(long j9, long j10) {
        return j9 == j10;
    }

    public static final float e(long j9) {
        if (j9 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final float f(long j9) {
        if (j9 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static int g(long j9) {
        return Long.hashCode(j9);
    }

    public static String h(long j9) {
        if (j9 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(f(j9), 1) + ", " + c.a(e(j9), 1) + ')';
    }
}
