package com.nothing.wallpaper.widget;

import H3.D;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.K;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PreviewSectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f19170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AccelerateInterpolator f19173t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f19174u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewSectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final void b(int i10, float f10) {
        View childAt = getChildAt(i10);
        childAt.setAlpha(f10);
        boolean z9 = f10 == 1.0f;
        n.e(childAt);
        c(z9, childAt);
        childAt.setVisibility(f10 == 0.0f ? 8 : 0);
    }

    private final void c(boolean z9, View view) {
        view.setEnabled(z9);
        if (view instanceof ViewGroup) {
            Iterator it = K.b((ViewGroup) view).iterator();
            while (it.hasNext()) {
                c(z9, (View) it.next());
            }
        }
    }

    public final void a(int i10, float f10) {
        if (this.f19171r == 0 || getChildCount() != 2 || i10 < 0 || i10 >= 2) {
            return;
        }
        int i11 = this.f19171r;
        if (i10 == 0) {
            i11 = (int) ((i11 * f10) + 0.5f);
        }
        this.f19172s = i11;
        setScrollX(i11);
        if (i10 == 0) {
            f10 = 1.0f - f10;
        }
        b(0, this.f19173t.getInterpolation(f10));
        b(1, this.f19173t.getInterpolation(1 - f10));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        View childAt;
        if (getChildCount() == 0) {
            return;
        }
        int paddingStart = getPaddingStart();
        int paddingEnd = (i12 - i10) - getPaddingEnd();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        View childAt2 = getChildAt(0);
        if (childAt2 != null) {
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            int marginStart = (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) + paddingStart;
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i14 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + paddingTop;
            ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
            int marginEnd = paddingEnd - (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0);
            ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            childAt2.layout(marginStart, i14, marginEnd, paddingBottom - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
            ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
            int measuredWidth = (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) ? 0 : childAt.getMeasuredWidth();
            this.f19171r = measuredWidth;
            this.f19171r = measuredWidth * (this.f19174u ? -1 : 1);
        }
        View childAt3 = getChildAt(1);
        if (childAt3 != null) {
            ViewGroup.LayoutParams layoutParams5 = childAt3.getLayoutParams();
            int marginStart2 = paddingStart + (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart() : 0) + this.f19171r;
            ViewGroup.LayoutParams layoutParams6 = childAt3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            int i15 = paddingTop + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
            ViewGroup.LayoutParams layoutParams7 = childAt3.getLayoutParams();
            int marginEnd2 = (paddingEnd - (layoutParams7 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginEnd() : 0)) + this.f19171r;
            ViewGroup.LayoutParams layoutParams8 = childAt3.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
            childAt3.layout(marginStart2, i15, marginEnd2, paddingBottom - (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0));
        }
    }

    public /* synthetic */ PreviewSectionLayout(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSectionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19170q = "PreviewSectionLayout";
        this.f19173t = new AccelerateInterpolator(context, null);
        this.f19174u = D.o(context);
    }
}
