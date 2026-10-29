package p061g0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20967a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20968b = j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20969c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20970d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f20971e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f20972f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f20973g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f20974h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f20975i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f20976j = j(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f20977k = j(9);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return q.f20970d;
        }

        public final int b() {
            return q.f20977k;
        }

        public final int c() {
            return q.f20974h;
        }

        public final int d() {
            return q.f20971e;
        }

        public final int e() {
            return q.f20976j;
        }

        public final int f() {
            return q.f20975i;
        }

        public final int g() {
            return q.f20972f;
        }

        public final int h() {
            return q.f20969c;
        }

        public final int i() {
            return q.f20973g;
        }

        private a() {
        }
    }

    private static int j(int i10) {
        return i10;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        if (k(i10, f20968b)) {
            return "Unspecified";
        }
        if (k(i10, f20969c)) {
            return "Text";
        }
        if (k(i10, f20970d)) {
            return "Ascii";
        }
        if (k(i10, f20971e)) {
            return "Number";
        }
        if (k(i10, f20972f)) {
            return "Phone";
        }
        if (k(i10, f20973g)) {
            return "Uri";
        }
        if (k(i10, f20974h)) {
            return "Email";
        }
        if (k(i10, f20975i)) {
            return "Password";
        }
        if (k(i10, f20976j)) {
            return "NumberPassword";
        }
        return k(i10, f20977k) ? "Decimal" : "Invalid";
    }
}
