package com.nothing.systemui.shared.clocks.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class PolylineClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18357L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Bitmap f18358M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Bitmap f18359N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Bitmap f18360O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Bitmap f18361P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Bitmap f18362Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Bitmap f18363R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Bitmap f18364S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Bitmap f18365T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Bitmap f18366U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Bitmap f18367V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Paint f18368W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f18369a0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolylineClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap J(char c10) {
        switch (c10) {
            case '0':
                return this.f18358M;
            case '1':
                return this.f18359N;
            case '2':
                return this.f18360O;
            case '3':
                return this.f18361P;
            case '4':
                return this.f18362Q;
            case '5':
                return this.f18363R;
            case '6':
                return this.f18364S;
            case '7':
                return this.f18365T;
            case '8':
                return this.f18366U;
            case '9':
                return this.f18367V;
            default:
                return null;
        }
    }

    private final void K() {
        if (this.f18369a0) {
            return;
        }
        this.f18369a0 = true;
        Log.d(getTag(), "initResource");
        Trace.beginSection(getTag() + "#initResource");
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2938v0);
        this.f18358M = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2940w0);
        this.f18359N = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Drawable drawableD3 = p171r0.a.d(getContext(), I2.c.f2942x0);
        this.f18360O = drawableD3 != null ? p201u0.b.b(drawableD3, 0, 0, null, 7, null) : null;
        Drawable drawableD4 = p171r0.a.d(getContext(), I2.c.f2944y0);
        this.f18361P = drawableD4 != null ? p201u0.b.b(drawableD4, 0, 0, null, 7, null) : null;
        Drawable drawableD5 = p171r0.a.d(getContext(), I2.c.f2946z0);
        this.f18362Q = drawableD5 != null ? p201u0.b.b(drawableD5, 0, 0, null, 7, null) : null;
        Drawable drawableD6 = p171r0.a.d(getContext(), I2.c.f2863A0);
        this.f18363R = drawableD6 != null ? p201u0.b.b(drawableD6, 0, 0, null, 7, null) : null;
        Drawable drawableD7 = p171r0.a.d(getContext(), I2.c.f2865B0);
        this.f18364S = drawableD7 != null ? p201u0.b.b(drawableD7, 0, 0, null, 7, null) : null;
        Drawable drawableD8 = p171r0.a.d(getContext(), I2.c.f2867C0);
        this.f18365T = drawableD8 != null ? p201u0.b.b(drawableD8, 0, 0, null, 7, null) : null;
        Drawable drawableD9 = p171r0.a.d(getContext(), I2.c.f2869D0);
        this.f18366U = drawableD9 != null ? p201u0.b.b(drawableD9, 0, 0, null, 7, null) : null;
        Drawable drawableD10 = p171r0.a.d(getContext(), I2.c.f2871E0);
        this.f18367V = drawableD10 != null ? p201u0.b.b(drawableD10, 0, 0, null, 7, null) : null;
        Trace.endSection();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18357L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        K();
        String timeStr = getTimeStr();
        if (timeStr.length() != 0 && TextUtils.isDigitsOnly(timeStr)) {
            float dimension = getResources().getDimension(I2.b.f2843h) * getScaleRatio();
            float dimension2 = getResources().getDimension(I2.b.f2835K) * getScaleRatio();
            int length = timeStr.length();
            float width = 0.0f;
            for (int i10 = 0; i10 < length; i10++) {
                Bitmap bitmapJ = J(timeStr.charAt(i10));
                if (bitmapJ != null) {
                    width = width + (bitmapJ.getWidth() * getScaleRatio()) + dimension2;
                }
            }
            if (width == 0.0f) {
                return;
            }
            if (width > getWidth()) {
                width = getWidth();
            }
            this.f18368W.setColorFilter(new PorterDuffColorFilter((!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : -16777216, PorterDuff.Mode.SRC_IN));
            float clockPaddingHorizontal = getClockPaddingHorizontal();
            if (i()) {
                clockPaddingHorizontal = (getWidth() - width) / 2.0f;
            } else if (getResources().getConfiguration().getLayoutDirection() == 1) {
                clockPaddingHorizontal = ((getWidth() - clockPaddingHorizontal) - width) - ((timeStr.length() - 1) * dimension2);
            }
            int length2 = timeStr.length();
            for (int i11 = 0; i11 < length2; i11++) {
                Bitmap bitmapJ2 = J(timeStr.charAt(i11));
                if (bitmapJ2 != null) {
                    float height = (getHeight() - (bitmapJ2.getHeight() * getScaleRatio())) / 2.0f;
                    if (!n()) {
                        height -= dimension;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(getScaleRatio(), getScaleRatio());
                    matrix.postTranslate(clockPaddingHorizontal, height);
                    p079h8.A a10 = p079h8.A.f21846a;
                    canvas.drawBitmap(bitmapJ2, matrix, this.f18368W);
                    clockPaddingHorizontal += (bitmapJ2.getWidth() * getScaleRatio()) + dimension2;
                }
            }
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void z() {
        this.f18358M = null;
        this.f18359N = null;
        this.f18360O = null;
        this.f18361P = null;
        this.f18362Q = null;
        this.f18363R = null;
        this.f18364S = null;
        this.f18365T = null;
        this.f18366U = null;
        this.f18367V = null;
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2938v0);
        this.f18358M = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2940w0);
        this.f18359N = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Drawable drawableD3 = p171r0.a.d(getContext(), I2.c.f2942x0);
        this.f18360O = drawableD3 != null ? p201u0.b.b(drawableD3, 0, 0, null, 7, null) : null;
        Drawable drawableD4 = p171r0.a.d(getContext(), I2.c.f2944y0);
        this.f18361P = drawableD4 != null ? p201u0.b.b(drawableD4, 0, 0, null, 7, null) : null;
        Drawable drawableD5 = p171r0.a.d(getContext(), I2.c.f2946z0);
        this.f18362Q = drawableD5 != null ? p201u0.b.b(drawableD5, 0, 0, null, 7, null) : null;
        Drawable drawableD6 = p171r0.a.d(getContext(), I2.c.f2863A0);
        this.f18363R = drawableD6 != null ? p201u0.b.b(drawableD6, 0, 0, null, 7, null) : null;
        Drawable drawableD7 = p171r0.a.d(getContext(), I2.c.f2865B0);
        this.f18364S = drawableD7 != null ? p201u0.b.b(drawableD7, 0, 0, null, 7, null) : null;
        Drawable drawableD8 = p171r0.a.d(getContext(), I2.c.f2867C0);
        this.f18365T = drawableD8 != null ? p201u0.b.b(drawableD8, 0, 0, null, 7, null) : null;
        Drawable drawableD9 = p171r0.a.d(getContext(), I2.c.f2869D0);
        this.f18366U = drawableD9 != null ? p201u0.b.b(drawableD9, 0, 0, null, 7, null) : null;
        Drawable drawableD10 = p171r0.a.d(getContext(), I2.c.f2871E0);
        this.f18367V = drawableD10 != null ? p201u0.b.b(drawableD10, 0, 0, null, 7, null) : null;
    }

    public /* synthetic */ PolylineClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylineClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18357L = "PolylineClockView";
        this.f18368W = new Paint();
    }
}
