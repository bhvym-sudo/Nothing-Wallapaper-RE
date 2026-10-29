package E8;

import p089i8.AbstractC1429c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends s {
    public static /* synthetic */ boolean A(String str, String str2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return z(str, str2, z9);
    }

    public static boolean B(String str, String str2, boolean z9) {
        if (str == null) {
            return str2 == null;
        }
        return !z9 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean C(String str, String str2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return B(str, str2, z9);
    }

    public static final boolean D(String str, int i10, String other, int i11, int i12, boolean z9) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(other, "other");
        return !z9 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z9, i10, other, i11, i12);
    }

    public static String E(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.e(string);
        return string;
    }

    public static final String F(String str, char c10, char c11, boolean z9) {
        kotlin.jvm.internal.n.h(str, "<this>");
        if (!z9) {
            String strReplace = str.replace(c10, c11);
            kotlin.jvm.internal.n.g(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (c.d(cCharAt, c10, z9)) {
                cCharAt = c11;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String G(String str, String oldValue, String newValue, boolean z9) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(oldValue, "oldValue");
        kotlin.jvm.internal.n.h(newValue, "newValue");
        int i10 = 0;
        int iZ = w.Z(str, oldValue, 0, z9);
        if (iZ < 0) {
            return str;
        }
        int length = oldValue.length();
        int iF = B8.h.f(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i10, iZ);
            sb.append(newValue);
            i10 = iZ + length;
            if (iZ >= str.length()) {
                break;
            }
            iZ = w.Z(str, oldValue, iZ + iF, z9);
        } while (iZ > 0);
        sb.append((CharSequence) str, i10, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String H(String str, char c10, char c11, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return F(str, c10, c11, z9);
    }

    public static /* synthetic */ String I(String str, String str2, String str3, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return G(str, str2, str3, z9);
    }

    public static boolean J(String str, String prefix, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        return !z9 ? str.startsWith(prefix, i10) : D(str, i10, prefix, 0, prefix.length(), z9);
    }

    public static boolean K(String str, String prefix, boolean z9) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        return !z9 ? str.startsWith(prefix) : D(str, 0, prefix, 0, prefix.length(), z9);
    }

    public static /* synthetic */ boolean L(String str, String str2, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return J(str, str2, i10, z9);
    }

    public static /* synthetic */ boolean M(String str, String str2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return K(str, str2, z9);
    }

    public static String x(char[] cArr) {
        kotlin.jvm.internal.n.h(cArr, "<this>");
        return new String(cArr);
    }

    public static String y(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.n.h(cArr, "<this>");
        AbstractC1429c.f22259q.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static final boolean z(String str, String suffix, boolean z9) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(suffix, "suffix");
        return !z9 ? str.endsWith(suffix) : D(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }
}
