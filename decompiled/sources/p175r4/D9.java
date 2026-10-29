package p175r4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class D9 extends a {
    public static final Parcelable.Creator<D9> CREATOR = new E9();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f25881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f25882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f25883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f25884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f25885u;

    public D9(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f25881q = z9;
        this.f25882r = z10;
        this.f25883s = z11;
        this.f25884t = z12;
        this.f25885u = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z9 = this.f25881q;
        int iA = c.a(parcel);
        c.c(parcel, 1, z9);
        c.c(parcel, 2, this.f25882r);
        c.c(parcel, 3, this.f25883s);
        c.c(parcel, 4, this.f25884t);
        c.c(parcel, 5, this.f25885u);
        c.b(parcel, iA);
    }
}
