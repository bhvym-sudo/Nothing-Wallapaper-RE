package p087i6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* JADX INFO: renamed from: i6.g$a$a, reason: collision with other inner class name */
        private static class C0550a implements g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private IBinder f22191q;

            C0550a(IBinder iBinder) {
                this.f22191q = iBinder;
            }

            @Override // p087i6.g
            public void P(boolean z9) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.wallpaper.common.ISimpleMessenger");
                    parcelObtain.writeInt(z9 ? 1 : 0);
                    this.f22191q.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22191q;
            }
        }

        public a() {
            attachInterface(this, "com.nothing.wallpaper.common.ISimpleMessenger");
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.nothing.wallpaper.common.ISimpleMessenger");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) ? new C0550a(iBinder) : (g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.nothing.wallpaper.common.ISimpleMessenger");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.nothing.wallpaper.common.ISimpleMessenger");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            P(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void P(boolean z9);
}
