package com.nothing.systemui.shared.clocks.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
public final class LondonUGClockView_16B extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18229L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Bitmap f18230M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Bitmap f18231N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Bitmap f18232O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Bitmap f18233P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Bitmap f18234Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Bitmap f18235R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Bitmap f18236S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Bitmap f18237T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Bitmap f18238U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Bitmap f18239V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Paint f18240W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f18241a0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LondonUGClockView_16B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap J(char c10) {
        switch (c10) {
            case '0':
                return this.f18230M;
            case '1':
                return this.f18231N;
            case '2':
                return this.f18232O;
            case '3':
                return this.f18233P;
            case '4':
                return this.f18234Q;
            case '5':
                return this.f18235R;
            case '6':
                return this.f18236S;
            case '7':
                return this.f18237T;
            case '8':
                return this.f18238U;
            case '9':
                return this.f18239V;
            default:
                return null;
        }
    }

    private final void K() {
        if (this.f18241a0) {
            return;
        }
        this.f18241a0 = true;
        Log.d(getTag(), "initResource");
        Trace.beginSection(getTag() + "#initResource");
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2941x);
        this.f18230M = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2943y);
        this.f18231N = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Drawable drawableD3 = p171r0.a.d(getContext(), I2.c.f2945z);
        this.f18232O = drawableD3 != null ? p201u0.b.b(drawableD3, 0, 0, null, 7, null) : null;
        Drawable drawableD4 = p171r0.a.d(getContext(), I2.c.f2862A);
        this.f18233P = drawableD4 != null ? p201u0.b.b(drawableD4, 0, 0, null, 7, null) : null;
        Drawable drawableD5 = p171r0.a.d(getContext(), I2.c.f2864B);
        this.f18234Q = drawableD5 != null ? p201u0.b.b(drawableD5, 0, 0, null, 7, null) : null;
        Drawable drawableD6 = p171r0.a.d(getContext(), I2.c.f2866C);
        this.f18235R = drawableD6 != null ? p201u0.b.b(drawableD6, 0, 0, null, 7, null) : null;
        Drawable drawableD7 = p171r0.a.d(getContext(), I2.c.f2868D);
        this.f18236S = drawableD7 != null ? p201u0.b.b(drawableD7, 0, 0, null, 7, null) : null;
        Drawable drawableD8 = p171r0.a.d(getContext(), I2.c.f2870E);
        this.f18237T = drawableD8 != null ? p201u0.b.b(drawableD8, 0, 0, null, 7, null) : null;
        Drawable drawableD9 = p171r0.a.d(getContext(), I2.c.f2872F);
        this.f18238U = drawableD9 != null ? p201u0.b.b(drawableD9, 0, 0, null, 7, null) : null;
        Drawable drawableD10 = p171r0.a.d(getContext(), I2.c.f2874G);
        this.f18239V = drawableD10 != null ? p201u0.b.b(drawableD10, 0, 0, null, 7, null) : null;
        Trace.endSection();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18229L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        kotlin.jvm.internal.n.h(canvas, "canvas");
        K();
        String timeStr = getTimeStr();
        if (timeStr.length() != 0 && TextUtils.isDigitsOnly(timeStr)) {
            float dimension = getResources().getDimension(I2.b.f2844i) * getScaleRatio();
            float scaleRatio = (getScaleRatio() * 58) / 28;
            int length = timeStr.length();
            float width = 0.0f;
            for (int i10 = 0; i10 < length; i10++) {
                Bitmap bitmapJ = J(timeStr.charAt(i10));
                if (bitmapJ != null) {
                    width += bitmapJ.getWidth() * scaleRatio;
                    if (i10 < timeStr.length() - 1) {
                        width += dimension;
                    }
                }
            }
            if (width == 0.0f) {
                return;
            }
            if (width > getWidth()) {
                width = getWidth();
            }
            this.f18240W.setColorFilter(new PorterDuffColorFilter((!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : Color.argb(p239x8.a.b(153.0f), 0, 0, 0), PorterDuff.Mode.SRC_IN));
            float clockPaddingHorizontal = getClockPaddingHorizontal();
            if (i()) {
                clockPaddingHorizontal = (getWidth() - width) / 2.0f;
            } else if (getResources().getConfiguration().getLayoutDirection() == 1) {
                clockPaddingHorizontal = (getWidth() - clockPaddingHorizontal) - width;
            }
            int length2 = timeStr.length();
            for (int i11 = 0; i11 < length2; i11++) {
                Bitmap bitmapJ2 = J(timeStr.charAt(i11));
                if (bitmapJ2 != null) {
                    float height = (getHeight() - (bitmapJ2.getHeight() * scaleRatio)) / 2.0f;
                    Matrix matrix = new Matrix();
                    matrix.postScale(scaleRatio, scaleRatio);
                    matrix.postTranslate(clockPaddingHorizontal, height);
                    p079h8.A a10 = p079h8.A.f21846a;
                    canvas.drawBitmap(bitmapJ2, matrix, this.f18240W);
                    clockPaddingHorizontal += bitmapJ2.getWidth() * scaleRatio;
                    if (i11 < timeStr.length() - 1) {
                        clockPaddingHorizontal += dimension;
                    }
                }
            }
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void z() {
        this.f18230M = null;
        this.f18231N = null;
        this.f18232O = null;
        this.f18233P = null;
        this.f18234Q = null;
        this.f18235R = null;
        this.f18236S = null;
        this.f18237T = null;
        this.f18238U = null;
        this.f18239V = null;
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2941x);
        this.f18230M = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2943y);
        this.f18231N = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Drawable drawableD3 = p171r0.a.d(getContext(), I2.c.f2945z);
        this.f18232O = drawableD3 != null ? p201u0.b.b(drawableD3, 0, 0, null, 7, null) : null;
        Drawable drawableD4 = p171r0.a.d(getContext(), I2.c.f2862A);
        this.f18233P = drawableD4 != null ? p201u0.b.b(drawableD4, 0, 0, null, 7, null) : null;
        Drawable drawableD5 = p171r0.a.d(getContext(), I2.c.f2864B);
        this.f18234Q = drawableD5 != null ? p201u0.b.b(drawableD5, 0, 0, null, 7, null) : null;
        Drawable drawableD6 = p171r0.a.d(getContext(), I2.c.f2866C);
        this.f18235R = drawableD6 != null ? p201u0.b.b(drawableD6, 0, 0, null, 7, null) : null;
        Drawable drawableD7 = p171r0.a.d(getContext(), I2.c.f2868D);
        this.f18236S = drawableD7 != null ? p201u0.b.b(drawableD7, 0, 0, null, 7, null) : null;
        Drawable drawableD8 = p171r0.a.d(getContext(), I2.c.f2870E);
        this.f18237T = drawableD8 != null ? p201u0.b.b(drawableD8, 0, 0, null, 7, null) : null;
        Drawable drawableD9 = p171r0.a.d(getContext(), I2.c.f2872F);
        this.f18238U = drawableD9 != null ? p201u0.b.b(drawableD9, 0, 0, null, 7, null) : null;
        Drawable drawableD10 = p171r0.a.d(getContext(), I2.c.f2874G);
        this.f18239V = drawableD10 != null ? p201u0.b.b(drawableD10, 0, 0, null, 7, null) : null;
    }

    public /* synthetic */ LondonUGClockView_16B(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LondonUGClockView_16B(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18229L = "LondonUGClockView";
        this.f18240W = new Paint();
    }
}
