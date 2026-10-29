package p025c4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p145o4.b;
import p145o4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends b implements InterfaceC1197k {
    public M() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p145o4.b
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            A(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            t(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            Y y9 = (Y) c.a(parcel, Y.CREATOR);
            c.b(parcel);
            y(i14, strongBinder2, y9);
        }
        parcel2.writeNoException();
        return true;
    }
}
