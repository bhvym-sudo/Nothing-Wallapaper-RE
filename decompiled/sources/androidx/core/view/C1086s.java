package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.core.view.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1086s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f12265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f12266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f12267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f12269e;

    public C1086s(View view) {
        this.f12267c = view;
    }

    private boolean h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentI;
        int i15;
        int i16;
        int[] iArr3;
        if (!m() || (viewParentI = i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f12267c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrJ = j();
            iArrJ[0] = 0;
            iArrJ[1] = 0;
            iArr3 = iArrJ;
        } else {
            iArr3 = iArr2;
        }
        M.d(viewParentI, this.f12267c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f12267c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent i(int i10) {
        if (i10 == 0) {
            return this.f12265a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f12266b;
    }

    private int[] j() {
        if (this.f12269e == null) {
            this.f12269e = new int[2];
        }
        return this.f12269e;
    }

    private void o(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f12265a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f12266b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z9) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return M.a(viewParentI, this.f12267c, f10, f11, z9);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return M.b(viewParentI, this.f12267c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentI;
        int i13;
        int i14;
        if (!m() || (viewParentI = i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f12267c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M.c(viewParentI, this.f12267c, i10, i11, iArr3, i12);
        if (iArr2 != null) {
            this.f12267c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i10) {
        return i(i10) != null;
    }

    public boolean m() {
        return this.f12268d;
    }

    public void n(boolean z9) {
        if (this.f12268d) {
            H.E0(this.f12267c);
        }
        this.f12268d = z9;
    }

    public boolean p(int i10) {
        return q(i10, 0);
    }

    public boolean q(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f12267c;
        for (ViewParent parent = this.f12267c.getParent(); parent != null; parent = parent.getParent()) {
            if (M.f(parent, view, this.f12267c, i10, i11)) {
                o(i11, parent);
                M.e(parent, view, this.f12267c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i10) {
        ViewParent viewParentI = i(i10);
        if (viewParentI != null) {
            M.g(viewParentI, this.f12267c, i10);
            o(i10, null);
        }
    }
}
