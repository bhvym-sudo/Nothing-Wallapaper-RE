package F8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: F8.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0817i0 extends AbstractC0819j0 implements V {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1870v = AtomicReferenceFieldUpdater.newUpdater(AbstractC0817i0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1871w = AtomicReferenceFieldUpdater.newUpdater(AbstractC0817i0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1872x = AtomicIntegerFieldUpdater.newUpdater(AbstractC0817i0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: F8.i0$a */
    private final class a extends c {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final InterfaceC0822l f1873s;

        public a(long j9, InterfaceC0822l interfaceC0822l) {
            super(j9);
            this.f1873s = interfaceC0822l;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1873s.q(AbstractC0817i0.this, p079h8.A.f21846a);
        }

        @Override // F8.AbstractC0817i0.c
        public String toString() {
            return super.toString() + this.f1873s;
        }
    }

    /* JADX INFO: renamed from: F8.i0$b */
    private static final class b extends c {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Runnable f1875s;

        public b(long j9, Runnable runnable) {
            super(j9);
            this.f1875s = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1875s.run();
        }

        @Override // F8.AbstractC0817i0.c
        public String toString() {
            return super.toString() + this.f1875s;
        }
    }

    /* JADX INFO: renamed from: F8.i0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC0807d0, K8.N {
        private volatile Object _heap;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f1876q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f1877r = -1;

        public c(long j9) {
            this.f1876q = j9;
        }

        @Override // F8.InterfaceC0807d0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC0823l0.f1881a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC0823l0.f1881a;
                    p079h8.A a10 = p079h8.A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // K8.N
        public K8.M e() {
            Object obj = this._heap;
            if (obj instanceof K8.M) {
                return (K8.M) obj;
            }
            return null;
        }

        @Override // K8.N
        public void f(int i10) {
            this.f1877r = i10;
        }

        @Override // K8.N
        public int g() {
            return this.f1877r;
        }

        @Override // K8.N
        public void h(K8.M m9) {
            if (this._heap == AbstractC0823l0.f1881a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m9;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j9 = this.f1876q - cVar.f1876q;
            if (j9 > 0) {
                return 1;
            }
            return j9 < 0 ? -1 : 0;
        }

        public final int k(long j9, d dVar, AbstractC0817i0 abstractC0817i0) {
            synchronized (this) {
                if (this._heap == AbstractC0823l0.f1881a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC0817i0.O0()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f1878c = j9;
                        } else {
                            long j10 = cVar.f1876q;
                            if (j10 - j9 < 0) {
                                j9 = j10;
                            }
                            if (j9 - dVar.f1878c > 0) {
                                dVar.f1878c = j9;
                            }
                        }
                        long j11 = this.f1876q;
                        long j12 = dVar.f1878c;
                        if (j11 - j12 < 0) {
                            this.f1876q = j12;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean l(long j9) {
            return j9 - this.f1876q >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f1876q + ']';
        }
    }

    /* JADX INFO: renamed from: F8.i0$d */
    public static final class d extends K8.M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f1878c;

        public d(long j9) {
            this.f1878c = j9;
        }
    }

    private final void B1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1870v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (f1870v.compareAndSet(this, null, AbstractC0823l0.f1882b)) {
                    return;
                }
            } else if (obj instanceof K8.q) {
                ((K8.q) obj).d();
                return;
            } else {
                if (obj == AbstractC0823l0.f1882b) {
                    return;
                }
                K8.q qVar = new K8.q(8, true);
                kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (f1870v.compareAndSet(this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable C1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1870v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof K8.q) {
                kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                K8.q qVar = (K8.q) obj;
                Object objM = qVar.m();
                if (objM != K8.q.f4186h) {
                    return (Runnable) objM;
                }
                f1870v.compareAndSet(this, obj, qVar.l());
            } else {
                if (obj == AbstractC0823l0.f1882b) {
                    return null;
                }
                if (f1870v.compareAndSet(this, obj, null)) {
                    kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void E1() {
        K8.N nI;
        d dVar = (d) f1871w.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC0804c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    K8.N nB = dVar.b();
                    nI = null;
                    if (nB != null) {
                        c cVar = (c) nB;
                        nI = cVar.l(jNanoTime) ? F1(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((c) nI) != null);
    }

    private final boolean F1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1870v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (O0()) {
                return false;
            }
            if (obj == null) {
                if (f1870v.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof K8.q) {
                kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                K8.q qVar = (K8.q) obj;
                int iA = qVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    f1870v.compareAndSet(this, obj, qVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC0823l0.f1882b) {
                    return false;
                }
                K8.q qVar2 = new K8.q(8, true);
                kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (f1870v.compareAndSet(this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    private final void K1() {
        c cVar;
        AbstractC0804c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f1871w.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                y1(jNanoTime, cVar);
            }
        }
    }

    private final int N1(long j9, c cVar) {
        if (O0()) {
            return 1;
        }
        d dVar = (d) f1871w.get(this);
        if (dVar == null) {
            f1871w.compareAndSet(this, null, new d(j9));
            Object obj = f1871w.get(this);
            kotlin.jvm.internal.n.e(obj);
            dVar = (d) obj;
        }
        return cVar.k(j9, dVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O0() {
        return f1872x.get(this) == 1;
    }

    private final void P1(boolean z9) {
        f1872x.set(this, z9 ? 1 : 0);
    }

    private final boolean Q1(c cVar) {
        d dVar = (d) f1871w.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    public void D1(Runnable runnable) {
        E1();
        if (F1(runnable)) {
            z1();
        } else {
            Q.f1832y.D1(runnable);
        }
    }

    protected boolean J1() {
        if (!t1()) {
            return false;
        }
        d dVar = (d) f1871w.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f1870v.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof K8.q) {
            return ((K8.q) obj).j();
        }
        return obj == AbstractC0823l0.f1882b;
    }

    protected final void L1() {
        f1870v.set(this, null);
        f1871w.set(this, null);
    }

    public final void M1(long j9, c cVar) {
        int iN1 = N1(j9, cVar);
        if (iN1 == 0) {
            if (Q1(cVar)) {
                z1();
            }
        } else if (iN1 == 1) {
            y1(j9, cVar);
        } else if (iN1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final InterfaceC0807d0 O1(long j9, Runnable runnable) {
        long jC = AbstractC0823l0.c(j9);
        if (jC >= 4611686018427387903L) {
            return K0.f1820q;
        }
        AbstractC0804c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        M1(jNanoTime, bVar);
        return bVar;
    }

    @Override // F8.V
    public void T0(long j9, InterfaceC0822l interfaceC0822l) {
        long jC = AbstractC0823l0.c(j9);
        if (jC < 4611686018427387903L) {
            AbstractC0804c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, interfaceC0822l);
            M1(jNanoTime, aVar);
            AbstractC0830p.a(interfaceC0822l, aVar);
        }
    }

    public InterfaceC0807d0 W0(long j9, Runnable runnable, p129m8.i iVar) {
        return V.a.a(this, j9, runnable, iVar);
    }

    @Override // F8.I
    public final void g1(p129m8.i iVar, Runnable runnable) {
        D1(runnable);
    }

    @Override // F8.AbstractC0815h0
    protected long p1() {
        c cVar;
        if (super.p1() == 0) {
            return 0L;
        }
        Object obj = f1870v.get(this);
        if (obj != null) {
            if (!(obj instanceof K8.q)) {
                return obj == AbstractC0823l0.f1882b ? Long.MAX_VALUE : 0L;
            }
            if (!((K8.q) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f1871w.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j9 = cVar.f1876q;
        AbstractC0804c.a();
        return B8.h.g(j9 - System.nanoTime(), 0L);
    }

    @Override // F8.AbstractC0815h0
    public void shutdown() {
        V0.f1836a.c();
        P1(true);
        B1();
        while (u1() <= 0) {
        }
        K1();
    }

    @Override // F8.AbstractC0815h0
    public long u1() {
        if (v1()) {
            return 0L;
        }
        E1();
        Runnable runnableC1 = C1();
        if (runnableC1 == null) {
            return p1();
        }
        runnableC1.run();
        return 0L;
    }
}
