package A6;

import C6.g;
import C6.j;
import F8.AbstractC0814h;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0834r0;
import F8.InterfaceC0846x0;
import F8.L;
import android.app.Application;
import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.U;
import p074h3.W;
import p074h3.a0;
import p079h8.A;
import p079h8.h;
import p079h8.i;
import p079h8.q;
import p079h8.r;
import p087i6.o;
import p089i8.AbstractC1444s;
import p129m8.e;
import p219v8.p;
import p237x6.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p167q6.b f232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static B6.a f233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static InterfaceC0846x0 f234e;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        /* synthetic */ Object f235A;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f237C;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f240s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f241t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f242u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f243v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f244w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f245x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f246y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        long f247z;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f235A = obj;
            this.f237C |= Integer.MIN_VALUE;
            return b.this.d(0, this);
        }
    }

    /* JADX INFO: renamed from: A6.b$b, reason: collision with other inner class name */
    static final class C0011b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f248q;

        C0011b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0011b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0011b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f248q;
            if (i10 == 0) {
                r.b(obj);
                b bVar = b.f230a;
                if (bVar.j()) {
                    this.f248q = 1;
                    if (b.e(bVar, 0, this, 1, null) == objE) {
                        return objE;
                    }
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

    public static final class c implements U.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f252d;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f253q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ k f254r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, e eVar) {
                super(2, eVar);
                this.f254r = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new a(this.f254r, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f253q;
                if (i10 == 0) {
                    r.b(obj);
                    k kVar = this.f254r;
                    this.f253q = 1;
                    if (kVar.l(null, this) == objE) {
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

        c(x xVar, e eVar, k kVar, int i10) {
            this.f249a = xVar;
            this.f250b = eVar;
            this.f251c = kVar;
            this.f252d = i10;
        }

        @Override // h3.U.a
        public void a(Throwable th) {
            p167q6.b bVar = b.f232c;
            g gVarK = this.f249a.k();
            String strC = gVarK != null ? gVarK.c() : null;
            bVar.c("blur daemon set " + strC + " to " + G6.g.b(this.f252d) + " failed,e:" + th + ".");
            this.f251c.i();
            e eVar = this.f250b;
            q.a aVar = q.f21862r;
            eVar.resumeWith(q.b(Boolean.FALSE));
        }

        @Override // h3.U.a
        public void b(x xVar, int i10) {
            p167q6.b bVar = b.f232c;
            String strR = xVar != null ? xVar.r() : null;
            g gVarK = this.f249a.k();
            String strC = gVarK != null ? gVarK.c() : null;
            bVar.c("blur daemon set " + strR + " " + strC + " to " + G6.g.b(i10) + " success.");
            AbstractC0814h.b(null, new a(this.f251c, null), 1, null);
            e eVar = this.f250b;
            q.a aVar = q.f21862r;
            eVar.resumeWith(q.b(Boolean.TRUE));
        }
    }

    static {
        b bVar = new b();
        f230a = bVar;
        f232c = new p167q6.b(bVar);
    }

    private b() {
    }

    public static /* synthetic */ Object e(b bVar, int i10, e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return bVar.d(i10, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 f(K1.a aVar) {
        b bVar = f230a;
        return new a0(aVar.A(bVar.h()), aVar.f(bVar.h()), aVar.q(bVar.h()), aVar.k(bVar.h()));
    }

    private static final a0 g(h hVar) {
        return (a0) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        Object systemService = h().getSystemService("wallpaper");
        n.f(systemService, "null cannot be cast to non-null type android.app.WallpaperManager");
        WallpaperManager wallpaperManager = (WallpaperManager) systemService;
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        return wallpaperInfo != null && G6.e.h(wallpaperInfo) && wallpaperManager.getWallpaperId(2) > 0;
    }

    private final Object o(a0 a0Var, x xVar, Bitmap bitmap, WallpaperColors wallpaperColors, k kVar, int i10, e eVar) {
        p129m8.k kVar2 = new p129m8.k(p139n8.b.c(eVar));
        a0Var.q(null, xVar, i10, bitmap, null, wallpaperColors, new c(xVar, kVar2, kVar, i10));
        Object objB = kVar2.b();
        if (objB == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objB;
    }

    private final boolean p() {
        return k() && !j();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(int i10, e eVar) throws JSONException {
        a aVar;
        W wF;
        String strR;
        g gVarA;
        h hVarB;
        j jVarF;
        Object obj;
        long j9;
        int i11;
        K1.a aVar2;
        k kVar;
        b bVar;
        K1.a aVar3;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i12 = aVar.f237C;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f237C = i12 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar4 = aVar;
        Object objF = aVar4.f235A;
        Object objE = p139n8.b.e();
        int i13 = aVar4.f237C;
        if (i13 == 0) {
            r.b(objF);
            if (!p231x0.l.a(h())) {
                f232c.c("user not unlocked, couldn't read wallpaper SP.");
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            p167q6.b bVar2 = f232c;
            bVar2.c("start run blur daemon.");
            H hA = I.a();
            n.f(hA, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector");
            final K1.a aVar5 = (K1.a) hA;
            wF = aVar5.f(h());
            strR = wF.R();
            gVarA = g.f648e.a(strR);
            hVarB = i.b(new p219v8.a() { // from class: A6.a
                @Override // p219v8.a
                public final Object invoke() {
                    return b.f(aVar5);
                }
            });
            if (gVarA == null) {
                bVar2.c("run blur daemon but can't get homeLiveEffectInfo.");
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            jVarF = gVarA.f();
            PointF pointFB = jVarF != null ? jVarF.b() : null;
            Point pointD = jVarF != null ? jVarF.d() : null;
            if (jVarF == null || pointFB == null || pointD == null) {
                bVar2.c("run blur daemon but can't get scope or viewSize or center from EffectInfo: " + strR + ".");
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            k kVar2 = new k(aVar5.o(h()), h(), G6.e.c(h()), gVarA.d());
            Bitmap bitmapC = G6.a.c(kVar2.q().c(), false, false, 2, null);
            if (bitmapC == null) {
                bVar2.c("run blur daemon but can't get rawBitmap from Manager for EffectInfo: " + strR + ".");
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            D6.k kVar3 = new D6.k(bitmapC, h(), pointD, 1.0f, null, false, 16, null);
            ViewScope viewScope = new ViewScope(jVarF.c(), pointFB, pointD);
            List listE = AbstractC1444s.e(C6.a.Setter);
            aVar4.f238q = this;
            aVar4.f239r = aVar5;
            aVar4.f240s = wF;
            aVar4.f241t = strR;
            aVar4.f242u = gVarA;
            aVar4.f243v = hVarB;
            aVar4.f244w = jVarF;
            aVar4.f245x = kVar2;
            aVar4.f246y = i10;
            aVar4.f247z = jCurrentTimeMillis;
            aVar4.f237C = 1;
            objF = kVar3.f(viewScope, listE, aVar4);
            obj = objE;
            if (objF != obj) {
                j9 = jCurrentTimeMillis;
                i11 = i10;
                aVar2 = aVar5;
                kVar = kVar2;
                bVar = this;
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objF);
            return objF;
        }
        long j10 = aVar4.f247z;
        int i14 = aVar4.f246y;
        k kVar4 = (k) aVar4.f245x;
        jVarF = (j) aVar4.f244w;
        hVarB = (h) aVar4.f243v;
        gVarA = (g) aVar4.f242u;
        strR = (String) aVar4.f241t;
        wF = (W) aVar4.f240s;
        K1.a aVar6 = (K1.a) aVar4.f239r;
        b bVar3 = (b) aVar4.f238q;
        r.b(objF);
        kVar = kVar4;
        i11 = i14;
        obj = objE;
        aVar2 = aVar6;
        j9 = j10;
        bVar = bVar3;
        long j11 = j9;
        List list = (List) objF;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar3 = aVar2;
                    next = null;
                    break;
                }
                next = it.next();
                Iterator it2 = it;
                aVar3 = aVar2;
                if (((C6.b) next).c() == C6.a.Setter) {
                    break;
                }
                it = it2;
                aVar2 = aVar3;
            }
            C6.b bVar4 = (C6.b) next;
            if (bVar4 != null) {
                C6.i iVarA = bVar4.a();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iVarA.e(), iVarA.d(), Bitmap.Config.ARGB_8888);
                n.g(bitmapCreateBitmap, "createBitmap(...)");
                E6.a.C0050a c0050aE = gVarA.e();
                if (c0050aE != null) {
                    new p227w6.a(aVar3.B(), kVar).c(new p227w6.c(jVarF, c0050aE), iVarA, C6.i.f653h.a(bitmapCreateBitmap));
                } else {
                    bitmapCreateBitmap = bVar4.a().a();
                }
                d dVar = new d(wF.S(), wF.u(), wF.H(), wF.J());
                dVar.v(gVarA);
                f232c.a("bitmap build success,consume " + (System.currentTimeMillis() - j11) + ", start set.");
                a0 a0VarG = g(hVarB);
                WallpaperColors wallpaperColorsZ = wF.z();
                aVar4.f238q = null;
                aVar4.f239r = null;
                aVar4.f240s = null;
                aVar4.f241t = null;
                aVar4.f242u = null;
                aVar4.f243v = null;
                aVar4.f244w = null;
                aVar4.f245x = null;
                aVar4.f237C = 2;
                Object objO = bVar.o(a0VarG, dVar, bitmapCreateBitmap, wallpaperColorsZ, kVar, i11, aVar4);
                return objO == obj ? obj : objO;
            }
        }
        f232c.c("run blur daemon but get croppedBitmap failed for EffectInfo: " + strR + ".");
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    public final Context h() {
        Context context = f231b;
        if (context != null) {
            return context;
        }
        n.r("appContext");
        return null;
    }

    public final void i(Application app) {
        n.h(app, "app");
        n(app);
        if (o.f22207a.a(h())) {
            return;
        }
        f232c.a("in blur progress, try register BlurDaemon.");
        m(h());
    }

    public final boolean k() {
        Object systemService = h().getSystemService("wallpaper");
        n.f(systemService, "null cannot be cast to non-null type android.app.WallpaperManager");
        WallpaperInfo wallpaperInfo = ((WallpaperManager) systemService).getWallpaperInfo();
        return wallpaperInfo != null && G6.e.h(wallpaperInfo);
    }

    public final synchronized void l() {
        try {
            boolean zJ = j();
            p167q6.b bVar = f232c;
            bVar.a("onWallpaperChanged: shouldRunDaemon=" + p() + ", isBlurRunning=" + k() + ", isBlurDamaged=" + zJ);
            if (zJ) {
                InterfaceC0846x0 interfaceC0846x0 = f234e;
                Boolean boolValueOf = interfaceC0846x0 != null ? Boolean.valueOf(interfaceC0846x0.a()) : null;
                InterfaceC0846x0 interfaceC0846x1 = f234e;
                Boolean boolValueOf2 = interfaceC0846x1 != null ? Boolean.valueOf(interfaceC0846x1.O0()) : null;
                InterfaceC0846x0 interfaceC0846x2 = f234e;
                bVar.a("blur damaged, build job, last job: isActive=" + boolValueOf + " isCompleted=" + boolValueOf2 + " isCancel=" + (interfaceC0846x2 != null ? Boolean.valueOf(interfaceC0846x2.isCancelled()) : null));
                InterfaceC0846x0 interfaceC0846x3 = f234e;
                if (interfaceC0846x3 == null || (interfaceC0846x3 != null && !interfaceC0846x3.a())) {
                    bVar.a("run a new job, thread:" + Thread.currentThread().getName());
                    f234e = AbstractC0816i.d(C0834r0.f1894q, C0803b0.b(), null, new C0011b(null), 2, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m(Context context) {
        try {
            n.h(context, "context");
            n(context.getApplicationContext());
            if (f233d == null) {
                f232c.a("register daemon blur.");
                f233d = new B6.a();
                h().registerReceiver(f233d, new IntentFilter("android.intent.action.WALLPAPER_CHANGED"));
            }
            if (j()) {
                f232c.a("register but blur damaged, run daemon task.");
                l();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void n(Context context) {
        n.h(context, "<set-?>");
        f231b = context;
    }
}
