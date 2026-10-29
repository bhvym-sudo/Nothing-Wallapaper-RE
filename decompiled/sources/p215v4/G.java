package p215v4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class G implements Executor {
    G() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
