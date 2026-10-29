package Z8;

import a9.i;
import a9.j;
import a9.k;
import a9.l;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f9519f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f9520g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a9.h f9522e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f9520g;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Z8.b$b, reason: collision with other inner class name */
    public static final class C0349b implements c9.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f9523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f9524b;

        public C0349b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            n.h(trustManager, "trustManager");
            n.h(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f9523a = trustManager;
            this.f9524b = findByIssuerAndSignatureMethod;
        }

        @Override // c9.e
        public X509Certificate a(X509Certificate cert) {
            n.h(cert, "cert");
            try {
                Object objInvoke = this.f9524b.invoke(this.f9523a, cert);
                n.f(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0349b)) {
                return false;
            }
            C0349b c0349b = (C0349b) obj;
            return n.d(this.f9523a, c0349b.f9523a) && n.d(this.f9524b, c0349b.f9524b);
        }

        public int hashCode() {
            return (this.f9523a.hashCode() * 31) + this.f9524b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f9523a + ", findByIssuerAndSignatureMethod=" + this.f9524b + ')';
        }
    }

    static {
        h.f9546a.h();
        f9520g = false;
    }

    public b() {
        List listO = AbstractC1444s.o(l.a.b(l.f9988j, null, 1, null), new j(a9.f.f9970f.d()), new j(i.f9984a.a()), new j(a9.g.f9978a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f9521d = arrayList;
        this.f9522e = a9.h.f9980d.a();
    }

    @Override // Z8.h
    public c9.c c(X509TrustManager trustManager) {
        n.h(trustManager, "trustManager");
        a9.b bVarA = a9.b.f9963d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // Z8.h
    public c9.e d(X509TrustManager trustManager) {
        n.h(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            n.g(method, "method");
            return new C0349b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // Z8.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        Iterator it = this.f9521d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            kVar.d(sslSocket, str, protocols);
        }
    }

    @Override // Z8.h
    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        n.h(socket, "socket");
        n.h(address, "address");
        socket.connect(address, i10);
    }

    @Override // Z8.h
    public String g(SSLSocket sslSocket) {
        Object next;
        n.h(sslSocket, "sslSocket");
        Iterator it = this.f9521d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.c(sslSocket);
        }
        return null;
    }

    @Override // Z8.h
    public Object h(String closer) {
        n.h(closer, "closer");
        return this.f9522e.a(closer);
    }

    @Override // Z8.h
    public boolean i(String hostname) {
        n.h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // Z8.h
    public void l(String message, Object obj) {
        n.h(message, "message");
        if (this.f9522e.b(obj)) {
            return;
        }
        h.k(this, message, 5, null, 4, null);
    }
}
