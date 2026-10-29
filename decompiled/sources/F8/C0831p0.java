package F8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: F8.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0831p0 extends AbstractC0829o0 implements V {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f1891t;

    public C0831p0(Executor executor) {
        this.f1891t = executor;
        if (m1() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) m1()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void l1(p129m8.i iVar, RejectedExecutionException rejectedExecutionException) {
        A0.d(iVar, AbstractC0825m0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture n1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, p129m8.i iVar, long j9) {
        try {
            return scheduledExecutorService.schedule(runnable, j9, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            l1(iVar, e10);
            return null;
        }
    }

    @Override // F8.V
    public void T0(long j9, InterfaceC0822l interfaceC0822l) {
        long j10;
        Executor executorM1 = m1();
        ScheduledFuture scheduledFutureN1 = null;
        ScheduledExecutorService scheduledExecutorService = executorM1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM1 : null;
        if (scheduledExecutorService != null) {
            j10 = j9;
            scheduledFutureN1 = n1(scheduledExecutorService, new P0(this, interfaceC0822l), interfaceC0822l.getContext(), j10);
        } else {
            j10 = j9;
        }
        if (scheduledFutureN1 != null) {
            AbstractC0830p.c(interfaceC0822l, new C0818j(scheduledFutureN1));
        } else {
            Q.f1832y.T0(j10, interfaceC0822l);
        }
    }

    @Override // F8.V
    public InterfaceC0807d0 W0(long j9, Runnable runnable, p129m8.i iVar) {
        long j10;
        Runnable runnable2;
        p129m8.i iVar2;
        Executor executorM1 = m1();
        ScheduledFuture scheduledFutureN1 = null;
        ScheduledExecutorService scheduledExecutorService = executorM1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM1 : null;
        if (scheduledExecutorService != null) {
            j10 = j9;
            runnable2 = runnable;
            iVar2 = iVar;
            scheduledFutureN1 = n1(scheduledExecutorService, runnable2, iVar2, j10);
        } else {
            j10 = j9;
            runnable2 = runnable;
            iVar2 = iVar;
        }
        return scheduledFutureN1 != null ? new C0805c0(scheduledFutureN1) : Q.f1832y.W0(j10, runnable2, iVar2);
    }

    @Override // F8.AbstractC0829o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorM1 = m1();
        ExecutorService executorService = executorM1 instanceof ExecutorService ? (ExecutorService) executorM1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0831p0) && ((C0831p0) obj).m1() == m1();
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        try {
            Executor executorM1 = m1();
            AbstractC0804c.a();
            executorM1.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC0804c.a();
            l1(iVar, e10);
            C0803b0.b().g1(iVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(m1());
    }

    public Executor m1() {
        return this.f1891t;
    }

    @Override // F8.I
    public String toString() {
        return m1().toString();
    }
}
