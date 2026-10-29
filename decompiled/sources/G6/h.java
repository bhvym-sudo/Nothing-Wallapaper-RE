package G6;

import android.app.WallpaperColors;
import android.graphics.Color;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.n;
import p064g3.x;
import p084i3.M0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WallpaperColors f1976a = new WallpaperColors(Color.valueOf(0), null, null);

    public static final WallpaperColors a() {
        return f1976a;
    }

    public static final int b(WallpaperColors wallpaperColors) {
        n.h(wallpaperColors, "<this>");
        return wallpaperColors.getPrimaryColor().toArgb();
    }

    public static final WallpaperColors c(Future future) {
        n.h(future, "future");
        if (future.isDone()) {
            try {
                WallpaperColors wallpaperColorsB = ((x.a) future.get()).b();
                n.g(wallpaperColorsB, "getWallpaperColors(...)");
                if (d(wallpaperColorsB)) {
                    return null;
                }
                return wallpaperColorsB;
            } catch (InterruptedException | ExecutionException unused) {
            }
        } else {
            com.nothing.wallpaper.common.log.c.d("WallpaperColors", "renderContentIfColorReady, colors is not ready.");
        }
        return null;
    }

    public static final boolean d(WallpaperColors wallpaperColors) {
        n.h(wallpaperColors, "<this>");
        return wallpaperColors.getPrimaryColor().toArgb() == 0 && wallpaperColors.getSecondaryColor() == null && wallpaperColors.getTertiaryColor() == null;
    }

    public static final boolean e(WallpaperColors wallpaperColors, WallpaperColors other) {
        n.h(wallpaperColors, "<this>");
        n.h(other, "other");
        return ((wallpaperColors.getColorHints() & 1) != 0) == ((other.getColorHints() & 1) != 0);
    }

    public static final boolean f(int i10) {
        return ((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d) <= 192.0d;
    }

    public static final boolean g(WallpaperColors wallpaperColors) {
        if (wallpaperColors == null) {
            return true;
        }
        boolean z9 = (wallpaperColors.getColorHints() & 2) != 0;
        return !z9 ? f(wallpaperColors.getPrimaryColor().toArgb()) : z9;
    }

    public static final boolean h(WallpaperColors wallpaperColors) {
        return wallpaperColors == null || (wallpaperColors.getColorHints() & 1) != 0;
    }

    public static final void i(String msg, WallpaperColors wallpaperColors) {
        n.h(msg, "msg");
        if (wallpaperColors == null) {
            return;
        }
        int colorHints = wallpaperColors.getColorHints();
        com.nothing.wallpaper.common.log.c.d("WallpaperColors", msg + " :supportsDarkText=" + ((colorHints & 1) != 0) + ",isMainColorDark=" + ((colorHints & 2) != 0) + ",toString=" + wallpaperColors);
    }

    public static final void j(M0 m9, WallpaperColors wallpaperColors) {
        n.h(m9, "<this>");
        WallpaperColors wallpaperColorsC = m9.c();
        if ((wallpaperColors == null && wallpaperColorsC == null) || ((wallpaperColors != null && wallpaperColorsC != null && e(wallpaperColors, wallpaperColorsC)) || !m9.d())) {
            com.nothing.wallpaper.common.log.c.d("WallpaperColors", "renderWithColorsIfNeed : same colors,return");
            return;
        }
        com.nothing.wallpaper.common.log.c.d("WallpaperColors", "maybeRenderHomePreview :" + wallpaperColors);
        m9.i(wallpaperColors);
        m9.f();
    }
}
