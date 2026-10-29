package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class B extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11245f;

    public /* synthetic */ B(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f11268d <= 8 || Long.compareUnsigned(p079h8.x.d(p079h8.x.d(this.f11269e) * 32), p079h8.x.d(p079h8.x.d(this.f11268d) * 25)) > 0) {
            q(M.e(this.f11268d));
        } else {
            j();
        }
    }

    private final void j() {
        long[] jArr = this.f11265a;
        int i10 = this.f11268d;
        Object[] objArr = this.f11266b;
        float[] fArr = this.f11267c;
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
                    int iK = k(i15);
                    int i16 = i15 & i10;
                    if (((iK - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iK >> 3;
                        long j10 = jArr[i17];
                        int i18 = (iK & 7) << 3;
                        if (((j10 >> i18) & 255) == 128) {
                            jArr[i17] = (j10 & (~(255 << i18))) | (((long) (i14 & 127)) << i18);
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            objArr[iK] = objArr[i11];
                            objArr[i11] = null;
                            fArr[iK] = fArr[i11];
                            fArr[i11] = 0.0f;
                            iB = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            if (iB == -1) {
                                iB = M.b(jArr, i11 + 1, i10);
                            }
                            objArr[iB] = objArr[iK];
                            objArr[iK] = objArr[i11];
                            objArr[i11] = objArr[iB];
                            fArr[iB] = fArr[iK];
                            fArr[iK] = fArr[i11];
                            fArr[i11] = fArr[iB];
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
        int i11 = this.f11268d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11265a;
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

    private final int l(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f11268d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f11265a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = i12;
            int i18 = i12;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j12) >> 3)) & i13;
                if (kotlin.jvm.internal.n.d(this.f11266b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iK = k(i11);
                if (this.f11245f == 0 && ((this.f11265a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i11);
                }
                this.f11269e++;
                int i19 = this.f11245f;
                long[] jArr2 = this.f11265a;
                int i20 = iK >> 3;
                long j13 = jArr2[i20];
                int i21 = (iK & 7) << 3;
                this.f11245f = i19 - (((j13 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f11268d;
                long j14 = ((~(255 << i21)) & j13) | (j10 << i21);
                jArr2[i20] = j14;
                jArr2[(((iK - 7) & i22) + (i22 & 7)) >> 3] = j14;
                return ~iK;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void m() {
        this.f11245f = M.c(d()) - this.f11269e;
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
        this.f11265a = jArr;
        int i11 = i10 >> 3;
        long j9 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        m();
    }

    private final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, M.f(i10)) : 0;
        this.f11268d = iMax;
        n(iMax);
        this.f11266b = new Object[iMax];
        this.f11267c = new float[iMax];
    }

    private final void q(int i10) {
        int i11;
        long[] jArr = this.f11265a;
        Object[] objArr = this.f11266b;
        float[] fArr = this.f11267c;
        int i12 = this.f11268d;
        o(i10);
        long[] jArr2 = this.f11265a;
        Object[] objArr2 = this.f11266b;
        float[] fArr2 = this.f11267c;
        int i13 = this.f11268d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = k(i15 >>> 7);
                i11 = i14;
                long j9 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j10 = (j9 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j10;
                jArr2[(((iK - 7) & i13) + (i13 & 7)) >> 3] = j10;
                objArr2[iK] = obj;
                fArr2[iK] = fArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void i() {
        this.f11269e = 0;
        long[] jArr = this.f11265a;
        if (jArr != M.f11286a) {
            AbstractC1439m.s(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f11265a;
            int i10 = this.f11268d;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        AbstractC1439m.q(this.f11266b, null, 0, this.f11268d);
        m();
    }

    public final void p(G from) {
        kotlin.jvm.internal.n.h(from, "from");
        Object[] objArr = from.f11266b;
        float[] fArr = from.f11267c;
        long[] jArr = from.f11265a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        r(objArr[i13], fArr[i13]);
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void r(Object obj, float f10) {
        int iL = l(obj);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f11266b[iL] = obj;
        this.f11267c[iL] = f10;
    }

    public B(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            p150p.d.a("Capacity must be a positive value.");
        }
        o(M.g(i10));
    }
}
