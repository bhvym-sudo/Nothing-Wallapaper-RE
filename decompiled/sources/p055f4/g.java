package p055f4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new l();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f20834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f20835r;

    public g(int i10) {
        this(i10, false);
    }

    public boolean a() {
        return this.f20834q == 0;
    }

    public int b() {
        return this.f20834q;
    }

    public final boolean c() {
        return this.f20835r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, b());
        c.c(parcel, 2, this.f20835r);
        c.b(parcel, iA);
    }

    public g(int i10, boolean z9) {
        this.f20834q = i10;
        this.f20835r = z9;
    }
}
