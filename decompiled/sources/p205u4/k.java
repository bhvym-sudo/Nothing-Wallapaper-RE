package p205u4;

import android.os.Parcel;
import android.os.Parcelable;
import p025c4.H;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        H h10 = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK != 2) {
                b.s(parcel, iM);
            } else {
                h10 = (H) b.e(parcel, iM, H.CREATOR);
            }
        }
        b.j(parcel, iT);
        return new j(iO, h10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
