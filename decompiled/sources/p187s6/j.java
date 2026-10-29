package p187s6;

import H3.C;
import android.app.wallpaper.WallpaperDescription;
import android.content.ComponentName;
import android.content.Context;
import com.android.launcher3.w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import p167q6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f27791b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f27790a = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f27792c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f27793d = new b("WallpaperConnectionHolder");

    private j() {
    }

    public static /* synthetic */ p b(j jVar, ComponentName componentName, int i10, C.d dVar, WallpaperDescription wallpaperDescription, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            wallpaperDescription = null;
        }
        return jVar.a(componentName, i10, dVar, wallpaperDescription);
    }

    public static /* synthetic */ p e(j jVar, ComponentName componentName, int i10, C.d dVar, WallpaperDescription wallpaperDescription, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            wallpaperDescription = null;
        }
        return jVar.d(componentName, i10, dVar, wallpaperDescription);
    }

    public final synchronized p a(ComponentName name, int i10, C.d whichPreview, WallpaperDescription wallpaperDescription) {
        p pVarD;
        try {
            n.h(name, "name");
            n.h(whichPreview, "whichPreview");
            Map map = f27792c;
            Object objD = map.get(name);
            if (objD == null) {
                objD = f27790a.d(name, i10, whichPreview, wallpaperDescription);
                map.put(name, objD);
            }
            pVarD = (p) objD;
            if (pVarD.k0().e() != whichPreview.e() || pVarD.g0() != i10) {
                pVarD = d(name, i10, whichPreview, wallpaperDescription);
            }
        } catch (Throwable th) {
            throw th;
        }
        return pVarD;
    }

    public final Context c() {
        Context context = f27791b;
        if (context != null) {
            return context;
        }
        n.r("appContext");
        return null;
    }

    public final synchronized p d(ComponentName name, int i10, C.d whichPreview, WallpaperDescription wallpaperDescription) {
        p pVar;
        try {
            n.h(name, "name");
            n.h(whichPreview, "whichPreview");
            f27793d.a("new WallpaperConnectionInternal for " + name);
            if (w.f15765i) {
                pVar = new p(name, c(), i10, whichPreview, wallpaperDescription);
            } else {
                pVar = new p(name, c(), i10, whichPreview, null, 16, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return pVar;
    }

    public final synchronized void f(ComponentName name) {
        n.h(name, "name");
        f27793d.a("remove WallpaperConnectionInternal for " + name);
        f27792c.remove(name);
    }

    public final void g(Context context) {
        n.h(context, "<set-?>");
        f27791b = context;
    }
}
