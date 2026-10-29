package com.nothing.wallpaper.picker.creative.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.nothing.wallpaper.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NTPageIndicator extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayList f18488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f18489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f18490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f18491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18492u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18493v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18494w;

    public NTPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18488q = new ArrayList();
        this.f18492u = -1;
        this.f18493v = 0;
        this.f18494w = 0;
        this.f18489r = (int) context.getResources().getDimension(R.dimen.nt_creative_indicator_width);
        this.f18490s = (int) context.getResources().getDimension(R.dimen.preview_indicator_height);
        this.f18491t = (int) context.getResources().getDimension(R.dimen.nt_creative_indicator_dot_size);
        this.f18494w = getResources().getColor(R.color.nt_unselected_dot_color);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorControlActivated});
        this.f18493v = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
    }

    private void setIndex(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ImageView imageView = (ImageView) getChildAt(i11);
            if (i11 == i10) {
                imageView.setImageTintList(ColorStateList.valueOf(this.f18493v));
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(this.f18494w));
            }
        }
    }

    private void setPosition(int i10) {
        setIndex(i10 >> 1);
        this.f18492u = i10;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(this.f18489r * getChildCount(), this.f18490s);
    }

    public void setLocation(float f10) {
        int i10 = (int) f10;
        setContentDescription(getContext().getString(R.string.accessibility_preview_pager, Integer.valueOf(i10 + 1), Integer.valueOf(getChildCount())));
        int i11 = (f10 != ((float) i10) ? 1 : 0) | (i10 << 1);
        int iIntValue = this.f18492u;
        if (this.f18488q.size() != 0) {
            ArrayList arrayList = this.f18488q;
            iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
        }
        if (i11 == iIntValue) {
            return;
        }
        setPosition(i11);
    }

    public void setNumPages(int i10) {
        setVisibility(i10 > 1 ? 0 : 4);
        while (i10 < getChildCount()) {
            removeViewAt(getChildCount() - 1);
        }
        while (i10 > getChildCount()) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.shape_indicator_dot);
            imageView.setImageTintList(ColorStateList.valueOf(this.f18493v));
            int i11 = this.f18491t;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i11, i11);
            int i12 = (this.f18489r - this.f18491t) / 2;
            marginLayoutParams.setMarginStart(i12);
            marginLayoutParams.setMarginEnd(i12);
            addView(imageView, marginLayoutParams);
        }
        setIndex(this.f18492u >> 1);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.generateLayoutParams(layoutParams);
    }
}
