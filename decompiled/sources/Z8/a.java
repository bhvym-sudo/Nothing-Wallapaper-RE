package Z8;

import a9.i;
import a9.j;
import a9.k;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0348a f9516e = new C0348a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f9517f = h.f9546a.h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9518d;

    /* JADX INFO: renamed from: Z8.a$a, reason: collision with other inner class name */
    public static final class C0348a {
        public /* synthetic */ C0348a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f9517f;
        }

        private C0348a() {
        }
    }

    public a() {
        List listO = AbstractC1444s.o(a9.a.f9962a.a(), new j(a9.f.f9970f.d()), new j(i.f9984a.a()), new j(a9.g.f9978a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f9518d = arrayList;
    }

    @Override // Z8.h
    public c9.c c(X509TrustManager trustManager) {
        n.h(trustManager, "trustManager");
        a9.b bVarA = a9.b.f9963d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // Z8.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        Iterator it = this.f9518d.iterator();
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
    public String g(SSLSocket sslSocket) {
        Object next;
        n.h(sslSocket, "sslSocket");
        Iterator it = this.f9518d.iterator();
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
    public boolean i(String hostname) {
        n.h(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
