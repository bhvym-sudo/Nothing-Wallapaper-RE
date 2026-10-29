package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f12943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f12944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    C1117b[] f12945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f12946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    String f12947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ArrayList f12948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ArrayList f12949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList f12950x;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public L createFromParcel(Parcel parcel) {
            return new L(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public L[] newArray(int i10) {
            return new L[i10];
        }
    }

    public L() {
        this.f12947u = null;
        this.f12948v = new ArrayList();
        this.f12949w = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f12943q);
        parcel.writeStringList(this.f12944r);
        parcel.writeTypedArray(this.f12945s, i10);
        parcel.writeInt(this.f12946t);
        parcel.writeString(this.f12947u);
        parcel.writeStringList(this.f12948v);
        parcel.writeTypedList(this.f12949w);
        parcel.writeTypedList(this.f12950x);
    }

    public L(Parcel parcel) {
        this.f12947u = null;
        this.f12948v = new ArrayList();
        this.f12949w = new ArrayList();
        this.f12943q = parcel.createStringArrayList();
        this.f12944r = parcel.createStringArrayList();
        this.f12945s = (C1117b[]) parcel.createTypedArray(C1117b.CREATOR);
        this.f12946t = parcel.readInt();
        this.f12947u = parcel.readString();
        this.f12948v = parcel.createStringArrayList();
        this.f12949w = parcel.createTypedArrayList(C1118c.CREATOR);
        this.f12950x = parcel.createTypedArrayList(J.l.CREATOR);
    }
}
