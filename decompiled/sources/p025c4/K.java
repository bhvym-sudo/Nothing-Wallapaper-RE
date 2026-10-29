package p025c4;

import Z3.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        boolean zL = false;
        boolean zL2 = false;
        IBinder iBinderN = null;
        a aVar = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK == 2) {
                iBinderN = b.n(parcel, iM);
            } else if (iK == 3) {
                aVar = (a) b.e(parcel, iM, a.CREATOR);
            } else if (iK == 4) {
                zL = b.l(parcel, iM);
            } else if (iK != 5) {
                b.s(parcel, iM);
            } else {
                zL2 = b.l(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new J(iO, iBinderN, aVar, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new J[i10];
    }
}
