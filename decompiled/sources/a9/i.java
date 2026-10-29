package a9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9984a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j.a f9985b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // a9.j.a
        public boolean a(SSLSocket sslSocket) {
            n.h(sslSocket, "sslSocket");
            return Z8.d.f9528e.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // a9.j.a
        public k b(SSLSocket sslSocket) {
            n.h(sslSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final j.a a() {
            return i.f9985b;
        }

        private b() {
        }
    }

    @Override // a9.k
    public boolean a(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // a9.k
    public boolean b() {
        return Z8.d.f9528e.c();
    }

    @Override // a9.k
    public String c(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // a9.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) Z8.h.f9546a.b(protocols).toArray(new String[0]));
        }
    }
}
