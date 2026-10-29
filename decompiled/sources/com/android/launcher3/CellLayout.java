package com.android.launcher3;

import F2.C0795b;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class CellLayout extends ViewGroup {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private static final int f15377B0 = Color.argb(160, 245, 245, 245);

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private static final int[] f15378C0 = {R.attr.state_active};

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private static final int[] f15379D0 = ViewGroup.EMPTY_STATE_SET;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private static final Paint f15380E0 = new Paint();

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final FloatProperty f15381F0 = new a("spring_loaded_progress");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final int[] f15382A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final boolean f15383A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final Rect f15384B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final PointF f15385C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected V5.b f15386D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public V5.b f15387E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private View.OnTouchListener f15388F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final ArrayList f15389G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected final Drawable f15390H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f15391I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f15392J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f15393K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final p233x2.b[] f15394L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final float[] f15395M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final i[] f15396N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f15397O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final ArrayMap f15398P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    final ArrayMap f15399Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f15400R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f15401S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f15402T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private RectF f15403U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Paint f15404V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f15405W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f15406a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f15407b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected float f15408c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f15409d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final int[] f15410e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final int[] f15411f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f15412g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final TimeInterpolator f15413h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected final v f15414i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected int f15415j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    final float f15416k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final ArrayList f15417l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Rect f15418m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int[] f15419n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    p233x2.d f15420o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Rect f15421p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final com.android.launcher3.views.f f15422q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final RectF f15423q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f15424r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final float[] f15425r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f15426s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    p213v2.c f15427s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15428t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    InterfaceC1222d f15429t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15430u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final Path f15431u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Point f15432v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final float f15433v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f15434w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private TextView f15435w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f15436x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final float f15437x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f15438y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final Drawable f15439y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final int[] f15440z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private Rect f15441z0;

    class a extends FloatProperty {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(CellLayout cellLayout) {
            return Float.valueOf(cellLayout.getSpringLoadedProgress());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(CellLayout cellLayout, float f10) {
            cellLayout.setSpringLoadedProgress(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f15442a;

        b(int i10) {
            this.f15442a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CellLayout.this.f15395M[this.f15442a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CellLayout.this.invalidate();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f15444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u f15448e;

        c(CellLayout cellLayout, float f10, float f11, float f12, float f13, u uVar) {
            this.f15444a = f10;
            this.f15445b = f11;
            this.f15446c = f12;
            this.f15447d = f13;
            this.f15448e = uVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f10 = 1.0f - fFloatValue;
            this.f15448e.getTranslateDelegate().c(1, (this.f15444a * f10) + (this.f15445b * fFloatValue), (f10 * this.f15446c) + (fFloatValue * this.f15447d));
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f15449a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p233x2.b f15450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f15451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f15452d;

        d(p233x2.b bVar, u uVar, View view) {
            this.f15450b = bVar;
            this.f15451c = uVar;
            this.f15452d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f15449a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f15449a) {
                this.f15450b.f29764h = true;
                this.f15451c.getTranslateDelegate().c(1, 0.0f, 0.0f);
                this.f15452d.requestLayout();
            }
            if (CellLayout.this.f15398P.containsKey(this.f15450b)) {
                CellLayout.this.f15398P.remove(this.f15450b);
            }
        }
    }

    public CellLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(int i10) {
        this.f15435w0.setVisibility(i10);
    }

    private void O(f fVar) {
        this.f15432v = new Point(fVar.f15586w);
        this.f15426s = -1;
        this.f15424r = -1;
        this.f15430u = -1;
        this.f15428t = -1;
    }

    private boolean R() {
        return this.f15435w0.getVisibility() != 0;
    }

    private void d(p233x2.d dVar, View view, boolean z9) {
        C0795b c0795b;
        V5.b bVar = this.f15387E;
        bVar.a();
        int childCount = this.f15414i0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f15414i0.getChildAt(i10);
            if (childAt != view && childAt.getVisibility() != 8 && (c0795b = (C0795b) dVar.f29773e.get(childAt)) != null) {
                c(childAt, c0795b.f1547a, c0795b.f1548b, 150, 0, false, false);
                bVar.k(c0795b, true);
            }
        }
        if (z9) {
            bVar.k(dVar, true);
        }
    }

    private void e(p233x2.d dVar, View view, int i10) {
        CellLayout cellLayout = this;
        int childCount = cellLayout.f15414i0.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = cellLayout.f15414i0.getChildAt(i11);
            if (childAt != view && childAt.getVisibility() != 8) {
                C0795b c0795b = (C0795b) dVar.f29773e.get(childAt);
                boolean z9 = i10 == 0 && !dVar.f29776h.contains(childAt);
                p233x2.b bVar = (p233x2.b) childAt.getLayoutParams();
                if (c0795b != null && !z9 && (childAt instanceof u)) {
                    new p233x2.l(childAt, i10, bVar.a(), bVar.b(), c0795b.f1547a, c0795b.f1548b, c0795b.f1549c, c0795b.f1550d, cellLayout.f15416k0, cellLayout, cellLayout.f15399Q).a();
                }
            }
            i11++;
            cellLayout = this;
        }
    }

    private void j(View view) {
        this.f15387E.b(this.f15386D);
        int iA = this.f15429t0.a(this);
        int childCount = this.f15414i0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f15414i0.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                p233x2.b bVar = (p233x2.b) childAt.getLayoutParams();
                C2.b bVar2 = (C2.b) childAt.getTag();
                if (bVar2 != null && childAt != view) {
                    x2.c.a aVarA = this.f15422q.getCellPosMapper().a(bVar2);
                    boolean z9 = (aVarA.f29770a == bVar.c() && aVarA.f29771b == bVar.d() && bVar2.f597u == bVar.f29762f && bVar2.f598v == bVar.f29763g && aVarA.f29772c == iA) ? false : true;
                    bVar.e(bVar.c());
                    bVar.f(bVar.d());
                    if (z9) {
                        this.f15422q.i(bVar2, bVar.a(), bVar.b(), bVar.f29762f, bVar.f29763g, false);
                    }
                }
            }
        }
    }

    private void k() {
        Iterator it = this.f15399Q.values().iterator();
        while (it.hasNext()) {
            ((p233x2.l) it.next()).c();
        }
        this.f15399Q.clear();
    }

    private void m(p233x2.d dVar, View view) {
        this.f15387E.a();
        int childCount = this.f15414i0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f15414i0.getChildAt(i10);
            if (childAt != view) {
                p233x2.b bVar = (p233x2.b) childAt.getLayoutParams();
                C0795b c0795b = (C0795b) dVar.f29773e.get(childAt);
                if (c0795b != null) {
                    bVar.g(c0795b.f1547a);
                    bVar.h(c0795b.f1548b);
                    bVar.f29762f = c0795b.f1549c;
                    bVar.f29763g = c0795b.f1550d;
                    this.f15387E.k(c0795b, true);
                }
            }
        }
        this.f15387E.k(dVar, true);
    }

    private void setUseTempCoords(boolean z9) {
        int childCount = this.f15414i0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((p233x2.b) this.f15414i0.getChildAt(i10).getLayoutParams()).f29761e = z9;
        }
    }

    private F2.s x(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(q.f15687a);
        return parcelable instanceof F2.s ? (F2.s) parcelable : new F2.s();
    }

    private void z(int i10, int i11, int[] iArr) {
        KeyEvent.Callback callbackT = t(i10, i11);
        if (callbackT instanceof p253z2.j) {
            p253z2.j jVar = (p253z2.j) callbackT;
            if (jVar.getViewType() == 0) {
                h(i10, i11, iArr);
                jVar.d(this.f15421p0);
                this.f15421p0.offset(iArr[0], iArr[1]);
                iArr[0] = this.f15421p0.centerX();
                iArr[1] = this.f15421p0.centerY();
                return;
            }
        }
        g(i10, i11, iArr);
    }

    protected void A(Boolean bool) {
        f fVarK = this.f15422q.K();
        V5.b bVar = this.f15386D;
        boolean z9 = fVarK.f15567e0;
        bVar.f8198f = z9;
        this.f15387E.f8198f = z9;
        if (bool.booleanValue()) {
            return;
        }
        this.f15390H.setBounds(fVarK.f15541J);
        this.f15441z0 = new Rect(0, 0, fVarK.f15539H, fVarK.f15540I);
        this.f15435w0.setTranslationY(fVarK.f15567e0 ? 0.0f : fVarK.f15569f0);
        this.f15414i0.setTranslationY(fVarK.f15541J.top);
    }

    boolean B() {
        return this.f15400R;
    }

    public boolean C(int i10, int i11, int i12, int i13, View view, int[] iArr) {
        int[] iArrR = r(i10, i11, i12, i13, iArr);
        int i14 = iArrR[0];
        int i15 = iArrR[1];
        return v(new Rect(i14, i15, i14 + i12, i15 + i13), view) != null;
    }

    public boolean D(int i10, int i11, int i12, int i13) {
        return this.f15386D.h(i10, i11, i12, i13);
    }

    public void F(View view) {
        if ((view instanceof com.nothing.cardhost.g) && (view.getTag() instanceof com.nothing.launcher.card.t)) {
            com.nothing.launcher.card.t tVar = (com.nothing.launcher.card.t) view.getTag();
            x2.c.a aVarA = this.f15422q.getCellPosMapper().a(tVar);
            this.f15386D.i(aVarA.f29770a, aVarA.f29771b, tVar.f597u, tVar.f598v, true);
        } else {
            if (view == null || view.getParent() != this.f15414i0) {
                return;
            }
            p233x2.b bVar = (p233x2.b) view.getLayoutParams();
            this.f15386D.i(bVar.a(), bVar.b(), bVar.f29762f, bVar.f29763g, true);
        }
    }

    public void G(View view) {
        if ((view instanceof com.nothing.cardhost.g) && (view.getTag() instanceof com.nothing.launcher.card.t)) {
            com.nothing.launcher.card.t tVar = (com.nothing.launcher.card.t) view.getTag();
            x2.c.a aVarA = this.f15422q.getCellPosMapper().a(tVar);
            this.f15386D.i(aVarA.f29770a, aVarA.f29771b, tVar.f597u, tVar.f598v, false);
        } else {
            if (view == null || view.getParent() != this.f15414i0) {
                return;
            }
            p233x2.b bVar = (p233x2.b) view.getLayoutParams();
            this.f15386D.i(bVar.a(), bVar.b(), bVar.f29762f, bVar.f29763g, false);
        }
    }

    void H() {
        this.f15412g0 = true;
        this.f15420o0 = null;
    }

    void I() {
        if (this.f15412g0) {
            this.f15412g0 = false;
        }
        this.f15420o0 = null;
        int[] iArr = this.f15410e0;
        iArr[1] = -1;
        iArr[0] = -1;
        int[] iArr2 = this.f15411f0;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f15396N[this.f15397O].e();
        this.f15397O = (this.f15397O + 1) % this.f15396N.length;
        P();
    }

    void J(View view) {
        if (view != null) {
            ((p233x2.b) view.getLayoutParams()).f29768l = true;
            view.requestLayout();
            F(view);
        }
    }

    public void K(p233x2.d dVar, View view, int i10) {
        if (i10 == 0) {
            e(dVar, view, 0);
            return;
        }
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            setUseTempCoords(true);
            m(dVar, view);
            setItemPlacementDirty(true);
            d(dVar, view, i10 == 2);
            if (i10 == 2 || i10 == 3) {
                j(view);
                k();
                setItemPlacementDirty(false);
            } else {
                e(dVar, view, 1);
            }
        }
        if (i10 == 2 || i10 == 3) {
            setUseTempCoords(false);
        }
        this.f15414i0.requestLayout();
    }

    int[] L(int i10, int i11, int i12, int i13, int i14, int i15, View view, int[] iArr, int[] iArr2, int i16) {
        p233x2.d dVarF;
        int[] iArr3 = iArr2 == null ? new int[]{-1, -1} : iArr2;
        int[] iArr4 = iArr == null ? new int[]{-1, -1} : iArr;
        if (i16 == 0 || (dVarF = this.f15420o0) == null) {
            dVarF = f(i10, i11, i12, i13, i14, i15, view);
            this.f15420o0 = dVarF;
        } else if (i16 == 2 || i16 == 3) {
            this.f15420o0 = null;
        }
        if (dVarF == null || !dVarF.f29777i) {
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            return iArr4;
        }
        iArr4[0] = dVarF.f1547a;
        iArr4[1] = dVarF.f1548b;
        iArr3[0] = dVarF.f1549c;
        iArr3[1] = dVarF.f1550d;
        K(dVarF, view, i16);
        return iArr4;
    }

    public void M(int i10, int i11, int[] iArr) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i12 = i10 - paddingLeft;
        int i13 = this.f15424r;
        Point point = this.f15432v;
        int i14 = i12 / (i13 + point.x);
        iArr[0] = i14;
        int i15 = (i11 - paddingTop) / (this.f15426s + point.y);
        iArr[1] = i15;
        int i16 = this.f15434w;
        int i17 = this.f15436x;
        if (i14 < 0) {
            iArr[0] = 0;
        }
        if (iArr[0] >= i16) {
            iArr[0] = i16 - 1;
        }
        if (i15 < 0) {
            iArr[1] = 0;
        }
        if (iArr[1] >= i17) {
            iArr[1] = i17 - 1;
        }
    }

    public void N(int i10, int i11, int i12, int i13, int[] iArr) {
        i(i10, i11, i12, i13, this.f15421p0);
        iArr[0] = this.f15421p0.centerX();
        iArr[1] = this.f15421p0.centerY();
    }

    void P() {
        CellLayout cellLayout;
        k();
        if (B()) {
            int childCount = this.f15414i0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = this.f15414i0.getChildAt(i10);
                p233x2.b bVar = (p233x2.b) childAt.getLayoutParams();
                if (bVar.c() == bVar.a() && bVar.d() == bVar.b()) {
                    cellLayout = this;
                } else {
                    bVar.g(bVar.a());
                    bVar.h(bVar.b());
                    cellLayout = this;
                    cellLayout.c(childAt, bVar.a(), bVar.b(), 150, 0, false, false);
                }
                i10++;
                this = cellLayout;
            }
            this.setItemPlacementDirty(false);
        }
    }

    public void Q(int i10, int i11) {
        this.f15391I = i10;
        this.f15392J = i11;
    }

    protected void S() {
        this.f15390H.setAlpha((int) (this.f15408c0 * 255.0f));
    }

    public void T(float f10) {
        this.f15435w0.setAlpha(Math.max(0.1f, f10));
        this.f15414i0.setAlpha(Math.max(0.1f, f10));
    }

    public void U() {
        final int i10 = (this.f15414i0.getChildCount() > 0 || this.f15422q.p().y() || !this.f15422q.J().y()) ? 8 : 0;
        if (this.f15435w0.getVisibility() != i10) {
            this.f15435w0.setVisibility(0);
            this.f15435w0.animate().alpha((i10 == 0 && this.f15422q.O()) ? 1.0f : 0.0f).withEndAction(new Runnable() { // from class: com.android.launcher3.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15499q.E(i10);
                }
            }).start();
        }
    }

    void V(int i10, int i11, int i12, int i13, h.a aVar) {
        int[] iArr = this.f15410e0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            int[] iArr2 = this.f15411f0;
            if (iArr2[0] == i12 && iArr2[1] == i13) {
                return;
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        int[] iArr3 = this.f15411f0;
        iArr3[0] = i12;
        iArr3[1] = i13;
        int i14 = this.f15397O;
        this.f15396N[i14].e();
        p233x2.b[] bVarArr = this.f15394L;
        int length = (i14 + 1) % bVarArr.length;
        this.f15397O = length;
        p233x2.b bVar = bVarArr[length];
        bVar.e(i10);
        bVar.f(i11);
        bVar.f29762f = i12;
        bVar.f29763g = i13;
        this.f15396N[this.f15397O].d();
        invalidate();
        p213v2.d dVar = aVar.f15604l;
        if (dVar != null) {
            dVar.a(w(i10, i11));
        }
    }

    protected void W(Canvas canvas) {
        CellLayout cellLayout;
        this.f15404V.setStrokeWidth(this.f15437x0);
        this.f15431u0.reset();
        RectF rectF = new RectF(this.f15390H.getBounds());
        Path path = this.f15431u0;
        float f10 = this.f15433v0;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        int i10 = 0;
        if (this.f15401S && this.f15406a0 > 0.0f && R()) {
            canvas.save();
            canvas.clipPath(this.f15431u0);
            this.f15439y0.setAlpha((int) (this.f15406a0 * 255.0f));
            this.f15441z0.offsetTo(0, (int) rectF.top);
            this.f15439y0.setBounds(this.f15441z0);
            this.f15439y0.draw(canvas);
            canvas.restore();
        }
        if (!this.f15402T) {
            return;
        }
        while (true) {
            p233x2.b[] bVarArr = this.f15394L;
            if (i10 >= bVarArr.length) {
                return;
            }
            float f11 = this.f15395M[i10];
            if (f11 <= 0.0f) {
                cellLayout = this;
            } else {
                p233x2.b bVar = bVarArr[i10];
                cellLayout = this;
                cellLayout.i(bVar.a(), bVar.b(), bVar.f29762f, bVar.f29763g, this.f15384B);
                cellLayout.f15403U.set(cellLayout.f15384B);
                cellLayout.f15404V.setAlpha(255);
                cellLayout.f15404V.setStyle(Paint.Style.FILL);
                cellLayout.f15404V.setColor(Color.argb((int) (Color.alpha(cellLayout.f15407b0) * (f11 / 255.0f)), Color.red(cellLayout.f15407b0), Color.green(cellLayout.f15407b0), Color.blue(cellLayout.f15407b0)));
                canvas.save();
                canvas.clipPath(cellLayout.f15431u0);
                canvas.translate(cellLayout.y(bVar), 0.0f);
                RectF rectF2 = cellLayout.f15403U;
                int i11 = cellLayout.f15405W;
                canvas.drawRoundRect(rectF2, i11, i11, cellLayout.f15404V);
                canvas.restore();
            }
            i10++;
            this = cellLayout;
        }
    }

    public boolean b(View view, int i10, int i11, p233x2.b bVar, boolean z9) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        if (bVar.a() < 0 || bVar.a() > this.f15434w - 1 || bVar.b() < 0) {
            return false;
        }
        int iB = bVar.b();
        int i12 = this.f15436x;
        if (iB > i12 - 1) {
            return false;
        }
        if (bVar.f29762f < 0) {
            bVar.f29762f = this.f15434w;
        }
        if (bVar.f29763g < 0) {
            bVar.f29763g = i12;
        }
        view.setId(i11);
        this.f15414i0.addView(view, i10, bVar);
        if (bVar.b() >= getCountY()) {
            view.setVisibility(8);
        }
        if (z9) {
            F(view);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean c(View view, int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
        int i14;
        int i15;
        v shortcutsAndWidgets = getShortcutsAndWidgets();
        if (shortcutsAndWidgets.indexOfChild(view) == -1 || !(view instanceof u)) {
            return false;
        }
        p233x2.b bVar = (p233x2.b) view.getLayoutParams();
        u uVar = (u) view;
        if (this.f15398P.containsKey(bVar)) {
            ((Animator) this.f15398P.get(bVar)).cancel();
            this.f15398P.remove(bVar);
        }
        if (z10) {
            V5.b bVar2 = z9 ? this.f15386D : this.f15387E;
            bVar2.i(bVar.a(), bVar.b(), bVar.f29762f, bVar.f29763g, false);
            i14 = i10;
            i15 = i11;
            bVar2.i(i14, i15, bVar.f29762f, bVar.f29763g, true);
        } else {
            i14 = i10;
            i15 = i11;
        }
        int i16 = bVar.f29766j;
        int i17 = bVar.f29767k;
        bVar.f29764h = true;
        if (z9) {
            bVar.e(i14);
            bVar.f(i15);
        } else {
            bVar.g(i14);
            bVar.h(i15);
        }
        shortcutsAndWidgets.setupLp(view);
        int i18 = bVar.f29766j;
        int i19 = bVar.f29767k;
        bVar.f29766j = i16;
        bVar.f29767k = i17;
        bVar.f29764h = false;
        F2.o translateDelegate = uVar.getTranslateDelegate();
        float fB = translateDelegate.a(1).b();
        float fB2 = translateDelegate.b(1).b();
        float f10 = i18 - i16;
        float f11 = i19 - i17;
        if (f10 == 0.0f && f11 == 0.0f && fB == 0.0f && fB2 == 0.0f) {
            bVar.f29764h = true;
            return true;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(i12);
        this.f15398P.put(bVar, valueAnimatorOfFloat);
        valueAnimatorOfFloat.addUpdateListener(new c(this, fB, f10, fB2, f11, uVar));
        valueAnimatorOfFloat.addListener(new d(bVar, uVar, view));
        valueAnimatorOfFloat.setStartDelay(i13);
        valueAnimatorOfFloat.start();
        return true;
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).cancelLongPress();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p233x2.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        RectF rectF = new RectF(this.f15390H.getBounds());
        float f10 = this.f15433v0;
        this.f15431u0.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10}, Path.Direction.CW);
        canvas.clipPath(this.f15431u0);
        super.dispatchDraw(canvas);
        if (this.f15389G.size() <= 0) {
            return;
        }
        androidx.appcompat.app.o.a(this.f15389G.get(0));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        p213v2.c cVar = this.f15427s0;
        if (cVar == null || !cVar.k(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        super.dispatchRestoreInstanceState(x(sparseArray));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        F2.s sVarX = x(sparseArray);
        super.dispatchSaveInstanceState(sVarX);
        sparseArray.put(q.f15687a, sVarX);
    }

    public p233x2.d f(int i10, int i11, int i12, int i13, int i14, int i15, View view) {
        p233x2.d dVar = new p233x2.d();
        l(dVar);
        return n().h(new p233x2.k(i10, i11, i14, i15, i12, i13, view, dVar));
    }

    void g(int i10, int i11, int[] iArr) {
        N(i10, i11, 1, 1, iArr);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p233x2.b(getContext(), attributeSet);
    }

    public List<View> getAllChildren() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f15414i0.getChildCount(); i10++) {
            arrayList.add(this.f15414i0.getChildAt(i10));
        }
        return arrayList;
    }

    public Drawable getAnimBackground() {
        return this.f15390H;
    }

    public int getCellHeight() {
        return this.f15426s;
    }

    public InterfaceC1222d getCellLayoutContainer() {
        return this.f15429t0;
    }

    public int getCellWidth() {
        return this.f15424r;
    }

    public int getCountX() {
        return this.f15434w;
    }

    public int getCountY() {
        return this.f15386D.e();
    }

    public int getDesiredHeight() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i10 = this.f15436x;
        return paddingTop + (this.f15426s * i10) + ((i10 - 1) * this.f15432v.y);
    }

    public int getDesiredWidth() {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i10 = this.f15434w;
        return paddingLeft + (this.f15424r * i10) + ((i10 - 1) * this.f15432v.x);
    }

    public p213v2.c getDragAndDropAccessibilityDelegate() {
        return this.f15427s0;
    }

    public View getEmptyView() {
        return this.f15435w0;
    }

    public RectF getHitRect() {
        f fVarK = this.f15422q.K();
        RectF rectF = new RectF();
        rectF.left = fVarK.f15541J.left + getLeft();
        rectF.top = fVarK.f15541J.top + getTop() + getTranslationY();
        rectF.right = rectF.left + fVarK.f15541J.width();
        rectF.bottom = rectF.top + fVarK.f15541J.height() + getTranslationY();
        return rectF;
    }

    public boolean getIsDragOverlapping() {
        return this.f15393K;
    }

    public V5.b getOccupied() {
        return this.f15386D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    public v getShortcutsAndWidgets() {
        return this.f15414i0;
    }

    public float getSpringLoadedProgress() {
        return this.f15408c0;
    }

    public int getUnusedHorizontalSpace() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i10 = this.f15434w;
        return (measuredWidth - (this.f15424r * i10)) - ((i10 - 1) * this.f15432v.x);
    }

    void h(int i10, int i11, int[] iArr) {
        i(i10, i11, 1, 1, this.f15421p0);
        Rect rect = this.f15421p0;
        iArr[0] = rect.left;
        iArr[1] = rect.top;
    }

    public void i(int i10, int i11, int i12, int i13, Rect rect) {
        int i14 = this.f15424r;
        int i15 = this.f15426s;
        int paddingLeft = getPaddingLeft() + ((int) Math.ceil(getUnusedHorizontalSpace() / 2.0f));
        int paddingTop = getPaddingTop();
        Point point = this.f15432v;
        int i16 = point.x;
        int i17 = paddingLeft + (i10 * i16) + (i10 * i14);
        int i18 = point.y;
        int i19 = paddingTop + (i11 * i18) + (i11 * i15);
        rect.set(i17, i19, (i14 * i12) + ((i12 - 1) * i16) + i17, (i15 * i13) + ((i13 - 1) * i18) + i19);
        rect.offset(0, this.f15390H.getBounds().top);
    }

    public void l(p233x2.d dVar) {
        int childCount = this.f15414i0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f15414i0.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                Object tag = childAt.getTag();
                if (!(tag instanceof com.nothing.launcher.card.t) || !((com.nothing.launcher.card.t) tag).n()) {
                    p233x2.b bVar = (p233x2.b) childAt.getLayoutParams();
                    dVar.b(childAt, new C0795b(bVar.a(), bVar.b(), bVar.f29762f, bVar.f29763g));
                }
            }
        }
    }

    public p233x2.j n() {
        return new p233x2.j(this);
    }

    public void o(boolean z9) {
        this.f15414i0.setLayerType(z9 ? 2 : 0, f15380E0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f15383A0) {
            this.f15390H.setAlpha((int) (this.f15406a0 * 255.0f));
        }
        if (this.f15390H.getAlpha() > 0) {
            this.f15390H.draw(canvas);
        }
        if (this.f15389G.size() > 0) {
            androidx.appcompat.app.o.a(this.f15389G.get(0));
            throw null;
        }
        if (this.f15401S || this.f15402T) {
            W(canvas);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) requireViewById(q.f15688b);
        this.f15435w0 = textView;
        textView.setTextColor(F2.h.c(getContext()));
        this.f15435w0.setCompoundDrawablesRelativeWithIntrinsicBounds(F2.h.d(getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f15435w0.setAlpha(0.0f);
        A(Boolean.FALSE);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15427s0 != null) {
            return true;
        }
        View.OnTouchListener onTouchListener = this.f15388F;
        return onTouchListener != null && onTouchListener.onTouch(this, motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft() + ((int) Math.ceil(getUnusedHorizontalSpace() / 2.0f));
        int paddingRight = ((i12 - i10) - getPaddingRight()) - ((int) Math.ceil(getUnusedHorizontalSpace() / 2.0f));
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        this.f15414i0.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
        int measuredWidth = this.f15435w0.getMeasuredWidth() / 2;
        int measuredHeight = this.f15435w0.getMeasuredHeight() / 2;
        int i14 = (paddingRight - paddingLeft) / 2;
        int i15 = (paddingBottom - paddingTop) / 2;
        this.f15435w0.layout(i14 - measuredWidth, i15 - measuredHeight, i14 + measuredWidth, i15 + measuredHeight);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = size - (getPaddingLeft() + getPaddingRight());
        int paddingTop = size2 - (getPaddingTop() + getPaddingBottom());
        int i13 = this.f15391I;
        if (i13 > 0 && (i12 = this.f15392J) > 0) {
            paddingLeft = i13;
            paddingTop = i12;
        } else if (mode == 0 || mode2 == 0) {
            throw new RuntimeException("CellLayout cannot have UNSPECIFIED dimensions");
        }
        if (this.f15428t < 0 || this.f15430u < 0) {
            int iF = f.f(paddingLeft, this.f15432v.x, this.f15434w);
            int iE = f.e(paddingTop, this.f15432v.y, this.f15436x);
            if (iF != this.f15424r || iE != this.f15426s) {
                this.f15424r = iF;
                this.f15426s = iE;
                this.f15414i0.e(iF, iE, this.f15434w, this.f15436x, this.f15432v);
            }
        }
        this.f15414i0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(paddingTop, BasicMeasure.EXACTLY));
        measureChild(this.f15435w0, View.MeasureSpec.makeMeasureSpec(paddingLeft, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(paddingTop, BasicMeasure.EXACTLY));
        int measuredWidth = this.f15414i0.getMeasuredWidth();
        int measuredHeight = this.f15414i0.getMeasuredHeight();
        if (this.f15391I <= 0 || this.f15392J <= 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    public boolean p(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            iArr = new int[2];
        }
        return this.f15386D.c(iArr, i10, i11);
    }

    protected int[] q(int i10, int i11, int i12, int i13, int i14, int i15, boolean z9, int[] iArr, int[] iArr2) {
        int i16;
        char c10;
        int i17;
        char c11;
        CellLayout cellLayout = this;
        int i18 = i12;
        int i19 = i13;
        int i20 = i14;
        int i21 = cellLayout.f15424r;
        Point point = cellLayout.f15432v;
        int i22 = (int) (i10 - (((i21 + point.x) * (i20 - 1)) / 2.0f));
        int i23 = (int) (i11 - (((cellLayout.f15426s + point.y) * (i15 - 1)) / 2.0f));
        int[] iArr3 = iArr != null ? iArr : new int[2];
        Rect rect = new Rect(-1, -1, -1, -1);
        Stack stack = new Stack();
        int i24 = cellLayout.f15434w;
        int iE = cellLayout.f15386D.e();
        if (i18 > 0 && i19 > 0 && i20 > 0 && i15 > 0 && i20 >= i18 && i15 >= i19) {
            int i25 = 0;
            double d10 = Double.MAX_VALUE;
            while (i25 < iE - (i19 - 1)) {
                int i26 = 0;
                while (i26 < i24 - (i18 - 1)) {
                    if (z9) {
                        i16 = i22;
                        c10 = 0;
                        i18 = -1;
                        i17 = -1;
                    } else {
                        int i27 = 0;
                        while (true) {
                            if (i27 >= i18) {
                                i16 = i22;
                                c10 = 0;
                                boolean z10 = i18 >= i20;
                                boolean z11 = i19 >= i15;
                                boolean z12 = true;
                                i17 = i19;
                                while (true) {
                                    if (z10 && z11) {
                                        break;
                                    }
                                    if (z12 && !z10) {
                                        int i28 = 0;
                                        while (i28 < i17) {
                                            int i29 = i28;
                                            int i30 = i26 + i18;
                                            z10 = (i30 > i24 + (-1) || cellLayout.f15386D.d()[i30][i25 + i29]) ? true : z10;
                                            i28 = i29 + 1;
                                        }
                                        boolean z13 = z10;
                                        if (!z13) {
                                            i18++;
                                        }
                                        z10 = z13;
                                    } else if (!z11) {
                                        int i31 = 0;
                                        while (i31 < i18) {
                                            int i32 = i18;
                                            int i33 = i25 + i17;
                                            int i34 = i31;
                                            if (i33 > iE - 1 || cellLayout.f15386D.d()[i26 + i34][i33]) {
                                                z11 = true;
                                            }
                                            i31 = i34 + 1;
                                            i18 = i32;
                                        }
                                        int i35 = i18;
                                        if (!z11) {
                                            i17++;
                                        }
                                        i18 = i35;
                                    }
                                    z10 |= i18 >= i20;
                                    z11 |= i17 >= i15;
                                    z12 = !z12;
                                }
                            } else {
                                int i36 = 0;
                                while (true) {
                                    if (i36 < i19) {
                                        i16 = i22;
                                        if (!cellLayout.f15386D.d()[i26 + i27][i25 + i36]) {
                                            i36++;
                                            i22 = i16;
                                        }
                                    } else {
                                        i27++;
                                    }
                                }
                            }
                            i26++;
                            cellLayout = this;
                            i18 = i12;
                            i19 = i13;
                            i20 = i14;
                            i22 = i16;
                        }
                    }
                    int[] iArr4 = cellLayout.f15440z;
                    cellLayout.g(i26, i25, iArr4);
                    Rect rect2 = new Rect(i26, i25, i26 + i18, i25 + i17);
                    Iterator it = stack.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c11 = c10;
                            break;
                        }
                        if (((Rect) it.next()).contains(rect2)) {
                            c11 = 1;
                            break;
                        }
                    }
                    stack.push(rect2);
                    char c12 = c11;
                    int i37 = i18;
                    double dHypot = Math.hypot(iArr4[c10] - i16, iArr4[1] - i23);
                    if ((dHypot <= d10 && c12 == 0) || rect2.contains(rect)) {
                        iArr3[c10] = i26;
                        iArr3[1] = i25;
                        if (iArr2 != null) {
                            iArr2[c10] = i37;
                            iArr2[1] = i17;
                        }
                        rect.set(rect2);
                        d10 = dHypot;
                    }
                    i26++;
                    cellLayout = this;
                    i18 = i12;
                    i19 = i13;
                    i20 = i14;
                    i22 = i16;
                }
                i25++;
                cellLayout = this;
                i18 = i12;
                i19 = i13;
                i20 = i14;
            }
            if (d10 == Double.MAX_VALUE) {
                iArr3[0] = -1;
                iArr3[1] = -1;
            }
        }
        return iArr3;
    }

    public int[] r(int i10, int i11, int i12, int i13, int[] iArr) {
        return q(i10, i11, i12, i13, i12, i13, true, iArr, null);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.f15386D.a();
        this.f15414i0.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        if (this.f15414i0.getChildCount() > 0) {
            this.f15386D.a();
            this.f15414i0.removeAllViewsInLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        G(view);
        this.f15414i0.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        G(this.f15414i0.getChildAt(i10));
        this.f15414i0.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        G(view);
        this.f15414i0.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            G(this.f15414i0.getChildAt(i12));
        }
        this.f15414i0.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            G(this.f15414i0.getChildAt(i12));
        }
        this.f15414i0.removeViewsInLayout(i10, i11);
    }

    public int[] s(int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2) {
        return q(i10, i11, i12, i13, i14, i15, false, iArr, iArr2);
    }

    public void setCellLayoutContainer(InterfaceC1222d interfaceC1222d) {
        this.f15429t0 = interfaceC1222d;
    }

    public void setDragAndDropAccessibilityDelegate(p213v2.c cVar) {
        H.g0(this, cVar);
        this.f15427s0 = cVar;
        int i10 = cVar != null ? 1 : 2;
        setImportantForAccessibility(i10);
        getShortcutsAndWidgets().setImportantForAccessibility(i10);
        setFocusable(cVar != null);
        if (getParent() != null) {
            getParent().notifySubtreeAccessibilityStateChanged(this, this, 1);
        }
    }

    public void setDropPending(boolean z9) {
        this.f15438y = z9;
    }

    public void setGridAlpha(float f10) {
        if (Float.compare(f10, this.f15406a0) != 0) {
            this.f15406a0 = f10;
            invalidate();
        }
    }

    public void setInvertIfRtl(boolean z9) {
        this.f15414i0.setInvertIfRtl(z9);
    }

    void setIsDragOverlapping(boolean z9) {
        if (this.f15393K != z9) {
            this.f15393K = z9;
            this.f15390H.setState(z9 ? f15378C0 : f15379D0);
            invalidate();
        }
    }

    void setItemPlacementDirty(boolean z9) {
        this.f15400R = z9;
    }

    public void setOnInterceptTouchListener(View.OnTouchListener onTouchListener) {
        this.f15388F = onTouchListener;
    }

    public void setScrollProgress(float f10) {
        if (Float.compare(Math.abs(f10), this.f15409d0) != 0) {
            this.f15409d0 = Math.abs(f10);
            S();
        }
    }

    public void setSpaceBetweenCellLayoutsPx(int i10) {
        this.f15415j0 = i10;
    }

    public void setSpringLoadedProgress(float f10) {
        if (Float.compare(f10, this.f15408c0) != 0) {
            this.f15408c0 = f10;
            S();
            setGridAlpha(f10);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public View t(int i10, int i11) {
        return this.f15414i0.a(i10, i11);
    }

    public float u(float f10, float f11, int[] iArr) {
        z(iArr[0], iArr[1], this.f15440z);
        int[] iArr2 = this.f15440z;
        return (float) Math.hypot(f10 - iArr2[0], f11 - iArr2[1]);
    }

    public Rect v(Rect rect, View view) {
        Rect rect2 = new Rect(rect);
        Rect rect3 = new Rect();
        int childCount = this.f15414i0.getChildCount();
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f15414i0.getChildAt(i10);
            if (childAt != view && childAt.getVisibility() != 8) {
                p233x2.b bVar = (p233x2.b) childAt.getLayoutParams();
                rect3.set(bVar.a(), bVar.b(), bVar.a() + bVar.f29762f, bVar.b() + bVar.f29763g);
                if (Rect.intersects(rect, rect3)) {
                    rect2.union(rect3);
                    z9 = true;
                }
            }
        }
        if (z9) {
            return rect2;
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15390H;
    }

    public String w(int i10, int i11) {
        int i12 = i11 + 1;
        int i13 = w.g(getResources()) ? this.f15434w - i10 : i10 + 1;
        int panelCount = this.f15429t0.getPanelCount();
        int iD = this.f15429t0.d(this);
        if (panelCount > 1) {
            i13 += (iD % panelCount) * this.f15434w;
        }
        return getContext().getString(t.f15701e, Integer.valueOf(i12), Integer.valueOf(i13), this.f15429t0.b(iD));
    }

    protected float y(p233x2.b bVar) {
        return 0.0f;
    }

    public CellLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15438y = false;
        this.f15440z = new int[2];
        this.f15382A = new int[2];
        this.f15384B = new Rect();
        this.f15385C = new PointF();
        this.f15389G = new ArrayList();
        this.f15391I = -1;
        this.f15392J = -1;
        this.f15393K = false;
        p233x2.b[] bVarArr = new p233x2.b[4];
        this.f15394L = bVarArr;
        this.f15395M = new float[bVarArr.length];
        this.f15396N = new i[bVarArr.length];
        this.f15397O = 0;
        this.f15398P = new ArrayMap();
        this.f15399Q = new ArrayMap();
        this.f15400R = false;
        this.f15401S = true;
        this.f15402T = true;
        this.f15403U = new RectF();
        this.f15404V = new Paint();
        this.f15406a0 = 0.0f;
        this.f15407b0 = 0;
        this.f15408c0 = 0.0f;
        this.f15409d0 = 0.0f;
        this.f15410e0 = new int[]{-1, -1};
        this.f15411f0 = new int[]{-1, -1};
        this.f15412g0 = false;
        this.f15415j0 = 0;
        this.f15417l0 = new ArrayList();
        this.f15418m0 = new Rect();
        this.f15419n0 = new int[2];
        this.f15420o0 = null;
        this.f15421p0 = new Rect();
        this.f15423q0 = new RectF();
        this.f15425r0 = new float[4];
        this.f15431u0 = new Path();
        this.f15383A0 = p087i6.e.j();
        setWillNotDraw(false);
        setClipToPadding(false);
        setClipChildren(false);
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(context);
        this.f15422q = fVar;
        f fVarK = fVar.K();
        O(fVarK);
        int i11 = fVarK.f15585v;
        this.f15434w = i11;
        int i12 = fVarK.f15583t;
        this.f15436x = i12;
        this.f15386D = new V5.b(i11, i12, fVarK.f15584u);
        this.f15387E = new V5.b(this.f15434w, this.f15436x, fVarK.f15584u);
        Resources resources = getResources();
        Drawable drawableE = F2.h.e(context);
        this.f15390H = drawableE;
        drawableE.setCallback(this);
        this.f15437x0 = getResources().getDimension(o.f15636c);
        this.f15407b0 = getContext().getColor(n.f15633d);
        this.f15405W = resources.getDimensionPixelSize(o.f15640g);
        this.f15416k0 = fVarK.f15587x * 0.12f;
        this.f15413h0 = p223w2.q.f28608k;
        int i13 = 0;
        while (true) {
            p233x2.b[] bVarArr2 = this.f15394L;
            if (i13 >= bVarArr2.length) {
                break;
            }
            bVarArr2[i13] = new p233x2.b(0, 0, 0, 0);
            i13++;
        }
        int integer = resources.getInteger(r.f15690b);
        float integer2 = resources.getInteger(r.f15691c);
        Arrays.fill(this.f15395M, 0.0f);
        for (int i14 = 0; i14 < this.f15396N.length; i14++) {
            i iVar = new i(integer, 0.0f, integer2);
            iVar.g().setInterpolator(this.f15413h0);
            iVar.g().addUpdateListener(new b(i14));
            this.f15396N[i14] = iVar;
        }
        v vVar = new v(context);
        this.f15414i0 = vVar;
        vVar.e(this.f15424r, this.f15426s, this.f15434w, this.f15436x, this.f15432v);
        addView(vVar);
        this.f15433v0 = F2.h.f(context);
        this.f15439y0 = F2.h.g(context);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new p233x2.b(layoutParams);
    }
}
