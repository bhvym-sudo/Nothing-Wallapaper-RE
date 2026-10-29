package p036d5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19619b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19618a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f19620c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f19621d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f19618a) {
            try {
                if (this.f19620c.isEmpty()) {
                    this.f19619b = false;
                } else {
                    H h10 = (H) this.f19620c.remove();
                    e(h10.f19568a, h10.f19569b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: d5.F
                @Override // java.lang.Runnable
                public final void run() {
                    J j9 = new J(this.f19566q, null);
                    try {
                        runnable.run();
                        j9.close();
                    } catch (Throwable th) {
                        try {
                            j9.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f19618a) {
            try {
                if (this.f19619b) {
                    this.f19620c.add(new H(executor, runnable, null));
                } else {
                    this.f19619b = true;
                    e(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
