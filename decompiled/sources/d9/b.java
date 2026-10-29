package d9;

import B8.h;
import e9.C1350e;
import java.io.EOFException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final boolean a(C1350e c1350e) {
        n.h(c1350e, "<this>");
        try {
            C1350e c1350e2 = new C1350e();
            c1350e.Q(c1350e2, 0L, h.j(c1350e.X0(), 64L));
            for (int i10 = 0; i10 < 16 && !c1350e2.D(); i10++) {
                int iU0 = c1350e2.U0();
                if (Character.isISOControl(iU0) && !Character.isWhitespace(iU0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
