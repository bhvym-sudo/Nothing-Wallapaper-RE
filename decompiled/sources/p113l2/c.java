package p113l2;

import R2.a;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p079h8.v;
import p089i8.AbstractC1444s;
import p089i8.N;
import p129m8.e;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements D3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22909d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p113l2.a f22910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R2.a f22911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D3.b f22912c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22913q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f22914r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f22915s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f22917u;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22915s = obj;
            this.f22917u |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: l2.c$c, reason: collision with other inner class name */
    static final class C0581c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22918q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f22919r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22921t;

        C0581c(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22919r = obj;
            this.f22921t |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22922q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f22923r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22925t;

        d(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22923r = obj;
            this.f22925t |= Integer.MIN_VALUE;
            return c.this.g(this);
        }
    }

    public c(p113l2.a interactor, R2.a client) {
        n.h(interactor, "interactor");
        n.h(client, "client");
        this.f22910a = interactor;
        this.f22911b = client;
        this.f22912c = D3.b.a.f714a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(e eVar) {
        C0581c c0581c;
        String str;
        if (eVar instanceof C0581c) {
            c0581c = (C0581c) eVar;
            int i10 = c0581c.f22921t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0581c.f22921t = i10 - Integer.MIN_VALUE;
            } else {
                c0581c = new C0581c(eVar);
            }
        } else {
            c0581c = new C0581c(eVar);
        }
        Object obj = c0581c.f22919r;
        Object objE = p139n8.b.e();
        int i11 = c0581c.f22921t;
        if (i11 == 0) {
            r.b(obj);
            R2.a aVar = this.f22911b;
            c0581c.f22918q = "selections";
            c0581c.f22921t = 1;
            Object objJ = aVar.j(c0581c);
            if (objJ == objE) {
                return objE;
            }
            obj = objJ;
            str = "selections";
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c0581c.f22918q;
            r.b(obj);
        }
        return new E3.a(N.e(v.a(str, AbstractC1444s.a0((Iterable) obj, "|", null, null, 0, null, new l() { // from class: l2.b
            @Override // p219v8.l
            public final Object f(Object obj2) {
                return c.f((a.c) obj2);
            }
        }, 30, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(R2.a.c selection) {
        n.h(selection, "selection");
        return selection.b() + "->" + selection.a();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:30:0x00cb->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r14.f(r0) == r1) goto L34;
     */
    @Override // D3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(E3.a r13, p129m8.e r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p113l2.c.a(E3.a, m8.e):java.lang.Object");
    }

    @Override // D3.a
    public Object b(D3.b bVar, e eVar) {
        this.f22912c = bVar;
        return e(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(e eVar) {
        d dVar;
        D3.b bVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i10 = dVar.f22925t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f22925t = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f22923r;
        Object objE = p139n8.b.e();
        int i11 = dVar.f22925t;
        if (i11 == 0) {
            r.b(obj);
            D3.b bVar2 = this.f22912c;
            dVar.f22922q = bVar2;
            dVar.f22925t = 1;
            Object objE2 = e(dVar);
            if (objE2 == objE) {
                return objE;
            }
            obj = objE2;
            bVar = bVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (D3.b) dVar.f22922q;
            r.b(obj);
        }
        bVar.a((E3.a) obj);
        return A.f21846a;
    }
}
