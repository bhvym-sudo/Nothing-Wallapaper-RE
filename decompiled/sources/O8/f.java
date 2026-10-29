package O8;

import F8.AbstractC0830p;
import F8.C0826n;
import F8.I;
import F8.InterfaceC0822l;
import F8.P;
import F8.c1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p079h8.A;
import p219v8.l;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
public class f extends i implements O8.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5936i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f5937h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements InterfaceC0822l, c1 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final C0826n f5938q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Object f5939r;

        public a(C0826n c0826n, Object obj) {
            this.f5938q = c0826n;
            this.f5939r = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A g(f fVar, a aVar, Throwable th) {
            fVar.b(aVar.f5939r);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A l(f fVar, a aVar, Throwable th, A a10, p129m8.i iVar) {
            f.w().set(fVar, aVar.f5939r);
            fVar.b(aVar.f5939r);
            return A.f21846a;
        }

        @Override // F8.InterfaceC0822l
        public boolean a() {
            return this.f5938q.a();
        }

        @Override // F8.c1
        public void b(K8.A a10, int i10) {
            this.f5938q.b(a10, i10);
        }

        @Override // F8.InterfaceC0822l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void k(A a10, l lVar) {
            this.f5938q.k(a10, lVar);
        }

        @Override // F8.InterfaceC0822l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void m(A a10, q qVar) {
            f.w().set(f.this, this.f5939r);
            C0826n c0826n = this.f5938q;
            final f fVar = f.this;
            c0826n.k(a10, new l() { // from class: O8.e
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return f.a.g(fVar, this, (Throwable) obj);
                }
            });
        }

        @Override // p129m8.e
        public p129m8.i getContext() {
            return this.f5938q.getContext();
        }

        @Override // F8.InterfaceC0822l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void q(I i10, A a10) {
            this.f5938q.q(i10, a10);
        }

        @Override // F8.InterfaceC0822l
        public void i(l lVar) {
            this.f5938q.i(lVar);
        }

        @Override // F8.InterfaceC0822l
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object r(A a10, Object obj, q qVar) {
            final f fVar = f.this;
            Object objR = this.f5938q.r(a10, obj, new q() { // from class: O8.d
                @Override // p219v8.q
                public final Object e(Object obj2, Object obj3, Object obj4) {
                    return f.a.l(fVar, this, (Throwable) obj2, (A) obj3, (p129m8.i) obj4);
                }
            });
            if (objR != null) {
                f.w().set(f.this, this.f5939r);
            }
            return objR;
        }

        @Override // F8.InterfaceC0822l
        public boolean o(Throwable th) {
            return this.f5938q.o(th);
        }

        @Override // p129m8.e
        public void resumeWith(Object obj) {
            this.f5938q.resumeWith(obj);
        }

        @Override // F8.InterfaceC0822l
        public void t(Object obj) {
            this.f5938q.t(obj);
        }
    }

    public f(boolean z9) {
        super(1, z9 ? 1 : 0);
        this.owner$volatile = z9 ? null : g.f5941a;
        this.f5937h = new q() { // from class: O8.b
            @Override // p219v8.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                return f.B(this.f5929q, (N8.k) obj, obj2, obj3);
            }
        };
    }

    private final Object A(Object obj, p129m8.e eVar) {
        C0826n c0826nB = AbstractC0830p.b(p139n8.b.c(eVar));
        try {
            e(new a(c0826nB, obj));
            Object objA = c0826nB.A();
            if (objA == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objA == p139n8.b.e() ? objA : A.f21846a;
        } catch (Throwable th) {
            c0826nB.P();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q B(final f fVar, N8.k kVar, final Object obj, Object obj2) {
        return new q() { // from class: O8.c
            @Override // p219v8.q
            public final Object e(Object obj3, Object obj4, Object obj5) {
                return f.C(this.f5930q, obj, (Throwable) obj3, obj4, (p129m8.i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A C(f fVar, Object obj, Throwable th, Object obj2, p129m8.i iVar) {
        fVar.b(obj);
        return A.f21846a;
    }

    private final int D(Object obj) {
        while (!q()) {
            if (obj == null) {
                return 1;
            }
            int iX = x(obj);
            if (iX == 1) {
                return 2;
            }
            if (iX == 2) {
                return 1;
            }
        }
        f5936i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater w() {
        return f5936i;
    }

    private final int x(Object obj) {
        while (y()) {
            Object obj2 = f5936i.get(this);
            if (obj2 != g.f5941a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object z(f fVar, Object obj, p129m8.e eVar) {
        Object objA;
        return (!fVar.a(obj) && (objA = fVar.A(obj, eVar)) == p139n8.b.e()) ? objA : A.f21846a;
    }

    @Override // O8.a
    public boolean a(Object obj) {
        int iD = D(obj);
        if (iD == 0) {
            return true;
        }
        if (iD == 1) {
            return false;
        }
        if (iD != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // O8.a
    public void b(Object obj) {
        while (y()) {
            Object obj2 = f5936i.get(this);
            if (obj2 != g.f5941a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (f5936i.compareAndSet(this, obj2, g.f5941a)) {
                    p();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // O8.a
    public Object c(Object obj, p129m8.e eVar) {
        return z(this, obj, eVar);
    }

    public String toString() {
        return "Mutex@" + P.b(this) + "[isLocked=" + y() + ",owner=" + f5936i.get(this) + ']';
    }

    public boolean y() {
        return i() == 0;
    }
}
