package androidx.datastore.preferences.protobuf;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1098h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f12470f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f12471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f12473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C1099i f12474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12475e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends AbstractC1098h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f12476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f12477h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f12478i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f12479j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12480k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f12481l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f12482m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f12483n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f12484o;

        private void O() {
            int i10 = this.f12478i + this.f12479j;
            this.f12478i = i10;
            int i11 = i10 - this.f12481l;
            int i12 = this.f12484o;
            if (i11 <= i12) {
                this.f12479j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f12479j = i13;
            this.f12478i = i10 - i13;
        }

        private void Q() throws C1115z {
            if (this.f12478i - this.f12480k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws C1115z {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f12476g;
                int i11 = this.f12480k;
                this.f12480k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1115z.f();
        }

        private void S() throws C1115z {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw C1115z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public String A() throws C1115z {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f12478i;
                int i11 = this.f12480k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f12476g, i11, iL, AbstractC1114y.f12697b);
                    this.f12480k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw C1115z.g();
            }
            throw C1115z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public String B() throws C1115z {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f12478i;
                int i11 = this.f12480k;
                if (iL <= i10 - i11) {
                    String strA = q0.a(this.f12476g, i11, iL);
                    this.f12480k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw C1115z.g();
            }
            throw C1115z.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int C() throws C1115z {
            if (f()) {
                this.f12482m = 0;
                return 0;
            }
            int iL = L();
            this.f12482m = iL;
            if (r0.a(iL) != 0) {
                return this.f12482m;
            }
            throw C1115z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public boolean F(int i10) throws C1115z {
            int iB = r0.b(i10);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1115z.e();
            }
            P(4);
            return true;
        }

        public byte H() throws C1115z {
            int i10 = this.f12480k;
            if (i10 == this.f12478i) {
                throw C1115z.m();
            }
            byte[] bArr = this.f12476g;
            this.f12480k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws C1115z {
            if (i10 > 0) {
                int i11 = this.f12478i;
                int i12 = this.f12480k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f12480k = i13;
                    return Arrays.copyOfRange(this.f12476g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C1115z.m();
            }
            if (i10 == 0) {
                return AbstractC1114y.f12699d;
            }
            throw C1115z.g();
        }

        public int J() throws C1115z {
            int i10 = this.f12480k;
            if (this.f12478i - i10 < 4) {
                throw C1115z.m();
            }
            byte[] bArr = this.f12476g;
            this.f12480k = i10 + 4;
            return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
        }

        public long K() throws C1115z {
            int i10 = this.f12480k;
            if (this.f12478i - i10 < 8) {
                throw C1115z.m();
            }
            byte[] bArr = this.f12476g;
            this.f12480k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f12480k;
            int i12 = this.f12478i;
            if (i12 != i11) {
                byte[] bArr = this.f12476g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f12480k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f12480k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j9;
            long j10;
            long j11;
            int i10 = this.f12480k;
            int i11 = this.f12478i;
            if (i11 != i10) {
                byte[] bArr = this.f12476g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f12480k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j9 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j9 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j12 = (-2080896) ^ i18;
                                i13 = i17;
                                j9 = j12;
                            } else {
                                long j13 = i18;
                                i13 = i10 + 5;
                                long j14 = j13 ^ (((long) bArr[i17]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j14 = j15 ^ (((long) bArr[i19]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j15 = j14 ^ (((long) bArr[i13]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j9 = j16;
                                            }
                                        }
                                    }
                                    j9 = j15 ^ j10;
                                    i13 = i19;
                                }
                                j9 = j14 ^ j11;
                            }
                        }
                    }
                    this.f12480k = i13;
                    return j9;
                }
            }
            return N();
        }

        long N() throws C1115z {
            long j9 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j9 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j9;
                }
            }
            throw C1115z.f();
        }

        public void P(int i10) throws C1115z {
            if (i10 >= 0) {
                int i11 = this.f12478i;
                int i12 = this.f12480k;
                if (i10 <= i11 - i12) {
                    this.f12480k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C1115z.m();
            }
            throw C1115z.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public void a(int i10) throws C1115z {
            if (this.f12482m != i10) {
                throw C1115z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int e() {
            return this.f12480k - this.f12481l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public boolean f() {
            return this.f12480k == this.f12478i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public void l(int i10) {
            this.f12484o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int m(int i10) throws C1115z {
            if (i10 < 0) {
                throw C1115z.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw C1115z.h();
            }
            int i11 = this.f12484o;
            if (iE > i11) {
                throw C1115z.m();
            }
            this.f12484o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public AbstractC1097g o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f12478i;
                int i11 = this.f12480k;
                if (iL <= i10 - i11) {
                    AbstractC1097g abstractC1097gX = (this.f12477h && this.f12483n) ? AbstractC1097g.x(this.f12476g, i11, iL) : AbstractC1097g.j(this.f12476g, i11, iL);
                    this.f12480k += iL;
                    return abstractC1097gX;
                }
            }
            return iL == 0 ? AbstractC1097g.f12460r : AbstractC1097g.w(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int y() {
            return AbstractC1098h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long z() {
            return AbstractC1098h.d(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z9) {
            super();
            this.f12484o = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f12476g = bArr;
            this.f12478i = i11 + i10;
            this.f12480k = i10;
            this.f12481l = i10;
            this.f12477h = z9;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends AbstractC1098h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f12485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f12486h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f12487i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f12488j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12489k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f12490l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f12491m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f12492n;

        private static int H(InputStream inputStream) throws C1115z {
            try {
                return inputStream.available();
            } catch (C1115z e10) {
                e10.j();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws C1115z {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C1115z e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC1097g J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return AbstractC1097g.g(bArrM);
            }
            int i11 = this.f12489k;
            int i12 = this.f12487i;
            int length = i12 - i11;
            this.f12491m += i12;
            this.f12489k = 0;
            this.f12487i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f12486h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC1097g.w(bArr);
        }

        private byte[] L(int i10, boolean z9) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z9 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f12489k;
            int i12 = this.f12487i;
            int length = i12 - i11;
            this.f12491m += i12;
            this.f12489k = 0;
            this.f12487i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f12486h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) throws C1115z {
            if (i10 == 0) {
                return AbstractC1114y.f12699d;
            }
            if (i10 < 0) {
                throw C1115z.g();
            }
            int i11 = this.f12491m;
            int i12 = this.f12489k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f12473c > 0) {
                throw C1115z.l();
            }
            int i14 = this.f12492n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C1115z.m();
            }
            int i15 = this.f12487i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f12485g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f12486h, this.f12489k, bArr, 0, i15);
            this.f12491m += this.f12487i;
            this.f12489k = 0;
            this.f12487i = 0;
            while (i15 < i10) {
                int I9 = I(this.f12485g, bArr, i15, i10 - i15);
                if (I9 == -1) {
                    throw C1115z.m();
                }
                this.f12491m += I9;
                i15 += I9;
            }
            return bArr;
        }

        private List N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f12485g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw C1115z.m();
                    }
                    this.f12491m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f12487i + this.f12488j;
            this.f12487i = i10;
            int i11 = this.f12491m + i10;
            int i12 = this.f12492n;
            if (i11 <= i12) {
                this.f12488j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f12488j = i13;
            this.f12487i = i10 - i13;
        }

        private void U(int i10) throws C1115z {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f12473c - this.f12491m) - this.f12489k) {
                throw C1115z.m();
            }
            throw C1115z.l();
        }

        private static long V(InputStream inputStream, long j9) throws C1115z {
            try {
                return inputStream.skip(j9);
            } catch (C1115z e10) {
                e10.j();
                throw e10;
            }
        }

        private void X(int i10) throws C1115z {
            if (i10 < 0) {
                throw C1115z.g();
            }
            int i11 = this.f12491m;
            int i12 = this.f12489k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f12492n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C1115z.m();
            }
            this.f12491m = i11 + i12;
            int i15 = this.f12487i - i12;
            this.f12487i = 0;
            this.f12489k = 0;
            while (i15 < i10) {
                try {
                    long j9 = i10 - i15;
                    long jV = V(this.f12485g, j9);
                    if (jV < 0 || jV > j9) {
                        throw new IllegalStateException(this.f12485g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } catch (Throwable th) {
                    this.f12491m += i15;
                    T();
                    throw th;
                }
            }
            this.f12491m += i15;
            T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f12487i;
            int i17 = i16 - this.f12489k;
            this.f12489k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f12487i;
                if (i18 <= i19) {
                    this.f12489k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f12489k = i19;
                    U(1);
                }
            }
        }

        private void Y() throws C1115z {
            if (this.f12487i - this.f12489k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws C1115z {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f12486h;
                int i11 = this.f12489k;
                this.f12489k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C1115z.f();
        }

        private void a0() throws C1115z {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw C1115z.f();
        }

        private boolean b0(int i10) throws C1115z {
            int i11 = this.f12489k;
            int i12 = i11 + i10;
            int i13 = this.f12487i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f12473c;
            int i15 = this.f12491m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f12492n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f12486h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f12491m += i11;
                this.f12487i -= i11;
                this.f12489k = 0;
            }
            InputStream inputStream = this.f12485g;
            byte[] bArr2 = this.f12486h;
            int i16 = this.f12487i;
            int I9 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f12473c - this.f12491m) - i16));
            if (I9 == 0 || I9 < -1 || I9 > this.f12486h.length) {
                throw new IllegalStateException(this.f12485g.getClass() + "#read(byte[]) returned invalid result: " + I9 + "\nThe InputStream implementation is buggy.");
            }
            if (I9 <= 0) {
                return false;
            }
            this.f12487i += I9;
            T();
            if (this.f12487i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public String A() throws C1115z {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f12487i;
                int i11 = this.f12489k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f12486h, i11, iQ, AbstractC1114y.f12697b);
                    this.f12489k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw C1115z.g();
            }
            if (iQ > this.f12487i) {
                return new String(L(iQ, false), AbstractC1114y.f12697b);
            }
            U(iQ);
            String str2 = new String(this.f12486h, this.f12489k, iQ, AbstractC1114y.f12697b);
            this.f12489k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f12489k;
            int i11 = this.f12487i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f12486h;
                this.f12489k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw C1115z.g();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f12486h;
                    this.f12489k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return q0.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int C() throws C1115z {
            if (f()) {
                this.f12490l = 0;
                return 0;
            }
            int iQ = Q();
            this.f12490l = iQ;
            if (r0.a(iQ) != 0) {
                return this.f12490l;
            }
            throw C1115z.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public boolean F(int i10) throws C1115z {
            int iB = r0.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1115z.e();
            }
            W(4);
            return true;
        }

        public byte K() throws C1115z {
            if (this.f12489k == this.f12487i) {
                U(1);
            }
            byte[] bArr = this.f12486h;
            int i10 = this.f12489k;
            this.f12489k = i10 + 1;
            return bArr[i10];
        }

        public int O() throws C1115z {
            int i10 = this.f12489k;
            if (this.f12487i - i10 < 4) {
                U(4);
                i10 = this.f12489k;
            }
            byte[] bArr = this.f12486h;
            this.f12489k = i10 + 4;
            return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24);
        }

        public long P() throws C1115z {
            int i10 = this.f12489k;
            if (this.f12487i - i10 < 8) {
                U(8);
                i10 = this.f12489k;
            }
            byte[] bArr = this.f12486h;
            this.f12489k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f12489k;
            int i12 = this.f12487i;
            if (i12 != i11) {
                byte[] bArr = this.f12486h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f12489k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f12489k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j9;
            long j10;
            long j11;
            int i10 = this.f12489k;
            int i11 = this.f12487i;
            if (i11 != i10) {
                byte[] bArr = this.f12486h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f12489k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j9 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j9 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j12 = (-2080896) ^ i18;
                                i13 = i17;
                                j9 = j12;
                            } else {
                                long j13 = i18;
                                i13 = i10 + 5;
                                long j14 = j13 ^ (((long) bArr[i17]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j14 = j15 ^ (((long) bArr[i19]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j15 = j14 ^ (((long) bArr[i13]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j9 = j16;
                                            }
                                        }
                                    }
                                    j9 = j15 ^ j10;
                                    i13 = i19;
                                }
                                j9 = j14 ^ j11;
                            }
                        }
                    }
                    this.f12489k = i13;
                    return j9;
                }
            }
            return S();
        }

        long S() throws C1115z {
            long j9 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j9 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j9;
                }
            }
            throw C1115z.f();
        }

        public void W(int i10) throws C1115z {
            int i11 = this.f12487i;
            int i12 = this.f12489k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f12489k = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public void a(int i10) throws C1115z {
            if (this.f12490l != i10) {
                throw C1115z.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int e() {
            return this.f12491m + this.f12489k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public boolean f() {
            return this.f12489k == this.f12487i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public void l(int i10) {
            this.f12492n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int m(int i10) throws C1115z {
            if (i10 < 0) {
                throw C1115z.g();
            }
            int i11 = i10 + this.f12491m + this.f12489k;
            if (i11 < 0) {
                throw C1115z.h();
            }
            int i12 = this.f12492n;
            if (i11 > i12) {
                throw C1115z.m();
            }
            this.f12492n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public AbstractC1097g o() throws C1115z {
            int iQ = Q();
            int i10 = this.f12487i;
            int i11 = this.f12489k;
            if (iQ <= i10 - i11 && iQ > 0) {
                AbstractC1097g abstractC1097gJ = AbstractC1097g.j(this.f12486h, i11, iQ);
                this.f12489k += iQ;
                return abstractC1097gJ;
            }
            if (iQ == 0) {
                return AbstractC1097g.f12460r;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw C1115z.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public int y() {
            return AbstractC1098h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1098h
        public long z() {
            return AbstractC1098h.d(R());
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f12492n = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            AbstractC1114y.b(inputStream, "input");
            this.f12485g = inputStream;
            this.f12486h = new byte[i10];
            this.f12487i = 0;
            this.f12489k = 0;
            this.f12491m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    public static AbstractC1098h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC1098h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(AbstractC1114y.f12699d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC1098h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC1098h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static AbstractC1098h k(byte[] bArr, int i10, int i11, boolean z9) {
        b bVar = new b(bArr, i10, i11, z9);
        try {
            bVar.m(i11);
            return bVar;
        } catch (C1115z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws C1115z {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f12471a++;
            zF = F(iC);
            this.f12471a--;
        } while (zF);
    }

    public abstract void a(int i10);

    public void b() throws C1115z {
        if (this.f12471a >= this.f12472b) {
            throw C1115z.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract AbstractC1097g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    private AbstractC1098h() {
        this.f12472b = f12470f;
        this.f12473c = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f12475e = false;
    }
}
