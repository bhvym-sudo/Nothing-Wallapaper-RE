package a9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9978a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j.a f9979b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // a9.j.a
        public boolean a(SSLSocket sslSocket) {
            n.h(sslSocket, "sslSocket");
            Z8.c.f9525e.b();
            return false;
        }

        @Override // a9.j.a
        public k b(SSLSocket sslSocket) {
            n.h(sslSocket, "sslSocket");
            return new g();
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final j.a a() {
            return g.f9979b;
        }

        private b() {
        }
    }

    @Override // a9.k
    public boolean a(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return false;
    }

    @Override // a9.k
    public boolean b() {
        return Z8.c.f9525e.b();
    }

    @Override // a9.k
    public String c(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : n.d(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // a9.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) Z8.h.f9546a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
