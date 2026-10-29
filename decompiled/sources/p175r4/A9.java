package p175r4;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class A9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        int iO5 = 0;
        float[] fArrB = null;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            switch (b.k(iM)) {
                case 1:
                    fArrB = b.b(parcel, iM);
                    break;
                case 2:
                    bitmap = (Bitmap) b.e(parcel, iM, Bitmap.CREATOR);
                    break;
                case 3:
                    iO = b.o(parcel, iM);
                    break;
                case 4:
                    iO2 = b.o(parcel, iM);
                    break;
                case 5:
                    iO3 = b.o(parcel, iM);
                    break;
                case 6:
                    iO4 = b.o(parcel, iM);
                    break;
                case 7:
                    iO5 = b.o(parcel, iM);
                    break;
                default:
                    b.s(parcel, iM);
                    break;
            }
        }
        b.j(parcel, iT);
        return new z9(fArrB, bitmap, iO, iO2, iO3, iO4, iO5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z9[i10];
    }
}
