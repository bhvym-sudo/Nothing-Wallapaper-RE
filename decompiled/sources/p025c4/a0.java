package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        r rVar = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zL = false;
        boolean zL2 = false;
        int iO = 0;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            switch (b.k(iM)) {
                case 1:
                    rVar = (r) b.e(parcel, iM, r.CREATOR);
                    break;
                case 2:
                    zL = b.l(parcel, iM);
                    break;
                case 3:
                    zL2 = b.l(parcel, iM);
                    break;
                case 4:
                    iArrD = b.d(parcel, iM);
                    break;
                case 5:
                    iO = b.o(parcel, iM);
                    break;
                case 6:
                    iArrD2 = b.d(parcel, iM);
                    break;
                default:
                    b.s(parcel, iM);
                    break;
            }
        }
        b.j(parcel, iT);
        return new C1191e(rVar, zL, zL2, iArrD, iO, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1191e[i10];
    }
}
