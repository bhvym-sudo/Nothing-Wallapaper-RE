package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new Q();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f15216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f15217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f15218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f15219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f15220u;

    public r(int i10, boolean z9, boolean z10, int i11, int i12) {
        this.f15216q = i10;
        this.f15217r = z9;
        this.f15218s = z10;
        this.f15219t = i11;
        this.f15220u = i12;
    }

    public int a() {
        return this.f15219t;
    }

    public int b() {
        return this.f15220u;
    }

    public boolean c() {
        return this.f15217r;
    }

    public boolean d() {
        return this.f15218s;
    }

    public int e() {
        return this.f15216q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, e());
        c.c(parcel, 2, c());
        c.c(parcel, 3, d());
        c.h(parcel, 4, a());
        c.h(parcel, 5, b());
        c.b(parcel, iA);
    }
}
