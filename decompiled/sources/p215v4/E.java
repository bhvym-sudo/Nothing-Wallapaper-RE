package p215v4;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28494a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f28495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28496c;

    E() {
    }

    public final void a(D d10) {
        synchronized (this.f28494a) {
            try {
                if (this.f28495b == null) {
                    this.f28495b = new ArrayDeque();
                }
                this.f28495b.add(d10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(k kVar) {
        D d10;
        synchronized (this.f28494a) {
            if (this.f28495b != null && !this.f28496c) {
                this.f28496c = true;
                while (true) {
                    synchronized (this.f28494a) {
                        try {
                            d10 = (D) this.f28495b.poll();
                            if (d10 == null) {
                                this.f28496c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    d10.c(kVar);
                }
            }
        }
    }
}
