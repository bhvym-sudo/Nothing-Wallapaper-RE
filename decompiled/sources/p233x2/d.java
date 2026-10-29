package p233x2;

import F2.C0795b;
import android.graphics.Rect;
import android.util.ArrayMap;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class d extends C0795b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayMap f29773e = new ArrayMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayMap f29774f = new ArrayMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f29775g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f29776h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29777i;

    public final void b(View v9, C0795b cs) {
        n.h(v9, "v");
        n.h(cs, "cs");
        this.f29773e.put(v9, cs);
        this.f29774f.put(v9, new C0795b());
        this.f29775g.add(v9);
    }

    public final int c() {
        return this.f1549c * this.f1550d;
    }

    public final void d(ArrayList views, Rect outRect) {
        n.h(views, "views");
        n.h(outRect, "outRect");
        ArrayList arrayList = new ArrayList();
        Iterator it = views.iterator();
        while (it.hasNext()) {
            C0795b c0795b = (C0795b) this.f29773e.get((View) it.next());
            if (c0795b != null) {
                arrayList.add(c0795b);
            }
        }
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            C0795b c0795b2 = (C0795b) obj;
            if (i10 == 0) {
                int i12 = c0795b2.f1547a;
                int i13 = c0795b2.f1548b;
                outRect.set(i12, i13, c0795b2.f1549c + i12, c0795b2.f1550d + i13);
            } else {
                int i14 = c0795b2.f1547a;
                int i15 = c0795b2.f1548b;
                outRect.union(i14, i15, c0795b2.f1549c + i14, c0795b2.f1550d + i15);
            }
            i10 = i11;
        }
    }

    public final void e() {
        for (Map.Entry entry : this.f29774f.entrySet()) {
            View view = (View) entry.getKey();
            C0795b c0795b = (C0795b) entry.getValue();
            C0795b c0795b2 = (C0795b) this.f29773e.get(view);
            if (c0795b2 != null) {
                c0795b2.a(c0795b);
            }
        }
    }

    public final void f() {
        for (Map.Entry entry : this.f29773e.entrySet()) {
            View view = (View) entry.getKey();
            C0795b c0795b = (C0795b) entry.getValue();
            C0795b c0795b2 = (C0795b) this.f29774f.get(view);
            if (c0795b2 != null) {
                c0795b2.a(c0795b);
            }
        }
    }
}
