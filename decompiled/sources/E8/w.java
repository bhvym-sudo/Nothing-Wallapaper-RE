package E8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends t {

    public static final class a implements D8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f1478a;

        public a(CharSequence charSequence) {
            this.f1478a = charSequence;
        }

        @Override // D8.h
        public Iterator iterator() {
            return new f(this.f1478a);
        }
    }

    public static final List A0(CharSequence charSequence, String[] delimiters, boolean z9, int i10) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return B0(charSequence, str, z9, i10);
            }
        }
        Iterable iterableM = D8.k.m(s0(charSequence, delimiters, 0, z9, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(iterableM, 10));
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            arrayList.add(G0(charSequence, (B8.g) it.next()));
        }
        return arrayList;
    }

    private static final List B0(CharSequence charSequence, String str, boolean z9, int i10) {
        y0(i10);
        int length = 0;
        int iZ = Z(charSequence, str, 0, z9);
        if (iZ == -1 || i10 == 1) {
            return AbstractC1444s.e(charSequence.toString());
        }
        boolean z10 = i10 > 0;
        ArrayList arrayList = new ArrayList(z10 ? B8.h.i(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iZ).toString());
            length = str.length() + iZ;
            if (z10 && arrayList.size() == i10 - 1) {
                break;
            }
            iZ = Z(charSequence, str, length, z9);
        } while (iZ != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List C0(CharSequence charSequence, char[] cArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return z0(charSequence, cArr, z9, i10);
    }

    public static /* synthetic */ List D0(CharSequence charSequence, String[] strArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return A0(charSequence, strArr, z9, i10);
    }

    public static final boolean E0(CharSequence charSequence, CharSequence prefix, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        return (!z9 && (charSequence instanceof String) && (prefix instanceof String)) ? t.M((String) charSequence, (String) prefix, false, 2, null) : v0(charSequence, 0, prefix, 0, prefix.length(), z9);
    }

    public static /* synthetic */ boolean F0(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return E0(charSequence, charSequence2, z9);
    }

    public static final String G0(CharSequence charSequence, B8.g range) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(range, "range");
        return charSequence.subSequence(range.a().intValue(), range.f().intValue() + 1).toString();
    }

    public static final String H0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(missingDelimiterValue, "missingDelimiterValue");
        int iC0 = c0(str, c10, 0, false, 6, null);
        if (iC0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iC0 + 1, str.length());
        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String I0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(delimiter, "delimiter");
        kotlin.jvm.internal.n.h(missingDelimiterValue, "missingDelimiterValue");
        int iD0 = d0(str, delimiter, 0, false, 6, null);
        if (iD0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iD0 + delimiter.length(), str.length());
        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String J0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return H0(str, c10, str2);
    }

    public static /* synthetic */ String K0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return I0(str, str2, str3);
    }

    public static String L0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = i0(str, c10, 0, false, 6, null);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iI0 + 1, str.length());
        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String M0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return L0(str, c10, str2);
    }

    public static CharSequence N0(CharSequence charSequence) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean zC = b.c(charSequence.charAt(!z9 ? i10 : length));
            if (z9) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z9 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean P(CharSequence charSequence, char c10, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        return c0(charSequence, c10, 0, z9, 2, null) >= 0;
    }

    public static boolean Q(CharSequence charSequence, CharSequence other, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(other, "other");
        if (other instanceof String) {
            return d0(charSequence, (String) other, 0, z9, 2, null) >= 0;
        }
        return b0(charSequence, other, 0, charSequence.length(), z9, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean R(CharSequence charSequence, char c10, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return P(charSequence, c10, z9);
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return Q(charSequence, charSequence2, z9);
    }

    public static final boolean T(CharSequence charSequence, CharSequence suffix, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(suffix, "suffix");
        return (!z9 && (charSequence instanceof String) && (suffix instanceof String)) ? t.A((String) charSequence, (String) suffix, false, 2, null) : v0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z9);
    }

    public static /* synthetic */ boolean U(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return T(charSequence, charSequence2, z9);
    }

    private static final p079h8.o V(CharSequence charSequence, Collection collection, int i10, boolean z9, boolean z10) {
        CharSequence charSequence2;
        Object next;
        boolean z11;
        Object next2;
        if (!z9 && collection.size() == 1) {
            String str = (String) AbstractC1444s.i0(collection);
            int iD0 = !z10 ? d0(charSequence, str, i10, false, 4, null) : j0(charSequence, str, i10, false, 4, null);
            if (iD0 < 0) {
                return null;
            }
            return p079h8.v.a(Integer.valueOf(iD0), str);
        }
        CharSequence charSequence3 = charSequence;
        B8.e gVar = !z10 ? new B8.g(B8.h.f(i10, 0), charSequence3.length()) : B8.h.n(B8.h.i(i10, X(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iG = gVar.g();
            int iM = gVar.m();
            int iN = gVar.n();
            if ((iN > 0 && iG <= iM) || (iN < 0 && iM <= iG)) {
                int i11 = iG;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = z9;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z11 = z9;
                        if (t.D(str2, 0, (String) charSequence3, i11, str2.length(), z11)) {
                            break;
                        }
                        z9 = z11;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return p079h8.v.a(Integer.valueOf(i11), str3);
                    }
                    if (i11 != iM) {
                        i11 += iN;
                        z9 = z11;
                    }
                }
            }
        } else {
            boolean z12 = z9;
            int iG2 = gVar.g();
            int iM2 = gVar.m();
            int iN2 = gVar.n();
            if ((iN2 > 0 && iG2 <= iM2) || (iN2 < 0 && iM2 <= iG2)) {
                int i12 = iG2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z13 = z12;
                        charSequence2 = charSequence3;
                        z12 = z13;
                        if (v0(str4, 0, charSequence2, i12, str4.length(), z13)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return p079h8.v.a(Integer.valueOf(i12), str5);
                    }
                    if (i12 != iM2) {
                        i12 += iN2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static B8.g W(CharSequence charSequence) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        return new B8.g(0, charSequence.length() - 1);
    }

    public static final int X(CharSequence charSequence) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Y(CharSequence charSequence, char c10, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        return (z9 || !(charSequence instanceof String)) ? e0(charSequence, new char[]{c10}, i10, z9) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int Z(CharSequence charSequence, String string, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(string, "string");
        return (z9 || !(charSequence instanceof String)) ? b0(charSequence, string, i10, charSequence.length(), z9, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    private static final int a0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10) {
        B8.e gVar = !z10 ? new B8.g(B8.h.f(i10, 0), B8.h.i(i11, charSequence.length())) : B8.h.n(B8.h.i(i10, X(charSequence)), B8.h.f(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iG = gVar.g();
            int iM = gVar.m();
            int iN = gVar.n();
            if ((iN <= 0 || iG > iM) && (iN >= 0 || iM > iG)) {
                return -1;
            }
            int i12 = iG;
            while (true) {
                String str = (String) charSequence2;
                boolean z11 = z9;
                if (t.D(str, 0, (String) charSequence, i12, str.length(), z11)) {
                    return i12;
                }
                if (i12 == iM) {
                    return -1;
                }
                i12 += iN;
                z9 = z11;
            }
        } else {
            boolean z12 = z9;
            int iG2 = gVar.g();
            int iM2 = gVar.m();
            int iN2 = gVar.n();
            if ((iN2 <= 0 || iG2 > iM2) && (iN2 >= 0 || iM2 > iG2)) {
                return -1;
            }
            int i13 = iG2;
            while (true) {
                boolean z13 = z12;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z12 = z13;
                if (v0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z13)) {
                    return i13;
                }
                if (i13 == iM2) {
                    return -1;
                }
                i13 += iN2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    static /* synthetic */ int b0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z10 = false;
        }
        return a0(charSequence, charSequence2, i10, i11, z9, z10);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, char c10, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return Y(charSequence, c10, i10, z9);
    }

    public static /* synthetic */ int d0(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return Z(charSequence, str, i10, z9);
    }

    public static final int e0(CharSequence charSequence, char[] chars, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(chars, "chars");
        if (!z9 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1439m.U(chars), i10);
        }
        int iF = B8.h.f(i10, 0);
        int iX = X(charSequence);
        if (iF > iX) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iF);
            for (char c10 : chars) {
                if (c.d(c10, cCharAt, z9)) {
                    return iF;
                }
            }
            if (iF == iX) {
                return -1;
            }
            iF++;
        }
    }

    public static boolean f0(CharSequence charSequence) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!b.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int g0(CharSequence charSequence, char c10, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        return (z9 || !(charSequence instanceof String)) ? k0(charSequence, new char[]{c10}, i10, z9) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int h0(CharSequence charSequence, String string, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(string, "string");
        return (z9 || !(charSequence instanceof String)) ? a0(charSequence, string, i10, 0, z9, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, char c10, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = X(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return g0(charSequence, c10, i10, z9);
    }

    public static /* synthetic */ int j0(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = X(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return h0(charSequence, str, i10, z9);
    }

    public static final int k0(CharSequence charSequence, char[] chars, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(chars, "chars");
        if (!z9 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC1439m.U(chars), i10);
        }
        for (int i11 = B8.h.i(i10, X(charSequence)); -1 < i11; i11--) {
            char cCharAt = charSequence.charAt(i11);
            for (char c10 : chars) {
                if (c.d(c10, cCharAt, z9)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static final D8.h l0(CharSequence charSequence) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        return new a(charSequence);
    }

    public static List m0(CharSequence charSequence) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        return D8.k.C(l0(charSequence));
    }

    public static final CharSequence n0(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String o0(String str, int i10, char c10) {
        kotlin.jvm.internal.n.h(str, "<this>");
        return n0(str, i10, c10).toString();
    }

    private static final D8.h p0(CharSequence charSequence, final char[] cArr, int i10, final boolean z9, int i11) {
        y0(i11);
        return new e(charSequence, i10, i11, new p219v8.p() { // from class: E8.v
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return w.t0(cArr, z9, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final D8.h q0(CharSequence charSequence, String[] strArr, int i10, final boolean z9, int i11) {
        y0(i11);
        final List listC = AbstractC1439m.c(strArr);
        return new e(charSequence, i10, i11, new p219v8.p() { // from class: E8.u
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return w.u0(listC, z9, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ D8.h r0(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return p0(charSequence, cArr, i10, z9, i11);
    }

    static /* synthetic */ D8.h s0(CharSequence charSequence, String[] strArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return q0(charSequence, strArr, i10, z9, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.o t0(char[] cArr, boolean z9, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.n.h(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iE0 = e0(DelimitedRangesSequence, cArr, i10, z9);
        if (iE0 < 0) {
            return null;
        }
        return p079h8.v.a(Integer.valueOf(iE0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.o u0(List list, boolean z9, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.n.h(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        p079h8.o oVarV = V(DelimitedRangesSequence, list, i10, z9, false);
        if (oVarV != null) {
            return p079h8.v.a(oVarV.c(), Integer.valueOf(((String) oVarV.d()).length()));
        }
        return null;
    }

    public static final boolean v0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z9) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z9)) {
                return false;
            }
        }
        return true;
    }

    public static String w0(String str, CharSequence prefix) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(prefix, "prefix");
        if (!F0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String x0(String str, CharSequence suffix) {
        kotlin.jvm.internal.n.h(str, "<this>");
        kotlin.jvm.internal.n.h(suffix, "suffix");
        if (!U(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void y0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List z0(CharSequence charSequence, char[] delimiters, boolean z9, int i10) {
        kotlin.jvm.internal.n.h(charSequence, "<this>");
        kotlin.jvm.internal.n.h(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return B0(charSequence, String.valueOf(delimiters[0]), z9, i10);
        }
        Iterable iterableM = D8.k.m(r0(charSequence, delimiters, 0, z9, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(iterableM, 10));
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            arrayList.add(G0(charSequence, (B8.g) it.next()));
        }
        return arrayList;
    }
}
