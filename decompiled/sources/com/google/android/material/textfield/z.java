package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.J;
import androidx.core.view.AbstractC1080l;
import androidx.core.view.H;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
class z extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TextInputLayout f17570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f17571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f17572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CheckableImageButton f17573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f17574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private PorterDuff.Mode f17575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ImageView.ScaleType f17577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View.OnLongClickListener f17578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f17579z;

    z(TextInputLayout textInputLayout, J j9) {
        super(textInputLayout.getContext());
        this.f17570q = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(p225w4.g.f28857h, (ViewGroup) this, false);
        this.f17573t = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f17571r = appCompatTextView;
        j(j9);
        i(j9);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i10 = (this.f17572s == null || this.f17579z) ? 8 : 0;
        setVisibility((this.f17573t.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f17571r.setVisibility(i10);
        this.f17570q.m0();
    }

    private void i(J j9) {
        this.f17571r.setVisibility(8);
        this.f17571r.setId(p225w4.e.f28817Q);
        this.f17571r.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        H.i0(this.f17571r, 1);
        o(j9.n(p225w4.k.f29270j8, 0));
        int i10 = p225w4.k.f29280k8;
        if (j9.s(i10)) {
            p(j9.c(i10));
        }
        n(j9.p(p225w4.k.f29260i8));
    }

    private void j(J j9) {
        if (K4.c.h(getContext())) {
            AbstractC1080l.c((ViewGroup.MarginLayoutParams) this.f17573t.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        int i10 = p225w4.k.f29340q8;
        if (j9.s(i10)) {
            this.f17574u = K4.c.b(getContext(), j9, i10);
        }
        int i11 = p225w4.k.f29350r8;
        if (j9.s(i11)) {
            this.f17575v = com.google.android.material.internal.n.h(j9.k(i11, -1), null);
        }
        int i12 = p225w4.k.f29310n8;
        if (j9.s(i12)) {
            s(j9.g(i12));
            int i13 = p225w4.k.f29300m8;
            if (j9.s(i13)) {
                r(j9.p(i13));
            }
            q(j9.a(p225w4.k.f29290l8, true));
        }
        t(j9.f(p225w4.k.f29320o8, getResources().getDimensionPixelSize(p225w4.c.f28759b0)));
        int i14 = p225w4.k.f29330p8;
        if (j9.s(i14)) {
            w(t.b(j9.k(i14, -1)));
        }
    }

    void A(C0.d dVar) {
        if (this.f17571r.getVisibility() != 0) {
            dVar.O0(this.f17573t);
        } else {
            dVar.v0(this.f17571r);
            dVar.O0(this.f17571r);
        }
    }

    void B() {
        EditText editText = this.f17570q.f17423t;
        if (editText == null) {
            return;
        }
        H.v0(this.f17571r, k() ? 0 : H.z(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(p225w4.c.f28738I), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f17572s;
    }

    ColorStateList b() {
        return this.f17571r.getTextColors();
    }

    int c() {
        return H.z(this) + H.z(this.f17571r) + (k() ? this.f17573t.getMeasuredWidth() + AbstractC1080l.a((ViewGroup.MarginLayoutParams) this.f17573t.getLayoutParams()) : 0);
    }

    TextView d() {
        return this.f17571r;
    }

    CharSequence e() {
        return this.f17573t.getContentDescription();
    }

    Drawable f() {
        return this.f17573t.getDrawable();
    }

    int g() {
        return this.f17576w;
    }

    ImageView.ScaleType h() {
        return this.f17577x;
    }

    boolean k() {
        return this.f17573t.getVisibility() == 0;
    }

    void l(boolean z9) {
        this.f17579z = z9;
        C();
    }

    void m() {
        t.d(this.f17570q, this.f17573t, this.f17574u);
    }

    void n(CharSequence charSequence) {
        this.f17572s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f17571r.setText(charSequence);
        C();
    }

    void o(int i10) {
        androidx.core.widget.l.o(this.f17571r, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f17571r.setTextColor(colorStateList);
    }

    void q(boolean z9) {
        this.f17573t.setCheckable(z9);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f17573t.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f17573t.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f17570q, this.f17573t, this.f17574u, this.f17575v);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f17576w) {
            this.f17576w = i10;
            t.g(this.f17573t, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f17573t, onClickListener, this.f17578y);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f17578y = onLongClickListener;
        t.i(this.f17573t, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f17577x = scaleType;
        t.j(this.f17573t, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f17574u != colorStateList) {
            this.f17574u = colorStateList;
            t.a(this.f17570q, this.f17573t, colorStateList, this.f17575v);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f17575v != mode) {
            this.f17575v = mode;
            t.a(this.f17570q, this.f17573t, this.f17574u, mode);
        }
    }

    void z(boolean z9) {
        if (k() != z9) {
            this.f17573t.setVisibility(z9 ? 0 : 8);
            B();
            C();
        }
    }
}
