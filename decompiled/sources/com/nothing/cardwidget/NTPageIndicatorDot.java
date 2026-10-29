package com.nothing.cardwidget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class NTPageIndicatorDot extends View implements P5.a {
    public static final Companion Companion = new Companion(null);
    private static final long FADE_DELAY = 1000;
    private static final int ORIENTATION_HORIZONTAL = 0;
    private static final int ORIENTATION_VERTICAL = 1;
    private static final String TAG = "NTPageIndicatorDot";
    private final NTPageIndicatorDot$adapterDataObserver$1 adapterDataObserver;
    private final Runnable fadeout;
    private boolean mAppearBegin;
    private final Paint mDefaultPaint;
    private float mDotMargin;
    private final ArrayList<PointF> mDotPosition;
    private float mDotRadius;
    private int mFadeDelay;
    private boolean mFadeDots;
    private Animation mFadeOutAnimation;
    private boolean mIsCyclePlay;
    private int mOrientation;
    private int mPageCount;
    private int mPosition;
    private float mPositionOffset;
    private final boolean mRTL;
    private final Paint mSelectPaint;
    private ViewPager2 mViewPager;
    private final NTPageIndicatorDot$pageObserver$1 pageObserver;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.nothing.cardwidget.NTPageIndicatorDot$adapterDataObserver$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.nothing.cardwidget.NTPageIndicatorDot$pageObserver$1] */
    public NTPageIndicatorDot(Context context, AttributeSet attrs) {
        super(context, attrs);
        n.h(context, "context");
        n.h(attrs, "attrs");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.mDefaultPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.mSelectPaint = paint2;
        this.mAppearBegin = true;
        this.mPosition = -1;
        this.mPositionOffset = -1.0f;
        this.mDotPosition = new ArrayList<>();
        this.mPageCount = -1;
        this.fadeout = new Runnable() { // from class: com.nothing.cardwidget.c
            @Override // java.lang.Runnable
            public final void run() {
                NTPageIndicatorDot.fadeout$lambda$2(this.f18037q);
            }
        };
        this.adapterDataObserver = new RecyclerView.AdapterDataObserver() { // from class: com.nothing.cardwidget.NTPageIndicatorDot$adapterDataObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i10, int i11) {
                this.this$0.invalidateDot();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i10, int i11) {
                this.this$0.invalidateDot();
            }
        };
        this.pageObserver = new ViewPager2.OnPageChangeCallback() { // from class: com.nothing.cardwidget.NTPageIndicatorDot$pageObserver$1
            private final int getScrolledPosition(int i10) {
                return (!this.this$0.mIsCyclePlay || this.this$0.mPageCount == -1) ? i10 : i10 % this.this$0.mPageCount;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i10) {
                if (this.this$0.mFadeDots) {
                    if (i10 != 0) {
                        this.this$0.cancelFadeout();
                        return;
                    }
                    Handler handler = this.this$0.getHandler();
                    if (handler != null) {
                        handler.postDelayed(this.this$0.fadeout, this.this$0.mFadeDelay);
                    }
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i10, float f10, int i11) {
                int scrolledPosition = getScrolledPosition(i10);
                if (this.this$0.mPosition == scrolledPosition && this.this$0.mPositionOffset == f10) {
                    return;
                }
                this.this$0.mPosition = scrolledPosition;
                this.this$0.mPositionOffset = f10;
                this.this$0.invalidate();
            }
        };
        this.mRTL = getResources().getConfiguration().getLayoutDirection() == 1;
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attrs, N.i(v.a(Integer.valueOf(c0120a.c(context, "dotRadius")), Integer.valueOf(R.attr.dotRadius)), v.a(Integer.valueOf(c0120a.c(context, "dotMargin")), Integer.valueOf(R.attr.dotMargin)), v.a(Integer.valueOf(c0120a.c(context, "dotFadeDots")), Integer.valueOf(R.attr.dotFadeDots)), v.a(Integer.valueOf(c0120a.c(context, "dotOrientation")), Integer.valueOf(R.attr.dotOrientation)), v.a(Integer.valueOf(c0120a.c(context, "dotFadeDelay")), Integer.valueOf(R.attr.dotFadeDelay)), v.a(Integer.valueOf(c0120a.c(context, "dotAppearBegin")), Integer.valueOf(R.attr.dotAppearBegin)), v.a(Integer.valueOf(c0120a.c(context, "dotDefaultColor")), Integer.valueOf(R.attr.dotDefaultColor)), v.a(Integer.valueOf(c0120a.c(context, "dotSelectColor")), Integer.valueOf(R.attr.dotSelectColor)))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == R.attr.dotRadius) {
                this.mDotRadius = J5.a.f3535a.f(context, attrs, ((Number) entry.getValue()).intValue());
            } else if (iIntValue == R.attr.dotMargin) {
                this.mDotMargin = J5.a.f3535a.f(context, attrs, ((Number) entry.getValue()).intValue());
            } else if (iIntValue == R.attr.dotFadeDots) {
                this.mFadeDots = J5.a.f3535a.d(context, attrs, ((Number) entry.getValue()).intValue(), false);
            } else if (iIntValue == R.attr.dotOrientation) {
                this.mOrientation = J5.a.f3535a.i(context, attrs, ((Number) entry.getValue()).intValue(), 0);
            } else if (iIntValue == R.attr.dotFadeDelay) {
                this.mFadeDelay = 1000;
            } else if (iIntValue == R.attr.dotAppearBegin) {
                this.mAppearBegin = J5.a.f3535a.d(context, attrs, ((Number) entry.getValue()).intValue(), true);
            } else if (iIntValue == R.attr.dotDefaultColor) {
                this.mDefaultPaint.setColor(J5.a.f3535a.e(context, attrs, ((Number) entry.getValue()).intValue()));
            } else if (iIntValue == R.attr.dotSelectColor) {
                this.mSelectPaint.setColor(J5.a.f3535a.e(context, attrs, ((Number) entry.getValue()).intValue()));
            }
        }
        hideIndicator();
    }

    private final void calculatePosition() {
        RecyclerView.Adapter adapter;
        this.mDotPosition.clear();
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) {
            return;
        }
        int itemCount = getItemCount(adapter);
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < itemCount; i10++) {
            this.mDotPosition.add(new PointF(f10, f11));
            if (i10 < itemCount - 1) {
                int i11 = this.mOrientation;
                f10 += i11 == 0 ? (2 * this.mDotRadius) + this.mDotMargin : 0.0f;
                f11 += i11 == 1 ? (2 * this.mDotRadius) + this.mDotMargin : 0.0f;
            }
        }
        float f12 = 2;
        float width = (getWidth() - f10) / f12;
        float height = (getHeight() - f11) / f12;
        Iterator<PointF> it = this.mDotPosition.iterator();
        n.g(it, "iterator(...)");
        while (it.hasNext()) {
            PointF next = it.next();
            n.g(next, "next(...)");
            next.offset(width, height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelFadeout() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.fadeout);
        }
        Animation animation = this.mFadeOutAnimation;
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        Animation animation2 = this.mFadeOutAnimation;
        if (animation2 != null) {
            animation2.cancel();
        }
        showIndicator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeout$lambda$2(NTPageIndicatorDot this$0) {
        n.h(this$0, "this$0");
        this$0.startFadeout();
    }

    private final int getItemCount(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        int i10;
        return (!this.mIsCyclePlay || (i10 = this.mPageCount) == -1) ? adapter.getItemCount() : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideIndicator() {
        setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateDot() {
        calculatePosition();
        invalidate();
    }

    private final void showIndicator() {
        setAlpha(1.0f);
    }

    private final void startFadeout() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.fadeout);
        }
        Animation animation = this.mFadeOutAnimation;
        if (animation == null) {
            Context context = getContext();
            J5.a.C0120a c0120a = J5.a.f3535a;
            Context context2 = getContext();
            n.g(context2, "getContext(...)");
            this.mFadeOutAnimation = AnimationUtils.loadAnimation(context, c0120a.a(context2, "page_indicator_fade_out"));
        } else {
            n.e(animation);
            animation.setAnimationListener(null);
            Animation animation2 = this.mFadeOutAnimation;
            n.e(animation2);
            animation2.cancel();
        }
        startAnimation(this.mFadeOutAnimation);
        Animation animation3 = this.mFadeOutAnimation;
        n.e(animation3);
        animation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.nothing.cardwidget.NTPageIndicatorDot.startFadeout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation4) {
                NTPageIndicatorDot.this.hideIndicator();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation4) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation4) {
            }
        });
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hideIndicator();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        Canvas canvas2;
        n.h(canvas, "canvas");
        int size = this.mDotPosition.size();
        int i11 = 0;
        while (i11 < size) {
            PointF pointF = this.mDotPosition.get(i11);
            n.g(pointF, "get(...)");
            PointF pointF2 = pointF;
            canvas.drawCircle(pointF2.x, pointF2.y, this.mDotRadius, this.mDefaultPaint);
            int i12 = this.mPosition;
            if (i11 == i12) {
                f10 = 1.0f - this.mPositionOffset;
            } else {
                if (i11 == i12 + 1) {
                    f10 = this.mPositionOffset;
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    float f11 = pointF2.x;
                    float f12 = this.mDotRadius;
                    float f13 = f11 - f12;
                    float f14 = pointF2.y;
                    float f15 = f14 - f12;
                    float f16 = f11 + f12;
                    float f17 = f14 + f12;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(f13, f15, f16, f17, i10);
                    canvas2.drawCircle(pointF2.x, pointF2.y, this.mDotRadius, this.mSelectPaint);
                    canvas2.restore();
                } else {
                    canvas2 = canvas;
                }
                i11++;
                canvas = canvas2;
            }
            i10 = (int) (f10 * 255);
            if (i10 > 0) {
                float f18 = pointF2.x;
                float f19 = this.mDotRadius;
                float f110 = f18 - f19;
                float f111 = pointF2.y;
                float f112 = f111 - f19;
                float f113 = f18 + f19;
                float f114 = f111 + f19;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f110, f112, f113, f114, i10);
                canvas2.drawCircle(pointF2.x, pointF2.y, this.mDotRadius, this.mSelectPaint);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            i11++;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            calculatePosition();
        }
    }

    public final void refreshDotIfItemCountChanged() {
        RecyclerView.Adapter adapter;
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) {
            return;
        }
        if (this.mIsCyclePlay && this.mPageCount != this.mDotPosition.size()) {
            invalidateDot();
        } else if (adapter.getItemCount() != this.mDotPosition.size()) {
            invalidateDot();
        }
    }

    public final void setCyclePlay(boolean z9) {
        this.mIsCyclePlay = z9;
    }

    public final void setPageCount(int i10) {
        this.mPageCount = i10;
    }

    public final void setPageListener(int i10) {
        RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            Log.w(TAG, "no parent view");
            return;
        }
        if (this.mViewPager != null) {
            Log.e(TAG, "Please check: why register too much times.");
        }
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.findViewById(i10);
        this.mViewPager = viewPager2;
        if (viewPager2 != null && (adapter = viewPager2.getAdapter()) != null && !adapter.hasObservers() && (adapter2 = viewPager2.getAdapter()) != null) {
            adapter2.registerAdapterDataObserver(this.adapterDataObserver);
        }
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.pageObserver);
        }
        if (viewPager2 != null) {
            viewPager2.registerOnPageChangeCallback(this.pageObserver);
        }
        calculatePosition();
    }

    public void showIndicatorAnimator() {
        if (this.mFadeDots) {
            cancelFadeout();
            Handler handler = getHandler();
            if (handler != null) {
                handler.postDelayed(this.fadeout, this.mFadeDelay);
            }
        }
    }
}
