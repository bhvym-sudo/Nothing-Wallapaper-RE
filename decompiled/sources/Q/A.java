package Q;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6488a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f6489b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6490c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6491d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6492e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6493f = f(4);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return A.f6493f;
        }

        public final int b() {
            return A.f6491d;
        }

        public final int c() {
            return A.f6492e;
        }

        public final int d() {
            return A.f6490c;
        }

        public final int e() {
            return A.f6489b;
        }

        private a() {
        }
    }

    private static int f(int i10) {
        return i10;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Mouse";
        }
        if (i10 != 3) {
            return i10 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }
}
