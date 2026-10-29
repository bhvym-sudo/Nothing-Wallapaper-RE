package I8;

/* JADX INFO: renamed from: I8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0878d implements InterfaceC0880f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC0880f f3218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p219v8.l f3219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p219v8.p f3220s;

    /* JADX INFO: renamed from: I8.d$a */
    static final class a implements InterfaceC0881g {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3222r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3223s;

        /* JADX INFO: renamed from: I8.d$a$a, reason: collision with other inner class name */
        static final class C0107a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f3224q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f3226s;

            C0107a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3224q = obj;
                this.f3226s |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        a(kotlin.jvm.internal.E e10, InterfaceC0881g interfaceC0881g) {
            this.f3222r = e10;
            this.f3223s = interfaceC0881g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // I8.InterfaceC0881g
        public final Object b(Object obj, p129m8.e eVar) {
            C0107a c0107a;
            if (eVar instanceof C0107a) {
                c0107a = (C0107a) eVar;
                int i10 = c0107a.f3226s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0107a.f3226s = i10 - Integer.MIN_VALUE;
                } else {
                    c0107a = new C0107a(eVar);
                }
            } else {
                c0107a = new C0107a(eVar);
            }
            Object obj2 = c0107a.f3224q;
            Object objE = p139n8.b.e();
            int i11 = c0107a.f3226s;
            if (i11 == 0) {
                p079h8.r.b(obj2);
                Object objF = C0878d.this.f3219r.f(obj);
                Object obj3 = this.f3222r.f22779q;
                if (obj3 != J8.t.f3956a && ((Boolean) C0878d.this.f3220s.invoke(obj3, objF)).booleanValue()) {
                    return p079h8.A.f21846a;
                }
                this.f3222r.f22779q = objF;
                InterfaceC0881g interfaceC0881g = this.f3223s;
                c0107a.f3226s = 1;
                if (interfaceC0881g.b(obj, c0107a) == objE) {
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

    public C0878d(InterfaceC0880f interfaceC0880f, p219v8.l lVar, p219v8.p pVar) {
        this.f3218q = interfaceC0880f;
        this.f3219r = lVar;
        this.f3220s = pVar;
    }

    @Override // I8.InterfaceC0880f
    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        e10.f22779q = J8.t.f3956a;
        Object objA = this.f3218q.a(new a(e10, interfaceC0881g), eVar);
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }
}
