package com.nothing.cardwidget.aiwidget;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IAIWidgetService extends IInterface {
    public static final String DESCRIPTOR = "com.nothing.cardwidget.aiwidget.IAIWidgetService";

    public static class Default implements IAIWidgetService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public void disallowTouchEvent(int i10, int i11) {
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public Bundle getAIWidgetData(Bundle bundle) {
            return null;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public Bundle getSurfacePackage(int i10, Bundle bundle) {
            return null;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public String getWidgetPreviewUri(int i10) {
            return null;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public void setAIWidgetData(Bundle bundle) {
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public void setRNLifeCycleStatus(int i10, int i11) {
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public boolean startListening(IAIWidgetCallBack iAIWidgetCallBack) {
            return false;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public void startUpdateVersion(int i10) {
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
        public boolean stopListening(IAIWidgetCallBack iAIWidgetCallBack) {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IAIWidgetService {
        static final int TRANSACTION_disallowTouchEvent = 6;
        static final int TRANSACTION_getAIWidgetData = 11;
        static final int TRANSACTION_getSurfacePackage = 4;
        static final int TRANSACTION_getWidgetPreviewUri = 8;
        static final int TRANSACTION_setAIWidgetData = 10;
        static final int TRANSACTION_setRNLifeCycleStatus = 7;
        static final int TRANSACTION_startListening = 2;
        static final int TRANSACTION_startUpdateVersion = 9;
        static final int TRANSACTION_stopListening = 3;

        private static class Proxy implements IAIWidgetService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public void disallowTouchEvent(int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public Bundle getAIWidgetData(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IAIWidgetService.DESCRIPTOR;
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public Bundle getSurfacePackage(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public String getWidgetPreviewUri(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public void setAIWidgetData(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public void setRNLifeCycleStatus(int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public boolean startListening(IAIWidgetCallBack iAIWidgetCallBack) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iAIWidgetCallBack);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public void startUpdateVersion(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetService
            public boolean stopListening(IAIWidgetCallBack iAIWidgetCallBack) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iAIWidgetCallBack);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAIWidgetService.DESCRIPTOR);
        }

        public static IAIWidgetService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAIWidgetService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAIWidgetService)) ? new Proxy(iBinder) : (IAIWidgetService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IAIWidgetService.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IAIWidgetService.DESCRIPTOR);
                return true;
            }
            switch (i10) {
                case 2:
                    boolean zStartListening = startListening(IAIWidgetCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartListening ? 1 : 0);
                    return true;
                case 3:
                    boolean zStopListening = stopListening(IAIWidgetCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopListening ? 1 : 0);
                    return true;
                case 4:
                    Bundle surfacePackage = getSurfacePackage(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, surfacePackage, 1);
                    return true;
                case 5:
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
                case 6:
                    disallowTouchEvent(parcel.readInt(), parcel.readInt());
                    return true;
                case 7:
                    setRNLifeCycleStatus(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String widgetPreviewUri = getWidgetPreviewUri(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(widgetPreviewUri);
                    return true;
                case 9:
                    startUpdateVersion(parcel.readInt());
                    return true;
                case 10:
                    setAIWidgetData((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    Bundle aIWidgetData = getAIWidgetData((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, aIWidgetData, 1);
                    return true;
            }
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

    void disallowTouchEvent(int i10, int i11);

    Bundle getAIWidgetData(Bundle bundle);

    Bundle getSurfacePackage(int i10, Bundle bundle);

    String getWidgetPreviewUri(int i10);

    void setAIWidgetData(Bundle bundle);

    void setRNLifeCycleStatus(int i10, int i11);

    boolean startListening(IAIWidgetCallBack iAIWidgetCallBack);

    void startUpdateVersion(int i10);

    boolean stopListening(IAIWidgetCallBack iAIWidgetCallBack);
}
