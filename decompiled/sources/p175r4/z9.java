package p175r4;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class z9 extends a {
    public static final Parcelable.Creator<z9> CREATOR = new A9();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float[] f27519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Bitmap f27520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f27521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f27522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f27523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f27524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f27525w;

    public z9(float[] fArr, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        this.f27519q = fArr;
        this.f27520r = bitmap;
        this.f27521s = i10;
        this.f27522t = i11;
        this.f27523u = i12;
        this.f27524v = i13;
        this.f27525w = i14;
    }

    public final int a() {
        return this.f27522t;
    }

    public final int b() {
        return this.f27523u;
    }

    public final int c() {
        return this.f27524v;
    }

    public final int d() {
        return this.f27521s;
    }

    public final Bitmap e() {
        return this.f27520r;
    }

    public final float[] f() {
        return this.f27519q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        float[] fArr = this.f27519q;
        int iA = c.a(parcel);
        c.e(parcel, 1, fArr, false);
        c.l(parcel, 2, this.f27520r, i10, false);
        c.h(parcel, 3, this.f27521s);
        c.h(parcel, 4, this.f27522t);
        c.h(parcel, 5, this.f27523u);
        c.h(parcel, 6, this.f27524v);
        c.h(parcel, 7, this.f27525w);
        c.b(parcel, iA);
    }
}
