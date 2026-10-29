package F8;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: F8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0818j implements InterfaceC0820k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Future f1879q;

    public C0818j(Future future) {
        this.f1879q = future;
    }

    @Override // F8.InterfaceC0820k
    public void e(Throwable th) {
        this.f1879q.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f1879q + ']';
    }
}
