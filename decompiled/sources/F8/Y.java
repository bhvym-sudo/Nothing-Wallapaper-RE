package F8;

import K8.AbstractC0916i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class Y extends K8.z {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1843u = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Y(p129m8.i iVar, p129m8.e eVar) {
        super(iVar, eVar);
    }

    private final boolean b1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1843u;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f1843u.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean d1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1843u;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f1843u.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // K8.z, F8.AbstractC0800a
    protected void S0(Object obj) {
        if (b1()) {
            return;
        }
        AbstractC0916i.b(p139n8.b.c(this.f4198t), C.a(obj, this.f4198t));
    }

    public final Object Z0() {
        if (d1()) {
            return p139n8.b.e();
        }
        Object objH = E0.h(c0());
        if (objH instanceof A) {
            throw ((A) objH).f1787a;
        }
        return objH;
    }

    @Override // K8.z, F8.D0
    protected void y(Object obj) {
        S0(obj);
    }
}
