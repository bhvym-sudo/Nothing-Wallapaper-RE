package p233x2;

import F2.C0795b;
import android.graphics.Rect;
import android.view.View;
import com.android.launcher3.CellLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f29802l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CellLayout f29803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f29804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f29805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f29806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f29807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f29808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f29809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f29810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b f29813k;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public final class b implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29814a;

        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0795b c0795b = (C0795b) m.this.e().f29773e.get(view);
            C0795b c0795b2 = (C0795b) m.this.e().f29773e.get(view2);
            if (c0795b == null || c0795b2 == null) {
                throw null;
            }
            int i10 = this.f29814a;
            if (i10 == 1) {
                return (c0795b2.f1547a + c0795b2.f1549c) - (c0795b.f1547a + c0795b.f1549c);
            }
            if (i10 == 2) {
                return (c0795b2.f1548b + c0795b2.f1550d) - (c0795b.f1548b + c0795b.f1550d);
            }
            if (i10 != 4) {
                return i10 != 8 ? c0795b.f1548b - c0795b2.f1548b : c0795b.f1548b - c0795b2.f1548b;
            }
            return c0795b.f1547a - c0795b2.f1547a;
        }

        public final void b(int i10) {
            this.f29814a = i10;
        }
    }

    public m(CellLayout mCellLayout, ArrayList views, d config) {
        n.h(mCellLayout, "mCellLayout");
        n.h(views, "views");
        n.h(config, "config");
        this.f29803a = mCellLayout;
        this.f29804b = config;
        this.f29805c = new ArrayList(views);
        this.f29806d = new Rect();
        this.f29807e = new int[mCellLayout.getCountY()];
        this.f29808f = new int[mCellLayout.getCountY()];
        this.f29809g = new int[mCellLayout.getCountX()];
        this.f29810h = new int[mCellLayout.getCountX()];
        this.f29813k = new b();
        g();
    }

    private final void b(int i10) {
        ArrayList arrayList = this.f29805c;
        ArrayList<C0795b> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0795b c0795b = (C0795b) this.f29804b.f29773e.get((View) it.next());
            if (c0795b != null) {
                arrayList2.add(c0795b);
            }
        }
        for (C0795b c0795b2 : arrayList2) {
            int i11 = c0795b2.f1547a;
            int i12 = c0795b2.f1549c + i11;
            int i13 = c0795b2.f1548b;
            int i14 = c0795b2.f1550d + i13;
            if (i10 == 1) {
                while (i13 < i14) {
                    int[] iArr = this.f29807e;
                    int i15 = iArr[i13];
                    if (i11 < i15 || i15 < 0) {
                        iArr[i13] = i11;
                    }
                    i13++;
                }
            } else if (i10 == 2) {
                while (i11 < i12) {
                    int[] iArr2 = this.f29809g;
                    int i16 = iArr2[i11];
                    if (i13 < i16 || i16 < 0) {
                        iArr2[i11] = i13;
                    }
                    i11++;
                }
            } else if (i10 == 4) {
                while (i13 < i14) {
                    int[] iArr3 = this.f29808f;
                    if (i12 > iArr3[i13]) {
                        iArr3[i13] = i12;
                    }
                    i13++;
                }
            } else if (i10 == 8) {
                while (i11 < i12) {
                    int[] iArr4 = this.f29810h;
                    if (i14 > iArr4[i11]) {
                        iArr4[i11] = i14;
                    }
                    i11++;
                }
            }
        }
    }

    private final boolean c(int i10, int i11, int[] iArr, int i12) {
        while (i10 < i11) {
            if (iArr[i10] == i12) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private final void g() {
        int countX = this.f29803a.getCountX();
        for (int i10 = 0; i10 < countX; i10++) {
            this.f29809g[i10] = -1;
            this.f29810h[i10] = -1;
        }
        int countY = this.f29803a.getCountY();
        for (int i11 = 0; i11 < countY; i11++) {
            this.f29807e[i11] = -1;
            this.f29808f[i11] = -1;
        }
        this.f29811i = 15;
        this.f29812j = true;
    }

    public final void a(View v9) {
        n.h(v9, "v");
        this.f29805c.add(v9);
        g();
    }

    public final Rect d() {
        if (this.f29812j) {
            this.f29804b.d(this.f29805c, this.f29806d);
        }
        return this.f29806d;
    }

    public final d e() {
        return this.f29804b;
    }

    public final boolean f(View view, int i10) {
        C0795b c0795b = (C0795b) this.f29804b.f29773e.get(view);
        if (c0795b == null) {
            return false;
        }
        int i11 = c0795b.f1547a;
        int i12 = c0795b.f1549c + i11;
        int i13 = c0795b.f1548b;
        int i14 = c0795b.f1550d + i13;
        if ((this.f29811i & i10) == i10) {
            b(i10);
            this.f29811i &= ~i10;
        }
        if (i10 == 1) {
            return c(i13, i14, this.f29807e, i12);
        }
        if (i10 == 2) {
            return c(i11, i12, this.f29809g, i14);
        }
        if (i10 == 4) {
            return c(i13, i14, this.f29808f, i11);
        }
        if (i10 != 8) {
            return false;
        }
        return c(i11, i12, this.f29810h, i13);
    }

    public final void h(int i10, int i11) {
        ArrayList arrayList = this.f29805c;
        ArrayList<C0795b> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0795b c0795b = (C0795b) this.f29804b.f29773e.get((View) it.next());
            if (c0795b != null) {
                arrayList2.add(c0795b);
            }
        }
        for (C0795b c0795b2 : arrayList2) {
            if (i10 == 1) {
                c0795b2.f1547a -= i11;
            } else if (i10 == 2) {
                c0795b2.f1548b -= i11;
            } else if (i10 == 4) {
                c0795b2.f1547a += i11;
            } else if (i10 != 8) {
                c0795b2.f1548b += i11;
            } else {
                c0795b2.f1548b += i11;
            }
        }
        g();
    }

    public final void i(int i10) {
        this.f29813k.b(i10);
        Collections.sort(this.f29804b.f29775g, this.f29813k);
    }
}
