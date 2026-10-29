package H8;

import F8.AbstractC0825m0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class n {
    public static final void a(v vVar, Throwable th) {
        CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC0825m0.a("Channel was consumed, consumer had failed", th);
            }
        }
        vVar.f(cancellationExceptionA);
    }
}
