package Z3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = p035d4.b.t(parcel);
        String strF = null;
        int iO = 0;
        long jP = -1;
        while (parcel.dataPosition() < iT) {
            int iM = p035d4.b.m(parcel);
            int iK = p035d4.b.k(iM);
            if (iK == 1) {
                strF = p035d4.b.f(parcel, iM);
            } else if (iK == 2) {
                iO = p035d4.b.o(parcel, iM);
            } else if (iK != 3) {
                p035d4.b.s(parcel, iM);
            } else {
                jP = p035d4.b.p(parcel, iM);
            }
        }
        p035d4.b.j(parcel, iT);
        return new c(strF, iO, jP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
