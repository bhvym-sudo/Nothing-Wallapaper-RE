package A1;

import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p252z1.a f118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f120d;

    /* JADX INFO: renamed from: A1.a$a, reason: collision with other inner class name */
    static final class C0003a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f121q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f123s;

        C0003a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f121q = obj;
            this.f123s |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f124q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f125r;

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = a.this.new b(eVar);
            bVar.f125r = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r1.b(r5, r4) == r0) goto L15;
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
                int r1 = r4.f124q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L47
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                java.lang.Object r1 = r4.f125r
                I8.g r1 = (I8.InterfaceC0881g) r1
                p079h8.r.b(r5)
                goto L3b
            L22:
                p079h8.r.b(r5)
                java.lang.Object r5 = r4.f125r
                r1 = r5
                I8.g r1 = (I8.InterfaceC0881g) r1
                A1.a r5 = A1.a.this
                z1.a r5 = A1.a.b(r5)
                r4.f125r = r1
                r4.f124q = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L3b
                goto L46
            L3b:
                r3 = 0
                r4.f125r = r3
                r4.f124q = r2
                java.lang.Object r4 = r1.b(r5, r4)
                if (r4 != r0) goto L47
            L46:
                return r0
            L47:
                h8.A r4 = p079h8.A.f21846a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: A1.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((b) create(interfaceC0881g, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f127q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f128r;

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = new c(eVar);
            cVar.f128r = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f127q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f128r;
                A a10 = A.f21846a;
                this.f127q = 1;
                if (interfaceC0881g.b(a10, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((c) create(interfaceC0881g, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f129q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ a f130r;

        /* JADX INFO: renamed from: A1.a$d$a, reason: collision with other inner class name */
        public static final class C0004a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f131q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f132r;

            /* JADX INFO: renamed from: A1.a$d$a$a, reason: collision with other inner class name */
            public static final class C0005a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f133q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f134r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f135s;

                public C0005a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f133q = obj;
                    this.f134r |= Integer.MIN_VALUE;
                    return C0004a.this.b(null, this);
                }
            }

            public C0004a(InterfaceC0881g interfaceC0881g, a aVar) {
                this.f131q = interfaceC0881g;
                this.f132r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r6.b(r8, r0) == r1) goto L22;
             */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r7, p129m8.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof A1.a.d.C0004a.C0005a
                    if (r0 == 0) goto L13
                    r0 = r8
                    A1.a$d$a$a r0 = (A1.a.d.C0004a.C0005a) r0
                    int r1 = r0.f134r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f134r = r1
                    goto L18
                L13:
                    A1.a$d$a$a r0 = new A1.a$d$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f133q
                    java.lang.Object r1 = p139n8.b.e()
                    int r2 = r0.f134r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p079h8.r.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f135s
                    I8.g r6 = (I8.InterfaceC0881g) r6
                    p079h8.r.b(r8)
                    goto L53
                L3c:
                    p079h8.r.b(r8)
                    I8.g r8 = r6.f131q
                    h8.A r7 = (p079h8.A) r7
                    A1.a r6 = r6.f132r
                    r0.f135s = r8
                    r0.f134r = r4
                    java.lang.Object r6 = A1.a.d(r6, r0)
                    if (r6 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L53:
                    r7 = 0
                    r0.f135s = r7
                    r0.f134r = r3
                    java.lang.Object r6 = r6.b(r8, r0)
                    if (r6 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    h8.A r6 = p079h8.A.f21846a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: A1.a.d.C0004a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public d(InterfaceC0880f interfaceC0880f, a aVar) {
            this.f129q = interfaceC0880f;
            this.f130r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f129q.a(new C0004a(interfaceC0881g, this.f130r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f137q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f138r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f140t;

        e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f138r = obj;
            this.f140t |= Integer.MIN_VALUE;
            return a.this.g(this);
        }
    }

    static final class f extends l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f141q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ B1.a f142r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a f143s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(B1.a aVar, a aVar2, p129m8.e eVar) {
            super(1, eVar);
            this.f142r = aVar;
            this.f143s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return new f(this.f142r, this.f143s, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f141q;
            if (i10 == 0) {
                r.b(obj);
                p219v8.l lVarC = this.f142r.c();
                this.f141q = 1;
                if (lVarC.f(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            ((A1.b) this.f143s.f119c.get()).d(this.f142r);
            return A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((f) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final class g extends l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f144q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f145r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f146s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a f147t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p129m8.e eVar, a aVar) {
            super(3, eVar);
            this.f147t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f144q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f145r;
                InterfaceC0880f interfaceC0880fJ = ((Boolean) this.f146s).booleanValue() ? AbstractC0882h.J(new d(AbstractC0882h.I(this.f147t.f118b.a(), new c(null)), this.f147t), this.f147t.f117a, K.a.b(K.f3174a, 0L, 0L, 3, null), 1) : AbstractC0882h.u();
                this.f144q = 1;
                if (AbstractC0882h.t(interfaceC0881g, interfaceC0880fJ, this) == objE) {
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

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
            g gVar = new g(eVar, this.f147t);
            gVar.f145r = interfaceC0881g;
            gVar.f146s = obj;
            return gVar.invokeSuspend(A.f21846a);
        }
    }

    public a(L applicationScope, p252z1.a repository, p069g8.a snapshotRestorer) {
        n.h(applicationScope, "applicationScope");
        n.h(repository, "repository");
        n.h(snapshotRestorer, "snapshotRestorer");
        this.f117a = applicationScope;
        this.f118b = repository;
        this.f119c = snapshotRestorer;
        this.f120d = AbstractC0882h.N(AbstractC0882h.A(new b(null)), new g(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(p129m8.e eVar) {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i10 = eVar2.f140t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f140t = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f138r;
        Object objE = p139n8.b.e();
        int i11 = eVar2.f140t;
        if (i11 == 0) {
            r.b(objC);
            p252z1.a aVar = this.f118b;
            eVar2.f137q = this;
            eVar2.f140t = 1;
            objC = aVar.c(eVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (a) eVar2.f137q;
            r.b(objC);
        }
        B1.b bVar = (B1.b) objC;
        if (!(bVar instanceof B1.b.C0014b)) {
            return bVar;
        }
        List<B1.a> listA = ((B1.b.C0014b) bVar).a();
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(listA, 10));
        for (B1.a aVar2 : listA) {
            arrayList.add(new B1.a(aVar2.b(), aVar2.a(), aVar2.d(), aVar2.e(), new f(aVar2, this, null)));
        }
        return new B1.b.C0014b(arrayList);
    }

    public final InterfaceC0880f e() {
        return this.f120d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(p129m8.e eVar) {
        C0003a c0003a;
        List listA;
        if (eVar instanceof C0003a) {
            c0003a = (C0003a) eVar;
            int i10 = c0003a.f123s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0003a.f123s = i10 - Integer.MIN_VALUE;
            } else {
                c0003a = new C0003a(eVar);
            }
        } else {
            c0003a = new C0003a(eVar);
        }
        Object objC = c0003a.f121q;
        Object objE = p139n8.b.e();
        int i11 = c0003a.f123s;
        if (i11 == 0) {
            r.b(objC);
            p252z1.a aVar = this.f118b;
            c0003a.f123s = 1;
            objC = aVar.c(c0003a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objC);
        }
        Object obj = null;
        B1.b.C0014b c0014b = objC instanceof B1.b.C0014b ? (B1.b.C0014b) objC : null;
        if (c0014b == null || (listA = c0014b.a()) == null) {
            return null;
        }
        for (Object obj2 : listA) {
            if (((Boolean) ((B1.a) obj2).e().getValue()).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        return (B1.a) obj;
    }

    public final Object h(B1.a aVar, p129m8.e eVar) {
        Object objF = aVar.c().f(eVar);
        return objF == p139n8.b.e() ? objF : A.f21846a;
    }
}
