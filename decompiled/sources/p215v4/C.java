package p215v4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class C implements InterfaceC1996g, InterfaceC1995f, InterfaceC1993d, D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f28492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f28493c;

    public C(Executor executor, j jVar, I i10) {
        this.f28491a = executor;
        this.f28492b = jVar;
        this.f28493c = i10;
    }

    @Override // p215v4.InterfaceC1993d
    public final void a() {
        this.f28493c.p();
    }

    @Override // p215v4.InterfaceC1996g
    public final void b(Object obj) {
        this.f28493c.o(obj);
    }

    @Override // p215v4.D
    public final void c(k kVar) {
        this.f28491a.execute(new B(this, kVar));
    }

    @Override // p215v4.InterfaceC1995f
    public final void d(Exception exc) {
        this.f28493c.n(exc);
    }
}
