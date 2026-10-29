package I8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class y {

    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f[] f3376q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.r f3377r;

        /* JADX INFO: renamed from: I8.y$a$a, reason: collision with other inner class name */
        public static final class C0116a extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3378q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f3379r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f3380s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p219v8.r f3381t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0116a(p129m8.e eVar, p219v8.r rVar) {
                super(3, eVar);
                this.f3381t = rVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
            
                if (r1.b(r8, r7) == r0) goto L15;
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
                    int r1 = r7.f3378q
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    p079h8.r.b(r8)
                    goto L56
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L1a:
                    java.lang.Object r1 = r7.f3379r
                    I8.g r1 = (I8.InterfaceC0881g) r1
                    p079h8.r.b(r8)
                    goto L4a
                L22:
                    p079h8.r.b(r8)
                    java.lang.Object r8 = r7.f3379r
                    r1 = r8
                    I8.g r1 = (I8.InterfaceC0881g) r1
                    java.lang.Object r8 = r7.f3380s
                    java.lang.Object[] r8 = (java.lang.Object[]) r8
                    v8.r r4 = r7.f3381t
                    r5 = 0
                    r5 = r8[r5]
                    r6 = r8[r3]
                    r8 = r8[r2]
                    r7.f3379r = r1
                    r7.f3378q = r3
                    r3 = 6
                    kotlin.jvm.internal.m.a(r3)
                    java.lang.Object r8 = r4.j(r5, r6, r8, r7)
                    r3 = 7
                    kotlin.jvm.internal.m.a(r3)
                    if (r8 != r0) goto L4a
                    goto L55
                L4a:
                    r3 = 0
                    r7.f3379r = r3
                    r7.f3378q = r2
                    java.lang.Object r7 = r1.b(r8, r7)
                    if (r7 != r0) goto L56
                L55:
                    return r0
                L56:
                    h8.A r7 = p079h8.A.f21846a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: I8.y.a.C0116a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p219v8.q
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object e(InterfaceC0881g interfaceC0881g, Object[] objArr, p129m8.e eVar) {
                C0116a c0116a = new C0116a(eVar, this.f3381t);
                c0116a.f3379r = interfaceC0881g;
                c0116a.f3380s = objArr;
                return c0116a.invokeSuspend(p079h8.A.f21846a);
            }
        }

        public a(InterfaceC0880f[] interfaceC0880fArr, p219v8.r rVar) {
            this.f3376q = interfaceC0880fArr;
            this.f3377r = rVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = J8.l.a(interfaceC0881g, this.f3376q, y.f(), new C0116a(null, this.f3377r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class b implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f[] f3382q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.s f3383r;

        public static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3384q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f3385r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f3386s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p219v8.s f3387t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p129m8.e eVar, p219v8.s sVar) {
                super(3, eVar);
                this.f3387t = sVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
            
                if (r1.b(r11, r9) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = p139n8.b.e()
                    int r1 = r10.f3384q
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    p079h8.r.b(r11)
                    goto L5b
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L1a:
                    java.lang.Object r1 = r10.f3385r
                    I8.g r1 = (I8.InterfaceC0881g) r1
                    p079h8.r.b(r11)
                    r9 = r10
                    goto L4f
                L23:
                    p079h8.r.b(r11)
                    java.lang.Object r11 = r10.f3385r
                    r1 = r11
                    I8.g r1 = (I8.InterfaceC0881g) r1
                    java.lang.Object r11 = r10.f3386s
                    java.lang.Object[] r11 = (java.lang.Object[]) r11
                    v8.s r4 = r10.f3387t
                    r5 = 0
                    r5 = r11[r5]
                    r6 = r11[r3]
                    r7 = r11[r2]
                    r8 = 3
                    r8 = r11[r8]
                    r10.f3385r = r1
                    r10.f3384q = r3
                    r11 = 6
                    kotlin.jvm.internal.m.a(r11)
                    r9 = r10
                    java.lang.Object r11 = r4.n(r5, r6, r7, r8, r9)
                    r10 = 7
                    kotlin.jvm.internal.m.a(r10)
                    if (r11 != r0) goto L4f
                    goto L5a
                L4f:
                    r10 = 0
                    r9.f3385r = r10
                    r9.f3384q = r2
                    java.lang.Object r10 = r1.b(r11, r9)
                    if (r10 != r0) goto L5b
                L5a:
                    return r0
                L5b:
                    h8.A r10 = p079h8.A.f21846a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: I8.y.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p219v8.q
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object e(InterfaceC0881g interfaceC0881g, Object[] objArr, p129m8.e eVar) {
                a aVar = new a(eVar, this.f3387t);
                aVar.f3385r = interfaceC0881g;
                aVar.f3386s = objArr;
                return aVar.invokeSuspend(p079h8.A.f21846a);
            }
        }

        public b(InterfaceC0880f[] interfaceC0880fArr, p219v8.s sVar) {
            this.f3382q = interfaceC0880fArr;
            this.f3383r = sVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = J8.l.a(interfaceC0881g, this.f3382q, y.f(), new a(null, this.f3383r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3388q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3389r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.q f3390s;

        public c(InterfaceC0880f interfaceC0880f, InterfaceC0880f interfaceC0880f2, p219v8.q qVar) {
            this.f3388q = interfaceC0880f;
            this.f3389r = interfaceC0880f2;
            this.f3390s = qVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = J8.l.a(interfaceC0881g, new InterfaceC0880f[]{this.f3388q, this.f3389r}, y.f(), new d(this.f3390s, null), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3391q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3392r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.q f3394t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p219v8.q qVar, p129m8.e eVar) {
            super(3, eVar);
            this.f3394t = qVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.b(r7, r6) == r0) goto L15;
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
                int r1 = r6.f3391q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                java.lang.Object r1 = r6.f3392r
                I8.g r1 = (I8.InterfaceC0881g) r1
                p079h8.r.b(r7)
                goto L40
            L22:
                p079h8.r.b(r7)
                java.lang.Object r7 = r6.f3392r
                r1 = r7
                I8.g r1 = (I8.InterfaceC0881g) r1
                java.lang.Object r7 = r6.f3393s
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                v8.q r4 = r6.f3394t
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f3392r = r1
                r6.f3391q = r3
                java.lang.Object r7 = r4.e(r5, r7, r6)
                if (r7 != r0) goto L40
                goto L4b
            L40:
                r3 = 0
                r6.f3392r = r3
                r6.f3391q = r2
                java.lang.Object r6 = r1.b(r7, r6)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                h8.A r6 = p079h8.A.f21846a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.y.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Object[] objArr, p129m8.e eVar) {
            d dVar = new d(this.f3394t, eVar);
            dVar.f3392r = interfaceC0881g;
            dVar.f3393s = objArr;
            return dVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class e implements p219v8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final e f3395q = new e();

        e() {
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final InterfaceC0880f b(InterfaceC0880f interfaceC0880f, InterfaceC0880f interfaceC0880f2, InterfaceC0880f interfaceC0880f3, InterfaceC0880f interfaceC0880f4, p219v8.s sVar) {
        return new b(new InterfaceC0880f[]{interfaceC0880f, interfaceC0880f2, interfaceC0880f3, interfaceC0880f4}, sVar);
    }

    public static final InterfaceC0880f c(InterfaceC0880f interfaceC0880f, InterfaceC0880f interfaceC0880f2, InterfaceC0880f interfaceC0880f3, p219v8.r rVar) {
        return new a(new InterfaceC0880f[]{interfaceC0880f, interfaceC0880f2, interfaceC0880f3}, rVar);
    }

    public static final InterfaceC0880f d(InterfaceC0880f interfaceC0880f, InterfaceC0880f interfaceC0880f2, p219v8.q qVar) {
        return AbstractC0882h.B(interfaceC0880f, interfaceC0880f2, qVar);
    }

    public static final InterfaceC0880f e(InterfaceC0880f interfaceC0880f, InterfaceC0880f interfaceC0880f2, p219v8.q qVar) {
        return new c(interfaceC0880f, interfaceC0880f2, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p219v8.a f() {
        return e.f3395q;
    }
}
