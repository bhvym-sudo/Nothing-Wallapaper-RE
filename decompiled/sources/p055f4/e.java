package p055f4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PendingIntent f20825q;

    public e(PendingIntent pendingIntent) {
        this.f20825q = pendingIntent;
    }

    public PendingIntent a() {
        return this.f20825q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.l(parcel, 1, a(), i10, false);
        c.b(parcel, iA);
    }
}
