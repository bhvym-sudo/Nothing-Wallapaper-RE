package p170r;

import java.util.concurrent.atomic.AtomicReference;
import p079h8.A;
import p240y.h;
import p240y.i;

/* JADX INFO: loaded from: classes.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f25407a = new AtomicReference(i.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f25408b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f25409c;

    public final Object a() {
        long id = Thread.currentThread().getId();
        return id == AbstractC1670b.c() ? this.f25409c : ((h) this.f25407a.get()).b(id);
    }

    public final void b(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC1670b.c()) {
            this.f25409c = obj;
            return;
        }
        synchronized (this.f25408b) {
            h hVar = (h) this.f25407a.get();
            if (hVar.d(id, obj)) {
                return;
            }
            this.f25407a.set(hVar.c(id, obj));
            A a10 = A.f21846a;
        }
    }
}
