package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = p035d4.b.t(parcel);
        int iO = 0;
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int iM = p035d4.b.m(parcel);
            int iK = p035d4.b.k(iM);
            if (iK == 1) {
                iO = p035d4.b.o(parcel, iM);
            } else if (iK != 2) {
                p035d4.b.s(parcel, iM);
            } else {
                strF = p035d4.b.f(parcel, iM);
            }
        }
        p035d4.b.j(parcel, iT);
        return new Scope(iO, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
