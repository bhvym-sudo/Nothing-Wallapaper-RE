package com.android.wallpaper.picker;

import H3.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.K;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayAspectRatioFrameLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float fD = s.a().d(getContext());
        for (View view : K.b(this)) {
            view.measure(View.MeasureSpec.makeMeasureSpec((int) (view.getMeasuredHeight() / fD), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), BasicMeasure.EXACTLY));
        }
    }
}
