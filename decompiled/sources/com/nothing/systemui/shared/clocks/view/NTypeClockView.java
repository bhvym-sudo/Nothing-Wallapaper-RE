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
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class NTypeClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18318L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p079h8.h f18319M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p079h8.h f18320N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final p079h8.h f18321O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p079h8.h f18322P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p079h8.h f18323Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final p079h8.h f18324R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final p079h8.h f18325S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final p079h8.h f18326T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p079h8.h f18327U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p079h8.h f18328V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final Paint f18329W;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NTypeClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap T(char c10) {
        switch (c10) {
            case '0':
                return getNum0();
            case '1':
                return getNum1();
            case '2':
                return getNum2();
            case '3':
                return getNum3();
            case '4':
                return getNum4();
            case '5':
                return getNum5();
            case '6':
                return getNum6();
            case '7':
                return getNum7();
            case '8':
                return getNum8();
            case '9':
                return getNum9();
            default:
                return null;
        }
    }

    private final float U(String str, int i10) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap V(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2898b0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap W(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2902d0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap X(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2906f0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap Y(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2910h0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap Z(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2914j0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap a0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2918l0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap b0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2922n0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap c0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2926p0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap d0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2930r0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap e0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2934t0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    private final Bitmap getNum0() {
        return (Bitmap) this.f18319M.getValue();
    }

    private final Bitmap getNum1() {
        return (Bitmap) this.f18320N.getValue();
    }

    private final Bitmap getNum2() {
        return (Bitmap) this.f18321O.getValue();
    }

    private final Bitmap getNum3() {
        return (Bitmap) this.f18322P.getValue();
    }

    private final Bitmap getNum4() {
        return (Bitmap) this.f18323Q.getValue();
    }

    private final Bitmap getNum5() {
        return (Bitmap) this.f18324R.getValue();
    }

    private final Bitmap getNum6() {
        return (Bitmap) this.f18325S.getValue();
    }

    private final Bitmap getNum7() {
        return (Bitmap) this.f18326T.getValue();
    }

    private final Bitmap getNum8() {
        return (Bitmap) this.f18327U.getValue();
    }

    private final Bitmap getNum9() {
        return (Bitmap) this.f18328V.getValue();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18318L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        char c10;
        int i10;
        char c11;
        Canvas canvas2 = canvas;
        kotlin.jvm.internal.n.h(canvas2, "canvas");
        String timeStr = getTimeStr();
        if (timeStr.length() != 0 && TextUtils.isDigitsOnly(timeStr)) {
            float dimension = getResources().getDimension(I2.b.f2854s) * getScaleRatio();
            float dimension2 = getResources().getDimension(I2.b.f2852q) * getScaleRatio();
            float dimension3 = getResources().getDimension(I2.b.f2853r) * getScaleRatio();
            float dimension4 = getResources().getDimension(I2.b.f2843h) * getScaleRatio();
            int length = timeStr.length();
            int i11 = 0;
            int i12 = 0;
            float width = 0.0f;
            while (true) {
                c10 = 2;
                if (i12 >= length) {
                    break;
                }
                Bitmap bitmapT = T(timeStr.charAt(i12));
                if (bitmapT != null) {
                    width = width + (bitmapT.getWidth() * getScaleRatio()) + U(timeStr, i12);
                    if (timeStr.length() - i12 == 3) {
                        width += 2 * dimension3;
                    }
                }
                i12++;
            }
            if (width == 0.0f) {
                return;
            }
            if (width > getWidth()) {
                width = getWidth();
            }
            this.f18329W.setColorFilter(new PorterDuffColorFilter((!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : -16777216, PorterDuff.Mode.SRC_IN));
            float f10 = 2.0f;
            float width2 = (getWidth() - width) / 2.0f;
            int length2 = timeStr.length();
            while (i11 < length2) {
                Bitmap bitmapT2 = T(timeStr.charAt(i11));
                if (bitmapT2 != null) {
                    float height = ((getHeight() - (bitmapT2.getHeight() * getScaleRatio())) / f10) - dimension4;
                    Matrix matrix = new Matrix();
                    matrix.postScale(getScaleRatio(), getScaleRatio());
                    matrix.postTranslate(width2, height);
                    p079h8.A a10 = p079h8.A.f21846a;
                    canvas2.drawBitmap(bitmapT2, matrix, this.f18329W);
                    width2 = width2 + (bitmapT2.getWidth() * getScaleRatio()) + U(timeStr, i11);
                    if (timeStr.length() - i11 == 3) {
                        float f11 = width2 + dimension3;
                        float height2 = bitmapT2.getHeight() * getScaleRatio();
                        c11 = 2;
                        float f12 = 2;
                        float f13 = dimension / f12;
                        float f14 = height + ((((height2 / f12) + dimension4) - (dimension2 / f12)) - f13);
                        float f15 = f11 - f13;
                        float f16 = f11 + f13;
                        i10 = i11;
                        canvas2.drawOval(f15, f14 - f13, f16, f14 + f13, this.f18329W);
                        float f17 = f14 + dimension2 + dimension;
                        canvas.drawOval(f15, f17 - f13, f16, f17 + f13, this.f18329W);
                        width2 = f11 + dimension3;
                    } else {
                        i10 = i11;
                        c11 = 2;
                    }
                } else {
                    i10 = i11;
                    c11 = c10;
                }
                i11 = i10 + 1;
                canvas2 = canvas;
                c10 = c11;
                f10 = 2.0f;
            }
        }
    }

    public /* synthetic */ NTypeClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTypeClockView(final Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18318L = "NTypeClockView";
        this.f18319M = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.E
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.V(context);
            }
        });
        this.f18320N = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.F
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.W(context);
            }
        });
        this.f18321O = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.G
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.X(context);
            }
        });
        this.f18322P = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.H
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.Y(context);
            }
        });
        this.f18323Q = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.I
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.Z(context);
            }
        });
        this.f18324R = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.J
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.a0(context);
            }
        });
        this.f18325S = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.K
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.b0(context);
            }
        });
        this.f18326T = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.L
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.c0(context);
            }
        });
        this.f18327U = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.M
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.d0(context);
            }
        });
        this.f18328V = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.N
            @Override // p219v8.a
            public final Object invoke() {
                return NTypeClockView.e0(context);
            }
        });
        this.f18329W = new Paint();
    }
}
