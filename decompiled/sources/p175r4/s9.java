package p175r4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class s9 extends a {
    public static final Parcelable.Creator<s9> CREATOR = new u9();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f27352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f27353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f27354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f27355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f27356u;

    public s9(int i10, int i11, int i12, int i13, long j9) {
        this.f27352q = i10;
        this.f27353r = i11;
        this.f27354s = i12;
        this.f27355t = i13;
        this.f27356u = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f27352q;
        int iA = c.a(parcel);
        c.h(parcel, 1, i11);
        c.h(parcel, 2, this.f27353r);
        c.h(parcel, 3, this.f27354s);
        c.h(parcel, 4, this.f27355t);
        c.j(parcel, 5, this.f27356u);
        c.b(parcel, iA);
    }
}
