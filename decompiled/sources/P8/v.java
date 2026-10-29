package P8;

import androidx.constraintlayout.core.widgets.Optimizer;
import e9.C1350e;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f6379k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f6380l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f6386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f6387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f6388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f6389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f6390j;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0214a f6391i = new C0214a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6392a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f6395d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f6397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f6398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f6399h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6393b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6394c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6396e = -1;

        /* JADX INFO: renamed from: P8.v$a$a, reason: collision with other inner class name */
        public static final class C0214a {
            public /* synthetic */ C0214a(AbstractC1457h abstractC1457h) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(b.b(v.f6379k, str, i10, i11, "", false, false, false, false, null, 248, null));
                    if (1 > i12 || i12 >= 65536) {
                        return -1;
                    }
                    return i12;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((kotlin.jvm.internal.n.i(cCharAt, 97) >= 0 && kotlin.jvm.internal.n.i(cCharAt, 122) <= 0) || (kotlin.jvm.internal.n.i(cCharAt, 65) >= 0 && kotlin.jvm.internal.n.i(cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private C0214a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f6397f = arrayList;
            arrayList.add("");
        }

        private final int d() {
            int i10 = this.f6396e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = v.f6379k;
            String str = this.f6392a;
            kotlin.jvm.internal.n.e(str);
            return bVar.c(str);
        }

        private final boolean h(String str) {
            return kotlin.jvm.internal.n.d(str, ".") || E8.i.B(str, "%2e", true);
        }

        private final boolean i(String str) {
            return kotlin.jvm.internal.n.d(str, "..") || E8.i.B(str, "%2e.", true) || E8.i.B(str, ".%2e", true) || E8.i.B(str, "%2e%2e", true);
        }

        private final void l() {
            List list = this.f6397f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f6397f.isEmpty()) {
                this.f6397f.add("");
            } else {
                List list2 = this.f6397f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void n(String str, int i10, int i11, boolean z9, boolean z10) {
            String strB = b.b(v.f6379k, str, i10, i11, " \"<>^`{}|/\\?#", z10, false, false, false, null, 240, null);
            if (h(strB)) {
                return;
            }
            if (i(strB)) {
                l();
                return;
            }
            List list = this.f6397f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f6397f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f6397f.add(strB);
            }
            if (z9) {
                this.f6397f.add("");
            }
        }

        private final void p(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f6397f.clear();
                this.f6397f.add("");
                i10++;
            } else {
                List list = this.f6397f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iQ = Q8.d.q(str, "/\\", i12, i11);
                boolean z9 = iQ < i11;
                this = this;
                str = str;
                this.n(str, i12, iQ, z9, true);
                i12 = z9 ? iQ + 1 : iQ;
            }
        }

        public final a a(String encodedName, String str) {
            kotlin.jvm.internal.n.h(encodedName, "encodedName");
            if (this.f6398g == null) {
                this.f6398g = new ArrayList();
            }
            List list = this.f6398g;
            kotlin.jvm.internal.n.e(list);
            b bVar = v.f6379k;
            list.add(b.b(bVar, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.f6398g;
            kotlin.jvm.internal.n.e(list2);
            list2.add(str != null ? b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final a b(String name, String str) {
            kotlin.jvm.internal.n.h(name, "name");
            if (this.f6398g == null) {
                this.f6398g = new ArrayList();
            }
            List list = this.f6398g;
            kotlin.jvm.internal.n.e(list);
            b bVar = v.f6379k;
            list.add(b.b(bVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.f6398g;
            kotlin.jvm.internal.n.e(list2);
            list2.add(str != null ? b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final v c() {
            ArrayList arrayList;
            String str = this.f6392a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = v.f6379k;
            String strG = b.g(bVar, this.f6393b, 0, 0, false, 7, null);
            String strG2 = b.g(bVar, this.f6394c, 0, 0, false, 7, null);
            String str2 = this.f6395d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iD = d();
            List list = this.f6397f;
            ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.g(v.f6379k, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f6398g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(AbstractC1444s.u(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? b.g(v.f6379k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f6399h;
            return new v(str, strG, strG2, str2, iD, arrayList2, arrayList, str4 != null ? b.g(v.f6379k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a e(String str) {
            b bVar;
            String strB;
            this.f6398g = (str == null || (strB = b.b((bVar = v.f6379k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.i(strB);
            return this;
        }

        public final List f() {
            return this.f6397f;
        }

        public final a g(String host) {
            kotlin.jvm.internal.n.h(host, "host");
            String strE = Q8.a.e(b.g(v.f6379k, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f6395d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a j(v vVar, String str) {
            String str2;
            int iQ;
            int i10;
            boolean z9;
            int i11;
            int i12;
            char c10;
            int i13;
            String input = str;
            kotlin.jvm.internal.n.h(input, "input");
            int iA = Q8.d.A(input, 0, 0, 3, null);
            int iC = Q8.d.C(input, iA, 0, 2, null);
            C0214a c0214a = f6391i;
            int iG = c0214a.g(input, iA, iC);
            boolean z10 = true;
            byte b10 = -1;
            if (iG != -1) {
                if (E8.i.J(input, "https:", iA, true)) {
                    this.f6392a = "https";
                    iA += 6;
                } else {
                    if (!E8.i.J(input, "http:", iA, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f6392a = "http";
                    iA += 5;
                }
            } else {
                if (vVar == null) {
                    if (input.length() > 6) {
                        str2 = E8.i.Q0(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f6392a = vVar.r();
            }
            int iH = c0214a.h(input, iA, iC);
            byte b11 = 63;
            byte b12 = 35;
            if (iH >= 2 || vVar == null || !kotlin.jvm.internal.n.d(vVar.r(), this.f6392a)) {
                int i14 = iA + iH;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iQ = Q8.d.q(input, "@/\\?#", i14, iC);
                    byte bCharAt = iQ != iC ? input.charAt(iQ) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z11) {
                            z9 = z10;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f6394c);
                            sb2.append("%40");
                            input = str;
                            i11 = iQ;
                            sb2.append(b.b(v.f6379k, input, i14, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f6394c = sb2.toString();
                        } else {
                            int iP = Q8.d.p(input, ':', i14, iQ);
                            b bVar = v.f6379k;
                            z9 = z10;
                            String strB = b.b(bVar, input, i14, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z12) {
                                strB = this.f6393b + "%40" + strB;
                            }
                            this.f6393b = strB;
                            if (iP != iQ) {
                                i12 = iQ;
                                this.f6394c = b.b(bVar, str, iP + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z9;
                            } else {
                                i12 = iQ;
                            }
                            input = str;
                            i11 = i12;
                            z12 = z9;
                        }
                        i14 = i11 + 1;
                        iC = iC;
                        z10 = z9;
                        b11 = 63;
                        b10 = -1;
                        b12 = 35;
                    }
                }
                i10 = iC;
                C0214a c0214a2 = f6391i;
                int iF = c0214a2.f(input, i14, iQ);
                int i15 = iF + 1;
                if (i15 < iQ) {
                    this.f6395d = Q8.a.e(b.g(v.f6379k, input, i14, iF, false, 4, null));
                    int iE = c0214a2.e(input, i15, iQ);
                    this.f6396e = iE;
                    if (iE == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i15, iQ);
                        kotlin.jvm.internal.n.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    b bVar2 = v.f6379k;
                    this.f6395d = Q8.a.e(b.g(bVar2, input, i14, iF, false, 4, null));
                    String str3 = this.f6392a;
                    kotlin.jvm.internal.n.e(str3);
                    this.f6396e = bVar2.c(str3);
                }
                if (this.f6395d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i14, iF);
                    kotlin.jvm.internal.n.g(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iA = iQ;
            } else {
                this.f6393b = vVar.g();
                this.f6394c = vVar.c();
                this.f6395d = vVar.i();
                this.f6396e = vVar.n();
                this.f6397f.clear();
                this.f6397f.addAll(vVar.e());
                if (iA == iC || input.charAt(iA) == '#') {
                    e(vVar.f());
                }
                i10 = iC;
            }
            int i16 = i10;
            int iQ2 = Q8.d.q(input, "?#", iA, i16);
            p(input, iA, iQ2);
            if (iQ2 >= i16 || input.charAt(iQ2) != '?') {
                c10 = '#';
                i13 = iQ2;
            } else {
                c10 = '#';
                int iP2 = Q8.d.p(input, '#', iQ2, i16);
                b bVar3 = v.f6379k;
                this.f6398g = bVar3.i(b.b(bVar3, input, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, 208, null));
                i13 = iP2;
            }
            if (i13 < i16 && input.charAt(i13) == c10) {
                this.f6399h = b.b(v.f6379k, input, i13 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a k(String password) {
            kotlin.jvm.internal.n.h(password, "password");
            this.f6394c = b.b(v.f6379k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a m(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f6396e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a o() {
            String str = this.f6395d;
            this.f6395d = str != null ? new E8.g("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f6397f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f6397f;
                list.set(i10, b.b(v.f6379k, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f6398g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(v.f6379k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f6399h;
            this.f6399h = str3 != null ? b.b(v.f6379k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a q(String scheme) {
            kotlin.jvm.internal.n.h(scheme, "scheme");
            if (E8.i.B(scheme, "http", true)) {
                this.f6392a = "http";
                return this;
            }
            if (E8.i.B(scheme, "https", true)) {
                this.f6392a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void r(String str) {
            this.f6399h = str;
        }

        public final void s(String str) {
            kotlin.jvm.internal.n.h(str, "<set-?>");
            this.f6394c = str;
        }

        public final void t(String str) {
            kotlin.jvm.internal.n.h(str, "<set-?>");
            this.f6393b = str;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f6392a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f6393b.length() > 0 || this.f6394c.length() > 0) {
                sb.append(this.f6393b);
                if (this.f6394c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f6394c);
                }
                sb.append('@');
            }
            String str2 = this.f6395d;
            if (str2 != null) {
                kotlin.jvm.internal.n.e(str2);
                if (E8.i.R(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f6395d);
                    sb.append(']');
                } else {
                    sb.append(this.f6395d);
                }
            }
            if (this.f6396e != -1 || this.f6392a != null) {
                int iD = d();
                String str3 = this.f6392a;
                if (str3 != null) {
                    b bVar = v.f6379k;
                    kotlin.jvm.internal.n.e(str3);
                    if (iD != bVar.c(str3)) {
                        sb.append(':');
                        sb.append(iD);
                    }
                } else {
                    sb.append(':');
                    sb.append(iD);
                }
            }
            b bVar2 = v.f6379k;
            bVar2.h(this.f6397f, sb);
            if (this.f6398g != null) {
                sb.append('?');
                List list = this.f6398g;
                kotlin.jvm.internal.n.e(list);
                bVar2.j(list, sb);
            }
            if (this.f6399h != null) {
                sb.append('#');
                sb.append(this.f6399h);
            }
            String string = sb.toString();
            kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(String str) {
            this.f6395d = str;
        }

        public final void v(int i10) {
            this.f6396e = i10;
        }

        public final void w(String str) {
            this.f6392a = str;
        }

        public final a x(String username) {
            kotlin.jvm.internal.n.h(username, "username");
            this.f6393b = b.b(v.f6379k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z9 = false;
            }
            if ((i12 & 16) != 0) {
                z10 = false;
            }
            if ((i12 & 32) != 0) {
                z11 = false;
            }
            if ((i12 & 64) != 0) {
                z12 = false;
            }
            if ((i12 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
                charset = null;
            }
            return bVar.a(str, i10, i11, str2, z9, z10, z11, z12, charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Q8.d.H(str.charAt(i10 + 1)) != -1 && Q8.d.H(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String g(b bVar, String str, int i10, int i11, boolean z9, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z9 = false;
            }
            return bVar.f(str, i10, i11, z9);
        }

        private final void k(C1350e c1350e, String str, int i10, int i11, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            int iCharCount = i10;
            C1350e c1350e2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z11) {
                        c1350e.d0(z9 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z12)) {
                            if (!E8.i.R(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z9 && (!z10 || e(str, iCharCount, i11))))) {
                                c1350e.w1(iCodePointAt);
                            }
                        }
                        if (c1350e2 == null) {
                            c1350e2 = new C1350e();
                        }
                        if (charset == null || kotlin.jvm.internal.n.d(charset, StandardCharsets.UTF_8)) {
                            c1350e2.w1(iCodePointAt);
                        } else {
                            c1350e2.r1(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c1350e2.D()) {
                            byte b10 = c1350e2.readByte();
                            c1350e.F(37);
                            c1350e.F(v.f6380l[((b10 & 255) >> 4) & 15]);
                            c1350e.F(v.f6380l[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void l(C1350e c1350e, String str, int i10, int i11, boolean z9) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int iH = Q8.d.H(str.charAt(i10 + 1));
                    int iH2 = Q8.d.H(str.charAt(i12));
                    if (iH == -1 || iH2 == -1) {
                        c1350e.w1(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        c1350e.F((iH << 4) + iH2);
                        i10 = i12 + Character.charCount(iCodePointAt);
                    }
                } else if (iCodePointAt == 43 && z9) {
                    c1350e.F(32);
                    i10++;
                } else {
                    c1350e.w1(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String encodeSet, boolean z9, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            kotlin.jvm.internal.n.h(str, "<this>");
            kotlin.jvm.internal.n.h(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || E8.i.R(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z9 || (z10 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z11)))) {
                    C1350e c1350e = new C1350e();
                    c1350e.o0(str, i10, iCharCount);
                    k(c1350e, str, iCharCount, i11, encodeSet, z9, z10, z11, z12, charset);
                    return c1350e.P0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int c(String scheme) {
            kotlin.jvm.internal.n.h(scheme, "scheme");
            if (kotlin.jvm.internal.n.d(scheme, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.n.d(scheme, "https") ? 443 : -1;
        }

        public final v d(String str) {
            kotlin.jvm.internal.n.h(str, "<this>");
            return new a().j(null, str).c();
        }

        public final String f(String str, int i10, int i11, boolean z9) {
            kotlin.jvm.internal.n.h(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z9)) {
                    C1350e c1350e = new C1350e();
                    c1350e.o0(str, i10, i12);
                    l(c1350e, str, i12, i11, z9);
                    return c1350e.P0();
                }
            }
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void h(List list, StringBuilder out) {
            kotlin.jvm.internal.n.h(list, "<this>");
            kotlin.jvm.internal.n.h(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) list.get(i10));
            }
        }

        public final List i(String str) {
            kotlin.jvm.internal.n.h(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iC0 = E8.i.c0(str2, '&', i10, false, 4, null);
                if (iC0 == -1) {
                    iC0 = str2.length();
                }
                int iC1 = E8.i.c0(str2, '=', i10, false, 4, null);
                if (iC1 == -1 || iC1 > iC0) {
                    String strSubstring = str2.substring(i10, iC0);
                    kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iC1);
                    kotlin.jvm.internal.n.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iC1 + 1, iC0);
                    kotlin.jvm.internal.n.g(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iC0 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void j(List list, StringBuilder out) {
            kotlin.jvm.internal.n.h(list, "<this>");
            kotlin.jvm.internal.n.h(out, "out");
            B8.e eVarP = B8.h.p(B8.h.q(0, list.size()), 2);
            int iG = eVarP.g();
            int iM = eVarP.m();
            int iN = eVarP.n();
            if ((iN <= 0 || iG > iM) && (iN >= 0 || iM > iG)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iG);
                String str2 = (String) list.get(iG + 1);
                if (iG > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iG == iM) {
                    return;
                } else {
                    iG += iN;
                }
            }
        }

        private b() {
        }
    }

    public v(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        kotlin.jvm.internal.n.h(scheme, "scheme");
        kotlin.jvm.internal.n.h(username, "username");
        kotlin.jvm.internal.n.h(password, "password");
        kotlin.jvm.internal.n.h(host, "host");
        kotlin.jvm.internal.n.h(pathSegments, "pathSegments");
        kotlin.jvm.internal.n.h(url, "url");
        this.f6381a = scheme;
        this.f6382b = username;
        this.f6383c = password;
        this.f6384d = host;
        this.f6385e = i10;
        this.f6386f = pathSegments;
        this.f6387g = list;
        this.f6388h = str;
        this.f6389i = url;
        this.f6390j = kotlin.jvm.internal.n.d(scheme, "https");
    }

    public static final v h(String str) {
        return f6379k.d(str);
    }

    public final String b() {
        if (this.f6388h == null) {
            return null;
        }
        String strSubstring = this.f6389i.substring(E8.i.c0(this.f6389i, '#', 0, false, 6, null) + 1);
        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f6383c.length() == 0) {
            return "";
        }
        String strSubstring = this.f6389i.substring(E8.i.c0(this.f6389i, ':', this.f6381a.length() + 3, false, 4, null) + 1, E8.i.c0(this.f6389i, '@', 0, false, 6, null));
        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iC0 = E8.i.c0(this.f6389i, '/', this.f6381a.length() + 3, false, 4, null);
        String str = this.f6389i;
        String strSubstring = this.f6389i.substring(iC0, Q8.d.q(str, "?#", iC0, str.length()));
        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iC0 = E8.i.c0(this.f6389i, '/', this.f6381a.length() + 3, false, 4, null);
        String str = this.f6389i;
        int iQ = Q8.d.q(str, "?#", iC0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iC0 < iQ) {
            int i10 = iC0 + 1;
            int iP = Q8.d.p(this.f6389i, '/', i10, iQ);
            String strSubstring = this.f6389i.substring(i10, iP);
            kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iC0 = iP;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && kotlin.jvm.internal.n.d(((v) obj).f6389i, this.f6389i);
    }

    public final String f() {
        if (this.f6387g == null) {
            return null;
        }
        int iC0 = E8.i.c0(this.f6389i, '?', 0, false, 6, null) + 1;
        String str = this.f6389i;
        String strSubstring = this.f6389i.substring(iC0, Q8.d.p(str, '#', iC0, str.length()));
        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f6382b.length() == 0) {
            return "";
        }
        int length = this.f6381a.length() + 3;
        String str = this.f6389i;
        String strSubstring = this.f6389i.substring(length, Q8.d.q(str, ":@", length, str.length()));
        kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f6389i.hashCode();
    }

    public final String i() {
        return this.f6384d;
    }

    public final boolean j() {
        return this.f6390j;
    }

    public final a k() {
        a aVar = new a();
        aVar.w(this.f6381a);
        aVar.t(g());
        aVar.s(c());
        aVar.u(this.f6384d);
        aVar.v(this.f6385e != f6379k.c(this.f6381a) ? this.f6385e : -1);
        aVar.f().clear();
        aVar.f().addAll(e());
        aVar.e(f());
        aVar.r(b());
        return aVar;
    }

    public final a l(String link) {
        kotlin.jvm.internal.n.h(link, "link");
        try {
            return new a().j(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List m() {
        return this.f6386f;
    }

    public final int n() {
        return this.f6385e;
    }

    public final String o() {
        if (this.f6387g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f6379k.j(this.f6387g, sb);
        return sb.toString();
    }

    public final String p() {
        a aVarL = l("/...");
        kotlin.jvm.internal.n.e(aVarL);
        return aVarL.x("").k("").c().toString();
    }

    public final v q(String link) {
        kotlin.jvm.internal.n.h(link, "link");
        a aVarL = l(link);
        if (aVarL != null) {
            return aVarL.c();
        }
        return null;
    }

    public final String r() {
        return this.f6381a;
    }

    public final URI s() {
        String string = k().o().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new E8.g("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                kotlin.jvm.internal.n.g(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL t() {
        try {
            return new URL(this.f6389i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f6389i;
    }
}
