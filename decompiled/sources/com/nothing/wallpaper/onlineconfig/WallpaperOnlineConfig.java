package com.nothing.wallpaper.onlineconfig;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class WallpaperOnlineConfig {

    @SerializedName("depth_config")
    private final DepthConfig depthConfig;

    @SerializedName("version")
    private final Integer version;

    public WallpaperOnlineConfig(Integer num, DepthConfig depthConfig) {
        this.version = num;
        this.depthConfig = depthConfig;
    }

    public static /* synthetic */ WallpaperOnlineConfig copy$default(WallpaperOnlineConfig wallpaperOnlineConfig, Integer num, DepthConfig depthConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = wallpaperOnlineConfig.version;
        }
        if ((i10 & 2) != 0) {
            depthConfig = wallpaperOnlineConfig.depthConfig;
        }
        return wallpaperOnlineConfig.copy(num, depthConfig);
    }

    public final Integer component1() {
        return this.version;
    }

    public final DepthConfig component2() {
        return this.depthConfig;
    }

    public final WallpaperOnlineConfig copy(Integer num, DepthConfig depthConfig) {
        return new WallpaperOnlineConfig(num, depthConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperOnlineConfig)) {
            return false;
        }
        WallpaperOnlineConfig wallpaperOnlineConfig = (WallpaperOnlineConfig) obj;
        return n.d(this.version, wallpaperOnlineConfig.version) && n.d(this.depthConfig, wallpaperOnlineConfig.depthConfig);
    }

    public final DepthConfig getDepthConfig() {
        return this.depthConfig;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        DepthConfig depthConfig = this.depthConfig;
        return iHashCode + (depthConfig != null ? depthConfig.hashCode() : 0);
    }

    public String toString() {
        return "WallpaperOnlineConfig(version=" + this.version + ", depthConfig=" + this.depthConfig + ")";
    }
}
