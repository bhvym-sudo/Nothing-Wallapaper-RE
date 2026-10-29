package com.android.wallpaper.picker;

import H3.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.K;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import p087i6.q;

/* JADX INFO: loaded from: classes.dex */
public class FixedWidthDisplayRatioFrameLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedWidthDisplayRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float fD = s.a().d(getContext());
        Context context = getContext();
        n.g(context, "getContext(...)");
        int iA = q.a(context, View.MeasureSpec.getSize(i10));
        int i12 = (int) (iA * fD);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iA, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY));
        Iterator it = K.b(this).iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(View.MeasureSpec.makeMeasureSpec(iA, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY));
        }
    }
}
