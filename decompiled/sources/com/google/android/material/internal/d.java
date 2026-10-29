package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends LinearLayoutCompat {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Drawable f17092F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Rect f17093G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Rect f17094H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f17095I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected boolean f17096J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    boolean f17097K;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17093G = new Rect();
        this.f17094H = new Rect();
        this.f17095I = 119;
        this.f17096J = true;
        this.f17097K = false;
        TypedArray typedArrayI = k.i(context, attributeSet, p225w4.k.f29021J2, i10, 0, new int[0]);
        this.f17095I = typedArrayI.getInt(p225w4.k.f29039L2, this.f17095I);
        Drawable drawable = typedArrayI.getDrawable(p225w4.k.f29030K2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f17096J = typedArrayI.getBoolean(p225w4.k.f29048M2, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17092F;
        if (drawable != null) {
            if (this.f17097K) {
                this.f17097K = false;
                Rect rect = this.f17093G;
                Rect rect2 = this.f17094H;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f17096J) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f17095I, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f17092F;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17092F;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f17092F.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f17092F;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f17095I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17092F;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        this.f17097K = z9 | this.f17097K;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f17097K = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f17092F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f17092F);
            }
            this.f17092F = drawable;
            this.f17097K = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f17095I == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f17095I != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f17095I = i10;
            if (i10 == 119 && this.f17092F != null) {
                this.f17092F.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17092F;
    }
}
