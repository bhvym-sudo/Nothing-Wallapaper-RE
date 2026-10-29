package I3;

import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.Log;
import android.util.LruCache;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LruCache f3025a = new LruCache(6);

    public interface a {
        void a(WallpaperColors wallpaperColors);
    }

    public static /* synthetic */ void a(com.android.wallpaper.asset.a aVar, a aVar2, Bitmap bitmap) {
        if (bitmap == null) {
            Log.i("WallpaperColorsLoader", "Can't get wallpaper colors from a null bitmap, uses null color.");
            aVar2.a(null);
            return;
        }
        boolean z9 = false;
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            z9 = true;
        }
        WallpaperColors wallpaperColorsFromBitmap = WallpaperColors.fromBitmap(bitmap);
        f3025a.put(aVar, wallpaperColorsFromBitmap);
        aVar2.a(wallpaperColorsFromBitmap);
        if (z9) {
            bitmap.recycle();
        }
    }

    public static void b(Context context, final com.android.wallpaper.asset.a aVar, final a aVar2) {
        WallpaperColors wallpaperColors = (WallpaperColors) f3025a.get(aVar);
        if (wallpaperColors != null) {
            aVar2.a(wallpaperColors);
            return;
        }
        Point pointE = H3.s.a().e(((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay());
        new com.android.wallpaper.asset.d(context, aVar).f(pointE.y / 2, pointE.x / 2, new com.android.wallpaper.asset.a.d() { // from class: I3.u
            @Override // com.android.wallpaper.asset.a.d
            public final void a(Bitmap bitmap) {
                v.a(aVar, aVar2, bitmap);
            }
        });
    }
}
