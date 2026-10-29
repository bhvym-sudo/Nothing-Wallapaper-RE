package androidx.datastore.preferences.protobuf;

import androidx.constraintlayout.core.widgets.Optimizer;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1100j extends AbstractC1096f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f12519c = Logger.getLogger(AbstractC1100j.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f12520d = p0.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C1101k f12521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12522b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$b */
    private static abstract class b extends AbstractC1100j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f12523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f12524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f12525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f12526h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f12523e = bArr;
            this.f12524f = bArr.length;
        }

        final void R0(byte b10) {
            byte[] bArr = this.f12523e;
            int i10 = this.f12525g;
            this.f12525g = i10 + 1;
            bArr[i10] = b10;
            this.f12526h++;
        }

        final void S0(int i10) {
            byte[] bArr = this.f12523e;
            int i11 = this.f12525g;
            int i12 = i11 + 1;
            this.f12525g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f12525g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f12525g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f12525g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f12526h += 4;
        }

        final void T0(long j9) {
            byte[] bArr = this.f12523e;
            int i10 = this.f12525g;
            int i11 = i10 + 1;
            this.f12525g = i11;
            bArr[i10] = (byte) (j9 & 255);
            int i12 = i10 + 2;
            this.f12525g = i12;
            bArr[i11] = (byte) ((j9 >> 8) & 255);
            int i13 = i10 + 3;
            this.f12525g = i13;
            bArr[i12] = (byte) ((j9 >> 16) & 255);
            int i14 = i10 + 4;
            this.f12525g = i14;
            bArr[i13] = (byte) (255 & (j9 >> 24));
            int i15 = i10 + 5;
            this.f12525g = i15;
            bArr[i14] = (byte) (((int) (j9 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f12525g = i16;
            bArr[i15] = (byte) (((int) (j9 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f12525g = i17;
            bArr[i16] = (byte) (((int) (j9 >> 48)) & 255);
            this.f12525g = i10 + 8;
            bArr[i17] = (byte) (((int) (j9 >> 56)) & 255);
            this.f12526h += 8;
        }

        final void U0(int i10) {
            if (i10 >= 0) {
                W0(i10);
            } else {
                X0(i10);
            }
        }

        final void V0(int i10, int i11) {
            W0(r0.c(i10, i11));
        }

        final void W0(int i10) {
            if (!AbstractC1100j.f12520d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f12523e;
                    int i11 = this.f12525g;
                    this.f12525g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | Optimizer.OPTIMIZATION_GRAPH_WRAP) & 255);
                    this.f12526h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f12523e;
                int i12 = this.f12525g;
                this.f12525g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f12526h++;
                return;
            }
            long j9 = this.f12525g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f12523e;
                int i13 = this.f12525g;
                this.f12525g = i13 + 1;
                p0.H(bArr3, i13, (byte) ((i10 | Optimizer.OPTIMIZATION_GRAPH_WRAP) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f12523e;
            int i14 = this.f12525g;
            this.f12525g = i14 + 1;
            p0.H(bArr4, i14, (byte) i10);
            this.f12526h += (int) (((long) this.f12525g) - j9);
        }

        final void X0(long j9) {
            if (!AbstractC1100j.f12520d) {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.f12523e;
                    int i10 = this.f12525g;
                    this.f12525g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j9) | Optimizer.OPTIMIZATION_GRAPH_WRAP) & 255);
                    this.f12526h++;
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.f12523e;
                int i11 = this.f12525g;
                this.f12525g = i11 + 1;
                bArr2[i11] = (byte) j9;
                this.f12526h++;
                return;
            }
            long j10 = this.f12525g;
            while ((j9 & (-128)) != 0) {
                byte[] bArr3 = this.f12523e;
                int i12 = this.f12525g;
                this.f12525g = i12 + 1;
                p0.H(bArr3, i12, (byte) ((((int) j9) | Optimizer.OPTIMIZATION_GRAPH_WRAP) & 255));
                j9 >>>= 7;
            }
            byte[] bArr4 = this.f12523e;
            int i13 = this.f12525g;
            this.f12525g = i13 + 1;
            p0.H(bArr4, i13, (byte) j9);
            this.f12526h += (int) (((long) this.f12525g) - j10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends IOException {
        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$d */
    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f12527i;

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f12527i = outputStream;
        }

        private void Y0() throws IOException {
            this.f12527i.write(this.f12523e, 0, this.f12525g);
            this.f12525g = 0;
        }

        private void Z0(int i10) throws IOException {
            if (this.f12524f - this.f12525g < i10) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void A0(int i10, P p9) throws IOException {
            M0(1, 3);
            N0(2, i10);
            b1(3, p9);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void B0(int i10, AbstractC1097g abstractC1097g) throws IOException {
            M0(1, 3);
            N0(2, i10);
            e0(3, abstractC1097g);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void K0(int i10, String str) throws IOException {
            M0(i10, 2);
            L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void L0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iQ = AbstractC1100j.Q(length);
                int i10 = iQ + length;
                int i11 = this.f12524f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = q0.b(str, bArr, 0, length);
                    O0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f12525g) {
                    Y0();
                }
                int iQ2 = AbstractC1100j.Q(str.length());
                int i12 = this.f12525g;
                try {
                    if (iQ2 == iQ) {
                        int i13 = i12 + iQ2;
                        this.f12525g = i13;
                        int iB2 = q0.b(str, this.f12523e, i13, this.f12524f - i13);
                        this.f12525g = i12;
                        iC = (iB2 - i12) - iQ2;
                        W0(iC);
                        this.f12525g = iB2;
                    } else {
                        iC = q0.c(str);
                        W0(iC);
                        this.f12525g = q0.b(str, this.f12523e, this.f12525g, iC);
                    }
                    this.f12526h += iC;
                } catch (q0.d e10) {
                    this.f12526h -= this.f12525g - i12;
                    this.f12525g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new c(e11);
                }
            } catch (q0.d e12) {
                W(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void M0(int i10, int i11) throws IOException {
            O0(r0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void N0(int i10, int i11) throws IOException {
            Z0(20);
            V0(i10, 0);
            W0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void O0(int i10) throws IOException {
            Z0(5);
            W0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void P0(int i10, long j9) throws IOException {
            Z0(20);
            V0(i10, 0);
            X0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void Q0(long j9) throws IOException {
            Z0(10);
            X0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void V() throws IOException {
            if (this.f12525g > 0) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void Z(byte b10) throws IOException {
            if (this.f12525g == this.f12524f) {
                Y0();
            }
            R0(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j, androidx.datastore.preferences.protobuf.AbstractC1096f
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void a0(int i10, boolean z9) throws IOException {
            Z0(11);
            V0(i10, 0);
            R0(z9 ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f12524f;
            int i13 = this.f12525g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f12523e, i13, i11);
                this.f12525g += i11;
                this.f12526h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f12523e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f12525g = this.f12524f;
            this.f12526h += i14;
            Y0();
            if (i16 <= this.f12524f) {
                System.arraycopy(bArr, i15, this.f12523e, 0, i16);
                this.f12525g = i16;
            } else {
                this.f12527i.write(bArr, i15, i16);
            }
            this.f12526h += i16;
        }

        public void b1(int i10, P p9) throws IOException {
            M0(i10, 2);
            z0(p9);
        }

        void c1(P p9, f0 f0Var) throws IOException {
            O0(((AbstractC1091a) p9).b(f0Var));
            f0Var.e(p9, this.f12521a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void d0(byte[] bArr, int i10, int i11) throws IOException {
            O0(i11);
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void e0(int i10, AbstractC1097g abstractC1097g) throws IOException {
            M0(i10, 2);
            f0(abstractC1097g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void f0(AbstractC1097g abstractC1097g) throws IOException {
            O0(abstractC1097g.size());
            abstractC1097g.y(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void k0(int i10, int i11) throws IOException {
            Z0(14);
            V0(i10, 5);
            S0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void l0(int i10) throws IOException {
            Z0(4);
            S0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void m0(int i10, long j9) throws IOException {
            Z0(18);
            V0(i10, 1);
            T0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void n0(long j9) throws IOException {
            Z0(8);
            T0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void u0(int i10, int i11) throws IOException {
            Z0(20);
            V0(i10, 0);
            U0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void v0(int i10) throws IOException {
            if (i10 >= 0) {
                O0(i10);
            } else {
                Q0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        void y0(int i10, P p9, f0 f0Var) throws IOException {
            M0(i10, 2);
            c1(p9, f0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1100j
        public void z0(P p9) throws IOException {
            O0(p9.d());
            p9.e(this);
        }
    }

    public static int A(P p9) {
        return y(p9.d());
    }

    static int B(P p9, f0 f0Var) {
        return y(((AbstractC1091a) p9).b(f0Var));
    }

    static int C(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int D(int i10, AbstractC1097g abstractC1097g) {
        return (O(1) * 2) + P(2, i10) + f(3, abstractC1097g);
    }

    public static int E(int i10, int i11) {
        return O(i10) + F(i11);
    }

    public static int F(int i10) {
        return 4;
    }

    public static int G(int i10, long j9) {
        return O(i10) + H(j9);
    }

    public static int H(long j9) {
        return 8;
    }

    public static int I(int i10, int i11) {
        return O(i10) + J(i11);
    }

    public static int J(int i10) {
        return Q(T(i10));
    }

    public static int K(int i10, long j9) {
        return O(i10) + L(j9);
    }

    public static int L(long j9) {
        return S(U(j9));
    }

    public static int M(int i10, String str) {
        return O(i10) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = q0.c(str);
        } catch (q0.d unused) {
            length = str.getBytes(AbstractC1114y.f12697b).length;
        }
        return y(length);
    }

    public static int O(int i10) {
        return Q(r0.c(i10, 0));
    }

    public static int P(int i10, int i11) {
        return O(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int R(int i10, long j9) {
        return O(i10) + S(j9);
    }

    public static int S(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public static int T(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long U(long j9) {
        return (j9 >> 63) ^ (j9 << 1);
    }

    public static AbstractC1100j Y(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int c(int i10, boolean z9) {
        return O(i10) + d(z9);
    }

    public static int d(boolean z9) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i10, AbstractC1097g abstractC1097g) {
        return O(i10) + g(abstractC1097g);
    }

    public static int g(AbstractC1097g abstractC1097g) {
        return y(abstractC1097g.size());
    }

    public static int h(int i10, double d10) {
        return O(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return O(i10) + k(i11);
    }

    public static int k(int i10) {
        return v(i10);
    }

    public static int l(int i10, int i11) {
        return O(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j9) {
        return O(i10) + o(j9);
    }

    public static int o(long j9) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return O(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    static int r(int i10, P p9, f0 f0Var) {
        return (O(i10) * 2) + t(p9, f0Var);
    }

    public static int s(P p9) {
        return p9.d();
    }

    static int t(P p9, f0 f0Var) {
        return ((AbstractC1091a) p9).b(f0Var);
    }

    public static int u(int i10, int i11) {
        return O(i10) + v(i11);
    }

    public static int v(int i10) {
        return S(i10);
    }

    public static int w(int i10, long j9) {
        return O(i10) + x(j9);
    }

    public static int x(long j9) {
        return S(j9);
    }

    static int y(int i10) {
        return Q(i10) + i10;
    }

    static int z(int i10, P p9, f0 f0Var) {
        return O(i10) + B(p9, f0Var);
    }

    public abstract void A0(int i10, P p9);

    public abstract void B0(int i10, AbstractC1097g abstractC1097g);

    public final void C0(int i10, int i11) {
        k0(i10, i11);
    }

    public final void D0(int i10) {
        l0(i10);
    }

    public final void E0(int i10, long j9) {
        m0(i10, j9);
    }

    public final void F0(long j9) {
        n0(j9);
    }

    public final void G0(int i10, int i11) {
        N0(i10, T(i11));
    }

    public final void H0(int i10) {
        O0(T(i10));
    }

    public final void I0(int i10, long j9) {
        P0(i10, U(j9));
    }

    public final void J0(long j9) {
        Q0(U(j9));
    }

    public abstract void K0(int i10, String str);

    public abstract void L0(String str);

    public abstract void M0(int i10, int i11);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10);

    public abstract void P0(int i10, long j9);

    public abstract void Q0(long j9);

    public abstract void V();

    final void W(String str, q0.d dVar) throws c {
        f12519c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC1114y.f12697b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    boolean X() {
        return this.f12522b;
    }

    public abstract void Z(byte b10);

    @Override // androidx.datastore.preferences.protobuf.AbstractC1096f
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, boolean z9);

    public final void b0(boolean z9) {
        Z(z9 ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    abstract void d0(byte[] bArr, int i10, int i11);

    public abstract void e0(int i10, AbstractC1097g abstractC1097g);

    public abstract void f0(AbstractC1097g abstractC1097g);

    public final void g0(int i10, double d10) {
        m0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void h0(double d10) {
        n0(Double.doubleToRawLongBits(d10));
    }

    public final void i0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void j0(int i10) {
        v0(i10);
    }

    public abstract void k0(int i10, int i11);

    public abstract void l0(int i10);

    public abstract void m0(int i10, long j9);

    public abstract void n0(long j9);

    public final void o0(int i10, float f10) {
        k0(i10, Float.floatToRawIntBits(f10));
    }

    public final void p0(float f10) {
        l0(Float.floatToRawIntBits(f10));
    }

    public final void q0(int i10, P p9) {
        M0(i10, 3);
        s0(p9);
        M0(i10, 4);
    }

    final void r0(int i10, P p9, f0 f0Var) {
        M0(i10, 3);
        t0(p9, f0Var);
        M0(i10, 4);
    }

    public final void s0(P p9) {
        p9.e(this);
    }

    final void t0(P p9, f0 f0Var) {
        f0Var.e(p9, this.f12521a);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public final void w0(int i10, long j9) {
        P0(i10, j9);
    }

    public final void x0(long j9) {
        Q0(j9);
    }

    abstract void y0(int i10, P p9, f0 f0Var);

    public abstract void z0(P p9);

    private AbstractC1100j() {
    }
}
