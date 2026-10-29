package com.nothing.wallpaper.onlineconfig;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class DepthConfig {

    @SerializedName("depth_overlap_rate")
    private final Float depthOverlapRate;

    public DepthConfig(Float f10) {
        this.depthOverlapRate = f10;
    }

    public static /* synthetic */ DepthConfig copy$default(DepthConfig depthConfig, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = depthConfig.depthOverlapRate;
        }
        return depthConfig.copy(f10);
    }

    public final Float component1() {
        return this.depthOverlapRate;
    }

    public final DepthConfig copy(Float f10) {
        return new DepthConfig(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DepthConfig) && n.d(this.depthOverlapRate, ((DepthConfig) obj).depthOverlapRate);
    }

    public final Float getDepthOverlapRate() {
        return this.depthOverlapRate;
    }

    public int hashCode() {
        Float f10 = this.depthOverlapRate;
        if (f10 == null) {
            return 0;
        }
        return f10.hashCode();
    }

    public String toString() {
        return "DepthConfig(depthOverlapRate=" + this.depthOverlapRate + ")";
    }
}
