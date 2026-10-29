package F2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class s extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            s sVar = new s();
            ClassLoader classLoader = s.class.getClassLoader();
            int i10 = parcel.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                sVar.put(parcel.readInt(), parcel.readParcelable(classLoader));
            }
            return sVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i10) {
            return new s[i10];
        }
    }

    @Override // android.util.SparseArray
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(keyAt(i11));
            parcel.writeParcelable((Parcelable) valueAt(i11), 0);
        }
    }
}
