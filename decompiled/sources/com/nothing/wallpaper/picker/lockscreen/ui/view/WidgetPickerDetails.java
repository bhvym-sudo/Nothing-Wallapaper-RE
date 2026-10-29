package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.D0;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetPickerDetails extends ConstraintLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final D0 f19045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.android.launcher3.views.f f19046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.android.launcher3.f f19047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f19048t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private E7.S f19049u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p079h8.h f19050v;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.n.h(view, "view");
            kotlin.jvm.internal.n.h(outline, "outline");
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), WidgetPickerDetails.this.f19048t);
        }
    }

    public static final class b extends ViewPager2.OnPageChangeCallback {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            if (WidgetPickerDetails.this.f19045q.f19820B.getScrollState() != 0) {
                WidgetPickerDetails.this.f19045q.f19824x.r(i11 + (WidgetPickerDetails.this.getPageSize() * i10), WidgetPickerDetails.this.getPageSize() * Math.max(WidgetPickerDetails.this.getWidgetPreviewAdapter().getItemCount() - 1, 0));
            } else {
                WidgetPickerDetails.this.f19045q.f19824x.setCurrentPosition(i10);
            }
            WidgetPickerDetails.this.f19045q.f19819A.a(i10, f10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            WidgetPickerDetails.this.f19045q.f19824x.setActiveMarker(i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetPickerDetails(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WidgetPickerDetails widgetPickerDetails, View view) {
        E7.S s9 = widgetPickerDetails.f19049u;
        if (s9 != null) {
            s9.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageSize() {
        View childAt = this.f19045q.f19820B.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        return recyclerView != null ? (recyclerView.getWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd() : getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F7.p getWidgetPreviewAdapter() {
        return (F7.p) this.f19050v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F7.p j(WidgetPickerDetails widgetPickerDetails) {
        widgetPickerDetails.f19049u = E7.S.f1327c.a(widgetPickerDetails.getParent());
        com.android.launcher3.f deviceProfile = widgetPickerDetails.f19047s;
        kotlin.jvm.internal.n.g(deviceProfile, "deviceProfile");
        return new F7.p(deviceProfile, widgetPickerDetails.f19049u);
    }

    public final void i(p258z7.d info) {
        kotlin.jvm.internal.n.h(info, "info");
        this.f19045q.f19821C.setText(info.c());
        this.f19045q.f19819A.b(info.a());
        getWidgetPreviewAdapter().submitList(info.a());
        Object tag = getTag();
        p258z7.c cVar = tag instanceof p258z7.c ? (p258z7.c) tag : null;
        if (cVar != null) {
            if ((kotlin.jvm.internal.n.d(cVar, info.b()) ? null : cVar) != null) {
                this.f19045q.f19820B.setCurrentItem(0, info.a().size() <= 2);
                this.f19045q.f19824x.setCurrentPosition(0);
                this.f19045q.f19819A.a(0, 0.0f);
            }
        }
        setTag(info.b());
        this.f19045q.f19824x.setMarkersCount(info.a().size());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19045q.f19820B.setAdapter(getWidgetPreviewAdapter());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19049u = null;
    }

    public /* synthetic */ WidgetPickerDetails(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPickerDetails(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        D0 d0C = D0.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(d0C, "inflate(...)");
        this.f19045q = d0C;
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f19046r = fVar;
        com.android.launcher3.f fVarK = fVar.K();
        this.f19047s = fVarK;
        this.f19048t = getResources().getDimension(R.dimen.bottom_sheet_bg_radius);
        this.f19050v = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.f0
            @Override // p219v8.a
            public final Object invoke() {
                return WidgetPickerDetails.j(this.f19105q);
            }
        });
        setOutlineProvider(new a());
        setClipToOutline(true);
        setBackgroundColor(p171r0.a.b(context, R.color.material_color_on_primary));
        ViewPager2 viewPager2 = d0C.f19820B;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            Rect rect = fVarK.f15563c0;
            recyclerView.setPaddingRelative(rect.left, recyclerView.getPaddingTop(), rect.right, recyclerView.getPaddingBottom());
            recyclerView.setClipToPadding(false);
        }
        viewPager2.setPageTransformer(new MarginPageTransformer(viewPager2.getResources().getDimensionPixelSize(R.dimen.widget_preview_margin)));
        viewPager2.registerOnPageChangeCallback(new b());
        d0C.f19823w.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetPickerDetails.d(this.f19107q, view);
            }
        });
    }
}
