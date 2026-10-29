package p031d0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;
import p250z.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CharSequence {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0518a f19301u = new C0518a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final e f19302v = j.h();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f19303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f19304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f19305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f19306t;

    /* JADX INFO: renamed from: d0.a$a, reason: collision with other inner class name */
    public static final class C0518a {
        public /* synthetic */ C0518a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0518a() {
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return p109k8.a.d(Integer.valueOf(((b) obj).f()), Integer.valueOf(((b) obj2).f()));
        }
    }

    public a(String str, List list, List list2, List list3) {
        List listM0;
        this.f19303q = str;
        this.f19304r = list;
        this.f19305s = list2;
        this.f19306t = list3;
        if (list2 == null || (listM0 = AbstractC1444s.m0(list2, new c())) == null) {
            return;
        }
        int size = listM0.size();
        int iD = -1;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) listM0.get(i10);
            if (bVar.f() < iD) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (bVar.d() > this.f19303q.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
            }
            iD = bVar.d();
        }
    }

    public char a(int i10) {
        return this.f19303q.charAt(i10);
    }

    public final List b() {
        return this.f19306t;
    }

    public int c() {
        return this.f19303q.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List d(int i10, int i11) {
        List listL;
        List list = this.f19306t;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                b bVar = (b) obj;
                if ((bVar.e() instanceof d) && p031d0.b.d(i10, i11, bVar.f(), bVar.d())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC1444s.l();
        }
        n.f(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listL;
    }

    public final List e() {
        List list = this.f19305s;
        return list == null ? AbstractC1444s.l() : list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f19303q, aVar.f19303q) && n.d(this.f19304r, aVar.f19304r) && n.d(this.f19305s, aVar.f19305s) && n.d(this.f19306t, aVar.f19306t);
    }

    public final List f() {
        List list = this.f19304r;
        return list == null ? AbstractC1444s.l() : list;
    }

    public final List g() {
        return this.f19304r;
    }

    public final String h() {
        return this.f19303q;
    }

    public int hashCode() {
        int iHashCode = this.f19303q.hashCode() * 31;
        List list = this.f19304r;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f19305s;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f19306t;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List i(int i10, int i11) {
        List listL;
        List list = this.f19306t;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                b bVar = (b) obj;
                if ((bVar.e() instanceof p) && p031d0.b.d(i10, i11, bVar.f(), bVar.d())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC1444s.l();
        }
        n.f(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listL;
    }

    public final List j(int i10, int i11) {
        List listL;
        List list = this.f19306t;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                b bVar = (b) obj;
                if ((bVar.e() instanceof q) && p031d0.b.d(i10, i11, bVar.f(), bVar.d())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = AbstractC1444s.l();
        }
        n.f(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listL;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a subSequence(int i10, int i11) {
        if (i10 <= i11) {
            if (i10 == 0 && i11 == this.f19303q.length()) {
                return this;
            }
            String strSubstring = this.f19303q.substring(i10, i11);
            n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new a(strSubstring, p031d0.b.c(this.f19304r, i10, i11), p031d0.b.c(this.f19305s, i10, i11), p031d0.b.c(this.f19306t, i10, i11));
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    public final a l(long j9) {
        return subSequence(n.i(j9), n.h(j9));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f19303q;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f19307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f19309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f19310d;

        public b(Object obj, int i10, int i11, String str) {
            this.f19307a = obj;
            this.f19308b = i10;
            this.f19309c = i11;
            this.f19310d = str;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object a() {
            return this.f19307a;
        }

        public final int b() {
            return this.f19308b;
        }

        public final int c() {
            return this.f19309c;
        }

        public final int d() {
            return this.f19309c;
        }

        public final Object e() {
            return this.f19307a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return n.d(this.f19307a, bVar.f19307a) && this.f19308b == bVar.f19308b && this.f19309c == bVar.f19309c && n.d(this.f19310d, bVar.f19310d);
        }

        public final int f() {
            return this.f19308b;
        }

        public final String g() {
            return this.f19310d;
        }

        public int hashCode() {
            Object obj = this.f19307a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f19308b)) * 31) + Integer.hashCode(this.f19309c)) * 31) + this.f19310d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f19307a + ", start=" + this.f19308b + ", end=" + this.f19309c + ", tag=" + this.f19310d + ')';
        }

        public b(Object obj, int i10, int i11) {
            this(obj, i10, i11, "");
        }
    }

    public /* synthetic */ a(String str, List list, List list2, int i10, AbstractC1457h abstractC1457h) {
        this(str, (i10 & 2) != 0 ? AbstractC1444s.l() : list, (i10 & 4) != 0 ? AbstractC1444s.l() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, List list, List list2) {
        List list3 = list;
        List list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
