package p205u4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        Intent intent = null;
        int iO2 = 0;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK == 2) {
                iO2 = b.o(parcel, iM);
            } else if (iK != 3) {
                b.s(parcel, iM);
            } else {
                intent = (Intent) b.e(parcel, iM, Intent.CREATOR);
            }
        }
        b.j(parcel, iT);
        return new b(iO, iO2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
