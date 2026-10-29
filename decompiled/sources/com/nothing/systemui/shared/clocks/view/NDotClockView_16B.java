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
public final class NDotClockView_16B extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18266L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final float f18267M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Bitmap f18268N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Bitmap f18269O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Bitmap f18270P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Bitmap f18271Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Bitmap f18272R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Bitmap f18273S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Bitmap f18274T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Bitmap f18275U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Bitmap f18276V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Bitmap f18277W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Bitmap f18278a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Bitmap f18279b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Bitmap f18280c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Bitmap f18281d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Bitmap f18282e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Bitmap f18283f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Bitmap f18284g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Bitmap f18285h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Bitmap f18286i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Bitmap f18287j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Paint f18288k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f18289l0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NDotClockView_16B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap J(char c10, boolean z9, boolean z10) {
        switch (c10) {
            case '0':
                return (z10 && z9) ? this.f18269O : this.f18268N;
            case '1':
                return (z10 && z9) ? this.f18271Q : this.f18270P;
            case '2':
                return (z10 && z9) ? this.f18273S : this.f18272R;
            case '3':
                return (z10 && z9) ? this.f18275U : this.f18274T;
            case '4':
                return (z10 && z9) ? this.f18277W : this.f18276V;
            case '5':
                return (z10 && z9) ? this.f18279b0 : this.f18278a0;
            case '6':
                return (z10 && z9) ? this.f18281d0 : this.f18280c0;
            case '7':
                return (z10 && z9) ? this.f18283f0 : this.f18282e0;
            case '8':
                return (z10 && z9) ? this.f18285h0 : this.f18284g0;
            case '9':
                return (z10 && z9) ? this.f18287j0 : this.f18286i0;
            default:
                return null;
        }
    }

    private final void K() {
        if (this.f18289l0) {
            return;
        }
        this.f18289l0 = true;
        Log.d(getTag(), "initResource");
        Trace.beginSection(getTag() + "#initResource");
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2876H);
        this.f18268N = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2877I);
        this.f18269O = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Drawable drawableD3 = p171r0.a.d(getContext(), I2.c.f2878J);
        this.f18270P = drawableD3 != null ? p201u0.b.b(drawableD3, 0, 0, null, 7, null) : null;
        Drawable drawableD4 = p171r0.a.d(getContext(), I2.c.f2879K);
        this.f18271Q = drawableD4 != null ? p201u0.b.b(drawableD4, 0, 0, null, 7, null) : null;
        Drawable drawableD5 = p171r0.a.d(getContext(), I2.c.f2880L);
        this.f18272R = drawableD5 != null ? p201u0.b.b(drawableD5, 0, 0, null, 7, null) : null;
        Drawable drawableD6 = p171r0.a.d(getContext(), I2.c.f2881M);
        this.f18273S = drawableD6 != null ? p201u0.b.b(drawableD6, 0, 0, null, 7, null) : null;
        Drawable drawableD7 = p171r0.a.d(getContext(), I2.c.f2882N);
        this.f18274T = drawableD7 != null ? p201u0.b.b(drawableD7, 0, 0, null, 7, null) : null;
        Drawable drawableD8 = p171r0.a.d(getContext(), I2.c.f2883O);
        this.f18275U = drawableD8 != null ? p201u0.b.b(drawableD8, 0, 0, null, 7, null) : null;
        Drawable drawableD9 = p171r0.a.d(getContext(), I2.c.f2884P);
        this.f18276V = drawableD9 != null ? p201u0.b.b(drawableD9, 0, 0, null, 7, null) : null;
        Drawable drawableD10 = p171r0.a.d(getContext(), I2.c.f2885Q);
        this.f18277W = drawableD10 != null ? p201u0.b.b(drawableD10, 0, 0, null, 7, null) : null;
        Drawable drawableD11 = p171r0.a.d(getContext(), I2.c.f2886R);
        this.f18278a0 = drawableD11 != null ? p201u0.b.b(drawableD11, 0, 0, null, 7, null) : null;
        Drawable drawableD12 = p171r0.a.d(getContext(), I2.c.f2887S);
        this.f18279b0 = drawableD12 != null ? p201u0.b.b(drawableD12, 0, 0, null, 7, null) : null;
        Drawable drawableD13 = p171r0.a.d(getContext(), I2.c.f2888T);
        this.f18280c0 = drawableD13 != null ? p201u0.b.b(drawableD13, 0, 0, null, 7, null) : null;
        Drawable drawableD14 = p171r0.a.d(getContext(), I2.c.f2889U);
        this.f18281d0 = drawableD14 != null ? p201u0.b.b(drawableD14, 0, 0, null, 7, null) : null;
        Drawable drawableD15 = p171r0.a.d(getContext(), I2.c.f2890V);
        this.f18282e0 = drawableD15 != null ? p201u0.b.b(drawableD15, 0, 0, null, 7, null) : null;
        Drawable drawableD16 = p171r0.a.d(getContext(), I2.c.f2891W);
        this.f18283f0 = drawableD16 != null ? p201u0.b.b(drawableD16, 0, 0, null, 7, null) : null;
        Drawable drawableD17 = p171r0.a.d(getContext(), I2.c.f2892X);
        this.f18284g0 = drawableD17 != null ? p201u0.b.b(drawableD17, 0, 0, null, 7, null) : null;
        Drawable drawableD18 = p171r0.a.d(getContext(), I2.c.f2893Y);
        this.f18285h0 = drawableD18 != null ? p201u0.b.b(drawableD18, 0, 0, null, 7, null) : null;
        Drawable drawableD19 = p171r0.a.d(getContext(), I2.c.f2894Z);
        this.f18286i0 = drawableD19 != null ? p201u0.b.b(drawableD19, 0, 0, null, 7, null) : null;
        Drawable drawableD20 = p171r0.a.d(getContext(), I2.c.f2896a0);
        this.f18287j0 = drawableD20 != null ? p201u0.b.b(drawableD20, 0, 0, null, 7, null) : null;
        Trace.endSection();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18266L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        boolean[] zArr;
        float[] fArr;
        int i10 = 2;
        int i11 = 0;
        kotlin.jvm.internal.n.h(canvas, "canvas");
        Trace.beginSection(getTag() + "#drawClock");
        K();
        String timeStr = getTimeStr();
        if (timeStr.length() != 0 && TextUtils.isDigitsOnly(timeStr)) {
            boolean z9 = k() || m();
            Boolean boolL = l();
            boolean zBooleanValue = boolL != null ? boolL.booleanValue() : true;
            int length = timeStr.length();
            if (length == 3) {
                zArr = new boolean[]{false, true, true};
            } else if (length != 4) {
                return;
            } else {
                zArr = new boolean[]{false, false, true, true};
            }
            float dimension = getResources().getDimension(I2.b.f2844i) * getScaleRatio();
            float dimension2 = getResources().getDimension(I2.b.f2833I) * getScaleRatio();
            int length2 = timeStr.length();
            if (length2 == 3) {
                String strSubstring = timeStr.substring(1);
                kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
                if (E8.i.S(strSubstring, "1", false, 2, null)) {
                    dimension2 = dimension;
                }
                fArr = new float[]{dimension, dimension2};
            } else {
                if (length2 != 4) {
                    return;
                }
                String strSubstring2 = timeStr.substring(0, 2);
                kotlin.jvm.internal.n.g(strSubstring2, "substring(...)");
                float f10 = E8.i.S(strSubstring2, "1", false, 2, null) ? dimension : dimension2;
                String strSubstring3 = timeStr.substring(2);
                kotlin.jvm.internal.n.g(strSubstring3, "substring(...)");
                if (E8.i.S(strSubstring3, "1", false, 2, null)) {
                    dimension2 = dimension;
                }
                fArr = new float[]{f10, dimension, dimension2};
            }
            int length3 = timeStr.length();
            float width = 0.0f;
            for (int i12 = 0; i12 < length3; i12++) {
                Bitmap bitmapJ = J(timeStr.charAt(i12), z9, zArr[i12]);
                if (bitmapJ != null) {
                    width += bitmapJ.getWidth() * getScaleRatio();
                    if (i12 < timeStr.length() - 1) {
                        width += fArr[i12];
                    }
                }
            }
            if (width == 0.0f) {
                return;
            }
            if (width > getWidth()) {
                width = getWidth();
            }
            float clockPaddingHorizontal = getClockPaddingHorizontal();
            float f11 = 2.0f;
            if (i()) {
                clockPaddingHorizontal = (getWidth() - width) / 2.0f;
            } else if (getResources().getConfiguration().getLayoutDirection() == 1) {
                clockPaddingHorizontal = (getWidth() - clockPaddingHorizontal) - width;
            }
            float dimension3 = getResources().getDimension(I2.b.f2856u) * getScaleRatio();
            int length4 = timeStr.length();
            while (i11 < length4) {
                float f12 = f11;
                this.f18288k0.setColorFilter(new PorterDuffColorFilter((zBooleanValue || z9) ? -1 : -16777216, PorterDuff.Mode.SRC_IN));
                if (z9) {
                    this.f18288k0.setAlpha(255);
                } else {
                    this.f18288k0.setAlpha(timeStr.length() - i11 <= i10 ? (int) (255 * this.f18267M) : 255);
                }
                Bitmap bitmapJ2 = J(timeStr.charAt(i11), z9, zArr[i11]);
                if (bitmapJ2 != null) {
                    float height = (getHeight() - (bitmapJ2.getHeight() * getScaleRatio())) / f12;
                    if (!n()) {
                        height -= dimension3;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(getScaleRatio(), getScaleRatio());
                    matrix.postTranslate(clockPaddingHorizontal, height);
                    p079h8.A a10 = p079h8.A.f21846a;
                    canvas.drawBitmap(bitmapJ2, matrix, this.f18288k0);
                    clockPaddingHorizontal += bitmapJ2.getWidth() * getScaleRatio();
                    if (i11 < timeStr.length() - 1) {
                        clockPaddingHorizontal += fArr[i11];
                    }
                }
                i11++;
                f11 = f12;
                i10 = 2;
            }
            Trace.endSection();
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void z() {
        this.f18268N = null;
        this.f18270P = null;
        this.f18272R = null;
        this.f18274T = null;
        this.f18276V = null;
        this.f18278a0 = null;
        this.f18280c0 = null;
        this.f18282e0 = null;
        this.f18284g0 = null;
        this.f18286i0 = null;
        this.f18269O = null;
        this.f18271Q = null;
        this.f18273S = null;
        this.f18275U = null;
        this.f18277W = null;
        this.f18279b0 = null;
        this.f18281d0 = null;
        this.f18283f0 = null;
        this.f18285h0 = null;
        this.f18287j0 = null;
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2876H);
        this.f18268N = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2877I);
        this.f18269O = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Drawable drawableD3 = p171r0.a.d(getContext(), I2.c.f2878J);
        this.f18270P = drawableD3 != null ? p201u0.b.b(drawableD3, 0, 0, null, 7, null) : null;
        Drawable drawableD4 = p171r0.a.d(getContext(), I2.c.f2879K);
        this.f18271Q = drawableD4 != null ? p201u0.b.b(drawableD4, 0, 0, null, 7, null) : null;
        Drawable drawableD5 = p171r0.a.d(getContext(), I2.c.f2880L);
        this.f18272R = drawableD5 != null ? p201u0.b.b(drawableD5, 0, 0, null, 7, null) : null;
        Drawable drawableD6 = p171r0.a.d(getContext(), I2.c.f2881M);
        this.f18273S = drawableD6 != null ? p201u0.b.b(drawableD6, 0, 0, null, 7, null) : null;
        Drawable drawableD7 = p171r0.a.d(getContext(), I2.c.f2882N);
        this.f18274T = drawableD7 != null ? p201u0.b.b(drawableD7, 0, 0, null, 7, null) : null;
        Drawable drawableD8 = p171r0.a.d(getContext(), I2.c.f2883O);
        this.f18275U = drawableD8 != null ? p201u0.b.b(drawableD8, 0, 0, null, 7, null) : null;
        Drawable drawableD9 = p171r0.a.d(getContext(), I2.c.f2884P);
        this.f18276V = drawableD9 != null ? p201u0.b.b(drawableD9, 0, 0, null, 7, null) : null;
        Drawable drawableD10 = p171r0.a.d(getContext(), I2.c.f2885Q);
        this.f18277W = drawableD10 != null ? p201u0.b.b(drawableD10, 0, 0, null, 7, null) : null;
        Drawable drawableD11 = p171r0.a.d(getContext(), I2.c.f2886R);
        this.f18278a0 = drawableD11 != null ? p201u0.b.b(drawableD11, 0, 0, null, 7, null) : null;
        Drawable drawableD12 = p171r0.a.d(getContext(), I2.c.f2887S);
        this.f18279b0 = drawableD12 != null ? p201u0.b.b(drawableD12, 0, 0, null, 7, null) : null;
        Drawable drawableD13 = p171r0.a.d(getContext(), I2.c.f2888T);
        this.f18280c0 = drawableD13 != null ? p201u0.b.b(drawableD13, 0, 0, null, 7, null) : null;
        Drawable drawableD14 = p171r0.a.d(getContext(), I2.c.f2889U);
        this.f18281d0 = drawableD14 != null ? p201u0.b.b(drawableD14, 0, 0, null, 7, null) : null;
        Drawable drawableD15 = p171r0.a.d(getContext(), I2.c.f2890V);
        this.f18282e0 = drawableD15 != null ? p201u0.b.b(drawableD15, 0, 0, null, 7, null) : null;
        Drawable drawableD16 = p171r0.a.d(getContext(), I2.c.f2891W);
        this.f18283f0 = drawableD16 != null ? p201u0.b.b(drawableD16, 0, 0, null, 7, null) : null;
        Drawable drawableD17 = p171r0.a.d(getContext(), I2.c.f2892X);
        this.f18284g0 = drawableD17 != null ? p201u0.b.b(drawableD17, 0, 0, null, 7, null) : null;
        Drawable drawableD18 = p171r0.a.d(getContext(), I2.c.f2893Y);
        this.f18285h0 = drawableD18 != null ? p201u0.b.b(drawableD18, 0, 0, null, 7, null) : null;
        Drawable drawableD19 = p171r0.a.d(getContext(), I2.c.f2894Z);
        this.f18286i0 = drawableD19 != null ? p201u0.b.b(drawableD19, 0, 0, null, 7, null) : null;
        Drawable drawableD20 = p171r0.a.d(getContext(), I2.c.f2896a0);
        this.f18287j0 = drawableD20 != null ? p201u0.b.b(drawableD20, 0, 0, null, 7, null) : null;
    }

    public /* synthetic */ NDotClockView_16B(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NDotClockView_16B(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18266L = "NDotClockView";
        this.f18267M = 0.6f;
        this.f18288k0 = new Paint();
    }
}
