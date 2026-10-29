package com.nothing.wallpaper.picker.creative.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Prompt implements Parcelable {
    public static final Parcelable.Creator<Prompt> CREATOR = new a();
    private final String photoLink;
    private final String promptWordEn;
    private final String promptWordForLocale;
    private final long promptWordId;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Prompt createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new Prompt(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Prompt[] newArray(int i10) {
            return new Prompt[i10];
        }
    }

    public Prompt(long j9, String promptWordEn, String photoLink, String promptWordForLocale) {
        n.h(promptWordEn, "promptWordEn");
        n.h(photoLink, "photoLink");
        n.h(promptWordForLocale, "promptWordForLocale");
        this.promptWordId = j9;
        this.promptWordEn = promptWordEn;
        this.photoLink = photoLink;
        this.promptWordForLocale = promptWordForLocale;
    }

    public static /* synthetic */ Prompt copy$default(Prompt prompt, long j9, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j9 = prompt.promptWordId;
        }
        long j10 = j9;
        if ((i10 & 2) != 0) {
            str = prompt.promptWordEn;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = prompt.photoLink;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = prompt.promptWordForLocale;
        }
        return prompt.copy(j10, str4, str5, str3);
    }

    public final long component1() {
        return this.promptWordId;
    }

    public final String component2() {
        return this.promptWordEn;
    }

    public final String component3() {
        return this.photoLink;
    }

    public final String component4() {
        return this.promptWordForLocale;
    }

    public final Prompt copy(long j9, String promptWordEn, String photoLink, String promptWordForLocale) {
        n.h(promptWordEn, "promptWordEn");
        n.h(photoLink, "photoLink");
        n.h(promptWordForLocale, "promptWordForLocale");
        return new Prompt(j9, promptWordEn, photoLink, promptWordForLocale);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prompt)) {
            return false;
        }
        Prompt prompt = (Prompt) obj;
        return this.promptWordId == prompt.promptWordId && n.d(this.promptWordEn, prompt.promptWordEn) && n.d(this.photoLink, prompt.photoLink) && n.d(this.promptWordForLocale, prompt.promptWordForLocale);
    }

    public final String getPhotoLink() {
        return this.photoLink;
    }

    public final String getPromptWordEn() {
        return this.promptWordEn;
    }

    public final String getPromptWordForLocale() {
        return this.promptWordForLocale;
    }

    public final long getPromptWordId() {
        return this.promptWordId;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.promptWordId) * 31) + this.promptWordEn.hashCode()) * 31) + this.photoLink.hashCode()) * 31) + this.promptWordForLocale.hashCode();
    }

    public String toString() {
        return "Prompt(promptWordId=" + this.promptWordId + ", promptWordEn=" + this.promptWordEn + ", photoLink=" + this.photoLink + ", promptWordForLocale=" + this.promptWordForLocale + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeLong(this.promptWordId);
        dest.writeString(this.promptWordEn);
        dest.writeString(this.photoLink);
        dest.writeString(this.promptWordForLocale);
    }
}
