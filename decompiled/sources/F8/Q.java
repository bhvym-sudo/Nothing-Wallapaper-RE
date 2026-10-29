package F8;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends AbstractC0817i0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Q f1832y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f1833z;

    static {
        Long l9;
        Q q9 = new Q();
        f1832y = q9;
        AbstractC0815h0.r1(q9, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        f1833z = timeUnit.toNanos(l9.longValue());
    }

    private Q() {
    }

    private final synchronized void R1() {
        if (U1()) {
            debugStatus = 3;
            L1();
            kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread S1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f1832y.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean T1() {
        return debugStatus == 4;
    }

    private final boolean U1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean V1() {
        if (U1()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void W1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // F8.AbstractC0817i0
    public void D1(Runnable runnable) {
        if (T1()) {
            W1();
        }
        super.D1(runnable);
    }

    @Override // F8.AbstractC0817i0, F8.V
    public InterfaceC0807d0 W0(long j9, Runnable runnable, p129m8.i iVar) {
        return O1(j9, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zJ1;
        V0.f1836a.d(this);
        AbstractC0804c.a();
        try {
            if (!V1()) {
                if (zJ1) {
                    return;
                } else {
                    return;
                }
            }
            long j9 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jU1 = u1();
                if (jU1 == Long.MAX_VALUE) {
                    AbstractC0804c.a();
                    long jNanoTime = System.nanoTime();
                    if (j9 == Long.MAX_VALUE) {
                        j9 = f1833z + jNanoTime;
                    }
                    long j10 = j9 - jNanoTime;
                    if (j10 <= 0) {
                        if (zJ1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jU1 = B8.h.j(jU1, j10);
                } else {
                    j9 = Long.MAX_VALUE;
                }
                if (jU1 > 0) {
                    if (U1()) {
                        if (zJ1) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        AbstractC0804c.a();
                        LockSupport.parkNanos(this, jU1);
                    }
                }
            }
        } finally {
            _thread = null;
            R1();
            AbstractC0804c.a();
            if (!J1()) {
                x1();
            }
        }
    }

    @Override // F8.AbstractC0817i0, F8.AbstractC0815h0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // F8.I
    public String toString() {
        return "DefaultExecutor";
    }

    @Override // F8.AbstractC0819j0
    protected Thread x1() {
        Thread thread = _thread;
        return thread == null ? S1() : thread;
    }

    @Override // F8.AbstractC0819j0
    protected void y1(long j9, AbstractC0817i0.c cVar) {
        W1();
    }
}
