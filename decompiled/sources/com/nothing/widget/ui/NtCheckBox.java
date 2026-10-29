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
import androidx.appcompat.widget.AppCompatCheckBox;
import com.nothing.widget.ui.NtCheckBox;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p057f6.c;
import p057f6.d;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public class NtCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f19199L = new a(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final PathInterpolator f19200M = new PathInterpolator(0.4f, 0.0f, 1.0f, 0.6f);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final PathInterpolator f19201N = new PathInterpolator(0.0f, 0.4f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TransitionDrawable f19202A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TransitionDrawable f19203B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f19204C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f19205D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f19206E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f19207F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f19208G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f19209H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f19210I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f19211J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f19212K;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private StateListDrawable f19214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LayerDrawable f19215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private LayerDrawable f19216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LayerDrawable f19217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TransitionDrawable f19218z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f19220b;

        b(p219v8.a aVar) {
            this.f19220b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            n.h(animation, "animation");
            NtCheckBox.this.f19204C = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            NtCheckBox.this.f19204C = null;
            p219v8.a aVar = this.f19220b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NtCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final void g(boolean z9) {
        TransitionDrawable transitionDrawable;
        TransitionDrawable transitionDrawable2;
        if (z9) {
            TransitionDrawable transitionDrawable3 = this.f19218z;
            if (transitionDrawable3 == null) {
                n.r("preCheckedTransition");
                transitionDrawable3 = null;
            }
            setButtonDrawable(transitionDrawable3);
            TransitionDrawable transitionDrawable4 = this.f19218z;
            if (transitionDrawable4 == null) {
                n.r("preCheckedTransition");
                transitionDrawable2 = null;
            } else {
                transitionDrawable2 = transitionDrawable4;
            }
            k(transitionDrawable2, 100L, f19200M, new p219v8.a() { // from class: X7.a
                @Override // p219v8.a
                public final Object invoke() {
                    return NtCheckBox.h(this.f8990q);
                }
            });
            return;
        }
        TransitionDrawable transitionDrawable5 = this.f19203B;
        if (transitionDrawable5 == null) {
            n.r("uncheckedTransition");
            transitionDrawable5 = null;
        }
        setButtonDrawable(transitionDrawable5);
        TransitionDrawable transitionDrawable6 = this.f19203B;
        if (transitionDrawable6 == null) {
            n.r("uncheckedTransition");
            transitionDrawable = null;
        } else {
            transitionDrawable = transitionDrawable6;
        }
        k(transitionDrawable, 100L, f19200M, new p219v8.a() { // from class: X7.b
            @Override // p219v8.a
            public final Object invoke() {
                return NtCheckBox.j(this.f8991q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A h(final NtCheckBox this$0) {
        TransitionDrawable transitionDrawable;
        n.h(this$0, "this$0");
        TransitionDrawable transitionDrawable2 = this$0.f19202A;
        if (transitionDrawable2 == null) {
            n.r("checkedTransition");
            transitionDrawable2 = null;
        }
        this$0.setButtonDrawable(transitionDrawable2);
        TransitionDrawable transitionDrawable3 = this$0.f19202A;
        if (transitionDrawable3 == null) {
            n.r("checkedTransition");
            transitionDrawable = null;
        } else {
            transitionDrawable = transitionDrawable3;
        }
        this$0.k(transitionDrawable, 100L, f19201N, new p219v8.a() { // from class: X7.d
            @Override // p219v8.a
            public final Object invoke() {
                return NtCheckBox.i(this.f8993q);
            }
        });
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A i(NtCheckBox this$0) {
        n.h(this$0, "this$0");
        this$0.setButtonDrawable(this$0.f19214v);
        this$0.t();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A j(NtCheckBox this$0) {
        n.h(this$0, "this$0");
        this$0.setButtonDrawable(this$0.f19214v);
        this$0.t();
        return A.f21846a;
    }

    private final void k(final TransitionDrawable transitionDrawable, long j9, PathInterpolator pathInterpolator, p219v8.a aVar) {
        transitionDrawable.resetTransition();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j9);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X7.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NtCheckBox.l(transitionDrawable, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(aVar));
        this.f19204C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TransitionDrawable drawable, ValueAnimator animation) {
        n.h(drawable, "$drawable");
        n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        drawable.setLevel(h.m((int) (((Float) animatedValue).floatValue() * 10000), 0, 10000));
    }

    private final StateListDrawable m() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_checked};
        LayerDrawable layerDrawable = this.f19217y;
        LayerDrawable layerDrawable2 = null;
        if (layerDrawable == null) {
            n.r("checkedDrawable");
            layerDrawable = null;
        }
        stateListDrawable.addState(iArr, layerDrawable);
        int[] iArr2 = new int[0];
        LayerDrawable layerDrawable3 = this.f19215w;
        if (layerDrawable3 == null) {
            n.r("uncheckedDrawable");
        } else {
            layerDrawable2 = layerDrawable3;
        }
        stateListDrawable.addState(iArr2, layerDrawable2);
        return stateListDrawable;
    }

    private final void n() {
        this.f19206E = getResources().getDimensionPixelSize(p057f6.b.f20858d);
        int dimensionPixelSize = getResources().getDimensionPixelSize(p057f6.b.f20863i);
        this.f19207F = dimensionPixelSize;
        this.f19208G = dimensionPixelSize - (this.f19206E * 2);
        this.f19209H = this.f19205D ? getResources().getDimensionPixelSize(p057f6.b.f20856b) : getResources().getDimensionPixelSize(p057f6.b.f20855a);
        this.f19210I = getResources().getDimensionPixelSize(p057f6.b.f20857c);
    }

    private final void o() {
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{p(this, 0, Integer.valueOf(this.f19211J))});
        int i10 = this.f19206E;
        layerDrawable.setLayerInset(0, i10, i10, i10, i10);
        this.f19215w = layerDrawable;
        LayerDrawable layerDrawable2 = null;
        GradientDrawable gradientDrawableQ = q(this, this.f19212K, null, 4, null);
        Drawable drawableE = p181s0.h.e(getResources(), c.f20866b, null);
        LayerDrawable layerDrawable3 = new LayerDrawable(new GradientDrawable[]{gradientDrawableQ});
        int i11 = this.f19206E;
        layerDrawable3.setLayerInset(0, i11, i11, i11, i11);
        this.f19216x = layerDrawable3;
        if (drawableE == null) {
            Log.w("NtCheckBox", "Checkmark drawable is null!");
            LayerDrawable layerDrawable4 = this.f19216x;
            if (layerDrawable4 == null) {
                n.r("preCheckedDrawable");
            } else {
                layerDrawable2 = layerDrawable4;
            }
            this.f19217y = layerDrawable2;
            return;
        }
        int intrinsicWidth = ((this.f19208G - drawableE.getIntrinsicWidth()) / 2) + this.f19206E;
        int intrinsicHeight = ((this.f19208G - drawableE.getIntrinsicHeight()) / 2) + this.f19206E;
        LayerDrawable layerDrawable5 = new LayerDrawable(new Drawable[]{gradientDrawableQ, drawableE});
        int i12 = this.f19206E;
        layerDrawable5.setLayerInset(0, i12, i12, i12, i12);
        layerDrawable5.setLayerInset(1, intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight);
        this.f19217y = layerDrawable5;
    }

    private static final GradientDrawable p(NtCheckBox ntCheckBox, int i10, Integer num) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i11 = ntCheckBox.f19208G;
        gradientDrawable.setSize(i11, i11);
        gradientDrawable.setCornerRadius(ntCheckBox.f19209H);
        gradientDrawable.setColor(i10);
        if (num != null) {
            gradientDrawable.setStroke(ntCheckBox.f19210I, num.intValue());
        }
        return gradientDrawable;
    }

    static /* synthetic */ GradientDrawable q(NtCheckBox ntCheckBox, int i10, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initDrawables$createGradientDrawable");
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        return p(ntCheckBox, i10, num);
    }

    private final void r(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, d.f20869c, 0, 0);
        try {
            this.f19205D = typedArrayObtainStyledAttributes.getBoolean(d.f20871e, false);
            this.f19211J = typedArrayObtainStyledAttributes.getColor(d.f20872f, p171r0.a.b(getContext(), p057f6.a.f20851a));
            this.f19212K = typedArrayObtainStyledAttributes.getColor(d.f20870d, p171r0.a.b(getContext(), p057f6.a.f20853c));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void s() {
        if (this.f19215w == null || this.f19216x == null || this.f19217y == null) {
            throw new IllegalStateException("Drawables must be initialized before transitions.");
        }
        LayerDrawable layerDrawable = this.f19215w;
        LayerDrawable layerDrawable2 = null;
        if (layerDrawable == null) {
            n.r("uncheckedDrawable");
            layerDrawable = null;
        }
        LayerDrawable layerDrawable3 = this.f19216x;
        if (layerDrawable3 == null) {
            n.r("preCheckedDrawable");
            layerDrawable3 = null;
        }
        this.f19218z = new TransitionDrawable(new LayerDrawable[]{layerDrawable, layerDrawable3});
        LayerDrawable layerDrawable4 = this.f19216x;
        if (layerDrawable4 == null) {
            n.r("preCheckedDrawable");
            layerDrawable4 = null;
        }
        LayerDrawable layerDrawable5 = this.f19217y;
        if (layerDrawable5 == null) {
            n.r("checkedDrawable");
            layerDrawable5 = null;
        }
        this.f19202A = new TransitionDrawable(new LayerDrawable[]{layerDrawable4, layerDrawable5});
        LayerDrawable layerDrawable6 = this.f19217y;
        if (layerDrawable6 == null) {
            n.r("checkedDrawable");
            layerDrawable6 = null;
        }
        LayerDrawable layerDrawable7 = this.f19215w;
        if (layerDrawable7 == null) {
            n.r("uncheckedDrawable");
        } else {
            layerDrawable2 = layerDrawable7;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new LayerDrawable[]{layerDrawable6, layerDrawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        this.f19203B = transitionDrawable;
    }

    private final void t() {
        float f10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = isChecked() ? 0.3f : 0.4f;
        }
        if (this.f19215w == null || this.f19216x == null || this.f19217y == null) {
            Log.d("NtCheckBox", "Drawables are not initialized yet.");
            return;
        }
        int i10 = (int) (f10 * 255);
        this.f19211J = p191t0.a.x(this.f19211J, i10);
        this.f19212K = p191t0.a.x(this.f19212K, i10);
        LayerDrawable layerDrawable = this.f19215w;
        LayerDrawable layerDrawable2 = null;
        if (layerDrawable == null) {
            n.r("uncheckedDrawable");
            layerDrawable = null;
        }
        Drawable drawable = layerDrawable.getDrawable(0);
        n.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setStroke(this.f19210I, this.f19211J);
        LayerDrawable layerDrawable3 = this.f19216x;
        if (layerDrawable3 == null) {
            n.r("preCheckedDrawable");
            layerDrawable3 = null;
        }
        Drawable drawable2 = layerDrawable3.getDrawable(0);
        n.f(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable2).setColor(this.f19212K);
        LayerDrawable layerDrawable4 = this.f19217y;
        if (layerDrawable4 == null) {
            n.r("checkedDrawable");
        } else {
            layerDrawable2 = layerDrawable4;
        }
        Drawable drawable3 = layerDrawable2.getDrawable(0);
        n.f(drawable3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable3).setColor(this.f19212K);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        boolean zIsChecked = isChecked();
        super.setChecked(z9);
        t();
        if (zIsChecked == z9 || !this.f19213u) {
            setButtonDrawable(this.f19214v);
        } else {
            ValueAnimator valueAnimator = this.f19204C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            g(z9);
        }
        this.f19213u = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        t();
    }

    public /* synthetic */ NtCheckBox(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.checkboxStyle : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NtCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19213u = true;
        r(attributeSet);
        n();
        o();
        s();
        StateListDrawable stateListDrawableM = m();
        this.f19214v = stateListDrawableM;
        setButtonDrawable(stateListDrawableM);
        setBackground(null);
    }
}
