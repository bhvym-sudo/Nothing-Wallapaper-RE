package p064g3;

import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.wallpaper.WallpaperDescription;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f21176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WallpaperDescription f21177j;

    public l(WallpaperInfo wallpaperInfo, Uri uri, List list, String str, String str2, String str3, String str4, WallpaperColors wallpaperColors, boolean z9) {
        super(list, str, str2, wallpaperInfo, str3, str4, wallpaperColors, z9);
        this.f21176i = uri;
        this.f21177j = null;
    }

    @Override // p064g3.y
    public String a() {
        return super.a();
    }

    @Override // p064g3.y
    public List b() {
        return super.b();
    }

    @Override // p064g3.y
    public String c() {
        return super.c();
    }

    @Override // p064g3.y
    public WallpaperInfo e() {
        return this.f21246d;
    }

    public WallpaperDescription j() {
        return this.f21177j;
    }

    public l(WallpaperInfo wallpaperInfo, Uri uri, WallpaperDescription wallpaperDescription, List list, String str, String str2, String str3, String str4, WallpaperColors wallpaperColors, boolean z9) {
        super(list, str, str2, wallpaperInfo, str3, str4, wallpaperColors, z9);
        this.f21176i = uri;
        this.f21177j = wallpaperDescription;
    }
}
