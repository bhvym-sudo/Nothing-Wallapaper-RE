package p215v4;

/* JADX INFO: loaded from: classes.dex */
final class t implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ u f28512q;

    t(u uVar) {
        this.f28512q = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28512q.f28514b) {
            try {
                u uVar = this.f28512q;
                if (uVar.f28515c != null) {
                    uVar.f28515c.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
