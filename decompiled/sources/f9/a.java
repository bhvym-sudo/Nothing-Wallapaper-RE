package f9;

import e9.C1350e;
import e9.E;
import e9.r;
import e9.w;
import java.io.EOFException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20885a = E.a("0123456789abcdef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long[] f20886b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(long j9) {
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j9)) * 10) >>> 5;
        return iNumberOfLeadingZeros + (j9 > f20886b[iNumberOfLeadingZeros] ? 1 : 0);
    }

    public static final byte[] c() {
        return f20885a;
    }

    public static final boolean d(w segment, int i10, byte[] bytes, int i11, int i12) {
        n.h(segment, "segment");
        n.h(bytes, "bytes");
        int i13 = segment.f20309c;
        byte[] bArr = segment.f20307a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f20312f;
                n.e(segment);
                byte[] bArr2 = segment.f20307a;
                bArr = bArr2;
                i10 = segment.f20308b;
                i13 = segment.f20309c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String e(C1350e c1350e, long j9) throws EOFException {
        n.h(c1350e, "<this>");
        if (j9 > 0) {
            long j10 = j9 - 1;
            if (c1350e.U(j10) == 13) {
                String strT0 = c1350e.T0(j10);
                c1350e.skip(2L);
                return strT0;
            }
        }
        String strT1 = c1350e.T0(j9);
        c1350e.skip(1L);
        return strT1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int f(C1350e c1350e, r options, boolean z9) {
        int i10;
        int i11;
        w wVar;
        int i12;
        int i13;
        n.h(c1350e, "<this>");
        n.h(options, "options");
        w wVar2 = c1350e.f20257q;
        if (wVar2 == null) {
            return z9 ? -2 : -1;
        }
        byte[] bArr = wVar2.f20307a;
        int i14 = wVar2.f20308b;
        int i15 = wVar2.f20309c;
        int[] iArrO = options.o();
        w wVar3 = wVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArrO[i17];
            int i20 = i17 + 2;
            int i21 = iArrO[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (wVar3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArrO[i20]) {
                        i11 = iArrO[i20 + i19];
                        if (i10 == i15) {
                            wVar3 = wVar3.f20312f;
                            n.e(wVar3);
                            i10 = wVar3.f20308b;
                            bArr = wVar3.f20307a;
                            i15 = wVar3.f20309c;
                            if (wVar3 == wVar2) {
                                wVar3 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) == iArrO[i20]) {
                    boolean z10 = i26 == i24;
                    if (i25 == i15) {
                        n.e(wVar3);
                        w wVar4 = wVar3.f20312f;
                        n.e(wVar4);
                        i13 = wVar4.f20308b;
                        byte[] bArr2 = wVar4.f20307a;
                        i12 = wVar4.f20309c;
                        if (wVar4 != wVar2) {
                            wVar = wVar4;
                            bArr = bArr2;
                        } else {
                            if (!z10) {
                                break loop0;
                            }
                            bArr = bArr2;
                            wVar = null;
                        }
                    } else {
                        wVar = wVar3;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z10) {
                        i11 = iArrO[i26];
                        i10 = i13;
                        i15 = i12;
                        wVar3 = wVar;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    wVar3 = wVar;
                    i20 = i26;
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z9) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int g(C1350e c1350e, r rVar, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return f(c1350e, rVar, z9);
    }
}
