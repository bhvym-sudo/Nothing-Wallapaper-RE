package p065g4;

import android.os.Parcel;
import p055f4.h;
import p135n4.b;
import p135n4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends b implements k {
    public j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // p135n4.b
    protected final boolean X(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        h hVar = (h) c.a(parcel, h.CREATOR);
        c.b(parcel);
        z(hVar);
        return true;
    }
}
