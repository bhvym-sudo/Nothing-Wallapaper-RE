package R7;

import F8.C0803b0;
import F8.L;
import F8.M;
import F8.T0;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.nothing.launcher.card.data.CardWidgetSimpleInfo;
import com.nothing.launcher.card.t;
import com.nothing.wallpaper.NTPickerApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import p064g3.i;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements L {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f7114r = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ L f7115q = M.a(T0.b(null, 1, null).z(C0803b0.b()));

    private d() {
    }

    public final void a(long j9, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putLong("subject", j9);
        bundle.putLong("style", j10);
        bundle.putInt("failed", i10);
        c.f7111a.b("wallpaper_ai_result_failed", bundle);
    }

    public final void b(int i10, long j9, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("subject", j9);
        bundle.putLong("style", j10);
        String str = "wallpaper_ai_create";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "wallpaper_ai_recreate";
            } else if (i10 == 3) {
                str = "wallpaper_ai_create_ram";
            } else if (i10 == 4) {
                str = "wallpaper_ai_result_succeed";
            }
        }
        c.f7111a.b(str, bundle);
    }

    public final void c(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("result", i10);
        c.f7111a.b("wallpaper_ai_load_prompt", bundle);
    }

    public final void d(long j9) {
        Bundle bundle = new Bundle();
        bundle.putLong("tap", j9);
        c.f7111a.b("wallpaper_ai_save", bundle);
    }

    public final void e(Context context, x xVar, List effect, boolean z9, int i10) {
        int i11;
        n.h(context, "context");
        n.h(effect, "effect");
        if (xVar != null) {
            Bundle bundle = new Bundle();
            int i12 = 3;
            if (((xVar instanceof i) && ((i) xVar).f21170z == 1) || G6.e.r(xVar, context)) {
                i11 = 1;
            } else {
                NTPickerApplication.a aVar = NTPickerApplication.f18424q;
                if (G6.e.p(xVar, aVar.a())) {
                    String strR = xVar.r();
                    n.g(strR, "getWallpaperId(...)");
                    bundle.putString("name", e.a(strR));
                    i11 = 2;
                } else if (G6.e.l(xVar, aVar.a())) {
                    bundle.putString("name", xVar.r());
                    i11 = 3;
                } else if (G6.e.o(xVar, aVar.a())) {
                    bundle.putString("name", xVar.r());
                    i11 = 5;
                } else {
                    i11 = 4;
                }
            }
            bundle.putInt("type", i11);
            ArrayList<Integer> arrayList = new ArrayList<>();
            Iterator it = effect.iterator();
            while (it.hasNext()) {
                p108k7.a aVar2 = (p108k7.a) it.next();
                if (aVar2 == p108k7.a.Blur) {
                    arrayList.add(1);
                }
                if (aVar2 == p108k7.a.Glass) {
                    arrayList.add(2);
                }
            }
            if (z9) {
                arrayList.add(3);
            }
            if (!arrayList.isEmpty()) {
                bundle.putIntegerArrayList("effect", arrayList);
            }
            if (i10 == 0) {
                i12 = 2;
            } else if (i10 == 1) {
                i12 = 1;
            }
            bundle.putInt("screen", i12);
            c.f7111a.b("wallpaper_apply", bundle);
        }
    }

    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("enter", "");
        c.f7111a.b("customisation_enter", bundle);
    }

    public final void g(boolean z9, String clockId, List shortcutIds, CardWidgetSimpleInfo[] widgets, N1.a aVar, A7.a aVar2) {
        n.h(clockId, "clockId");
        n.h(shortcutIds, "shortcutIds");
        n.h(widgets, "widgets");
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (CardWidgetSimpleInfo cardWidgetSimpleInfo : widgets) {
            int spanX = cardWidgetSimpleInfo.getSpanX();
            if (spanX == 1) {
                int spanY = cardWidgetSimpleInfo.getSpanY();
                if (spanY == 1) {
                    i13++;
                } else if (spanY == 2) {
                    i12++;
                }
            } else if (spanX == 2) {
                int spanY2 = cardWidgetSimpleInfo.getSpanY();
                if (spanY2 == 1) {
                    i11++;
                } else if (spanY2 == 2) {
                    i10++;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("widget_area", z9 ? 1 : 0);
        bundle.putString("clock", clockId);
        bundle.putStringArrayList("lockscreen_shortcut", (ArrayList) shortcutIds);
        bundle.putInt("widgetsCount", widgets.length);
        bundle.putInt("icons_l", i10);
        bundle.putInt("icons_m_l", i11);
        bundle.putInt("icons_m_w", i12);
        bundle.putInt("icons_s", i13);
        if (aVar != null) {
            bundle.putInt("clock_size", aVar == N1.a.SMALL ? 1 : 0);
        }
        if (aVar2 != null) {
            bundle.putInt("clock_alignment", aVar2 == A7.a.CENTER ? 1 : 0);
        }
        c.f7111a.b("lockscreen_customise", bundle);
    }

    public final void h(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("entrance", i10);
        c.f7111a.b("lockscreen_customise", bundle);
    }

    public final void i() {
        Bundle bundle = new Bundle();
        bundle.putString("wallpaper", "");
        c.f7111a.b("lockscreen_customise", bundle);
    }

    public final void j() {
        Bundle bundle = new Bundle();
        bundle.putString("tap", "");
        c.f7111a.b("wallpaper_more_tap", bundle);
    }

    public final void k(String wallpaperId) {
        n.h(wallpaperId, "wallpaperId");
        Bundle bundle = new Bundle();
        bundle.putString("tap", wallpaperId);
        c.f7111a.b("wallpaper_sug_tap", bundle);
    }

    public final void l(String eventType, t info, int i10) {
        ComponentName componentNameD;
        n.h(eventType, "eventType");
        n.h(info, "info");
        if (i10 > 0 && (componentNameD = info.d()) != null) {
            Bundle bundle = new Bundle();
            if (n.d(eventType, "widget_add")) {
                bundle.putInt("addway", i10);
            } else {
                bundle.putInt("removeway", i10);
            }
            bundle.putString("package", componentNameD.getPackageName());
            bundle.putString("provider", componentNameD.getClassName());
            bundle.putInt("widget_id", info.m());
            bundle.putString("host", "Lockscreen");
            bundle.putString("size", info.f597u + "x" + info.f598v);
            c.f7111a.b(eventType, bundle);
        }
    }

    @Override // F8.L
    public p129m8.i w0() {
        return this.f7115q.w0();
    }
}
