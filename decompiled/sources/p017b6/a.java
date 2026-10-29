package p017b6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static void a(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(boolean z9) {
        d(z9, "[Assertion failed] - this state invariant must be true");
    }

    public static void d(boolean z9, String str) {
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }
}
