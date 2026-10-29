package p066g5;

import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1162w;
import androidx.lifecycle.J;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p025c4.AbstractC1202p;
import p025c4.C1195i;
import p036d5.AbstractC1307f;
import p056f5.a;
import p165q4.C1560k5;
import p215v4.C1991b;
import p215v4.InterfaceC1995f;
import p215v4.k;
import p215v4.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Closeable, InterfaceC1162w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final C1195i f21284v = new C1195i("MobileVisionBase", "");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f21285w = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f21286q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AbstractC1307f f21287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1991b f21288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f21289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final k f21290u;

    public c(AbstractC1307f abstractC1307f, Executor executor) {
        this.f21287r = abstractC1307f;
        C1991b c1991b = new C1991b();
        this.f21288s = c1991b;
        this.f21289t = executor;
        abstractC1307f.c();
        this.f21290u = abstractC1307f.a(executor, new Callable() { // from class: g5.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = c.f21285w;
                return null;
            }
        }, c1991b.b()).e(new InterfaceC1995f() { // from class: g5.f
            @Override // p215v4.InterfaceC1995f
            public final void d(Exception exc) {
                c.f21284v.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @J(AbstractC1157q.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f21286q.getAndSet(true)) {
            return;
        }
        this.f21288s.a();
        this.f21287r.e(this.f21289t);
    }

    public synchronized k f(final a aVar) {
        AbstractC1202p.j(aVar, "InputImage can not be null");
        if (this.f21286q.get()) {
            return n.c(new Z4.a("This detector is already closed!", 14));
        }
        if (aVar.i() < 32 || aVar.e() < 32) {
            return n.c(new Z4.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f21287r.a(this.f21289t, new Callable() { // from class: g5.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21291a.u(aVar);
            }
        }, this.f21288s.b());
    }

    final /* synthetic */ Object u(a aVar) {
        C1560k5 c1560k5J = C1560k5.j("detectorTaskWithResource#run");
        c1560k5J.b();
        try {
            Object objI = this.f21287r.i(aVar);
            c1560k5J.close();
            return objI;
        } catch (Throwable th) {
            try {
                c1560k5J.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
