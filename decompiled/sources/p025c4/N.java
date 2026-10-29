package p025c4;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class N implements InterfaceC1198l {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final IBinder f15073q;

    N(IBinder iBinder) {
        this.f15073q = iBinder;
    }

    @Override // p025c4.InterfaceC1198l
    public final void Q(InterfaceC1197k interfaceC1197k, C1192f c1192f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC1197k != null ? interfaceC1197k.asBinder() : null);
            if (c1192f != null) {
                parcelObtain.writeInt(1);
                b0.a(c1192f, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15073q.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15073q;
    }
}
