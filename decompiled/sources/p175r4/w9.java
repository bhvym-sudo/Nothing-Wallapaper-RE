package p175r4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p115l4.a;

/* JADX INFO: loaded from: classes.dex */
public final class w9 extends AbstractC1719a implements y9 {
    w9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
    }

    @Override // p175r4.y9
    public final v9 B(a aVar, D9 d10) {
        v9 v9Var;
        Parcel parcelA = a();
        AbstractC1742c0.b(parcelA, aVar);
        AbstractC1742c0.a(parcelA, d10);
        Parcel parcelC = c(1, parcelA);
        IBinder strongBinder = parcelC.readStrongBinder();
        if (strongBinder == null) {
            v9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            v9Var = iInterfaceQueryLocalInterface instanceof v9 ? (v9) iInterfaceQueryLocalInterface : new v9(strongBinder);
        }
        parcelC.recycle();
        return v9Var;
    }
}
