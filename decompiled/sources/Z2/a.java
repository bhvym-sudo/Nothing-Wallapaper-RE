package Z2;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Looper f9439a = Looper.getMainLooper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Thread f9440b = null;

    public static void a() {
        Looper looper = f9439a;
        if (looper.isCurrentThread()) {
            return;
        }
        Thread thread = f9440b;
        if (thread == null || thread != Thread.currentThread()) {
            throw new IllegalStateException("should be called from the main thread. sMainLooper.threadName=" + looper.getThread().getName() + " Thread.currentThread()=" + Thread.currentThread().getName());
        }
    }

    public static void b() {
        if (f9439a.isCurrentThread()) {
            Thread thread = f9440b;
            if (thread == null || thread == Thread.currentThread()) {
                throw new IllegalStateException("should not be called from the main thread.");
            }
        }
    }
}
