package com.nothing.cardwidget;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IRemoteService extends IInterface {
    public static final String DESCRIPTOR = "com.nothing.cardwidget.IRemoteService";

    public static class Default implements IRemoteService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nothing.cardwidget.IRemoteService
        public Bundle callRemoteService(Bundle bundle) {
            return null;
        }

        @Override // com.nothing.cardwidget.IRemoteService
        public boolean startListening(IRemoteServiceCallback iRemoteServiceCallback) {
            return false;
        }

        @Override // com.nothing.cardwidget.IRemoteService
        public boolean stopListening(IRemoteServiceCallback iRemoteServiceCallback) {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IRemoteService {
        static final int TRANSACTION_callRemoteService = 3;
        static final int TRANSACTION_startListening = 1;
        static final int TRANSACTION_stopListening = 2;

        private static class Proxy implements IRemoteService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.nothing.cardwidget.IRemoteService
            public Bundle callRemoteService(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRemoteService.DESCRIPTOR;
            }

            @Override // com.nothing.cardwidget.IRemoteService
            public boolean startListening(IRemoteServiceCallback iRemoteServiceCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRemoteServiceCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.IRemoteService
            public boolean stopListening(IRemoteServiceCallback iRemoteServiceCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRemoteServiceCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRemoteService.DESCRIPTOR);
        }

        public static IRemoteService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemoteService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteService)) ? new Proxy(iBinder) : (IRemoteService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IRemoteService.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IRemoteService.DESCRIPTOR);
                return true;
            }
            if (i10 == 1) {
                boolean zStartListening = startListening(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zStartListening ? 1 : 0);
            } else if (i10 == 2) {
                boolean zStopListening = stopListening(IRemoteServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zStopListening ? 1 : 0);
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                Bundle bundleCallRemoteService = callRemoteService((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, bundleCallRemoteService, 1);
            }
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t9, int i10) {
            if (t9 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t9.writeToParcel(parcel, i10);
            }
        }
    }

    Bundle callRemoteService(Bundle bundle);

    boolean startListening(IRemoteServiceCallback iRemoteServiceCallback);

    boolean stopListening(IRemoteServiceCallback iRemoteServiceCallback);
}
