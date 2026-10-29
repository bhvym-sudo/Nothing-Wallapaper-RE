package p175r4;

/* JADX INFO: loaded from: classes.dex */
public abstract class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p9 f27300a;

    public static synchronized C1784f9 a(X8 x9) {
        try {
            if (f27300a == null) {
                f27300a = new p9(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1784f9) f27300a.b(x9);
    }

    public static synchronized C1784f9 b(String str) {
        return a(X8.d("subject-segmentation").c());
    }
}
