package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class NTPageView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LayoutInflater f18931q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NTPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    public final void a(int i10, float f10) {
        scrollTo((int) (Math.max(0.0f, isLayoutRtl() ? (getChildCount() - 1) - (i10 + f10) : i10 + f10) * getMeasuredWidth()), 0);
    }

    public final void b(List data) {
        kotlin.jvm.internal.n.h(data, "data");
        removeAllViews();
        Iterator it = data.iterator();
        while (it.hasNext()) {
            com.nothing.launcher.card.j jVar = (com.nothing.launcher.card.j) it.next();
            View viewInflate = this.f18931q.inflate(R.layout.widget_description_item, (ViewGroup) this, false);
            ((TextView) viewInflate.requireViewById(R.id.widget_size)).setText(jVar.B0() + "x" + jVar.C0());
            TextView textView = (TextView) viewInflate.requireViewById(R.id.widget_describe);
            Context context = viewInflate.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            textView.setText(jVar.x0(context));
            addView(viewInflate);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth();
        int childCount = 0;
        for (Object obj : androidx.core.view.K.b(this)) {
            int i14 = childCount + 1;
            if (childCount < 0) {
                AbstractC1444s.t();
            }
            View view = (View) obj;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (isLayoutRtl()) {
                childCount = (getChildCount() - 1) - childCount;
            }
            int iMax = (Math.max(0, childCount) * measuredWidth) + paddingLeft;
            view.layout(iMax, paddingTop, measuredWidth2 + iMax, measuredHeight + paddingTop);
            childCount = i14;
        }
    }

    public /* synthetic */ NTPageView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTPageView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18931q = LayoutInflater.from(context);
    }
}
