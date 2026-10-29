package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1019p extends C1017n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f11108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f11109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f11110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f11111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11113i;

    C1019p(SeekBar seekBar) {
        super(seekBar);
        this.f11110f = null;
        this.f11111g = null;
        this.f11112h = false;
        this.f11113i = false;
        this.f11108d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f11109e;
        if (drawable != null) {
            if (this.f11112h || this.f11113i) {
                Drawable drawableR = p201u0.a.r(drawable.mutate());
                this.f11109e = drawableR;
                if (this.f11112h) {
                    p201u0.a.o(drawableR, this.f11110f);
                }
                if (this.f11113i) {
                    p201u0.a.p(this.f11109e, this.f11111g);
                }
                if (this.f11109e.isStateful()) {
                    this.f11109e.setState(this.f11108d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C1017n
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f11108d.getContext();
        int[] iArr = p050f.j.f20567T;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f11108d;
        androidx.core.view.H.e0(seekBar, seekBar.getContext(), iArr, attributeSet, jV.r(), i10, 0);
        Drawable drawableH = jV.h(p050f.j.f20571U);
        if (drawableH != null) {
            this.f11108d.setThumb(drawableH);
        }
        j(jV.g(p050f.j.f20575V));
        int i11 = p050f.j.f20583X;
        if (jV.s(i11)) {
            this.f11111g = v.d(jV.k(i11, -1), this.f11111g);
            this.f11113i = true;
        }
        int i12 = p050f.j.f20579W;
        if (jV.s(i12)) {
            this.f11110f = jV.c(i12);
            this.f11112h = true;
        }
        jV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f11109e != null) {
            int max = this.f11108d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f11109e.getIntrinsicWidth();
                int intrinsicHeight = this.f11109e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f11109e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f11108d.getWidth() - this.f11108d.getPaddingLeft()) - this.f11108d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f11108d.getPaddingLeft(), this.f11108d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f11109e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f11109e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f11108d.getDrawableState())) {
            this.f11108d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f11109e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f11109e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11109e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f11108d);
            p201u0.a.m(drawable, this.f11108d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f11108d.getDrawableState());
            }
            f();
        }
        this.f11108d.invalidate();
    }
}
