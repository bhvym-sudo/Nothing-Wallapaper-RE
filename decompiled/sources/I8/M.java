package I8;

/* JADX INFO: loaded from: classes2.dex */
final class M implements K {

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3178q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3179r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ O f3180s;

        /* JADX INFO: renamed from: I8.M$a$a, reason: collision with other inner class name */
        static final class C0104a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.A f3181q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3182r;

            /* JADX INFO: renamed from: I8.M$a$a$a, reason: collision with other inner class name */
            static final class C0105a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f3183q;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f3185s;

                C0105a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3183q = obj;
                    this.f3185s |= Integer.MIN_VALUE;
                    return C0104a.this.a(0, this);
                }
            }

            C0104a(kotlin.jvm.internal.A a10, InterfaceC0881g interfaceC0881g) {
                this.f3181q = a10;
                this.f3182r = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(int i10, p129m8.e eVar) {
                C0105a c0105a;
                if (eVar instanceof C0105a) {
                    c0105a = (C0105a) eVar;
                    int i11 = c0105a.f3185s;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0105a.f3185s = i11 - Integer.MIN_VALUE;
                    } else {
                        c0105a = new C0105a(eVar);
                    }
                } else {
                    c0105a = new C0105a(eVar);
                }
                Object obj = c0105a.f3183q;
                Object objE = p139n8.b.e();
                int i12 = c0105a.f3185s;
                if (i12 == 0) {
                    p079h8.r.b(obj);
                    if (i10 > 0) {
                        kotlin.jvm.internal.A a10 = this.f3181q;
                        if (!a10.f22775q) {
                            a10.f22775q = true;
                            InterfaceC0881g interfaceC0881g = this.f3182r;
                            I i13 = I.START;
                            c0105a.f3185s = 1;
                            if (interfaceC0881g.b(i13, c0105a) == objE) {
                                return objE;
                            }
                        }
                    }
                    return p079h8.A.f21846a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                return p079h8.A.f21846a;
            }

            @Override // I8.InterfaceC0881g
            public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                return a(((Number) obj).intValue(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O o9, p129m8.e eVar) {
            super(2, eVar);
            this.f3180s = o9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f3180s, eVar);
            aVar.f3179r = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3178q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f3179r;
                kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
                O o9 = this.f3180s;
                C0104a c0104a = new C0104a(a10, interfaceC0881g);
                this.f3178q = 1;
                if (o9.a(c0104a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            throw new p079h8.f();
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((a) create(interfaceC0881g, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    @Override // I8.K
    public InterfaceC0880f a(O o9) {
        return AbstractC0882h.A(new a(o9, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
