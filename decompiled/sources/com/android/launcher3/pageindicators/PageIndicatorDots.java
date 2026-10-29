package com.android.launcher3.pageindicators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.IntProperty;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.android.launcher3.n;
import com.android.launcher3.o;
import com.android.launcher3.w;

/* JADX INFO: loaded from: classes.dex */
public class PageIndicatorDots extends View {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int f15661I = ViewConfiguration.getScrollDefaultDelay();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final RectF f15662J = new RectF();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final FloatProperty f15663K = new a("current_position");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final IntProperty f15664L = new b("pagination_alpha");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f15665A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f15666B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f15667C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f15668D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ObjectAnimator f15669E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ObjectAnimator f15670F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float[] f15671G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Runnable f15672H;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Paint f15673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f15674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f15675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f15676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f15677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f15678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f15679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f15680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f15681y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f15682z;

    class a extends FloatProperty {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(PageIndicatorDots pageIndicatorDots) {
            return Float.valueOf(pageIndicatorDots.f15665A);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(PageIndicatorDots pageIndicatorDots, float f10) {
            pageIndicatorDots.f15665A = f10;
            pageIndicatorDots.invalidate();
            pageIndicatorDots.invalidateOutline();
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    class b extends IntProperty {
        b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(PageIndicatorDots pageIndicatorDots) {
            return Integer.valueOf(pageIndicatorDots.f15673q.getAlpha());
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(PageIndicatorDots pageIndicatorDots, int i10) {
            pageIndicatorDots.f15673q.setAlpha(i10);
            pageIndicatorDots.invalidate();
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
            super.set(obj, num);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PageIndicatorDots.this.f15670F = null;
        }
    }

    private class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f15684a;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f15684a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f15684a) {
                return;
            }
            if (PageIndicatorDots.this.f15681y) {
                PageIndicatorDots.this.p();
            }
            PageIndicatorDots.this.f15669E = null;
            PageIndicatorDots pageIndicatorDots = PageIndicatorDots.this;
            pageIndicatorDots.o(pageIndicatorDots.f15666B);
        }

        private d() {
            this.f15684a = false;
        }
    }

    private class e extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (PageIndicatorDots.this.f15671G == null) {
                RectF activeRect = PageIndicatorDots.this.getActiveRect();
                outline.setRoundRect((int) activeRect.left, (int) activeRect.top, (int) activeRect.right, (int) activeRect.bottom, PageIndicatorDots.this.f15675s);
            }
        }

