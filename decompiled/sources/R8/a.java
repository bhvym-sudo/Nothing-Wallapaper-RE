package R8;

import E8.i;
import P8.B;
import P8.C0935a;
import P8.D;
import P8.F;
import P8.InterfaceC0936b;
import P8.h;
import P8.o;
import P8.q;
import P8.v;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements InterfaceC0936b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f7116d;

    /* JADX INFO: renamed from: R8.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0259a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7117a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7117a = iArr;
        }
    }

    public a(q defaultDns) {
        n.h(defaultDns, "defaultDns");
        this.f7116d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0259a.f7117a[type.ordinal()]) == 1) {
            return (InetAddress) AbstractC1444s.S(qVar.a(vVar.i()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        n.f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        n.g(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // P8.InterfaceC0936b
    public B a(F f10, D response) {
        Proxy proxy;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C0935a c0935aA;
        n.h(response, "response");
        List<h> listG = response.g();
        B bT0 = response.t0();
        v vVarJ = bT0.j();
        boolean z9 = response.j() == 407;
        if (f10 == null || (proxy = f10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : listG) {
            if (i.B("Basic", hVar.c(), true)) {
                if (f10 == null || (c0935aA = f10.a()) == null || (qVarC = c0935aA.c()) == null) {
                    qVarC = this.f7116d;
                }
                if (z9) {
                    SocketAddress socketAddressAddress = proxy.address();
                    n.f(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    n.g(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, vVarJ, qVarC), inetSocketAddress.getPort(), vVarJ.r(), hVar.b(), hVar.c(), vVarJ.t(), Authenticator.RequestorType.PROXY);
                } else {
                    String strI = vVarJ.i();
                    n.g(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strI, b(proxy, vVarJ, qVarC), vVarJ.n(), vVarJ.r(), hVar.b(), hVar.c(), vVarJ.t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z9 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    n.g(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    n.g(password, "auth.password");
                    return bT0.h().c(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(q qVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? q.f6358b : qVar);
    }
}
