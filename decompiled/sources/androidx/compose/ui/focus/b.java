package androidx.compose.ui.focus;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11397b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11398c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f11399d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f11400e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f11401f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f11402g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f11403h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f11404i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f11405j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11406a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return b.f11403h;
        }

        public final int b() {
            return b.f11404i;
        }

        public final int c() {
            return b.f11405j;
        }

        public final int d() {
            return b.f11400e;
        }

        public final int e() {
            return b.f11398c;
        }

        public final int f() {
            return b.f11399d;
        }

        public final int g() {
            return b.f11401f;
        }

        public final int h() {
            return b.f11402g;
        }

        private a() {
        }
    }

    private /* synthetic */ b(int i10) {
        this.f11406a = i10;
    }

    public static final /* synthetic */ b i(int i10) {
        return new b(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        if (l(i10, f11398c)) {
            return "Next";
        }
        if (l(i10, f11399d)) {
            return "Previous";
        }
        if (l(i10, f11400e)) {
            return "Left";
        }
        if (l(i10, f11401f)) {
            return "Right";
        }
        if (l(i10, f11402g)) {
            return "Up";
        }
        if (l(i10, f11403h)) {
            return "Down";
        }
        if (l(i10, f11404i)) {
            return "Enter";
        }
        return l(i10, f11405j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f11406a, obj);
    }

    public int hashCode() {
        return m(this.f11406a);
    }

    public final /* synthetic */ int o() {
        return this.f11406a;
    }

    public String toString() {
        return n(this.f11406a);
    }
}
