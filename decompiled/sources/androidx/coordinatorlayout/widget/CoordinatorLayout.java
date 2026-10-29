package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1077i;
import androidx.core.view.C1089v;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1087t;
import androidx.core.view.InterfaceC1088u;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1087t, InterfaceC1088u {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final String f12104K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    static final Class[] f12105L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final ThreadLocal f12106M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    static final Comparator f12107N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final B0.f f12108O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f12109A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private View f12110B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private g f12111C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f12112D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private V f12113E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f12114F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Drawable f12115G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f12116H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private InterfaceC1090w f12117I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final C1089v f12118J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f12119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f12120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f12121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f12122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Paint f12123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int[] f12124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f12125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f12126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f12127y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int[] f12128z;

    class a implements InterfaceC1090w {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            return CoordinatorLayout.this.Q(v9);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void G(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, view, view2);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view) {
            return h(coordinatorLayout, view) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public V j(CoordinatorLayout coordinatorLayout, View view, V v9) {
            return v9;
        }

        public void k(f fVar) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z9) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f12116H;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.B(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f12116H;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.B(0);
            return true;
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fG = H.G(view);
            float fG2 = H.G(view2);
            if (fG > fG2) {
                return -1;
            }
            return fG < fG2 ? 1 : 0;
        }
    }

    static {
        Package r9 = CoordinatorLayout.class.getPackage();
        f12104K = r9 != null ? r9.getName() : null;
        f12107N = new i();
        f12105L = new Class[]{Context.class, AttributeSet.class};
        f12106M = new ThreadLocal();
        f12108O = new B0.h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p141o0.a.f23311a);
    }

    static c E(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f12104K;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f12106M;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f12105L);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean F(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f12121s;
        t(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zO = false;
        boolean z9 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zO || z9) || actionMasked == 0) {
                if (!zO && cVarE != null) {
                    if (i10 == 0) {
                        zO = cVarE.o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zO = cVarE.H(this, view, motionEvent);
                    }
                    if (zO) {
                        this.f12109A = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z9 = zH && !zC;
                if (zH && !z9) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarE.o(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarE.H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zO;
    }

    private void G() {
        this.f12119q.clear();
        this.f12120r.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarS = s(childAt);
            fVarS.d(this, childAt);
            this.f12120r.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarS.b(this, childAt, childAt2)) {
                        if (!this.f12120r.d(childAt2)) {
                            this.f12120r.b(childAt2);
                        }
                        this.f12120r.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f12119q.addAll(this.f12120r.i());
        Collections.reverse(this.f12119q);
    }

    private static void I(Rect rect) {
        rect.setEmpty();
        f12108O.release(rect);
    }

    private void K(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z9) {
                    cVarE.o(this, childAt, motionEventObtain);
                } else {
                    cVarE.H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).l();
        }
        this.f12109A = null;
        this.f12126x = false;
    }

    private static int L(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int M(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void O(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f12139i;
        if (i11 != i10) {
            H.R(view, i10 - i11);
            fVar.f12139i = i10;
        }
    }

    private void P(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f12140j;
        if (i11 != i10) {
            H.S(view, i10 - i11);
            fVar.f12140j = i10;
        }
    }

    private void R() {
        if (!H.s(this)) {
            H.u0(this, null);
            return;
        }
        if (this.f12117I == null) {
            this.f12117I = new a();
        }
        H.u0(this, this.f12117I);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rect = (Rect) f12108O.acquire();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private V e(V v9) {
        c cVarE;
        if (v9.o()) {
            return v9;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (H.s(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                v9 = cVarE.j(this, childAt, v9);
                if (v9.o()) {
                    return v9;
                }
            }
        }
        return v9;
    }

    private void p(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iB = AbstractC1077i.b(L(fVar.f12133c), i10);
        int iB2 = AbstractC1077i.b(M(fVar.f12134d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int q(int i10) {
        int[] iArr = this.f12128z;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    private void t(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f12107N;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean u(View view) {
        return this.f12120r.j(view);
    }

    private void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f12113E != null && H.s(this) && !H.s(view)) {
            rectA.left += this.f12113E.j();
            rectA.top += this.f12113E.l();
            rectA.right -= this.f12113E.k();
            rectA.bottom -= this.f12113E.i();
        }
        Rect rectA2 = a();
        AbstractC1077i.a(M(fVar.f12133c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        I(rectA);
        I(rectA2);
    }

    private void x(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            n(view2, rectA);
            o(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            I(rectA);
            I(rectA2);
        }
    }

    private void y(View view, int i10, int i11) {
        int i12;
        f fVar = (f) view.getLayoutParams();
        int iB = AbstractC1077i.b(N(fVar.f12133c), i11);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iQ = q(i10) - measuredWidth;
        if (i13 == 1) {
            iQ += measuredWidth / 2;
        } else if (i13 == 5) {
            iQ += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iQ, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void z(View view, Rect rect, int i10) {
        boolean z9;
        boolean z10;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (H.M(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.f(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            I(rectA2);
            if (rectA.isEmpty()) {
                I(rectA);
                return;
            }
            int iB = AbstractC1077i.b(fVar.f12138h, i10);
            boolean z11 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f12140j) >= (i16 = rect.top)) {
                z9 = false;
            } else {
                P(view, i16 - i15);
                z9 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f12140j) < (i14 = rect.bottom)) {
                P(view, height - i14);
                z9 = true;
            }
            if (!z9) {
                P(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f12139i) >= (i13 = rect.left)) {
                z10 = false;
            } else {
                O(view, i13 - i12);
                z10 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f12139i) >= (i11 = rect.right)) {
                z11 = z10;
            } else {
                O(view, width - i11);
            }
            if (!z11) {
                O(view, 0);
            }
            I(rectA);
        }
    }

    void A(View view, int i10) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f12141k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            n(fVar.f12141k, rectA);
            k(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            p(view, i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z9 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                H.R(view, i11);
            }
            if (i12 != 0) {
                H.S(view, i12);
            }
            if (z9 && (cVarE = fVar.e()) != null) {
                cVarE.l(this, view, fVar.f12141k);
            }
            I(rectA);
            I(rectA2);
            I(rectA3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void B(int i10) {
        int i11;
        c cVarE;
        boolean zL;
        int iV = H.v(this);
        int size = this.f12119q.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f12119q.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f12142l == ((View) this.f12119q.get(i13))) {
                        A(view, iV);
                    }
                }
                k(view, true, rectA2);
                if (fVar.f12137g != 0 && !rectA2.isEmpty()) {
                    int iB = AbstractC1077i.b(fVar.f12137g, iV);
                    int i14 = iB & 112;
                    if (i14 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i14 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i15 = iB & 7;
                    if (i15 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i15 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar.f12138h != 0 && view.getVisibility() == 0) {
                    z(view, rectA, iV);
                }
                if (i10 != 2) {
                    r(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        H(view, rectA2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = (View) this.f12119q.get(i11);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarE = fVar2.e();
                            if (cVarE == null && cVarE.i(this, view2, view)) {
                                if (i10 == 0 && fVar2.f()) {
                                    fVar2.j();
                                } else {
                                    if (i10 != 2) {
                                        zL = cVarE.l(this, view2, view);
                                    } else {
                                        cVarE.m(this, view2, view);
                                        zL = true;
                                    }
                                    if (i10 == 1) {
                                        fVar2.o(zL);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = (View) this.f12119q.get(i11);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarE = fVar3.e();
                        if (cVarE == null) {
                        }
                    }
                }
            }
        }
        I(rectA);
        I(rectA2);
        I(rectA3);
    }

    public void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f12141k;
        if (view2 != null) {
            x(view, view2, i10);
            return;
        }
        int i11 = fVar.f12135e;
        if (i11 >= 0) {
            y(view, i11, i10);
        } else {
            w(view, i10);
        }
    }

    public void D(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void H(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void J() {
        if (this.f12127y && this.f12111C != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f12111C);
        }
        this.f12112D = false;
    }

    final V Q(V v9) {
        if (B0.d.a(this.f12113E, v9)) {
            return v9;
        }
        this.f12113E = v9;
        boolean z9 = false;
        boolean z10 = v9 != null && v9.l() > 0;
        this.f12114F = z10;
        if (!z10 && getBackground() == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        V vE = e(v9);
        requestLayout();
        return vE;
    }

    void b() {
        if (this.f12127y) {
            if (this.f12111C == null) {
                this.f12111C = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f12111C);
        }
        this.f12112D = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j9) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f12131a;
        if (cVar != null) {
            float fH = cVar.h(this, view);
            if (fH > 0.0f) {
                if (this.f12123u == null) {
                    this.f12123u = new Paint();
                }
                this.f12123u.setColor(fVar.f12131a.g(this, view));
                this.f12123u.setAlpha(c(Math.round(fH * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f12123u);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j9);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12115G;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(View view) {
        List listG = this.f12120r.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            c cVarE = ((f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.l(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (u(getChildAt(i10))) {
                z9 = true;
                break;
            }
        }
        if (z9 != this.f12112D) {
            if (z9) {
                b();
            } else {
                J();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        G();
        return Collections.unmodifiableList(this.f12119q);
    }

    public final V getLastWindowInsets() {
        return this.f12113E;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f12118J.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f12115G;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void k(View view, boolean z9, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z9) {
            n(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List l(View view) {
        List listH = this.f12120r.h(view);
        this.f12122t.clear();
        if (listH != null) {
            this.f12122t.addAll(listH);
        }
        return this.f12122t;
    }

    public List m(View view) {
        List listG = this.f12120r.g(view);
        this.f12122t.clear();
        if (listG != null) {
            this.f12122t.addAll(listG);
        }
        return this.f12122t;
    }

    void n(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void o(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        p(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        K(false);
        if (this.f12112D) {
            if (this.f12111C == null) {
                this.f12111C = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f12111C);
        }
        if (this.f12113E == null && H.s(this)) {
            H.d0(this);
        }
        this.f12127y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(false);
        if (this.f12112D && this.f12111C != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f12111C);
        }
        View view = this.f12110B;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f12127y = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f12114F || this.f12115G == null) {
            return;
        }
        V v9 = this.f12113E;
        int iL = v9 != null ? v9.l() : 0;
        if (iL > 0) {
            this.f12115G.setBounds(0, 0, getWidth(), iL);
            this.f12115G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K(true);
        }
        boolean zF = F(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zF;
        }
        K(true);
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        c cVarE;
        int iV = H.v(this);
        int size = this.f12119q.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f12119q.get(i14);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.p(this, view, iV))) {
                C(view, iV);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarE;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zQ;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.G();
        coordinatorLayout.g();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iV = H.v(coordinatorLayout);
        boolean z9 = iV == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z10 = coordinatorLayout.f12113E != null && H.s(coordinatorLayout);
        int size3 = coordinatorLayout.f12119q.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = (View) coordinatorLayout.f12119q.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i22 = paddingRight;
                i18 = iV;
                suggestedMinimumWidth = i27;
                i15 = paddingLeft;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i28 = fVar.f12135e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iQ = coordinatorLayout.q(i28);
                    int iB = AbstractC1077i.b(N(fVar.f12133c), iV) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iB != 3 || z9) && !(iB == 5 && z9)) {
                        if ((iB == 5 && !z9) || (iB == 3 && z9)) {
                            iMax = Math.max(0, iQ - paddingLeft);
                        }
                        if (z10 || H.s(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iJ = coordinatorLayout.f12113E.j() + coordinatorLayout.f12113E.k();
                            int iL = coordinatorLayout.f12113E.l() + coordinatorLayout.f12113E.i();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iJ, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iL, mode2);
                        }
                        cVarE = fVar.e();
                        if (cVarE != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            i15 = paddingLeft;
                            i16 = i27;
                            i18 = iV;
                            i19 = i12;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i30 = iMakeMeasureSpec2;
                            zQ = cVarE.q(this, view, i29, i14, i30, 0);
                            i21 = i29;
                            i20 = i30;
                            if (zQ) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i16, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i19, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            i15 = paddingLeft;
                            i16 = i27;
                            i17 = size3;
                            i18 = iV;
                            i19 = i12;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.D(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i16, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i19, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iQ);
                    }
                    int i31 = i26;
                    i14 = iMax;
                    i13 = i31;
                    if (z10) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVarE = fVar.e();
                    if (cVarE != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        i15 = paddingLeft;
                        i16 = i27;
                        i18 = iV;
                        i19 = i12;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i32 = iMakeMeasureSpec2;
                        zQ = cVarE.q(this, view, i210, i14, i32, 0);
                        i21 = i210;
                        i20 = i32;
                        if (zQ) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i16, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i19, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        i15 = paddingLeft;
                        i16 = i27;
                        i17 = size3;
                        i18 = iV;
                        i19 = i12;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.D(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i16, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i19, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z10) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVarE = fVar.e();
                if (cVarE != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    i15 = paddingLeft;
                    i16 = i27;
                    i18 = iV;
                    i19 = i12;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i33 = iMakeMeasureSpec2;
                    zQ = cVarE.q(this, view, i211, i14, i33, 0);
                    i21 = i211;
                    i20 = i33;
                    if (zQ) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i16, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i19, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    i15 = paddingLeft;
                    i16 = i27;
                    i17 = size3;
                    i18 = iV;
                    i19 = i12;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.D(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i16, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i19, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i15;
            paddingRight = i22;
            size3 = i17;
            iV = i18;
        }
        int i34 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i34), View.resolveSizeAndState(suggestedMinimumHeight, i11, i34 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        c cVarE;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f12;
        float f13;
        boolean z10;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zR = false;
        while (i10 < childCount) {
            View childAt = this.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view2 = view;
                f12 = f10;
                f13 = f11;
                z10 = z9;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z10 = z9;
                    zR |= cVarE.r(coordinatorLayout, childAt, view2, f12, f13, z10);
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z10 = z9;
                }
            }
            i10++;
            this = coordinatorLayout;
            view = view2;
            f10 = f12;
            f11 = f13;
            z9 = z10;
        }
        CoordinatorLayout coordinatorLayout2 = this;
        if (zR) {
            coordinatorLayout2.B(1);
        }
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarE;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zS = false;
        while (i10 < childCount) {
            View childAt = this.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zS |= cVarE.s(coordinatorLayout, childAt, view2, f12, f13);
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            this = coordinatorLayout;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        SparseArray sparseArray = hVar.f12150q;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = s(childAt).e();
            if (id != -1 && cVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVarE.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id != -1 && cVarE != null && (parcelableC = cVarE.C(this, childAt)) != null) {
                sparseArray.append(id, parcelableC);
            }
        }
        hVar.f12150q = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zF;
        boolean zH;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12109A == null) {
            zF = F(motionEvent, 1);
            if (!zF) {
                zH = false;
            }
            motionEventObtain = null;
            if (this.f12109A == null) {
                zH |= super.onTouchEvent(motionEvent);
            } else if (zF) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zH;
            }
            K(false);
            return zH;
        }
        zF = false;
        c cVarE = ((f) this.f12109A.getLayoutParams()).e();
        if (cVarE != null) {
            zH = cVarE.H(this, this.f12109A, motionEvent);
        } else {
            zH = false;
        }
        motionEventObtain = null;
        if (this.f12109A == null) {
            zH |= super.onTouchEvent(motionEvent);
        } else if (zF) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        K(false);
        return zH;
    }

    void r(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.A(this, view, rect, z9)) {
            return super.requestChildRectangleOnScreen(view, rect, z9);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (!z9 || this.f12126x) {
            return;
        }
        K(false);
        this.f12126x = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    f s(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f12132b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
                fVar.f12132b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.n((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.f12132b = true;
        }
        return fVar;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        R();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f12116H = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f12115G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f12115G = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f12115G.setState(getDrawableState());
                }
                p201u0.a.m(this.f12115G, H.v(this));
                this.f12115G.setVisible(getVisibility() == 0, false);
                this.f12115G.setCallback(this);
            }
            H.X(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? p171r0.a.d(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f12115G;
        if (drawable == null || drawable.isVisible() == z9) {
            return;
        }
        this.f12115G.setVisible(z9, false);
    }

    public boolean v(View view, int i10, int i11) {
        Rect rectA = a();
        n(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            I(rectA);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12115G;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f12119q = new ArrayList();
        this.f12120r = new androidx.coordinatorlayout.widget.a();
        this.f12121s = new ArrayList();
        this.f12122t = new ArrayList();
        this.f12124v = new int[2];
        this.f12125w = new int[2];
        this.f12118J = new C1089v(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, p141o0.c.f23314b, 0, p141o0.b.f23312a) : context.obtainStyledAttributes(attributeSet, p141o0.c.f23314b, i10, 0);
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, p141o0.c.f23314b, attributeSet, typedArrayObtainStyledAttributes, 0, p141o0.b.f23312a);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, p141o0.c.f23314b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p141o0.c.f23315c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f12128z = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f12128z.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f12128z;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f12115G = typedArrayObtainStyledAttributes.getDrawable(p141o0.c.f23316d);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.R();
        super.setOnHierarchyChangeListener(coordinatorLayout.new e());
        if (H.t(coordinatorLayout) == 0) {
            H.q0(coordinatorLayout, 1);
        }
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarE;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f12124v;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f12124v;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f12124v;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z9) {
            B(1);
        }
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f12125w);
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        c cVarE;
        CoordinatorLayout coordinatorLayout;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f12118J.c(view, view2, i10, i11);
        this.f12110B = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = this.getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarE.z(coordinatorLayout, childAt, view3, view4, i12, i13);
            } else {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            this = coordinatorLayout;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.InterfaceC1087t
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zE = cVarE.E(this, childAt, view, view2, i10, i11);
                    z9 |= zE;
                    fVar.q(i11, zE);
                } else {
                    fVar.q(i11, false);
                }
            }
        }
        return z9;
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onStopNestedScroll(View view, int i10) {
        this.f12118J.d(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i10)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.G(this, childAt, view, i10);
                }
                fVar.k(i10);
                fVar.j();
            }
        }
        this.f12110B = null;
    }

    @Override // androidx.core.view.InterfaceC1088u
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarE;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i14) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f12124v;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f12124v;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f12124v;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z9) {
            B(1);
        }
    }

    protected static class h extends H0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        SparseArray f12150q;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f12150q = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f12150q.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f12150q;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f12150q.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f12150q.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f12131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f12132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f12138h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f12139i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f12140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f12141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f12142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f12143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f12144n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f12145o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f12146p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f12147q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f12148r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f12132b = false;
            this.f12133c = 0;
            this.f12134d = 0;
            this.f12135e = -1;
            this.f12136f = -1;
            this.f12137g = 0;
            this.f12138h = 0;
            this.f12147q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f12136f);
            this.f12141k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f12142l = null;
                    this.f12141k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f12136f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f12142l = null;
                this.f12141k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f12142l = null;
                    this.f12141k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f12142l = viewFindViewById;
        }

        private boolean r(View view, int i10) {
            int iB = AbstractC1077i.b(((f) view.getLayoutParams()).f12137g, i10);
            return iB != 0 && (AbstractC1077i.b(this.f12138h, i10) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f12141k.getId() != this.f12136f) {
                return false;
            }
            View view2 = this.f12141k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f12142l = null;
                    this.f12141k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f12142l = view2;
            return true;
        }

        boolean a() {
            return this.f12141k == null && this.f12136f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f12142l || r(view2, H.v(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f12131a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f12131a == null) {
                this.f12143m = false;
            }
            return this.f12143m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f12136f == -1) {
                this.f12142l = null;
                this.f12141k = null;
                return null;
            }
            if (this.f12141k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f12141k;
        }

        public c e() {
            return this.f12131a;
        }

        boolean f() {
            return this.f12146p;
        }

        Rect g() {
            return this.f12147q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z9 = this.f12143m;
            if (z9) {
                return true;
            }
            c cVar = this.f12131a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z9;
            this.f12143m = zE;
            return zE;
        }

        boolean i(int i10) {
            if (i10 == 0) {
                return this.f12144n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f12145o;
        }

        void j() {
            this.f12146p = false;
        }

        void k(int i10) {
            q(i10, false);
        }

        void l() {
            this.f12143m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f12131a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f12131a = cVar;
                this.f12148r = null;
                this.f12132b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        void o(boolean z9) {
            this.f12146p = z9;
        }

        void p(Rect rect) {
            this.f12147q.set(rect);
        }

        void q(int i10, boolean z9) {
            if (i10 == 0) {
                this.f12144n = z9;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f12145o = z9;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12132b = false;
            this.f12133c = 0;
            this.f12134d = 0;
            this.f12135e = -1;
            this.f12136f = -1;
            this.f12137g = 0;
            this.f12138h = 0;
            this.f12147q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p141o0.c.f23317e);
            this.f12133c = typedArrayObtainStyledAttributes.getInteger(p141o0.c.f23318f, 0);
            this.f12136f = typedArrayObtainStyledAttributes.getResourceId(p141o0.c.f23319g, -1);
            this.f12134d = typedArrayObtainStyledAttributes.getInteger(p141o0.c.f23320h, 0);
            this.f12135e = typedArrayObtainStyledAttributes.getInteger(p141o0.c.f23324l, -1);
            this.f12137g = typedArrayObtainStyledAttributes.getInt(p141o0.c.f23323k, 0);
            this.f12138h = typedArrayObtainStyledAttributes.getInt(p141o0.c.f23322j, 0);
            int i10 = p141o0.c.f23321i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f12132b = zHasValue;
            if (zHasValue) {
                this.f12131a = CoordinatorLayout.E(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f12131a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f12132b = false;
            this.f12133c = 0;
            this.f12134d = 0;
            this.f12135e = -1;
            this.f12136f = -1;
            this.f12137g = 0;
            this.f12138h = 0;
            this.f12147q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12132b = false;
            this.f12133c = 0;
            this.f12134d = 0;
            this.f12135e = -1;
            this.f12136f = -1;
            this.f12137g = 0;
            this.f12138h = 0;
            this.f12147q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12132b = false;
            this.f12133c = 0;
            this.f12134d = 0;
            this.f12135e = -1;
            this.f12136f = -1;
            this.f12137g = 0;
            this.f12138h = 0;
            this.f12147q = new Rect();
        }
    }
}
