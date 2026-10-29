package com.nothing.widget.ui;

import B8.h;
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
import com.nothing.widget.ui.NtRadioButton;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p057f6.d;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class NtRadioButton extends AppCompatRadioButton {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f19221L = new a(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final PathInterpolator f19222M = new PathInterpolator(0.4f, 0.0f, 1.0f, 0.6f);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final PathInterpolator f19223N = new PathInterpolator(0.0f, 0.4f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TransitionDrawable f19224A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TransitionDrawable f19225B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f19226C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f19227D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f19228E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f19229F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f19230G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f19231H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f19232I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f19233J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f19234K;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private StateListDrawable f19236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LayerDrawable f19237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LayerDrawable f19238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LayerDrawable f19239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TransitionDrawable f19240z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f19242b;

        b(p219v8.a aVar) {
            this.f19242b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            n.h(animation, "animation");
            NtRadioButton.this.f19226C = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            NtRadioButton.this.f19226C = null;
            p219v8.a aVar = this.f19242b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NtRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final void f(boolean z9) {
        TransitionDrawable transitionDrawable;
        TransitionDrawable transitionDrawable2;
        if (z9) {
            TransitionDrawable transitionDrawable3 = this.f19240z;
            if (transitionDrawable3 == null) {
                n.r("preCheckedTransition");
                transitionDrawable3 = null;
            }
            setButtonDrawable(transitionDrawable3);
            TransitionDrawable transitionDrawable4 = this.f19240z;
            if (transitionDrawable4 == null) {
                n.r("preCheckedTransition");
                transitionDrawable2 = null;
            } else {
                transitionDrawable2 = transitionDrawable4;
            }
            j(transitionDrawable2, 100L, f19222M, new p219v8.a() { // from class: X7.j
                @Override // p219v8.a
                public final Object invoke() {
                    return NtRadioButton.h(this.f9014q);
                }
            });
            return;
        }
        TransitionDrawable transitionDrawable5 = this.f19225B;
        if (transitionDrawable5 == null) {
            n.r("uncheckedTransition");
            transitionDrawable5 = null;
        }
        setButtonDrawable(transitionDrawable5);
        TransitionDrawable transitionDrawable6 = this.f19225B;
        if (transitionDrawable6 == null) {
            n.r("uncheckedTransition");
            transitionDrawable = null;
        } else {
            transitionDrawable = transitionDrawable6;
        }
        j(transitionDrawable, 100L, f19222M, new p219v8.a() { // from class: X7.k
            @Override // p219v8.a
            public final Object invoke() {
                return NtRadioButton.g(this.f9015q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g(NtRadioButton this$0) {
        n.h(this$0, "this$0");
        this$0.setButtonDrawable(this$0.f19236v);
        this$0.s();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A h(final NtRadioButton this$0) {
        TransitionDrawable transitionDrawable;
        n.h(this$0, "this$0");
        TransitionDrawable transitionDrawable2 = this$0.f19224A;
        if (transitionDrawable2 == null) {
            n.r("checkedTransition");
            transitionDrawable2 = null;
        }
        this$0.setButtonDrawable(transitionDrawable2);
        TransitionDrawable transitionDrawable3 = this$0.f19224A;
        if (transitionDrawable3 == null) {
            n.r("checkedTransition");
            transitionDrawable = null;
        } else {
            transitionDrawable = transitionDrawable3;
        }
        this$0.j(transitionDrawable, 100L, f19223N, new p219v8.a() { // from class: X7.m
            @Override // p219v8.a
            public final Object invoke() {
                return NtRadioButton.i(this.f9017q);
            }
        });
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A i(NtRadioButton this$0) {
        n.h(this$0, "this$0");
        this$0.setButtonDrawable(this$0.f19236v);
        this$0.s();
        return A.f21846a;
    }

    private final void j(final TransitionDrawable transitionDrawable, long j9, PathInterpolator pathInterpolator, p219v8.a aVar) {
        transitionDrawable.resetTransition();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j9);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X7.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NtRadioButton.k(transitionDrawable, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(aVar));
        this.f19226C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TransitionDrawable drawable, ValueAnimator animation) {
        n.h(drawable, "$drawable");
        n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        drawable.setLevel(h.m((int) (((Float) animatedValue).floatValue() * 10000), 0, 10000));
    }

    private final StateListDrawable l() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, getCheckedDrawable());
        stateListDrawable.addState(new int[0], getUncheckedDrawable());
        return stateListDrawable;
    }

    private final void m() {
        this.f19227D = getResources().getDimensionPixelSize(p057f6.b.f20858d);
        int dimensionPixelSize = getResources().getDimensionPixelSize(p057f6.b.f20863i);
        this.f19228E = dimensionPixelSize;
        this.f19229F = dimensionPixelSize - (this.f19227D * 2);
        this.f19231H = getResources().getDimensionPixelSize(p057f6.b.f20864j);
        this.f19230G = getResources().getDimensionPixelSize(p057f6.b.f20857c);
        this.f19234K = getResources().getColor(p057f6.a.f20854d);
    }

    private final void n() {
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{p(this, 0, Integer.valueOf(this.f19232I), 0, 8, null)});
        int i10 = this.f19227D;
        layerDrawable.setLayerInset(0, i10, i10, i10, i10);
        setUncheckedDrawable(layerDrawable);
        GradientDrawable gradientDrawableP = p(this, this.f19233J, null, 0, 12, null);
        GradientDrawable gradientDrawableO = o(this, this.f19234K, null, this.f19231H);
        int i11 = ((this.f19229F - this.f19231H) / 2) + this.f19227D;
        LayerDrawable layerDrawable2 = new LayerDrawable(new GradientDrawable[]{gradientDrawableP});
        int i12 = this.f19227D;
        layerDrawable2.setLayerInset(0, i12, i12, i12, i12);
        setPreCheckedDrawable(layerDrawable2);
        LayerDrawable layerDrawable3 = new LayerDrawable(new GradientDrawable[]{gradientDrawableP, gradientDrawableO});
        int i13 = this.f19227D;
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
            gradientDrawable.setStroke(ntRadioButton.f19230G, num.intValue());
        }
        return gradientDrawable;
    }

    static /* synthetic */ GradientDrawable p(NtRadioButton ntRadioButton, int i10, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            i11 = ntRadioButton.f19229F;
        }
        return o(ntRadioButton, i10, num, i11);
    }

    private final void q(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, d.f20874h, 0, 0);
        try {
            this.f19232I = typedArrayObtainStyledAttributes.getColor(d.f20876j, p171r0.a.b(getContext(), p057f6.a.f20851a));
            this.f19233J = typedArrayObtainStyledAttributes.getColor(d.f20875i, p171r0.a.b(getContext(), p057f6.a.f20853c));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void r() {
        if (this.f19237w == null || this.f19238x == null || this.f19239y == null) {
            throw new IllegalStateException("Drawables must be initialized before transitions.");
        }
        this.f19240z = new TransitionDrawable(new LayerDrawable[]{getUncheckedDrawable(), getPreCheckedDrawable()});
        this.f19224A = new TransitionDrawable(new LayerDrawable[]{getPreCheckedDrawable(), getCheckedDrawable()});
        TransitionDrawable transitionDrawable = new TransitionDrawable(new LayerDrawable[]{getCheckedDrawable(), getUncheckedDrawable()});
        transitionDrawable.setCrossFadeEnabled(true);
        this.f19225B = transitionDrawable;
    }

    private final void s() {
        float f10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = isChecked() ? 0.3f : 0.4f;
        }
        if (this.f19237w == null || this.f19238x == null || this.f19239y == null) {
            Log.d("NtRadioButton", "Drawables are not initialized yet.");
            return;
        }
        int i10 = (int) (f10 * 255);
        this.f19232I = p191t0.a.x(this.f19232I, i10);
        this.f19233J = p191t0.a.x(this.f19233J, i10);
        this.f19234K = p191t0.a.x(this.f19234K, i10);
        Drawable drawable = getUncheckedDrawable().getDrawable(0);
        n.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setStroke(this.f19230G, this.f19232I);
        Drawable drawable2 = getPreCheckedDrawable().getDrawable(0);
        n.f(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable2).setColor(this.f19233J);
        Drawable drawable3 = getCheckedDrawable().getDrawable(0);
        n.f(drawable3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable3).setColor(this.f19233J);
    }

    public final LayerDrawable getCheckedDrawable() {
        LayerDrawable layerDrawable = this.f19239y;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        n.r("checkedDrawable");
        return null;
    }

    public final LayerDrawable getPreCheckedDrawable() {
        LayerDrawable layerDrawable = this.f19238x;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        n.r("preCheckedDrawable");
        return null;
    }

    public final LayerDrawable getUncheckedDrawable() {
        LayerDrawable layerDrawable = this.f19237w;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        n.r("uncheckedDrawable");
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        boolean zIsChecked = isChecked();
        super.setChecked(z9);
        s();
        if (zIsChecked == z9 || !this.f19235u) {
            setButtonDrawable(this.f19236v);
        } else {
            ValueAnimator valueAnimator = this.f19226C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            f(z9);
        }
        this.f19235u = true;
    }

    public final void setCheckedDrawable(LayerDrawable layerDrawable) {
        n.h(layerDrawable, "<set-?>");
        this.f19239y = layerDrawable;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        s();
    }

    public final void setPreCheckedDrawable(LayerDrawable layerDrawable) {
        n.h(layerDrawable, "<set-?>");
        this.f19238x = layerDrawable;
    }

    public final void setUncheckedDrawable(LayerDrawable layerDrawable) {
        n.h(layerDrawable, "<set-?>");
        this.f19237w = layerDrawable;
    }

    public /* synthetic */ NtRadioButton(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? p050f.a.f20327G : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NtRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19235u = true;
        q(attributeSet);
        m();
        n();
        r();
        StateListDrawable stateListDrawableL = l();
        this.f19236v = stateListDrawableL;
        setButtonDrawable(stateListDrawableL);
        setBackground(null);
    }
}
