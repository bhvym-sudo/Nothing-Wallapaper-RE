package Z3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = p035d4.b.t(parcel);
        int iO = 0;
        PendingIntent pendingIntent = null;
        String strF = null;
        int iO2 = 0;
        while (parcel.dataPosition() < iT) {
            int iM = p035d4.b.m(parcel);
            int iK = p035d4.b.k(iM);
            if (iK == 1) {
                iO = p035d4.b.o(parcel, iM);
            } else if (iK == 2) {
                iO2 = p035d4.b.o(parcel, iM);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) p035d4.b.e(parcel, iM, PendingIntent.CREATOR);
            } else if (iK != 4) {
                p035d4.b.s(parcel, iM);
            } else {
                strF = p035d4.b.f(parcel, iM);
            }
        }
        p035d4.b.j(parcel, iT);
        return new a(iO, iO2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
