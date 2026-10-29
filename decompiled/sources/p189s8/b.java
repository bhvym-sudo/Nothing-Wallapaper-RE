package p189s8;

import java.io.Closeable;
import java.io.IOException;
import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final void a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1388c.a(th, th2);
            }
        }
    }
}
