package p175r4;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class C9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        ArrayList arrayListI = null;
        float[] fArrB = null;
        Bitmap bitmap = null;
        ArrayList arrayListC = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                arrayListI = b.i(parcel, iM, z9.CREATOR);
            } else if (iK == 2) {
                fArrB = b.b(parcel, iM);
            } else if (iK == 3) {
                bitmap = (Bitmap) b.e(parcel, iM, Bitmap.CREATOR);
            } else if (iK != 4) {
                b.s(parcel, iM);
            } else {
                arrayListC = b.c(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new B9(arrayListI, fArrB, bitmap, arrayListC);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B9[i10];
    }
}
