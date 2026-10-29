package N;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0187a f5176b = new C0187a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f5177c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5178d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5179a;

    /* JADX INFO: renamed from: N.a$a, reason: collision with other inner class name */
    public static final class C0187a {
        public /* synthetic */ C0187a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return a.f5178d;
        }

        public final int b() {
            return a.f5177c;
        }

        private C0187a() {
        }
    }

    private /* synthetic */ a(int i10) {
        this.f5179a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f5177c)) {
            return "Touch";
        }
        return f(i10, f5178d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f5179a, obj);
    }

    public int hashCode() {
        return g(this.f5179a);
    }

    public final /* synthetic */ int i() {
        return this.f5179a;
    }

    public String toString() {
        return h(this.f5179a);
    }
}
