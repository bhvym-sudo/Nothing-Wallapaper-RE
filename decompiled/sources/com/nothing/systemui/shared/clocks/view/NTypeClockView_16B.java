package com.nothing.systemui.shared.clocks.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class NTypeClockView_16B extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18330L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Bitmap f18331M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Bitmap f18332N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Bitmap f18333O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Bitmap f18334P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Bitmap f18335Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Bitmap f18336R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Bitmap f18337S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Bitmap f18338T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Bitmap f18339U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Bitmap f18340V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Paint f18341W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f18342a0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NTypeClockView_16B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap J(int i10) {
        Drawable drawableD = p171r0.a.d(getContext(), i10);
        Bitmap bitmapB = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        if (bitmapB != null && bitmapB.getWidth() != 0) {
            return bitmapB;
        }
        Log.w(getTag(), "null or invalid drawable bitmap for id=" + i10 + ", width: " + (bitmapB != null ? Integer.valueOf(bitmapB.getWidth()) : null));
        return bitmapB;
    }

    private final Bitmap K(char c10) {
        switch (c10) {
            case '0':
                return this.f18331M;
            case '1':
                return this.f18332N;
            case '2':
                return this.f18333O;
            case '3':
                return this.f18334P;
            case '4':
                return this.f18335Q;
            case '5':
                return this.f18336R;
            case '6':
                return this.f18337S;
            case '7':
                return this.f18338T;
            case '8':
                return this.f18339U;
            case '9':
                return this.f18340V;
            default:
                return null;
        }
    }

    private final float L(String str, int i10) {
        float f10;
        int length = str.length();
        String strSubstring = "";
        if (length != 3) {
            if (length == 4 && (i10 == 0 || i10 == 2)) {
                strSubstring = str.substring(i10, i10 + 2);
                kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
            }
        } else if (i10 == 1) {
            strSubstring = str.substring(i10);
            kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
        }
        float scaleRatio = (-getResources().getDimension(I2.b.f2834J)) * getScaleRatio();
        int iHashCode = strSubstring.hashCode();
        if (iHashCode != 1571) {
            if (iHashCode == 1574) {
                if (strSubstring.equals("17")) {
                    return scaleRatio;
                }
                return 0.0f;
            }
            if (iHashCode != 1576 || !strSubstring.equals("19")) {
                return 0.0f;
            }
            f10 = 2;
        } else {
            if (!strSubstring.equals("14")) {
                return 0.0f;
            }
            f10 = 6;
        }
        return scaleRatio * f10;
    }

    private final void M() {
        if (this.f18342a0) {
            return;
        }
        this.f18342a0 = true;
        Log.d(getTag(), "initResource");
        z();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18330L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        int i10;
        int i11;
        boolean z9;
        Canvas canvas2 = canvas;
        boolean z10 = true;
        kotlin.jvm.internal.n.h(canvas2, "canvas");
        M();
        String timeStr = getTimeStr();
        Log.d(getTag(), "drawClock, time: " + timeStr + ", scaleRatio: " + getScaleRatio());
        if (timeStr.length() == 0 || !TextUtils.isDigitsOnly(timeStr)) {
            Log.w(getTag(), "drawClock with invalide time: " + timeStr);
            return;
        }
        float dimension = getResources().getDimension(I2.b.f2858w) * getScaleRatio();
        float dimension2 = getResources().getDimension(I2.b.f2857v) * getScaleRatio();
        float dimension3 = getResources().getDimension(I2.b.f2853r) * getScaleRatio();
        float dimension4 = getResources().getDimension(I2.b.f2843h) * getScaleRatio();
        int length = timeStr.length();
        int i12 = 0;
        float width = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            Bitmap bitmapK = K(timeStr.charAt(i13));
            if (bitmapK != null) {
                width = width + (bitmapK.getWidth() * getScaleRatio()) + L(timeStr, i13);
                if (timeStr.length() - i13 == 3) {
                    width += 2 * dimension3;
                }
            }
        }
        if (width == 0.0f) {
            Log.w(getTag(), "drawClock with clockWidth==0");
            return;
        }
        if (width > getWidth()) {
            width = getWidth();
        }
        this.f18341W.setColorFilter(new PorterDuffColorFilter((!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : -16777216, PorterDuff.Mode.SRC_IN));
        float clockPaddingHorizontal = getClockPaddingHorizontal();
        float f10 = 2.0f;
        if (i()) {
            clockPaddingHorizontal = (getWidth() - width) / 2.0f;
        } else if (getResources().getConfiguration().getLayoutDirection() == 1) {
            clockPaddingHorizontal = (getWidth() - clockPaddingHorizontal) - width;
        }
        int length2 = timeStr.length();
        while (i12 < length2) {
            Bitmap bitmapK2 = K(timeStr.charAt(i12));
            if (bitmapK2 != null) {
                z9 = z10;
                float height = (getHeight() - (bitmapK2.getHeight() * getScaleRatio())) / f10;
                if (!n()) {
                    height -= dimension4;
                }
                Matrix matrix = new Matrix();
                matrix.postScale(getScaleRatio(), getScaleRatio());
                matrix.postTranslate(clockPaddingHorizontal, height);
                p079h8.A a10 = p079h8.A.f21846a;
                canvas2.drawBitmap(bitmapK2, matrix, this.f18341W);
                clockPaddingHorizontal = clockPaddingHorizontal + (bitmapK2.getWidth() * getScaleRatio()) + L(timeStr, i12);
                if (timeStr.length() - i12 == 3) {
                    float f11 = clockPaddingHorizontal + dimension3;
                    float height2 = bitmapK2.getHeight() * getScaleRatio();
                    float f12 = 2;
                    float f13 = dimension / f12;
                    float f14 = height + ((((height2 / f12) + dimension4) - (dimension2 / f12)) - f13);
                    float f15 = f11 - f13;
                    int i14 = length2;
                    float f16 = f11 + f13;
                    i10 = i12;
                    i11 = i14;
                    canvas2.drawOval(f15, f14 - f13, f16, f14 + f13, this.f18341W);
                    float f17 = f14 + dimension2 + dimension;
                    canvas.drawOval(f15, f17 - f13, f16, f17 + f13, this.f18341W);
                    clockPaddingHorizontal = f11 + dimension3;
                } else {
                    i10 = i12;
                    i11 = length2;
                }
            } else {
                i10 = i12;
                i11 = length2;
                z9 = z10;
            }
            i12 = i10 + 1;
            canvas2 = canvas;
            z10 = z9;
            length2 = i11;
            f10 = 2.0f;
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void z() {
        this.f18331M = null;
        this.f18332N = null;
        this.f18333O = null;
        this.f18334P = null;
        this.f18335Q = null;
        this.f18336R = null;
        this.f18337S = null;
        this.f18338T = null;
        this.f18339U = null;
        this.f18340V = null;
        this.f18331M = J(I2.c.f2900c0);
        this.f18332N = J(I2.c.f2904e0);
        this.f18333O = J(I2.c.f2908g0);
        this.f18334P = J(I2.c.f2912i0);
        this.f18335Q = J(I2.c.f2916k0);
        this.f18336R = J(I2.c.f2920m0);
        this.f18337S = J(I2.c.f2924o0);
        this.f18338T = J(I2.c.f2928q0);
        this.f18339U = J(I2.c.f2932s0);
        this.f18340V = J(I2.c.f2936u0);
    }

    public /* synthetic */ NTypeClockView_16B(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTypeClockView_16B(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18330L = "NTypeClockView";
        this.f18341W = new Paint();
    }
}
