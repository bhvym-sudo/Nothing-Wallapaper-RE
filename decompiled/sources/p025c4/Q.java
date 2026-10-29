package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        int iO2 = 0;
        int iO3 = 0;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK == 2) {
                zL = b.l(parcel, iM);
            } else if (iK == 3) {
                zL2 = b.l(parcel, iM);
            } else if (iK == 4) {
                iO2 = b.o(parcel, iM);
            } else if (iK != 5) {
                b.s(parcel, iM);
            } else {
                iO3 = b.o(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new r(iO, zL, zL2, iO2, iO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
