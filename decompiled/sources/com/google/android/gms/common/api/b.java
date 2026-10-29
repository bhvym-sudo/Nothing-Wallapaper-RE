package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = p035d4.b.t(parcel);
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        PendingIntent pendingIntent = null;
        Z3.a aVar = null;
        while (parcel.dataPosition() < iT) {
            int iM = p035d4.b.m(parcel);
            int iK = p035d4.b.k(iM);
            if (iK == 1) {
                iO2 = p035d4.b.o(parcel, iM);
            } else if (iK == 2) {
                strF = p035d4.b.f(parcel, iM);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) p035d4.b.e(parcel, iM, PendingIntent.CREATOR);
            } else if (iK == 4) {
                aVar = (Z3.a) p035d4.b.e(parcel, iM, Z3.a.CREATOR);
            } else if (iK != 1000) {
                p035d4.b.s(parcel, iM);
            } else {
                iO = p035d4.b.o(parcel, iM);
            }
        }
        p035d4.b.j(parcel, iT);
        return new Status(iO, iO2, strF, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
