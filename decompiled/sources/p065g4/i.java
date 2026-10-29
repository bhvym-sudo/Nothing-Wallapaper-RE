package p065g4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p015b4.InterfaceC1184d;
import p135n4.a;
import p135n4.c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a implements IInterface {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void X(h hVar, a aVar) {
        Parcel parcelA = a();
        c.d(parcelA, hVar);
        c.c(parcelA, aVar);
        c(1, parcelA);
    }

    public final void Y(h hVar, a aVar, k kVar) {
        Parcel parcelA = a();
        c.d(parcelA, hVar);
        c.c(parcelA, aVar);
        c.d(parcelA, kVar);
        c(2, parcelA);
    }

    public final void Z(InterfaceC1184d interfaceC1184d, k kVar) {
        Parcel parcelA = a();
        c.d(parcelA, interfaceC1184d);
        c.d(parcelA, kVar);
        c(6, parcelA);
    }
}
