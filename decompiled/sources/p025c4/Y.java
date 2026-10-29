package p025c4;

import Z3.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends a {
    public static final Parcelable.Creator<Y> CREATOR = new Z();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Bundle f15089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    c[] f15090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f15091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    C1191e f15092t;

    Y(Bundle bundle, c[] cVarArr, int i10, C1191e c1191e) {
        this.f15089q = bundle;
        this.f15090r = cVarArr;
        this.f15091s = i10;
        this.f15092t = c1191e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p035d4.c.a(parcel);
        p035d4.c.d(parcel, 1, this.f15089q, false);
        p035d4.c.o(parcel, 2, this.f15090r, i10, false);
        p035d4.c.h(parcel, 3, this.f15091s);
        p035d4.c.l(parcel, 4, this.f15092t, i10, false);
        p035d4.c.b(parcel, iA);
    }
}
