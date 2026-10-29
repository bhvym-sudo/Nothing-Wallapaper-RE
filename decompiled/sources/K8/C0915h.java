package K8;

import F8.AbstractC0815h0;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.V0;
import F8.Z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: K8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0915h extends Z implements kotlin.coroutines.jvm.internal.e, p129m8.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4162x = AtomicReferenceFieldUpdater.newUpdater(C0915h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final F8.I f4163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p129m8.e f4164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f4165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f4166w;

    public C0915h(F8.I i10, p129m8.e eVar) {
        super(-1);
        this.f4163t = i10;
        this.f4164u = eVar;
        this.f4165v = AbstractC0916i.f4167a;
        this.f4166w = K.g(getContext());
    }

    private final C0826n p() {
        Object obj = f4162x.get(this);
        if (obj instanceof C0826n) {
            return (C0826n) obj;
        }
        return null;
    }

    @Override // F8.Z
    public p129m8.e d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p129m8.e eVar = this.f4164u;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // p129m8.e
    public p129m8.i getContext() {
        return this.f4164u.getContext();
    }

    @Override // F8.Z
    public Object h() {
        Object obj = this.f4165v;
        this.f4165v = AbstractC0916i.f4167a;
        return obj;
    }

    public final void j() {
        while (f4162x.get(this) == AbstractC0916i.f4168b) {
        }
    }

    public final C0826n l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4162x;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f4162x.set(this, AbstractC0916i.f4168b);
                return null;
            }
            if (obj instanceof C0826n) {
                if (f4162x.compareAndSet(this, obj, AbstractC0916i.f4168b)) {
                    return (C0826n) obj;
                }
            } else if (obj != AbstractC0916i.f4168b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(p129m8.i iVar, Object obj) {
        this.f4165v = obj;
        this.f1849s = 1;
        this.f4163t.h1(iVar, this);
    }

    @Override // p129m8.e
    public void resumeWith(Object obj) {
        Object objB = F8.C.b(obj);
        if (AbstractC0916i.d(this.f4163t, getContext())) {
            this.f4165v = objB;
            this.f1849s = 0;
            AbstractC0916i.c(this.f4163t, getContext(), this);
            return;
        }
        AbstractC0815h0 abstractC0815h0B = V0.f1836a.b();
        if (abstractC0815h0B.s1()) {
            this.f4165v = objB;
            this.f1849s = 0;
            abstractC0815h0B.o1(this);
            return;
        }
        abstractC0815h0B.q1(true);
        try {
            p129m8.i context = getContext();
            Object objI = K.i(context, this.f4166w);
            try {
                this.f4164u.resumeWith(obj);
                p079h8.A a10 = p079h8.A.f21846a;
                K.f(context, objI);
                while (abstractC0815h0B.v1()) {
                }
            } catch (Throwable th) {
                K.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                abstractC0815h0B.l1(true);
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f4163t + ", " + F8.P.c(this.f4164u) + ']';
    }

    public final boolean u() {
        return f4162x.get(this) != null;
    }

    public final boolean v(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4162x;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            D d10 = AbstractC0916i.f4168b;
            if (kotlin.jvm.internal.n.d(obj, d10)) {
                if (f4162x.compareAndSet(this, d10, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (f4162x.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void w() {
        j();
        C0826n c0826nP = p();
        if (c0826nP != null) {
            c0826nP.v();
        }
    }

    public final Throwable x(InterfaceC0822l interfaceC0822l) {
        D d10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4162x;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d10 = AbstractC0916i.f4168b;
            if (obj != d10) {
                if (obj instanceof Throwable) {
                    if (f4162x.compareAndSet(this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!f4162x.compareAndSet(this, d10, interfaceC0822l));
        return null;
    }
}
