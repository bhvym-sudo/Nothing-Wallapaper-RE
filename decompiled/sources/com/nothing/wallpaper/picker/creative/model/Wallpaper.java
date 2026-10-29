package com.nothing.wallpaper.picker.creative.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Wallpaper implements Parcelable {
    public static final Parcelable.Creator<Wallpaper> CREATOR = new a();
    private long id;
    private String link;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wallpaper createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new Wallpaper(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Wallpaper[] newArray(int i10) {
            return new Wallpaper[i10];
        }
    }

    public Wallpaper(long j9, String link) {
        n.h(link, "link");
        this.id = j9;
        this.link = link;
    }

    public static /* synthetic */ Wallpaper copy$default(Wallpaper wallpaper, long j9, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j9 = wallpaper.id;
        }
        if ((i10 & 2) != 0) {
            str = wallpaper.link;
        }
        return wallpaper.copy(j9, str);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.link;
    }

    public final Wallpaper copy(long j9, String link) {
        n.h(link, "link");
        return new Wallpaper(j9, link);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wallpaper)) {
            return false;
        }
        Wallpaper wallpaper = (Wallpaper) obj;
        return this.id == wallpaper.id && n.d(this.link, wallpaper.link);
    }

    public final long getId() {
        return this.id;
    }

    public final String getLink() {
        return this.link;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.link.hashCode();
    }

    public final void setId(long j9) {
        this.id = j9;
    }

    public final void setLink(String str) {
        n.h(str, "<set-?>");
        this.link = str;
    }

    public String toString() {
        return "Wallpaper(id=" + this.id + ", link=" + this.link + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.link);
    }
}
