package p125m4;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ClassLoader f23224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Thread f23225b;

    public static synchronized ClassLoader a() {
        try {
            if (f23224a == null) {
                f23224a = b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23224a;
    }

    private static synchronized ClassLoader b() {
        ClassLoader contextClassLoader = null;
        if (f23225b == null) {
            f23225b = c();
            if (f23225b == null) {
                return null;
            }
        }
        synchronized (f23225b) {
            try {
                contextClassLoader = f23225b.getContextClassLoader();
            } catch (SecurityException e10) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e10.getMessage());
            }
        }
        return contextClassLoader;
    }

    private static synchronized Thread c() {
        SecurityException e10;
        Thread aVar;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                try {
                    int iActiveGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iActiveGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int iActiveCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[iActiveCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= iActiveCount) {
                            thread = null;
                            break;
                        }
                        thread = threadArr[i10];
                        if ("GmsDynamite".equals(thread.getName())) {
                            break;
                        }
                        i10++;
                    }
                    if (thread == null) {
                        try {
                            aVar = new a(threadGroup, "GmsDynamite");
                            try {
                                aVar.setContextClassLoader(null);
                                aVar.start();
                            } catch (SecurityException e11) {
                                e10 = e11;
                                Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                            }
                        } catch (SecurityException e12) {
                            e10 = e12;
                            aVar = thread;
                        }
                        thread = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (SecurityException e13) {
                e10 = e13;
                aVar = null;
            }
        }
        return thread;
    }
}
