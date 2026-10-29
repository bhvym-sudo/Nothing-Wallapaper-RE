package p025c4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iO2 = 0;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK == 2) {
                account = (Account) b.e(parcel, iM, Account.CREATOR);
            } else if (iK == 3) {
                iO2 = b.o(parcel, iM);
            } else if (iK != 4) {
                b.s(parcel, iM);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.e(parcel, iM, GoogleSignInAccount.CREATOR);
            }
        }
        b.j(parcel, iT);
        return new H(iO, account, iO2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new H[i10];
    }
}
