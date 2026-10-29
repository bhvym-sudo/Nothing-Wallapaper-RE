package p175r4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class E9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                zL = b.l(parcel, iM);
            } else if (iK == 2) {
                zL2 = b.l(parcel, iM);
            } else if (iK == 3) {
                zL3 = b.l(parcel, iM);
            } else if (iK == 4) {
                zL4 = b.l(parcel, iM);
            } else if (iK != 5) {
                b.s(parcel, iM);
            } else {
                zL5 = b.l(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new D9(zL, zL2, zL3, zL4, zL5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new D9[i10];
    }
}
