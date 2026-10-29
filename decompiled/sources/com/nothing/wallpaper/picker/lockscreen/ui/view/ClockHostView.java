package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.android.launcher3.pageindicators.PageIndicatorDots;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.AbstractC1320e;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockHostView extends LinearLayout implements E {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final c f18827B = new c(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final FloatProperty f18828C = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final View f18829A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p079h8.h f18830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p079h8.h f18831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p079h8.h f18832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AbstractC1320e f18833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.android.launcher3.views.f f18834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.android.launcher3.f f18835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private F7.b f18836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p219v8.l f18838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p219v8.l f18839z;

    public static final class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18841b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC1320e f18843d;

        a(AbstractC1320e abstractC1320e) {
            this.f18843d = abstractC1320e;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            p219v8.l onClockSelectedListener;
            this.f18841b = i10;
            int currentItem = this.f18843d.f19952x.getCurrentItem();
            if (i10 != 0) {
                if (i10 != 1) {
                    return;
                }
                this.f18840a = currentItem;
            } else {
                this.f18843d.f19953y.setActiveMarker(currentItem);
                F7.b bVar = ClockHostView.this.f18836w;
                if (bVar == null || (onClockSelectedListener = ClockHostView.this.getOnClockSelectedListener()) == null) {
                    return;
                }
                onClockSelectedListener.f(((T1.a) bVar.getCurrentList().get(currentItem)).a());
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            F7.b bVar = ClockHostView.this.f18836w;
            int itemCount = bVar != null ? bVar.getItemCount() : 0;
            int pageSize = ClockHostView.this.getPageSize();
            int i12 = i11 + (i10 * pageSize);
            this.f18843d.f19953y.r(i12, Math.max(itemCount - 1, 0) * pageSize);
            if (this.f18841b != 0) {
                int i13 = this.f18840a;
                if (i12 > pageSize * i13 && f10 != 0.0f) {
                    i10++;
                }
                this.f18843d.f19954z.u(i13, i10, f10);
            }
        }
    }

    public static final class b extends FloatProperty {
        b() {
            super("fraction");
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ClockHostView host) {
            kotlin.jvm.internal.n.h(host, "host");
            return Float.valueOf(host.getFraction());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(ClockHostView host, float f10) {
            kotlin.jvm.internal.n.h(host, "host");
            host.w(f10);
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClockHostView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final int getClockContentHeight() {
        return ((Number) this.f18830q.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getFraction() {
        return this.f18833t.f19952x.getAlpha();
    }

    private final int getIndicatorDistance() {
        return ((Number) this.f18832s.getValue()).intValue();
    }

    private final int getIndicatorHeight() {
        return ((Number) this.f18831r.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageSize() {
        View childAt = this.f18833t.f19952x.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        return recyclerView != null ? (recyclerView.getWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd() : getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(ClockHostView clockHostView) {
        return clockHostView.f18835v.f15576m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(ClockHostView clockHostView) {
        return clockHostView.getResources().getDimensionPixelSize(R.dimen.nt_clock_indicator_margin_top) + clockHostView.getIndicatorHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(ClockHostView clockHostView) {
        return clockHostView.getResources().getDimensionPixelSize(R.dimen.page_indicator_dot_size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(int i10, AbstractC1320e abstractC1320e) {
        if (i10 != abstractC1320e.f19952x.getCurrentItem()) {
            abstractC1320e.f19953y.setCurrentPosition(i10);
            abstractC1320e.f19952x.setCurrentItem(i10, false);
        }
        abstractC1320e.f19954z.z(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(float f10) {
        AbstractC1320e abstractC1320e = this.f18833t;
        abstractC1320e.f19952x.setAlpha(f10);
        abstractC1320e.f19951w.setAlpha(f10);
        if (this.f18837x) {
            ViewPager2 clockFacePage = abstractC1320e.f19952x;
            kotlin.jvm.internal.n.g(clockFacePage, "clockFacePage");
            clockFacePage.setVisibility((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
            PageIndicatorDots clockIndicator = abstractC1320e.f19953y;
            kotlin.jvm.internal.n.g(clockIndicator, "clockIndicator");
            clockIndicator.setVisibility((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
        } else {
            LinearLayout clockFaceCurrent = abstractC1320e.f19951w;
            kotlin.jvm.internal.n.g(clockFaceCurrent, "clockFaceCurrent");
            clockFaceCurrent.setVisibility((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
        }
        abstractC1320e.f19954z.B(1 - f10);
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void b(boolean z9) {
        if (z9) {
            return;
        }
        w(this.f18835v.f15567e0 ? 0.0f : 1.0f);
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void d() {
        AbstractC1320e abstractC1320e = this.f18833t;
        abstractC1320e.f19951w.removeAllViews();
        abstractC1320e.f19952x.setAdapter(null);
        this.f18836w = null;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public ObjectAnimator f(float f10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f18828C, f10);
        kotlin.jvm.internal.n.g(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void g(List clocks, final int i10, S1.a clockViewFactory) {
        kotlin.jvm.internal.n.h(clocks, "clocks");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        Iterator it = clocks.iterator();
        while (it.hasNext()) {
            com.nothing.wallpaper.common.log.c.d("ClockHostView", "setUpClockView clock:" + ((T1.a) it.next()).a());
        }
        final AbstractC1320e abstractC1320e = this.f18833t;
        if (this.f18836w == null) {
            F7.b bVar = new F7.b(clockViewFactory);
            this.f18836w = bVar;
            abstractC1320e.f19952x.setAdapter(bVar);
        }
        abstractC1320e.f19953y.setMarkersCount(clocks.size());
        F7.b bVar2 = this.f18836w;
        if (bVar2 != null) {
            bVar2.submitList(clocks, new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.t
                @Override // java.lang.Runnable
                public final void run() {
                    ClockHostView.u(i10, abstractC1320e);
                }
            });
        }
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public View getClockView() {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView recyclerView = (RecyclerView) this.f18833t.f19952x.getChildAt(0);
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.findViewByPosition(this.f18833t.f19952x.getCurrentItem());
    }

    public p219v8.l getOnClockChangedListener() {
        return this.f18839z;
    }

    public p219v8.l getOnClockSelectedListener() {
        return this.f18838y;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public View getView() {
        return this.f18829A;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        AbstractC1320e abstractC1320e = this.f18833t;
        measureChild(abstractC1320e.f19950v, i10, View.MeasureSpec.makeMeasureSpec(getClockContentHeight(), BasicMeasure.EXACTLY));
        TopAreaView topAreaView = abstractC1320e.f19954z;
        measureChild(topAreaView, i10, View.MeasureSpec.makeMeasureSpec(topAreaView.getRealHeight(), BasicMeasure.EXACTLY));
        if (this.f18837x) {
            measureChild(abstractC1320e.f19952x, i10, View.MeasureSpec.makeMeasureSpec(getClockContentHeight(), BasicMeasure.EXACTLY));
        } else {
            measureChild(abstractC1320e.f19951w, i10, View.MeasureSpec.makeMeasureSpec(getClockContentHeight(), BasicMeasure.EXACTLY));
        }
        measureChild(abstractC1320e.f19953y, i10, View.MeasureSpec.makeMeasureSpec(getIndicatorHeight(), BasicMeasure.EXACTLY));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getClockContentHeight() + getIndicatorDistance());
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public void setOnClockChangedListener(p219v8.l lVar) {
        this.f18839z = lVar;
    }

    public void setOnClockSelectedListener(p219v8.l lVar) {
        this.f18838y = lVar;
    }

    public final void v(S1.a clockViewFactory, String clockId) {
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        kotlin.jvm.internal.n.h(clockId, "clockId");
        this.f18833t.f19954z.y(clockId);
        LinearLayout linearLayout = this.f18833t.f19951w;
        linearLayout.removeAllViews();
        View viewB = ((H) clockViewFactory).B(clockId);
        ViewParent parent = viewB.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(viewB);
        }
        linearLayout.addView(viewB);
    }

    public /* synthetic */ ClockHostView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.E
    public PageIndicatorDots getIndicator() {
        PageIndicatorDots clockIndicator = this.f18833t.f19953y;
        kotlin.jvm.internal.n.g(clockIndicator, "clockIndicator");
        return clockIndicator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockHostView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18830q = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.q
            @Override // p219v8.a
            public final Object invoke() {
                return Integer.valueOf(ClockHostView.r(this.f19122q));
            }
        });
        this.f18831r = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.r
            @Override // p219v8.a
            public final Object invoke() {
                return Integer.valueOf(ClockHostView.t(this.f19123q));
            }
        });
        this.f18832s = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.s
            @Override // p219v8.a
            public final Object invoke() {
                return Integer.valueOf(ClockHostView.s(this.f19124q));
            }
        });
        AbstractC1320e abstractC1320eC = AbstractC1320e.C(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.n.g(abstractC1320eC, "inflate(...)");
        this.f18833t = abstractC1320eC;
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f18834u = fVar;
        this.f18835v = fVar.K();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004a3.a.f9671Q, i10, i11);
        this.f18837x = typedArrayObtainStyledAttributes.getInt(0, 0) == 1;
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(1);
        setClipToPadding(false);
        abstractC1320eC.f19952x.registerOnPageChangeCallback(new a(abstractC1320eC));
        abstractC1320eC.f19953y.setPaintColor(p171r0.a.b(context, android.R.color.system_neutral1_100));
        b(false);
        this.f18829A = this;
    }
}
