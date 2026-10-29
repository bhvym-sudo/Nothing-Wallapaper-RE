package p055f4;

import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new i();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f20823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f20824r;

    public b(boolean z9, int i10) {
        this.f20823q = z9;
        this.f20824r = i10;
    }

    public boolean a() {
        return this.f20823q;
    }

    public int b() {
        return this.f20824r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.c(parcel, 1, a());
        c.h(parcel, 2, b());
        c.b(parcel, iA);
    }
}
