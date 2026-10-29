package p233x2;

import F2.C0795b;
import F2.C0798e;
import android.graphics.Rect;
import android.view.View;
import com.android.launcher3.CellLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CellLayout f29780a;

    public j(CellLayout cellLayout) {
        this.f29780a = cellLayout;
    }

    public static /* synthetic */ boolean c(Rect rect, C0795b c0795b) {
        int i10 = c0795b.f1547a;
        int i11 = c0795b.f1548b;
        return rect.intersect(i10, i11, c0795b.f1549c + i10, c0795b.f1550d + i11);
    }

    public static /* synthetic */ boolean d(View view, Map.Entry entry) {
        return entry.getKey() != view;
    }

    private boolean e(View view, Rect rect, int[] iArr, d dVar) {
        int i10;
        C0795b c0795b = (C0795b) dVar.f29773e.get(view);
        boolean z9 = false;
        this.f29780a.f15387E.k(c0795b, false);
        this.f29780a.f15387E.l(rect, true);
        int[] iArrL = l(c0795b.f1547a, c0795b.f1548b, c0795b.f1549c, c0795b.f1550d, iArr, this.f29780a.f15387E.d(), null, new int[2]);
        int i11 = iArrL[0];
        if (i11 >= 0 && (i10 = iArrL[1]) >= 0) {
            c0795b.f1547a = i11;
            c0795b.f1548b = i10;
            z9 = true;
        }
        this.f29780a.f15387E.k(c0795b, true);
        return z9;
    }

    private boolean f(ArrayList arrayList, Rect rect, int[] iArr, View view, d dVar) {
        boolean z9;
        int i10;
        if (arrayList.isEmpty()) {
            return true;
        }
        Rect rect2 = new Rect();
        dVar.d(arrayList, rect2);
        Iterator it = arrayList.iterator();
        while (true) {
            z9 = false;
            if (!it.hasNext()) {
                break;
            }
            this.f29780a.f15387E.k((C0795b) dVar.f29773e.get((View) it.next()), false);
        }
        C0798e c0798e = new C0798e(rect2.width(), rect2.height());
        int i11 = rect2.top;
        int i12 = rect2.left;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0795b c0795b = (C0795b) dVar.f29773e.get((View) it2.next());
            c0798e.g(c0795b.f1547a - i12, c0795b.f1548b - i11, c0795b.f1549c, c0795b.f1550d, true);
        }
        this.f29780a.f15387E.l(rect, true);
        int[] iArrL = l(rect2.left, rect2.top, rect2.width(), rect2.height(), iArr, this.f29780a.f15387E.d(), c0798e.f1566c, new int[2]);
        int i13 = iArrL[0];
        if (i13 >= 0 && (i10 = iArrL[1]) >= 0) {
            int i14 = i13 - rect2.left;
            int i15 = i10 - rect2.top;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C0795b c0795b2 = (C0795b) dVar.f29773e.get((View) it3.next());
                c0795b2.f1547a += i14;
                c0795b2.f1548b += i15;
            }
            z9 = true;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            this.f29780a.f15387E.k((C0795b) dVar.f29773e.get((View) it4.next()), true);
        }
        return z9;
    }

    private boolean g(ArrayList arrayList, Rect rect, int[] iArr, View view, d dVar) {
        if (Math.abs(iArr[0]) + Math.abs(iArr[1]) > 1) {
            for (int i10 = 0; i10 < 2; i10++) {
                for (int i11 = 1; i11 >= 0; i11--) {
                    int i12 = iArr[i11];
                    iArr[i11] = 0;
                    if (r(arrayList, rect, iArr, view, dVar)) {
                        return true;
                    }
                    iArr[i11] = i12;
                }
                t(iArr);
            }
        } else {
            for (int i13 = 0; i13 < 2; i13++) {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (r(arrayList, rect, iArr, view, dVar)) {
                        return true;
                    }
                    t(iArr);
                }
                int i15 = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = i15;
            }
        }
        return false;
    }

    private void j(float f10, float f11, int[] iArr) {
        double dAtan = Math.atan(f11 / f10);
        iArr[0] = 0;
        iArr[1] = 0;
        if (Math.abs(Math.cos(dAtan)) > 0.5d) {
            iArr[0] = (int) Math.signum(f10);
        }
        if (Math.abs(Math.sin(dAtan)) > 0.5d) {
            iArr[1] = (int) Math.signum(f11);
        }
    }

    private d o(int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, View view, boolean z9, d dVar) {
        this.f29780a.l(dVar);
        this.f29780a.getOccupied().b(this.f29780a.f15387E);
        int[] iArrR = this.f29780a.r(i10, i11, i14, i15, new int[2]);
        if (s(iArrR[0], iArrR[1], i14, i15, iArr, view, dVar)) {
            dVar.f29777i = true;
            dVar.f1547a = iArrR[0];
            dVar.f1548b = iArrR[1];
            dVar.f1549c = i14;
            dVar.f1550d = i15;
            return dVar;
        }
        if (i14 > i12 && (i13 == i15 || z9)) {
            return o(i10, i11, i12, i13, i14 - 1, i15, iArr, view, false, dVar);
        }
        if (i15 > i13) {
            return o(i10, i11, i12, i13, i14, i15 - 1, iArr, view, true, dVar);
        }
        dVar.f29777i = false;
        return dVar;
    }

    private boolean q(final Rect rect, d dVar, final View view) {
        return dVar.f29773e.entrySet().stream().filter(new Predicate() { // from class: x2.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.d(view, (Map.Entry) obj);
            }
        }).map(new Function() { // from class: x2.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (C0795b) ((Map.Entry) obj).getValue();
            }
        }).anyMatch(new Predicate() { // from class: x2.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return j.c(rect, (C0795b) obj);
            }
        });
    }

    private boolean r(ArrayList arrayList, Rect rect, int[] iArr, View view, d dVar) {
        int i10;
        int i11;
        m mVar = new m(this.f29780a, arrayList, dVar);
        Rect rectD = mVar.d();
        boolean z9 = false;
        int i12 = iArr[0];
        if (i12 < 0) {
            i10 = rectD.right - rect.left;
            i11 = 1;
        } else if (i12 > 0) {
            i10 = rect.right - rectD.left;
            i11 = 4;
        } else if (iArr[1] < 0) {
            i10 = rectD.bottom - rect.top;
            i11 = 2;
        } else {
            i10 = rect.bottom - rectD.top;
            i11 = 8;
        }
        if (i10 <= 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f29780a.f15387E.k((C0795b) dVar.f29773e.get((View) it.next()), false);
        }
        dVar.f();
        mVar.i(i11);
        boolean z10 = false;
        while (i10 > 0 && !z10) {
            for (View view2 : dVar.f29775g) {
                if (!mVar.f29805c.contains(view2) && view2 != view && mVar.f(view2, i11)) {
                    if (!((b) view2.getLayoutParams()).f29765i) {
                        z10 = true;
                        break;
                    }
                    mVar.a(view2);
                    this.f29780a.f15387E.k((C0795b) dVar.f29773e.get(view2), false);
                }
            }
            i10--;
            mVar.h(i11, 1);
        }
        Rect rectD2 = mVar.d();
        if (z10 || rectD2.left < 0 || rectD2.right > this.f29780a.getCountX() || rectD2.top < 0 || rectD2.bottom > this.f29780a.getCountY()) {
            dVar.e();
        } else {
            z9 = true;
        }
        Iterator it2 = mVar.f29805c.iterator();
        while (it2.hasNext()) {
            this.f29780a.f15387E.k((C0795b) dVar.f29773e.get((View) it2.next()), true);
        }
        return z9;
    }

    private boolean s(int i10, int i11, int i12, int i13, int[] iArr, View view, d dVar) {
        C0795b c0795b;
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        Rect rect = new Rect(i10, i11, i14, i15);
        if (view != null && (c0795b = (C0795b) dVar.f29773e.get(view)) != null) {
            c0795b.f1547a = i10;
            c0795b.f1548b = i11;
        }
        Rect rect2 = new Rect(i10, i11, i14, i15);
        Rect rect3 = new Rect();
        for (View view2 : dVar.f29773e.keySet().stream().sorted(Comparator.comparing(new Function() { // from class: x2.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((b) ((View) obj).getLayoutParams()).a());
            }
        }).thenComparing(new Function() { // from class: x2.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((b) ((View) obj).getLayoutParams()).b());
            }
        })).toList()) {
            if (view2 != view) {
                C0795b c0795b2 = (C0795b) dVar.f29773e.get(view2);
                b bVar = (b) view2.getLayoutParams();
                int i16 = c0795b2.f1547a;
                int i17 = c0795b2.f1548b;
                rect3.set(i16, i17, c0795b2.f1549c + i16, c0795b2.f1550d + i17);
                if (!Rect.intersects(rect2, rect3)) {
                    continue;
                } else {
                    if (!bVar.f29765i) {
                        return false;
                    }
                    arrayList.add(view2);
                }
            }
        }
        dVar.f29776h = arrayList;
        if (g(arrayList, rect, iArr, view, dVar) || f(arrayList, rect, iArr, view, dVar)) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!e((View) it.next(), rect, iArr, dVar)) {
                return false;
            }
        }
        return true;
    }

    private void t(int[] iArr) {
        iArr[0] = iArr[0] * (-1);
        iArr[1] = iArr[1] * (-1);
    }

    public d h(k kVar) {
        p(kVar, this.f29780a.f15419n0);
        d dVarK = k(kVar);
        d dVarM = m(kVar, true);
        d dVarI = i(kVar);
        if (dVarM.f29777i && dVarM.c() >= dVarI.c()) {
            return dVarM;
        }
        if (dVarI.f29777i) {
            return dVarI;
        }
        if (dVarK.f29777i) {
            return dVarK;
        }
        return null;
    }

    public d i(k kVar) {
        d dVar = new d();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.f29780a.s(kVar.d(), kVar.e(), kVar.b(), kVar.c(), kVar.g(), kVar.h(), iArr, iArr2);
        if (iArr[0] < 0 || iArr[1] < 0) {
            dVar.f29777i = false;
            return dVar;
        }
        this.f29780a.l(dVar);
        dVar.f1547a = iArr[0];
        dVar.f1548b = iArr[1];
        dVar.f1549c = iArr2[0];
        dVar.f1550d = iArr2[1];
        dVar.f29777i = true;
        return dVar;
    }

    public d k(k kVar) {
        int[] iArrR = this.f29780a.r(kVar.d(), kVar.e(), kVar.g(), kVar.h(), new int[2]);
        d dVar = new d();
        this.f29780a.l(dVar);
        int i10 = iArrR[0];
        boolean zQ = q(new Rect(i10, iArrR[1], kVar.g() + i10, iArrR[1] + kVar.h()), dVar, kVar.a());
        dVar.f29777i = !zQ;
        if (zQ) {
            return dVar;
        }
        dVar.f1547a = iArrR[0];
        dVar.f1548b = iArrR[1];
        dVar.f1549c = kVar.g();
        dVar.f1550d = kVar.h();
        return dVar;
    }

    public int[] l(int i10, int i11, int i12, int i13, int[] iArr, boolean[][] zArr, boolean[][] zArr2, int[] iArr2) {
        int[] iArr3;
        char c10;
        char c11 = 2;
        int[] iArr4 = iArr2 != null ? iArr2 : new int[2];
        int countX = this.f29780a.getCountX();
        int countY = this.f29780a.getCountY();
        int i14 = Integer.MIN_VALUE;
        int i15 = 0;
        float f10 = Float.MAX_VALUE;
        while (i15 < countY - (i13 - 1)) {
            int i16 = 0;
            while (i16 < countX - (i12 - 1)) {
                int i17 = 0;
                while (true) {
                    if (i17 >= i12) {
                        int i18 = i16 - i10;
                        int i19 = i15 - i11;
                        iArr3 = iArr4;
                        float fHypot = (float) Math.hypot(i18, i19);
                        c10 = 2;
                        int[] iArr5 = new int[2];
                        j(i18, i19, iArr5);
                        int i20 = (iArr[0] * iArr5[0]) + (iArr[1] * iArr5[1]);
                        if (Float.compare(fHypot, f10) >= 0 && (Float.compare(fHypot, f10) != 0 || i20 <= i14)) {
                            break;
                        }
                        iArr3[0] = i16;
                        iArr3[1] = i15;
                        f10 = fHypot;
                        i14 = i20;
                        break;
                    }
                    for (int i21 = 0; i21 < i13; i21++) {
                        if (zArr[i16 + i17][i15 + i21] && (zArr2 == null || zArr2[i17][i21])) {
                            iArr3 = iArr4;
                            c10 = c11;
                            break;
                        }
                    }
                    i17++;
                }
                i16++;
                c11 = c10;
                iArr4 = iArr3;
            }
            i15++;
            iArr4 = iArr4;
        }
        int[] iArr6 = iArr4;
        if (f10 == Float.MAX_VALUE) {
            iArr6[0] = -1;
            iArr6[1] = -1;
        }
        return iArr6;
    }

    public d m(k kVar, boolean z9) {
        return n(kVar, this.f29780a.f15419n0, z9);
    }

    public d n(k kVar, int[] iArr, boolean z9) {
        return o(kVar.d(), kVar.e(), kVar.b(), kVar.c(), kVar.g(), kVar.h(), iArr, kVar.a(), z9, kVar.f());
    }

    public void p(k kVar, int[] iArr) {
        int[] iArr2 = new int[2];
        this.f29780a.r(kVar.d(), kVar.e(), kVar.g(), kVar.h(), iArr2);
        Rect rect = new Rect();
        this.f29780a.i(iArr2[0], iArr2[1], kVar.g(), kVar.h(), rect);
        rect.offset(kVar.d() - rect.centerX(), kVar.e() - rect.centerY());
        int i10 = iArr2[0];
        Rect rect2 = new Rect(i10, iArr2[1], kVar.g() + i10, iArr2[1] + kVar.h());
        Rect rectV = this.f29780a.v(rect2, kVar.a());
        if (rectV == null) {
            rectV = new Rect(rect2);
        }
        int iWidth = rectV.width();
        int iHeight = rectV.height();
        Rect rect3 = rectV;
        this.f29780a.i(rectV.left, rectV.top, rectV.width(), rectV.height(), rect3);
        int iCenterX = (rect3.centerX() - kVar.d()) / kVar.g();
        int iCenterY = (rect3.centerY() - kVar.e()) / kVar.h();
        if (iWidth == this.f29780a.getCountX() || kVar.g() == this.f29780a.getCountX()) {
            iCenterX = 0;
        }
        if (iHeight == this.f29780a.getCountY() || kVar.h() == this.f29780a.getCountY()) {
            iCenterY = 0;
        }
        if (iCenterX != 0 || iCenterY != 0) {
            j(iCenterX, iCenterY, iArr);
        } else {
            iArr[0] = 1;
            iArr[1] = 0;
        }
    }
}
