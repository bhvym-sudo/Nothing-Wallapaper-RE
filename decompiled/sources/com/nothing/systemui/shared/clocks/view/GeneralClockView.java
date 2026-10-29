package com.nothing.systemui.shared.clocks.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemProperties;
import android.os.Trace;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class GeneralClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18189L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private X5.a f18190M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Bitmap f18191N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Bitmap f18192O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Bitmap f18193P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Bitmap f18194Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Bitmap f18195R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Bitmap f18196S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Bitmap f18197T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Bitmap f18198U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Bitmap f18199V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Bitmap f18200W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Bitmap f18201a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Bitmap f18202b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Bitmap f18203c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Bitmap f18204d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Bitmap f18205e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Bitmap f18206f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Bitmap f18207g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Bitmap f18208h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Bitmap f18209i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Bitmap f18210j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final Paint f18211k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Y5.a f18212l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f18213m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f18214n0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeneralClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap J(char c10, boolean z9) {
        switch (c10) {
            case '0':
                return z9 ? this.f18192O : this.f18191N;
            case '1':
                return z9 ? this.f18194Q : this.f18193P;
            case '2':
                return z9 ? this.f18196S : this.f18195R;
            case '3':
                return z9 ? this.f18198U : this.f18197T;
            case '4':
                return z9 ? this.f18200W : this.f18199V;
            case '5':
                return z9 ? this.f18202b0 : this.f18201a0;
            case '6':
                return z9 ? this.f18204d0 : this.f18203c0;
            case '7':
                return z9 ? this.f18206f0 : this.f18205e0;
            case '8':
                return z9 ? this.f18208h0 : this.f18207g0;
            case '9':
                return z9 ? this.f18210j0 : this.f18209i0;
            default:
                return null;
        }
    }

    private final void K() {
        if (this.f18214n0) {
            return;
        }
        this.f18214n0 = true;
        Log.d(getTag(), "initResource");
        Trace.beginSection(getTag() + "#initResource");
        M();
        Drawable drawableD = p171r0.a.d(getContext(), I2.c.f2901d);
        this.f18191N = drawableD != null ? p201u0.b.b(drawableD, 0, 0, null, 7, null) : null;
        Drawable drawableD2 = p171r0.a.d(getContext(), I2.c.f2903e);
        this.f18192O = drawableD2 != null ? p201u0.b.b(drawableD2, 0, 0, null, 7, null) : null;
        Drawable drawableD3 = p171r0.a.d(getContext(), I2.c.f2905f);
        this.f18193P = drawableD3 != null ? p201u0.b.b(drawableD3, 0, 0, null, 7, null) : null;
        Drawable drawableD4 = p171r0.a.d(getContext(), I2.c.f2907g);
        this.f18194Q = drawableD4 != null ? p201u0.b.b(drawableD4, 0, 0, null, 7, null) : null;
        Drawable drawableD5 = p171r0.a.d(getContext(), I2.c.f2909h);
        this.f18195R = drawableD5 != null ? p201u0.b.b(drawableD5, 0, 0, null, 7, null) : null;
        Drawable drawableD6 = p171r0.a.d(getContext(), I2.c.f2911i);
        this.f18196S = drawableD6 != null ? p201u0.b.b(drawableD6, 0, 0, null, 7, null) : null;
        Drawable drawableD7 = p171r0.a.d(getContext(), I2.c.f2913j);
        this.f18197T = drawableD7 != null ? p201u0.b.b(drawableD7, 0, 0, null, 7, null) : null;
        Drawable drawableD8 = p171r0.a.d(getContext(), I2.c.f2915k);
        this.f18198U = drawableD8 != null ? p201u0.b.b(drawableD8, 0, 0, null, 7, null) : null;
        Drawable drawableD9 = p171r0.a.d(getContext(), I2.c.f2917l);
        this.f18199V = drawableD9 != null ? p201u0.b.b(drawableD9, 0, 0, null, 7, null) : null;
        Drawable drawableD10 = p171r0.a.d(getContext(), I2.c.f2919m);
        this.f18200W = drawableD10 != null ? p201u0.b.b(drawableD10, 0, 0, null, 7, null) : null;
        Drawable drawableD11 = p171r0.a.d(getContext(), I2.c.f2921n);
        this.f18201a0 = drawableD11 != null ? p201u0.b.b(drawableD11, 0, 0, null, 7, null) : null;
        Drawable drawableD12 = p171r0.a.d(getContext(), I2.c.f2923o);
        this.f18202b0 = drawableD12 != null ? p201u0.b.b(drawableD12, 0, 0, null, 7, null) : null;
        Drawable drawableD13 = p171r0.a.d(getContext(), I2.c.f2925p);
        this.f18203c0 = drawableD13 != null ? p201u0.b.b(drawableD13, 0, 0, null, 7, null) : null;
        Drawable drawableD14 = p171r0.a.d(getContext(), I2.c.f2927q);
        this.f18204d0 = drawableD14 != null ? p201u0.b.b(drawableD14, 0, 0, null, 7, null) : null;
        Drawable drawableD15 = p171r0.a.d(getContext(), I2.c.f2929r);
        this.f18205e0 = drawableD15 != null ? p201u0.b.b(drawableD15, 0, 0, null, 7, null) : null;
        Drawable drawableD16 = p171r0.a.d(getContext(), I2.c.f2931s);
        this.f18206f0 = drawableD16 != null ? p201u0.b.b(drawableD16, 0, 0, null, 7, null) : null;
        Drawable drawableD17 = p171r0.a.d(getContext(), I2.c.f2933t);
        this.f18207g0 = drawableD17 != null ? p201u0.b.b(drawableD17, 0, 0, null, 7, null) : null;
        Drawable drawableD18 = p171r0.a.d(getContext(), I2.c.f2935u);
        this.f18208h0 = drawableD18 != null ? p201u0.b.b(drawableD18, 0, 0, null, 7, null) : null;
        Drawable drawableD19 = p171r0.a.d(getContext(), I2.c.f2937v);
        this.f18209i0 = drawableD19 != null ? p201u0.b.b(drawableD19, 0, 0, null, 7, null) : null;
        Drawable drawableD20 = p171r0.a.d(getContext(), I2.c.f2939w);
        this.f18210j0 = drawableD20 != null ? p201u0.b.b(drawableD20, 0, 0, null, 7, null) : null;
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    private final void L(X5.a aVar, Y5.a aVar2) {
        String strD;
        String strC;
        boolean z9;
        int iC = aVar2 != null ? aVar2.c() : Integer.MIN_VALUE;
        String strF = "";
        if (aVar2 == null || (strD = aVar2.b()) == null) {
            strD = "";
        }
        boolean z10 = aVar != null && aVar.h();
        if (z10) {
            strC = X5.b.c(getContext(), aVar);
        } else if (iC != Integer.MIN_VALUE) {
            strC = iC + "°";
        } else {
            strC = "";
        }
        if (z10 && (aVar == null || (strD = aVar.d()) == null)) {
            strD = "";
        }
        if (aVar != null && aVar.h()) {
            strF = aVar.f();
        }
        kotlin.jvm.internal.n.e(strC);
        if (strC.length() == 0 && strD.length() == 0) {
            kotlin.jvm.internal.n.e(strF);
            z9 = strF.length() == 0;
        }
        float dimension = getResources().getDimension(I2.b.f2848m) * getScaleRatio();
        float dimension2 = getResources().getDimension(I2.b.f2851p) * getScaleRatio();
        ViewGroup viewGroup = (ViewGroup) findViewById(I2.d.f2956j);
        int i10 = 8;
        if (viewGroup != null) {
            viewGroup.setVisibility(z9 ? 8 : 0);
        }
        TextView textView = (TextView) findViewById(I2.d.f2960n);
        if (textView != null) {
            textView.setVisibility(z9 ? 0 : 8);
        }
        ImageView imageView = (ImageView) findViewById(I2.d.f2965s);
        if (imageView != null) {
            if (!z10 && !z9) {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setImageResource(Y5.b.f9357a.a(aVar2 != null ? aVar2.a() : 0));
        }
        TextView textView2 = (TextView) findViewById(I2.d.f2959m);
        if (textView2 != null) {
            textView2.setText(strC);
            kotlin.jvm.internal.n.e(strF);
            textView2.setTextSize(0, strF.length() == 0 ? dimension : dimension2);
        }
        TextView textView3 = (TextView) findViewById(I2.d.f2961o);
        if (textView3 != null) {
            textView3.setText(strD);
            kotlin.jvm.internal.n.e(strF);
            if (strF.length() != 0) {
                dimension = dimension2;
            }
            textView3.setTextSize(0, dimension);
            int dimension3 = (int) (textView3.getResources().getDimension(I2.b.f2837b) * getScaleRatio());
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(z10 ? dimension3 : 0);
            textView3.setLayoutParams(layoutParams2);
        }
        TextView textView4 = (TextView) findViewById(I2.d.f2962p);
        if (textView4 != null) {
            textView4.setText(strF);
        }
        A();
    }

    private final void M() {
        float clockPaddingHorizontal = getClockPaddingHorizontal();
        int dimension = (int) (getResources().getDimension(I2.b.f2838c) * getScaleRatio());
        int dimension2 = (int) (getResources().getDimension(I2.b.f2842g) * getScaleRatio());
        float dimension3 = getResources().getDimension(I2.b.f2850o) * getScaleRatio();
        float dimension4 = getResources().getDimension(I2.b.f2851p) * getScaleRatio();
        int i10 = this.f18213m0;
        if (i10 <= 0) {
            i10 = getResources().getDisplayMetrics().widthPixels < getResources().getDisplayMetrics().heightPixels ? getResources().getDisplayMetrics().widthPixels : getResources().getDisplayMetrics().heightPixels;
        }
        int i11 = (int) (i10 - (clockPaddingHorizontal * 2));
        int dimension5 = (int) (getResources().getDimension(I2.b.f2840e) * getScaleRatio());
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(I2.d.f2953g);
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, (int) (relativeLayout.getResources().getDimension(I2.b.f2847l) * getScaleRatio()), 0, (int) (relativeLayout.getResources().getDimension(I2.b.f2845j) * getScaleRatio()));
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = dimension5;
            relativeLayout.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) findViewById(I2.d.f2965s);
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.width = dimension2;
            layoutParams3.height = dimension2;
            layoutParams3.setMarginStart(dimension);
            layoutParams3.setMarginEnd(dimension);
            imageView.setLayoutParams(layoutParams3);
        }
        TextView textView = (TextView) findViewById(I2.d.f2962p);
        if (textView != null) {
            textView.setTextSize(0, dimension4);
            int dimension6 = (int) (textView.getResources().getDimension(I2.b.f2836a) * getScaleRatio());
            ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            kotlin.jvm.internal.n.f(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
            layoutParams5.setMargins(0, 0, 0, dimension6);
            textView.setLayoutParams(layoutParams5);
        }
        TextView textView2 = (TextView) findViewById(I2.d.f2960n);
        if (textView2 != null) {
            textView2.setTextSize(0, dimension3);
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    protected void A() {
        super.A();
        int i10 = (!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : -16777216;
        TextView textView = (TextView) findViewById(I2.d.f2959m);
        if (textView != null) {
            textView.setTextColor(i10);
        }
        TextView textView2 = (TextView) findViewById(I2.d.f2961o);
        if (textView2 != null) {
            textView2.setTextColor(i10);
        }
        TextView textView3 = (TextView) findViewById(I2.d.f2962p);
        if (textView3 != null) {
            textView3.setTextColor(i10);
        }
        TextView textView4 = (TextView) findViewById(I2.d.f2960n);
        if (textView4 != null) {
            textView4.setTextColor(i10);
        }
        ImageView imageView = (ImageView) findViewById(I2.d.f2965s);
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void F() {
        super.F();
        L(this.f18190M, this.f18212l0);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void H() {
        setSnapshotRatio(SystemProperties.getInt("customization.general_clock", 480) / 1000.0f);
        setScaleRatio(getScaleRatio() * getSnapshotRatio());
        M();
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18189L;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        boolean z9;
        char c10;
        int i10;
        int i11;
        char c11;
        Canvas canvas2 = canvas;
        int i12 = 1;
        kotlin.jvm.internal.n.h(canvas2, "canvas");
        K();
        String timeStr = getTimeStr();
        if (timeStr.length() != 0 && TextUtils.isDigitsOnly(timeStr)) {
            X5.a aVar = this.f18190M;
            if (aVar == null || !aVar.h()) {
                z9 = false;
            } else {
                X5.a aVar2 = this.f18190M;
                String strF = aVar2 != null ? aVar2.f() : null;
                if (strF == null || strF.length() == 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            }
            float dimension = getResources().getDimension(I2.b.f2847l) * getScaleRatio();
            float clockPaddingHorizontal = getClockPaddingHorizontal();
            float dimension2 = getResources().getDimension(I2.b.f2844i) * getScaleRatio();
            float dimension3 = getResources().getDimension(I2.b.f2855t) * getScaleRatio();
            float dimension4 = getResources().getDimension(I2.b.f2852q) * getScaleRatio();
            this.f18211k0.setColorFilter(new PorterDuffColorFilter((!kotlin.jvm.internal.n.d(l(), Boolean.FALSE) || k() || m()) ? -1 : -16777216, PorterDuff.Mode.SRC_IN));
            int length = timeStr.length();
            float width = 0.0f;
            int i13 = 0;
            while (true) {
                c10 = 2;
                i10 = i12;
                if (i13 >= length) {
                    break;
                }
                Bitmap bitmapJ = J(timeStr.charAt(i13), z9);
                if (bitmapJ != null) {
                    width += bitmapJ.getWidth() * getScaleRatio();
                    if (timeStr.length() - i13 == 3) {
                        width += 2 * dimension2;
                    }
                }
                i13++;
                i12 = i10;
            }
            if (width == 0.0f) {
                return;
            }
            if (width > getWidth()) {
                width = getWidth();
            }
            if (getResources().getConfiguration().getLayoutDirection() == i10) {
                clockPaddingHorizontal = (getWidth() - clockPaddingHorizontal) - width;
            }
            int length2 = timeStr.length();
            int i14 = 0;
            while (i14 < length2) {
                Bitmap bitmapJ2 = J(timeStr.charAt(i14), z9);
                if (bitmapJ2 != null) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(getScaleRatio(), getScaleRatio());
                    matrix.postTranslate(clockPaddingHorizontal, dimension);
                    p079h8.A a10 = p079h8.A.f21846a;
                    canvas2.drawBitmap(bitmapJ2, matrix, this.f18211k0);
                    clockPaddingHorizontal += bitmapJ2.getWidth() * getScaleRatio();
                    if (timeStr.length() - i14 == 3) {
                        float f10 = clockPaddingHorizontal + dimension2;
                        float f11 = 2;
                        float f12 = dimension3 / f11;
                        float height = dimension + ((((bitmapJ2.getHeight() * getScaleRatio()) / f11) - (dimension4 / f11)) - f12);
                        float f13 = f10 - f12;
                        float f14 = f10 + f12;
                        i11 = i14;
                        c11 = 2;
                        canvas2.drawOval(f13, height - f12, f14, height + f12, this.f18211k0);
                        float f15 = height + dimension4 + dimension3;
                        canvas.drawOval(f13, f15 - f12, f14, f15 + f12, this.f18211k0);
                        clockPaddingHorizontal = f10 + dimension2;
                    } else {
                        i11 = i14;
                        c11 = 2;
                    }
                } else {
                    i11 = i14;
                    c11 = c10;
                }
                i14 = i11 + 1;
                canvas2 = canvas;
                c10 = c11;
            }
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            int width = (getWidth() - childAt.getMeasuredWidth()) / 2;
            int height = (getHeight() - childAt.getMeasuredHeight()) / 2;
            childAt.layout(width, height, childAt.getMeasuredWidth() + width, childAt.getMeasuredHeight() + height);
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (n()) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            setWindowWidth(size);
            setMeasuredDimension(size, size2);
            M();
        }
        measureChildren(i10, i11);
        super.onMeasure(i10, i11);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void p(X5.a aVar) {
        if (kotlin.jvm.internal.n.d(this.f18190M, aVar)) {
            return;
        }
        this.f18190M = aVar;
        L(aVar, this.f18212l0);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void setWindowWidth(int i10) {
        this.f18213m0 = i10;
        L(this.f18190M, this.f18212l0);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void y(Y5.a aVar) {
        if (kotlin.jvm.internal.n.d(this.f18212l0, aVar)) {
            return;
        }
        this.f18212l0 = aVar;
        L(this.f18190M, aVar);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void z() {
        this.f18214n0 = false;
        K();
    }

    public /* synthetic */ GeneralClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18189L = "GeneralClockView";
        this.f18211k0 = new Paint();
    }
}
