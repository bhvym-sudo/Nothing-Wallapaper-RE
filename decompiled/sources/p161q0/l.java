package p161q0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f23871a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f23872b = new Object();

    static Bundle a(j.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.i() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(p pVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(p[] pVarArr) {
        if (pVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[pVarArr.length];
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            p pVar = pVarArr[i10];
            bundleArr[i10] = b(null);
        }
        return bundleArr;
    }
}
