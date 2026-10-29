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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class NSegmentsClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18290L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f18291M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final long f18292N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f18293O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final int f18294P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final int f18295Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final float f18296R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f18297S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f18298T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f18299U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f18300V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f18301W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f18302a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final int[] f18303b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Map f18304c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final ValueAnimator[] f18305d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Boolean[] f18306e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final Rect[] f18307f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Integer[] f18308g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Point f18309h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Handler f18310i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final int f18311j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f18312k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f18313l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Paint f18314m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f18315n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final b f18316o0;

    public static final class a extends AnimatorListenerAdapter {
        a() {
        }
    }

    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!NSegmentsClockView.this.f18298T || NSegmentsClockView.this.f18315n0) {
                return;
            }
            int length = NSegmentsClockView.this.f18307f0.length;
            boolean z9 = false;
            for (int i10 = 0; i10 < length; i10++) {
                if (NSegmentsClockView.this.f18295Q != NSegmentsClockView.this.f18308g0[i10].intValue()) {
                    NSegmentsClockView.this.f18308g0[i10] = Integer.valueOf(NSegmentsClockView.this.f18295Q);
                    z9 = true;
                }
            }
            if (z9) {
                NSegmentsClockView.this.invalidate();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NSegmentsClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final ValueAnimator P(final int i10) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.f18295Q - this.f18297S);
        valueAnimatorOfInt.setDuration(this.f18311j0);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.6f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.nothing.systemui.shared.clocks.view.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NSegmentsClockView.Q(this.f18421a, i10, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new a());
        kotlin.jvm.internal.n.g(valueAnimatorOfInt, "apply(...)");
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(NSegmentsClockView nSegmentsClockView, int i10, ValueAnimator animator) {
        kotlin.jvm.internal.n.h(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        nSegmentsClockView.f18308g0[i10] = Integer.valueOf(nSegmentsClockView.f18298T ? nSegmentsClockView.f18297S + iIntValue : nSegmentsClockView.f18295Q - iIntValue);
        nSegmentsClockView.invalidate();
    }

    private final Typeface R(int i10) {
        Map map = this.f18304c0;
        Integer numValueOf = Integer.valueOf(i10);
        Object objBuild = map.get(numValueOf);
        if (objBuild == null) {
            objBuild = new Typeface.Builder(getContext().getAssets(), this.f18293O).setFontVariationSettings("'wght' " + i10).build();
            kotlin.jvm.internal.n.g(objBuild, "build(...)");
            map.put(numValueOf, objBuild);
        }
        return (Typeface) objBuild;
    }

    private final void S(int i10, int i11, int i12, String str) {
        Rect rect = new Rect();
        this.f18314m0.getTextBounds(str, 0, 1, rect);
        rect.offset(i11, i12);
        getLocationOnScreen(this.f18303b0);
        int[] iArr = this.f18303b0;
        rect.offset(iArr[0], iArr[1]);
        this.f18307f0[i10] = rect;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18290L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        int width;
        int width2;
        float fFloatValue;
        kotlin.jvm.internal.n.h(canvas, "canvas");
        String timeStr = getTimeStr();
        if (timeStr.length() == 0 || !TextUtils.isDigitsOnly(timeStr)) {
            return;
        }
        boolean z9 = k() || m();
        if (this.f18312k0 != z9) {
            this.f18312k0 = z9;
        }
        this.f18314m0.setTextSize(this.f18294P * getSizeScaleRatio());
        if (n()) {
            Paint paint = this.f18314m0;
            paint.setTextSize(paint.getTextSize() * this.f18296R);
        }
        this.f18314m0.setColor((z9 || kotlin.jvm.internal.n.d(l(), Boolean.TRUE)) ? -1 : -16777216);
        ArrayList arrayList = new ArrayList(timeStr.length());
        for (int i10 = 0; i10 < timeStr.length(); i10++) {
            arrayList.add(Float.valueOf(this.f18314m0.measureText(String.valueOf(timeStr.charAt(i10)))));
        }
        float fN0 = AbstractC1444s.n0(arrayList);
        Paint.FontMetrics fontMetrics = this.f18314m0.getFontMetrics();
        float height = (getHeight() / 2.0f) - ((fontMetrics.top + fontMetrics.bottom) / 2);
        B8.e eVarO = this.f18298T ? B8.h.o(E8.i.W(timeStr)) : E8.i.W(timeStr);
        float clockPaddingHorizontal = getClockPaddingHorizontal();
        boolean z10 = getResources().getConfiguration().getLayoutDirection() == 1;
        boolean zI = i();
        if (!n()) {
            if (!zI) {
                Rect rect = new Rect();
                this.f18314m0.setTypeface(R(this.f18295Q));
                this.f18314m0.getTextBounds(timeStr, 0, timeStr.length(), rect);
                this.f18313l0 = rect.left;
            }
            if (zI) {
                if (this.f18298T) {
                    width2 = getWidth();
                    fFloatValue = (width2 / 2.0f) + (fN0 / 2.0f);
                } else {
                    width = getWidth();
                    fFloatValue = (width - fN0) / 2.0f;
                }
            } else if (!z10 || zI) {
                if (this.f18298T) {
                    clockPaddingHorizontal += fN0;
                }
                fFloatValue = clockPaddingHorizontal - this.f18313l0;
            } else {
                fFloatValue = this.f18298T ? getWidth() - clockPaddingHorizontal : (getWidth() - clockPaddingHorizontal) - fN0;
            }
        } else if (this.f18298T) {
            width2 = getWidth();
            fFloatValue = (width2 / 2.0f) + (fN0 / 2.0f);
        } else {
            width = getWidth();
            fFloatValue = (width - fN0) / 2.0f;
        }
        int iG = eVarO.g();
        int iM = eVarO.m();
        int iN = eVarO.n();
        if ((iN <= 0 || iG > iM) && (iN >= 0 || iM > iG)) {
            return;
        }
        while (true) {
            if (this.f18298T) {
                fFloatValue -= ((Number) arrayList.get(iG)).floatValue();
            }
            this.f18314m0.setTypeface(R(this.f18308g0[iG].intValue()));
            canvas.drawText(String.valueOf(timeStr.charAt(iG)), fFloatValue, height, this.f18314m0);
            S(iG, (int) fFloatValue, (int) height, String.valueOf(timeStr.charAt(iG)));
            if (!this.f18298T) {
                fFloatValue += ((Number) arrayList.get(iG)).floatValue();
            }
            if (iG == iM) {
                return;
            } else {
                iG += iN;
            }
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18304c0.clear();
        for (ValueAnimator valueAnimator : this.f18305d0) {
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
        if (!n() && i10 == 4) {
            if ((!(getCLOCKFACE_TRANSITION_ENABLED() && j()) && getCLOCKFACE_TRANSITION_ENABLED()) || this.f18302a0 || this.f18298T) {
                return;
            }
            int i11 = this.f18291M;
            for (int i12 = 0; i12 < i11; i12++) {
                this.f18308g0[i12] = Integer.valueOf(this.f18297S);
            }
            invalidate();
        }
    }

    public /* synthetic */ NSegmentsClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSegmentsClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18290L = "NSegmentsClockView";
        this.f18291M = 4;
        this.f18292N = 300L;
        this.f18293O = "fonts/nsegments_1_vf.otf";
        this.f18294P = (int) (SystemProperties.getInt("animator.fontsize", 477) * (SystemProperties.getInt("ro.sf.lcd_density", 480) / 480.0f));
        this.f18295Q = TypedValues.TransitionType.TYPE_DURATION;
        this.f18296R = (SystemProperties.getInt("ro.sf.lcd_density", 480) / 480.0f) * 0.4f;
        this.f18297S = 100;
        this.f18298T = true;
        this.f18299U = -1;
        this.f18303b0 = new int[2];
        this.f18304c0 = new LinkedHashMap();
        this.f18305d0 = new ValueAnimator[4];
        Boolean[] boolArr = new Boolean[4];
        for (int i12 = 0; i12 < 4; i12++) {
            boolArr[i12] = Boolean.FALSE;
        }
        this.f18306e0 = boolArr;
        int i13 = this.f18291M;
        this.f18307f0 = new Rect[i13];
        Integer[] numArr = new Integer[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            numArr[i14] = Integer.valueOf(this.f18295Q);
        }
        this.f18308g0 = numArr;
        this.f18309h0 = new Point(0, 0);
        this.f18310i0 = new Handler(Looper.getMainLooper());
        this.f18311j0 = SystemProperties.getInt("animator.duration", 500);
        Paint paint = new Paint(1);
        paint.setTextSize(this.f18294P * getSizeScaleRatio());
        if (n()) {
            paint.setTextSize(paint.getTextSize() * this.f18296R);
        }
        paint.setTypeface(R(this.f18295Q));
        this.f18314m0 = paint;
        this.f18316o0 = new b();
        Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        this.f18300V = displayMetrics.widthPixels;
        this.f18301W = displayMetrics.heightPixels;
        int i15 = this.f18291M;
        for (int i16 = 0; i16 < i15; i16++) {
            this.f18305d0[i16] = P(i16);
        }
        Object systemService2 = context.getSystemService("power");
        kotlin.jvm.internal.n.f(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
        int i17 = this.f18291M;
        for (int i18 = 0; i18 < i17; i18++) {
            this.f18308g0[i18] = Integer.valueOf(zIsInteractive ? this.f18295Q : this.f18297S);
        }
    }
}
