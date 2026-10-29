package p194t3;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1450a;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p089i8.N;
import p129m8.e;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27905d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f27906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p194t3.a f27907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D3.b f27908c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: t3.b$b, reason: collision with other inner class name */
    static final class C0684b extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f27909q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f27910r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f27911s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f27913u;

        C0684b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27911s = obj;
            this.f27913u |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f27914q;

        /* synthetic */ class a extends AbstractC1450a implements q {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final a f27916x = new a();

            a() {
                super(3, o.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            @Override // p219v8.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object e(String str, String str2, e eVar) {
                return c.u(str, str2, eVar);
            }
        }

        /* JADX INFO: renamed from: t3.b$c$b, reason: collision with other inner class name */
        static final class C0685b implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ b f27917q;

            C0685b(b bVar) {
                this.f27917q = bVar;
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(o oVar, e eVar) {
                this.f27917q.f27908c.a(this.f27917q.g((String) oVar.a(), (String) oVar.b()));
                return A.f21846a;
            }
        }

        c(e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object u(String str, String str2, e eVar) {
            return new o(str, str2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return b.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f27914q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fQ = AbstractC0882h.q(AbstractC0882h.l(b.this.f27907b.f(p204u3.a.HOME), b.this.f27907b.f(p204u3.a.LOCK), a.f27916x), 1);
                C0685b c0685b = new C0685b(b.this);
                this.f27914q = 1;
                if (interfaceC0880fQ.a(c0685b, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    public b(L scope, p194t3.a interactor) {
        n.h(scope, "scope");
        n.h(interactor, "interactor");
        this.f27906a = scope;
        this.f27907b = interactor;
        this.f27908c = D3.b.a.f714a;
    }

    private final String f(p204u3.a aVar) {
        return (String) this.f27907b.f(aVar).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E3.a g(String str, String str2) {
        Map mapC = N.c();
        mapC.put("selected_home_screen_wallpaper_id", str);
        mapC.put("selected_lock_screen_wallpaper_id", str2);
        return new E3.a(N.b(mapC));
    }

    static /* synthetic */ E3.a h(b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f(p204u3.a.HOME);
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f(p204u3.a.LOCK);
        }
        return bVar.g(str, str2);
    }

    private final void i() {
        AbstractC0816i.d(this.f27906a, null, null, new c(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r6.h(r8, r7, r0) == r1) goto L31;
     */
    @Override // D3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(E3.a r7, p129m8.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p194t3.b.C0684b
            if (r0 == 0) goto L13
            r0 = r8
            t3.b$b r0 = (p194t3.b.C0684b) r0
            int r1 = r0.f27913u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27913u = r1
            goto L18
        L13:
            t3.b$b r0 = new t3.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27911s
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f27913u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p079h8.r.b(r8)
            goto L91
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f27910r
            r7 = r6
            E3.a r7 = (E3.a) r7
            java.lang.Object r6 = r0.f27909q
            t3.b r6 = (p194t3.b) r6
            p079h8.r.b(r8)
            goto L6a
        L41:
            p079h8.r.b(r8)
            java.util.Map r8 = r7.a()
            java.lang.String r2 = "selected_home_screen_wallpaper_id"
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L6a
            int r2 = r8.length()
            if (r2 != 0) goto L59
            goto L6a
        L59:
            t3.a r2 = r6.f27907b
            u3.a r5 = p204u3.a.HOME
            r0.f27909q = r6
            r0.f27910r = r7
            r0.f27913u = r4
            java.lang.Object r8 = r2.h(r5, r8, r0)
            if (r8 != r1) goto L6a
            goto L90
        L6a:
            java.util.Map r7 = r7.a()
            java.lang.String r8 = "selected_lock_screen_wallpaper_id"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L94
            int r8 = r7.length()
            if (r8 != 0) goto L7f
            goto L94
        L7f:
            t3.a r6 = r6.f27907b
            u3.a r8 = p204u3.a.LOCK
            r2 = 0
            r0.f27909q = r2
            r0.f27910r = r2
            r0.f27913u = r3
            java.lang.Object r6 = r6.h(r8, r7, r0)
            if (r6 != r1) goto L91
        L90:
            return r1
        L91:
            h8.A r6 = p079h8.A.f21846a
            return r6
        L94:
            h8.A r6 = p079h8.A.f21846a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p194t3.b.a(E3.a, m8.e):java.lang.Object");
    }

    @Override // D3.a
    public Object b(D3.b bVar, e eVar) {
        this.f27908c = bVar;
        i();
        return h(this, null, null, 3, null);
    }
}
