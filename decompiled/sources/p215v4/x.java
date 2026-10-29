package p215v4;

import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
final class x implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ k f28521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ y f28522r;

    x(y yVar, k kVar) {
        this.f28522r = yVar;
        this.f28521q = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28522r.f28524b) {
            try {
                y yVar = this.f28522r;
                if (yVar.f28525c != null) {
                    yVar.f28525c.d((Exception) AbstractC1202p.i(this.f28521q.h()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
