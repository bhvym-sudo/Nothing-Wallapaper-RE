package T1;

import F8.AbstractC0816i;
import F8.I;
import F8.InterfaceC0846x0;
import F8.L;
import F8.W;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f7414l = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M1.b f7415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f7416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S1.a f7417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f7418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O f7419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0880f f7420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0880f f7421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0880f f7422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC0880f f7423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC0846x0 f7424k;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: T1.b$b, reason: collision with other inner class name */
    public static final class C0264b implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M1.b f7425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final I f7426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final S1.a f7427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Resources f7428e;

        public C0264b(M1.b interactor, I backgroundDispatcher, S1.a clockViewFactory, Resources resources) {
            n.h(interactor, "interactor");
            n.h(backgroundDispatcher, "backgroundDispatcher");
            n.h(clockViewFactory, "clockViewFactory");
            n.h(resources, "resources");
            this.f7425b = interactor;
            this.f7426c = backgroundDispatcher;
            this.f7427d = clockViewFactory;
            this.f7428e = resources;
        }

        @Override // androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            n.h(modelClass, "modelClass");
            return new b(this.f7425b, this.f7426c, this.f7427d, this.f7428e);
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7429q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7430r;

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = b.this.new c(eVar);
            cVar.f7430r = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            T1.a aVar;
            Object objE = p139n8.b.e();
            int i10 = this.f7429q;
            if (i10 == 0) {
                r.b(obj);
                List list2 = (List) this.f7430r;
                this.f7430r = list2;
                this.f7429q = 1;
                if (W.b(100L, this) == objE) {
                    return objE;
                }
                list = list2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f7430r;
                r.b(obj);
            }
            List<O1.a> list3 = list;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(list3, 10));
            for (O1.a aVar2 : list3) {
                O2.h hVarD = bVar.f7417d.d(aVar2.b());
                if (hVarD != null) {
                    String string = bVar.f7418e.getString(R.string.select_clock_action_description, hVarD.a().a());
                    n.g(string, "getString(...)");
                    aVar = new T1.a(aVar2.b(), aVar2.g(), string);
                } else {
                    aVar = null;
                }
                arrayList.add(aVar);
            }
            return AbstractC1444s.P(arrayList);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, p129m8.e eVar) {
            return ((c) create(list, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7432q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f7433r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7434q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f7435r;

            /* JADX INFO: renamed from: T1.b$d$a$a, reason: collision with other inner class name */
            public static final class C0265a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7436q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7437r;

                public C0265a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7436q = obj;
                    this.f7437r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, boolean z9) {
                this.f7434q = interfaceC0881g;
                this.f7435r = z9;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0045  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0265a c0265a;
                if (eVar instanceof C0265a) {
                    c0265a = (C0265a) eVar;
                    int i10 = c0265a.f7437r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0265a.f7437r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0265a = new C0265a(eVar);
                    }
                } else {
                    c0265a = new C0265a(eVar);
                }
                Object obj2 = c0265a.f7436q;
                Object objE = p139n8.b.e();
                int i11 = c0265a.f7437r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7434q;
                    Integer num = (Integer) obj;
                    int i12 = R.color.system_surface_container_high;
                    if (num != null) {
                        float fLuminance = Color.luminance(num.intValue());
                        if (this.f7435r) {
                            if (fLuminance <= 0.03f) {
                                i12 = R.color.system_surface_bright;
                            }
                        } else if (fLuminance <= 0.85f) {
                            i12 = R.color.system_surface_bright;
                        } else {
                            i12 = R.color.system_surface_container_highest;
                        }
                    } else if (!this.f7435r) {
                        i12 = R.color.system_surface_bright;
                    }
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(i12);
                    c0265a.f7437r = 1;
                    if (interfaceC0881g.b(numC, c0265a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public d(InterfaceC0880f interfaceC0880f, boolean z9) {
            this.f7432q = interfaceC0880f;
            this.f7433r = z9;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7432q.a(new a(interfaceC0881g, this.f7433r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7439q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List f7440r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b f7441s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7442q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ List f7443r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f7444s;

            /* JADX INFO: renamed from: T1.b$e$a$a, reason: collision with other inner class name */
            public static final class C0266a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7445q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7446r;

                public C0266a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7445q = obj;
                    this.f7446r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, List list, b bVar) {
                this.f7442q = interfaceC0881g;
                this.f7443r = list;
                this.f7444s = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0266a c0266a;
                if (eVar instanceof C0266a) {
                    c0266a = (C0266a) eVar;
                    int i10 = c0266a.f7446r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0266a.f7446r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0266a = new C0266a(eVar);
                    }
                } else {
                    c0266a = new C0266a(eVar);
                }
                Object obj2 = c0266a.f7445q;
                Object objE = p139n8.b.e();
                int i11 = c0266a.f7446r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7442q;
                    String str = (String) obj;
                    Iterator it = this.f7443r.iterator();
                    boolean z9 = false;
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (n.d(((T1.a) it.next()).a(), str)) {
                            break;
                        }
                        i12++;
                    }
                    InterfaceC0846x0 interfaceC0846x0 = this.f7444s.f7424k;
                    if (interfaceC0846x0 != null && interfaceC0846x0.a()) {
                        z9 = true;
                    }
                    Integer numC = (i12 < 0 || z9) ? null : kotlin.coroutines.jvm.internal.b.c(i12);
                    c0266a.f7446r = 1;
                    if (interfaceC0881g.b(numC, c0266a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public e(InterfaceC0880f interfaceC0880f, List list, b bVar) {
            this.f7439q = interfaceC0880f;
            this.f7440r = list;
            this.f7441s = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7439q.a(new a(interfaceC0881g, this.f7440r, this.f7441s), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class f extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7448q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f7450s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f7450s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new f(this.f7450s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7448q;
            if (i10 == 0) {
                r.b(obj);
                M1.b bVar = b.this.f7415b;
                String str = this.f7450s;
                this.f7448q = 1;
                if (bVar.u(str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    public static final class g extends l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7451q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7452r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7453s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ b f7454t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p129m8.e eVar, b bVar) {
            super(3, eVar);
            this.f7454t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7451q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f7452r;
                e eVar = new e(this.f7454t.f7415b.i(), (List) this.f7453s, this.f7454t);
                this.f7451q = 1;
                if (AbstractC0882h.t(interfaceC0881g, eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
            g gVar = new g(eVar, this.f7454t);
            gVar.f7452r = interfaceC0881g;
            gVar.f7453s = obj;
            return gVar.invokeSuspend(A.f21846a);
        }
    }

    public static final class h implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7455q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7456q;

            /* JADX INFO: renamed from: T1.b$h$a$a, reason: collision with other inner class name */
            public static final class C0267a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7457q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7458r;

                public C0267a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7457q = obj;
                    this.f7458r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f7456q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0267a c0267a;
                if (eVar instanceof C0267a) {
                    c0267a = (C0267a) eVar;
                    int i10 = c0267a.f7458r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0267a.f7458r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0267a = new C0267a(eVar);
                    }
                } else {
                    c0267a = new C0267a(eVar);
                }
                Object obj2 = c0267a.f7457q;
                Object objE = p139n8.b.e();
                int i11 = c0267a.f7458r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7456q;
                    Integer num = (Integer) obj;
                    if (num != null) {
                        c0267a.f7458r = 1;
                        if (interfaceC0881g.b(num, c0267a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return A.f21846a;
            }
        }

        public h(InterfaceC0880f interfaceC0880f) {
            this.f7455q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7455q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public b(M1.b interactor, I backgroundDispatcher, S1.a clockViewFactory, Resources resources) {
        n.h(interactor, "interactor");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        n.h(clockViewFactory, "clockViewFactory");
        n.h(resources, "resources");
        this.f7415b = interactor;
        this.f7416c = backgroundDispatcher;
        this.f7417d = clockViewFactory;
        this.f7418e = resources;
        O oK = AbstractC0882h.K(AbstractC0882h.D(AbstractC0882h.E(interactor.d(), new c(null)), I.k1(backgroundDispatcher, 1, null, 2, null)), b0.a(this), K.f3174a.c(), AbstractC1444s.l());
        this.f7419f = oK;
        this.f7420g = interactor.j();
        this.f7421h = interactor.g();
        this.f7422i = new h(AbstractC0882h.N(oK, new g(null, this)));
        this.f7423j = interactor.i();
    }

    public final O i() {
        return this.f7419f;
    }

    public final InterfaceC0880f j(boolean z9) {
        return new d(this.f7415b.g(), z9);
    }

    public final InterfaceC0880f k() {
        return this.f7421h;
    }

    public final InterfaceC0880f l() {
        return this.f7423j;
    }

    public final InterfaceC0880f m() {
        return this.f7420g;
    }

    public final InterfaceC0880f n() {
        return this.f7422i;
    }

    public final void o(String clockId) {
        n.h(clockId, "clockId");
        InterfaceC0846x0 interfaceC0846x0 = this.f7424k;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f7424k = AbstractC0816i.d(b0.a(this), this.f7416c, null, new f(clockId, null), 2, null);
    }
}
