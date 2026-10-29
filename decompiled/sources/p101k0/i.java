package p101k0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22662b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22663c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22664d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f22665e = c(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22666f = c(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f22667g = c(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f22668h = c(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22669a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return i.f22668h;
        }

        private a() {
        }
    }

    private /* synthetic */ i(int i10) {
        this.f22669a = i10;
    }

    public static final /* synthetic */ i b(int i10) {
        return new i(i10);
    }

    public static int c(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof i) && i10 == ((i) obj).h();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        if (e(i10, f22663c)) {
            return "Ltr";
        }
        if (e(i10, f22664d)) {
            return "Rtl";
        }
        if (e(i10, f22665e)) {
            return "Content";
        }
        if (e(i10, f22666f)) {
            return "ContentOrLtr";
        }
        if (e(i10, f22667g)) {
            return "ContentOrRtl";
        }
        return e(i10, f22668h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.f22669a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f22669a;
    }

    public int hashCode() {
        return f(this.f22669a);
    }

    public String toString() {
        return g(this.f22669a);
    }
}
