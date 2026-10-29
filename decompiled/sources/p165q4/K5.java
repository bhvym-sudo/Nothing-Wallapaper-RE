package p165q4;

/* JADX INFO: loaded from: classes.dex */
public final class K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static K5 f24274a;

    private K5() {
    }

    public static synchronized K5 a() {
        try {
            if (f24274a == null) {
                f24274a = new K5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f24274a;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }
}
