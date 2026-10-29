package p025c4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class J extends a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f15065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final IBinder f15066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Z3.a f15067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f15068t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f15069u;

    J(int i10, IBinder iBinder, Z3.a aVar, boolean z9, boolean z10) {
        this.f15065q = i10;
        this.f15066r = iBinder;
        this.f15067s = aVar;
        this.f15068t = z9;
        this.f15069u = z10;
    }

    public final Z3.a a() {
        return this.f15067s;
    }

    public final InterfaceC1196j b() {
        IBinder iBinder = this.f15066r;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1196j.a.c(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j9 = (J) obj;
        return this.f15067s.equals(j9.f15067s) && AbstractC1201o.a(b(), j9.b());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f15065q);
        c.g(parcel, 2, this.f15066r, false);
        c.l(parcel, 3, this.f15067s, i10, false);
        c.c(parcel, 4, this.f15068t);
        c.c(parcel, 5, this.f15069u);
        c.b(parcel, iA);
    }
}
