package Z8;

import P8.A;
import P8.z;
import e9.C1350e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile h f9547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f9548c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final h d() {
            a9.c.f9966a.b();
            h hVarA = Z8.a.f9516e.a();
            if (hVarA != null) {
                return hVarA;
            }
            h hVarA2 = b.f9519f.a();
            n.e(hVarA2);
            return hVarA2;
        }

        private final h e() {
            g gVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.f9528e.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.f9525e.a()) != null) {
                return cVarA;
            }
            if (k() && (gVarA = g.f9543e.a()) != null) {
                return gVarA;
            }
            f fVarA = f.f9541d.a();
            if (fVarA != null) {
                return fVarA;
            }
            h hVarA = e.f9532i.a();
            return hVarA != null ? hVarA : new h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return n.d("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return n.d("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return n.d("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List b(List protocols) {
            n.h(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((A) obj) != A.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((A) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            n.h(protocols, "protocols");
            C1350e c1350e = new C1350e();
            for (String str : b(protocols)) {
                c1350e.F(str.length());
                c1350e.d0(str);
            }
            return c1350e.t0();
        }

        public final h g() {
            return h.f9547b;
        }

        public final boolean h() {
            return n.d("Dalvik", System.getProperty("java.vm.name"));
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f9546a = aVar;
        f9547b = aVar.f();
        f9548c = Logger.getLogger(z.class.getName());
    }

    public static /* synthetic */ void k(h hVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        hVar.j(str, i10, th);
    }

    public void b(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
    }

    public c9.c c(X509TrustManager trustManager) {
        n.h(trustManager, "trustManager");
        return new c9.a(d(trustManager));
    }

    public c9.e d(X509TrustManager trustManager) {
        n.h(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        n.g(acceptedIssuers, "trustManager.acceptedIssuers");
        return new c9.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        n.h(socket, "socket");
        n.h(address, "address");
        socket.connect(address, i10);
    }

    public String g(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return null;
    }

    public Object h(String closer) {
        n.h(closer, "closer");
        if (f9548c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean i(String hostname) {
        n.h(hostname, "hostname");
        return true;
    }

    public void j(String message, int i10, Throwable th) {
        n.h(message, "message");
        f9548c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void l(String message, Object obj) {
        n.h(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        j(message, 5, (Throwable) obj);
    }

    public SSLContext m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        n.g(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory n(X509TrustManager trustManager) {
        n.h(trustManager, "trustManager");
        try {
            SSLContext sSLContextM = m();
            sSLContextM.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextM.getSocketFactory();
            n.g(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        n.g(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
