package com.nothing.cardwidget.battery.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryAODLevelDrawable extends Drawable {
    private RectF innerBoundsF;
    private Paint paint = new Paint(1);
    private float progressLevel = 0.6f;
    private final float startAngle;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        n.h(canvas, "canvas");
        canvas.rotate(-90.0f, getBounds().centerX(), getBounds().centerY());
        this.paint.setStyle(Paint.Style.STROKE);
        float f10 = this.startAngle;
        float f11 = f10 + (this.progressLevel * 360);
        RectF rectF = this.innerBoundsF;
        if (rectF != null) {
            canvas.drawArc(rectF, f10, f11, false, this.paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        n.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        int iMin = Math.min(bounds.width(), bounds.height());
        float fWidth = (bounds.width() - iMin) / 2.0f;
        float fHeight = (bounds.height() - iMin) / 2.0f;
        float f10 = iMin;
        this.innerBoundsF = new RectF(fWidth, fHeight, fWidth + f10, f10 + fHeight);
        float strokeWidth = (this.paint.getStrokeWidth() / 2.0f) + 1.0f;
        RectF rectF = this.innerBoundsF;
        if (rectF != null) {
            rectF.inset(strokeWidth, strokeWidth);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
    }

    public final void setBatteryLevel(int i10) {
        this.progressLevel = i10 / 100.0f;
        invalidateSelf();
    }

    public final void setBorderWidth(float f10, DisplayMetrics dm) {
        n.h(dm, "dm");
        this.paint.setStrokeWidth(f10 * dm.density);
    }

    public final void setColor(int i10) {
        this.paint.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
