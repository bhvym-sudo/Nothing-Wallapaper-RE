package F5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface p extends IInterface {

    public static abstract class a extends Binder implements p {
        public a() {
            attachInterface(this, "com.nothing.cardservice.ICardWidgetCallBack");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.nothing.cardservice.ICardWidgetCallBack");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.nothing.cardservice.ICardWidgetCallBack");
                return true;
            }
            switch (i10) {
                case 1:
                    H(parcel.readInt(), (o) b.b(parcel, o.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    I(parcel.readInt(), (m) b.b(parcel, m.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    k(parcel.readInt(), parcel.readInt(), (o) b.b(parcel, o.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    g(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    s(parcel.readString(), (r) b.b(parcel, r.CREATOR), (Bundle) b.b(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    j(parcel.readInt(), (r) b.b(parcel, r.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    x();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    N(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    o(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    q(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    R(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void H(int i10, o oVar);

    void I(int i10, m mVar);

    void N(int i10, int i11, boolean z9);

    void R(int i10);

    void g(int i10);

    void j(int i10, r rVar);

    void k(int i10, int i11, o oVar);

    void o(String str);

    void q(String str);

    void s(String str, r rVar, Bundle bundle);

    void x();
}
