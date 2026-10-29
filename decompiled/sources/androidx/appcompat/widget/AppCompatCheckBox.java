package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements androidx.core.widget.n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1010g f10664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1008e f10665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final r f10666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1013j f10667t;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20351q);
    }

    private C1013j getEmojiTextViewHelper() {
        if (this.f10667t == null) {
            this.f10667t = new C1013j(this);
        }
        return this.f10667t;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1008e c1008e = this.f10665r;
        if (c1008e != null) {
            c1008e.b();
        }
        r rVar = this.f10666s;
        if (rVar != null) {
            rVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1008e c1008e = this.f10665r;
        if (c1008e != null) {
            return c1008e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1008e c1008e = this.f10665r;
        if (c1008e != null) {
            return c1008e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.n
    public ColorStateList getSupportButtonTintList() {
        C1010g c1010g = this.f10664q;
        if (c1010g != null) {
            return c1010g.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1010g c1010g = this.f10664q;
        if (c1010g != null) {
            return c1010g.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10666s.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10666s.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1008e c1008e = this.f10665r;
        if (c1008e != null) {
            c1008e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1008e c1008e = this.f10665r;
        if (c1008e != null) {
            c1008e.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1010g c1010g = this.f10664q;
        if (c1010g != null) {
            c1010g.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10666s;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f10666s;
        if (rVar != null) {
            rVar.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1008e c1008e = this.f10665r;
        if (c1008e != null) {
            c1008e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1008e c1008e = this.f10665r;
        if (c1008e != null) {
            c1008e.j(mode);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1010g c1010g = this.f10664q;
        if (c1010g != null) {
            c1010g.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1010g c1010g = this.f10664q;
        if (c1010g != null) {
            c1010g.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f10666s.w(colorStateList);
        this.f10666s.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f10666s.x(mode);
        this.f10666s.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(G.b(context), attributeSet, i10);
        F.a(this, getContext());
        C1010g c1010g = new C1010g(this);
        this.f10664q = c1010g;
        c1010g.d(attributeSet, i10);
        C1008e c1008e = new C1008e(this);
        this.f10665r = c1008e;
        c1008e.e(attributeSet, i10);
        r rVar = new r(this);
        this.f10666s = rVar;
        rVar.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p060g.a.b(getContext(), i10));
    }
}
