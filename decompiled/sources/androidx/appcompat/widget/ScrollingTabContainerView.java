package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Interpolator f10852z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Runnable f10853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f10854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    LinearLayoutCompat f10855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Spinner f10856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f10858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f10859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f10860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f10861y;

    class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f10862q;

        a(View view) {
            this.f10862q = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f10862q.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f10862q.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f10853q = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f10855s.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            ((d) ScrollingTabContainerView.this.f10855s.getChildAt(i10)).b();
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                androidx.appcompat.app.o.a(getItem(i10));
                return scrollingTabContainerView.c(null, true);
            }
            androidx.appcompat.app.o.a(getItem(i10));
            ((d) view).a(null);
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b();
            throw null;
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int[] f10866q;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, androidx.appcompat.app.a.b bVar, boolean z9) {
            int i10 = p050f.a.f20338d;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f10866q = iArr;
            J jV = J.v(context, null, iArr, i10, 0);
            if (jV.s(0)) {
                setBackgroundDrawable(jV.g(0));
            }
            jV.x();
            if (z9) {
                setGravity(8388627);
            }
            c();
        }

        public void a(androidx.appcompat.app.a.b bVar) {
            c();
        }

        public androidx.appcompat.app.a.b b() {
            return null;
        }

        public void c() {
            throw null;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (ScrollingTabContainerView.this.f10858v > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = ScrollingTabContainerView.this.f10858v;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z9) {
            boolean z10 = isSelected() != z9;
            super.setSelected(z9);
            if (z10 && z9) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, p050f.a.f20341g);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.f10856t;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f10856t == null) {
            this.f10856t = b();
        }
        removeView(this.f10855s);
        addView(this.f10856t, new ViewGroup.LayoutParams(-2, -1));
        if (this.f10856t.getAdapter() == null) {
            this.f10856t.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f10853q;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f10853q = null;
        }
        this.f10856t.setSelection(this.f10861y);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f10856t);
        addView(this.f10855s, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f10856t.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f10855s.getChildAt(i10);
        Runnable runnable = this.f10853q;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f10853q = aVar;
        post(aVar);
    }

    d c(androidx.appcompat.app.a.b bVar, boolean z9) {
        d dVar = new d(getContext(), bVar, z9);
        if (z9) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f10860x));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f10854r == null) {
            this.f10854r = new c();
        }
        dVar.setOnClickListener(this.f10854r);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f10853q;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f10859w = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f10853q;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j9) {
        ((d) view).b();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z9 = mode == 1073741824;
        setFillViewport(z9);
        int childCount = this.f10855s.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f10858v = -1;
        } else {
            if (childCount > 2) {
                this.f10858v = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f10858v = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f10858v = Math.min(this.f10858v, this.f10859w);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f10860x, BasicMeasure.EXACTLY);
        if (z9 || !this.f10857u) {
            f();
        } else {
            this.f10855s.measure(0, iMakeMeasureSpec);
            if (this.f10855s.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z9 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f10861y);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z9) {
        this.f10857u = z9;
    }

    public void setContentHeight(int i10) {
        this.f10860x = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f10861y = i10;
        int childCount = this.f10855s.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f10855s.getChildAt(i11);
            boolean z9 = i11 == i10;
            childAt.setSelected(z9);
            if (z9) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f10856t;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
