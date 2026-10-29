package p175r4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class x9 extends B implements y9 {
    public static y9 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
        return iInterfaceQueryLocalInterface instanceof y9 ? (y9) iInterfaceQueryLocalInterface : new w9(iBinder);
    }
}
