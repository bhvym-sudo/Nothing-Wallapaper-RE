package com.nothing.wallpaper.db;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class CreativeWallpaper {
    private final long createTime;
    private final String filePath;
    private final long imageId;
    private final String imageUrl;
    private final String styleEn;
    private final String styleLoc;
    private final String subjectEn;
    private final String subjectLoc;

    public CreativeWallpaper(long j9, String imageUrl, String filePath, String subjectEn, String str, String styleEn, String str2, long j10) {
        n.h(imageUrl, "imageUrl");
        n.h(filePath, "filePath");
        n.h(subjectEn, "subjectEn");
        n.h(styleEn, "styleEn");
        this.imageId = j9;
        this.imageUrl = imageUrl;
        this.filePath = filePath;
        this.subjectEn = subjectEn;
        this.subjectLoc = str;
        this.styleEn = styleEn;
        this.styleLoc = str2;
        this.createTime = j10;
    }

    public static /* synthetic */ CreativeWallpaper copy$default(CreativeWallpaper creativeWallpaper, long j9, String str, String str2, String str3, String str4, String str5, String str6, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j9 = creativeWallpaper.imageId;
        }
        long j11 = j9;
        if ((i10 & 2) != 0) {
            str = creativeWallpaper.imageUrl;
        }
        return creativeWallpaper.copy(j11, str, (i10 & 4) != 0 ? creativeWallpaper.filePath : str2, (i10 & 8) != 0 ? creativeWallpaper.subjectEn : str3, (i10 & 16) != 0 ? creativeWallpaper.subjectLoc : str4, (i10 & 32) != 0 ? creativeWallpaper.styleEn : str5, (i10 & 64) != 0 ? creativeWallpaper.styleLoc : str6, (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? creativeWallpaper.createTime : j10);
    }

    public final long component1() {
        return this.imageId;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.filePath;
    }

    public final String component4() {
        return this.subjectEn;
    }

    public final String component5() {
        return this.subjectLoc;
    }

    public final String component6() {
        return this.styleEn;
    }

    public final String component7() {
        return this.styleLoc;
    }

    public final long component8() {
        return this.createTime;
    }

    public final CreativeWallpaper copy(long j9, String imageUrl, String filePath, String subjectEn, String str, String styleEn, String str2, long j10) {
        n.h(imageUrl, "imageUrl");
        n.h(filePath, "filePath");
        n.h(subjectEn, "subjectEn");
        n.h(styleEn, "styleEn");
        return new CreativeWallpaper(j9, imageUrl, filePath, subjectEn, str, styleEn, str2, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreativeWallpaper)) {
            return false;
        }
        CreativeWallpaper creativeWallpaper = (CreativeWallpaper) obj;
        return this.imageId == creativeWallpaper.imageId && n.d(this.imageUrl, creativeWallpaper.imageUrl) && n.d(this.filePath, creativeWallpaper.filePath) && n.d(this.subjectEn, creativeWallpaper.subjectEn) && n.d(this.subjectLoc, creativeWallpaper.subjectLoc) && n.d(this.styleEn, creativeWallpaper.styleEn) && n.d(this.styleLoc, creativeWallpaper.styleLoc) && this.createTime == creativeWallpaper.createTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getStyleEn() {
        return this.styleEn;
    }

    public final String getStyleLoc() {
        return this.styleLoc;
    }

    public final String getSubjectEn() {
        return this.subjectEn;
    }

    public final String getSubjectLoc() {
        return this.subjectLoc;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.imageId) * 31) + this.imageUrl.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.subjectEn.hashCode()) * 31;
        String str = this.subjectLoc;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.styleEn.hashCode()) * 31;
        String str2 = this.styleLoc;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "CreativeWallpaper(imageId=" + this.imageId + ", imageUrl=" + this.imageUrl + ", filePath=" + this.filePath + ", subjectEn=" + this.subjectEn + ", subjectLoc=" + this.subjectLoc + ", styleEn=" + this.styleEn + ", styleLoc=" + this.styleLoc + ", createTime=" + this.createTime + ")";
    }
}
