package F8;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: F8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0808e extends AbstractC0800a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Thread f1861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AbstractC0815h0 f1862u;

    public C0808e(p129m8.i iVar, Thread thread, AbstractC0815h0 abstractC0815h0) {
        super(iVar, true, true);
        this.f1861t = thread;
        this.f1862u = abstractC0815h0;
    }

    public final Object Y0() throws Throwable {
        AbstractC0804c.a();
        try {
            AbstractC0815h0 abstractC0815h0 = this.f1862u;
            if (abstractC0815h0 != null) {
                AbstractC0815h0.r1(abstractC0815h0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0815h0 abstractC0815h1 = this.f1862u;
                    long jU1 = abstractC0815h1 != null ? abstractC0815h1.u1() : Long.MAX_VALUE;
                    if (O0()) {
                        AbstractC0815h0 abstractC0815h2 = this.f1862u;
                        if (abstractC0815h2 != null) {
                            AbstractC0815h0.m1(abstractC0815h2, false, 1, null);
                        }
                        AbstractC0804c.a();
                        Object objH = E0.h(c0());
                        A a10 = objH instanceof A ? (A) objH : null;
                        if (a10 == null) {
                            return objH;
                        }
                        throw a10.f1787a;
                    }
                    AbstractC0804c.a();
                    LockSupport.parkNanos(this, jU1);
                } catch (Throwable th) {
                    AbstractC0815h0 abstractC0815h3 = this.f1862u;
                    if (abstractC0815h3 != null) {
                        AbstractC0815h0.m1(abstractC0815h3, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            D(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0804c.a();
            throw th2;
        }
    }

    @Override // F8.D0
    protected boolean j0() {
        return true;
    }

    @Override // F8.D0
    protected void y(Object obj) {
        if (kotlin.jvm.internal.n.d(Thread.currentThread(), this.f1861t)) {
            return;
        }
        Thread thread = this.f1861t;
        AbstractC0804c.a();
        LockSupport.unpark(thread);
    }
}
