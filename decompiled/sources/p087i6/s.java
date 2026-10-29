package p087i6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f22211a;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        n.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f22211a = executorServiceNewSingleThreadExecutor;
    }

    public static final ExecutorService a() {
        return f22211a;
    }
}
