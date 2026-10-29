package P8;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0935a f6133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f6134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f6135c;

    public F(C0935a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.n.h(address, "address");
        kotlin.jvm.internal.n.h(proxy, "proxy");
        kotlin.jvm.internal.n.h(socketAddress, "socketAddress");
        this.f6133a = address;
        this.f6134b = proxy;
        this.f6135c = socketAddress;
    }

    public final C0935a a() {
        return this.f6133a;
    }

    public final Proxy b() {
        return this.f6134b;
    }

    public final boolean c() {
        return this.f6133a.k() != null && this.f6134b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f6135c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return kotlin.jvm.internal.n.d(f10.f6133a, this.f6133a) && kotlin.jvm.internal.n.d(f10.f6134b, this.f6134b) && kotlin.jvm.internal.n.d(f10.f6135c, this.f6135c);
    }

    public int hashCode() {
        return ((((527 + this.f6133a.hashCode()) * 31) + this.f6134b.hashCode()) * 31) + this.f6135c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f6135c + '}';
    }
}
