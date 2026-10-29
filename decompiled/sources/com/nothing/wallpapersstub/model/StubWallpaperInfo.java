package com.nothing.wallpapersstub.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class StubWallpaperInfo implements Parcelable {
    public static final Parcelable.Creator<StubWallpaperInfo> CREATOR = new a();
    private final String collectionId;
    private final int coverPriority;
    private final String drawableResId;
    private final Bundle extra;
    private final int gridPriority;
    private final String packageName;
    private final String subtitle1ResId;
    private final boolean supportDepth;
    private final String titleResId;
    private final String wallpaperId;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StubWallpaperInfo createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new StubWallpaperInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readBundle(StubWallpaperInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StubWallpaperInfo[] newArray(int i10) {
            return new StubWallpaperInfo[i10];
        }
    }

    public StubWallpaperInfo(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, boolean z9, Bundle bundle) {
        this.packageName = str;
        this.drawableResId = str2;
        this.wallpaperId = str3;
        this.collectionId = str4;
        this.titleResId = str5;
        this.subtitle1ResId = str6;
        this.coverPriority = i10;
        this.gridPriority = i11;
        this.supportDepth = z9;
        this.extra = bundle;
    }

    public static /* synthetic */ StubWallpaperInfo copy$default(StubWallpaperInfo stubWallpaperInfo, String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, boolean z9, Bundle bundle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = stubWallpaperInfo.packageName;
        }
        if ((i12 & 2) != 0) {
            str2 = stubWallpaperInfo.drawableResId;
        }
        if ((i12 & 4) != 0) {
            str3 = stubWallpaperInfo.wallpaperId;
        }
        if ((i12 & 8) != 0) {
            str4 = stubWallpaperInfo.collectionId;
        }
        if ((i12 & 16) != 0) {
            str5 = stubWallpaperInfo.titleResId;
        }
        if ((i12 & 32) != 0) {
            str6 = stubWallpaperInfo.subtitle1ResId;
        }
        if ((i12 & 64) != 0) {
            i10 = stubWallpaperInfo.coverPriority;
        }
        if ((i12 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            i11 = stubWallpaperInfo.gridPriority;
        }
        if ((i12 & 256) != 0) {
            z9 = stubWallpaperInfo.supportDepth;
        }
        if ((i12 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0) {
            bundle = stubWallpaperInfo.extra;
        }
        boolean z10 = z9;
        Bundle bundle2 = bundle;
        int i13 = i10;
        int i14 = i11;
        String str7 = str5;
        String str8 = str6;
        return stubWallpaperInfo.copy(str, str2, str3, str4, str7, str8, i13, i14, z10, bundle2);
    }

    public final String component1() {
        return this.packageName;
    }

    public final Bundle component10() {
        return this.extra;
    }

    public final String component2() {
        return this.drawableResId;
    }

    public final String component3() {
        return this.wallpaperId;
    }

    public final String component4() {
        return this.collectionId;
    }

    public final String component5() {
        return this.titleResId;
    }

    public final String component6() {
        return this.subtitle1ResId;
    }

    public final int component7() {
        return this.coverPriority;
    }

    public final int component8() {
        return this.gridPriority;
    }

    public final boolean component9() {
        return this.supportDepth;
    }

    public final StubWallpaperInfo copy(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, boolean z9, Bundle bundle) {
        return new StubWallpaperInfo(str, str2, str3, str4, str5, str6, i10, i11, z9, bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StubWallpaperInfo)) {
            return false;
        }
        StubWallpaperInfo stubWallpaperInfo = (StubWallpaperInfo) obj;
        return n.d(this.packageName, stubWallpaperInfo.packageName) && n.d(this.drawableResId, stubWallpaperInfo.drawableResId) && n.d(this.wallpaperId, stubWallpaperInfo.wallpaperId) && n.d(this.collectionId, stubWallpaperInfo.collectionId) && n.d(this.titleResId, stubWallpaperInfo.titleResId) && n.d(this.subtitle1ResId, stubWallpaperInfo.subtitle1ResId) && this.coverPriority == stubWallpaperInfo.coverPriority && this.gridPriority == stubWallpaperInfo.gridPriority && this.supportDepth == stubWallpaperInfo.supportDepth && n.d(this.extra, stubWallpaperInfo.extra);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final int getCoverPriority() {
        return this.coverPriority;
    }

    public final String getDrawableResId() {
        return this.drawableResId;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final int getGridPriority() {
        return this.gridPriority;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getSubtitle1ResId() {
        return this.subtitle1ResId;
    }

    public final boolean getSupportDepth() {
        return this.supportDepth;
    }

    public final String getTitleResId() {
        return this.titleResId;
    }

    public final String getWallpaperId() {
        return this.wallpaperId;
    }

    public int hashCode() {
        String str = this.packageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.drawableResId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wallpaperId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.collectionId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleResId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitle1ResId;
        int iHashCode6 = (((((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.coverPriority)) * 31) + Integer.hashCode(this.gridPriority)) * 31) + Boolean.hashCode(this.supportDepth)) * 31;
        Bundle bundle = this.extra;
        return iHashCode6 + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        return "StubWallpaperInfo(packageName=" + this.packageName + ", drawableResId=" + this.drawableResId + ", wallpaperId=" + this.wallpaperId + ", collectionId=" + this.collectionId + ", titleResId=" + this.titleResId + ", subtitle1ResId=" + this.subtitle1ResId + ", coverPriority=" + this.coverPriority + ", gridPriority=" + this.gridPriority + ", supportDepth=" + this.supportDepth + ", extra=" + this.extra + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.packageName);
        dest.writeString(this.drawableResId);
        dest.writeString(this.wallpaperId);
        dest.writeString(this.collectionId);
        dest.writeString(this.titleResId);
        dest.writeString(this.subtitle1ResId);
        dest.writeInt(this.coverPriority);
        dest.writeInt(this.gridPriority);
        dest.writeInt(this.supportDepth ? 1 : 0);
        dest.writeBundle(this.extra);
    }

    public /* synthetic */ StubWallpaperInfo(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, boolean z9, Bundle bundle, int i12, AbstractC1457h abstractC1457h) {
        this(str, str2, str3, str4, str5, str6, (i12 & 64) != 0 ? 0 : i10, (i12 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? 0 : i11, (i12 & 256) != 0 ? false : z9, (i12 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? null : bundle);
    }
}
