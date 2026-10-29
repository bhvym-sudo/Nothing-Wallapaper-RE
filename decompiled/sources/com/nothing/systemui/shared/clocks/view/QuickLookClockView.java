package com.nothing.systemui.shared.clocks.view;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class QuickLookClockView extends D {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f18370L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private X5.a f18371M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Boolean f18372N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Y5.a f18373O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickLookClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final void J(X5.a aVar, Y5.a aVar2) {
        String strC;
        int iC = aVar2 != null ? aVar2.c() : Integer.MIN_VALUE;
        String strF = "";
        if (aVar2 == null || (strC = aVar2.b()) == null) {
            strC = "";
        }
        if (aVar != null && aVar.h()) {
            strF = aVar.f();
        } else if (iC != Integer.MIN_VALUE) {
            strF = iC + "°";
        }
        if (aVar != null && aVar.h()) {
            strC = X5.b.c(getContext(), aVar);
        }
        TextView textView = (TextView) findViewById(I2.d.f2962p);
        if (textView != null) {
            textView.setText(strF);
        }
        TextView textView2 = (TextView) findViewById(I2.d.f2957k);
        if (textView2 != null) {
            textView2.setText(strC);
        }
        TextView textView3 = (TextView) findViewById(I2.d.f2960n);
        if (textView3 != null) {
            textView3.setVisibility(((aVar == null || !aVar.h()) && iC == Integer.MIN_VALUE) ? 0 : 8);
        }
        A();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    @Override // com.nothing.systemui.shared.clocks.view.D
    protected void A() {
        int i10;
        boolean z9 = k() || m();
        Boolean bool = this.f18372N;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int iB = p171r0.a.b(getContext(), I2.a.f2824b);
        int iB2 = p171r0.a.b(getContext(), R.color.system_neutral1_50);
        int iB3 = p171r0.a.b(getContext(), R.color.system_neutral1_900);
        int i11 = z9 ? I2.c.f2875G0 : I2.c.f2873F0;
        X5.a aVar = this.f18371M;
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.c()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 2)) {
            i10 = iB;
        } else if (z9) {
            i10 = -1;
        } else {
            i10 = zBooleanValue ? iB3 : iB2;
        }
        float clockPaddingHorizontal = getClockPaddingHorizontal();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i12 = displayMetrics.widthPixels;
        int i13 = displayMetrics.heightPixels;
        if (i12 >= i13) {
            i12 = i13;
        }
        int i14 = (int) (i12 - (clockPaddingHorizontal * 2));
        int i15 = (i14 * 104) / 354;
        LinearLayout linearLayout = (LinearLayout) findViewById(I2.d.f2953g);
        if (linearLayout != null) {
            Drawable drawableD = p171r0.a.d(linearLayout.getContext(), i11);
            if (drawableD != null) {
                drawableD.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            } else {
                drawableD = null;
            }
            linearLayout.setBackground(drawableD);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = i14;
            layoutParams.height = i15;
            linearLayout.setLayoutParams(layoutParams);
        }
        X5.a aVar2 = this.f18371M;
        Integer numValueOf2 = aVar2 != null ? Integer.valueOf(aVar2.c()) : null;
        if ((numValueOf2 != null && numValueOf2.intValue() == 1) || (numValueOf2 != null && numValueOf2.intValue() == 2)) {
            if (!z9) {
                iB = iB3;
            }
        } else if (z9) {
            iB = -1;
        } else if (zBooleanValue) {
            iB = iB2;
        } else {
            iB = iB3;
        }
        TextView textView = (TextView) findViewById(I2.d.f2952f);
        if (textView != null) {
            textView.setTextColor(iB);
        }
        TextView textView2 = (TextView) findViewById(I2.d.f2962p);
        if (textView2 != null) {
            textView2.setTextColor(iB);
        }
        TextView textView3 = (TextView) findViewById(I2.d.f2957k);
        if (textView3 != null) {
            textView3.setTextColor(iB);
        }
        TextView textView4 = (TextView) findViewById(I2.d.f2960n);
        if (textView4 != null) {
            textView4.setTextColor(iB);
        }
        TextView textView5 = (TextView) findViewById(I2.d.f2967u);
        if (textView5 != null) {
            textView5.setTextColor(iB);
        }
        ImageView imageView = (ImageView) findViewById(I2.d.f2965s);
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void F() {
        super.F();
        J(this.f18371M, this.f18373O);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    public String getTag() {
        return this.f18370L;
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void h(Canvas canvas) {
        TextView textView;
        kotlin.jvm.internal.n.h(canvas, "canvas");
        String timeStr = getTimeStr();
        if (timeStr.length() <= 0 || (textView = (TextView) findViewById(I2.d.f2952f)) == null) {
            return;
        }
        textView.setText(timeStr);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            int width = (getWidth() - childAt.getMeasuredWidth()) / 2;
            int height = (getHeight() - childAt.getMeasuredHeight()) / 2;
            childAt.layout(width, height, childAt.getMeasuredWidth() + width, childAt.getMeasuredHeight() + height);
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D, android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChildren(i10, i11);
        super.onMeasure(i10, i11);
        int dimension = (int) (getResources().getDimension(I2.b.f2849n) * getScaleRatio());
        int dimension2 = (int) (getResources().getDimension(I2.b.f2841f) * getScaleRatio());
        float dimension3 = getResources().getDimension(I2.b.f2850o) * getScaleRatio();
        float dimension4 = getResources().getDimension(I2.b.f2851p) * getScaleRatio();
        FrameLayout frameLayout = (FrameLayout) findViewById(I2.d.f2958l);
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            frameLayout.setPadding(dimension, dimension, dimension, dimension);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setLayoutDirection(frameLayout.getResources().getConfiguration().getLayoutDirection() != 1 ? 0 : 1);
        }
        ImageView imageView = (ImageView) findViewById(I2.d.f2965s);
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.width = dimension2;
            layoutParams2.height = dimension2;
            imageView.setLayoutParams(layoutParams2);
        }
        TextView textView = (TextView) findViewById(I2.d.f2952f);
        if (textView != null) {
            textView.setTextSize(0, dimension3);
        }
        TextView textView2 = (TextView) findViewById(I2.d.f2967u);
        if (textView2 != null) {
            textView2.setTextSize(0, dimension3);
        }
        TextView textView3 = (TextView) findViewById(I2.d.f2960n);
        if (textView3 != null) {
            textView3.setTextSize(0, dimension3);
        }
        TextView textView4 = (TextView) findViewById(I2.d.f2962p);
        if (textView4 != null) {
            textView4.setTextSize(0, dimension4);
        }
        TextView textView5 = (TextView) findViewById(I2.d.f2957k);
        if (textView5 != null) {
            textView5.setTextSize(0, dimension4);
        }
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void p(X5.a aVar) {
        if (kotlin.jvm.internal.n.d(this.f18371M, aVar)) {
            return;
        }
        this.f18371M = aVar;
        J(aVar, this.f18373O);
    }

    @Override // com.nothing.systemui.shared.clocks.view.D
    public void y(Y5.a aVar) {
        if (kotlin.jvm.internal.n.d(this.f18373O, aVar)) {
            return;
        }
        this.f18373O = aVar;
        int iA = Y5.b.f9357a.a(aVar != null ? aVar.a() : 0);
        ImageView imageView = (ImageView) findViewById(I2.d.f2965s);
        if (imageView != null) {
            imageView.setImageResource(iA);
        }
        TextView textView = (TextView) findViewById(I2.d.f2967u);
        if (textView != null) {
            textView.setVisibility(iA != 0 ? 8 : 0);
        }
        J(this.f18371M, aVar);
    }

    public /* synthetic */ QuickLookClockView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickLookClockView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18370L = "QuickLookClockView";
    }
}
