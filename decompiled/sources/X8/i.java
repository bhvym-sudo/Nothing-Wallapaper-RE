package X8;

import P8.u;
import e9.B;
import e9.C;
import e9.C1348c;
import e9.C1350e;
import e9.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f9174o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f9176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f9181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f9183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f9184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f9185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f9186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private X8.b f9187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f9188n;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public final class b implements z {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f9189q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final C1350e f9190r = new C1350e();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private u f9191s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f9192t;

        public b(boolean z9) {
            this.f9189q = z9;
        }

        private final void a(boolean z9) throws IOException {
            long jMin;
            boolean z10;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    iVar.s().v();
                    while (iVar.r() >= iVar.q() && !this.f9189q && !this.f9192t && iVar.h() == null) {
                        try {
                            iVar.D();
                        } catch (Throwable th) {
                            iVar.s().C();
                            throw th;
                        }
                    }
                    iVar.s().C();
                    iVar.c();
                    jMin = Math.min(iVar.q() - iVar.r(), this.f9190r.X0());
                    iVar.B(iVar.r() + jMin);
                    z10 = z9 && jMin == this.f9190r.X0();
                    A a10 = A.f21846a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i.this.s().v();
            try {
                i.this.g().z1(i.this.j(), z10, this.f9190r, jMin);
            } finally {
                i.this.s().C();
            }
        }

        @Override // e9.z
        public void Z(C1350e source, long j9) throws IOException {
            kotlin.jvm.internal.n.h(source, "source");
            i iVar = i.this;
            if (!Q8.d.f6932h || !Thread.holdsLock(iVar)) {
                this.f9190r.Z(source, j9);
                while (this.f9190r.X0() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
        }

        public final boolean b() {
            return this.f9189q;
        }

        @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (Q8.d.f6932h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                if (this.f9192t) {
                    return;
                }
                boolean z9 = iVar2.h() == null;
                A a10 = A.f21846a;
                if (!i.this.o().f9189q) {
                    boolean z10 = this.f9190r.X0() > 0;
                    if (this.f9191s != null) {
                        while (this.f9190r.X0() > 0) {
                            a(false);
                        }
                        f fVarG = i.this.g();
                        int iJ = i.this.j();
                        u uVar = this.f9191s;
                        kotlin.jvm.internal.n.e(uVar);
                        fVarG.A1(iJ, z9, Q8.d.O(uVar));
                    } else if (z10) {
                        while (this.f9190r.X0() > 0) {
                            a(true);
                        }
                    } else if (z9) {
                        i.this.g().z1(i.this.j(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f9192t = true;
                    A a11 = A.f21846a;
                }
                i.this.g().flush();
                i.this.b();
            }
        }

        @Override // e9.z
        public C e() {
            return i.this.s();
        }

        @Override // e9.z, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (Q8.d.f6932h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                iVar2.c();
                A a10 = A.f21846a;
            }
            while (this.f9190r.X0() > 0) {
                a(false);
                i.this.g().flush();
            }
        }

        public final boolean y() {
            return this.f9192t;
        }
    }

    public final class c implements B {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final long f9194q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f9195r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final C1350e f9196s = new C1350e();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final C1350e f9197t = new C1350e();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private u f9198u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f9199v;

        public c(long j9, boolean z9) {
            this.f9194q = j9;
            this.f9195r = z9;
        }

        private final void u(long j9) {
            i iVar = i.this;
            if (!Q8.d.f6932h || !Thread.holdsLock(iVar)) {
                i.this.g().y1(j9);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public final boolean a() {
            return this.f9199v;
        }

        public final boolean b() {
            return this.f9195r;
        }

        @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jX0;
            i iVar = i.this;
            synchronized (iVar) {
                this.f9199v = true;
                jX0 = this.f9197t.X0();
                this.f9197t.j();
                kotlin.jvm.internal.n.f(iVar, "null cannot be cast to non-null type java.lang.Object");
                iVar.notifyAll();
                A a10 = A.f21846a;
            }
            if (jX0 > 0) {
                u(jX0);
            }
            i.this.b();
        }

        @Override // e9.B
        public C e() {
            return i.this.m();
        }

        @Override // e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            IOException iOExceptionI;
            boolean z9;
            long jE1;
            kotlin.jvm.internal.n.h(sink, "sink");
            long j10 = 0;
            if (j9 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
            }
            while (true) {
                i iVar = i.this;
                synchronized (iVar) {
                    iVar.m().v();
                    try {
                        if (iVar.h() == null || this.f9195r) {
                            iOExceptionI = null;
                        } else {
                            iOExceptionI = iVar.i();
                            if (iOExceptionI == null) {
                                X8.b bVarH = iVar.h();
                                kotlin.jvm.internal.n.e(bVarH);
                                iOExceptionI = new n(bVarH);
                            }
                        }
                        if (this.f9199v) {
                            throw new IOException("stream closed");
                        }
                        z9 = false;
                        if (this.f9197t.X0() > j10) {
                            C1350e c1350e = this.f9197t;
                            jE1 = c1350e.e1(sink, Math.min(j9, c1350e.X0()));
                            iVar.A(iVar.l() + jE1);
                            long jL = iVar.l() - iVar.k();
                            if (iOExceptionI == null && jL >= iVar.g().W0().c() / 2) {
                                iVar.g().E1(iVar.j(), jL);
                                iVar.z(iVar.l());
                            }
                        } else {
                            if (!this.f9195r && iOExceptionI == null) {
                                iVar.D();
                                z9 = true;
                            }
                            jE1 = -1;
                        }
                        iVar.m().C();
                        A a10 = A.f21846a;
                    } catch (Throwable th) {
                        iVar.m().C();
                        throw th;
                    }
                    throw th;
                }
                if (!z9) {
                    if (jE1 != -1) {
                        return jE1;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j10 = 0;
            }
        }

        public final void f(e9.g source, long j9) throws EOFException {
            boolean z9;
            boolean z10;
            kotlin.jvm.internal.n.h(source, "source");
            i iVar = i.this;
            if (Q8.d.f6932h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            long j10 = j9;
            while (j10 > 0) {
                synchronized (i.this) {
                    z9 = this.f9195r;
                    z10 = this.f9197t.X0() + j10 > this.f9194q;
                    A a10 = A.f21846a;
                }
                if (z10) {
                    source.skip(j10);
                    i.this.f(X8.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z9) {
                    source.skip(j10);
                    return;
                }
                long jE1 = source.e1(this.f9196s, j10);
                if (jE1 == -1) {
                    throw new EOFException();
                }
                j10 -= jE1;
                i iVar2 = i.this;
                synchronized (iVar2) {
                    try {
                        if (this.f9199v) {
                            this.f9196s.j();
                        } else {
                            boolean z11 = this.f9197t.X0() == 0;
                            this.f9197t.l1(this.f9196s);
                            if (z11) {
                                kotlin.jvm.internal.n.f(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                iVar2.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            u(j9);
        }

        public final void g(boolean z9) {
            this.f9195r = z9;
        }

        public final void j(u uVar) {
            this.f9198u = uVar;
        }
    }

    public final class d extends C1348c {
        public d() {
        }

        @Override // e9.C1348c
        protected void B() {
            i.this.f(X8.b.CANCEL);
            i.this.g().s1();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // e9.C1348c
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i10, f connection, boolean z9, boolean z10, u uVar) {
        kotlin.jvm.internal.n.h(connection, "connection");
        this.f9175a = i10;
        this.f9176b = connection;
        this.f9180f = connection.X0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f9181g = arrayDeque;
        this.f9183i = new c(connection.W0().c(), z10);
        this.f9184j = new b(z9);
        this.f9185k = new d();
        this.f9186l = new d();
        if (uVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(uVar);
        }
    }

    private final boolean e(X8.b bVar, IOException iOException) {
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f9187m != null) {
                return false;
            }
            this.f9187m = bVar;
            this.f9188n = iOException;
            kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f9183i.b() && this.f9184j.b()) {
                return false;
            }
            A a10 = A.f21846a;
            this.f9176b.r1(this.f9175a);
            return true;
        }
    }

    public final void A(long j9) {
        this.f9177c = j9;
    }

    public final void B(long j9) {
        this.f9179e = j9;
    }

    public final synchronized u C() {
        Object objRemoveFirst;
        this.f9185k.v();
        while (this.f9181g.isEmpty() && this.f9187m == null) {
            try {
                D();
            } catch (Throwable th) {
                this.f9185k.C();
                throw th;
            }
        }
        this.f9185k.C();
        if (this.f9181g.isEmpty()) {
            IOException iOException = this.f9188n;
            if (iOException != null) {
                throw iOException;
            }
            X8.b bVar = this.f9187m;
            kotlin.jvm.internal.n.e(bVar);
            throw new n(bVar);
        }
        objRemoveFirst = this.f9181g.removeFirst();
        kotlin.jvm.internal.n.g(objRemoveFirst, "headersQueue.removeFirst()");
        return (u) objRemoveFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final C E() {
        return this.f9186l;
    }

    public final void a(long j9) {
        this.f9180f += j9;
        if (j9 > 0) {
            kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z9;
        boolean zU;
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z9 = !this.f9183i.b() && this.f9183i.a() && (this.f9184j.b() || this.f9184j.y());
                zU = u();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            d(X8.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f9176b.r1(this.f9175a);
        }
    }

    public final void c() throws IOException {
        if (this.f9184j.y()) {
            throw new IOException("stream closed");
        }
        if (this.f9184j.b()) {
            throw new IOException("stream finished");
        }
        if (this.f9187m != null) {
            IOException iOException = this.f9188n;
            if (iOException != null) {
                throw iOException;
            }
            X8.b bVar = this.f9187m;
            kotlin.jvm.internal.n.e(bVar);
            throw new n(bVar);
        }
    }

    public final void d(X8.b rstStatusCode, IOException iOException) {
        kotlin.jvm.internal.n.h(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f9176b.C1(this.f9175a, rstStatusCode);
        }
    }

    public final void f(X8.b errorCode) {
        kotlin.jvm.internal.n.h(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f9176b.D1(this.f9175a, errorCode);
        }
    }

    public final f g() {
        return this.f9176b;
    }

    public final synchronized X8.b h() {
        return this.f9187m;
    }

    public final IOException i() {
        return this.f9188n;
    }

    public final int j() {
        return this.f9175a;
    }

    public final long k() {
        return this.f9178d;
    }

    public final long l() {
        return this.f9177c;
    }

    public final d m() {
        return this.f9185k;
    }

    public final z n() {
        synchronized (this) {
            try {
                if (!this.f9182h && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f9184j;
    }

    public final b o() {
        return this.f9184j;
    }

    public final c p() {
        return this.f9183i;
    }

    public final long q() {
        return this.f9180f;
    }

    public final long r() {
        return this.f9179e;
    }

    public final d s() {
        return this.f9186l;
    }

    public final boolean t() {
        return this.f9176b.I0() == ((this.f9175a & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f9187m != null) {
                return false;
            }
            if (this.f9183i.b() || this.f9183i.a()) {
                if ((this.f9184j.b() || this.f9184j.y()) && this.f9182h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C v() {
        return this.f9185k;
    }

    public final void w(e9.g source, int i10) {
        kotlin.jvm.internal.n.h(source, "source");
        if (!Q8.d.f6932h || !Thread.holdsLock(this)) {
            this.f9183i.f(source, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(u headers, boolean z9) {
        boolean zU;
        kotlin.jvm.internal.n.h(headers, "headers");
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f9182h && z9) {
                    this.f9183i.j(headers);
                } else {
                    this.f9182h = true;
                    this.f9181g.add(headers);
                }
                if (z9) {
                    this.f9183i.g(true);
                }
                zU = u();
                kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            return;
        }
        this.f9176b.r1(this.f9175a);
    }

    public final synchronized void y(X8.b errorCode) {
        kotlin.jvm.internal.n.h(errorCode, "errorCode");
        if (this.f9187m == null) {
            this.f9187m = errorCode;
            kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j9) {
        this.f9178d = j9;
    }
}
