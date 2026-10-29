package p025c4;

import Z3.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        Bundle bundleA = null;
        C1191e c1191e = null;
        int iO = 0;
        c[] cVarArr = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                bundleA = b.a(parcel, iM);
            } else if (iK == 2) {
                cVarArr = (c[]) b.h(parcel, iM, c.CREATOR);
            } else if (iK == 3) {
                iO = b.o(parcel, iM);
            } else if (iK != 4) {
                b.s(parcel, iM);
            } else {
                c1191e = (C1191e) b.e(parcel, iM, C1191e.CREATOR);
            }
        }
        b.j(parcel, iT);
        return new Y(bundleA, cVarArr, iO, c1191e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Y[i10];
    }
}
