package M8;

import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5171b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5172c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5173d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5174e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f5175a = new AtomicReferenceArray(Optimizer.OPTIMIZATION_GRAPH_WRAP);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f5162r) {
            f5174e.incrementAndGet(this);
        }
        int i10 = f5172c.get(this) & 127;
        while (this.f5175a.get(i10) != null) {
            Thread.yield();
        }
        this.f5175a.lazySet(i10, hVar);
        f5172c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f5162r) {
            return;
        }
        f5174e.decrementAndGet(this);
    }

    private final int e() {
        return f5172c.get(this) - f5173d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f5173d.get(this);
            if (i10 - f5172c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f5173d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f5175a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z9) {
        h hVar;
        do {
            hVar = (h) f5171b.get(this);
            if (hVar == null || hVar.f5162r != z9) {
                int i10 = f5173d.get(this);
                int i11 = f5172c.get(this);
                while (i10 != i11) {
                    if (z9 && f5174e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z9);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!f5171b.compareAndSet(this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f5173d.get(this);
        int i12 = f5172c.get(this);
        boolean z9 = i10 == 1;
        while (i11 != i12) {
            if (z9 && f5174e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z9);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z9) {
        int i11 = i10 & 127;
        h hVar = (h) this.f5175a.get(i11);
        if (hVar == null || hVar.f5162r != z9 || !this.f5175a.compareAndSet(i11, hVar, null)) {
            return null;
        }
        if (z9) {
            f5174e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, E e10) {
        h hVar;
        do {
            hVar = (h) f5171b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f5162r ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f5169f.a() - hVar.f5161q;
            long j9 = j.f5165b;
            if (jA < j9) {
                return j9 - jA;
            }
        } while (!f5171b.compareAndSet(this, hVar, null));
        e10.f22779q = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z9) {
        if (z9) {
            return b(hVar);
        }
        h hVar2 = (h) f5171b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        Object obj = f5171b.get(this);
        int iE = e();
        return obj != null ? iE + 1 : iE;
    }

    public final void j(d dVar) {
        h hVar = (h) f5171b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f5171b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, E e10) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, e10);
        }
        e10.f22779q = hVarM;
        return -1L;
    }
}
