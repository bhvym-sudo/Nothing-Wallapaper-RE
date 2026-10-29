package L1;

import F8.I;
import F8.L;
import F8.W;
import H8.t;
import I8.AbstractC0882h;
import I8.E;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import O2.s;
import O2.v;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.A;
import p079h8.m;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class e implements L1.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f4534i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2.a f4535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q2.k f4536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f4538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0880f f4539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E f4540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0880f f4541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0880f f4542h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f4545c;

        static {
            int[] iArr = new int[N1.a.values().length];
            try {
                iArr[N1.a.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N1.a.DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4543a = iArr;
            int[] iArr2 = new int[A7.a.values().length];
            try {
                iArr2[A7.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[A7.a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f4544b = iArr2;
            int[] iArr3 = new int[A7.g.values().length];
            try {
                iArr3[A7.g.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[A7.g.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f4545c = iArr3;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f4547r;

        public static final class a implements Q2.k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f4549a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f4550b;

            a(e eVar, t tVar) {
                this.f4549a = eVar;
                this.f4550b = tVar;
            }

            @Override // Q2.k.a
            public void b() {
                c.x(this.f4549a, this.f4550b);
            }
        }

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(e eVar, a aVar) {
            eVar.f4536b.V(aVar);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(e eVar, t tVar) {
            O1.a aVarA;
            String strT = eVar.f4536b.t();
            List<s> listZ = Q2.k.z(eVar.f4536b, false, 1, null);
            ArrayList arrayList = new ArrayList();
            for (s sVar : listZ) {
                O2.t tVarX = eVar.f4536b.x(sVar.a());
                if (tVarX != null) {
                    boolean zD = n.d(sVar.a(), strT);
                    String strA = tVarX.a();
                    Drawable drawableC = tVarX.c();
                    boolean zD2 = tVarX.d();
                    tVarX.b();
                    aVarA = e.A(eVar, sVar, zD, strA, drawableC, zD2, null, null, 0, null, 224, null);
                } else {
                    aVarA = null;
                }
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
            A7.d.f308a.i(arrayList);
            tVar.p(arrayList);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = e.this.new c(eVar);
            cVar.f4547r = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f4546q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f4547r;
                final a aVar = new a(e.this, tVar);
                e.this.f4536b.P(aVar);
                x(e.this, tVar);
                final e eVar = e.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: L1.f
                    @Override // p219v8.a
                    public final Object invoke() {
                        return e.c.w(eVar, aVar);
                    }
                };
                this.f4546q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((c) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4551q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f4552r;

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            d dVar = new d(eVar);
            dVar.f4552r = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f4551q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.f4552r;
                r.b(obj);
                return list;
            }
            r.b(obj);
            List list2 = (List) this.f4552r;
            this.f4552r = list2;
            this.f4551q = 1;
            return W.b(100L, this) == objE ? objE : list2;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, p129m8.e eVar) {
            return ((d) create(list, eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: L1.e$e, reason: collision with other inner class name */
    static final class C0153e extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4553q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f4554r;

        /* JADX INFO: renamed from: L1.e$e$a */
        public static final class a implements Q2.k.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f4556a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f4557b;

            a(e eVar, t tVar) {
                this.f4556a = eVar;
                this.f4557b = tVar;
            }

            @Override // Q2.k.a
            public void a() {
                C0153e.x(this.f4556a, this.f4557b);
            }

            @Override // Q2.k.a
            public void b() {
                C0153e.x(this.f4556a, this.f4557b);
            }
        }

        C0153e(p129m8.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(e eVar, a aVar) {
            eVar.f4536b.V(aVar);
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:25:0x0085  */
        public static final void x(e eVar, t tVar) {
            Object next;
            String strT = eVar.f4536b.t();
            v vVarE = eVar.f4536b.E();
            O1.a aVarZ = null;
            JSONObject jSONObjectI = vVarE != null ? vVarE.i() : null;
            O2.t tVarX = eVar.f4536b.x(strT);
            if (tVarX != null) {
                Iterator it = Q2.k.z(eVar.f4536b, false, 1, null).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!n.d(((s) next).a(), strT));
                s sVar = (s) next;
                if (sVar != null) {
                    String strA = tVarX.a();
                    Drawable drawableC = tVarX.c();
                    String strV = null;
                    boolean zD = tVarX.d();
                    tVarX.b();
                    if (jSONObjectI != null) {
                        strV = eVar.v(jSONObjectI);
                    }
                    aVarZ = eVar.z(sVar, true, strA, drawableC, zD, null, strV, jSONObjectI != null ? eVar.t(jSONObjectI) : 75, eVar.f4536b.D());
                }
            }
            tVar.p(aVarZ);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0153e c0153e = e.this.new C0153e(eVar);
            c0153e.f4554r = obj;
            return c0153e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f4553q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f4554r;
                final a aVar = new a(e.this, tVar);
                e.this.f4536b.P(aVar);
                x(e.this, tVar);
                final e eVar = e.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: L1.g
                    @Override // p219v8.a
                    public final Object invoke() {
                        return e.C0153e.w(eVar, aVar);
                    }
                };
                this.f4553q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((C0153e) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final class f implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4558q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4559q;

            /* JADX INFO: renamed from: L1.e$f$a$a, reason: collision with other inner class name */
            public static final class C0154a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4560q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4561r;

                public C0154a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4560q = obj;
                    this.f4561r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4559q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0154a c0154a;
                if (eVar instanceof C0154a) {
                    c0154a = (C0154a) eVar;
                    int i10 = c0154a.f4561r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0154a.f4561r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0154a = new C0154a(eVar);
                    }
                } else {
                    c0154a = new C0154a(eVar);
                }
                Object obj2 = c0154a.f4560q;
                Object objE = p139n8.b.e();
                int i11 = c0154a.f4561r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4559q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Number) obj).intValue() == 0);
                    c0154a.f4561r = 1;
                    if (interfaceC0881g.b(boolA, c0154a) == objE) {
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

        public f(InterfaceC0880f interfaceC0880f) {
            this.f4558q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4558q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class g implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4563q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4564q;

            /* JADX INFO: renamed from: L1.e$g$a$a, reason: collision with other inner class name */
            public static final class C0155a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4565q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4566r;

                public C0155a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4565q = obj;
                    this.f4566r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4564q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0155a c0155a;
                if (eVar instanceof C0155a) {
                    c0155a = (C0155a) eVar;
                    int i10 = c0155a.f4566r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0155a.f4566r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0155a = new C0155a(eVar);
                    }
                } else {
                    c0155a = new C0155a(eVar);
                }
                Object obj2 = c0155a.f4565q;
                Object objE = p139n8.b.e();
                int i11 = c0155a.f4566r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4564q;
                    N1.a aVar = ((Boolean) obj).booleanValue() ? N1.a.DYNAMIC : N1.a.SMALL;
                    c0155a.f4566r = 1;
                    if (interfaceC0881g.b(aVar, c0155a) == objE) {
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

        public g(InterfaceC0880f interfaceC0880f) {
            this.f4563q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4563q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class h implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4568q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4569q;

            /* JADX INFO: renamed from: L1.e$h$a$a, reason: collision with other inner class name */
            public static final class C0156a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4570q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4571r;

                public C0156a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4570q = obj;
                    this.f4571r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4569q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0156a c0156a;
                if (eVar instanceof C0156a) {
                    c0156a = (C0156a) eVar;
                    int i10 = c0156a.f4571r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0156a.f4571r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0156a = new C0156a(eVar);
                    }
                } else {
                    c0156a = new C0156a(eVar);
                }
                Object obj2 = c0156a.f4570q;
                Object objE = p139n8.b.e();
                int i11 = c0156a.f4571r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4569q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Number) obj).intValue() == 0);
                    c0156a.f4571r = 1;
                    if (interfaceC0881g.b(boolA, c0156a) == objE) {
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

        public h(InterfaceC0880f interfaceC0880f) {
            this.f4568q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4568q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class i implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4573q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4574q;

            /* JADX INFO: renamed from: L1.e$i$a$a, reason: collision with other inner class name */
            public static final class C0157a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4575q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4576r;

                public C0157a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4575q = obj;
                    this.f4576r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4574q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0157a c0157a;
                if (eVar instanceof C0157a) {
                    c0157a = (C0157a) eVar;
                    int i10 = c0157a.f4576r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0157a.f4576r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0157a = new C0157a(eVar);
                    }
                } else {
                    c0157a = new C0157a(eVar);
                }
                Object obj2 = c0157a.f4575q;
                Object objE = p139n8.b.e();
                int i11 = c0157a.f4576r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4574q;
                    A7.a aVar = ((Boolean) obj).booleanValue() ? A7.a.CENTER : A7.a.LEFT;
                    c0157a.f4576r = 1;
                    if (interfaceC0881g.b(aVar, c0157a) == objE) {
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

        public i(InterfaceC0880f interfaceC0880f) {
            this.f4573q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4573q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class j implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4578q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4579q;

            /* JADX INFO: renamed from: L1.e$j$a$a, reason: collision with other inner class name */
            public static final class C0158a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4580q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4581r;

                public C0158a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4580q = obj;
                    this.f4581r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4579q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0158a c0158a;
                if (eVar instanceof C0158a) {
                    c0158a = (C0158a) eVar;
                    int i10 = c0158a.f4581r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0158a.f4581r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0158a = new C0158a(eVar);
                    }
                } else {
                    c0158a = new C0158a(eVar);
                }
                Object obj2 = c0158a.f4580q;
                Object objE = p139n8.b.e();
                int i11 = c0158a.f4581r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4579q;
                    A7.g gVar = ((Number) obj).intValue() == 1 ? A7.g.ON : A7.g.OFF;
                    c0158a.f4581r = 1;
                    if (interfaceC0881g.b(gVar, c0158a) == objE) {
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

        public j(InterfaceC0880f interfaceC0880f) {
            this.f4578q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4578q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class k implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f4583q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f4584q;

            /* JADX INFO: renamed from: L1.e$k$a$a, reason: collision with other inner class name */
            public static final class C0159a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f4585q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f4586r;

                public C0159a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4585q = obj;
                    this.f4586r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f4584q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0159a c0159a;
                if (eVar instanceof C0159a) {
                    c0159a = (C0159a) eVar;
                    int i10 = c0159a.f4586r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0159a.f4586r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0159a = new C0159a(eVar);
                    }
                } else {
                    c0159a = new C0159a(eVar);
                }
                Object obj2 = c0159a.f4585q;
                Object objE = p139n8.b.e();
                int i11 = c0159a.f4586r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f4584q;
                    O1.a aVar = (O1.a) obj;
                    if (aVar != null) {
                        c0159a.f4586r = 1;
                        if (interfaceC0881g.b(aVar, c0159a) == objE) {
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

        public k(InterfaceC0880f interfaceC0880f) {
            this.f4583q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f4583q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public e(X2.a secureSettingsRepository, Q2.k registry, L mainScope, I mainDispatcher) {
        n.h(secureSettingsRepository, "secureSettingsRepository");
        n.h(registry, "registry");
        n.h(mainScope, "mainScope");
        n.h(mainDispatcher, "mainDispatcher");
        this.f4535a = secureSettingsRepository;
        this.f4536b = registry;
        this.f4537c = "ClockPickerRepository";
        this.f4538d = AbstractC0882h.E(AbstractC0882h.D(AbstractC0882h.e(new c(null)), mainDispatcher), new d(null));
        k kVar = new k(AbstractC0882h.D(AbstractC0882h.e(new C0153e(null)), mainDispatcher));
        K.a aVar = K.f3174a;
        this.f4539e = AbstractC0882h.J(kVar, mainScope, K.a.b(aVar, 0L, 0L, 3, null), 1);
        this.f4540f = AbstractC0882h.J(AbstractC0882h.o(new g(new f(secureSettingsRepository.a("clock_text_size", 0)))), mainScope, aVar.c(), 1);
        this.f4541g = AbstractC0882h.J(AbstractC0882h.o(new i(new h(secureSettingsRepository.a("clock_alignment", 0)))), mainScope, aVar.c(), 1);
        this.f4542h = AbstractC0882h.J(AbstractC0882h.o(new j(secureSettingsRepository.a("enable_dynamic_clockface_transition", 1))), mainScope, aVar.c(), 1);
    }

    static /* synthetic */ O1.a A(e eVar, s sVar, boolean z9, String str, Drawable drawable, boolean z10, O2.b bVar, String str2, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            str2 = null;
        }
        if ((i11 & 64) != 0) {
            i10 = 0;
        }
        if ((i11 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            num = null;
        }
        return eVar.z(sVar, z9, str, drawable, z10, bVar, str2, i10, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t(JSONObject jSONObject) {
        return jSONObject.optInt("metadataColorToneProgress", 75);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String v(JSONObject jSONObject) {
        if (jSONObject.isNull("metadataSelectedColorId")) {
            return null;
        }
        return jSONObject.getString("metadataSelectedColorId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v w(O2.f fVar, v oldSettings) {
        n.h(oldSettings, "oldSettings");
        v vVarF = v.f(oldSettings, null, null, fVar, 3, null);
        vVarF.k(oldSettings.i());
        return vVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v x(Integer num, String str, int i10, v oldSettings) {
        n.h(oldSettings, "oldSettings");
        v vVarF = v.f(oldSettings, null, num, null, 5, null);
        vVarF.k(oldSettings.i().put("metadataSelectedColorId", str).put("metadataColorToneProgress", i10));
        return vVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v y(String str, v oldSettings) {
        n.h(oldSettings, "oldSettings");
        v vVarF = v.f(oldSettings, str, null, null, 6, null);
        vVarF.k(oldSettings.i());
        return vVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O1.a z(s sVar, boolean z9, String str, Drawable drawable, boolean z10, O2.b bVar, String str2, int i10, Integer num) {
        return new O1.a(sVar.a(), z9, str, drawable, z10, bVar, str2, i10, num, sVar.c());
    }

    @Override // L1.a
    public InterfaceC0880f a() {
        return this.f4539e;
    }

    @Override // L1.a
    public Object b(A7.a aVar, p129m8.e eVar) {
        int i10 = b.f4544b[aVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new m();
            }
            i11 = 0;
        }
        com.nothing.wallpaper.common.log.c.k(this.f4537c, "setClockAlign align=" + aVar);
        Object objC = this.f4535a.c("clock_alignment", i11, eVar);
        return objC == p139n8.b.e() ? objC : A.f21846a;
    }

    @Override // L1.a
    public InterfaceC0880f c() {
        return this.f4542h;
    }

    @Override // L1.a
    public InterfaceC0880f d() {
        return this.f4538d;
    }

    @Override // L1.a
    public Object e(final String str, final int i10, final Integer num, p129m8.e eVar) {
        Object objF = this.f4536b.F(new p219v8.l() { // from class: L1.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.x(num, str, i10, (v) obj);
            }
        }, eVar);
        return objF == p139n8.b.e() ? objF : A.f21846a;
    }

    @Override // L1.a
    public InterfaceC0880f f() {
        return this.f4541g;
    }

    @Override // L1.a
    public Object g(N1.a aVar, p129m8.e eVar) {
        int i10 = b.f4543a[aVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new m();
            }
            i11 = 0;
        }
        com.nothing.wallpaper.common.log.c.k(this.f4537c, "setClockSize size=" + aVar);
        Object objC = this.f4535a.c("clock_text_size", i11, eVar);
        return objC == p139n8.b.e() ? objC : A.f21846a;
    }

    @Override // L1.a
    public Object h(final O2.f fVar, p129m8.e eVar) {
        Object objF = this.f4536b.F(new p219v8.l() { // from class: L1.c
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.w(fVar, (v) obj);
            }
        }, eVar);
        return objF == p139n8.b.e() ? objF : A.f21846a;
    }

    @Override // L1.a
    public Boolean i(String clockId) {
        n.h(clockId, "clockId");
        O2.t tVarX = this.f4536b.x(clockId);
        if (tVarX != null) {
            return Boolean.valueOf(tVarX.d());
        }
        return null;
    }

    @Override // L1.a
    public Object j(final String str, p129m8.e eVar) {
        com.nothing.wallpaper.common.log.c.k(this.f4537c, "setSelectedClock clockId=" + str);
        Object objF = this.f4536b.F(new p219v8.l() { // from class: L1.d
            @Override // p219v8.l
            public final Object f(Object obj) {
                return e.y(str, (v) obj);
            }
        }, eVar);
        return objF == p139n8.b.e() ? objF : A.f21846a;
    }

    @Override // L1.a
    public Object k(A7.g gVar, p129m8.e eVar) {
        com.nothing.wallpaper.common.log.c.k(this.f4537c, "setDynamicClockFaceTransition enable=" + gVar);
        int i10 = b.f4545c[gVar.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new m();
            }
            i11 = 0;
        }
        Object objC = this.f4535a.c("enable_dynamic_clockface_transition", i11, eVar);
        return objC == p139n8.b.e() ? objC : A.f21846a;
    }

    @Override // L1.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public E l() {
        return this.f4540f;
    }
}
