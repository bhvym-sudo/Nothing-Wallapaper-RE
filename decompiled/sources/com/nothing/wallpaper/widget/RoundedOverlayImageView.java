package com.nothing.wallpaper.widget;

import B8.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p004a3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class RoundedOverlayImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f19179q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19180r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f19181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f19182t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f19183u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f19184v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f19185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f19186x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedOverlayImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final float c(float f10) {
        return f10 * getContext().getResources().getDisplayMetrics().density;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        int iSave = canvas.save();
        canvas.clipPath(this.f19182t);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fE = h.e(Math.min(this.f19181s, (Math.min(width, height) / 2.0f) - 1.0f), 0.0f);
        this.f19183u.set(0.0f, 0.0f, width, height);
        this.f19184v.set(fE, fE, width - fE, height - fE);
        if (this.f19184v.width() > 0.0f && this.f19184v.height() > 0.0f) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null);
            RectF rectF = this.f19183u;
            float f10 = this.f19179q;
            canvas.drawRoundRect(rectF, f10, f10, this.f19185w);
            float fMax = Math.max(0.0f, this.f19179q - fE);
            canvas.drawRoundRect(this.f19184v, fMax, fMax, this.f19186x);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f19180r);
        paint.setStrokeWidth(Math.max(1.0f, this.f19181s));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        RectF rectF2 = new RectF(strokeWidth, strokeWidth, width - strokeWidth, height - strokeWidth);
        float fMax2 = Math.max(0.0f, this.f19179q - strokeWidth);
        canvas.drawRoundRect(rectF2, fMax2, fMax2, paint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f19182t.reset();
        this.f19183u.set(0.0f, 0.0f, i10, i11);
        Path path = this.f19182t;
        RectF rectF = this.f19183u;
        float f10 = this.f19179q;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.f19182t.close();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    public final void setCornerRadiusDp(float f10) {
        this.f19179q = c(f10);
        invalidate();
    }

    public final void setCornerRadiusPx(float f10) {
        this.f19179q = f10;
        invalidate();
    }

    public final void setOverlayColor(int i10) {
        this.f19180r = i10;
        this.f19185w.setColor(i10);
        invalidate();
    }

    public final void setOverlayThicknessDp(float f10) {
        this.f19181s = c(f10);
        invalidate();
    }

    public final void setOverlayThicknessPx(float f10) {
        this.f19181s = f10;
        invalidate();
    }

    public /* synthetic */ RoundedOverlayImageView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedOverlayImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19179q = c(12.0f);
        this.f19180r = Color.parseColor("#80000000");
        this.f19181s = c(24.0f);
        this.f19182t = new Path();
        this.f19183u = new RectF();
        this.f19184v = new RectF();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.f19185w = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        this.f19186x = paint2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9760k2);
            n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f19179q = typedArrayObtainStyledAttributes.getDimension(0, this.f19179q);
            this.f19180r = typedArrayObtainStyledAttributes.getColor(1, this.f19180r);
            this.f19181s = typedArrayObtainStyledAttributes.getDimension(2, this.f19181s);
            typedArrayObtainStyledAttributes.recycle();
        }
        paint.setColor(this.f19180r);
        setLayerType(1, null);
    }
}
