package P8;

import java.io.Closeable;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final long f6097A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final long f6098B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final U8.c f6099C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private C0938d f6100D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final B f6101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final A f6102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f6103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f6104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final t f6105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final u f6106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final E f6107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final D f6108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final D f6109y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final D f6110z;

    public D(B request, A protocol, String message, int i10, t tVar, u headers, E e10, D d10, D d11, D d12, long j9, long j10, U8.c cVar) {
        kotlin.jvm.internal.n.h(request, "request");
        kotlin.jvm.internal.n.h(protocol, "protocol");
        kotlin.jvm.internal.n.h(message, "message");
        kotlin.jvm.internal.n.h(headers, "headers");
        this.f6101q = request;
        this.f6102r = protocol;
        this.f6103s = message;
        this.f6104t = i10;
        this.f6105u = tVar;
        this.f6106v = headers;
        this.f6107w = e10;
        this.f6108x = d10;
        this.f6109y = d11;
        this.f6110z = d12;
        this.f6097A = j9;
        this.f6098B = j10;
        this.f6099C = cVar;
    }

    public static /* synthetic */ String G(D d10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d10.B(str, str2);
    }

    public final String B(String name, String str) {
        kotlin.jvm.internal.n.h(name, "name");
        String strA = this.f6106v.a(name);
        return strA == null ? str : strA;
    }

    public final u I() {
        return this.f6106v;
    }

    public final String K() {
        return this.f6103s;
    }

    public final D Q() {
        return this.f6108x;
    }

    public final a U() {
        return new a(this);
    }

    public final D Y() {
        return this.f6110z;
    }

    public final E a() {
        return this.f6107w;
    }

    public final C0938d b() {
        C0938d c0938d = this.f6100D;
        if (c0938d != null) {
            return c0938d;
        }
        C0938d c0938dB = C0938d.f6159n.b(this.f6106v);
        this.f6100D = c0938dB;
        return c0938dB;
    }

    public final A b0() {
        return this.f6102r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E e10 = this.f6107w;
        if (e10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        e10.close();
    }

    public final D f() {
        return this.f6109y;
    }

    public final List g() {
        String str;
        u uVar = this.f6106v;
        int i10 = this.f6104t;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return AbstractC1444s.l();
            }
            str = "Proxy-Authenticate";
        }
        return V8.e.a(uVar, str);
    }

    public final boolean isSuccessful() {
        int i10 = this.f6104t;
        return 200 <= i10 && i10 < 300;
    }

    public final int j() {
        return this.f6104t;
    }

    public final long q0() {
        return this.f6098B;
    }

    public final B t0() {
        return this.f6101q;
    }

    public String toString() {
        return "Response{protocol=" + this.f6102r + ", code=" + this.f6104t + ", message=" + this.f6103s + ", url=" + this.f6101q.j() + '}';
    }

    public final U8.c u() {
        return this.f6099C;
    }

    public final long w0() {
        return this.f6097A;
    }

    public final t z() {
        return this.f6105u;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B f6111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private A f6112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f6114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t f6115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private u.a f6116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E f6117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private D f6118h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private D f6119i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private D f6120j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f6121k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f6122l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private U8.c f6123m;

        public a() {
            this.f6113c = -1;
            this.f6116f = new u.a();
        }

        private final void e(D d10) {
            if (d10 != null && d10.a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, D d10) {
            if (d10 != null) {
                if (d10.a() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (d10.Q() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (d10.f() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (d10.Y() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            this.f6116f.a(name, value);
            return this;
        }

        public a b(E e10) {
            this.f6117g = e10;
            return this;
        }

        public D c() {
            int i10 = this.f6113c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f6113c).toString());
            }
            B b10 = this.f6111a;
            if (b10 == null) {
                throw new IllegalStateException("request == null");
            }
            A a10 = this.f6112b;
            if (a10 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f6114d;
            if (str != null) {
                return new D(b10, a10, str, i10, this.f6115e, this.f6116f.f(), this.f6117g, this.f6118h, this.f6119i, this.f6120j, this.f6121k, this.f6122l, this.f6123m);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(D d10) {
            f("cacheResponse", d10);
            this.f6119i = d10;
            return this;
        }

        public a g(int i10) {
            this.f6113c = i10;
            return this;
        }

        public final int h() {
            return this.f6113c;
        }

        public a i(t tVar) {
            this.f6115e = tVar;
            return this;
        }

        public a j(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            this.f6116f.i(name, value);
            return this;
        }

        public a k(u headers) {
            kotlin.jvm.internal.n.h(headers, "headers");
            this.f6116f = headers.f();
            return this;
        }

        public final void l(U8.c deferredTrailers) {
            kotlin.jvm.internal.n.h(deferredTrailers, "deferredTrailers");
            this.f6123m = deferredTrailers;
        }

        public a m(String message) {
            kotlin.jvm.internal.n.h(message, "message");
            this.f6114d = message;
            return this;
        }

        public a n(D d10) {
            f("networkResponse", d10);
            this.f6118h = d10;
            return this;
        }

        public a o(D d10) {
            e(d10);
            this.f6120j = d10;
            return this;
        }

        public a p(A protocol) {
            kotlin.jvm.internal.n.h(protocol, "protocol");
            this.f6112b = protocol;
            return this;
        }

        public a q(long j9) {
            this.f6122l = j9;
            return this;
        }

        public a r(B request) {
            kotlin.jvm.internal.n.h(request, "request");
            this.f6111a = request;
            return this;
        }

        public a s(long j9) {
            this.f6121k = j9;
            return this;
        }

        public a(D response) {
            kotlin.jvm.internal.n.h(response, "response");
            this.f6113c = -1;
            this.f6111a = response.t0();
            this.f6112b = response.b0();
            this.f6113c = response.j();
            this.f6114d = response.K();
            this.f6115e = response.z();
            this.f6116f = response.I().f();
            this.f6117g = response.a();
            this.f6118h = response.Q();
            this.f6119i = response.f();
            this.f6120j = response.Y();
            this.f6121k = response.w0();
            this.f6122l = response.q0();
            this.f6123m = response.u();
        }
    }
}
