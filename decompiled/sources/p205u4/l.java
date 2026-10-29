package p205u4;

import android.os.Parcel;
import android.os.Parcelable;
import p025c4.J;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f27990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Z3.a f27991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final J f27992s;

    l(int i10, Z3.a aVar, J j9) {
        this.f27990q = i10;
        this.f27991r = aVar;
        this.f27992s = j9;
    }

    public final Z3.a a() {
        return this.f27991r;
    }

    public final J b() {
        return this.f27992s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f27990q);
        c.l(parcel, 2, this.f27991r, i10, false);
        c.l(parcel, 3, this.f27992s, i10, false);
        c.b(parcel, iA);
    }
}
