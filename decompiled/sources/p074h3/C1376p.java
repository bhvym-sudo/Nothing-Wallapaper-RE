package p074h3;

import C6.g;
import G6.e;
import android.app.Flags;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.launcher3.w;
import com.nothing.wallpaper.common.log.c;
import org.json.JSONException;
import p064g3.d;
import p064g3.k;
import p064g3.l;
import p064g3.x;
import p064g3.y;

/* JADX INFO: renamed from: h3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1376p implements InterfaceC1363c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21711a = "DefaultCurrentWF";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f21713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K f21714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WallpaperManager f21715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f21716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x f21717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21718h;

    public C1376p(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21712b = applicationContext;
        H hA = I.a();
        this.f21713c = hA.r(applicationContext);
        this.f21714d = hA.y(applicationContext);
        this.f21715e = WallpaperManager.getInstance(context);
    }

    private boolean e(Context context) {
        x xVar = this.f21716f;
        if (xVar == null) {
            return false;
        }
        return i(context, xVar, 1);
    }

    private boolean f(Context context) {
        WallpaperManager wallpaperManager = (WallpaperManager) context.getSystemService("wallpaper");
        return wallpaperManager.lockScreenWallpaperExists() && wallpaperManager.getWallpaperInfo(2) == null && wallpaperManager.getWallpaperFile(2) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: android.app.WallpaperManager
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: android.app.WallpaperManager
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:582)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: android.app.WallpaperManager
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 android.app.WallpaperManager, new type: android.app.WallpaperManager
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public /* synthetic */ void g(Context context, InterfaceC1363c.a aVar, y yVar, y yVar2, int i10) throws JSONException {
        boolean z9;
        x dVar;
        String strF = yVar.f();
        g.a aVar2 = g.f648e;
        g gVarA = aVar2.a(strF);
        x.a aVar3 = new x.a(yVar.d());
        if (yVar instanceof l) {
            x xVarB = this.f21714d.b(yVar.e(), yVar.b(), yVar.a(), yVar.c(), yVar.g(), gVarA, aVar3);
            if (e.i(xVarB)) {
                xVarB.w(yVar.h());
            } else {
                xVarB.w(false);
            }
            if (w.f15765i && Flags.liveWallpaperContentHandling() && xVarB != null) {
                ((k) xVarB).C(((l) yVar).j());
            }
            dVar = xVarB;
            z9 = false;
        } else {
            z9 = false;
            if (TextUtils.isEmpty(strF) && this.f21715e.getWallpaperId(1) == 2) {
                c.d("DefaultCurrentWF", "default home wallpaper, set not support depth");
                yVar.i(false);
            }
            dVar = new d(yVar.b(), yVar.a(), yVar.c(), 1, yVar.g(), aVar3);
            dVar.v(gVarA);
            dVar.w(yVar.h());
        }
        x gVar = null;
        if (yVar2 != null) {
            String strF2 = yVar2.f();
            g gVarA2 = TextUtils.isEmpty(strF2) ? null : aVar2.a(strF2);
            x.a aVar4 = new x.a(yVar2.d());
            if (yVar2 instanceof l) {
                gVar = this.f21714d.a(yVar2.e());
                if (e.i(gVar)) {
                    gVar.w(yVar2.h());
                } else {
                    gVar.w(z9);
                }
                if (w.f15765i && Flags.liveWallpaperContentHandling()) {
                    ((k) gVar).C(((l) yVar2).j());
                }
            } else if (f(context)) {
                gVar = new p064g3.g();
            } else {
                if (TextUtils.isEmpty(strF2) && this.f21715e.getWallpaperId(r15) == 2) {
                    c.d("DefaultCurrentWF", "default lock wallpaper, set not support depth");
                    yVar2.i(z9);
                }
                d dVar2 = new d(yVar2.b(), yVar2.a(), yVar2.c(), 2, yVar2.g(), aVar4);
                dVar2.v(gVarA2);
                dVar2.w(yVar2.h());
                gVar = dVar2;
            }
        }
        this.f21716f = dVar;
        this.f21717g = gVar;
        this.f21718h = i10;
        aVar.a(dVar, gVar, i10);
    }

    private boolean h(Context context) {
        return i(context, this.f21717g, 2);
    }

    private boolean i(Context context, x xVar, int i10) {
        WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo(i10);
        ComponentName component = wallpaperInfo != null ? wallpaperInfo.getComponent() : null;
        WallpaperInfo wallpaperInfoQ = xVar != null ? xVar.q() : null;
        ComponentName component2 = wallpaperInfoQ != null ? wallpaperInfoQ.getComponent() : null;
        if (component == null) {
            return component2 == null && i10 != 2;
        }
        if (component2 == null) {
            return false;
        }
        return component.equals(component2);
    }

    @Override // p074h3.InterfaceC1363c
    public synchronized void a(final Context context, boolean z9, final InterfaceC1363c.a aVar) {
        int i10;
        boolean zE = e(context);
        boolean zH = h(context);
        if (!z9 && zE && zH && (i10 = this.f21718h) != 2) {
            aVar.a(this.f21716f, this.f21717g, i10);
            return;
        }
        if (z9) {
            c();
        }
        this.f21713c.a(new X.a() { // from class: h3.o
            @Override // h3.X.a
            public final void a(y yVar, y yVar2, int i11) throws JSONException {
                this.f21708a.g(context, aVar, yVar, yVar2, i11);
            }
        });
    }

    @Override // p074h3.InterfaceC1363c
    public synchronized Pair b() {
        return new Pair(this.f21716f, this.f21717g);
    }

    @Override // p074h3.InterfaceC1363c
    public void c() {
        this.f21716f = null;
        this.f21717g = null;
    }
}
