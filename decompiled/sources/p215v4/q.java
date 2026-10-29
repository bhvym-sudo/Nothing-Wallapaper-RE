package p215v4;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f28510a = new CountDownLatch(1);

    /* synthetic */ q(p pVar) {
    }

    @Override // p215v4.InterfaceC1993d
    public final void a() {
        this.f28510a.countDown();
    }

    @Override // p215v4.InterfaceC1996g
    public final void b(Object obj) {
        this.f28510a.countDown();
    }

    public final void c() throws InterruptedException {
        this.f28510a.await();
    }

    @Override // p215v4.InterfaceC1995f
    public final void d(Exception exc) {
        this.f28510a.countDown();
    }
}
