package p111l0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22847b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22848c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f22849d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f22850e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22851a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return w.f22850e;
        }

        public final long b() {
            return w.f22849d;
        }

        public final long c() {
            return w.f22848c;
        }

        private a() {
        }
    }

    private /* synthetic */ w(long j9) {
        this.f22851a = j9;
    }

    public static final /* synthetic */ w d(long j9) {
        return new w(j9);
    }

    public static long e(long j9) {
        return j9;
    }

    public static boolean f(long j9, Object obj) {
        return (obj instanceof w) && j9 == ((w) obj).j();
    }

    public static final boolean g(long j9, long j10) {
        return j9 == j10;
    }

    public static int h(long j9) {
        return Long.hashCode(j9);
    }

    public static String i(long j9) {
        if (g(j9, f22848c)) {
            return "Unspecified";
        }
        if (g(j9, f22849d)) {
            return "Sp";
        }
        return g(j9, f22850e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f22851a, obj);
    }

    public int hashCode() {
        return h(this.f22851a);
    }

    public final /* synthetic */ long j() {
        return this.f22851a;
    }

    public String toString() {
        return i(this.f22851a);
    }
}
