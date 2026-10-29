package p045e4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p025c4.C1204s;
import p135n4.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p135n4.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void X(C1204s c1204s) {
        Parcel parcelA = a();
        c.c(parcelA, c1204s);
        e(1, parcelA);
    }
}
