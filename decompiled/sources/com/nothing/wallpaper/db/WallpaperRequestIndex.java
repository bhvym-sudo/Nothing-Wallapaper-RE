package com.nothing.wallpaper.db;

import androidx.annotation.Keep;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class WallpaperRequestIndex {
    private int _Id;
    private final String indexArray;
    private final int requestIndex;
    private final long stylePromptId;
    private final long subjectPromptId;
    private final int totalCount;
    private final int version;

    public WallpaperRequestIndex(int i10, long j9, long j10, String indexArray, int i11, int i12, int i13) {
        n.h(indexArray, "indexArray");
        this._Id = i10;
        this.subjectPromptId = j9;
        this.stylePromptId = j10;
        this.indexArray = indexArray;
        this.totalCount = i11;
        this.requestIndex = i12;
        this.version = i13;
    }

    public static /* synthetic */ WallpaperRequestIndex copy$default(WallpaperRequestIndex wallpaperRequestIndex, int i10, long j9, long j10, String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = wallpaperRequestIndex._Id;
        }
        if ((i14 & 2) != 0) {
            j9 = wallpaperRequestIndex.subjectPromptId;
        }
        if ((i14 & 4) != 0) {
            j10 = wallpaperRequestIndex.stylePromptId;
        }
        if ((i14 & 8) != 0) {
            str = wallpaperRequestIndex.indexArray;
        }
        if ((i14 & 16) != 0) {
            i11 = wallpaperRequestIndex.totalCount;
        }
        if ((i14 & 32) != 0) {
            i12 = wallpaperRequestIndex.requestIndex;
        }
        if ((i14 & 64) != 0) {
            i13 = wallpaperRequestIndex.version;
        }
        long j11 = j10;
        return wallpaperRequestIndex.copy(i10, j9, j11, str, i11, i12, i13);
    }

    public final int component1() {
        return this._Id;
    }

    public final long component2() {
        return this.subjectPromptId;
    }

    public final long component3() {
        return this.stylePromptId;
    }

    public final String component4() {
        return this.indexArray;
    }

    public final int component5() {
        return this.totalCount;
    }

    public final int component6() {
        return this.requestIndex;
    }

    public final int component7() {
        return this.version;
    }

    public final WallpaperRequestIndex copy(int i10, long j9, long j10, String indexArray, int i11, int i12, int i13) {
        n.h(indexArray, "indexArray");
        return new WallpaperRequestIndex(i10, j9, j10, indexArray, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperRequestIndex)) {
            return false;
        }
        WallpaperRequestIndex wallpaperRequestIndex = (WallpaperRequestIndex) obj;
        return this._Id == wallpaperRequestIndex._Id && this.subjectPromptId == wallpaperRequestIndex.subjectPromptId && this.stylePromptId == wallpaperRequestIndex.stylePromptId && n.d(this.indexArray, wallpaperRequestIndex.indexArray) && this.totalCount == wallpaperRequestIndex.totalCount && this.requestIndex == wallpaperRequestIndex.requestIndex && this.version == wallpaperRequestIndex.version;
    }

    public final String getIndexArray() {
        return this.indexArray;
    }

    public final int getRequestIndex() {
        return this.requestIndex;
    }

    public final long getStylePromptId() {
        return this.stylePromptId;
    }

    public final long getSubjectPromptId() {
        return this.subjectPromptId;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int get_Id() {
        return this._Id;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this._Id) * 31) + Long.hashCode(this.subjectPromptId)) * 31) + Long.hashCode(this.stylePromptId)) * 31) + this.indexArray.hashCode()) * 31) + Integer.hashCode(this.totalCount)) * 31) + Integer.hashCode(this.requestIndex)) * 31) + Integer.hashCode(this.version);
    }

    public final void set_Id(int i10) {
        this._Id = i10;
    }

    public String toString() {
        return "WallpaperRequestIndex(_Id=" + this._Id + ", subjectPromptId=" + this.subjectPromptId + ", stylePromptId=" + this.stylePromptId + ", indexArray=" + this.indexArray + ", totalCount=" + this.totalCount + ", requestIndex=" + this.requestIndex + ", version=" + this.version + ")";
    }
}
