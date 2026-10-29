package androidx.slice.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Slice f13942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SliceItem f13943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SliceItem f13944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SliceItem f13945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SliceItem f13946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f13947f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f13948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f13949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f13954m;

    public d(Context context, Slice slice, j jVar) {
        r(context, slice, jVar);
        u(slice);
    }

    private static SliceItem a(Slice slice) {
        SliceItem sliceItemG = p112l1.f.g(slice, "slice", null, new String[]{"list_item", "shortcut", "actions", "keywords", "ttl", "last_updated", "horizontal"});
        if (sliceItemG == null || !t(sliceItemG)) {
            return null;
        }
        return sliceItemG;
    }

    private int e(SliceItem sliceItem, boolean z9, int i10, int i11, int i12) {
        int i13 = 0;
        if (this.f13949h == null || sliceItem == null) {
            return 0;
        }
        if (!sliceItem.n("horizontal")) {
            e eVar = new e(this.f13949h, sliceItem, z9);
            int i14 = this.f13952k;
            return i12 == 1 ? eVar.l(i14) : eVar.c(i14);
        }
        b bVar = new b(this.f13949h, sliceItem);
        int i15 = (bVar.m() && i10 == 0) ? this.f13953l : 0;
        if (bVar.m() && i10 == i11 - 1) {
            i13 = this.f13954m;
        }
        return (i12 == 1 ? bVar.k() : bVar.b()) + i15 + i13;
    }

    public static int l(Context context, SliceItem sliceItem, boolean z9, List list) {
        if (sliceItem != null) {
            if (sliceItem.n("horizontal")) {
                return 1;
            }
            e eVar = new e(context, sliceItem, z9);
            SliceItem sliceItemI = eVar.i();
            p112l1.e eVar2 = sliceItemI != null ? new p112l1.e(sliceItemI) : null;
            if (eVar.j() != null) {
                return "action".equals(eVar.j().d()) ? 4 : 5;
            }
            if (eVar2 != null && eVar2.b()) {
                return 3;
            }
            if (z9 && list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (((p112l1.d) list.get(i10)).b()) {
                        return 3;
                    }
                }
                return 0;
            }
            if (eVar.q().size() > 0) {
                return 3;
            }
        }
        return 0;
    }

    private static SliceItem m(Slice slice) {
        SliceItem sliceItemQ = p112l1.f.q(slice, null, null, new String[]{"see_more"}, null);
        if (sliceItemQ == null || !"slice".equals(sliceItemQ.d())) {
            return null;
        }
        List listE = sliceItemQ.j().e();
        return (listE.size() == 1 && "action".equals(((SliceItem) listE.get(0)).d())) ? (SliceItem) listE.get(0) : sliceItemQ;
    }

    private void r(Context context, Slice slice, j jVar) {
        this.f13942a = slice;
        if (slice == null) {
            return;
        }
        this.f13949h = context;
        this.f13953l = jVar != null ? jVar.d() : 0;
        this.f13954m = jVar != null ? jVar.a() : 0;
        if (context != null) {
            this.f13950i = context.getResources().getDimensionPixelSize(p122m1.b.f23114o);
            this.f13951j = context.getResources().getDimensionPixelSize(p122m1.b.f23112m);
        }
    }

    public static boolean t(SliceItem sliceItem) {
        return (!"slice".equals(sliceItem.d()) || sliceItem.m("list_item", "actions", "keywords", "see_more") || p112l1.f.i(sliceItem, "text", null, null) == null) ? false : true;
    }

    private boolean u(Slice slice) {
        if (slice == null) {
            return false;
        }
        this.f13943b = p112l1.f.q(slice, "int", TypedValues.Custom.S_COLOR, null, null);
        SliceItem sliceItemQ = p112l1.f.q(slice, "int", "layout_direction", null, null);
        this.f13944c = sliceItemQ;
        if (sliceItemQ != null) {
            this.f13944c = k.h(sliceItemQ.g()) != -1 ? this.f13944c : null;
        }
        this.f13948g = p092j1.a.f(slice);
        SliceItem sliceItemA = a(slice);
        this.f13945d = sliceItemA;
        if (sliceItemA != null) {
            this.f13947f.add(sliceItemA);
        }
        this.f13946e = m(slice);
        List listE = slice.e();
        for (int i10 = 0; i10 < listE.size(); i10++) {
            SliceItem sliceItem = (SliceItem) listE.get(i10);
            String strD = sliceItem.d();
            if (!sliceItem.m("actions", "see_more", "keywords", "ttl", "last_updated") && ("action".equals(strD) || "slice".equals(strD))) {
                if (this.f13945d == null && !sliceItem.n("list_item")) {
                    this.f13945d = sliceItem;
                    this.f13947f.add(0, sliceItem);
                } else if (sliceItem.n("list_item")) {
                    this.f13947f.add(sliceItem);
                }
            }
        }
        if (this.f13945d == null && this.f13947f.size() >= 1) {
            this.f13945d = (SliceItem) this.f13947f.get(0);
        }
        return s();
    }

    public SliceItem b() {
        return this.f13943b;
    }

    public SliceItem c() {
        return this.f13945d;
    }

    public int d() {
        return l(this.f13949h, this.f13945d, true, this.f13948g);
    }

    public ArrayList f(int i10) {
        d dVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f13947f;
        if (arrayList2 != null && arrayList2.size() != 0) {
            int i11 = q() ? 2 : 1;
            SliceItem sliceItem = this.f13946e;
            int iC = sliceItem != null ? new e(this.f13949h, sliceItem, false).c(this.f13952k) : 0;
            int size = this.f13947f.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    dVar = this;
                    break;
                }
                dVar = this;
                int iE = dVar.e((SliceItem) this.f13947f.get(i12), i12 == 0 && (i12 == 0 ? ((SliceItem) this.f13947f.get(i12)).m("list_item", "horizontal") ^ true : false), i12, size, 2);
                if (i10 > 0 && iC + iE > i10) {
                    break;
                }
                iC += iE;
                arrayList.add(dVar.f13947f.get(i12));
                i12++;
                this = dVar;
            }
            if (dVar.f13946e != null && arrayList.size() >= i11 && arrayList.size() != size) {
                arrayList.add(dVar.f13946e);
            }
            if (arrayList.size() == 0) {
                arrayList.add(dVar.f13947f.get(0));
            }
        }
        return arrayList;
    }

    public int g(int i10, boolean z9) {
        int i11 = i(this.f13947f);
        if (i10 > 0) {
            i10 = Math.max(p(), i10);
        }
        int i12 = i10 > 0 ? i10 : this.f13951j;
        if (i11 - i12 >= this.f13950i) {
            i11 = i12;
        } else if (i10 > 0) {
            i11 = Math.min(i12, i11);
        }
        return !z9 ? i(f(i11)) : i11;
    }

    public SliceItem h() {
        return this.f13944c;
    }

    public int i(List list) {
        SliceItem sliceItem;
        boolean z9;
        if (list == null || this.f13949h == null) {
            return 0;
        }
        if (list.isEmpty()) {
            sliceItem = null;
            z9 = false;
        } else {
            sliceItem = (SliceItem) list.get(0);
            z9 = !sliceItem.m("list_item", "horizontal");
        }
        SliceItem sliceItem2 = sliceItem;
        if (list.size() == 1 && !sliceItem2.n("horizontal")) {
            return e(sliceItem2, true, 0, 1, 2);
        }
        int size = list.size();
        int iE = 0;
        int i10 = 0;
        while (i10 < list.size()) {
            iE += e((SliceItem) list.get(i10), i10 == 0 && z9, i10, size, 2);
            i10++;
        }
        return iE;
    }

    public SliceItem j() {
        SliceItem sliceItemG;
        SliceItem sliceItem = this.f13945d;
        if (sliceItem != null) {
            sliceItemG = sliceItem.n("horizontal") ? new b(this.f13949h, this.f13945d).d() : new e(this.f13949h, this.f13945d, false).i();
        } else {
            sliceItemG = null;
        }
        if (sliceItemG == null) {
            sliceItemG = p112l1.f.g(this.f13942a, "action", new String[]{"shortcut", "title"}, null);
        }
        return sliceItemG == null ? p112l1.f.f(this.f13942a, "action", null, null) : sliceItemG;
    }

    public ArrayList k() {
        return this.f13947f;
    }

    public Slice n() {
        return this.f13942a;
    }

    public List o() {
        return this.f13948g;
    }

    public int p() {
        return e(this.f13945d, true, 0, 1, 1);
    }

    public boolean q() {
        SliceItem sliceItem = this.f13945d;
        return sliceItem != null && t(sliceItem);
    }

    public boolean s() {
        return this.f13942a != null && this.f13947f.size() > 0;
    }

    public void v(int i10) {
        this.f13952k = i10;
    }

    public d(Context context, Slice slice, AttributeSet attributeSet, int i10, int i11) {
        Resources.Theme theme;
        r(context, slice, null);
        if (context != null && (theme = context.getTheme()) != null) {
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, p122m1.h.f23156K, i10, i11);
            try {
                int i12 = p122m1.h.f23161P;
                this.f13953l = (int) typedArrayObtainStyledAttributes.getDimension(i12, 0.0f);
                this.f13954m = (int) typedArrayObtainStyledAttributes.getDimension(i12, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        u(slice);
    }
}
