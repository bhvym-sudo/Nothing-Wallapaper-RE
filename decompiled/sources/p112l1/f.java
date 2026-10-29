package p112l1;

import android.text.TextUtils;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    static class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f22874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f22875c;

        a(String str, String[] strArr, String[] strArr2) {
            this.f22873a = str;
            this.f22874b = strArr;
            this.f22875c = strArr2;
        }

        @Override // l1.f.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(SliceItem sliceItem) {
            return f.a(sliceItem, this.f22873a) && f.t(sliceItem, this.f22874b) && !f.s(sliceItem, this.f22875c);
        }
    }

    static class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f22877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f22878c;

        b(String str, String[] strArr, String[] strArr2) {
            this.f22876a = str;
            this.f22877b = strArr;
            this.f22878c = strArr2;
        }

        @Override // l1.f.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(SliceItem sliceItem) {
            return f.a(sliceItem, this.f22876a) && f.t(sliceItem, this.f22877b) && !f.s(sliceItem, this.f22878c);
        }
    }

    static class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22880b;

        c(String str, String str2) {
            this.f22879a = str;
            this.f22880b = str2;
        }

        @Override // l1.f.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(SliceItem sliceItem) {
            return f.a(sliceItem, this.f22879a) && f.b(sliceItem, this.f22880b);
        }
    }

    static class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22882b;

        d(String str, String str2) {
            this.f22881a = str;
            this.f22882b = str2;
        }

        @Override // l1.f.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(SliceItem sliceItem) {
            return f.a(sliceItem, this.f22881a) && f.b(sliceItem, this.f22882b);
        }
    }

    static class e implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f22884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f22885c;

        e(String str, String[] strArr, String[] strArr2) {
            this.f22883a = str;
            this.f22884b = strArr;
            this.f22885c = strArr2;
        }

        @Override // l1.f.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(SliceItem sliceItem) {
            return f.a(sliceItem, this.f22883a) && f.t(sliceItem, this.f22884b) && !f.s(sliceItem, this.f22885c);
        }
    }

    /* JADX INFO: renamed from: l1.f$f, reason: collision with other inner class name */
    static class C0579f implements Iterator {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f22886q;

        C0579f(ArrayList arrayList) {
            this.f22886q = arrayList;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SliceItem next() {
            SliceItem sliceItem = (SliceItem) this.f22886q.remove(0);
            if (!"slice".equals(sliceItem.d()) && !"action".equals(sliceItem.d())) {
                return sliceItem;
            }
            this.f22886q.addAll(sliceItem.j().e());
            return sliceItem;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22886q.size() != 0;
        }
    }

    static class g implements Iterator {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22887q = a();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Iterator f22888r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ h f22889s;

        g(Iterator it, h hVar) {
            this.f22888r = it;
            this.f22889s = hVar;
        }

        private Object a() {
            while (this.f22888r.hasNext()) {
                Object next = this.f22888r.next();
                if (this.f22889s.a(next)) {
                    return next;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22887q != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object obj = this.f22887q;
            this.f22887q = a();
            return obj;
        }
    }

    private interface h {
        boolean a(Object obj);
    }

    static boolean a(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.d());
    }

    static boolean b(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.k());
    }

    private static List c(Iterator it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private static Iterator d(Iterator it, h hVar) {
        return new g(it, hVar);
    }

    public static SliceItem e(Slice slice, String str) {
        return g(slice, str, null, null);
    }

    public static SliceItem f(Slice slice, String str, String str2, String str3) {
        return g(slice, str, new String[]{str2}, new String[]{str3});
    }

    public static SliceItem g(Slice slice, String str, String[] strArr, String[] strArr2) {
        return (SliceItem) n(d(u(slice), new b(str, strArr, strArr2)), null);
    }

    public static SliceItem h(SliceItem sliceItem, String str) {
        return j(sliceItem, str, null, null);
    }

    public static SliceItem i(SliceItem sliceItem, String str, String str2, String str3) {
        return j(sliceItem, str, new String[]{str2}, new String[]{str3});
    }

    public static SliceItem j(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        return (SliceItem) n(d(v(sliceItem), new e(str, strArr, strArr2)), null);
    }

    public static List k(SliceItem sliceItem, String str) {
        return m(sliceItem, str, null, null);
    }

    public static List l(SliceItem sliceItem, String str, String str2, String str3) {
        return m(sliceItem, str, new String[]{str2}, new String[]{str3});
    }

    public static List m(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        return c(d(v(sliceItem), new a(str, strArr, strArr2)));
    }

    private static Object n(Iterator it, Object obj) {
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                return next;
            }
        }
        return obj;
    }

    public static SliceItem o(Slice slice, String str, String str2) {
        return (SliceItem) n(d(u(slice), new c(str, str2)), null);
    }

    public static SliceItem p(SliceItem sliceItem, String str, String str2) {
        return (SliceItem) n(d(v(sliceItem), new d(str, str2)), null);
    }

    public static SliceItem q(Slice slice, String str, String str2, String[] strArr, String[] strArr2) {
        List listE = slice.e();
        for (int i10 = 0; i10 < listE.size(); i10++) {
            SliceItem sliceItem = (SliceItem) listE.get(i10);
            if (a(sliceItem, str) && b(sliceItem, str2) && t(sliceItem, strArr) && !s(sliceItem, strArr2)) {
                return sliceItem;
            }
        }
        return null;
    }

    private static Iterator r(ArrayList arrayList) {
        return new C0579f(arrayList);
    }

    public static boolean s(SliceItem sliceItem, String... strArr) {
        if (strArr == null) {
            return false;
        }
        List listE = sliceItem.e();
        for (String str : strArr) {
            if (listE.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(SliceItem sliceItem, String... strArr) {
        if (strArr == null) {
            return true;
        }
        List listE = sliceItem.e();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && !listE.contains(str)) {
                return false;
            }
        }
        return true;
    }

    public static Iterator u(Slice slice) {
        ArrayList arrayList = new ArrayList();
        if (slice != null) {
            arrayList.addAll(slice.e());
        }
        return r(arrayList);
    }

    public static Iterator v(SliceItem sliceItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sliceItem);
        return r(arrayList);
    }
}
