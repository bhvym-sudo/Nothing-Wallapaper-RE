package androidx.collection;

import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC1035o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11371f;

    public z(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            p150p.d.a("Capacity must be a positive value.");
        }
        m(M.g(i10));
    }

    private final void f() {
        if (this.f11345d <= 8 || Long.compareUnsigned(p079h8.x.d(p079h8.x.d(this.f11346e) * 32), p079h8.x.d(p079h8.x.d(this.f11345d) * 25)) > 0) {
            n(M.e(this.f11345d));
        } else {
            h();
        }
    }

    private final void h() {
        long[] jArr = this.f11342a;
        int i10 = this.f11345d;
        long[] jArr2 = this.f11343b;
        Object[] objArr = this.f11344c;
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
                    int iHashCode = Long.hashCode(jArr2[i11]) * (-862048943);
                    int i14 = iHashCode ^ (iHashCode << 16);
                    int i15 = i14 >>> 7;
                    int iJ = j(i15);
                    int i16 = i15 & i10;
                    if (((iJ - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iJ >> 3;
                        long j10 = jArr[i17];
                        int i18 = (iJ & 7) << 3;
                        if (((j10 >> i18) & 255) == 128) {
                            jArr[i17] = (j10 & (~(255 << i18))) | (((long) (i14 & 127)) << i18);
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            jArr2[iJ] = jArr2[i11];
                            jArr2[i11] = 0;
                            objArr[iJ] = objArr[i11];
                            objArr[i11] = null;
                            iB = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            if (iB == -1) {
                                iB = M.b(jArr, i11 + 1, i10);
                            }
                            jArr2[iB] = jArr2[iJ];
                            jArr2[iJ] = jArr2[i11];
                            jArr2[i11] = jArr2[iB];
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i11];
                            objArr[i11] = objArr[iB];
                            i11--;
                        }
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i11++;
            }
        }
        k();
    }

    private final int i(long j9) {
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f11345d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f11342a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f11343b[iNumberOfTrailingZeros] == j9) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.f11371f == 0 && ((this.f11342a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i11);
                }
                this.f11346e++;
                int i19 = this.f11371f;
                long[] jArr2 = this.f11342a;
                int i20 = iJ >> 3;
                long j14 = jArr2[i20];
                int i21 = (iJ & 7) << 3;
                this.f11371f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f11345d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iJ - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iJ;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int j(int i10) {
        int i11 = this.f11345d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11342a;
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

    private final void k() {
        this.f11371f = M.c(c()) - this.f11346e;
    }

    private final void l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = M.f11286a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC1439m.s(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f11342a = jArr;
        int i11 = i10 >> 3;
        long j9 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        k();
    }

    private final void m(int i10) {
        int iMax = i10 > 0 ? Math.max(7, M.f(i10)) : 0;
        this.f11345d = iMax;
        l(iMax);
        this.f11343b = new long[iMax];
        this.f11344c = new Object[iMax];
    }

    private final void n(int i10) {
        z zVar = this;
        long[] jArr = zVar.f11342a;
        long[] jArr2 = zVar.f11343b;
        Object[] objArr = zVar.f11344c;
        int i11 = zVar.f11345d;
        m(i10);
        long[] jArr3 = zVar.f11342a;
        long[] jArr4 = zVar.f11343b;
        Object[] objArr2 = zVar.f11344c;
        int i12 = zVar.f11345d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j9 = jArr2[i13];
                int iHashCode = Long.hashCode(j9) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iJ = zVar.j(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iJ >> 3;
                int i16 = (iJ & 7) << 3;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iJ - 7) & i12) + (i12 & 7)) >> 3] = j11;
                jArr4[iJ] = j9;
                objArr2[iJ] = objArr[i13];
            }
            i13++;
            zVar = this;
            jArr = jArr;
        }
    }

    public final void g() {
        this.f11346e = 0;
        long[] jArr = this.f11342a;
        if (jArr != M.f11286a) {
            AbstractC1439m.s(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f11342a;
            int i10 = this.f11345d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        AbstractC1439m.q(this.f11344c, null, 0, this.f11345d);
        k();
    }

    public final void o(long j9, Object obj) {
        int i10 = i(j9);
        this.f11343b[i10] = j9;
        this.f11344c[i10] = obj;
    }
}
