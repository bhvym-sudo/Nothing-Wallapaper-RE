package F2;

import android.os.Trace;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static y f1604a = new y();

    public static Object c(String str, Supplier supplier) {
        v vVarB = f1604a.b(str);
        try {
            Object obj = supplier.get();
            if (vVarB != null) {
                vVarB.close();
            }
            return obj;
        } catch (Throwable th) {
            if (vVarB != null) {
                try {
                    vVarB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public v b(final String str) {
        final int iB = p259z8.c.f30803q.b();
        Trace.beginAsyncSection(str, iB);
        return new v() { // from class: F2.x
            @Override // F2.v, java.lang.AutoCloseable
            public final void close() {
                Trace.endAsyncSection(str, iB);
            }
        };
    }
}
