package e9;

import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p089i8.AbstractC1439m;

/* JADX INFO: renamed from: e9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1350e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w f20257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f20258r;

    /* JADX INFO: renamed from: e9.e$a */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public C1350e f20259q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private w f20260r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public byte[] f20262t;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f20261s = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f20263u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f20264v = -1;

        public final void a(w wVar) {
            this.f20260r = wVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20259q == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f20259q = null;
            a(null);
            this.f20261s = -1L;
            this.f20262t = null;
            this.f20263u = -1;
            this.f20264v = -1;
        }
    }

    /* JADX INFO: renamed from: e9.e$c */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C1350e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C1350e.this.F(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            kotlin.jvm.internal.n.h(data, "data");
            C1350e.this.k0(data, i10, i11);
        }
    }

    public static /* synthetic */ C1350e t1(C1350e c1350e, OutputStream outputStream, long j9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j9 = c1350e.f20258r;
        }
        return c1350e.s1(outputStream, j9);
    }

    public void A0(byte[] sink) throws EOFException {
        kotlin.jvm.internal.n.h(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    public int B0() {
        return AbstractC1347b.f(readInt());
    }

    @Override // e9.g
    public byte[] C0(long j9) throws EOFException {
        if (j9 < 0 || j9 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (X0() < j9) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j9];
        A0(bArr);
        return bArr;
    }

    @Override // e9.g
    public boolean D() {
        return this.f20258r == 0;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C1350e clone() {
        return K();
    }

    public final long I() {
        long jX0 = X0();
        if (jX0 == 0) {
            return 0L;
        }
        w wVar = this.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        w wVar2 = wVar.f20313g;
        kotlin.jvm.internal.n.e(wVar2);
        int i10 = wVar2.f20309c;
        return (i10 >= 8192 || !wVar2.f20311e) ? jX0 : jX0 - ((long) (i10 - wVar2.f20308b));
    }

    public short I0() {
        return AbstractC1347b.g(readShort());
    }

    public final C1350e K() {
        C1350e c1350e = new C1350e();
        if (X0() == 0) {
            return c1350e;
        }
        w wVar = this.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        w wVarD = wVar.d();
        c1350e.f20257q = wVarD;
        wVarD.f20313g = wVarD;
        wVarD.f20312f = wVarD;
        for (w wVar2 = wVar.f20312f; wVar2 != wVar; wVar2 = wVar2.f20312f) {
            w wVar3 = wVarD.f20313g;
            kotlin.jvm.internal.n.e(wVar3);
            kotlin.jvm.internal.n.e(wVar2);
            wVar3.c(wVar2.d());
        }
        c1350e.W0(X0());
        return c1350e;
    }

    @Override // e9.g
    public int M0(r options) throws EOFException {
        kotlin.jvm.internal.n.h(options, "options");
        int iG = f9.a.g(this, options, false, 2, null);
        if (iG == -1) {
            return -1;
        }
        skip(options.n()[iG].v());
        return iG;
    }

    @Override // e9.g
    public String O(long j9) throws EOFException {
        if (j9 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 != Long.MAX_VALUE ? j9 + 1 : Long.MAX_VALUE;
        long jY = Y((byte) 10, 0L, j10);
        if (jY != -1) {
            return f9.a.e(this, jY);
        }
        if (j10 < X0() && U(j10 - 1) == 13 && U(j10) == 10) {
            return f9.a.e(this, j10);
        }
        C1350e c1350e = new C1350e();
        Q(c1350e, 0L, Math.min(32, X0()));
        throw new EOFException("\\n not found: limit=" + Math.min(X0(), j9) + " content=" + c1350e.w0().n() + (char) 8230);
    }

    public String O0(long j9, Charset charset) throws EOFException {
        kotlin.jvm.internal.n.h(charset, "charset");
        if (j9 < 0 || j9 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (this.f20258r < j9) {
            throw new EOFException();
        }
        if (j9 == 0) {
            return "";
        }
        w wVar = this.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        int i10 = wVar.f20308b;
        if (((long) i10) + j9 > wVar.f20309c) {
            return new String(C0(j9), charset);
        }
        int i11 = (int) j9;
        String str = new String(wVar.f20307a, i10, i11, charset);
        int i12 = wVar.f20308b + i11;
        wVar.f20308b = i12;
        this.f20258r -= j9;
        if (i12 == wVar.f20309c) {
            this.f20257q = wVar.b();
            x.b(wVar);
        }
        return str;
    }

    public String P0() {
        return O0(this.f20258r, E8.d.f1445b);
    }

    public final C1350e Q(C1350e out, long j9, long j10) {
        kotlin.jvm.internal.n.h(out, "out");
        long j11 = j9;
        AbstractC1347b.b(X0(), j11, j10);
        if (j10 != 0) {
            out.W0(out.X0() + j10);
            w wVar = this.f20257q;
            while (true) {
                kotlin.jvm.internal.n.e(wVar);
                int i10 = wVar.f20309c;
                int i11 = wVar.f20308b;
                if (j11 < i10 - i11) {
                    break;
                }
                j11 -= (long) (i10 - i11);
                wVar = wVar.f20312f;
            }
            w wVar2 = wVar;
            long j12 = j10;
            while (j12 > 0) {
                kotlin.jvm.internal.n.e(wVar2);
                w wVarD = wVar2.d();
                int i12 = wVarD.f20308b + ((int) j11);
                wVarD.f20308b = i12;
                wVarD.f20309c = Math.min(i12 + ((int) j12), wVarD.f20309c);
                w wVar3 = out.f20257q;
                if (wVar3 == null) {
                    wVarD.f20313g = wVarD;
                    wVarD.f20312f = wVarD;
                    out.f20257q = wVarD;
                } else {
                    kotlin.jvm.internal.n.e(wVar3);
                    w wVar4 = wVar3.f20313g;
                    kotlin.jvm.internal.n.e(wVar4);
                    wVar4.c(wVarD);
                }
                j12 -= (long) (wVarD.f20309c - wVarD.f20308b);
                wVar2 = wVar2.f20312f;
                j11 = 0;
            }
        }
        return this;
    }

    @Override // e9.g
    public long R(h bytes) {
        kotlin.jvm.internal.n.h(bytes, "bytes");
        return b0(bytes, 0L);
    }

    @Override // e9.g
    public g S0() {
        return o.d(new t(this));
    }

    public String T0(long j9) throws EOFException {
        return O0(j9, E8.d.f1445b);
    }

    public final byte U(long j9) {
        AbstractC1347b.b(X0(), j9, 1L);
        w wVar = this.f20257q;
        if (wVar == null) {
            kotlin.jvm.internal.n.e(null);
            throw null;
        }
        if (X0() - j9 < j9) {
            long jX0 = X0();
            while (jX0 > j9) {
                wVar = wVar.f20313g;
                kotlin.jvm.internal.n.e(wVar);
                jX0 -= (long) (wVar.f20309c - wVar.f20308b);
            }
            kotlin.jvm.internal.n.e(wVar);
            return wVar.f20307a[(int) ((((long) wVar.f20308b) + j9) - jX0)];
        }
        long j10 = 0;
        while (true) {
            long j11 = ((long) (wVar.f20309c - wVar.f20308b)) + j10;
            if (j11 > j9) {
                kotlin.jvm.internal.n.e(wVar);
                return wVar.f20307a[(int) ((((long) wVar.f20308b) + j9) - j10)];
            }
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
            j10 = j11;
        }
    }

    public int U0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (X0() == 0) {
            throw new EOFException();
        }
        byte bU = U(0L);
        if ((bU & 128) == 0) {
            i10 = bU & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bU & 224) == 192) {
            i10 = bU & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bU & 240) == 224) {
            i10 = bU & 15;
            i11 = 3;
            i12 = RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            if ((bU & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bU & 7;
            i11 = 4;
            i12 = ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
        }
        long j9 = i11;
        if (X0() < j9) {
            throw new EOFException("size < " + i11 + ": " + X0() + " (to read code point prefixed 0x" + AbstractC1347b.h(bU) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j10 = i13;
            byte bU2 = U(j10);
            if ((bU2 & 192) != 128) {
                skip(j10);
                return 65533;
            }
            i10 = (i10 << 6) | (bU2 & 63);
        }
        skip(j9);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    public final void W0(long j9) {
        this.f20258r = j9;
    }

    public final long X0() {
        return this.f20258r;
    }

    public long Y(byte b10, long j9, long j10) {
        w wVar;
        int i10;
        long jX0 = 0;
        if (0 > j9 || j9 > j10) {
            throw new IllegalArgumentException(("size=" + X0() + " fromIndex=" + j9 + " toIndex=" + j10).toString());
        }
        if (j10 > X0()) {
            j10 = X0();
        }
        if (j9 == j10 || (wVar = this.f20257q) == null) {
            return -1L;
        }
        if (X0() - j9 < j9) {
            jX0 = X0();
            while (jX0 > j9) {
                wVar = wVar.f20313g;
                kotlin.jvm.internal.n.e(wVar);
                jX0 -= (long) (wVar.f20309c - wVar.f20308b);
            }
            while (jX0 < j10) {
                byte[] bArr = wVar.f20307a;
                int iMin = (int) Math.min(wVar.f20309c, (((long) wVar.f20308b) + j10) - jX0);
                i10 = (int) ((((long) wVar.f20308b) + j9) - jX0);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                jX0 += (long) (wVar.f20309c - wVar.f20308b);
                wVar = wVar.f20312f;
                kotlin.jvm.internal.n.e(wVar);
                j9 = jX0;
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (wVar.f20309c - wVar.f20308b)) + jX0;
            if (j11 > j9) {
                break;
            }
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
            jX0 = j11;
        }
        while (jX0 < j10) {
            byte[] bArr2 = wVar.f20307a;
            int iMin2 = (int) Math.min(wVar.f20309c, (((long) wVar.f20308b) + j10) - jX0);
            i10 = (int) ((((long) wVar.f20308b) + j9) - jX0);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            jX0 += (long) (wVar.f20309c - wVar.f20308b);
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
            j9 = jX0;
        }
        return -1L;
        return ((long) (i10 - wVar.f20308b)) + jX0;
    }

    @Override // e9.g
    public void Y0(long j9) throws EOFException {
        if (this.f20258r < j9) {
            throw new EOFException();
        }
    }

    @Override // e9.z
    public void Z(C1350e source, long j9) {
        w wVar;
        kotlin.jvm.internal.n.h(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1347b.b(source.X0(), 0L, j9);
        while (j9 > 0) {
            w wVar2 = source.f20257q;
            kotlin.jvm.internal.n.e(wVar2);
            int i10 = wVar2.f20309c;
            w wVar3 = source.f20257q;
            kotlin.jvm.internal.n.e(wVar3);
            if (j9 < i10 - wVar3.f20308b) {
                w wVar4 = this.f20257q;
                if (wVar4 != null) {
                    kotlin.jvm.internal.n.e(wVar4);
                    wVar = wVar4.f20313g;
                } else {
                    wVar = null;
                }
                if (wVar != null && wVar.f20311e) {
                    if ((((long) wVar.f20309c) + j9) - ((long) (wVar.f20310d ? 0 : wVar.f20308b)) <= 8192) {
                        w wVar5 = source.f20257q;
                        kotlin.jvm.internal.n.e(wVar5);
                        wVar5.f(wVar, (int) j9);
                        source.W0(source.X0() - j9);
                        W0(X0() + j9);
                        return;
                    }
                }
                w wVar6 = source.f20257q;
                kotlin.jvm.internal.n.e(wVar6);
                source.f20257q = wVar6.e((int) j9);
            }
            w wVar7 = source.f20257q;
            kotlin.jvm.internal.n.e(wVar7);
            long j10 = wVar7.f20309c - wVar7.f20308b;
            source.f20257q = wVar7.b();
            w wVar8 = this.f20257q;
            if (wVar8 == null) {
                this.f20257q = wVar7;
                wVar7.f20313g = wVar7;
                wVar7.f20312f = wVar7;
            } else {
                kotlin.jvm.internal.n.e(wVar8);
                w wVar9 = wVar8.f20313g;
                kotlin.jvm.internal.n.e(wVar9);
                wVar9.c(wVar7).a();
            }
            source.W0(source.X0() - j10);
            W0(X0() + j10);
            j9 -= j10;
        }
    }

    public long b0(h bytes, long j9) {
        int i10;
        long j10 = j9;
        kotlin.jvm.internal.n.h(bytes, "bytes");
        if (bytes.v() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long jX0 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        w wVar = this.f20257q;
        if (wVar == null) {
            return -1L;
        }
        if (X0() - j10 < j10) {
            jX0 = X0();
            while (jX0 > j10) {
                wVar = wVar.f20313g;
                kotlin.jvm.internal.n.e(wVar);
                jX0 -= (long) (wVar.f20309c - wVar.f20308b);
            }
            byte[] bArrO = bytes.o();
            byte b10 = bArrO[0];
            int iV = bytes.v();
            long jX1 = (X0() - ((long) iV)) + 1;
            while (jX0 < jX1) {
                byte[] bArr = wVar.f20307a;
                int iMin = (int) Math.min(wVar.f20309c, (((long) wVar.f20308b) + jX1) - jX0);
                i10 = (int) ((((long) wVar.f20308b) + j10) - jX0);
                while (i10 < iMin) {
                    if (bArr[i10] != b10 || !f9.a.d(wVar, i10 + 1, bArrO, 1, iV)) {
                        i10++;
                    }
                }
                jX0 += (long) (wVar.f20309c - wVar.f20308b);
                wVar = wVar.f20312f;
                kotlin.jvm.internal.n.e(wVar);
                j10 = jX0;
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (wVar.f20309c - wVar.f20308b)) + jX0;
            if (j11 > j10) {
                break;
            }
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
            jX0 = j11;
        }
        byte[] bArrO2 = bytes.o();
        byte b11 = bArrO2[0];
        int iV2 = bytes.v();
        long jX2 = (X0() - ((long) iV2)) + 1;
        while (jX0 < jX2) {
            byte[] bArr2 = wVar.f20307a;
            long j12 = jX2;
            int iMin2 = (int) Math.min(wVar.f20309c, (((long) wVar.f20308b) + jX2) - jX0);
            i10 = (int) ((((long) wVar.f20308b) + j10) - jX0);
            while (i10 < iMin2) {
                if (bArr2[i10] == b11 && f9.a.d(wVar, i10 + 1, bArrO2, 1, iV2)) {
                }
                i10++;
            }
            jX0 += (long) (wVar.f20309c - wVar.f20308b);
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
            jX2 = j12;
            j10 = jX0;
        }
        return -1L;
        return ((long) (i10 - wVar.f20308b)) + jX0;
    }

    @Override // e9.f
    public OutputStream b1() {
        return new c();
    }

    public final h c1() {
        if (X0() <= 2147483647L) {
            return g1((int) X0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + X0()).toString());
    }

    @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // e9.g, e9.f
    public C1350e d() {
        return this;
    }

    @Override // e9.g
    public long d1() throws EOFException {
        int i10;
        if (X0() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z9 = false;
        long j9 = 0;
        do {
            w wVar = this.f20257q;
            kotlin.jvm.internal.n.e(wVar);
            byte[] bArr = wVar.f20307a;
            int i12 = wVar.f20308b;
            int i13 = wVar.f20309c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z9 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC1347b.h(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j9) != 0) {
                    throw new NumberFormatException("Number too large: " + new C1350e().r0(j9).F(b10).P0());
                }
                j9 = (j9 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f20257q = wVar.b();
                x.b(wVar);
            } else {
                wVar.f20308b = i12;
            }
            if (z9) {
                break;
            }
        } while (this.f20257q != null);
        W0(X0() - ((long) i11));
        return j9;
    }

    @Override // e9.B
    public C e() {
        return C.f20236e;
    }

    @Override // e9.B
    public long e1(C1350e sink, long j9) {
        kotlin.jvm.internal.n.h(sink, "sink");
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (X0() == 0) {
            return -1L;
        }
        if (j9 > X0()) {
            j9 = X0();
        }
        sink.Z(this, j9);
        return j9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1350e)) {
            return false;
        }
        C1350e c1350e = (C1350e) obj;
        if (X0() != c1350e.X0()) {
            return false;
        }
        if (X0() == 0) {
            return true;
        }
        w wVar = this.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        w wVar2 = c1350e.f20257q;
        kotlin.jvm.internal.n.e(wVar2);
        int i10 = wVar.f20308b;
        int i11 = wVar2.f20308b;
        long j9 = 0;
        while (j9 < X0()) {
            long jMin = Math.min(wVar.f20309c - i10, wVar2.f20309c - i11);
            long j10 = 0;
            while (j10 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (wVar.f20307a[i10] != wVar2.f20307a[i11]) {
                    return false;
                }
                j10++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == wVar.f20309c) {
                wVar = wVar.f20312f;
                kotlin.jvm.internal.n.e(wVar);
                i10 = wVar.f20308b;
            }
            if (i11 == wVar2.f20309c) {
                wVar2 = wVar2.f20312f;
                kotlin.jvm.internal.n.e(wVar2);
                i11 = wVar2.f20308b;
            }
            j9 += jMin;
        }
        return true;
    }

    @Override // e9.g
    public InputStream f1() {
        return new b();
    }

    @Override // e9.f, e9.z, java.io.Flushable
    public void flush() {
    }

    @Override // e9.g
    public long g0(z sink) {
        kotlin.jvm.internal.n.h(sink, "sink");
        long jX0 = X0();
        if (jX0 > 0) {
            sink.Z(this, jX0);
        }
        return jX0;
    }

    public final h g1(int i10) {
        if (i10 == 0) {
            return h.f20268u;
        }
        AbstractC1347b.b(X0(), 0L, i10);
        w wVar = this.f20257q;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.n.e(wVar);
            int i14 = wVar.f20309c;
            int i15 = wVar.f20308b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            wVar = wVar.f20312f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        w wVar2 = this.f20257q;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.n.e(wVar2);
            bArr[i16] = wVar2.f20307a;
            i11 += wVar2.f20309c - wVar2.f20308b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = wVar2.f20308b;
            wVar2.f20310d = true;
            i16++;
            wVar2 = wVar2.f20312f;
        }
        return new y(bArr, iArr);
    }

    @Override // e9.g
    public String h0(Charset charset) {
        kotlin.jvm.internal.n.h(charset, "charset");
        return O0(this.f20258r, charset);
    }

    public final w h1(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w wVar = this.f20257q;
        if (wVar != null) {
            kotlin.jvm.internal.n.e(wVar);
            w wVar2 = wVar.f20313g;
            kotlin.jvm.internal.n.e(wVar2);
            return (wVar2.f20309c + i10 > 8192 || !wVar2.f20311e) ? wVar2.c(x.c()) : wVar2;
        }
        w wVarC = x.c();
        this.f20257q = wVarC;
        wVarC.f20313g = wVarC;
        wVarC.f20312f = wVarC;
        return wVarC;
    }

    public int hashCode() {
        w wVar = this.f20257q;
        if (wVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = wVar.f20309c;
            for (int i12 = wVar.f20308b; i12 < i11; i12++) {
                i10 = (i10 * 31) + wVar.f20307a[i12];
            }
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
        } while (wVar != this.f20257q);
        return i10;
    }

    @Override // e9.f
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C1350e s0(h byteString) {
        kotlin.jvm.internal.n.h(byteString, "byteString");
        byteString.z(this, 0, byteString.v());
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final void j() throws EOFException {
        skip(X0());
    }

    @Override // e9.f
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C1350e G0(byte[] source) {
        kotlin.jvm.internal.n.h(source, "source");
        return k0(source, 0, source.length);
    }

    @Override // e9.f
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C1350e k0(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.n.h(source, "source");
        long j9 = i11;
        AbstractC1347b.b(source.length, i10, j9);
        int i12 = i11 + i10;
        while (i10 < i12) {
            w wVarH1 = h1(1);
            int iMin = Math.min(i12 - i10, 8192 - wVarH1.f20309c);
            int i13 = i10 + iMin;
            AbstractC1439m.d(source, wVarH1.f20307a, wVarH1.f20309c, i10, i13);
            wVarH1.f20309c += iMin;
            i10 = i13;
        }
        W0(X0() + j9);
        return this;
    }

    @Override // e9.g
    public C1350e l() {
        return this;
    }

    public long l1(B source) {
        kotlin.jvm.internal.n.h(source, "source");
        long j9 = 0;
        while (true) {
            long jE1 = source.e1(this, 8192L);
            if (jE1 == -1) {
                return j9;
            }
            j9 += jE1;
        }
    }

    @Override // e9.g
    public long m0(h targetBytes) {
        kotlin.jvm.internal.n.h(targetBytes, "targetBytes");
        return q0(targetBytes, 0L);
    }

    @Override // e9.f
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C1350e F(int i10) {
        w wVarH1 = h1(1);
        byte[] bArr = wVarH1.f20307a;
        int i11 = wVarH1.f20309c;
        wVarH1.f20309c = i11 + 1;
        bArr[i11] = (byte) i10;
        W0(X0() + 1);
        return this;
    }

    @Override // e9.g
    public h n(long j9) throws EOFException {
        if (j9 < 0 || j9 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (X0() < j9) {
            throw new EOFException();
        }
        if (j9 < 4096) {
            return new h(C0(j9));
        }
        h hVarG1 = g1((int) j9);
        skip(j9);
        return hVarG1;
    }

    @Override // e9.f
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public C1350e Z0(long j9) {
        boolean z9;
        if (j9 == 0) {
            return F(48);
        }
        if (j9 < 0) {
            j9 = -j9;
            if (j9 < 0) {
                return d0("-9223372036854775808");
            }
            z9 = true;
        } else {
            z9 = false;
        }
        int iB = f9.a.b(j9);
        if (z9) {
            iB++;
        }
        w wVarH1 = h1(iB);
        byte[] bArr = wVarH1.f20307a;
        int i10 = wVarH1.f20309c + iB;
        while (j9 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = f9.a.c()[(int) (j9 % j10)];
            j9 /= j10;
        }
        if (z9) {
            bArr[i10 - 1] = 45;
        }
        wVarH1.f20309c += iB;
        W0(X0() + ((long) iB));
        return this;
    }

    @Override // e9.f
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C1350e r0(long j9) {
        if (j9 == 0) {
            return F(48);
        }
        long j10 = (j9 >>> 1) | j9;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        w wVarH1 = h1(i10);
        byte[] bArr = wVarH1.f20307a;
        int i11 = wVarH1.f20309c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = f9.a.c()[(int) (15 & j9)];
            j9 >>>= 4;
        }
        wVarH1.f20309c += i10;
        W0(X0() + ((long) i10));
        return this;
    }

    @Override // e9.f
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public C1350e x(int i10) {
        w wVarH1 = h1(4);
        byte[] bArr = wVarH1.f20307a;
        int i11 = wVarH1.f20309c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        wVarH1.f20309c = i11 + 4;
        W0(X0() + 4);
        return this;
    }

    public long q0(h targetBytes, long j9) {
        int i10;
        int i11;
        kotlin.jvm.internal.n.h(targetBytes, "targetBytes");
        long jX0 = 0;
        if (j9 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j9).toString());
        }
        w wVar = this.f20257q;
        if (wVar == null) {
            return -1L;
        }
        if (X0() - j9 < j9) {
            jX0 = X0();
            while (jX0 > j9) {
                wVar = wVar.f20313g;
                kotlin.jvm.internal.n.e(wVar);
                jX0 -= (long) (wVar.f20309c - wVar.f20308b);
            }
            if (targetBytes.v() == 2) {
                byte bH = targetBytes.h(0);
                byte bH2 = targetBytes.h(1);
                while (jX0 < X0()) {
                    byte[] bArr = wVar.f20307a;
                    i10 = (int) ((((long) wVar.f20308b) + j9) - jX0);
                    int i12 = wVar.f20309c;
                    while (true) {
                        if (i10 >= i12) {
                            jX0 += (long) (wVar.f20309c - wVar.f20308b);
                            wVar = wVar.f20312f;
                            kotlin.jvm.internal.n.e(wVar);
                            j9 = jX0;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bH || b10 == bH2) {
                                i11 = wVar.f20308b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrO = targetBytes.o();
                while (jX0 < X0()) {
                    byte[] bArr2 = wVar.f20307a;
                    i10 = (int) ((((long) wVar.f20308b) + j9) - jX0);
                    int i13 = wVar.f20309c;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrO.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrO[i14]) {
                                    i11 = wVar.f20308b;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            jX0 += (long) (wVar.f20309c - wVar.f20308b);
                            wVar = wVar.f20312f;
                            kotlin.jvm.internal.n.e(wVar);
                            j9 = jX0;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (wVar.f20309c - wVar.f20308b)) + jX0;
            if (j10 > j9) {
                break;
            }
            wVar = wVar.f20312f;
            kotlin.jvm.internal.n.e(wVar);
            jX0 = j10;
        }
        if (targetBytes.v() == 2) {
            byte bH3 = targetBytes.h(0);
            byte bH4 = targetBytes.h(1);
            while (jX0 < X0()) {
                byte[] bArr3 = wVar.f20307a;
                i10 = (int) ((((long) wVar.f20308b) + j9) - jX0);
                int i15 = wVar.f20309c;
                while (true) {
                    if (i10 >= i15) {
                        jX0 += (long) (wVar.f20309c - wVar.f20308b);
                        wVar = wVar.f20312f;
                        kotlin.jvm.internal.n.e(wVar);
                        j9 = jX0;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bH3 || b12 == bH4) {
                            i11 = wVar.f20308b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrO2 = targetBytes.o();
            while (jX0 < X0()) {
                byte[] bArr4 = wVar.f20307a;
                i10 = (int) ((((long) wVar.f20308b) + j9) - jX0);
                int i16 = wVar.f20309c;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrO2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrO2[i17]) {
                                i11 = wVar.f20308b;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        jX0 += (long) (wVar.f20309c - wVar.f20308b);
                        wVar = wVar.f20312f;
                        kotlin.jvm.internal.n.e(wVar);
                        j9 = jX0;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + jX0;
    }

    @Override // e9.f
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C1350e s(int i10) {
        w wVarH1 = h1(2);
        byte[] bArr = wVarH1.f20307a;
        int i11 = wVarH1.f20309c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        wVarH1.f20309c = i11 + 2;
        W0(X0() + 2);
        return this;
    }

    public C1350e r1(String string, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.n.h(string, "string");
        kotlin.jvm.internal.n.h(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.n.d(charset, E8.d.f1445b)) {
            return o0(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.n.g(bytes, "getBytes(...)");
        return k0(bytes, 0, bytes.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.n.h(sink, "sink");
        w wVar = this.f20257q;
        if (wVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), wVar.f20309c - wVar.f20308b);
        sink.put(wVar.f20307a, wVar.f20308b, iMin);
        int i10 = wVar.f20308b + iMin;
        wVar.f20308b = i10;
        this.f20258r -= (long) iMin;
        if (i10 == wVar.f20309c) {
            this.f20257q = wVar.b();
            x.b(wVar);
        }
        return iMin;
    }

    @Override // e9.g
    public byte readByte() throws EOFException {
        if (X0() == 0) {
            throw new EOFException();
        }
        w wVar = this.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        int i10 = wVar.f20308b;
        int i11 = wVar.f20309c;
        int i12 = i10 + 1;
        byte b10 = wVar.f20307a[i10];
        W0(X0() - 1);
        if (i12 != i11) {
            wVar.f20308b = i12;
            return b10;
        }
        this.f20257q = wVar.b();
        x.b(wVar);
        return b10;
    }

    @Override // e9.g
    public int readInt() throws EOFException {
        if (X0() < 4) {
            throw new EOFException();
        }
        w wVar = this.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        int i10 = wVar.f20308b;
        int i11 = wVar.f20309c;
        if (i11 - i10 < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = wVar.f20307a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        W0(X0() - 4);
        if (i14 != i11) {
            wVar.f20308b = i14;
            return i15;
        }
        this.f20257q = wVar.b();
        x.b(wVar);
        return i15;
    }

    @Override // e9.g
    public short readShort() throws EOFException {
        if (X0() < 2) {
            throw new EOFException();
        }
        w wVar = this.f20257q;
        kotlin.jvm.internal.n.e(wVar);
        int i10 = wVar.f20308b;
        int i11 = wVar.f20309c;
        if (i11 - i10 < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = wVar.f20307a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        W0(X0() - 2);
        if (i14 == i11) {
            this.f20257q = wVar.b();
            x.b(wVar);
        } else {
            wVar.f20308b = i14;
        }
        return (short) i15;
    }

    public final C1350e s1(OutputStream out, long j9) throws IOException {
        kotlin.jvm.internal.n.h(out, "out");
        AbstractC1347b.b(this.f20258r, 0L, j9);
        w wVar = this.f20257q;
        long j10 = j9;
        while (j10 > 0) {
            kotlin.jvm.internal.n.e(wVar);
            int iMin = (int) Math.min(j10, wVar.f20309c - wVar.f20308b);
            out.write(wVar.f20307a, wVar.f20308b, iMin);
            int i10 = wVar.f20308b + iMin;
            wVar.f20308b = i10;
            long j11 = iMin;
            this.f20258r -= j11;
            j10 -= j11;
            if (i10 == wVar.f20309c) {
                w wVarB = wVar.b();
                this.f20257q = wVarB;
                x.b(wVar);
                wVar = wVarB;
            }
        }
        return this;
    }

    @Override // e9.g
    public void skip(long j9) throws EOFException {
        while (j9 > 0) {
            w wVar = this.f20257q;
            if (wVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j9, wVar.f20309c - wVar.f20308b);
            long j10 = iMin;
            W0(X0() - j10);
            j9 -= j10;
            int i10 = wVar.f20308b + iMin;
            wVar.f20308b = i10;
            if (i10 == wVar.f20309c) {
                this.f20257q = wVar.b();
                x.b(wVar);
            }
        }
    }

    public byte[] t0() {
        return C0(X0());
    }

    public String toString() {
        return c1().toString();
    }

    @Override // e9.g
    public boolean u0(long j9) {
        return this.f20258r >= j9;
    }

    @Override // e9.f
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public C1350e d0(String string) {
        kotlin.jvm.internal.n.h(string, "string");
        return o0(string, 0, string.length());
    }

    @Override // e9.f
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public C1350e o0(String string, int i10, int i11) {
        char cCharAt;
        kotlin.jvm.internal.n.h(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                w wVarH1 = h1(1);
                byte[] bArr = wVarH1.f20307a;
                int i12 = wVarH1.f20309c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = wVarH1.f20309c;
                int i15 = (i12 + i10) - i14;
                wVarH1.f20309c = i14 + i15;
                W0(X0() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    w wVarH2 = h1(2);
                    byte[] bArr2 = wVarH2.f20307a;
                    int i16 = wVarH2.f20309c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                    wVarH2.f20309c = i16 + 2;
                    W0(X0() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    w wVarH3 = h1(3);
                    byte[] bArr3 = wVarH3.f20307a;
                    int i17 = wVarH3.f20309c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                    wVarH3.f20309c = i17 + 3;
                    W0(X0() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        F(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
                        w wVarH4 = h1(4);
                        byte[] bArr4 = wVarH4.f20307a;
                        int i20 = wVarH4.f20309c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
                        wVarH4.f20309c = i20 + 4;
                        W0(X0() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public h w0() {
        return n(X0());
    }

    public C1350e w1(int i10) {
        if (i10 < 128) {
            F(i10);
            return this;
        }
        if (i10 < 2048) {
            w wVarH1 = h1(2);
            byte[] bArr = wVarH1.f20307a;
            int i11 = wVarH1.f20309c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
            wVarH1.f20309c = i11 + 2;
            W0(X0() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            F(63);
            return this;
        }
        if (i10 < 65536) {
            w wVarH2 = h1(3);
            byte[] bArr2 = wVarH2.f20307a;
            int i12 = wVarH2.f20309c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
            wVarH2.f20309c = i12 + 3;
            W0(X0() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC1347b.i(i10));
        }
        w wVarH3 = h1(4);
        byte[] bArr3 = wVarH3.f20307a;
        int i13 = wVarH3.f20309c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | Optimizer.OPTIMIZATION_GRAPH_WRAP);
        wVarH3.f20309c = i13 + 4;
        W0(X0() + 4);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.n.h(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            w wVarH1 = h1(1);
            int iMin = Math.min(i10, 8192 - wVarH1.f20309c);
            source.get(wVarH1.f20307a, wVarH1.f20309c, iMin);
            i10 -= iMin;
            wVarH1.f20309c += iMin;
        }
        this.f20258r += (long) iRemaining;
        return iRemaining;
    }

    @Override // e9.g
    public String z0() {
        return O(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: e9.e$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C1350e.this.X0(), SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C1350e.this.X0() > 0) {
                return C1350e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C1350e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            kotlin.jvm.internal.n.h(sink, "sink");
            return C1350e.this.read(sink, i10, i11);
        }
    }

    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.n.h(sink, "sink");
        AbstractC1347b.b(sink.length, i10, i11);
        w wVar = this.f20257q;
        if (wVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, wVar.f20309c - wVar.f20308b);
        byte[] bArr = wVar.f20307a;
        int i12 = wVar.f20308b;
        AbstractC1439m.d(bArr, sink, i10, i12, i12 + iMin);
        wVar.f20308b += iMin;
        W0(X0() - ((long) iMin));
        if (wVar.f20308b == wVar.f20309c) {
            this.f20257q = wVar.b();
            x.b(wVar);
        }
        return iMin;
    }
}
