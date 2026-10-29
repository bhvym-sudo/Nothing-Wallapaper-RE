package androidx.lifecycle;

import F8.AbstractC0812g;
import F8.C0803b0;
import F8.H0;
import F8.J0;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153m {

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13426q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f13427r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ C f13428s;

        /* JADX INFO: renamed from: androidx.lifecycle.m$a$a, reason: collision with other inner class name */
        static final class C0401a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f13429q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C f13430r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ I f13431s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0401a(C c10, I i10, p129m8.e eVar) {
                super(2, eVar);
                this.f13430r = c10;
                this.f13431s = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0401a(this.f13430r, this.f13431s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((C0401a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f13429q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f13430r.i(this.f13431s);
                return p079h8.A.f21846a;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.m$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f13432q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C f13433r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ I f13434s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C c10, I i10, p129m8.e eVar) {
                super(2, eVar);
                this.f13433r = c10;
                this.f13434s = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new b(this.f13433r, this.f13434s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f13432q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f13433r.i(this.f13434s);
                return p079h8.A.f21846a;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.m$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f13435q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ C f13436r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ I f13437s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C c10, I i10, p129m8.e eVar) {
                super(2, eVar);
                this.f13436r = c10;
                this.f13437s = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new c(this.f13436r, this.f13437s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f13435q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                this.f13436r.m(this.f13437s);
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C c10, p129m8.e eVar) {
            super(2, eVar);
            this.f13428s = c10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(H8.t tVar, Object obj) {
            tVar.p(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f13428s, eVar);
            aVar.f13427r = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x008a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.I] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            I i10;
            I i11;
            I i12;
            Object objE = p139n8.b.e();
            ?? r9 = this.f13426q;
            try {
                if (r9 == 0) {
                    p079h8.r.b(obj);
                    final H8.t tVar = (H8.t) this.f13427r;
                    i10 = new I() { // from class: androidx.lifecycle.l
                        @Override // androidx.lifecycle.I
                        public final void b(Object obj2) {
                            AbstractC1153m.a.v(tVar, obj2);
                        }
                    };
                    H0 h0N1 = C0803b0.c().n1();
                    C0401a c0401a = new C0401a(this.f13428s, i10, null);
                    this.f13427r = i10;
                    this.f13426q = 1;
                    if (AbstractC0812g.g(h0N1, c0401a, this) != objE) {
                    }
                    i11 = i10;
                    return objE;
                }
                if (r9 == 1) {
                    I i13 = (I) this.f13427r;
                    p079h8.r.b(obj);
                    i11 = i13;
                } else if (r9 == 2) {
                    I i14 = (I) this.f13427r;
                    p079h8.r.b(obj);
                    i12 = i14;
                    this.f13427r = i12;
                    this.f13426q = 3;
                    r9 = i12;
                    if (F8.W.a(this) == objE) {
                        i11 = i10;
                        return objE;
                    }
                } else {
                    if (r9 != 3) {
                        if (r9 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.f13427r;
                        p079h8.r.b(obj);
                        throw th;
                    }
                    I i15 = (I) this.f13427r;
                    p079h8.r.b(obj);
                    r9 = i15;
                }
                throw new p079h8.f();
                i11 = i10;
                H0 h0N2 = C0803b0.c().n1();
                b bVar = new b(this.f13428s, i11, null);
                this.f13427r = i11;
                this.f13426q = 2;
                i12 = i11;
                if (AbstractC0812g.g(h0N2, bVar, this) != objE) {
                    this.f13427r = i12;
                    this.f13426q = 3;
                    r9 = i12;
                    if (F8.W.a(this) == objE) {
                    }
                    throw new p079h8.f();
                }
            } catch (Throwable th2) {
                p129m8.i iVarZ = C0803b0.c().n1().z(J0.f1819r);
                c cVar = new c(this.f13428s, r9, null);
                this.f13427r = th2;
                this.f13426q = 4;
                if (AbstractC0812g.g(iVarZ, cVar, this) != objE) {
                    throw th2;
                }
            }
            i11 = i10;
            return objE;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H8.t tVar, p129m8.e eVar) {
            return ((a) create(tVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.m$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13438q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f13439r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f13440s;

        /* JADX INFO: renamed from: androidx.lifecycle.m$b$a */
        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ D f13441q;

            a(D d10) {
                this.f13441q = d10;
            }

            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                Object objB = this.f13441q.b(obj, eVar);
                return objB == p139n8.b.e() ? objB : p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0880f interfaceC0880f, p129m8.e eVar) {
            super(2, eVar);
            this.f13440s = interfaceC0880f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = new b(this.f13440s, eVar);
            bVar.f13439r = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f13438q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                D d10 = (D) this.f13439r;
                InterfaceC0880f interfaceC0880f = this.f13440s;
                a aVar = new a(d10);
                this.f13438q = 1;
                if (interfaceC0880f.a(aVar, this) == objE) {
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
        public final Object invoke(D d10, p129m8.e eVar) {
            return ((b) create(d10, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final InterfaceC0880f a(C c10) {
        kotlin.jvm.internal.n.h(c10, "<this>");
        return AbstractC0882h.m(AbstractC0882h.e(new a(c10, null)));
    }

    public static final C b(InterfaceC0880f interfaceC0880f, p129m8.i context, long j9) {
        kotlin.jvm.internal.n.h(interfaceC0880f, "<this>");
        kotlin.jvm.internal.n.h(context, "context");
        C cA = AbstractC1147g.a(context, j9, new b(interfaceC0880f, null));
        if (interfaceC0880f instanceof I8.O) {
            if (p110l.c.g().b()) {
                cA.n(((I8.O) interfaceC0880f).getValue());
                return cA;
            }
            cA.l(((I8.O) interfaceC0880f).getValue());
        }
        return cA;
    }

    public static /* synthetic */ C c(InterfaceC0880f interfaceC0880f, p129m8.i iVar, long j9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = p129m8.j.f23252q;
        }
        if ((i10 & 2) != 0) {
            j9 = 5000;
        }
        return b(interfaceC0880f, iVar, j9);
    }
}
