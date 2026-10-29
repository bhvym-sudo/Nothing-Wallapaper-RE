package p205u4;

import Z3.a;
import android.os.Parcel;
import android.os.Parcelable;
import p025c4.J;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        a aVar = null;
        J j9 = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK == 2) {
                aVar = (a) b.e(parcel, iM, a.CREATOR);
            } else if (iK != 3) {
                b.s(parcel, iM);
            } else {
                j9 = (J) b.e(parcel, iM, J.CREATOR);
            }
        }
        b.j(parcel, iT);
        return new l(iO, aVar, j9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
