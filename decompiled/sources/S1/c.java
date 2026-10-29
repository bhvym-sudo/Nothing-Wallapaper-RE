package S1;

import H3.w;
import O2.h;
import O2.j;
import O2.l;
import O2.y;
import O2.z;
import Q2.k;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.format.DateFormat;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.InterfaceC1163x;
import com.android.internal.policy.SystemBarUtils;
import com.nothing.wallpaper.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements S1.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f7215i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Point f7217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WallpaperManager f7218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f7219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f7220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap f7221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap f7222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f7223h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final int c(Context context) {
            Insets waterfallInsets;
            DisplayCutout cutout = context.getDisplay().getCutout();
            return Math.max(SystemBarUtils.getStatusBarHeight(context), context.getResources().getDimensionPixelSize(R.dimen.status_bar_header_height_keyguard) + ((cutout == null || (waterfallInsets = cutout.getWaterfallInsets()) == null) ? 0 : waterfallInsets.top));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(Context context) {
            Display displayNoVerify = context.getDisplayNoVerify();
            if (displayNoVerify != null) {
                return SystemBarUtils.getStatusBarHeight(context.getResources(), displayNoVerify.getCutout());
            }
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        }

        public final int b(Context context) {
            n.h(context, "context");
            return c(context) + context.getResources().getDimensionPixelSize(R.dimen.keyguard_clock_top_margin);
        }

        private a() {
        }
    }

    public c(Context appContext, Point screenSize, WallpaperManager wallpaperManager, k registry) {
        n.h(appContext, "appContext");
        n.h(screenSize, "screenSize");
        n.h(wallpaperManager, "wallpaperManager");
        n.h(registry, "registry");
        this.f7216a = appContext;
        this.f7217b = screenSize;
        this.f7218c = wallpaperManager;
        this.f7219d = registry;
        this.f7220e = appContext.getResources();
        this.f7221f = new ConcurrentHashMap();
        this.f7222g = new ConcurrentHashMap();
        this.f7223h = new HashMap();
    }

    private final Rect m() {
        int dimensionPixelSize = this.f7220e.getDimensionPixelSize(R.dimen.keyguard_large_clock_top_margin);
        int dimensionPixelSize2 = this.f7220e.getDimensionPixelSize(R.dimen.large_clock_text_size) * 2;
        int i10 = ((this.f7217b.y / 2) - (dimensionPixelSize2 / 2)) + (dimensionPixelSize / 2);
        return new Rect(0, i10, this.f7217b.x, dimensionPixelSize2 + i10);
    }

    private final Rect n() {
        int iP = p();
        return new Rect(o(), iP, this.f7217b.x, this.f7220e.getDimensionPixelSize(R.dimen.small_clock_height) + iP);
    }

    private final int o() {
        return this.f7216a.getResources().getDimensionPixelSize(R.dimen.clock_padding_start) + this.f7216a.getResources().getDimensionPixelSize(R.dimen.status_view_margin_horizontal);
    }

    private final int p() {
        return f7215i.d(this.f7216a) + this.f7216a.getResources().getDimensionPixelSize(R.dimen.small_clock_padding_top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(c cVar) {
        cVar.t();
    }

    @Override // S1.a
    public void a(String clockId, Integer num) {
        n.h(clockId, "clockId");
        h hVarD = d(clockId);
        if (hVarD != null) {
            l lVarE = hVarD.e();
            lVarE.b().c(y.b(lVarE.e(), false, num, 1, null));
            l lVarD = hVarD.d();
            lVarD.b().c(y.b(lVarD.e(), false, num, 1, null));
        }
    }

    @Override // S1.a
    public View b(Context viewContext, String clockId) {
        l lVarE;
        n.h(viewContext, "viewContext");
        n.h(clockId, "clockId");
        P2.c.b();
        h hVarD = d(clockId);
        if (hVarD != null && (lVarE = hVarD.e()) != null) {
            lVarE.d().a(1.0f);
            View view = lVarE.getView();
            if (view != null) {
                return view;
            }
        }
        return new FrameLayout(viewContext);
    }

    @Override // S1.a
    public void c() {
        boolean zS = s();
        Collection<h> collectionValues = this.f7222g.values();
        n.g(collectionValues, "<get-values>(...)");
        for (h hVar : collectionValues) {
            l lVarE = hVar.e();
            lVarE.b().c(y.b(lVarE.e(), zS, null, 2, null));
            l lVarD = hVar.d();
            lVarD.b().c(y.b(lVarD.e(), zS, null, 2, null));
        }
    }

    @Override // S1.a
    public h d(String clockId) {
        n.h(clockId, "clockId");
        h hVar = (h) this.f7222g.get(clockId);
        if (hVar != null) {
            return hVar;
        }
        h hVarQ = q(clockId);
        if (hVarQ == null) {
            return null;
        }
        this.f7222g.put(clockId, hVarQ);
        return hVarQ;
    }

    @Override // S1.a
    public void e(InterfaceC1163x owner) {
        n.h(owner, "owner");
        int iHashCode = owner.hashCode();
        if (this.f7221f.keySet().contains(Integer.valueOf(iHashCode))) {
            return;
        }
        this.f7221f.put(Integer.valueOf(iHashCode), w.a(this.f7216a, new w.a() { // from class: S1.b
            @Override // H3.w.a
            public final void a() {
                c.u(this.f7214a);
            }
        }));
    }

    @Override // S1.a
    public void g(String clockId) {
        j jVarB;
        n.h(clockId, "clockId");
        h hVarD = d(clockId);
        if (hVarD == null || (jVarB = hVarD.b()) == null) {
            return;
        }
        jVarB.b(DateFormat.is24HourFormat(this.f7216a));
    }

    @Override // S1.a
    public void h(Integer num) {
        Collection<h> collectionValues = this.f7222g.values();
        n.g(collectionValues, "<get-values>(...)");
        for (h hVar : collectionValues) {
            l lVarE = hVar.e();
            lVarE.b().c(y.b(lVarE.e(), false, num, 1, null));
            l lVarD = hVar.d();
            lVarD.b().c(y.b(lVarD.e(), false, num, 1, null));
        }
    }

    @Override // S1.a
    public void i(InterfaceC1163x owner) {
        n.h(owner, "owner");
        int iHashCode = owner.hashCode();
        w wVar = (w) this.f7221f.get(Integer.valueOf(iHashCode));
        if (wVar != null) {
            this.f7216a.unregisterReceiver(wVar);
        }
    }

    public final FrameLayout k() {
        FrameLayout frameLayout = new FrameLayout(this.f7216a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.f7220e.getDimensionPixelSize(R.dimen.small_clock_height));
        layoutParams.topMargin = p();
        layoutParams.setMarginStart(o());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setClipChildren(false);
        return frameLayout;
    }

    protected final ConcurrentHashMap l() {
        return this.f7222g;
    }

    @Override // S1.a
    public void onDestroy() {
        Iterator it = this.f7221f.entrySet().iterator();
        while (it.hasNext()) {
            this.f7216a.unregisterReceiver((w) ((Map.Entry) it.next()).getValue());
        }
        this.f7221f.clear();
        this.f7222g.clear();
        this.f7223h.clear();
    }

    protected h q(String clockId) {
        n.h(clockId, "clockId");
        boolean zS = s();
        h hVarS = this.f7219d.s(clockId);
        if (hVarS == null) {
            return null;
        }
        hVarS.f(zS, 0.0f, 0.0f, null);
        hVarS.e().b().d(this.f7220e.getDimensionPixelSize(R.dimen.large_clock_text_size));
        hVarS.e().b().e(m());
        hVarS.d().b().d(this.f7220e.getDimensionPixelSize(R.dimen.small_clock_text_size));
        hVarS.d().b().e(n());
        hVarS.b().e(z.f5831f.a());
        return hVarS;
    }

    protected h r(String clockId) {
        n.h(clockId, "clockId");
        h hVarS = this.f7219d.s(clockId);
        if (hVarS == null) {
            return null;
        }
        hVarS.f((this.f7220e.getConfiguration().uiMode & 48) == 32, 0.0f, 0.0f, null);
        hVarS.c().b().d(this.f7220e.getDimensionPixelSize(R.dimen.small_clock_text_size));
        hVarS.c().b().e(n());
        return hVarS;
    }

    protected abstract boolean s();

    protected void t() {
        Collection<h> collectionValues = this.f7222g.values();
        n.g(collectionValues, "<get-values>(...)");
        for (h hVar : collectionValues) {
            hVar.e().b().b();
            hVar.d().b().b();
        }
    }
}
