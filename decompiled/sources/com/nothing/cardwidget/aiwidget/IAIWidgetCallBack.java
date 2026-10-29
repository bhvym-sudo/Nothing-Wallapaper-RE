package com.nothing.cardwidget.aiwidget;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IAIWidgetCallBack extends IInterface {
    public static final String DESCRIPTOR = "com.nothing.cardwidget.aiwidget.IAIWidgetCallBack";

    public static class Default implements IAIWidgetCallBack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public Bundle getLauncherActivityOptions(int i10) {
            return null;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public void onMoveGestureEnabled(int i10, boolean z9) {
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public void onReactLoadResult(int i10, String str, int i11) {
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public void onSurfaceTouchDownEvent(int i10, long j9) {
        }
    }

    public static abstract class Stub extends Binder implements IAIWidgetCallBack {
        static final int TRANSACTION_getLauncherActivityOptions = 5;
        static final int TRANSACTION_onMoveGestureEnabled = 3;
        static final int TRANSACTION_onReactLoadResult = 2;
        static final int TRANSACTION_onSurfaceTouchDownEvent = 4;

        private static class Proxy implements IAIWidgetCallBack {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAIWidgetCallBack.DESCRIPTOR;
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
            public Bundle getLauncherActivityOptions(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetCallBack.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
            public void onMoveGestureEnabled(int i10, boolean z9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetCallBack.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z9 ? 1 : 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
            public void onReactLoadResult(int i10, String str, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetCallBack.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
            public void onSurfaceTouchDownEvent(int i10, long j9) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIWidgetCallBack.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeLong(j9);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAIWidgetCallBack.DESCRIPTOR);
        }

        public static IAIWidgetCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAIWidgetCallBack.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAIWidgetCallBack)) ? new Proxy(iBinder) : (IAIWidgetCallBack) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IAIWidgetCallBack.DESCRIPTOR);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(IAIWidgetCallBack.DESCRIPTOR);
                return true;
            }
            if (i10 == 2) {
                onReactLoadResult(parcel.readInt(), parcel.readString(), parcel.readInt());
            } else if (i10 == 3) {
                onMoveGestureEnabled(parcel.readInt(), parcel.readInt() != 0);
            } else if (i10 == 4) {
                onSurfaceTouchDownEvent(parcel.readInt(), parcel.readLong());
            } else {
                if (i10 != 5) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                Bundle launcherActivityOptions = getLauncherActivityOptions(parcel.readInt());
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, launcherActivityOptions, 1);
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

    Bundle getLauncherActivityOptions(int i10);

    void onMoveGestureEnabled(int i10, boolean z9);

    void onReactLoadResult(int i10, String str, int i11);

    void onSurfaceTouchDownEvent(int i10, long j9);
}
