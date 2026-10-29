package p215v4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class A implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28487b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1996g f28488c;

    public A(Executor executor, InterfaceC1996g interfaceC1996g) {
        this.f28486a = executor;
        this.f28488c = interfaceC1996g;
    }

    @Override // p215v4.D
    public final void c(k kVar) {
        if (kVar.l()) {
            synchronized (this.f28487b) {
                try {
                    if (this.f28488c == null) {
                        return;
                    }
                    this.f28486a.execute(new z(this, kVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
