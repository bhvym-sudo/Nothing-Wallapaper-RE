package p101k0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22648b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22649c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22650d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f22651e = c(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22652f = c(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f22653g = c(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f22654h = c(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f22655i = c(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22656a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return g.f22655i;
        }

        private a() {
        }
    }

    private /* synthetic */ g(int i10) {
        this.f22656a = i10;
    }

    public static final /* synthetic */ g b(int i10) {
        return new g(i10);
    }

    public static int c(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).h();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        if (e(i10, f22649c)) {
            return "Left";
        }
        if (e(i10, f22650d)) {
            return "Right";
        }
        if (e(i10, f22651e)) {
            return "Center";
        }
        if (e(i10, f22652f)) {
            return "Justify";
        }
        if (e(i10, f22653g)) {
            return "Start";
        }
        if (e(i10, f22654h)) {
            return "End";
        }
        return e(i10, f22655i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.f22656a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f22656a;
    }

    public int hashCode() {
        return f(this.f22656a);
    }

    public String toString() {
        return g(this.f22656a);
    }
}
