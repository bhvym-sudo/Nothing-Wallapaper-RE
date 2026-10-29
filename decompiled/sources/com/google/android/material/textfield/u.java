package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.H;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ColorStateList f17520A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f17521B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f17525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f17526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f17527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f17528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout f17529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f17530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f17532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f17533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f17534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f17537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f17539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f17540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f17542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f17543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f17544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f17546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17547z;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f17549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f17551d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f17548a = i10;
            this.f17549b = textView;
            this.f17550c = i11;
            this.f17551d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f17535n = this.f17548a;
            u.this.f17533l = null;
            TextView textView = this.f17549b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f17550c == 1 && u.this.f17539r != null) {
                    u.this.f17539r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f17551d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f17551d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f17551d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f17551d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f17529h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f17528g = context;
        this.f17529h = textInputLayout;
        this.f17534m = context.getResources().getDimensionPixelSize(p225w4.c.f28770h);
        int i10 = p225w4.a.f28674I;
        this.f17522a = I4.f.f(context, i10, 217);
        this.f17523b = I4.f.f(context, p225w4.a.f28671F, 167);
        this.f17524c = I4.f.f(context, i10, 167);
        int i11 = p225w4.a.f28675J;
        this.f17525d = I4.f.g(context, i11, p235x4.a.f29942d);
        TimeInterpolator timeInterpolator = p235x4.a.f29939a;
        this.f17526e = I4.f.g(context, i11, timeInterpolator);
        this.f17527f = I4.f.g(context, p225w4.a.f28677L, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f17535n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (H.M(this.f17529h) && this.f17529h.isEnabled()) {
            return (this.f17536o == this.f17535n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i10, int i11, boolean z9) {
        u uVar;
        if (i10 == i11) {
            return;
        }
        if (z9) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f17533l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f17545x, this.f17546y, 2, i10, i11);
            uVar.i(arrayList, uVar.f17538q, uVar.f17539r, 1, i10, i11);
            p235x4.b.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i11, uVar.m(i10), i10, uVar.m(i11)));
            animatorSet.start();
        } else {
            uVar = this;
            uVar.D(i10, i11);
        }
        uVar.f17529h.n0();
        uVar.f17529h.s0(z9);
        uVar.f17529h.y0();
    }

    private boolean g() {
        return (this.f17530i == null || this.f17529h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z9, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z9) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f17524c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f17524c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z9) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z9 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z9 ? this.f17523b : this.f17524c);
        objectAnimatorOfFloat.setInterpolator(z9 ? this.f17526e : this.f17527f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f17534m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f17522a);
        objectAnimatorOfFloat.setInterpolator(this.f17525d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f17539r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f17546y;
    }

    private int v(boolean z9, int i10, int i11) {
        return z9 ? this.f17528g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f17539r == null || TextUtils.isEmpty(this.f17537p)) ? false : true;
    }

    boolean A() {
        return this.f17538q;
    }

    boolean B() {
        return this.f17545x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f17530i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f17532k) == null) {
            this.f17530i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f17531j - 1;
        this.f17531j = i11;
        O(this.f17530i, i11);
    }

    void E(int i10) {
        this.f17541t = i10;
        TextView textView = this.f17539r;
        if (textView != null) {
            H.i0(textView, i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f17540s = charSequence;
        TextView textView = this.f17539r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z9) {
        if (this.f17538q == z9) {
            return;
        }
        h();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f17528g);
            this.f17539r = appCompatTextView;
            appCompatTextView.setId(p225w4.e.f28814N);
            this.f17539r.setTextAlignment(5);
            Typeface typeface = this.f17521B;
            if (typeface != null) {
                this.f17539r.setTypeface(typeface);
            }
            H(this.f17542u);
            I(this.f17543v);
            F(this.f17540s);
            E(this.f17541t);
            this.f17539r.setVisibility(4);
            e(this.f17539r, 0);
        } else {
            w();
            C(this.f17539r, 0);
            this.f17539r = null;
            this.f17529h.n0();
            this.f17529h.y0();
        }
        this.f17538q = z9;
    }

    void H(int i10) {
        this.f17542u = i10;
        TextView textView = this.f17539r;
        if (textView != null) {
            this.f17529h.a0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f17543v = colorStateList;
        TextView textView = this.f17539r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f17547z = i10;
        TextView textView = this.f17546y;
        if (textView != null) {
            androidx.core.widget.l.o(textView, i10);
        }
    }

    void K(boolean z9) {
        if (this.f17545x == z9) {
            return;
        }
        h();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f17528g);
            this.f17546y = appCompatTextView;
            appCompatTextView.setId(p225w4.e.f28815O);
            this.f17546y.setTextAlignment(5);
            Typeface typeface = this.f17521B;
            if (typeface != null) {
                this.f17546y.setTypeface(typeface);
            }
            this.f17546y.setVisibility(4);
            H.i0(this.f17546y, 1);
            J(this.f17547z);
            L(this.f17520A);
            e(this.f17546y, 1);
            this.f17546y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f17546y, 1);
            this.f17546y = null;
            this.f17529h.n0();
            this.f17529h.y0();
        }
        this.f17545x = z9;
    }

    void L(ColorStateList colorStateList) {
        this.f17520A = colorStateList;
        TextView textView = this.f17546y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f17521B) {
            this.f17521B = typeface;
            M(this.f17539r, typeface);
            M(this.f17546y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f17537p = charSequence;
        this.f17539r.setText(charSequence);
        int i10 = this.f17535n;
        if (i10 != 1) {
            this.f17536o = 1;
        }
        S(i10, this.f17536o, P(this.f17539r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f17544w = charSequence;
        this.f17546y.setText(charSequence);
        int i10 = this.f17535n;
        if (i10 != 2) {
            this.f17536o = 2;
        }
        S(i10, this.f17536o, P(this.f17546y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f17530i == null && this.f17532k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f17528g);
            this.f17530i = linearLayout;
            linearLayout.setOrientation(0);
            this.f17529h.addView(this.f17530i, -1, -2);
            this.f17532k = new FrameLayout(this.f17528g);
            this.f17530i.addView(this.f17532k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f17529h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f17532k.setVisibility(0);
            this.f17532k.addView(textView);
        } else {
            this.f17530i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f17530i.setVisibility(0);
        this.f17531j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f17529h.getEditText();
            boolean zH = K4.c.h(this.f17528g);
            LinearLayout linearLayout = this.f17530i;
            int i10 = p225w4.c.f28736G;
            H.v0(linearLayout, v(zH, i10, H.z(editText)), v(zH, p225w4.c.f28737H, this.f17528g.getResources().getDimensionPixelSize(p225w4.c.f28735F)), v(zH, i10, H.y(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f17533l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f17536o);
    }

    int n() {
        return this.f17541t;
    }

    CharSequence o() {
        return this.f17540s;
    }

    CharSequence p() {
        return this.f17537p;
    }

    int q() {
        TextView textView = this.f17539r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f17539r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f17544w;
    }

    View t() {
        return this.f17546y;
    }

    int u() {
        TextView textView = this.f17546y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f17537p = null;
        h();
        if (this.f17535n == 1) {
            if (!this.f17545x || TextUtils.isEmpty(this.f17544w)) {
                this.f17536o = 0;
            } else {
                this.f17536o = 2;
            }
        }
        S(this.f17535n, this.f17536o, P(this.f17539r, ""));
    }

    void x() {
        h();
        int i10 = this.f17535n;
        if (i10 == 2) {
            this.f17536o = 0;
        }
        S(i10, this.f17536o, P(this.f17546y, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
