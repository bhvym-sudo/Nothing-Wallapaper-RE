package F2;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class i extends AbstractExecutorService {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f1569q;

    public i(Looper looper) {
        this.f1569q = new Handler(looper);
    }

    public void a(Runnable runnable, long j9) {
        b().postDelayed(runnable, j9);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j9, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public Handler b() {
        return this.f1569q;
    }

    public void c(Runnable runnable) {
        b().post(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (b().getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            b().post(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
