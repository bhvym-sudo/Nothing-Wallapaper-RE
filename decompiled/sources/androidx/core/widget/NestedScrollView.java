package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AbstractC1085q;
import androidx.core.view.C1069a;
import androidx.core.view.C1073e;
import androidx.core.view.C1086s;
import androidx.core.view.C1089v;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1074f;
import androidx.core.view.InterfaceC1088u;
import androidx.core.view.r;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1088u, r {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final float f12282T = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final a f12283U = new a();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final int[] f12284V = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f12285A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private VelocityTracker f12286B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f12287C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f12288D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f12289E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f12290F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f12291G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f12292H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final int[] f12293I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int[] f12294J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f12295K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f12296L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private f f12297M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final C1089v f12298N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C1086s f12299O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f12300P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private e f12301Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    final d f12302R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    C1073e f12303S;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f12304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f12305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f12306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private OverScroller f12307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EdgeEffect f12308u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EdgeEffect f12309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f12310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f12311x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f12312y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f12313z;

    static class a extends C1069a {
        a() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0.f.a(accessibilityEvent, nestedScrollView.getScrollX());
            C0.f.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.g0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            dVar.H0(true);
            if (nestedScrollView.getScrollY() > 0) {
                dVar.b(C0.d.a.f552r);
                dVar.b(C0.d.a.f519C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                dVar.b(C0.d.a.f551q);
                dVar.b(C0.d.a.f521E);
            }
        }

        @Override // androidx.core.view.C1069a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Q(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Q(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements InterfaceC1074f {
        d() {
        }

        @Override // androidx.core.view.InterfaceC1074f
        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.p((int) f10);
            return true;
        }

        @Override // androidx.core.view.InterfaceC1074f
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC1074f
        public void c() {
            NestedScrollView.this.f12307t.abortAnimation();
        }
    }

    public interface e {
        void onScrollChange(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f12315q;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f12315q + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f12315q);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f12315q = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p151p0.a.f23569c);
    }

    private boolean A(View view, int i10, int i11) {
        view.getDrawingRect(this.f12306s);
        offsetDescendantRectToMyCoords(view, this.f12306s);
        return this.f12306s.bottom + i10 >= getScrollY() && this.f12306s.top - i10 <= getScrollY() + i11;
    }

    private void B(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f12299O.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12292H) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f12310w = (int) motionEvent.getY(i10);
            this.f12292H = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f12286B;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void F() {
        VelocityTracker velocityTracker = this.f12286B;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12286B = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private int G(int i10, float f10) {
        float fC;
        int iRound;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (h.b(this.f12308u) == 0.0f) {
            if (h.b(this.f12309v) != 0.0f) {
                fC = h.c(this.f12309v, height, 1.0f - width);
                if (h.b(this.f12309v) == 0.0f) {
                    this.f12309v.onRelease();
                }
            }
            iRound = Math.round(f11 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fC = -h.c(this.f12308u, -height, width);
        if (h.b(this.f12308u) == 0.0f) {
            this.f12308u.onRelease();
        }
        f11 = fC;
        iRound = Math.round(f11 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void H(boolean z9) {
        if (z9) {
            R(2, 1);
        } else {
            T(1);
        }
        this.f12296L = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean I(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z9 = false;
        boolean z10 = i10 == 33;
        View viewO = o(z10, i11, i12);
        if (viewO == null) {
            viewO = this;
        }
        if (i11 < scrollY || i12 > i13) {
            J(z10 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z9 = true;
        }
        if (viewO != findFocus()) {
            viewO.requestFocus(i10);
        }
        return z9;
    }

    private int J(int i10, int i11, int i12, boolean z9) {
        int i13;
        int i14;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            R(2, i12);
        }
        boolean z10 = false;
        if (i(0, i10, this.f12294J, this.f12293I, i12)) {
            int i15 = i10 - this.f12294J[1];
            i14 = this.f12293I[1];
            i13 = i15;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z11 = d() && !z9;
        int i16 = i13;
        boolean z12 = D(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !s(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f12294J;
        iArr[1] = 0;
        j(0, scrollY2, 0, i16 - scrollY2, this.f12293I, i12, iArr);
        int i17 = i14 + this.f12293I[1];
        int i18 = i16 - this.f12294J[1];
        int i19 = scrollY + i18;
        if (i19 < 0) {
            if (z11) {
                h.c(this.f12308u, (-i18) / getHeight(), i11 / getWidth());
                if (!this.f12309v.isFinished()) {
                    this.f12309v.onRelease();
                }
            }
        } else if (i19 > scrollRange && z11) {
            h.c(this.f12309v, i18 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f12308u.isFinished()) {
                this.f12308u.onRelease();
            }
        }
        if (this.f12308u.isFinished() && this.f12309v.isFinished()) {
            z10 = z12;
        } else {
            postInvalidateOnAnimation();
        }
        if (z10 && i12 == 0 && (velocityTracker = this.f12286B) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            T(i12);
            this.f12308u.onRelease();
            this.f12309v.onRelease();
        }
        return i17;
    }

    private void K(View view) {
        view.getDrawingRect(this.f12306s);
        offsetDescendantRectToMyCoords(view, this.f12306s);
        int iG = g(this.f12306s);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean L(Rect rect, boolean z9) {
        int iG = g(rect);
        boolean z10 = iG != 0;
        if (z10) {
            if (z9) {
                scrollBy(0, iG);
                return z10;
            }
            N(0, iG);
        }
        return z10;
    }

    private boolean M(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return r(-i10) < h.b(edgeEffect) * ((float) getHeight());
    }

    private void O(int i10, int i11, int i12, boolean z9) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f12305r > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f12307t.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            H(z9);
        } else {
            if (!this.f12307t.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f12305r = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean S(MotionEvent motionEvent) {
        boolean z9;
        if (h.b(this.f12308u) != 0.0f) {
            h.c(this.f12308u, 0.0f, motionEvent.getX() / getWidth());
            z9 = true;
        } else {
            z9 = false;
        }
        if (h.b(this.f12309v) == 0.0f) {
            return z9;
        }
        h.c(this.f12309v, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f12307t.abortAnimation();
        T(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private void k(int i10) {
        if (i10 != 0) {
            if (this.f12288D) {
                N(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean l(int i10) {
        if (h.b(this.f12308u) != 0.0f) {
            if (M(this.f12308u, i10)) {
                this.f12308u.onAbsorb(i10);
                return true;
            }
            p(-i10);
            return true;
        }
        if (h.b(this.f12309v) == 0.0f) {
            return false;
        }
        int i11 = -i10;
        if (M(this.f12309v, i11)) {
            this.f12309v.onAbsorb(i11);
            return true;
        }
        p(i11);
        return true;
    }

    private void m() {
        this.f12292H = -1;
        this.f12285A = false;
        F();
        T(0);
        this.f12308u.onRelease();
        this.f12309v.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View o(boolean z9, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z11 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom());
                    if (z10) {
                        if (z11 && z12) {
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else if (z12) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float r(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f12304q * 0.015f));
        float f10 = f12282T;
        return (float) (((double) (this.f12304q * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private boolean t(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void u() {
        VelocityTracker velocityTracker = this.f12286B;
        if (velocityTracker == null) {
            this.f12286B = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void v() {
        this.f12307t = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f12289E = viewConfiguration.getScaledTouchSlop();
        this.f12290F = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12291G = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void w() {
        if (this.f12286B == null) {
            this.f12286B = VelocityTracker.obtain();
        }
    }

    private void x(int i10, int i11) {
        this.f12310w = i10;
        this.f12292H = i11;
        R(2, 0);
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z9) {
        boolean z10;
        boolean z11;
        int i18;
        int overScrollMode = getOverScrollMode();
        boolean z12 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z13 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z14 = overScrollMode == 0 || (overScrollMode == 1 && z12);
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        int i19 = i12 + i10;
        int i20 = !z14 ? 0 : i16;
        int i21 = i13 + i11;
        int i22 = !z15 ? 0 : i17;
        int i23 = -i20;
        int i24 = i20 + i14;
        int i25 = -i22;
        int i26 = i22 + i15;
        if (i19 > i24) {
            i19 = i24;
            z10 = true;
        } else if (i19 < i23) {
            z10 = true;
            i19 = i23;
        } else {
            z10 = false;
        }
        if (i21 > i26) {
            i21 = i26;
            z11 = true;
        } else if (i21 < i25) {
            z11 = true;
            i21 = i25;
        } else {
            z11 = false;
        }
        if (!z11 || s(1)) {
            i18 = i19;
        } else {
            int i27 = i19;
            this.f12307t.springBack(i27, i21, 0, 0, 0, getScrollRange());
            i18 = i27;
        }
        onOverScrolled(i18, i21, z10, z11);
        return z10 || z11;
    }

    public boolean E(int i10) {
        boolean z9 = i10 == 130;
        int height = getHeight();
        if (z9) {
            this.f12306s.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f12306s;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f12306s.top = getScrollY() - height;
            Rect rect2 = this.f12306s;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f12306s;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return I(i10, i11, i12);
    }

    public final void N(int i10, int i11) {
        O(i10, i11, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    void P(int i10, int i11, int i12, boolean z9) {
        O(i10 - getScrollX(), i11 - getScrollY(), i12, z9);
    }

    void Q(int i10, int i11, boolean z9) {
        P(i10, i11, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, z9);
    }

    public boolean R(int i10, int i11) {
        return this.f12299O.q(i10, i11);
    }

    public void T(int i10) {
        this.f12299O.s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            J(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f12306s);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f12306s);
            J(g(this.f12306s), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && y(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f12307t.isFinished()) {
            return;
        }
        this.f12307t.computeScrollOffset();
        int currY = this.f12307t.getCurrY();
        int iH = h(currY - this.f12296L);
        this.f12296L = currY;
        int[] iArr = this.f12294J;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i10 = iH - this.f12294J[1];
        int scrollRange = getScrollRange();
        if (p231x0.a.b()) {
            c.a(this, Math.abs(this.f12307t.getCurrVelocity()));
        }
        if (i10 != 0) {
            int scrollY = getScrollY();
            D(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f12294J;
            iArr2[1] = 0;
            j(0, scrollY2, 0, i11, this.f12293I, 1, iArr2);
            i10 = i11 - this.f12294J[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i10 < 0) {
                    if (this.f12308u.isFinished()) {
                        this.f12308u.onAbsorb((int) this.f12307t.getCurrVelocity());
                    }
                } else if (this.f12309v.isFinished()) {
                    this.f12309v.onAbsorb((int) this.f12307t.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f12307t.isFinished()) {
            T(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.f12299O.a(f10, f11, z9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f12299O.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return i(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f12299O.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f12308u.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f12308u.setSize(width, height);
            if (this.f12308u.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f12309v.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f12309v.setSize(width2, height2);
        if (this.f12309v.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f12298N.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f12300P == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f12300P = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f12300P;
    }

    int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && h.b(this.f12308u) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * h.c(this.f12308u, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f12308u.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || h.b(this.f12309v) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * h.c(this.f12309v, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f12309v.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return s(0);
    }

    public boolean i(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f12299O.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f12299O.m();
    }

    public void j(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f12299O.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(KeyEvent keyEvent) {
        this.f12306s.setEmpty();
        if (!e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? q(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? q(130) : c(130);
            }
            if (keyCode == 62) {
                E(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return q(33);
            }
            if (keyCode == 93) {
                return q(130);
            }
            if (keyCode == 122) {
                E(33);
                return false;
            }
            if (keyCode == 123) {
                E(130);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12312y = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f12285A) {
            if (AbstractC1085q.a(motionEvent, 2)) {
                i10 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (AbstractC1085q.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                J(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, AbstractC1085q.a(motionEvent, 8194));
                if (i10 != 0) {
                    this.f12303S.g(motionEvent, i10);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action == 2 && this.f12285A) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y9 = (int) motionEvent.getY();
            if (t((int) motionEvent.getX(), y9)) {
                this.f12310w = y9;
                this.f12292H = motionEvent.getPointerId(0);
                u();
                this.f12286B.addMovement(motionEvent);
                this.f12307t.computeScrollOffset();
                if (!S(motionEvent) && this.f12307t.isFinished()) {
                    z9 = false;
                }
                this.f12285A = z9;
                R(2, 0);
            } else {
                if (!S(motionEvent) && this.f12307t.isFinished()) {
                    z9 = false;
                }
                this.f12285A = z9;
                F();
            }
        } else if (i10 == 1) {
            this.f12285A = false;
            this.f12292H = -1;
            F();
            if (this.f12307t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            T(0);
        } else if (i10 == 2) {
            int i11 = this.f12292H;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y10 - this.f12310w) > this.f12289E && (2 & getNestedScrollAxes()) == 0) {
                        this.f12285A = true;
                        this.f12310w = y10;
                        w();
                        this.f12286B.addMovement(motionEvent);
                        this.f12295K = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f12285A = false;
            this.f12292H = -1;
            F();
            if (this.f12307t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            T(0);
        } else if (i10 == 6) {
            C(motionEvent);
        }
        return this.f12285A;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f12311x = false;
        View view = this.f12313z;
        if (view != null && z(view, this)) {
            K(this.f12313z);
        }
        this.f12313z = null;
        if (!this.f12312y) {
            if (this.f12297M != null) {
                scrollTo(getScrollX(), this.f12297M.f12315q);
                this.f12297M = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f12312y = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f12287C && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, BasicMeasure.EXACTLY));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (z9) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        p((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        i(i10, i11, iArr, null, i12);
    }

    @Override // androidx.core.view.InterfaceC1088u
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        B(i13, i14, iArr);
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f12298N.c(view, view2, i10, i11);
        R(2, i11);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z9, boolean z10) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || y(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f12297M = fVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f12315q = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f12301Q;
        if (eVar != null) {
            eVar.onScrollChange(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f12306s);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f12306s);
        k(g(this.f12306s));
    }

    @Override // androidx.core.view.InterfaceC1087t
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onStopNestedScroll(View view, int i10) {
        this.f12298N.d(view, i10);
        T(i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12295K = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f12295K);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f12286B;
                velocityTracker.computeCurrentVelocity(1000, this.f12291G);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f12292H);
                if (Math.abs(yVelocity) >= this.f12290F) {
                    if (!l(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            p(i10);
                        }
                    }
                } else if (this.f12307t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f12292H);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f12292H + " in onTouchEvent");
                } else {
                    int y9 = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f12310w - y9;
                    int iG = i11 - G(i11, motionEvent.getX(iFindPointerIndex));
                    if (!this.f12285A && Math.abs(iG) > this.f12289E) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f12285A = true;
                        iG = iG > 0 ? iG - this.f12289E : iG + this.f12289E;
                    }
                    if (this.f12285A) {
                        int iJ = J(iG, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f12310w = y9 - iJ;
                        this.f12295K += iJ;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f12285A && getChildCount() > 0 && this.f12307t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f12310w = (int) motionEvent.getY(actionIndex);
                this.f12292H = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                C(motionEvent);
                this.f12310w = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f12292H));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f12285A && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f12307t.isFinished()) {
                a();
            }
            x((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f12286B;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i10) {
        if (getChildCount() > 0) {
            this.f12307t.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, SubsamplingScaleImageView.TILE_SIZE_AUTO, 0, 0);
            H(true);
            if (p231x0.a.b()) {
                c.a(this, Math.abs(this.f12307t.getCurrVelocity()));
            }
        }
    }

    public boolean q(int i10) {
        int childCount;
        boolean z9 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f12306s;
        rect.top = 0;
        rect.bottom = height;
        if (z9 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f12306s.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f12306s;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f12306s;
        return I(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f12311x) {
            this.f12313z = view2;
        } else {
            K(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        if (z9) {
            F();
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f12311x = true;
        super.requestLayout();
    }

    public boolean s(int i10) {
        return this.f12299O.l(i10);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i10, width, width2);
            int iF2 = f(i11, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z9) {
        if (z9 != this.f12287C) {
            this.f12287C = z9;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        this.f12299O.n(z9);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.f12301Q = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z9) {
        this.f12288D = z9;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return R(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        T(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12306s = new Rect();
        this.f12311x = true;
        this.f12312y = false;
        this.f12313z = null;
        this.f12285A = false;
        this.f12288D = true;
        this.f12292H = -1;
        this.f12293I = new int[2];
        this.f12294J = new int[2];
        d dVar = new d();
        this.f12302R = dVar;
        this.f12303S = new C1073e(getContext(), dVar);
        this.f12308u = h.a(context, attributeSet);
        this.f12309v = h.a(context, attributeSet);
        this.f12304q = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12284V, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f12298N = new C1089v(this);
        this.f12299O = new C1086s(this);
        setNestedScrollingEnabled(true);
        H.g0(this, f12283U);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        B(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        B(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
