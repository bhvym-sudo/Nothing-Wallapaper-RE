package F5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f1729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f1730r;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.n.h(parcel, "parcel");
            return new t(parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i10) {
            return new t[i10];
        }
    }

    public t(int i10, boolean z9) {
        this.f1729q = i10;
        this.f1730r = z9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1729q == tVar.f1729q && this.f1730r == tVar.f1730r;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f1729q) * 31) + Boolean.hashCode(this.f1730r);
    }

    public String toString() {
        return "WidgetVisibleInfo(widgetId=" + this.f1729q + ", visible=" + this.f1730r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.h(dest, "dest");
        dest.writeInt(this.f1729q);
        dest.writeInt(this.f1730r ? 1 : 0);
    }
}
