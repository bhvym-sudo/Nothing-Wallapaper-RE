package p097j6;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        /* JADX INFO: renamed from: j6.f$a$a, reason: collision with other inner class name */
        private static class C0557a implements f {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private IBinder f22331q;

            C0557a(IBinder iBinder) {
                this.f22331q = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22331q;
            }

            @Override // p097j6.f
            public Bitmap get() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.wallpaper.common.bitmap.IBitmapFetcher");
                    this.f22331q.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bitmap) b.c(parcelObtain2, Bitmap.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.nothing.wallpaper.common.bitmap.IBitmapFetcher");
        }

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.nothing.wallpaper.common.bitmap.IBitmapFetcher");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) ? new C0557a(iBinder) : (f) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.nothing.wallpaper.common.bitmap.IBitmapFetcher");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.nothing.wallpaper.common.bitmap.IBitmapFetcher");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            Bitmap bitmap = get();
            parcel2.writeNoException();
            b.d(parcel2, bitmap, 1);
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    Bitmap get();
}
