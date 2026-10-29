package P8;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public class z implements Cloneable, InterfaceC0939e.a {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final b f6427T = new b(null);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final List f6428U = Q8.d.w(A.HTTP_2, A.HTTP_1_1);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final List f6429V = Q8.d.w(l.f6321i, l.f6323k);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final q f6430A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Proxy f6431B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final ProxySelector f6432C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final InterfaceC0936b f6433D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final SocketFactory f6434E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final SSLSocketFactory f6435F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final X509TrustManager f6436G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final List f6437H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final List f6438I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final HostnameVerifier f6439J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final C0941g f6440K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final c9.c f6441L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f6442M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f6443N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f6444O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f6445P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f6446Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final long f6447R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final U8.h f6448S;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p f6449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f6450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f6451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f6452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final r.c f6453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f6454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC0936b f6455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f6456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f6457y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final n f6458z;

    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f6459A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private long f6460B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private U8.h f6461C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f6462a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f6463b = new k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f6464c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f6465d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.c f6466e = Q8.d.g(r.f6361b);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6467f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private InterfaceC0936b f6468g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f6469h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f6470i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n f6471j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private q f6472k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Proxy f6473l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ProxySelector f6474m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private InterfaceC0936b f6475n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private SocketFactory f6476o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private SSLSocketFactory f6477p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private X509TrustManager f6478q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f6479r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f6480s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private HostnameVerifier f6481t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private C0941g f6482u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private c9.c f6483v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f6484w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f6485x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f6486y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f6487z;

        public a() {
            InterfaceC0936b interfaceC0936b = InterfaceC0936b.f6156b;
            this.f6468g = interfaceC0936b;
            this.f6469h = true;
            this.f6470i = true;
            this.f6471j = n.f6347b;
            this.f6472k = q.f6358b;
            this.f6475n = interfaceC0936b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.n.g(socketFactory, "getDefault()");
            this.f6476o = socketFactory;
            b bVar = z.f6427T;
            this.f6479r = bVar.a();
            this.f6480s = bVar.b();
            this.f6481t = c9.d.f15254a;
            this.f6482u = C0941g.f6184d;
            this.f6485x = 10000;
            this.f6486y = 10000;
            this.f6487z = 10000;
            this.f6460B = 1024L;
        }

        public final ProxySelector A() {
            return this.f6474m;
        }

        public final int B() {
            return this.f6486y;
        }

        public final boolean C() {
            return this.f6467f;
        }

        public final U8.h D() {
            return this.f6461C;
        }

        public final SocketFactory E() {
            return this.f6476o;
        }

        public final SSLSocketFactory F() {
            return this.f6477p;
        }

        public final int G() {
            return this.f6487z;
        }

        public final X509TrustManager H() {
            return this.f6478q;
        }

        public final a I(long j9, TimeUnit unit) {
            kotlin.jvm.internal.n.h(unit, "unit");
            this.f6486y = Q8.d.k("timeout", j9, unit);
            return this;
        }

        public final a J(Duration duration) {
            kotlin.jvm.internal.n.h(duration, "duration");
            I(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a a(w interceptor) {
            kotlin.jvm.internal.n.h(interceptor, "interceptor");
            this.f6465d.add(interceptor);
            return this;
        }

        public final z b() {
            return new z(this);
        }

        public final a c(long j9, TimeUnit unit) {
            kotlin.jvm.internal.n.h(unit, "unit");
            this.f6485x = Q8.d.k("timeout", j9, unit);
            return this;
        }

        public final a d(Duration duration) {
            kotlin.jvm.internal.n.h(duration, "duration");
            c(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final InterfaceC0936b e() {
            return this.f6468g;
        }

        public final AbstractC0937c f() {
            return null;
        }

        public final int g() {
            return this.f6484w;
        }

        public final c9.c h() {
            return this.f6483v;
        }

        public final C0941g i() {
            return this.f6482u;
        }

        public final int j() {
            return this.f6485x;
        }

        public final k k() {
            return this.f6463b;
        }

        public final List l() {
            return this.f6479r;
        }

        public final n m() {
            return this.f6471j;
        }

        public final p n() {
            return this.f6462a;
        }

        public final q o() {
            return this.f6472k;
        }

        public final r.c p() {
            return this.f6466e;
        }

        public final boolean q() {
            return this.f6469h;
        }

        public final boolean r() {
            return this.f6470i;
        }

        public final HostnameVerifier s() {
            return this.f6481t;
        }

        public final List t() {
            return this.f6464c;
        }

        public final long u() {
            return this.f6460B;
        }

        public final List v() {
            return this.f6465d;
        }

        public final int w() {
            return this.f6459A;
        }

        public final List x() {
            return this.f6480s;
        }

        public final Proxy y() {
            return this.f6473l;
        }

        public final InterfaceC0936b z() {
            return this.f6475n;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final List a() {
            return z.f6429V;
        }

        public final List b() {
            return z.f6428U;
        }

        private b() {
        }
    }

    public z(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorA;
        kotlin.jvm.internal.n.h(builder, "builder");
        this.f6449q = builder.n();
        this.f6450r = builder.k();
        this.f6451s = Q8.d.S(builder.t());
        this.f6452t = Q8.d.S(builder.v());
        this.f6453u = builder.p();
        this.f6454v = builder.C();
        this.f6455w = builder.e();
        this.f6456x = builder.q();
        this.f6457y = builder.r();
        this.f6458z = builder.m();
        builder.f();
        this.f6430A = builder.o();
        this.f6431B = builder.y();
        if (builder.y() != null) {
            proxySelectorA = b9.a.f14989a;
        } else {
            proxySelectorA = builder.A();
            proxySelectorA = proxySelectorA == null ? ProxySelector.getDefault() : proxySelectorA;
            if (proxySelectorA == null) {
                proxySelectorA = b9.a.f14989a;
            }
        }
        this.f6432C = proxySelectorA;
        this.f6433D = builder.z();
        this.f6434E = builder.E();
        List listL = builder.l();
        this.f6437H = listL;
        this.f6438I = builder.x();
        this.f6439J = builder.s();
        this.f6442M = builder.g();
        this.f6443N = builder.j();
        this.f6444O = builder.B();
        this.f6445P = builder.G();
        this.f6446Q = builder.w();
        this.f6447R = builder.u();
        U8.h hVarD = builder.D();
        this.f6448S = hVarD == null ? new U8.h() : hVarD;
        List list = listL;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.f6435F = null;
            this.f6441L = null;
            this.f6436G = null;
            this.f6440K = C0941g.f6184d;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (builder.F() != null) {
                        this.f6435F = builder.F();
                        c9.c cVarH = builder.h();
                        kotlin.jvm.internal.n.e(cVarH);
                        this.f6441L = cVarH;
                        X509TrustManager x509TrustManagerH = builder.H();
                        kotlin.jvm.internal.n.e(x509TrustManagerH);
                        this.f6436G = x509TrustManagerH;
                        C0941g c0941gI = builder.i();
                        kotlin.jvm.internal.n.e(cVarH);
                        this.f6440K = c0941gI.e(cVarH);
                    } else {
                        Z8.h.a aVar = Z8.h.f9546a;
                        X509TrustManager x509TrustManagerO = aVar.g().o();
                        this.f6436G = x509TrustManagerO;
                        Z8.h hVarG = aVar.g();
                        kotlin.jvm.internal.n.e(x509TrustManagerO);
                        this.f6435F = hVarG.n(x509TrustManagerO);
                        c9.c.a aVar2 = c9.c.f15253a;
                        kotlin.jvm.internal.n.e(x509TrustManagerO);
                        c9.c cVarA = aVar2.a(x509TrustManagerO);
                        this.f6441L = cVarA;
                        C0941g c0941gI2 = builder.i();
                        kotlin.jvm.internal.n.e(cVarA);
                        this.f6440K = c0941gI2.e(cVarA);
                    }
                }
            }
            this.f6435F = null;
            this.f6441L = null;
            this.f6436G = null;
            this.f6440K = C0941g.f6184d;
        }
        K();
    }

    private final void K() {
        List list = this.f6451s;
        kotlin.jvm.internal.n.f(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f6451s).toString());
        }
        List list2 = this.f6452t;
        kotlin.jvm.internal.n.f(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f6452t).toString());
        }
        List list3 = this.f6437H;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (this.f6435F == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f6441L == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f6436G == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f6435F != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f6441L != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f6436G != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.n.d(this.f6440K, C0941g.f6184d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int A() {
        return this.f6446Q;
    }

    public final List C() {
        return this.f6438I;
    }

    public final Proxy D() {
        return this.f6431B;
    }

    public final InterfaceC0936b E() {
        return this.f6433D;
    }

    public final ProxySelector F() {
        return this.f6432C;
    }

    public final int G() {
        return this.f6444O;
    }

    public final boolean H() {
        return this.f6454v;
    }

    public final SocketFactory I() {
        return this.f6434E;
    }

    public final SSLSocketFactory J() {
        SSLSocketFactory sSLSocketFactory = this.f6435F;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int L() {
        return this.f6445P;
    }

    @Override // P8.InterfaceC0939e.a
    public InterfaceC0939e c(B request) {
        kotlin.jvm.internal.n.h(request, "request");
        return new U8.e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final InterfaceC0936b h() {
        return this.f6455w;
    }

    public final AbstractC0937c i() {
        return null;
    }

    public final int j() {
        return this.f6442M;
    }

    public final C0941g k() {
        return this.f6440K;
    }

    public final int l() {
        return this.f6443N;
    }

    public final k m() {
        return this.f6450r;
    }

    public final List n() {
        return this.f6437H;
    }

    public final n o() {
        return this.f6458z;
    }

    public final p p() {
        return this.f6449q;
    }

    public final q q() {
        return this.f6430A;
    }

    public final r.c r() {
        return this.f6453u;
    }

    public final boolean s() {
        return this.f6456x;
    }

    public final boolean t() {
        return this.f6457y;
    }

    public final U8.h v() {
        return this.f6448S;
    }

    public final HostnameVerifier w() {
        return this.f6439J;
    }

    public final List x() {
        return this.f6451s;
    }

    public final List y() {
        return this.f6452t;
    }

    public z() {
        this(new a());
    }
}
