package g9;

import P8.D;
import P8.E;
import P8.InterfaceC0939e;
import P8.InterfaceC0940f;
import e9.C1350e;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class q implements d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final w f21421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f21422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object[] f21423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC0939e.a f21424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f21425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f21426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private InterfaceC0939e f21427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Throwable f21428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f21429y;

    class a implements InterfaceC0940f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f21430a;

        a(f fVar) {
            this.f21430a = fVar;
        }

        private void c(Throwable th) {
            try {
                this.f21430a.a(q.this, th);
            } catch (Throwable th2) {
                C.t(th2);
                th2.printStackTrace();
            }
        }

        @Override // P8.InterfaceC0940f
        public void a(InterfaceC0939e interfaceC0939e, D d10) {
            try {
                try {
                    this.f21430a.b(q.this, q.this.h(d10));
                } catch (Throwable th) {
                    C.t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C.t(th2);
                c(th2);
            }
        }

        @Override // P8.InterfaceC0940f
        public void b(InterfaceC0939e interfaceC0939e, IOException iOException) {
            c(iOException);
        }
    }

    static final class b extends E {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final E f21432s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final e9.g f21433t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        IOException f21434u;

        class a extends e9.j {
            a(e9.B b10) {
                super(b10);
            }

            @Override // e9.j, e9.B
            public long e1(C1350e c1350e, long j9) throws IOException {
                try {
                    return super.e1(c1350e, j9);
                } catch (IOException e10) {
                    b.this.f21434u = e10;
                    throw e10;
                }
            }
        }

        b(E e10) {
            this.f21432s = e10;
            this.f21433t = e9.o.d(new a(e10.u()));
        }

        @Override // P8.E, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21432s.close();
        }

        @Override // P8.E
        public long f() {
            return this.f21432s.f();
        }

        @Override // P8.E
        public P8.x g() {
            return this.f21432s.g();
        }

        @Override // P8.E
        public e9.g u() {
            return this.f21433t;
        }

        void z() throws IOException {
            IOException iOException = this.f21434u;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class c extends E {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final P8.x f21436s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f21437t;

        c(P8.x xVar, long j9) {
            this.f21436s = xVar;
            this.f21437t = j9;
        }

        @Override // P8.E
        public long f() {
            return this.f21437t;
        }

        @Override // P8.E
        public P8.x g() {
            return this.f21436s;
        }

        @Override // P8.E
        public e9.g u() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    q(w wVar, Object obj, Object[] objArr, InterfaceC0939e.a aVar, h hVar) {
        this.f21421q = wVar;
        this.f21422r = obj;
        this.f21423s = objArr;
        this.f21424t = aVar;
        this.f21425u = hVar;
    }

    private InterfaceC0939e d() {
        InterfaceC0939e interfaceC0939eC = this.f21424t.c(this.f21421q.a(this.f21422r, this.f21423s));
        if (interfaceC0939eC != null) {
            return interfaceC0939eC;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private InterfaceC0939e e() throws IOException {
        InterfaceC0939e interfaceC0939e = this.f21427w;
        if (interfaceC0939e != null) {
            return interfaceC0939e;
        }
        Throwable th = this.f21428x;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC0939e interfaceC0939eD = d();
            this.f21427w = interfaceC0939eD;
            return interfaceC0939eD;
        } catch (IOException | Error | RuntimeException e10) {
            C.t(e10);
            this.f21428x = e10;
            throw e10;
        }
    }

    @Override // g9.d
    public x a() {
        InterfaceC0939e interfaceC0939eE;
        synchronized (this) {
            if (this.f21429y) {
                throw new IllegalStateException("Already executed.");
            }
            this.f21429y = true;
            interfaceC0939eE = e();
        }
        if (this.f21426v) {
            interfaceC0939eE.cancel();
        }
        return h(interfaceC0939eE.a());
    }

    @Override // g9.d
    public synchronized P8.B b() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return e().b();
    }

    @Override // g9.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public q clone() {
        return new q(this.f21421q, this.f21422r, this.f21423s, this.f21424t, this.f21425u);
    }

    @Override // g9.d
    public void cancel() {
        InterfaceC0939e interfaceC0939e;
        this.f21426v = true;
        synchronized (this) {
            interfaceC0939e = this.f21427w;
        }
        if (interfaceC0939e != null) {
            interfaceC0939e.cancel();
        }
    }

    @Override // g9.d
    public boolean f() {
        boolean z9 = true;
        if (this.f21426v) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC0939e interfaceC0939e = this.f21427w;
                if (interfaceC0939e == null || !interfaceC0939e.f()) {
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }

    @Override // g9.d
    public void g(f fVar) {
        InterfaceC0939e interfaceC0939e;
        Throwable th;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f21429y) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f21429y = true;
                interfaceC0939e = this.f21427w;
                th = this.f21428x;
                if (interfaceC0939e == null && th == null) {
                    try {
                        InterfaceC0939e interfaceC0939eD = d();
                        this.f21427w = interfaceC0939eD;
                        interfaceC0939e = interfaceC0939eD;
                    } catch (Throwable th2) {
                        th = th2;
                        C.t(th);
                        this.f21428x = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            fVar.a(this, th);
            return;
        }
        if (this.f21426v) {
            interfaceC0939e.cancel();
        }
        interfaceC0939e.B(new a(fVar));
    }

    x h(D d10) throws IOException {
        E eA = d10.a();
        D dC = d10.U().b(new c(eA.g(), eA.f())).c();
        int iJ = dC.j();
        if (iJ < 200 || iJ >= 300) {
            try {
                return x.c(C.a(eA), dC);
            } finally {
                eA.close();
            }
        }
        if (iJ == 204 || iJ == 205) {
            eA.close();
            return x.f(null, dC);
        }
        b bVar = new b(eA);
        try {
            return x.f(this.f21425u.a(bVar), dC);
        } catch (RuntimeException e10) {
            bVar.z();
            throw e10;
        }
    }
}
