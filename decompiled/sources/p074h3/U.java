package p074h3;

import J6.e;
import android.app.WallpaperColors;
import android.graphics.Bitmap;
import android.graphics.Rect;
import p064g3.x;

/* JADX INFO: loaded from: classes.dex */
public interface U {

    public interface a {
        void a(Throwable th);

        void b(x xVar, int i10);

        default void c() {
        }
    }

    static int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        throw new AssertionError("Unknown @Destination");
    }

    void a(int i10);

    void b(x xVar, Bitmap bitmap, Bitmap bitmap2, e eVar, WallpaperColors wallpaperColors, int i10, a aVar);

    void c(x xVar, com.android.wallpaper.asset.a aVar, Rect rect, float f10, int i10, a aVar2);

    void e(x xVar);
}
