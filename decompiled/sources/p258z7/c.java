package p258z7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f30796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f30797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f30798s;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String pkgName, String key, long j9) {
        n.h(pkgName, "pkgName");
        n.h(key, "key");
        this.f30796q = pkgName;
        this.f30797r = key;
        this.f30798s = j9;
    }

    public final String a() {
        return this.f30797r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.d(this.f30796q, cVar.f30796q) && n.d(this.f30797r, cVar.f30797r) && this.f30798s == cVar.f30798s;
    }

    public int hashCode() {
        return (((this.f30796q.hashCode() * 31) + this.f30797r.hashCode()) * 31) + Long.hashCode(this.f30798s);
    }

    public String toString() {
        return "SelectInfo(pkgName=" + this.f30796q + ", key=" + this.f30797r + ", timestamp=" + this.f30798s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.f30796q);
        dest.writeString(this.f30797r);
        dest.writeLong(this.f30798s);
    }

    public /* synthetic */ c(String str, String str2, long j9, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? System.currentTimeMillis() : j9);
    }
}
