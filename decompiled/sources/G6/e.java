package G6;

import H3.r;
import J6.i;
import android.R;
import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.wallpaper.WallpaperDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.launcher3.w;
import com.nothing.blurwallpaper.AtmosphereWallpaperService;
import kotlin.jvm.internal.n;
import p064g3.k;
import p064g3.x;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final J6.a a(x origin, C6.g effectInfo, WallpaperColors colors, Context context) {
        n.h(origin, "origin");
        n.h(effectInfo, "effectInfo");
        n.h(colors, "colors");
        n.h(context, "context");
        J6.a aVar = new J6.a(origin, new WallpaperInfo(context.getApplicationContext(), context.getPackageManager().resolveService(d(context), PackageManager.ResolveInfoFlags.of(128L))), effectInfo, new x.a(colors));
        aVar.w(origin.t() && !origin.s());
        if (w.f15765i) {
            ComponentName componentNameCreateRelative = ComponentName.createRelative(context, "com.nothing.blurwallpaper.AtmosphereWallpaperService");
            n.g(componentNameCreateRelative, "createRelative(...)");
            aVar.C(new WallpaperDescription.Builder().setComponent(componentNameCreateRelative).build());
        }
        return aVar;
    }

    public static final p237x6.c b(Context context) {
        n.h(context, "context");
        return new p237x6.c(p137n6.a.b(context));
    }

    public static final p237x6.c c(Context context) {
        n.h(context, "context");
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), p166q5.n.f25056a.l());
        n.g(bitmapDecodeResource, "decodeResource(...)");
        return new p237x6.c(bitmapDecodeResource);
    }

    public static final Intent d(Context context) {
        n.h(context, "context");
        Context applicationContext = context.getApplicationContext();
        AtmosphereWallpaperService.b bVar = AtmosphereWallpaperService.f17659v;
        Intent intent = new Intent(applicationContext, (Class<?>) AtmosphereWallpaperService.class);
        intent.setAction("android.service.wallpaper.WallpaperService");
        return intent;
    }

    public static final com.android.wallpaper.asset.a e(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        if (i(xVar)) {
            return b(context);
        }
        com.android.wallpaper.asset.a aVarD = xVar.d(context);
        n.e(aVarD);
        return aVarD;
    }

    public static final int f(Context context) {
        n.h(context, "context");
        return r.a(context, R.attr.colorBackground);
    }

    public static final boolean g(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        return s(xVar) && !k(xVar, context);
    }

    public static final boolean h(WallpaperInfo wallpaperInfo) {
        n.h(wallpaperInfo, "<this>");
        ComponentName component = wallpaperInfo.getComponent();
        return n.d(component != null ? component.flattenToString() : null, "com.nothing.wallpaper/com.nothing.blurwallpaper.AtmosphereWallpaperService");
    }

    public static final boolean i(x xVar) {
        ComponentName component;
        n.h(xVar, "<this>");
        if (!(xVar instanceof k)) {
            return false;
        }
        WallpaperInfo wallpaperInfoQ = ((k) xVar).q();
        return n.d((wallpaperInfoQ == null || (component = wallpaperInfoQ.getComponent()) == null) ? null : component.flattenToString(), "com.nothing.wallpaper/com.nothing.blurwallpaper.AtmosphereWallpaperService");
    }

    public static final boolean j(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        return n.d(xVar.g(context), "cape_category");
    }

    public static final boolean k(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        return (xVar instanceof J6.c) || l(xVar, context);
    }

    public static final boolean l(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        return n.d(xVar.g(context), "color_category");
    }

    public static final boolean m(x xVar) {
        n.h(xVar, "<this>");
        return n(xVar) && !i(xVar);
    }

    public static final boolean n(x xVar) {
        n.h(xVar, "<this>");
        return xVar instanceof k;
    }

    public static final boolean o(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        return n.d(xVar.g(context), i.f3591F.a(context));
    }

    public static final boolean p(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        return AbstractC1444s.n("nothing_category", "category1").contains(xVar.g(context));
    }

    public static final boolean q(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        return (l(xVar, context) || p(xVar, context) || j(xVar, context) || !s(xVar)) ? false : true;
    }

    public static final boolean r(x xVar, Context context) {
        n.h(xVar, "<this>");
        n.h(context, "context");
        String strG = xVar.g(context);
        if (strG != null) {
            return strG.equals(context.getString(com.nothing.wallpaper.R.string.image_wallpaper_collection_id));
        }
        return false;
    }

    public static final boolean s(x xVar) {
        n.h(xVar, "<this>");
        return !n(xVar) || i(xVar);
    }
}
