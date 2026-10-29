package com.nothing.systemui.shared.clocks.view;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class SpaceAgeClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18374L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f18375M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final long f18376N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f18377O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f18378P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f18379Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final int f18380R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final float f18381S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f18382T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f18383U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f18384V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f18385W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f18386a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final int[] f18387b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Map f18388c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final ValueAnimator[] f18389d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Boolean[] f18390e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final Rect[] f18391f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Integer[] f18392g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Point f18393h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Handler f18394i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final int f18395j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f18396k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Paint f18397l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f18398m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final b f18399n0;

    public static final class a extends AnimatorListenerAdapter {
        a() {
        }
    }

    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SpaceAgeClockView.this.f18382T || SpaceAgeClockView.this.f18398m0) {
                return;
            }
            int length = SpaceAgeClockView.this.f18391f0.length;
            boolean z9 = false;
            for (int i10 = 0; i10 < length; i10++) {
                if (SpaceAgeClockView.this.f18379Q != SpaceAgeClockView.this.f18392g0[i10].intValue()) {
                    SpaceAgeClockView.this.f18392g0[i10] = Integer.valueOf(SpaceAgeClockView.this.f18379Q);
                    z9 = true;
                }
            }
            if (z9) {
                SpaceAgeClockView.this.invalidate();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpaceAgeClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final ValueAnimator P(final int i10) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f18379Q - this.f18380R);
        valueAnimatorOfInt.setDuration(this.f18395j0);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.6f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.nothing.systemui.shared.clocks.view.P
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SpaceAgeClockView.Q(this.f18355a, i10, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new a());
        kotlin.jvm.internal.n.g(valueAnimatorOfInt, "apply(...)");
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(SpaceAgeClockView spaceAgeClockView, int i10, ValueAnimator animator) {
        kotlin.jvm.internal.n.h(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        spaceAgeClockView.f18392g0[i10] = Integer.valueOf(spaceAgeClockView.f18382T ? spaceAgeClockView.f18380R + iIntValue : spaceAgeClockView.f18379Q - iIntValue);
        spaceAgeClockView.invalidate();
    }

    private final Typeface R(int i10) {
        Map map = this.f18388c0;
        Integer numValueOf = Integer.valueOf(i10);
        Object objBuild = map.get(numValueOf);
        if (objBuild == null) {
            objBuild = new Typeface.Builder(getContext().getAssets(), this.f18377O).setFontVariationSettings("'wght' " + i10).build();
            kotlin.jvm.internal.n.g(objBuild, "build(...)");
            map.put(numValueOf, objBuild);
        }
        return (Typeface) objBuild;
    }

    private final void S(int i10, int i11, int i12, String str) {
        Rect rect = new Rect();
        this.f18397l0.getTextBounds(str, 0, 1, rect);
        rect.offset(i11, i12);
        getLocationOnScreen(this.f18387b0);
        int[] iArr = this.f18387b0;
        rect.offset(iArr[0], iArr[1]);
        this.f18391f0[i10] = rect;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18374L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        int width;
        int width2;
        float f10;
        float width3;
        kotlin.jvm.internal.n.h(canvas, "canvas");
        String timeStr = getTimeStr();
        if (timeStr.length() == 0 || !TextUtils.isDigitsOnly(timeStr)) {
            return;
        }
        boolean z9 = k() || m();
        if (this.f18396k0 != z9) {
            this.f18396k0 = z9;
        }
        float dimension = getResources().getDimension(I2.b.f2843h) * getScaleRatio();
        this.f18397l0.setTextSize(this.f18378P * getSizeScaleRatio());
        if (n()) {
            Paint paint = this.f18397l0;
            paint.setTextSize(paint.getTextSize() * this.f18381S);
        }
        this.f18397l0.setColor((z9 || kotlin.jvm.internal.n.d(l(), Boolean.TRUE)) ? -1 : -16777216);
        float[] fArr = new float[timeStr.length()];
        int length = timeStr.length();
        float f11 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            this.f18397l0.setTypeface(R(this.f18392g0[i10].intValue()));
            float fMeasureText = this.f18397l0.measureText(String.valueOf(timeStr.charAt(i10)));
            fArr[i10] = fMeasureText;
            f11 += fMeasureText;
        }
        Paint.FontMetrics fontMetrics = this.f18397l0.getFontMetrics();
        float height = (getHeight() / 2.0f) - ((fontMetrics.top + fontMetrics.bottom) / 2);
        if (n()) {
            dimension = 0.0f;
        }
        float f12 = height - dimension;
        B8.e eVarO = this.f18382T ? B8.h.o(E8.i.W(timeStr)) : E8.i.W(timeStr);
        float clockPaddingHorizontal = getClockPaddingHorizontal();
        boolean z10 = getResources().getConfiguration().getLayoutDirection() == 1;
        boolean zI = i();
        int iM = this.f18382T ? eVarO.m() : eVarO.g();
        Rect rect = new Rect();
        this.f18397l0.setTypeface(R(this.f18392g0[iM].intValue()));
        this.f18397l0.getTextBounds(String.valueOf(timeStr.charAt(iM)), 0, 1, rect);
        float f13 = rect.left;
        if (n()) {
            if (this.f18382T) {
                width2 = getWidth();
                f10 = (width2 / 2.0f) + (f11 / 2.0f);
                width3 = f10 - f13;
            } else {
                width = getWidth();
                f10 = (width - f11) / 2.0f;
                width3 = f10 - f13;
            }
        } else if (zI) {
            if (this.f18382T) {
                width2 = getWidth();
                f10 = (width2 / 2.0f) + (f11 / 2.0f);
                width3 = f10 - f13;
            } else {
                width = getWidth();
                f10 = (width - f11) / 2.0f;
                width3 = f10 - f13;
            }
        } else if (z10) {
            width3 = this.f18382T ? getWidth() - clockPaddingHorizontal : (getWidth() - clockPaddingHorizontal) - f11;
        } else {
            if (this.f18382T) {
                clockPaddingHorizontal += f11;
            }
            width3 = clockPaddingHorizontal - f13;
        }
        int iG = eVarO.g();
        int iM2 = eVarO.m();
        int iN = eVarO.n();
        if ((iN <= 0 || iG > iM2) && (iN >= 0 || iM2 > iG)) {
            return;
        }
        while (true) {
            if (this.f18382T) {
                width3 -= fArr[iG] - 1.0f;
            }
            this.f18397l0.setTypeface(R(this.f18392g0[iG].intValue()));
            canvas.drawText(String.valueOf(timeStr.charAt(iG)), width3, f12, this.f18397l0);
            S(iG, (int) width3, (int) f12, String.valueOf(timeStr.charAt(iG)));
            if (!this.f18382T) {
                width3 += fArr[iG] - 1.0f;
            }
            if (iG == iM2) {
                return;
            } else {
                iG += iN;
            }
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18388c0.clear();
        for (ValueAnimator valueAnimator : this.f18389d0) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.n.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (!n() && i10 == 4 && getCLOCKFACE_TRANSITION_ENABLED() && j() && !this.f18386a0 && !this.f18382T) {
            int i11 = this.f18375M;
            for (int i12 = 0; i12 < i11; i12++) {
                this.f18392g0[i12] = Integer.valueOf(this.f18380R);
            }
            invalidate();
        }
    }

    public /* synthetic */ SpaceAgeClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceAgeClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18374L = "SpaceAgeClockView";
        this.f18375M = 4;
        this.f18376N = 300L;
        this.f18377O = "fonts/space_age.ttf";
        this.f18378P = (int) (SystemProperties.getInt("space_age.animator.fontsize", 194) * (SystemProperties.getInt("ro.sf.lcd_density", 480) / 480.0f));
        this.f18379Q = TypedValues.Custom.TYPE_INT;
        this.f18380R = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f18381S = (SystemProperties.getInt("ro.sf.lcd_density", 480) / 480.0f) * 0.417f;
        this.f18382T = true;
        this.f18383U = -1;
        this.f18387b0 = new int[2];
        this.f18388c0 = new LinkedHashMap();
        this.f18389d0 = new ValueAnimator[4];
        Boolean[] boolArr = new Boolean[4];
        for (int i12 = 0; i12 < 4; i12++) {
            boolArr[i12] = Boolean.FALSE;
        }
        this.f18390e0 = boolArr;
        int i13 = this.f18375M;
        this.f18391f0 = new Rect[i13];
        Integer[] numArr = new Integer[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            numArr[i14] = Integer.valueOf(this.f18379Q);
        }
        this.f18392g0 = numArr;
        this.f18393h0 = new Point(0, 0);
        this.f18394i0 = new Handler(Looper.getMainLooper());
        this.f18395j0 = SystemProperties.getInt("animator.duration", 500);
        Paint paint = new Paint(1);
        paint.setTextSize(this.f18378P * getSizeScaleRatio());
        if (n()) {
            paint.setTextSize(paint.getTextSize() * this.f18381S);
        }
        paint.setTypeface(R(this.f18379Q));
        this.f18397l0 = paint;
        this.f18399n0 = new b();
        Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        this.f18384V = displayMetrics.widthPixels;
        this.f18385W = displayMetrics.heightPixels;
        int i15 = this.f18375M;
        for (int i16 = 0; i16 < i15; i16++) {
            this.f18389d0[i16] = P(i16);
        }
        Object systemService2 = context.getSystemService("power");
        kotlin.jvm.internal.n.f(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
        int i17 = this.f18375M;
        for (int i18 = 0; i18 < i17; i18++) {
            this.f18392g0[i18] = Integer.valueOf(zIsInteractive ? this.f18379Q : this.f18380R);
        }
    }
}
