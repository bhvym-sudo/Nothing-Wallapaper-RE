package p175r4;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class B9 extends a {
    public static final Parcelable.Creator<B9> CREATOR = new C9();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f25836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float[] f25837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Bitmap f25838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f25839t;

    public B9(List list, float[] fArr, Bitmap bitmap, List list2) {
        this.f25836q = list;
        this.f25837r = fArr;
        this.f25838s = bitmap;
        this.f25839t = list2;
    }

    public final Bitmap a() {
        return this.f25838s;
    }

    public final List b() {
        return this.f25839t;
    }

    public final List c() {
        return this.f25836q;
    }

    public final float[] d() {
        return this.f25837r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f25836q;
        int iA = c.a(parcel);
        c.p(parcel, 1, list, false);
        c.e(parcel, 2, this.f25837r, false);
        c.l(parcel, 3, this.f25838s, i10, false);
        c.f(parcel, 4, this.f25839t, false);
        c.b(parcel, iA);
    }
}
