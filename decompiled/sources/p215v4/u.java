package p215v4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class u implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28514b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1993d f28515c;

    public u(Executor executor, InterfaceC1993d interfaceC1993d) {
        this.f28513a = executor;
        this.f28515c = interfaceC1993d;
    }

    @Override // p215v4.D
    public final void c(k kVar) {
        if (kVar.j()) {
            synchronized (this.f28514b) {
                try {
                    if (this.f28515c == null) {
                        return;
                    }
                    this.f28513a.execute(new t(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
