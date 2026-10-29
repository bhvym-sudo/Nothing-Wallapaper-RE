package p155p4;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Z f23726a;

    private Z() {
    }

    public static synchronized Z a() {
        try {
            if (f23726a == null) {
                f23726a = new Z();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23726a;
    }

    public static void b() {
        Y.a();
    }
}
