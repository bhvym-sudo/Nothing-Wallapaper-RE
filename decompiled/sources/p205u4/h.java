package p205u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f27986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f27987r;

    public h(List list, String str) {
        this.f27986q = list;
        this.f27987r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f27986q, false);
        c.m(parcel, 2, this.f27987r, false);
        c.b(parcel, iA);
    }
}
