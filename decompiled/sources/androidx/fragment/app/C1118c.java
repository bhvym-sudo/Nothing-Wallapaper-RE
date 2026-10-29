package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1118c implements Parcelable {
    public static final Parcelable.Creator<C1118c> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final List f13105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final List f13106r;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1118c createFromParcel(Parcel parcel) {
            return new C1118c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1118c[] newArray(int i10) {
            return new C1118c[i10];
        }
    }

    C1118c(Parcel parcel) {
        this.f13105q = parcel.createStringArrayList();
        this.f13106r = parcel.createTypedArrayList(C1117b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f13105q);
        parcel.writeTypedList(this.f13106r);
    }
}
