package U8;

import P8.B;
import P8.C0935a;
import P8.C0941g;
import P8.D;
import P8.InterfaceC0939e;
import P8.InterfaceC0940f;
import P8.p;
import P8.r;
import P8.v;
import P8.z;
import e9.C1348c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.AbstractC1388c;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC0939e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f8021A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private U8.c f8022B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f8023C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f8024D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f8025E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private volatile boolean f8026F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private volatile U8.c f8027G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private volatile f f8028H;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z f8029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final B f8030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f8031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g f8032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final r f8033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final c f8034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f8035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Object f8036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f8037y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f8038z;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final InterfaceC0940f f8039q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private volatile AtomicInteger f8040r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ e f8041s;

        public a(e eVar, InterfaceC0940f responseCallback) {
            n.h(responseCallback, "responseCallback");
            this.f8041s = eVar;
            this.f8039q = responseCallback;
            this.f8040r = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            n.h(executorService, "executorService");
            p pVarP = this.f8041s.n().p();
            if (Q8.d.f6932h && Thread.holdsLock(pVarP)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + pVarP);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f8041s.x(interruptedIOException);
                    this.f8039q.b(this.f8041s, interruptedIOException);
                    this.f8041s.n().p().f(this);
                }
            } catch (Throwable th) {
                this.f8041s.n().p().f(this);
                throw th;
            }
        }

        public final e b() {
            return this.f8041s;
        }

        public final AtomicInteger c() {
            return this.f8040r;
        }

        public final String d() {
            return this.f8041s.s().j().i();
        }

        public final void e(a other) {
            n.h(other, "other");
            this.f8040r = other.f8040r;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z9;
            Throwable th;
            IOException e10;
            p pVarP;
            String str = "OkHttp " + this.f8041s.y();
            e eVar = this.f8041s;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.f8034v.v();
                try {
                    try {
                        z9 = true;
                        try {
                            this.f8039q.a(eVar, eVar.t());
                            pVarP = eVar.n().p();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z9) {
                                Z8.h.f9546a.g().j("Callback failure for " + eVar.G(), 4, e10);
                            } else {
                                this.f8039q.b(eVar, e10);
                            }
                            pVarP = eVar.n().p();
                        } catch (Throwable th2) {
                            th = th2;
                            eVar.cancel();
                            if (!z9) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC1388c.a(iOException, th);
                                this.f8039q.b(eVar, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        eVar.n().p().f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z9 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z9 = false;
                    th = th4;
                }
                pVarP.f(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f8042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            n.h(referent, "referent");
            this.f8042a = obj;
        }

        public final Object a() {
            return this.f8042a;
        }
    }

    public static final class c extends C1348c {
        c() {
        }

        @Override // e9.C1348c
        protected void B() {
            e.this.cancel();
        }
    }

    public e(z client, B originalRequest, boolean z9) {
        n.h(client, "client");
        n.h(originalRequest, "originalRequest");
        this.f8029q = client;
        this.f8030r = originalRequest;
        this.f8031s = z9;
        this.f8032t = client.m().a();
        this.f8033u = client.r().a(this);
        c cVar = new c();
        cVar.g(client.j(), TimeUnit.MILLISECONDS);
        this.f8034v = cVar;
        this.f8035w = new AtomicBoolean();
        this.f8025E = true;
    }

    private final IOException F(IOException iOException) {
        if (this.f8021A || !this.f8034v.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G() {
        StringBuilder sb = new StringBuilder();
        sb.append(f() ? "canceled " : "");
        sb.append(this.f8031s ? "web socket" : "call");
        sb.append(" to ");
        sb.append(y());
        return sb.toString();
    }

    private final IOException h(IOException iOException) {
        Socket socketA;
        boolean z9 = Q8.d.f6932h;
        if (z9 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f8038z;
        if (fVar != null) {
            if (z9 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketA = A();
            }
            if (this.f8038z == null) {
                if (socketA != null) {
                    Q8.d.n(socketA);
                }
                this.f8033u.k(this, fVar);
            } else if (socketA != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionF = F(iOException);
        if (iOException == null) {
            this.f8033u.c(this);
            return iOExceptionF;
        }
        r rVar = this.f8033u;
        n.e(iOExceptionF);
        rVar.d(this, iOExceptionF);
        return iOExceptionF;
    }

    private final void i() {
        this.f8036x = Z8.h.f9546a.g().h("response.body().close()");
        this.f8033u.e(this);
    }

    private final C0935a k(v vVar) {
        SSLSocketFactory sSLSocketFactoryJ;
        HostnameVerifier hostnameVerifierW;
        C0941g c0941gK;
        if (vVar.j()) {
            sSLSocketFactoryJ = this.f8029q.J();
            hostnameVerifierW = this.f8029q.w();
            c0941gK = this.f8029q.k();
        } else {
            sSLSocketFactoryJ = null;
            hostnameVerifierW = null;
            c0941gK = null;
        }
        return new C0935a(vVar.i(), vVar.n(), this.f8029q.q(), this.f8029q.I(), sSLSocketFactoryJ, hostnameVerifierW, c0941gK, this.f8029q.E(), this.f8029q.D(), this.f8029q.C(), this.f8029q.n(), this.f8029q.F());
    }

    public final Socket A() {
        f fVar = this.f8038z;
        n.e(fVar);
        if (Q8.d.f6932h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listO = fVar.o();
        Iterator it = listO.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (n.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listO.remove(i10);
        this.f8038z = null;
        if (listO.isEmpty()) {
            fVar.C(System.nanoTime());
            if (this.f8032t.c(fVar)) {
                return fVar.E();
            }
        }
        return null;
    }

    @Override // P8.InterfaceC0939e
    public void B(InterfaceC0940f responseCallback) {
        n.h(responseCallback, "responseCallback");
        if (!this.f8035w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        i();
        this.f8029q.p().a(new a(this, responseCallback));
    }

    public final boolean C() {
        d dVar = this.f8037y;
        n.e(dVar);
        return dVar.e();
    }

    public final void D(f fVar) {
        this.f8028H = fVar;
    }

    public final void E() {
        if (this.f8021A) {
            throw new IllegalStateException("Check failed.");
        }
        this.f8021A = true;
        this.f8034v.w();
    }

    @Override // P8.InterfaceC0939e
    public D a() {
        if (!this.f8035w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f8034v.v();
        i();
        try {
            this.f8029q.p().b(this);
            return t();
        } finally {
            this.f8029q.p().g(this);
        }
    }

    @Override // P8.InterfaceC0939e
    public B b() {
        return this.f8030r;
    }

    @Override // P8.InterfaceC0939e
    public void cancel() {
        if (this.f8026F) {
            return;
        }
        this.f8026F = true;
        U8.c cVar = this.f8027G;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f8028H;
        if (fVar != null) {
            fVar.e();
        }
        this.f8033u.f(this);
    }

    public final void e(f connection) {
        n.h(connection, "connection");
        if (!Q8.d.f6932h || Thread.holdsLock(connection)) {
            if (this.f8038z != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f8038z = connection;
            connection.o().add(new b(this, this.f8036x));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // P8.InterfaceC0939e
    public boolean f() {
        return this.f8026F;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f8029q, this.f8030r, this.f8031s);
    }

    public final void l(B request, boolean z9) {
        n.h(request, "request");
        if (this.f8022B != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f8024D) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f8023C) {
                throw new IllegalStateException("Check failed.");
            }
            A a10 = A.f21846a;
        }
        if (z9) {
            this.f8037y = new d(this.f8032t, k(request.j()), this, this.f8033u);
        }
    }

    public final void m(boolean z9) {
        U8.c cVar;
        synchronized (this) {
            if (!this.f8025E) {
                throw new IllegalStateException("released");
            }
            A a10 = A.f21846a;
        }
        if (z9 && (cVar = this.f8027G) != null) {
            cVar.d();
        }
        this.f8022B = null;
    }

    public final z n() {
        return this.f8029q;
    }

    public final f o() {
        return this.f8038z;
    }

    public final r p() {
        return this.f8033u;
    }

    public final boolean q() {
        return this.f8031s;
    }

    public final U8.c r() {
        return this.f8022B;
    }

    public final B s() {
        return this.f8030r;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009f  */
    public final D t() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC1444s.z(arrayList, this.f8029q.x());
        arrayList.add(new V8.j(this.f8029q));
        arrayList.add(new V8.a(this.f8029q.o()));
        this.f8029q.i();
        arrayList.add(new S8.a(null));
        arrayList.add(U8.a.f7988a);
        if (!this.f8031s) {
            AbstractC1444s.z(arrayList, this.f8029q.y());
        }
        arrayList.add(new V8.b(this.f8031s));
        V8.g gVar = new V8.g(this, arrayList, 0, null, this.f8030r, this.f8029q.l(), this.f8029q.G(), this.f8029q.L());
        boolean z9 = false;
        try {
            D dA = gVar.a(this.f8030r);
            if (f()) {
                Q8.d.m(dA);
                throw new IOException("Canceled");
            }
            x(null);
            return dA;
        } catch (IOException e10) {
            try {
                IOException iOExceptionX = x(e10);
                n.f(iOExceptionX, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionX;
            } catch (Throwable th) {
                th = th;
                z9 = true;
                if (!z9) {
                    x(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z9) {
                x(null);
            }
            throw th;
        }
    }

    public final U8.c v(V8.g chain) throws IOException {
        n.h(chain, "chain");
        synchronized (this) {
            if (!this.f8025E) {
                throw new IllegalStateException("released");
            }
            if (this.f8024D) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f8023C) {
                throw new IllegalStateException("Check failed.");
            }
            A a10 = A.f21846a;
        }
        d dVar = this.f8037y;
        n.e(dVar);
        U8.c cVar = new U8.c(this, this.f8033u, dVar, dVar.a(this.f8029q, chain));
        this.f8022B = cVar;
        this.f8027G = cVar;
        synchronized (this) {
            this.f8023C = true;
            this.f8024D = true;
        }
        if (this.f8026F) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException w(U8.c exchange, boolean z9, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        n.h(exchange, "exchange");
        if (n.d(exchange, this.f8027G)) {
            synchronized (this) {
                z11 = false;
                if (z9) {
                    try {
                        if (this.f8023C) {
                            if (z9) {
                                this.f8023C = false;
                            }
                            if (z10) {
                                this.f8024D = false;
                            }
                            z13 = this.f8023C;
                            if (z13) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (!z13) {
                                z11 = true;
                            }
                            z12 = z11;
                            z11 = z14;
                        } else if (z10 || !this.f8024D) {
                            z12 = false;
                        } else {
                            if (z9) {
                                this.f8023C = false;
                            }
                            if (z10) {
                                this.f8024D = false;
                            }
                            z13 = this.f8023C;
                            if (z13 || this.f8024D) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (!z13 && !this.f8024D && !this.f8025E) {
                                z11 = true;
                            }
                            z12 = z11;
                            z11 = z14;
                        }
                        A a10 = A.f21846a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                    A a11 = A.f21846a;
                }
            }
            if (z11) {
                this.f8027G = null;
                f fVar = this.f8038z;
                if (fVar != null) {
                    fVar.t();
                }
            }
            if (z12) {
                return h(iOException);
            }
        }
        return iOException;
    }

    public final IOException x(IOException iOException) {
        boolean z9;
        synchronized (this) {
            try {
                z9 = false;
                if (this.f8025E) {
                    this.f8025E = false;
                    if (!this.f8023C && !this.f8024D) {
                        z9 = true;
                    }
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9 ? h(iOException) : iOException;
    }

    public final String y() {
        return this.f8030r.j().p();
    }
}
