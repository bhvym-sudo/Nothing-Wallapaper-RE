package p011b0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14558b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14559c = i(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14560d = i(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14561e = i(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f14562f = i(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f14563g = i(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f14564h = i(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f14565i = i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14566a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return d.f14559c;
        }

        public final int b() {
            return d.f14560d;
        }

        public final int c() {
            return d.f14565i;
        }

        public final int d() {
            return d.f14564h;
        }

        public final int e() {
            return d.f14562f;
        }

        public final int f() {
            return d.f14561e;
        }

        public final int g() {
            return d.f14563g;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i10) {
        this.f14566a = i10;
    }

    public static final /* synthetic */ d h(int i10) {
        return new d(i10);
    }

    private static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof d) && i10 == ((d) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        if (k(i10, f14559c)) {
            return "Button";
        }
        if (k(i10, f14560d)) {
            return "Checkbox";
        }
        if (k(i10, f14561e)) {
            return "Switch";
        }
        if (k(i10, f14562f)) {
            return "RadioButton";
        }
        if (k(i10, f14563g)) {
            return "Tab";
        }
        if (k(i10, f14564h)) {
            return "Image";
        }
        return k(i10, f14565i) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f14566a, obj);
    }

    public int hashCode() {
        return l(this.f14566a);
    }

    public final /* synthetic */ int n() {
        return this.f14566a;
    }

    public String toString() {
        return m(this.f14566a);
    }
}
