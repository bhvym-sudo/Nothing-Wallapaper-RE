package Y2;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9329a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9330b = new a();

    public final class a implements Thread.UncaughtExceptionHandler {
        public a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            b.this.c(thread, th);
        }
    }

    private final void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (this.f9329a.contains(uncaughtExceptionHandler)) {
            return;
        }
        this.f9329a.add(uncaughtExceptionHandler);
    }

    private final void b() {
        Thread.UncaughtExceptionHandler uncaughtExceptionPreHandler = Thread.getUncaughtExceptionPreHandler();
        if (n.d(uncaughtExceptionPreHandler, this.f9330b)) {
            return;
        }
        if (uncaughtExceptionPreHandler instanceof a) {
            throw new IllegalStateException("Two UncaughtExceptionPreHandlerManagers created");
        }
        if (uncaughtExceptionPreHandler != null) {
            a(uncaughtExceptionPreHandler);
        }
        Thread.setUncaughtExceptionPreHandler(this.f9330b);
    }

    public final void c(Thread thread, Throwable th) {
        Iterator it = this.f9329a.iterator();
        while (it.hasNext()) {
            try {
                ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
            } catch (Exception e10) {
                Log.wtf("Uncaught exception pre-handler error", e10);
            }
        }
    }

    public final void d(Thread.UncaughtExceptionHandler handler) {
        n.h(handler, "handler");
        b();
        a(handler);
    }
}
