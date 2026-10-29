package Z8;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9544f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f9545d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final g a() {
            AbstractC1457h abstractC1457h = null;
            if (b()) {
                return new g(abstractC1457h);
            }
            return null;
        }

        public final boolean b() {
            return g.f9544f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f9543e = aVar;
        boolean z9 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z9 = true;
        } catch (ClassNotFoundException unused) {
        }
        f9544f = z9;
    }

    public /* synthetic */ g(AbstractC1457h abstractC1457h) {
        this();
    }

    @Override // Z8.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        super.e(sslSocket, str, protocols);
    }

    @Override // Z8.h
    public String g(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return super.g(sslSocket);
    }

    @Override // Z8.h
    public SSLContext m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f9545d);
        n.g(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // Z8.h
    public X509TrustManager o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f9545d);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        n.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                n.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        n.g(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    private g() {
        this.f9545d = new OpenJSSE();
    }
}
