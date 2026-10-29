package g9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: g9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ExecutorC1358a implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f21366q = new Handler(Looper.getMainLooper());

    ExecutorC1358a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f21366q.post(runnable);
    }
}
