package P8;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: P8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0935a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f6144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketFactory f6145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f6146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f6147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0941g f6148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0936b f6149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Proxy f6150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ProxySelector f6151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v f6152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f6153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f6154k;

    public C0935a(String uriHost, int i10, q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0941g c0941g, InterfaceC0936b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.n.h(uriHost, "uriHost");
        kotlin.jvm.internal.n.h(dns, "dns");
        kotlin.jvm.internal.n.h(socketFactory, "socketFactory");
        kotlin.jvm.internal.n.h(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.n.h(protocols, "protocols");
        kotlin.jvm.internal.n.h(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.n.h(proxySelector, "proxySelector");
        this.f6144a = dns;
        this.f6145b = socketFactory;
        this.f6146c = sSLSocketFactory;
        this.f6147d = hostnameVerifier;
        this.f6148e = c0941g;
        this.f6149f = proxyAuthenticator;
        this.f6150g = proxy;
        this.f6151h = proxySelector;
        this.f6152i = new v.a().q(sSLSocketFactory != null ? "https" : "http").g(uriHost).m(i10).c();
        this.f6153j = Q8.d.S(protocols);
        this.f6154k = Q8.d.S(connectionSpecs);
    }

    public final C0941g a() {
        return this.f6148e;
    }

    public final List b() {
        return this.f6154k;
    }

    public final q c() {
        return this.f6144a;
    }

    public final boolean d(C0935a that) {
        kotlin.jvm.internal.n.h(that, "that");
        return kotlin.jvm.internal.n.d(this.f6144a, that.f6144a) && kotlin.jvm.internal.n.d(this.f6149f, that.f6149f) && kotlin.jvm.internal.n.d(this.f6153j, that.f6153j) && kotlin.jvm.internal.n.d(this.f6154k, that.f6154k) && kotlin.jvm.internal.n.d(this.f6151h, that.f6151h) && kotlin.jvm.internal.n.d(this.f6150g, that.f6150g) && kotlin.jvm.internal.n.d(this.f6146c, that.f6146c) && kotlin.jvm.internal.n.d(this.f6147d, that.f6147d) && kotlin.jvm.internal.n.d(this.f6148e, that.f6148e) && this.f6152i.n() == that.f6152i.n();
    }

    public final HostnameVerifier e() {
        return this.f6147d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0935a)) {
            return false;
        }
        C0935a c0935a = (C0935a) obj;
        return kotlin.jvm.internal.n.d(this.f6152i, c0935a.f6152i) && d(c0935a);
    }

    public final List f() {
        return this.f6153j;
    }

    public final Proxy g() {
        return this.f6150g;
    }

    public final InterfaceC0936b h() {
        return this.f6149f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f6152i.hashCode()) * 31) + this.f6144a.hashCode()) * 31) + this.f6149f.hashCode()) * 31) + this.f6153j.hashCode()) * 31) + this.f6154k.hashCode()) * 31) + this.f6151h.hashCode()) * 31) + Objects.hashCode(this.f6150g)) * 31) + Objects.hashCode(this.f6146c)) * 31) + Objects.hashCode(this.f6147d)) * 31) + Objects.hashCode(this.f6148e);
    }

    public final ProxySelector i() {
        return this.f6151h;
    }

    public final SocketFactory j() {
        return this.f6145b;
    }

    public final SSLSocketFactory k() {
        return this.f6146c;
    }

    public final v l() {
        return this.f6152i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f6152i.i());
        sb2.append(':');
        sb2.append(this.f6152i.n());
        sb2.append(", ");
        if (this.f6150g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f6150g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f6151h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