        private e() {
        }
    }

    public PageIndicatorDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getActiveRect() {
        float f10 = this.f15665A;
        float f11 = (int) f10;
        float f12 = f10 - f11;
        float f13 = this.f15675s * 2.0f;
        float width = ((getWidth() / 2.0f) - (this.f15676t * ((this.f15678v - 1.0f) / 2.0f))) - this.f15675s;
        RectF rectF = f15662J;
        rectF.top = (getHeight() * 0.5f) - this.f15675s;
        rectF.bottom = (getHeight() * 0.5f) + this.f15675s;
        float f14 = this.f15676t;
        float f15 = width + (f11 * f14);
        rectF.left = f15;
        float f16 = f13 + f15;
        rectF.right = f16;
        if (f12 < 0.5f) {
            rectF.right = f16 + (f12 * f14 * 2.0f);
        } else {
            rectF.right = f16 + f14;
            rectF.left = f15 + ((f12 - 0.5f) * f14 * 2.0f);
        }
        if (this.f15677u) {
            float fWidth = rectF.width();
            float width2 = getWidth() - rectF.left;
            rectF.right = width2;
            rectF.left = width2 - fWidth;
        }
        return rectF;
    }

    private void n(int i10) {
        if (i10 == this.f15682z) {
            return;
        }
        ObjectAnimator objectAnimator = this.f15670F;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, f15664L, i10);
        this.f15670F = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(i10 < this.f15682z ? 167L : 83L);
        this.f15670F.addListener(new c());
        this.f15670F.start();
        this.f15682z = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(float f10) {
        this.f15666B = f10;
        if (Math.abs(this.f15665A - f10) < 0.1f) {
            this.f15665A = this.f15666B;
        }
        if (this.f15669E != null || Float.compare(this.f15665A, this.f15666B) == 0) {
            return;
        }
        float f11 = this.f15665A;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f15663K, f11 > this.f15666B ? f11 - 0.5f : f11 + 0.5f);
        this.f15669E = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new d());
        this.f15669E.setDuration(150L);
        this.f15669E.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.f15674r.removeCallbacksAndMessages(null);
        this.f15674r.postDelayed(this.f15672H, f15661I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        n(0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f15678v < 2) {
            return;
        }
        int i10 = 0;
        if (this.f15681y && this.f15680x == 0) {
            this.f15673q.setAlpha(0);
            return;
        }
        float f10 = this.f15676t;
        float width = (getWidth() / 2.0f) - (this.f15676t * ((this.f15678v - 1.0f) / 2.0f));
        float f11 = this.f15675s;
        float width2 = (width - f11) + f11;
        float height = getHeight() / 2;
        if (this.f15671G != null) {
            if (this.f15677u) {
                width2 = getWidth() - width2;
                f10 = -f10;
            }
            while (i10 < this.f15671G.length) {
                this.f15673q.setAlpha(i10 == this.f15679w ? 255 : Optimizer.OPTIMIZATION_GRAPH_WRAP);
                canvas.drawCircle(width2, height, this.f15675s * this.f15671G[i10], this.f15673q);
                width2 += f10;
                i10++;
            }
            return;
        }
        int alpha = this.f15673q.getAlpha();
        this.f15673q.setAlpha((int) (alpha * 0.5f));
        while (i10 < this.f15678v) {
            canvas.drawCircle(width2, height, this.f15675s, this.f15673q);
            width2 += f10;
            i10++;
        }
        this.f15673q.setAlpha(alpha);
        RectF activeRect = getActiveRect();
        float f12 = this.f15675s;
        canvas.drawRoundRect(activeRect, f12, f12, this.f15673q);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getMode(i10) == 1073741824 ? View.MeasureSpec.getSize(i10) : (int) (((this.f15678v * 3) + 2) * this.f15675s), View.MeasureSpec.getMode(i11) == 1073741824 ? View.MeasureSpec.getSize(i11) : (int) (this.f15675s * 4.0f));
    }

    public void r(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            f15663K.set(this, Float.valueOf(this.f15679w));
            return;
        }
        if (this.f15678v > 1 && !this.f15667C) {
            if (this.f15681y) {
                n(255);
            }
            this.f15680x = i11;
            int i12 = i11 / (this.f15678v - 1);
            int i13 = i12 == 0 ? 0 : i10 / i12;
            int i14 = i13 * i12;
            int i15 = i14 + i12;
            float f10 = i12 * 0.1f;
            float f11 = i10;
            if (f11 < i14 + f10) {
                o(i13);
                if (this.f15681y) {
                    p();
                    return;
                }
                return;
            }
            if (f11 > i15 - f10) {
                o(i13 + 1);
                if (this.f15681y) {
                    p();
                    return;
                }
                return;
            }
            o(i13 + 0.5f);
            if (this.f15681y) {
                this.f15674r.removeCallbacksAndMessages(null);
            }
        }
    }

    public void setActiveMarker(int i10) {
        if (this.f15668D) {
            i10 /= 2;
        }
        if (this.f15679w != i10) {
            this.f15679w = i10;
        }
    }

    public void setCurrentPosition(int i10) {
        setActiveMarker(i10);
        f15663K.set(this, Float.valueOf(this.f15679w));
    }

    public void setMarkersCount(int i10) {
        int i11;
        if (i10 == this.f15678v) {
            return;
        }
        this.f15678v = i10;
        if (i10 > 0 && i10 == (i11 = this.f15679w)) {
            int i12 = i11 - 1;
            this.f15679w = i12;
            f15663K.set(this, Float.valueOf(i12));
        }
        requestLayout();
    }

    public void setPaintColor(int i10) {
        this.f15673q.setColor(i10);
    }

    public void setShouldAutoHide(boolean z9) {
        this.f15681y = z9;
        if (z9 && this.f15673q.getAlpha() > 0) {
            p();
        } else {
            if (z9) {
                return;
            }
            this.f15674r.removeCallbacksAndMessages(null);
        }
    }

    public PageIndicatorDots(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15674r = new Handler(Looper.getMainLooper());
        this.f15672H = new Runnable() { // from class: D2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f713q.q();
            }
        };
        Paint paint = new Paint(1);
        this.f15673q = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f15673q.setColor(p171r0.a.b(context, n.f15632c));
        float dimension = getResources().getDimension(o.f15647n) / 2.0f;
        this.f15675s = dimension;
        this.f15676t = dimension * 4.0f;
        setOutlineProvider(new e());
        this.f15677u = w.g(getResources());
    }
}
