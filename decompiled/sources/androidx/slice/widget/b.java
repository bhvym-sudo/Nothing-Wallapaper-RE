package androidx.slice.widget;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SliceItem f13894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SliceItem f13895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SliceItem f13896d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SliceItem f13898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f13899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13900h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SliceItem f13902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f13905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f13907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f13908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SliceItem f13909q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f13897e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13901i = 3;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SliceItem f13910a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SliceItem f13912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13914e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private SliceItem f13916g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f13911b = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f13915f = -1;

        public a(SliceItem sliceItem) {
            k(sliceItem);
        }

        private boolean j(SliceItem sliceItem) {
            String strD = sliceItem.d();
            if ("content_description".equals(sliceItem.k()) || sliceItem.m("keywords", "ttl", "last_updated")) {
                return false;
            }
            return "text".equals(strD) || "long".equals(strD) || "image".equals(strD);
        }

        public ArrayList a() {
            return this.f13911b;
        }

        public CharSequence b() {
            SliceItem sliceItem = this.f13912c;
            if (sliceItem != null) {
                return sliceItem.l();
            }
            return null;
        }

        public SliceItem c() {
            return this.f13910a;
        }

        public int d() {
            return this.f13915f;
        }

        public int e() {
            return this.f13913d;
        }

        public SliceItem f() {
            return this.f13916g;
        }

        public boolean g() {
            return this.f13914e;
        }

        public boolean h() {
            return this.f13911b.size() == 1 && "image".equals(((SliceItem) this.f13911b.get(0)).d());
        }

        public boolean i() {
            return this.f13911b.size() > 0 && this.f13911b.size() <= 3;
        }

        public boolean k(SliceItem sliceItem) {
            String strD = sliceItem.d();
            if (!sliceItem.n("shortcut") && ("slice".equals(strD) || "action".equals(strD))) {
                List listE = sliceItem.j().e();
                if (listE.size() == 1 && ("action".equals(((SliceItem) listE.get(0)).d()) || "slice".equals(((SliceItem) listE.get(0)).d()))) {
                    this.f13910a = (SliceItem) listE.get(0);
                    listE = ((SliceItem) listE.get(0)).j().e();
                }
                if ("action".equals(strD)) {
                    this.f13910a = sliceItem;
                }
                this.f13913d = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < listE.size(); i11++) {
                    SliceItem sliceItem2 = (SliceItem) listE.get(i11);
                    String strD2 = sliceItem2.d();
                    if ("content_description".equals(sliceItem2.k())) {
                        this.f13912c = sliceItem2;
                    } else if (this.f13913d < 2 && ("text".equals(strD2) || "long".equals(strD2))) {
                        this.f13913d++;
                        this.f13911b.add(sliceItem2);
                        SliceItem sliceItem3 = this.f13916g;
                        if (sliceItem3 == null || (!sliceItem3.n("title") && sliceItem2.n("title"))) {
                            this.f13916g = sliceItem2;
                        }
                    } else if (i10 < 1 && "image".equals(sliceItem2.d())) {
                        if (sliceItem2.n("no_tint")) {
                            this.f13915f = sliceItem2.n("large") ? 2 : 1;
                        } else {
                            this.f13915f = 0;
                        }
                        i10++;
                        this.f13914e = true;
                        this.f13911b.add(sliceItem2);
                    }
                }
            } else if (j(sliceItem)) {
                this.f13911b.add(sliceItem);
            }
            return i();
        }
    }

    public b(Context context, SliceItem sliceItem) {
        o(sliceItem);
        if (context != null) {
            Resources resources = context.getResources();
            this.f13903k = resources.getDimensionPixelSize(p122m1.b.f23102c);
            this.f13904l = resources.getDimensionPixelSize(p122m1.b.f23101b);
            this.f13905m = resources.getDimensionPixelSize(p122m1.b.f23105f);
            this.f13906n = resources.getDimensionPixelSize(p122m1.b.f23106g);
            this.f13908p = resources.getDimensionPixelSize(p122m1.b.f23108i);
            this.f13907o = resources.getDimensionPixelSize(p122m1.b.f23107h);
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            SliceItem sliceItem = (SliceItem) list.get(i10);
            boolean z9 = p112l1.f.i(sliceItem, null, "see_more", null) != null || sliceItem.m("shortcut", "see_more", "keywords", "ttl", "last_updated");
            if ("content_description".equals(sliceItem.k())) {
                this.f13902j = sliceItem;
            } else if (!z9) {
                arrayList.add(sliceItem);
            }
        }
        return arrayList;
    }

    private int f(boolean z9) {
        if (!n()) {
            return 0;
        }
        if (this.f13893a) {
            if (this.f13897e.size() == 1) {
                return z9 ? this.f13903k : this.f13904l;
            }
            return this.f13901i == 0 ? this.f13908p : this.f13905m;
        }
        boolean z10 = i() > 1;
        boolean zL = l();
        int i10 = this.f13901i;
        boolean z11 = i10 == 0 || i10 == 3;
        if (!z10 || z9) {
            return z11 ? this.f13908p : this.f13906n;
        }
        return zL ? this.f13907o : this.f13908p;
    }

    private boolean o(SliceItem sliceItem) {
        List listE;
        this.f13894b = p112l1.f.p(sliceItem, "int", TypedValues.Custom.S_COLOR);
        if ("slice".equals(sliceItem.d()) || "action".equals(sliceItem.d())) {
            SliceItem sliceItemQ = p112l1.f.q(sliceItem.j(), "int", "layout_direction", null, null);
            this.f13895c = sliceItemQ;
            if (sliceItemQ != null) {
                this.f13895c = k.h(sliceItemQ.g()) != -1 ? this.f13895c : null;
            }
        }
        SliceItem sliceItemI = p112l1.f.i(sliceItem, null, "see_more", null);
        this.f13898f = sliceItemI;
        if (sliceItemI != null && "slice".equals(sliceItemI.d()) && (listE = this.f13898f.j().e()) != null && listE.size() > 0) {
            this.f13898f = (SliceItem) listE.get(0);
        }
        this.f13896d = p112l1.f.j(sliceItem, "slice", new String[]{"shortcut", "title"}, new String[]{"actions"});
        this.f13893a = true;
        if ("slice".equals(sliceItem.d())) {
            List listA = a(sliceItem.j().e());
            for (int i10 = 0; i10 < listA.size(); i10++) {
                SliceItem sliceItem2 = (SliceItem) listA.get(i10);
                if ("content_description".equals(sliceItem2.k())) {
                    this.f13902j = sliceItem2;
                } else {
                    p(new a(sliceItem2));
                }
            }
        } else {
            p(new a(sliceItem));
        }
        return n();
    }

    private void p(a aVar) {
        if (aVar.i()) {
            if (this.f13909q == null && aVar.f() != null) {
                this.f13909q = aVar.f();
            }
            this.f13897e.add(aVar);
            if (!aVar.h()) {
                this.f13893a = false;
            }
            this.f13899g = Math.max(this.f13899g, aVar.e());
            this.f13900h |= aVar.g();
            int i10 = this.f13901i;
            this.f13901i = i10 == 3 ? aVar.d() : Math.max(i10, aVar.d());
        }
    }

    public int b() {
        return f(false);
    }

    public CharSequence c() {
        SliceItem sliceItem = this.f13902j;
        if (sliceItem != null) {
            return sliceItem.l();
        }
        return null;
    }

    public SliceItem d() {
        return this.f13896d;
    }

    public ArrayList e() {
        return this.f13897e;
    }

    public int g() {
        return this.f13901i;
    }

    public SliceItem h() {
        return this.f13895c;
    }

    public int i() {
        return this.f13899g;
    }

    public SliceItem j() {
        return this.f13898f;
    }

    public int k() {
        return f(true);
    }

    public boolean l() {
        return this.f13900h;
    }

    public boolean m() {
        return this.f13893a;
    }

    public boolean n() {
        return this.f13897e.size() > 0;
    }
}
