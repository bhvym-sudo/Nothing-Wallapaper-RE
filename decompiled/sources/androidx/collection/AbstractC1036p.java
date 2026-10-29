package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.collection.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1036p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f11348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11350d;

    public /* synthetic */ AbstractC1036p(AbstractC1457h abstractC1457h) {
        this();
    }

    public static /* synthetic */ String d(AbstractC1036p abstractC1036p, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return abstractC1036p.c(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean a(long j9) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b() {
        return this.f11349c;
    }

    public final String c(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        int i11;
        kotlin.jvm.internal.n.h(separator, "separator");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        kotlin.jvm.internal.n.h(postfix, "postfix");
        kotlin.jvm.internal.n.h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.f11348b;
        long[] jArr2 = this.f11347a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append(postfix);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j9 = jArr2[i12];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j9) < 128) {
                        long j10 = jArr[(i12 << 3) + i15];
                        if (i13 == i10) {
                            sb.append(truncated);
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb.append(separator);
                        }
                        sb.append(j10);
                        i13++;
                    }
                    j9 >>= 8;
                    i15++;
                    i12 = i12;
                }
                int i16 = i12;
                if (i14 == 8) {
                    i11 = i16;
                }
                sb.append(postfix);
                break;
            }
            i11 = i12;
            if (i11 == length) {
                sb.append(postfix);
                break;
            }
            i12 = i11 + 1;
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
        if (!(obj instanceof AbstractC1036p)) {
            return false;
        }
        AbstractC1036p abstractC1036p = (AbstractC1036p) obj;
        if (abstractC1036p.f11350d != this.f11350d) {
            return false;
        }
        long[] jArr = this.f11348b;
        long[] jArr2 = this.f11347a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr2[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && !abstractC1036p.a(jArr[(i10 << 3) + i12])) {
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
        long[] jArr = this.f11348b;
        long[] jArr2 = this.f11347a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j9 = jArr2[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        iHashCode += Long.hashCode(jArr[(i10 << 3) + i12]);
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

    private AbstractC1036p() {
        this.f11347a = M.f11286a;
        this.f11348b = AbstractC1037q.a();
    }
}
