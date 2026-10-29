package F5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("remoteLink")
    private String f1726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SerializedName("dayAvatar")
    private Uri f1727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName("nightAvatar")
    private Uri f1728s;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.n.h(parcel, "parcel");
            return new s(parcel.readString(), (Uri) parcel.readParcelable(s.class.getClassLoader()), (Uri) parcel.readParcelable(s.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s[] newArray(int i10) {
            return new s[i10];
        }
    }

    public s(String str, Uri uri, Uri uri2) {
        this.f1726q = str;
        this.f1727r = uri;
        this.f1728s = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.n.d(this.f1726q, sVar.f1726q) && kotlin.jvm.internal.n.d(this.f1727r, sVar.f1727r) && kotlin.jvm.internal.n.d(this.f1728s, sVar.f1728s);
    }

    public int hashCode() {
        String str = this.f1726q;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.f1727r;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f1728s;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }

    public String toString() {
        return "UserAvatar(remoteLink=" + this.f1726q + ", dayAvatar=" + this.f1727r + ", nightAvatar=" + this.f1728s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.h(dest, "dest");
        dest.writeString(this.f1726q);
        dest.writeParcelable(this.f1727r, i10);
        dest.writeParcelable(this.f1728s, i10);
    }
}
