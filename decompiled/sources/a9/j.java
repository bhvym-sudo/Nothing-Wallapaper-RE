package a9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f9987b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a socketAdapterFactory) {
        n.h(socketAdapterFactory, "socketAdapterFactory");
        this.f9986a = socketAdapterFactory;
    }

    private final synchronized k e(SSLSocket sSLSocket) {
        try {
            if (this.f9987b == null && this.f9986a.a(sSLSocket)) {
                this.f9987b = this.f9986a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9987b;
    }

    @Override // a9.k
    public boolean a(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        return this.f9986a.a(sslSocket);
    }

    @Override // a9.k
    public boolean b() {
        return true;
    }

    @Override // a9.k
    public String c(SSLSocket sslSocket) {
        n.h(sslSocket, "sslSocket");
        k kVarE = e(sslSocket);
        if (kVarE != null) {
            return kVarE.c(sslSocket);
        }
        return null;
    }

    @Override // a9.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        n.h(sslSocket, "sslSocket");
        n.h(protocols, "protocols");
        k kVarE = e(sslSocket);
        if (kVarE != null) {
            kVarE.d(sslSocket, str, protocols);
        }
    }
}
