package F8;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: F8.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0819j0 extends AbstractC0815h0 {
    protected abstract Thread x1();

    protected void y1(long j9, AbstractC0817i0.c cVar) {
        Q.f1832y.M1(j9, cVar);
    }

    protected final void z1() {
        Thread threadX1 = x1();
        if (Thread.currentThread() != threadX1) {
            AbstractC0804c.a();
            LockSupport.unpark(threadX1);
        }
    }
}
