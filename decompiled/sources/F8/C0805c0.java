package F8;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: F8.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0805c0 implements InterfaceC0807d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Future f1857q;

    public C0805c0(Future future) {
        this.f1857q = future;
    }

    @Override // F8.InterfaceC0807d0
    public void dispose() {
        this.f1857q.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f1857q + ']';
    }
}
