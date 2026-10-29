package p074h3;

import android.app.WallpaperManager;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class D implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21620b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WallpaperManager f21621a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public D(WallpaperManager wallpaperManager) {
        n.h(wallpaperManager, "wallpaperManager");
        this.f21621a = wallpaperManager;
    }

    @Override // p074h3.b0
    public boolean a() {
        ParcelFileDescriptor wallpaperFile = this.f21621a.getWallpaperFile(1);
        if (wallpaperFile == null) {
            return false;
        }
        try {
            wallpaperFile.close();
        } catch (IOException e10) {
            Log.e("DefaultWallpaperStatusChecker", "Unable to close system wallpaper ParcelFileDescriptor", e10);
        }
        return true;
    }

    @Override // p074h3.b0
    public boolean b() {
        return this.f21621a.getWallpaperId(2) >= 0;
    }
}
