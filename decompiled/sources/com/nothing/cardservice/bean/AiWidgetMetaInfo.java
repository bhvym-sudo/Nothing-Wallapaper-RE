package com.nothing.cardservice.bean;

import androidx.constraintlayout.core.widgets.Optimizer;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class AiWidgetMetaInfo {

    @SerializedName("bundleId")
    private String bundleId;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("creator")
    private String creator;

    @SerializedName("hasNewVersion")
    private boolean hasNewVersion;

    @SerializedName("name")
    private String name;

    @SerializedName("sessionId")
    private String sessionId;

    @SerializedName("versionUpdate")
    private boolean versionUpdate;

    @SerializedName("widgetDescription")
    private String widgetDescription;

    public AiWidgetMetaInfo() {
        this(null, null, false, null, null, 0L, null, false, 255, null);
    }

    public static /* synthetic */ AiWidgetMetaInfo copy$default(AiWidgetMetaInfo aiWidgetMetaInfo, String str, String str2, boolean z9, String str3, String str4, long j9, String str5, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aiWidgetMetaInfo.bundleId;
        }
        if ((i10 & 2) != 0) {
            str2 = aiWidgetMetaInfo.name;
        }
        if ((i10 & 4) != 0) {
            z9 = aiWidgetMetaInfo.versionUpdate;
        }
        if ((i10 & 8) != 0) {
            str3 = aiWidgetMetaInfo.sessionId;
        }
        if ((i10 & 16) != 0) {
            str4 = aiWidgetMetaInfo.creator;
        }
        if ((i10 & 32) != 0) {
            j9 = aiWidgetMetaInfo.createTime;
        }
        if ((i10 & 64) != 0) {
            str5 = aiWidgetMetaInfo.widgetDescription;
        }
        if ((i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            z10 = aiWidgetMetaInfo.hasNewVersion;
        }
        long j10 = j9;
        String str6 = str3;
        String str7 = str4;
        boolean z11 = z9;
        return aiWidgetMetaInfo.copy(str, str2, z11, str6, str7, j10, str5, z10);
    }

    public final String component1() {
        return this.bundleId;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.versionUpdate;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final String component5() {
        return this.creator;
    }

    public final long component6() {
        return this.createTime;
    }

    public final String component7() {
        return this.widgetDescription;
    }

    public final boolean component8() {
        return this.hasNewVersion;
    }

    public final AiWidgetMetaInfo copy(String str, String str2, boolean z9, String str3, String str4, long j9, String str5, boolean z10) {
        return new AiWidgetMetaInfo(str, str2, z9, str3, str4, j9, str5, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiWidgetMetaInfo)) {
            return false;
        }
        AiWidgetMetaInfo aiWidgetMetaInfo = (AiWidgetMetaInfo) obj;
        return n.d(this.bundleId, aiWidgetMetaInfo.bundleId) && n.d(this.name, aiWidgetMetaInfo.name) && this.versionUpdate == aiWidgetMetaInfo.versionUpdate && n.d(this.sessionId, aiWidgetMetaInfo.sessionId) && n.d(this.creator, aiWidgetMetaInfo.creator) && this.createTime == aiWidgetMetaInfo.createTime && n.d(this.widgetDescription, aiWidgetMetaInfo.widgetDescription) && this.hasNewVersion == aiWidgetMetaInfo.hasNewVersion;
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getCreator() {
        return this.creator;
    }

    public final boolean getHasNewVersion() {
        return this.hasNewVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getVersionUpdate() {
        return this.versionUpdate;
    }

    public final String getWidgetDescription() {
        return this.widgetDescription;
    }

    public int hashCode() {
        String str = this.bundleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.versionUpdate)) * 31;
        String str3 = this.sessionId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.creator;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Long.hashCode(this.createTime)) * 31;
        String str5 = this.widgetDescription;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasNewVersion);
    }

    public final void setBundleId(String str) {
        this.bundleId = str;
    }

    public final void setCreateTime(long j9) {
        this.createTime = j9;
    }

    public final void setCreator(String str) {
        this.creator = str;
    }

    public final void setHasNewVersion(boolean z9) {
        this.hasNewVersion = z9;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setVersionUpdate(boolean z9) {
        this.versionUpdate = z9;
    }

    public final void setWidgetDescription(String str) {
        this.widgetDescription = str;
    }

    public String toString() {
        return "AiWidgetMetaInfo(bundleId=" + this.bundleId + ", name=" + this.name + ", versionUpdate=" + this.versionUpdate + ", sessionId=" + this.sessionId + ", creator=" + this.creator + ", createTime=" + this.createTime + ", widgetDescription=" + this.widgetDescription + ", hasNewVersion=" + this.hasNewVersion + ")";
    }

    public AiWidgetMetaInfo(String str, String str2, boolean z9, String str3, String str4, long j9, String str5, boolean z10) {
        this.bundleId = str;
        this.name = str2;
        this.versionUpdate = z9;
        this.sessionId = str3;
        this.creator = str4;
        this.createTime = j9;
        this.widgetDescription = str5;
        this.hasNewVersion = z10;
    }

    public /* synthetic */ AiWidgetMetaInfo(String str, String str2, boolean z9, String str3, String str4, long j9, String str5, boolean z10, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z9, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? 0L : j9, (i10 & 64) != 0 ? null : str5, (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? false : z10);
    }
}
