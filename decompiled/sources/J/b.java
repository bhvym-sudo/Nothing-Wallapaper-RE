package J;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3401a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f3402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f3403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f3404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f3405e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return b.f3404d;
        }

        public final long b() {
            return b.f3402b;
        }

        public final long c() {
            return b.f3403c;
        }

        private a() {
        }
    }

    static {
        long j9 = 3;
        long j10 = j9 << 32;
        f3402b = d((((long) 0) & 4294967295L) | j10);
        f3403c = d((((long) 1) & 4294967295L) | j10);
        f3404d = d(j10 | (((long) 2) & 4294967295L));
        f3405e = d((j9 & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j9) {
        return j9;
    }

    public static final boolean e(long j9, long j10) {
        return j9 == j10;
    }

    public static final int f(long j9) {
        return (int) (j9 >> 32);
    }

    public static int g(long j9) {
        return Long.hashCode(j9);
    }

    public static String h(long j9) {
        if (e(j9, f3402b)) {
            return "Rgb";
        }
        if (e(j9, f3403c)) {
            return "Xyz";
        }
        if (e(j9, f3404d)) {
            return "Lab";
        }
        return e(j9, f3405e) ? "Cmyk" : "Unknown";
    }
}
