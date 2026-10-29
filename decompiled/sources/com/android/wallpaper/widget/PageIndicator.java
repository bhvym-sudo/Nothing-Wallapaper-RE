package com.android.wallpaper.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.ImageView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.nothing.wallpaper.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PageIndicator extends ViewGroup {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static Method f16108x;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList f16109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f16110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f16111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f16112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f16113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Animatable2.AnimationCallback f16115w;

    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(PageIndicator.this.f16115w);
            }
            PageIndicator.this.f16114v = false;
            if (PageIndicator.this.f16109q.size() != 0) {
                PageIndicator pageIndicator = PageIndicator.this;
                pageIndicator.setPosition(((Integer) pageIndicator.f16109q.remove(0)).intValue());
            }
        }
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16109q = new ArrayList();
        this.f16113u = -1;
        this.f16115w = new a();
        int dimension = (int) context.getResources().getDimension(R.dimen.preview_indicator_width);
        this.f16110r = dimension;
        this.f16111s = (int) context.getResources().getDimension(R.dimen.preview_indicator_height);
        this.f16112t = (int) (dimension * 0.4f);
    }

    private void e(int i10, int i11) {
        int i12 = i10 >> 1;
        int i13 = i11 >> 1;
        setIndex(i12);
        boolean z9 = (i10 & 1) != 0;
        boolean z10 = !z9 ? i10 >= i11 : i10 <= i11;
        int iMin = Math.min(i12, i13);
        int iMax = Math.max(i12, i13);
        if (iMax == iMin) {
            iMax++;
        }
        ImageView imageView = (ImageView) getChildAt(iMin);
        ImageView imageView2 = (ImageView) getChildAt(iMax);
        if (imageView == null || imageView2 == null) {
            return;
        }
        imageView2.setTranslationX(imageView.getX() - imageView2.getX());
        i(imageView, h(z9, z10, false));
        imageView.setAlpha(g(false));
        i(imageView2, h(z9, z10, true));
        imageView2.setAlpha(g(true));
        this.f16114v = true;
    }

    private void f(AnimatedVectorDrawable animatedVectorDrawable) throws IllegalAccessException, InvocationTargetException {
        if (f16108x == null) {
            f16108x = AnimatedVectorDrawable.class.getMethod("forceAnimationOnUI", new Class[0]);
        }
        Method method = f16108x;
        if (method != null) {
            method.invoke(animatedVectorDrawable, new Object[0]);
        }
    }

    private float g(boolean z9) {
        return z9 ? 1.0f : 0.42f;
    }

    private int h(boolean z9, boolean z10, boolean z11) {
        if (z11) {
            if (z9) {
                return z10 ? R.drawable.major_b_a_animation : R.drawable.major_b_c_animation;
            }
            return z10 ? R.drawable.major_a_b_animation : R.drawable.major_c_b_animation;
        }
        if (z9) {
            return z10 ? R.drawable.minor_b_c_animation : R.drawable.minor_b_a_animation;
        }
        return z10 ? R.drawable.minor_c_b_animation : R.drawable.minor_a_b_animation;
    }

    private void i(ImageView imageView, int i10) {
        Drawable drawable = getContext().getDrawable(i10);
        if (drawable instanceof AnimatedVectorDrawable) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            imageView.setImageDrawable(animatedVectorDrawable);
            try {
                f(animatedVectorDrawable);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                Log.e("PageIndicator", "Catch an exception in playAnimation", e10);
            }
            animatedVectorDrawable.registerAnimationCallback(this.f16115w);
            animatedVectorDrawable.start();
        }
    }

    private void setIndex(int i10) {
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            ImageView imageView = (ImageView) getChildAt(i11);
            imageView.setTranslationX(0.0f);
            imageView.setImageResource(R.drawable.major_a_b);
            imageView.setAlpha(g(i11 == i10));
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(int i10) {
        int i11 = this.f16113u;
        if (i11 < 0 || Math.abs(i11 - i10) != 1) {
            setIndex(i10 >> 1);
        } else {
            e(this.f16113u, i10);
        }
        this.f16113u = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            int i15 = (this.f16110r - this.f16112t) * i14;
            getChildAt(i14).layout(i15, 0, this.f16110r + i15, this.f16111s);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f16110r, BasicMeasure.EXACTLY);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f16111s, BasicMeasure.EXACTLY);
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        int i13 = this.f16110r;
        int i14 = this.f16112t;
        setMeasuredDimension(((i13 - i14) * (childCount - 1)) + i14, this.f16111s);
    }

    public void setLocation(float f10) {
        int i10 = (int) f10;
        setContentDescription(getContext().getString(R.string.accessibility_preview_pager, Integer.valueOf(i10 + 1), Integer.valueOf(getChildCount())));
        int i11 = (f10 != ((float) i10) ? 1 : 0) | (i10 << 1);
        int iIntValue = this.f16113u;
        if (this.f16109q.size() != 0) {
            ArrayList arrayList = this.f16109q;
            iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
        }
        if (i11 == iIntValue) {
            return;
        }
        if (this.f16114v) {
            this.f16109q.add(Integer.valueOf(i11));
        } else {
            setPosition(i11);
        }
    }

    public void setNumPages(int i10) {
        setVisibility(i10 > 1 ? 0 : 4);
        if (this.f16114v) {
            Log.w("PageIndicator", "setNumPages during animation");
        }
        while (i10 < getChildCount()) {
            removeViewAt(getChildCount() - 1);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorControlActivated});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        while (i10 > getChildCount()) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.minor_a_b);
            imageView.setImageTintList(ColorStateList.valueOf(color));
            addView(imageView, new ViewGroup.LayoutParams(this.f16110r, this.f16111s));
        }
        setIndex(this.f16113u >> 1);
    }
}
