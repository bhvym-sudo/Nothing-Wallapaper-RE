package p137n6;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23280a;

    public static final Bitmap a(WallpaperManager wallpaperManager, int i10, boolean z9) {
        n.h(wallpaperManager, "<this>");
        try {
            return (Bitmap) wallpaperManager.getClass().getMethod("getDepthEffectWallpaperBitmapAsUser", Integer.TYPE, Boolean.TYPE).invoke(wallpaperManager, Integer.valueOf(i10), Boolean.valueOf(z9));
        } catch (Exception e10) {
            c.e("Failed to get depth wallpaper:" + e10.getMessage());
            return null;
        }
    }

    public static final int b(WallpaperManager wallpaperManager, Bitmap bitmap, boolean z9, int i10) {
        n.h(wallpaperManager, "<this>");
        n.h(bitmap, "bitmap");
        try {
            Object objInvoke = wallpaperManager.getClass().getMethod("setDepthEffectWallpaper", Bitmap.class, Boolean.TYPE, Integer.TYPE).invoke(wallpaperManager, bitmap, Boolean.valueOf(z9), Integer.valueOf(i10));
            Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (Exception e10) {
            c.e("Failed to set depth wallpaper:" + e10.getMessage());
            return 0;
        }
    }

    public static final int c(WallpaperManager wallpaperManager, Bitmap bitmap, boolean z9, int i10, int i11, int i12) {
        n.h(wallpaperManager, "<this>");
        n.h(bitmap, "bitmap");
        return f23280a == 0 ? d(wallpaperManager, bitmap, z9, i10, i11, i12) : b(wallpaperManager, bitmap, z9, i10);
    }

    public static final int d(WallpaperManager wallpaperManager, Bitmap bitmap, boolean z9, int i10, int i11, int i12) {
        n.h(wallpaperManager, "<this>");
        n.h(bitmap, "bitmap");
        try {
            Class<?> cls = wallpaperManager.getClass();
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            Object objInvoke = cls.getMethod("setDepthEffectWallpaperWithWallpaperType", Bitmap.class, cls2, cls3, cls3, cls3).invoke(wallpaperManager, bitmap, Boolean.valueOf(z9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (NoSuchMethodException e10) {
            c.e("Failed to set depth wallpaper, fallback to set, msg:" + e10.getMessage());
            f23280a = 1;
            return b(wallpaperManager, bitmap, z9, i10);
        } catch (Exception e11) {
            c.e("Failed to set depth wallpaper:" + e11.getMessage());
            return 0;
        }
    }
}
