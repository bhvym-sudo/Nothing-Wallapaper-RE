package p055f4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        Long lQ = null;
        Long lQ2 = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK == 2) {
                iO2 = b.o(parcel, iM);
            } else if (iK == 3) {
                lQ = b.q(parcel, iM);
            } else if (iK == 4) {
                lQ2 = b.q(parcel, iM);
            } else if (iK != 5) {
                b.s(parcel, iM);
            } else {
                iO3 = b.o(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new h(iO, iO2, lQ, lQ2, iO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
