package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p145o4.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final p115l4.a X(p115l4.a aVar, String str, int i10, p115l4.a aVar2) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        p145o4.c.d(parcelC, aVar2);
        Parcel parcelA = a(3, parcelC);
        p115l4.a aVarC = p115l4.a.AbstractBinderC0582a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final p115l4.a e(p115l4.a aVar, String str, int i10, p115l4.a aVar2) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        p145o4.c.d(parcelC, aVar2);
        Parcel parcelA = a(2, parcelC);
        p115l4.a aVarC = p115l4.a.AbstractBinderC0582a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }
}
