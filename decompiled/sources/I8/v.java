package I8;

import F8.A0;
import J8.C0905a;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class v {

    public static final class a implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3330q;

        public a(kotlin.jvm.internal.E e10) {
            this.f3330q = e10;
        }

        @Override // I8.InterfaceC0881g
        public Object b(Object obj, p129m8.e eVar) {
            this.f3330q.f22779q = obj;
            throw new C0905a(this);
        }
    }

    public static final class b implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p219v8.p f3331q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3332r;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f3333q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f3334r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f3335s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f3337u;

            public a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3334r = obj;
                this.f3335s |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        public b(p219v8.p pVar, kotlin.jvm.internal.E e10) {
            this.f3331q = pVar;
            this.f3332r = e10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // I8.InterfaceC0881g
        public Object b(Object obj, p129m8.e eVar) {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i10 = aVar.f3335s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f3335s = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objInvoke = aVar.f3334r;
            Object objE = p139n8.b.e();
            int i11 = aVar.f3335s;
            if (i11 == 0) {
                p079h8.r.b(objInvoke);
                p219v8.p pVar = this.f3331q;
                aVar.f3333q = this;
                aVar.f3337u = obj;
                aVar.f3335s = 1;
                kotlin.jvm.internal.m.a(6);
                objInvoke = pVar.invoke(obj, aVar);
                kotlin.jvm.internal.m.a(7);
                if (objInvoke == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f3337u;
                this = (b) aVar.f3333q;
                p079h8.r.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return p079h8.A.f21846a;
            }
            this.f3332r.f22779q = obj;
            throw new C0905a(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3338q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3339r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3340s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3341t;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3340s = obj;
            this.f3341t |= Integer.MIN_VALUE;
            return AbstractC0882h.x(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3342q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3343r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3344s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3345t;

        d(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3344s = obj;
            this.f3345t |= Integer.MIN_VALUE;
            return AbstractC0882h.y(null, null, this);
        }
    }

    public static final class e implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3346q;

        public e(kotlin.jvm.internal.E e10) {
            this.f3346q = e10;
        }

        @Override // I8.InterfaceC0881g
        public Object b(Object obj, p129m8.e eVar) {
            this.f3346q.f22779q = obj;
            throw new C0905a(this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3347q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3348r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3349s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3350t;

        f(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3349s = obj;
            this.f3350t |= Integer.MIN_VALUE;
            return AbstractC0882h.z(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InterfaceC0880f interfaceC0880f, p129m8.e eVar) {
        c cVar;
        kotlin.jvm.internal.E e10;
        C0905a e11;
        InterfaceC0881g interfaceC0881g;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i10 = cVar.f3341t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f3341t = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f3340s;
        Object objE = p139n8.b.e();
        int i11 = cVar.f3341t;
        if (i11 == 0) {
            p079h8.r.b(obj);
            kotlin.jvm.internal.E e12 = new kotlin.jvm.internal.E();
            e12.f22779q = J8.t.f3956a;
            InterfaceC0881g aVar = new a(e12);
            try {
                cVar.f3338q = e12;
                cVar.f3339r = aVar;
                cVar.f3341t = 1;
                if (interfaceC0880f.a(aVar, cVar) == objE) {
                    return objE;
                }
                e10 = e12;
            } catch (C0905a e13) {
                e10 = e12;
                e11 = e13;
                interfaceC0881g = aVar;
                J8.p.a(e11, interfaceC0881g);
                A0.j(cVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0881g = (a) cVar.f3339r;
            e10 = (kotlin.jvm.internal.E) cVar.f3338q;
            try {
                p079h8.r.b(obj);
            } catch (C0905a e14) {
                e11 = e14;
                J8.p.a(e11, interfaceC0881g);
                A0.j(cVar.getContext());
            }
        }
        Object obj2 = e10.f22779q;
        if (obj2 != J8.t.f3956a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(InterfaceC0880f interfaceC0880f, p219v8.p pVar, p129m8.e eVar) {
        d dVar;
        kotlin.jvm.internal.E e10;
        C0905a e11;
        InterfaceC0881g interfaceC0881g;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i10 = dVar.f3345t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f3345t = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f3344s;
        Object objE = p139n8.b.e();
        int i11 = dVar.f3345t;
        if (i11 == 0) {
            p079h8.r.b(obj);
            kotlin.jvm.internal.E e12 = new kotlin.jvm.internal.E();
            e12.f22779q = J8.t.f3956a;
            InterfaceC0881g bVar = new b(pVar, e12);
            try {
                dVar.f3342q = e12;
                dVar.f3343r = bVar;
                dVar.f3345t = 1;
                if (interfaceC0880f.a(bVar, dVar) == objE) {
                    return objE;
                }
                e10 = e12;
            } catch (C0905a e13) {
                e10 = e12;
                e11 = e13;
                interfaceC0881g = bVar;
                J8.p.a(e11, interfaceC0881g);
                A0.j(dVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0881g = (b) dVar.f3343r;
            e10 = (kotlin.jvm.internal.E) dVar.f3342q;
            try {
                p079h8.r.b(obj);
            } catch (C0905a e14) {
                e11 = e14;
                J8.p.a(e11, interfaceC0881g);
                A0.j(dVar.getContext());
            }
        }
        Object obj2 = e10.f22779q;
        if (obj2 != J8.t.f3956a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(InterfaceC0880f interfaceC0880f, p129m8.e eVar) {
        f fVar;
        kotlin.jvm.internal.E e10;
        C0905a e11;
        InterfaceC0881g interfaceC0881g;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i10 = fVar.f3350t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f3350t = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f3349s;
        Object objE = p139n8.b.e();
        int i11 = fVar.f3350t;
        if (i11 == 0) {
            p079h8.r.b(obj);
            kotlin.jvm.internal.E e12 = new kotlin.jvm.internal.E();
            InterfaceC0881g eVar2 = new e(e12);
            try {
                fVar.f3347q = e12;
                fVar.f3348r = eVar2;
                fVar.f3350t = 1;
                if (interfaceC0880f.a(eVar2, fVar) == objE) {
                    return objE;
                }
                e10 = e12;
            } catch (C0905a e13) {
                e10 = e12;
                e11 = e13;
                interfaceC0881g = eVar2;
                J8.p.a(e11, interfaceC0881g);
                A0.j(fVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0881g = (e) fVar.f3348r;
            e10 = (kotlin.jvm.internal.E) fVar.f3347q;
            try {
                p079h8.r.b(obj);
            } catch (C0905a e14) {
                e11 = e14;
                J8.p.a(e11, interfaceC0881g);
                A0.j(fVar.getContext());
            }
        }
        return e10.f22779q;
    }
}
