package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetPickerGroupPage extends CoordinatorLayout {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final F0 f19053P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final com.android.launcher3.views.f f19054Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final com.android.launcher3.f f19055R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final float f19056S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f19057T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p079h8.h f19058U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final GridLayoutManager f19059V;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.n.h(view, "view");
            kotlin.jvm.internal.n.h(outline, "outline");
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), WidgetPickerGroupPage.this.f19056S);
        }
    }

    public static final class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
            WidgetPickerGroupPage.this.f19053P.f19836v.A(recyclerView.computeVerticalScrollOffset() != 0);
        }
    }

    public static final class c extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f19063b;

        c(GridLayoutManager gridLayoutManager) {
            this.f19063b = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            if (WidgetPickerGroupPage.this.getWidgetListAdapter().d(i10)) {
                return this.f19063b.getSpanCount();
            }
            return 1;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetPickerGroupPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F7.k b0(WidgetPickerGroupPage widgetPickerGroupPage) {
        com.android.launcher3.f deviceProfile = widgetPickerGroupPage.f19055R;
        kotlin.jvm.internal.n.g(deviceProfile, "deviceProfile");
        return new F7.k(deviceProfile, E7.S.f1327c.a(widgetPickerGroupPage.getParent()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F7.k getWidgetListAdapter() {
        return (F7.k) this.f19058U.getValue();
    }

    public final boolean W(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        boolean z9 = this.f19053P.f19840z.computeVerticalScrollOffset() != 0 && getVisibility() == 0;
        this.f19057T = z9;
        if (z9) {
            this.f19053P.f19840z.onTouchEvent(ev);
        }
        return this.f19057T;
    }

    public final boolean X(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        if (this.f19057T) {
            this.f19053P.f19840z.onTouchEvent(ev);
        }
        return this.f19057T;
    }

    public final boolean Y(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        return this.f19054Q.J().n(this.f19053P.f19840z, ev) && this.f19053P.f19840z.computeVerticalScrollOffset() != 0;
    }

    public final void Z() {
        this.f19053P.f19840z.smoothScrollToPosition(0);
    }

    public final void a0(List list) {
        kotlin.jvm.internal.n.h(list, "list");
        getWidgetListAdapter().submitList(list);
    }

    public final CoordinatorLayout getContent() {
        CoordinatorLayout contentFrame = this.f19053P.f19838x;
        kotlin.jvm.internal.n.g(contentFrame, "contentFrame");
        return contentFrame;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19053P.f19840z.setAdapter(getWidgetListAdapter());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19053P.f19840z.setAdapter(null);
    }

    public /* synthetic */ WidgetPickerGroupPage(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPickerGroupPage(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        F0 f0C = F0.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(f0C, "inflate(...)");
        this.f19053P = f0C;
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f19054Q = fVar;
        com.android.launcher3.f fVarK = fVar.K();
        this.f19055R = fVarK;
        this.f19056S = getResources().getDimension(R.dimen.bottom_sheet_bg_radius);
        this.f19058U = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.h0
            @Override // p219v8.a
            public final Object invoke() {
                return WidgetPickerGroupPage.b0(this.f19109q);
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.setSpanSizeLookup(new c(gridLayoutManager));
        this.f19059V = gridLayoutManager;
        setBackgroundResource(R.drawable.bottom_sheet_bg);
        setOutlineProvider(new a());
        setClipToOutline(true);
        RecyclerView recyclerView = f0C.f19840z;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new M6.v(recyclerView.getResources().getDimensionPixelOffset(R.dimen.spacing_8dp), 0, 2, null));
        Rect rect = fVarK.f15565d0;
        kotlin.jvm.internal.n.e(recyclerView);
        recyclerView.setPadding(rect.left, recyclerView.getPaddingTop(), rect.right, rect.bottom);
        recyclerView.addOnScrollListener(new b());
    }
}
