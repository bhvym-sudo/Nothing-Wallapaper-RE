package X8;

import P8.A;
import P8.B;
import P8.D;
import P8.u;
import P8.z;
import e9.C;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements V8.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f9153g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f9154h = Q8.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f9155i = Q8.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U8.f f9156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V8.g f9157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f9158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile i f9159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A f9160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f9161f;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final List a(B request) {
            kotlin.jvm.internal.n.h(request, "request");
            u uVarE = request.e();
            ArrayList arrayList = new ArrayList(uVarE.size() + 4);
            arrayList.add(new c(c.f9043g, request.g()));
            arrayList.add(new c(c.f9044h, V8.i.f8250a.c(request.j())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new c(c.f9046j, strD));
            }
            arrayList.add(new c(c.f9045i, request.j().r()));
            int size = uVarE.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strB = uVarE.b(i10);
                Locale US = Locale.US;
                kotlin.jvm.internal.n.g(US, "US");
                String lowerCase = strB.toLowerCase(US);
                kotlin.jvm.internal.n.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f9154h.contains(lowerCase) || (kotlin.jvm.internal.n.d(lowerCase, "te") && kotlin.jvm.internal.n.d(uVarE.m(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, uVarE.m(i10)));
                }
            }
            return arrayList;
        }

        public final D.a b(u headerBlock, A protocol) throws ProtocolException {
            kotlin.jvm.internal.n.h(headerBlock, "headerBlock");
            kotlin.jvm.internal.n.h(protocol, "protocol");
            u.a aVar = new u.a();
            int size = headerBlock.size();
            V8.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strB = headerBlock.b(i10);
                String strM = headerBlock.m(i10);
                if (kotlin.jvm.internal.n.d(strB, ":status")) {
                    kVarA = V8.k.f8253d.a("HTTP/1.1 " + strM);
                } else if (!g.f9155i.contains(strB)) {
                    aVar.d(strB, strM);
                }
            }
            if (kVarA != null) {
                return new D.a().p(protocol).g(kVarA.f8255b).m(kVarA.f8256c).k(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public g(z client, U8.f connection, V8.g chain, f http2Connection) {
        kotlin.jvm.internal.n.h(client, "client");
        kotlin.jvm.internal.n.h(connection, "connection");
        kotlin.jvm.internal.n.h(chain, "chain");
        kotlin.jvm.internal.n.h(http2Connection, "http2Connection");
        this.f9156a = connection;
        this.f9157b = chain;
        this.f9158c = http2Connection;
        List listC = client.C();
        A a10 = A.H2_PRIOR_KNOWLEDGE;
        this.f9160e = listC.contains(a10) ? a10 : A.HTTP_2;
    }

    @Override // V8.d
    public e9.z a(B request, long j9) {
        kotlin.jvm.internal.n.h(request, "request");
        i iVar = this.f9159d;
        kotlin.jvm.internal.n.e(iVar);
        return iVar.n();
    }

    @Override // V8.d
    public e9.B b(D response) {
        kotlin.jvm.internal.n.h(response, "response");
        i iVar = this.f9159d;
        kotlin.jvm.internal.n.e(iVar);
        return iVar.p();
    }

    @Override // V8.d
    public void c() {
        i iVar = this.f9159d;
        kotlin.jvm.internal.n.e(iVar);
        iVar.n().close();
    }

    @Override // V8.d
    public void cancel() {
        this.f9161f = true;
        i iVar = this.f9159d;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // V8.d
    public long d(D response) {
        kotlin.jvm.internal.n.h(response, "response");
        if (V8.e.b(response)) {
            return Q8.d.v(response);
        }
        return 0L;
    }

    @Override // V8.d
    public D.a e(boolean z9) throws IOException {
        i iVar = this.f9159d;
        if (iVar == null) {
            throw new IOException("stream wasn't created");
        }
        D.a aVarB = f9153g.b(iVar.C(), this.f9160e);
        if (z9 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // V8.d
    public U8.f f() {
        return this.f9156a;
    }

    @Override // V8.d
    public void g() {
        this.f9158c.flush();
    }

    @Override // V8.d
    public void h(B request) throws IOException {
        kotlin.jvm.internal.n.h(request, "request");
        if (this.f9159d != null) {
            return;
        }
        this.f9159d = this.f9158c.l1(f9153g.a(request), request.a() != null);
        if (this.f9161f) {
            i iVar = this.f9159d;
            kotlin.jvm.internal.n.e(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f9159d;
        kotlin.jvm.internal.n.e(iVar2);
        C cV = iVar2.v();
        long jI = this.f9157b.i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cV.g(jI, timeUnit);
        i iVar3 = this.f9159d;
        kotlin.jvm.internal.n.e(iVar3);
        iVar3.E().g(this.f9157b.k(), timeUnit);
    }
}
