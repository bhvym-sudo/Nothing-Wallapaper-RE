package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        long jP = 0;
        long jP2 = 0;
        String strF = null;
        String strF2 = null;
        int iO5 = -1;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            switch (b.k(iM)) {
                case 1:
                    iO = b.o(parcel, iM);
                    break;
                case 2:
                    iO2 = b.o(parcel, iM);
                    break;
                case 3:
                    iO3 = b.o(parcel, iM);
                    break;
                case 4:
                    jP = b.p(parcel, iM);
                    break;
                case 5:
                    jP2 = b.p(parcel, iM);
                    break;
                case 6:
                    strF = b.f(parcel, iM);
                    break;
                case 7:
                    strF2 = b.f(parcel, iM);
                    break;
                case 8:
                    iO4 = b.o(parcel, iM);
                    break;
                case 9:
                    iO5 = b.o(parcel, iM);
                    break;
                default:
                    b.s(parcel, iM);
                    break;
            }
        }
        b.j(parcel, iT);
        return new C1200n(iO, iO2, iO3, jP, jP2, strF, strF2, iO4, iO5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1200n[i10];
    }
}
