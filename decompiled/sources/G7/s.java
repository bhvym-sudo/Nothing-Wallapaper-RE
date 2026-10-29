package G7;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import java.util.List;
import kotlin.jvm.internal.F;
import p074h3.H;
import p074h3.I;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f2112a = new s();

    public interface a {
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2113a;

        static {
            int[] iArr = new int[AbstractC1157q.a.values().length];
            try {
                iArr[AbstractC1157q.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1157q.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1157q.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2113a = iArr;
        }
    }

    public static final class c extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p010b.j f2114r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p010b.j jVar) {
            super(0);
            this.f2114r = jVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f2114r.getViewModelStore();
        }
    }

    public static final class d extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f2115r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p010b.j f2116s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p219v8.a aVar, p010b.j jVar) {
            super(0);
            this.f2115r = aVar;
            this.f2116s = jVar;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f2115r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f2116s.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0846x0 f2117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ H7.d f2118b;

        e(InterfaceC0846x0 interfaceC0846x0, H7.d dVar) {
            this.f2117a = interfaceC0846x0;
            this.f2118b = dVar;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2119q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f2120r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ J7.i f2121s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ H7.d f2122t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p079h8.h f2123u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ S1.a f2124v;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2125q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f2126r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ J7.i f2127s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ H7.d f2128t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ p079h8.h f2129u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ S1.a f2130v;

            /* JADX INFO: renamed from: G7.s$f$a$a, reason: collision with other inner class name */
            static final class C0088a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f2131q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ J7.i f2132r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ H7.d f2133s;

                /* JADX INFO: renamed from: G7.s$f$a$a$a, reason: collision with other inner class name */
                static final class C0089a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ H7.d f2134q;

                    C0089a(H7.d dVar) {
                        this.f2134q = dVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        this.f2134q.g(list);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0088a(J7.i iVar, H7.d dVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f2132r = iVar;
                    this.f2133s = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0088a(this.f2132r, this.f2133s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0088a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f2131q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fP = this.f2132r.P();
                        C0089a c0089a = new C0089a(this.f2133s);
                        this.f2131q = 1;
                        if (interfaceC0880fP.a(c0089a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f2135q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ J7.i f2136r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ H7.d f2137s;

                /* JADX INFO: renamed from: G7.s$f$a$b$a, reason: collision with other inner class name */
                static final class C0090a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ H7.d f2138q;

                    C0090a(H7.d dVar) {
                        this.f2138q = dVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        this.f2138q.t(list);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(J7.i iVar, H7.d dVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f2136r = iVar;
                    this.f2137s = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new b(this.f2136r, this.f2137s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f2135q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fR = this.f2136r.R();
                        C0090a c0090a = new C0090a(this.f2137s);
                        this.f2135q = 1;
                        if (interfaceC0880fR.a(c0090a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f2139q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p079h8.h f2140r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ H7.d f2141s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ S1.a f2142t;

                /* JADX INFO: renamed from: G7.s$f$a$c$a, reason: collision with other inner class name */
                static final class C0091a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ H7.d f2143q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ S1.a f2144r;

                    C0091a(H7.d dVar, S1.a aVar) {
                        this.f2143q = dVar;
                        this.f2144r = aVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(String str, p129m8.e eVar) {
                        this.f2143q.u(this.f2144r, str);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(p079h8.h hVar, H7.d dVar, S1.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f2140r = hVar;
                    this.f2141s = dVar;
                    this.f2142t = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new c(this.f2140r, this.f2141s, this.f2142t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f2139q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fL = s.f(this.f2140r).l();
                        C0091a c0091a = new C0091a(this.f2141s, this.f2142t);
                        this.f2139q = 1;
                        if (interfaceC0880fL.a(c0091a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J7.i iVar, H7.d dVar, p079h8.h hVar, S1.a aVar, p129m8.e eVar) {
                super(2, eVar);
                this.f2127s = iVar;
                this.f2128t = dVar;
                this.f2129u = hVar;
                this.f2130v = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f2127s, this.f2128t, this.f2129u, this.f2130v, eVar);
                aVar.f2126r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f2125q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                L l9 = (L) this.f2126r;
                AbstractC0816i.d(l9, null, null, new C0088a(this.f2127s, this.f2128t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new b(this.f2127s, this.f2128t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new c(this.f2129u, this.f2128t, this.f2130v, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC1163x interfaceC1163x, J7.i iVar, H7.d dVar, p079h8.h hVar, S1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f2120r = interfaceC1163x;
            this.f2121s = iVar;
            this.f2122t = dVar;
            this.f2123u = hVar;
            this.f2124v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new f(this.f2120r, this.f2121s, this.f2122t, this.f2123u, this.f2124v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2119q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f2120r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f2121s, this.f2122t, this.f2123u, this.f2124v, null);
                this.f2119q = 1;
                if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }
    }

    private s() {
    }

    public static final a d(final p010b.j activity, InterfaceC1163x lifecycleOwner, ViewGroup previewContainer) {
        kotlin.jvm.internal.n.h(activity, "activity");
        kotlin.jvm.internal.n.h(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.n.h(previewContainer, "previewContainer");
        H hA = I.a();
        kotlin.jvm.internal.n.f(hA, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector");
        final K6.c cVar = (K6.c) hA;
        J7.i iVar = (J7.i) new d0(activity, cVar.K0(activity)).b(J7.i.class);
        c0 c0Var = new c0(F.b(T1.b.class), new c(activity), new p219v8.a() { // from class: G7.q
            @Override // p219v8.a
            public final Object invoke() {
                return s.e(cVar, activity);
            }
        }, new d(null, activity));
        final S1.a aVarD0 = cVar.d0(activity);
        final H7.d dVar = new H7.d(activity, previewContainer);
        InterfaceC0846x0 interfaceC0846x0D = AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new f(lifecycleOwner, iVar, dVar, c0Var, aVarD0, null), 3, null);
        lifecycleOwner.getLifecycle().a(new InterfaceC1160u() { // from class: G7.r
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                s.g(aVarD0, dVar, interfaceC1163x, aVar);
            }
        });
        return new e(interfaceC0846x0D, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0.c e(K6.c cVar, p010b.j jVar) {
        return cVar.I0(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T1.b f(p079h8.h hVar) {
        return (T1.b) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(S1.a aVar, H7.d dVar, InterfaceC1163x source, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(event, "event");
        int i10 = b.f2113a[event.ordinal()];
        if (i10 == 1) {
            aVar.e(source);
            return;
        }
        if (i10 == 2) {
            aVar.i(source);
        } else {
            if (i10 != 3) {
                return;
            }
            dVar.destroy();
            aVar.onDestroy();
        }
    }
}
