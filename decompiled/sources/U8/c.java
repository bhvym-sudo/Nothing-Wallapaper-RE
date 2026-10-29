package U8;

import P8.C;
import P8.D;
import P8.E;
import P8.r;
import e9.B;
import e9.C1350e;
import e9.o;
import e9.z;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f7993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f7994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f7995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V8.d f7996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f7999g;

    private final class a extends e9.i {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final long f8000r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f8001s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f8002t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f8003u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ c f8004v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, z delegate, long j9) {
            super(delegate);
            n.h(delegate, "delegate");
            this.f8004v = cVar;
            this.f8000r = j9;
        }

        private final IOException a(IOException iOException) {
            if (this.f8001s) {
                return iOException;
            }
            this.f8001s = true;
            return this.f8004v.a(this.f8002t, false, true, iOException);
        }

        @Override // e9.i, e9.z
        public void Z(C1350e source, long j9) throws IOException {
            n.h(source, "source");
            if (this.f8003u) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f8000r;
            if (j10 == -1 || this.f8002t + j9 <= j10) {
                try {
                    super.Z(source, j9);
                    this.f8002t += j9;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f8000r + " bytes but received " + (this.f8002t + j9));
        }

        @Override // e9.i, e9.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f8003u) {
                return;
            }
            this.f8003u = true;
            long j9 = this.f8000r;
            if (j9 != -1 && this.f8002t != j9) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // e9.i, e9.z, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public final class b extends e9.j {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final long f8005r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f8006s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f8007t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f8008u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f8009v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ c f8010w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, B delegate, long j9) {
            super(delegate);
            n.h(delegate, "delegate");
            this.f8010w = cVar;
            this.f8005r = j9;
            this.f8007t = true;
            if (j9 == 0) {
                b(null);
            }
        }

        public final IOException b(IOException iOException) {
            if (this.f8008u) {
                return iOException;
            }
            this.f8008u = true;
            if (iOException == null && this.f8007t) {
                this.f8007t = false;
                this.f8010w.i().v(this.f8010w.g());
            }
            return this.f8010w.a(this.f8006s, true, false, iOException);
        }

        @Override // e9.j, e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f8009v) {
                return;
            }
            this.f8009v = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // e9.j, e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            n.h(sink, "sink");
            if (this.f8009v) {
                throw new IllegalStateException("closed");
            }
            try {
                long jE1 = a().e1(sink, j9);
                if (this.f8007t) {
                    this.f8007t = false;
                    this.f8010w.i().v(this.f8010w.g());
                }
                if (jE1 == -1) {
                    b(null);
                    return -1L;
                }
                long j10 = this.f8006s + jE1;
                long j11 = this.f8005r;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + this.f8005r + " bytes but received " + j10);
                }
                this.f8006s = j10;
                if (j10 == j11) {
                    b(null);
                }
                return jE1;
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public c(e call, r eventListener, d finder, V8.d codec) {
        n.h(call, "call");
        n.h(eventListener, "eventListener");
        n.h(finder, "finder");
        n.h(codec, "codec");
        this.f7993a = call;
        this.f7994b = eventListener;
        this.f7995c = finder;
        this.f7996d = codec;
        this.f7999g = codec.f();
    }

    private final void t(IOException iOException) {
        this.f7998f = true;
        this.f7995c.h(iOException);
        this.f7996d.f().H(this.f7993a, iOException);
    }

    public final IOException a(long j9, boolean z9, boolean z10, IOException iOException) {
        if (iOException != null) {
            t(iOException);
        }
        if (z10) {
            if (iOException != null) {
                this.f7994b.r(this.f7993a, iOException);
            } else {
                this.f7994b.p(this.f7993a, j9);
            }
        }
        if (z9) {
            if (iOException != null) {
                this.f7994b.w(this.f7993a, iOException);
            } else {
                this.f7994b.u(this.f7993a, j9);
            }
        }
        return this.f7993a.w(this, z10, z9, iOException);
    }

    public final void b() {
        this.f7996d.cancel();
    }

    public final z c(P8.B request, boolean z9) {
        n.h(request, "request");
        this.f7997e = z9;
        C cA = request.a();
        n.e(cA);
        long jA = cA.a();
        this.f7994b.q(this.f7993a);
        return new a(this, this.f7996d.a(request, jA), jA);
    }

    public final void d() {
        this.f7996d.cancel();
        this.f7993a.w(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f7996d.c();
        } catch (IOException e10) {
            this.f7994b.r(this.f7993a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f7996d.g();
        } catch (IOException e10) {
            this.f7994b.r(this.f7993a, e10);
            t(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f7993a;
    }

    public final f h() {
        return this.f7999g;
    }

    public final r i() {
        return this.f7994b;
    }

    public final d j() {
        return this.f7995c;
    }

    public final boolean k() {
        return this.f7998f;
    }

    public final boolean l() {
        return !n.d(this.f7995c.d().l().i(), this.f7999g.A().a().l().i());
    }

    public final boolean m() {
        return this.f7997e;
    }

    public final void n() {
        this.f7996d.f().z();
    }

    public final void o() {
        this.f7993a.w(this, true, false, null);
    }

    public final E p(D response) throws IOException {
        n.h(response, "response");
        try {
            String strG = D.G(response, "Content-Type", null, 2, null);
            long jD = this.f7996d.d(response);
            return new V8.h(strG, jD, o.d(new b(this, this.f7996d.b(response), jD)));
        } catch (IOException e10) {
            this.f7994b.w(this.f7993a, e10);
            t(e10);
            throw e10;
        }
    }

    public final D.a q(boolean z9) throws IOException {
        try {
            D.a aVarE = this.f7996d.e(z9);
            if (aVarE == null) {
                return aVarE;
            }
            aVarE.l(this);
            return aVarE;
        } catch (IOException e10) {
            this.f7994b.w(this.f7993a, e10);
            t(e10);
            throw e10;
        }
    }

    public final void r(D response) {
        n.h(response, "response");
        this.f7994b.x(this.f7993a, response);
    }

    public final void s() {
        this.f7994b.y(this.f7993a);
    }

    public final void u(P8.B request) throws IOException {
        n.h(request, "request");
        try {
            this.f7994b.t(this.f7993a);
            this.f7996d.h(request);
            this.f7994b.s(this.f7993a, request);
        } catch (IOException e10) {
            this.f7994b.r(this.f7993a, e10);
            t(e10);
            throw e10;
        }
    }
}
