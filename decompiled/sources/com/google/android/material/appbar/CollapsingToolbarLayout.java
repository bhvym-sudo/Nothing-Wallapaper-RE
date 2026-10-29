package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import com.google.android.material.internal.h;
import com.google.android.material.internal.k;
import p050f.i;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final int f16398V = j.f28913j;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final com.google.android.material.internal.a f16399A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final F4.a f16400B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f16401C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f16402D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Drawable f16403E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    Drawable f16404F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f16405G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f16406H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ValueAnimator f16407I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f16408J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final TimeInterpolator f16409K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final TimeInterpolator f16410L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f16411M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private AppBarLayout.f f16412N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16413O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f16414P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    V f16415Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f16416R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f16417S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f16418T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f16419U;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ViewGroup f16422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f16423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f16424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Rect f16429z;

    class a implements InterfaceC1090w {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            return CollapsingToolbarLayout.this.o(v9);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private class d implements AppBarLayout.f {
        d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f16413O = i10;
            V v9 = collapsingToolbarLayout.f16415Q;
            int iL = v9 != null ? v9.l() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                c cVar = (c) childAt.getLayoutParams();
                f fVarK = CollapsingToolbarLayout.k(childAt);
                int i12 = cVar.f16432a;
                if (i12 == 1) {
                    fVarK.f(p221w0.a.b(-i10, 0, CollapsingToolbarLayout.this.i(childAt)));
                } else if (i12 == 2) {
                    fVarK.f(Math.round((-i10) * cVar.f16433b));
                }
            }
            CollapsingToolbarLayout.this.v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f16404F != null && iL > 0) {
                H.X(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int iW = (height - H.w(CollapsingToolbarLayout.this)) - iL;
            float f10 = iW;
            CollapsingToolbarLayout.this.f16399A.A0(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f16399A.n0(collapsingToolbarLayout3.f16413O + iW);
            CollapsingToolbarLayout.this.f16399A.y0(Math.abs(i10) / f10);
        }
    }

    public interface e extends h {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28705h);
    }

    private void a(int i10) {
        d();
        ValueAnimator valueAnimator = this.f16407I;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f16407I = valueAnimator2;
            valueAnimator2.setInterpolator(i10 > this.f16405G ? this.f16409K : this.f16410L);
            this.f16407I.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.f16407I.cancel();
        }
        this.f16407I.setDuration(this.f16408J);
        this.f16407I.setIntValues(this.f16405G, i10);
        this.f16407I.start();
    }

    private TextUtils.TruncateAt b(int i10) {
        if (i10 == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i10 != 1) {
            return i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    private void c(AppBarLayout appBarLayout) {
        if (l()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void d() {
        if (this.f16420q) {
            ViewGroup viewGroup = null;
            this.f16422s = null;
            this.f16423t = null;
            int i10 = this.f16421r;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.f16422s = viewGroup2;
                if (viewGroup2 != null) {
                    this.f16423t = e(viewGroup2);
                }
            }
            if (this.f16422s == null) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (m(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f16422s = viewGroup;
            }
            u();
            this.f16420q = false;
        }
    }

    private View e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListG = D4.a.g(getContext(), p225w4.a.f28713p);
        if (colorStateListG != null) {
            return colorStateListG.getDefaultColor();
        }
        return this.f16400B.d(getResources().getDimension(p225w4.c.f28756a));
    }

    private static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    static f k(View view) {
        int i10 = p225w4.e.f28821U;
        f fVar = (f) view.getTag(i10);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(view);
        view.setTag(i10, fVar2);
        return fVar2;
    }

    private boolean l() {
        return this.f16414P == 1;
    }

    private static boolean m(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean n(View view) {
        View view2 = this.f16423t;
        if (view2 == null || view2 == this) {
            return view == this.f16422s;
        }
        return view == view2;
    }

    private void q(boolean z9) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f16423t;
        if (view == null) {
            view = this.f16422s;
        }
        int i10 = i(view);
        com.google.android.material.internal.b.a(this, this.f16424u, this.f16429z);
        ViewGroup viewGroup = this.f16422s;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        com.google.android.material.internal.a aVar = this.f16399A;
        Rect rect = this.f16429z;
        int i11 = rect.left + (z9 ? titleMarginEnd : titleMarginStart);
        int i12 = rect.top + i10 + titleMarginTop;
        int i13 = rect.right;
        if (!z9) {
            titleMarginStart = titleMarginEnd;
        }
        aVar.e0(i11, i12, i13 - titleMarginStart, (rect.bottom + i10) - titleMarginBottom);
    }

    private void r() {
        setContentDescription(getTitle());
    }

    private void s(Drawable drawable, int i10, int i11) {
        t(drawable, this.f16422s, i10, i11);
    }

    private void t(Drawable drawable, View view, int i10, int i11) {
        if (l() && view != null && this.f16401C) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    private void u() {
        View view;
        if (!this.f16401C && (view = this.f16424u) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f16424u);
            }
        }
        if (!this.f16401C || this.f16422s == null) {
            return;
        }
        if (this.f16424u == null) {
            this.f16424u = new View(getContext());
        }
        if (this.f16424u.getParent() == null) {
            this.f16422s.addView(this.f16424u, -1, -1);
        }
    }

    private void w(int i10, int i11, int i12, int i13, boolean z9) {
        View view;
        if (!this.f16401C || (view = this.f16424u) == null) {
            return;
        }
        boolean z10 = H.L(view) && this.f16424u.getVisibility() == 0;
        this.f16402D = z10;
        if (z10 || z9) {
            boolean z11 = H.v(this) == 1;
            q(z11);
            this.f16399A.o0(z11 ? this.f16427x : this.f16425v, this.f16429z.top + this.f16426w, (i12 - i10) - (z11 ? this.f16425v : this.f16427x), (i13 - i11) - this.f16428y);
            this.f16399A.b0(z9);
        }
    }

    private void x() {
        if (this.f16422s != null && this.f16401C && TextUtils.isEmpty(this.f16399A.O())) {
            setTitle(j(this.f16422s));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.f16422s == null && (drawable = this.f16403E) != null && this.f16405G > 0) {
            drawable.mutate().setAlpha(this.f16405G);
            this.f16403E.draw(canvas);
        }
        if (this.f16401C && this.f16402D) {
            if (this.f16422s == null || this.f16403E == null || this.f16405G <= 0 || !l() || this.f16399A.F() >= this.f16399A.G()) {
                this.f16399A.l(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f16403E.getBounds(), Region.Op.DIFFERENCE);
                this.f16399A.l(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f16404F == null || this.f16405G <= 0) {
            return;
        }
        V v9 = this.f16415Q;
        int iL = v9 != null ? v9.l() : 0;
        if (iL > 0) {
            this.f16404F.setBounds(0, -this.f16413O, getWidth(), iL - this.f16413O);
            this.f16404F.mutate().setAlpha(this.f16405G);
            this.f16404F.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j9) {
        boolean z9;
        if (this.f16403E == null || this.f16405G <= 0 || !n(view)) {
            z9 = false;
        } else {
            t(this.f16403E, view, getWidth(), getHeight());
            this.f16403E.mutate().setAlpha(this.f16405G);
            this.f16403E.draw(canvas);
            z9 = true;
        }
        return super.drawChild(canvas, view, j9) || z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16404F;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f16403E;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.f16399A;
        if (aVar != null) {
            state |= aVar.I0(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f16399A.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f16399A.u();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f16399A.v();
    }

    public Drawable getContentScrim() {
        return this.f16403E;
    }

    public int getExpandedTitleGravity() {
        return this.f16399A.B();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f16428y;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f16427x;
    }

    public int getExpandedTitleMarginStart() {
        return this.f16425v;
    }

    public int getExpandedTitleMarginTop() {
        return this.f16426w;
    }

    public float getExpandedTitleTextSize() {
        return this.f16399A.D();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f16399A.E();
    }

    public int getHyphenationFrequency() {
        return this.f16399A.H();
    }

    public int getLineCount() {
        return this.f16399A.I();
    }

    public float getLineSpacingAdd() {
        return this.f16399A.J();
    }

    public float getLineSpacingMultiplier() {
        return this.f16399A.K();
    }

    public int getMaxLines() {
        return this.f16399A.L();
    }

    int getScrimAlpha() {
        return this.f16405G;
    }

    public long getScrimAnimationDuration() {
        return this.f16408J;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.f16411M;
        if (i10 >= 0) {
            return i10 + this.f16416R + this.f16418T;
        }
        V v9 = this.f16415Q;
        int iL = v9 != null ? v9.l() : 0;
        int iW = H.w(this);
        return iW > 0 ? Math.min((iW * 2) + iL, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f16404F;
    }

    public CharSequence getTitle() {
        if (this.f16401C) {
            return this.f16399A.O();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f16414P;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f16399A.N();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f16399A.R();
    }

    final int i(View view) {
        return ((getHeight() - k(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((c) view.getLayoutParams())).bottomMargin;
    }

    V o(V v9) {
        V v10 = H.s(this) ? v9 : null;
        if (!B0.d.a(this.f16415Q, v10)) {
            this.f16415Q = v10;
            requestLayout();
        }
        return v9.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            H.p0(this, H.s(appBarLayout));
            if (this.f16412N == null) {
                this.f16412N = new d();
            }
            appBarLayout.d(this.f16412N);
            H.d0(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f16399A.Y(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.f fVar = this.f16412N;
        if (fVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).v(fVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        V v9 = this.f16415Q;
        if (v9 != null) {
            int iL = v9.l();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!H.s(childAt) && childAt.getTop() < iL) {
                    H.S(childAt, iL);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            k(getChildAt(i15)).d();
        }
        w(i10, i11, i12, i13, false);
        x();
        v();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            k(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        d();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        V v9 = this.f16415Q;
        int iL = v9 != null ? v9.l() : 0;
        if ((mode == 0 || this.f16417S) && iL > 0) {
            this.f16416R = iL;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iL, BasicMeasure.EXACTLY));
        }
        if (!this.f16419U || this.f16399A.L() <= 1) {
            collapsingToolbarLayout = this;
        } else {
            x();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.w(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iZ = collapsingToolbarLayout.f16399A.z();
            if (iZ > 1) {
                collapsingToolbarLayout.f16418T = Math.round(collapsingToolbarLayout.f16399A.A()) * (iZ - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(collapsingToolbarLayout.getMeasuredHeight() + collapsingToolbarLayout.f16418T, BasicMeasure.EXACTLY));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f16422s;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f16423t;
            if (view == null || view == collapsingToolbarLayout) {
                collapsingToolbarLayout.setMinimumHeight(h(viewGroup));
            } else {
                collapsingToolbarLayout.setMinimumHeight(h(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f16403E;
        if (drawable != null) {
            s(drawable, i10, i11);
        }
    }

    public void p(boolean z9, boolean z10) {
        if (this.f16406H != z9) {
            if (z10) {
                a(z9 ? 255 : 0);
            } else {
                setScrimAlpha(z9 ? 255 : 0);
            }
            this.f16406H = z9;
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f16399A.j0(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f16399A.g0(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.f16399A.k0(f10);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f16399A.l0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f16403E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16403E = drawableMutate;
            if (drawableMutate != null) {
                s(drawableMutate, getWidth(), getHeight());
                this.f16403E.setCallback(this);
                this.f16403E.setAlpha(this.f16405G);
            }
            H.X(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(p171r0.a.d(getContext(), i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.f16399A.u0(i10);
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f16428y = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f16427x = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f16425v = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f16426w = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f16399A.r0(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f16399A.t0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.f16399A.v0(f10);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f16399A.w0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z9) {
        this.f16419U = z9;
    }

    public void setForceApplySystemWindowInsetTop(boolean z9) {
        this.f16417S = z9;
    }

    public void setHyphenationFrequency(int i10) {
        this.f16399A.B0(i10);
    }

    public void setLineSpacingAdd(float f10) {
        this.f16399A.D0(f10);
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f16399A.E0(f10);
    }

    public void setMaxLines(int i10) {
        this.f16399A.F0(i10);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z9) {
        this.f16399A.H0(z9);
    }

    void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f16405G) {
            if (this.f16403E != null && (viewGroup = this.f16422s) != null) {
                H.X(viewGroup);
            }
            this.f16405G = i10;
            H.X(this);
        }
    }

    public void setScrimAnimationDuration(long j9) {
        this.f16408J = j9;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f16411M != i10) {
            this.f16411M = i10;
            v();
        }
    }

    public void setScrimsShown(boolean z9) {
        p(z9, H.M(this) && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(e eVar) {
        this.f16399A.J0(eVar);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f16404F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16404F = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16404F.setState(getDrawableState());
                }
                p201u0.a.m(this.f16404F, H.v(this));
                this.f16404F.setVisible(getVisibility() == 0, false);
                this.f16404F.setCallback(this);
                this.f16404F.setAlpha(this.f16405G);
            }
            H.X(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(p171r0.a.d(getContext(), i10));
    }

    public void setTitle(CharSequence charSequence) {
        this.f16399A.K0(charSequence);
        r();
    }

    public void setTitleCollapseMode(int i10) {
        this.f16414P = i10;
        boolean zL = l();
        this.f16399A.z0(zL);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (zL && this.f16403E == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f16399A.M0(truncateAt);
    }

    public void setTitleEnabled(boolean z9) {
        if (z9 != this.f16401C) {
            this.f16401C = z9;
            r();
            u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f16399A.G0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f16404F;
        if (drawable != null && drawable.isVisible() != z9) {
            this.f16404F.setVisible(z9, false);
        }
        Drawable drawable2 = this.f16403E;
        if (drawable2 == null || drawable2.isVisible() == z9) {
            return;
        }
        this.f16403E.setVisible(z9, false);
    }

    final void v() {
        if (this.f16403E == null && this.f16404F == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f16413O < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16403E || drawable == this.f16404F;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f16398V;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f16420q = true;
        this.f16429z = new Rect();
        this.f16411M = -1;
        this.f16416R = 0;
        this.f16418T = 0;
        Context context2 = getContext();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f16399A = aVar;
        aVar.L0(p235x4.a.f29943e);
        aVar.H0(false);
        this.f16400B = new F4.a(context2);
        TypedArray typedArrayI = k.i(context2, attributeSet, p225w4.k.f29047M1, i10, i11, new int[0]);
        aVar.u0(typedArrayI.getInt(p225w4.k.f29092R1, 8388691));
        aVar.j0(typedArrayI.getInt(p225w4.k.f29056N1, 8388627));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(p225w4.k.f29101S1, 0);
        this.f16428y = dimensionPixelSize;
        this.f16427x = dimensionPixelSize;
        this.f16426w = dimensionPixelSize;
        this.f16425v = dimensionPixelSize;
        int i12 = p225w4.k.f29128V1;
        if (typedArrayI.hasValue(i12)) {
            this.f16425v = typedArrayI.getDimensionPixelSize(i12, 0);
        }
        int i13 = p225w4.k.f29119U1;
        if (typedArrayI.hasValue(i13)) {
            this.f16427x = typedArrayI.getDimensionPixelSize(i13, 0);
        }
        int i14 = p225w4.k.f29137W1;
        if (typedArrayI.hasValue(i14)) {
            this.f16426w = typedArrayI.getDimensionPixelSize(i14, 0);
        }
        int i15 = p225w4.k.f29110T1;
        if (typedArrayI.hasValue(i15)) {
            this.f16428y = typedArrayI.getDimensionPixelSize(i15, 0);
        }
        this.f16401C = typedArrayI.getBoolean(p225w4.k.f29244h2, true);
        setTitle(typedArrayI.getText(p225w4.k.f29224f2));
        aVar.r0(j.f28906c);
        aVar.g0(i.f20486a);
        int i16 = p225w4.k.f29146X1;
        if (typedArrayI.hasValue(i16)) {
            aVar.r0(typedArrayI.getResourceId(i16, 0));
        }
        int i17 = p225w4.k.f29065O1;
        if (typedArrayI.hasValue(i17)) {
            aVar.g0(typedArrayI.getResourceId(i17, 0));
        }
        int i18 = p225w4.k.f29264j2;
        if (typedArrayI.hasValue(i18)) {
            setTitleEllipsize(b(typedArrayI.getInt(i18, -1)));
        }
        int i19 = p225w4.k.f29155Y1;
        if (typedArrayI.hasValue(i19)) {
            aVar.t0(K4.c.a(context2, typedArrayI, i19));
        }
        int i20 = p225w4.k.f29074P1;
        if (typedArrayI.hasValue(i20)) {
            aVar.i0(K4.c.a(context2, typedArrayI, i20));
        }
        this.f16411M = typedArrayI.getDimensionPixelSize(p225w4.k.f29204d2, -1);
        int i21 = p225w4.k.f29184b2;
        if (typedArrayI.hasValue(i21)) {
            aVar.F0(typedArrayI.getInt(i21, 1));
        }
        int i22 = p225w4.k.f29254i2;
        if (typedArrayI.hasValue(i22)) {
            aVar.G0(AnimationUtils.loadInterpolator(context2, typedArrayI.getResourceId(i22, 0)));
        }
        this.f16408J = typedArrayI.getInt(p225w4.k.f29194c2, 600);
        int i23 = p225w4.a.f28679N;
        this.f16409K = I4.f.g(context2, i23, p235x4.a.f29941c);
        this.f16410L = I4.f.g(context2, i23, p235x4.a.f29942d);
        setContentScrim(typedArrayI.getDrawable(p225w4.k.f29083Q1));
        setStatusBarScrim(typedArrayI.getDrawable(p225w4.k.f29214e2));
        setTitleCollapseMode(typedArrayI.getInt(p225w4.k.f29234g2, 0));
        this.f16421r = typedArrayI.getResourceId(p225w4.k.f29274k2, -1);
        this.f16417S = typedArrayI.getBoolean(p225w4.k.f29174a2, false);
        this.f16419U = typedArrayI.getBoolean(p225w4.k.f29164Z1, false);
        typedArrayI.recycle();
        setWillNotDraw(false);
        H.u0(this, new a());
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f16399A.i0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f16433b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16432a = 0;
            this.f16433b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p225w4.k.f29284l2);
            this.f16432a = typedArrayObtainStyledAttributes.getInt(p225w4.k.f29294m2, 0);
            a(typedArrayObtainStyledAttributes.getFloat(p225w4.k.f29304n2, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(float f10) {
            this.f16433b = f10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f16432a = 0;
            this.f16433b = 0.5f;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16432a = 0;
            this.f16433b = 0.5f;
        }
    }
}
