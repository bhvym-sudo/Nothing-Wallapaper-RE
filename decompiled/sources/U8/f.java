package U8;

import P8.A;
import P8.B;
import P8.C0935a;
import P8.C0941g;
import P8.D;
import P8.F;
import P8.InterfaceC0939e;
import P8.l;
import P8.r;
import P8.t;
import P8.v;
import P8.z;
import X8.m;
import e9.C;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends X8.f.c implements P8.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f8044t = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f8045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f8046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f8047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Socket f8048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f8049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private A f8050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private X8.f f8051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e9.g f8052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e9.f f8053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f8060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f8061s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8062a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8062a = iArr;
        }
    }

    static final class c extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ C0941g f8063r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ t f8064s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C0935a f8065t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0941g c0941g, t tVar, C0935a c0935a) {
            super(0);
            this.f8063r = c0941g;
            this.f8064s = tVar;
            this.f8065t = c0935a;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            c9.c cVarD = this.f8063r.d();
            n.e(cVarD);
            return cVarD.a(this.f8064s.d(), this.f8065t.l().i());
        }
    }

    static final class d extends o implements p219v8.a {
        d() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            t tVar = f.this.f8049g;
            n.e(tVar);
            List<Certificate> listD = tVar.d();
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(listD, 10));
            for (Certificate certificate : listD) {
                n.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public f(g connectionPool, F route) {
        n.h(connectionPool, "connectionPool");
        n.h(route, "route");
        this.f8045c = connectionPool;
        this.f8046d = route;
        this.f8059q = 1;
        this.f8060r = new ArrayList();
        this.f8061s = Long.MAX_VALUE;
    }

    private final boolean B(List list) {
        List<F> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (F f10 : list2) {
            Proxy.Type type = f10.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f8046d.b().type() == type2 && n.d(this.f8046d.d(), f10.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i10) throws SocketException {
        Socket socket = this.f8048f;
        n.e(socket);
        e9.g gVar = this.f8052j;
        n.e(gVar);
        e9.f fVar = this.f8053k;
        n.e(fVar);
        socket.setSoTimeout(0);
        X8.f fVarA = new X8.f.a(true, T8.e.f7738i).q(socket, this.f8046d.a().l().i(), gVar, fVar).k(this).l(i10).a();
        this.f8051i = fVarA;
        this.f8059q = X8.f.f9076S.a().d();
        X8.f.x1(fVarA, false, null, 3, null);
    }

    private final boolean G(v vVar) {
        t tVar;
        if (Q8.d.f6932h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        v vVarL = this.f8046d.a().l();
        if (vVar.n() != vVarL.n()) {
            return false;
        }
        if (n.d(vVar.i(), vVarL.i())) {
            return true;
        }
        if (!this.f8055m && (tVar = this.f8049g) != null) {
            n.e(tVar);
            if (f(vVar, tVar)) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(v vVar, t tVar) {
        List listD = tVar.d();
        if (!listD.isEmpty()) {
            c9.d dVar = c9.d.f15254a;
            String strI = vVar.i();
            Object obj = listD.get(0);
            n.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strI, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void i(int i10, int i11, InterfaceC0939e interfaceC0939e, r rVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f8046d.b();
        C0935a c0935aA = this.f8046d.a();
        Proxy.Type type = proxyB.type();
        int i12 = type == null ? -1 : b.f8062a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c0935aA.j().createSocket();
            n.e(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.f8047e = socketCreateSocket;
        rVar.i(interfaceC0939e, this.f8046d.d(), proxyB);
        socketCreateSocket.setSoTimeout(i11);
        try {
            Z8.h.f9546a.g().f(socketCreateSocket, this.f8046d.d(), i10);
            try {
                this.f8052j = e9.o.d(e9.o.l(socketCreateSocket));
                this.f8053k = e9.o.c(e9.o.h(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (n.d(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f8046d.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void j(U8.b bVar) throws Throwable {
        C0935a c0935aA = this.f8046d.a();
        SSLSocketFactory sSLSocketFactoryK = c0935aA.k();
        SSLSocket sSLSocket = null;
        try {
            n.e(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f8047e, c0935aA.l().i(), c0935aA.l().n(), true);
            n.f(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    Z8.h.f9546a.g().e(sSLSocket2, c0935aA.l().i(), c0935aA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                t.a aVar = t.f6369e;
                n.g(sslSocketSession, "sslSocketSession");
                t tVarA = aVar.a(sslSocketSession);
                HostnameVerifier hostnameVerifierE = c0935aA.e();
                n.e(hostnameVerifierE);
                if (hostnameVerifierE.verify(c0935aA.l().i(), sslSocketSession)) {
                    C0941g c0941gA = c0935aA.a();
                    n.e(c0941gA);
                    this.f8049g = new t(tVarA.e(), tVarA.a(), tVarA.c(), new c(c0941gA, tVarA, c0935aA));
                    c0941gA.b(c0935aA.l().i(), new d());
                    String strG = lVarA.h() ? Z8.h.f9546a.g().g(sSLSocket2) : null;
                    this.f8048f = sSLSocket2;
                    this.f8052j = e9.o.d(e9.o.l(sSLSocket2));
                    this.f8053k = e9.o.c(e9.o.h(sSLSocket2));
                    this.f8050h = strG != null ? A.f6070r.a(strG) : A.HTTP_1_1;
                    Z8.h.f9546a.g().b(sSLSocket2);
                    return;
                }
                List listD = tVarA.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0935aA.l().i() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                n.f(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                throw new SSLPeerUnverifiedException(E8.i.l("\n              |Hostname " + c0935aA.l().i() + " not verified:\n              |    certificate: " + C0941g.f6183c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + c9.d.f15254a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Z8.h.f9546a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    Q8.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void k(int i10, int i11, int i12, InterfaceC0939e interfaceC0939e, r rVar) throws IOException {
        B bM = m();
        v vVarJ = bM.j();
        for (int i13 = 0; i13 < 21; i13++) {
            i(i10, i11, interfaceC0939e, rVar);
            bM = l(i11, i12, bM, vVarJ);
            if (bM == null) {
                return;
            }
            Socket socket = this.f8047e;
            if (socket != null) {
                Q8.d.n(socket);
            }
            this.f8047e = null;
            this.f8053k = null;
            this.f8052j = null;
            rVar.g(interfaceC0939e, this.f8046d.d(), this.f8046d.b(), null);
        }
    }

    private final B l(int i10, int i11, B b10, v vVar) throws IOException {
        String str = "CONNECT " + Q8.d.Q(vVar, true) + " HTTP/1.1";
        while (true) {
            e9.g gVar = this.f8052j;
            n.e(gVar);
            e9.f fVar = this.f8053k;
            n.e(fVar);
            W8.b bVar = new W8.b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.e().g(i10, timeUnit);
            fVar.e().g(i11, timeUnit);
            bVar.A(b10.e(), str);
            bVar.c();
            D.a aVarE = bVar.e(false);
            n.e(aVarE);
            D dC = aVarE.r(b10).c();
            bVar.z(dC);
            int iJ = dC.j();
            if (iJ == 200) {
                if (gVar.d().D() && fVar.d().D()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iJ != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + dC.j());
            }
            B bA = this.f8046d.a().h().a(this.f8046d, dC);
            if (bA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (E8.i.B("close", D.G(dC, "Connection", null, 2, null), true)) {
                return bA;
            }
            b10 = bA;
        }
    }

    private final B m() {
        B b10 = new B.a().h(this.f8046d.a().l()).e("CONNECT", null).c("Host", Q8.d.Q(this.f8046d.a().l(), true)).c("Proxy-Connection", "Keep-Alive").c("User-Agent", "okhttp/4.12.0").b();
        B bA = this.f8046d.a().h().a(this.f8046d, new D.a().r(b10).p(A.HTTP_1_1).g(407).m("Preemptive Authenticate").b(Q8.d.f6927c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return bA == null ? b10 : bA;
    }

    private final void n(U8.b bVar, int i10, InterfaceC0939e interfaceC0939e, r rVar) throws Throwable {
        if (this.f8046d.a().k() != null) {
            rVar.B(interfaceC0939e);
            j(bVar);
            rVar.A(interfaceC0939e, this.f8049g);
            if (this.f8050h == A.HTTP_2) {
                F(i10);
                return;
            }
            return;
        }
        List listF = this.f8046d.a().f();
        A a10 = A.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(a10)) {
            this.f8048f = this.f8047e;
            this.f8050h = A.HTTP_1_1;
        } else {
            this.f8048f = this.f8047e;
            this.f8050h = a10;
            F(i10);
        }
    }

    public F A() {
        return this.f8046d;
    }

    public final void C(long j9) {
        this.f8061s = j9;
    }

    public final void D(boolean z9) {
        this.f8054l = z9;
    }

    public Socket E() {
        Socket socket = this.f8048f;
        n.e(socket);
        return socket;
    }

    public final synchronized void H(e call, IOException iOException) {
        try {
            n.h(call, "call");
            if (iOException instanceof X8.n) {
                if (((X8.n) iOException).f9223q == X8.b.REFUSED_STREAM) {
                    int i10 = this.f8058p + 1;
                    this.f8058p = i10;
                    if (i10 > 1) {
                        this.f8054l = true;
                        this.f8056n++;
                    }
                } else if (((X8.n) iOException).f9223q != X8.b.CANCEL || !call.f()) {
                    this.f8054l = true;
                    this.f8056n++;
                }
            } else if (!w() || (iOException instanceof X8.a)) {
                this.f8054l = true;
                if (this.f8057o == 0) {
                    if (iOException != null) {
                        h(call.n(), this.f8046d, iOException);
                    }
                    this.f8056n++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // P8.j
    public A a() {
        A a10 = this.f8050h;
        n.e(a10);
        return a10;
    }

    @Override // X8.f.c
    public synchronized void b(X8.f connection, m settings) {
        n.h(connection, "connection");
        n.h(settings, "settings");
        this.f8059q = settings.d();
    }

    @Override // X8.f.c
    public void c(X8.i stream) {
        n.h(stream, "stream");
        stream.d(X8.b.REFUSED_STREAM, null);
    }

    public final void e() {
        Socket socket = this.f8047e;
        if (socket != null) {
            Q8.d.n(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139 A[LOOP:0: B:69:0x0092->B:61:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x013f A[SYNTHETIC] */
    public final void g(int i10, int i11, int i12, int i13, boolean z9, InterfaceC0939e interfaceC0939e, r rVar) throws Throwable {
        IOException iOException;
        Socket socket;
        Socket socket2;
        InterfaceC0939e call = interfaceC0939e;
        r eventListener = rVar;
        n.h(call, "call");
        n.h(eventListener, "eventListener");
        if (this.f8050h != null) {
            throw new IllegalStateException("already connected");
        }
        List listB = this.f8046d.a().b();
        U8.b bVar = new U8.b(listB);
        if (this.f8046d.a().k() == null) {
            if (!listB.contains(l.f6323k)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strI = this.f8046d.a().l().i();
            if (!Z8.h.f9546a.g().i(strI)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication to " + strI + " not permitted by network security policy"));
            }
        } else if (this.f8046d.a().f().contains(A.H2_PRIOR_KNOWLEDGE)) {
            throw new i(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        i iVar = null;
        while (true) {
            try {
                if (this.f8046d.c()) {
                    r rVar2 = eventListener;
                    InterfaceC0939e interfaceC0939e2 = call;
                    try {
                        k(i10, i11, i12, interfaceC0939e2, rVar2);
                        call = interfaceC0939e2;
                        eventListener = rVar2;
                        try {
                            if (this.f8047e != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            iOException = e;
                            socket = this.f8048f;
                            if (socket != null) {
                                Q8.d.n(socket);
                            }
                            socket2 = this.f8047e;
                            if (socket2 != null) {
                                Q8.d.n(socket2);
                            }
                            this.f8048f = null;
                            this.f8047e = null;
                            this.f8052j = null;
                            this.f8053k = null;
                            this.f8049g = null;
                            this.f8050h = null;
                            this.f8051i = null;
                            this.f8059q = 1;
                            eventListener.h(call, this.f8046d.d(), this.f8046d.b(), null, iOException);
                            if (iVar == null) {
                                iVar = new i(iOException);
                            } else {
                                iVar.a(iOException);
                            }
                            if (z9) {
                                throw iVar;
                            }
                            if (bVar.b(iOException)) {
                                throw iVar;
                            }
                            call = interfaceC0939e;
                            eventListener = rVar;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        call = interfaceC0939e2;
                        eventListener = rVar2;
                    }
                } else {
                    i(i10, i11, call, eventListener);
                }
                try {
                    n(bVar, i13, call, eventListener);
                    eventListener.g(call, this.f8046d.d(), this.f8046d.b(), this.f8050h);
                    break;
                } catch (IOException e12) {
                    e = e12;
                    iOException = e;
                    socket = this.f8048f;
                    if (socket != null) {
                        Q8.d.n(socket);
                    }
                    socket2 = this.f8047e;
                    if (socket2 != null) {
                        Q8.d.n(socket2);
                    }
                    this.f8048f = null;
                    this.f8047e = null;
                    this.f8052j = null;
                    this.f8053k = null;
                    this.f8049g = null;
                    this.f8050h = null;
                    this.f8051i = null;
                    this.f8059q = 1;
                    eventListener.h(call, this.f8046d.d(), this.f8046d.b(), null, iOException);
                    if (iVar == null) {
                        iVar = new i(iOException);
                    } else {
                        iVar.a(iOException);
                    }
                    if (z9) {
                        throw iVar;
                    }
                    if (bVar.b(iOException)) {
                        throw iVar;
                    }
                    call = interfaceC0939e;
                    eventListener = rVar;
                }
            } catch (IOException e13) {
                e = e13;
            }
            call = interfaceC0939e;
            eventListener = rVar;
        }
        if (this.f8046d.c() && this.f8047e == null) {
            throw new i(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f8061s = System.nanoTime();
    }

    public final void h(z client, F failedRoute, IOException failure) {
        n.h(client, "client");
        n.h(failedRoute, "failedRoute");
        n.h(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            C0935a c0935aA = failedRoute.a();
            c0935aA.i().connectFailed(c0935aA.l().s(), failedRoute.b().address(), failure);
        }
        client.v().b(failedRoute);
    }

    public final List o() {
        return this.f8060r;
    }

    public final long p() {
        return this.f8061s;
    }

    public final boolean q() {
        return this.f8054l;
    }

    public final int r() {
        return this.f8056n;
    }

    public t s() {
        return this.f8049g;
    }

    public final synchronized void t() {
        this.f8057o++;
    }

    public String toString() {
        Object objA;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f8046d.a().l().i());
        sb.append(':');
        sb.append(this.f8046d.a().l().n());
        sb.append(", proxy=");
        sb.append(this.f8046d.b());
        sb.append(" hostAddress=");
        sb.append(this.f8046d.d());
        sb.append(" cipherSuite=");
        t tVar = this.f8049g;
        if (tVar == null || (objA = tVar.a()) == null) {
            objA = "none";
        }
        sb.append(objA);
        sb.append(" protocol=");
        sb.append(this.f8050h);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(C0935a address, List list) {
        n.h(address, "address");
        if (Q8.d.f6932h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f8060r.size() >= this.f8059q || this.f8054l || !this.f8046d.a().d(address)) {
            return false;
        }
        if (n.d(address.l().i(), A().a().l().i())) {
            return true;
        }
        if (this.f8051i == null || list == null || !B(list) || address.e() != c9.d.f15254a || !G(address.l())) {
            return false;
        }
        try {
            C0941g c0941gA = address.a();
            n.e(c0941gA);
            String strI = address.l().i();
            t tVarS = s();
            n.e(tVarS);
            c0941gA.a(strI, tVarS.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean v(boolean z9) {
        long j9;
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f8047e;
        n.e(socket);
        Socket socket2 = this.f8048f;
        n.e(socket2);
        e9.g gVar = this.f8052j;
        n.e(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        X8.f fVar = this.f8051i;
        if (fVar != null) {
            return fVar.j1(jNanoTime);
        }
        synchronized (this) {
            j9 = jNanoTime - this.f8061s;
        }
        if (j9 < 10000000000L || !z9) {
            return true;
        }
        return Q8.d.F(socket2, gVar);
    }

    public final boolean w() {
        return this.f8051i != null;
    }

    public final V8.d x(z client, V8.g chain) throws SocketException {
        n.h(client, "client");
        n.h(chain, "chain");
        Socket socket = this.f8048f;
        n.e(socket);
        e9.g gVar = this.f8052j;
        n.e(gVar);
        e9.f fVar = this.f8053k;
        n.e(fVar);
        X8.f fVar2 = this.f8051i;
        if (fVar2 != null) {
            return new X8.g(client, this, chain, fVar2);
        }
        socket.setSoTimeout(chain.l());
        C cE = gVar.e();
        long jI = chain.i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cE.g(jI, timeUnit);
        fVar.e().g(chain.k(), timeUnit);
        return new W8.b(client, this, gVar, fVar);
    }

    public final synchronized void y() {
        this.f8055m = true;
    }

    public final synchronized void z() {
        this.f8054l = true;
    }
}
