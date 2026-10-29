package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class ClipCardView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Path f18762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f18763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f18764s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        canvas.clipPath(this.f18762q);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float f10 = this.f18764s;
        RectF rectF = new RectF(f10, f10, getMeasuredWidth() - this.f18764s, getMeasuredHeight() - this.f18764s);
        Path path = this.f18762q;
        float f11 = this.f18763r;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    public /* synthetic */ ClipCardView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipCardView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18762q = new Path();
        this.f18763r = getResources().getDimension(R.dimen.widget_group_radius2);
        this.f18764s = getResources().getDimension(R.dimen.widget_group_stroke_width);
    }
}
