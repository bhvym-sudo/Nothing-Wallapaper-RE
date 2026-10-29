package N8;

import F8.AbstractC0830p;
import F8.C0826n;
import F8.InterfaceC0807d0;
import F8.InterfaceC0820k;
import F8.InterfaceC0822l;
import F8.c1;
import K8.A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.n;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
public class j implements InterfaceC0820k, d, k, c1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5409v = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p129m8.i f5410q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f5412s;
    private volatile /* synthetic */ Object state$volatile = l.f5429b;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f5411r = new ArrayList(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5413t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Object f5414u = l.f5432e;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f5415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f5416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q f5417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f5418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f5419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q f5420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f5421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5422h = -1;

        public a(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.f5415a = obj;
            this.f5416b = qVar;
            this.f5417c = qVar2;
            this.f5418d = obj2;
            this.f5419e = obj3;
            this.f5420f = qVar3;
        }

        public final q a(k kVar, Object obj) {
            q qVar = this.f5420f;
            if (qVar != null) {
                return (q) qVar.e(kVar, this.f5418d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f5421g;
            j jVar = j.this;
            if (obj instanceof A) {
                ((A) obj).s(this.f5422h, null, jVar.getContext());
                return;
            }
            InterfaceC0807d0 interfaceC0807d0 = obj instanceof InterfaceC0807d0 ? (InterfaceC0807d0) obj : null;
            if (interfaceC0807d0 != null) {
                interfaceC0807d0.dispose();
            }
        }

        public final Object c(Object obj, p129m8.e eVar) {
            Object obj2 = this.f5419e;
            if (this.f5418d == l.i()) {
                n.f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((p219v8.l) obj2).f(eVar);
            }
            n.f(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, eVar);
        }

        public final Object d(Object obj) {
            return this.f5417c.e(this.f5415a, this.f5418d, obj);
        }

        public final boolean e(j jVar) {
            this.f5416b.e(this.f5415a, jVar, this.f5418d);
            return jVar.f5414u == l.f5432e;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f5424q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f5425r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5427t;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5425r = obj;
            this.f5427t |= Integer.MIN_VALUE;
            return j.this.q(this);
        }
    }

    public j(p129m8.i iVar) {
        this.f5410q = iVar;
    }

    private final void k(Object obj) {
        List list = this.f5411r;
        n.e(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f5415a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void l(a aVar) {
        List<a> list = this.f5411r;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f5409v.set(this, l.f5430c);
        this.f5414u = l.f5432e;
        this.f5411r = null;
    }

    private final Object m(p129m8.e eVar) {
        Object obj = f5409v.get(this);
        n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f5414u;
        l(aVar);
        return aVar.c(aVar.d(obj2), eVar);
    }

    static /* synthetic */ Object p(j jVar, p129m8.e eVar) {
        return jVar.t() ? jVar.m(eVar) : jVar.q(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(p129m8.e eVar) {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f5427t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f5427t = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f5425r;
        Object objE = p139n8.b.e();
        int i11 = bVar.f5427t;
        if (i11 == 0) {
            r.b(obj);
            bVar.f5424q = this;
            bVar.f5427t = 1;
            if (z(bVar) != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return obj;
        }
        this = (j) bVar.f5424q;
        r.b(obj);
        bVar.f5424q = null;
        bVar.f5427t = 2;
        Object objM = this.m(bVar);
        return objM == objE ? objE : objM;
    }

    private final a r(Object obj) {
        List list = this.f5411r;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((a) obj3).f5415a == obj) {
                obj2 = obj3;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final boolean t() {
        return f5409v.get(this) instanceof a;
    }

    public static /* synthetic */ void v(j jVar, a aVar, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        jVar.u(aVar, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Object obj) {
        a aVarR = r(obj);
        n.e(aVarR);
        aVarR.f5421g = null;
        aVarR.f5422h = -1;
        u(aVarR, true);
    }

    private final int y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f5409v.get(this);
            if (obj3 instanceof InterfaceC0822l) {
                a aVarR = r(obj);
                if (aVarR == null) {
                    continue;
                } else {
                    q qVarA = aVarR.a(this, obj2);
                    if (f5409v.compareAndSet(this, obj3, aVarR)) {
                        this.f5414u = obj2;
                        if (l.j((InterfaceC0822l) obj3, qVarA)) {
                            return 0;
                        }
                        this.f5414u = l.f5432e;
                        return 2;
                    }
                }
            } else {
                if (n.d(obj3, l.f5430c) || (obj3 instanceof a)) {
                    return 3;
                }
                if (n.d(obj3, l.f5431d)) {
                    return 2;
                }
                if (n.d(obj3, l.f5429b)) {
                    if (f5409v.compareAndSet(this, obj3, AbstractC1444s.e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (f5409v.compareAndSet(this, obj3, AbstractC1444s.h0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final Object z(p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5409v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == l.f5429b) {
                if (f5409v.compareAndSet(this, obj, c0826n)) {
                    AbstractC0830p.c(c0826n, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof a) {
                        c0826n.m(p079h8.A.f21846a, ((a) obj).a(this, this.f5414u));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (f5409v.compareAndSet(this, obj, l.f5429b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        w(it.next());
                    }
                }
            }
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    @Override // N8.d
    public void a(e eVar, p219v8.l lVar) {
        v(this, new a(eVar.b(), eVar.a(), eVar.d(), l.i(), lVar, eVar.c()), false, 1, null);
    }

    @Override // F8.c1
    public void b(A a10, int i10) {
        this.f5412s = a10;
        this.f5413t = i10;
    }

    @Override // N8.d
    public void c(g gVar, p pVar) {
        v(this, new a(gVar.b(), gVar.a(), gVar.d(), null, pVar, gVar.c()), false, 1, null);
    }

    @Override // N8.k
    public boolean d(Object obj, Object obj2) {
        return y(obj, obj2) == 0;
    }

    @Override // F8.InterfaceC0820k
    public void e(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5409v;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == l.f5430c) {
                return;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l.f5431d));
        List list = this.f5411r;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f5414u = l.f5432e;
        this.f5411r = null;
    }

    @Override // N8.k
    public void f(Object obj) {
        this.f5414u = obj;
    }

    @Override // N8.k
    public p129m8.i getContext() {
        return this.f5410q;
    }

    public void n(InterfaceC0807d0 interfaceC0807d0) {
        this.f5412s = interfaceC0807d0;
    }

    public Object o(p129m8.e eVar) {
        return p(this, eVar);
    }

    public final void u(a aVar, boolean z9) {
        if (f5409v.get(this) instanceof a) {
            return;
        }
        if (!z9) {
            k(aVar.f5415a);
        }
        if (!aVar.e(this)) {
            f5409v.set(this, aVar);
            return;
        }
        if (!z9) {
            List list = this.f5411r;
            n.e(list);
            list.add(aVar);
        }
        aVar.f5421g = this.f5412s;
        aVar.f5422h = this.f5413t;
        this.f5412s = null;
        this.f5413t = -1;
    }

    public final m x(Object obj, Object obj2) {
        return l.a(y(obj, obj2));
    }
}
