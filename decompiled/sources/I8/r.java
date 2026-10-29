package I8;

import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class r {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3260q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3261r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3262s;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3261r = obj;
            this.f3262s |= Integer.MIN_VALUE;
            return r.c(null, null, null, this);
        }
    }

    public static final class b implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3263q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.q f3264r;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f3265q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f3266r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f3268t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f3269u;

            public a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3265q = obj;
                this.f3266r |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(InterfaceC0880f interfaceC0880f, p219v8.q qVar) {
            this.f3263q = interfaceC0880f;
            this.f3264r = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) throws Throwable {
            a aVar;
            J8.v vVar;
            J8.v vVar2;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i10 = aVar.f3266r;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f3266r = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj = aVar.f3265q;
            Object objE = p139n8.b.e();
            int i11 = aVar.f3266r;
            try {
                try {
                    if (i11 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880f = this.f3263q;
                        aVar.f3268t = this;
                        aVar.f3269u = interfaceC0881g;
                        aVar.f3266r = 1;
                        if (interfaceC0880f.a(interfaceC0881g, aVar) != objE) {
                        }
                        return objE;
                    }
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Throwable th = (Throwable) aVar.f3268t;
                            p079h8.r.b(obj);
                            throw th;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar2 = (J8.v) aVar.f3268t;
                        try {
                            p079h8.r.b(obj);
                            vVar2.releaseIntercepted();
                            return p079h8.A.f21846a;
                        } catch (Throwable th2) {
                            th = th2;
                            vVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    interfaceC0881g = (InterfaceC0881g) aVar.f3269u;
                    this = (b) aVar.f3268t;
                    p079h8.r.b(obj);
                    p219v8.q qVar = this.f3264r;
                    aVar.f3268t = vVar;
                    aVar.f3269u = null;
                    aVar.f3266r = 3;
                    kotlin.jvm.internal.m.a(6);
                    Object objE2 = qVar.e(vVar, null, aVar);
                    kotlin.jvm.internal.m.a(7);
                    if (objE2 != objE) {
                        vVar2 = vVar;
                        vVar2.releaseIntercepted();
                        return p079h8.A.f21846a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    vVar2 = vVar;
                    vVar2.releaseIntercepted();
                    throw th;
                }
                vVar = new J8.v(interfaceC0881g, aVar.getContext());
            } catch (Throwable th4) {
                b bVar = this;
                T t9 = new T(th4);
                p219v8.q qVar2 = bVar.f3264r;
                aVar.f3268t = th4;
                aVar.f3269u = null;
                aVar.f3266r = 2;
                if (r.c(t9, qVar2, th4, aVar) != objE) {
                    throw th4;
                }
            }
            return objE;
        }
    }

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p219v8.p f3270q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3271r;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f3272q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f3273r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f3275t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f3276u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f3277v;

            public a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3272q = obj;
                this.f3273r |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(p219v8.p pVar, InterfaceC0880f interfaceC0880f) {
            this.f3270q = pVar;
            this.f3271r = interfaceC0880f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            if (r5.a(r6, r0) == r1) goto L27;
         */
        @Override // I8.InterfaceC0880f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(I8.InterfaceC0881g r6, p129m8.e r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof I8.r.c.a
                if (r0 == 0) goto L13
                r0 = r7
                I8.r$c$a r0 = (I8.r.c.a) r0
                int r1 = r0.f3273r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f3273r = r1
                goto L18
            L13:
                I8.r$c$a r0 = new I8.r$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f3272q
                java.lang.Object r1 = p139n8.b.e()
                int r2 = r0.f3273r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p079h8.r.b(r7)
                goto L82
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f3277v
                J8.v r5 = (J8.v) r5
                java.lang.Object r6 = r0.f3276u
                I8.g r6 = (I8.InterfaceC0881g) r6
                java.lang.Object r2 = r0.f3275t
                I8.r$c r2 = (I8.r.c) r2
                p079h8.r.b(r7)     // Catch: java.lang.Throwable -> L44
                goto L6d
            L44:
                r6 = move-exception
                goto L87
            L46:
                p079h8.r.b(r7)
                J8.v r7 = new J8.v
                m8.i r2 = r0.getContext()
                r7.<init>(r6, r2)
                v8.p r2 = r5.f3270q     // Catch: java.lang.Throwable -> L85
                r0.f3275t = r5     // Catch: java.lang.Throwable -> L85
                r0.f3276u = r6     // Catch: java.lang.Throwable -> L85
                r0.f3277v = r7     // Catch: java.lang.Throwable -> L85
                r0.f3273r = r4     // Catch: java.lang.Throwable -> L85
                r4 = 6
                kotlin.jvm.internal.m.a(r4)     // Catch: java.lang.Throwable -> L85
                java.lang.Object r2 = r2.invoke(r7, r0)     // Catch: java.lang.Throwable -> L85
                r4 = 7
                kotlin.jvm.internal.m.a(r4)     // Catch: java.lang.Throwable -> L85
                if (r2 != r1) goto L6b
                goto L81
            L6b:
                r2 = r5
                r5 = r7
            L6d:
                r5.releaseIntercepted()
                I8.f r5 = r2.f3271r
                r7 = 0
                r0.f3275t = r7
                r0.f3276u = r7
                r0.f3277v = r7
                r0.f3273r = r3
                java.lang.Object r5 = r5.a(r6, r0)
                if (r5 != r1) goto L82
            L81:
                return r1
            L82:
                h8.A r5 = p079h8.A.f21846a
                return r5
            L85:
                r6 = move-exception
                r5 = r7
            L87:
                r5.releaseIntercepted()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.r.c.a(I8.g, m8.e):java.lang.Object");
        }
    }

    public static final void b(InterfaceC0881g interfaceC0881g) {
        if (interfaceC0881g instanceof T) {
            throw ((T) interfaceC0881g).f3207q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(InterfaceC0881g interfaceC0881g, p219v8.q qVar, Throwable th, p129m8.e eVar) {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f3262s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3262s = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f3261r;
        Object objE = p139n8.b.e();
        int i11 = aVar.f3262s;
        try {
            if (i11 == 0) {
                p079h8.r.b(obj);
                aVar.f3260q = th;
                aVar.f3262s = 1;
                if (qVar.e(interfaceC0881g, th, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) aVar.f3260q;
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC1388c.a(th2, th);
            }
            throw th2;
        }
    }

    public static final InterfaceC0880f d(InterfaceC0880f interfaceC0880f, p219v8.q qVar) {
        return new b(interfaceC0880f, qVar);
    }

    public static final InterfaceC0880f e(InterfaceC0880f interfaceC0880f, p219v8.p pVar) {
        return new c(pVar, interfaceC0880f);
    }
}
