package p111l0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22843b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w[] f22844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f22845d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22846a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return u.f22845d;
        }

        private a() {
        }
    }

    static {
        w.a aVar = w.f22847b;
        f22844c = new w[]{w.d(aVar.c()), w.d(aVar.b()), w.d(aVar.a())};
        f22845d = v.c(0L, Float.NaN);
    }

    private /* synthetic */ u(long j9) {
        this.f22846a = j9;
    }

    public static final /* synthetic */ u b(long j9) {
        return new u(j9);
    }

    public static long c(long j9) {
        return j9;
    }

    public static boolean d(long j9, Object obj) {
        return (obj instanceof u) && j9 == ((u) obj).k();
    }

    public static final boolean e(long j9, long j10) {
        return j9 == j10;
    }

    public static final long f(long j9) {
        return j9 & 1095216660480L;
    }

    public static final long g(long j9) {
        return f22844c[(int) (f(j9) >>> 32)].j();
    }

    public static final float h(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static int i(long j9) {
        return Long.hashCode(j9);
    }

    public static String j(long j9) {
        long jG = g(j9);
        w.a aVar = w.f22847b;
        if (w.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (w.g(jG, aVar.b())) {
            return h(j9) + ".sp";
        }
        if (!w.g(jG, aVar.a())) {
            return "Invalid";
        }
        return h(j9) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.f22846a, obj);
    }

    public int hashCode() {
        return i(this.f22846a);
    }

    public final /* synthetic */ long k() {
        return this.f22846a;
    }

    public String toString() {
        return j(this.f22846a);
    }
}
