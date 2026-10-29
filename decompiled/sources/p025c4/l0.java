package p025c4;

import android.os.Parcel;
import p115l4.a;
import p145o4.b;
import p145o4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends b implements m0 {
    public l0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // p145o4.b
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            a aVarB = b();
            parcel2.writeNoException();
            c.d(parcel2, aVarB);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
