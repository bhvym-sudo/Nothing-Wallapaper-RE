package com.nothing.wallpaper.onlineconfig;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class WallpaperOnlineConfigBean {

    @SerializedName("content")
    private final List<WallpaperOnlineConfig> content;

    public WallpaperOnlineConfigBean(List<WallpaperOnlineConfig> content) {
        n.h(content, "content");
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallpaperOnlineConfigBean copy$default(WallpaperOnlineConfigBean wallpaperOnlineConfigBean, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = wallpaperOnlineConfigBean.content;
        }
        return wallpaperOnlineConfigBean.copy(list);
    }

    public final List<WallpaperOnlineConfig> component1() {
        return this.content;
    }

    public final WallpaperOnlineConfigBean copy(List<WallpaperOnlineConfig> content) {
        n.h(content, "content");
        return new WallpaperOnlineConfigBean(content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallpaperOnlineConfigBean) && n.d(this.content, ((WallpaperOnlineConfigBean) obj).content);
    }

    public final List<WallpaperOnlineConfig> getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return "WallpaperOnlineConfigBean(content=" + this.content + ")";
    }
}
