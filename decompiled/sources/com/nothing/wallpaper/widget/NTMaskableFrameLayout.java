package com.nothing.wallpaper.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.android.material.carousel.i;
import kotlin.jvm.internal.n;
import p087i6.q;

/* JADX INFO: loaded from: classes2.dex */
public final class NTMaskableFrameLayout extends i {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19161v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19162w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTMaskableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        this.f19162w = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_width, R.attr.layout_height});
            n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f19162w = typedArrayObtainStyledAttributes.getLayoutDimension(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.f19161v = q.a(context, View.MeasureSpec.getSize(this.f19162w));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f19161v, BasicMeasure.EXACTLY), i11);
    }
}
