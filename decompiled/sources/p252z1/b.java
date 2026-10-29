package p252z1;

import F8.AbstractC0812g;
import F8.C0826n;
import F8.I;
import F8.InterfaceC0822l;
import F8.L;
import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.Q;
import androidx.lifecycle.AbstractC1153m;
import androidx.lifecycle.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p252z1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f30608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p242y1.e f30609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f30610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A f30611d;

    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f30612q;

        /* JADX INFO: renamed from: z1.b$a$a, reason: collision with other inner class name */
        public static final class C0757a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f30613q;

            /* JADX INFO: renamed from: z1.b$a$a$a, reason: collision with other inner class name */
            public static final class C0758a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f30614q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f30615r;

                public C0758a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f30614q = obj;
                    this.f30615r |= Integer.MIN_VALUE;
                    return C0757a.this.b(null, this);
                }
            }

            public C0757a(InterfaceC0881g interfaceC0881g) {
                this.f30613q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0758a c0758a;
                if (eVar instanceof C0758a) {
                    c0758a = (C0758a) eVar;
                    int i10 = c0758a.f30615r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0758a.f30615r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0758a = new C0758a(eVar);
                    }
                } else {
                    c0758a = new C0758a(eVar);
                }
                Object obj2 = c0758a.f30614q;
                Object objE = p139n8.b.e();
                int i11 = c0758a.f30615r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f30613q;
                    p079h8.A a10 = p079h8.A.f21846a;
                    c0758a.f30615r = 1;
                    if (interfaceC0881g.b(a10, c0758a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public a(InterfaceC0880f interfaceC0880f) {
            this.f30612q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f30612q.a(new C0757a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: z1.b$b, reason: collision with other inner class name */
    static final class C0759b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f30617q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f30618r;

        /* JADX INFO: renamed from: z1.b$b$a */
        public static final class a implements w1.a.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f30620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f30621b;

            a(b bVar, InterfaceC0822l interfaceC0822l) {
                this.f30620a = bVar;
                this.f30621b = interfaceC0822l;
            }

            @Override // w1.a.b
            public void a(Throwable th) {
                InterfaceC0822l interfaceC0822l = this.f30621b;
                q.a aVar = q.f21862r;
                if (th == null) {
                    th = new Exception("Failed to load grid options!");
                }
                interfaceC0822l.resumeWith(q.b(new B1.b.a(th)));
            }

            @Override // w1.a.b
            public void b(List list) {
                Object next;
                if (list == null) {
                    list = AbstractC1444s.l();
                }
                A a10 = this.f30620a.f30611d;
                List list2 = list;
                b bVar = this.f30620a;
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((p242y1.a) next).b(bVar.f30609b));
                a10.setValue(next);
                InterfaceC0822l interfaceC0822l = this.f30621b;
                b bVar2 = this.f30620a;
                ArrayList arrayList = new ArrayList(AbstractC1444s.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(bVar2.k((p242y1.a) it2.next()));
                }
                interfaceC0822l.resumeWith(q.b(new B1.b.C0014b(arrayList)));
            }
        }

        C0759b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new C0759b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0759b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30618r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            b bVar = b.this;
            this.f30617q = bVar;
            this.f30618r = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
            c0826n.G();
            bVar.f30609b.e(new a(bVar, c0826n), true);
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                h.c(this);
            }
            return objA == objE ? objE : objA;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30622q;

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f30622q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(b.this.f30609b.h());
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f30624q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f30625r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f30626s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p242y1.a f30628u;

        public static final class a implements p222w1.a.InterfaceC0718a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f30629a;

            a(InterfaceC0822l interfaceC0822l) {
                this.f30629a = interfaceC0822l;
            }

            @Override // p222w1.a.InterfaceC0718a
            public void a(Throwable th) {
                InterfaceC0822l interfaceC0822l = this.f30629a;
                q.a aVar = q.f21862r;
                interfaceC0822l.resumeWith(q.b(Boolean.FALSE));
            }

            @Override // p222w1.a.InterfaceC0718a
            public void b() {
                InterfaceC0822l interfaceC0822l = this.f30629a;
                q.a aVar = q.f21862r;
                interfaceC0822l.resumeWith(q.b(Boolean.TRUE));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p242y1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f30628u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new d(this.f30628u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30626s;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            b bVar = b.this;
            p242y1.a aVar = this.f30628u;
            this.f30624q = bVar;
            this.f30625r = aVar;
            this.f30626s = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
            c0826n.G();
            bVar.f30609b.d(aVar, new a(c0826n));
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                h.c(this);
            }
            return objA == objE ? objE : objA;
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f30630q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f30631r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f30632q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f30633r;

            /* JADX INFO: renamed from: z1.b$e$a$a, reason: collision with other inner class name */
            public static final class C0760a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f30634q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f30635r;

                public C0760a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f30634q = obj;
                    this.f30635r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f30632q = interfaceC0881g;
                this.f30633r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0760a c0760a;
                if (eVar instanceof C0760a) {
                    c0760a = (C0760a) eVar;
                    int i10 = c0760a.f30635r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0760a.f30635r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0760a = new C0760a(eVar);
                    }
                } else {
                    c0760a = new C0760a(eVar);
                }
                Object obj2 = c0760a.f30634q;
                Object objE = p139n8.b.e();
                int i11 = c0760a.f30635r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f30632q;
                    String strI = this.f30633r.i((p242y1.a) obj);
                    c0760a.f30635r = 1;
                    if (interfaceC0881g.b(strI, c0760a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public e(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f30630q = interfaceC0880f;
            this.f30631r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f30630q.a(new a(interfaceC0881g, this.f30631r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class f implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f30637q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f30638r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p242y1.a f30639s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f30640q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f30641r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p242y1.a f30642s;

            /* JADX INFO: renamed from: z1.b$f$a$a, reason: collision with other inner class name */
            public static final class C0761a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f30643q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f30644r;

                public C0761a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f30643q = obj;
                    this.f30644r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar, p242y1.a aVar) {
                this.f30640q = interfaceC0881g;
                this.f30641r = bVar;
                this.f30642s = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0761a c0761a;
                if (eVar instanceof C0761a) {
                    c0761a = (C0761a) eVar;
                    int i10 = c0761a.f30644r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0761a.f30644r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0761a = new C0761a(eVar);
                    }
                } else {
                    c0761a = new C0761a(eVar);
                }
                Object obj2 = c0761a.f30643q;
                Object objE = p139n8.b.e();
                int i11 = c0761a.f30644r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f30640q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(n.d(this.f30641r.i(this.f30642s), (String) obj));
                    c0761a.f30644r = 1;
                    if (interfaceC0881g.b(boolA, c0761a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public f(InterfaceC0880f interfaceC0880f, b bVar, p242y1.a aVar) {
            this.f30637q = interfaceC0880f;
            this.f30638r = bVar;
            this.f30639s = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f30637q.a(new a(interfaceC0881g, this.f30638r, this.f30639s), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class g extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f30646q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p242y1.a f30648s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p242y1.a aVar, p129m8.e eVar) {
            super(1, eVar);
            this.f30648s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return b.this.new g(this.f30648s, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f30646q;
            if (i10 == 0) {
                r.b(obj);
                b bVar = b.this;
                p242y1.a aVar = this.f30648s;
                this.f30646q = 1;
                if (bVar.j(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((g) create(eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public b(L applicationScope, p242y1.e manager, I backgroundDispatcher) {
        n.h(applicationScope, "applicationScope");
        n.h(manager, "manager");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f30608a = applicationScope;
        this.f30609b = manager;
        this.f30610c = backgroundDispatcher;
        this.f30611d = Q.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(p242y1.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.f30158w + "x" + aVar.f30157v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(p242y1.a aVar, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(this.f30610c, new d(aVar, null), eVar);
        return objG == p139n8.b.e() ? objG : p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B1.a k(p242y1.a aVar) {
        String strA = aVar.a();
        n.g(strA, "getTitle(...)");
        return new B1.a(strA, aVar.f30158w, aVar.f30157v, AbstractC0882h.K(new f(new e(this.f30611d, this), this, aVar), this.f30608a, K.f3174a.c(), Boolean.FALSE), new g(aVar, null));
    }

    @Override // p252z1.a
    public InterfaceC0880f a() {
        C cG = this.f30609b.g(null);
        n.g(cG, "getOptionChangeObservable(...)");
        return new a(AbstractC1153m.a(cG));
    }

    @Override // p252z1.a
    public Object b(p129m8.e eVar) {
        return AbstractC0812g.g(this.f30610c, new c(null), eVar);
    }

    @Override // p252z1.a
    public Object c(p129m8.e eVar) {
        return AbstractC0812g.g(this.f30610c, new C0759b(null), eVar);
    }
}
