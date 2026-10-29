package com.nothing.wallpapersstub.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class StubWallpaperCategory implements Parcelable {
    public static final Parcelable.Creator<StubWallpaperCategory> CREATOR = new a();
    private final String collectionId;
    private final Bundle extra;
    private final int featuredThumbnailIndex;
    private final int priority;
    private final String thumbRes;
    private final String title;
    private final List<StubWallpaperInfo> wallpapers;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StubWallpaperCategory createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            n.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i10 = parcel.readInt();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(StubWallpaperInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new StubWallpaperCategory(string, string2, i10, string3, arrayList, parcel.readInt(), parcel.readBundle(StubWallpaperCategory.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StubWallpaperCategory[] newArray(int i10) {
            return new StubWallpaperCategory[i10];
        }
    }

    public StubWallpaperCategory(String str, String str2, int i10, String str3, List<StubWallpaperInfo> list, int i11, Bundle bundle) {
        this.title = str;
        this.collectionId = str2;
        this.featuredThumbnailIndex = i10;
        this.thumbRes = str3;
        this.wallpapers = list;
        this.priority = i11;
        this.extra = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StubWallpaperCategory copy$default(StubWallpaperCategory stubWallpaperCategory, String str, String str2, int i10, String str3, List list, int i11, Bundle bundle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = stubWallpaperCategory.title;
        }
        if ((i12 & 2) != 0) {
            str2 = stubWallpaperCategory.collectionId;
        }
        if ((i12 & 4) != 0) {
            i10 = stubWallpaperCategory.featuredThumbnailIndex;
        }
        if ((i12 & 8) != 0) {
            str3 = stubWallpaperCategory.thumbRes;
        }
        if ((i12 & 16) != 0) {
            list = stubWallpaperCategory.wallpapers;
        }
        if ((i12 & 32) != 0) {
            i11 = stubWallpaperCategory.priority;
        }
        if ((i12 & 64) != 0) {
            bundle = stubWallpaperCategory.extra;
        }
        int i13 = i11;
        Bundle bundle2 = bundle;
        List list2 = list;
        int i14 = i10;
        return stubWallpaperCategory.copy(str, str2, i14, str3, list2, i13, bundle2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.collectionId;
    }

    public final int component3() {
        return this.featuredThumbnailIndex;
    }

    public final String component4() {
        return this.thumbRes;
    }

    public final List<StubWallpaperInfo> component5() {
        return this.wallpapers;
    }

    public final int component6() {
        return this.priority;
    }

    public final Bundle component7() {
        return this.extra;
    }

    public final StubWallpaperCategory copy(String str, String str2, int i10, String str3, List<StubWallpaperInfo> list, int i11, Bundle bundle) {
        return new StubWallpaperCategory(str, str2, i10, str3, list, i11, bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StubWallpaperCategory)) {
            return false;
        }
        StubWallpaperCategory stubWallpaperCategory = (StubWallpaperCategory) obj;
        return n.d(this.title, stubWallpaperCategory.title) && n.d(this.collectionId, stubWallpaperCategory.collectionId) && this.featuredThumbnailIndex == stubWallpaperCategory.featuredThumbnailIndex && n.d(this.thumbRes, stubWallpaperCategory.thumbRes) && n.d(this.wallpapers, stubWallpaperCategory.wallpapers) && this.priority == stubWallpaperCategory.priority && n.d(this.extra, stubWallpaperCategory.extra);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final int getFeaturedThumbnailIndex() {
        return this.featuredThumbnailIndex;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getThumbRes() {
        return this.thumbRes;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<StubWallpaperInfo> getWallpapers() {
        return this.wallpapers;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.collectionId;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.featuredThumbnailIndex)) * 31;
        String str3 = this.thumbRes;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<StubWallpaperInfo> list = this.wallpapers;
        int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.priority)) * 31;
        Bundle bundle = this.extra;
        return iHashCode4 + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        return "StubWallpaperCategory(title=" + this.title + ", collectionId=" + this.collectionId + ", featuredThumbnailIndex=" + this.featuredThumbnailIndex + ", thumbRes=" + this.thumbRes + ", wallpapers=" + this.wallpapers + ", priority=" + this.priority + ", extra=" + this.extra + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.collectionId);
        dest.writeInt(this.featuredThumbnailIndex);
        dest.writeString(this.thumbRes);
        List<StubWallpaperInfo> list = this.wallpapers;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<StubWallpaperInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, i10);
            }
        }
        dest.writeInt(this.priority);
        dest.writeBundle(this.extra);
    }

    public /* synthetic */ StubWallpaperCategory(String str, String str2, int i10, String str3, List list, int i11, Bundle bundle, int i12, AbstractC1457h abstractC1457h) {
        this(str, str2, (i12 & 4) != 0 ? 0 : i10, str3, list, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? null : bundle);
    }
}
