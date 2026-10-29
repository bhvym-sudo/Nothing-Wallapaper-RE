package p055f4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p035d4.b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            if (b.k(iM) != 1) {
                b.s(parcel, iM);
            } else {
                pendingIntent = (PendingIntent) b.e(parcel, iM, PendingIntent.CREATOR);
            }
        }
        b.j(parcel, iT);
        return new e(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
