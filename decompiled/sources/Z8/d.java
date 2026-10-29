package Z8;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9529f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f9530d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i10) {
                return version.major() > i10;
            }
            if (version.minor() != i11) {
                return version.minor() > i11;
            }
            return version.patch() >= i12;
        }

        public final d b() {
            AbstractC1457h abstractC1457h = null;
            if (c()) {
                return new d(abstractC1457h);
            }
            return null;
        }

        public final boolean c() {
            return d.f9529f;
        }

        private a() {
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9531a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        f9528e = aVar;
        boolean z9 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z9 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f9529f = z9;
    }

    public /* synthetic */ d(AbstractC1457h abstractC1457h) {
        this();
    }

    @Override // Z8.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.e(sslSocket, str, protocols);
        } else {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) h.f9546a.b(protocols).toArray(new String[0]));
        }
    }

    @Override // Z8.h
    public String g(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.g(sslSocket);
    }

    @Override // Z8.h
    public SSLContext m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f9530d);
        n.g(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Z8.h
    public SSLSocketFactory n(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        n.h(trustManager, "trustManager");
        SSLContext sSLContextM = m();
        sSLContextM.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextM.getSocketFactory();
        n.g(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // Z8.h
    public X509TrustManager o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        n.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                n.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f9531a);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        n.g(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    private d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        n.g(providerNewProvider, "newProvider()");
        this.f9530d = providerNewProvider;
    }
}
