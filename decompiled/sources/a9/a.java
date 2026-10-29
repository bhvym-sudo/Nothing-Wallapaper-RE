package a9;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0357a f9962a = new C0357a(null);

    /* JADX INFO: renamed from: a9.a$a, reason: collision with other inner class name */
    public static final class C0357a {
        public /* synthetic */ C0357a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return Z8.h.f9546a.h();
        }

        private C0357a() {
        }
    }

    @Override // a9.k
    public boolean a(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // a9.k
    public boolean b() {
        return f9962a.b();
    }

    @Override // a9.k
    public String c(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : n.d(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // a9.k
    public void d(SSLSocket sslSocket, String str, List protocols) throws IOException {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) Z8.h.f9546a.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
