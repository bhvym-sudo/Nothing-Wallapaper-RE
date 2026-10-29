package com.nothing.wallpaper.picker.creative.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p004a3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskHollowView extends View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f18481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f18482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f18484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18486v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18487w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskHollowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
        Paint paint = new Paint();
        this.f18481q = paint;
        this.f18482r = new RectF();
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f9688U0);
        n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f18483s = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f18484t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f18486v = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f18487w = typedArrayObtainStyledAttributes.getColor(3, getResources().getColor(R.color.nt_list_bg_color));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void b() {
        float measuredWidth = (getMeasuredWidth() - this.f18483s) / 2.0f;
        int i10 = this.f18485u;
        float measuredHeight = i10 > 0 ? i10 : (getMeasuredHeight() - this.f18484t) / 2.0f;
        this.f18482r.set(measuredWidth, measuredHeight, this.f18483s + measuredWidth, this.f18484t + measuredHeight);
    }

    public final void c(int i10, int i11) {
        this.f18483s = i10;
        this.f18484t = i11;
        b();
        invalidate();
    }

    public final int getHollowMarginTop() {
        return this.f18485u;
    }

    public final int getHollowRadius() {
        return this.f18486v;
    }

    public final int getMaskColor() {
        return this.f18487w;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        canvas.drawColor(this.f18487w);
        this.f18481q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        RectF rectF = this.f18482r;
        int i10 = this.f18486v;
        canvas.drawRoundRect(rectF, i10, i10, this.f18481q);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b();
    }

    public final void setHollowMarginTop(int i10) {
        this.f18485u = i10;
        b();
        invalidate();
    }

    public final void setHollowRadius(int i10) {
        this.f18486v = i10;
    }

    public final void setMaskColor(int i10) {
        this.f18487w = i10;
    }
}
