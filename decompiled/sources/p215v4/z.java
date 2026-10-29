package p215v4;

/* JADX INFO: loaded from: classes.dex */
final class z implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ k f28526q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ A f28527r;

    z(A a10, k kVar) {
        this.f28527r = a10;
        this.f28526q = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28527r.f28487b) {
            try {
                A a10 = this.f28527r;
                if (a10.f28488c != null) {
                    a10.f28488c.b(this.f28526q.i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
