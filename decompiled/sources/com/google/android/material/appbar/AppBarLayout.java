package com.google.android.material.appbar;

import N4.h;
import N4.i;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import androidx.core.view.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int f16350P = j.f28911h;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f16351A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f16352B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f16353C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private WeakReference f16354D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f16355E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ValueAnimator f16356F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f16357G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final List f16358H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final long f16359I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final TimeInterpolator f16360J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int[] f16361K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Drawable f16362L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Integer f16363M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final float f16364N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Behavior f16365O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f16368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f16369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f16370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private V f16372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f16373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f16374y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f16375z;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.c {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f16376A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private int f16377B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private ValueAnimator f16378C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private c f16379D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private WeakReference f16380E;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f16381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f16382b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f16381a = coordinatorLayout;
                this.f16382b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f16381a, this.f16382b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C1069a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f16384q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f16385r;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f16384q = appBarLayout;
                this.f16385r = coordinatorLayout;
            }

            @Override // androidx.core.view.C1069a
            public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
                View viewJ0;
                super.onInitializeAccessibilityNodeInfo(view, dVar);
                dVar.g0(ScrollView.class.getName());
                if (this.f16384q.getTotalScrollRange() == 0 || (viewJ0 = BaseBehavior.this.j0(this.f16385r)) == null || !BaseBehavior.this.f0(this.f16384q)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f16384q.getTotalScrollRange())) {
                    dVar.b(C0.d.a.f551q);
                    dVar.H0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!viewJ0.canScrollVertically(-1)) {
                        dVar.b(C0.d.a.f552r);
                        dVar.H0(true);
                    } else if ((-this.f16384q.getDownNestedPreScrollRange()) != 0) {
                        dVar.b(C0.d.a.f552r);
                        dVar.H0(true);
                    }
                }
            }

            @Override // androidx.core.view.C1069a
            public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f16384q.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.performAccessibilityAction(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f16385r);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f16384q.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f16384q.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f16385r, this.f16384q, viewJ0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(appBarLayout, iQ);
            if (iI0 >= 0) {
                View childAt = appBarLayout.getChildAt(iI0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iW = -childAt.getBottom();
                    if (iI0 == 0 && H.s(appBarLayout) && H.s(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        iW += H.w(childAt);
                    } else if (e0(iC, 5)) {
                        int iW2 = H.w(childAt) + iW;
                        if (iQ < iW2) {
                            topInset2 = iW2;
                        } else {
                            iW = iW2;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        iW -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    Z(coordinatorLayout, appBarLayout, p221w0.a.b(b0(iQ, iW, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z9) {
            View viewH0 = h0(appBarLayout, i10);
            boolean zE = false;
            if (viewH0 != null) {
                int iC = ((e) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iW = H.w(viewH0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewH0.getBottom() - iW) - appBarLayout.getTopInset()) : (-i10) >= (viewH0.getBottom() - iW) - appBarLayout.getTopInset()) {
                        zE = true;
                    }
                }
            }
            if (appBarLayout.q()) {
                zE = appBarLayout.E(g0(coordinatorLayout));
            }
            boolean zB = appBarLayout.B(zE);
            if (z9 || (zB && z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (H.H(coordinatorLayout)) {
                return;
            }
            H.g0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        private void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(Q() - i10);
            float fAbs = Math.abs(f10);
            a0(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iQ = Q();
            if (iQ == i10) {
                ValueAnimator valueAnimator = this.f16378C;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f16378C.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f16378C;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f16378C = valueAnimator3;
                valueAnimator3.setInterpolator(p235x4.a.f29943e);
                this.f16378C.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f16378C.setDuration(Math.min(i11, 600));
            this.f16378C.setIntValues(iQ, i10);
            this.f16378C.start();
        }

        private int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.m() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f16395a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof r) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (e0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = eVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= H.w(childAt);
                        }
                    }
                    if (H.s(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listM = coordinatorLayout.m(appBarLayout);
            int size = listM.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) ((View) listM.get(i10)).getLayoutParams()).e();
                if (cVarE instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarE).O() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.c
        int Q() {
            return I() + this.f16376A;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f16380E;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.q()) {
                appBarLayout.B(appBarLayout.E(g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean zP = super.p(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            c cVar = this.f16379D;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z9 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z9) {
                            Z(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z9) {
                            Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (cVar.f16387q) {
                T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (cVar.f16388r) {
                T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(cVar.f16389s);
                T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f16379D.f16391u ? H.w(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f16379D.f16390t)));
            }
            appBarLayout.w();
            this.f16379D = null;
            K(p221w0.a.b(I(), -appBarLayout.getTotalScrollRange(), 0));
            B0(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.s(I());
            Y(coordinatorLayout, appBarLayout);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.D(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            AppBarLayout appBarLayout2;
            int i13;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = S(coordinatorLayout, appBarLayout2, i11, i14, i15);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.q()) {
                appBarLayout2.B(appBarLayout2.E(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = baseBehavior.S(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                baseBehavior.Y(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof c) {
                w0((c) parcelable, true);
                super.B(coordinatorLayout, appBarLayout, this.f16379D.getSuperState());
            } else {
                super.B(coordinatorLayout, appBarLayout, parcelable);
                this.f16379D = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableC = super.C(coordinatorLayout, appBarLayout);
            c cVarX0 = x0(parcelableC, appBarLayout);
            return cVarX0 == null ? parcelableC : cVarX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z9 = (i10 & 2) != 0 && (appBarLayout.q() || d0(coordinatorLayout, appBarLayout, view));
            if (z9 && (valueAnimator = this.f16378C) != null) {
                valueAnimator.cancel();
            }
            this.f16380E = null;
            this.f16377B = i11;
            return z9;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f16377B == 0 || i10 == 1) {
                A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.q()) {
                    appBarLayout.B(appBarLayout.E(view));
                }
            }
            this.f16380E = new WeakReference(view);
        }

        void w0(c cVar, boolean z9) {
            if (this.f16379D == null || z9) {
                this.f16379D = cVar;
            }
        }

        c x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I9 = I();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + I9;
                if (childAt.getTop() + I9 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = H0.a.EMPTY_STATE;
                    }
                    c cVar = new c(parcelable);
                    boolean z9 = I9 == 0;
                    cVar.f16388r = z9;
                    cVar.f16387q = !z9 && (-I9) >= appBarLayout.getTotalScrollRange();
                    cVar.f16389s = i10;
                    cVar.f16391u = bottom == H.w(childAt) + appBarLayout.getTopInset();
                    cVar.f16390t = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            int iQ = Q();
            int i13 = 0;
            if (i11 == 0 || iQ < i11 || iQ > i12) {
                this.f16376A = 0;
            } else {
                int iB = p221w0.a.b(i10, i11, i12);
                if (iQ != iB) {
                    int iM0 = appBarLayout.k() ? m0(appBarLayout, iB) : iB;
                    boolean zK = K(iM0);
                    int i14 = iQ - iB;
                    this.f16376A = iB - iM0;
                    if (zK) {
                        while (i13 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i13).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(appBarLayout, appBarLayout.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!zK && appBarLayout.k()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.s(I());
                    B0(coordinatorLayout, appBarLayout, iB, iB < iQ ? -1 : 1, false);
                    i13 = i14;
                }
            }
            Y(coordinatorLayout, appBarLayout);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends H0.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            boolean f16387q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            boolean f16388r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f16389s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            float f16390t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            boolean f16391u;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f16387q = parcel.readByte() != 0;
                this.f16388r = parcel.readByte() != 0;
                this.f16389s = parcel.readInt();
                this.f16390t = parcel.readFloat();
                this.f16391u = parcel.readByte() != 0;
            }

            @Override // H0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f16387q ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f16388r ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f16389s);
                parcel.writeFloat(this.f16390t);
                parcel.writeByte(this.f16391u ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.d {
        public ScrollingViewBehavior() {
        }

        private static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                return ((BaseBehavior) cVarE).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                H.S(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarE).f16376A) + Q()) - M(view2));
            }
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.q()) {
                    appBarLayout.B(appBarLayout.E(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.l(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f16459t;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.x(false, !z9);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.d
        float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.d
        int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                H.g0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f29347r5);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f29357s5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements InterfaceC1090w {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            return AppBarLayout.this.t(v9);
        }
    }

    public interface b {
        void a(AppBarLayout appBarLayout, int i10);
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f16393a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f16394b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f16393a, appBarLayout, view);
            float fAbs = this.f16393a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                H.n0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fA = 1.0f - p221w0.a.a(Math.abs(fAbs / this.f16393a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f16393a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f16394b);
            this.f16394b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f16394b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            H.n0(view, this.f16394b);
        }
    }

    public interface f extends b {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28692a);
    }

    private boolean D() {
        return this.f16362L != null && getTopInset() > 0;
    }

    private boolean F() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !H.s(childAt)) {
                return true;
            }
        }
        return false;
    }

    private void G(float f10, float f11) {
        ValueAnimator valueAnimator = this.f16356F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f16356F = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f16359I);
        this.f16356F.setInterpolator(this.f16360J);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f16357G;
        if (animatorUpdateListener != null) {
            this.f16356F.addUpdateListener(animatorUpdateListener);
        }
        this.f16356F.start();
    }

    private void H() {
        setWillNotDraw(!D());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, h hVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hVar.U(fFloatValue);
        Drawable drawable = appBarLayout.f16362L;
        if (drawable instanceof h) {
            ((h) drawable).U(fFloatValue);
        }
        Iterator it = appBarLayout.f16358H.iterator();
        if (it.hasNext()) {
            o.a(it.next());
            hVar.y();
            throw null;
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, h hVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iJ = D4.a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        hVar.V(ColorStateList.valueOf(iJ));
        if (appBarLayout.f16362L != null && (num2 = appBarLayout.f16363M) != null && num2.equals(num)) {
            p201u0.a.n(appBarLayout.f16362L, iJ);
        }
        if (appBarLayout.f16358H.isEmpty()) {
            return;
        }
        Iterator it = appBarLayout.f16358H.iterator();
        while (it.hasNext()) {
            o.a(it.next());
            if (hVar.v() != null) {
                throw null;
            }
        }
    }

    private void e() {
        WeakReference weakReference = this.f16354D;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16354D = null;
    }

    private Integer f() {
        Drawable drawable = this.f16362L;
        if (drawable instanceof h) {
            return Integer.valueOf(((h) drawable).y());
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.a.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View g(View view) {
        int i10;
        if (this.f16354D == null && (i10 = this.f16353C) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f16353C);
            }
            if (viewFindViewById != null) {
                this.f16354D = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f16354D;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean l() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void n(final h hVar, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numF = D4.a.f(getContext(), p225w4.a.f28712o);
        this.f16357G = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f16442a, colorStateList, colorStateList2, hVar, numF, valueAnimator);
            }
        };
        H.k0(this, hVar);
    }

    private void o(Context context, final h hVar) {
        hVar.K(context);
        this.f16357G = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f16447a, hVar, valueAnimator);
            }
        };
        H.k0(this, hVar);
    }

    private void p() {
        Behavior behavior = this.f16365O;
        BaseBehavior.c cVarX0 = (behavior == null || this.f16367r == -1 || this.f16371v != 0) ? null : behavior.x0(H0.a.EMPTY_STATE, this);
        this.f16367r = -1;
        this.f16368s = -1;
        this.f16369t = -1;
        if (cVarX0 != null) {
            this.f16365O.w0(cVarX0, false);
        }
    }

    private boolean r() {
        return getBackground() instanceof h;
    }

    private void y(boolean z9, boolean z10, boolean z11) {
        this.f16371v = (z9 ? 1 : 2) | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        requestLayout();
    }

    private boolean z(boolean z9) {
        if (this.f16375z == z9) {
            return false;
        }
        this.f16375z = z9;
        refreshDrawableState();
        return true;
    }

    public boolean A(boolean z9) {
        return C(z9, true);
    }

    boolean B(boolean z9) {
        return C(z9, !this.f16374y);
    }

    boolean C(boolean z9, boolean z10) {
        if (!z10 || this.f16351A == z9) {
            return false;
        }
        this.f16351A = z9;
        refreshDrawableState();
        if (!r()) {
            return true;
        }
        if (this.f16355E) {
            G(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f16352B) {
            return true;
        }
        G(z9 ? 0.0f : this.f16364N, z9 ? this.f16364N : 0.0f);
        return true;
    }

    boolean E(View view) {
        View viewG = g(view);
        if (viewG != null) {
            view = viewG;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public void c(b bVar) {
        if (this.f16373x == null) {
            this.f16373x = new ArrayList();
        }
        if (bVar == null || this.f16373x.contains(bVar)) {
            return;
        }
        this.f16373x.add(bVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(f fVar) {
        c(fVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (D()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f16366q);
            this.f16362L.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16362L;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f16365O = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iW;
        int i10 = this.f16368s;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f16395a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iW = H.w(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            iW = measuredHeight - H.w(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && H.s(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iW;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f16368s = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f16369t;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iW = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i12 = eVar.f16395a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iW += measuredHeight;
                if ((i12 & 2) != 0) {
                    iW -= H.w(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iW);
        this.f16369t = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f16353C;
    }

    public h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h) {
            return (h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iW = H.w(this);
        if (iW == 0) {
            int childCount = getChildCount();
            iW = childCount >= 1 ? H.w(getChildAt(childCount - 1)) : 0;
            if (iW == 0) {
                return getHeight() / 3;
            }
        }
        return (iW * 2) + topInset;
    }

    int getPendingAction() {
        return this.f16371v;
    }

    public Drawable getStatusBarForeground() {
        return this.f16362L;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        V v9 = this.f16372w;
        if (v9 != null) {
            return v9.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f16367r;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iW = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f16395a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iW += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i11 == 0 && H.s(childAt)) {
                    iW -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iW -= H.w(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iW);
        this.f16367r = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    boolean k() {
        return this.f16370u;
    }

    boolean m() {
        return getTotalScrollRange() != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f16361K == null) {
            this.f16361K = new int[4];
        }
        int[] iArr = this.f16361K;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z9 = this.f16375z;
        int i11 = p225w4.a.f28689X;
        if (!z9) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z9 && this.f16351A) ? p225w4.a.f28690Y : -p225w4.a.f28690Y;
        int i12 = p225w4.a.f28686U;
        if (!z9) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z9 && this.f16351A) ? p225w4.a.f28685T : -p225w4.a.f28685T;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        boolean z10 = true;
        if (H.s(this) && F()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                H.S(getChildAt(childCount), topInset);
            }
        }
        p();
        this.f16370u = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f16370u = true;
                break;
            }
        }
        Drawable drawable = this.f16362L;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f16374y) {
            return;
        }
        if (!this.f16352B && !l()) {
            z10 = false;
        }
        z(z10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && H.s(this) && F()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = p221w0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        p();
    }

    public boolean q() {
        return this.f16352B;
    }

    void s(int i10) {
        this.f16366q = i10;
        if (!willNotDraw()) {
            H.X(this);
        }
        List list = this.f16373x;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f16373x.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        i.d(this, f10);
    }

    public void setExpanded(boolean z9) {
        x(z9, H.M(this));
    }

    public void setLiftOnScroll(boolean z9) {
        this.f16352B = z9;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f16353C = -1;
        if (view == null) {
            e();
        } else {
            this.f16354D = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f16353C = i10;
        e();
    }

    public void setLiftableOverrideEnabled(boolean z9) {
        this.f16374y = z9;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f16362L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f16362L = drawable != null ? drawable.mutate() : null;
            this.f16363M = f();
            Drawable drawable3 = this.f16362L;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f16362L.setState(getDrawableState());
                }
                p201u0.a.m(this.f16362L, H.v(this));
                this.f16362L.setVisible(getVisibility() == 0, false);
                this.f16362L.setCallback(this);
            }
            H();
            H.X(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(p060g.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        g.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f16362L;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
    }

    V t(V v9) {
        V v10 = H.s(this) ? v9 : null;
        if (!B0.d.a(this.f16372w, v10)) {
            this.f16372w = v10;
            H();
            requestLayout();
        }
        return v9;
    }

    public void u(b bVar) {
        List list = this.f16373x;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    public void v(f fVar) {
        u(fVar);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16362L;
    }

    void w() {
        this.f16371v = 0;
    }

    public void x(boolean z9, boolean z10) {
        y(z9, z10, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f16350P;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f16367r = -1;
        this.f16368s = -1;
        this.f16369t = -1;
        this.f16371v = 0;
        this.f16358H = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            g.a(this);
        }
        g.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, k.f29271k, i10, i11, new int[0]);
        H.k0(this, typedArrayI.getDrawable(k.f29281l));
        ColorStateList colorStateListA = K4.c.a(context2, typedArrayI, k.f29341r);
        this.f16355E = colorStateListA != null;
        ColorStateList colorStateListF = com.google.android.material.drawable.a.f(getBackground());
        if (colorStateListF != null) {
            h hVar = new h();
            hVar.V(colorStateListF);
            if (colorStateListA != null) {
                n(hVar, colorStateListF, colorStateListA);
            } else {
                o(context2, hVar);
            }
        }
        this.f16359I = I4.f.f(context2, p225w4.a.f28670E, getResources().getInteger(p225w4.f.f28848a));
        this.f16360J = I4.f.g(context2, p225w4.a.f28679N, p235x4.a.f29939a);
        int i12 = k.f29321p;
        if (typedArrayI.hasValue(i12)) {
            y(typedArrayI.getBoolean(i12, false), false, false);
        }
        int i13 = k.f29311o;
        if (typedArrayI.hasValue(i13)) {
            g.b(this, typedArrayI.getDimensionPixelSize(i13, 0));
        }
        int i14 = k.f29301n;
        if (typedArrayI.hasValue(i14)) {
            setKeyboardNavigationCluster(typedArrayI.getBoolean(i14, false));
        }
        int i15 = k.f29291m;
        if (typedArrayI.hasValue(i15)) {
            setTouchscreenBlocksFocus(typedArrayI.getBoolean(i15, false));
        }
        this.f16364N = getResources().getDimension(p225w4.c.f28756a);
        this.f16352B = typedArrayI.getBoolean(k.f29331q, false);
        this.f16353C = typedArrayI.getResourceId(k.f29351s, -1);
        setStatusBarForeground(typedArrayI.getDrawable(k.f29361t));
        typedArrayI.recycle();
        H.u0(this, new a());
    }

    public static class e extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f16396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f16397c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16395a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f29381v);
            this.f16395a = typedArrayObtainStyledAttributes.getInt(k.f29401x, 0);
            f(typedArrayObtainStyledAttributes.getInt(k.f29391w, 0));
            int i10 = k.f29411y;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f16397c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f16396b;
        }

        public int c() {
            return this.f16395a;
        }

        public Interpolator d() {
            return this.f16397c;
        }

        boolean e() {
            int i10 = this.f16395a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f16396b = a(i10);
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f16395a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16395a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16395a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16395a = 1;
        }
    }
}
