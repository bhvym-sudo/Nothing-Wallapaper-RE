package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f16858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f16859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f16860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f16861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final N4.l f16863f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, N4.l lVar, Rect rect) {
        B0.i.c(rect.left);
        B0.i.c(rect.top);
        B0.i.c(rect.right);
        B0.i.c(rect.bottom);
        this.f16858a = rect;
        this.f16859b = colorStateList2;
        this.f16860c = colorStateList;
        this.f16861d = colorStateList3;
        this.f16862e = i10;
        this.f16863f = lVar;
    }

    static b a(Context context, int i10) {
        B0.i.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p225w4.k.f29148X3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(p225w4.k.f29157Y3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p225w4.k.f29176a4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p225w4.k.f29166Z3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p225w4.k.f29186b4, 0));
        ColorStateList colorStateListA = K4.c.a(context, typedArrayObtainStyledAttributes, p225w4.k.f29196c4);
        ColorStateList colorStateListA2 = K4.c.a(context, typedArrayObtainStyledAttributes, p225w4.k.f29246h4);
        ColorStateList colorStateListA3 = K4.c.a(context, typedArrayObtainStyledAttributes, p225w4.k.f29226f4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p225w4.k.f29236g4, 0);
        N4.l lVarM = N4.l.b(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29206d4, 0), typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29216e4, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, lVarM, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        N4.h hVar = new N4.h();
        N4.h hVar2 = new N4.h();
        hVar.setShapeAppearanceModel(this.f16863f);
        hVar2.setShapeAppearanceModel(this.f16863f);
        if (colorStateList == null) {
            colorStateList = this.f16860c;
        }
        hVar.V(colorStateList);
        hVar.a0(this.f16862e, this.f16861d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f16859b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f16859b.withAlpha(30), hVar, hVar2);
        Rect rect = this.f16858a;
        H.k0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
