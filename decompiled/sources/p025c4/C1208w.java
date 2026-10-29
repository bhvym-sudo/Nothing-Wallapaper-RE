package p025c4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p035d4.b;

/* JADX INFO: renamed from: c4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1208w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        int iO = 0;
        ArrayList arrayListI = null;
        while (parcel.dataPosition() < iT) {
            int iM = b.m(parcel);
            int iK = b.k(iM);
            if (iK == 1) {
                iO = b.o(parcel, iM);
            } else if (iK != 2) {
                b.s(parcel, iM);
            } else {
                arrayListI = b.i(parcel, iM, C1200n.CREATOR);
            }
        }
        b.j(parcel, iT);
        return new C1204s(iO, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1204s[i10];
    }
}
