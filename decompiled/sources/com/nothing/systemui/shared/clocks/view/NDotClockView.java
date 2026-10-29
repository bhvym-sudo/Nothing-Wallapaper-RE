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
public final class NDotClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18244L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p079h8.h f18245M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p079h8.h f18246N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final p079h8.h f18247O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final p079h8.h f18248P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final p079h8.h f18249Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final p079h8.h f18250R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final p079h8.h f18251S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final p079h8.h f18252T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p079h8.h f18253U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p079h8.h f18254V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final p079h8.h f18255W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final p079h8.h f18256a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final p079h8.h f18257b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final p079h8.h f18258c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final p079h8.h f18259d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final p079h8.h f18260e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final p079h8.h f18261f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final p079h8.h f18262g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final p079h8.h f18263h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final p079h8.h f18264i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final Paint f18265j0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NDotClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap d0(char c10, boolean z9, boolean z10) {
        switch (c10) {
            case '0':
                return (z10 && z9) ? getNum0Light() : getNum0();
            case '1':
                return (z10 && z9) ? getNum1Light() : getNum1();
            case '2':
                return (z10 && z9) ? getNum2Light() : getNum2();
            case '3':
                return (z10 && z9) ? getNum3Light() : getNum3();
            case '4':
                return (z10 && z9) ? getNum4Light() : getNum4();
            case '5':
                return (z10 && z9) ? getNum5Light() : getNum5();
            case '6':
                return (z10 && z9) ? getNum6Light() : getNum6();
            case '7':
                return (z10 && z9) ? getNum7Light() : getNum7();
            case '8':
                return (z10 && z9) ? getNum8Light() : getNum8();
            case '9':
                return (z10 && z9) ? getNum9Light() : getNum9();
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap e0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2877I);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap f0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2876H);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap g0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2879K);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    private final Bitmap getNum0() {
        return (Bitmap) this.f18245M.getValue();
    }

    private final Bitmap getNum0Light() {
        return (Bitmap) this.f18246N.getValue();
    }

    private final Bitmap getNum1() {
        return (Bitmap) this.f18247O.getValue();
    }

    private final Bitmap getNum1Light() {
        return (Bitmap) this.f18248P.getValue();
    }

    private final Bitmap getNum2() {
        return (Bitmap) this.f18249Q.getValue();
    }

    private final Bitmap getNum2Light() {
        return (Bitmap) this.f18250R.getValue();
    }

    private final Bitmap getNum3() {
        return (Bitmap) this.f18251S.getValue();
    }

    private final Bitmap getNum3Light() {
        return (Bitmap) this.f18252T.getValue();
    }

    private final Bitmap getNum4() {
        return (Bitmap) this.f18253U.getValue();
    }

    private final Bitmap getNum4Light() {
        return (Bitmap) this.f18254V.getValue();
    }

    private final Bitmap getNum5() {
        return (Bitmap) this.f18255W.getValue();
    }

    private final Bitmap getNum5Light() {
        return (Bitmap) this.f18256a0.getValue();
    }

    private final Bitmap getNum6() {
        return (Bitmap) this.f18257b0.getValue();
    }

    private final Bitmap getNum6Light() {
        return (Bitmap) this.f18258c0.getValue();
    }

    private final Bitmap getNum7() {
        return (Bitmap) this.f18259d0.getValue();
    }

    private final Bitmap getNum7Light() {
        return (Bitmap) this.f18260e0.getValue();
    }

    private final Bitmap getNum8() {
        return (Bitmap) this.f18261f0.getValue();
    }

    private final Bitmap getNum8Light() {
        return (Bitmap) this.f18262g0.getValue();
    }

    private final Bitmap getNum9() {
        return (Bitmap) this.f18263h0.getValue();
    }

    private final Bitmap getNum9Light() {
        return (Bitmap) this.f18264i0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap h0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2878J);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap i0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2881M);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap j0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2880L);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap k0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2883O);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap l0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2882N);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap m0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2885Q);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap n0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2884P);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap o0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2887S);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap p0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2886R);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap q0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2889U);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap r0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2888T);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap s0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2891W);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap t0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2890V);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap u0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2893Y);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap v0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2892X);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap w0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2896a0);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap x0(Context context) {
        Drawable drawableD = p171r0.a.d(context, I2.c.f2894Z);
        if (drawableD != null) {
            return p201u0.b.b(drawableD, 0, 0, null, 7, null);
        }
        return null;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18244L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        boolean[] zArr;
        float[] fArr;
        int i10 = 0;
        kotlin.jvm.internal.n.h(canvas, "canvas");
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
            for (int i11 = 0; i11 < length3; i11++) {
                Bitmap bitmapD0 = d0(timeStr.charAt(i11), z9, zArr[i11]);
                if (bitmapD0 != null) {
                    width += bitmapD0.getWidth() * getScaleRatio();
                    if (i11 < timeStr.length() - 1) {
                        width += fArr[i11];
                    }
                }
            }
            if (width == 0.0f) {
                return;
            }
            if (width > getWidth()) {
                width = getWidth();
            }
            float f11 = 2.0f;
            float width2 = (getWidth() - width) / 2.0f;
            float dimension3 = getResources().getDimension(I2.b.f2856u) * getScaleRatio();
            int length4 = timeStr.length();
            while (i10 < length4) {
                this.f18265j0.setColorFilter(new PorterDuffColorFilter((zBooleanValue || z9) ? -1 : -16777216, PorterDuff.Mode.SRC_IN));
                Bitmap bitmapD1 = d0(timeStr.charAt(i10), z9, zArr[i10]);
                if (bitmapD1 != null) {
                    float height = ((getHeight() - (bitmapD1.getHeight() * getScaleRatio())) / f11) - dimension3;
                    Matrix matrix = new Matrix();
                    matrix.postScale(getScaleRatio(), getScaleRatio());
                    matrix.postTranslate(width2, height);
                    p079h8.A a10 = p079h8.A.f21846a;
                    canvas.drawBitmap(bitmapD1, matrix, this.f18265j0);
                    width2 += bitmapD1.getWidth() * getScaleRatio();
                    if (i10 < timeStr.length() - 1) {
                        width2 += fArr[i10];
                    }
                }
                i10++;
                f11 = 2.0f;
            }
        }
    }

    public /* synthetic */ NDotClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NDotClockView(final Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18244L = "NDotClockView";
        this.f18245M = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.b
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.f0(context);
            }
        });
        this.f18246N = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.d
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.e0(context);
            }
        });
        this.f18247O = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.e
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.h0(context);
            }
        });
        this.f18248P = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.f
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.g0(context);
            }
        });
        this.f18249Q = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.g
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.j0(context);
            }
        });
        this.f18250R = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.h
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.i0(context);
            }
        });
        this.f18251S = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.i
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.l0(context);
            }
        });
        this.f18252T = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.j
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.k0(context);
            }
        });
        this.f18253U = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.k
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.n0(context);
            }
        });
        this.f18254V = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.l
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.m0(context);
            }
        });
        this.f18255W = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.m
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.p0(context);
            }
        });
        this.f18256a0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.n
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.o0(context);
            }
        });
        this.f18257b0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.o
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.r0(context);
            }
        });
        this.f18258c0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.p
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.q0(context);
            }
        });
        this.f18259d0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.q
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.t0(context);
            }
        });
        this.f18260e0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.r
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.s0(context);
            }
        });
        this.f18261f0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.s
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.v0(context);
            }
        });
        this.f18262g0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.t
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.u0(context);
            }
        });
        this.f18263h0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.u
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.x0(context);
            }
        });
        this.f18264i0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.systemui.shared.clocks.view.c
            @Override // p219v8.a
            public final Object invoke() {
                return NDotClockView.w0(context);
            }
        });
        this.f18265j0 = new Paint();
    }
}
