package com.nothing.cardwidget.battery.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryLevelDrawable extends Drawable {
    private RectF boundsF;
    private final Paint paint;
    private float progressLevel;
    private final float startAngle;

    public BatteryLevelDrawable() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.startAngle = 270.0f;
        this.progressLevel = 0.6f;
    }

    private final RectF calculateBounds(Rect rect) {
        float fMin = Math.min(rect.width(), rect.height());
        float fExactCenterX = rect.exactCenterX();
        float fExactCenterY = rect.exactCenterY();
        float f10 = fMin / 2.0f;
        RectF rectF = new RectF(fExactCenterX - f10, fExactCenterY - f10, fExactCenterX + f10, fExactCenterY + f10);
        float strokeWidth = this.paint.getStrokeWidth() / 2.0f;
        rectF.inset(strokeWidth, strokeWidth);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        n.h(canvas, "canvas");
        RectF rectF = this.boundsF;
        if (rectF == null) {
            return;
        }
        canvas.drawArc(rectF, this.startAngle, this.progressLevel * 360.0f, true, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        n.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.boundsF = calculateBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
    }

    public final void setBatteryLevel(int i10) {
        this.progressLevel = i10 / 100.0f;
        invalidateSelf();
    }

    public final void setColor(int i10) {
        this.paint.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
