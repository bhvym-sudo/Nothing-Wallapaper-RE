package p025c4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import p145o4.b;

/* JADX INFO: renamed from: c4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1196j extends IInterface {

    /* JADX INFO: renamed from: c4.j$a */
    public static abstract class a extends b implements InterfaceC1196j {
        public static InterfaceC1196j c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1196j ? (InterfaceC1196j) iInterfaceQueryLocalInterface : new k0(iBinder);
        }
    }

    Account zzb();
}
