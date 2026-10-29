package p205u4;

import android.os.Parcel;
import android.os.Parcelable;
import p025c4.H;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f27988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final H f27989r;

    j(int i10, H h10) {
        this.f27988q = i10;
        this.f27989r = h10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f27988q);
        c.l(parcel, 2, this.f27989r, i10, false);
        c.b(parcel, iA);
    }
}
