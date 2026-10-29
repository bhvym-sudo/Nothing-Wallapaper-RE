package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.C1089v;
import androidx.core.view.InterfaceC1087t;
import androidx.core.view.InterfaceC1088u;
import androidx.core.view.V;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements t, InterfaceC1087t, InterfaceC1088u {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    static final int[] f10593W = {p050f.a.f20336b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final V f10594a0 = new V.a().c(p191t0.b.b(0, 1, 0, 1)).a();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Rect f10595b0 = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f10596A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f10597B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Rect f10598C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Rect f10599D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Rect f10600E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Rect f10601F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Rect f10602G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Rect f10603H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Rect f10604I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Rect f10605J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private V f10606K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private V f10607L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private V f10608M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private V f10609N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private d f10610O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private OverScroller f10611P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    ViewPropertyAnimator f10612Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    final AnimatorListenerAdapter f10613R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Runnable f10614S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Runnable f10615T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final C1089v f10616U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final f f10617V;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f10618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ContentFrameLayout f10620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ActionBarContainer f10621t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private u f10622u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f10623v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10626y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f10627z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10612Q = null;
            actionBarOverlayLayout.f10627z = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10612Q = null;
            actionBarOverlayLayout.f10627z = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10612Q = actionBarOverlayLayout.f10621t.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f10613R);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.p();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10612Q = actionBarOverlayLayout.f10621t.animate().translationY(-ActionBarOverlayLayout.this.f10621t.getHeight()).setListener(ActionBarOverlayLayout.this.f10613R);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z9);

        void d();

        void e();

        void f(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10619r = 0;
        this.f10598C = new Rect();
        this.f10599D = new Rect();
        this.f10600E = new Rect();
        this.f10601F = new Rect();
        this.f10602G = new Rect();
        this.f10603H = new Rect();
        this.f10604I = new Rect();
        this.f10605J = new Rect();
        V v9 = V.f12222b;
        this.f10606K = v9;
        this.f10607L = v9;
        this.f10608M = v9;
        this.f10609N = v9;
        this.f10613R = new a();
        this.f10614S = new b();
        this.f10615T = new c();
        q(context);
        this.f10616U = new C1089v(this);
        f fVar = new f(context);
        this.f10617V = fVar;
        addView(fVar);
    }

    private void j() {
        p();
        this.f10615T.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean k(View view, Rect rect, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        e eVar = (e) view.getLayoutParams();
        if (z9) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        if (z10) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                z13 = true;
            }
        }
        if (z12) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                z13 = true;
            }
        }
        if (z11) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z13;
    }

    private boolean l() {
        androidx.core.view.H.e(this.f10617V, f10594a0, this.f10601F);
        return !this.f10601F.equals(f10595b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u o(View view) {
        if (view instanceof u) {
            return (u) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void q(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f10593W);
        this.f10618q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f10623v = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f10611P = new OverScroller(context);
    }

    private void s() {
        p();
        postDelayed(this.f10615T, 600L);
    }

    private void t() {
        p();
        postDelayed(this.f10614S, 600L);
    }

    private void v() {
        p();
        this.f10614S.run();
    }

    private boolean w(float f10) {
        this.f10611P.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        return this.f10611P.getFinalY() > this.f10621t.getHeight();
    }

    @Override // androidx.appcompat.widget.t
    public void a(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        u();
        this.f10622u.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.t
    public boolean b() {
        u();
        return this.f10622u.b();
    }

    @Override // androidx.appcompat.widget.t
    public void c() {
        u();
        this.f10622u.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.t
    public boolean d() {
        u();
        return this.f10622u.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f10623v != null) {
            int bottom = this.f10621t.getVisibility() == 0 ? (int) (this.f10621t.getBottom() + this.f10621t.getTranslationY() + 0.5f) : 0;
            this.f10623v.setBounds(0, bottom, getWidth(), this.f10623v.getIntrinsicHeight() + bottom);
            this.f10623v.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.t
    public boolean e() {
        u();
        return this.f10622u.e();
    }

    @Override // androidx.appcompat.widget.t
    public boolean f() {
        u();
        return this.f10622u.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.t
    public boolean g() {
        u();
        return this.f10622u.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f10621t;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f10616U.a();
    }

    public CharSequence getTitle() {
        u();
        return this.f10622u.getTitle();
    }

    @Override // androidx.appcompat.widget.t
    public void h(int i10) {
        u();
        if (i10 == 2) {
            this.f10622u.u();
        } else if (i10 == 5) {
            this.f10622u.v();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.t
    public void i() {
        u();
        this.f10622u.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        u();
        V v9 = V.v(windowInsets, this);
        boolean zK = k(this.f10621t, new Rect(v9.j(), v9.l(), v9.k(), v9.i()), true, true, false, true);
        androidx.core.view.H.e(this, v9, this.f10598C);
        Rect rect = this.f10598C;
        V vM = v9.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f10606K = vM;
        boolean z9 = true;
        if (!this.f10607L.equals(vM)) {
            this.f10607L = this.f10606K;
            zK = true;
        }
        if (this.f10599D.equals(this.f10598C)) {
            z9 = zK;
        } else {
            this.f10599D.set(this.f10598C);
        }
        if (z9) {
            requestLayout();
        }
        return v9.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(getContext());
        androidx.core.view.H.d0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        u();
        measureChildWithMargins(this.f10621t, i10, 0, i11, 0);
        e eVar = (e) this.f10621t.getLayoutParams();
        int iMax = Math.max(0, this.f10621t.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f10621t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f10621t.getMeasuredState());
        boolean z9 = (androidx.core.view.H.F(this) & 256) != 0;
        if (z9) {
            measuredHeight = this.f10618q;
            if (this.f10625x && this.f10621t.getTabContainer() != null) {
                measuredHeight += this.f10618q;
            }
        } else {
            measuredHeight = this.f10621t.getVisibility() != 8 ? this.f10621t.getMeasuredHeight() : 0;
        }
        this.f10600E.set(this.f10598C);
        this.f10608M = this.f10606K;
        if (this.f10624w || z9 || !l()) {
            this.f10608M = new V.a(this.f10608M).c(p191t0.b.b(this.f10608M.j(), this.f10608M.l() + measuredHeight, this.f10608M.k(), this.f10608M.i())).a();
        } else {
            Rect rect = this.f10600E;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f10608M = this.f10608M.m(0, measuredHeight, 0, 0);
        }
        k(this.f10620s, this.f10600E, true, true, true, true);
        if (!this.f10609N.equals(this.f10608M)) {
            V v9 = this.f10608M;
            this.f10609N = v9;
            androidx.core.view.H.f(this.f10620s, v9);
        }
        measureChildWithMargins(this.f10620s, i10, 0, i11, 0);
        e eVar2 = (e) this.f10620s.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f10620s.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f10620s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f10620s.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (!this.f10626y || !z9) {
            return false;
        }
        if (w(f11)) {
            j();
        } else {
            v();
        }
        this.f10627z = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // androidx.core.view.InterfaceC1088u
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.InterfaceC1087t
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        u();
        int i11 = this.f10597B ^ i10;
        this.f10597B = i10;
        boolean z9 = (i10 & 4) == 0;
        boolean z10 = (i10 & 256) != 0;
        d dVar = this.f10610O;
        if (dVar != null) {
            dVar.c(!z10);
            if (z9 || !z10) {
                this.f10610O.a();
            } else {
                this.f10610O.d();
            }
        }
        if ((i11 & 256) == 0 || this.f10610O == null) {
            return;
        }
        androidx.core.view.H.d0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f10619r = i10;
        d dVar = this.f10610O;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    void p() {
        removeCallbacks(this.f10614S);
        removeCallbacks(this.f10615T);
        ViewPropertyAnimator viewPropertyAnimator = this.f10612Q;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean r() {
        return this.f10624w;
    }

    public void setActionBarHideOffset(int i10) {
        p();
        this.f10621t.setTranslationY(-Math.max(0, Math.min(i10, this.f10621t.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f10610O = dVar;
        if (getWindowToken() != null) {
            this.f10610O.f(this.f10619r);
            int i10 = this.f10597B;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.H.d0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.f10625x = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.f10626y) {
            this.f10626y = z9;
            if (z9) {
                return;
            }
            p();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        u();
        this.f10622u.setIcon(i10);
    }

    public void setLogo(int i10) {
        u();
        this.f10622u.m(i10);
    }

    public void setOverlayMode(boolean z9) {
        this.f10624w = z9;
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.t
    public void setWindowCallback(Window.Callback callback) {
        u();
        this.f10622u.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.t
    public void setWindowTitle(CharSequence charSequence) {
        u();
        this.f10622u.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        if (this.f10620s == null) {
            this.f10620s = (ContentFrameLayout) findViewById(p050f.f.f20431b);
            this.f10621t = (ActionBarContainer) findViewById(p050f.f.f20432c);
            this.f10622u = o(findViewById(p050f.f.f20430a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f10616U.b(view, view2, i10);
        this.f10596A = getActionBarHideOffset();
        p();
        d dVar = this.f10610O;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f10621t.getVisibility() != 0) {
            return false;
        }
        return this.f10626y;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f10626y && !this.f10627z) {
            if (this.f10596A <= this.f10621t.getHeight()) {
                t();
            } else {
                s();
            }
        }
        d dVar = this.f10610O;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f10596A + i11;
        this.f10596A = i14;
        setActionBarHideOffset(i14);
    }

    public void setIcon(Drawable drawable) {
        u();
        this.f10622u.setIcon(drawable);
    }
}
