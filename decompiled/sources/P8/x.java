package P8;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6400e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f6401f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f6402g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f6406d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final x a(String str) {
            kotlin.jvm.internal.n.h(str, "<this>");
            Matcher matcher = x.f6401f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.n.g(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            kotlin.jvm.internal.n.g(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            kotlin.jvm.internal.n.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            kotlin.jvm.internal.n.g(strGroup2, "typeSubtype.group(2)");
            kotlin.jvm.internal.n.g(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            kotlin.jvm.internal.n.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = x.f6402g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (E8.i.M(strGroup4, "'", false, 2, null) && E8.i.A(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        kotlin.jvm.internal.n.g(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new x(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        public final x b(String str) {
            kotlin.jvm.internal.n.h(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, AbstractC1457h abstractC1457h) {
        this(str, str2, str3, strArr);
    }

    public static final x d(String str) {
        return f6400e.a(str);
    }

    public final Charset c(Charset charset) {
        String strE = e("charset");
        if (strE != null) {
            try {
                return Charset.forName(strE);
            } catch (IllegalArgumentException unused) {
            }
        }
        return charset;
    }

    public final String e(String name) {
        kotlin.jvm.internal.n.h(name, "name");
        int i10 = 0;
        int iB = p159p8.c.b(0, this.f6406d.length - 1, 2);
        if (iB < 0) {
            return null;
        }
        while (!E8.i.B(this.f6406d[i10], name, true)) {
            if (i10 == iB) {
                return null;
            }
            i10 += 2;
        }
        return this.f6406d[i10 + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.n.d(((x) obj).f6403a, this.f6403a);
    }

    public final String f() {
        return this.f6404b;
    }

    public int hashCode() {
        return this.f6403a.hashCode();
    }

    public String toString() {
        return this.f6403a;
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.f6403a = str;
        this.f6404b = str2;
        this.f6405c = str3;
        this.f6406d = strArr;
    }
}
