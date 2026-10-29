package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1077i;
import androidx.core.view.H;
import androidx.core.view.V;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Rect f16459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Rect f16460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16462w;

    public d() {
        this.f16459t = new Rect();
        this.f16460u = new Rect();
        this.f16461v = 0;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.e
    protected void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewL = L(coordinatorLayout.l(view));
        if (viewL == null) {
            super.J(coordinatorLayout, view, i10);
            this.f16461v = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f16459t;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewL.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        V lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && H.s(coordinatorLayout) && !H.s(view)) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.f16460u;
        AbstractC1077i.a(R(fVar.f12133c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iM = M(viewL);
        view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
        this.f16461v = rect2.top - viewL.getBottom();
    }

    abstract View L(List list);

    final int M(View view) {
        if (this.f16462w == 0) {
            return 0;
        }
        float fN = N(view);
        int i10 = this.f16462w;
        return p221w0.a.b((int) (fN * i10), 0, i10);
    }

    abstract float N(View view);

    public final int O() {
        return this.f16462w;
    }

    int P(View view) {
        return view.getMeasuredHeight();
    }

    final int Q() {
        return this.f16461v;
    }

    public final void S(int i10) {
        this.f16462w = i10;
    }

    protected boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewL;
        V lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewL = L(coordinatorLayout.l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (H.s(viewL) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iP = size + P(viewL);
        int measuredHeight = viewL.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iP -= measuredHeight;
        }
        coordinatorLayout.D(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iP, i14 == -1 ? BasicMeasure.EXACTLY : Integer.MIN_VALUE), i13);
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16459t = new Rect();
        this.f16460u = new Rect();
        this.f16461v = 0;
    }
}
