package O8;

import F8.InterfaceC0822l;
import F8.c1;
import K8.AbstractC0908a;
import K8.B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5944c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5945d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5946e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f5947f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5948g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f5950b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f5951q = new a();

        a() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k g(long j9, k kVar) {
            return j.h(j9, kVar);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).longValue(), (k) obj2);
        }
    }

    /* synthetic */ class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f5952q = new b();

        b() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k g(long j9, k kVar) {
            return j.h(j9, kVar);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).longValue(), (k) obj2);
        }
    }

    public i(int i10, int i11) {
        this.f5949a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10 - i11;
        this.f5950b = new q() { // from class: O8.h
            @Override // p219v8.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                return i.o(this.f5943q, (Throwable) obj, (A) obj2, (p129m8.i) obj3);
            }
        };
    }

    private final boolean f(c1 c1Var) {
        Object objC;
        k kVar = (k) f5946e.get(this);
        long andIncrement = f5947f.getAndIncrement(this);
        a aVar = a.f5951q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5946e;
        long j9 = andIncrement / ((long) j.f5958f);
        loop0: while (true) {
            objC = AbstractC0908a.c(kVar, j9, aVar);
            if (!B.c(objC)) {
                K8.A aB = B.b(objC);
                while (true) {
                    K8.A a10 = (K8.A) atomicReferenceFieldUpdater.get(this);
                    if (a10.f4140s >= aB.f4140s) {
                        break loop0;
                    }
                    if (!aB.u()) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(this, a10, aB)) {
                        if (!a10.p()) {
                            break loop0;
                        }
                        a10.n();
                        break loop0;
                    }
                    if (aB.p()) {
                        aB.n();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) B.b(objC);
        int i10 = (int) (andIncrement % ((long) j.f5958f));
        if (kVar2.v().compareAndSet(i10, null, c1Var)) {
            c1Var.b(kVar2, i10);
            return true;
        }
        if (!kVar2.v().compareAndSet(i10, j.f5954b, j.f5955c)) {
            return false;
        }
        if (c1Var instanceof InterfaceC0822l) {
            n.f(c1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC0822l) c1Var).m(A.f21846a, this.f5950b);
        } else {
            if (!(c1Var instanceof N8.k)) {
                throw new IllegalStateException(("unexpected: " + c1Var).toString());
            }
            ((N8.k) c1Var).f(A.f21846a);
        }
        return true;
    }

    private final void g() {
        int i10;
        do {
            i10 = f5948g.get(this);
            if (i10 <= this.f5949a) {
                return;
            }
        } while (!f5948g.compareAndSet(this, i10, this.f5949a));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f5948g.getAndDecrement(this);
        } while (andDecrement > this.f5949a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A o(i iVar, Throwable th, A a10, p129m8.i iVar2) {
        iVar.p();
        return A.f21846a;
    }

    private final boolean r(Object obj) {
        if (!(obj instanceof InterfaceC0822l)) {
            if (obj instanceof N8.k) {
                return ((N8.k) obj).d(this, A.f21846a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0822l interfaceC0822l = (InterfaceC0822l) obj;
        Object objR = interfaceC0822l.r(A.f21846a, null, this.f5950b);
        if (objR == null) {
            return false;
        }
        interfaceC0822l.t(objR);
        return true;
    }

    private final boolean s() {
        Object objC;
        k kVar = (k) f5944c.get(this);
        long andIncrement = f5945d.getAndIncrement(this);
        long j9 = andIncrement / ((long) j.f5958f);
        b bVar = b.f5952q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5944c;
        loop0: while (true) {
            objC = AbstractC0908a.c(kVar, j9, bVar);
            if (B.c(objC)) {
                break;
            }
            K8.A aB = B.b(objC);
            while (true) {
                K8.A a10 = (K8.A) atomicReferenceFieldUpdater.get(this);
                if (a10.f4140s >= aB.f4140s) {
                    break loop0;
                }
                if (!aB.u()) {
                    break;
                }
                if (atomicReferenceFieldUpdater.compareAndSet(this, a10, aB)) {
                    if (!a10.p()) {
                        break loop0;
                    }
                    a10.n();
                    break loop0;
                }
                if (aB.p()) {
                    aB.n();
                }
            }
        }
        k kVar2 = (k) B.b(objC);
        kVar2.b();
        if (kVar2.f4140s > j9) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) j.f5958f));
        Object andSet = kVar2.v().getAndSet(i10, j.f5954b);
        if (andSet != null) {
            if (andSet == j.f5957e) {
                return false;
            }
            return r(andSet);
        }
        int i11 = j.f5953a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (kVar2.v().get(i10) == j.f5955c) {
                return true;
            }
        }
        return !kVar2.v().compareAndSet(i10, j.f5954b, j.f5956d);
    }

    protected final void e(InterfaceC0822l interfaceC0822l) {
        while (h() <= 0) {
            n.f(interfaceC0822l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((c1) interfaceC0822l)) {
                return;
            }
        }
        interfaceC0822l.m(A.f21846a, this.f5950b);
    }

    public final int i() {
        return Math.max(f5948g.get(this), 0);
    }

    public final void p() {
        do {
            int andIncrement = f5948g.getAndIncrement(this);
            if (andIncrement >= this.f5949a) {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f5949a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!s());
    }

    public final boolean q() {
        while (true) {
            int i10 = f5948g.get(this);
            if (i10 > this.f5949a) {
                g();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f5948g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
