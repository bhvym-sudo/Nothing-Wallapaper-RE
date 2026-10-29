package p205u4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p135n4.a;
import p135n4.c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void X(j jVar, f fVar) {
        Parcel parcelA = a();
        c.c(parcelA, jVar);
        c.d(parcelA, fVar);
        c(12, parcelA);
    }
}
