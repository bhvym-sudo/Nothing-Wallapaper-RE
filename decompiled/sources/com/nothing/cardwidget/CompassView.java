package com.nothing.cardwidget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class CompassView extends RemoteServiceView {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_DURATION = 20;
    private long animDuration;
    private ViewPropertyAnimator animator;
    private Drawable arrowDrawable;
    private final ImageView arrowIv;
    private Drawable arrowNorthDrawable;
    private Drawable compassBgDrawable;
    private Drawable curArrow;
    private Drawable curDrawable;
    private Drawable dAllDrawable;
    private Drawable dEastDrawable;
    private Drawable dNorthDrawable;
    private Drawable dSouthDrawable;
    private Drawable dWestDrawable;
    private final ImageView directionIv;
    private boolean isWidgetVisible;
    private boolean needHaptic;
    private float preDegree;
    private Vibrator vibrator;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompassView(Context context) {
        this(context, null, 0, 0, 14, null);
        n.h(context, "context");
    }

    private final void playVibratorEffect() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.vibrate(VibrationEffect.createOneShot(30L, -1));
        }
        this.needHaptic = false;
    }

    private final void startAnimation(float f10, long j9) {
        ViewPropertyAnimator viewPropertyAnimator = this.animator;
        if (viewPropertyAnimator != null) {
            n.e(viewPropertyAnimator);
            ViewPropertyAnimator viewPropertyAnimatorRotation = viewPropertyAnimator.rotation(-f10);
            viewPropertyAnimatorRotation.setDuration(j9);
            viewPropertyAnimatorRotation.start();
        }
        this.preDegree = f10;
    }

    @Override // com.nothing.cardwidget.RemoteServiceView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getApplicationContext().getSystemService("vibrator_manager");
        n.f(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
        this.vibrator = ((VibratorManager) systemService).getDefaultVibrator();
        this.animator = this.directionIv.animate();
    }

    @Override // com.nothing.cardwidget.RemoteServiceView
    public void onDataChanged(Bundle data) {
        n.h(data, "data");
        float f10 = data.getFloat("degree");
        boolean z9 = data.getBoolean("haptic", true);
        if (f10 < 0.0f) {
            f10 += 360;
        }
        if (f10 > 356.0f || f10 < 4.0f) {
            if (!n.d(this.curDrawable, this.dNorthDrawable)) {
                this.directionIv.setImageDrawable(this.dNorthDrawable);
                this.curDrawable = this.dNorthDrawable;
            }
            if (!n.d(this.curArrow, this.arrowNorthDrawable)) {
                this.arrowIv.setImageDrawable(this.arrowNorthDrawable);
                this.curArrow = this.arrowNorthDrawable;
            }
            if (z9 && this.needHaptic && this.isWidgetVisible) {
                playVibratorEffect();
            }
        } else if (f10 > 86.0f && f10 < 94.0f) {
            if (!n.d(this.curDrawable, this.dEastDrawable)) {
                this.directionIv.setImageDrawable(this.dEastDrawable);
                this.curDrawable = this.dEastDrawable;
            }
            if (!n.d(this.curArrow, this.arrowDrawable)) {
                this.arrowIv.setImageDrawable(this.arrowDrawable);
                this.curArrow = this.arrowDrawable;
            }
            if (z9 && this.needHaptic && this.isWidgetVisible) {
                playVibratorEffect();
            }
        } else if (f10 > 176.0f && f10 < 184.0f) {
            if (!n.d(this.curDrawable, this.dSouthDrawable)) {
                this.directionIv.setImageDrawable(this.dSouthDrawable);
                this.curDrawable = this.dSouthDrawable;
            }
            if (!n.d(this.curArrow, this.arrowDrawable)) {
                this.arrowIv.setImageDrawable(this.arrowDrawable);
                this.curArrow = this.arrowDrawable;
            }
            if (z9 && this.needHaptic && this.isWidgetVisible) {
                playVibratorEffect();
            }
        } else if (f10 <= 266.0f || f10 >= 274.0f) {
            this.needHaptic = true;
            if (!n.d(this.curDrawable, this.dAllDrawable)) {
                this.directionIv.setImageDrawable(this.dAllDrawable);
                this.curDrawable = this.dAllDrawable;
            }
            if (!n.d(this.curArrow, this.arrowDrawable)) {
                this.arrowIv.setImageDrawable(this.arrowDrawable);
                this.curArrow = this.arrowDrawable;
            }
        } else {
            if (!n.d(this.curDrawable, this.dWestDrawable)) {
                this.directionIv.setImageDrawable(this.dWestDrawable);
                this.curDrawable = this.dWestDrawable;
            }
            if (!n.d(this.curArrow, this.arrowDrawable)) {
                this.arrowIv.setImageDrawable(this.arrowDrawable);
                this.curArrow = this.arrowDrawable;
            }
            if (z9 && this.needHaptic && this.isWidgetVisible) {
                playVibratorEffect();
            }
        }
        if (Math.abs(f10 - this.preDegree) < 350.0f) {
            startAnimation(f10, this.animDuration);
        } else {
            startAnimation(f10, 0L);
        }
    }

    @Override // com.nothing.cardwidget.RemoteServiceView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.animator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        n.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        this.isWidgetVisible = i10 == 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompassView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompassView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        n.h(context, "context");
    }

    public /* synthetic */ CompassView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        this.needHaptic = true;
        this.isWidgetVisible = true;
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attributeSet, N.i(v.a(Integer.valueOf(c0120a.c(context, "arrow")), Integer.valueOf(R.attr.arrow)), v.a(Integer.valueOf(c0120a.c(context, "arrowNorth")), Integer.valueOf(R.attr.arrowNorth)), v.a(Integer.valueOf(c0120a.c(context, "compassBg")), Integer.valueOf(R.attr.compassBg)), v.a(Integer.valueOf(c0120a.c(context, "directionAll")), Integer.valueOf(R.attr.directionAll)), v.a(Integer.valueOf(c0120a.c(context, "directionEast")), Integer.valueOf(R.attr.directionEast)), v.a(Integer.valueOf(c0120a.c(context, "directionWest")), Integer.valueOf(R.attr.directionWest)), v.a(Integer.valueOf(c0120a.c(context, "directionSouth")), Integer.valueOf(R.attr.directionSouth)), v.a(Integer.valueOf(c0120a.c(context, "directionNorth")), Integer.valueOf(R.attr.directionNorth)), v.a(Integer.valueOf(c0120a.c(context, "animDuration")), Integer.valueOf(R.attr.animDuration)))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == R.attr.arrow) {
                this.arrowDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.arrowNorth) {
                this.arrowNorthDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.compassBg) {
                this.compassBgDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.directionAll) {
                this.dAllDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.directionEast) {
                this.dEastDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.directionWest) {
                this.dWestDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.directionSouth) {
                this.dSouthDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.directionNorth) {
                this.dNorthDrawable = attributeSet != null ? J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue()) : null;
            } else if (iIntValue == R.attr.animDuration) {
                this.animDuration = attributeSet != null ? Long.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 20)).longValue() : 20L;
            }
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.compass, (ViewGroup) this, false);
        viewInflate.setBackground(this.compassBgDrawable);
        this.directionIv = (ImageView) viewInflate.findViewById(R.id.iv_directions);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_arrow);
        this.arrowIv = imageView;
        imageView.setImageDrawable(this.arrowDrawable);
        addView(viewInflate);
    }
}
