package p095j4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p145o4.e;

/* JADX INFO: loaded from: classes.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f22297q;

    public a(Looper looper) {
        this.f22297q = new e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22297q.post(runnable);
    }
}
