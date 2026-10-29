package p061g0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20961a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20962b = e(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20963c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f20964d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f20965e = e(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f20966f = e(3);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return p.f20964d;
        }

        public final int b() {
            return p.f20963c;
        }

        public final int c() {
            return p.f20966f;
        }

        public final int d() {
            return p.f20965e;
        }

        private a() {
        }
    }

    private static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        if (f(i10, f20962b)) {
            return "Unspecified";
        }
        if (f(i10, f20963c)) {
            return "None";
        }
        if (f(i10, f20964d)) {
            return "Characters";
        }
        if (f(i10, f20965e)) {
            return "Words";
        }
        return f(i10, f20966f) ? "Sentences" : "Invalid";
    }
}
