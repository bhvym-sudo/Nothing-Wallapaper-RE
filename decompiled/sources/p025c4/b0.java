package p025c4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p035d4.b;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    static void a(C1192f c1192f, Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, c1192f.f15165q);
        c.h(parcel, 2, c1192f.f15166r);
        c.h(parcel, 3, c1192f.f15167s);
        c.m(parcel, 4, c1192f.f15168t, false);
        c.g(parcel, 5, c1192f.f15169u, false);
        c.o(parcel, 6, c1192f.f15170v, i10, false);
        c.d(parcel, 7, c1192f.f15171w, false);
        c.l(parcel, 8, c1192f.f15172x, i10, false);
        c.o(parcel, 10, c1192f.f15173y, i10, false);
        c.o(parcel, 11, c1192f.f15174z, i10, false);
        c.c(parcel, 12, c1192f.f15161A);
        c.h(parcel, 13, c1192f.f15162B);
        c.c(parcel, 14, c1192f.f15163C);
        c.m(parcel, 15, c1192f.a(), false);
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        Scope[] scopeArr = C1192f.f15159E;
        Bundle bundle = new Bundle();
        Z3.c[] cVarArr = C1192f.f15160F;
        Z3.c[] cVarArr2 = cVarArr;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        boolean zL = false;
        int iO4 = 0;
        boolean zL2 = false;
        String strF = null;
        IBinder iBinderN = null;
        Account account = null;
        String strF2 = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            switch (b.k(iM)) {
                case 1:
                    iO = b.o(parcel, iM);
                    break;
                case 2:
                    iO2 = b.o(parcel, iM);
                    break;
                case 3:
                    iO3 = b.o(parcel, iM);
                    break;
                case 4:
                    strF = b.f(parcel, iM);
                    break;
                case 5:
                    iBinderN = b.n(parcel, iM);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.h(parcel, iM, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel, iM);
                    break;
                case 8:
                    account = (Account) b.e(parcel, iM, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.s(parcel, iM);
                    break;
                case 10:
                    cVarArr = (Z3.c[]) b.h(parcel, iM, Z3.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (Z3.c[]) b.h(parcel, iM, Z3.c.CREATOR);
                    break;
                case 12:
                    zL = b.l(parcel, iM);
                    break;
                case 13:
                    iO4 = b.o(parcel, iM);
                    break;
                case 14:
                    zL2 = b.l(parcel, iM);
                    break;
                case 15:
                    strF2 = b.f(parcel, iM);
                    break;
            }
        }
        b.j(parcel, iT);
        return new C1192f(iO, iO2, iO3, strF, iBinderN, scopeArr, bundle, account, cVarArr, cVarArr2, zL, iO4, zL2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1192f[i10];
    }
}
