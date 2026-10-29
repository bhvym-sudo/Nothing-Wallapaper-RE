package p061g0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20938b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20939c = j(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20940d = j(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f20941e = j(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f20942f = j(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f20943g = j(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f20944h = j(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f20945i = j(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f20946j = j(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f20947k = j(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20948a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return j.f20940d;
        }

        public final int b() {
            return j.f20947k;
        }

        public final int c() {
            return j.f20942f;
        }

        public final int d() {
            return j.f20946j;
        }

        public final int e() {
            return j.f20941e;
        }

        public final int f() {
            return j.f20945i;
        }

        public final int g() {
            return j.f20943g;
        }

        public final int h() {
            return j.f20944h;
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i10) {
        this.f20948a = i10;
    }

    public static final /* synthetic */ j i(int i10) {
        return new j(i10);
    }

    private static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof j) && i10 == ((j) obj).o();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        if (l(i10, f20939c)) {
            return "Unspecified";
        }
        if (l(i10, f20941e)) {
            return "None";
        }
        if (l(i10, f20940d)) {
            return "Default";
        }
        if (l(i10, f20942f)) {
            return "Go";
        }
        if (l(i10, f20943g)) {
            return "Search";
        }
        if (l(i10, f20944h)) {
            return "Send";
        }
        if (l(i10, f20945i)) {
            return "Previous";
        }
        if (l(i10, f20946j)) {
            return "Next";
        }
        return l(i10, f20947k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f20948a, obj);
    }

    public int hashCode() {
        return m(this.f20948a);
    }

    public final /* synthetic */ int o() {
        return this.f20948a;
    }

    public String toString() {
        return n(this.f20948a);
    }
}
