package C7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f679r;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new b(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String slotId, String affordanceId) {
        n.h(slotId, "slotId");
        n.h(affordanceId, "affordanceId");
        this.f678q = slotId;
        this.f679r = affordanceId;
    }

    public final String a() {
        return this.f679r;
    }

    public final String b() {
        return this.f678q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f678q, bVar.f678q) && n.d(this.f679r, bVar.f679r);
    }

    public int hashCode() {
        return (this.f678q.hashCode() * 31) + this.f679r.hashCode();
    }

    public String toString() {
        return "ShortcutSelectionInfo(slotId=" + this.f678q + ", affordanceId=" + this.f679r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.f678q);
        dest.writeString(this.f679r);
    }
}
