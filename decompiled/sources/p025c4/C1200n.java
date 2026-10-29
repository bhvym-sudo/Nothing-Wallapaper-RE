package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: renamed from: c4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1200n extends a {
    public static final Parcelable.Creator<C1200n> CREATOR = new G();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f15202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f15203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f15204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f15205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f15206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f15207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f15208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f15209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f15210y;

    public C1200n(int i10, int i11, int i12, long j9, long j10, String str, String str2, int i13) {
        this(i10, i11, i12, j9, j10, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f15202q);
        c.h(parcel, 2, this.f15203r);
        c.h(parcel, 3, this.f15204s);
        c.j(parcel, 4, this.f15205t);
        c.j(parcel, 5, this.f15206u);
        c.m(parcel, 6, this.f15207v, false);
        c.m(parcel, 7, this.f15208w, false);
        c.h(parcel, 8, this.f15209x);
        c.h(parcel, 9, this.f15210y);
        c.b(parcel, iA);
    }

    public C1200n(int i10, int i11, int i12, long j9, long j10, String str, String str2, int i13, int i14) {
        this.f15202q = i10;
        this.f15203r = i11;
        this.f15204s = i12;
        this.f15205t = j9;
        this.f15206u = j10;
        this.f15207v = str;
        this.f15208w = str2;
        this.f15209x = i13;
        this.f15210y = i14;
    }
}
