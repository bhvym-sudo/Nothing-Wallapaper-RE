package e9;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    public static final z a(File file) {
        return p.b(file);
    }

    public static final z b() {
        return q.a();
    }

    public static final f c(z zVar) {
        return q.b(zVar);
    }

    public static final g d(B b10) {
        return q.c(b10);
    }

    public static final boolean e(AssertionError assertionError) {
        return p.c(assertionError);
    }

    public static final z f(File file, boolean z9) {
        return p.d(file, z9);
    }

    public static final z g(OutputStream outputStream) {
        return p.e(outputStream);
    }

    public static final z h(Socket socket) {
        return p.f(socket);
    }

    public static final B j(File file) {
        return p.h(file);
    }

    public static final B k(InputStream inputStream) {
        return p.i(inputStream);
    }

    public static final B l(Socket socket) {
        return p.j(socket);
    }
}
