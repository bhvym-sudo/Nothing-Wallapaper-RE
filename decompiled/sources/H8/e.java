package H8;

import F8.AbstractC0830p;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.c1;
import K8.A;
import K8.AbstractC0908a;
import K8.AbstractC0909b;
import K8.AbstractC0917j;
import K8.B;
import K8.C;
import K8.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.I;
import p079h8.AbstractC1388c;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public class e implements H8.g {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f2581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p219v8.l f2582r;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p219v8.q f2583s;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f2574t = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f2575u = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f2576v = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f2577w = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2578x = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2579y = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2580z = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2572A = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f2573B = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");

    private final class a implements i, c1 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Object f2584q = H8.f.f2614p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private C0826n f2585r;

        public a() {
        }

        private final Object f(l lVar, int i10, long j9, p129m8.e eVar) {
            Boolean boolA;
            l lVar2;
            e eVar2 = e.this;
            C0826n c0826nB = AbstractC0830p.b(p139n8.b.c(eVar));
            try {
                this.f2585r = c0826nB;
                Object objM1 = eVar2.m1(lVar, i10, j9, this);
                if (objM1 != H8.f.f2611m) {
                    p219v8.q qVarL = null;
                    if (objM1 == H8.f.f2613o) {
                        if (j9 < eVar2.o0()) {
                            lVar.b();
                        }
                        l lVar3 = (l) e.i0().get(eVar2);
                        while (true) {
                            if (eVar2.w0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.j0().getAndIncrement(eVar2);
                            int i11 = H8.f.f2600b;
                            long j10 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (lVar3.f4140s != j10) {
                                l lVarZ = eVar2.Z(j10, lVar3);
                                if (lVarZ != null) {
                                    lVar2 = lVarZ;
                                }
                            } else {
                                lVar2 = lVar3;
                            }
                            Object objM2 = eVar2.m1(lVar2, i12, andIncrement, this);
                            l lVar4 = lVar2;
                            if (objM2 == H8.f.f2611m) {
                                eVar2.S0(this, lVar4, i12);
                                break;
                            }
                            if (objM2 == H8.f.f2613o) {
                                if (andIncrement < eVar2.o0()) {
                                    lVar4.b();
                                }
                                lVar3 = lVar4;
                            } else {
                                if (objM2 == H8.f.f2612n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                lVar4.b();
                                this.f2584q = objM2;
                                this.f2585r = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                p219v8.l lVar5 = eVar2.f2582r;
                                if (lVar5 != null) {
                                    qVarL = eVar2.L(lVar5, objM2);
                                }
                            }
                        }
                    } else {
                        lVar.b();
                        this.f2584q = objM1;
                        this.f2585r = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        p219v8.l lVar6 = eVar2.f2582r;
                        if (lVar6 != null) {
                            qVarL = eVar2.L(lVar6, objM1);
                        }
                    }
                    c0826nB.m(boolA, qVarL);
                    break;
                }
                eVar2.S0(this, lVar, i10);
                Object objA = c0826nB.A();
                if (objA == p139n8.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(eVar);
                }
                return objA;
            } catch (Throwable th) {
                c0826nB.P();
                throw th;
            }
        }

        private final boolean g() throws Throwable {
            this.f2584q = H8.f.z();
            Throwable thE0 = e.this.e0();
            if (thE0 == null) {
                return false;
            }
            throw C.a(thE0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C0826n c0826n = this.f2585r;
            kotlin.jvm.internal.n.e(c0826n);
            this.f2585r = null;
            this.f2584q = H8.f.z();
            Throwable thE0 = e.this.e0();
            if (thE0 == null) {
                h8.q.a aVar = p079h8.q.f21862r;
                c0826n.resumeWith(p079h8.q.b(Boolean.FALSE));
            } else {
                h8.q.a aVar2 = p079h8.q.f21862r;
                c0826n.resumeWith(p079h8.q.b(p079h8.r.a(thE0)));
            }
        }

        @Override // H8.i
        public Object a(p129m8.e eVar) throws Throwable {
            l lVarZ;
            boolean zG = true;
            if (this.f2584q == H8.f.f2614p || this.f2584q == H8.f.z()) {
                e eVar2 = e.this;
                l lVar = (l) e.i0().get(eVar2);
                while (!eVar2.w0()) {
                    long andIncrement = e.j0().getAndIncrement(eVar2);
                    int i10 = H8.f.f2600b;
                    long j9 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (lVar.f4140s != j9) {
                        lVarZ = eVar2.Z(j9, lVar);
                        if (lVarZ == null) {
                            continue;
                        }
                    } else {
                        lVarZ = lVar;
                    }
                    Object objM1 = eVar2.m1(lVarZ, i11, andIncrement, null);
                    if (objM1 == H8.f.f2611m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objM1 == H8.f.f2613o) {
                        if (andIncrement < eVar2.o0()) {
                            lVarZ.b();
                        }
                        lVar = lVarZ;
                    } else {
                        if (objM1 == H8.f.f2612n) {
                            return f(lVarZ, i11, andIncrement, eVar);
                        }
                        lVarZ.b();
                        this.f2584q = objM1;
                    }
                }
                zG = g();
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        @Override // F8.c1
        public void b(A a10, int i10) {
            C0826n c0826n = this.f2585r;
            if (c0826n != null) {
                c0826n.b(a10, i10);
            }
        }

        public final boolean i(Object obj) {
            C0826n c0826n = this.f2585r;
            kotlin.jvm.internal.n.e(c0826n);
            this.f2585r = null;
            this.f2584q = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            p219v8.l lVar = eVar.f2582r;
            return H8.f.B(c0826n, bool, lVar != null ? eVar.L(lVar, obj) : null);
        }

        public final void j() {
            C0826n c0826n = this.f2585r;
            kotlin.jvm.internal.n.e(c0826n);
            this.f2585r = null;
            this.f2584q = H8.f.z();
            Throwable thE0 = e.this.e0();
            if (thE0 == null) {
                h8.q.a aVar = p079h8.q.f21862r;
                c0826n.resumeWith(p079h8.q.b(Boolean.FALSE));
            } else {
                h8.q.a aVar2 = p079h8.q.f21862r;
                c0826n.resumeWith(p079h8.q.b(p079h8.r.a(thE0)));
            }
        }

        @Override // H8.i
        public Object next() throws Throwable {
            Object obj = this.f2584q;
            if (obj == H8.f.f2614p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f2584q = H8.f.f2614p;
            if (obj != H8.f.z()) {
                return obj;
            }
            throw C.a(e.this.h0());
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.l implements p219v8.q {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            g((Throwable) obj, obj2, (p129m8.i) obj3);
            return p079h8.A.f21846a;
        }

        public final void g(Throwable th, Object obj, p129m8.i iVar) {
            ((e) this.receiver).H0(th, obj, iVar);
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.l implements p219v8.q {
        c(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            g((Throwable) obj, ((k) obj2).k(), (p129m8.i) obj3);
            return p079h8.A.f21846a;
        }

        public final void g(Throwable th, Object obj, p129m8.i iVar) {
            ((e) this.receiver).G0(th, obj, iVar);
        }
    }

    /* synthetic */ class d extends kotlin.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final d f2587q = new d();

        d() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            g((e) obj, (N8.k) obj2, obj3);
            return p079h8.A.f21846a;
        }

        public final void g(e eVar, N8.k kVar, Object obj) {
            eVar.Z0(kVar, obj);
        }
    }

    /* JADX INFO: renamed from: H8.e$e, reason: collision with other inner class name */
    /* synthetic */ class C0098e extends kotlin.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final C0098e f2588q = new C0098e();

        C0098e() {
            super(3, e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object e(e eVar, Object obj, Object obj2) {
            return eVar.U0(obj, obj2);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f2589q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2591s;

        f(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2589q = obj;
            this.f2591s |= Integer.MIN_VALUE;
            Object objW0 = e.W0(e.this, this);
            return objW0 == p139n8.b.e() ? objW0 : k.b(objW0);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f2592q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2593r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2594s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f2595t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f2596u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f2598w;

        g(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2596u = obj;
            this.f2598w |= Integer.MIN_VALUE;
            Object objX0 = e.this.X0(null, 0, 0L, this);
            return objX0 == p139n8.b.e() ? objX0 : k.b(objX0);
        }
    }

    public e(int i10, p219v8.l lVar) {
        this.f2581q = i10;
        this.f2582r = lVar;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = H8.f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = c0();
        l lVar2 = new l(0L, null, this, 3);
        this.sendSegment$volatile = lVar2;
        this.receiveSegment$volatile = lVar2;
        if (A0()) {
            lVar2 = H8.f.f2599a;
            kotlin.jvm.internal.n.f(lVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = lVar2;
        this.f2583s = lVar != null ? new p219v8.q() { // from class: H8.b
            @Override // p219v8.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                return e.Q0(this.f2566q, (N8.k) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = H8.f.f2617s;
    }

    private final boolean A0() {
        long jC0 = c0();
        return jC0 == 0 || jC0 == Long.MAX_VALUE;
    }

    private final long B0(l lVar) {
        do {
            int i10 = H8.f.f2600b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j9 = (lVar.f4140s * ((long) H8.f.f2600b)) + ((long) i10);
                    if (j9 >= k0()) {
                        while (true) {
                            Object objB = lVar.B(i10);
                            if (objB != null && objB != H8.f.f2603e) {
                                if (objB != H8.f.f2602d) {
                                    break;
                                }
                                return j9;
                            }
                            if (lVar.v(i10, objB, H8.f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        return -1L;
    }

    private final void C0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2574t;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            if (((int) (j9 >> 60)) != 0) {
                return;
            }
            e eVar = this;
            if (atomicLongFieldUpdater.compareAndSet(eVar, j9, H8.f.w(1152921504606846975L & j9, 1))) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    private final void D0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2574t;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            e eVar = this;
            if (atomicLongFieldUpdater.compareAndSet(eVar, j9, H8.f.w(1152921504606846975L & j9, 3))) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    private final void E0() {
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2574t;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j9 >> 60);
            if (i10 == 0) {
                jW = H8.f.w(1152921504606846975L & j9, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = H8.f.w(1152921504606846975L & j9, 3);
            }
            e eVar = this;
            if (atomicLongFieldUpdater.compareAndSet(eVar, j9, jW)) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    private final void F0(long j9, l lVar) {
        l lVar2;
        l lVar3;
        while (lVar.f4140s < j9 && (lVar3 = (l) lVar.f()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.k() || (lVar2 = (l) lVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2580z;
                while (true) {
                    A a10 = (A) atomicReferenceFieldUpdater.get(this);
                    if (a10.f4140s >= lVar.f4140s) {
                        return;
                    }
                    if (!lVar.u()) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(this, a10, lVar)) {
                        if (a10.p()) {
                            a10.n();
                            return;
                        }
                        return;
                    } else if (lVar.p()) {
                        lVar.n();
                    }
                }
            } else {
                lVar = lVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(Throwable th, Object obj, p129m8.i iVar) {
        p219v8.l lVar = this.f2582r;
        kotlin.jvm.internal.n.e(lVar);
        Object objF = k.f(obj);
        kotlin.jvm.internal.n.e(objF);
        K8.w.a(lVar, objF, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(Throwable th, Object obj, p129m8.i iVar) {
        p219v8.l lVar = this.f2582r;
        kotlin.jvm.internal.n.e(lVar);
        K8.w.a(lVar, obj, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(InterfaceC0822l interfaceC0822l) {
        h8.q.a aVar = p079h8.q.f21862r;
        interfaceC0822l.resumeWith(p079h8.q.b(k.b(k.f2623b.a(e0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8.e K(p219v8.l lVar) {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(InterfaceC0822l interfaceC0822l) {
        h8.q.a aVar = p079h8.q.f21862r;
        interfaceC0822l.resumeWith(p079h8.q.b(p079h8.r.a(h0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p219v8.q L(final p219v8.l lVar, final Object obj) {
        return new p219v8.q() { // from class: H8.c
            @Override // p219v8.q
            public final Object e(Object obj2, Object obj3, Object obj4) {
                return e.M(lVar, obj, (Throwable) obj2, obj3, (p129m8.i) obj4);
            }
        };
    }

    private final void L0(N8.k kVar) {
        kVar.f(H8.f.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A M(p219v8.l lVar, Object obj, Throwable th, Object obj2, p129m8.i iVar) {
        K8.w.a(lVar, obj, iVar);
        return p079h8.A.f21846a;
    }

    private final Object M0(Object obj, p129m8.e eVar) {
        P pC;
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        p219v8.l lVar = this.f2582r;
        if (lVar == null || (pC = K8.w.c(lVar, obj, null, 2, null)) == null) {
            Throwable thL0 = l0();
            h8.q.a aVar = p079h8.q.f21862r;
            c0826n.resumeWith(p079h8.q.b(p079h8.r.a(thL0)));
        } else {
            AbstractC1388c.a(pC, l0());
            h8.q.a aVar2 = p079h8.q.f21862r;
            c0826n.resumeWith(p079h8.q.b(p079h8.r.a(pC)));
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8.e N(p219v8.l lVar) {
        return new c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(Object obj, InterfaceC0822l interfaceC0822l) {
        p219v8.l lVar = this.f2582r;
        if (lVar != null) {
            K8.w.a(lVar, obj, interfaceC0822l.getContext());
        }
        Throwable thL0 = l0();
        h8.q.a aVar = p079h8.q.f21862r;
        interfaceC0822l.resumeWith(p079h8.q.b(p079h8.r.a(thL0)));
    }

    private final boolean O(long j9) {
        return j9 < c0() || j9 < k0() + ((long) this.f2581q);
    }

    private final void Q(l lVar, long j9) {
        Object objB = AbstractC0917j.b(null, 1, null);
        loop0: while (lVar != null) {
            for (int i10 = H8.f.f2600b - 1; -1 < i10; i10--) {
                if ((lVar.f4140s * ((long) H8.f.f2600b)) + ((long) i10) < j9) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lVar.B(i10);
                    if (objB2 != null && objB2 != H8.f.f2603e) {
                        if (!(objB2 instanceof x)) {
                            if (!(objB2 instanceof c1)) {
                                break;
                            }
                            if (lVar.v(i10, objB2, H8.f.z())) {
                                objB = AbstractC0917j.c(objB, objB2);
                                lVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (lVar.v(i10, objB2, H8.f.z())) {
                                objB = AbstractC0917j.c(objB, ((x) objB2).f2637a);
                                lVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar.v(i10, objB2, H8.f.z())) {
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                b1((c1) objB);
                return;
            }
            kotlin.jvm.internal.n.f(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                b1((c1) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v8.q Q0(final e eVar, final N8.k kVar, Object obj, final Object obj2) {
        return new p219v8.q() { // from class: H8.d
            @Override // p219v8.q
            public final Object e(Object obj3, Object obj4, Object obj5) {
                return e.R0(obj2, eVar, kVar, (Throwable) obj3, obj4, (p129m8.i) obj5);
            }
        };
    }

    private final l R() {
        Object obj = f2580z.get(this);
        l lVar = (l) f2578x.get(this);
        if (lVar.f4140s > ((l) obj).f4140s) {
            obj = lVar;
        }
        l lVar2 = (l) f2579y.get(this);
        if (lVar2.f4140s > ((l) obj).f4140s) {
            obj = lVar2;
        }
        return (l) AbstractC0908a.b((AbstractC0909b) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A R0(Object obj, e eVar, N8.k kVar, Throwable th, Object obj2, p129m8.i iVar) {
        if (obj != H8.f.z()) {
            K8.w.a(eVar.f2582r, obj, kVar.getContext());
        }
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(c1 c1Var, l lVar, int i10) {
        P0();
        c1Var.b(lVar, i10);
    }

    private final void T(long j9) {
        a1(U(j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(c1 c1Var, l lVar, int i10) {
        c1Var.b(lVar, i10 + H8.f.f2600b);
    }

    private final l U(long j9) {
        l lVarR = R();
        if (z0()) {
            long jB0 = B0(lVarR);
            if (jB0 != -1) {
                W(jB0);
            }
        }
        Q(lVarR, j9);
        return lVarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U0(Object obj, Object obj2) {
        return k.b(obj2 == H8.f.z() ? k.f2623b.a(e0()) : k.f2623b.c(obj2));
    }

    private final void V() {
        s();
    }

    static /* synthetic */ Object V0(e eVar, p129m8.e eVar2) throws Throwable {
        l lVar;
        l lVar2 = (l) i0().get(eVar);
        while (!eVar.w0()) {
            long andIncrement = j0().getAndIncrement(eVar);
            int i10 = H8.f.f2600b;
            long j9 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar2.f4140s != j9) {
                l lVarZ = eVar.Z(j9, lVar2);
                if (lVarZ == null) {
                    continue;
                } else {
                    lVar = lVarZ;
                }
            } else {
                lVar = lVar2;
            }
            e eVar3 = eVar;
            Object objM1 = eVar3.m1(lVar, i11, andIncrement, null);
            if (objM1 == H8.f.f2611m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM1 != H8.f.f2613o) {
                if (objM1 == H8.f.f2612n) {
                    return eVar3.Y0(lVar, i11, andIncrement, eVar2);
                }
                lVar.b();
                return objM1;
            }
            if (andIncrement < eVar3.o0()) {
                lVar.b();
            }
            eVar = eVar3;
            lVar2 = lVar;
        }
        throw C.a(eVar.h0());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    static /* synthetic */ Object W0(e eVar, p129m8.e eVar2) {
        f fVar;
        l lVar;
        if (eVar2 instanceof f) {
            fVar = (f) eVar2;
            int i10 = fVar.f2591s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f2591s = i10 - Integer.MIN_VALUE;
            } else {
                fVar = eVar.new f(eVar2);
            }
        } else {
            fVar = eVar.new f(eVar2);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f2589q;
        Object objE = p139n8.b.e();
        int i11 = fVar2.f2591s;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return ((k) obj).k();
        }
        p079h8.r.b(obj);
        l lVar2 = (l) i0().get(eVar);
        while (!eVar.w0()) {
            long andIncrement = j0().getAndIncrement(eVar);
            int i12 = H8.f.f2600b;
            long j9 = andIncrement / ((long) i12);
            int i13 = (int) (andIncrement % ((long) i12));
            if (lVar2.f4140s != j9) {
                l lVarZ = eVar.Z(j9, lVar2);
                if (lVarZ == null) {
                    continue;
                } else {
                    lVar = lVarZ;
                }
            } else {
                lVar = lVar2;
            }
            e eVar3 = eVar;
            Object objM1 = eVar3.m1(lVar, i13, andIncrement, null);
            if (objM1 == H8.f.f2611m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM1 != H8.f.f2613o) {
                if (objM1 != H8.f.f2612n) {
                    lVar.b();
                    return k.f2623b.c(objM1);
                }
                fVar2.f2591s = 1;
                Object objX0 = eVar3.X0(lVar, i13, andIncrement, fVar2);
                return objX0 == objE ? objE : objX0;
            }
            if (andIncrement < eVar3.o0()) {
                lVar.b();
            }
            eVar = eVar3;
            lVar2 = lVar;
        }
        return k.f2623b.a(eVar.e0());
    }

    private final void X() {
        e eVar;
        if (A0()) {
            return;
        }
        l lVar = (l) f2580z.get(this);
        while (true) {
            long andIncrement = f2576v.getAndIncrement(this);
            int i10 = H8.f.f2600b;
            long j9 = andIncrement / ((long) i10);
            if (this.o0() <= andIncrement) {
                if (lVar.f4140s < j9 && lVar.f() != null) {
                    this.F0(j9, lVar);
                }
                s0(this, 0L, 1, null);
                return;
            }
            if (lVar.f4140s != j9) {
                eVar = this;
                l lVarY = eVar.Y(j9, lVar, andIncrement);
                if (lVarY == null) {
                    continue;
                } else {
                    lVar = lVarY;
                }
                this = eVar;
            } else {
                eVar = this;
            }
            if (eVar.k1(lVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                s0(eVar, 0L, 1, null);
                return;
            } else {
                s0(eVar, 0L, 1, null);
                this = eVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X0(l lVar, int i10, long j9, p129m8.e eVar) {
        g gVar;
        k kVarB;
        p219v8.q qVar;
        l lVar2;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i11 = gVar.f2598w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f2598w = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objA = gVar.f2596u;
        Object objE = p139n8.b.e();
        int i12 = gVar.f2598w;
        if (i12 == 0) {
            p079h8.r.b(objA);
            gVar.f2592q = this;
            gVar.f2593r = lVar;
            gVar.f2594s = i10;
            gVar.f2595t = j9;
            gVar.f2598w = 1;
            C0826n c0826nB = AbstractC0830p.b(p139n8.b.c(gVar));
            try {
                kotlin.jvm.internal.n.f(c0826nB, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                u uVar = new u(c0826nB);
                Object objM1 = m1(lVar, i10, j9, uVar);
                if (objM1 != H8.f.f2611m) {
                    if (objM1 == H8.f.f2613o) {
                        if (j9 < o0()) {
                            lVar.b();
                        }
                        l lVar3 = (l) i0().get(this);
                        while (true) {
                            if (w0()) {
                                J0(c0826nB);
                                break;
                            }
                            long andIncrement = j0().getAndIncrement(this);
                            int i13 = H8.f.f2600b;
                            long j10 = andIncrement / ((long) i13);
                            int i14 = (int) (andIncrement % ((long) i13));
                            if (lVar3.f4140s != j10) {
                                l lVarZ = Z(j10, lVar3);
                                if (lVarZ != null) {
                                    lVar2 = lVarZ;
                                }
                            } else {
                                lVar2 = lVar3;
                            }
                            Object objM2 = m1(lVar2, i14, andIncrement, uVar);
                            l lVar4 = lVar2;
                            if (objM2 == H8.f.f2611m) {
                                S0(uVar, lVar4, i14);
                                break;
                            }
                            if (objM2 == H8.f.f2613o) {
                                if (andIncrement < o0()) {
                                    lVar4.b();
                                }
                                lVar3 = lVar4;
                            } else {
                                if (objM2 == H8.f.f2612n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                lVar4.b();
                                kVarB = k.b(k.f2623b.c(objM2));
                                p219v8.l lVar5 = this.f2582r;
                                qVar = (p219v8.q) (lVar5 != null ? N(lVar5) : null);
                            }
                        }
                    } else {
                        lVar.b();
                        kVarB = k.b(k.f2623b.c(objM1));
                        p219v8.l lVar6 = this.f2582r;
                        qVar = (p219v8.q) (lVar6 != null ? N(lVar6) : null);
                    }
                    c0826nB.m(kVarB, qVar);
                    break;
                }
                S0(uVar, lVar, i10);
                objA = c0826nB.A();
                if (objA == p139n8.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(gVar);
                }
                if (objA == objE) {
                    return objE;
                }
            } catch (Throwable th) {
                c0826nB.P();
                throw th;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(objA);
        }
        return ((k) objA).k();
    }

    private final l Y(long j9, l lVar, long j10) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2580z;
        p219v8.p pVar = (p219v8.p) H8.f.y();
        loop0: while (true) {
            objC = AbstractC0908a.c(lVar, j9, pVar);
            if (!B.c(objC)) {
                A aB = B.b(objC);
                while (true) {
                    A a10 = (A) atomicReferenceFieldUpdater.get(this);
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
        if (B.c(objC)) {
            V();
            F0(j9, lVar);
            s0(this, 0L, 1, null);
            return null;
        }
        l lVar2 = (l) B.b(objC);
        if (lVar2.f4140s <= j9) {
            return lVar2;
        }
        long j11 = lVar2.f4140s;
        int i10 = H8.f.f2600b;
        if (f2576v.compareAndSet(this, j10 + 1, j11 * ((long) i10))) {
            r0((lVar2.f4140s * ((long) i10)) - j10);
        } else {
            s0(this, 0L, 1, null);
        }
        return null;
    }

    private final Object Y0(l lVar, int i10, long j9, p129m8.e eVar) {
        p219v8.q qVar;
        l lVar2;
        C0826n c0826nB = AbstractC0830p.b(p139n8.b.c(eVar));
        try {
            Object objM1 = m1(lVar, i10, j9, c0826nB);
            if (objM1 != H8.f.f2611m) {
                if (objM1 == H8.f.f2613o) {
                    if (j9 < o0()) {
                        lVar.b();
                    }
                    l lVar3 = (l) i0().get(this);
                    while (true) {
                        if (w0()) {
                            K0(c0826nB);
                            break;
                        }
                        long andIncrement = j0().getAndIncrement(this);
                        int i11 = H8.f.f2600b;
                        long j10 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (lVar3.f4140s != j10) {
                            l lVarZ = Z(j10, lVar3);
                            if (lVarZ != null) {
                                lVar2 = lVarZ;
                            }
                        } else {
                            lVar2 = lVar3;
                        }
                        objM1 = m1(lVar2, i12, andIncrement, c0826nB);
                        l lVar4 = lVar2;
                        if (objM1 == H8.f.f2611m) {
                            C0826n c0826n = c0826nB != null ? c0826nB : null;
                            if (c0826n == null) {
                                break;
                            }
                            S0(c0826n, lVar4, i12);
                            break;
                        }
                        if (objM1 == H8.f.f2613o) {
                            if (andIncrement < o0()) {
                                lVar4.b();
                            }
                            lVar3 = lVar4;
                        } else {
                            if (objM1 == H8.f.f2612n) {
                                throw new IllegalStateException("unexpected");
                            }
                            lVar4.b();
                            p219v8.l lVar5 = this.f2582r;
                            qVar = (p219v8.q) (lVar5 != null ? K(lVar5) : null);
                        }
                    }
                } else {
                    lVar.b();
                    p219v8.l lVar6 = this.f2582r;
                    qVar = (p219v8.q) (lVar6 != null ? K(lVar6) : null);
                }
                c0826nB.m(objM1, qVar);
                break;
            }
            S0(c0826nB, lVar, i10);
            Object objA = c0826nB.A();
            if (objA == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objA;
        } catch (Throwable th) {
            c0826nB.P();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l Z(long j9, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2579y;
        p219v8.p pVar = (p219v8.p) H8.f.y();
        loop0: while (true) {
            objC = AbstractC0908a.c(lVar, j9, pVar);
            if (!B.c(objC)) {
                A aB = B.b(objC);
                while (true) {
                    A a10 = (A) atomicReferenceFieldUpdater.get(this);
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
        if (B.c(objC)) {
            V();
            if (lVar.f4140s * ((long) H8.f.f2600b) < o0()) {
                lVar.b();
            }
            return null;
        }
        l lVar2 = (l) B.b(objC);
        if (!A0() && j9 <= c0() / ((long) H8.f.f2600b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2580z;
            while (true) {
                A a11 = (A) atomicReferenceFieldUpdater2.get(this);
                if (a11.f4140s >= lVar2.f4140s || !lVar2.u()) {
                    break;
                }
                if (atomicReferenceFieldUpdater2.compareAndSet(this, a11, lVar2)) {
                    if (!a11.p()) {
                        break;
                    }
                    a11.n();
                    break;
                }
                if (lVar2.p()) {
                    lVar2.n();
                }
            }
        }
        long j10 = lVar2.f4140s;
        if (j10 <= j9) {
            return lVar2;
        }
        int i10 = H8.f.f2600b;
        q1(j10 * ((long) i10));
        if (lVar2.f4140s * ((long) i10) < o0()) {
            lVar2.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0(N8.k kVar, Object obj) {
        l lVar;
        l lVar2 = (l) i0().get(this);
        while (!this.w0()) {
            long andIncrement = j0().getAndIncrement(this);
            int i10 = H8.f.f2600b;
            long j9 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar2.f4140s != j9) {
                l lVarZ = this.Z(j9, lVar2);
                if (lVarZ == null) {
                    continue;
                } else {
                    lVar = lVarZ;
                }
            } else {
                lVar = lVar2;
            }
            e eVar = this;
            N8.k kVar2 = kVar;
            Object objM1 = eVar.m1(lVar, i11, andIncrement, kVar2);
            lVar2 = lVar;
            if (objM1 == H8.f.f2611m) {
                c1 c1Var = kVar2 instanceof c1 ? (c1) kVar2 : null;
                if (c1Var != null) {
                    eVar.S0(c1Var, lVar2, i11);
                    return;
                }
                return;
            }
            if (objM1 != H8.f.f2613o) {
                if (objM1 == H8.f.f2612n) {
                    throw new IllegalStateException("unexpected");
                }
                lVar2.b();
                kVar2.f(objM1);
                return;
            }
            if (andIncrement < eVar.o0()) {
                lVar2.b();
            }
            this = eVar;
            kVar = kVar2;
        }
        this.L0(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l a0(long j9, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2578x;
        p219v8.p pVar = (p219v8.p) H8.f.y();
        loop0: while (true) {
            objC = AbstractC0908a.c(lVar, j9, pVar);
            if (!B.c(objC)) {
                A aB = B.b(objC);
                while (true) {
                    A a10 = (A) atomicReferenceFieldUpdater.get(this);
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
        if (B.c(objC)) {
            V();
            if (lVar.f4140s * ((long) H8.f.f2600b) < k0()) {
                lVar.b();
            }
            return null;
        }
        l lVar2 = (l) B.b(objC);
        long j10 = lVar2.f4140s;
        if (j10 <= j9) {
            return lVar2;
        }
        int i10 = H8.f.f2600b;
        r1(j10 * ((long) i10));
        if (lVar2.f4140s * ((long) i10) < k0()) {
            lVar2.b();
        }
        return null;
    }

    private final void a1(l lVar) {
        p219v8.l lVar2 = this.f2582r;
        P pB = null;
        Object objB = AbstractC0917j.b(null, 1, null);
        loop0: do {
            for (int i10 = H8.f.f2600b - 1; -1 < i10; i10--) {
                long j9 = (lVar.f4140s * ((long) H8.f.f2600b)) + ((long) i10);
                while (true) {
                    Object objB2 = lVar.B(i10);
                    if (objB2 == H8.f.f2607i) {
                        break loop0;
                    }
                    if (objB2 != H8.f.f2602d) {
                        if (objB2 != H8.f.f2603e && objB2 != null) {
                            if (!(objB2 instanceof c1) && !(objB2 instanceof x)) {
                                if (objB2 != H8.f.f2605g && objB2 != H8.f.f2604f) {
                                    if (objB2 != H8.f.f2605g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j9 < k0()) {
                                    break loop0;
                                }
                                c1 c1Var = objB2 instanceof x ? ((x) objB2).f2637a : (c1) objB2;
                                if (lVar.v(i10, objB2, H8.f.z())) {
                                    if (lVar2 != null) {
                                        pB = K8.w.b(lVar2, lVar.A(i10), pB);
                                    }
                                    objB = AbstractC0917j.c(objB, c1Var);
                                    lVar.w(i10);
                                    lVar.t();
                                    break;
                                }
                            }
                        } else {
                            if (lVar.v(i10, objB2, H8.f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        if (j9 < k0()) {
                            break loop0;
                        }
                        if (lVar.v(i10, objB2, H8.f.z())) {
                            if (lVar2 != null) {
                                pB = K8.w.b(lVar2, lVar.A(i10), pB);
                            }
                            lVar.w(i10);
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                kotlin.jvm.internal.n.f(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    c1((c1) arrayList.get(size));
                }
            } else {
                c1((c1) objB);
            }
        }
        if (pB != null) {
            throw pB;
        }
    }

    private final void b1(c1 c1Var) {
        d1(c1Var, true);
    }

    private final long c0() {
        return f2576v.get(this);
    }

    private final void c1(c1 c1Var) {
        d1(c1Var, false);
    }

    private final void d1(c1 c1Var, boolean z9) {
        if (c1Var instanceof InterfaceC0822l) {
            p129m8.e eVar = (p129m8.e) c1Var;
            h8.q.a aVar = p079h8.q.f21862r;
            eVar.resumeWith(p079h8.q.b(p079h8.r.a(z9 ? h0() : l0())));
        } else if (c1Var instanceof u) {
            C0826n c0826n = ((u) c1Var).f2636q;
            h8.q.a aVar2 = p079h8.q.f21862r;
            c0826n.resumeWith(p079h8.q.b(k.b(k.f2623b.a(e0()))));
        } else if (c1Var instanceof a) {
            ((a) c1Var).j();
        } else {
            if (c1Var instanceof N8.k) {
                ((N8.k) c1Var).d(this, H8.f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + c1Var).toString());
        }
    }

    static /* synthetic */ Object e1(e eVar, Object obj, p129m8.e eVar2) {
        l lVar;
        l lVar2 = (l) m0().get(eVar);
        while (true) {
            long andIncrement = n0().getAndIncrement(eVar);
            long j9 = andIncrement & 1152921504606846975L;
            boolean zY0 = eVar.y0(andIncrement);
            int i10 = H8.f.f2600b;
            long j10 = j9 / ((long) i10);
            int i11 = (int) (j9 % ((long) i10));
            if (lVar2.f4140s != j10) {
                l lVarA0 = eVar.a0(j10, lVar2);
                if (lVarA0 != null) {
                    lVar = lVarA0;
                } else if (zY0) {
                    Object objM0 = eVar.M0(obj, eVar2);
                    if (objM0 != p139n8.b.e()) {
                        break;
                    }
                    return objM0;
                }
            } else {
                lVar = lVar2;
            }
            e eVar3 = eVar;
            Object obj2 = obj;
            int iO1 = eVar3.o1(lVar, i11, obj2, j9, null, zY0);
            if (iO1 == 0) {
                lVar.b();
                break;
            }
            if (iO1 != 1) {
                if (iO1 == 2) {
                    if (!zY0) {
                        break;
                    }
                    lVar.t();
                    Object objM1 = eVar3.M0(obj2, eVar2);
                    if (objM1 != p139n8.b.e()) {
                        break;
                    }
                    return objM1;
                }
                if (iO1 == 3) {
                    Object objF1 = eVar3.f1(lVar, i11, obj2, j9, eVar2);
                    if (objF1 != p139n8.b.e()) {
                        break;
                    }
                    return objF1;
                }
                if (iO1 == 4) {
                    if (j9 < eVar3.k0()) {
                        lVar.b();
                    }
                    Object objM2 = eVar3.M0(obj2, eVar2);
                    if (objM2 != p139n8.b.e()) {
                        break;
                    }
                    return objM2;
                }
                if (iO1 == 5) {
                    lVar.b();
                }
                eVar = eVar3;
                lVar2 = lVar;
                obj = obj2;
            } else {
                break;
            }
        }
        return p079h8.A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    private final Object f1(l lVar, int i10, Object obj, long j9, p129m8.e eVar) {
        Object objB;
        Object objA;
        C0826n c0826nB = AbstractC0830p.b(p139n8.b.c(eVar));
        try {
            int iO1 = o1(lVar, i10, obj, j9, c0826nB, false);
            if (iO1 == 0) {
                lVar.b();
                h8.q.a aVar = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.A.f21846a);
            } else {
                if (iO1 != 1) {
                    if (iO1 != 2) {
                        if (iO1 != 4) {
                            if (iO1 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            lVar.b();
                            l lVar2 = (l) m0().get(this);
                            while (true) {
                                long andIncrement = n0().getAndIncrement(this);
                                long j10 = 1152921504606846975L & andIncrement;
                                boolean zY0 = y0(andIncrement);
                                int i11 = H8.f.f2600b;
                                long j11 = j10 / ((long) i11);
                                int i12 = (int) (j10 % ((long) i11));
                                if (lVar2.f4140s != j11) {
                                    l lVarA0 = a0(j11, lVar2);
                                    if (lVarA0 != null) {
                                        lVar2 = lVarA0;
                                    } else if (zY0) {
                                    }
                                }
                                int iO2 = o1(lVar2, i12, obj, j10, c0826nB, zY0);
                                if (iO2 == 0) {
                                    lVar2.b();
                                    h8.q.a aVar2 = p079h8.q.f21862r;
                                    objB = p079h8.q.b(p079h8.A.f21846a);
                                } else if (iO2 == 1) {
                                    h8.q.a aVar3 = p079h8.q.f21862r;
                                    objB = p079h8.q.b(p079h8.A.f21846a);
                                } else if (iO2 == 2) {
                                    if (!zY0) {
                                        C0826n c0826n = c0826nB != null ? c0826nB : null;
                                        if (c0826n == null) {
                                            break;
                                        }
                                        T0(c0826n, lVar2, i12);
                                        break;
                                    }
                                    lVar2.t();
                                } else {
                                    if (iO2 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (iO2 != 4) {
                                        if (iO2 == 5) {
                                            lVar2.b();
                                        }
                                    } else if (j10 < k0()) {
                                        lVar2.b();
                                    }
                                }
                            }
                        } else if (j9 < k0()) {
                            lVar.b();
                        }
                        N0(obj, c0826nB);
                        break;
                    } else {
                        T0(c0826nB, lVar, i10);
                    }
                    objA = c0826nB.A();
                    if (objA == p139n8.b.e()) {
                        kotlin.coroutines.jvm.internal.h.c(eVar);
                    }
                    if (objA == p139n8.b.e()) {
                        return objA;
                    }
                    return p079h8.A.f21846a;
                }
                h8.q.a aVar4 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.A.f21846a);
            }
            c0826nB.resumeWith(objB);
            objA = c0826nB.A();
            if (objA == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            if (objA == p139n8.b.e()) {
                return objA;
            }
            return p079h8.A.f21846a;
        } catch (Throwable th) {
            c0826nB.P();
            throw th;
        }
    }

    private final boolean g1(long j9) {
        if (y0(j9)) {
            return false;
        }
        return !O(j9 & 1152921504606846975L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable h0() {
        Throwable thE0 = e0();
        return thE0 == null ? new o("Channel was closed") : thE0;
    }

    private final boolean h1(Object obj, Object obj2) {
        if (obj instanceof N8.k) {
            return ((N8.k) obj).d(this, obj2);
        }
        if (obj instanceof u) {
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0826n c0826n = ((u) obj).f2636q;
            k kVarB = k.b(k.f2623b.c(obj2));
            p219v8.l lVar = this.f2582r;
            return H8.f.B(c0826n, kVarB, (p219v8.q) (lVar != null ? N(lVar) : null));
        }
        if (obj instanceof a) {
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC0822l) {
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0822l interfaceC0822l = (InterfaceC0822l) obj;
            p219v8.l lVar2 = this.f2582r;
            return H8.f.B(interfaceC0822l, obj2, (p219v8.q) (lVar2 != null ? K(lVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater i0() {
        return f2579y;
    }

    private final boolean i1(Object obj, l lVar, int i10) {
        if (obj instanceof InterfaceC0822l) {
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return H8.f.C((InterfaceC0822l) obj, p079h8.A.f21846a, null, 2, null);
        }
        if (!(obj instanceof N8.k)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        N8.m mVarX = ((N8.j) obj).x(this, p079h8.A.f21846a);
        if (mVarX == N8.m.REREGISTER) {
            lVar.w(i10);
        }
        return mVarX == N8.m.SUCCESSFUL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater j0() {
        return f2575u;
    }

    private final boolean k1(l lVar, int i10, long j9) {
        Object objB = lVar.B(i10);
        if (!(objB instanceof c1) || j9 < f2575u.get(this) || !lVar.v(i10, objB, H8.f.f2605g)) {
            return l1(lVar, i10, j9);
        }
        if (i1(objB, lVar, i10)) {
            lVar.F(i10, H8.f.f2602d);
            return true;
        }
        lVar.F(i10, H8.f.f2608j);
        lVar.C(i10, false);
        return false;
    }

    private final boolean l1(l lVar, int i10, long j9) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB instanceof c1) {
                if (j9 < f2575u.get(this)) {
                    if (lVar.v(i10, objB, new x((c1) objB))) {
                        return true;
                    }
                } else if (lVar.v(i10, objB, H8.f.f2605g)) {
                    if (i1(objB, lVar, i10)) {
                        lVar.F(i10, H8.f.f2602d);
                        return true;
                    }
                    lVar.F(i10, H8.f.f2608j);
                    lVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == H8.f.f2608j) {
                    return false;
                }
                if (objB == null) {
                    if (lVar.v(i10, objB, H8.f.f2603e)) {
                        return true;
                    }
                } else {
                    if (objB == H8.f.f2602d || objB == H8.f.f2606h || objB == H8.f.f2607i || objB == H8.f.f2609k || objB == H8.f.z()) {
                        return true;
                    }
                    if (objB != H8.f.f2604f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m0() {
        return f2578x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m1(l lVar, int i10, long j9, Object obj) {
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (j9 >= (f2574t.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return H8.f.f2612n;
                }
                if (lVar.v(i10, objB, obj)) {
                    X();
                    return H8.f.f2611m;
                }
            }
        } else if (objB == H8.f.f2602d && lVar.v(i10, objB, H8.f.f2607i)) {
            X();
            return lVar.D(i10);
        }
        return n1(lVar, i10, j9, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater n0() {
        return f2574t;
    }

    private final Object n1(l lVar, int i10, long j9, Object obj) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null || objB == H8.f.f2603e) {
                if (j9 < (f2574t.get(this) & 1152921504606846975L)) {
                    if (lVar.v(i10, objB, H8.f.f2606h)) {
                        X();
                        return H8.f.f2613o;
                    }
                } else {
                    if (obj == null) {
                        return H8.f.f2612n;
                    }
                    if (lVar.v(i10, objB, obj)) {
                        X();
                        return H8.f.f2611m;
                    }
                }
            } else {
                if (objB != H8.f.f2602d) {
                    if (objB != H8.f.f2608j && objB != H8.f.f2606h) {
                        if (objB == H8.f.z()) {
                            X();
                            return H8.f.f2613o;
                        }
                        if (objB != H8.f.f2605g && lVar.v(i10, objB, H8.f.f2604f)) {
                            boolean z9 = objB instanceof x;
                            if (z9) {
                                objB = ((x) objB).f2637a;
                            }
                            if (i1(objB, lVar, i10)) {
                                lVar.F(i10, H8.f.f2607i);
                                X();
                                return lVar.D(i10);
                            }
                            lVar.F(i10, H8.f.f2608j);
                            lVar.C(i10, false);
                            if (z9) {
                                X();
                            }
                            return H8.f.f2613o;
                        }
                    }
                    return H8.f.f2613o;
                }
                if (lVar.v(i10, objB, H8.f.f2607i)) {
                    X();
                    return lVar.D(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o1(l lVar, int i10, Object obj, long j9, Object obj2, boolean z9) {
        lVar.G(i10, obj);
        if (z9) {
            return p1(lVar, i10, obj, j9, obj2, z9);
        }
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (O(j9)) {
                if (lVar.v(i10, null, H8.f.f2602d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof c1) {
            lVar.w(i10);
            if (h1(objB, obj)) {
                lVar.F(i10, H8.f.f2607i);
                O0();
                return 0;
            }
            if (lVar.x(i10, H8.f.f2609k) == H8.f.f2609k) {
                return 5;
            }
            lVar.C(i10, true);
            return 5;
        }
        return p1(lVar, i10, obj, j9, obj2, z9);
    }

    private final int p1(l lVar, int i10, Object obj, long j9, Object obj2, boolean z9) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null) {
                if (!O(j9) || z9) {
                    if (z9) {
                        if (lVar.v(i10, null, H8.f.f2608j)) {
                            lVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (lVar.v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (lVar.v(i10, null, H8.f.f2602d)) {
                    return 1;
                }
            } else {
                if (objB != H8.f.f2603e) {
                    if (objB == H8.f.f2609k) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == H8.f.f2606h) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == H8.f.z()) {
                        lVar.w(i10);
                        V();
                        return 4;
                    }
                    lVar.w(i10);
                    if (objB instanceof x) {
                        objB = ((x) objB).f2637a;
                    }
                    if (h1(objB, obj)) {
                        lVar.F(i10, H8.f.f2607i);
                        O0();
                        return 0;
                    }
                    if (lVar.x(i10, H8.f.f2609k) != H8.f.f2609k) {
                        lVar.C(i10, true);
                    }
                    return 5;
                }
                if (lVar.v(i10, objB, H8.f.f2602d)) {
                    return 1;
                }
            }
        }
    }

    private final void q1(long j9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2575u;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= j9) {
                return;
            }
            e eVar = this;
            long j11 = j9;
            if (f2575u.compareAndSet(eVar, j10, j11)) {
                return;
            }
            this = eVar;
            j9 = j11;
        }
    }

    private final void r0(long j9) {
        if ((f2577w.addAndGet(this, j9) & 4611686018427387904L) != 0) {
            while ((f2577w.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void r1(long j9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2574t;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            long j11 = 1152921504606846975L & j10;
            if (j11 >= j9) {
                return;
            }
            e eVar = this;
            if (f2574t.compareAndSet(eVar, j10, H8.f.w(j11, (int) (j10 >> 60)))) {
                return;
            } else {
                this = eVar;
            }
        }
    }

    static /* synthetic */ void s0(e eVar, long j9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j9 = 1;
        }
        eVar.r0(j9);
    }

    private final void t0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2573B;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, obj == null ? H8.f.f2615q : H8.f.f2616r));
        if (obj == null) {
            return;
        }
        ((p219v8.l) obj).f(e0());
    }

    private final boolean u0(l lVar, int i10, long j9) {
        Object objB;
        do {
            objB = lVar.B(i10);
            if (objB != null && objB != H8.f.f2603e) {
                if (objB == H8.f.f2602d) {
                    return true;
                }
                if (objB == H8.f.f2608j || objB == H8.f.z() || objB == H8.f.f2607i || objB == H8.f.f2606h) {
                    return false;
                }
                if (objB == H8.f.f2605g) {
                    return true;
                }
                return objB != H8.f.f2604f && j9 == k0();
            }
        } while (!lVar.v(i10, objB, H8.f.f2606h));
        X();
        return false;
    }

    private final boolean v0(long j9, boolean z9) {
        int i10 = (int) (j9 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            U(j9 & 1152921504606846975L);
            return (z9 && q0()) ? false : true;
        }
        if (i10 == 3) {
            T(j9 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    private final boolean x0(long j9) {
        return v0(j9, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0(long j9) {
        return v0(j9, false);
    }

    protected void I0() {
    }

    protected void O0() {
    }

    public boolean P(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return S(th, true);
    }

    protected void P0() {
    }

    protected boolean S(Throwable th, boolean z9) {
        if (z9) {
            C0();
        }
        boolean zCompareAndSet = f2572A.compareAndSet(this, H8.f.f2617s, th);
        if (z9) {
            D0();
        } else {
            E0();
        }
        V();
        I0();
        if (zCompareAndSet) {
            t0();
        }
        return zCompareAndSet;
    }

    protected final void W(long j9) {
        l lVar;
        P pC;
        l lVar2 = (l) f2579y.get(this);
        while (true) {
            long j10 = f2575u.get(this);
            if (j9 < Math.max(((long) this.f2581q) + j10, this.c0())) {
                return;
            }
            e eVar = this;
            this = eVar;
            if (f2575u.compareAndSet(eVar, j10, 1 + j10)) {
                int i10 = H8.f.f2600b;
                long j11 = j10 / ((long) i10);
                int i11 = (int) (j10 % ((long) i10));
                if (lVar2.f4140s != j11) {
                    l lVarZ = this.Z(j11, lVar2);
                    if (lVarZ != null) {
                        lVar = lVarZ;
                    }
                } else {
                    lVar = lVar2;
                }
                Object objM1 = this.m1(lVar, i11, j10, null);
                if (objM1 != H8.f.f2613o) {
                    lVar.b();
                    p219v8.l lVar3 = this.f2582r;
                    if (lVar3 != null && (pC = K8.w.c(lVar3, objM1, null, 2, null)) != null) {
                        throw pC;
                    }
                } else if (j10 < this.o0()) {
                    lVar.b();
                }
                lVar2 = lVar;
            }
        }
    }

    @Override // H8.v
    public Object c(p129m8.e eVar) {
        return W0(this, eVar);
    }

    @Override // H8.v
    public N8.g d() {
        d dVar = d.f2587q;
        kotlin.jvm.internal.n.f(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        p219v8.q qVar = (p219v8.q) I.d(dVar, 3);
        C0098e c0098e = C0098e.f2588q;
        kotlin.jvm.internal.n.f(c0098e, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new N8.h(this, qVar, (p219v8.q) I.d(c0098e, 3), this.f2583s);
    }

    @Override // H8.w
    public void e(p219v8.l lVar) {
        if (f2573B.compareAndSet(this, null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2573B;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != H8.f.f2615q) {
                if (obj == H8.f.f2616r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!f2573B.compareAndSet(this, H8.f.f2615q, H8.f.f2616r));
        lVar.f(e0());
    }

    protected final Throwable e0() {
        return (Throwable) f2572A.get(this);
    }

    @Override // H8.v
    public final void f(CancellationException cancellationException) {
        P(cancellationException);
    }

    @Override // H8.v
    public Object g() {
        l lVarZ;
        long j9 = f2575u.get(this);
        long j10 = f2574t.get(this);
        if (x0(j10)) {
            return k.f2623b.a(e0());
        }
        if (j9 >= (j10 & 1152921504606846975L)) {
            return k.f2623b.b();
        }
        Object obj = H8.f.f2609k;
        l lVar = (l) i0().get(this);
        while (!this.w0()) {
            long andIncrement = j0().getAndIncrement(this);
            int i10 = H8.f.f2600b;
            long j11 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar.f4140s != j11) {
                lVarZ = this.Z(j11, lVar);
                if (lVarZ == null) {
                    continue;
                }
            } else {
                lVarZ = lVar;
            }
            e eVar = this;
            Object objM1 = eVar.m1(lVarZ, i11, andIncrement, obj);
            lVar = lVarZ;
            if (objM1 == H8.f.f2611m) {
                c1 c1Var = obj instanceof c1 ? (c1) obj : null;
                if (c1Var != null) {
                    eVar.S0(c1Var, lVar, i11);
                }
                eVar.s1(andIncrement);
                lVar.t();
                return k.f2623b.b();
            }
            if (objM1 != H8.f.f2613o) {
                if (objM1 == H8.f.f2612n) {
                    throw new IllegalStateException("unexpected");
                }
                lVar.b();
                return k.f2623b.c(objM1);
            }
            if (andIncrement < eVar.o0()) {
                lVar.b();
            }
            this = eVar;
        }
        return k.f2623b.a(this.e0());
    }

    @Override // H8.w
    public boolean h(Throwable th) {
        return S(th, false);
    }

    @Override // H8.v
    public i iterator() {
        return new a();
    }

    protected final Object j1(Object obj) {
        l lVarA0;
        Object obj2 = H8.f.f2602d;
        l lVar = (l) m0().get(this);
        while (true) {
            long andIncrement = n0().getAndIncrement(this);
            long j9 = andIncrement & 1152921504606846975L;
            boolean zY0 = this.y0(andIncrement);
            int i10 = H8.f.f2600b;
            long j10 = j9 / ((long) i10);
            int i11 = (int) (j9 % ((long) i10));
            if (lVar.f4140s != j10) {
                lVarA0 = this.a0(j10, lVar);
                if (lVarA0 == null) {
                    if (zY0) {
                        return k.f2623b.a(this.l0());
                    }
                }
            } else {
                lVarA0 = lVar;
            }
            Object obj3 = obj;
            int iO1 = this.o1(lVarA0, i11, obj3, j9, obj2, zY0);
            e eVar = this;
            lVar = lVarA0;
            if (iO1 == 0) {
                lVar.b();
                return k.f2623b.c(p079h8.A.f21846a);
            }
            if (iO1 == 1) {
                return k.f2623b.c(p079h8.A.f21846a);
            }
            if (iO1 == 2) {
                if (zY0) {
                    lVar.t();
                    return k.f2623b.a(eVar.l0());
                }
                c1 c1Var = obj2 instanceof c1 ? (c1) obj2 : null;
                if (c1Var != null) {
                    eVar.T0(c1Var, lVar, i11);
                }
                eVar.W((lVar.f4140s * ((long) i10)) + ((long) i11));
                return k.f2623b.c(p079h8.A.f21846a);
            }
            if (iO1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iO1 == 4) {
                if (j9 < eVar.k0()) {
                    lVar.b();
                }
                return k.f2623b.a(eVar.l0());
            }
            if (iO1 == 5) {
                lVar.b();
            }
            this = eVar;
            obj = obj3;
        }
    }

    public final long k0() {
        return f2575u.get(this);
    }

    @Override // H8.v
    public Object l(p129m8.e eVar) {
        return V0(this, eVar);
    }

    protected final Throwable l0() {
        Throwable thE0 = e0();
        return thE0 == null ? new p("Channel was closed") : thE0;
    }

    @Override // H8.w
    public Object n(Object obj, p129m8.e eVar) {
        return e1(this, obj, eVar);
    }

    public final long o0() {
        return f2574t.get(this) & 1152921504606846975L;
    }

    @Override // H8.w
    public Object p(Object obj) {
        l lVar;
        if (g1(f2574t.get(this))) {
            return k.f2623b.b();
        }
        Object obj2 = H8.f.f2608j;
        l lVar2 = (l) m0().get(this);
        while (true) {
            long andIncrement = n0().getAndIncrement(this);
            long j9 = andIncrement & 1152921504606846975L;
            boolean zY0 = this.y0(andIncrement);
            int i10 = H8.f.f2600b;
            long j10 = j9 / ((long) i10);
            int i11 = (int) (j9 % ((long) i10));
            if (lVar2.f4140s != j10) {
                l lVarA0 = this.a0(j10, lVar2);
                if (lVarA0 != null) {
                    lVar = lVarA0;
                } else if (zY0) {
                    return k.f2623b.a(this.l0());
                }
            } else {
                lVar = lVar2;
            }
            int iO1 = this.o1(lVar, i11, obj, j9, obj2, zY0);
            e eVar = this;
            lVar2 = lVar;
            if (iO1 == 0) {
                lVar2.b();
                return k.f2623b.c(p079h8.A.f21846a);
            }
            if (iO1 == 1) {
                return k.f2623b.c(p079h8.A.f21846a);
            }
            if (iO1 == 2) {
                if (zY0) {
                    lVar2.t();
                    return k.f2623b.a(eVar.l0());
                }
                c1 c1Var = obj2 instanceof c1 ? (c1) obj2 : null;
                if (c1Var != null) {
                    eVar.T0(c1Var, lVar2, i11);
                }
                lVar2.t();
                return k.f2623b.b();
            }
            if (iO1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iO1 == 4) {
                if (j9 < eVar.k0()) {
                    lVar2.b();
                }
                return k.f2623b.a(eVar.l0());
            }
            if (iO1 == 5) {
                lVar2.b();
            }
            this = eVar;
            obj = obj;
        }
    }

    public final boolean q0() {
        while (true) {
            l lVarZ = (l) f2579y.get(this);
            long jK0 = k0();
            if (o0() <= jK0) {
                return false;
            }
            int i10 = H8.f.f2600b;
            long j9 = jK0 / ((long) i10);
            if (lVarZ.f4140s == j9 || (lVarZ = Z(j9, lVarZ)) != null) {
                lVarZ.b();
                if (u0(lVarZ, (int) (jK0 % ((long) i10)), jK0)) {
                    return true;
                }
                f2575u.compareAndSet(this, jK0, 1 + jK0);
            } else if (((l) f2579y.get(this)).f4140s < j9) {
                return false;
            }
        }
    }

    @Override // H8.w
    public boolean s() {
        return y0(f2574t.get(this));
    }

    public final void s1(long j9) {
        e eVar = this;
        if (eVar.A0()) {
            return;
        }
        while (eVar.c0() <= j9) {
            eVar = this;
        }
        int i10 = H8.f.f2601c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jC0 = eVar.c0();
            if (jC0 == (4611686018427387903L & f2577w.get(eVar)) && jC0 == eVar.c0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2577w;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j10, H8.f.v(j10 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jC1 = eVar.c0();
            long j11 = f2577w.get(eVar);
            long j12 = j11 & 4611686018427387903L;
            boolean z9 = (4611686018427387904L & j11) != 0;
            if (jC1 == j12 && jC1 == eVar.c0()) {
                break;
            }
            if (z9) {
                eVar = this;
            } else {
                eVar = this;
                f2577w.compareAndSet(eVar, j11, H8.f.v(j12, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2577w;
        while (true) {
            long j13 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j13, H8.f.v(j13 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (f2574t.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f2581q + ',');
        sb.append("data=[");
        int i11 = 0;
        List listN = AbstractC1444s.n(f2579y.get(this), f2578x.get(this), f2580z.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (((l) obj) != H8.f.f2599a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j9 = ((l) next).f4140s;
            do {
                Object next2 = it.next();
                long j10 = ((l) next2).f4140s;
                if (j9 > j10) {
                    next = next2;
                    j9 = j10;
                }
            } while (it.hasNext());
        }
        l lVar = (l) next;
        long jK0 = k0();
        long jO0 = o0();
        loop2: while (true) {
            int i12 = H8.f.f2600b;
            for (int i13 = i11; i13 < i12; i13++) {
                long j11 = (lVar.f4140s * ((long) H8.f.f2600b)) + ((long) i13);
                if (j11 >= jO0 && j11 >= jK0) {
                    break loop2;
                }
                Object objB = lVar.B(i13);
                Object objA = lVar.A(i13);
                if (objB instanceof InterfaceC0822l) {
                    string = (j11 >= jK0 || j11 < jO0) ? (j11 >= jO0 || j11 < jK0) ? "cont" : "send" : "receive";
                } else if (objB instanceof N8.k) {
                    string = (j11 >= jK0 || j11 < jO0) ? (j11 >= jO0 || j11 < jK0) ? "select" : "onSend" : "onReceive";
                } else if (objB instanceof u) {
                    string = "receiveCatching";
                } else if (objB instanceof x) {
                    string = "EB(" + objB + ')';
                } else if (kotlin.jvm.internal.n.d(objB, H8.f.f2604f) || kotlin.jvm.internal.n.d(objB, H8.f.f2605g)) {
                    string = "resuming_sender";
                } else {
                    if (objB != null && !kotlin.jvm.internal.n.d(objB, H8.f.f2603e) && !kotlin.jvm.internal.n.d(objB, H8.f.f2607i) && !kotlin.jvm.internal.n.d(objB, H8.f.f2606h) && !kotlin.jvm.internal.n.d(objB, H8.f.f2609k) && !kotlin.jvm.internal.n.d(objB, H8.f.f2608j) && !kotlin.jvm.internal.n.d(objB, H8.f.z())) {
                        string = objB.toString();
                    }
                }
                if (objA != null) {
                    sb.append('(' + string + ',' + objA + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            lVar = (l) lVar.f();
            if (lVar == null) {
                break;
            }
            i11 = 0;
        }
        if (E8.i.P0(sb) == ',') {
            kotlin.jvm.internal.n.g(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean w0() {
        return x0(f2574t.get(this));
    }

    protected boolean z0() {
        return false;
    }
}
