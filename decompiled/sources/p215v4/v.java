package p215v4;

/* JADX INFO: loaded from: classes.dex */
final class v implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ k f28516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ w f28517r;

    v(w wVar, k kVar) {
        this.f28517r = wVar;
        this.f28516q = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28517r.f28519b) {
            try {
                w wVar = this.f28517r;
                if (wVar.f28520c != null) {
                    wVar.f28520c.a(this.f28516q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
