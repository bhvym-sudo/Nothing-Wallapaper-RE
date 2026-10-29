package M3;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    public static abstract class a {
        public abstract m a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(K3.d dVar);
    }

    public static a a() {
        return new c.b().d(K3.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract K3.d d();

    public m e(K3.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
