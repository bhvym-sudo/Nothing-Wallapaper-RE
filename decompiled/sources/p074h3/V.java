package p074h3;

import D3.c;
import F8.C0803b0;
import F8.L;
import F8.M;
import H3.k;
import X2.d;
import X2.e;
import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.Context;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.lifecycle.InterfaceC1163x;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.v;
import p194t3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class V implements H {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f21627v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f21628w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private L f21629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L f21630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1361a f21631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1362b f21632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC1363c f21633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f21634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private E f21635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private F f21636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private K f21637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M f21638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private O f21639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private P f21640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Q f21641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private U f21642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private X f21643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b0 f21644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f21645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f21646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private X2.a f21647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d f21648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private v f21649u;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        protected final int a() {
            return V.f21628w;
        }

        private a() {
        }
    }

    protected static final int I() {
        return f21627v.a();
    }

    @Override // p074h3.H
    public synchronized U A(Context context) {
        U c1383x;
        n.h(context, "context");
        c1383x = this.f21642n;
        if (c1383x == null) {
            c1383x = new C1383x(context.getApplicationContext());
            this.f21642n = c1383x;
        }
        return c1383x;
    }

    @Override // p074h3.H
    public abstract p034d3.a C();

    public L G() {
        L l9 = this.f21630b;
        if (l9 != null) {
            return l9;
        }
        L lA = M.a(C0803b0.c());
        this.f21630b = lA;
        return lA;
    }

    public final L H() {
        L l9 = this.f21629a;
        if (l9 != null) {
            return l9;
        }
        L lA = M.a(C0803b0.b());
        this.f21629a = lA;
        return lA;
    }

    protected final X2.a J(Context context) {
        n.h(context, "context");
        X2.a aVar = this.f21647s;
        if (aVar != null) {
            return aVar;
        }
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        n.g(contentResolver, "getContentResolver(...)");
        X2.b bVar = new X2.b(contentResolver, C0803b0.b());
        this.f21647s = bVar;
        return bVar;
    }

    protected final d K(Context context) {
        n.h(context, "context");
        d dVar = this.f21648t;
        if (dVar != null) {
            return dVar;
        }
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        n.g(contentResolver, "getContentResolver(...)");
        e eVar = new e(contentResolver, C0803b0.b());
        this.f21648t = eVar;
        return eVar;
    }

    public b L(Context context) {
        n.h(context, "context");
        b bVar = this.f21646r;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(G(), p(context));
        this.f21646r = bVar2;
        return bVar2;
    }

    @Override // p074h3.H
    public synchronized InterfaceC1361a c(Context context) {
        InterfaceC1361a c1367g;
        n.h(context, "context");
        c1367g = this.f21631c;
        if (c1367g == null) {
            c1367g = new C1367g(context.getApplicationContext());
            this.f21631c = c1367g;
        }
        return c1367g;
    }

    @Override // p074h3.H
    public synchronized M d(Context context) {
        M c1379t;
        n.h(context, "context");
        c1379t = this.f21638j;
        if (c1379t == null) {
            c1379t = new C1379t(context.getApplicationContext());
            this.f21638j = c1379t;
        }
        return c1379t;
    }

    @Override // p074h3.H
    public k e(Context context) {
        n.h(context, "context");
        k kVar = this.f21634f;
        if (kVar != null) {
            return kVar;
        }
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        k kVar2 = new k(applicationContext);
        this.f21634f = kVar2;
        return kVar2;
    }

    @Override // p074h3.H
    public v i() {
        v vVar = this.f21649u;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v();
        this.f21649u = vVar2;
        return vVar2;
    }

    @Override // p074h3.H
    public synchronized F j(Context context) {
        F rVar;
        n.h(context, "context");
        rVar = this.f21636h;
        if (rVar == null) {
            rVar = new r(context.getApplicationContext());
            this.f21636h = rVar;
        }
        return rVar;
    }

    @Override // p074h3.H
    public synchronized InterfaceC1363c k(Context context) {
        InterfaceC1363c c1376p;
        n.h(context, "context");
        c1376p = this.f21633e;
        if (c1376p == null) {
            c1376p = new C1376p(context.getApplicationContext());
            this.f21633e = c1376p;
        }
        return c1376p;
    }

    @Override // p074h3.H
    public b0 l(Context context) {
        n.h(context, "context");
        b0 b0Var = this.f21644p;
        if (b0Var != null) {
            return b0Var;
        }
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context.getApplicationContext());
        n.g(wallpaperManager, "getInstance(...)");
        D d10 = new D(wallpaperManager);
        this.f21644p = d10;
        return d10;
    }

    @Override // p074h3.H
    public AbstractComponentCallbacksC1132q m(Context context, String collectionId) {
        n.h(context, "context");
        n.h(collectionId, "collectionId");
        p244y3.d dVarL0 = p244y3.d.L0(collectionId);
        n.g(dVarL0, "newInstance(...)");
        return dVarL0;
    }

    @Override // p074h3.H
    public p054f3.a n(Context context) {
        n.h(context, "context");
        return null;
    }

    @Override // p074h3.H
    public abstract p194t3.a p(Context context);

    @Override // p074h3.H
    public synchronized X r(Context context) {
        X c10;
        n.h(context, "context");
        c10 = this.f21643o;
        if (c10 == null) {
            c10 = new C(context.getApplicationContext());
            this.f21643o = c10;
        }
        return c10;
    }

    @Override // p074h3.H
    public synchronized O s(Context context) {
        O c1380u;
        n.h(context, "context");
        c1380u = this.f21639k;
        if (c1380u == null) {
            c1380u = new C1380u(context.getApplicationContext());
            this.f21639k = c1380u;
        }
        return c1380u;
    }

    @Override // p074h3.H
    public synchronized InterfaceC1362b t() {
        InterfaceC1362b c1371k;
        c1371k = this.f21632d;
        if (c1371k == null) {
            c1371k = new C1371k();
            this.f21632d = c1371k;
        }
        return c1371k;
    }

    @Override // p074h3.H
    public synchronized P v(Context context) {
        P c1381v;
        n.h(context, "context");
        c1381v = this.f21640l;
        if (c1381v == null) {
            c1381v = new C1381v(context.getApplicationContext());
            this.f21640l = c1381v;
        }
        return c1381v;
    }

    @Override // p074h3.H
    public c w(Context context, InterfaceC1163x lifecycleOwner) {
        n.h(context, "context");
        n.h(lifecycleOwner, "lifecycleOwner");
        c cVar = this.f21645q;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(G(), new C3.a(), g(context));
        this.f21645q = cVar2;
        return cVar2;
    }

    @Override // p074h3.H
    public synchronized Q x() {
        Q c1382w;
        c1382w = this.f21641m;
        if (c1382w == null) {
            c1382w = new C1382w();
            this.f21641m = c1382w;
        }
        return c1382w;
    }

    @Override // p074h3.H
    public K y(Context context) {
        n.h(context, "context");
        K k9 = this.f21637i;
        if (k9 != null) {
            return k9;
        }
        C1378s c1378s = new C1378s();
        this.f21637i = c1378s;
        return c1378s;
    }

    @Override // p074h3.H
    public E z() {
        E e10 = this.f21635g;
        if (e10 != null) {
            return e10;
        }
        C1377q c1377q = new C1377q();
        this.f21635g = c1377q;
        return c1377q;
    }
}
