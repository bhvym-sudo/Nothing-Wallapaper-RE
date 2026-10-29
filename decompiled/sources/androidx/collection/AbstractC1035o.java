package androidx.collection;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: androidx.collection.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1035o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f11342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f11343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11346e;

    public /* synthetic */ AbstractC1035o(AbstractC1457h abstractC1457h) {
        this();
    }

    public final boolean a(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f11345d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f11342a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f11343b[iNumberOfTrailingZeros] == j9) {
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

    public final Object b(long j9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f11345d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f11342a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f11343b[iNumberOfTrailingZeros] == j9) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f11344c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int c() {
        return this.f11345d;
    }

    public final int d() {
        return this.f11346e;
    }

    public final boolean e() {
        return this.f11346e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1035o)) {
            return false;
        }
        AbstractC1035o abstractC1035o = (AbstractC1035o) obj;
        if (abstractC1035o.d() != d()) {
            return false;
        }
        long[] jArr = this.f11343b;
        Object[] objArr = this.f11344c;
        long[] jArr2 = this.f11342a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr2[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            long j10 = jArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (abstractC1035o.b(j10) != null || !abstractC1035o.a(j10)) {
                                    return false;
                                }
                            } else if (!kotlin.jvm.internal.n.d(obj2, abstractC1035o.b(j10))) {
                                return false;
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        long[] jArr = this.f11343b;
        Object[] objArr = this.f11344c;
        long[] jArr2 = this.f11342a;
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
                        int i13 = (i10 << 3) + i12;
                        long j10 = jArr[i13];
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j10);
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
        int i10;
        int i11;
        if (e()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        long[] jArr = this.f11343b;
        Object[] objArr = this.f11344c;
        long[] jArr2 = this.f11342a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i12];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j9) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j10 = jArr[i16];
                            Object obj = objArr[i16];
                            sb.append(j10);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i13++;
                            if (i13 < this.f11346e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i11 = i12;
                        }
                        j9 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "s.append('}').toString()");
        return string;
    }

    private AbstractC1035o() {
        this.f11342a = M.f11286a;
        this.f11343b = AbstractC1037q.a();
        this.f11344c = p150p.a.f23565c;
    }
}
