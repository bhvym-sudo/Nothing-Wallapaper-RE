package p043e2;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0881g;
import I8.O;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p079h8.v;
import p089i8.N;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19784d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U2.a f19785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f19786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D3.b f19787c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: e2.b$b, reason: collision with other inner class name */
    static final class C0529b extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f19788q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f19789r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f19791t;

        C0529b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19789r = obj;
            this.f19791t |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19792q;

        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ b f19794q;

            a(b bVar) {
                this.f19794q = bVar;
            }

            public final Object a(boolean z9, e eVar) {
                this.f19794q.f(new p043e2.a(z9));
                return A.f21846a;
            }

            @Override // I8.InterfaceC0881g
            public /* bridge */ /* synthetic */ Object b(Object obj, e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }
        }

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return b.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (((I8.O) r5).a(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r4.f19792q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 == r2) goto L16
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L16:
                p079h8.r.b(r5)
                goto L42
            L1a:
                p079h8.r.b(r5)
                goto L30
            L1e:
                p079h8.r.b(r5)
                e2.b r5 = p043e2.b.this
                U2.a r5 = p043e2.b.c(r5)
                r4.f19792q = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L41
            L30:
                I8.O r5 = (I8.O) r5
                e2.b$c$a r1 = new e2.b$c$a
                e2.b r3 = p043e2.b.this
                r1.<init>(r3)
                r4.f19792q = r2
                java.lang.Object r4 = r5.a(r1, r4)
                if (r4 != r0) goto L42
            L41:
                return r0
            L42:
                h8.f r4 = new h8.f
                r4.<init>()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e2.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(U2.a interactor, L backgroundScope) {
        n.h(interactor, "interactor");
        n.h(backgroundScope, "backgroundScope");
        this.f19785a = interactor;
        this.f19786b = backgroundScope;
        this.f19787c = D3.b.a.f714a;
    }

    private final E3.a e(p043e2.a aVar) {
        return new E3.a(N.e(v.a("is_show_notifications_on_lock_screen_enabled", String.valueOf(aVar.a()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(p043e2.a aVar) {
        this.f19787c.a(e(aVar));
    }

    @Override // D3.a
    public Object a(E3.a aVar, e eVar) {
        String str = (String) aVar.a().get("is_show_notifications_on_lock_screen_enabled");
        Object objB = this.f19785a.b(str != null ? Boolean.parseBoolean(str) : false, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // D3.a
    public Object b(D3.b bVar, e eVar) {
        C0529b c0529b;
        if (eVar instanceof C0529b) {
            c0529b = (C0529b) eVar;
            int i10 = c0529b.f19791t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0529b.f19791t = i10 - Integer.MIN_VALUE;
            } else {
                c0529b = new C0529b(eVar);
            }
        } else {
            c0529b = new C0529b(eVar);
        }
        Object objA = c0529b.f19789r;
        Object objE = p139n8.b.e();
        int i11 = c0529b.f19791t;
        if (i11 == 0) {
            r.b(objA);
            this.f19787c = bVar;
            AbstractC0816i.d(this.f19786b, null, null, new c(null), 3, null);
            U2.a aVar = this.f19785a;
            c0529b.f19788q = this;
            c0529b.f19791t = 1;
            objA = aVar.a(c0529b);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (b) c0529b.f19788q;
            r.b(objA);
        }
        return this.e(new p043e2.a(((Boolean) ((O) objA).getValue()).booleanValue()));
    }
}
