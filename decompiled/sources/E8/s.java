package E8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s extends r {
    public static Byte p(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        return q(str, 10);
    }

    public static final Byte q(String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.n.h(str, "<this>");
        Integer numS = s(str, i10);
        if (numS == null || (iIntValue = numS.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    public static Integer r(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        return s(str, 10);
    }

    public static final Integer s(String str, int i10) {
        boolean z9;
        int i11;
        int i12;
        kotlin.jvm.internal.n.h(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (kotlin.jvm.internal.n.i(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z9 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z9 = true;
            }
        } else {
            z9 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iB = b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iB) {
                return null;
            }
            i13 = i12 - iB;
            i11++;
        }
        return z9 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    public static Long t(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        return u(str, 10);
    }

    public static final Long u(String str, int i10) {
        boolean z9;
        kotlin.jvm.internal.n.h(str, "<this>");
        b.a(i10);
        int length = str.length();
        Long l9 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j9 = -9223372036854775807L;
        if (kotlin.jvm.internal.n.i(cCharAt, 48) < 0) {
            z9 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z9 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j9 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z9 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i11 < length) {
            int iB = b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return l9;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return l9;
                }
                j11 = j9 / ((long) i10);
                if (j10 < j11) {
                    return l9;
                }
            }
            Long l10 = l9;
            int i12 = i11;
            long j12 = j10 * ((long) i10);
            long j13 = iB;
            if (j12 < j9 + j13) {
                return l10;
            }
            j10 = j12 - j13;
            i11 = i12 + 1;
            l9 = l10;
        }
        return z9 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }

    public static Short v(String str) {
        kotlin.jvm.internal.n.h(str, "<this>");
        return w(str, 10);
    }

    public static final Short w(String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.n.h(str, "<this>");
        Integer numS = s(str, i10);
        if (numS == null || (iIntValue = numS.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
