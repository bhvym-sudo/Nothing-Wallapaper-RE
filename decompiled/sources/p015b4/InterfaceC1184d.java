package p015b4;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p135n4.b;
import p135n4.c;

/* JADX INFO: renamed from: b4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1184d extends IInterface {

    /* JADX INFO: renamed from: b4.d$a */
    public static abstract class a extends b implements InterfaceC1184d {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // p135n4.b
        protected final boolean X(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) c.a(parcel, Status.CREATOR);
            c.b(parcel);
            r(status);
            return true;
        }
    }

    void r(Status status);
}
