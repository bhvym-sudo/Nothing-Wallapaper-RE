package F8;

import K8.C0915h;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: F8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0826n extends Z implements InterfaceC0822l, kotlin.coroutines.jvm.internal.e, c1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1884v = AtomicIntegerFieldUpdater.newUpdater(C0826n.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1885w = AtomicReferenceFieldUpdater.newUpdater(C0826n.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1886x = AtomicReferenceFieldUpdater.newUpdater(C0826n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p129m8.e f1887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p129m8.i f1888u;

    public C0826n(p129m8.e eVar, int i10) {
        super(i10);
        this.f1887t = eVar;
        this.f1888u = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0806d.f1858q;
    }

    private final String C() {
        Object objB = B();
        if (objB instanceof L0) {
            return "Active";
        }
        return objB instanceof C0832q ? "Cancelled" : "Completed";
    }

    private final InterfaceC0807d0 H() {
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) getContext().b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 == null) {
            return null;
        }
        InterfaceC0807d0 interfaceC0807d0M = B0.m(interfaceC0846x0, false, new r(this), 1, null);
        f1886x.compareAndSet(this, null, interfaceC0807d0M);
        return interfaceC0807d0M;
    }

    private final void I(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1885w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0806d) {
                if (f1885w.compareAndSet(this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC0820k) || (obj2 instanceof K8.A)) {
                M(obj, obj2);
            } else {
                if (obj2 instanceof A) {
                    A a10 = (A) obj2;
                    if (!a10.c()) {
                        M(obj, obj2);
                    }
                    if (obj2 instanceof C0832q) {
                        if (!(obj2 instanceof A)) {
                            a10 = null;
                        }
                        Throwable th = a10 != null ? a10.f1787a : null;
                        if (obj instanceof InterfaceC0820k) {
                            n((InterfaceC0820k) obj, th);
                            return;
                        } else {
                            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            s((K8.A) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof C0849z) {
                    C0849z c0849z = (C0849z) obj2;
                    if (c0849z.f1905b != null) {
                        M(obj, obj2);
                    }
                    if (obj instanceof K8.A) {
                        return;
                    }
                    kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC0820k interfaceC0820k = (InterfaceC0820k) obj;
                    if (c0849z.c()) {
                        n(interfaceC0820k, c0849z.f1908e);
                        return;
                    } else {
                        if (f1885w.compareAndSet(this, obj2, C0849z.b(c0849z, null, interfaceC0820k, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof K8.A) {
                        return;
                    }
                    kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (f1885w.compareAndSet(this, obj2, new C0849z(obj2, (InterfaceC0820k) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean L() {
        if (!AbstractC0801a0.c(this.f1849s)) {
            return false;
        }
        p129m8.e eVar = this.f1887t;
        kotlin.jvm.internal.n.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0915h) eVar).u();
    }

    private final void M(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A R(p219v8.l lVar, Throwable th, Object obj, p129m8.i iVar) {
        lVar.f(th);
        return p079h8.A.f21846a;
    }

    public static /* synthetic */ void T(C0826n c0826n, Object obj, int i10, p219v8.q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        c0826n.S(obj, i10, qVar);
    }

    private final Object U(L0 l9, Object obj, int i10, p219v8.q qVar, Object obj2) {
        if (obj instanceof A) {
            return obj;
        }
        if ((AbstractC0801a0.b(i10) || obj2 != null) && !(qVar == null && !(l9 instanceof InterfaceC0820k) && obj2 == null)) {
            return new C0849z(obj, l9 instanceof InterfaceC0820k ? (InterfaceC0820k) l9 : null, qVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean V() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1884v;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f1884v.compareAndSet(this, i10, BasicMeasure.EXACTLY + (536870911 & i10)));
        return true;
    }

    private final K8.D W(Object obj, Object obj2, p219v8.q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1885w;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof L0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C0849z) && obj4 != null && ((C0849z) obj3).f1907d == obj4) {
                    return AbstractC0828o.f1889a;
                }
                return null;
            }
            C0826n c0826n = this;
            Object obj5 = obj;
            Object obj6 = obj2;
            p219v8.q qVar2 = qVar;
            if (f1885w.compareAndSet(c0826n, obj3, c0826n.U((L0) obj3, obj5, this.f1849s, qVar2, obj6))) {
                c0826n.w();
                return AbstractC0828o.f1889a;
            }
            this = c0826n;
            obj = obj5;
            qVar = qVar2;
            obj2 = obj6;
        }
    }

    private final boolean X() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1884v;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f1884v.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void s(K8.A a10, Throwable th) {
        int i10 = f1884v.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            a10.s(i10, th, getContext());
        } catch (Throwable th2) {
            K.a(getContext(), new B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean u(Throwable th) {
        if (!L()) {
            return false;
        }
        p129m8.e eVar = this.f1887t;
        kotlin.jvm.internal.n.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0915h) eVar).v(th);
    }

    private final void w() {
        if (L()) {
            return;
        }
        v();
    }

    private final void x(int i10) {
        if (V()) {
            return;
        }
        AbstractC0801a0.a(this, i10);
    }

    private final InterfaceC0807d0 z() {
        return (InterfaceC0807d0) f1886x.get(this);
    }

    public final Object A() {
        InterfaceC0846x0 interfaceC0846x0;
        boolean zL = L();
        if (X()) {
            if (z() == null) {
                H();
            }
            if (zL) {
                P();
            }
            return p139n8.b.e();
        }
        if (zL) {
            P();
        }
        Object objB = B();
        if (objB instanceof A) {
            throw ((A) objB).f1787a;
        }
        if (!AbstractC0801a0.b(this.f1849s) || (interfaceC0846x0 = (InterfaceC0846x0) getContext().b(InterfaceC0846x0.f1901e)) == null || interfaceC0846x0.a()) {
            return f(objB);
        }
        CancellationException cancellationExceptionK = interfaceC0846x0.K();
        c(objB, cancellationExceptionK);
        throw cancellationExceptionK;
    }

    public final Object B() {
        return f1885w.get(this);
    }

    public void G() {
        InterfaceC0807d0 interfaceC0807d0H = H();
        if (interfaceC0807d0H != null && K()) {
            interfaceC0807d0H.dispose();
            f1886x.set(this, K0.f1820q);
        }
    }

    public final void J(InterfaceC0820k interfaceC0820k) {
        I(interfaceC0820k);
    }

    public boolean K() {
        return !(B() instanceof L0);
    }

    protected String N() {
        return "CancellableContinuation";
    }

    public final void O(Throwable th) {
        if (u(th)) {
            return;
        }
        o(th);
        w();
    }

    public final void P() {
        Throwable thX;
        p129m8.e eVar = this.f1887t;
        C0915h c0915h = eVar instanceof C0915h ? (C0915h) eVar : null;
        if (c0915h == null || (thX = c0915h.x(this)) == null) {
            return;
        }
        v();
        o(thX);
    }

    public final boolean Q() {
        Object obj = f1885w.get(this);
        if ((obj instanceof C0849z) && ((C0849z) obj).f1907d != null) {
            v();
            return false;
        }
        f1884v.set(this, 536870911);
        f1885w.set(this, C0806d.f1858q);
        return true;
    }

    public final void S(Object obj, int i10, p219v8.q qVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1885w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof L0)) {
                C0826n c0826n = this;
                Object obj3 = obj;
                p219v8.q qVar2 = qVar;
                if (obj2 instanceof C0832q) {
                    C0832q c0832q = (C0832q) obj2;
                    if (c0832q.e()) {
                        if (qVar2 != null) {
                            c0826n.p(qVar2, c0832q.f1787a, obj3);
                            return;
                        }
                        return;
                    }
                }
                c0826n.l(obj3);
                throw new p079h8.f();
            }
            C0826n c0826n2 = this;
            Object obj4 = obj;
            int i11 = i10;
            p219v8.q qVar3 = qVar;
            if (f1885w.compareAndSet(c0826n2, obj2, c0826n2.U((L0) obj2, obj4, i11, qVar3, null))) {
                c0826n2.w();
                c0826n2.x(i11);
                return;
            } else {
                this = c0826n2;
                obj = obj4;
                i10 = i11;
                qVar = qVar3;
            }
        }
    }

    @Override // F8.InterfaceC0822l
    public boolean a() {
        return B() instanceof L0;
    }

    @Override // F8.c1
    public void b(K8.A a10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1884v;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        I(a10);
    }

    @Override // F8.Z
    public void c(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1885w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof L0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof A) {
                return;
            }
            if (obj2 instanceof C0849z) {
                C0849z c0849z = (C0849z) obj2;
                if (c0849z.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (f1885w.compareAndSet(this, obj2, C0849z.b(c0849z, null, null, null, null, th3, 15, null))) {
                    c0849z.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (f1885w.compareAndSet(this, obj2, new C0849z(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // F8.Z
    public final p129m8.e d() {
        return this.f1887t;
    }

    @Override // F8.Z
    public Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // F8.Z
    public Object f(Object obj) {
        return obj instanceof C0849z ? ((C0849z) obj).f1904a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p129m8.e eVar = this.f1887t;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // p129m8.e
    public p129m8.i getContext() {
        return this.f1888u;
    }

    @Override // F8.Z
    public Object h() {
        return B();
    }

    @Override // F8.InterfaceC0822l
    public void i(p219v8.l lVar) {
        AbstractC0830p.c(this, new InterfaceC0820k.a(lVar));
    }

    @Override // F8.InterfaceC0822l
    public void k(Object obj, final p219v8.l lVar) {
        S(obj, this.f1849s, lVar != null ? new p219v8.q() { // from class: F8.m
            @Override // p219v8.q
            public final Object e(Object obj2, Object obj3, Object obj4) {
                return C0826n.R(lVar, (Throwable) obj2, obj3, (p129m8.i) obj4);
            }
        } : null);
    }

    @Override // F8.InterfaceC0822l
    public void m(Object obj, p219v8.q qVar) {
        S(obj, this.f1849s, qVar);
    }

    public final void n(InterfaceC0820k interfaceC0820k, Throwable th) {
        try {
            interfaceC0820k.e(th);
        } catch (Throwable th2) {
            K.a(getContext(), new B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // F8.InterfaceC0822l
    public boolean o(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1885w;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof L0)) {
                return false;
            }
        } while (!f1885w.compareAndSet(this, obj, new C0832q(this, th, (obj instanceof InterfaceC0820k) || (obj instanceof K8.A))));
        L0 l9 = (L0) obj;
        if (l9 instanceof InterfaceC0820k) {
            n((InterfaceC0820k) obj, th);
        } else if (l9 instanceof K8.A) {
            s((K8.A) obj, th);
        }
        w();
        x(this.f1849s);
        return true;
    }

    public final void p(p219v8.q qVar, Throwable th, Object obj) {
        try {
            qVar.e(th, obj, getContext());
        } catch (Throwable th2) {
            K.a(getContext(), new B("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // F8.InterfaceC0822l
    public void q(I i10, Object obj) {
        p129m8.e eVar = this.f1887t;
        C0915h c0915h = eVar instanceof C0915h ? (C0915h) eVar : null;
        T(this, obj, (c0915h != null ? c0915h.f4163t : null) == i10 ? 4 : this.f1849s, null, 4, null);
    }

    @Override // F8.InterfaceC0822l
    public Object r(Object obj, Object obj2, p219v8.q qVar) {
        return W(obj, obj2, qVar);
    }

    @Override // p129m8.e
    public void resumeWith(Object obj) {
        T(this, C.c(obj, this), this.f1849s, null, 4, null);
    }

    @Override // F8.InterfaceC0822l
    public void t(Object obj) {
        x(this.f1849s);
    }

    public String toString() {
        return N() + '(' + P.c(this.f1887t) + "){" + C() + "}@" + P.b(this);
    }

    public final void v() {
        InterfaceC0807d0 interfaceC0807d0Z = z();
        if (interfaceC0807d0Z == null) {
            return;
        }
        interfaceC0807d0Z.dispose();
        f1886x.set(this, K0.f1820q);
    }

    public Throwable y(InterfaceC0846x0 interfaceC0846x0) {
        return interfaceC0846x0.K();
    }
}
