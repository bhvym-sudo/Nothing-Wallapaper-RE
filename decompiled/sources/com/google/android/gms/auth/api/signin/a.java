package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListI = null;
        String strF7 = null;
        String strF8 = null;
        long jP = 0;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            switch (b.k(iM)) {
                case 1:
                    iO = b.o(parcel, iM);
                    break;
                case 2:
                    strF = b.f(parcel, iM);
                    break;
                case 3:
                    strF2 = b.f(parcel, iM);
                    break;
                case 4:
                    strF3 = b.f(parcel, iM);
                    break;
                case 5:
                    strF4 = b.f(parcel, iM);
                    break;
                case 6:
                    uri = (Uri) b.e(parcel, iM, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = b.f(parcel, iM);
                    break;
                case 8:
                    jP = b.p(parcel, iM);
                    break;
                case 9:
                    strF6 = b.f(parcel, iM);
                    break;
                case 10:
                    arrayListI = b.i(parcel, iM, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = b.f(parcel, iM);
                    break;
                case 12:
                    strF8 = b.f(parcel, iM);
                    break;
                default:
                    b.s(parcel, iM);
                    break;
            }
        }
        b.j(parcel, iT);
        return new GoogleSignInAccount(iO, strF, strF2, strF3, strF4, uri, strF5, jP, strF6, arrayListI, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
