package p205u4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f27983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Intent f27985s;

    b(int i10, int i11, Intent intent) {
        this.f27983q = i10;
        this.f27984r = i11;
        this.f27985s = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f27983q);
        c.h(parcel, 2, this.f27984r);
        c.l(parcel, 3, this.f27985s, i10, false);
        c.b(parcel, iA);
    }
}
