package com.nothing.wallpaper.picker.edit.preview.widget;

import H3.s;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.K;
import com.nothing.wallpaper.picker.edit.preview.widget.NTDisplayAspectRatioLinearLayout;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p079h8.o;
import p079h8.v;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class NTDisplayAspectRatioLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f18546r = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final h f18547q;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Point a(Context context, int i10, int i11) {
            n.h(context, "context");
            int i12 = (i11 - ((i10 - 1) * 12)) / i10;
            return new Point(i12, (int) Math.ceil(((double) (i12 * s.a().d(context))) * 1.0d));
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NTDisplayAspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(Context context) {
        return s.a().d(context);
    }

    private final int c(int i10, float f10) {
        return (int) (i10 * f10);
    }

    private final float getScreenAspectRatio() {
        return ((Number) this.f18547q.getValue()).floatValue();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        o oVarA;
        super.onMeasure(i10, i11);
        if (getChildCount() == 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iC = c(12, getContext().getResources().getDisplayMetrics().density);
        int paddingStart = getChildAt(0).getPaddingStart() * 2;
        if (getOrientation() == 0) {
            int paddingStart2 = ((measuredWidth - getPaddingStart()) - getPaddingEnd()) - ((getChildCount() - 1) * iC);
            int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
            int childCount = paddingStart2 / getChildCount();
            int screenAspectRatio = (int) (((childCount - paddingStart) * getScreenAspectRatio()) + paddingStart);
            if (screenAspectRatio > paddingTop) {
                childCount = (int) (paddingTop / getScreenAspectRatio());
            } else {
                paddingTop = screenAspectRatio;
            }
            oVarA = v.a(Integer.valueOf(childCount), Integer.valueOf(paddingTop));
        } else {
            int paddingStart3 = (measuredWidth - getPaddingStart()) - getPaddingEnd();
            int paddingTop2 = (((measuredHeight - getPaddingTop()) - getPaddingBottom()) - ((getChildCount() - 1) * iC)) / getChildCount();
            int screenAspectRatio2 = (int) (((paddingTop2 - paddingStart) / getScreenAspectRatio()) + paddingStart);
            if (screenAspectRatio2 > paddingStart3) {
                paddingTop2 = (int) (paddingStart3 * getScreenAspectRatio());
            } else {
                paddingStart3 = screenAspectRatio2;
            }
            oVarA = v.a(Integer.valueOf(paddingStart3), Integer.valueOf(paddingTop2));
        }
        int iIntValue = ((Number) oVarA.a()).intValue();
        int iIntValue2 = ((Number) oVarA.b()).intValue();
        int iC2 = c(12, getContext().getResources().getDisplayMetrics().density);
        int i12 = 0;
        for (Object obj : K.b(this)) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC1444s.t();
            }
            View view = (View) obj;
            boolean z9 = i12 < getChildCount() - 1;
            if (getOrientation() == 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z9) {
                    marginLayoutParams.setMarginEnd(iC2);
                }
                view.setLayoutParams(marginLayoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z9) {
                    marginLayoutParams2.bottomMargin = iC2;
                }
                view.setLayoutParams(marginLayoutParams2);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(iIntValue2, BasicMeasure.EXACTLY));
            if (getOrientation() == 0) {
                setMeasuredDimension(measuredWidth, iIntValue2);
            } else {
                setMeasuredDimension(iIntValue, measuredHeight);
            }
            i12 = i13;
        }
    }

    public /* synthetic */ NTDisplayAspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTDisplayAspectRatioLinearLayout(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f18547q = i.b(new p219v8.a() { // from class: t7.a
            @Override // p219v8.a
            public final Object invoke() {
                return Float.valueOf(NTDisplayAspectRatioLinearLayout.b(context));
            }
        });
    }
}
