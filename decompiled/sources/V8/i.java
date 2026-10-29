package V8;

import P8.B;
import P8.v;
import java.net.Proxy;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8250a = new i();

    private i() {
    }

    private final boolean b(B b10, Proxy.Type type) {
        return !b10.f() && type == Proxy.Type.HTTP;
    }

    public final String a(B request, Proxy.Type proxyType) {
        n.h(request, "request");
        n.h(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.g());
        sb.append(' ');
        i iVar = f8250a;
        if (iVar.b(request, proxyType)) {
            sb.append(request.j());
        } else {
            sb.append(iVar.c(request.j()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(v url) {
        n.h(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
