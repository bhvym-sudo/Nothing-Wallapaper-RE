package p170r;

import F8.C0826n;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.o;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p129m8.e;
import p129m8.i;
import p219v8.l;
import p219v8.p;

/* JADX INFO: renamed from: r.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1682h implements InterfaceC1669a0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p219v8.a f25447q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Throwable f25449s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f25448r = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f25450t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f25451u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C1680g f25452v = new C1680g(0);

    /* JADX INFO: renamed from: r.h$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f25453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f25454b;

        public a(l lVar, e eVar) {
            this.f25453a = lVar;
            this.f25454b = eVar;
        }

        public final e a() {
            return this.f25454b;
        }

        public final void b(long j9) {
            Object objB;
            e eVar = this.f25454b;
            try {
                q.a aVar = q.f21862r;
                objB = q.b(this.f25453a.f(Long.valueOf(j9)));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            eVar.resumeWith(objB);
        }
    }

    /* JADX INFO: renamed from: r.h$b */
    static final class b extends o implements l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a f25456s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f25456s = aVar;
        }

        public final void a(Throwable th) {
            Object obj = C1682h.this.f25448r;
            C1682h c1682h = C1682h.this;
            a aVar = this.f25456s;
            synchronized (obj) {
                try {
                    c1682h.f25450t.remove(aVar);
                    if (c1682h.f25450t.isEmpty()) {
                        c1682h.f25452v.set(0);
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return A.f21846a;
        }
    }

    public C1682h(p219v8.a aVar) {
        this.f25447q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Throwable th) {
        synchronized (this.f25448r) {
            try {
                if (this.f25449s != null) {
                    return;
                }
                this.f25449s = th;
                List list = this.f25450t;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e eVarA = ((a) list.get(i10)).a();
                    q.a aVar = q.f21862r;
                    eVarA.resumeWith(q.b(r.a(th)));
                }
                this.f25450t.clear();
                this.f25452v.set(0);
                A a10 = A.f21846a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p129m8.i
    public Object U0(Object obj, p pVar) {
        return InterfaceC1669a0.a.a(this, obj, pVar);
    }

    @Override // m8.i.b, p129m8.i
    public i.b b(i.c cVar) {
        return InterfaceC1669a0.a.b(this, cVar);
    }

    public final boolean l() {
        return this.f25452v.get() != 0;
    }

    public final void m(long j9) {
        synchronized (this.f25448r) {
            try {
                List list = this.f25450t;
                this.f25450t = this.f25451u;
                this.f25451u = list;
                this.f25452v.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((a) list.get(i10)).b(j9);
                }
                list.clear();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p129m8.i
    public i t0(i.c cVar) {
        return InterfaceC1669a0.a.c(this, cVar);
    }

    @Override // p170r.InterfaceC1669a0
    public Object u(l lVar, e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        a aVar = new a(lVar, c0826n);
        synchronized (this.f25448r) {
            Throwable th = this.f25449s;
            if (th != null) {
                q.a aVar2 = q.f21862r;
                c0826n.resumeWith(q.b(r.a(th)));
            } else {
                boolean zIsEmpty = this.f25450t.isEmpty();
                this.f25450t.add(aVar);
                if (zIsEmpty) {
                    this.f25452v.set(1);
                }
                c0826n.i(new b(aVar));
                if (zIsEmpty && this.f25447q != null) {
                    try {
                        this.f25447q.invoke();
                    } catch (Throwable th2) {
                        k(th2);
                    }
                }
            }
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            h.c(eVar);
        }
        return objA;
    }

    @Override // p129m8.i
    public i z(i iVar) {
        return InterfaceC1669a0.a.d(this, iVar);
    }
}
