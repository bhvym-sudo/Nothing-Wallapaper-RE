package K8;

import F8.L0;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A extends AbstractC0909b implements L0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4139t = AtomicIntegerFieldUpdater.newUpdater(A.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f4140s;

    public A(long j9, A a10, int i10) {
        super(a10);
        this.f4140s = j9;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // K8.AbstractC0909b
    public boolean k() {
        return f4139t.get(this) == r() && !l();
    }

    public final boolean p() {
        return f4139t.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th, p129m8.i iVar);

    public final void t() {
        if (f4139t.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4139t;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ArrayPool.STANDARD_BUFFER_SIZE_BYTES + i10));
        return true;
    }
}
