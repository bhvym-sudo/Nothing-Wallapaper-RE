package F8;

import K8.AbstractC0913f;
import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K {
    public static final void a(p129m8.i iVar, Throwable th) {
        if (th instanceof X) {
            th = ((X) th).getCause();
        }
        try {
            J j9 = (J) iVar.b(J.f1817d);
            if (j9 != null) {
                j9.b0(iVar, th);
            } else {
                AbstractC0913f.a(iVar, th);
            }
        } catch (Throwable th2) {
            AbstractC0913f.a(iVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC1388c.a(runtimeException, th);
        return runtimeException;
    }
}
