package W8;

import E8.i;
import P8.D;
import P8.u;
import P8.v;
import P8.z;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import e9.B;
import e9.C;
import e9.C1350e;
import e9.k;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements V8.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f8900h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f8901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U8.f f8902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e9.g f8903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e9.f f8904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W8.a f8906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u f8907g;

    private abstract class a implements B {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final k f8908q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f8909r;

        public a() {
            this.f8908q = new k(b.this.f8903c.e());
        }

        public final void a() {
            if (b.this.f8905e == 6) {
                return;
            }
            if (b.this.f8905e == 5) {
                b.this.r(this.f8908q);
                b.this.f8905e = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f8905e);
            }
        }

        protected final void b(boolean z9) {
            this.f8909r = z9;
        }

        @Override // e9.B
        public C e() {
            return this.f8908q;
        }

        @Override // e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            n.h(sink, "sink");
            try {
                return b.this.f8903c.e1(sink, j9);
            } catch (IOException e10) {
                b.this.f().z();
                a();
                throw e10;
            }
        }

        protected final boolean y() {
            return this.f8909r;
        }
    }

    /* JADX INFO: renamed from: W8.b$b, reason: collision with other inner class name */
    private final class C0313b implements e9.z {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final k f8911q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f8912r;

        public C0313b() {
            this.f8911q = new k(b.this.f8904d.e());
        }

        @Override // e9.z
        public void Z(C1350e source, long j9) {
            n.h(source, "source");
            if (this.f8912r) {
                throw new IllegalStateException("closed");
            }
            if (j9 == 0) {
                return;
            }
            b.this.f8904d.r0(j9);
            b.this.f8904d.d0("\r\n");
            b.this.f8904d.Z(source, j9);
            b.this.f8904d.d0("\r\n");
        }

        @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f8912r) {
                return;
            }
            this.f8912r = true;
            b.this.f8904d.d0("0\r\n\r\n");
            b.this.r(this.f8911q);
            b.this.f8905e = 3;
        }

        @Override // e9.z
        public C e() {
            return this.f8911q;
        }

        @Override // e9.z, java.io.Flushable
        public synchronized void flush() {
            if (this.f8912r) {
                return;
            }
            b.this.f8904d.flush();
        }
    }

    private final class c extends a {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final v f8914t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f8915u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f8916v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ b f8917w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, v url) {
            super();
            n.h(url, "url");
            this.f8917w = bVar;
            this.f8914t = url;
            this.f8915u = -1L;
            this.f8916v = true;
        }

        private final void f() throws ProtocolException {
            if (this.f8915u != -1) {
                this.f8917w.f8903c.z0();
            }
            try {
                this.f8915u = this.f8917w.f8903c.d1();
                String string = i.N0(this.f8917w.f8903c.z0()).toString();
                if (this.f8915u < 0 || (string.length() > 0 && !i.M(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f8915u + string + '\"');
                }
                if (this.f8915u == 0) {
                    this.f8916v = false;
                    b bVar = this.f8917w;
                    bVar.f8907g = bVar.f8906f.a();
                    z zVar = this.f8917w.f8901a;
                    n.e(zVar);
                    P8.n nVarO = zVar.o();
                    v vVar = this.f8914t;
                    u uVar = this.f8917w.f8907g;
                    n.e(uVar);
                    V8.e.f(nVarO, vVar, uVar);
                    a();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (y()) {
                return;
            }
            if (this.f8916v && !Q8.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f8917w.f().z();
                a();
            }
            b(true);
        }

        @Override // W8.b.a, e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            n.h(sink, "sink");
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            if (y()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f8916v) {
                return -1L;
            }
            long j10 = this.f8915u;
            if (j10 == 0 || j10 == -1) {
                f();
                if (!this.f8916v) {
                    return -1L;
                }
            }
            long jE1 = super.e1(sink, Math.min(j9, this.f8915u));
            if (jE1 != -1) {
                this.f8915u -= jE1;
                return jE1;
            }
            this.f8917w.f().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
    }

    public static final class d {
        public /* synthetic */ d(AbstractC1457h abstractC1457h) {
            this();
        }

        private d() {
        }
    }

    private final class e extends a {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f8918t;

        public e(long j9) {
            super();
            this.f8918t = j9;
            if (j9 == 0) {
                a();
            }
        }

        @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (y()) {
                return;
            }
            if (this.f8918t != 0 && !Q8.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.f().z();
                a();
            }
            b(true);
        }

        @Override // W8.b.a, e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            n.h(sink, "sink");
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            if (y()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f8918t;
            if (j10 == 0) {
                return -1L;
            }
            long jE1 = super.e1(sink, Math.min(j10, j9));
            if (jE1 == -1) {
                b.this.f().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j11 = this.f8918t - jE1;
            this.f8918t = j11;
            if (j11 == 0) {
                a();
            }
            return jE1;
        }
    }

    private final class f implements e9.z {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final k f8920q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f8921r;

        public f() {
            this.f8920q = new k(b.this.f8904d.e());
        }

        @Override // e9.z
        public void Z(C1350e source, long j9) {
            n.h(source, "source");
            if (this.f8921r) {
                throw new IllegalStateException("closed");
            }
            Q8.d.l(source.X0(), 0L, j9);
            b.this.f8904d.Z(source, j9);
        }

        @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8921r) {
                return;
            }
            this.f8921r = true;
            b.this.r(this.f8920q);
            b.this.f8905e = 3;
        }

        @Override // e9.z
        public C e() {
            return this.f8920q;
        }

        @Override // e9.z, java.io.Flushable
        public void flush() {
            if (this.f8921r) {
                return;
            }
            b.this.f8904d.flush();
        }
    }

    private final class g extends a {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f8923t;

        public g() {
            super();
        }

        @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (y()) {
                return;
            }
            if (!this.f8923t) {
                a();
            }
            b(true);
        }

        @Override // W8.b.a, e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            n.h(sink, "sink");
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            if (y()) {
                throw new IllegalStateException("closed");
            }
            if (this.f8923t) {
                return -1L;
            }
            long jE1 = super.e1(sink, j9);
            if (jE1 != -1) {
                return jE1;
            }
            this.f8923t = true;
            a();
            return -1L;
        }
    }

    public b(z zVar, U8.f connection, e9.g source, e9.f sink) {
        n.h(connection, "connection");
        n.h(source, "source");
        n.h(sink, "sink");
        this.f8901a = zVar;
        this.f8902b = connection;
        this.f8903c = source;
        this.f8904d = sink;
        this.f8906f = new W8.a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(k kVar) {
        C cI = kVar.i();
        kVar.j(C.f20236e);
        cI.a();
        cI.b();
    }

    private final boolean s(P8.B b10) {
        return i.B("chunked", b10.d("Transfer-Encoding"), true);
    }

    private final boolean t(D d10) {
        return i.B("chunked", D.G(d10, "Transfer-Encoding", null, 2, null), true);
    }

    private final e9.z u() {
        if (this.f8905e == 1) {
            this.f8905e = 2;
            return new C0313b();
        }
        throw new IllegalStateException(("state: " + this.f8905e).toString());
    }

    private final B v(v vVar) {
        if (this.f8905e == 4) {
            this.f8905e = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f8905e).toString());
    }

    private final B w(long j9) {
        if (this.f8905e == 4) {
            this.f8905e = 5;
            return new e(j9);
        }
        throw new IllegalStateException(("state: " + this.f8905e).toString());
    }

    private final e9.z x() {
        if (this.f8905e == 1) {
            this.f8905e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f8905e).toString());
    }

    private final B y() {
        if (this.f8905e == 4) {
            this.f8905e = 5;
            f().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f8905e).toString());
    }

    public final void A(u headers, String requestLine) {
        n.h(headers, "headers");
        n.h(requestLine, "requestLine");
        if (this.f8905e != 0) {
            throw new IllegalStateException(("state: " + this.f8905e).toString());
        }
        this.f8904d.d0(requestLine).d0("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f8904d.d0(headers.b(i10)).d0(": ").d0(headers.m(i10)).d0("\r\n");
        }
        this.f8904d.d0("\r\n");
        this.f8905e = 1;
    }

    @Override // V8.d
    public e9.z a(P8.B request, long j9) throws ProtocolException {
        n.h(request, "request");
        if (request.a() != null && request.a().e()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j9 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // V8.d
    public B b(D response) {
        n.h(response, "response");
        if (!V8.e.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.t0().j());
        }
        long jV = Q8.d.v(response);
        return jV != -1 ? w(jV) : y();
    }

    @Override // V8.d
    public void c() {
        this.f8904d.flush();
    }

    @Override // V8.d
    public void cancel() {
        f().e();
    }

    @Override // V8.d
    public long d(D response) {
        n.h(response, "response");
        if (!V8.e.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return Q8.d.v(response);
    }

    @Override // V8.d
    public D.a e(boolean z9) {
        int i10 = this.f8905e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f8905e).toString());
        }
        try {
            V8.k kVarA = V8.k.f8253d.a(this.f8906f.b());
            D.a aVarK = new D.a().p(kVarA.f8254a).g(kVarA.f8255b).m(kVarA.f8256c).k(this.f8906f.a());
            if (z9 && kVarA.f8255b == 100) {
                return null;
            }
            int i11 = kVarA.f8255b;
            if (i11 == 100) {
                this.f8905e = 3;
                return aVarK;
            }
            if (102 > i11 || i11 >= 200) {
                this.f8905e = 4;
                return aVarK;
            }
            this.f8905e = 3;
            return aVarK;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + f().A().a().l().p(), e10);
        }
    }

    @Override // V8.d
    public U8.f f() {
        return this.f8902b;
    }

    @Override // V8.d
    public void g() {
        this.f8904d.flush();
    }

    @Override // V8.d
    public void h(P8.B request) {
        n.h(request, "request");
        V8.i iVar = V8.i.f8250a;
        Proxy.Type type = f().A().b().type();
        n.g(type, "connection.route().proxy.type()");
        A(request.e(), iVar.a(request, type));
    }

    public final void z(D response) {
        n.h(response, "response");
        long jV = Q8.d.v(response);
        if (jV == -1) {
            return;
        }
        B bW = w(jV);
        Q8.d.L(bW, SubsamplingScaleImageView.TILE_SIZE_AUTO, TimeUnit.MILLISECONDS);
        bW.close();
    }
}
