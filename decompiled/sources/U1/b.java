package U1;

import F8.C0826n;
import F8.InterfaceC0822l;
import F8.L;
import I8.A;
import I8.AbstractC0882h;
import I8.E;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import I8.Q;
import L2.p;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.s;
import p079h8.m;
import p079h8.q;
import p079h8.v;
import p089i8.N;
import p219v8.r;
import p232x1.g;
import p232x1.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements U1.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f7807h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p232x1.c f7808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f7809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f7810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A f7811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0880f f7813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E f7814g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: U1.b$b, reason: collision with other inner class name */
    static final class C0286b extends l implements r {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7815q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f7816r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f7817s;

        C0286b(p129m8.e eVar) {
            super(4, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f7815q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return v.a((s) this.f7816r, (s) this.f7817s);
        }

        @Override // p219v8.r
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
            return s((s) obj, (s) obj2, ((Number) obj3).intValue(), (p129m8.e) obj4);
        }

        public final Object s(s sVar, s sVar2, int i10, p129m8.e eVar) {
            C0286b c0286b = new C0286b(eVar);
            c0286b.f7816r = sVar;
            c0286b.f7817s = sVar2;
            return c0286b.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final class c implements w1.a.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f7819b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7820a;

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
                f7820a = iArr;
            }
        }

        c(InterfaceC0822l interfaceC0822l) {
            this.f7819b = interfaceC0822l;
        }

        @Override // w1.a.b
        public void a(Throwable th) {
            Log.e("ColorPickerRepositoryImpl", "Error loading theme bundles", th);
            b.this.f7812e = false;
            InterfaceC0822l interfaceC0822l = this.f7819b;
            q.a aVar = q.f21862r;
            if (th == null) {
                th = new Throwable("Error loading theme bundles");
            }
            interfaceC0822l.resumeWith(q.b(p079h8.r.a(th)));
        }

        @Override // w1.a.b
        public void b(List list) {
            b.this.f7812e = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                b bVar = b.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    n.f(gVar, "null cannot be cast to non-null type com.android.customization.model.color.ColorOptionImpl");
                    h hVar = (h) gVar;
                    int i10 = a.f7820a[hVar.o().ordinal()];
                    if (i10 == 1) {
                        arrayList.add(bVar.j(hVar));
                    } else {
                        if (i10 != 2) {
                            throw new m();
                        }
                        arrayList2.add(bVar.j(hVar));
                    }
                }
            }
            InterfaceC0822l interfaceC0822l = this.f7819b;
            q.a aVar = q.f21862r;
            interfaceC0822l.resumeWith(q.b(N.i(v.a(W1.b.WALLPAPER_COLOR, arrayList), v.a(W1.b.PRESET_COLOR, arrayList2))));
        }
    }

    public static final class d implements p222w1.a.InterfaceC0718a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f7821a;

        d(InterfaceC0822l interfaceC0822l) {
            this.f7821a = interfaceC0822l;
        }

        @Override // p222w1.a.InterfaceC0718a
        public void a(Throwable th) {
            Log.w("ColorPickerRepositoryImpl", "Apply theme with error", th);
            InterfaceC0822l interfaceC0822l = this.f7821a;
            q.a aVar = q.f21862r;
            if (th == null) {
                th = new Throwable("Error loading theme bundles");
            }
            interfaceC0822l.resumeWith(q.b(p079h8.r.a(th)));
        }

        @Override // p222w1.a.InterfaceC0718a
        public void b() {
            InterfaceC0822l interfaceC0822l = this.f7821a;
            q.a aVar = q.f21862r;
            interfaceC0822l.resumeWith(q.b(p079h8.A.f21846a));
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7822q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f7823r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7824q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f7825r;

            /* JADX INFO: renamed from: U1.b$e$a$a, reason: collision with other inner class name */
            public static final class C0287a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7826q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7827r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f7828s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f7830u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f7831v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                Object f7832w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                Object f7833x;

                public C0287a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7826q = obj;
                    this.f7827r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f7824q = interfaceC0881g;
                this.f7825r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
            
                if (r8.b(r10, r0) == r1) goto L31;
             */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r9, p129m8.e r10) {
                /*
                    Method dump skipped, instruction units count: 261
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: U1.b.e.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public e(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f7822q = interfaceC0880f;
            this.f7823r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f7822q.a(new a(interfaceC0881g, this.f7823r), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    public b(L scope, p064g3.v wallpaperColorsViewModel, p232x1.c colorManager) {
        n.h(scope, "scope");
        n.h(wallpaperColorsViewModel, "wallpaperColorsViewModel");
        n.h(colorManager, "colorManager");
        this.f7808a = colorManager;
        O oE = wallpaperColorsViewModel.e();
        this.f7809b = oE;
        O oF = wallpaperColorsViewModel.f();
        this.f7810c = oF;
        A a10 = Q.a(0);
        this.f7811d = a10;
        e eVar = new e(AbstractC0882h.k(oE, oF, a10, new C0286b(null)), this);
        this.f7813f = eVar;
        this.f7814g = AbstractC0882h.J(eVar, scope, K.a.b(K.f3174a, 0L, 0L, 3, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W1.a j(h hVar) {
        return new W1.a(hVar.o() + "::" + hVar.f() + "::" + hVar.d(), hVar, hVar.h(this.f7808a));
    }

    @Override // U1.a
    public void a() {
        A a10 = this.f7811d;
        a10.setValue(Integer.valueOf(((Number) a10.getValue()).intValue() + 1));
        a10.setValue(a10.getValue());
        com.nothing.wallpaper.common.log.c.d("ColorPickerRepositoryImpl", "reloadColorOptions " + this.f7811d.getValue());
        this.f7812e = true;
    }

    @Override // U1.a
    public W1.a c() {
        Map mapO = this.f7808a.o();
        String strP = this.f7808a.p();
        int iB = 1;
        if (strP != null && strP.length() != 0) {
            try {
                iB = p.b(strP);
            } catch (Exception e10) {
                com.nothing.wallpaper.common.log.c.h("ColorPickerRepositoryImpl", e10);
            }
        }
        String strM = this.f7808a.m();
        h.a aVar = new h.a();
        aVar.k(this.f7808a.p());
        aVar.f(this.f7808a.n());
        aVar.i(strM);
        aVar.j(iB);
        n.e(mapO);
        for (Map.Entry entry : mapO.entrySet()) {
            aVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new W1.a("", aVar.b(), false);
    }

    @Override // U1.a
    public Object d(W1.a aVar, p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        this.f7808a.j(aVar.a(), new d(c0826n));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    @Override // U1.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public E b() {
        return this.f7814g;
    }
}
