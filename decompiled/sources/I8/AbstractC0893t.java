package I8;

import F8.A0;
import J8.C0905a;

/* JADX INFO: renamed from: I8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0893t {

    /* JADX INFO: renamed from: I8.t$a */
    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3294q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f3295r;

        public a(InterfaceC0880f interfaceC0880f, int i10) {
            this.f3294q = interfaceC0880f;
            this.f3295r = i10;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f3294q.a(new b(new kotlin.jvm.internal.C(), this.f3295r, interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: I8.t$b */
    static final class b implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.C f3296q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f3297r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3298s;

        /* JADX INFO: renamed from: I8.t$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f3299q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f3301s;

            a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3299q = obj;
                this.f3301s |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        b(kotlin.jvm.internal.C c10, int i10, InterfaceC0881g interfaceC0881g) {
            this.f3296q = c10;
            this.f3297r = i10;
            this.f3298s = interfaceC0881g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // I8.InterfaceC0881g
        public final Object b(Object obj, p129m8.e eVar) {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i10 = aVar.f3301s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f3301s = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj2 = aVar.f3299q;
            Object objE = p139n8.b.e();
            int i11 = aVar.f3301s;
            if (i11 == 0) {
                p079h8.r.b(obj2);
                kotlin.jvm.internal.C c10 = this.f3296q;
                int i12 = c10.f22777q;
                if (i12 < this.f3297r) {
                    c10.f22777q = i12 + 1;
                    return p079h8.A.f21846a;
                }
                InterfaceC0881g interfaceC0881g = this.f3298s;
                aVar.f3301s = 1;
                if (interfaceC0881g.b(obj, aVar) == objE) {
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

    /* JADX INFO: renamed from: I8.t$c */
    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3302q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.p f3303r;

        public c(InterfaceC0880f interfaceC0880f, p219v8.p pVar) {
            this.f3302q = interfaceC0880f;
            this.f3303r = pVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f3302q.a(new d(new kotlin.jvm.internal.A(), interfaceC0881g, this.f3303r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: I8.t$d */
    static final class d implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.A f3304q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3305r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.p f3306s;

        /* JADX INFO: renamed from: I8.t$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f3307q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f3308r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f3309s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f3311u;

            a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3309s = obj;
                this.f3311u |= Integer.MIN_VALUE;
                return d.this.b(null, this);
            }
        }

        d(kotlin.jvm.internal.A a10, InterfaceC0881g interfaceC0881g, p219v8.p pVar) {
            this.f3304q = a10;
            this.f3305r = interfaceC0881g;
            this.f3306s = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0073  */
        /* JADX WARN: Code duplicated, block: B:35:0x008a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r6.b(r7, r0) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        
            if (r6.b(r7, r0) == r1) goto L32;
         */
        @Override // I8.InterfaceC0881g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(java.lang.Object r7, p129m8.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof I8.AbstractC0893t.d.a
                if (r0 == 0) goto L13
                r0 = r8
                I8.t$d$a r0 = (I8.AbstractC0893t.d.a) r0
                int r1 = r0.f3311u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f3311u = r1
                goto L18
            L13:
                I8.t$d$a r0 = new I8.t$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f3309s
                java.lang.Object r1 = p139n8.b.e()
                int r2 = r0.f3311u
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                p079h8.r.b(r8)
                goto L87
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                java.lang.Object r7 = r0.f3308r
                java.lang.Object r6 = r0.f3307q
                I8.t$d r6 = (I8.AbstractC0893t.d) r6
                p079h8.r.b(r8)
                goto L6b
            L41:
                p079h8.r.b(r8)
                goto L59
            L45:
                p079h8.r.b(r8)
                kotlin.jvm.internal.A r8 = r6.f3304q
                boolean r8 = r8.f22775q
                if (r8 == 0) goto L5c
                I8.g r6 = r6.f3305r
                r0.f3311u = r5
                java.lang.Object r6 = r6.b(r7, r0)
                if (r6 != r1) goto L59
                goto L86
            L59:
                h8.A r6 = p079h8.A.f21846a
                return r6
            L5c:
                v8.p r8 = r6.f3306s
                r0.f3307q = r6
                r0.f3308r = r7
                r0.f3311u = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L86
            L6b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8a
                kotlin.jvm.internal.A r8 = r6.f3304q
                r8.f22775q = r5
                I8.g r6 = r6.f3305r
                r8 = 0
                r0.f3307q = r8
                r0.f3308r = r8
                r0.f3311u = r3
                java.lang.Object r6 = r6.b(r7, r0)
                if (r6 != r1) goto L87
            L86:
                return r1
            L87:
                h8.A r6 = p079h8.A.f21846a
                return r6
            L8a:
                h8.A r6 = p079h8.A.f21846a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.AbstractC0893t.d.b(java.lang.Object, m8.e):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: I8.t$e */
    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3312q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.p f3313r;

        /* JADX INFO: renamed from: I8.t$e$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f3314q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f3315r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f3317t;

            public a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3314q = obj;
                this.f3315r |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(InterfaceC0880f interfaceC0880f, p219v8.p pVar) {
            this.f3312q = interfaceC0880f;
            this.f3313r = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            a aVar;
            f fVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i10 = aVar.f3315r;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f3315r = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj = aVar.f3314q;
            Object objE = p139n8.b.e();
            int i11 = aVar.f3315r;
            if (i11 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880f = this.f3312q;
                f fVar2 = new f(this.f3313r, interfaceC0881g);
                try {
                    aVar.f3317t = fVar2;
                    aVar.f3315r = 1;
                    if (interfaceC0880f.a(fVar2, aVar) == objE) {
                        return objE;
                    }
                } catch (C0905a e10) {
                    e = e10;
                    fVar = fVar2;
                    J8.p.a(e, fVar);
                    A0.j(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) aVar.f3317t;
                try {
                    p079h8.r.b(obj);
                } catch (C0905a e11) {
                    e = e11;
                    J8.p.a(e, fVar);
                    A0.j(aVar.getContext());
                }
            }
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: I8.t$f */
    public static final class f implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p219v8.p f3318q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3319r;

        /* JADX INFO: renamed from: I8.t$f$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f3320q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f3321r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f3322s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f3324u;

            public a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3321r = obj;
                this.f3322s |= Integer.MIN_VALUE;
                return f.this.b(null, this);
            }
        }

        public f(p219v8.p pVar, InterfaceC0881g interfaceC0881g) {
            this.f3318q = pVar;
            this.f3319r = interfaceC0881g;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0077  */
        /* JADX WARN: Code duplicated, block: B:28:0x007a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (r7.b(r6, r0) == r1) goto L23;
         */
        @Override // I8.InterfaceC0881g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(java.lang.Object r6, p129m8.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof I8.AbstractC0893t.f.a
                if (r0 == 0) goto L13
                r0 = r7
                I8.t$f$a r0 = (I8.AbstractC0893t.f.a) r0
                int r1 = r0.f3322s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f3322s = r1
                goto L18
            L13:
                I8.t$f$a r0 = new I8.t$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f3321r
                java.lang.Object r1 = p139n8.b.e()
                int r2 = r0.f3322s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r5 = r0.f3320q
                I8.t$f r5 = (I8.AbstractC0893t.f) r5
                p079h8.r.b(r7)
                goto L75
            L30:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L38:
                java.lang.Object r6 = r0.f3324u
                java.lang.Object r5 = r0.f3320q
                I8.t$f r5 = (I8.AbstractC0893t.f) r5
                p079h8.r.b(r7)
                goto L5c
            L42:
                p079h8.r.b(r7)
                v8.p r7 = r5.f3318q
                r0.f3320q = r5
                r0.f3324u = r6
                r0.f3322s = r4
                r2 = 6
                kotlin.jvm.internal.m.a(r2)
                java.lang.Object r7 = r7.invoke(r6, r0)
                r2 = 7
                kotlin.jvm.internal.m.a(r2)
                if (r7 != r1) goto L5c
                goto L73
            L5c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L74
                I8.g r7 = r5.f3319r
                r0.f3320q = r5
                r2 = 0
                r0.f3324u = r2
                r0.f3322s = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L75
            L73:
                return r1
            L74:
                r4 = 0
            L75:
                if (r4 == 0) goto L7a
                h8.A r5 = p079h8.A.f21846a
                return r5
            L7a:
                J8.a r6 = new J8.a
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.AbstractC0893t.f.b(java.lang.Object, m8.e):java.lang.Object");
        }
    }

    public static final InterfaceC0880f a(InterfaceC0880f interfaceC0880f, int i10) {
        if (i10 >= 0) {
            return new a(interfaceC0880f, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final InterfaceC0880f b(InterfaceC0880f interfaceC0880f, p219v8.p pVar) {
        return new c(interfaceC0880f, pVar);
    }

    public static final InterfaceC0880f c(InterfaceC0880f interfaceC0880f, p219v8.p pVar) {
        return new e(interfaceC0880f, pVar);
    }
}
