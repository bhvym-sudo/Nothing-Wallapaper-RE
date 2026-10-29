package p234x3;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f29872i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p194t3.a f29873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p204u3.a f29874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f29875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f29876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0880f f29877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0880f f29878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p164q3.a f29880h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29881q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p204u3.b f29883s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p204u3.b bVar, p129m8.e eVar) {
            super(1, eVar);
            this.f29883s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(p129m8.e eVar) {
            return g.this.new b(this.f29883s, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f29881q;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            p194t3.a aVar = g.this.f29873a;
            String strC = this.f29883s.c();
            long jA = this.f29883s.a();
            this.f29881q = 1;
            Object objD = aVar.d(strC, jA, this);
            return objD == objE ? objE : objD;
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object f(p129m8.e eVar) {
            return ((b) create(eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.r {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29884q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f29885r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ boolean f29886s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f29887t;

        c(p129m8.e eVar) {
            super(4, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f29884q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a((this.f29885r && !this.f29887t) || this.f29886s);
        }

        @Override // p219v8.r
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
            return s(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (p129m8.e) obj4);
        }

        public final Object s(boolean z9, boolean z10, boolean z11, p129m8.e eVar) {
            c cVar = new c(eVar);
            cVar.f29885r = z9;
            cVar.f29886s = z10;
            cVar.f29887t = z11;
            return cVar.invokeSuspend(A.f21846a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.r {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29888q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f29889r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ boolean f29890s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f29891t;

        d(p129m8.e eVar) {
            super(4, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f29888q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a((this.f29889r && !this.f29891t) || this.f29890s);
        }

        @Override // p219v8.r
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
            return s(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (p129m8.e) obj4);
        }

        public final Object s(boolean z9, boolean z10, boolean z11, p129m8.e eVar) {
            d dVar = new d(eVar);
            dVar.f29889r = z9;
            dVar.f29890s = z10;
            dVar.f29891t = z11;
            return dVar.invokeSuspend(A.f21846a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29892q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f29893r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ boolean f29894s;

        e(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (p129m8.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f29892q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f29893r && !this.f29894s);
        }

        public final Object s(boolean z9, boolean z10, p129m8.e eVar) {
            e eVar2 = new e(eVar);
            eVar2.f29893r = z9;
            eVar2.f29894s = z10;
            return eVar2.invokeSuspend(A.f21846a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.r {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f29895q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ boolean f29896r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ boolean f29897s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f29898t;

        f(p129m8.e eVar) {
            super(4, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f29895q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            boolean z9 = this.f29896r;
            boolean z10 = this.f29897s;
            boolean z11 = this.f29898t;
            return kotlin.coroutines.jvm.internal.b.a((z11 && !z10) || !(z11 || z9));
        }

        @Override // p219v8.r
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
            return s(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (p129m8.e) obj4);
        }

        public final Object s(boolean z9, boolean z10, boolean z11, p129m8.e eVar) {
            f fVar = new f(eVar);
            fVar.f29896r = z9;
            fVar.f29897s = z10;
            fVar.f29898t = z11;
            return fVar.invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: x3.g$g, reason: collision with other inner class name */
    static final class C0733g implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p204u3.b f29900r;

        /* JADX INFO: renamed from: x3.g$g$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f29901q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f29902r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p204u3.b f29903s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, p204u3.b bVar, p129m8.e eVar) {
                super(2, eVar);
                this.f29902r = gVar;
                this.f29903s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f29902r, this.f29903s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f29901q;
                if (i10 == 0) {
                    r.b(obj);
                    p194t3.a aVar = this.f29902r.f29873a;
                    p204u3.a aVar2 = this.f29902r.f29874b;
                    String strC = this.f29903s.c();
                    this.f29901q = 1;
                    if (aVar.h(aVar2, strC, this) == objE) {
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

        C0733g(p204u3.b bVar) {
            this.f29900r = bVar;
        }

        public final void a() {
            AbstractC0816i.d(g.this.f29875c, null, null, new a(g.this, this.f29900r, null), 3, null);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    public static final class h implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29904q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29905q;

            /* JADX INFO: renamed from: x3.g$h$a$a, reason: collision with other inner class name */
            public static final class C0734a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29906q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29907r;

                public C0734a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29906q = obj;
                    this.f29907r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f29905q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0734a c0734a;
                if (eVar instanceof C0734a) {
                    c0734a = (C0734a) eVar;
                    int i10 = c0734a.f29907r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0734a.f29907r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0734a = new C0734a(eVar);
                    }
                } else {
                    c0734a = new C0734a(eVar);
                }
                Object obj2 = c0734a.f29906q;
                Object objE = p139n8.b.e();
                int i11 = c0734a.f29907r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f29905q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((String) obj) != null);
                    c0734a.f29907r = 1;
                    if (interfaceC0881g.b(boolA, c0734a) == objE) {
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
            this.f29904q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f29904q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class i implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29909q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p204u3.b f29910r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29911q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p204u3.b f29912r;

            /* JADX INFO: renamed from: x3.g$i$a$a, reason: collision with other inner class name */
            public static final class C0735a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29913q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29914r;

                public C0735a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29913q = obj;
                    this.f29914r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, p204u3.b bVar) {
                this.f29911q = interfaceC0881g;
                this.f29912r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0735a c0735a;
                if (eVar instanceof C0735a) {
                    c0735a = (C0735a) eVar;
                    int i10 = c0735a.f29914r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0735a.f29914r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0735a = new C0735a(eVar);
                    }
                } else {
                    c0735a = new C0735a(eVar);
                }
                Object obj2 = c0735a.f29913q;
                Object objE = p139n8.b.e();
                int i11 = c0735a.f29914r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f29911q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(n.d((String) obj, this.f29912r.c()));
                    c0735a.f29914r = 1;
                    if (interfaceC0881g.b(boolA, c0735a) == objE) {
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

        public i(InterfaceC0880f interfaceC0880f, p204u3.b bVar) {
            this.f29909q = interfaceC0880f;
            this.f29910r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f29909q.a(new a(interfaceC0881g, this.f29910r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class j implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29916q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p204u3.b f29917r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29918q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p204u3.b f29919r;

            /* JADX INFO: renamed from: x3.g$j$a$a, reason: collision with other inner class name */
            public static final class C0736a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29920q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29921r;

                public C0736a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29920q = obj;
                    this.f29921r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, p204u3.b bVar) {
                this.f29918q = interfaceC0881g;
                this.f29919r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0736a c0736a;
                if (eVar instanceof C0736a) {
                    c0736a = (C0736a) eVar;
                    int i10 = c0736a.f29921r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0736a.f29921r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0736a = new C0736a(eVar);
                    }
                } else {
                    c0736a = new C0736a(eVar);
                }
                Object obj2 = c0736a.f29920q;
                Object objE = p139n8.b.e();
                int i11 = c0736a.f29921r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f29918q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(n.d((String) obj, this.f29919r.c()));
                    c0736a.f29921r = 1;
                    if (interfaceC0881g.b(boolA, c0736a) == objE) {
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

        public j(InterfaceC0880f interfaceC0880f, p204u3.b bVar) {
            this.f29916q = interfaceC0880f;
            this.f29917r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f29916q.a(new a(interfaceC0881g, this.f29917r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class k implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29923q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g f29924r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p204u3.b f29925s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29926q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f29927r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p204u3.b f29928s;

            /* JADX INFO: renamed from: x3.g$k$a$a, reason: collision with other inner class name */
            public static final class C0737a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29929q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29930r;

                public C0737a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29929q = obj;
                    this.f29930r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, g gVar, p204u3.b bVar) {
                this.f29926q = interfaceC0881g;
                this.f29927r = gVar;
                this.f29928s = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0737a c0737a;
                if (eVar instanceof C0737a) {
                    c0737a = (C0737a) eVar;
                    int i10 = c0737a.f29930r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0737a.f29930r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0737a = new C0737a(eVar);
                    }
                } else {
                    c0737a = new C0737a(eVar);
                }
                Object obj2 = c0737a.f29929q;
                Object objE = p139n8.b.e();
                int i11 = c0737a.f29930r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f29926q;
                    C0733g c0733g = ((Boolean) obj).booleanValue() ? this.f29927r.new C0733g(this.f29928s) : null;
                    c0737a.f29930r = 1;
                    if (interfaceC0881g.b(c0733g, c0737a) == objE) {
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

        public k(InterfaceC0880f interfaceC0880f, g gVar, p204u3.b bVar) {
            this.f29923q = interfaceC0880f;
            this.f29924r = gVar;
            this.f29925s = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f29923q.a(new a(interfaceC0881g, this.f29924r, this.f29925s), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class l implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f29932q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g f29933r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f29934q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ g f29935r;

            /* JADX INFO: renamed from: x3.g$l$a$a, reason: collision with other inner class name */
            public static final class C0738a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f29936q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f29937r;

                public C0738a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f29936q = obj;
                    this.f29937r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, g gVar) {
                this.f29934q = interfaceC0881g;
                this.f29935r = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0738a c0738a;
                if (eVar instanceof C0738a) {
                    c0738a = (C0738a) eVar;
                    int i10 = c0738a.f29937r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0738a.f29937r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0738a = new C0738a(eVar);
                    }
                } else {
                    c0738a = new C0738a(eVar);
                }
                Object obj2 = c0738a.f29936q;
                Object objE = p139n8.b.e();
                int i11 = c0738a.f29937r;
                int i12 = 1;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f29934q;
                    h hVar = new h(AbstractC0882h.o(this.f29935r.f29877e));
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        p204u3.b bVar = (p204u3.b) it.next();
                        i iVar = new i(AbstractC0882h.o(this.f29935r.f29876d), bVar);
                        j jVar = new j(AbstractC0882h.o(this.f29935r.f29877e), bVar);
                        arrayList.add(new p234x3.e(bVar.c(), bVar.b(), this.f29935r.new b(bVar, null), AbstractC0882h.k(iVar, jVar, hVar, new c(null)), jVar, AbstractC0882h.k(iVar, jVar, hVar, new d(null)), AbstractC0882h.l(iVar, hVar, new e(null)), new k(AbstractC0882h.o(AbstractC0882h.k(iVar, jVar, hVar, new f(null))), this.f29935r, bVar)));
                        it = it;
                        i12 = 1;
                    }
                    c0738a.f29937r = i12;
                    if (interfaceC0881g.b(arrayList, c0738a) == objE) {
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

        public l(InterfaceC0880f interfaceC0880f, g gVar) {
            this.f29932q = interfaceC0880f;
            this.f29933r = gVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f29932q.a(new a(interfaceC0881g, this.f29933r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public g(p194t3.a interactor, p204u3.a destination, L coroutineScope, int i10) {
        n.h(interactor, "interactor");
        n.h(destination, "destination");
        n.h(coroutineScope, "coroutineScope");
        this.f29873a = interactor;
        this.f29874b = destination;
        this.f29875c = coroutineScope;
        O oF = interactor.f(destination);
        K.a aVar = K.f3174a;
        this.f29876d = AbstractC0882h.J(oF, coroutineScope, K.a.b(aVar, 0L, 0L, 3, null), 1);
        this.f29877e = AbstractC0882h.J(interactor.g(destination), coroutineScope, K.a.b(aVar, 0L, 0L, 3, null), 1);
        this.f29878f = AbstractC0882h.J(new l(AbstractC0882h.p(interactor.e(destination, i10), new p219v8.l() { // from class: x3.f
            @Override // p219v8.l
            public final Object f(Object obj) {
                return g.j((List) obj);
            }
        }), this), coroutineScope, aVar.d(), 1);
        boolean zA = interactor.a();
        this.f29879g = zA;
        this.f29880h = zA ? new q3.a.c(R.string.more_wallpapers) : new q3.a.c(R.string.wallpaper_picker_entry_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(List previews) {
        n.h(previews, "previews");
        List<p204u3.b> list = previews;
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
        for (p204u3.b bVar : list) {
            arrayList.add(bVar.c() + bVar.a());
        }
        return AbstractC1444s.a0(AbstractC1444s.l0(arrayList), ",", null, null, 0, null, null, 62, null);
    }

    public final p164q3.a g() {
        return this.f29880h;
    }

    public final boolean h() {
        return this.f29879g;
    }

    public final InterfaceC0880f i() {
        return this.f29878f;
    }

    public /* synthetic */ g(p194t3.a aVar, p204u3.a aVar2, L l9, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(aVar, aVar2, l9, (i11 & 8) != 0 ? aVar.b() : i10);
    }
}
