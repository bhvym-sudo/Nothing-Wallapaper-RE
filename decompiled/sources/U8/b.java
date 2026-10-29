package U8;

import P8.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7992d;

    public b(List connectionSpecs) {
        n.h(connectionSpecs, "connectionSpecs");
        this.f7989a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f7989a.size();
        for (int i10 = this.f7990b; i10 < size; i10++) {
            if (((l) this.f7989a.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException {
        l lVar;
        n.h(sslSocket, "sslSocket");
        int i10 = this.f7990b;
        int size = this.f7989a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f7989a.get(i10);
            if (lVar.e(sslSocket)) {
                this.f7990b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f7991c = c(sslSocket);
            lVar.c(sslSocket, this.f7992d);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f7992d);
        sb.append(", modes=");
        sb.append(this.f7989a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        n.e(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        n.g(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException e10) {
        n.h(e10, "e");
        this.f7992d = true;
        if (!this.f7991c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
