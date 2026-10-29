package K8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: K8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0922o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4179q = AtomicReferenceFieldUpdater.newUpdater(C0922o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4180r = AtomicReferenceFieldUpdater.newUpdater(C0922o.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4181s = AtomicReferenceFieldUpdater.newUpdater(C0922o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    private final C0922o h() {
        C0922o c0922o;
        Object obj;
        while (true) {
            C0922o c0922o2 = (C0922o) f4180r.get(this);
            c0922o = c0922o2;
            while (true) {
                C0922o c0922o3 = null;
                while (true) {
                    obj = f4179q.get(c0922o);
                    if (obj == this) {
                        if (c0922o2 != c0922o && !f4180r.compareAndSet(this, c0922o2, c0922o)) {
                            break;
                        }
                        break;
                    }
                    if (q()) {
                        return null;
                    }
                    if (!(obj instanceof x)) {
                        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c0922o3 = c0922o;
                        c0922o = (C0922o) obj;
                    } else {
                        if (c0922o3 != null) {
                            break;
                        }
                        c0922o = (C0922o) f4180r.get(c0922o);
                    }
                }
                if (!f4179q.compareAndSet(c0922o3, c0922o, ((x) obj).f4197a)) {
                    break;
                }
                c0922o = c0922o3;
            }
        }
        return c0922o;
    }

    private final C0922o i(C0922o c0922o) {
        while (c0922o.q()) {
            c0922o = (C0922o) f4180r.get(c0922o);
        }
        return c0922o;
    }

    private final void j(C0922o c0922o) {
        C0922o c0922o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4180r;
        do {
            c0922o2 = (C0922o) atomicReferenceFieldUpdater.get(c0922o);
            if (k() != c0922o) {
                return;
            }
        } while (!f4180r.compareAndSet(c0922o, c0922o2, this));
        if (q()) {
            c0922o.h();
        }
    }

    private final x t() {
        x xVar = (x) f4181s.get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        f4181s.set(this, xVar2);
        return xVar2;
    }

    public final boolean c(C0922o c0922o, int i10) {
        C0922o c0922oM;
        do {
            c0922oM = m();
            if (c0922oM instanceof C0920m) {
                return (((C0920m) c0922oM).f4178t & i10) == 0 && c0922oM.c(c0922o, i10);
            }
        } while (!c0922oM.e(c0922o, this));
        return true;
    }

    public final boolean e(C0922o c0922o, C0922o c0922o2) {
        f4180r.set(c0922o, this);
        f4179q.set(c0922o, c0922o2);
        if (!f4179q.compareAndSet(this, c0922o2, c0922o)) {
            return false;
        }
        c0922o.j(c0922o2);
        return true;
    }

    public final boolean f(C0922o c0922o) {
        f4180r.set(c0922o, this);
        f4179q.set(c0922o, this);
        while (k() == this) {
            if (f4179q.compareAndSet(this, this, c0922o)) {
                c0922o.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        c(new C0920m(i10), i10);
    }

    public final Object k() {
        return f4179q.get(this);
    }

    public final C0922o l() {
        C0922o c0922o;
        Object objK = k();
        x xVar = objK instanceof x ? (x) objK : null;
        if (xVar != null && (c0922o = xVar.f4197a) != null) {
            return c0922o;
        }
        kotlin.jvm.internal.n.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C0922o) objK;
    }

    public final C0922o m() {
        C0922o c0922oH = h();
        return c0922oH == null ? i((C0922o) f4180r.get(this)) : c0922oH;
    }

    public boolean q() {
        return k() instanceof x;
    }

    public boolean r() {
        return s() == null;
    }

    public final C0922o s() {
        Object objK;
        C0922o c0922o;
        do {
            objK = k();
            if (objK instanceof x) {
                return ((x) objK).f4197a;
            }
            if (objK == this) {
                return (C0922o) objK;
            }
            kotlin.jvm.internal.n.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c0922o = (C0922o) objK;
        } while (!f4179q.compareAndSet(this, objK, c0922o.t()));
        c0922o.h();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.w(this) { // from class: K8.o.a
            @Override // C8.h
            public Object get() {
                return F8.P.a(this.receiver);
            }
        } + '@' + F8.P.b(this);
    }
}
