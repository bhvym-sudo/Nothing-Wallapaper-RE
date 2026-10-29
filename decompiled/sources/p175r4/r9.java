package p175r4;

/* JADX INFO: loaded from: classes.dex */
public final class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static r9 f27331a;

    private r9() {
    }

    public static synchronized r9 a() {
        try {
            if (f27331a == null) {
                f27331a = new r9();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27331a;
    }
}
