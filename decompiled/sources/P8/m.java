package P8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC1457h;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f6332j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f6333k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f6334l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f6335m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f6336n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f6344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f6345i;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z9) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z9)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (kotlin.jvm.internal.n.d(str, str2)) {
                return true;
            }
            return E8.i.A(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Q8.d.i(str);
        }

        private final String f(String str) {
            if (E8.i.A(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = Q8.a.e(E8.i.w0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = m.f6336n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iD0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(m.f6336n).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.n.g(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.n.g(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.n.g(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f6335m).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.n.g(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iD0 == -1 && matcher.usePattern(m.f6334l).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.n.g(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.n.g(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    kotlin.jvm.internal.n.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f6334l.pattern();
                    kotlin.jvm.internal.n.g(strPattern, "MONTH_PATTERN.pattern()");
                    iD0 = E8.i.d0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f6333k).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.n.g(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iD0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Q8.d.f6930f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iD0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j9 = Long.parseLong(str);
                if (j9 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j9;
            } catch (NumberFormatException e10) {
                if (new E8.g("-?\\d+").a(str)) {
                    return E8.i.M(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(v url, String setCookie) {
            kotlin.jvm.internal.n.h(url, "url");
            kotlin.jvm.internal.n.h(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long j9, v url, String setCookie) {
            long j10;
            kotlin.jvm.internal.n.h(url, "url");
            kotlin.jvm.internal.n.h(setCookie, "setCookie");
            int iR = Q8.d.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = Q8.d.r(setCookie, '=', 0, iR, 2, null);
            m mVar = null;
            if (iR2 == iR) {
                return null;
            }
            String strX = Q8.d.X(setCookie, 0, iR2, 1, null);
            if (strX.length() == 0 || Q8.d.y(strX) != -1) {
                return null;
            }
            String strW = Q8.d.W(setCookie, iR2 + 1, iR);
            if (Q8.d.y(strW) != -1) {
                return null;
            }
            int i10 = iR + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iP = Q8.d.p(setCookie, ';', i10, length);
                int iP2 = Q8.d.p(setCookie, '=', i10, iP);
                String strW2 = Q8.d.W(setCookie, i10, iP2);
                String strW3 = iP2 < iP ? Q8.d.W(setCookie, iP2 + 1, iP) : "";
                m mVar2 = mVar;
                if (E8.i.B(strW2, "expires", true)) {
                    try {
                        jG = g(strW3, 0, strW3.length());
                        z10 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (E8.i.B(strW2, "max-age", true)) {
                    jH = h(strW3);
                    z10 = true;
                } else if (E8.i.B(strW2, "domain", true)) {
                    strF = f(strW3);
                    z12 = false;
                } else if (E8.i.B(strW2, "path", true)) {
                    str = strW3;
                } else if (E8.i.B(strW2, "secure", true)) {
                    z11 = true;
                } else if (E8.i.B(strW2, "httponly", true)) {
                    z9 = true;
                }
                i10 = iP + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j10 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j11 = j9 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j10 = (j11 < j9 || j11 > 253402300799999L) ? 253402300799999L : j11;
            } else {
                j10 = jG;
            }
            String strI = url.i();
            if (strF == null) {
                strF = strI;
            } else if (!b(strI, strF)) {
                return mVar3;
            }
            if (strI.length() != strF.length() && PublicSuffixDatabase.f23555e.c().c(strF) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !E8.i.M(str, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iI0 = E8.i.i0(strD, '/', 0, false, 6, null);
                if (iI0 != 0) {
                    strSubstring = strD.substring(0, iI0);
                    kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strX, strW, j10, strF, str, z11, z9, z10, z12, null);
        }

        public final List e(v url, u headers) {
            kotlin.jvm.internal.n.h(url, "url");
            kotlin.jvm.internal.n.h(headers, "headers");
            List listN = headers.n("Set-Cookie");
            int size = listN.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m mVarC = c(url, (String) listN.get(i10));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return AbstractC1444s.l();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.n.g(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        private a() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j9, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12, AbstractC1457h abstractC1457h) {
        this(str, str2, j9, str3, str4, z9, z10, z11, z12);
    }

    public final String e() {
        return this.f6337a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.n.d(mVar.f6337a, this.f6337a) && kotlin.jvm.internal.n.d(mVar.f6338b, this.f6338b) && mVar.f6339c == this.f6339c && kotlin.jvm.internal.n.d(mVar.f6340d, this.f6340d) && kotlin.jvm.internal.n.d(mVar.f6341e, this.f6341e) && mVar.f6342f == this.f6342f && mVar.f6343g == this.f6343g && mVar.f6344h == this.f6344h && mVar.f6345i == this.f6345i;
    }

    public final String f(boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6337a);
        sb.append('=');
        sb.append(this.f6338b);
        if (this.f6344h) {
            if (this.f6339c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(V8.c.b(new Date(this.f6339c)));
            }
        }
        if (!this.f6345i) {
            sb.append("; domain=");
            if (z9) {
                sb.append(".");
            }
            sb.append(this.f6340d);
        }
        sb.append("; path=");
        sb.append(this.f6341e);
        if (this.f6342f) {
            sb.append("; secure");
        }
        if (this.f6343g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "toString()");
        return string;
    }

    public final String g() {
        return this.f6338b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f6337a.hashCode()) * 31) + this.f6338b.hashCode()) * 31) + Long.hashCode(this.f6339c)) * 31) + this.f6340d.hashCode()) * 31) + this.f6341e.hashCode()) * 31) + Boolean.hashCode(this.f6342f)) * 31) + Boolean.hashCode(this.f6343g)) * 31) + Boolean.hashCode(this.f6344h)) * 31) + Boolean.hashCode(this.f6345i);
    }

    public String toString() {
        return f(false);
    }

    private m(String str, String str2, long j9, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f6337a = str;
        this.f6338b = str2;
        this.f6339c = j9;
        this.f6340d = str3;
        this.f6341e = str4;
        this.f6342f = z9;
        this.f6343g = z10;
        this.f6344h = z11;
        this.f6345i = z12;
    }
}
