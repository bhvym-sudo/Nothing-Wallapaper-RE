package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1010g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f11079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f11080b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f11081c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11082d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11083e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11084f;

    C1010g(CompoundButton compoundButton) {
        this.f11079a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f11079a);
        if (drawableA != null) {
            if (this.f11082d || this.f11083e) {
                Drawable drawableMutate = p201u0.a.r(drawableA).mutate();
                if (this.f11082d) {
                    p201u0.a.o(drawableMutate, this.f11080b);
                }
                if (this.f11083e) {
                    p201u0.a.p(drawableMutate, this.f11081c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f11079a.getDrawableState());
                }
                this.f11079a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f11080b;
    }

    PorterDuff.Mode c() {
        return this.f11081c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int i11;
        int iN;
        int iN2;
        Context context = this.f11079a.getContext();
        int[] iArr = p050f.j.f20572U0;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f11079a;
        androidx.core.view.H.e0(compoundButton, compoundButton.getContext(), iArr, attributeSet, jV.r(), i10, 0);
        try {
            int i12 = p050f.j.f20580W0;
            if (!jV.s(i12) || (iN2 = jV.n(i12, 0)) == 0) {
                i11 = p050f.j.f20576V0;
                if (jV.s(i11) && (iN = jV.n(i11, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f11079a;
                    compoundButton2.setButtonDrawable(p060g.a.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f11079a;
                    compoundButton3.setButtonDrawable(p060g.a.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i11 = p050f.j.f20576V0;
                    if (jV.s(i11)) {
                        CompoundButton compoundButton4 = this.f11079a;
                        compoundButton4.setButtonDrawable(p060g.a.b(compoundButton4.getContext(), iN));
                    }
                }
            }
            int i13 = p050f.j.f20584X0;
            if (jV.s(i13)) {
                androidx.core.widget.c.d(this.f11079a, jV.c(i13));
            }
            int i14 = p050f.j.f20588Y0;
            if (jV.s(i14)) {
                androidx.core.widget.c.e(this.f11079a, v.d(jV.k(i14, -1), null));
            }
        } finally {
            jV.x();
        }
    }

    void e() {
        if (this.f11084f) {
            this.f11084f = false;
        } else {
            this.f11084f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f11080b = colorStateList;
        this.f11082d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f11081c = mode;
        this.f11083e = true;
        a();
    }
}
