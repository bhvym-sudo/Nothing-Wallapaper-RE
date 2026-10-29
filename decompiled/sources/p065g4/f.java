package p065g4;

import Z3.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        ArrayList arrayListI = null;
        String strF = null;
        boolean zL = false;
        String strF2 = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                arrayListI = b.i(parcel, iM, c.CREATOR);
            } else if (iK == 2) {
                zL = b.l(parcel, iM);
            } else if (iK == 3) {
                strF2 = b.f(parcel, iM);
            } else if (iK != 4) {
                b.s(parcel, iM);
            } else {
                strF = b.f(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new a(arrayListI, zL, strF2, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
