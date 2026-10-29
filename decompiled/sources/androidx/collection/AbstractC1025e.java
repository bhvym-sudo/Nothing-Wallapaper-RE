package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.collection.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1025e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f11314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11316d;

    public /* synthetic */ AbstractC1025e(AbstractC1457h abstractC1457h) {
        this();
    }

    public static /* synthetic */ String d(AbstractC1025e abstractC1025e, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return abstractC1025e.c(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean a(float f10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Float.hashCode(f10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f11315c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f11313a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (this.f11314b[iNumberOfTrailingZeros] == f10) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b() {
        return this.f11315c;
    }

    public final String c(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.f11314b;
        long[] jArr = this.f11313a;
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
                        float f10 = fArr[(i11 << 3) + i14];
                        if (i12 == i10) {
                            sb.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb.append(separator);
                        }
                        sb.append(f10);
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
        if (!(obj instanceof AbstractC1025e)) {
            return false;
        }
        AbstractC1025e abstractC1025e = (AbstractC1025e) obj;
        if (abstractC1025e.f11316d != this.f11316d) {
            return false;
        }
        float[] fArr = this.f11314b;
        long[] jArr = this.f11313a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !abstractC1025e.a(fArr[(i10 << 3) + i12])) {
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
        float[] fArr = this.f11314b;
        long[] jArr = this.f11313a;
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
                        iHashCode += Float.hashCode(fArr[(i10 << 3) + i12]);
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
        return d(this, null, "[", "]", 0, null, 25, null);
    }

    private AbstractC1025e() {
        this.f11313a = M.f11286a;
        this.f11314b = AbstractC1026f.a();
    }
}
