package com.android.customization.picker.clock.ui.view;

import H3.s;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class ClockHostView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f15361q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockHostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        this.f15361q = 1.0f;
    }

    private final void setPreviewRatio(float f10) {
        if (this.f15361q == f10) {
            return;
        }
        this.f15361q = f10;
        setScaleX(f10);
        setScaleY(this.f15361q);
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        Point pointE = s.a().e(getDisplay());
        super.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(pointE.x, BasicMeasure.EXACTLY), i11, View.MeasureSpec.makeMeasureSpec(pointE.y, BasicMeasure.EXACTLY), i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPreviewRatio(getMeasuredWidth() / s.a().e(getDisplay()).x);
    }
}
