package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
class f extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f17451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f17452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f17453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f17454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f17455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f17456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f17457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f17458m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f17517b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f17517b.a0(false);
        }
    }

    f(r rVar) {
        super(rVar);
        this.f17455j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f17445q, view);
            }
        };
        this.f17456k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                f fVar = this.f17446a;
                fVar.A(fVar.E());
            }
        };
        Context context = rVar.getContext();
        int i10 = p225w4.a.f28673H;
        this.f17450e = I4.f.f(context, i10, 100);
        this.f17451f = I4.f.f(rVar.getContext(), i10, 150);
        this.f17452g = I4.f.g(rVar.getContext(), p225w4.a.f28677L, p235x4.a.f29939a);
        this.f17453h = I4.f.g(rVar.getContext(), p225w4.a.f28676K, p235x4.a.f29942d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z9) {
        boolean z10 = this.f17517b.F() == z9;
        if (z9 && !this.f17457l.isRunning()) {
            this.f17458m.cancel();
            this.f17457l.start();
            if (z10) {
                this.f17457l.end();
                return;
            }
            return;
        }
        if (z9) {
            return;
        }
        this.f17457l.cancel();
        this.f17458m.start();
        if (z10) {
            this.f17458m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f17452g);
        valueAnimatorOfFloat.setDuration(this.f17450e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f17447a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f17453h);
        valueAnimatorOfFloat.setDuration(this.f17451f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f17449a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17457l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f17457l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f17458m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f17454i;
        if (editText != null) {
            return (editText.hasFocus() || this.f17519d.hasFocus()) && this.f17454i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f17454i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f17519d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f17519d.setScaleX(fFloatValue);
        fVar.f17519d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.f17517b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return p225w4.i.f28882e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return p225w4.d.f28799i;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f17456k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f17455j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f17456k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f17454i = editText;
        this.f17516a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z9) {
        if (this.f17517b.w() == null) {
            return;
        }
        A(z9);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f17454i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17448q.A(true);
                }
            });
        }
    }
}
