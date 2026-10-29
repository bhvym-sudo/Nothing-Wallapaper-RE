package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final C1008e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C1015l mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.b();
        }
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            c1015l.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            return c1008e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            return c1008e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            return c1015l.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            return c1015l.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            c1015l.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null && drawable != null && !this.mHasLevel) {
            c1015l.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1015l c1015l2 = this.mImageHelper;
        if (c1015l2 != null) {
            c1015l2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            c1015l.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            c1015l.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1008e c1008e = this.mBackgroundTintHelper;
        if (c1008e != null) {
            c1008e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            c1015l.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1015l c1015l = this.mImageHelper;
        if (c1015l != null) {
            c1015l.k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(G.b(context), attributeSet, i10);
        this.mHasLevel = false;
        F.a(this, getContext());
        C1008e c1008e = new C1008e(this);
        this.mBackgroundTintHelper = c1008e;
        c1008e.e(attributeSet, i10);
        C1015l c1015l = new C1015l(this);
        this.mImageHelper = c1015l;
        c1015l.g(attributeSet, i10);
    }
}
