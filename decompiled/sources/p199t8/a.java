package p199t8;

import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                AbstractC1388c.a(th, th2);
            }
        }
    }
}
