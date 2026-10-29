package M1;

import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class c implements D3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4881d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L1.a f4882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private D3.b f4883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private O1.b f4884c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4885q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4886r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4887s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4889u;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4887s = obj;
            this.f4889u |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: M1.c$c, reason: collision with other inner class name */
    public static final class C0173c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4890q;

        /* JADX INFO: renamed from: M1.c$c$a */
        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4891q;

            /* JADX INFO: renamed from: M1.c$c$a$a, reason: collision with other inner class name */
            public static final class C0174a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4892q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4893r;

                public C0174a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4892q = obj;
                    this.f4893r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4891q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0174a c0174a;
                if (eVar instanceof C0174a) {
                    c0174a = (C0174a) eVar;
                    int i10 = c0174a.f4893r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0174a.f4893r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0174a = new C0174a(eVar);
                    }
                } else {
                    c0174a = new C0174a(eVar);
                }
                Object obj2 = c0174a.f4892q;
                Object objE = p139n8.b.e();
                int i11 = c0174a.f4893r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4891q;
                    String strB = ((O1.a) obj).b();
                    c0174a.f4893r = 1;
                    if (interfaceC0881g.b(strB, c0174a) == objE) {
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

        public C0173c(InterfaceC0880f interfaceC0880f) {
            this.f4890q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4890q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4895q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4896q;

            /* JADX INFO: renamed from: M1.c$d$a$a, reason: collision with other inner class name */
            public static final class C0175a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4897q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4898r;

                public C0175a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4897q = obj;
                    this.f4898r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4896q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0175a c0175a;
                if (eVar instanceof C0175a) {
                    c0175a = (C0175a) eVar;
                    int i10 = c0175a.f4898r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0175a.f4898r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0175a = new C0175a(eVar);
                    }
                } else {
                    c0175a = new C0175a(eVar);
                }
                Object obj2 = c0175a.f4897q;
                Object objE = p139n8.b.e();
                int i11 = c0175a.f4898r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4896q;
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(((O1.a) obj).c());
                    c0175a.f4898r = 1;
                    if (interfaceC0881g.b(numC, c0175a) == objE) {
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
            this.f4895q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4895q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4900q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4901q;

            /* JADX INFO: renamed from: M1.c$e$a$a, reason: collision with other inner class name */
            public static final class C0176a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4902q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4903r;

                public C0176a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4902q = obj;
                    this.f4903r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4901q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0176a c0176a;
                if (eVar instanceof C0176a) {
                    c0176a = (C0176a) eVar;
                    int i10 = c0176a.f4903r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0176a.f4903r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0176a = new C0176a(eVar);
                    }
                } else {
                    c0176a = new C0176a(eVar);
                }
                Object obj2 = c0176a.f4902q;
                Object objE = p139n8.b.e();
                int i11 = c0176a.f4903r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4901q;
                    String strE = ((O1.a) obj).e();
                    c0176a.f4903r = 1;
                    if (interfaceC0881g.b(strE, c0176a) == objE) {
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
            this.f4900q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4900q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class f implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4905q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4906q;

            /* JADX INFO: renamed from: M1.c$f$a$a, reason: collision with other inner class name */
            public static final class C0177a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4907q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4908r;

                public C0177a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4907q = obj;
                    this.f4908r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4906q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0177a c0177a;
                if (eVar instanceof C0177a) {
                    c0177a = (C0177a) eVar;
                    int i10 = c0177a.f4908r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0177a.f4908r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0177a = new C0177a(eVar);
                    }
                } else {
                    c0177a = new C0177a(eVar);
                }
                Object obj2 = c0177a.f4907q;
                Object objE = p139n8.b.e();
                int i11 = c0177a.f4908r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4906q;
                    Integer numD = ((O1.a) obj).d();
                    c0177a.f4908r = 1;
                    if (interfaceC0881g.b(numD, c0177a) == objE) {
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
            this.f4905q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4905q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class g implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4910q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4911q;

            /* JADX INFO: renamed from: M1.c$g$a$a, reason: collision with other inner class name */
            public static final class C0178a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4912q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4913r;

                public C0178a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4912q = obj;
                    this.f4913r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4911q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0178a c0178a;
                if (eVar instanceof C0178a) {
                    c0178a = (C0178a) eVar;
                    int i10 = c0178a.f4913r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0178a.f4913r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0178a = new C0178a(eVar);
                    }
                } else {
                    c0178a = new C0178a(eVar);
                }
                Object obj2 = c0178a.f4912q;
                Object objE = p139n8.b.e();
                int i11 = c0178a.f4913r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4911q;
                    ((O1.a) obj).a();
                    O2.f fVar = new O2.f(null, 1, null);
                    c0178a.f4913r = 1;
                    if (interfaceC0881g.b(fVar, c0178a) == objE) {
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
            this.f4910q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4910q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4915q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4916r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f4917s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4918t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f4919u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f4920v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f4921w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f4922x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f4924z;

        h(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4922x = obj;
            this.f4924z |= Integer.MIN_VALUE;
            return c.this.b(null, this);
        }
    }

    public c(L1.a repository) {
        n.h(repository, "repository");
        this.f4882a = repository;
        this.f4883b = D3.b.a.f714a;
    }

    private final E3.a c(O1.b bVar) {
        Map mapB;
        if (bVar == null) {
            mapB = N.g();
        } else {
            Map mapC = N.c();
            String strE = bVar.e();
            if (strE != null) {
            }
            N1.a aVarF = bVar.f();
            if (aVarF != null) {
            }
            String strJ = bVar.j();
            if (strJ != null) {
            }
            Integer numG = bVar.g();
            if (numG != null) {
            }
            Integer numI = bVar.i();
            if (numI != null) {
            }
            O2.f fVarC = bVar.c();
            if (fVarC != null) {
                String string = O2.f.f5774b.b(fVarC).toString();
                n.g(string, "toString(...)");
                mapC.put("font_axes", string);
            }
            mapB = N.b(mapC);
        }
        return new E3.a(mapB);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136 A[PHI: r11 r13
      0x0136: PHI (r11v1 'this' M1.c) = (r11v0 'this' M1.c A[IMMUTABLE_TYPE, THIS]), (r11v0 'this' M1.c A[IMMUTABLE_TYPE, THIS]), (r11v10 'this' M1.c) binds: [B:53:0x0125, B:55:0x0133, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r13v3 O1.b) = (r13v2 O1.b), (r13v2 O1.b), (r13v9 O1.b) binds: [B:53:0x0125, B:55:0x0133, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d A[PHI: r11 r12
      0x015d: PHI (r11v3 O1.b) = (r11v2 O1.b), (r11v2 O1.b), (r11v12 O1.b) binds: [B:58:0x013c, B:60:0x015a, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r12v10 M1.c) = (r12v9 M1.c), (r12v9 M1.c), (r12v16 M1.c) binds: [B:58:0x013c, B:60:0x015a, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
    
        if (r12.h(r11, r0) == r1) goto L71;
     */
    @Override // D3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(E3.a r12, p129m8.e r13) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.c.a(E3.a, m8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:29:0x0121  */
    /* JADX WARN: Code duplicated, block: B:33:0x014b A[PHI: r2 r3 r4 r12 r13 r14
      0x014b: PHI (r2v13 N1.a) = (r2v9 N1.a), (r2v16 N1.a) binds: [B:31:0x0148, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r3v10 java.lang.String) = (r3v6 java.lang.String), (r3v13 java.lang.String) binds: [B:31:0x0148, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r4v4 M1.c) = (r4v2 M1.c), (r4v6 M1.c) binds: [B:31:0x0148, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r12v10 'this' M1.c) = (r12v7 'this' M1.c), (r12v12 'this' M1.c) binds: [B:31:0x0148, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r13v16 java.lang.Integer) = (r13v13 java.lang.Integer), (r13v19 java.lang.Integer) binds: [B:31:0x0148, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r14v16 java.lang.Object) = (r14v15 java.lang.Object), (r14v1 java.lang.Object) binds: [B:31:0x0148, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x016e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // D3.a
    public Object b(D3.b bVar, p129m8.e eVar) {
        h hVar;
        c cVar;
        String str;
        Object objZ;
        c cVar2;
        String str2;
        N1.a aVar;
        Object objZ2;
        c cVar3;
        N1.a aVar2;
        String str3;
        Integer num;
        String str4;
        Object objZ3;
        Integer num2;
        String str5;
        String str6;
        N1.a aVar3;
        Integer num3;
        Object objZ4;
        String str7;
        c cVar4;
        Integer num4;
        N1.a aVar4;
        String str8;
        Integer num5;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i10 = hVar.f4924z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f4924z = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objZ5 = hVar.f4922x;
        Object objE = p139n8.b.e();
        switch (hVar.f4924z) {
            case 0:
                r.b(objZ5);
                this.f4883b = bVar;
                InterfaceC0880f interfaceC0880fO = AbstractC0882h.o(new C0173c(this.f4882a.a()));
                hVar.f4915q = this;
                hVar.f4916r = this;
                hVar.f4924z = 1;
                objZ5 = AbstractC0882h.z(interfaceC0880fO, hVar);
                if (objZ5 != objE) {
                    cVar = this;
                    str = (String) objZ5;
                    InterfaceC0880f interfaceC0880fL = cVar.f4882a.l();
                    hVar.f4915q = cVar;
                    hVar.f4916r = str;
                    hVar.f4917s = this;
                    hVar.f4924z = 2;
                    objZ = AbstractC0882h.z(interfaceC0880fL, hVar);
                    if (objZ != objE) {
                        cVar2 = cVar;
                        str2 = str;
                        objZ5 = objZ;
                        aVar = (N1.a) objZ5;
                        d dVar = new d(cVar2.f4882a.a());
                        hVar.f4915q = cVar2;
                        hVar.f4916r = str2;
                        hVar.f4917s = aVar;
                        hVar.f4918t = this;
                        hVar.f4924z = 3;
                        objZ2 = AbstractC0882h.z(dVar, hVar);
                        if (objZ2 != objE) {
                            cVar3 = cVar2;
                            aVar2 = aVar;
                            objZ5 = objZ2;
                            str3 = str2;
                            num = (Integer) objZ5;
                            InterfaceC0880f interfaceC0880fO2 = AbstractC0882h.o(new e(cVar3.f4882a.a()));
                            hVar.f4915q = cVar3;
                            hVar.f4916r = str3;
                            hVar.f4917s = aVar2;
                            hVar.f4918t = num;
                            hVar.f4919u = this;
                            hVar.f4924z = 4;
                            objZ5 = AbstractC0882h.z(interfaceC0880fO2, hVar);
                            if (objZ5 != objE) {
                                str4 = (String) objZ5;
                                f fVar = new f(cVar3.f4882a.a());
                                hVar.f4915q = cVar3;
                                hVar.f4916r = str3;
                                hVar.f4917s = aVar2;
                                hVar.f4918t = num;
                                hVar.f4919u = str4;
                                hVar.f4920v = this;
                                hVar.f4924z = 5;
                                objZ3 = AbstractC0882h.z(fVar, hVar);
                                if (objZ3 != objE) {
                                    N1.a aVar5 = aVar2;
                                    num2 = num;
                                    str5 = str4;
                                    objZ5 = objZ3;
                                    str6 = str3;
                                    aVar3 = aVar5;
                                    num3 = (Integer) objZ5;
                                    g gVar = new g(cVar3.f4882a.a());
                                    hVar.f4915q = cVar3;
                                    hVar.f4916r = str6;
                                    hVar.f4917s = aVar3;
                                    hVar.f4918t = num2;
                                    hVar.f4919u = str5;
                                    hVar.f4920v = num3;
                                    hVar.f4921w = this;
                                    hVar.f4924z = 6;
                                    objZ4 = AbstractC0882h.z(gVar, hVar);
                                    if (objZ4 != objE) {
                                        N1.a aVar6 = aVar3;
                                        str7 = str5;
                                        cVar4 = cVar3;
                                        num4 = num2;
                                        aVar4 = aVar6;
                                        str8 = str6;
                                        num5 = num3;
                                        objZ5 = objZ4;
                                        this.f4884c = new O1.b(str8, aVar4, str7, num4, num5, (O2.f) objZ5, null, null, 192, null);
                                        return cVar4.c(cVar4.f4884c);
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 1:
                this = (c) hVar.f4916r;
                cVar = (c) hVar.f4915q;
                r.b(objZ5);
                str = (String) objZ5;
                InterfaceC0880f interfaceC0880fL2 = cVar.f4882a.l();
                hVar.f4915q = cVar;
                hVar.f4916r = str;
                hVar.f4917s = this;
                hVar.f4924z = 2;
                objZ = AbstractC0882h.z(interfaceC0880fL2, hVar);
                if (objZ != objE) {
                    cVar2 = cVar;
                    str2 = str;
                    objZ5 = objZ;
                    aVar = (N1.a) objZ5;
                    d dVar2 = new d(cVar2.f4882a.a());
                    hVar.f4915q = cVar2;
                    hVar.f4916r = str2;
                    hVar.f4917s = aVar;
                    hVar.f4918t = this;
                    hVar.f4924z = 3;
                    objZ2 = AbstractC0882h.z(dVar2, hVar);
                    if (objZ2 != objE) {
                        cVar3 = cVar2;
                        aVar2 = aVar;
                        objZ5 = objZ2;
                        str3 = str2;
                        num = (Integer) objZ5;
                        InterfaceC0880f interfaceC0880fO3 = AbstractC0882h.o(new e(cVar3.f4882a.a()));
                        hVar.f4915q = cVar3;
                        hVar.f4916r = str3;
                        hVar.f4917s = aVar2;
                        hVar.f4918t = num;
                        hVar.f4919u = this;
                        hVar.f4924z = 4;
                        objZ5 = AbstractC0882h.z(interfaceC0880fO3, hVar);
                        if (objZ5 != objE) {
                            str4 = (String) objZ5;
                            f fVar2 = new f(cVar3.f4882a.a());
                            hVar.f4915q = cVar3;
                            hVar.f4916r = str3;
                            hVar.f4917s = aVar2;
                            hVar.f4918t = num;
                            hVar.f4919u = str4;
                            hVar.f4920v = this;
                            hVar.f4924z = 5;
                            objZ3 = AbstractC0882h.z(fVar2, hVar);
                            if (objZ3 != objE) {
                                N1.a aVar7 = aVar2;
                                num2 = num;
                                str5 = str4;
                                objZ5 = objZ3;
                                str6 = str3;
                                aVar3 = aVar7;
                                num3 = (Integer) objZ5;
                                g gVar2 = new g(cVar3.f4882a.a());
                                hVar.f4915q = cVar3;
                                hVar.f4916r = str6;
                                hVar.f4917s = aVar3;
                                hVar.f4918t = num2;
                                hVar.f4919u = str5;
                                hVar.f4920v = num3;
                                hVar.f4921w = this;
                                hVar.f4924z = 6;
                                objZ4 = AbstractC0882h.z(gVar2, hVar);
                                if (objZ4 != objE) {
                                    N1.a aVar8 = aVar3;
                                    str7 = str5;
                                    cVar4 = cVar3;
                                    num4 = num2;
                                    aVar4 = aVar8;
                                    str8 = str6;
                                    num5 = num3;
                                    objZ5 = objZ4;
                                    this.f4884c = new O1.b(str8, aVar4, str7, num4, num5, (O2.f) objZ5, null, null, 192, null);
                                    return cVar4.c(cVar4.f4884c);
                                }
                            }
                        }
                    }
                }
                return objE;
            case 2:
                this = (c) hVar.f4917s;
                str2 = (String) hVar.f4916r;
                cVar2 = (c) hVar.f4915q;
                r.b(objZ5);
                aVar = (N1.a) objZ5;
                d dVar3 = new d(cVar2.f4882a.a());
                hVar.f4915q = cVar2;
                hVar.f4916r = str2;
                hVar.f4917s = aVar;
                hVar.f4918t = this;
                hVar.f4924z = 3;
                objZ2 = AbstractC0882h.z(dVar3, hVar);
                if (objZ2 != objE) {
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    objZ5 = objZ2;
                    str3 = str2;
                    num = (Integer) objZ5;
                    InterfaceC0880f interfaceC0880fO4 = AbstractC0882h.o(new e(cVar3.f4882a.a()));
                    hVar.f4915q = cVar3;
                    hVar.f4916r = str3;
                    hVar.f4917s = aVar2;
                    hVar.f4918t = num;
                    hVar.f4919u = this;
                    hVar.f4924z = 4;
                    objZ5 = AbstractC0882h.z(interfaceC0880fO4, hVar);
                    if (objZ5 != objE) {
                        str4 = (String) objZ5;
                        f fVar3 = new f(cVar3.f4882a.a());
                        hVar.f4915q = cVar3;
                        hVar.f4916r = str3;
                        hVar.f4917s = aVar2;
                        hVar.f4918t = num;
                        hVar.f4919u = str4;
                        hVar.f4920v = this;
                        hVar.f4924z = 5;
                        objZ3 = AbstractC0882h.z(fVar3, hVar);
                        if (objZ3 != objE) {
                            N1.a aVar9 = aVar2;
                            num2 = num;
                            str5 = str4;
                            objZ5 = objZ3;
                            str6 = str3;
                            aVar3 = aVar9;
                            num3 = (Integer) objZ5;
                            g gVar3 = new g(cVar3.f4882a.a());
                            hVar.f4915q = cVar3;
                            hVar.f4916r = str6;
                            hVar.f4917s = aVar3;
                            hVar.f4918t = num2;
                            hVar.f4919u = str5;
                            hVar.f4920v = num3;
                            hVar.f4921w = this;
                            hVar.f4924z = 6;
                            objZ4 = AbstractC0882h.z(gVar3, hVar);
                            if (objZ4 != objE) {
                                N1.a aVar10 = aVar3;
                                str7 = str5;
                                cVar4 = cVar3;
                                num4 = num2;
                                aVar4 = aVar10;
                                str8 = str6;
                                num5 = num3;
                                objZ5 = objZ4;
                                this.f4884c = new O1.b(str8, aVar4, str7, num4, num5, (O2.f) objZ5, null, null, 192, null);
                                return cVar4.c(cVar4.f4884c);
                            }
                        }
                    }
                }
                return objE;
            case 3:
                this = (c) hVar.f4918t;
                N1.a aVar11 = (N1.a) hVar.f4917s;
                String str9 = (String) hVar.f4916r;
                c cVar5 = (c) hVar.f4915q;
                r.b(objZ5);
                cVar3 = cVar5;
                str3 = str9;
                aVar2 = aVar11;
                num = (Integer) objZ5;
                InterfaceC0880f interfaceC0880fO5 = AbstractC0882h.o(new e(cVar3.f4882a.a()));
                hVar.f4915q = cVar3;
                hVar.f4916r = str3;
                hVar.f4917s = aVar2;
                hVar.f4918t = num;
                hVar.f4919u = this;
                hVar.f4924z = 4;
                objZ5 = AbstractC0882h.z(interfaceC0880fO5, hVar);
                if (objZ5 != objE) {
                    str4 = (String) objZ5;
                    f fVar4 = new f(cVar3.f4882a.a());
                    hVar.f4915q = cVar3;
                    hVar.f4916r = str3;
                    hVar.f4917s = aVar2;
                    hVar.f4918t = num;
                    hVar.f4919u = str4;
                    hVar.f4920v = this;
                    hVar.f4924z = 5;
                    objZ3 = AbstractC0882h.z(fVar4, hVar);
                    if (objZ3 != objE) {
                        N1.a aVar12 = aVar2;
                        num2 = num;
                        str5 = str4;
                        objZ5 = objZ3;
                        str6 = str3;
                        aVar3 = aVar12;
                        num3 = (Integer) objZ5;
                        g gVar4 = new g(cVar3.f4882a.a());
                        hVar.f4915q = cVar3;
                        hVar.f4916r = str6;
                        hVar.f4917s = aVar3;
                        hVar.f4918t = num2;
                        hVar.f4919u = str5;
                        hVar.f4920v = num3;
                        hVar.f4921w = this;
                        hVar.f4924z = 6;
                        objZ4 = AbstractC0882h.z(gVar4, hVar);
                        if (objZ4 != objE) {
                            N1.a aVar13 = aVar3;
                            str7 = str5;
                            cVar4 = cVar3;
                            num4 = num2;
                            aVar4 = aVar13;
                            str8 = str6;
                            num5 = num3;
                            objZ5 = objZ4;
                            this.f4884c = new O1.b(str8, aVar4, str7, num4, num5, (O2.f) objZ5, null, null, 192, null);
                            return cVar4.c(cVar4.f4884c);
                        }
                    }
                }
                return objE;
            case 4:
                this = (c) hVar.f4919u;
                num = (Integer) hVar.f4918t;
                aVar2 = (N1.a) hVar.f4917s;
                str3 = (String) hVar.f4916r;
                cVar3 = (c) hVar.f4915q;
                r.b(objZ5);
                str4 = (String) objZ5;
                f fVar5 = new f(cVar3.f4882a.a());
                hVar.f4915q = cVar3;
                hVar.f4916r = str3;
                hVar.f4917s = aVar2;
                hVar.f4918t = num;
                hVar.f4919u = str4;
                hVar.f4920v = this;
                hVar.f4924z = 5;
                objZ3 = AbstractC0882h.z(fVar5, hVar);
                if (objZ3 != objE) {
                    N1.a aVar14 = aVar2;
                    num2 = num;
                    str5 = str4;
                    objZ5 = objZ3;
                    str6 = str3;
                    aVar3 = aVar14;
                    num3 = (Integer) objZ5;
                    g gVar5 = new g(cVar3.f4882a.a());
                    hVar.f4915q = cVar3;
                    hVar.f4916r = str6;
                    hVar.f4917s = aVar3;
                    hVar.f4918t = num2;
                    hVar.f4919u = str5;
                    hVar.f4920v = num3;
                    hVar.f4921w = this;
                    hVar.f4924z = 6;
                    objZ4 = AbstractC0882h.z(gVar5, hVar);
                    if (objZ4 != objE) {
                        N1.a aVar15 = aVar3;
                        str7 = str5;
                        cVar4 = cVar3;
                        num4 = num2;
                        aVar4 = aVar15;
                        str8 = str6;
                        num5 = num3;
                        objZ5 = objZ4;
                        this.f4884c = new O1.b(str8, aVar4, str7, num4, num5, (O2.f) objZ5, null, null, 192, null);
                        return cVar4.c(cVar4.f4884c);
                    }
                }
                return objE;
            case 5:
                this = (c) hVar.f4920v;
                str5 = (String) hVar.f4919u;
                num2 = (Integer) hVar.f4918t;
                aVar3 = (N1.a) hVar.f4917s;
                String str10 = (String) hVar.f4916r;
                c cVar6 = (c) hVar.f4915q;
                r.b(objZ5);
                str6 = str10;
                cVar3 = cVar6;
                num3 = (Integer) objZ5;
                g gVar6 = new g(cVar3.f4882a.a());
                hVar.f4915q = cVar3;
                hVar.f4916r = str6;
                hVar.f4917s = aVar3;
                hVar.f4918t = num2;
                hVar.f4919u = str5;
                hVar.f4920v = num3;
                hVar.f4921w = this;
                hVar.f4924z = 6;
                objZ4 = AbstractC0882h.z(gVar6, hVar);
                if (objZ4 != objE) {
                    N1.a aVar16 = aVar3;
                    str7 = str5;
                    cVar4 = cVar3;
                    num4 = num2;
                    aVar4 = aVar16;
                    str8 = str6;
                    num5 = num3;
                    objZ5 = objZ4;
                    this.f4884c = new O1.b(str8, aVar4, str7, num4, num5, (O2.f) objZ5, null, null, 192, null);
                    return cVar4.c(cVar4.f4884c);
                }
                return objE;
            case 6:
                this = (c) hVar.f4921w;
                Integer num6 = (Integer) hVar.f4920v;
                String str11 = (String) hVar.f4919u;
                Integer num7 = (Integer) hVar.f4918t;
                N1.a aVar17 = (N1.a) hVar.f4917s;
                String str12 = (String) hVar.f4916r;
                c cVar7 = (c) hVar.f4915q;
                r.b(objZ5);
                str7 = str11;
                str8 = str12;
                num4 = num7;
                aVar4 = aVar17;
                num5 = num6;
                cVar4 = cVar7;
                this.f4884c = new O1.b(str8, aVar4, str7, num4, num5, (O2.f) objZ5, null, null, 192, null);
                return cVar4.c(cVar4.f4884c);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void d(O1.b clockSnapshotModel) {
        n.h(clockSnapshotModel, "clockSnapshotModel");
        this.f4883b.a(c(clockSnapshotModel));
    }
}
