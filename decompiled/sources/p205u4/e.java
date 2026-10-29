package p205u4;

import android.os.Parcel;
import p135n4.b;
import p135n4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p135n4.b
    protected final boolean X(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                c.b(parcel);
                break;
            case 4:
                c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                c.b(parcel);
                break;
            case 7:
                c.b(parcel);
                break;
            case 8:
                l lVar = (l) c.a(parcel, l.CREATOR);
                c.b(parcel);
                f(lVar);
                break;
            case 9:
                c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
