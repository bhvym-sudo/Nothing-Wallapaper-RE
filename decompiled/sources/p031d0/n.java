package p031d0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19416b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f19417c = o.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f19418a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return n.f19417c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(long j9) {
        this.f19418a = j9;
    }

    public static final /* synthetic */ n b(long j9) {
        return new n(j9);
    }

    public static long c(long j9) {
        return j9;
    }

    public static boolean d(long j9, Object obj) {
        return (obj instanceof n) && j9 == ((n) obj).m();
    }

    public static final boolean e(long j9, long j10) {
        return j9 == j10;
    }

    public static final boolean f(long j9) {
        return j(j9) == g(j9);
    }

    public static final int g(long j9) {
        return (int) (j9 & 4294967295L);
    }

    public static final int h(long j9) {
        return j(j9) > g(j9) ? j(j9) : g(j9);
    }

    public static final int i(long j9) {
        return j(j9) > g(j9) ? g(j9) : j(j9);
    }

    public static final int j(long j9) {
        return (int) (j9 >> 32);
    }

    public static int k(long j9) {
        return Long.hashCode(j9);
    }

    public static String l(long j9) {
        return "TextRange(" + j(j9) + ", " + g(j9) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f19418a, obj);
    }

    public int hashCode() {
        return k(this.f19418a);
    }

    public final /* synthetic */ long m() {
        return this.f19418a;
    }

    public String toString() {
        return l(this.f19418a);
    }
}
