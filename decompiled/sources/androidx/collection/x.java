package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC1031k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11369f;

    public /* synthetic */ x(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f11333d <= 8 || Long.compareUnsigned(p079h8.x.d(p079h8.x.d(this.f11334e) * 32), p079h8.x.d(p079h8.x.d(this.f11333d) * 25)) > 0) {
            r(M.e(this.f11333d));
        } else {
            j();
        }
    }

    private final void j() {
        long[] jArr = this.f11330a;
        int i10 = this.f11333d;
        int[] iArr = this.f11331b;
        Object[] objArr = this.f11332c;
        M.a(jArr, i10);
        int i11 = 0;
        int iB = -1;
        while (i11 != i10) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j9 = (jArr[i12] >> i13) & 255;
            if (j9 == 128) {
                iB = i11;
                i11++;
            } else {
                if (j9 == 254) {
                    int iHashCode = Integer.hashCode(iArr[i11]) * (-862048943);
                    int i14 = iHashCode ^ (iHashCode << 16);
                    int i15 = i14 >>> 7;
                    int iL = l(i15);
                    int i16 = i15 & i10;
                    if (((iL - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iL >> 3;
                        long j10 = jArr[i17];
                        int i18 = (iL & 7) << 3;
                        if (((j10 >> i18) & 255) == 128) {
                            jArr[i17] = (j10 & (~(255 << i18))) | (((long) (i14 & 127)) << i18);
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            iArr[iL] = iArr[i11];
                            iArr[i11] = 0;
                            objArr[iL] = objArr[i11];
                            objArr[i11] = null;
                            iB = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            if (iB == -1) {
                                iB = M.b(jArr, i11 + 1, i10);
                            }
                            iArr[iB] = iArr[iL];
                            iArr[iL] = iArr[i11];
                            iArr[i11] = iArr[iB];
                            objArr[iB] = objArr[iL];
                            objArr[iL] = objArr[i11];
                            objArr[i11] = objArr[iB];
                            i11--;
                        }
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i11++;
            }
        }
        m();
    }

    private final int k(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f11333d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f11330a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j9 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = i13;
            int i20 = i16;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.f11331b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iL = l(i12);
                if (this.f11369f == 0 && ((this.f11330a[iL >> 3] >> ((iL & 7) << 3)) & 255) != 254) {
                    h();
                    iL = l(i12);
                }
                this.f11334e++;
                int i23 = this.f11369f;
                long[] jArr2 = this.f11330a;
                int i24 = iL >> 3;
                long j13 = jArr2[i24];
                int i25 = (iL & 7) << 3;
                this.f11369f = i23 - (((j13 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f11333d;
                long j14 = ((~(255 << i25)) & j13) | (j10 << i25);
                jArr2[i24] = j14;
                jArr2[(((iL - 7) & i26) + (i26 & 7)) >> 3] = j14;
                return iL;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int l(int i10) {
        int i11 = this.f11333d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11330a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = j9 & ((~j9) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void m() {
        this.f11369f = M.c(d()) - this.f11334e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = M.f11286a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC1439m.s(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f11330a = jArr;
        int i11 = i10 >> 3;
        long j9 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, M.f(i10)) : 0;
        this.f11333d = iMax;
        n(iMax);
        this.f11331b = new int[iMax];
        this.f11332c = new Object[iMax];
    }

    private final void r(int i10) {
        x xVar = this;
        long[] jArr = xVar.f11330a;
        int[] iArr = xVar.f11331b;
        Object[] objArr = xVar.f11332c;
        int i11 = xVar.f11333d;
        o(i10);
        long[] jArr2 = xVar.f11330a;
        int[] iArr2 = xVar.f11331b;
        Object[] objArr2 = xVar.f11332c;
        int i12 = xVar.f11333d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iL = xVar.l(i15 >>> 7);
                long j9 = i15 & 127;
                int i16 = iL >> 3;
                int i17 = (iL & 7) << 3;
                long j10 = (jArr2[i16] & (~(255 << i17))) | (j9 << i17);
                jArr2[i16] = j10;
                jArr2[(((iL - 7) & i12) + (i12 & 7)) >> 3] = j10;
                iArr2[iL] = i14;
                objArr2[iL] = objArr[i13];
            }
            i13++;
            xVar = this;
            jArr = jArr;
        }
    }

    public final void i() {
        this.f11334e = 0;
        long[] jArr = this.f11330a;
        if (jArr != M.f11286a) {
            AbstractC1439m.s(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f11330a;
            int i10 = this.f11333d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        AbstractC1439m.q(this.f11332c, null, 0, this.f11333d);
        m();
    }

    public final Object p(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f11333d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f11330a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f11331b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return q(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object q(int i10) {
        this.f11334e--;
        long[] jArr = this.f11330a;
        int i11 = this.f11333d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        Object[] objArr = this.f11332c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void s(int i10, Object obj) {
        int iK = k(i10);
        this.f11331b[iK] = i10;
        this.f11332c[iK] = obj;
    }

    public x(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            p150p.d.a("Capacity must be a positive value.");
        }
        o(M.g(i10));
    }
}
