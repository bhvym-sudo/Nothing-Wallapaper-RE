package M3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class k implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Executor f4970q;

    static class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f4971q;

        a(Runnable runnable) {
            this.f4971q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4971q.run();
            } catch (Exception e10) {
                P3.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    k(Executor executor) {
        this.f4970q = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4970q.execute(new a(runnable));
    }
}
