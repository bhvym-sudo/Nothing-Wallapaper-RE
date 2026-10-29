package J8;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import F8.M;
import F8.N;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p219v8.q f3903u;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3904q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3905r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3907t;

        /* JADX INFO: renamed from: J8.i$a$a, reason: collision with other inner class name */
        static final class C0135a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ E f3908q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ L f3909r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ i f3910s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f3911t;

            /* JADX INFO: renamed from: J8.i$a$a$a, reason: collision with other inner class name */
            static final class C0136a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f3912q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ i f3913r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ InterfaceC0881g f3914s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Object f3915t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0136a(i iVar, InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
                    super(2, eVar);
                    this.f3913r = iVar;
                    this.f3914s = interfaceC0881g;
                    this.f3915t = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0136a(this.f3913r, this.f3914s, this.f3915t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0136a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f3912q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        p219v8.q qVar = this.f3913r.f3903u;
                        InterfaceC0881g interfaceC0881g = this.f3914s;
                        Object obj2 = this.f3915t;
                        this.f3912q = 1;
                        if (qVar.e(interfaceC0881g, obj2, this) == objE) {
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
            }

            /* JADX INFO: renamed from: J8.i$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f3916q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f3917r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f3918s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                /* synthetic */ Object f3919t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                int f3921v;

                b(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3919t = obj;
                    this.f3921v |= Integer.MIN_VALUE;
                    return C0135a.this.b(null, this);
                }
            }

            C0135a(E e10, L l9, i iVar, InterfaceC0881g interfaceC0881g) {
                this.f3908q = e10;
                this.f3909r = l9;
                this.f3910s = iVar;
                this.f3911t = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                b bVar;
                if (eVar instanceof b) {
                    bVar = (b) eVar;
                    int i10 = bVar.f3921v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        bVar.f3921v = i10 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(eVar);
                    }
                } else {
                    bVar = new b(eVar);
                }
                Object obj2 = bVar.f3919t;
                Object objE = p139n8.b.e();
                int i11 = bVar.f3921v;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) this.f3908q.f22779q;
                    if (interfaceC0846x0 != null) {
                        interfaceC0846x0.f(new k());
                        bVar.f3916q = this;
                        bVar.f3917r = obj;
                        bVar.f3918s = interfaceC0846x0;
                        bVar.f3921v = 1;
                        if (interfaceC0846x0.Q(bVar) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = bVar.f3917r;
                    this = (C0135a) bVar.f3916q;
                    p079h8.r.b(obj2);
                }
                this.f3908q.f22779q = AbstractC0816i.d(this.f3909r, null, N.UNDISPATCHED, new C0136a(this.f3910s, this.f3911t, obj, null), 1, null);
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            super(2, eVar);
            this.f3907t = interfaceC0881g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = i.this.new a(this.f3907t, eVar);
            aVar.f3905r = obj;
            return aVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3904q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                L l9 = (L) this.f3905r;
                E e10 = new E();
                i iVar = i.this;
                InterfaceC0880f interfaceC0880f = iVar.f3899t;
                C0135a c0135a = new C0135a(e10, l9, iVar, this.f3907t);
                this.f3904q = 1;
                if (interfaceC0880f.a(c0135a, this) == objE) {
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
    }

    public /* synthetic */ i(p219v8.q qVar, InterfaceC0880f interfaceC0880f, p129m8.i iVar, int i10, H8.a aVar, int i11, AbstractC1457h abstractC1457h) {
        this(qVar, interfaceC0880f, (i11 & 4) != 0 ? p129m8.j.f23252q : iVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? H8.a.SUSPEND : aVar);
    }

    @Override // J8.e
    protected e k(p129m8.i iVar, int i10, H8.a aVar) {
        return new i(this.f3903u, this.f3899t, iVar, i10, aVar);
    }

    @Override // J8.g
    protected Object t(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        Object objE = M.e(new a(interfaceC0881g, null), eVar);
        return objE == p139n8.b.e() ? objE : p079h8.A.f21846a;
    }

    public i(p219v8.q qVar, InterfaceC0880f interfaceC0880f, p129m8.i iVar, int i10, H8.a aVar) {
        super(interfaceC0880f, iVar, i10, aVar);
        this.f3903u = qVar;
    }
}
