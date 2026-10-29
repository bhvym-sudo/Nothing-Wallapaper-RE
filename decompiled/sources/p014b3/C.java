package p014b3;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.signature.ObjectKey;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WallpaperManager f14812b;

    public C(Context context, int i10) {
        this.f14811a = i10;
        this.f14812b = WallpaperManager.getInstance(context);
    }

    public Drawable a(int i10, int i11) {
        if (this.f14811a == 0) {
            return this.f14812b.getBuiltInDrawable(i10, i11, true, 0.5f, 0.5f);
        }
        Log.e("WallpaperModel", "Invalid wallpaper data source: " + this.f14811a);
        return null;
    }

    public Key b() {
        if (this.f14811a != 0) {
            Log.e("WallpaperModel", "Invalid wallpaper data source: " + this.f14811a);
        }
        return new ObjectKey(this);
    }
}
