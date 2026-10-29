package p215v4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class y implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f28524b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1995f f28525c;

    public y(Executor executor, InterfaceC1995f interfaceC1995f) {
        this.f28523a = executor;
        this.f28525c = interfaceC1995f;
    }

    @Override // p215v4.D
    public final void c(k kVar) {
        if (kVar.l() || kVar.j()) {
            return;
        }
        synchronized (this.f28524b) {
            try {
                if (this.f28525c == null) {
                    return;
                }
                this.f28523a.execute(new x(this, kVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
