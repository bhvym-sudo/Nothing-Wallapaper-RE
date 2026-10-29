package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f17179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f17180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f17181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f17182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f17183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final r f17184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f17185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17187l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f17196u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f17197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Behavior f17198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AccessibilityManager f17199x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final TimeInterpolator f17175z = p235x4.a.f29940b;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final TimeInterpolator f17169A = p235x4.a.f29939a;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final TimeInterpolator f17170B = p235x4.a.f29942d;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final boolean f17172D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f17173E = {p225w4.a.f28683R};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f17174F = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final Handler f17171C = new Handler(Looper.getMainLooper(), new h());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17188m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f17189n = new i();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    com.google.android.material.snackbar.c.b f17200y = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private final q f17201B = new q(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void U(BaseTransientBottomBar baseTransientBottomBar) {
            this.f17201B.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f17201B.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f17201B.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17202a;

        a(int i10) {
            this.f17202a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f17202a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f17184i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f17184i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f17184i.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f17185j.a(BaseTransientBottomBar.this.f17178c - BaseTransientBottomBar.this.f17176a, BaseTransientBottomBar.this.f17176a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17208b;

        e(int i10) {
            this.f17208b = i10;
            this.f17207a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f17172D) {
                H.S(BaseTransientBottomBar.this.f17184i, iIntValue - this.f17207a);
            } else {
                BaseTransientBottomBar.this.f17184i.setTranslationY(iIntValue);
            }
            this.f17207a = iIntValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17210a;

        f(int i10) {
            this.f17210a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.P(this.f17210a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f17185j.b(0, BaseTransientBottomBar.this.f17177b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17212a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f17172D) {
                H.S(BaseTransientBottomBar.this.f17184i, iIntValue - this.f17212a);
            } else {
                BaseTransientBottomBar.this.f17184i.setTranslationY(iIntValue);
            }
            this.f17212a = iIntValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).X();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).J(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f17184i == null || baseTransientBottomBar.f17183h == null) {
                return;
            }
            int iHeight = (com.google.android.material.internal.p.a(BaseTransientBottomBar.this.f17183h).height() - BaseTransientBottomBar.this.H()) + ((int) BaseTransientBottomBar.this.f17184i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f17194s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f17195t = baseTransientBottomBar2.f17194s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f17184i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f17174F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f17195t = baseTransientBottomBar3.f17194s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f17194s - iHeight;
            BaseTransientBottomBar.this.f17184i.requestLayout();
        }
    }

    class j implements InterfaceC1090w {
        j() {
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            BaseTransientBottomBar.this.f17190o = v9.i();
            BaseTransientBottomBar.this.f17191p = v9.j();
            BaseTransientBottomBar.this.f17192q = v9.k();
            BaseTransientBottomBar.this.d0();
            return v9;
        }
    }

    class k extends C1069a {
        k() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.a(1048576);
            dVar.m0(true);
        }

        @Override // androidx.core.view.C1069a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            BaseTransientBottomBar.this.x();
            return true;
        }
    }

    class l implements com.google.android.material.snackbar.c.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void b() {
            Handler handler = BaseTransientBottomBar.f17171C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void c(int i10) {
            Handler handler = BaseTransientBottomBar.f17171C;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.P(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.y(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f17200y);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.c.c().j(BaseTransientBottomBar.this.f17200y);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar = BaseTransientBottomBar.this.f17184i;
            if (rVar == null) {
                return;
            }
            if (rVar.getParent() != null) {
                BaseTransientBottomBar.this.f17184i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f17184i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.Z();
            } else {
                BaseTransientBottomBar.this.b0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q();
        }
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.material.snackbar.c.b f17222a;

        public q(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof r;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().j(this.f17222a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().k(this.f17222a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f17222a = baseTransientBottomBar.f17200y;
        }
    }

    protected static class r extends FrameLayout {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private static final View.OnTouchListener f17223B = new a();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private boolean f17224A;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private BaseTransientBottomBar f17225q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        N4.l f17226r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f17227s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final float f17228t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final float f17229u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f17230v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f17231w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ColorStateList f17232x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private PorterDuff.Mode f17233y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Rect f17234z;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected r(Context context, AttributeSet attributeSet) {
            super(Q4.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p225w4.k.f29078P5);
            int i10 = p225w4.k.f29141W5;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                H.o0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f17227s = typedArrayObtainStyledAttributes.getInt(p225w4.k.f29105S5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(p225w4.k.f29159Y5) || typedArrayObtainStyledAttributes.hasValue(p225w4.k.f29168Z5)) {
                this.f17226r = N4.l.e(context2, attributeSet, 0, 0).m();
            }
            this.f17228t = typedArrayObtainStyledAttributes.getFloat(p225w4.k.f29114T5, 1.0f);
            setBackgroundTintList(K4.c.a(context2, typedArrayObtainStyledAttributes, p225w4.k.f29123U5));
            setBackgroundTintMode(com.google.android.material.internal.n.h(typedArrayObtainStyledAttributes.getInt(p225w4.k.f29132V5, -1), PorterDuff.Mode.SRC_IN));
            this.f17229u = typedArrayObtainStyledAttributes.getFloat(p225w4.k.f29096R5, 1.0f);
            this.f17230v = typedArrayObtainStyledAttributes.getDimensionPixelSize(p225w4.k.f29087Q5, -1);
            this.f17231w = typedArrayObtainStyledAttributes.getDimensionPixelSize(p225w4.k.f29150X5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f17223B);
            setFocusable(true);
            if (getBackground() == null) {
                H.k0(this, d());
            }
        }

        private Drawable d() {
            int iK = D4.a.k(this, p225w4.a.f28712o, p225w4.a.f28709l, getBackgroundOverlayColorAlpha());
            N4.l lVar = this.f17226r;
            Drawable drawableW = lVar != null ? BaseTransientBottomBar.w(iK, lVar) : BaseTransientBottomBar.v(iK, getResources());
            if (this.f17232x == null) {
                return p201u0.a.r(drawableW);
            }
            Drawable drawableR = p201u0.a.r(drawableW);
            p201u0.a.o(drawableR, this.f17232x);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f17234z = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f17225q = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f17224A = true;
            viewGroup.addView(this);
            this.f17224A = false;
        }

        float getActionTextColorAlpha() {
            return this.f17229u;
        }

        int getAnimationMode() {
            return this.f17227s;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f17228t;
        }

        int getMaxInlineActionWidth() {
            return this.f17231w;
        }

        int getMaxWidth() {
            return this.f17230v;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f17225q;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
            H.d0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f17225q;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.N();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
            super.onLayout(z9, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f17225q;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f17230v > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f17230v;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f17227s = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f17232x != null) {
                drawable = p201u0.a.r(drawable.mutate());
                p201u0.a.o(drawable, this.f17232x);
                p201u0.a.p(drawable, this.f17233y);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f17232x = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = p201u0.a.r(getBackground().mutate());
                p201u0.a.o(drawableR, colorStateList);
                p201u0.a.p(drawableR, this.f17233y);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f17233y = mode;
            if (getBackground() != null) {
                Drawable drawableR = p201u0.a.r(getBackground().mutate());
                p201u0.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f17224A || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f17225q;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.d0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f17223B);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f17182g = viewGroup;
        this.f17185j = aVar;
        this.f17183h = context;
        com.google.android.material.internal.k.a(context);
        r rVar = (r) LayoutInflater.from(context).inflate(E(), viewGroup, false);
        this.f17184i = rVar;
        rVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(rVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(rVar.getMaxInlineActionWidth());
        }
        rVar.addView(view);
        H.i0(rVar, 1);
        H.q0(rVar, 1);
        H.p0(rVar, true);
        H.u0(rVar, new j());
        H.g0(rVar, new k());
        this.f17199x = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = p225w4.a.f28668C;
        this.f17178c = I4.f.f(context, i10, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.f17176a = I4.f.f(context, i10, 150);
        this.f17177b = I4.f.f(context, p225w4.a.f28669D, 75);
        int i11 = p225w4.a.f28676K;
        this.f17179d = I4.f.g(context, i11, f17169A);
        this.f17181f = I4.f.g(context, i11, f17170B);
        this.f17180e = I4.f.g(context, i11, f17175z);
    }

    private ValueAnimator D(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f17181f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int F() {
        int height = this.f17184i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f17184i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        int[] iArr = new int[2];
        this.f17184i.getLocationInWindow(iArr);
        return iArr[1] + this.f17184i.getHeight();
    }

    private boolean L() {
        ViewGroup.LayoutParams layoutParams = this.f17184i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).e() instanceof SwipeDismissBehavior);
    }

    private void R() {
        this.f17193r = u();
        d0();
    }

    private void T(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehaviorC = this.f17198w;
        if (swipeDismissBehaviorC == null) {
            swipeDismissBehaviorC = C();
        }
        if (swipeDismissBehaviorC instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorC).U(this);
        }
        swipeDismissBehaviorC.P(new n());
        fVar.n(swipeDismissBehaviorC);
        if (A() == null) {
            fVar.f12137g = 80;
        }
    }

    private boolean V() {
        return this.f17194s > 0 && !this.f17187l && L();
    }

    private void Y() {
        if (U()) {
            s();
            return;
        }
        if (this.f17184i.getParent() != null) {
            this.f17184i.setVisibility(0);
        }
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ValueAnimator valueAnimatorZ = z(0.0f, 1.0f);
        ValueAnimator valueAnimatorD = D(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorZ, valueAnimatorD);
        animatorSet.setDuration(this.f17176a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void a0(int i10) {
        ValueAnimator valueAnimatorZ = z(1.0f, 0.0f);
        valueAnimatorZ.setDuration(this.f17177b);
        valueAnimatorZ.addListener(new a(i10));
        valueAnimatorZ.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        int iF = F();
        if (f17172D) {
            H.S(this.f17184i, iF);
        } else {
            this.f17184i.setTranslationY(iF);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iF, 0);
        valueAnimator.setInterpolator(this.f17180e);
        valueAnimator.setDuration(this.f17178c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(iF));
        valueAnimator.start();
    }

    private void c0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, F());
        valueAnimator.setInterpolator(this.f17180e);
        valueAnimator.setDuration(this.f17178c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        ViewGroup.LayoutParams layoutParams = this.f17184i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f17174F, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f17184i.f17234z == null) {
            Log.w(f17174F, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f17184i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f17184i.f17234z.bottom + (A() != null ? this.f17193r : this.f17190o);
        int i11 = this.f17184i.f17234z.left + this.f17191p;
        int i12 = this.f17184i.f17234z.right + this.f17192q;
        int i13 = this.f17184i.f17234z.top;
        boolean z9 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z9) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f17184i.requestLayout();
        }
        if ((z9 || this.f17195t != this.f17194s) && V()) {
            this.f17184i.removeCallbacks(this.f17189n);
            this.f17184i.post(this.f17189n);
        }
    }

    private void t(int i10) {
        if (this.f17184i.getAnimationMode() == 1) {
            a0(i10);
        } else {
            c0(i10);
        }
    }

    private int u() {
        if (A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        A().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f17182g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f17182g.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable v(int i10, Resources resources) {
        float dimension = resources.getDimension(p225w4.c.f28763d0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static N4.h w(int i10, N4.l lVar) {
        N4.h hVar = new N4.h(lVar);
        hVar.V(ColorStateList.valueOf(i10));
        return hVar;
    }

    private ValueAnimator z(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f17179d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public View A() {
        return null;
    }

    public int B() {
        return this.f17186k;
    }

    protected SwipeDismissBehavior C() {
        return new Behavior();
    }

    protected int E() {
        return I() ? p225w4.g.f28871v : p225w4.g.f28851b;
    }

    public View G() {
        return this.f17184i;
    }

    protected boolean I() {
        TypedArray typedArrayObtainStyledAttributes = this.f17183h.obtainStyledAttributes(f17173E);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void J(int i10) {
        if (U() && this.f17184i.getVisibility() == 0) {
            t(i10);
        } else {
            P(i10);
        }
    }

    public boolean K() {
        return com.google.android.material.snackbar.c.c().e(this.f17200y);
    }

    void M() {
        WindowInsets rootWindowInsets = this.f17184i.getRootWindowInsets();
        if (rootWindowInsets != null) {
            this.f17194s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            d0();
        }
    }

    void N() {
        if (K()) {
            f17171C.post(new m());
        }
    }

    void O() {
        if (this.f17196u) {
            Y();
            this.f17196u = false;
        }
    }

    void P(int i10) {
        int size;
        com.google.android.material.snackbar.c.c().h(this.f17200y);
        List list = this.f17197v;
        if (list != null && (size = list.size() - 1) >= 0) {
            androidx.appcompat.app.o.a(this.f17197v.get(size));
            throw null;
        }
        ViewParent parent = this.f17184i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f17184i);
        }
    }

    void Q() {
        int size;
        com.google.android.material.snackbar.c.c().i(this.f17200y);
        List list = this.f17197v;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        androidx.appcompat.app.o.a(this.f17197v.get(size));
        throw null;
    }

    public BaseTransientBottomBar S(int i10) {
        this.f17186k = i10;
        return this;
    }

    boolean U() {
        AccessibilityManager accessibilityManager = this.f17199x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void W() {
        com.google.android.material.snackbar.c.c().m(B(), this.f17200y);
    }

    final void X() {
        if (this.f17184i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f17184i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                T((CoordinatorLayout.f) layoutParams);
            }
            this.f17184i.c(this.f17182g);
            R();
            this.f17184i.setVisibility(4);
        }
        if (H.M(this.f17184i)) {
            Y();
        } else {
            this.f17196u = true;
        }
    }

    void s() {
        this.f17184i.post(new o());
    }

    public void x() {
        y(3);
    }

    protected void y(int i10) {
        com.google.android.material.snackbar.c.c().b(this.f17200y, i10);
    }
}
