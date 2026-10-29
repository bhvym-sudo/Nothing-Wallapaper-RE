package com.google.android.material.appbar;

import N4.h;
import N4.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.H;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f16435s0 = j.f28928y;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f16436t0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Integer f16437n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f16438o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f16439p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private ImageView.ScaleType f16440q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Boolean f16441r0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28703f0);
    }

    private Pair U(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void V(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.a.f(background);
        if (colorStateListValueOf != null) {
            h hVar = new h();
            hVar.V(colorStateListValueOf);
            hVar.K(context);
            hVar.U(H.r(this));
            H.k0(this, hVar);
        }
    }

    private void W(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, BasicMeasure.EXACTLY), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void X() {
        if (this.f16438o0 || this.f16439p0) {
            TextView textViewE = l.e(this);
            TextView textViewC = l.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairU = U(textViewE, textViewC);
            if (this.f16438o0 && textViewE != null) {
                W(textViewE, pairU);
            }
            if (!this.f16439p0 || textViewC == null) {
                return;
            }
            W(textViewC, pairU);
        }
    }

    private Drawable Y(Drawable drawable) {
        if (drawable == null || this.f16437n0 == null) {
            return drawable;
        }
        Drawable drawableR = p201u0.a.r(drawable.mutate());
        p201u0.a.n(drawableR, this.f16437n0.intValue());
        return drawableR;
    }

    private void Z() {
        ImageView imageViewB = l.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f16441r0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f16440q0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f16440q0;
    }

    public Integer getNavigationIconTint() {
        return this.f16437n0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        X();
        Z();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        i.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z9) {
        Boolean bool = this.f16441r0;
        if (bool == null || bool.booleanValue() != z9) {
            this.f16441r0 = Boolean.valueOf(z9);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f16440q0 != scaleType) {
            this.f16440q0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Y(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f16437n0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z9) {
        if (this.f16439p0 != z9) {
            this.f16439p0 = z9;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z9) {
        if (this.f16438o0 != z9) {
            this.f16438o0 = z9;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void y(int i10) {
        Menu menu = getMenu();
        boolean z9 = menu instanceof androidx.appcompat.view.menu.e;
        if (z9) {
            ((androidx.appcompat.view.menu.e) menu).e0();
        }
        super.y(i10);
        if (z9) {
            ((androidx.appcompat.view.menu.e) menu).d0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f16435s0;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = k.i(context2, attributeSet, p225w4.k.f29050M4, i10, i11, new int[0]);
        int i12 = p225w4.k.f29077P4;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        this.f16438o0 = typedArrayI.getBoolean(p225w4.k.f29095R4, false);
        this.f16439p0 = typedArrayI.getBoolean(p225w4.k.f29086Q4, false);
        int i13 = typedArrayI.getInt(p225w4.k.f29068O4, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f16436t0;
            if (i13 < scaleTypeArr.length) {
                this.f16440q0 = scaleTypeArr[i13];
            }
        }
        int i14 = p225w4.k.f29059N4;
        if (typedArrayI.hasValue(i14)) {
            this.f16441r0 = Boolean.valueOf(typedArrayI.getBoolean(i14, false));
        }
        typedArrayI.recycle();
        V(context2);
    }
}
