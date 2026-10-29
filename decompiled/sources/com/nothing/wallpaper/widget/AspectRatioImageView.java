package com.nothing.wallpaper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p004a3.a;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public final class AspectRatioImageView extends ImageView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f19134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Point f19135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p f19136s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    public final p getOnSizeChanged() {
        return this.f19136s;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar;
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight();
        int i12 = (int) (measuredHeight / this.f19134q);
        setMeasuredDimension(i12, measuredHeight);
        Point point = this.f19135r;
        if ((!(point.x != i12) && !(point.y != measuredHeight)) || (pVar = this.f19136s) == null) {
            return;
        }
        pVar.invoke(Integer.valueOf(i12), Integer.valueOf(measuredHeight));
    }

    public final void setAspectRatio(float f10) {
        this.f19134q = f10;
    }

    public final void setOnSizeChanged(p pVar) {
        this.f19136s = pVar;
    }

    public /* synthetic */ AspectRatioImageView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19134q = 1.0f;
        this.f19135r = new Point(0, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9809x, i10, 0);
        this.f19134q = typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
