package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p145o4.a implements IInterface {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int X(p115l4.a aVar, String str, boolean z9) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        p145o4.c.c(parcelC, z9);
        Parcel parcelA = a(3, parcelC);
        int i10 = parcelA.readInt();
        parcelA.recycle();
        return i10;
    }

    public final int Y(p115l4.a aVar, String str, boolean z9) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        p145o4.c.c(parcelC, z9);
        Parcel parcelA = a(5, parcelC);
        int i10 = parcelA.readInt();
        parcelA.recycle();
        return i10;
    }

    public final p115l4.a Z(p115l4.a aVar, String str, int i10) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        Parcel parcelA = a(2, parcelC);
        p115l4.a aVarC = p115l4.a.AbstractBinderC0582a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final p115l4.a a0(p115l4.a aVar, String str, int i10, p115l4.a aVar2) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        p145o4.c.d(parcelC, aVar2);
        Parcel parcelA = a(8, parcelC);
        p115l4.a aVarC = p115l4.a.AbstractBinderC0582a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final p115l4.a b0(p115l4.a aVar, String str, int i10) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        Parcel parcelA = a(4, parcelC);
        p115l4.a aVarC = p115l4.a.AbstractBinderC0582a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final p115l4.a c0(p115l4.a aVar, String str, boolean z9, long j9) {
        Parcel parcelC = c();
        p145o4.c.d(parcelC, aVar);
        parcelC.writeString(str);
        p145o4.c.c(parcelC, z9);
        parcelC.writeLong(j9);
        Parcel parcelA = a(7, parcelC);
        p115l4.a aVarC = p115l4.a.AbstractBinderC0582a.c(parcelA.readStrongBinder());
        parcelA.recycle();
        return aVarC;
    }

    public final int e() {
        Parcel parcelA = a(6, c());
        int i10 = parcelA.readInt();
        parcelA.recycle();
        return i10;
    }
}
