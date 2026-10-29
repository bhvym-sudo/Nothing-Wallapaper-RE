package androidx.collection;

import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC1036p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11244e;

    public A(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            p150p.d.a("Capacity must be a positive value.");
        }
        k(M.g(i10));
    }

    private final void e() {
        if (this.f11349c <= 8 || Long.compareUnsigned(p079h8.x.d(p079h8.x.d(this.f11350d) * 32), p079h8.x.d(p079h8.x.d(this.f11349c) * 25)) > 0) {
            o(M.e(this.f11349c));
        } else {
            f();
        }
    }

    private final void f() {
        long[] jArr = this.f11347a;
        int i10 = this.f11349c;
        long[] jArr2 = this.f11348b;
        M.a(jArr, i10);
        int iB = -1;
        int i11 = 0;
        while (i11 != i10) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j9 = (jArr[i12] >> i13) & 255;
            if (j9 == 128) {
                iB = i11;
                i11++;
            } else {
                if (j9 == 254) {
                    int iHashCode = Long.hashCode(jArr2[i11]) * (-862048943);
                    int i14 = iHashCode ^ (iHashCode << 16);
                    int i15 = i14 >>> 7;
                    int iH = h(i15);
                    int i16 = i15 & i10;
                    if (((iH - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iH >> 3;
                        long j10 = jArr[i17];
                        int i18 = (iH & 7) << 3;
                        if (((j10 >> i18) & 255) == 128) {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            jArr2[iH] = jArr2[i11];
                            jArr2[i11] = 0;
                            iB = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            if (iB == -1) {
                                iB = M.b(jArr, i11 + 1, i10);
                            }
                            jArr2[iB] = jArr2[iH];
                            jArr2[iH] = jArr2[i11];
                            jArr2[i11] = jArr2[iB];
                            i11--;
                        }
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i11++;
            }
        }
        i();
    }

    private final int g(long j9) {
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f11349c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f11347a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f11348b[iNumberOfTrailingZeros] == j9) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iH = h(i11);
                if (this.f11244e == 0 && ((this.f11347a[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    e();
                    iH = h(i11);
                }
                this.f11350d++;
                int i19 = this.f11244e;
                long[] jArr2 = this.f11347a;
                int i20 = iH >> 3;
                long j14 = jArr2[i20];
                int i21 = (iH & 7) << 3;
                this.f11244e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f11349c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iH - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iH;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int h(int i10) {
        int i11 = this.f11349c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11347a;
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

    private final void i() {
        this.f11244e = M.c(b()) - this.f11350d;
    }

    private final void j(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = M.f11286a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC1439m.s(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f11347a = jArr;
        int i11 = i10 >> 3;
        long j9 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        i();
    }

    private final void k(int i10) {
        int iMax = i10 > 0 ? Math.max(7, M.f(i10)) : 0;
        this.f11349c = iMax;
        j(iMax);
        this.f11348b = new long[iMax];
    }

    private final void n(int i10) {
        this.f11350d--;
        long[] jArr = this.f11347a;
        int i11 = this.f11349c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
    }

    private final void o(int i10) {
        long[] jArr = this.f11347a;
        long[] jArr2 = this.f11348b;
        int i11 = this.f11349c;
        k(i10);
        long[] jArr3 = this.f11347a;
        long[] jArr4 = this.f11348b;
        int i12 = this.f11349c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j9 = jArr2[i13];
                int iHashCode = Long.hashCode(j9) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iH = h(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iH >> 3;
                int i16 = (iH & 7) << 3;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iH - 7) & i12) + (i12 & 7)) >> 3] = j11;
                jArr4[iH] = j9;
            }
        }
    }

    public final void l(long j9) {
        this.f11348b[g(j9)] = j9;
    }

    public final boolean m(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f11349c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f11347a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f11348b[iNumberOfTrailingZeros] == j9) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z9 = iNumberOfTrailingZeros >= 0;
        if (z9) {
            n(iNumberOfTrailingZeros);
        }
        return z9;
    }
}
