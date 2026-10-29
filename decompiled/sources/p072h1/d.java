package p072h1;

import E8.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p062g1.j;
import p142o1.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f21573e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f21575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f21576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f21577d;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0544a f21578h = new C0544a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f21583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f21584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f21585g;

        /* JADX INFO: renamed from: h1.d$a$a, reason: collision with other inner class name */
        public static final class C0544a {
            public /* synthetic */ C0544a(AbstractC1457h abstractC1457h) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && (i11 = i11 - 1) == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                n.h(current, "current");
                if (n.d(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return n.d(i.N0(strSubstring).toString(), str);
            }

            private C0544a() {
            }
        }

        public a(String name, String type, boolean z9, int i10, String str, int i11) {
            n.h(name, "name");
            n.h(type, "type");
            this.f21579a = name;
            this.f21580b = type;
            this.f21581c = z9;
            this.f21582d = i10;
            this.f21583e = str;
            this.f21584f = i11;
            this.f21585g = a(type);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            n.g(US, "US");
            String upperCase = str.toUpperCase(US);
            n.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (i.S(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (i.S(upperCase, "CHAR", false, 2, null) || i.S(upperCase, "CLOB", false, 2, null) || i.S(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (i.S(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (i.S(upperCase, "REAL", false, 2, null) || i.S(upperCase, "FLOA", false, 2, null) || i.S(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f21582d != ((a) obj).f21582d) {
                return false;
            }
            a aVar = (a) obj;
            if (!n.d(this.f21579a, aVar.f21579a) || this.f21581c != aVar.f21581c) {
                return false;
            }
            if (this.f21584f == 1 && aVar.f21584f == 2 && (str3 = this.f21583e) != null && !f21578h.b(str3, aVar.f21583e)) {
                return false;
            }
            if (this.f21584f == 2 && aVar.f21584f == 1 && (str2 = aVar.f21583e) != null && !f21578h.b(str2, this.f21583e)) {
                return false;
            }
            int i10 = this.f21584f;
            return (i10 == 0 || i10 != aVar.f21584f || ((str = this.f21583e) == null ? aVar.f21583e == null : f21578h.b(str, aVar.f21583e))) && this.f21585g == aVar.f21585g;
        }

        public int hashCode() {
            return (((((this.f21579a.hashCode() * 31) + this.f21585g) * 31) + (this.f21581c ? 1231 : 1237)) * 31) + this.f21582d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f21579a);
            sb.append("', type='");
            sb.append(this.f21580b);
            sb.append("', affinity='");
            sb.append(this.f21585g);
            sb.append("', notNull=");
            sb.append(this.f21581c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f21582d);
            sb.append(", defaultValue='");
            String str = this.f21583e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final d a(g database, String tableName) {
            n.h(database, "database");
            n.h(tableName, "tableName");
            return p072h1.e.f(database, tableName);
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f21588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f21589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f21590e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            n.h(referenceTable, "referenceTable");
            n.h(onDelete, "onDelete");
            n.h(onUpdate, "onUpdate");
            n.h(columnNames, "columnNames");
            n.h(referenceColumnNames, "referenceColumnNames");
            this.f21586a = referenceTable;
            this.f21587b = onDelete;
            this.f21588c = onUpdate;
            this.f21589d = columnNames;
            this.f21590e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (n.d(this.f21586a, cVar.f21586a) && n.d(this.f21587b, cVar.f21587b) && n.d(this.f21588c, cVar.f21588c) && n.d(this.f21589d, cVar.f21589d)) {
                return n.d(this.f21590e, cVar.f21590e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f21586a.hashCode() * 31) + this.f21587b.hashCode()) * 31) + this.f21588c.hashCode()) * 31) + this.f21589d.hashCode()) * 31) + this.f21590e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f21586a + "', onDelete='" + this.f21587b + " +', onUpdate='" + this.f21588c + "', columnNames=" + this.f21589d + ", referenceColumnNames=" + this.f21590e + '}';
        }
    }

    /* JADX INFO: renamed from: h1.d$d, reason: collision with other inner class name */
    public static final class C0545d implements Comparable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f21591q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f21592r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final String f21593s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f21594t;

        public C0545d(int i10, int i11, String from, String to) {
            n.h(from, "from");
            n.h(to, "to");
            this.f21591q = i10;
            this.f21592r = i11;
            this.f21593s = from;
            this.f21594t = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0545d other) {
            n.h(other, "other");
            int i10 = this.f21591q - other.f21591q;
            return i10 == 0 ? this.f21592r - other.f21592r : i10;
        }

        public final String e() {
            return this.f21593s;
        }

        public final int f() {
            return this.f21591q;
        }

        public final String g() {
            return this.f21594t;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f21595e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f21598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f21599d;

        public static final class a {
            public /* synthetic */ a(AbstractC1457h abstractC1457h) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String name, boolean z9, List columns, List orders) {
            n.h(name, "name");
            n.h(columns, "columns");
            n.h(orders, "orders");
            this.f21596a = name;
            this.f21597b = z9;
            this.f21598c = columns;
            this.f21599d = orders;
            List arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(j.ASC.name());
                }
            }
            this.f21599d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f21597b == eVar.f21597b && n.d(this.f21598c, eVar.f21598c) && n.d(this.f21599d, eVar.f21599d)) {
                return i.M(this.f21596a, "index_", false, 2, null) ? i.M(eVar.f21596a, "index_", false, 2, null) : n.d(this.f21596a, eVar.f21596a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((i.M(this.f21596a, "index_", false, 2, null) ? -1184239155 : this.f21596a.hashCode()) * 31) + (this.f21597b ? 1 : 0)) * 31) + this.f21598c.hashCode()) * 31) + this.f21599d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f21596a + "', unique=" + this.f21597b + ", columns=" + this.f21598c + ", orders=" + this.f21599d + "'}";
        }
    }

    public d(String name, Map columns, Set foreignKeys, Set set) {
        n.h(name, "name");
        n.h(columns, "columns");
        n.h(foreignKeys, "foreignKeys");
        this.f21574a = name;
        this.f21575b = columns;
        this.f21576c = foreignKeys;
        this.f21577d = set;
    }

    public static final d a(g gVar, String str) {
        return f21573e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!n.d(this.f21574a, dVar.f21574a) || !n.d(this.f21575b, dVar.f21575b) || !n.d(this.f21576c, dVar.f21576c)) {
            return false;
        }
        Set set2 = this.f21577d;
        if (set2 == null || (set = dVar.f21577d) == null) {
            return true;
        }
        return n.d(set2, set);
    }

    public int hashCode() {
        return (((this.f21574a.hashCode() * 31) + this.f21575b.hashCode()) * 31) + this.f21576c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f21574a + "', columns=" + this.f21575b + ", foreignKeys=" + this.f21576c + ", indices=" + this.f21577d + '}';
    }
}
