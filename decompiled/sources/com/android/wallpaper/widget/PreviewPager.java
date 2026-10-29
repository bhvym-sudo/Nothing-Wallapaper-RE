package com.android.wallpaper.widget;

import H3.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.nothing.wallpaper.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class PreviewPager extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ViewPager f16117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final PageIndicator f16118r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f16119s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View f16120t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ViewPager.j f16121u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16122v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ViewPager.j f16123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f16124x;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PreviewPager.this.f16117q.setPageMargin(view.getPaddingEnd());
            PreviewPager.this.f16117q.removeOnLayoutChangeListener(this);
        }
    }

    class b implements ViewPager.j {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
            PreviewPager.this.f16118r.setLocation(Math.round((i10 + f10) * 100.0f) / 100.0f);
            if (PreviewPager.this.f16123w != null) {
                PreviewPager.this.f16123w.a(i10, f10, i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
            if (PreviewPager.this.f16123w != null) {
                PreviewPager.this.f16123w.b(i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            PreviewPager.d(PreviewPager.this);
            throw null;
        }
    }

    private static class c extends Scroller {
        c(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, 500);
        }
    }

    public PreviewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* bridge */ /* synthetic */ androidx.viewpager.widget.a d(PreviewPager previewPager) {
        previewPager.getClass();
        return null;
    }

    private ViewPager.j h() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view, float f10) {
        int paddingStart = this.f16117q.getPaddingStart();
        int i10 = -view.getWidth();
        int width = this.f16117q.getWidth();
        int width2 = (int) (view.getWidth() * f10);
        if (width2 <= i10 || width2 >= width) {
            return;
        }
        if (width2 <= paddingStart) {
            Math.abs(width2 - paddingStart);
            Math.abs(i10 - paddingStart);
        } else {
            Math.abs(width2 - paddingStart);
            Math.abs(width - paddingStart);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.f16117q.H(this.f16117q.getCurrentItem() - 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        this.f16117q.H(this.f16117q.getCurrentItem() + 1, true);
    }

    private void setupPagerScroller(Context context) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("y");
            declaredField.setAccessible(true);
            declaredField.set(this.f16117q, new c(context, new W0.c()));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e10) {
            Log.e("PreviewPager", "Failed to setup pager scroller.", e10);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f16122v == 1) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11) - ((View) this.f16118r.getParent()).getLayoutParams().height;
            if (size > 0) {
                int paddingBottom = (size / 2) - (((int) (((size2 - this.f16117q.getPaddingBottom()) - this.f16117q.getPaddingTop()) / this.f16124x)) / 2);
                ViewPager viewPager = this.f16117q;
                viewPager.setPaddingRelative(paddingBottom, viewPager.getPaddingTop(), paddingBottom, this.f16117q.getPaddingBottom());
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        this.f16117q.setAdapter(null);
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.f16123w = jVar;
    }

    public PreviewPager(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.preview_pager, this);
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p004a3.a.f9719b2, i10, 0);
        this.f16122v = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ViewPager viewPager = (ViewPager) findViewById(R.id.preview_viewpager);
        this.f16117q = viewPager;
        viewPager.L(false, new ViewPager.k() { // from class: I3.q
            @Override // androidx.viewpager.widget.ViewPager.k
            public final void transformPage(View view, float f10) {
                this.f3020a.i(view, f10);
            }
        }, 0);
        viewPager.setPageMargin(resources.getDimensionPixelOffset(R.dimen.preview_page_gap));
        viewPager.setClipToPadding(false);
        int i11 = this.f16122v;
        if (i11 == 0) {
            int iMax = Math.max(resources.getDimensionPixelOffset(R.dimen.preview_page_horizontal_margin), viewPager.getResources().getDisplayMetrics().widthPixels / 8);
            viewPager.setPadding(iMax, resources.getDimensionPixelOffset(R.dimen.preview_page_top_margin), iMax, resources.getDimensionPixelOffset(R.dimen.preview_page_bottom_margin));
        } else if (i11 == 1) {
            Point pointE = s.a().e(((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay());
            this.f16124x = pointE.y / pointE.x;
            viewPager.setPadding(0, resources.getDimensionPixelOffset(R.dimen.preview_page_top_margin), 0, resources.getDimensionPixelOffset(R.dimen.preview_page_bottom_margin));
            viewPager.setPageMargin(pointE.x / 2);
            viewPager.addOnLayoutChangeListener(new a());
        }
        setupPagerScroller(context);
        this.f16118r = (PageIndicator) findViewById(R.id.page_indicator);
        View viewFindViewById = findViewById(R.id.arrow_previous);
        this.f16119s = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: I3.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3021q.j(view);
            }
        });
        View viewFindViewById2 = findViewById(R.id.arrow_next);
        this.f16120t = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: I3.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3022q.k(view);
            }
        });
        ViewPager.j jVarH = h();
        this.f16121u = jVarH;
        viewPager.b(jVarH);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.generateLayoutParams(layoutParams);
    }
}
