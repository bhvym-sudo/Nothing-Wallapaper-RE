package I8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class x {

    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3371q;

        /* JADX INFO: renamed from: I8.x$a$a, reason: collision with other inner class name */
        public static final class C0114a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3372q;

            /* JADX INFO: renamed from: I8.x$a$a$a, reason: collision with other inner class name */
            public static final class C0115a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f3373q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f3374r;

                public C0115a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3373q = obj;
                    this.f3374r |= Integer.MIN_VALUE;
                    return C0114a.this.b(null, this);
                }
            }

            public C0114a(InterfaceC0881g interfaceC0881g) {
                this.f3372q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0115a c0115a;
                if (eVar instanceof C0115a) {
                    c0115a = (C0115a) eVar;
                    int i10 = c0115a.f3374r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0115a.f3374r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0115a = new C0115a(eVar);
                    }
                } else {
                    c0115a = new C0115a(eVar);
                }
                Object obj2 = c0115a.f3373q;
                Object objE = p139n8.b.e();
                int i11 = c0115a.f3374r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f3372q;
                    if (obj != null) {
                        c0115a.f3374r = 1;
                        if (interfaceC0881g.b(obj, c0115a) == objE) {
                            return objE;
                        }
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

        public a(InterfaceC0880f interfaceC0880f) {
            this.f3371q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f3371q.a(new C0114a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final InterfaceC0880f a(InterfaceC0880f interfaceC0880f) {
        return new a(interfaceC0880f);
    }
}
