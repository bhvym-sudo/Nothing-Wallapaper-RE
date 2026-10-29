package F8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: F8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0832q extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1892c = AtomicIntegerFieldUpdater.newUpdater(C0832q.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0832q(p129m8.e eVar, Throwable th, boolean z9) {
        if (th == null) {
            th = new CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th, z9);
    }

    public final boolean e() {
        return f1892c.compareAndSet(this, 0, 1);
    }
}
