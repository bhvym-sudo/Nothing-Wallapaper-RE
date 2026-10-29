package S4;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static void a(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z9, String str) {
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }
}
