package I8;

/* JADX INFO: renamed from: I8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0888n {

    /* JADX INFO: renamed from: I8.n$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3236q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3237r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3238s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f3239t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3240u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ p219v8.l f3241v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3242w;

        /* JADX INFO: renamed from: I8.n$a$a, reason: collision with other inner class name */
        static final class C0108a extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3243q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3244r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.E f3245s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0108a(InterfaceC0881g interfaceC0881g, kotlin.jvm.internal.E e10, p129m8.e eVar) {
                super(1, eVar);
                this.f3244r = interfaceC0881g;
                this.f3245s = e10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(p129m8.e eVar) {
                return new C0108a(this.f3244r, this.f3245s, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f3243q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC0881g interfaceC0881g = this.f3244r;
                    K8.D d10 = J8.t.f3956a;
                    Object obj2 = this.f3245s.f22779q;
                    if (obj2 == d10) {
                        obj2 = null;
                    }
                    this.f3243q = 1;
                    if (interfaceC0881g.b(obj2, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                this.f3245s.f22779q = null;
                return p079h8.A.f21846a;
            }

            @Override // p219v8.l
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object f(p129m8.e eVar) {
                return ((C0108a) create(eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: I8.n$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f3246q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f3247r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f3248s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.E f3249t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3250u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.E e10, InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                super(2, eVar);
                this.f3249t = e10;
                this.f3250u = interfaceC0881g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                b bVar = new b(this.f3249t, this.f3250u, eVar);
                bVar.f3248s = obj;
                return bVar;
            }

            @Override // p219v8.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return s(((H8.k) obj).k(), (p129m8.e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlin.jvm.internal.E e10;
                kotlin.jvm.internal.E e11;
                Object objE = p139n8.b.e();
                int i10 = this.f3247r;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    Object objK = ((H8.k) this.f3248s).k();
                    e10 = this.f3249t;
                    boolean z9 = objK instanceof H8.k.c;
                    if (!z9) {
                        e10.f22779q = objK;
                    }
                    InterfaceC0881g interfaceC0881g = this.f3250u;
                    if (z9) {
                        Throwable thE = H8.k.e(objK);
                        if (thE != null) {
                            throw thE;
                        }
                        Object obj2 = e10.f22779q;
                        if (obj2 != null) {
                            if (obj2 == J8.t.f3956a) {
                                obj2 = null;
                            }
                            this.f3248s = objK;
                            this.f3246q = e10;
                            this.f3247r = 1;
                            if (interfaceC0881g.b(obj2, this) == objE) {
                                return objE;
                            }
                            e11 = e10;
                        }
                        e10.f22779q = J8.t.f3958c;
                    }
                    return p079h8.A.f21846a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e11 = (kotlin.jvm.internal.E) this.f3246q;
                p079h8.r.b(obj);
                e10 = e11;
                e10.f22779q = J8.t.f3958c;
                return p079h8.A.f21846a;
            }

            public final Object s(Object obj, p129m8.e eVar) {
                return ((b) create(H8.k.b(obj), eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX INFO: renamed from: I8.n$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3251q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f3252r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f f3253s;

            /* JADX INFO: renamed from: I8.n$a$c$a, reason: collision with other inner class name */
            static final class C0109a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ H8.t f3254q;

                /* JADX INFO: renamed from: I8.n$a$c$a$a, reason: collision with other inner class name */
                static final class C0110a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    /* synthetic */ Object f3255q;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f3257s;

                    C0110a(p129m8.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f3255q = obj;
                        this.f3257s |= Integer.MIN_VALUE;
                        return C0109a.this.b(null, this);
                    }
                }

                C0109a(H8.t tVar) {
                    this.f3254q = tVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // I8.InterfaceC0881g
                public final Object b(Object obj, p129m8.e eVar) {
                    C0110a c0110a;
                    if (eVar instanceof C0110a) {
                        c0110a = (C0110a) eVar;
                        int i10 = c0110a.f3257s;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0110a.f3257s = i10 - Integer.MIN_VALUE;
                        } else {
                            c0110a = new C0110a(eVar);
                        }
                    } else {
                        c0110a = new C0110a(eVar);
                    }
                    Object obj2 = c0110a.f3255q;
                    Object objE = p139n8.b.e();
                    int i11 = c0110a.f3257s;
                    if (i11 == 0) {
                        p079h8.r.b(obj2);
                        H8.t tVar = this.f3254q;
                        if (obj == null) {
                            obj = J8.t.f3956a;
                        }
                        c0110a.f3257s = 1;
                        if (tVar.n(obj, c0110a) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC0880f interfaceC0880f, p129m8.e eVar) {
                super(2, eVar);
                this.f3253s = interfaceC0880f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                c cVar = new c(this.f3253s, eVar);
                cVar.f3252r = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f3251q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    H8.t tVar = (H8.t) this.f3252r;
                    InterfaceC0880f interfaceC0880f = this.f3253s;
                    C0109a c0109a = new C0109a(tVar);
                    this.f3251q = 1;
                    if (interfaceC0880f.a(c0109a, this) == objE) {
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
            public final Object invoke(H8.t tVar, p129m8.e eVar) {
                return ((c) create(tVar, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p219v8.l lVar, InterfaceC0880f interfaceC0880f, p129m8.e eVar) {
            super(3, eVar);
            this.f3241v = lVar;
            this.f3242w = interfaceC0880f;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
        /* JADX WARN: Code duplicated, block: B:16:0x006f  */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
          0x00a4: PHI (r1v3 kotlin.jvm.internal.D) = (r1v5 kotlin.jvm.internal.D), (r1v7 kotlin.jvm.internal.D), (r1v7 kotlin.jvm.internal.D) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r5v3 kotlin.jvm.internal.E) = (r5v5 kotlin.jvm.internal.E), (r5v6 kotlin.jvm.internal.E), (r5v6 kotlin.jvm.internal.E) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r6v2 H8.v) = (r6v4 H8.v), (r6v5 H8.v), (r6v5 H8.v) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 I8.g) = (r7v4 I8.g), (r7v5 I8.g), (r7v5 I8.g) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            if (r7.b(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
        
            if (r7.o(r14) == r0) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.AbstractC0888n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(F8.L l9, InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            a aVar = new a(this.f3241v, this.f3242w, eVar);
            aVar.f3239t = l9;
            aVar.f3240u = interfaceC0881g;
            return aVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final InterfaceC0880f b(InterfaceC0880f interfaceC0880f, final long j9) {
        if (j9 >= 0) {
            return j9 == 0 ? interfaceC0880f : d(interfaceC0880f, new p219v8.l() { // from class: I8.m
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Long.valueOf(AbstractC0888n.c(j9, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(long j9, Object obj) {
        return j9;
    }

    private static final InterfaceC0880f d(InterfaceC0880f interfaceC0880f, p219v8.l lVar) {
        return J8.o.b(new a(lVar, interfaceC0880f, null));
    }
}
