package g9;

import F8.C0803b0;
import F8.C0826n;
import F8.InterfaceC0822l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g9.d f21410r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g9.d dVar) {
            super(1);
            this.f21410r = dVar;
        }

        public final void a(Throwable th) {
            this.f21410r.cancel();
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    public static final class b implements g9.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f21411a;

        b(InterfaceC0822l interfaceC0822l) {
            this.f21411a = interfaceC0822l;
        }

        @Override // g9.f
        public void a(g9.d call, Throwable t9) {
            kotlin.jvm.internal.n.h(call, "call");
            kotlin.jvm.internal.n.h(t9, "t");
            InterfaceC0822l interfaceC0822l = this.f21411a;
            h8.q.a aVar = p079h8.q.f21862r;
            interfaceC0822l.resumeWith(p079h8.q.b(p079h8.r.a(t9)));
        }

        @Override // g9.f
        public void b(g9.d call, x response) {
            kotlin.jvm.internal.n.h(call, "call");
            kotlin.jvm.internal.n.h(response, "response");
            if (!response.d()) {
                InterfaceC0822l interfaceC0822l = this.f21411a;
                h8.q.a aVar = p079h8.q.f21862r;
                interfaceC0822l.resumeWith(p079h8.q.b(p079h8.r.a(new m(response))));
                return;
            }
            Object objA = response.a();
            if (objA != null) {
                this.f21411a.resumeWith(p079h8.q.b(objA));
                return;
            }
            Object objI = call.b().i(o.class);
            kotlin.jvm.internal.n.e(objI);
            o oVar = (o) objI;
            p079h8.g gVar = new p079h8.g("Response from " + oVar.b().getName() + '.' + oVar.a().getName() + " was null but response body type was declared as non-null");
            InterfaceC0822l interfaceC0822l2 = this.f21411a;
            h8.q.a aVar2 = p079h8.q.f21862r;
            interfaceC0822l2.resumeWith(p079h8.q.b(p079h8.r.a(gVar)));
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g9.d f21412r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g9.d dVar) {
            super(1);
            this.f21412r = dVar;
        }

        public final void a(Throwable th) {
            this.f21412r.cancel();
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    public static final class d implements g9.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f21413a;

        d(InterfaceC0822l interfaceC0822l) {
            this.f21413a = interfaceC0822l;
        }

        @Override // g9.f
        public void a(g9.d call, Throwable t9) {
            kotlin.jvm.internal.n.h(call, "call");
            kotlin.jvm.internal.n.h(t9, "t");
            InterfaceC0822l interfaceC0822l = this.f21413a;
            h8.q.a aVar = p079h8.q.f21862r;
            interfaceC0822l.resumeWith(p079h8.q.b(p079h8.r.a(t9)));
        }

        @Override // g9.f
        public void b(g9.d call, x response) {
            kotlin.jvm.internal.n.h(call, "call");
            kotlin.jvm.internal.n.h(response, "response");
            if (response.d()) {
                InterfaceC0822l interfaceC0822l = this.f21413a;
                h8.q.a aVar = p079h8.q.f21862r;
                interfaceC0822l.resumeWith(p079h8.q.b(response.a()));
            } else {
                InterfaceC0822l interfaceC0822l2 = this.f21413a;
                h8.q.a aVar2 = p079h8.q.f21862r;
                interfaceC0822l2.resumeWith(p079h8.q.b(p079h8.r.a(new m(response))));
            }
        }
    }

    static final class e extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g9.d f21414r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g9.d dVar) {
            super(1);
            this.f21414r = dVar;
        }

        public final void a(Throwable th) {
            this.f21414r.cancel();
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    public static final class f implements g9.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f21415a;

        f(InterfaceC0822l interfaceC0822l) {
            this.f21415a = interfaceC0822l;
        }

        @Override // g9.f
        public void a(g9.d call, Throwable t9) {
            kotlin.jvm.internal.n.h(call, "call");
            kotlin.jvm.internal.n.h(t9, "t");
            InterfaceC0822l interfaceC0822l = this.f21415a;
            h8.q.a aVar = p079h8.q.f21862r;
            interfaceC0822l.resumeWith(p079h8.q.b(p079h8.r.a(t9)));
        }

        @Override // g9.f
        public void b(g9.d call, x response) {
            kotlin.jvm.internal.n.h(call, "call");
            kotlin.jvm.internal.n.h(response, "response");
            this.f21415a.resumeWith(p079h8.q.b(response));
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f21416q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f21417r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f21418s;

        g(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21417r = obj;
            this.f21418s |= Integer.MIN_VALUE;
            return p.e(null, this);
        }
    }

    static final class h implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p129m8.e f21419q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Throwable f21420r;

        h(p129m8.e eVar, Throwable th) {
            this.f21419q = eVar;
            this.f21420r = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p129m8.e eVarC = p139n8.b.c(this.f21419q);
            h8.q.a aVar = p079h8.q.f21862r;
            eVarC.resumeWith(p079h8.q.b(p079h8.r.a(this.f21420r)));
        }
    }

    public static final Object a(g9.d dVar, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        c0826n.i(new a(dVar));
        dVar.g(new b(c0826n));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final Object b(g9.d dVar, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        c0826n.i(new c(dVar));
        dVar.g(new d(c0826n));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final Object c(g9.d dVar, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        c0826n.i(new e(dVar));
        dVar.g(new f(c0826n));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    public static final Object d(g9.d dVar, p129m8.e eVar) {
        kotlin.jvm.internal.n.f(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(Throwable th, p129m8.e eVar) {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i10 = gVar.f21418s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f21418s = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f21417r;
        Object objE = p139n8.b.e();
        int i11 = gVar.f21418s;
        if (i11 == 0) {
            p079h8.r.b(obj);
            gVar.f21416q = th;
            gVar.f21418s = 1;
            C0803b0.a().g1(gVar.getContext(), new h(gVar, th));
            Object objE2 = p139n8.b.e();
            if (objE2 == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(gVar);
            }
            if (objE2 == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
        }
        throw new p079h8.f();
    }
}
