package p175r4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p115l4.a;

/* JADX INFO: loaded from: classes.dex */
public final class v9 extends AbstractC1719a implements IInterface {
    v9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
    }

    public final B9 X(a aVar, s9 s9Var) {
        Parcel parcelA = a();
        AbstractC1742c0.b(parcelA, aVar);
        AbstractC1742c0.a(parcelA, s9Var);
        Parcel parcelC = c(3, parcelA);
        B9 b9CreateFromParcel = parcelC.readInt() == 0 ? null : B9.CREATOR.createFromParcel(parcelC);
        parcelC.recycle();
        return b9CreateFromParcel;
    }

    public final void Y() {
        e(1, a());
    }

    public final void Z() {
        e(2, a());
    }
}
