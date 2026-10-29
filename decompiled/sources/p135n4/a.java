package p135n4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final IBinder f23261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f23262r;

    protected a(IBinder iBinder, String str) {
        this.f23261q = iBinder;
        this.f23262r = str;
    }

    protected final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f23262r);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23261q;
    }

    protected final void c(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f23261q.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void e(int i10, Parcel parcel) {
        try {
            this.f23261q.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
