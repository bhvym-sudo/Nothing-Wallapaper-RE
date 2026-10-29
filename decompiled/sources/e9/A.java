package e9;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class A extends C1348c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f20234o;

    public A(Socket socket) {
        kotlin.jvm.internal.n.h(socket, "socket");
        this.f20234o = socket;
    }

    @Override // e9.C1348c
    protected void B() {
        try {
            this.f20234o.close();
        } catch (AssertionError e10) {
            if (!o.e(e10)) {
                throw e10;
            }
            p.f20286a.log(Level.WARNING, "Failed to close timed out socket " + this.f20234o, (Throwable) e10);
        } catch (Exception e11) {
            p.f20286a.log(Level.WARNING, "Failed to close timed out socket " + this.f20234o, (Throwable) e11);
        }
    }

    @Override // e9.C1348c
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
