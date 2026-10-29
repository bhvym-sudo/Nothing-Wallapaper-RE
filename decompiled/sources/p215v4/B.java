package p215v4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class B implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ k f28489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ C f28490r;

    B(C c10, k kVar) {
        this.f28490r = c10;
        this.f28489q = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            k kVarA = this.f28490r.f28492b.a(this.f28489q.i());
            if (kVarA == null) {
                this.f28490r.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = m.f28508b;
            kVarA.f(executor, this.f28490r);
            kVarA.d(executor, this.f28490r);
            kVarA.a(executor, this.f28490r);
        } catch (CancellationException unused) {
            this.f28490r.a();
        } catch (C1998i e10) {
            if (e10.getCause() instanceof Exception) {
                this.f28490r.d((Exception) e10.getCause());
            } else {
                this.f28490r.d(e10);
            }
        } catch (Exception e11) {
            this.f28490r.d(e11);
        }
    }
}
