package p205u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        ArrayList arrayListG = null;
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                arrayListG = b.g(parcel, iM);
            } else if (iK != 2) {
                b.s(parcel, iM);
            } else {
                strF = b.f(parcel, iM);
            }
        }
        b.j(parcel, iT);
        return new h(arrayListG, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
