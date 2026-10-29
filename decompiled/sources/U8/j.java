package U8;

import P8.C0935a;
import P8.F;
import P8.InterfaceC0939e;
import P8.r;
import P8.v;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f8077i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0935a f8078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f8079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0939e f8080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f8081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f8082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f8084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8085h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            n.h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                n.g(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            n.g(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f8086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8087b;

        public b(List routes) {
            n.h(routes, "routes");
            this.f8086a = routes;
        }

        public final List a() {
            return this.f8086a;
        }

        public final boolean b() {
            return this.f8087b < this.f8086a.size();
        }

        public final F c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f8086a;
            int i10 = this.f8087b;
            this.f8087b = i10 + 1;
            return (F) list.get(i10);
        }
    }

    public j(C0935a address, h routeDatabase, InterfaceC0939e call, r eventListener) {
        n.h(address, "address");
        n.h(routeDatabase, "routeDatabase");
        n.h(call, "call");
        n.h(eventListener, "eventListener");
        this.f8078a = address;
        this.f8079b = routeDatabase;
        this.f8080c = call;
        this.f8081d = eventListener;
        this.f8082e = AbstractC1444s.l();
        this.f8084g = AbstractC1444s.l();
        this.f8085h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f8083f < this.f8082e.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f8082e;
            int i10 = this.f8083f;
            this.f8083f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f8078a.l().i() + "; exhausted proxy configurations: " + this.f8082e);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strI;
        int iN;
        List listE;
        ArrayList arrayList = new ArrayList();
        this.f8084g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strI = this.f8078a.l().i();
            iN = this.f8078a.l().n();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f8077i;
            n.g(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strI = aVar.a(inetSocketAddress);
            iN = inetSocketAddress.getPort();
        }
        if (1 > iN || iN >= 65536) {
            throw new SocketException("No route to " + strI + ':' + iN + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strI, iN));
            return;
        }
        if (Q8.d.i(strI)) {
            listE = AbstractC1444s.e(InetAddress.getByName(strI));
        } else {
            this.f8081d.m(this.f8080c, strI);
            List listA = this.f8078a.c().a(strI);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f8078a.c() + " returned no addresses for " + strI);
            }
            this.f8081d.l(this.f8080c, strI, listA);
            listE = listA;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iN));
        }
    }

    private final void f(v vVar, Proxy proxy) {
        this.f8081d.o(this.f8080c, vVar);
        List listG = g(proxy, vVar, this);
        this.f8082e = listG;
        this.f8083f = 0;
        this.f8081d.n(this.f8080c, vVar, listG);
    }

    private static final List g(Proxy proxy, v vVar, j jVar) {
        if (proxy != null) {
            return AbstractC1444s.e(proxy);
        }
        URI uriS = vVar.s();
        if (uriS.getHost() == null) {
            return Q8.d.w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = jVar.f8078a.i().select(uriS);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return Q8.d.w(Proxy.NO_PROXY);
        }
        n.g(proxiesOrNull, "proxiesOrNull");
        return Q8.d.S(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.f8085h.isEmpty();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator it = this.f8084g.iterator();
            while (it.hasNext()) {
                F f10 = new F(this.f8078a, proxyD, (InetSocketAddress) it.next());
                if (this.f8079b.c(f10)) {
                    this.f8085h.add(f10);
                } else {
                    arrayList.add(f10);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC1444s.z(arrayList, this.f8085h);
            this.f8085h.clear();
        }
        return new b(arrayList);
    }
}
