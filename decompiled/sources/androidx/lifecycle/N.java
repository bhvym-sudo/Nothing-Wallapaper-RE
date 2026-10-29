package androidx.lifecycle;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0826n;
import F8.H0;
import F8.InterfaceC0822l;
import F8.InterfaceC0846x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13300q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f13301r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractC1157q f13302s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AbstractC1157q.b f13303t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p219v8.p f13304u;

        /* JADX INFO: renamed from: androidx.lifecycle.N$a$a, reason: collision with other inner class name */
        static final class C0394a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: A, reason: collision with root package name */
            final /* synthetic */ p219v8.p f13305A;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f13306q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f13307r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f13308s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f13309t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f13310u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f13311v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f13312w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ AbstractC1157q f13313x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ AbstractC1157q.b f13314y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ F8.L f13315z;

            /* JADX INFO: renamed from: androidx.lifecycle.N$a$a$a, reason: collision with other inner class name */
            static final class C0395a implements InterfaceC1160u {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ AbstractC1157q.a f13316q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.E f13317r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ F8.L f13318s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ AbstractC1157q.a f13319t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ InterfaceC0822l f13320u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ O8.a f13321v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                final /* synthetic */ p219v8.p f13322w;

                /* JADX INFO: renamed from: androidx.lifecycle.N$a$a$a$a, reason: collision with other inner class name */
                static final class C0396a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f13323q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    Object f13324r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f13325s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ O8.a f13326t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    final /* synthetic */ p219v8.p f13327u;

                    /* JADX INFO: renamed from: androidx.lifecycle.N$a$a$a$a$a, reason: collision with other inner class name */
                    static final class C0397a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        int f13328q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        private /* synthetic */ Object f13329r;

                        /* JADX INFO: renamed from: s, reason: collision with root package name */
                        final /* synthetic */ p219v8.p f13330s;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0397a(p219v8.p pVar, p129m8.e eVar) {
                            super(2, eVar);
                            this.f13330s = pVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final p129m8.e create(Object obj, p129m8.e eVar) {
                            C0397a c0397a = new C0397a(this.f13330s, eVar);
                            c0397a.f13329r = obj;
                            return c0397a;
                        }

                        @Override // p219v8.p
                        public final Object invoke(F8.L l9, p129m8.e eVar) {
                            return ((C0397a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object objE = p139n8.b.e();
                            int i10 = this.f13328q;
                            if (i10 == 0) {
                                p079h8.r.b(obj);
                                F8.L l9 = (F8.L) this.f13329r;
                                p219v8.p pVar = this.f13330s;
                                this.f13328q = 1;
                                if (pVar.invoke(l9, this) == objE) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0396a(O8.a aVar, p219v8.p pVar, p129m8.e eVar) {
                        super(2, eVar);
                        this.f13326t = aVar;
                        this.f13327u = pVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final p129m8.e create(Object obj, p129m8.e eVar) {
                        return new C0396a(this.f13326t, this.f13327u, eVar);
                    }

                    @Override // p219v8.p
                    public final Object invoke(F8.L l9, p129m8.e eVar) {
                        return ((C0396a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        O8.a aVar;
                        p219v8.p pVar;
                        Throwable th;
                        O8.a aVar2;
                        Object objE = p139n8.b.e();
                        int i10 = this.f13325s;
                        try {
                            if (i10 == 0) {
                                p079h8.r.b(obj);
                                aVar = this.f13326t;
                                pVar = this.f13327u;
                                this.f13323q = aVar;
                                this.f13324r = pVar;
                                this.f13325s = 1;
                                if (aVar.c(null, this) != objE) {
                                }
                                return objE;
                            }
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (O8.a) this.f13323q;
                                try {
                                    p079h8.r.b(obj);
                                    p079h8.A a10 = p079h8.A.f21846a;
                                    aVar2.b(null);
                                    return p079h8.A.f21846a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar2.b(null);
                                    throw th;
                                }
                            }
                            pVar = (p219v8.p) this.f13324r;
                            O8.a aVar3 = (O8.a) this.f13323q;
                            p079h8.r.b(obj);
                            aVar = aVar3;
                            C0397a c0397a = new C0397a(pVar, null);
                            this.f13323q = aVar;
                            this.f13324r = null;
                            this.f13325s = 2;
                            if (F8.M.e(c0397a, this) != objE) {
                                aVar2 = aVar;
                                p079h8.A a11 = p079h8.A.f21846a;
                                aVar2.b(null);
                                return p079h8.A.f21846a;
                            }
                            return objE;
                        } catch (Throwable th3) {
                            O8.a aVar4 = aVar;
                            th = th3;
                            aVar2 = aVar4;
                            aVar2.b(null);
                            throw th;
                        }
                    }
                }

                C0395a(AbstractC1157q.a aVar, kotlin.jvm.internal.E e10, F8.L l9, AbstractC1157q.a aVar2, InterfaceC0822l interfaceC0822l, O8.a aVar3, p219v8.p pVar) {
                    this.f13316q = aVar;
                    this.f13317r = e10;
                    this.f13318s = l9;
                    this.f13319t = aVar2;
                    this.f13320u = interfaceC0822l;
                    this.f13321v = aVar3;
                    this.f13322w = pVar;
                }

                @Override // androidx.lifecycle.InterfaceC1160u
                public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
                    kotlin.jvm.internal.n.h(interfaceC1163x, "<anonymous parameter 0>");
                    kotlin.jvm.internal.n.h(event, "event");
                    if (event == this.f13316q) {
                        this.f13317r.f22779q = AbstractC0816i.d(this.f13318s, null, null, new C0396a(this.f13321v, this.f13322w, null), 3, null);
                        return;
                    }
                    if (event == this.f13319t) {
                        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) this.f13317r.f22779q;
                        if (interfaceC0846x0 != null) {
                            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
                        }
                        this.f13317r.f22779q = null;
                    }
                    if (event == AbstractC1157q.a.ON_DESTROY) {
                        InterfaceC0822l interfaceC0822l = this.f13320u;
                        h8.q.a aVar = p079h8.q.f21862r;
                        interfaceC0822l.resumeWith(p079h8.q.b(p079h8.A.f21846a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0394a(AbstractC1157q abstractC1157q, AbstractC1157q.b bVar, F8.L l9, p219v8.p pVar, p129m8.e eVar) {
                super(2, eVar);
                this.f13313x = abstractC1157q;
                this.f13314y = bVar;
                this.f13315z = l9;
                this.f13305A = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0394a(this.f13313x, this.f13314y, this.f13315z, this.f13305A, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((C0394a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlin.jvm.internal.E e10;
                Throwable th;
                kotlin.jvm.internal.E e11;
                InterfaceC0846x0 interfaceC0846x0;
                InterfaceC1160u interfaceC1160u;
                InterfaceC0846x0 interfaceC0846x1;
                InterfaceC1160u interfaceC1160u2;
                Object objE = p139n8.b.e();
                int i10 = this.f13312w;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e10 = (kotlin.jvm.internal.E) this.f13307r;
                    e11 = (kotlin.jvm.internal.E) this.f13306q;
                    try {
                        p079h8.r.b(obj);
                        interfaceC0846x1 = (InterfaceC0846x0) e11.f22779q;
                        if (interfaceC0846x1 != null) {
                            InterfaceC0846x0.a.a(interfaceC0846x1, null, 1, null);
                        }
                        interfaceC1160u2 = (InterfaceC1160u) e10.f22779q;
                        if (interfaceC1160u2 != null) {
                            this.f13313x.d(interfaceC1160u2);
                        }
                        return p079h8.A.f21846a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC0846x0 = (InterfaceC0846x0) e11.f22779q;
                        if (interfaceC0846x0 != null) {
                            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
                        }
                        interfaceC1160u = (InterfaceC1160u) e10.f22779q;
                        if (interfaceC1160u != null) {
                            throw th;
                        }
                        this.f13313x.d(interfaceC1160u);
                        throw th;
                    }
                }
                p079h8.r.b(obj);
                if (this.f13313x.b() == AbstractC1157q.b.DESTROYED) {
                    return p079h8.A.f21846a;
                }
                kotlin.jvm.internal.E e12 = new kotlin.jvm.internal.E();
                e10 = new kotlin.jvm.internal.E();
                try {
                    AbstractC1157q.b bVar = this.f13314y;
                    AbstractC1157q abstractC1157q = this.f13313x;
                    F8.L l9 = this.f13315z;
                    p219v8.p pVar = this.f13305A;
                    this.f13306q = e12;
                    this.f13307r = e10;
                    this.f13308s = bVar;
                    this.f13309t = abstractC1157q;
                    this.f13310u = l9;
                    this.f13311v = pVar;
                    this.f13312w = 1;
                    C0826n c0826n = new C0826n(p139n8.b.c(this), 1);
                    c0826n.G();
                    AbstractC1157q.a.C0402a c0402a = AbstractC1157q.a.Companion;
                    C0395a c0395a = new C0395a(c0402a.c(bVar), e12, l9, c0402a.a(bVar), c0826n, O8.g.b(false, 1, null), pVar);
                    e10.f22779q = c0395a;
                    kotlin.jvm.internal.n.f(c0395a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    abstractC1157q.a(c0395a);
                    Object objA = c0826n.A();
                    if (objA == p139n8.b.e()) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (objA == objE) {
                        return objE;
                    }
                    e11 = e12;
                    interfaceC0846x1 = (InterfaceC0846x0) e11.f22779q;
                    if (interfaceC0846x1 != null) {
                        InterfaceC0846x0.a.a(interfaceC0846x1, null, 1, null);
                    }
                    interfaceC1160u2 = (InterfaceC1160u) e10.f22779q;
                    if (interfaceC1160u2 != null) {
                        this.f13313x.d(interfaceC1160u2);
                    }
                    return p079h8.A.f21846a;
                } catch (Throwable th3) {
                    th = th3;
                    e11 = e12;
                    interfaceC0846x0 = (InterfaceC0846x0) e11.f22779q;
                    if (interfaceC0846x0 != null) {
                        InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
                    }
                    interfaceC1160u = (InterfaceC1160u) e10.f22779q;
                    if (interfaceC1160u != null) {
                        throw th;
                    }
                    this.f13313x.d(interfaceC1160u);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC1157q abstractC1157q, AbstractC1157q.b bVar, p219v8.p pVar, p129m8.e eVar) {
            super(2, eVar);
            this.f13302s = abstractC1157q;
            this.f13303t = bVar;
            this.f13304u = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f13302s, this.f13303t, this.f13304u, eVar);
            aVar.f13301r = obj;
            return aVar;
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f13300q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                F8.L l9 = (F8.L) this.f13301r;
                H0 h0N1 = C0803b0.c().n1();
                C0394a c0394a = new C0394a(this.f13302s, this.f13303t, l9, this.f13304u, null);
                this.f13300q = 1;
                if (AbstractC0812g.g(h0N1, c0394a, this) == objE) {
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

    public static final Object a(AbstractC1157q abstractC1157q, AbstractC1157q.b bVar, p219v8.p pVar, p129m8.e eVar) {
        Object objE;
        if (bVar != AbstractC1157q.b.INITIALIZED) {
            return (abstractC1157q.b() != AbstractC1157q.b.DESTROYED && (objE = F8.M.e(new a(abstractC1157q, bVar, pVar, null), eVar)) == p139n8.b.e()) ? objE : p079h8.A.f21846a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object b(InterfaceC1163x interfaceC1163x, AbstractC1157q.b bVar, p219v8.p pVar, p129m8.e eVar) {
        Object objA = a(interfaceC1163x.getLifecycle(), bVar, pVar, eVar);
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }
}
