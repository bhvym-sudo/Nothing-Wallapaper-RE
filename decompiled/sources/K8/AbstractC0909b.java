package K8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: K8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0909b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4157q = AtomicReferenceFieldUpdater.newUpdater(AbstractC0909b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4158r = AtomicReferenceFieldUpdater.newUpdater(AbstractC0909b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC0909b(AbstractC0909b abstractC0909b) {
        this._prev$volatile = abstractC0909b;
    }

    private final AbstractC0909b c() {
        AbstractC0909b abstractC0909bH = h();
        while (abstractC0909bH != null && abstractC0909bH.k()) {
            abstractC0909bH = (AbstractC0909b) f4158r.get(abstractC0909bH);
        }
        return abstractC0909bH;
    }

    private final AbstractC0909b d() {
        AbstractC0909b abstractC0909bF;
        AbstractC0909b abstractC0909bF2 = f();
        kotlin.jvm.internal.n.e(abstractC0909bF2);
        while (abstractC0909bF2.k() && (abstractC0909bF = abstractC0909bF2.f()) != null) {
            abstractC0909bF2 = abstractC0909bF;
        }
        return abstractC0909bF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f4157q.get(this);
    }

    public final void b() {
        f4158r.set(this, null);
    }

    public final AbstractC0909b f() {
        Object objG = g();
        if (objG == AbstractC0908a.f4156a) {
            return null;
        }
        return (AbstractC0909b) objG;
    }

    public final AbstractC0909b h() {
        return (AbstractC0909b) f4158r.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return f4157q.compareAndSet(this, null, AbstractC0908a.f4156a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC0909b abstractC0909bC = c();
            AbstractC0909b abstractC0909bD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4158r;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC0909bD);
            } while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0909bD, obj, ((AbstractC0909b) obj) == null ? null : abstractC0909bC));
            if (abstractC0909bC != null) {
                f4157q.set(abstractC0909bC, abstractC0909bD);
            }
            if (!abstractC0909bD.k() || abstractC0909bD.l()) {
                if (abstractC0909bC == null || !abstractC0909bC.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC0909b abstractC0909b) {
        return f4157q.compareAndSet(this, null, abstractC0909b);
    }
}
