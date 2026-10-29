package V8;

import P8.B;
import P8.D;
import P8.InterfaceC0939e;
import P8.w;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U8.e f8238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U8.c f8241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B f8242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8246i;

    public g(U8.e call, List interceptors, int i10, U8.c cVar, B request, int i11, int i12, int i13) {
        n.h(call, "call");
        n.h(interceptors, "interceptors");
        n.h(request, "request");
        this.f8238a = call;
        this.f8239b = interceptors;
        this.f8240c = i10;
        this.f8241d = cVar;
        this.f8242e = request;
        this.f8243f = i11;
        this.f8244g = i12;
        this.f8245h = i13;
    }

    public static /* synthetic */ g e(g gVar, int i10, U8.c cVar, B b10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f8240c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f8241d;
        }
        if ((i14 & 4) != 0) {
            b10 = gVar.f8242e;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.f8243f;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.f8244g;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.f8245h;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.d(i10, cVar, b10, i11, i15, i16);
    }

    @Override // P8.w.a
    public D a(B request) {
        n.h(request, "request");
        if (this.f8240c >= this.f8239b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f8246i++;
        U8.c cVar = this.f8241d;
        if (cVar != null) {
            if (!cVar.j().g(request.j())) {
                throw new IllegalStateException(("network interceptor " + this.f8239b.get(this.f8240c - 1) + " must retain the same host and port").toString());
            }
            if (this.f8246i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f8239b.get(this.f8240c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarE = e(this, this.f8240c + 1, null, request, 0, 0, 0, 58, null);
        w wVar = (w) this.f8239b.get(this.f8240c);
        D dA = wVar.a(gVarE);
        if (dA == null) {
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        if (this.f8241d != null && this.f8240c + 1 < this.f8239b.size() && gVarE.f8246i != 1) {
            throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
        }
        if (dA.a() != null) {
            return dA;
        }
        throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
    }

    @Override // P8.w.a
    public B b() {
        return this.f8242e;
    }

    @Override // P8.w.a
    public P8.j c() {
        U8.c cVar = this.f8241d;
        if (cVar != null) {
            return cVar.h();
        }
        return null;
    }

    @Override // P8.w.a
    public InterfaceC0939e call() {
        return this.f8238a;
    }

    public final g d(int i10, U8.c cVar, B request, int i11, int i12, int i13) {
        n.h(request, "request");
        return new g(this.f8238a, this.f8239b, i10, cVar, request, i11, i12, i13);
    }

    public final U8.e f() {
        return this.f8238a;
    }

    public final int g() {
        return this.f8243f;
    }

    public final U8.c h() {
        return this.f8241d;
    }

    public final int i() {
        return this.f8244g;
    }

    public final B j() {
        return this.f8242e;
    }

    public final int k() {
        return this.f8245h;
    }

    public int l() {
        return this.f8244g;
    }
}
