package L0;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.AbstractC0845x;
import F8.InterfaceC0841v;
import F8.InterfaceC0846x0;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.AbstractC1388c;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: L0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0934k implements InterfaceC0932i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f4325m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f4326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0928e f4327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f4328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f4329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O8.a f4330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC0846x0 f4332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L0.l f4333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f4334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p079h8.h f4335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p079h8.h f4336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final B f4337l;

    /* JADX INFO: renamed from: L0.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: L0.k$b */
    private final class b extends z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f4338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0934k f4339d;

        /* JADX INFO: renamed from: L0.k$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f4340q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f4341r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f4343t;

            a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4341r = obj;
                this.f4343t |= Integer.MIN_VALUE;
                return b.this.b(this);
            }
        }

        /* JADX INFO: renamed from: L0.k$b$b, reason: collision with other inner class name */
        static final class C0148b extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f4344q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f4345r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f4346s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f4347t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f4348u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f4349v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f4350w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ C0934k f4351x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ b f4352y;

            /* JADX INFO: renamed from: L0.k$b$b$a */
            public static final class a implements L0.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ O8.a f4353a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.A f4354b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.E f4355c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ C0934k f4356d;

                /* JADX INFO: renamed from: L0.k$b$b$a$a, reason: collision with other inner class name */
                static final class C0149a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f4357q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    Object f4358r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    Object f4359s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    Object f4360t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    Object f4361u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    /* synthetic */ Object f4362v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    int f4364x;

                    C0149a(p129m8.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f4362v = obj;
                        this.f4364x |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(O8.a aVar, kotlin.jvm.internal.A a10, kotlin.jvm.internal.E e10, C0934k c0934k) {
                    this.f4353a = aVar;
                    this.f4354b = a10;
                    this.f4355c = e10;
                    this.f4356d = c0934k;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:35:0x00b0, B:37:0x00b8), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
                /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // L0.s
                public Object a(p219v8.p pVar, p129m8.e eVar) throws Throwable {
                    C0149a c0149a;
                    O8.a aVar;
                    kotlin.jvm.internal.A a10;
                    kotlin.jvm.internal.E e10;
                    C0934k c0934k;
                    O8.a aVar2;
                    O8.a aVar3;
                    kotlin.jvm.internal.E e11;
                    Object obj;
                    if (eVar instanceof C0149a) {
                        c0149a = (C0149a) eVar;
                        int i10 = c0149a.f4364x;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0149a.f4364x = i10 - Integer.MIN_VALUE;
                        } else {
                            c0149a = new C0149a(eVar);
                        }
                    } else {
                        c0149a = new C0149a(eVar);
                    }
                    Object obj2 = c0149a.f4362v;
                    Object objE = p139n8.b.e();
                    int i11 = c0149a.f4364x;
                    try {
                        if (i11 == 0) {
                            p079h8.r.b(obj2);
                            aVar = this.f4353a;
                            a10 = this.f4354b;
                            e10 = this.f4355c;
                            c0934k = this.f4356d;
                            c0149a.f4357q = pVar;
                            c0149a.f4358r = aVar;
                            c0149a.f4359s = a10;
                            c0149a.f4360t = e10;
                            c0149a.f4361u = c0934k;
                            c0149a.f4364x = 1;
                            if (aVar.c(null, c0149a) != objE) {
                            }
                            return objE;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0149a.f4359s;
                                e11 = (kotlin.jvm.internal.E) c0149a.f4358r;
                                aVar2 = (O8.a) c0149a.f4357q;
                                try {
                                    p079h8.r.b(obj2);
                                    e11.f22779q = obj;
                                    Object obj3 = e11.f22779q;
                                    aVar2.b(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    aVar2.b(null);
                                    throw th;
                                }
                            }
                            c0934k = (C0934k) c0149a.f4359s;
                            e11 = (kotlin.jvm.internal.E) c0149a.f4358r;
                            aVar3 = (O8.a) c0149a.f4357q;
                            try {
                                p079h8.r.b(obj2);
                                if (!kotlin.jvm.internal.n.d(obj2, e11.f22779q)) {
                                    c0149a.f4357q = aVar3;
                                    c0149a.f4358r = e11;
                                    c0149a.f4359s = obj2;
                                    c0149a.f4364x = 3;
                                    if (c0934k.B(obj2, false, c0149a) != objE) {
                                        obj = obj2;
                                        aVar2 = aVar3;
                                        e11.f22779q = obj;
                                    }
                                    return objE;
                                }
                                aVar2 = aVar3;
                                Object obj4 = e11.f22779q;
                                aVar2.b(null);
                                return obj4;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar3;
                                aVar2.b(null);
                                throw th;
                            }
                        }
                        c0934k = (C0934k) c0149a.f4361u;
                        kotlin.jvm.internal.E e12 = (kotlin.jvm.internal.E) c0149a.f4360t;
                        a10 = (kotlin.jvm.internal.A) c0149a.f4359s;
                        O8.a aVar4 = (O8.a) c0149a.f4358r;
                        p219v8.p pVar2 = (p219v8.p) c0149a.f4357q;
                        p079h8.r.b(obj2);
                        e10 = e12;
                        pVar = pVar2;
                        aVar = aVar4;
                        if (a10.f22775q) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        Object obj5 = e10.f22779q;
                        c0149a.f4357q = aVar;
                        c0149a.f4358r = e10;
                        c0149a.f4359s = c0934k;
                        c0149a.f4360t = null;
                        c0149a.f4361u = null;
                        c0149a.f4364x = 2;
                        Object objInvoke = pVar.invoke(obj5, c0149a);
                        if (objInvoke != objE) {
                            aVar3 = aVar;
                            obj2 = objInvoke;
                            e11 = e10;
                            if (!kotlin.jvm.internal.n.d(obj2, e11.f22779q)) {
                                c0149a.f4357q = aVar3;
                                c0149a.f4358r = e11;
                                c0149a.f4359s = obj2;
                                c0149a.f4364x = 3;
                                if (c0934k.B(obj2, false, c0149a) != objE) {
                                    obj = obj2;
                                    aVar2 = aVar3;
                                    e11.f22779q = obj;
                                }
                            } else {
                                aVar2 = aVar3;
                            }
                            Object obj6 = e11.f22779q;
                            aVar2.b(null);
                            return obj6;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar;
                        aVar2.b(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0148b(C0934k c0934k, b bVar, p129m8.e eVar) {
                super(1, eVar);
                this.f4351x = c0934k;
                this.f4352y = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(p129m8.e eVar) {
                return new C0148b(this.f4351x, this.f4352y, eVar);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws C0927d {
                O8.a aVarB;
                kotlin.jvm.internal.A a10;
                kotlin.jvm.internal.E e10;
                kotlin.jvm.internal.E e11;
                kotlin.jvm.internal.A a11;
                O8.a aVar;
                Iterator it;
                O8.a aVar2;
                kotlin.jvm.internal.A a12;
                kotlin.jvm.internal.E e12;
                a aVar3;
                kotlin.jvm.internal.E e13;
                p219v8.p pVar;
                Object obj2;
                int iHashCode;
                Object objB;
                Object obj3;
                int i10;
                Object objE = p139n8.b.e();
                int i11 = this.f4350w;
                if (i11 == 0) {
                    p079h8.r.b(obj);
                    aVarB = O8.g.b(false, 1, null);
                    a10 = new kotlin.jvm.internal.A();
                    e10 = new kotlin.jvm.internal.E();
                    C0934k c0934k = this.f4351x;
                    this.f4344q = aVarB;
                    this.f4345r = a10;
                    this.f4346s = e10;
                    this.f4347t = e10;
                    this.f4350w = 1;
                    obj = c0934k.y(true, this);
                    if (obj != objE) {
                        e11 = e10;
                    }
                    return objE;
                }
                if (i11 == 1) {
                    e10 = (kotlin.jvm.internal.E) this.f4347t;
                    e11 = (kotlin.jvm.internal.E) this.f4346s;
                    a10 = (kotlin.jvm.internal.A) this.f4345r;
                    aVarB = (O8.a) this.f4344q;
                    p079h8.r.b(obj);
                } else {
                    if (i11 == 2) {
                        it = (Iterator) this.f4348u;
                        aVar3 = (a) this.f4347t;
                        e12 = (kotlin.jvm.internal.E) this.f4346s;
                        a12 = (kotlin.jvm.internal.A) this.f4345r;
                        aVar2 = (O8.a) this.f4344q;
                        p079h8.r.b(obj);
                        while (it.hasNext()) {
                            pVar = (p219v8.p) it.next();
                            this.f4344q = aVar2;
                            this.f4345r = a12;
                            this.f4346s = e12;
                            this.f4347t = aVar3;
                            this.f4348u = it;
                            this.f4350w = 2;
                            if (pVar.invoke(aVar3, this) == objE) {
                                return objE;
                            }
                        }
                        e11 = e12;
                        a11 = a12;
                        aVar = aVar2;
                        this.f4352y.f4338c = null;
                        this.f4344q = a11;
                        this.f4345r = e11;
                        this.f4346s = aVar;
                        this.f4347t = null;
                        this.f4348u = null;
                        this.f4350w = 3;
                        if (aVar.c(null, this) != objE) {
                            e13 = e11;
                            a11.f22775q = true;
                            p079h8.A a13 = p079h8.A.f21846a;
                            aVar.b(null);
                            obj2 = e13.f22779q;
                            if (obj2 != null) {
                            }
                            L0.t tVarR = this.f4351x.r();
                            this.f4344q = obj2;
                            this.f4345r = null;
                            this.f4346s = null;
                            this.f4349v = iHashCode;
                            this.f4350w = 4;
                            objB = tVarR.b(this);
                            if (objB != objE) {
                                obj = objB;
                                obj3 = obj2;
                                i10 = iHashCode;
                            }
                        }
                        return objE;
                    }
                    if (i11 == 3) {
                        aVar = (O8.a) this.f4346s;
                        e13 = (kotlin.jvm.internal.E) this.f4345r;
                        a11 = (kotlin.jvm.internal.A) this.f4344q;
                        p079h8.r.b(obj);
                        try {
                            a11.f22775q = true;
                            p079h8.A a14 = p079h8.A.f21846a;
                            aVar.b(null);
                            obj2 = e13.f22779q;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            L0.t tVarR2 = this.f4351x.r();
                            this.f4344q = obj2;
                            this.f4345r = null;
                            this.f4346s = null;
                            this.f4349v = iHashCode;
                            this.f4350w = 4;
                            objB = tVarR2.b(this);
                            if (objB != objE) {
                                obj = objB;
                                obj3 = obj2;
                                i10 = iHashCode;
                            }
                            return objE;
                        } catch (Throwable th) {
                            aVar.b(null);
                            throw th;
                        }
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f4349v;
                    obj3 = this.f4344q;
                    p079h8.r.b(obj);
                }
                return new C0929f(obj3, i10, ((Number) obj).intValue());
                e10.f22779q = ((C0929f) obj).c();
                a aVar4 = new a(aVarB, a10, e11, this.f4351x);
                List list = this.f4352y.f4338c;
                if (list != null) {
                    it = list.iterator();
                    aVar2 = aVarB;
                    a12 = a10;
                    e12 = e11;
                    aVar3 = aVar4;
                    while (it.hasNext()) {
                        pVar = (p219v8.p) it.next();
                        this.f4344q = aVar2;
                        this.f4345r = a12;
                        this.f4346s = e12;
                        this.f4347t = aVar3;
                        this.f4348u = it;
                        this.f4350w = 2;
                        if (pVar.invoke(aVar3, this) == objE) {
                            return objE;
                        }
                    }
                    e11 = e12;
                    a11 = a12;
                    aVar = aVar2;
                } else {
                    a11 = a10;
                    aVar = aVarB;
                }
                this.f4352y.f4338c = null;
                this.f4344q = a11;
                this.f4345r = e11;
                this.f4346s = aVar;
                this.f4347t = null;
                this.f4348u = null;
                this.f4350w = 3;
                if (aVar.c(null, this) != objE) {
                    e13 = e11;
                    a11.f22775q = true;
                    p079h8.A a15 = p079h8.A.f21846a;
                    aVar.b(null);
                    obj2 = e13.f22779q;
                    if (obj2 != null) {
                    }
                    L0.t tVarR3 = this.f4351x.r();
                    this.f4344q = obj2;
                    this.f4345r = null;
                    this.f4346s = null;
                    this.f4349v = iHashCode;
                    this.f4350w = 4;
                    objB = tVarR3.b(this);
                    if (objB != objE) {
                        obj = objB;
                        obj3 = obj2;
                        i10 = iHashCode;
                        return new C0929f(obj3, i10, ((Number) obj).intValue());
                    }
                }
                return objE;
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object f(p129m8.e eVar) {
                return ((C0148b) create(eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        public b(C0934k c0934k, List initTasksList) {
            kotlin.jvm.internal.n.h(initTasksList, "initTasksList");
            this.f4339d = c0934k;
            this.f4338c = AbstractC1444s.r0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            if (r7 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        
            if (r7 == r1) goto L27;
         */
        @Override // L0.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object b(p129m8.e r7) throws L0.C0927d {
            /*
                r6 = this;
                boolean r0 = r7 instanceof L0.C0934k.b.a
                if (r0 == 0) goto L13
                r0 = r7
                L0.k$b$a r0 = (L0.C0934k.b.a) r0
                int r1 = r0.f4343t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4343t = r1
                goto L18
            L13:
                L0.k$b$a r0 = new L0.k$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f4341r
                java.lang.Object r1 = p139n8.b.e()
                int r2 = r0.f4343t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.f4340q
                L0.k$b r6 = (L0.C0934k.b) r6
                p079h8.r.b(r7)
                goto L6a
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                java.lang.Object r6 = r0.f4340q
                L0.k$b r6 = (L0.C0934k.b) r6
                p079h8.r.b(r7)
                goto L7b
            L40:
                p079h8.r.b(r7)
                java.util.List r7 = r6.f4338c
                if (r7 == 0) goto L6d
                kotlin.jvm.internal.n.e(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6d
            L51:
                L0.k r7 = r6.f4339d
                L0.t r7 = L0.C0934k.c(r7)
                L0.k$b$b r2 = new L0.k$b$b
                L0.k r4 = r6.f4339d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f4340q = r6
                r0.f4343t = r3
                java.lang.Object r7 = r7.d(r2, r0)
                if (r7 != r1) goto L6a
                goto L7a
            L6a:
                L0.f r7 = (L0.C0929f) r7
                goto L7d
            L6d:
                L0.k r7 = r6.f4339d
                r0.f4340q = r6
                r0.f4343t = r4
                r2 = 0
                java.lang.Object r7 = L0.C0934k.n(r7, r2, r0)
                if (r7 != r1) goto L7b
            L7a:
                return r1
            L7b:
                L0.f r7 = (L0.C0929f) r7
            L7d:
                L0.k r6 = r6.f4339d
                L0.l r6 = L0.C0934k.d(r6)
                r6.c(r7)
                h8.A r6 = p079h8.A.f21846a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.C0934k.b.b(m8.e):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: L0.k$c */
    static final class c extends kotlin.jvm.internal.o implements p219v8.a {
        c() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L0.t invoke() {
            return C0934k.this.s().c();
        }
    }

    /* JADX INFO: renamed from: L0.k$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4366q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4367r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f4368s;

        /* JADX INFO: renamed from: L0.k$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f4370q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C0934k f4371r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C0934k c0934k, p129m8.e eVar) {
                super(2, eVar);
                this.f4371r = c0934k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f4371r, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f4370q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    C0934k c0934k = this.f4371r;
                    this.f4370q = 1;
                    if (c0934k.u(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                return p079h8.A.f21846a;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                return ((a) create(interfaceC0881g, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: L0.k$d$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f4372q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f4373r;

            b(p129m8.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                b bVar = new b(eVar);
                bVar.f4373r = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f4372q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((D) this.f4373r) instanceof L0.r));
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, p129m8.e eVar) {
                return ((b) create(d10, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: L0.k$d$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f4374q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f4375r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ D f4376s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(D d10, p129m8.e eVar) {
                super(2, eVar);
                this.f4376s = d10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                c cVar = new c(this.f4376s, eVar);
                cVar.f4375r = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f4374q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                D d10 = (D) this.f4375r;
                return kotlin.coroutines.jvm.internal.b.a((d10 instanceof C0929f) && d10.a() <= this.f4376s.a());
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, p129m8.e eVar) {
                return ((c) create(d10, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: L0.k$d$d, reason: collision with other inner class name */
        static final class C0150d extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f4377q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C0934k f4378r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0150d(C0934k c0934k, p129m8.e eVar) {
                super(3, eVar);
                this.f4378r = c0934k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f4377q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    C0934k c0934k = this.f4378r;
                    this.f4377q = 1;
                    if (c0934k.p(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                return p079h8.A.f21846a;
            }

            @Override // p219v8.q
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object e(InterfaceC0881g interfaceC0881g, Throwable th, p129m8.e eVar) {
                return new C0150d(this.f4378r, eVar).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: L0.k$d$e */
        public static final class e implements InterfaceC0880f {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f4379q;

            /* JADX INFO: renamed from: L0.k$d$e$a */
            public static final class a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ InterfaceC0881g f4380q;

                /* JADX INFO: renamed from: L0.k$d$e$a$a, reason: collision with other inner class name */
                public static final class C0151a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    /* synthetic */ Object f4381q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    int f4382r;

                    public C0151a(p129m8.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f4381q = obj;
                        this.f4382r |= Integer.MIN_VALUE;
                        return a.this.b(null, this);
                    }
                }

                public a(InterfaceC0881g interfaceC0881g) {
                    this.f4380q = interfaceC0881g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // I8.InterfaceC0881g
                public final Object b(Object obj, p129m8.e eVar) throws Throwable {
                    C0151a c0151a;
                    if (eVar instanceof C0151a) {
                        c0151a = (C0151a) eVar;
                        int i10 = c0151a.f4382r;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0151a.f4382r = i10 - Integer.MIN_VALUE;
                        } else {
                            c0151a = new C0151a(eVar);
                        }
                    } else {
                        c0151a = new C0151a(eVar);
                    }
                    Object obj2 = c0151a.f4381q;
                    Object objE = p139n8.b.e();
                    int i11 = c0151a.f4382r;
                    if (i11 == 0) {
                        p079h8.r.b(obj2);
                        InterfaceC0881g interfaceC0881g = this.f4380q;
                        D d10 = (D) obj;
                        if (d10 instanceof L0.x) {
                            throw ((L0.x) d10).b();
                        }
                        if (!(d10 instanceof C0929f)) {
                            if (d10 instanceof L0.r ? true : d10 instanceof H) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new p079h8.m();
                        }
                        Object objC = ((C0929f) d10).c();
                        c0151a.f4382r = 1;
                        if (interfaceC0881g.b(objC, c0151a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj2);
                    }
                    return p079h8.A.f21846a;
                }
            }

            public e(InterfaceC0880f interfaceC0880f) {
                this.f4379q = interfaceC0880f;
            }

            @Override // I8.InterfaceC0880f
            public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                Object objA = this.f4379q.a(new a(interfaceC0881g), eVar);
                return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
            }
        }

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            d dVar = C0934k.this.new d(eVar);
            dVar.f4368s = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (I8.AbstractC0882h.t(r1, r9, r8) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.C0934k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((d) create(interfaceC0881g, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4384q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4385r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4386s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4388u;

        e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4386s = obj;
            this.f4388u |= Integer.MIN_VALUE;
            return C0934k.this.p(this);
        }
    }

    /* JADX INFO: renamed from: L0.k$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4389q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f4390r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p219v8.l lVar, p129m8.e eVar) {
            super(1, eVar);
            this.f4390r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return new f(this.f4390r, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f4389q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return obj;
            }
            p079h8.r.b(obj);
            p219v8.l lVar = this.f4390r;
            this.f4389q = 1;
            Object objF = lVar.f(this);
            return objF == objE ? objE : objF;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((f) create(eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4391q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4392r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f4393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4394t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f4396v;

        g(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4394t = obj;
            this.f4396v |= Integer.MIN_VALUE;
            return C0934k.this.t(null, this);
        }
    }

    /* JADX INFO: renamed from: L0.k$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4397q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4398r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4399s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4401u;

        h(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4399s = obj;
            this.f4401u |= Integer.MIN_VALUE;
            return C0934k.this.u(this);
        }
    }

    /* JADX INFO: renamed from: L0.k$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4402q;

        /* JADX INFO: renamed from: L0.k$i$a */
        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ C0934k f4404q;

            a(C0934k c0934k) {
                this.f4404q = c0934k;
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(p079h8.A a10, p129m8.e eVar) {
                Object objW;
                return ((this.f4404q.f4333h.a() instanceof L0.r) || (objW = this.f4404q.w(true, eVar)) != p139n8.b.e()) ? p079h8.A.f21846a : objW;
            }
        }

        i(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return C0934k.this.new i(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.a(r1, r4) == r0) goto L15;
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
                int r1 = r4.f4402q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                p079h8.r.b(r5)
                goto L30
            L1e:
                p079h8.r.b(r5)
                L0.k r5 = L0.C0934k.this
                L0.k$b r5 = L0.C0934k.e(r5)
                r4.f4402q = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                L0.k r5 = L0.C0934k.this
                L0.t r5 = L0.C0934k.c(r5)
                I8.f r5 = r5.e()
                I8.f r5 = I8.AbstractC0882h.m(r5)
                L0.k$i$a r1 = new L0.k$i$a
                L0.k r3 = L0.C0934k.this
                r1.<init>(r3)
                r4.f4402q = r2
                java.lang.Object r4 = r5.a(r1, r4)
                if (r4 != r0) goto L4e
            L4d:
                return r0
            L4e:
                h8.A r4 = p079h8.A.f21846a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.C0934k.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: L0.k$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4405q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4406r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4407s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4409u;

        j(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4407s = obj;
            this.f4409u |= Integer.MIN_VALUE;
            return C0934k.this.v(this);
        }
    }

    /* JADX INFO: renamed from: L0.k$k, reason: collision with other inner class name */
    static final class C0152k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4410q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4411r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f4412s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4413t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f4415v;

        C0152k(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4413t = obj;
            this.f4415v |= Integer.MIN_VALUE;
            return C0934k.this.w(false, this);
        }
    }

    /* JADX INFO: renamed from: L0.k$l */
    static final class l extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4416q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4417r;

        l(p129m8.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return C0934k.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            D xVar;
            Object objE = p139n8.b.e();
            int i10 = this.f4417r;
            try {
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    C0934k c0934k = C0934k.this;
                    this.f4417r = 1;
                    obj = c0934k.y(true, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.f4416q;
                        p079h8.r.b(obj);
                        xVar = new L0.x(th, ((Number) obj).intValue());
                        return p079h8.v.a(xVar, kotlin.coroutines.jvm.internal.b.a(true));
                    }
                    p079h8.r.b(obj);
                }
                xVar = (D) obj;
            } catch (Throwable th2) {
                L0.t tVarR = C0934k.this.r();
                this.f4416q = th2;
                this.f4417r = 2;
                Object objB = tVarR.b(this);
                if (objB != objE) {
                    obj = objB;
                    th = th2;
                }
                return objE;
            }
            return p079h8.v.a(xVar, kotlin.coroutines.jvm.internal.b.a(true));
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((l) create(eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4419q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4420r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ boolean f4421s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f4423u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i10, p129m8.e eVar) {
            super(2, eVar);
            this.f4423u = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            m mVar = C0934k.this.new m(this.f4423u, eVar);
            mVar.f4421s = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            Throwable th;
            boolean z9;
            D xVar;
            ?? r9;
            ?? r10;
            Object objE = p139n8.b.e();
            ?? r11 = this.f4420r;
            try {
                if (r11 == 0) {
                    p079h8.r.b(obj);
                    boolean z10 = this.f4421s;
                    C0934k c0934k = C0934k.this;
                    this.f4421s = z10;
                    this.f4420r = 1;
                    obj = c0934k.y(z10, this);
                    r11 = z10;
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (r11 != 1) {
                        if (r11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z9 = this.f4421s;
                        th = (Throwable) this.f4419q;
                        p079h8.r.b(obj);
                        iIntValue = ((Number) obj).intValue();
                        r10 = z9;
                        xVar = new L0.x(th, iIntValue);
                        r9 = r10;
                        return p079h8.v.a(xVar, kotlin.coroutines.jvm.internal.b.a(r9));
                    }
                    boolean z11 = this.f4421s;
                    p079h8.r.b(obj);
                    r11 = z11;
                }
                xVar = (D) obj;
                r9 = r11;
            } catch (Throwable th2) {
                if (r11 != 0) {
                    L0.t tVarR = C0934k.this.r();
                    this.f4419q = th2;
                    this.f4421s = r11;
                    this.f4420r = 2;
                    Object objB = tVarR.b(this);
                    if (objB != objE) {
                        obj = objB;
                        th = th2;
                        z9 = r11 == true ? 1 : 0;
                    }
                    return objE;
                }
                iIntValue = this.f4423u;
                th = th2;
                r10 = r11;
            }
            return p079h8.v.a(xVar, kotlin.coroutines.jvm.internal.b.a(r9));
        }

        public final Object s(boolean z9, p129m8.e eVar) {
            return ((m) create(Boolean.valueOf(z9), eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$n */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4424q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4425r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f4426s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4427t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f4428u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f4429v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f4430w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f4432y;

        n(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4430w = obj;
            this.f4432y |= Integer.MIN_VALUE;
            return C0934k.this.y(false, this);
        }
    }

    /* JADX INFO: renamed from: L0.k$o */
    static final class o extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4433q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4434r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ boolean f4435s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f4437u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i10, p129m8.e eVar) {
            super(2, eVar);
            this.f4437u = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            o oVar = C0934k.this.new o(this.f4437u, eVar);
            oVar.f4435s = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (p129m8.e) obj2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z9;
            int iIntValue;
            Object obj2;
            int iHashCode;
            Object objE = p139n8.b.e();
            int i10 = this.f4434r;
            if (i10 == 0) {
                p079h8.r.b(obj);
                z9 = this.f4435s;
                C0934k c0934k = C0934k.this;
                this.f4435s = z9;
                this.f4434r = 1;
                obj = c0934k.x(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                z9 = this.f4435s;
                p079h8.r.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f4433q;
                p079h8.r.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C0929f(obj2, iHashCode, iIntValue);
            if (z9) {
                L0.t tVarR = C0934k.this.r();
                this.f4433q = obj;
                this.f4434r = 2;
                Object objB = tVarR.b(this);
                if (objB != objE) {
                    Object obj3 = obj;
                    obj = objB;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                }
                return objE;
            }
            Object obj4 = obj;
            iIntValue = this.f4437u;
            obj2 = obj4;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C0929f(obj2, iHashCode, iIntValue);
        }

        public final Object s(boolean z9, p129m8.e eVar) {
            return ((o) create(Boolean.valueOf(z9), eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$p */
    static final class p extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4438q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4439r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f4440s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C0934k f4441t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.C f4442u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(kotlin.jvm.internal.E e10, C0934k c0934k, kotlin.jvm.internal.C c10, p129m8.e eVar) {
            super(1, eVar);
            this.f4440s = e10;
            this.f4441t = c0934k;
            this.f4442u = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return new p(this.f4440s, this.f4441t, this.f4442u, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.C c10;
            kotlin.jvm.internal.E e10;
            kotlin.jvm.internal.C c11;
            Object objE = p139n8.b.e();
            int i10 = this.f4439r;
            try {
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    e10 = this.f4440s;
                    C0934k c0934k = this.f4441t;
                    this.f4438q = e10;
                    this.f4439r = 1;
                    obj = c0934k.x(this);
                    if (obj == objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    e10 = (kotlin.jvm.internal.E) this.f4438q;
                    p079h8.r.b(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c10 = (kotlin.jvm.internal.C) this.f4438q;
                        p079h8.r.b(obj);
                        c10.f22777q = ((Number) obj).intValue();
                        return p079h8.A.f21846a;
                    }
                    c11 = (kotlin.jvm.internal.C) this.f4438q;
                    p079h8.r.b(obj);
                }
                c11.f22777q = ((Number) obj).intValue();
                return p079h8.A.f21846a;
                e10.f22779q = obj;
                c11 = this.f4442u;
                L0.t tVarR = this.f4441t.r();
                this.f4438q = c11;
                this.f4439r = 2;
                obj = tVarR.b(this);
                if (obj == objE) {
                    return objE;
                }
                c11.f22777q = ((Number) obj).intValue();
            } catch (C0927d unused) {
                kotlin.jvm.internal.C c12 = this.f4442u;
                C0934k c0934k2 = this.f4441t;
                Object obj2 = this.f4440s.f22779q;
                this.f4438q = c12;
                this.f4439r = 3;
                Object objB = c0934k2.B(obj2, true, this);
                if (objB != objE) {
                    obj = objB;
                    c10 = c12;
                }
                return objE;
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((p) create(eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4443q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f4445s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f4445s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return C0934k.this.new q(this.f4445s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((q) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        
            if (r5 == r0) goto L20;
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
                int r1 = r4.f4443q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L52
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                p079h8.r.b(r5)     // Catch: java.lang.Throwable -> L55
                goto L45
            L1e:
                p079h8.r.b(r5)
                L0.k r5 = L0.C0934k.this
                L0.l r5 = L0.C0934k.d(r5)
                L0.D r5 = r5.a()
                boolean r5 = r5 instanceof L0.r
                if (r5 == 0) goto L3a
                L0.k r4 = L0.C0934k.this
                L0.l r4 = L0.C0934k.d(r4)
                L0.D r4 = r4.a()
                return r4
            L3a:
                L0.k r5 = L0.C0934k.this     // Catch: java.lang.Throwable -> L55
                r4.f4443q = r3     // Catch: java.lang.Throwable -> L55
                java.lang.Object r5 = L0.C0934k.k(r5, r4)     // Catch: java.lang.Throwable -> L55
                if (r5 != r0) goto L45
                goto L51
            L45:
                L0.k r5 = L0.C0934k.this
                boolean r1 = r4.f4445s
                r4.f4443q = r2
                java.lang.Object r5 = L0.C0934k.l(r5, r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                L0.D r5 = (L0.D) r5
                return r5
            L55:
                r4 = move-exception
                L0.x r5 = new L0.x
                r0 = -1
                r5.<init>(r4, r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.C0934k.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: L0.k$r */
    static final class r extends kotlin.jvm.internal.o implements p219v8.a {
        r() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F invoke() {
            return C0934k.this.f4326a.a();
        }
    }

    /* JADX INFO: renamed from: L0.k$s */
    static final class s extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4447q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4448r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p129m8.i f4450t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p219v8.p f4451u;

        /* JADX INFO: renamed from: L0.k$s$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f4452q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p219v8.p f4453r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ C0929f f4454s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p219v8.p pVar, C0929f c0929f, p129m8.e eVar) {
                super(2, eVar);
                this.f4453r = pVar;
                this.f4454s = c0929f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f4453r, this.f4454s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f4452q;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                    return obj;
                }
                p079h8.r.b(obj);
                p219v8.p pVar = this.f4453r;
                Object objC = this.f4454s.c();
                this.f4452q = 1;
                Object objInvoke = pVar.invoke(objC, this);
                return objInvoke == objE ? objE : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(p129m8.i iVar, p219v8.p pVar, p129m8.e eVar) {
            super(1, eVar);
            this.f4450t = iVar;
            this.f4451u = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return C0934k.this.new s(this.f4450t, this.f4451u, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws C0927d {
            C0929f c0929f;
            C0934k c0934k;
            Object objE = p139n8.b.e();
            int i10 = this.f4448r;
            if (i10 == 0) {
                p079h8.r.b(obj);
                C0934k c0934k2 = C0934k.this;
                this.f4448r = 1;
                obj = c0934k2.y(true, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                p079h8.r.b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f4447q;
                    p079h8.r.b(obj);
                    return obj2;
                }
                c0929f = (C0929f) this.f4447q;
                p079h8.r.b(obj);
            }
            c0929f.b();
            if (!kotlin.jvm.internal.n.d(c0929f.c(), obj)) {
                c0934k = C0934k.this;
                this.f4447q = obj;
                this.f4448r = 3;
                if (c0934k.B(obj, true, this) == objE) {
                    return objE;
                }
            }
            return obj;
            c0929f = (C0929f) obj;
            p129m8.i iVar = this.f4450t;
            a aVar = new a(this.f4451u, c0929f, null);
            this.f4447q = c0929f;
            this.f4448r = 2;
            obj = AbstractC0812g.g(iVar, aVar, this);
            if (obj != objE) {
                c0929f.b();
                if (!kotlin.jvm.internal.n.d(c0929f.c(), obj)) {
                    c0934k = C0934k.this;
                    this.f4447q = obj;
                    this.f4448r = 3;
                    if (c0934k.B(obj, true, this) == objE) {
                    }
                }
                return obj;
            }
            return objE;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((s) create(eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$t */
    static final class t extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4455q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f4456r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.p f4458t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(p219v8.p pVar, p129m8.e eVar) {
            super(2, eVar);
            this.f4458t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            t tVar = C0934k.this.new t(this.f4458t, eVar);
            tVar.f4456r = obj;
            return tVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((t) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = p139n8.b.e();
            int i10 = this.f4455q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return obj;
            }
            p079h8.r.b(obj);
            L l9 = (L) this.f4456r;
            InterfaceC0841v interfaceC0841vB = AbstractC0845x.b(null, 1, null);
            C0934k.this.f4337l.e(new L0.w.a(this.f4458t, interfaceC0841vB, C0934k.this.f4333h.a(), l9.w0()));
            this.f4455q = 1;
            Object objP0 = interfaceC0841vB.P0(this);
            return objP0 == objE ? objE : objP0;
        }
    }

    /* JADX INFO: renamed from: L0.k$u */
    static final class u extends kotlin.jvm.internal.o implements p219v8.l {
        u() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                C0934k.this.f4333h.c(new L0.r(th));
            }
            if (C0934k.this.f4335j.a()) {
                C0934k.this.s().close();
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: L0.k$v */
    static final class v extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final v f4460r = new v();

        v() {
            super(2);
        }

        public final void a(L0.w.a msg, Throwable th) {
            kotlin.jvm.internal.n.h(msg, "msg");
            InterfaceC0841v interfaceC0841vA = msg.a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC0841vA.A0(th);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((L0.w.a) obj, (Throwable) obj2);
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: L0.k$w */
    static final class w extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4461q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4462r;

        w(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            w wVar = C0934k.this.new w(eVar);
            wVar.f4462r = obj;
            return wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f4461q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                L0.w.a aVar = (L0.w.a) this.f4462r;
                C0934k c0934k = C0934k.this;
                this.f4461q = 1;
                if (c0934k.t(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.w.a aVar, p129m8.e eVar) {
            return ((w) create(aVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L0.k$x */
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4464q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4465r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4467t;

        x(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4465r = obj;
            this.f4467t |= Integer.MIN_VALUE;
            return C0934k.this.B(null, false, this);
        }
    }

    /* JADX INFO: renamed from: L0.k$y */
    static final class y extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4468q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4469r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f4470s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.C f4471t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ C0934k f4472u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Object f4473v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f4474w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(kotlin.jvm.internal.C c10, C0934k c0934k, Object obj, boolean z9, p129m8.e eVar) {
            super(2, eVar);
            this.f4471t = c10;
            this.f4472u = c0934k;
            this.f4473v = obj;
            this.f4474w = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            y yVar = new y(this.f4471t, this.f4472u, this.f4473v, this.f4474w, eVar);
            yVar.f4470s = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.d(r7, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r6.f4469r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                java.lang.Object r1 = r6.f4468q
                kotlin.jvm.internal.C r1 = (kotlin.jvm.internal.C) r1
                java.lang.Object r3 = r6.f4470s
                L0.K r3 = (L0.K) r3
                p079h8.r.b(r7)
                goto L45
            L26:
                p079h8.r.b(r7)
                java.lang.Object r7 = r6.f4470s
                L0.K r7 = (L0.K) r7
                kotlin.jvm.internal.C r1 = r6.f4471t
                L0.k r4 = r6.f4472u
                L0.t r4 = L0.C0934k.c(r4)
                r6.f4470s = r7
                r6.f4468q = r1
                r6.f4469r = r3
                java.lang.Object r3 = r4.a(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f22777q = r7
                java.lang.Object r7 = r6.f4473v
                r1 = 0
                r6.f4470s = r1
                r6.f4468q = r1
                r6.f4469r = r2
                java.lang.Object r7 = r3.d(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f4474w
                if (r7 == 0) goto L7d
                L0.k r7 = r6.f4472u
                L0.l r7 = L0.C0934k.d(r7)
                L0.f r0 = new L0.f
                java.lang.Object r1 = r6.f4473v
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.C r6 = r6.f4471t
                int r6 = r6.f22777q
                r0.<init>(r1, r2, r6)
                r7.c(r0)
            L7d:
                h8.A r6 = p079h8.A.f21846a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.C0934k.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K k9, p129m8.e eVar) {
            return ((y) create(k9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public C0934k(E storage, List initTasksList, InterfaceC0928e corruptionHandler, L scope) {
        kotlin.jvm.internal.n.h(storage, "storage");
        kotlin.jvm.internal.n.h(initTasksList, "initTasksList");
        kotlin.jvm.internal.n.h(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.n.h(scope, "scope");
        this.f4326a = storage;
        this.f4327b = corruptionHandler;
        this.f4328c = scope;
        this.f4329d = AbstractC0882h.A(new d(null));
        this.f4330e = O8.g.b(false, 1, null);
        this.f4333h = new L0.l();
        this.f4334i = new b(this, initTasksList);
        this.f4335j = p079h8.i.b(new r());
        this.f4336k = p079h8.i.b(new c());
        this.f4337l = new B(scope, new u(), v.f4460r, new w(null));
    }

    private final Object A(p219v8.p pVar, p129m8.i iVar, p129m8.e eVar) {
        return r().d(new s(iVar, pVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(p129m8.e eVar) {
        e eVar2;
        O8.a aVar;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i10 = eVar2.f4388u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f4388u = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f4386s;
        Object objE = p139n8.b.e();
        int i11 = eVar2.f4388u;
        if (i11 == 0) {
            p079h8.r.b(obj);
            aVar = this.f4330e;
            eVar2.f4384q = this;
            eVar2.f4385r = aVar;
            eVar2.f4388u = 1;
            if (aVar.c(null, eVar2) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O8.a aVar2 = (O8.a) eVar2.f4385r;
            C0934k c0934k = (C0934k) eVar2.f4384q;
            p079h8.r.b(obj);
            aVar = aVar2;
            this = c0934k;
        }
        try {
            int i12 = this.f4331f - 1;
            this.f4331f = i12;
            if (i12 == 0) {
                InterfaceC0846x0 interfaceC0846x0 = this.f4332g;
                if (interfaceC0846x0 != null) {
                    InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
                }
                this.f4332g = null;
            }
            p079h8.A a10 = p079h8.A.f21846a;
            return p079h8.A.f21846a;
        } finally {
            aVar.b(null);
        }
    }

    private final Object q(boolean z9, p219v8.l lVar, p129m8.e eVar) {
        return z9 ? lVar.f(eVar) : r().d(new f(lVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L0.t r() {
        return (L0.t) this.f4336k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [L0.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [L0.k] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [F8.v] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(L0.w.a r9, p129m8.e r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0934k.t(L0.w$a, m8.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(p129m8.e eVar) {
        h hVar;
        O8.a aVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i10 = hVar.f4401u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f4401u = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f4399s;
        Object objE = p139n8.b.e();
        int i11 = hVar.f4401u;
        if (i11 == 0) {
            p079h8.r.b(obj);
            aVar = this.f4330e;
            hVar.f4397q = this;
            hVar.f4398r = aVar;
            hVar.f4401u = 1;
            if (aVar.c(null, hVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O8.a aVar2 = (O8.a) hVar.f4398r;
            C0934k c0934k = (C0934k) hVar.f4397q;
            p079h8.r.b(obj);
            aVar = aVar2;
            this = c0934k;
        }
        try {
            int i12 = this.f4331f + 1;
            this.f4331f = i12;
            if (i12 == 1) {
                this.f4332g = AbstractC0816i.d(this.f4328c, null, null, this.new i(null), 3, null);
            }
            p079h8.A a10 = p079h8.A.f21846a;
            return p079h8.A.f21846a;
        } finally {
            aVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r2.c(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(p129m8.e r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof L0.C0934k.j
            if (r0 == 0) goto L13
            r0 = r7
            L0.k$j r0 = (L0.C0934k.j) r0
            int r1 = r0.f4409u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4409u = r1
            goto L18
        L13:
            L0.k$j r0 = new L0.k$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4407s
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f4409u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r6 = r0.f4406r
            java.lang.Object r0 = r0.f4405q
            L0.k r0 = (L0.C0934k) r0
            p079h8.r.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L6b
        L32:
            r7 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f4405q
            L0.k r6 = (L0.C0934k) r6
            p079h8.r.b(r7)
            goto L56
        L44:
            p079h8.r.b(r7)
            L0.t r7 = r6.r()
            r0.f4405q = r6
            r0.f4409u = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L56
            goto L6a
        L56:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            L0.k$b r2 = r6.f4334i     // Catch: java.lang.Throwable -> L6e
            r0.f4405q = r6     // Catch: java.lang.Throwable -> L6e
            r0.f4406r = r7     // Catch: java.lang.Throwable -> L6e
            r0.f4409u = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r2.c(r0)     // Catch: java.lang.Throwable -> L6e
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            h8.A r6 = p079h8.A.f21846a
            return r6
        L6e:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L73:
            L0.l r0 = r0.f4333h
            L0.x r1 = new L0.x
            r1.<init>(r7, r6)
            r0.c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0934k.v(m8.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(boolean z9, p129m8.e eVar) {
        C0152k c0152k;
        C0934k c0934k;
        D d10;
        C0934k c0934k2;
        p079h8.o oVar;
        D d11;
        if (eVar instanceof C0152k) {
            c0152k = (C0152k) eVar;
            int i10 = c0152k.f4415v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0152k.f4415v = i10 - Integer.MIN_VALUE;
            } else {
                c0152k = new C0152k(eVar);
            }
        } else {
            c0152k = new C0152k(eVar);
        }
        Object objC = c0152k.f4413t;
        Object objE = p139n8.b.e();
        int i11 = c0152k.f4415v;
        if (i11 == 0) {
            p079h8.r.b(objC);
            D dA = this.f4333h.a();
            if (dA instanceof H) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            L0.t tVarR = r();
            c0152k.f4410q = this;
            c0152k.f4411r = dA;
            c0152k.f4412s = z9;
            c0152k.f4415v = 1;
            Object objB = tVarR.b(c0152k);
            if (objB != objE) {
                c0934k = this;
                d10 = dA;
                objC = objB;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                c0934k2 = (C0934k) c0152k.f4410q;
                p079h8.r.b(objC);
                oVar = (p079h8.o) objC;
                d11 = (D) oVar.a();
                if (((Boolean) oVar.b()).booleanValue()) {
                    c0934k2.f4333h.c(d11);
                }
                return d11;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0934k2 = (C0934k) c0152k.f4410q;
            p079h8.r.b(objC);
            oVar = (p079h8.o) objC;
            d11 = (D) oVar.a();
            if (((Boolean) oVar.b()).booleanValue()) {
                c0934k2.f4333h.c(d11);
            }
            return d11;
        }
        z9 = c0152k.f4412s;
        d10 = (D) c0152k.f4411r;
        c0934k = (C0934k) c0152k.f4410q;
        p079h8.r.b(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z10 = d10 instanceof C0929f;
        int iA = z10 ? d10.a() : -1;
        if (z10 && iIntValue == iA) {
            return d10;
        }
        if (z9) {
            L0.t tVarR2 = c0934k.r();
            l lVar = c0934k.new l(null);
            c0152k.f4410q = c0934k;
            c0152k.f4411r = null;
            c0152k.f4415v = 2;
            objC = tVarR2.d(lVar, c0152k);
            if (objC != objE) {
                c0934k2 = c0934k;
                oVar = (p079h8.o) objC;
                d11 = (D) oVar.a();
                if (((Boolean) oVar.b()).booleanValue()) {
                    c0934k2.f4333h.c(d11);
                }
                return d11;
            }
        } else {
            L0.t tVarR3 = c0934k.r();
            m mVar = c0934k.new m(iA, null);
            c0152k.f4410q = c0934k;
            c0152k.f4411r = null;
            c0152k.f4415v = 3;
            objC = tVarR3.c(mVar, c0152k);
            if (objC != objE) {
                c0934k2 = c0934k;
                oVar = (p079h8.o) objC;
                d11 = (D) oVar.a();
                if (((Boolean) oVar.b()).booleanValue()) {
                    c0934k2.f4333h.c(d11);
                }
                return d11;
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(p129m8.e eVar) {
        return G.a(s(), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[Catch: d -> 0x0064, TryCatch #1 {d -> 0x0064, blocks: (B:19:0x005f, B:54:0x0100, B:24:0x006d, B:51:0x00e3, B:32:0x008a, B:40:0x00a3, B:42:0x00a9, B:36:0x0093, B:48:0x00d1), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(boolean z9, p129m8.e eVar) throws C0927d {
        n nVar;
        kotlin.jvm.internal.E e10;
        C0927d c0927d;
        C0934k c0934k;
        boolean z10;
        kotlin.jvm.internal.E e11;
        kotlin.jvm.internal.C c10;
        C0927d c0927d2;
        p pVar;
        kotlin.jvm.internal.C c11;
        kotlin.jvm.internal.E e12;
        int iHashCode;
        Object objB;
        C0934k c0934k2;
        int i10;
        Object obj;
        if (eVar instanceof n) {
            nVar = (n) eVar;
            int i11 = nVar.f4432y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f4432y = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(eVar);
            }
        } else {
            nVar = new n(eVar);
        }
        Object objB2 = nVar.f4430w;
        Object objE = p139n8.b.e();
        try {
            switch (nVar.f4432y) {
                case 0:
                    p079h8.r.b(objB2);
                    if (z9) {
                        nVar.f4424q = this;
                        nVar.f4428u = z9;
                        nVar.f4432y = 1;
                        objB2 = x(nVar);
                        if (objB2 != objE) {
                            if (objB2 != null) {
                                iHashCode = objB2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            L0.t tVarR = this.r();
                            nVar.f4424q = this;
                            nVar.f4425r = objB2;
                            nVar.f4428u = z9;
                            nVar.f4429v = iHashCode;
                            nVar.f4432y = 2;
                            objB = tVarR.b(nVar);
                            if (objB != objE) {
                                c0934k2 = this;
                                i10 = iHashCode;
                                obj = objB2;
                                objB2 = objB;
                                return new C0929f(obj, i10, ((Number) objB2).intValue());
                            }
                        }
                    } else {
                        L0.t tVarR2 = r();
                        nVar.f4424q = this;
                        nVar.f4428u = z9;
                        nVar.f4432y = 3;
                        objB2 = tVarR2.b(nVar);
                        if (objB2 != objE) {
                            int iIntValue = ((Number) objB2).intValue();
                            L0.t tVarR3 = this.r();
                            o oVar = this.new o(iIntValue, null);
                            nVar.f4424q = this;
                            nVar.f4428u = z9;
                            nVar.f4432y = 4;
                            objB2 = tVarR3.c(oVar, nVar);
                            if (objB2 == objE) {
                            }
                            return (C0929f) objB2;
                        }
                    }
                    return objE;
                case 1:
                    z9 = nVar.f4428u;
                    this = (C0934k) nVar.f4424q;
                    p079h8.r.b(objB2);
                    if (objB2 != null) {
                        iHashCode = objB2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    L0.t tVarR4 = this.r();
                    nVar.f4424q = this;
                    nVar.f4425r = objB2;
                    nVar.f4428u = z9;
                    nVar.f4429v = iHashCode;
                    nVar.f4432y = 2;
                    objB = tVarR4.b(nVar);
                    if (objB != objE) {
                        c0934k2 = this;
                        i10 = iHashCode;
                        obj = objB2;
                        objB2 = objB;
                        return new C0929f(obj, i10, ((Number) objB2).intValue());
                    }
                    return objE;
                case 2:
                    i10 = nVar.f4429v;
                    z9 = nVar.f4428u;
                    obj = nVar.f4425r;
                    c0934k2 = (C0934k) nVar.f4424q;
                    try {
                        p079h8.r.b(objB2);
                        return new C0929f(obj, i10, ((Number) objB2).intValue());
                    } catch (C0927d e13) {
                        e = e13;
                        this = c0934k2;
                        e10 = new kotlin.jvm.internal.E();
                        InterfaceC0928e interfaceC0928e = this.f4327b;
                        nVar.f4424q = this;
                        nVar.f4425r = e;
                        nVar.f4426s = e10;
                        nVar.f4427t = e10;
                        nVar.f4428u = z9;
                        nVar.f4432y = 5;
                        Object objA = interfaceC0928e.a(e, nVar);
                        if (objA != objE) {
                            c0927d = e;
                            objB2 = objA;
                            c0934k = this;
                            z10 = z9;
                            e11 = e10;
                            e11.f22779q = objB2;
                            c10 = new kotlin.jvm.internal.C();
                            try {
                                pVar = new p(e10, c0934k, c10, null);
                                nVar.f4424q = c0927d;
                                nVar.f4425r = e10;
                                nVar.f4426s = c10;
                                nVar.f4427t = null;
                                nVar.f4432y = 6;
                                if (c0934k.q(z10, pVar, nVar) != objE) {
                                    c11 = c10;
                                    e12 = e10;
                                    Object obj2 = e12.f22779q;
                                    return new C0929f(obj2, obj2 != null ? obj2.hashCode() : 0, c11.f22777q);
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0927d2 = c0927d;
                                AbstractC1388c.a(c0927d2, th);
                                throw c0927d2;
                            }
                        }
                        return objE;
                    }
                case 3:
                    z9 = nVar.f4428u;
                    this = (C0934k) nVar.f4424q;
                    p079h8.r.b(objB2);
                    int iIntValue2 = ((Number) objB2).intValue();
                    L0.t tVarR5 = this.r();
                    o oVar2 = this.new o(iIntValue2, null);
                    nVar.f4424q = this;
                    nVar.f4428u = z9;
                    nVar.f4432y = 4;
                    objB2 = tVarR5.c(oVar2, nVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    return (C0929f) objB2;
                case 4:
                    boolean z11 = nVar.f4428u;
                    p079h8.r.b(objB2);
                    return (C0929f) objB2;
                case 5:
                    z10 = nVar.f4428u;
                    e11 = (kotlin.jvm.internal.E) nVar.f4427t;
                    e10 = (kotlin.jvm.internal.E) nVar.f4426s;
                    c0927d = (C0927d) nVar.f4425r;
                    c0934k = (C0934k) nVar.f4424q;
                    p079h8.r.b(objB2);
                    e11.f22779q = objB2;
                    c10 = new kotlin.jvm.internal.C();
                    pVar = new p(e10, c0934k, c10, null);
                    nVar.f4424q = c0927d;
                    nVar.f4425r = e10;
                    nVar.f4426s = c10;
                    nVar.f4427t = null;
                    nVar.f4432y = 6;
                    if (c0934k.q(z10, pVar, nVar) != objE) {
                        c11 = c10;
                        e12 = e10;
                        Object obj3 = e12.f22779q;
                        return new C0929f(obj3, obj3 != null ? obj3.hashCode() : 0, c11.f22777q);
                    }
                    return objE;
                case 6:
                    c11 = (kotlin.jvm.internal.C) nVar.f4426s;
                    e12 = (kotlin.jvm.internal.E) nVar.f4425r;
                    c0927d2 = (C0927d) nVar.f4424q;
                    try {
                        p079h8.r.b(objB2);
                        Object obj4 = e12.f22779q;
                        return new C0929f(obj4, obj4 != null ? obj4.hashCode() : 0, c11.f22777q);
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC1388c.a(c0927d2, th);
                        throw c0927d2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C0927d e14) {
            e = e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(boolean z9, p129m8.e eVar) {
        return AbstractC0812g.g(this.f4328c.w0(), new q(z9, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(Object obj, boolean z9, p129m8.e eVar) {
        x xVar;
        kotlin.jvm.internal.C c10;
        if (eVar instanceof x) {
            xVar = (x) eVar;
            int i10 = xVar.f4467t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f4467t = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(eVar);
            }
        } else {
            xVar = new x(eVar);
        }
        Object obj2 = xVar.f4465r;
        Object objE = p139n8.b.e();
        int i11 = xVar.f4467t;
        if (i11 == 0) {
            p079h8.r.b(obj2);
            kotlin.jvm.internal.C c11 = new kotlin.jvm.internal.C();
            F fS = s();
            y yVar = new y(c11, this, obj, z9, null);
            xVar.f4464q = c11;
            xVar.f4467t = 1;
            if (fS.e(yVar, xVar) == objE) {
                return objE;
            }
            c10 = c11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10 = (kotlin.jvm.internal.C) xVar.f4464q;
            p079h8.r.b(obj2);
        }
        return kotlin.coroutines.jvm.internal.b.c(c10.f22777q);
    }

    @Override // L0.InterfaceC0932i
    public Object a(p219v8.p pVar, p129m8.e eVar) {
        J j9 = (J) eVar.getContext().b(J.a.C0145a.f4302q);
        if (j9 != null) {
            j9.c(this);
        }
        return AbstractC0812g.g(new J(j9, this), new t(pVar, null), eVar);
    }

    @Override // L0.InterfaceC0932i
    public InterfaceC0880f getData() {
        return this.f4329d;
    }

    public final F s() {
        return (F) this.f4335j.getValue();
    }
}
