package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class DeleteDropView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final x0 f18903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f18904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.android.launcher3.views.f f18905s;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.n.h(view, "view");
            kotlin.jvm.internal.n.h(outline, "outline");
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), DeleteDropView.this.f18904r);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeleteDropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    public final Rect b(com.android.launcher3.h.a dragObject) {
        p079h8.o oVarA;
        kotlin.jvm.internal.n.h(dragObject, "dragObject");
        Rect rect = new Rect();
        TextView textView = this.f18903q.f20166v;
        int measuredWidth = dragObject.f15598f.getMeasuredWidth();
        int measuredHeight = dragObject.f15598f.getMeasuredHeight();
        int intrinsicWidth = textView.getCompoundDrawables()[1].getIntrinsicWidth();
        int intrinsicHeight = textView.getCompoundDrawables()[1].getIntrinsicHeight();
        this.f18905s.J().l(textView, rect);
        if (com.android.launcher3.w.g(textView.getResources())) {
            int measuredWidth2 = rect.right - ((textView.getMeasuredWidth() - intrinsicWidth) / 2);
            oVarA = p079h8.v.a(Integer.valueOf(measuredWidth2), Integer.valueOf(measuredWidth2 - intrinsicWidth));
        } else {
            int measuredWidth3 = rect.left + ((textView.getMeasuredWidth() - intrinsicWidth) / 2);
            oVarA = p079h8.v.a(Integer.valueOf(measuredWidth3), Integer.valueOf(measuredWidth3 + intrinsicWidth));
        }
        int iIntValue = ((Number) oVarA.a()).intValue();
        int iIntValue2 = ((Number) oVarA.b()).intValue();
        int i10 = rect.top;
        rect.set(iIntValue, i10, iIntValue2, i10 + intrinsicHeight);
        rect.offset((-(measuredWidth - intrinsicWidth)) / 2, (-(measuredHeight - intrinsicHeight)) / 2);
        return rect;
    }

    public /* synthetic */ DeleteDropView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteDropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        x0 x0VarC = x0.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(x0VarC, "inflate(...)");
        this.f18903q = x0VarC;
        this.f18904r = getResources().getDimension(R.dimen.bottom_sheet_bg_radius);
        this.f18905s = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        setOutlineProvider(new a());
        setClipToOutline(true);
        setBackgroundColor(p171r0.a.b(context, R.color.material_color_on_primary));
    }
}
