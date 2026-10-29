package com.nothing.cardservice.bean;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class StickerResourceInfo implements Parcelable {
    public static final Parcelable.Creator<StickerResourceInfo> CREATOR = new Creator();
    private final String code;
    private final Uri uri;

    public static final class Creator implements Parcelable.Creator<StickerResourceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerResourceInfo createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new StickerResourceInfo(parcel.readString(), (Uri) parcel.readParcelable(StickerResourceInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerResourceInfo[] newArray(int i10) {
            return new StickerResourceInfo[i10];
        }
    }

    public StickerResourceInfo(String code, Uri uri) {
        n.h(code, "code");
        this.code = code;
        this.uri = uri;
    }

    public static /* synthetic */ StickerResourceInfo copy$default(StickerResourceInfo stickerResourceInfo, String str, Uri uri, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stickerResourceInfo.code;
        }
        if ((i10 & 2) != 0) {
            uri = stickerResourceInfo.uri;
        }
        return stickerResourceInfo.copy(str, uri);
    }

    public final String component1() {
        return this.code;
    }

    public final Uri component2() {
        return this.uri;
    }

    public final StickerResourceInfo copy(String code, Uri uri) {
        n.h(code, "code");
        return new StickerResourceInfo(code, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerResourceInfo)) {
            return false;
        }
        StickerResourceInfo stickerResourceInfo = (StickerResourceInfo) obj;
        return n.d(this.code, stickerResourceInfo.code) && n.d(this.uri, stickerResourceInfo.uri);
    }

    public final String getCode() {
        return this.code;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        Uri uri = this.uri;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public String toString() {
        return "StickerResourceInfo(code=" + this.code + ", uri=" + this.uri + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.code);
        dest.writeParcelable(this.uri, i10);
    }

    public /* synthetic */ StickerResourceInfo(String str, Uri uri, int i10, AbstractC1457h abstractC1457h) {
        this(str, (i10 & 2) != 0 ? null : uri);
    }
}
