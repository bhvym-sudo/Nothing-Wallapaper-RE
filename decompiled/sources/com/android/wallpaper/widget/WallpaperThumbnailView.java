package com.android.wallpaper.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class WallpaperThumbnailView extends ImageView {
    public WallpaperThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void a() {
        float f10;
        float f11;
        if (getDrawable() == null) {
            return;
        }
        Matrix imageMatrix = getImageMatrix();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        if (intrinsicWidth * height > intrinsicHeight * width) {
            f10 = height;
            f11 = intrinsicHeight;
        } else {
            f10 = width;
            f11 = intrinsicWidth;
        }
        float f12 = f10 / f11;
        imageMatrix.setScale(f12, f12);
        float f13 = intrinsicHeight * f12;
        float f14 = height;
        if (f13 > f14) {
            imageMatrix.postTranslate(0.0f, -((f13 - f14) / 2.0f));
        }
        if (getLayoutDirection() == 1) {
            imageMatrix.postTranslate(-((intrinsicWidth * f12) - width), 0.0f);
        }
        setImageMatrix(imageMatrix);
        invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        a();
    }
}
