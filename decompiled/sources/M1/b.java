package M1;

import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.i;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L1.a f4825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f4826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0880f f4827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f4828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0880f f4829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0880f f4830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0880f f4831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0880f f4832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0880f f4833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p079h8.h f4834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC0880f f4835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC0880f f4836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0880f f4837m;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4838q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4839r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f4840s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4841t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f4842u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f4843v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f4844w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f4846y;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4844w = obj;
            this.f4846y |= Integer.MIN_VALUE;
            return b.this.f(null, this);
        }
    }

    /* JADX INFO: renamed from: M1.b$b, reason: collision with other inner class name */
    static final class C0167b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4847q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4848r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4849s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4851u;

        C0167b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4849s = obj;
            this.f4851u |= Integer.MIN_VALUE;
            return b.this.r(null, this);
        }
    }

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4852q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4853q;

            /* JADX INFO: renamed from: M1.b$c$a$a, reason: collision with other inner class name */
            public static final class C0168a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4854q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4855r;

                public C0168a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4854q = obj;
                    this.f4855r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4853q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0168a c0168a;
                if (eVar instanceof C0168a) {
                    c0168a = (C0168a) eVar;
                    int i10 = c0168a.f4855r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0168a.f4855r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0168a = new C0168a(eVar);
                    }
                } else {
                    c0168a = new C0168a(eVar);
                }
                Object obj2 = c0168a.f4854q;
                Object objE = p139n8.b.e();
                int i11 = c0168a.f4855r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4853q;
                    String strB = ((O1.a) obj).b();
                    c0168a.f4855r = 1;
                    if (interfaceC0881g.b(strB, c0168a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public c(InterfaceC0880f interfaceC0880f) {
            this.f4852q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4852q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4857q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4858q;

            /* JADX INFO: renamed from: M1.b$d$a$a, reason: collision with other inner class name */
            public static final class C0169a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4859q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4860r;

                public C0169a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4859q = obj;
                    this.f4860r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4858q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0169a c0169a;
                if (eVar instanceof C0169a) {
                    c0169a = (C0169a) eVar;
                    int i10 = c0169a.f4860r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0169a.f4860r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0169a = new C0169a(eVar);
                    }
                } else {
                    c0169a = new C0169a(eVar);
                }
                Object obj2 = c0169a.f4859q;
                Object objE = p139n8.b.e();
                int i11 = c0169a.f4860r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4858q;
                    String strE = ((O1.a) obj).e();
                    c0169a.f4860r = 1;
                    if (interfaceC0881g.b(strE, c0169a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public d(InterfaceC0880f interfaceC0880f) {
            this.f4857q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4857q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4862q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4863q;

            /* JADX INFO: renamed from: M1.b$e$a$a, reason: collision with other inner class name */
            public static final class C0170a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4864q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4865r;

                public C0170a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4864q = obj;
                    this.f4865r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4863q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0170a c0170a;
                if (eVar instanceof C0170a) {
                    c0170a = (C0170a) eVar;
                    int i10 = c0170a.f4865r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0170a.f4865r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0170a = new C0170a(eVar);
                    }
                } else {
                    c0170a = new C0170a(eVar);
                }
                Object obj2 = c0170a.f4864q;
                Object objE = p139n8.b.e();
                int i11 = c0170a.f4865r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4863q;
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(((O1.a) obj).c());
                    c0170a.f4865r = 1;
                    if (interfaceC0881g.b(numC, c0170a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public e(InterfaceC0880f interfaceC0880f) {
            this.f4862q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4862q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class f implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4867q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4868q;

            /* JADX INFO: renamed from: M1.b$f$a$a, reason: collision with other inner class name */
            public static final class C0171a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4869q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4870r;

                public C0171a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4869q = obj;
                    this.f4870r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4868q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0171a c0171a;
                if (eVar instanceof C0171a) {
                    c0171a = (C0171a) eVar;
                    int i10 = c0171a.f4870r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0171a.f4870r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0171a = new C0171a(eVar);
                    }
                } else {
                    c0171a = new C0171a(eVar);
                }
                Object obj2 = c0171a.f4869q;
                Object objE = p139n8.b.e();
                int i11 = c0171a.f4870r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4868q;
                    Integer numD = ((O1.a) obj).d();
                    c0171a.f4870r = 1;
                    if (interfaceC0881g.b(numD, c0171a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public f(InterfaceC0880f interfaceC0880f) {
            this.f4867q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4867q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class g implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4872q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4873q;

            /* JADX INFO: renamed from: M1.b$g$a$a, reason: collision with other inner class name */
            public static final class C0172a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4874q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4875r;

                public C0172a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4874q = obj;
                    this.f4875r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4873q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0172a c0172a;
                if (eVar instanceof C0172a) {
                    c0172a = (C0172a) eVar;
                    int i10 = c0172a.f4875r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0172a.f4875r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0172a = new C0172a(eVar);
                    }
                } else {
                    c0172a = new C0172a(eVar);
                }
                Object obj2 = c0172a.f4874q;
                Object objE = p139n8.b.e();
                int i11 = c0172a.f4875r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4873q;
                    ((O1.a) obj).a();
                    c0172a.f4875r = 1;
                    if (interfaceC0881g.b(null, c0172a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public g(InterfaceC0880f interfaceC0880f) {
            this.f4872q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4872q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4877q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4878r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f4880t;

        h(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4878r = obj;
            this.f4880t |= Integer.MIN_VALUE;
            return b.this.v(null, this);
        }
    }

    public b(L1.a repository, p069g8.a snapshotRestorer) {
        n.h(repository, "repository");
        n.h(snapshotRestorer, "snapshotRestorer");
        this.f4825a = repository;
        this.f4826b = snapshotRestorer;
        this.f4827c = repository.d();
        this.f4828d = AbstractC0882h.o(new c(repository.a()));
        this.f4829e = repository.a();
        this.f4830f = AbstractC0882h.o(new d(repository.a()));
        this.f4831g = new e(repository.a());
        this.f4832h = new f(repository.a());
        this.f4833i = new g(repository.a());
        this.f4834j = i.b(new p219v8.a() { // from class: M1.a
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(b.n());
            }
        });
        this.f4835k = repository.f();
        this.f4836l = repository.c();
        this.f4837m = repository.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00db  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c A[PHI: r0 r1 r4 r5 r6
      0x011c: PHI (r0v13 N1.a) = (r0v8 N1.a), (r0v15 N1.a) binds: [B:34:0x0103, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r1v14 java.lang.Integer) = (r1v9 java.lang.Integer), (r1v20 java.lang.Integer) binds: [B:34:0x0103, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r4v14 java.lang.String) = (r4v9 java.lang.String), (r4v16 java.lang.String) binds: [B:34:0x0103, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r5v11 O1.b) = (r5v6 O1.b), (r5v13 O1.b) binds: [B:34:0x0103, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r6v4 M1.b) = (r6v2 M1.b), (r6v6 M1.b) binds: [B:34:0x0103, B:38:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x0182  */
    /* JADX WARN: Code duplicated, block: B:64:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        if (r1 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
    
        if (r1 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0148, code lost:
    
        if (r1 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0176, code lost:
    
        if (r1 == r3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(O1.b r21, p129m8.e r22) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.b.f(O1.b, m8.e):java.lang.Object");
    }

    private final boolean m() {
        return ((Boolean) this.f4834j.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n() {
        return p087i6.e.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(O1.b bVar, p129m8.e eVar) {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i10 = hVar.f4880t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f4880t = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objF = hVar.f4878r;
        Object objE = p139n8.b.e();
        int i11 = hVar.f4880t;
        if (i11 == 0) {
            r.b(objF);
            hVar.f4877q = this;
            hVar.f4880t = 1;
            objF = f(bVar, hVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (b) hVar.f4877q;
            r.b(objF);
        }
        ((M1.c) this.f4826b.get()).d((O1.b) objF);
        return A.f21846a;
    }

    public final InterfaceC0880f d() {
        return this.f4827c;
    }

    public final InterfaceC0880f e() {
        return this.f4831g;
    }

    public final InterfaceC0880f g() {
        return this.f4832h;
    }

    public final InterfaceC0880f h() {
        return this.f4835k;
    }

    public final InterfaceC0880f i() {
        return this.f4828d;
    }

    public final InterfaceC0880f j() {
        return this.f4837m;
    }

    public final InterfaceC0880f k() {
        return this.f4830f;
    }

    public final InterfaceC0880f l() {
        return this.f4836l;
    }

    public final Boolean o(String clockId) {
        n.h(clockId, "clockId");
        return this.f4825a.i(clockId);
    }

    public final Object p(A7.a aVar, p129m8.e eVar) {
        Object objR = r(new O1.b(null, null, null, null, null, null, aVar, null, 191, null), eVar);
        return objR == p139n8.b.e() ? objR : A.f21846a;
    }

    public final Object q(String str, int i10, Integer num, p129m8.e eVar) {
        Object objR = r(new O1.b(null, null, str, kotlin.coroutines.jvm.internal.b.c(i10), num, null, null, null, 227, null), eVar);
        return objR == p139n8.b.e() ? objR : A.f21846a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[PHI: r7 r8
      0x00e3: PHI (r7v9 O1.b) = (r7v6 O1.b), (r7v6 O1.b), (r7v11 O1.b) binds: [B:29:0x00c1, B:31:0x00e0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r8v8 M1.b) = (r8v5 M1.b), (r8v5 M1.b), (r8v10 M1.b) binds: [B:29:0x00c1, B:31:0x00e0, B:16:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9 A[PHI: r7 r8
      0x00f9: PHI (r7v12 O1.b) = (r7v9 O1.b), (r7v9 O1.b), (r7v14 O1.b) binds: [B:34:0x00e7, B:36:0x00f6, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r8v11 M1.b) = (r8v8 M1.b), (r8v8 M1.b), (r8v13 M1.b) binds: [B:34:0x00e7, B:36:0x00f6, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f A[PHI: r7 r8
      0x010f: PHI (r7v15 O1.b) = (r7v12 O1.b), (r7v12 O1.b), (r7v17 O1.b) binds: [B:39:0x00fd, B:41:0x010c, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r8v14 M1.b) = (r8v11 M1.b), (r8v11 M1.b), (r8v16 M1.b) binds: [B:39:0x00fd, B:41:0x010c, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r2.g(r9, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
    
        if (r8.k(r7, r0) == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(O1.b r8, p129m8.e r9) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.b.r(O1.b, m8.e):java.lang.Object");
    }

    public final Object s(N1.a aVar, p129m8.e eVar) {
        Object objR = r(new O1.b(null, aVar, null, null, null, null, null, null, 253, null), eVar);
        return objR == p139n8.b.e() ? objR : A.f21846a;
    }

    public final Object t(A7.g gVar, p129m8.e eVar) {
        Object objR = r(new O1.b(null, null, null, null, null, null, null, gVar, 127, null), eVar);
        return objR == p139n8.b.e() ? objR : A.f21846a;
    }

    public final Object u(String str, p129m8.e eVar) {
        O1.b bVar;
        if (!m() || (bVar = (O1.b) A7.e.f313a.a().get(str)) == null) {
            bVar = new O1.b(str, null, null, null, null, null, null, null, 254, null);
        }
        Object objR = r(bVar, eVar);
        return objR == p139n8.b.e() ? objR : A.f21846a;
    }
}
