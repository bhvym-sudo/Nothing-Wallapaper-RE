package M8;

import F8.AbstractC0804c;
import F8.P;
import K8.D;
import K8.y;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f5130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f5131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M8.d f5132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final M8.d f5133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f5134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0186a f5125x = new C0186a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5126y = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5127z = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5123A = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final D f5124B = new D("NOT_IN_STACK");

    /* JADX INFO: renamed from: M8.a$a, reason: collision with other inner class name */
    public static final class C0186a {
        public /* synthetic */ C0186a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0186a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5135a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5135a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ p149o8.a f5151w = p149o8.b.a(d());
    }

    public a(int i10, int i11, long j9, String str) {
        this.f5128q = i10;
        this.f5129r = i11;
        this.f5130s = j9;
        this.f5131t = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j9 > 0) {
            this.f5132u = new M8.d();
            this.f5133v = new M8.d();
            this.f5134w = new y((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j9 + " must be positive").toString());
    }

    private final void A0(long j9) {
        if (T0() || O0(j9)) {
            return;
        }
        T0();
    }

    public static /* synthetic */ void B(a aVar, Runnable runnable, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.z(runnable, z9, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater G() {
        return f5127z;
    }

    private final h I0(c cVar, h hVar, boolean z9) {
        d dVar;
        if (cVar == null || (dVar = cVar.f5139s) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f5162r && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f5143w = true;
        return cVar.f5137q.a(hVar, z9);
    }

    private final boolean O0(long j9) {
        if (B8.h.f(((int) (2097151 & j9)) - ((int) ((j9 & 4398044413952L) >> 21)), 0) < this.f5128q) {
            int iF = f();
            if (iF == 1 && this.f5128q > 1) {
                f();
            }
            if (iF > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean P0(a aVar, long j9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j9 = f5127z.get(aVar);
        }
        return aVar.O0(j9);
    }

    private final int Q(c cVar) {
        Object objG = cVar.g();
        while (objG != f5124B) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    private final boolean T0() {
        c cVarU;
        do {
            cVarU = U();
            if (cVarU == null) {
                return false;
            }
        } while (!c.f5136y.compareAndSet(cVarU, -1, 0));
        LockSupport.unpark(cVarU);
        return true;
    }

    private final c U() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5126y;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f5134w.b((int) (2097151 & j9));
            if (cVar == null) {
                return null;
            }
            long j10 = (2097152 + j9) & (-2097152);
            int iQ = this.Q(cVar);
            if (iQ >= 0) {
                a aVar = this;
                if (f5126y.compareAndSet(aVar, j9, ((long) iQ) | j10)) {
                    cVar.o(f5124B);
                    return cVar;
                }
                this = aVar;
            }
        }
    }

    private final boolean b(h hVar) {
        return hVar.f5162r ? this.f5133v.a(hVar) : this.f5132u.a(hVar);
    }

    private final int f() {
        synchronized (this.f5134w) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j9 = f5127z.get(this);
                int i10 = (int) (j9 & 2097151);
                int iF = B8.h.f(i10 - ((int) ((j9 & 4398044413952L) >> 21)), 0);
                if (iF >= this.f5128q) {
                    return 0;
                }
                if (i10 >= this.f5129r) {
                    return 0;
                }
                int i11 = ((int) (G().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f5134w.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f5134w.c(i11, cVar);
                if (i11 != ((int) (2097151 & f5127z.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iF + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c u() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !n.d(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void B0() {
        if (T0() || P0(this, 0L, 1, null)) {
            return;
        }
        T0();
    }

    public final boolean Y(c cVar) {
        if (cVar.g() != f5124B) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5126y;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            int iF = cVar.f();
            cVar.o(this.f5134w.b((int) (2097151 & j9)));
            long j10 = ((2097152 + j9) & (-2097152)) | ((long) iF);
            a aVar = this;
            if (f5126y.compareAndSet(aVar, j9, j10)) {
                return true;
            }
            this = aVar;
        }
    }

    public final void b0(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5126y;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            int iQ = (int) (2097151 & j9);
            long j10 = (2097152 + j9) & (-2097152);
            if (iQ == i10) {
                iQ = i11 == 0 ? this.Q(cVar) : i11;
            }
            if (iQ >= 0) {
                a aVar = this;
                if (f5126y.compareAndSet(aVar, j9, j10 | ((long) iQ))) {
                    return;
                } else {
                    this = aVar;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        t0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        B(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f5123A.get(this) == 1;
    }

    public final h j(Runnable runnable, boolean z9) {
        long jA = j.f5169f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z9);
        }
        h hVar = (h) runnable;
        hVar.f5161q = jA;
        hVar.f5162r = z9;
        return hVar;
    }

    public final void q0(h hVar) {
        try {
            hVar.run();
            AbstractC0804c.a();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC0804c.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void t0(long j9) throws InterruptedException {
        int i10;
        h hVarE;
        if (f5123A.compareAndSet(this, 0, 1)) {
            c cVarU = u();
            synchronized (this.f5134w) {
                i10 = (int) (G().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f5134w.b(i11);
                    n.e(objB);
                    c cVar = (c) objB;
                    if (cVar != cVarU) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j9);
                        }
                        cVar.f5137q.j(this.f5133v);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f5133v.b();
            this.f5132u.b();
            while (true) {
                if (cVarU == null) {
                    hVarE = (h) this.f5132u.e();
                    if (hVarE == null && (hVarE = (h) this.f5133v.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarU.e(true);
                    if (hVarE == null) {
                        hVarE = (h) this.f5132u.e();
                        if (hVarE == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                q0(hVarE);
            }
            if (cVarU != null) {
                cVarU.r(d.TERMINATED);
            }
            f5126y.set(this, 0L);
            f5127z.set(this, 0L);
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f5134w.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f5134w.b(i15);
            if (cVar != null) {
                int i16 = cVar.f5137q.i();
                int i17 = b.f5135a[cVar.f5139s.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new m();
                    }
                    i14++;
                }
            }
        }
        long j9 = f5127z.get(this);
        return this.f5131t + '@' + P.b(this) + "[Pool Size {core = " + this.f5128q + ", max = " + this.f5129r + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f5132u.c() + ", global blocking queue size = " + this.f5133v.c() + ", Control State {created workers= " + ((int) (2097151 & j9)) + ", blocking tasks = " + ((int) ((4398044413952L & j9) >> 21)) + ", CPUs acquired = " + (this.f5128q - ((int) ((9223367638808264704L & j9) >> 42))) + "}]";
    }

    public final void z(Runnable runnable, boolean z9, boolean z10) {
        AbstractC0804c.a();
        h hVarJ = j(runnable, z9);
        boolean z11 = hVarJ.f5162r;
        long jAddAndGet = z11 ? f5127z.addAndGet(this, 2097152L) : 0L;
        h hVarI0 = I0(u(), hVarJ, z10);
        if (hVarI0 != null && !b(hVarI0)) {
            throw new RejectedExecutionException(this.f5131t + " was terminated");
        }
        if (z11) {
            A0(jAddAndGet);
        } else {
            B0();
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f5136y = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final l f5137q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final E f5138r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public d f5139s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f5140t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f5141u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f5142v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f5143w;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f5137q = new l();
            this.f5138r = new E();
            this.f5139s = d.DORMANT;
            this.nextParkedWorker = a.f5124B;
            int iNanoTime = (int) System.nanoTime();
            this.f5142v = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f5140t = 0L;
            if (this.f5139s == d.PARKING) {
                this.f5139s = d.BLOCKING;
            }
            if (!hVar.f5162r) {
                a.this.q0(hVar);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.B0();
            }
            a.this.q0(hVar);
            a.G().addAndGet(a.this, -2097152L);
            if (this.f5139s != d.TERMINATED) {
                this.f5139s = d.DORMANT;
            }
        }

        private final h c(boolean z9) {
            h hVarL;
            h hVarL2;
            if (z9) {
                boolean z10 = j(a.this.f5128q * 2) == 0;
                if (z10 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f5137q.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z10 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f5137q.l();
            return (hVarL == null && (hVarL = (h) a.this.f5133v.e()) == null) ? s(1) : hVarL;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f5124B;
        }

        private final void k() {
            if (this.f5140t == 0) {
                this.f5140t = System.nanoTime() + a.this.f5130s;
            }
            LockSupport.parkNanos(a.this.f5130s);
            if (System.nanoTime() - this.f5140t >= 0) {
                this.f5140t = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f5132u.e();
                return hVar != null ? hVar : (h) a.this.f5133v.e();
            }
            h hVar2 = (h) a.this.f5133v.e();
            return hVar2 != null ? hVar2 : (h) a.this.f5132u.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z9 = false;
                while (true) {
                    if (a.this.isTerminated() || this.f5139s == d.TERMINATED) {
                        break loop0;
                    }
                    h hVarE = e(this.f5143w);
                    if (hVarE != null) {
                        this.f5141u = 0L;
                        b(hVarE);
                        break;
                    }
                    this.f5143w = false;
                    if (this.f5141u == 0) {
                        q();
                    } else {
                        if (z9) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f5141u);
                            this.f5141u = 0L;
                            break;
                        }
                        z9 = true;
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            long j9;
            if (this.f5139s == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterG = a.G();
            do {
                j9 = atomicLongFieldUpdaterG.get(aVar);
                if (((int) ((9223367638808264704L & j9) >> 42)) == 0) {
                    return false;
                }
            } while (!a.G().compareAndSet(aVar, j9, j9 - 4398046511104L));
            this.f5139s = d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.Y(this);
                return;
            }
            f5136y.set(this, -1);
            while (i() && f5136y.get(this) == -1 && !a.this.isTerminated() && this.f5139s != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.G().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f5134w.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f5137q.r(i10, this.f5138r);
                    if (jR == -1) {
                        E e10 = this.f5138r;
                        h hVar = (h) e10.f22779q;
                        e10.f22779q = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f5141u = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f5134w) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.G().get(aVar) & 2097151)) <= aVar.f5128q) {
                        return;
                    }
                    if (f5136y.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.b0(this, i10, 0);
                        int andDecrement = (int) (a.G().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object objB = aVar.f5134w.b(andDecrement);
                            n.e(objB);
                            c cVar = (c) objB;
                            aVar.f5134w.c(i10, cVar);
                            cVar.n(i10);
                            aVar.b0(cVar, andDecrement, i10);
                        }
                        aVar.f5134w.c(andDecrement, null);
                        A a10 = A.f21846a;
                        this.f5139s = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h e(boolean z9) {
            return p() ? c(z9) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f5142v;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f5142v = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i15 & i14 : (Integer.MAX_VALUE & i14) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f5131t);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f5139s;
            boolean z9 = dVar2 == d.CPU_ACQUIRED;
            if (z9) {
                a.G().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f5139s = dVar;
            }
            return z9;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
