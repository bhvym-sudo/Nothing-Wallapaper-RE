package com.android.launcher3;

import F2.InterfaceC0799f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.android.launcher3.dragndrop.DragLayer;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class Workspace extends FrameLayout implements h, g, View.OnTouchListener, InterfaceC1222d, com.android.launcher3.dragndrop.a.b, E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    com.android.launcher3.dragndrop.a f15457A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected final int[] f15458B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float[] f15459C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    float[] f15460D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f15461E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f15462F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected final RunnableC1220b f15463G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected int f15464H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f15465I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f15466J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private SparseArray f15467K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f15468L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LayoutTransition f15469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected v f15470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected p233x2.a f15471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int[] f15472t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15473u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f15474v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    CellLayout f15475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CellLayout f15476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CellLayout f15477y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final com.android.launcher3.views.f f15478z;

    class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f15479q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Runnable f15480r;

        a(Workspace workspace, View view, Runnable runnable) {
            this.f15479q = view;
            this.f15480r = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.f15479q;
            if (view != null) {
                view.setVisibility(0);
            }
            Runnable runnable = this.f15480r;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    class b implements InterfaceC0799f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0799f f15481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View[] f15482b;

        b(Workspace workspace, InterfaceC0799f interfaceC0799f, View[] viewArr) {
            this.f15481a = interfaceC0799f;
            this.f15482b = viewArr;
        }

        @Override // F2.InterfaceC0799f
        public boolean a(C2.b bVar, View view) {
            if (!this.f15481a.a(bVar, view)) {
                return false;
            }
            this.f15482b[0] = view;
            return true;
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f15483a;

        c(Workspace workspace, View view) {
            this.f15483a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f15483a.setVisibility(0);
        }
    }

    class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float[] f15484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f15485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f15486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f15487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f15488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final h.a f15489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final View f15490g;

        public d(float[] fArr, int i10, int i11, int i12, int i13, h.a aVar, View view) {
            this.f15484a = fArr;
            this.f15485b = i10;
            this.f15486c = i11;
            this.f15487d = i12;
            this.f15488e = i13;
            this.f15490g = view;
            this.f15489f = aVar;
        }

        @Override // com.android.launcher3.k
        public void a(RunnableC1220b runnableC1220b) {
            int[] iArr = new int[2];
            Workspace workspace = Workspace.this;
            float[] fArr = workspace.f15460D;
            workspace.f15472t = workspace.F((int) fArr[0], (int) fArr[1], this.f15485b, this.f15486c, workspace.f15475w, workspace.f15472t);
            Workspace workspace2 = Workspace.this;
            CellLayout cellLayout = workspace2.f15475w;
            float[] fArr2 = workspace2.f15460D;
            workspace2.f15472t = cellLayout.L((int) fArr2[0], (int) fArr2[1], this.f15485b, this.f15486c, this.f15487d, this.f15488e, this.f15490g, workspace2.f15472t, iArr, 1);
            Workspace workspace3 = Workspace.this;
            int[] iArr2 = workspace3.f15472t;
            if (iArr2[0] < 0 || iArr2[1] < 0) {
                workspace3.f15475w.P();
            } else {
                workspace3.setDragMode(3);
            }
            Workspace workspace4 = Workspace.this;
            CellLayout cellLayout2 = workspace4.f15475w;
            int[] iArr3 = workspace4.f15472t;
            cellLayout2.V(iArr3[0], iArr3[1], iArr[0], iArr[1], this.f15489f);
        }
    }

    public Workspace(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Drawable C(C2.b bVar, final View view) {
        int[] iArrE = E(bVar);
        int visibility = view.getVisibility();
        view.setVisibility(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(iArrE[0], BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(iArrE[1], BasicMeasure.EXACTLY));
        view.layout(0, 0, iArrE[0], iArrE[1]);
        Bitmap bitmapC = B2.a.c(iArrE[0], iArrE[1], new B2.a() { // from class: com.android.launcher3.B
            @Override // B2.a
            public final void b(Canvas canvas) {
                view.draw(canvas);
            }
        });
        view.setVisibility(visibility);
        return new BitmapDrawable(getResources(), bitmapC);
    }

    private void G(int[] iArr, float[] fArr, p253z2.h hVar, CellLayout cellLayout, C2.b bVar, int[] iArr2, boolean z9, boolean z10) {
        Rect rectD = D(cellLayout, iArr2[0], iArr2[1], bVar.f597u, bVar.f598v);
        if (z10) {
            Rect rect = this.f15478z.K().f15538G;
            rectD.left += rect.left;
            rectD.right -= rect.right;
            rectD.top += rect.top;
            rectD.bottom -= rect.bottom;
        }
        float[] fArr2 = this.f15459C;
        fArr2[0] = rectD.left;
        fArr2[1] = rectD.top;
        c0();
        float fG = this.f15478z.J().g(cellLayout, this.f15459C, true);
        Z();
        w.k(this.f15459C, iArr);
        if (z9) {
            float fWidth = (rectD.width() * 1.0f) / hVar.getMeasuredWidth();
            float fHeight = (rectD.height() * 1.0f) / hVar.getMeasuredHeight();
            iArr[0] = (int) (((double) iArr[0]) - (((double) ((hVar.getMeasuredWidth() - (rectD.width() * fG)) / 2.0f)) - Math.ceil(cellLayout.getUnusedHorizontalSpace() / 2.0f)));
            iArr[1] = (int) (iArr[1] - ((hVar.getMeasuredHeight() - (rectD.height() * fG)) / 2.0f));
            fArr[0] = fWidth * fG;
            fArr[1] = fHeight * fG;
            return;
        }
        float initialScale = hVar.getInitialScale() * fG;
        float f10 = initialScale - 1.0f;
        iArr[0] = (int) (iArr[0] + ((hVar.getWidth() * f10) / 2.0f));
        iArr[1] = (int) (iArr[1] + ((f10 * hVar.getHeight()) / 2.0f));
        fArr[1] = initialScale;
        fArr[0] = initialScale;
        Rect dragRegion = hVar.getDragRegion();
        if (dragRegion != null) {
            iArr[0] = (int) (iArr[0] + (dragRegion.left * fG));
            iArr[1] = (int) (iArr[1] + (fG * dragRegion.top));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(m mVar, C2.b bVar) {
        this.f15478z.U(mVar, this.f15472t, bVar.f597u, bVar.f598v);
    }

    private void S(CellLayout cellLayout, float[] fArr) {
        T(cellLayout, fArr);
    }

    private void T(View view, float[] fArr) {
        fArr[0] = fArr[0] - view.getLeft();
        fArr[1] = fArr[1] - view.getTop();
    }

    private void U(int[] iArr, CellLayout cellLayout, h.a aVar) {
        int i10;
        int i11;
        int i12;
        final C2.b bVar = aVar.f15599g;
        if (bVar instanceof m) {
            final m mVar = (m) bVar;
            int i13 = bVar.f597u;
            int i14 = bVar.f598v;
            int i15 = bVar.f599w;
            if (i15 <= 0 || (i12 = bVar.f600x) <= 0) {
                i10 = i13;
                i11 = i14;
            } else {
                i10 = i15;
                i11 = i12;
            }
            int[] iArr2 = new int[2];
            float[] fArr = this.f15460D;
            this.f15472t = cellLayout.L((int) fArr[0], (int) fArr[1], i10, i11, i13, i14, null, this.f15472t, iArr2, 3);
            int i16 = iArr2[0];
            boolean z9 = (i16 == bVar.f597u && iArr2[1] == bVar.f598v) ? false : true;
            bVar.f597u = i16;
            bVar.f598v = iArr2[1];
            Runnable runnable = new Runnable() { // from class: com.android.launcher3.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15454q.O(mVar, bVar);
                }
            };
            com.nothing.launcher.card.m mVar2 = (com.nothing.launcher.card.m) mVar;
            com.nothing.cardhost.g gVar = mVar2.f18138I;
            if (gVar != null && z9) {
                V5.a.f(gVar, getContext(), bVar.f597u, bVar.f598v);
            }
            v(bVar, cellLayout, aVar.f15598f, runnable, mVar2.p().b() ? 1 : 0, gVar, true);
        }
    }

    private boolean b0(h.a aVar, float f10, float f11) {
        CellLayout cellLayout = (CellLayout) getChildAt(0);
        if (cellLayout == this.f15475w) {
            return false;
        }
        setCurrentDropLayout(cellLayout);
        setCurrentDragOverlappingLayout(cellLayout);
        return true;
    }

    private void d0() {
        LayoutTransition layoutTransition = new LayoutTransition();
        this.f15469q = layoutTransition;
        layoutTransition.enableTransitionType(3);
        this.f15469q.enableTransitionType(1);
        LayoutTransition layoutTransition2 = this.f15469q;
        Interpolator interpolator = p223w2.q.f28610m;
        layoutTransition2.setInterpolator(3, p223w2.q.f(interpolator, 0.0f, 0.5f));
        this.f15469q.setInterpolator(1, p223w2.q.f(interpolator, 0.5f, 1.0f));
        this.f15469q.disableTransitionType(2);
        this.f15469q.disableTransitionType(0);
        setLayoutTransition(this.f15469q);
    }

    private boolean e0() {
        return this.f15478z.Q();
    }

    private boolean g0(MotionEvent motionEvent) {
        return f(0).getHitRect().contains(motionEvent.getX(), motionEvent.getY());
    }

    private CellLayout[] getWorkspaceAndHotseatCellLayouts() {
        int childCount = getChildCount();
        CellLayout[] cellLayoutArr = new CellLayout[childCount];
        for (int i10 = 0; i10 < childCount; i10++) {
            cellLayoutArr[i10] = (CellLayout) getChildAt(i10);
        }
        return cellLayoutArr;
    }

    private boolean h0() {
        return !N();
    }

    private void j0() {
        boolean z9 = this.f15461E;
        if (z9 != this.f15462F) {
            this.f15462F = z9;
            ((CellLayout) getChildAt(0)).o(this.f15462F);
        }
    }

    public static /* synthetic */ boolean p(int i10, C2.b bVar, View view) {
        return bVar != null && bVar.f593q == i10;
    }

    protected void A(boolean z9) {
        if (z9) {
            this.f15463G.a();
        }
        this.f15465I = -1;
        this.f15466J = -1;
    }

    public void B() {
        f(0).removeAllViewsInLayout();
    }

    public Rect D(CellLayout cellLayout, int i10, int i11, int i12, int i13) {
        Rect rect = new Rect();
        cellLayout.i(i10, i11, i12, i13, rect);
        return rect;
    }

    public int[] E(C2.b bVar) {
        int[] iArr = new int[2];
        if (getChildCount() <= 0) {
            iArr[0] = Integer.MAX_VALUE;
            iArr[1] = Integer.MAX_VALUE;
            return iArr;
        }
        Rect rectD = D((CellLayout) getChildAt(0), 0, 0, bVar.f597u, bVar.f598v);
        iArr[0] = rectD.width();
        iArr[1] = rectD.height();
        return iArr;
    }

    int[] F(int i10, int i11, int i12, int i13, CellLayout cellLayout, int[] iArr) {
        return cellLayout.r(i10, i11, i12, i13, iArr);
    }

    public View H(InterfaceC0799f interfaceC0799f) {
        View[] viewArr = new View[1];
        R(new b(this, interfaceC0799f, viewArr));
        return viewArr[0];
    }

    public View I(final int i10) {
        return H(new InterfaceC0799f() { // from class: com.android.launcher3.x
            @Override // F2.InterfaceC0799f
            public final boolean a(C2.b bVar, View view) {
                return Workspace.p(i10, bVar, view);
            }
        });
    }

    CellLayout J(View view) {
        for (CellLayout cellLayout : getWorkspaceAndHotseatCellLayouts()) {
            if (cellLayout.getShortcutsAndWidgets().indexOfChild(view) > -1) {
                return cellLayout;
            }
        }
        return null;
    }

    protected void K() {
        setClipToPadding(false);
        d0();
        f fVarK = this.f15478z.K();
        Rect rect = fVarK.f15536E;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        setTranslationY((this.f15478z.Q() || !this.f15478z.O()) ? 0.0f : fVarK.f15537F);
        L();
    }

    public CellLayout L() {
        CellLayout cellLayout = (CellLayout) LayoutInflater.from(getContext()).inflate(s.f15696b, (ViewGroup) this, false);
        cellLayout.setCellLayoutContainer(this);
        f fVarK = this.f15478z.K();
        cellLayout.Q(fVarK.f15539H, fVarK.f15540I);
        if (p087i6.e.j()) {
            cellLayout.setVisibility(4);
        }
        addView(cellLayout);
        return cellLayout;
    }

    public boolean M() {
        return !this.f15461E;
    }

    public boolean N() {
        return this.f15461E;
    }

    protected void P(h.a aVar, float f10, boolean z9, int i10, int i11, int i12, int i13) {
        C2.b bVar = aVar.f15599g;
        p233x2.a aVar2 = this.f15471s;
        View view = aVar2 == null ? null : aVar2.f29755e;
        if (!z9) {
            int[] iArr = new int[2];
            CellLayout cellLayout = this.f15475w;
            float[] fArr = this.f15460D;
            cellLayout.L((int) fArr[0], (int) fArr[1], i10, i11, bVar.f597u, bVar.f598v, view, this.f15472t, iArr, 0);
            CellLayout cellLayout2 = this.f15475w;
            int[] iArr2 = this.f15472t;
            cellLayout2.V(iArr2[0], iArr2[1], iArr[0], iArr[1], aVar);
            CellLayout cellLayout3 = this.f15475w;
            float[] fArr2 = this.f15460D;
            cellLayout3.C((int) fArr2[0], (int) fArr2[1], bVar.f597u, bVar.f598v, view, this.f15472t);
            return;
        }
        int i14 = this.f15464H;
        if (i14 == 0 || i14 == 3) {
            if (this.f15465I == i12 && this.f15466J == i13) {
                return;
            }
            this.f15463G.a();
            this.f15465I = i12;
            this.f15466J = i13;
            CellLayout cellLayout4 = this.f15475w;
            float[] fArr3 = this.f15460D;
            cellLayout4.L((int) fArr3[0], (int) fArr3[1], i10, i11, bVar.f597u, bVar.f598v, view, this.f15472t, new int[2], 0);
            this.f15463G.c(new d(this.f15460D, i10, i11, bVar.f597u, bVar.f598v, aVar, view));
            this.f15463G.b(650L);
        }
    }

    public View Q(CellLayout cellLayout, InterfaceC0799f interfaceC0799f) {
        if (cellLayout == null) {
            return null;
        }
        v shortcutsAndWidgets = cellLayout.getShortcutsAndWidgets();
        int childCount = shortcutsAndWidgets.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = shortcutsAndWidgets.getChildAt(i10);
            if (interfaceC0799f.a((C2.b) childAt.getTag(), childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public void R(InterfaceC0799f interfaceC0799f) {
        CellLayout[] workspaceAndHotseatCellLayouts = getWorkspaceAndHotseatCellLayouts();
        int length = workspaceAndHotseatCellLayouts.length;
        for (int i10 = 0; i10 < length && Q(workspaceAndHotseatCellLayouts[i10], interfaceC0799f) == null; i10++) {
        }
    }

    public void V(Boolean bool) {
        setTranslationY((this.f15478z.Q() || !this.f15478z.O()) ? 0.0f : this.f15478z.K().f15537F);
        f(0).A(bool);
    }

    public void W() {
        Toast.makeText(getContext(), getContext().getString(t.f15702f), 0).show();
    }

    public void X(boolean z9, boolean z10, boolean z11) {
        final CellLayout cellLayoutF = f(0);
        f fVarK = this.f15478z.K();
        int i10 = fVarK.f15577n - fVarK.f15578o;
        final float translationY = cellLayoutF.getTranslationY();
        final float f10 = (!z9 || z10) ? 0.0f : -i10;
        if (translationY == f10) {
            cellLayoutF.setVisibility(0);
            return;
        }
        if (!z11) {
            cellLayoutF.setTranslationY(translationY + (f10 - translationY));
            cellLayoutF.post(new Runnable() { // from class: com.android.launcher3.z
                @Override // java.lang.Runnable
                public final void run() {
                    cellLayoutF.setVisibility(0);
                }
            });
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f));
        valueAnimatorOfFloat.addListener(new c(this, cellLayoutF));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = cellLayoutF;
                float f11 = translationY;
                view.setTranslationY(f11 + ((f10 - f11) * valueAnimator.getAnimatedFraction()));
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Y(View view) {
        CellLayout cellLayoutJ = J(view);
        if (cellLayoutJ != null) {
            cellLayoutJ.removeView(view);
        }
        if (view instanceof h) {
            this.f15457A.B((h) view);
        }
    }

    public void Z() {
        if (N()) {
            setScaleX(this.f15468L);
            setScaleY(this.f15468L);
        }
    }

    @Override // com.android.launcher3.InterfaceC1222d
    public int a(CellLayout cellLayout) {
        return 0;
    }

    void a0(int i10, int i11) {
        if (i10 == this.f15473u && i11 == this.f15474v) {
            return;
        }
        this.f15473u = i10;
        this.f15474v = i11;
        setDragMode(0);
    }

    @Override // com.android.launcher3.InterfaceC1222d
    public String b(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return getContext().getString(t.f15699c);
        }
        int panelCount = getPanelCount();
        return getContext().getString(t.f15703g, Integer.valueOf((i10 / panelCount) + 1), Integer.valueOf((childCount / panelCount) + (childCount % panelCount)));
    }

    @Override // com.android.launcher3.h
    public void c(Rect rect) {
        Rect rect2 = new Rect();
        this.f15478z.J().i(this, rect2);
        RectF hitRect = f(0).getHitRect();
        int i10 = ((int) hitRect.left) + rect2.left;
        rect.left = i10;
        rect.top = rect2.top + ((int) hitRect.top);
        rect.right = i10 + ((int) hitRect.width());
        rect.bottom = rect.top + ((int) hitRect.height());
    }

    public void c0() {
        if (N()) {
            this.f15468L = getScaleX();
        }
    }

    @Override // android.view.View
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        return getImportantForAccessibility() == 4 ? AccessibilityNodeInfo.obtain() : super.createAccessibilityNodeInfo();
    }

    @Override // com.android.launcher3.InterfaceC1222d
    public int d(CellLayout cellLayout) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f15467K = sparseArray;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i10) {
        if (M()) {
            return super.dispatchUnhandledMove(view, i10);
        }
        return false;
    }

    @Override // com.android.launcher3.E
    public CellLayout f(int i10) {
        return (CellLayout) getChildAt(0);
    }

    public void f0(p233x2.a aVar, p253z2.e eVar) {
        View view = aVar.f29755e;
        this.f15471s = aVar;
        view.setVisibility(4);
        if (eVar.f30654a) {
            this.f15457A.d(new p213v2.a(this, new Function() { // from class: com.android.launcher3.A
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new p213v2.e((CellLayout) obj);
                }
            }));
        }
        y(view, this, eVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    public List<View> getAllChildren() {
        return f(0).getAllChildren();
    }

    @Override // com.android.launcher3.E
    public p233x2.c getCellPosMapper() {
        return this.f15478z.getCellPosMapper();
    }

    public p233x2.a getDragInfo() {
        return this.f15471s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // com.android.launcher3.InterfaceC1222d
    public int getPanelCount() {
        return 1;
    }

    @Override // com.android.launcher3.E
    public /* bridge */ /* synthetic */ View.OnLongClickListener getWorkspaceChildOnLongClickListener() {
        return super.getWorkspaceChildOnLongClickListener();
    }

    @Override // com.android.launcher3.h
    public boolean i() {
        return true;
    }

    public void i0(float f10) {
        f(0).T(f10);
    }

    @Override // com.android.launcher3.E
    public void j(h hVar) {
        this.f15457A.e(hVar);
    }

    @Override // com.android.launcher3.g
    public void k(View view, h.a aVar, boolean z9) {
        p253z2.h hVar;
        p233x2.a aVar2;
        if (!z9) {
            p233x2.a aVar3 = this.f15471s;
            if (aVar3 != null) {
                if ((aVar3.f29755e instanceof com.nothing.cardhost.g) && (hVar = aVar.f15598f) != null) {
                    hVar.j(true);
                }
                CellLayout cellLayoutF = f(this.f15471s.f29756f);
                if (cellLayoutF != null) {
                    cellLayoutF.J(this.f15471s.f29755e);
                }
            }
        } else if (view != this && (aVar2 = this.f15471s) != null) {
            Y(aVar2.f29755e);
        }
        View viewI = I(aVar.f15600h.f593q);
        if (aVar.f15602j && viewI != null) {
            viewI.setVisibility(0);
        }
        this.f15471s = null;
    }

    public void k0() {
        f(0).U();
    }

    @Override // com.android.launcher3.h
    public void l(h.a aVar) {
        C2.b bVar;
        int i10;
        int i11;
        CellLayout cellLayout;
        int i12;
        if (h0() && (bVar = aVar.f15599g) != null) {
            if (bVar.f597u < 0 || bVar.f598v < 0) {
                throw new RuntimeException("Improper spans found");
            }
            float[] fArrA = aVar.a(this.f15460D);
            this.f15460D = fArrA;
            p233x2.a aVar2 = this.f15471s;
            View view = aVar2 == null ? null : aVar2.f29755e;
            b0(aVar, fArrA[0], fArrA[1]);
            CellLayout cellLayout2 = this.f15475w;
            if (cellLayout2 != null) {
                S(cellLayout2, this.f15460D);
                int i13 = bVar.f597u;
                int i14 = bVar.f598v;
                int i15 = bVar.f599w;
                if (i15 <= 0 || (i12 = bVar.f600x) <= 0) {
                    i10 = i13;
                    i11 = i14;
                } else {
                    i10 = i15;
                    i11 = i12;
                }
                float[] fArr = this.f15460D;
                int[] iArrF = F((int) fArr[0], (int) fArr[1], i13, i14, this.f15475w, this.f15472t);
                this.f15472t = iArrF;
                int i16 = iArrF[0];
                int i17 = iArrF[1];
                a0(i16, i17);
                CellLayout cellLayout3 = this.f15475w;
                float[] fArr2 = this.f15460D;
                float fU = cellLayout3.u(fArr2[0], fArr2[1], this.f15472t);
                CellLayout cellLayout4 = this.f15475w;
                float[] fArr3 = this.f15460D;
                boolean zC = cellLayout4.C((int) fArr3[0], (int) fArr3[1], bVar.f597u, bVar.f598v, view, this.f15472t);
                P(aVar, fU, zC, i10, i11, i16, i17);
                int i18 = this.f15464H;
                if ((i18 == 1 || i18 == 2 || !zC) && (cellLayout = this.f15475w) != null) {
                    cellLayout.P();
                }
            }
        }
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void n(h.a aVar, p253z2.e eVar) {
        View view;
        p233x2.a aVar2 = this.f15471s;
        if (aVar2 != null && (view = aVar2.f29755e) != null) {
            ((CellLayout) (view instanceof com.nothing.cardhost.g ? aVar.f15598f.getContentViewParent().getParent() : view.getParent().getParent())).G(this.f15471s.f29755e);
        }
        j0();
        k0();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f15478z.Q() && g0(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (e0()) {
            return true;
        }
        if (g0(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!(view instanceof CellLayout)) {
            throw new IllegalArgumentException("A Workspace can only have CellLayout children.");
        }
        CellLayout cellLayout = (CellLayout) view;
        cellLayout.setOnInterceptTouchListener(this);
        cellLayout.setImportantForAccessibility(2);
        super.onViewAdded(view);
    }

    @Override // com.android.launcher3.h
    public void s(h.a aVar) {
        this.f15477y = null;
        float[] fArrA = aVar.a(this.f15460D);
        this.f15460D = fArrA;
        b0(aVar, fArrA[0], fArrA[1]);
    }

    void setCurrentDragOverlappingLayout(CellLayout cellLayout) {
        this.f15476x = cellLayout;
    }

    void setCurrentDropLayout(CellLayout cellLayout) {
        CellLayout cellLayout2 = this.f15475w;
        if (cellLayout2 != null) {
            cellLayout2.P();
            this.f15475w.I();
        }
        this.f15475w = cellLayout;
        if (cellLayout != null) {
            cellLayout.H();
        }
        A(true);
        a0(-1, -1);
    }

    void setDragMode(int i10) {
        if (i10 != this.f15464H) {
            if (i10 == 0) {
                A(false);
            } else if (i10 == 2 || i10 == 1) {
                A(true);
            }
            this.f15464H = i10;
        }
    }

    public void setGridAlpha(float f10) {
        f(0).setGridAlpha(f10);
    }

    public void setPivotToScaleWithSelf(View view) {
        view.setPivotY(((getPivotY() + getTop()) - view.getTop()) - view.getTranslationY());
        view.setPivotX(((getPivotX() + getLeft()) - view.getLeft()) - view.getTranslationX());
    }

    public void setup(com.android.launcher3.dragndrop.a aVar) {
        this.f15457A = aVar;
        j0();
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void t() {
        j0();
        this.f15471s = null;
        this.f15470r = null;
        k0();
    }

    @Override // com.android.launcher3.h
    public boolean u(h.a aVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        CellLayout cellLayout = this.f15477y;
        if (aVar.f15601i != this) {
            if (cellLayout == null || !h0()) {
                return false;
            }
            float[] fArrA = aVar.a(this.f15460D);
            this.f15460D = fArrA;
            S(cellLayout, fArrA);
            p233x2.a aVar2 = this.f15471s;
            if (aVar2 != null) {
                i10 = aVar2.f1549c;
                i11 = aVar2.f1550d;
            } else {
                C2.b bVar = aVar.f15599g;
                i10 = bVar.f597u;
                i11 = bVar.f598v;
            }
            int i14 = i11;
            int i15 = i10;
            C2.b bVar2 = aVar.f15599g;
            if (bVar2 instanceof com.nothing.launcher.card.m) {
                int i16 = bVar2.f599w;
                i12 = bVar2.f600x;
                i13 = i16;
            } else {
                i12 = i14;
                i13 = i15;
            }
            float[] fArr = this.f15460D;
            int[] iArrF = F((int) fArr[0], (int) fArr[1], i13, i12, cellLayout, this.f15472t);
            this.f15472t = iArrF;
            float[] fArr2 = this.f15460D;
            int[] iArrL = cellLayout.L((int) fArr2[0], (int) fArr2[1], i13, i12, i15, i14, null, iArrF, new int[2], 4);
            this.f15472t = iArrL;
            if (iArrL[0] < 0 || iArrL[1] < 0) {
                W();
                return false;
            }
        }
        return true;
    }

    public void v(C2.b bVar, CellLayout cellLayout, p253z2.h hVar, Runnable runnable, int i10, View view, boolean z9) {
        int[] iArr = new int[2];
        float[] fArr = new float[2];
        G(iArr, fArr, hVar, cellLayout, bVar, this.f15472t, true, z9);
        int integer = getResources().getInteger(r.f15693e) - 200;
        if ((i10 == 2 || z9) && view != null && hVar.getContentView() != view) {
            Drawable drawableC = C(bVar, view);
            hVar.i(drawableC, (int) (integer * 0.8f));
            if (z9) {
                fArr[0] = (fArr[0] * drawableC.getIntrinsicWidth()) / hVar.getWidth();
                fArr[1] = (fArr[1] * drawableC.getIntrinsicHeight()) / hVar.getHeight();
            }
        } else if (z9) {
            float fMin = Math.min(fArr[0], fArr[1]);
            fArr[1] = fMin;
            fArr[0] = fMin;
        }
        DragLayer dragLayerJ = this.f15478z.J();
        if (i10 == 4) {
            dragLayerJ.w(hVar, iArr, 0.0f, 0.1f, 0.1f, 0, runnable, integer);
        } else {
            dragLayerJ.u(hVar, iArr[0], iArr[1], 1.0f, fArr[0], fArr[1], new a(this, view, runnable), i10 != 1 ? 0 : 2, integer, this);
        }
    }

    @Override // com.android.launcher3.h
    public void w(h.a aVar) {
        this.f15477y = this.f15475w;
        setCurrentDropLayout(null);
        setCurrentDragOverlappingLayout(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p253z2.h x(View view, p253z2.j jVar, g gVar, C2.b bVar, A2.a aVar, p253z2.e eVar) {
        view.clearFocus();
        view.setPressed(false);
        p253z2.j jVar2 = (jVar == null && (view instanceof p253z2.j)) ? (p253z2.j) view : jVar;
        View viewA = aVar.a();
        float fB = aVar.b(viewA, this.f15458B);
        int[] iArr = this.f15458B;
        int i10 = iArr[0];
        int i11 = iArr[1];
        Rect rect = new Rect();
        if (jVar2 != null) {
            jVar2.b(rect);
            i11 += rect.top;
        }
        int i12 = i11;
        if (view.getParent() instanceof v) {
            this.f15470r = (v) view.getParent();
        }
        eVar.getClass();
        this.f15457A.d(new T5.a(this.f15478z));
        return this.f15457A.E(viewA, jVar2, i10, i12, gVar, bVar, rect, fB * 1.0f, fB, eVar);
    }

    public void y(View view, g gVar, p253z2.e eVar) {
        Object tag = view.getTag();
        if (tag instanceof C2.b) {
            x(view, null, gVar, (C2.b) tag, new A2.a(view), eVar);
            return;
        }
        throw new IllegalStateException("Drag started with a view that has no tag set. This will cause a crash (issue 11627249) down the line. View: " + view + "  tag: " + view.getTag());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:76:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:80:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.android.launcher3.dragndrop.a] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.view.View, com.android.launcher3.E, com.android.launcher3.Workspace] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.android.launcher3.dragndrop.DragLayer] */
    /* JADX WARN: Type inference failed for: r4v24, types: [z2.h] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.android.launcher3.CellLayout] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.android.launcher3.CellLayout] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.android.launcher3.h
    public void z(h.a aVar, p253z2.e eVar) {
        boolean z9;
        p233x2.a aVar2;
        ?? r9;
        int i10;
        CellLayout cellLayout;
        ?? r10;
        boolean z10;
        char c10;
        ?? r11;
        ?? r12;
        ?? r13;
        char c11;
        boolean z11;
        boolean z12;
        char c12;
        boolean z13;
        char c13;
        char c14;
        int[] iArr;
        int[] iArr2;
        View view;
        int[] iArr3;
        ?? r14;
        ?? r15;
        ?? r16;
        C2.b bVar;
        ?? r17;
        View view2;
        CellLayout cellLayoutJ;
        int i11;
        char c15;
        boolean z14;
        int i12;
        float[] fArrA = aVar.a(this.f15460D);
        this.f15460D = fArrA;
        CellLayout cellLayout2 = this.f15477y;
        if (cellLayout2 != null) {
            S(cellLayout2, fArrA);
        }
        if (aVar.f15601i != this || (aVar2 = this.f15471s) == null) {
            float[] fArr = this.f15460D;
            U(new int[]{(int) fArr[0], (int) fArr[1]}, cellLayout2, aVar);
            z9 = false;
        } else {
            View view3 = aVar2.f29755e;
            char c16 = 2;
            if (cellLayout2 == null || aVar.f15602j) {
                r9 = 0;
                View view4 = view3;
                i10 = -1;
                c16 = 2;
                cellLayout = cellLayout2;
                if (view4 instanceof com.nothing.cardhost.g) {
                    aVar.f15598f.j(true);
                }
                r10 = 0;
                z10 = false;
                c10 = 0;
                r11 = view4;
            } else {
                boolean z15 = J(view3) != cellLayout2;
                int iA = this.f15472t[0] < 0 ? this.f15471s.f29756f : a(cellLayout2);
                p233x2.a aVar3 = this.f15471s;
                int i13 = aVar3 != null ? aVar3.f1549c : 1;
                int i14 = aVar3 != null ? aVar3.f1550d : 1;
                float[] fArr2 = this.f15460D;
                this.f15472t = F((int) fArr2[0], (int) fArr2[1], i13, i14, cellLayout2, this.f15472t);
                C2.b bVar2 = aVar.f15599g;
                int i15 = bVar2.f597u;
                int i16 = bVar2.f598v;
                int i17 = bVar2.f599w;
                if (i17 > 0 && (i12 = bVar2.f600x) > 0) {
                    i15 = i17;
                    i16 = i12;
                }
                x2.c.a aVarA = getCellPosMapper().a(bVar2);
                if (aVarA.f29772c == iA) {
                    int i18 = aVarA.f29770a;
                    c15 = 1;
                    int[] iArr4 = this.f15472t;
                    z14 = false;
                    if (i18 == iArr4[0] && aVarA.f29771b == iArr4[1]) {
                        z12 = true;
                    }
                    if (z12 || !this.f15461E) {
                        z11 = z14;
                        c11 = c15;
                        z11 = z14;
                        c11 = c15;
                        z13 = z14;
                        c12 = c15;
                        z11 = z14;
                        c11 = c15;
                        z11 = z14;
                        c11 = c15;
                        z13 = z14;
                        c12 = c15;
                        c13 = z13 ? 1 : 0;
                    } else {
                        z11 = z14;
                        c11 = c15;
                        z11 = z14;
                        c11 = c15;
                        z13 = z14;
                        c12 = c15;
                        c13 = c12;
                    }
                    if (M() && c13 == 0) {
                        int[] iArr5 = this.f15472t;
                        if (cellLayout2.D(iArr5[z13 ? 1 : 0], iArr5[c12], i13, i14)) {
                            c14 = z13 ? 1 : 0;
                        } else {
                            c14 = c12;
                        }
                    } else {
                        c14 = z13 ? 1 : 0;
                    }
                    iArr = new int[2];
                    if (c14 != 0) {
                        int[] iArr6 = this.f15472t;
                        iArr6[c12] = -1;
                        iArr6[z13 ? 1 : 0] = -1;
                        cellLayout = cellLayout2;
                        iArr2 = iArr;
                        view = view3;
                        i10 = -1;
                    } else {
                        float[] fArr3 = this.f15460D;
                        iArr2 = iArr;
                        cellLayout = cellLayout2;
                        int i19 = i16;
                        i10 = -1;
                        int[] iArrL = cellLayout.L((int) fArr3[z13 ? 1 : 0], (int) fArr3[c12], i15, i19, i13, i14, view3, this.f15472t, iArr2, 2);
                        view = view3;
                        this.f15472t = iArrL;
                    }
                    iArr3 = this.f15472t;
                    if (iArr3[z13] >= 0 || iArr3[c12] < 0) {
                        r14 = z13;
                    } else {
                        r14 = c12;
                    }
                    if (r14 == 0 && (view instanceof com.nothing.cardhost.g) && ((i11 = iArr2[z13]) != bVar2.f597u || iArr2[c12] != bVar2.f598v)) {
                        bVar2.f597u = i11;
                        bVar2.f598v = iArr2[c12];
                        V5.a.f((com.nothing.cardhost.g) view, getContext(), iArr2[z13 ? 1 : 0], iArr2[c12]);
                        r15 = c12;
                    } else {
                        r15 = z13;
                    }
                    if (r14 != 0) {
                        bVar = (C2.b) view.getTag();
                        if (z15) {
                            cellLayoutJ = J(view);
                            if (cellLayoutJ != null) {
                                cellLayoutJ.removeView(view);
                            } else if (this.f15471s.f29755e instanceof com.nothing.cardhost.g) {
                                aVar.f15598f.j(z13);
                            }
                            int[] iArr7 = this.f15472t;
                            int i20 = iArr7[z13];
                            int i21 = iArr7[c12];
                            int i22 = bVar.f597u;
                            View view5 = view;
                            int i23 = bVar.f598v;
                            View view6 = view5;
                            r17 = z13 ? 1 : 0;
                            m(view6, 0, iA, i20, i21, i22, i23);
                            view2 = view6;
                        } else {
                            r17 = z13;
                            view2 = view;
                        }
                        p233x2.b bVar3 = (p233x2.b) view2.getLayoutParams();
                        bVar3.g(this.f15472t[r17]);
                        bVar3.e(this.f15472t[r17]);
                        bVar3.h(this.f15472t[c12]);
                        bVar3.f(this.f15472t[c12]);
                        bVar3.f29762f = bVar2.f597u;
                        bVar3.f29763g = bVar2.f598v;
                        bVar3.f29764h = c12;
                        boolean z16 = view2 instanceof com.nothing.cardhost.g;
                        com.android.launcher3.views.f fVar = this.f15478z;
                        int iA2 = bVar3.a();
                        int iB = bVar3.b();
                        int i24 = bVar2.f597u;
                        int i25 = bVar2.f598v;
                        r9 = r17 == true ? 1 : 0;
                        i10 = i10;
                        fVar.i(bVar, iA2, iB, i24, i25, true);
                        r11 = view2;
                        r10 = r15;
                        z10 = z12;
                        c10 = c13;
                    } else {
                        r16 = c12;
                        View view7 = view;
                        if (c14 == 0) {
                            W();
                        }
                        if (this.f15471s.f29755e instanceof com.nothing.cardhost.g) {
                            aVar.f15598f.j(r16);
                        }
                        p233x2.b bVar4 = (p233x2.b) view7.getLayoutParams();
                        this.f15472t[z13] = bVar4.a();
                        this.f15472t[r16 == true ? 1 : 0] = bVar4.b();
                        ((CellLayout) view7.getParent().getParent()).F(view7);
                        r11 = view7;
                        r9 = z13;
                        r10 = r15;
                        z10 = z12;
                        c10 = c13;
                    }
                } else {
                    c11 = 1;
                    z11 = false;
                }
                z11 = z14;
                c11 = c15;
                z11 = z14;
                c11 = c15;
                z11 = z14;
                c11 = c15;
                z12 = z11 ? 1 : 0;
                z13 = z11;
                c12 = c11;
                if (z12) {
                    z11 = z14;
                    c11 = c15;
                    z11 = z14;
                    c11 = c15;
                    z13 = z14;
                    c12 = c15;
                    z11 = z14;
                    c11 = c15;
                    z11 = z14;
                    c11 = c15;
                    z13 = z14;
                    c12 = c15;
                    c13 = z13 ? 1 : 0;
                } else {
                    z11 = z14;
                    c11 = c15;
                    z11 = z14;
                    c11 = c15;
                    z13 = z14;
                    c12 = c15;
                    z11 = z14;
                    c11 = c15;
                    z11 = z14;
                    c11 = c15;
                    z13 = z14;
                    c12 = c15;
                    c13 = z13 ? 1 : 0;
                }
                if (M()) {
                    c14 = z13 ? 1 : 0;
                } else {
                    c14 = z13 ? 1 : 0;
                }
                iArr = new int[2];
                if (c14 != 0) {
                    int[] iArr8 = this.f15472t;
                    iArr8[c12] = -1;
                    iArr8[z13 ? 1 : 0] = -1;
                    cellLayout = cellLayout2;
                    iArr2 = iArr;
                    view = view3;
                    i10 = -1;
                } else {
                    float[] fArr4 = this.f15460D;
                    iArr2 = iArr;
                    cellLayout = cellLayout2;
                    int i110 = i16;
                    i10 = -1;
                    int[] iArrL2 = cellLayout.L((int) fArr4[z13 ? 1 : 0], (int) fArr4[c12], i15, i110, i13, i14, view3, this.f15472t, iArr2, 2);
                    view = view3;
                    this.f15472t = iArrL2;
                }
                iArr3 = this.f15472t;
                if (iArr3[z13] >= 0) {
                    r14 = z13;
                } else {
                    r14 = z13;
                }
                if (r14 == 0) {
                    r15 = z13;
                } else {
                    r15 = z13;
                }
                if (r14 != 0) {
                    bVar = (C2.b) view.getTag();
                    if (z15) {
                        cellLayoutJ = J(view);
                        if (cellLayoutJ != null) {
                            cellLayoutJ.removeView(view);
                        } else if (this.f15471s.f29755e instanceof com.nothing.cardhost.g) {
                            aVar.f15598f.j(z13);
                        }
                        int[] iArr9 = this.f15472t;
                        int i26 = iArr9[z13];
                        int i27 = iArr9[c12];
                        int i28 = bVar.f597u;
                        View view8 = view;
                        int i29 = bVar.f598v;
                        View view9 = view8;
                        r17 = z13 ? 1 : 0;
                        m(view9, 0, iA, i26, i27, i28, i29);
                        view2 = view9;
                    } else {
                        r17 = z13;
                        view2 = view;
                    }
                    p233x2.b bVar5 = (p233x2.b) view2.getLayoutParams();
                    bVar5.g(this.f15472t[r17]);
                    bVar5.e(this.f15472t[r17]);
                    bVar5.h(this.f15472t[c12]);
                    bVar5.f(this.f15472t[c12]);
                    bVar5.f29762f = bVar2.f597u;
                    bVar5.f29763g = bVar2.f598v;
                    bVar5.f29764h = c12;
                    boolean z17 = view2 instanceof com.nothing.cardhost.g;
                    com.android.launcher3.views.f fVar2 = this.f15478z;
                    int iA3 = bVar5.a();
                    int iB2 = bVar5.b();
                    int i210 = bVar2.f597u;
                    int i211 = bVar2.f598v;
                    r9 = r17 == true ? 1 : 0;
                    i10 = i10;
                    fVar2.i(bVar, iA3, iB2, i210, i211, true);
                    r11 = view2;
                    r10 = r15;
                    z10 = z12;
                    c10 = c13;
                } else {
                    r16 = c12;
                    View view10 = view;
                    if (c14 == 0) {
                        W();
                    }
                    if (this.f15471s.f29755e instanceof com.nothing.cardhost.g) {
                        aVar.f15598f.j(r16);
                    }
                    p233x2.b bVar6 = (p233x2.b) view10.getLayoutParams();
                    this.f15472t[z13] = bVar6.a();
                    this.f15472t[r16 == true ? 1 : 0] = bVar6.b();
                    ((CellLayout) view10.getParent().getParent()).F(view10);
                    r11 = view10;
                    r9 = z13;
                    r10 = r15;
                    z10 = z12;
                    c10 = c13;
                }
            }
            ?? r18 = (CellLayout) r11.getParent().getParent();
            if (!aVar.f15598f.l()) {
                aVar.f15603k = r9;
                r11.setVisibility(r9);
                r13 = r11;
                r12 = r18;
            } else {
                if (c10 != 0) {
                    final F2.u uVar = new F2.u();
                    this.f15457A.f(new Runnable() { // from class: com.android.launcher3.C
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.b();
                        }
                    }, r11, 150);
                    r18.J(r11);
                    return;
                }
                C2.b bVar7 = (C2.b) r11.getTag();
                if (cellLayout != null) {
                    ?? r19 = r11;
                    v(bVar7, r18, aVar.f15598f, null, (r10 != 0 ? c16 : r9) == true ? 1 : 0, r19, false);
                    r12 = r18;
                    r13 = r19;
                } else {
                    this.f15478z.J().v(aVar.f15598f, r11, i10, this);
                    r13 = r11;
                    r12 = r18;
                }
            }
            r12.J(r13);
            z9 = z10;
        }
        p213v2.d dVar = aVar.f15604l;
        if (dVar == null || z9) {
            return;
        }
        dVar.c(t.f15700d);
    }

    public Workspace(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15472t = new int[2];
        this.f15473u = -1;
        this.f15474v = -1;
        this.f15475w = null;
        this.f15476x = null;
        this.f15477y = null;
        this.f15458B = new int[2];
        this.f15459C = new float[2];
        this.f15460D = new float[2];
        this.f15461E = false;
        this.f15462F = true;
        this.f15463G = new RunnableC1220b();
        this.f15464H = 0;
        this.f15465I = -1;
        this.f15466J = -1;
        this.f15478z = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        setHapticFeedbackEnabled(false);
        K();
        setMotionEventSplittingEnabled(true);
    }
}
