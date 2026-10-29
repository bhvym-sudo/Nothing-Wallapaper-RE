package p025c4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p145o4.a;
import p145o4.c;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends a implements InterfaceC1196j {
    k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p025c4.InterfaceC1196j
    public final Account zzb() {
        Parcel parcelA = a(2, c());
        Account account = (Account) c.a(parcelA, Account.CREATOR);
        parcelA.recycle();
        return account;
    }
}
