package p065g4;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p055f4.e;
import p135n4.b;
import p135n4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends b implements h {
    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // p135n4.b
    protected final boolean X(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) c.a(parcel, Status.CREATOR);
            p055f4.b bVar = (p055f4.b) c.a(parcel, p055f4.b.CREATOR);
            c.b(parcel);
            h(status, bVar);
        } else if (i10 == 2) {
            Status status2 = (Status) c.a(parcel, Status.CREATOR);
            p055f4.g gVar = (p055f4.g) c.a(parcel, p055f4.g.CREATOR);
            c.b(parcel);
            v(status2, gVar);
        } else if (i10 == 3) {
            Status status3 = (Status) c.a(parcel, Status.CREATOR);
            e eVar = (e) c.a(parcel, e.CREATOR);
            c.b(parcel);
            D(status3, eVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) c.a(parcel, Status.CREATOR);
            c.b(parcel);
            L(status4);
        }
        return true;
    }
}
