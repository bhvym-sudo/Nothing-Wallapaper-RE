package p074h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static H f21622a;

    public static synchronized H a() {
        return f21622a;
    }

    public static void b(H h10) {
        f21622a = h10;
    }
}
