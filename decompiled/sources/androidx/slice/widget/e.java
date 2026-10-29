package androidx.slice.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SliceItem f13955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SliceItem f13956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SliceItem f13957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SliceItem f13958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SliceItem f13959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SliceItem f13960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SliceItem f13961g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SliceItem f13964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SliceItem f13965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f13966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f13967m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f13969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f13970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f13973s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f13962h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f13963i = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13968n = 0;

    public e(Context context, SliceItem sliceItem, boolean z9) {
        w(sliceItem, z9);
        if (context != null) {
            this.f13969o = context.getResources().getDimensionPixelSize(p122m1.b.f23113n);
            this.f13970p = context.getResources().getDimensionPixelSize(p122m1.b.f23116q);
            this.f13971q = context.getResources().getDimensionPixelSize(p122m1.b.f23117r);
            this.f13972r = context.getResources().getDimensionPixelSize(p122m1.b.f23114o);
            this.f13973s = context.getResources().getDimensionPixelSize(p122m1.b.f23115p);
        }
    }

    private void a(SliceItem sliceItem) {
        List listL = p112l1.f.l(sliceItem, null, "title", null);
        if (listL.size() > 0) {
            String strD = ((SliceItem) listL.get(0)).d();
            if (("action".equals(strD) && p112l1.f.h((SliceItem) listL.get(0), "image") != null) || "slice".equals(strD) || "long".equals(strD) || "image".equals(strD)) {
                this.f13958d = (SliceItem) listL.get(0);
            }
        }
        String[] strArr = {"shortcut", "title"};
        List listM = p112l1.f.m(sliceItem, "slice", strArr, null);
        listM.addAll(p112l1.f.m(sliceItem, "action", strArr, null));
        if (listM.isEmpty() && "action".equals(sliceItem.d()) && sliceItem.j().e().size() == 1) {
            this.f13956b = sliceItem;
            return;
        }
        if (this.f13958d != null && listM.size() > 1 && listM.get(0) == this.f13958d) {
            this.f13956b = (SliceItem) listM.get(1);
        } else if (listM.size() > 0) {
            this.f13956b = (SliceItem) listM.get(0);
        }
    }

    private static ArrayList b(SliceItem sliceItem) {
        ArrayList arrayList = new ArrayList();
        for (SliceItem sliceItem2 : sliceItem.j().e()) {
            if (v(sliceItem, sliceItem2)) {
                arrayList.add(sliceItem2);
            }
        }
        return arrayList;
    }

    private static boolean r(SliceItem sliceItem) {
        if (sliceItem != null) {
            return sliceItem.n("partial") || !TextUtils.isEmpty(sliceItem.l());
        }
        return false;
    }

    private static boolean u(SliceItem sliceItem) {
        if (sliceItem == null) {
            return false;
        }
        if ("slice".equals(sliceItem.d()) || "action".equals(sliceItem.d())) {
            List listE = sliceItem.j().e();
            if (sliceItem.n("see_more") && listE.isEmpty()) {
                return true;
            }
            for (int i10 = 0; i10 < listE.size(); i10++) {
                if (v(sliceItem, (SliceItem) listE.get(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean v(SliceItem sliceItem, SliceItem sliceItem2) {
        if (sliceItem2.m("keywords", "ttl", "last_updated", "horizontal") || "content_description".equals(sliceItem2.k())) {
            return false;
        }
        String strD = sliceItem2.d();
        if ("image".equals(strD) || "text".equals(strD) || "long".equals(strD) || "action".equals(strD) || "input".equals(strD) || "slice".equals(strD)) {
            return true;
        }
        return "int".equals(strD) && "range".equals(sliceItem.k());
    }

    private boolean w(SliceItem sliceItem, boolean z9) {
        this.f13967m = z9;
        this.f13955a = sliceItem;
        if (!u(sliceItem)) {
            Log.w("RowContent", "Provided SliceItem is invalid for RowContent");
            return false;
        }
        a(sliceItem);
        this.f13965k = p112l1.f.p(sliceItem, "text", "content_description");
        ArrayList arrayListB = b(sliceItem);
        if (arrayListB.size() == 1 && (("action".equals(((SliceItem) arrayListB.get(0)).d()) || "slice".equals(((SliceItem) arrayListB.get(0)).d())) && !((SliceItem) arrayListB.get(0)).m("shortcut", "title") && u((SliceItem) arrayListB.get(0)))) {
            sliceItem = (SliceItem) arrayListB.get(0);
            arrayListB = b(sliceItem);
        }
        SliceItem sliceItemQ = p112l1.f.q(sliceItem.j(), "int", "layout_direction", null, null);
        this.f13957c = sliceItemQ;
        if (sliceItemQ != null) {
            this.f13957c = k.h(sliceItemQ.g()) != -1 ? this.f13957c : null;
        }
        if ("range".equals(sliceItem.k())) {
            this.f13964j = sliceItem;
        }
        if (arrayListB.size() > 0) {
            SliceItem sliceItem2 = this.f13958d;
            if (sliceItem2 != null) {
                arrayListB.remove(sliceItem2);
            }
            SliceItem sliceItem3 = this.f13956b;
            if (sliceItem3 != null) {
                arrayListB.remove(sliceItem3);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < arrayListB.size(); i10++) {
                SliceItem sliceItem4 = (SliceItem) arrayListB.get(i10);
                if ("text".equals(sliceItem4.d())) {
                    SliceItem sliceItem5 = this.f13959e;
                    if ((sliceItem5 == null || !sliceItem5.n("title")) && sliceItem4.n("title") && !sliceItem4.n("summary")) {
                        this.f13959e = sliceItem4;
                    } else if (this.f13960f == null && !sliceItem4.n("summary")) {
                        this.f13960f = sliceItem4;
                    } else if (this.f13961g == null && sliceItem4.n("summary")) {
                        this.f13961g = sliceItem4;
                    }
                } else {
                    arrayList.add(sliceItem4);
                }
            }
            if (r(this.f13959e)) {
                this.f13968n++;
            }
            if (r(this.f13960f)) {
                this.f13968n++;
            }
            SliceItem sliceItem6 = this.f13958d;
            boolean z10 = sliceItem6 != null && "long".equals(sliceItem6.d());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                SliceItem sliceItem7 = (SliceItem) arrayList.get(i11);
                boolean z11 = p112l1.f.h(sliceItem7, "action") != null;
                if (!"long".equals(sliceItem7.d())) {
                    x(sliceItem7, z11);
                } else if (!z10) {
                    this.f13962h.add(sliceItem7);
                    z10 = true;
                }
            }
        }
        return t();
    }

    private void x(SliceItem sliceItem, boolean z9) {
        if (z9) {
            p112l1.e eVar = new p112l1.e(sliceItem);
            if (eVar.b()) {
                this.f13963i.add(eVar);
            }
        }
        this.f13962h.add(sliceItem);
        this.f13966l |= z9;
    }

    public int c(int i10) {
        if (!t()) {
            return 0;
        }
        if (i10 <= 0) {
            i10 = this.f13969o;
        }
        if (j() != null) {
            return (h() > 1 ? this.f13970p : this.f13971q) + this.f13973s;
        }
        return (h() > 1 || this.f13967m) ? i10 : this.f13972r;
    }

    public CharSequence d() {
        SliceItem sliceItem = this.f13965k;
        if (sliceItem != null) {
            return sliceItem.l();
        }
        return null;
    }

    public ArrayList e() {
        return this.f13962h;
    }

    public SliceItem f() {
        SliceItem sliceItem = this.f13964j;
        if (sliceItem == null) {
            return null;
        }
        List listE = sliceItem.j().e();
        for (int i10 = 0; i10 < listE.size(); i10++) {
            if ("image".equals(((SliceItem) listE.get(i10)).d())) {
                return (SliceItem) listE.get(i10);
            }
        }
        return null;
    }

    public SliceItem g() {
        return this.f13957c;
    }

    public int h() {
        return this.f13968n;
    }

    public SliceItem i() {
        return this.f13956b;
    }

    public SliceItem j() {
        return this.f13964j;
    }

    public SliceItem k() {
        return this.f13955a;
    }

    public int l(int i10) {
        if (i10 <= 0) {
            i10 = this.f13969o;
        }
        return j() != null ? c(i10) : i10;
    }

    public SliceItem m() {
        if (this.f13967m) {
            return null;
        }
        return this.f13958d;
    }

    public SliceItem n() {
        return this.f13960f;
    }

    public SliceItem o() {
        SliceItem sliceItem = this.f13961g;
        return sliceItem == null ? this.f13960f : sliceItem;
    }

    public SliceItem p() {
        return this.f13959e;
    }

    public ArrayList q() {
        return this.f13963i;
    }

    public boolean s() {
        return "action".equals(this.f13955a.d()) && this.f13955a.j().g("see_more") && this.f13955a.j().e().isEmpty();
    }

    public boolean t() {
        return (this.f13958d == null && this.f13956b == null && this.f13959e == null && this.f13960f == null && this.f13962h.size() <= 0 && this.f13964j == null && !s()) ? false : true;
    }
}
