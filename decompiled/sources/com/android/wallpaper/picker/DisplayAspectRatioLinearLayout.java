package com.android.wallpaper.picker;

import H3.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.K;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p079h8.v;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayAspectRatioLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f15932q = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayAspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
    }

    private final int a(int i10, float f10) {
        return (int) (i10 * f10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        o oVarA;
        super.onMeasure(i10, i11);
        float fD = s.a().d(getContext());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iA = a(12, getContext().getResources().getDisplayMetrics().density);
        if (getOrientation() == 0) {
            int paddingStart = ((measuredWidth - getPaddingStart()) - getPaddingEnd()) - ((getChildCount() - 1) * iA);
            int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
            int childCount = paddingStart / getChildCount();
            int i12 = (int) (childCount * fD);
            if (i12 > paddingTop) {
                childCount = (int) (paddingTop / fD);
            } else {
                paddingTop = i12;
            }
            oVarA = v.a(Integer.valueOf(childCount), Integer.valueOf(paddingTop));
        } else {
            int paddingStart2 = (measuredWidth - getPaddingStart()) - getPaddingEnd();
            int paddingTop2 = (((measuredHeight - getPaddingTop()) - getPaddingBottom()) - ((getChildCount() - 1) * iA)) / getChildCount();
            int i13 = (int) (paddingTop2 / fD);
            if (i13 > paddingStart2) {
                paddingTop2 = (int) (paddingStart2 * fD);
            } else {
                paddingStart2 = i13;
            }
            oVarA = v.a(Integer.valueOf(paddingStart2), Integer.valueOf(paddingTop2));
        }
        int iIntValue = ((Number) oVarA.a()).intValue();
        int iIntValue2 = ((Number) oVarA.b()).intValue();
        int iA2 = a(6, getContext().getResources().getDisplayMetrics().density);
        int i14 = 0;
        for (Object obj : K.b(this)) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC1444s.t();
            }
            View view = (View) obj;
            boolean z9 = i14 > 0;
            boolean z10 = i14 < getChildCount() - 1;
            if (getOrientation() == 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z9) {
                    marginLayoutParams.setMarginStart(iA2);
                }
                if (z10) {
                    marginLayoutParams.setMarginEnd(iA2);
                }
                view.setLayoutParams(marginLayoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z9) {
                    marginLayoutParams2.topMargin = iA2;
                }
                if (z10) {
                    marginLayoutParams2.bottomMargin = iA2;
                }
                view.setLayoutParams(marginLayoutParams2);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(iIntValue2, BasicMeasure.EXACTLY));
            i14 = i15;
        }
    }
}
