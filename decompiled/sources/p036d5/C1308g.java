package p036d5;

import Z4.a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p155p4.HandlerC1459a;
import p215v4.k;
import p215v4.l;

/* JADX INFO: renamed from: d5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1308g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f19577b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1308g f19578c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f19579a;

    private C1308g(Looper looper) {
        this.f19579a = new HandlerC1459a(looper);
    }

    public static C1308g a() {
        C1308g c1308g;
        synchronized (f19577b) {
            try {
                if (f19578c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f19578c = new C1308g(handlerThread.getLooper());
                }
                c1308g = f19578c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1308g;
    }

    public static Executor d() {
        return t.f19629q;
    }

    public k b(final Callable callable) {
        final l lVar = new l();
        c(new Runnable() { // from class: d5.s
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                l lVar2 = lVar;
                try {
                    lVar2.c(callable2.call());
                } catch (a e10) {
                    lVar2.b(e10);
                } catch (Exception e11) {
                    lVar2.b(new a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return lVar.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
