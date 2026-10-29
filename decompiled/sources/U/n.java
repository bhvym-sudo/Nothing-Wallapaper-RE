package U;

import W.B;
import W.K;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final K a(K k9) {
        B bO0 = k9.o0();
        while (true) {
            B bY = bO0.Y();
            if ((bY != null ? bY.M() : null) == null) {
                K kJ1 = bO0.W().j1();
                kotlin.jvm.internal.n.e(kJ1);
                return kJ1;
            }
            B bY2 = bO0.Y();
            B bM = bY2 != null ? bY2.M() : null;
            kotlin.jvm.internal.n.e(bM);
            if (bM.x0()) {
                bO0 = bO0.Y();
                kotlin.jvm.internal.n.e(bO0);
            } else {
                B bY3 = bO0.Y();
                kotlin.jvm.internal.n.e(bY3);
                bO0 = bY3.M();
                kotlin.jvm.internal.n.e(bO0);
            }
        }
    }
}
