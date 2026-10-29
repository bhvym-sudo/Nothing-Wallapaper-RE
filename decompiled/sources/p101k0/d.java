package p101k0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22628a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f22632e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return d.f22632e;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22633a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f22634b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f22635c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f22636d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f22637e = d(0);

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final int a() {
                return b.f22636d;
            }

            public final int b() {
                return b.f22635c;
            }

            public final int c() {
                return b.f22634b;
            }

            private a() {
            }
        }

        public static int d(int i10) {
            return i10;
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            if (e(i10, f22634b)) {
                return "Strategy.Simple";
            }
            if (e(i10, f22635c)) {
                return "Strategy.HighQuality";
            }
            if (e(i10, f22636d)) {
                return "Strategy.Balanced";
            }
            return e(i10, f22637e) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22638a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f22639b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f22640c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f22641d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f22642e = d(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f22643f = d(0);

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final int a() {
                return c.f22640c;
            }

            public final int b() {
                return c.f22641d;
            }

            public final int c() {
                return c.f22642e;
            }

            private a() {
            }
        }

        public static int d(int i10) {
            return i10;
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            if (e(i10, f22639b)) {
                return "Strictness.None";
            }
            if (e(i10, f22640c)) {
                return "Strictness.Loose";
            }
            if (e(i10, f22641d)) {
                return "Strictness.Normal";
            }
            if (e(i10, f22642e)) {
                return "Strictness.Strict";
            }
            return e(i10, f22643f) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    /* JADX INFO: renamed from: k0.d$d, reason: collision with other inner class name */
    public static final class C0568d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22644a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f22645b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f22646c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f22647d = c(0);

        /* JADX INFO: renamed from: k0.d$d$a */
        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final int a() {
                return C0568d.f22645b;
            }

            public final int b() {
                return C0568d.f22646c;
            }

            private a() {
            }
        }

        public static int c(int i10) {
            return i10;
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static String e(int i10) {
            if (d(i10, f22645b)) {
                return "WordBreak.None";
            }
            if (d(i10, f22646c)) {
                return "WordBreak.Phrase";
            }
            return d(i10, f22647d) ? "WordBreak.Unspecified" : "Invalid";
        }
    }

    static {
        b.a aVar = b.f22633a;
        int iC = aVar.c();
        c.a aVar2 = c.f22638a;
        int iB = aVar2.b();
        C0568d.a aVar3 = C0568d.f22644a;
        f22629b = b(e.e(iC, iB, aVar3.a()));
        f22630c = b(e.e(aVar.a(), aVar2.a(), aVar3.b()));
        f22631d = b(e.e(aVar.b(), aVar2.c(), aVar3.a()));
        f22632e = b(0);
    }

    private static int b(int i10) {
        return i10;
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }

    public static final int d(int i10) {
        return b.d(e.f(i10));
    }

    public static final int e(int i10) {
        return c.d(e.g(i10));
    }

    public static final int f(int i10) {
        return C0568d.c(e.h(i10));
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return "LineBreak(strategy=" + ((Object) b.f(d(i10))) + ", strictness=" + ((Object) c.f(e(i10))) + ", wordBreak=" + ((Object) C0568d.e(f(i10))) + ')';
    }
}
