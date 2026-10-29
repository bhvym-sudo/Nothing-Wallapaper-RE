package T1;

import F8.AbstractC0816i;
import F8.L;
import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import I8.Q;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f7469s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final p079h8.h f7470t = p079h8.i.b(new p219v8.a() { // from class: T1.e
        @Override // p219v8.a
        public final Object invoke() {
            return f.u();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M1.b f7471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V1.a f7472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p219v8.l f7473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f7474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O f7475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f7476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A f7477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0880f f7478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC0880f f7479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final A f7480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC0880f f7481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0880f f7482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0880f f7483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC0880f f7484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final A f7485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final O f7486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC0880f f7487r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final double[] b() {
            return (double[]) f.f7470t.getValue();
        }

        public final int a(int i10, double d10) {
            p191t0.a.n(i10, b());
            return p191t0.a.b(d10, b()[1], b()[2]);
        }

        private a() {
        }
    }

    public static final class b implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f7488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final M1.b f7489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final V1.a f7490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p219v8.l f7491e;

        public b(Context context, M1.b clockPickerInteractor, V1.a colorPickerInteractor, p219v8.l getIsReactiveToTone) {
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(clockPickerInteractor, "clockPickerInteractor");
            kotlin.jvm.internal.n.h(colorPickerInteractor, "colorPickerInteractor");
            kotlin.jvm.internal.n.h(getIsReactiveToTone, "getIsReactiveToTone");
            this.f7488b = context;
            this.f7489c = clockPickerInteractor;
            this.f7490d = colorPickerInteractor;
            this.f7491e = getIsReactiveToTone;
        }

        @Override // androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            return new f(this.f7488b, this.f7489c, this.f7490d, this.f7491e, null);
        }
    }

    public enum c {
        COLOR,
        SIZE;


        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ p149o8.a f7495t = p149o8.b.a(d());
    }

    static final class d implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ T1.c f7497r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7498s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f7499q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ T1.c f7500r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f7501s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ f f7502t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T1.c cVar, int i10, f fVar, p129m8.e eVar) {
                super(2, eVar);
                this.f7500r = cVar;
                this.f7501s = i10;
                this.f7502t = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f7500r, this.f7501s, this.f7502t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f7499q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    int iA = f.f7469s.a(this.f7500r.a(), this.f7500r.d(this.f7501s));
                    M1.b bVar = this.f7502t.f7471b;
                    String strB = this.f7500r.b();
                    int i11 = this.f7501s;
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(iA);
                    this.f7499q = 1;
                    if (bVar.q(strB, i11, numC, this) == objE) {
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

        d(T1.c cVar, int i10) {
            this.f7497r = cVar;
            this.f7498s = i10;
        }

        public final void a() {
            AbstractC0816i.d(b0.a(f.this), null, null, new a(this.f7497r, this.f7498s, f.this, null), 3, null);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7503q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f f7504r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7505s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7506q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ f f7507r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f7508s;

            /* JADX INFO: renamed from: T1.f$e$a$a, reason: collision with other inner class name */
            public static final class C0268a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7509q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7510r;

                public C0268a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7509q = obj;
                    this.f7510r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, f fVar, int i10) {
                this.f7506q = interfaceC0881g;
                this.f7507r = fVar;
                this.f7508s = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0268a c0268a;
                if (eVar instanceof C0268a) {
                    c0268a = (C0268a) eVar;
                    int i10 = c0268a.f7510r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0268a.f7510r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0268a = new C0268a(eVar);
                    }
                } else {
                    c0268a = new C0268a(eVar);
                }
                Object obj2 = c0268a.f7509q;
                Object objE = p139n8.b.e();
                int i11 = c0268a.f7510r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7506q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(AbstractC1444s.W(this.f7507r.f7474e.keySet(), (String) obj) == this.f7508s);
                    c0268a.f7510r = 1;
                    if (interfaceC0881g.b(boolA, c0268a) == objE) {
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

        public e(InterfaceC0880f interfaceC0880f, f fVar, int i10) {
            this.f7503q = interfaceC0880f;
            this.f7504r = fVar;
            this.f7505s = i10;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7503q.a(new a(interfaceC0881g, this.f7504r, this.f7505s), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: T1.f$f, reason: collision with other inner class name */
    public static final class C0269f implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7512q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f f7513r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ T1.c f7514s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7515t;

        /* JADX INFO: renamed from: T1.f$f$a */
        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7516q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ f f7517r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ T1.c f7518s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f7519t;

            /* JADX INFO: renamed from: T1.f$f$a$a, reason: collision with other inner class name */
            public static final class C0270a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7520q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7521r;

                public C0270a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7520q = obj;
                    this.f7521r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, f fVar, T1.c cVar, int i10) {
                this.f7516q = interfaceC0881g;
                this.f7517r = fVar;
                this.f7518s = cVar;
                this.f7519t = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0270a c0270a;
                if (eVar instanceof C0270a) {
                    c0270a = (C0270a) eVar;
                    int i10 = c0270a.f7521r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0270a.f7521r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0270a = new C0270a(eVar);
                    }
                } else {
                    c0270a = new C0270a(eVar);
                }
                Object obj2 = c0270a.f7520q;
                Object objE = p139n8.b.e();
                int i11 = c0270a.f7521r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7516q;
                    d dVar = ((Boolean) obj).booleanValue() ? null : this.f7517r.new d(this.f7518s, this.f7519t);
                    c0270a.f7521r = 1;
                    if (interfaceC0881g.b(dVar, c0270a) == objE) {
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

        public C0269f(InterfaceC0880f interfaceC0880f, f fVar, T1.c cVar, int i10) {
            this.f7512q = interfaceC0880f;
            this.f7513r = fVar;
            this.f7514s = cVar;
            this.f7515t = i10;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7512q.a(new a(interfaceC0881g, this.f7513r, this.f7514s, this.f7515t), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7523q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7524r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7525s;

        g(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7523q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((String) this.f7525s) == null ? false : ((Boolean) f.this.f7473d.f((String) this.f7524r)).booleanValue());
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(String str, String str2, p129m8.e eVar) {
            g gVar = f.this.new g(eVar);
            gVar.f7524r = str;
            gVar.f7525s = str2;
            return gVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class h implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f[] f7527q;

        public static final class a implements p219v8.a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f[] f7528q;

            public a(InterfaceC0880f[] interfaceC0880fArr) {
                this.f7528q = interfaceC0880fArr;
            }

            @Override // p219v8.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Boolean[this.f7528q.length];
            }
        }

        public static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f7529q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f7530r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f7531s;

            public b(p129m8.e eVar) {
                super(3, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f7529q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f7530r;
                    Boolean[] boolArr = (Boolean[]) ((Object[]) this.f7531s);
                    int length = boolArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        }
                        if (boolArr[i11].booleanValue()) {
                            break;
                        }
                        i11++;
                    }
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(i11);
                    this.f7529q = 1;
                    if (interfaceC0881g.b(numC, this) == objE) {
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

            @Override // p219v8.q
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object e(InterfaceC0881g interfaceC0881g, Object[] objArr, p129m8.e eVar) {
                b bVar = new b(eVar);
                bVar.f7530r = interfaceC0881g;
                bVar.f7531s = objArr;
                return bVar.invokeSuspend(p079h8.A.f21846a);
            }
        }

        public h(InterfaceC0880f[] interfaceC0880fArr) {
            this.f7527q = interfaceC0880fArr;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            InterfaceC0880f[] interfaceC0880fArr = this.f7527q;
            Object objA = J8.l.a(interfaceC0881g, interfaceC0880fArr, new a(interfaceC0880fArr), new b(null), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7532q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ N1.a f7534s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(N1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f7534s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return f.this.new i(this.f7534s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((i) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7532q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                M1.b bVar = f.this.f7471b;
                N1.a aVar = this.f7534s;
                this.f7532q = 1;
                if (bVar.s(aVar, this) == objE) {
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

    public static final class j extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7535q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f7536r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7537s;

        public j(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7535q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f7536r;
                List list = (List) this.f7537s;
                ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((B3.a) it.next()).g());
                }
                h hVar = new h((InterfaceC0880f[]) AbstractC1444s.r0(arrayList).toArray(new InterfaceC0880f[0]));
                this.f7535q = 1;
                if (AbstractC0882h.t(interfaceC0881g, hVar, this) == objE) {
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

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
            j jVar = new j(eVar);
            jVar.f7536r = interfaceC0881g;
            jVar.f7537s = obj;
            return jVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class k implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7538q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f f7539r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f7540s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7541q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ f f7542r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Context f7543s;

            /* JADX INFO: renamed from: T1.f$k$a$a, reason: collision with other inner class name */
            public static final class C0271a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                int f7544A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                int f7545B;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7546q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7547r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f7548s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f7550u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f7551v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                Object f7552w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                Object f7553x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                Object f7554y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                int f7555z;

                public C0271a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7546q = obj;
                    this.f7547r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, f fVar, Context context) {
                this.f7541q = interfaceC0881g;
                this.f7542r = fVar;
                this.f7543s = context;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x0119  */
            /* JADX WARN: Code duplicated, block: B:49:0x0129  */
            /* JADX WARN: Code duplicated, block: B:52:0x0135  */
            /* JADX WARN: Code duplicated, block: B:58:0x0148  */
            /* JADX WARN: Code duplicated, block: B:61:0x0160  */
            /* JADX WARN: Code duplicated, block: B:64:0x016c A[DONT_INVERT, PHI: r0 r1 r4 r10 r12
              0x016c: PHI (r0v6 java.util.List) = (r0v4 java.util.List), (r0v5 java.util.List), (r0v7 java.util.List) binds: [B:63:0x0169, B:43:0x0115, B:62:0x0164] A[DONT_GENERATE, DONT_INLINE]
              0x016c: PHI (r1v11 B3.a) = (r1v6 B3.a), (r1v9 B3.a), (r1v18 B3.a) binds: [B:63:0x0169, B:43:0x0115, B:62:0x0164] A[DONT_GENERATE, DONT_INLINE]
              0x016c: PHI (r4v16 java.util.List) = (r4v8 java.util.List), (r4v14 java.util.List), (r4v18 java.util.List) binds: [B:63:0x0169, B:43:0x0115, B:62:0x0164] A[DONT_GENERATE, DONT_INLINE]
              0x016c: PHI (r10v6 I8.g) = (r10v4 I8.g), (r10v5 I8.g), (r10v8 I8.g) binds: [B:63:0x0169, B:43:0x0115, B:62:0x0164] A[DONT_GENERATE, DONT_INLINE]
              0x016c: PHI (r12v16 T1.f$k$a) = (r12v9 T1.f$k$a), (r12v15 T1.f$k$a), (r12v18 T1.f$k$a) binds: [B:63:0x0169, B:43:0x0115, B:62:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:65:0x016e  */
            /* JADX WARN: Code duplicated, block: B:69:0x018d  */
            /* JADX WARN: Code duplicated, block: B:71:0x0195  */
            /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
            /* JADX WARN: Code duplicated, block: B:75:0x01af  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code duplicated, block: B:84:0x0268  */
            /* JADX WARN: Code duplicated, block: B:89:0x0143 A[SYNTHETIC] */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x01e8, code lost:
            
                if (r1 == r3) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0280, code lost:
            
                if (r14.b(r0, r2) == r3) goto L86;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01e8 -> B:19:0x0065). Please report as a decompilation issue!!! */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r31, p129m8.e r32) {
                /*
                    Method dump skipped, instruction units count: 646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: T1.f.k.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public k(InterfaceC0880f interfaceC0880f, f fVar, Context context) {
            this.f7538q = interfaceC0880f;
            this.f7539r = fVar;
            this.f7540s = context;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7538q.a(new a(interfaceC0881g, this.f7539r, this.f7540s), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class l implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7556q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f7557r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f f7558s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7559q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f7560r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ f f7561s;

            /* JADX INFO: renamed from: T1.f$l$a$a, reason: collision with other inner class name */
            public static final class C0272a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7562q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7563r;

                public C0272a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7562q = obj;
                    this.f7563r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, Context context, f fVar) {
                this.f7559q = interfaceC0881g;
                this.f7560r = context;
                this.f7561s = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0272a c0272a;
                if (eVar instanceof C0272a) {
                    c0272a = (C0272a) eVar;
                    int i10 = c0272a.f7563r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0272a.f7563r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0272a = new C0272a(eVar);
                    }
                } else {
                    c0272a = new C0272a(eVar);
                }
                Object obj2 = c0272a.f7562q;
                Object objE = p139n8.b.e();
                int i11 = c0272a.f7563r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7559q;
                    c cVar = (c) obj;
                    String string = this.f7560r.getResources().getString(R.string.clock_color);
                    kotlin.jvm.internal.n.g(string, "getString(...)");
                    c cVar2 = c.COLOR;
                    T1.d dVar = new T1.d(string, cVar == cVar2, cVar == cVar2 ? null : this.f7561s.new m());
                    String string2 = this.f7560r.getResources().getString(R.string.clock_size);
                    kotlin.jvm.internal.n.g(string2, "getString(...)");
                    c cVar3 = c.SIZE;
                    List listN = AbstractC1444s.n(dVar, new T1.d(string2, cVar == cVar3, cVar != cVar3 ? this.f7561s.new n() : null));
                    c0272a.f7563r = 1;
                    if (interfaceC0881g.b(listN, c0272a) == objE) {
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

        public l(InterfaceC0880f interfaceC0880f, Context context, f fVar) {
            this.f7556q = interfaceC0880f;
            this.f7557r = context;
            this.f7558s = fVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7556q.a(new a(interfaceC0881g, this.f7557r, this.f7558s), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class m implements p219v8.a {
        m() {
        }

        public final void a() {
            f.this.f7485p.h(c.COLOR);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class n implements p219v8.a {
        n() {
        }

        public final void a() {
            f.this.f7485p.h(c.SIZE);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public static final class o implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7567q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7568q;

            /* JADX INFO: renamed from: T1.f$o$a$a, reason: collision with other inner class name */
            public static final class C0273a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7569q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7570r;

                public C0273a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7569q = obj;
                    this.f7570r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f7568q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0273a c0273a;
                if (eVar instanceof C0273a) {
                    c0273a = (C0273a) eVar;
                    int i10 = c0273a.f7570r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0273a.f7570r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0273a = new C0273a(eVar);
                    }
                } else {
                    c0273a = new C0273a(eVar);
                }
                Object obj2 = c0273a.f7569q;
                Object objE = p139n8.b.e();
                int i11 = c0273a.f7570r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7568q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((String) obj) == null);
                    c0273a.f7570r = 1;
                    if (interfaceC0881g.b(boolA, c0273a) == objE) {
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

        public o(InterfaceC0880f interfaceC0880f) {
            this.f7567q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7567q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class p implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7572q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f f7573r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7574q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ f f7575r;

            /* JADX INFO: renamed from: T1.f$p$a$a, reason: collision with other inner class name */
            public static final class C0274a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7576q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7577r;

                public C0274a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7576q = obj;
                    this.f7577r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, f fVar) {
                this.f7574q = interfaceC0881g;
                this.f7575r = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0274a c0274a;
                if (eVar instanceof C0274a) {
                    c0274a = (C0274a) eVar;
                    int i10 = c0274a.f7577r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0274a.f7577r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0274a = new C0274a(eVar);
                    }
                } else {
                    c0274a = new C0274a(eVar);
                }
                Object obj2 = c0274a.f7576q;
                Object objE = p139n8.b.e();
                int i11 = c0274a.f7577r;
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7574q;
                    r rVar = ((Boolean) obj).booleanValue() ? null : this.f7575r.new r();
                    c0274a.f7577r = 1;
                    if (interfaceC0881g.b(rVar, c0274a) == objE) {
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

        public p(InterfaceC0880f interfaceC0880f, f fVar) {
            this.f7572q = interfaceC0880f;
            this.f7573r = fVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7572q.a(new a(interfaceC0881g, this.f7573r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f7579q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7580r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f7581s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7582t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f7583u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f7584v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f7586x;

        q(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7584v = obj;
            this.f7586x |= Integer.MIN_VALUE;
            return f.this.z(null, null, this);
        }
    }

    static final class r implements p219v8.a {

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f7588q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ f f7589r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, p129m8.e eVar) {
                super(2, eVar);
                this.f7589r = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f7589r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f7588q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    M1.b bVar = this.f7589r.f7471b;
                    this.f7588q = 1;
                    if (bVar.q(null, 75, null, this) == objE) {
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

        r() {
        }

        public final void a() {
            AbstractC0816i.d(b0.a(f.this), null, null, new a(f.this, null), 3, null);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public /* synthetic */ f(Context context, M1.b bVar, V1.a aVar, p219v8.l lVar, AbstractC1457h abstractC1457h) {
        this(context, bVar, aVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double[] u() {
        return new double[3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object z(W1.a aVar, Context context, p129m8.e eVar) {
        q qVar;
        Object objL;
        int[] iArr;
        int[] iArr2;
        W1.a aVar2;
        Context context2;
        f fVar = this;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i10 = qVar.f7586x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f7586x = i10 - Integer.MIN_VALUE;
            } else {
                qVar = fVar.new q(eVar);
            }
        } else {
            qVar = fVar.new q(eVar);
        }
        Object obj = qVar.f7584v;
        Object objE = p139n8.b.e();
        int i11 = qVar.f7586x;
        if (i11 == 0) {
            p079h8.r.b(obj);
            p232x1.g gVarA = aVar.a();
            kotlin.jvm.internal.n.f(gVarA, "null cannot be cast to non-null type com.android.customization.model.color.ColorOptionImpl");
            int[] iArrA = ((p232x1.h) gVarA).n().a(false);
            int[] iArrA2 = ((p232x1.h) aVar.a()).n().a(true);
            o oVar = new o(fVar.f7476g);
            L lA = b0.a(fVar);
            qVar.f7579q = fVar;
            qVar.f7580r = aVar;
            qVar.f7581s = context;
            qVar.f7582t = iArrA;
            qVar.f7583u = iArrA2;
            qVar.f7586x = 1;
            objL = AbstractC0882h.L(oVar, lA, qVar);
            if (objL == objE) {
                return objE;
            }
            iArr = iArrA;
            iArr2 = iArrA2;
            aVar2 = aVar;
            context2 = context;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int[] iArr3 = (int[]) qVar.f7583u;
            iArr = (int[]) qVar.f7582t;
            context2 = (Context) qVar.f7581s;
            aVar2 = (W1.a) qVar.f7580r;
            f fVar2 = (f) qVar.f7579q;
            p079h8.r.b(obj);
            iArr2 = iArr3;
            fVar = fVar2;
            objL = obj;
        }
        O o9 = (O) objL;
        A a10 = Q.a(aVar2.b());
        kotlin.jvm.internal.n.f(a10, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<kotlin.String>");
        p013b2.a aVar3 = new p013b2.a(iArr[0], iArr[1], iArr[2], iArr[3], iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        String string = context2.getString(R.string.default_theme_title);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        return new B3.a(a10, aVar3, new q3.a.b(string), true, o9, false, new p(o9, fVar), null, 160, null);
    }

    public final InterfaceC0880f m() {
        return this.f7482m;
    }

    public final InterfaceC0880f n() {
        return this.f7481l;
    }

    public final O o() {
        return this.f7475f;
    }

    public final InterfaceC0880f p() {
        return this.f7484o;
    }

    public final InterfaceC0880f q() {
        return this.f7483n;
    }

    public final O r() {
        return this.f7486q;
    }

    public final InterfaceC0880f s() {
        return this.f7479j;
    }

    public final InterfaceC0880f t() {
        return this.f7487r;
    }

    public final InterfaceC0880f v() {
        return this.f7478i;
    }

    public final void w(int i10) {
        T1.c cVar;
        this.f7477h.setValue(Integer.valueOf(i10));
        String str = (String) this.f7476g.getValue();
        if (str == null || (cVar = (T1.c) this.f7474e.get(str)) == null) {
            return;
        }
        this.f7480k.setValue(Integer.valueOf(f7469s.a(cVar.a(), cVar.d(i10))));
    }

    public final Object x(int i10, p129m8.e eVar) {
        T1.c cVar;
        String str = (String) this.f7476g.getValue();
        if (str != null && (cVar = (T1.c) this.f7474e.get(str)) != null) {
            Object objQ = this.f7471b.q(str, i10, kotlin.coroutines.jvm.internal.b.c(f7469s.a(cVar.a(), cVar.d(i10))), eVar);
            return objQ == p139n8.b.e() ? objQ : p079h8.A.f21846a;
        }
        return p079h8.A.f21846a;
    }

    public final void y(N1.a size) {
        kotlin.jvm.internal.n.h(size, "size");
        AbstractC0816i.d(b0.a(this), null, null, new i(size, null), 3, null);
    }

    private f(Context context, M1.b bVar, V1.a aVar, p219v8.l lVar) {
        this.f7471b = bVar;
        this.f7472c = aVar;
        this.f7473d = lVar;
        T1.c.a aVar2 = T1.c.f7460f;
        Resources resources = context.getResources();
        kotlin.jvm.internal.n.g(resources, "getResources(...)");
        this.f7474e = aVar2.a(resources);
        InterfaceC0880f interfaceC0880fO = AbstractC0882h.o(bVar.i());
        L lA = b0.a(this);
        K.a aVar3 = K.f3174a;
        O oK = AbstractC0882h.K(interfaceC0880fO, lA, aVar3.c(), null);
        this.f7475f = oK;
        this.f7476g = AbstractC0882h.K(bVar.k(), b0.a(this), aVar3.c(), null);
        A a10 = Q.a(75);
        this.f7477h = a10;
        this.f7478i = AbstractC0882h.o(AbstractC0882h.l(oK, bVar.k(), new g(null)));
        this.f7479j = AbstractC0882h.G(bVar.e(), a10);
        A a11 = Q.a(null);
        this.f7480k = a11;
        this.f7481l = AbstractC0882h.G(bVar.g(), a11);
        k kVar = new k(aVar.b(), this, context);
        this.f7482m = kVar;
        this.f7483n = AbstractC0882h.N(kVar, new j(null));
        this.f7484o = bVar.j();
        A a12 = Q.a(c.COLOR);
        this.f7485p = a12;
        O oB = AbstractC0882h.b(a12);
        this.f7486q = oB;
        this.f7487r = new l(oB, context, this);
    }
}
