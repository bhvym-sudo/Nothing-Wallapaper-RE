package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.collection.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1033m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11339d;

    public /* synthetic */ AbstractC1033m(AbstractC1457h abstractC1457h) {
        this();
    }

    public static /* synthetic */ String e(AbstractC1033m abstractC1033m, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return abstractC1033m.d(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean a(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f11338c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f11336a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f11337b[iNumberOfTrailingZeros] == i10) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b() {
        return this.f11338c;
    }

    public final boolean c() {
        return this.f11339d != 0;
    }

    public final String d(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.f11337b;
        long[] jArr = this.f11336a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j9) < 128) {
                        int i15 = iArr[(i11 << 3) + i14];
                        if (i12 == i10) {
                            sb.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb.append(separator);
                        }
                        sb.append(i15);
                        i12++;
                    }
                    j9 >>= 8;
                }
                if (i13 == 8) {
                }
                sb.append(postfix);
                break;
            }
            if (i11 == length) {
                sb.append(postfix);
                break;
            }
            i11++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1033m)) {
            return false;
        }
        AbstractC1033m abstractC1033m = (AbstractC1033m) obj;
        if (abstractC1033m.f11339d != this.f11339d) {
            return false;
        }
        int[] iArr = this.f11337b;
        long[] jArr = this.f11336a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !abstractC1033m.a(iArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j9 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f11337b;
        long[] jArr = this.f11336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        iHashCode += Integer.hashCode(iArr[(i10 << 3) + i12]);
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public String toString() {
        return e(this, null, "[", "]", 0, null, 25, null);
    }

    private AbstractC1033m() {
        this.f11336a = M.f11286a;
        this.f11337b = AbstractC1034n.a();
    }
}
