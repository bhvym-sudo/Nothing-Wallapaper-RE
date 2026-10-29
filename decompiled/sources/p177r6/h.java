package p177r6;

import android.app.WallpaperInfo;
import android.app.wallpaper.WallpaperDescription;
import android.graphics.Rect;
import android.os.IBinder;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperService;
import com.nothing.wallpaper.common.log.c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    private static final boolean a(IWallpaperService iWallpaperService, IWallpaperConnection iWallpaperConnection, int i10, IBinder iBinder, int i11, int i12, int i13, WallpaperDescription wallpaperDescription) {
        Object objB;
        try {
            q.a aVar = q.f21862r;
            iWallpaperService.attach(iWallpaperConnection, iBinder, 1001, true, i11, i12, new Rect(0, 0, 0, 0), i10, i13, (WallpaperInfo) null, wallpaperDescription);
            objB = q.b(Boolean.TRUE);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.e("attachBConnection fail, " + thD.getMessage());
        }
        if (q.f(objB)) {
            objB = null;
        }
        return n.d(objB, Boolean.TRUE);
    }

    public static final boolean b(IWallpaperService wallpaperService, IWallpaperConnection connection, int i10, IBinder windowToken, int i11, int i12, int i13, WallpaperDescription wallpaperDescription) {
        n.h(wallpaperService, "wallpaperService");
        n.h(connection, "connection");
        n.h(windowToken, "windowToken");
        if (wallpaperDescription == null) {
            wallpaperDescription = new WallpaperDescription.Builder().build();
        }
        return a(wallpaperService, connection, i10, windowToken, i11, i12, i13, wallpaperDescription);
    }

    public static final boolean c(IWallpaperService wallpaperService, IWallpaperConnection connection, int i10, IBinder windowToken, int i11, int i12) {
        n.h(wallpaperService, "wallpaperService");
        n.h(connection, "connection");
        n.h(windowToken, "windowToken");
        return d(wallpaperService, connection, i10, windowToken, i11, i12);
    }

    private static final boolean d(IWallpaperService iWallpaperService, IWallpaperConnection iWallpaperConnection, int i10, IBinder iBinder, int i11, int i12) {
        Object objB;
        try {
            q.a aVar = q.f21862r;
            Class<?> cls = iWallpaperService.getClass();
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("attach", IWallpaperConnection.class, IBinder.class, cls2, Boolean.TYPE, cls2, cls2, Rect.class, cls2, cls2, WallpaperInfo.class);
            n.g(method, "getMethod(...)");
            Boolean bool = Boolean.TRUE;
            method.invoke(iWallpaperService, iWallpaperConnection, iBinder, 1001, bool, Integer.valueOf(i11), Integer.valueOf(i12), new Rect(0, 0, 0, 0), Integer.valueOf(i10), 1, null);
            objB = q.b(bool);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.e("attachVConnection fail, " + thD.getMessage());
        }
        if (q.f(objB)) {
            objB = null;
        }
        return n.d(objB, Boolean.TRUE);
    }
}
