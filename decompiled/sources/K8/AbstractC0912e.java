package K8;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: K8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0912e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f4160a = D8.k.C(D8.k.e(ServiceLoader.load(F8.J.class, F8.J.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f4160a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
