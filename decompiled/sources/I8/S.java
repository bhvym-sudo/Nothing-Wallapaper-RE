package I8;

import F8.C0826n;
import J8.AbstractC0907c;
import K8.AbstractC0910c;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class S extends J8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f3206a = new AtomicReference(null);

    @Override // J8.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(P p9) {
        if (AbstractC0910c.a(this.f3206a) != null) {
            return false;
        }
        AbstractC0910c.b(this.f3206a, Q.f3204a);
        return true;
    }

    public final Object e(p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        if (!this.f3206a.compareAndSet(Q.f3204a, c0826n)) {
            h8.q.a aVar = p079h8.q.f21862r;
            c0826n.resumeWith(p079h8.q.b(p079h8.A.f21846a));
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    @Override // J8.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p129m8.e[] b(P p9) {
        AbstractC0910c.b(this.f3206a, null);
        return AbstractC0907c.f3888a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f3206a;
        while (true) {
            Object objA = AbstractC0910c.a(atomicReference);
            if (objA == null || objA == Q.f3205b) {
                return;
            }
            if (objA == Q.f3204a) {
                if (this.f3206a.compareAndSet(objA, Q.f3205b)) {
                    return;
                }
            } else if (this.f3206a.compareAndSet(objA, Q.f3204a)) {
                h8.q.a aVar = p079h8.q.f21862r;
                ((C0826n) objA).resumeWith(p079h8.q.b(p079h8.A.f21846a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f3206a.getAndSet(Q.f3204a);
        kotlin.jvm.internal.n.e(andSet);
        return andSet == Q.f3205b;
    }
}
