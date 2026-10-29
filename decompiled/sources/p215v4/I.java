package p215v4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
final class I extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28499a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f28500b = new E();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f28502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f28503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f28504f;

    I() {
    }

    private final void s() {
        AbstractC1202p.m(this.f28501c, "Task is not yet complete");
    }

    private final void t() {
        if (this.f28502d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void u() {
        if (this.f28501c) {
            throw C1992c.a(this);
        }
    }

    private final void v() {
        synchronized (this.f28499a) {
            try {
                if (this.f28501c) {
                    this.f28500b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p215v4.k
    public final k a(Executor executor, InterfaceC1993d interfaceC1993d) {
        this.f28500b.a(new u(executor, interfaceC1993d));
        v();
        return this;
    }

    @Override // p215v4.k
    public final k b(Executor executor, InterfaceC1994e interfaceC1994e) {
        this.f28500b.a(new w(executor, interfaceC1994e));
        v();
        return this;
    }

    @Override // p215v4.k
    public final k c(InterfaceC1994e interfaceC1994e) {
        this.f28500b.a(new w(m.f28507a, interfaceC1994e));
        v();
        return this;
    }

    @Override // p215v4.k
    public final k d(Executor executor, InterfaceC1995f interfaceC1995f) {
        this.f28500b.a(new y(executor, interfaceC1995f));
        v();
        return this;
    }

    @Override // p215v4.k
    public final k e(InterfaceC1995f interfaceC1995f) {
        d(m.f28507a, interfaceC1995f);
        return this;
    }

    @Override // p215v4.k
    public final k f(Executor executor, InterfaceC1996g interfaceC1996g) {
        this.f28500b.a(new A(executor, interfaceC1996g));
        v();
        return this;
    }

    @Override // p215v4.k
    public final k g(InterfaceC1996g interfaceC1996g) {
        f(m.f28507a, interfaceC1996g);
        return this;
    }

    @Override // p215v4.k
    public final Exception h() {
        Exception exc;
        synchronized (this.f28499a) {
            exc = this.f28504f;
        }
        return exc;
    }

    @Override // p215v4.k
    public final Object i() {
        Object obj;
        synchronized (this.f28499a) {
            try {
                s();
                t();
                Exception exc = this.f28504f;
                if (exc != null) {
                    throw new C1998i(exc);
                }
                obj = this.f28503e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // p215v4.k
    public final boolean j() {
        return this.f28502d;
    }

    @Override // p215v4.k
    public final boolean k() {
        boolean z9;
        synchronized (this.f28499a) {
            z9 = this.f28501c;
        }
        return z9;
    }

    @Override // p215v4.k
    public final boolean l() {
        boolean z9;
        synchronized (this.f28499a) {
            try {
                z9 = false;
                if (this.f28501c && !this.f28502d && this.f28504f == null) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    @Override // p215v4.k
    public final k m(j jVar) {
        Executor executor = m.f28507a;
        I i10 = new I();
        this.f28500b.a(new C(executor, jVar, i10));
        v();
        return i10;
    }

    public final void n(Exception exc) {
        AbstractC1202p.j(exc, "Exception must not be null");
        synchronized (this.f28499a) {
            u();
            this.f28501c = true;
            this.f28504f = exc;
        }
        this.f28500b.b(this);
    }

    public final void o(Object obj) {
        synchronized (this.f28499a) {
            u();
            this.f28501c = true;
            this.f28503e = obj;
        }
        this.f28500b.b(this);
    }

    public final boolean p() {
        synchronized (this.f28499a) {
            try {
                if (this.f28501c) {
                    return false;
                }
                this.f28501c = true;
                this.f28502d = true;
                this.f28500b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q(Exception exc) {
        AbstractC1202p.j(exc, "Exception must not be null");
        synchronized (this.f28499a) {
            try {
                if (this.f28501c) {
                    return false;
                }
                this.f28501c = true;
                this.f28504f = exc;
                this.f28500b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(Object obj) {
        synchronized (this.f28499a) {
            try {
                if (this.f28501c) {
                    return false;
                }
                this.f28501c = true;
                this.f28503e = obj;
                this.f28500b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
