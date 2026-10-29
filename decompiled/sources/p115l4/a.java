package p115l4;

import android.os.IBinder;
import android.os.IInterface;
import p145o4.b;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: l4.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0582a extends b implements a {
        public AbstractBinderC0582a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new c(iBinder);
        }
    }
}
