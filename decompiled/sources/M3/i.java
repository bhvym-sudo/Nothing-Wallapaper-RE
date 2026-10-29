package M3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
abstract class i {
    static Executor a() {
        return new k(Executors.newSingleThreadExecutor());
    }
}
