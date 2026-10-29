package p175r4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class u9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        long jP = 0;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK == 2) {
                iO2 = b.o(parcel, iM);
            } else if (iK == 3) {
                iO3 = b.o(parcel, iM);
            } else if (iK == 4) {
                iO4 = b.o(parcel, iM);
            } else if (iK != 5) {
                b.s(parcel, iM);
            } else {
                jP = b.p(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new s9(iO, iO2, iO3, iO4, jP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s9[i10];
    }
}
