package p215v4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p185s4.a;

/* JADX INFO: loaded from: classes.dex */
final class H implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f28498q = new a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f28498q.post(runnable);
    }
}
