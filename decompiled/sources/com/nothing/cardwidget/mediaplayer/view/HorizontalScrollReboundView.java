package com.nothing.cardwidget.mediaplayer.view;

import F8.AbstractC0816i;
import F8.L;
import android.content.Context;
import android.os.VibrationEffect;
import android.os.VibratorManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.nothing.cardwidget.IHorizontalScrollableView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HorizontalScrollReboundView extends FrameLayout implements IHorizontalScrollableView {
    private static final int REBOUND_ANIM_DURATION = 400;
    private static final int SCROLL_LIMIT_THRESHOLD = 160;
    private static final int SCROLL_THRESHOLD = 226;
    private static final String TAG = "HorizontalScroll";
    private boolean beginMoving;
    private boolean disableScroll;
    private float displayRatio;
    private float downX;
    private float downY;
    private final p079h8.h effectClick$delegate;
    private final p079h8.h effectDoubleClick$delegate;
    private boolean isHorizontalSliding;
    private boolean isSlidingToRight;
    private boolean isVerticalSliding;
    private float lastX;
    private int mActivePointerId;
    private Scroller rollbackScroller;
    private float scrollStartX;
    private Scroller smoothScroller;
    private boolean supportLeft;
    private boolean supportRight;
    private double touchSlop;
    private VibratorManager vibratorManager;
    public static final Companion Companion = new Companion(null);
    private static final PathInterpolator AGGRESSIVE_EASE = new PathInterpolator(0.44f, 0.0f, 0.0f, 1.0f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardwidget.mediaplayer.view.HorizontalScrollReboundView$onSlidingSwitch$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.mediaplayer.view.HorizontalScrollReboundView$onSlidingSwitch$1", f = "HorizontalScrollReboundView.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p219v8.p {
        final /* synthetic */ boolean $switchRight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z9, p129m8.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$switchRight = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e<p079h8.A> create(Object obj, p129m8.e<?> eVar) {
            return HorizontalScrollReboundView.this.new AnonymousClass1(this.$switchRight, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e<? super p079h8.A> eVar) {
            return ((AnonymousClass1) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            HorizontalScrollReboundView.this.vibrator(this.$switchRight);
            return p079h8.A.f21846a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollReboundView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VibrationEffect effectClick_delegate$lambda$0() {
        return VibrationEffect.createPredefined(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VibrationEffect effectDoubleClick_delegate$lambda$1() {
        return VibrationEffect.createPredefined(1);
    }

    private final VibrationEffect getEffectClick() {
        return (VibrationEffect) this.effectClick$delegate.getValue();
    }

    private final VibrationEffect getEffectDoubleClick() {
        return (VibrationEffect) this.effectDoubleClick$delegate.getValue();
    }

    private final int getMaxScroll() {
        float f10;
        float f11;
        boolean z9 = this.isSlidingToRight;
        if (!(z9 && this.supportRight) && (z9 || !this.supportLeft)) {
            f10 = SCROLL_LIMIT_THRESHOLD;
            f11 = this.displayRatio;
        } else {
            f10 = SCROLL_THRESHOLD;
            f11 = this.displayRatio;
        }
        return (int) (f10 * f11);
    }

    private final int getSwitchThreshold() {
        return (int) (((double) getMaxScroll()) * 0.6d);
    }

    private final void runRollbackAnim(int i10) {
        this.rollbackScroller.startScroll(i10, 0, -i10, 0, REBOUND_ANIM_DURATION);
        invalidate();
    }

    private final void smoothScrollTo(int i10) {
        Scroller scroller = this.smoothScroller;
        scroller.startScroll(scroller.getFinalX(), 0, i10, 0, 0);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vibrator(boolean z9) {
        if (z9) {
            this.vibratorManager.getDefaultVibrator().vibrate(this.supportRight ? getEffectClick() : getEffectDoubleClick());
        } else {
            this.vibratorManager.getDefaultVibrator().vibrate(this.supportLeft ? getEffectClick() : getEffectDoubleClick());
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.rollbackScroller;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
        Scroller scroller2 = this.smoothScroller;
        if (scroller2.computeScrollOffset()) {
            scrollTo(scroller2.getCurrX(), scroller2.getCurrY());
            postInvalidate();
        }
    }

    public final void disableHorizontalScroll(boolean z9) {
        this.disableScroll = z9;
    }

    @Override // com.nothing.cardwidget.IHorizontalScrollableView
    public boolean isHScrollable() {
        return !this.disableScroll;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int iFindPointerIndex;
        kotlin.jvm.internal.n.h(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.mActivePointerId = ev.getPointerId(ev.getActionIndex());
            if (!this.rollbackScroller.isFinished()) {
                this.rollbackScroller.abortAnimation();
            }
            this.smoothScroller.setFinalX(0);
            this.downX = ev.getX();
            this.downY = ev.getY();
            this.isHorizontalSliding = false;
            this.isVerticalSliding = false;
        } else if (actionMasked == 2) {
            if (!this.disableScroll && (iFindPointerIndex = ev.findPointerIndex(this.mActivePointerId)) != -1) {
                float x9 = ev.getX(iFindPointerIndex);
                float y9 = ev.getY(iFindPointerIndex);
                float fAbs = Math.abs(x9 - this.downX);
                float fAbs2 = Math.abs(y9 - this.downY);
                double d10 = fAbs;
                double d11 = this.touchSlop;
                if (d10 > d11 || fAbs2 > d11) {
                    if (d10 > d11 && !this.isVerticalSliding) {
                        this.isHorizontalSliding = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    if (fAbs2 > this.touchSlop) {
                        this.isVerticalSliding = true;
                    }
                    return this.isHorizontalSliding;
                }
            }
            return super.onInterceptTouchEvent(ev);
        }
        return super.onInterceptTouchEvent(ev);
    }

    public void onSlidingSwitch(boolean z9) {
        AbstractC0816i.d(O5.g.j(), null, null, new AnonymousClass1(z9, null), 3, null);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int maxScroll;
        int maxScroll2;
        int iB;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (iFindPointerIndex == -1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            float x9 = motionEvent.getX(iFindPointerIndex);
            if (this.isHorizontalSliding) {
                if (this.beginMoving) {
                    this.scrollStartX = x9;
                    this.lastX = x9;
                    this.beginMoving = false;
                }
                float f10 = x9 - this.lastX;
                float f11 = this.scrollStartX;
                this.isSlidingToRight = x9 - f11 > 0.0f;
                if (Math.abs(f11 - x9) < getMaxScroll()) {
                    smoothScrollTo(-p239x8.a.b(f10));
                } else {
                    if (this.smoothScroller.getFinalX() > 0) {
                        iB = getMaxScroll() - this.smoothScroller.getFinalX();
                    } else {
                        if (this.smoothScroller.getFinalX() < 0) {
                            maxScroll2 = getMaxScroll() + this.smoothScroller.getFinalX();
                        } else {
                            if (f10 > 0.0f) {
                                maxScroll2 = getMaxScroll();
                            } else {
                                maxScroll = getMaxScroll();
                            }
                            iB = p239x8.a.b(maxScroll);
                        }
                        maxScroll = -maxScroll2;
                        iB = p239x8.a.b(maxScroll);
                    }
                    smoothScrollTo(iB);
                }
                this.lastX = x9;
                return true;
            }
        } else if ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 1)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.mActivePointerId = -1;
            this.beginMoving = true;
            this.isSlidingToRight = false;
            if (!this.smoothScroller.isFinished()) {
                this.smoothScroller.abortAnimation();
            }
            runRollbackAnim(this.smoothScroller.getFinalX());
            float x10 = motionEvent.getX() - this.scrollStartX;
            if (Math.abs(x10) > getSwitchThreshold()) {
                onSlidingSwitch(x10 > 0.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDisplayRatio(float f10) {
        this.displayRatio = f10;
    }

    public final void supportSlideLeft(boolean z9) {
        this.supportLeft = z9;
    }

    public final void supportSlideRight(boolean z9) {
        this.supportRight = z9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollReboundView(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
    }

    public /* synthetic */ HorizontalScrollReboundView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollReboundView(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(attrs, "attrs");
        this.supportLeft = true;
        this.supportRight = true;
        this.mActivePointerId = -1;
        this.displayRatio = 1.0f;
        this.beginMoving = true;
        this.effectClick$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.mediaplayer.view.a
            @Override // p219v8.a
            public final Object invoke() {
                return HorizontalScrollReboundView.effectClick_delegate$lambda$0();
            }
        });
        this.effectDoubleClick$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.mediaplayer.view.b
            @Override // p219v8.a
            public final Object invoke() {
                return HorizontalScrollReboundView.effectDoubleClick_delegate$lambda$1();
            }
        });
        this.rollbackScroller = new Scroller(context, AGGRESSIVE_EASE);
        this.smoothScroller = new Scroller(context);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Object systemService = context.getSystemService("vibrator_manager");
        kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
        this.vibratorManager = (VibratorManager) systemService;
    }
}
