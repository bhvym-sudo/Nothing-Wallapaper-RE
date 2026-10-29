package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class E extends L {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11247f;

    public /* synthetic */ E(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void g() {
        if (this.f11284d <= 8 || Long.compareUnsigned(p079h8.x.d(p079h8.x.d(this.f11285e) * 32), p079h8.x.d(p079h8.x.d(this.f11284d) * 25)) > 0) {
            q(M.e(this.f11284d));
        } else {
            i();
        }
    }

    private final void i() {
        long[] jArr = this.f11281a;
        int i10 = this.f11284d;
        Object[] objArr = this.f11282b;
        Object[] objArr2 = this.f11283c;
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
                    Object obj = objArr[i11];
                    int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                    int i14 = iHashCode ^ (iHashCode << 16);
                    int i15 = i14 >>> 7;
                    int iJ = j(i15);
                    int i16 = i15 & i10;
                    if (((iJ - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[AbstractC1439m.G(jArr)] = jArr[0];
                    } else {
                        int i17 = iJ >> 3;
                        long j10 = jArr[i17];
                        int i18 = (iJ & 7) << 3;
                        if (((j10 >> i18) & 255) == 128) {
                            jArr[i17] = (j10 & (~(255 << i18))) | (((long) (i14 & 127)) << i18);
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            objArr[iJ] = objArr[i11];
                            objArr[i11] = null;
                            objArr2[iJ] = objArr2[i11];
                            objArr2[i11] = null;
                            iB = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            if (iB == -1) {
                                iB = M.b(jArr, i11 + 1, i10);
                            }
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i11];
                            objArr[i11] = objArr[iB];
                            objArr2[iB] = objArr2[iJ];
                            objArr2[iJ] = objArr2[i11];
                            objArr2[i11] = objArr2[iB];
                            i11--;
                        }
                        jArr[AbstractC1439m.G(jArr)] = jArr[0];
                    }
                }
                i11++;
            }
        }
        l();
    }

    private final int j(int i10) {
        int i11 = this.f11284d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11281a;
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

    private final void l() {
        this.f11247f = M.c(c()) - this.f11285e;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = M.f11286a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC1439m.s(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f11281a = jArr;
        int i11 = i10 >> 3;
        long j9 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        l();
    }

    private final void n(int i10) {
        int iMax = i10 > 0 ? Math.max(7, M.f(i10)) : 0;
        this.f11284d = iMax;
        m(iMax);
        this.f11282b = new Object[iMax];
        this.f11283c = new Object[iMax];
    }

    private final void q(int i10) {
        int i11;
        long[] jArr = this.f11281a;
        Object[] objArr = this.f11282b;
        Object[] objArr2 = this.f11283c;
        int i12 = this.f11284d;
        n(i10);
        long[] jArr2 = this.f11281a;
        Object[] objArr3 = this.f11282b;
        Object[] objArr4 = this.f11283c;
        int i13 = this.f11284d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iJ = j(i15 >>> 7);
                i11 = i14;
                long j9 = i15 & 127;
                int i16 = iJ >> 3;
                int i17 = (iJ & 7) << 3;
                long j10 = (j9 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j10;
                jArr2[(((iJ - 7) & i13) + (i13 & 7)) >> 3] = j10;
                objArr3[iJ] = obj;
                objArr4[iJ] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void h() {
        this.f11285e = 0;
        long[] jArr = this.f11281a;
        if (jArr != M.f11286a) {
            AbstractC1439m.s(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f11281a;
            int i10 = this.f11284d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        AbstractC1439m.q(this.f11283c, null, 0, this.f11284d);
        AbstractC1439m.q(this.f11282b, null, 0, this.f11284d);
        l();
    }

    public final int k(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f11284d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f11281a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = i12;
            int i18 = i12;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j12) >> 3)) & i13;
                if (kotlin.jvm.internal.n.d(this.f11282b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iJ = j(i11);
                if (this.f11247f == 0 && ((this.f11281a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    g();
                    iJ = j(i11);
                }
                this.f11285e++;
                int i19 = this.f11247f;
                long[] jArr2 = this.f11281a;
                int i20 = iJ >> 3;
                long j13 = jArr2[i20];
                int i21 = (iJ & 7) << 3;
                this.f11247f = i19 - (((j13 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f11284d;
                long j14 = ((~(255 << i21)) & j13) | (j10 << i21);
                jArr2[i20] = j14;
                jArr2[(((iJ - 7) & i22) + (i22 & 7)) >> 3] = j14;
                return ~iJ;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final Object o(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f11284d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f11281a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.n.d(this.f11282b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return p(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object p(int i10) {
        this.f11285e--;
        long[] jArr = this.f11281a;
        int i11 = this.f11284d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        this.f11282b[i10] = null;
        Object[] objArr = this.f11283c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void r(Object obj, Object obj2) {
        int iK = k(obj);
        if (iK < 0) {
            iK = ~iK;
        }
        this.f11282b[iK] = obj;
        this.f11283c[iK] = obj2;
    }

    public E(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            p150p.d.a("Capacity must be a positive value.");
        }
        n(M.g(i10));
    }
}
