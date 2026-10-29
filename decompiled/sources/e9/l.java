package e9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte f20275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final v f20276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Inflater f20277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final m f20278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final CRC32 f20279u;

    public l(B source) {
        kotlin.jvm.internal.n.h(source, "source");
        v vVar = new v(source);
        this.f20276r = vVar;
        Inflater inflater = new Inflater(true);
        this.f20277s = inflater;
        this.f20278t = new m(vVar, inflater);
        this.f20279u = new CRC32();
    }

    private final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + E8.i.o0(AbstractC1347b.i(i11), 8, '0') + " != expected 0x" + E8.i.o0(AbstractC1347b.i(i10), 8, '0'));
    }

    private final void b() throws IOException {
        this.f20276r.Y0(10L);
        byte bU = this.f20276r.f20303r.U(3L);
        boolean z9 = ((bU >> 1) & 1) == 1;
        if (z9) {
            g(this.f20276r.f20303r, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f20276r.readShort());
        this.f20276r.skip(8L);
        if (((bU >> 2) & 1) == 1) {
            this.f20276r.Y0(2L);
            if (z9) {
                g(this.f20276r.f20303r, 0L, 2L);
            }
            long jI0 = this.f20276r.f20303r.I0() & 65535;
            this.f20276r.Y0(jI0);
            if (z9) {
                g(this.f20276r.f20303r, 0L, jI0);
            }
            this.f20276r.skip(jI0);
        }
        if (((bU >> 3) & 1) == 1) {
            long jA = this.f20276r.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z9) {
                g(this.f20276r.f20303r, 0L, jA + 1);
            }
            this.f20276r.skip(jA + 1);
        }
        if (((bU >> 4) & 1) == 1) {
            long jA2 = this.f20276r.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z9) {
                g(this.f20276r.f20303r, 0L, jA2 + 1);
            }
            this.f20276r.skip(jA2 + 1);
        }
        if (z9) {
            a("FHCRC", this.f20276r.u(), (short) this.f20279u.getValue());
            this.f20279u.reset();
        }
    }

    private final void f() throws IOException {
        a("CRC", this.f20276r.j(), (int) this.f20279u.getValue());
        a("ISIZE", this.f20276r.j(), (int) this.f20277s.getBytesWritten());
    }

    private final void g(C1350e c1350e, long j9, long j10) {
        w wVar = c1350e.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        while (true) {
            int i10 = wVar.f20309c;
            int i11 = wVar.f20308b;
            if (j9 < i10 - i11) {
                break;
            }
            j9 -= (long) (i10 - i11);
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
        }
        while (j10 > 0) {
            int i12 = (int) (((long) wVar.f20308b) + j9);
            int iMin = (int) Math.min(wVar.f20309c - i12, j10);
            this.f20279u.update(wVar.f20307a, i12, iMin);
            j10 -= (long) iMin;
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
            j9 = 0;
        }
    }

    @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20278t.close();
    }

    @Override // e9.B
    public C e() {
        return this.f20276r.e();
    }

    @Override // e9.B
    public long e1(C1350e sink, long j9) throws IOException {
        l lVar;
        kotlin.jvm.internal.n.h(sink, "sink");
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (j9 == 0) {
            return 0L;
        }
        if (this.f20275q == 0) {
            b();
            this.f20275q = (byte) 1;
        }
        if (this.f20275q == 1) {
            long jX0 = sink.X0();
            long jE1 = this.f20278t.e1(sink, j9);
            if (jE1 != -1) {
                g(sink, jX0, jE1);
                return jE1;
            }
            lVar = this;
            lVar.f20275q = (byte) 2;
        } else {
            lVar = this;
        }
        if (lVar.f20275q == 2) {
            lVar.f();
            lVar.f20275q = (byte) 3;
            if (!lVar.f20276r.D()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
