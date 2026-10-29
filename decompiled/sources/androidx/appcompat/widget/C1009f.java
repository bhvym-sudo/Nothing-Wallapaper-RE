package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1009f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f11073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f11074b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f11075c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11076d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11077e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11078f;

    C1009f(CheckedTextView checkedTextView) {
        this.f11073a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f11073a);
        if (drawableA != null) {
            if (this.f11076d || this.f11077e) {
                Drawable drawableMutate = p201u0.a.r(drawableA).mutate();
                if (this.f11076d) {
                    p201u0.a.o(drawableMutate, this.f11074b);
                }
                if (this.f11077e) {
                    p201u0.a.p(drawableMutate, this.f11075c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f11073a.getDrawableState());
                }
                this.f11073a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f11074b;
    }

    PorterDuff.Mode c() {
        return this.f11075c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int i11;
        int iN;
        int iN2;
        Context context = this.f11073a.getContext();
        int[] iArr = p050f.j.f20552P0;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f11073a;
        androidx.core.view.H.e0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, jV.r(), i10, 0);
        try {
            int i12 = p050f.j.f20560R0;
            if (!jV.s(i12) || (iN2 = jV.n(i12, 0)) == 0) {
                i11 = p050f.j.f20556Q0;
                if (jV.s(i11) && (iN = jV.n(i11, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f11073a;
                    checkedTextView2.setCheckMarkDrawable(p060g.a.b(checkedTextView2.getContext(), iN));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f11073a;
                    checkedTextView3.setCheckMarkDrawable(p060g.a.b(checkedTextView3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i11 = p050f.j.f20556Q0;
                    if (jV.s(i11)) {
                        CheckedTextView checkedTextView4 = this.f11073a;
                        checkedTextView4.setCheckMarkDrawable(p060g.a.b(checkedTextView4.getContext(), iN));
                    }
                }
            }
            int i13 = p050f.j.f20564S0;
            if (jV.s(i13)) {
                androidx.core.widget.b.b(this.f11073a, jV.c(i13));
            }
            int i14 = p050f.j.f20568T0;
            if (jV.s(i14)) {
                androidx.core.widget.b.c(this.f11073a, v.d(jV.k(i14, -1), null));
            }
        } finally {
            jV.x();
        }
    }

    void e() {
        if (this.f11078f) {
            this.f11078f = false;
        } else {
            this.f11078f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f11074b = colorStateList;
        this.f11076d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f11075c = mode;
        this.f11077e = true;
        a();
    }
}
