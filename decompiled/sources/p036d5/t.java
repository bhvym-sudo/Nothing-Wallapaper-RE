package p036d5;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
enum t implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C1308g.a().f19579a.post(runnable);
    }
}
