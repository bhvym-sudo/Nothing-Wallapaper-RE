package com.nothing.wallpaper.picker.creative.network.entity;

import androidx.annotation.Keep;
import com.nothing.wallpaper.picker.creative.model.Wallpaper;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class WallpaperResponse {
    private final List<Wallpaper> wallpapers;

    public WallpaperResponse(List<Wallpaper> list) {
        this.wallpapers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallpaperResponse copy$default(WallpaperResponse wallpaperResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = wallpaperResponse.wallpapers;
        }
        return wallpaperResponse.copy(list);
    }

    public final List<Wallpaper> component1() {
        return this.wallpapers;
    }

    public final WallpaperResponse copy(List<Wallpaper> list) {
        return new WallpaperResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallpaperResponse) && n.d(this.wallpapers, ((WallpaperResponse) obj).wallpapers);
    }

    public final List<Wallpaper> getWallpapers() {
        return this.wallpapers;
    }

    public int hashCode() {
        List<Wallpaper> list = this.wallpapers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "WallpaperResponse(wallpapers=" + this.wallpapers + ")";
    }
}
