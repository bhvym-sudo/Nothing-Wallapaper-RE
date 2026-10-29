package P8;

import e9.C1350e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f6407g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f6408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f6409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f6410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x f6411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x f6412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f6413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f6414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f6415o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e9.h f6416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f6417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f6419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6420f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e9.h f6421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f6422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f6423c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(u uVar, C body) {
            kotlin.jvm.internal.n.h(body, "body");
            b(c.f6424c.a(uVar, body));
            return this;
        }

        public final a b(c part) {
            kotlin.jvm.internal.n.h(part, "part");
            this.f6423c.add(part);
            return this;
        }

        public final y c() {
            if (this.f6423c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new y(this.f6421a, this.f6422b, Q8.d.S(this.f6423c));
        }

        public final a d(x type) {
            kotlin.jvm.internal.n.h(type, "type");
            if (kotlin.jvm.internal.n.d(type.f(), "multipart")) {
                this.f6422b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            kotlin.jvm.internal.n.h(boundary, "boundary");
            this.f6421a = e9.h.f20267t.c(boundary);
            this.f6422b = y.f6408h;
            this.f6423c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, AbstractC1457h abstractC1457h) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                kotlin.jvm.internal.n.g(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6424c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f6425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f6426b;

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final c a(u uVar, C body) {
                kotlin.jvm.internal.n.h(body, "body");
                AbstractC1457h abstractC1457h = null;
                if ((uVar != null ? uVar.a("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((uVar != null ? uVar.a("Content-Length") : null) == null) {
                    return new c(uVar, body, abstractC1457h);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            private a() {
            }
        }

        public /* synthetic */ c(u uVar, C c10, AbstractC1457h abstractC1457h) {
            this(uVar, c10);
        }

        public final C a() {
            return this.f6426b;
        }

        public final u b() {
            return this.f6425a;
        }

        private c(u uVar, C c10) {
            this.f6425a = uVar;
            this.f6426b = c10;
        }
    }

    static {
        x.a aVar = x.f6400e;
        f6408h = aVar.a("multipart/mixed");
        f6409i = aVar.a("multipart/alternative");
        f6410j = aVar.a("multipart/digest");
        f6411k = aVar.a("multipart/parallel");
        f6412l = aVar.a("multipart/form-data");
        f6413m = new byte[]{58, 32};
        f6414n = new byte[]{13, 10};
        f6415o = new byte[]{45, 45};
    }

    public y(e9.h boundaryByteString, x type, List parts) {
        kotlin.jvm.internal.n.h(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.n.h(type, "type");
        kotlin.jvm.internal.n.h(parts, "parts");
        this.f6416b = boundaryByteString;
        this.f6417c = type;
        this.f6418d = parts;
        this.f6419e = x.f6400e.a(type + "; boundary=" + h());
        this.f6420f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long i(e9.f fVar, boolean z9) throws EOFException {
        C1350e c1350e;
        if (z9) {
            fVar = new C1350e();
            c1350e = fVar;
        } else {
            c1350e = 0;
        }
        int size = this.f6418d.size();
        long j9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f6418d.get(i10);
            u uVarB = cVar.b();
            C cA = cVar.a();
            kotlin.jvm.internal.n.e(fVar);
            fVar.G0(f6415o);
            fVar.s0(this.f6416b);
            fVar.G0(f6414n);
            if (uVarB != null) {
                int size2 = uVarB.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    fVar.d0(uVarB.b(i11)).G0(f6413m).d0(uVarB.m(i11)).G0(f6414n);
                }
            }
            x xVarB = cA.b();
            if (xVarB != null) {
                fVar.d0("Content-Type: ").d0(xVarB.toString()).G0(f6414n);
            }
            long jA = cA.a();
            if (jA != -1) {
                fVar.d0("Content-Length: ").Z0(jA).G0(f6414n);
            } else if (z9) {
                kotlin.jvm.internal.n.e(c1350e);
                c1350e.j();
                return -1L;
            }
            byte[] bArr = f6414n;
            fVar.G0(bArr);
            if (z9) {
                j9 += jA;
            } else {
                cA.g(fVar);
            }
            fVar.G0(bArr);
        }
        kotlin.jvm.internal.n.e(fVar);
        byte[] bArr2 = f6415o;
        fVar.G0(bArr2);
        fVar.s0(this.f6416b);
        fVar.G0(bArr2);
        fVar.G0(f6414n);
        if (!z9) {
            return j9;
        }
        kotlin.jvm.internal.n.e(c1350e);
        long jX0 = j9 + c1350e.X0();
        c1350e.j();
        return jX0;
    }

    @Override // P8.C
    public long a() throws EOFException {
        long j9 = this.f6420f;
        if (j9 != -1) {
            return j9;
        }
        long jI = i(null, true);
        this.f6420f = jI;
        return jI;
    }

    @Override // P8.C
    public x b() {
        return this.f6419e;
    }

    @Override // P8.C
    public void g(e9.f sink) throws EOFException {
        kotlin.jvm.internal.n.h(sink, "sink");
        i(sink, false);
    }

    public final String h() {
        return this.f6416b.y();
    }
}
