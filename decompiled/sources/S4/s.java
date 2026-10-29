package S4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class s implements X4.c, X4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7335a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f7336b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f7337c;

    s(Executor executor) {
        this.f7337c = executor;
    }

    private synchronized Set b(X4.a aVar) {
        throw null;
    }

    static /* synthetic */ void c(Map.Entry entry, X4.a aVar) {
        androidx.appcompat.app.o.a(entry.getKey());
        throw null;
    }

    void a() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f7336b;
                if (queue != null) {
                    this.f7336b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.o.a(it.next());
                d(null);
            }
        }
    }

    public void d(X4.a aVar) {
        A.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f7336b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (Map.Entry entry : b(aVar)) {
                    ((Executor) entry.getValue()).execute(r.a(entry, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
