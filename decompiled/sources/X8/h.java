package X8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import e9.B;
import e9.C;
import e9.C1350e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f9162u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f9163v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e9.g f9164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f9165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b f9166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d.a f9167t;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Logger a() {
            return h.f9163v;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    public static final class b implements B {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final e9.g f9168q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f9169r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f9170s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f9171t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f9172u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f9173v;

        public b(e9.g source) {
            kotlin.jvm.internal.n.h(source, "source");
            this.f9168q = source;
        }

        private final void b() throws IOException {
            int i10 = this.f9171t;
            int iJ = Q8.d.J(this.f9168q);
            this.f9172u = iJ;
            this.f9169r = iJ;
            int iD = Q8.d.d(this.f9168q.readByte(), 255);
            this.f9170s = Q8.d.d(this.f9168q.readByte(), 255);
            a aVar = h.f9162u;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f9071a.c(true, this.f9171t, this.f9169r, iD, this.f9170s));
            }
            int i11 = this.f9168q.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f9171t = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        public final int a() {
            return this.f9172u;
        }

        @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // e9.B
        public C e() {
            return this.f9168q.e();
        }

        @Override // e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            kotlin.jvm.internal.n.h(sink, "sink");
            while (true) {
                int i10 = this.f9172u;
                if (i10 != 0) {
                    long jE1 = this.f9168q.e1(sink, Math.min(j9, i10));
                    if (jE1 == -1) {
                        return -1L;
                    }
                    this.f9172u -= (int) jE1;
                    return jE1;
                }
                this.f9168q.skip(this.f9173v);
                this.f9173v = 0;
                if ((this.f9170s & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final void f(int i10) {
            this.f9170s = i10;
        }

        public final void g(int i10) {
            this.f9172u = i10;
        }

        public final void j(int i10) {
            this.f9169r = i10;
        }

        public final void u(int i10) {
            this.f9173v = i10;
        }

        public final void z(int i10) {
            this.f9171t = i10;
        }
    }

    public interface c {
        void a();

        void b(boolean z9, int i10, int i11, List list);

        void d(int i10, X8.b bVar);

        void g(int i10, long j9);

        void h(int i10, X8.b bVar, e9.h hVar);

        void i(boolean z9, m mVar);

        void k(boolean z9, int i10, int i11);

        void l(int i10, int i11, int i12, boolean z9);

        void m(int i10, int i11, List list);

        void o(boolean z9, int i10, e9.g gVar, int i11);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        kotlin.jvm.internal.n.g(logger, "getLogger(Http2::class.java.name)");
        f9163v = logger;
    }

    public h(e9.g source, boolean z9) {
        kotlin.jvm.internal.n.h(source, "source");
        this.f9164q = source;
        this.f9165r = z9;
        b bVar = new b(source);
        this.f9166s = bVar;
        this.f9167t = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void B(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.k((i11 & 1) != 0, this.f9164q.readInt(), this.f9164q.readInt());
    }

    private final void G(c cVar, int i10) {
        int i11 = this.f9164q.readInt();
        cVar.l(i10, i11 & SubsamplingScaleImageView.TILE_SIZE_AUTO, Q8.d.d(this.f9164q.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    private final void I(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            G(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void K(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i11 & 8) != 0 ? Q8.d.d(this.f9164q.readByte(), 255) : 0;
        cVar.m(i12, this.f9164q.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO, u(f9162u.b(i10 - 4, i11, iD), iD, i11, i12));
    }

    private final void Q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f9164q.readInt();
        X8.b bVarA = X8.b.f9030r.a(i13);
        if (bVarA != null) {
            cVar.d(i12, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    private final void U(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.a();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        m mVar = new m();
        B8.e eVarP = B8.h.p(B8.h.q(0, i10), 6);
        int iG = eVarP.g();
        int iM = eVarP.m();
        int iN = eVarP.n();
        if ((iN > 0 && iG <= iM) || (iN < 0 && iM <= iG)) {
            while (true) {
                int iE = Q8.d.e(this.f9164q.readShort(), 65535);
                int i13 = this.f9164q.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i13 < 16384 || i13 > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iE, i13);
                if (iG != iM) {
                    iG += iN;
                }
            }
        }
        cVar.i(false, mVar);
    }

    private final void Y(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long jF = Q8.d.f(this.f9164q.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.g(i12, jF);
    }

    private final void g(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z9 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i11 & 8) != 0 ? Q8.d.d(this.f9164q.readByte(), 255) : 0;
        cVar.o(z9, i12, this.f9164q, f9162u.b(i10, i11, iD));
        this.f9164q.skip(iD);
    }

    private final void j(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f9164q.readInt();
        int i14 = this.f9164q.readInt();
        int i15 = i10 - 8;
        X8.b bVarA = X8.b.f9030r.a(i14);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        e9.h hVarN = e9.h.f20268u;
        if (i15 > 0) {
            hVarN = this.f9164q.n(i15);
        }
        cVar.h(i13, bVarA, hVarN);
    }

    private final List u(int i10, int i11, int i12, int i13) throws IOException {
        this.f9166s.g(i10);
        b bVar = this.f9166s;
        bVar.j(bVar.a());
        this.f9166s.u(i11);
        this.f9166s.f(i12);
        this.f9166s.z(i13);
        this.f9167t.k();
        return this.f9167t.e();
    }

    private final void z(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z9 = (i11 & 1) != 0;
        int iD = (i11 & 8) != 0 ? Q8.d.d(this.f9164q.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            G(cVar, i12);
            i10 -= 5;
        }
        cVar.b(z9, i12, -1, u(f9162u.b(i10, i11, iD), iD, i11, i12));
    }

    public final boolean b(boolean z9, c handler) throws IOException {
        kotlin.jvm.internal.n.h(handler, "handler");
        try {
            this.f9164q.Y0(9L);
            int iJ = Q8.d.J(this.f9164q);
            if (iJ > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iJ);
            }
            int iD = Q8.d.d(this.f9164q.readByte(), 255);
            int iD2 = Q8.d.d(this.f9164q.readByte(), 255);
            int i10 = this.f9164q.readInt() & SubsamplingScaleImageView.TILE_SIZE_AUTO;
            Logger logger = f9163v;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f9071a.c(true, i10, iJ, iD, iD2));
            }
            if (z9 && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f9071a.b(iD));
            }
            switch (iD) {
                case 0:
                    g(handler, iJ, iD2, i10);
                    return true;
                case 1:
                    z(handler, iJ, iD2, i10);
                    return true;
                case 2:
                    I(handler, iJ, iD2, i10);
                    return true;
                case 3:
                    Q(handler, iJ, iD2, i10);
                    return true;
                case 4:
                    U(handler, iJ, iD2, i10);
                    return true;
                case 5:
                    K(handler, iJ, iD2, i10);
                    return true;
                case 6:
                    B(handler, iJ, iD2, i10);
                    return true;
                case 7:
                    j(handler, iJ, iD2, i10);
                    return true;
                case 8:
                    Y(handler, iJ, iD2, i10);
                    return true;
                default:
                    this.f9164q.skip(iJ);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9164q.close();
    }

    public final void f(c handler) throws IOException {
        kotlin.jvm.internal.n.h(handler, "handler");
        if (this.f9165r) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        e9.g gVar = this.f9164q;
        e9.h hVar = e.f9072b;
        e9.h hVarN = gVar.n(hVar.v());
        Logger logger = f9163v;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Q8.d.t("<< CONNECTION " + hVarN.n(), new Object[0]));
        }
        if (kotlin.jvm.internal.n.d(hVar, hVarN)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarN.y());
    }
}
