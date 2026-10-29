package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: renamed from: c4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1191e extends a {
    public static final Parcelable.Creator<C1191e> CREATOR = new a0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r f15153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f15154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f15155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f15156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f15157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int[] f15158v;

    public C1191e(r rVar, boolean z9, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f15153q = rVar;
        this.f15154r = z9;
        this.f15155s = z10;
        this.f15156t = iArr;
        this.f15157u = i10;
        this.f15158v = iArr2;
    }

    public int a() {
        return this.f15157u;
    }

    public int[] b() {
        return this.f15156t;
    }

    public int[] c() {
        return this.f15158v;
    }

    public boolean d() {
        return this.f15154r;
    }

    public boolean e() {
        return this.f15155s;
    }

    public final r f() {
        return this.f15153q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.f15153q, i10, false);
        c.c(parcel, 2, d());
        c.c(parcel, 3, e());
        c.i(parcel, 4, b(), false);
        c.h(parcel, 5, a());
        c.i(parcel, 6, c(), false);
        c.b(parcel, iA);
    }
}
