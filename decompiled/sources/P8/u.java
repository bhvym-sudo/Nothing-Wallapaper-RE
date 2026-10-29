package P8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1452c;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Iterable, p229w8.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f6376r = new b(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String[] f6377q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f6378a = new ArrayList(20);

        public final a a(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            b bVar = u.f6376r;
            bVar.d(name);
            bVar.e(value, name);
            d(name, value);
            return this;
        }

        public final a b(u headers) {
            kotlin.jvm.internal.n.h(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(headers.b(i10), headers.m(i10));
            }
            return this;
        }

        public final a c(String line) {
            kotlin.jvm.internal.n.h(line, "line");
            int iC0 = E8.i.c0(line, ':', 1, false, 4, null);
            if (iC0 != -1) {
                String strSubstring = line.substring(0, iC0);
                kotlin.jvm.internal.n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iC0 + 1);
                kotlin.jvm.internal.n.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
                d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                d("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            kotlin.jvm.internal.n.g(strSubstring3, "this as java.lang.String).substring(startIndex)");
            d("", strSubstring3);
            return this;
        }

        public final a d(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            this.f6378a.add(name);
            this.f6378a.add(E8.i.N0(value).toString());
            return this;
        }

        public final a e(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            u.f6376r.d(name);
            d(name, value);
            return this;
        }

        public final u f() {
            return new u((String[]) this.f6378a.toArray(new String[0]), null);
        }

        public final List g() {
            return this.f6378a;
        }

        public final a h(String name) {
            kotlin.jvm.internal.n.h(name, "name");
            int i10 = 0;
            while (i10 < this.f6378a.size()) {
                if (E8.i.B(name, (String) this.f6378a.get(i10), true)) {
                    this.f6378a.remove(i10);
                    this.f6378a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(value, "value");
            b bVar = u.f6376r;
            bVar.d(name);
            bVar.e(value, name);
            h(name);
            d(name, value);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Q8.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Q8.d.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb.append(Q8.d.G(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iB = p159p8.c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (!E8.i.B(str, strArr[length], true)) {
                if (length == iB) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final u g(String... namesAndValues) {
            kotlin.jvm.internal.n.h(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = E8.i.N0(str).toString();
            }
            int iB = p159p8.c.b(0, strArr.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == iB) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new u(strArr, null);
        }

        private b() {
        }
    }

    public /* synthetic */ u(String[] strArr, AbstractC1457h abstractC1457h) {
        this(strArr);
    }

    public static final u g(String... strArr) {
        return f6376r.g(strArr);
    }

    public final String a(String name) {
        kotlin.jvm.internal.n.h(name, "name");
        return f6376r.f(this.f6377q, name);
    }

    public final String b(int i10) {
        return this.f6377q[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Arrays.equals(this.f6377q, ((u) obj).f6377q);
    }

    public final a f() {
        a aVar = new a();
        AbstractC1444s.A(aVar.g(), this.f6377q);
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6377q);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        p079h8.o[] oVarArr = new p079h8.o[size];
        for (int i10 = 0; i10 < size; i10++) {
            oVarArr[i10] = p079h8.v.a(b(i10), m(i10));
        }
        return AbstractC1452c.a(oVarArr);
    }

    public final String m(int i10) {
        return this.f6377q[(i10 * 2) + 1];
    }

    public final List n(String name) {
        kotlin.jvm.internal.n.h(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (E8.i.B(name, b(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m(i10));
            }
        }
        if (arrayList == null) {
            return AbstractC1444s.l();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.n.g(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f6377q.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strB = b(i10);
            String strM = m(i10);
            sb.append(strB);
            sb.append(": ");
            if (Q8.d.G(strB)) {
                strM = "██";
            }
            sb.append(strM);
            sb.append("\n");
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private u(String[] strArr) {
        this.f6377q = strArr;
    }
}
