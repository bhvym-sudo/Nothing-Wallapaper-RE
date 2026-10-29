package com.nothing.cardwidget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class RoundCornersRelativeLayout extends RelativeLayout {
    private final AttributeSet attrs;
    private Canvas roundCanvas;
    private Float roundRadius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornersRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    private final boolean clipRoundPath(Float f10) {
        if (f10 == null) {
            return false;
        }
        float fFloatValue = f10.floatValue();
        Canvas canvas = this.roundCanvas;
        if (canvas == null) {
            return false;
        }
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), fFloatValue, fFloatValue, Path.Direction.CW);
        canvas.clipPath(path);
        return true;
    }

    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        super.onDraw(canvas);
        this.roundCanvas = canvas;
        clipRoundPath(this.roundRadius);
    }

    public final void setCornersRadius(float f10) {
        if (f10 < 0.0f) {
            return;
        }
        this.roundRadius = Float.valueOf(f10);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornersRelativeLayout(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    public /* synthetic */ RoundCornersRelativeLayout(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornersRelativeLayout(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        n.h(context, "context");
        n.h(attrs, "attrs");
        this.attrs = attrs;
        setWillNotDraw(false);
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attrs, N.e(v.a(Integer.valueOf(c0120a.c(context, "layoutCornerRadius")), Integer.valueOf(R.attr.layoutCornerRadius)))).entrySet()) {
            if (((Number) entry.getKey()).intValue() == R.attr.layoutCornerRadius) {
                this.roundRadius = Float.valueOf(J5.a.f3535a.h(context, this.attrs, ((Number) entry.getValue()).intValue(), -1.0f));
            }
        }
    }
}
