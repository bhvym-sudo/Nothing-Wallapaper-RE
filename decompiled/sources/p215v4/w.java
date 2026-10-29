package p215v4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class w implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28519b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1994e f28520c;

    public w(Executor executor, InterfaceC1994e interfaceC1994e) {
        this.f28518a = executor;
        this.f28520c = interfaceC1994e;
    }

    @Override // p215v4.D
    public final void c(k kVar) {
        synchronized (this.f28519b) {
            try {
                if (this.f28520c == null) {
                    return;
                }
                this.f28518a.execute(new v(this, kVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
