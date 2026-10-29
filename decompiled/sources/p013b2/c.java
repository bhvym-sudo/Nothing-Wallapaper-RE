package p013b2;

import F8.AbstractC0816i;
import F8.L;
import I8.A;
import I8.AbstractC0882h;
import I8.E;
import I8.G;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import I8.Q;
import I8.z;
import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.log.FileLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.S;
import p074h3.U;
import p074h3.W;
import p079h8.r;
import p079h8.v;
import p089i8.AbstractC1444s;
import p089i8.N;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0424c f14699u = new C0424c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f14700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V1.a f14701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A f14702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f14704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O f14705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f14707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private W1.a f14708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p079h8.h f14709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z f14710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private z f14711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC0880f f14713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC0880f f14714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC0880f f14715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC0880f f14716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC0880f f14717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC0880f f14718t;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f14719q;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return c.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f14719q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            c.this.f14704f.setValue(kotlin.coroutines.jvm.internal.b.a(O6.b.b(c.this.f14700b)));
            return p079h8.A.f21846a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f14721q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f14723q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f14724r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ c f14725s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, p129m8.e eVar) {
                super(2, eVar);
                this.f14725s = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f14725s, eVar);
                aVar.f14724r = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f14723q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                W1.a aVar = (W1.a) this.f14724r;
                if (aVar != null) {
                    this.f14725s.f14704f.setValue(kotlin.coroutines.jvm.internal.b.a(kotlin.jvm.internal.n.d("Bauhaus", aVar.a().g())));
                }
                return p079h8.A.f21846a;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(W1.a aVar, p129m8.e eVar) {
                return ((a) create(aVar, eVar)).invokeSuspend(p079h8.A.f21846a);
            }
        }

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return c.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f14721q;
            if (i10 == 0) {
                r.b(obj);
                A a10 = c.this.f14701c.a();
                a aVar = new a(c.this, null);
                this.f14721q = 1;
                if (AbstractC0882h.i(a10, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: b2.c$c, reason: collision with other inner class name */
    public static final class C0424c {
        public /* synthetic */ C0424c(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0424c() {
        }
    }

    public static final class d implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f14726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V1.a f14727c;

        public d(Context context, V1.a interactor) {
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(interactor, "interactor");
            this.f14726b = context;
            this.f14727c = interactor;
        }

        @Override // androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            return new c(this.f14726b, this.f14727c, null);
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14728a;

        static {
            int[] iArr = new int[W1.b.values().length];
            try {
                iArr[W1.b.WALLPAPER_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W1.b.PRESET_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14728a = iArr;
        }
    }

    static final class f implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ W1.a f14730r;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f14731q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ W1.a f14732r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ c f14733s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(W1.a aVar, c cVar, p129m8.e eVar) {
                super(2, eVar);
                this.f14732r = aVar;
                this.f14733s = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f14732r, this.f14733s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
            
                if (r5.b(r1, r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
            
                if (r5.e(r1, r4) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p139n8.b.e()
                    int r1 = r4.f14731q
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    p079h8.r.b(r5)
                    goto L59
                L12:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L1a:
                    p079h8.r.b(r5)
                    goto L63
                L1e:
                    p079h8.r.b(r5)
                    W1.a r5 = r4.f14732r
                    x1.g r5 = r5.a()
                    x1.h r5 = (p232x1.h) r5
                    java.lang.String r5 = r5.g()
                    java.lang.String r1 = "Bauhaus"
                    boolean r5 = kotlin.jvm.internal.n.d(r5, r1)
                    if (r5 == 0) goto L48
                    b2.c r5 = r4.f14733s
                    I8.z r5 = p013b2.c.j(r5)
                    java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
                    r4.f14731q = r3
                    java.lang.Object r4 = r5.b(r1, r4)
                    if (r4 != r0) goto L63
                    goto L58
                L48:
                    b2.c r5 = r4.f14733s
                    V1.a r5 = p013b2.c.h(r5)
                    W1.a r1 = r4.f14732r
                    r4.f14731q = r2
                    java.lang.Object r5 = r5.e(r1, r4)
                    if (r5 != r0) goto L59
                L58:
                    return r0
                L59:
                    b2.c r4 = r4.f14733s
                    android.content.Context r4 = p013b2.c.g(r4)
                    r5 = 0
                    O6.b.g(r4, r5)
                L63:
                    h8.A r4 = p079h8.A.f21846a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: b2.c.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        f(W1.a aVar) {
            this.f14730r = aVar;
        }

        public final void a() {
            AbstractC0816i.d(b0.a(c.this), null, null, new a(this.f14730r, c.this, null), 3, null);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    public static final class g implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f14734q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ W1.a f14735r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f14736q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ W1.a f14737r;

            /* JADX INFO: renamed from: b2.c$g$a$a, reason: collision with other inner class name */
            public static final class C0425a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f14738q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f14739r;

                public C0425a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14738q = obj;
                    this.f14739r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, W1.a aVar) {
                this.f14736q = interfaceC0881g;
                this.f14737r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0425a c0425a;
                p232x1.g gVarA;
                if (eVar instanceof C0425a) {
                    c0425a = (C0425a) eVar;
                    int i10 = c0425a.f14739r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0425a.f14739r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0425a = new C0425a(eVar);
                    }
                } else {
                    c0425a = new C0425a(eVar);
                }
                Object obj2 = c0425a.f14738q;
                Object objE = p139n8.b.e();
                int i11 = c0425a.f14739r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f14736q;
                    W1.a aVar = (W1.a) obj;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a((aVar == null || (gVarA = aVar.a()) == null) ? this.f14737r.c() : gVarA.j(this.f14737r.a()));
                    c0425a.f14739r = 1;
                    if (interfaceC0881g.b(boolA, c0425a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public g(InterfaceC0880f interfaceC0880f, W1.a aVar) {
            this.f14734q = interfaceC0880f;
            this.f14735r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f14734q.a(new a(interfaceC0881g, this.f14735r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class h implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f14741q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f14742r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ W1.a f14743s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f14744q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ c f14745r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ W1.a f14746s;

            /* JADX INFO: renamed from: b2.c$h$a$a, reason: collision with other inner class name */
            public static final class C0426a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f14747q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f14748r;

                public C0426a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14747q = obj;
                    this.f14748r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, c cVar, W1.a aVar) {
                this.f14744q = interfaceC0881g;
                this.f14745r = cVar;
                this.f14746s = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0426a c0426a;
                if (eVar instanceof C0426a) {
                    c0426a = (C0426a) eVar;
                    int i10 = c0426a.f14748r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0426a.f14748r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0426a = new C0426a(eVar);
                    }
                } else {
                    c0426a = new C0426a(eVar);
                }
                Object obj2 = c0426a.f14747q;
                Object objE = p139n8.b.e();
                int i11 = c0426a.f14748r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f14744q;
                    f fVar = ((Boolean) obj).booleanValue() ? null : this.f14745r.new f(this.f14746s);
                    c0426a.f14748r = 1;
                    if (interfaceC0881g.b(fVar, c0426a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public h(InterfaceC0880f interfaceC0880f, c cVar, W1.a aVar) {
            this.f14741q = interfaceC0880f;
            this.f14742r = cVar;
            this.f14743s = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f14741q.a(new a(interfaceC0881g, this.f14742r, this.f14743s), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class i implements U.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f14751b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f14752q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ c f14753r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Activity f14754s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, Activity activity, p129m8.e eVar) {
                super(2, eVar);
                this.f14753r = cVar;
                this.f14754s = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f14753r, this.f14754s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f14752q;
                if (i10 == 0) {
                    r.b(obj);
                    W1.a aVar = this.f14753r.f14708j;
                    if (aVar != null) {
                        V1.a aVar2 = this.f14753r.f14701c;
                        this.f14752q = 1;
                        if (aVar2.e(aVar, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                O6.b.g(this.f14754s, true);
                return p079h8.A.f21846a;
            }
        }

        i(Activity activity) {
            this.f14751b = activity;
        }

        @Override // h3.U.a
        public void a(Throwable th) {
            FileLog.e("ColorPickerViewModel", "set wallpaper failed, exception:" + (th != null ? th.getMessage() : null));
        }

        @Override // h3.U.a
        public void b(x xVar, int i10) {
            FileLog.d("ColorPickerViewModel", "set wallpaper success");
            AbstractC0816i.d(b0.a(c.this), null, null, new a(c.this, this.f14751b, null), 3, null);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f14755q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f14756r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f14757s;

        j(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f14755q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            Map map = (Map) this.f14756r;
            W1.b bVar = (W1.b) this.f14757s;
            if (bVar == null) {
                bVar = W1.b.WALLPAPER_COLOR;
            }
            Object obj2 = map.get(bVar);
            kotlin.jvm.internal.n.e(obj2);
            return obj2;
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(Map map, W1.b bVar, p129m8.e eVar) {
            j jVar = new j(eVar);
            jVar.f14756r = map;
            jVar.f14757s = bVar;
            return jVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f14758q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f14759r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f14760s;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14762a;

            static {
                int[] iArr = new int[W1.b.values().length];
                try {
                    iArr[W1.b.WALLPAPER_COLOR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[W1.b.PRESET_COLOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14762a = iArr;
            }
        }

        k(p129m8.e eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A v(c cVar, W1.b bVar) {
            cVar.f14702d.setValue(bVar);
            return p079h8.A.f21846a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            p139n8.b.e();
            if (this.f14758q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            Map map = (Map) this.f14759r;
            W1.b bVar = (W1.b) this.f14760s;
            Set setKeySet = map.keySet();
            final c cVar = c.this;
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(setKeySet, 10));
            int i10 = 0;
            for (Object obj2 : setKeySet) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1444s.t();
                }
                final W1.b bVar2 = (W1.b) obj2;
                boolean z9 = (bVar == null && i10 == 0) || bVar == bVar2;
                int i12 = a.f14762a[bVar2.ordinal()];
                if (i12 == 1) {
                    string = cVar.f14700b.getResources().getString(R.string.wallpaper_color_tab);
                } else {
                    if (i12 != 2) {
                        throw new p079h8.m();
                    }
                    string = cVar.f14700b.getResources().getString(R.string.preset_color_tab);
                }
                kotlin.jvm.internal.n.e(string);
                p219v8.a aVar = z9 ? null : new p219v8.a() { // from class: b2.d
                    @Override // p219v8.a
                    public final Object invoke() {
                        return c.k.v(cVar, bVar2);
                    }
                };
                List list = (List) map.get(bVar2);
                arrayList.add(v.a(bVar2, new p013b2.e(string, z9, aVar, list != null ? list.size() : -1)));
                i10 = i11;
            }
            return N.n(arrayList);
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object e(Map map, W1.b bVar, p129m8.e eVar) {
            k kVar = c.this.new k(eVar);
            kVar.f14759r = map;
            kVar.f14760s = bVar;
            return kVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class l implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f14763q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f14764r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f14765q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ c f14766r;

            /* JADX INFO: renamed from: b2.c$l$a$a, reason: collision with other inner class name */
            public static final class C0427a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f14767q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f14768r;

                public C0427a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14767q = obj;
                    this.f14768r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, c cVar) {
                this.f14765q = interfaceC0881g;
                this.f14766r = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0427a c0427a;
                String string;
                if (eVar instanceof C0427a) {
                    c0427a = (C0427a) eVar;
                    int i10 = c0427a.f14768r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0427a.f14768r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0427a = new C0427a(eVar);
                    }
                } else {
                    c0427a = new C0427a(eVar);
                }
                Object obj2 = c0427a.f14767q;
                Object objE = p139n8.b.e();
                int i11 = c0427a.f14768r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f14765q;
                    W1.b bVar = (W1.b) obj;
                    if (bVar == null) {
                        bVar = W1.b.WALLPAPER_COLOR;
                    }
                    int i12 = e.f14728a[bVar.ordinal()];
                    if (i12 == 1) {
                        string = this.f14766r.f14700b.getResources().getString(R.string.wallpaper_color_subheader);
                    } else {
                        if (i12 != 2) {
                            throw new p079h8.m();
                        }
                        string = this.f14766r.f14700b.getResources().getString(R.string.preset_color_subheader);
                    }
                    c0427a.f14768r = 1;
                    if (interfaceC0881g.b(string, c0427a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public l(InterfaceC0880f interfaceC0880f, c cVar) {
            this.f14763q = interfaceC0880f;
            this.f14764r = cVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f14763q.a(new a(interfaceC0881g, this.f14764r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class m implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f14770q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f14771r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f14772q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ c f14773r;

            /* JADX INFO: renamed from: b2.c$m$a$a, reason: collision with other inner class name */
            public static final class C0428a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                Object f14774A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                Object f14775B;

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                Object f14776C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                Object f14777D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                Object f14778E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                Object f14779F;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f14780q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f14781r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f14782s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f14784u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f14785v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                Object f14786w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                Object f14787x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                Object f14788y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                Object f14789z;

                public C0428a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14780q = obj;
                    this.f14781r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, c cVar) {
                this.f14772q = interfaceC0881g;
                this.f14773r = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:28:0x0132  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0094 -> B:20:0x00b7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0132 -> B:29:0x013d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                java.lang.StackOverflowError
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
                */
            @Override // I8.InterfaceC0881g
            public final java.lang.Object b(java.lang.Object r30, p129m8.e r31) {
                /*
                    Method dump skipped, instruction units count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: b2.c.m.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public m(InterfaceC0880f interfaceC0880f, c cVar) {
            this.f14770q = interfaceC0880f;
            this.f14771r = cVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f14770q.a(new a(interfaceC0881g, this.f14771r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class n implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f14790q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f14791q;

            /* JADX INFO: renamed from: b2.c$n$a$a, reason: collision with other inner class name */
            public static final class C0429a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f14792q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f14793r;

                public C0429a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14792q = obj;
                    this.f14793r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f14791q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0429a c0429a;
                if (eVar instanceof C0429a) {
                    c0429a = (C0429a) eVar;
                    int i10 = c0429a.f14793r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0429a.f14793r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0429a = new C0429a(eVar);
                    }
                } else {
                    c0429a = new C0429a(eVar);
                }
                Object obj2 = c0429a.f14792q;
                Object objE = p139n8.b.e();
                int i11 = c0429a.f14793r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f14791q;
                    Map map = (Map) obj;
                    List list = (List) map.get(W1.b.WALLPAPER_COLOR);
                    List list2 = (List) map.get(W1.b.PRESET_COLOR);
                    kotlin.jvm.internal.n.e(list);
                    List listSubList = list.subList(0, Math.min(5, list.size()));
                    kotlin.jvm.internal.n.e(list2);
                    List listG0 = AbstractC1444s.g0(listSubList, list2.subList(0, Math.min(Math.max(0, 5 - list.size()), list2.size())));
                    c0429a.f14793r = 1;
                    if (interfaceC0881g.b(listG0, c0429a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public n(InterfaceC0880f interfaceC0880f) {
            this.f14790q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f14790q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public static final class o implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f14795q;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f14796q;

            /* JADX INFO: renamed from: b2.c$o$a$a, reason: collision with other inner class name */
            public static final class C0430a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f14797q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f14798r;

                public C0430a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14797q = obj;
                    this.f14798r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g) {
                this.f14796q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0430a c0430a;
                if (eVar instanceof C0430a) {
                    c0430a = (C0430a) eVar;
                    int i10 = c0430a.f14798r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0430a.f14798r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0430a = new C0430a(eVar);
                    }
                } else {
                    c0430a = new C0430a(eVar);
                }
                Object obj2 = c0430a.f14797q;
                Object objE = p139n8.b.e();
                int i11 = c0430a.f14798r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f14796q;
                    Map map = (Map) obj;
                    List list = (List) map.get(W1.b.WALLPAPER_COLOR);
                    List list2 = (List) map.get(W1.b.PRESET_COLOR);
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        kotlin.coroutines.jvm.internal.b.a(arrayList.addAll(list));
                    }
                    if (list2 != null) {
                        kotlin.coroutines.jvm.internal.b.a(arrayList.addAll(list2));
                    }
                    c0430a.f14798r = 1;
                    if (interfaceC0881g.b(arrayList, c0430a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public o(InterfaceC0880f interfaceC0880f) {
            this.f14795q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f14795q.a(new a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public /* synthetic */ c(Context context, V1.a aVar, AbstractC1457h abstractC1457h) {
        this(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p074h3.a0 C(c cVar) {
        H hA = I.a();
        kotlin.jvm.internal.n.f(hA, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector");
        K1.a aVar = (K1.a) hA;
        Context applicationContext = cVar.f14700b.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        U uA = aVar.A(applicationContext);
        Context applicationContext2 = cVar.f14700b.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext2, "getApplicationContext(...)");
        W wF = aVar.f(applicationContext2);
        Context applicationContext3 = cVar.f14700b.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext3, "getApplicationContext(...)");
        S sQ = aVar.q(applicationContext3);
        Context applicationContext4 = cVar.f14700b.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext4, "getApplicationContext(...)");
        return new p074h3.a0(uA, wF, sQ, aVar.k(applicationContext4));
    }

    private final p074h3.a0 w() {
        return (p074h3.a0) this.f14709k.getValue();
    }

    public final void A(boolean z9) {
        this.f14706h = z9;
        this.f14702d.setValue(W1.b.PRESET_COLOR);
    }

    public final void B(boolean z9) {
        this.f14707i = z9;
        if (z9) {
            this.f14701c.d();
            O6.b.h(this.f14700b, true);
            this.f14704f.setValue(Boolean.valueOf(O6.b.b(this.f14700b)));
            if (((Boolean) this.f14704f.getValue()).booleanValue()) {
                O6.b.g(this.f14700b, true);
            }
        }
    }

    public final void m(Activity activity) {
        kotlin.jvm.internal.n.h(activity, "activity");
        FileLog.d("ColorPickerViewModel", "applyBauhausColorOption");
        w().s(activity, J6.c.f3547G.a(activity), 2, new i(activity));
        this.f14712n = true;
    }

    public final InterfaceC0880f n() {
        return this.f14718t;
    }

    public final z o() {
        return this.f14711m;
    }

    public final InterfaceC0880f p() {
        return this.f14716r;
    }

    public final InterfaceC0880f q() {
        return this.f14717s;
    }

    public final InterfaceC0880f r() {
        return this.f14714p;
    }

    public final InterfaceC0880f s() {
        return this.f14713o;
    }

    public final String t() {
        return this.f14703e;
    }

    public final boolean u() {
        return this.f14706h;
    }

    public final boolean v() {
        return this.f14707i;
    }

    public final boolean x() {
        return this.f14712n;
    }

    public final O y() {
        return this.f14705g;
    }

    public final boolean z() {
        return Settings.Secure.getInt(this.f14700b.getContentResolver(), "theme_extra_darkmode", 0) == 1;
    }

    private c(Context context, V1.a aVar) {
        this.f14700b = context;
        this.f14701c = aVar;
        A a10 = Q.a(kotlin.jvm.internal.n.d(aVar.c().a().e(), "preset") ? W1.b.PRESET_COLOR : W1.b.WALLPAPER_COLOR);
        this.f14702d = a10;
        this.f14703e = aVar.c().a().d();
        A a11 = Q.a(Boolean.FALSE);
        this.f14704f = a11;
        this.f14705g = AbstractC0882h.b(a11);
        this.f14709k = p079h8.i.b(new p219v8.a() { // from class: b2.b
            @Override // p219v8.a
            public final Object invoke() {
                return c.C(this.f14698q);
            }
        });
        z zVarB = G.b(0, 0, null, 6, null);
        this.f14710l = zVarB;
        this.f14711m = zVarB;
        this.f14713o = AbstractC0882h.l(aVar.b(), a10, new k(null));
        this.f14714p = new l(a10, this);
        m mVar = new m(aVar.b(), this);
        L lA = b0.a(this);
        K.a aVar2 = K.f3174a;
        E eJ = AbstractC0882h.J(mVar, lA, K.a.b(aVar2, 0L, 0L, 3, null), 1);
        this.f14715q = eJ;
        this.f14716r = AbstractC0882h.J(AbstractC0882h.l(eJ, a10, new j(null)), b0.a(this), aVar2.c(), 1);
        this.f14717s = AbstractC0882h.J(new n(eJ), b0.a(this), K.a.b(aVar2, 0L, 0L, 3, null), 1);
        this.f14718t = AbstractC0882h.J(new o(eJ), b0.a(this), K.a.b(aVar2, 0L, 0L, 3, null), 1);
        AbstractC0816i.d(b0.a(this), null, null, new a(null), 3, null);
        AbstractC0816i.d(b0.a(this), null, null, new b(null), 3, null);
    }
}
