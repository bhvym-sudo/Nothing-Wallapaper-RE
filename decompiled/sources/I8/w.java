package I8;

import F8.A0;
import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.AbstractC0845x;
import F8.InterfaceC0841v;
import F8.InterfaceC0846x0;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class w {

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3351q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ K f3352r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3353s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ z f3354t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f3355u;

        /* JADX INFO: renamed from: I8.w$a$a, reason: collision with other inner class name */
        static final class C0112a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3356q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ int f3357r;

            C0112a(p129m8.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0112a c0112a = new C0112a(eVar);
                c0112a.f3357r = ((Number) obj).intValue();
                return c0112a;
            }

            @Override // p219v8.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return s(((Number) obj).intValue(), (p129m8.e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f3356q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f3357r > 0);
            }

            public final Object s(int i10, p129m8.e eVar) {
                return ((C0112a) create(Integer.valueOf(i10), eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3358q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f3359r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f3360s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ z f3361t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Object f3362u;

            /* JADX INFO: renamed from: I8.w$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0113a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f3363a;

                static {
                    int[] iArr = new int[I.values().length];
                    try {
                        iArr[I.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[I.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[I.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f3363a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC0880f interfaceC0880f, z zVar, Object obj, p129m8.e eVar) {
                super(2, eVar);
                this.f3360s = interfaceC0880f;
                this.f3361t = zVar;
                this.f3362u = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                b bVar = new b(this.f3360s, this.f3361t, this.f3362u, eVar);
                bVar.f3359r = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f3358q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    int i11 = C0113a.f3363a[((I) this.f3359r).ordinal()];
                    if (i11 == 1) {
                        InterfaceC0880f interfaceC0880f = this.f3360s;
                        z zVar = this.f3361t;
                        this.f3358q = 1;
                        if (interfaceC0880f.a(zVar, this) == objE) {
                            return objE;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new p079h8.m();
                        }
                        Object obj2 = this.f3362u;
                        if (obj2 == G.f3162a) {
                            this.f3361t.g();
                        } else {
                            kotlin.coroutines.jvm.internal.b.a(this.f3361t.h(obj2));
                        }
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
            public final Object invoke(I i10, p129m8.e eVar) {
                return ((b) create(i10, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K k9, InterfaceC0880f interfaceC0880f, z zVar, Object obj, p129m8.e eVar) {
            super(2, eVar);
            this.f3352r = k9;
            this.f3353s = interfaceC0880f;
            this.f3354t = zVar;
            this.f3355u = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f3352r, this.f3353s, this.f3354t, this.f3355u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.a(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.a(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (I8.AbstractC0882h.i(r8, r1, r7) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r7.f3351q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                p079h8.r.b(r8)
                goto L5c
            L21:
                p079h8.r.b(r8)
                goto L8d
            L25:
                p079h8.r.b(r8)
                I8.K r8 = r7.f3352r
                I8.K$a r1 = I8.K.f3174a
                I8.K r6 = r1.c()
                if (r8 != r6) goto L3f
                I8.f r8 = r7.f3353s
                I8.z r1 = r7.f3354t
                r7.f3351q = r5
                java.lang.Object r7 = r8.a(r1, r7)
                if (r7 != r0) goto L8d
                goto L8c
            L3f:
                I8.K r8 = r7.f3352r
                I8.K r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                I8.z r8 = r7.f3354t
                I8.O r8 = r8.l()
                I8.w$a$a r1 = new I8.w$a$a
                r1.<init>(r5)
                r7.f3351q = r4
                java.lang.Object r8 = I8.AbstractC0882h.y(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                I8.f r8 = r7.f3353s
                I8.z r1 = r7.f3354t
                r7.f3351q = r3
                java.lang.Object r7 = r8.a(r1, r7)
                if (r7 != r0) goto L8d
                goto L8c
            L69:
                I8.K r8 = r7.f3352r
                I8.z r1 = r7.f3354t
                I8.O r1 = r1.l()
                I8.f r8 = r8.a(r1)
                I8.f r8 = I8.AbstractC0882h.o(r8)
                I8.w$a$b r1 = new I8.w$a$b
                I8.f r3 = r7.f3353s
                I8.z r4 = r7.f3354t
                java.lang.Object r6 = r7.f3355u
                r1.<init>(r3, r4, r6, r5)
                r7.f3351q = r2
                java.lang.Object r7 = I8.AbstractC0882h.i(r8, r1, r7)
                if (r7 != r0) goto L8d
            L8c:
                return r0
            L8d:
                h8.A r7 = p079h8.A.f21846a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3364q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3365r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3366s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC0841v f3367t;

        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.E f3368q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ F8.L f3369r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC0841v f3370s;

            a(kotlin.jvm.internal.E e10, F8.L l9, InterfaceC0841v interfaceC0841v) {
                this.f3368q = e10;
                this.f3369r = l9;
                this.f3370s = interfaceC0841v;
            }

            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                kotlin.jvm.internal.E e10 = this.f3368q;
                A a10 = (A) e10.f22779q;
                if (a10 != null) {
                    a10.setValue(obj);
                } else {
                    F8.L l9 = this.f3369r;
                    InterfaceC0841v interfaceC0841v = this.f3370s;
                    A a11 = Q.a(obj);
                    interfaceC0841v.B0(new C(a11, A0.k(l9.w0())));
                    e10.f22779q = a11;
                }
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0880f interfaceC0880f, InterfaceC0841v interfaceC0841v, p129m8.e eVar) {
            super(2, eVar);
            this.f3366s = interfaceC0880f;
            this.f3367t = interfaceC0841v;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = new b(this.f3366s, this.f3367t, eVar);
            bVar.f3365r = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v4, types: [h8.A, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3364q;
            try {
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    F8.L l9 = (F8.L) this.f3365r;
                    kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
                    InterfaceC0880f interfaceC0880f = this.f3366s;
                    a aVar = new a(e10, l9, this.f3367t);
                    this.f3364q = 1;
                    if (interfaceC0880f.a(aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                this = p079h8.A.f21846a;
                return this;
            } catch (Throwable th) {
                this.f3367t.A0(th);
                throw th;
            }
        }
    }

    public static final E a(z zVar) {
        return new B(zVar, null);
    }

    public static final O b(A a10) {
        return new C(a10, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    private static final J c(InterfaceC0880f interfaceC0880f, int i10) {
        J8.e eVar;
        InterfaceC0880f interfaceC0880fM;
        int iF = B8.h.f(i10, H8.g.f2619f.a()) - i10;
        if (!(interfaceC0880f instanceof J8.e) || (interfaceC0880fM = (eVar = (J8.e) interfaceC0880f).m()) == null) {
            return new J(interfaceC0880f, iF, H8.a.SUSPEND, p129m8.j.f23252q);
        }
        int i11 = eVar.f3890r;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iF = i11;
        } else if (eVar.f3891s == H8.a.SUSPEND) {
            if (i11 == 0) {
                iF = 0;
            }
        } else if (i10 == 0) {
            iF = 1;
        } else {
            iF = 0;
        }
        return new J(interfaceC0880fM, iF, eVar.f3891s, eVar.f3889q);
    }

    private static final InterfaceC0846x0 d(F8.L l9, p129m8.i iVar, InterfaceC0880f interfaceC0880f, z zVar, K k9, Object obj) {
        return AbstractC0812g.c(l9, iVar, kotlin.jvm.internal.n.d(k9, K.f3174a.c()) ? F8.N.DEFAULT : F8.N.UNDISPATCHED, new a(k9, interfaceC0880f, zVar, obj, null));
    }

    private static final void e(F8.L l9, p129m8.i iVar, InterfaceC0880f interfaceC0880f, InterfaceC0841v interfaceC0841v) {
        AbstractC0816i.d(l9, iVar, null, new b(interfaceC0880f, interfaceC0841v, null), 2, null);
    }

    public static final E f(InterfaceC0880f interfaceC0880f, F8.L l9, K k9, int i10) {
        J jC = c(interfaceC0880f, i10);
        z zVarA = G.a(i10, jC.f3171b, jC.f3172c);
        return new B(zVarA, d(l9, jC.f3173d, jC.f3170a, zVarA, k9, G.f3162a));
    }

    public static final O g(InterfaceC0880f interfaceC0880f, F8.L l9, K k9, Object obj) {
        J jC = c(interfaceC0880f, 1);
        A a10 = Q.a(obj);
        return new C(a10, d(l9, jC.f3173d, jC.f3170a, a10, k9, obj));
    }

    public static final Object h(InterfaceC0880f interfaceC0880f, F8.L l9, p129m8.e eVar) {
        J jC = c(interfaceC0880f, 1);
        InterfaceC0841v interfaceC0841vB = AbstractC0845x.b(null, 1, null);
        e(l9, jC.f3173d, jC.f3170a, interfaceC0841vB);
        return interfaceC0841vB.P0(eVar);
    }
}
