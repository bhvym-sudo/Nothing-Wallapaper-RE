package e9;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B f20302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1350e f20303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20304s;

    public v(B source) {
        kotlin.jvm.internal.n.h(source, "source");
        this.f20302q = source;
        this.f20303r = new C1350e();
    }

    @Override // e9.g
    public byte[] C0(long j9) throws EOFException {
        Y0(j9);
        return this.f20303r.C0(j9);
    }

    @Override // e9.g
    public boolean D() {
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        return this.f20303r.D() && this.f20302q.e1(this.f20303r, 8192L) == -1;
    }

    @Override // e9.g
    public int M0(r options) throws EOFException {
        kotlin.jvm.internal.n.h(options, "options");
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        do {
            int iF = f9.a.f(this.f20303r, options, true);
            if (iF != -2) {
                if (iF == -1) {
                    return -1;
                }
                this.f20303r.skip(options.n()[iF].v());
                return iF;
            }
        } while (this.f20302q.e1(this.f20303r, 8192L) != -1);
        return -1;
    }

    @Override // e9.g
    public String O(long j9) throws EOFException {
        if (j9 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 == Long.MAX_VALUE ? Long.MAX_VALUE : j9 + 1;
        long jB = b((byte) 10, 0L, j10);
        if (jB != -1) {
            return f9.a.e(this.f20303r, jB);
        }
        if (j10 < Long.MAX_VALUE && u0(j10) && this.f20303r.U(j10 - 1) == 13 && u0(j10 + 1) && this.f20303r.U(j10) == 10) {
            return f9.a.e(this.f20303r, j10);
        }
        C1350e c1350e = new C1350e();
        C1350e c1350e2 = this.f20303r;
        c1350e2.Q(c1350e, 0L, Math.min(32, c1350e2.X0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f20303r.X0(), j9) + " content=" + c1350e.w0().n() + (char) 8230);
    }

    @Override // e9.g
    public long R(h bytes) {
        kotlin.jvm.internal.n.h(bytes, "bytes");
        return f(bytes, 0L);
    }

    @Override // e9.g
    public g S0() {
        return o.d(new t(this));
    }

    @Override // e9.g
    public void Y0(long j9) throws EOFException {
        if (!u0(j9)) {
            throw new EOFException();
        }
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    public long b(byte b10, long j9, long j10) {
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        if (0 > j9 || j9 > j10) {
            throw new IllegalArgumentException(("fromIndex=" + j9 + " toIndex=" + j10).toString());
        }
        long jMax = j9;
        while (jMax < j10) {
            byte b11 = b10;
            long j11 = j10;
            long jY = this.f20303r.Y(b11, jMax, j11);
            if (jY != -1) {
                return jY;
            }
            long jX0 = this.f20303r.X0();
            if (jX0 >= j11 || this.f20302q.e1(this.f20303r, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, jX0);
            b10 = b11;
            j10 = j11;
        }
        return -1L;
    }

    @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f20304s) {
            return;
        }
        this.f20304s = true;
        this.f20302q.close();
        this.f20303r.j();
    }

    @Override // e9.g, e9.f
    public C1350e d() {
        return this.f20303r;
    }

    @Override // e9.g
    public long d1() throws EOFException {
        Y0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!u0(i11)) {
                break;
            }
            byte bU = this.f20303r.U(i10);
            if ((bU < 48 || bU > 57) && ((bU < 97 || bU > 102) && (bU < 65 || bU > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bU, E8.a.a(16));
                kotlin.jvm.internal.n.g(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i10 = i11;
        }
        return this.f20303r.d1();
    }

    @Override // e9.B
    public C e() {
        return this.f20302q.e();
    }

    @Override // e9.B
    public long e1(C1350e sink, long j9) {
        kotlin.jvm.internal.n.h(sink, "sink");
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        if (this.f20303r.X0() == 0) {
            if (j9 == 0) {
                return 0L;
            }
            if (this.f20302q.e1(this.f20303r, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f20303r.e1(sink, Math.min(j9, this.f20303r.X0()));
    }

    public long f(h bytes, long j9) {
        kotlin.jvm.internal.n.h(bytes, "bytes");
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jB0 = this.f20303r.b0(bytes, j9);
            if (jB0 != -1) {
                return jB0;
            }
            long jX0 = this.f20303r.X0();
            if (this.f20302q.e1(this.f20303r, 8192L) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, (jX0 - ((long) bytes.v())) + 1);
        }
    }

    @Override // e9.g
    public InputStream f1() {
        return new a();
    }

    public long g(h targetBytes, long j9) {
        kotlin.jvm.internal.n.h(targetBytes, "targetBytes");
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jQ0 = this.f20303r.q0(targetBytes, j9);
            if (jQ0 != -1) {
                return jQ0;
            }
            long jX0 = this.f20303r.X0();
            if (this.f20302q.e1(this.f20303r, 8192L) == -1) {
                return -1L;
            }
            j9 = Math.max(j9, jX0);
        }
    }

    @Override // e9.g
    public long g0(z sink) {
        kotlin.jvm.internal.n.h(sink, "sink");
        long j9 = 0;
        while (this.f20302q.e1(this.f20303r, 8192L) != -1) {
            long jI = this.f20303r.I();
            if (jI > 0) {
                j9 += jI;
                sink.Z(this.f20303r, jI);
            }
        }
        if (this.f20303r.X0() <= 0) {
            return j9;
        }
        long jX0 = j9 + this.f20303r.X0();
        C1350e c1350e = this.f20303r;
        sink.Z(c1350e, c1350e.X0());
        return jX0;
    }

    @Override // e9.g
    public String h0(Charset charset) {
        kotlin.jvm.internal.n.h(charset, "charset");
        this.f20303r.l1(this.f20302q);
        return this.f20303r.h0(charset);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20304s;
    }

    public int j() throws EOFException {
        Y0(4L);
        return this.f20303r.B0();
    }

    @Override // e9.g
    public C1350e l() {
        return this.f20303r;
    }

    @Override // e9.g
    public long m0(h targetBytes) {
        kotlin.jvm.internal.n.h(targetBytes, "targetBytes");
        return g(targetBytes, 0L);
    }

    @Override // e9.g
    public h n(long j9) throws EOFException {
        Y0(j9);
        return this.f20303r.n(j9);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.n.h(sink, "sink");
        if (this.f20303r.X0() == 0 && this.f20302q.e1(this.f20303r, 8192L) == -1) {
            return -1;
        }
        return this.f20303r.read(sink);
    }

    @Override // e9.g
    public byte readByte() throws EOFException {
        Y0(1L);
        return this.f20303r.readByte();
    }

    @Override // e9.g
    public int readInt() throws EOFException {
        Y0(4L);
        return this.f20303r.readInt();
    }

    @Override // e9.g
    public short readShort() throws EOFException {
        Y0(2L);
        return this.f20303r.readShort();
    }

    @Override // e9.g
    public void skip(long j9) throws EOFException {
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        while (j9 > 0) {
            if (this.f20303r.X0() == 0 && this.f20302q.e1(this.f20303r, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j9, this.f20303r.X0());
            this.f20303r.skip(jMin);
            j9 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f20302q + ')';
    }

    public short u() throws EOFException {
        Y0(2L);
        return this.f20303r.I0();
    }

    @Override // e9.g
    public boolean u0(long j9) {
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (this.f20304s) {
            throw new IllegalStateException("closed");
        }
        while (this.f20303r.X0() < j9) {
            if (this.f20302q.e1(this.f20303r, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // e9.g
    public String z0() {
        return O(Long.MAX_VALUE);
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            v vVar = v.this;
            if (vVar.f20304s) {
                throw new IOException("closed");
            }
            return (int) Math.min(vVar.f20303r.X0(), SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            v.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            v vVar = v.this;
            if (vVar.f20304s) {
                throw new IOException("closed");
            }
            if (vVar.f20303r.X0() == 0) {
                v vVar2 = v.this;
                if (vVar2.f20302q.e1(vVar2.f20303r, 8192L) == -1) {
                    return -1;
                }
            }
            return v.this.f20303r.readByte() & 255;
        }

        public String toString() {
            return v.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream out) throws IOException {
            kotlin.jvm.internal.n.h(out, "out");
            if (v.this.f20304s) {
                throw new IOException("closed");
            }
            long jX0 = 0;
            while (true) {
                if (v.this.f20303r.X0() == 0) {
                    v vVar = v.this;
                    if (vVar.f20302q.e1(vVar.f20303r, 8192L) == -1) {
                        return jX0;
                    }
                }
                jX0 += v.this.f20303r.X0();
                C1350e.t1(v.this.f20303r, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            kotlin.jvm.internal.n.h(data, "data");
            if (!v.this.f20304s) {
                AbstractC1347b.b(data.length, i10, i11);
                if (v.this.f20303r.X0() == 0) {
                    v vVar = v.this;
                    if (vVar.f20302q.e1(vVar.f20303r, 8192L) == -1) {
                        return -1;
                    }
                }
                return v.this.f20303r.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
