package F8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: F8.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0842v0 extends C0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1898v = AtomicIntegerFieldUpdater.newUpdater(C0842v0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p219v8.l f1899u;

    public C0842v0(p219v8.l lVar) {
        this.f1899u = lVar;
    }

    @Override // F8.C0
    public boolean v() {
        return true;
    }

    @Override // F8.C0
    public void w(Throwable th) {
        if (f1898v.compareAndSet(this, 0, 1)) {
            this.f1899u.f(th);
        }
    }
}
