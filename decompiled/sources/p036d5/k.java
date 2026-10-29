package p036d5;

import Z4.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p025c4.AbstractC1202p;
import p155p4.D;
import p215v4.AbstractC1990a;
import p215v4.C1991b;
import p215v4.l;
import p215v4.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f19586b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f19587c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final n f19585a = new n();

    public p215v4.k a(final Executor executor, final Callable callable, final AbstractC1990a abstractC1990a) {
        AbstractC1202p.l(this.f19586b.get() > 0);
        if (abstractC1990a.a()) {
            return n.b();
        }
        final C1991b c1991b = new C1991b();
        final l lVar = new l(c1991b.b());
        this.f19585a.a(new Executor() { // from class: d5.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC1990a.a()) {
                        c1991b.a();
                    } else {
                        lVar.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: d5.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f19640q.g(abstractC1990a, c1991b, callable, lVar);
            }
        });
        return lVar.a();
    }

    public abstract void b();

    public void c() {
        this.f19586b.incrementAndGet();
    }

    protected abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public p215v4.k f(Executor executor) {
        AbstractC1202p.l(this.f19586b.get() > 0);
        final l lVar = new l();
        this.f19585a.a(executor, new Runnable() { // from class: d5.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f19634q.h(lVar);
            }
        });
        return lVar.a();
    }

    final /* synthetic */ void g(AbstractC1990a abstractC1990a, C1991b c1991b, Callable callable, l lVar) {
        try {
            if (abstractC1990a.a()) {
                c1991b.a();
                return;
            }
            try {
                if (!this.f19587c.get()) {
                    b();
                    this.f19587c.set(true);
                }
                if (abstractC1990a.a()) {
                    c1991b.a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC1990a.a()) {
                    c1991b.a();
                } else {
                    lVar.c(objCall);
                }
            } catch (RuntimeException e10) {
                throw new a("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC1990a.a()) {
                c1991b.a();
            } else {
                lVar.b(e11);
            }
        }
    }

    final /* synthetic */ void h(l lVar) {
        int iDecrementAndGet = this.f19586b.decrementAndGet();
        AbstractC1202p.l(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f19587c.set(false);
        }
        D.a();
        lVar.c(null);
    }
}
