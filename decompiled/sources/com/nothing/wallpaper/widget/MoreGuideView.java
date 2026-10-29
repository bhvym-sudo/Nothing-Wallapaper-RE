package com.nothing.wallpaper.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.MoreGuideView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class MoreGuideView extends LinearLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f19144y = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PathInterpolator f19145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final PathInterpolator f19146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f19147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f19148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f19149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f19150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final d f19152x;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f19154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f19155c;

        b(ValueAnimator valueAnimator, ObjectAnimator objectAnimator) {
            this.f19154b = valueAnimator;
            this.f19155c = objectAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            MoreGuideView.this.k();
            this.f19154b.removeAllListeners();
            MoreGuideView.this.f19147s.remove(this.f19154b);
            MoreGuideView.this.f19147s.remove(this.f19155c);
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f19157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f19158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f19159d;

        c(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3) {
            this.f19157b = objectAnimator;
            this.f19158c = objectAnimator2;
            this.f19159d = objectAnimator3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            this.f19157b.start();
            MoreGuideView.this.f19148t.setVisibility(0);
            List list = MoreGuideView.this.f19147s;
            ObjectAnimator objectAnimator = this.f19157b;
            n.e(objectAnimator);
            list.add(objectAnimator);
            MoreGuideView.this.f19150v.setVisibility(4);
            MoreGuideView.this.f19147s.remove(this.f19158c);
            MoreGuideView.this.f19147s.remove(this.f19159d);
            this.f19159d.removeAllListeners();
            this.f19159d.removeAllUpdateListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            MoreGuideView.this.f19149u.setVisibility(0);
            MoreGuideView.this.f19150v.setVisibility(0);
        }
    }

    public static final class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            n.h(msg, "msg");
            super.handleMessage(msg);
            if (MoreGuideView.this.f19151w && msg.what == 1) {
                MoreGuideView.this.m();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoreGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f19152x.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.f19148t.getVisibility() == 0) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.nt_creative_icon_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.nt_creative_icon_height);
        this.f19149u.getLayoutParams().width = dimensionPixelSize2;
        this.f19149u.requestLayout();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f19150v, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(this.f19146r);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f19149u, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(this.f19146r);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f19148t, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(this.f19145q);
        objectAnimatorOfFloat3.setDuration(300L);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(dimensionPixelSize2, dimensionPixelSize);
        valueAnimatorOfInt.setInterpolator(this.f19145q);
        valueAnimatorOfInt.setDuration(600L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: T7.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MoreGuideView.n(this.f7713a, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new b(valueAnimatorOfInt, objectAnimatorOfFloat3));
        objectAnimatorOfFloat2.addListener(new c(objectAnimatorOfFloat3, objectAnimatorOfFloat, objectAnimatorOfFloat2));
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: T7.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MoreGuideView.o(valueAnimatorOfInt, this, valueAnimator);
            }
        });
        objectAnimatorOfFloat.start();
        objectAnimatorOfFloat2.start();
        List list = this.f19147s;
        n.e(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
        List list2 = this.f19147s;
        n.e(objectAnimatorOfFloat2);
        list2.add(objectAnimatorOfFloat2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MoreGuideView moreGuideView, ValueAnimator animation) {
        n.h(animation, "animation");
        ViewGroup.LayoutParams layoutParams = moreGuideView.f19149u.getLayoutParams();
        Object animatedValue = animation.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        moreGuideView.f19149u.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ValueAnimator valueAnimator, MoreGuideView moreGuideView, ValueAnimator animation) {
        n.h(animation, "animation");
        if (animation.getAnimatedFraction() > 0.3f) {
            valueAnimator.start();
            List list = moreGuideView.f19147s;
            n.e(valueAnimator);
            list.add(valueAnimator);
        }
    }

    public final void j() {
        this.f19148t.setVisibility(8);
        this.f19149u.setVisibility(8);
        this.f19150v.setAlpha(1.0f);
        this.f19150v.setVisibility(0);
    }

    public final void l() {
        k();
        this.f19152x.sendEmptyMessageDelayed(1, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19151w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19151w = false;
        List list = this.f19147s;
        for (Animator animator : AbstractC1444s.o0(list, list.size())) {
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
            animator.removeAllListeners();
            animator.cancel();
        }
        k();
    }

    public /* synthetic */ MoreGuideView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreGuideView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19145q = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
        this.f19146r = new PathInterpolator(0.4f, 0.0f, 0.4f, 1.0f);
        this.f19147s = new ArrayList();
        this.f19152x = new d(Looper.getMainLooper());
        LayoutInflater.from(context).inflate(R.layout.nt_layout_more_guide, (ViewGroup) this, true);
        this.f19148t = (TextView) requireViewById(R.id.text_ai_wallpaper);
        this.f19149u = (ImageView) requireViewById(R.id.img_ai_wallpaper);
        this.f19150v = (ImageView) requireViewById(R.id.img_more_wallpapers);
    }
}
