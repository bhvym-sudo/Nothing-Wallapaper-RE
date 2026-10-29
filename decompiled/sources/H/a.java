package H;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0095a f2281a = new C0095a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f2282b = b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: H.a$a, reason: collision with other inner class name */
    public static final class C0095a {
        public /* synthetic */ C0095a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return a.f2282b;
        }

        private C0095a() {
        }
    }

    public static long b(long j9) {
        return j9;
    }

    public static final boolean c(long j9, long j10) {
        return j9 == j10;
    }

    public static final float d(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float e(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static int f(long j9) {
        return Long.hashCode(j9);
    }

    public static String g(long j9) {
        if (d(j9) == e(j9)) {
            return "CornerRadius.circular(" + c.a(d(j9), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(d(j9), 1) + ", " + c.a(e(j9), 1) + ')';
    }
}
