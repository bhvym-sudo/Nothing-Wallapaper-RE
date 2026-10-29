package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class TransitionImageView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v0 f19019q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransitionImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            kotlin.jvm.internal.n.g(bitmap, "getBitmap(...)");
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.n.g(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p004a3.a.f9706Y2);
        kotlin.jvm.internal.n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(3, -1);
        F2.h hVar = F2.h.f1567a;
        Context context = getContext();
        kotlin.jvm.internal.n.g(context, "getContext(...)");
        Integer numK = hVar.k(context, R.drawable.shape_hollow_circle, R.drawable.shape_hollow_circle_dark);
        if (numK != null) {
            this.f19019q.f20154x.setBackgroundResource(numK.intValue());
        }
        if (resourceId != -1) {
            this.f19019q.f20155y.setBackgroundResource(resourceId);
        }
        if (resourceId2 != -1) {
            this.f19019q.f20152v.setBackgroundResource(resourceId2);
        }
        if (resourceId3 != -1) {
            this.f19019q.f20153w.setBackgroundResource(resourceId3);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f19019q.f20154x.setAlpha(0.0f);
        this.f19019q.f20152v.setAlpha(0.0f);
        this.f19019q.f20155y.setAlpha(0.0f);
        this.f19019q.f20153w.setAlpha(0.0f);
    }

    public final void c(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.f19019q.f20154x.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f19019q.f20154x.requestLayout();
    }

    public final void d(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.f19019q.f20155y.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f19019q.f20155y.requestLayout();
    }

    public final void e(Drawable drawable, ColorStateList colorStateList) {
        kotlin.jvm.internal.n.h(drawable, "drawable");
        drawable.setTintList(colorStateList);
        this.f19019q.f20152v.setImageBitmap(a(drawable));
    }

    public final void f(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.f19019q.f20152v.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f19019q.f20152v.requestLayout();
    }

    public final void g(Drawable drawable, ColorStateList colorStateList) {
        kotlin.jvm.internal.n.h(drawable, "drawable");
        drawable.setTintList(colorStateList);
        this.f19019q.f20153w.setImageBitmap(a(drawable));
    }

    public final void h(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.f19019q.f20153w.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f19019q.f20153w.requestLayout();
    }

    public final void setAnimAlpha(float f10) {
        this.f19019q.f20154x.setAlpha(f10);
        this.f19019q.f20152v.setAlpha(f10);
        float f11 = 1 - f10;
        this.f19019q.f20155y.setAlpha(f11);
        this.f19019q.f20153w.setAlpha(f11);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence description) {
        kotlin.jvm.internal.n.h(description, "description");
        super.setContentDescription(description);
        this.f19019q.f20156z.setContentDescription(description);
    }

    public /* synthetic */ TransitionImageView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        v0 v0VarC = v0.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(v0VarC, "inflate(...)");
        this.f19019q = v0VarC;
        b(attributeSet);
    }
}
