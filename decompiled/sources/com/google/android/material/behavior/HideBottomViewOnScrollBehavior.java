package com.google.android.material.behavior;

import I4.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LinkedHashSet f16477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f16479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TimeInterpolator f16480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TimeInterpolator f16481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ViewPropertyAnimator f16485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f16476z = p225w4.a.f28668C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f16474A = p225w4.a.f28671F;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f16475B = p225w4.a.f28676K;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f16485y = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f16477q = new LinkedHashSet();
        this.f16482v = 0;
        this.f16483w = 2;
        this.f16484x = 0;
    }

    private void J(View view, int i10, long j9, TimeInterpolator timeInterpolator) {
        this.f16485y = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j9).setListener(new a());
    }

    private void Q(View view, int i10) {
        this.f16483w = i10;
        Iterator it = this.f16477q.iterator();
        if (it.hasNext()) {
            o.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean K() {
        return this.f16483w == 1;
    }

    public boolean L() {
        return this.f16483w == 2;
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z9) {
        if (K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16485y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Q(view, 1);
        int i10 = this.f16482v + this.f16484x;
        if (z9) {
            J(view, i10, this.f16479s, this.f16481u);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void O(View view) {
        P(view, true);
    }

    public void P(View view, boolean z9) {
        if (L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16485y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Q(view, 2);
        if (z9) {
            J(view, 0, this.f16478r, this.f16480t);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f16482v = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f16478r = f.f(view.getContext(), f16476z, 225);
        this.f16479s = f.f(view.getContext(), f16474A, 175);
        Context context = view.getContext();
        int i11 = f16475B;
        this.f16480t = f.g(context, i11, p235x4.a.f29942d);
        this.f16481u = f.g(view.getContext(), i11, p235x4.a.f29941c);
        return super.p(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            M(view);
        } else if (i11 < 0) {
            O(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16477q = new LinkedHashSet();
        this.f16482v = 0;
        this.f16483w = 2;
        this.f16484x = 0;
    }
}
