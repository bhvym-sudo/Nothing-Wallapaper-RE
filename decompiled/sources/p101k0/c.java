package p101k0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22624a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22625b = b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22626c = b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22627d = b(Integer.MIN_VALUE);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return c.f22627d;
        }

        private a() {
        }
    }

    private static int b(int i10) {
        return i10;
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        if (c(i10, f22625b)) {
            return "Hyphens.None";
        }
        if (c(i10, f22626c)) {
            return "Hyphens.Auto";
        }
        return c(i10, f22627d) ? "Hyphens.Unspecified" : "Invalid";
    }
}
