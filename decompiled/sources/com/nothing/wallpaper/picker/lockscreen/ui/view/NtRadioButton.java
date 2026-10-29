package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatRadioButton;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class NtRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f18932L = new a(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final PathInterpolator f18933M = new PathInterpolator(0.4f, 0.0f, 1.0f, 0.6f);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final PathInterpolator f18934N = new PathInterpolator(0.0f, 0.4f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TransitionDrawable f18935A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TransitionDrawable f18936B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f18937C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f18938D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f18939E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f18940F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f18941G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f18942H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f18943I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f18944J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f18945K;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f18946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private StateListDrawable f18947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LayerDrawable f18948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LayerDrawable f18949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LayerDrawable f18950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TransitionDrawable f18951z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f18953b;

        b(p219v8.a aVar) {
            this.f18953b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            NtRadioButton.this.f18937C = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            NtRadioButton.this.f18937C = null;
            p219v8.a aVar = this.f18953b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NtRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void f(boolean z9) {
        TransitionDrawable transitionDrawable;
        TransitionDrawable transitionDrawable2;
        if (z9) {
            TransitionDrawable transitionDrawable3 = this.f18951z;
            if (transitionDrawable3 == null) {
                kotlin.jvm.internal.n.r("preCheckedTransition");
                transitionDrawable3 = null;
            }
            setButtonDrawable(transitionDrawable3);
            TransitionDrawable transitionDrawable4 = this.f18951z;
            if (transitionDrawable4 == null) {
                kotlin.jvm.internal.n.r("preCheckedTransition");
                transitionDrawable2 = null;
            } else {
                transitionDrawable2 = transitionDrawable4;
            }
            j(transitionDrawable2, 100L, f18933M, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.I
                @Override // p219v8.a
                public final Object invoke() {
                    return NtRadioButton.h(this.f18924q);
                }
            });
            return;
        }
        TransitionDrawable transitionDrawable5 = this.f18936B;
        if (transitionDrawable5 == null) {
            kotlin.jvm.internal.n.r("uncheckedTransition");
            transitionDrawable5 = null;
        }
        setButtonDrawable(transitionDrawable5);
        TransitionDrawable transitionDrawable6 = this.f18936B;
        if (transitionDrawable6 == null) {
            kotlin.jvm.internal.n.r("uncheckedTransition");
            transitionDrawable = null;
        } else {
            transitionDrawable = transitionDrawable6;
        }
        j(transitionDrawable, 100L, f18933M, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.J
            @Override // p219v8.a
            public final Object invoke() {
                return NtRadioButton.g(this.f18925q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A g(NtRadioButton ntRadioButton) {
        ntRadioButton.setButtonDrawable(ntRadioButton.f18947v);
        ntRadioButton.s();
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A h(final NtRadioButton ntRadioButton) {
        TransitionDrawable transitionDrawable;
        TransitionDrawable transitionDrawable2 = ntRadioButton.f18935A;
        if (transitionDrawable2 == null) {
            kotlin.jvm.internal.n.r("checkedTransition");
            transitionDrawable2 = null;
        }
        ntRadioButton.setButtonDrawable(transitionDrawable2);
        TransitionDrawable transitionDrawable3 = ntRadioButton.f18935A;
        if (transitionDrawable3 == null) {
            kotlin.jvm.internal.n.r("checkedTransition");
            transitionDrawable = null;
        } else {
            transitionDrawable = transitionDrawable3;
        }
        ntRadioButton.j(transitionDrawable, 100L, f18934N, new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.L
            @Override // p219v8.a
            public final Object invoke() {
                return NtRadioButton.i(this.f18927q);
            }
        });
        return p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A i(NtRadioButton ntRadioButton) {
        ntRadioButton.setButtonDrawable(ntRadioButton.f18947v);
        ntRadioButton.s();
        return p079h8.A.f21846a;
    }

    private final void j(final TransitionDrawable transitionDrawable, long j9, PathInterpolator pathInterpolator, p219v8.a aVar) {
        transitionDrawable.resetTransition();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j9);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.K
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NtRadioButton.k(transitionDrawable, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(aVar));
        this.f18937C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TransitionDrawable transitionDrawable, ValueAnimator animation) {
        kotlin.jvm.internal.n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        transitionDrawable.setLevel(B8.h.m((int) (((Float) animatedValue).floatValue() * 10000), 0, 10000));
    }

    private final StateListDrawable l() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, getCheckedDrawable());
        stateListDrawable.addState(new int[0], getUncheckedDrawable());
        return stateListDrawable;
    }

    private final void m() {
        this.f18938D = getResources().getDimensionPixelSize(com.nothing.wallpaper.R.dimen.layout_padding_4xs);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.nothing.wallpaper.R.dimen.size_m);
        this.f18939E = dimensionPixelSize;
        this.f18940F = dimensionPixelSize - (this.f18938D * 2);
        this.f18942H = getResources().getDimensionPixelSize(com.nothing.wallpaper.R.dimen.size_xs);
        this.f18941G = getResources().getDimensionPixelSize(com.nothing.wallpaper.R.dimen.border_width_100);
        this.f18945K = getResources().getColor(com.nothing.wallpaper.R.color.color_icon_primary_inverted);
    }

    private final void n() {
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{p(this, 0, Integer.valueOf(this.f18943I), 0, 8, null)});
        int i10 = this.f18938D;
        layerDrawable.setLayerInset(0, i10, i10, i10, i10);
        setUncheckedDrawable(layerDrawable);
        GradientDrawable gradientDrawableP = p(this, this.f18944J, null, 0, 12, null);
        GradientDrawable gradientDrawableO = o(this, this.f18945K, null, this.f18942H);
        int i11 = ((this.f18940F - this.f18942H) / 2) + this.f18938D;
        LayerDrawable layerDrawable2 = new LayerDrawable(new GradientDrawable[]{gradientDrawableP});
        int i12 = this.f18938D;
        layerDrawable2.setLayerInset(0, i12, i12, i12, i12);
        setPreCheckedDrawable(layerDrawable2);
        LayerDrawable layerDrawable3 = new LayerDrawable(new GradientDrawable[]{gradientDrawableP, gradientDrawableO});
        int i13 = this.f18938D;
        layerDrawable3.setLayerInset(0, i13, i13, i13, i13);
        layerDrawable3.setLayerInset(1, i11, i11, i11, i11);
        setCheckedDrawable(layerDrawable3);
    }

    private static final GradientDrawable o(NtRadioButton ntRadioButton, int i10, Integer num, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setSize(i11, i11);
        gradientDrawable.setColor(i10);
        if (num != null) {
            gradientDrawable.setStroke(ntRadioButton.f18941G, num.intValue());
        }
        return gradientDrawable;
    }

    static /* synthetic */ GradientDrawable p(NtRadioButton ntRadioButton, int i10, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            i11 = ntRadioButton.f18940F;
        }
        return o(ntRadioButton, i10, num, i11);
    }

    private final void q(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, p004a3.a.f9653L1, 0, 0);
        try {
            this.f18943I = typedArrayObtainStyledAttributes.getColor(1, p171r0.a.b(getContext(), com.nothing.wallpaper.R.color.color_border_darker));
            this.f18944J = typedArrayObtainStyledAttributes.getColor(0, p171r0.a.b(getContext(), com.nothing.wallpaper.R.color.color_icon_primary));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void r() {
        if (this.f18948w == null || this.f18949x == null || this.f18950y == null) {
            throw new IllegalStateException("Drawables must be initialized before transitions.");
        }
        this.f18951z = new TransitionDrawable(new LayerDrawable[]{getUncheckedDrawable(), getPreCheckedDrawable()});
        this.f18935A = new TransitionDrawable(new LayerDrawable[]{getPreCheckedDrawable(), getCheckedDrawable()});
        TransitionDrawable transitionDrawable = new TransitionDrawable(new LayerDrawable[]{getCheckedDrawable(), getUncheckedDrawable()});
        transitionDrawable.setCrossFadeEnabled(true);
        this.f18936B = transitionDrawable;
    }

    private final void s() {
        float f10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = isChecked() ? 0.3f : 0.4f;
        }
        if (this.f18948w == null || this.f18949x == null || this.f18950y == null) {
            Log.d("NtRadioButton", "Drawables are not initialized yet.");
            return;
        }
        int i10 = (int) (f10 * 255);
        this.f18943I = p191t0.a.x(this.f18943I, i10);
        this.f18944J = p191t0.a.x(this.f18944J, i10);
        this.f18945K = p191t0.a.x(this.f18945K, i10);
        Drawable drawable = getUncheckedDrawable().getDrawable(0);
        kotlin.jvm.internal.n.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setStroke(this.f18941G, this.f18943I);
        Drawable drawable2 = getPreCheckedDrawable().getDrawable(0);
        kotlin.jvm.internal.n.f(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable2).setColor(this.f18944J);
        Drawable drawable3 = getCheckedDrawable().getDrawable(0);
        kotlin.jvm.internal.n.f(drawable3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable3).setColor(this.f18944J);
        Drawable drawable4 = getCheckedDrawable().getDrawable(1);
        GradientDrawable gradientDrawable = drawable4 instanceof GradientDrawable ? (GradientDrawable) drawable4 : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(this.f18945K);
        }
    }

    public final LayerDrawable getCheckedDrawable() {
        LayerDrawable layerDrawable = this.f18950y;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        kotlin.jvm.internal.n.r("checkedDrawable");
        return null;
    }

    public final int getCheckedFillColor() {
        return this.f18944J;
    }

    public final int getCheckedInnerCircleColor() {
        return this.f18945K;
    }

    public final LayerDrawable getPreCheckedDrawable() {
        LayerDrawable layerDrawable = this.f18949x;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        kotlin.jvm.internal.n.r("preCheckedDrawable");
        return null;
    }

    public final LayerDrawable getUncheckedDrawable() {
        LayerDrawable layerDrawable = this.f18948w;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        kotlin.jvm.internal.n.r("uncheckedDrawable");
        return null;
    }

    public final int getUncheckedStrokeColor() {
        return this.f18943I;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        boolean zIsChecked = isChecked();
        super.setChecked(z9);
        s();
        if (zIsChecked == z9 || !this.f18946u) {
            setButtonDrawable(this.f18947v);
        } else {
            ValueAnimator valueAnimator = this.f18937C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            f(z9);
        }
        this.f18946u = true;
    }

    public final void setCheckedDrawable(LayerDrawable layerDrawable) {
        kotlin.jvm.internal.n.h(layerDrawable, "<set-?>");
        this.f18950y = layerDrawable;
    }

    public final void setCheckedFillColor(int i10) {
        this.f18944J = i10;
    }

    public final void setCheckedInnerCircleColor(int i10) {
        this.f18945K = i10;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        s();
    }

    public final void setPreCheckedDrawable(LayerDrawable layerDrawable) {
        kotlin.jvm.internal.n.h(layerDrawable, "<set-?>");
        this.f18949x = layerDrawable;
    }

    public final void setUncheckedDrawable(LayerDrawable layerDrawable) {
        kotlin.jvm.internal.n.h(layerDrawable, "<set-?>");
        this.f18948w = layerDrawable;
    }

    public final void setUncheckedStrokeColor(int i10) {
        this.f18943I = i10;
    }

    public /* synthetic */ NtRadioButton(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? com.nothing.wallpaper.R.attr.radioButtonStyle : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NtRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18946u = true;
        q(attributeSet);
        m();
        n();
        r();
        StateListDrawable stateListDrawableL = l();
        this.f18947v = stateListDrawableL;
        setButtonDrawable(stateListDrawableL);
        setBackground(null);
    }
}
