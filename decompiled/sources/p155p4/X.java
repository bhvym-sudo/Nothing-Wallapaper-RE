package p155p4;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static W f23724a;

    public static synchronized N a(J j9) {
        try {
            if (f23724a == null) {
                f23724a = new W(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (N) f23724a.b(j9);
    }

    public static synchronized N b(String str) {
        return a(J.d("common").c());
    }
}
