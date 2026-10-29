package com.google.android.material.sidesheet;

import C0.g;
import N4.h;
import N4.l;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.o;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1077i;
import androidx.core.view.H;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p225w4.i;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c implements I4.b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int f17132P = i.f28877B;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final int f17133Q = j.f28917n;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private I0.c f17134A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f17135B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f17136C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f17137D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f17138E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f17139F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f17140G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private WeakReference f17141H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private WeakReference f17142I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f17143J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private VelocityTracker f17144K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private I4.e f17145L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f17146M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Set f17147N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I0.c.AbstractC0101c f17148O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f17149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f17150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f17151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f17152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private l f17153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d f17154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f17155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17158z;

    class a extends I0.c.AbstractC0101c {
        a() {
        }

        @Override // I0.c.AbstractC0101c
        public int a(View view, int i10, int i11) {
            return p221w0.a.b(i10, SideSheetBehavior.this.f17149q.g(), SideSheetBehavior.this.f17149q.f());
        }

        @Override // I0.c.AbstractC0101c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // I0.c.AbstractC0101c
        public int d(View view) {
            return SideSheetBehavior.this.f17137D + SideSheetBehavior.this.k0();
        }

        @Override // I0.c.AbstractC0101c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f17156x) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // I0.c.AbstractC0101c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f17149q.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // I0.c.AbstractC0101c
        public void l(View view, float f10, float f11) {
            int iW = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // I0.c.AbstractC0101c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f17157y == 1 || SideSheetBehavior.this.f17141H == null || SideSheetBehavior.this.f17141H.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f17141H == null || SideSheetBehavior.this.f17141H.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f17141H.get()).requestLayout();
        }
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f17164c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(this.f17168q);
            }
        };

        d() {
        }

        public static /* synthetic */ void a(d dVar) {
            dVar.f17163b = false;
            if (SideSheetBehavior.this.f17134A != null && SideSheetBehavior.this.f17134A.n(true)) {
                dVar.b(dVar.f17162a);
            } else if (SideSheetBehavior.this.f17157y == 2) {
                SideSheetBehavior.this.G0(dVar.f17162a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f17141H == null || SideSheetBehavior.this.f17141H.get() == null) {
                return;
            }
            this.f17162a = i10;
            if (this.f17163b) {
                return;
            }
            H.Y((View) SideSheetBehavior.this.f17141H.get(), this.f17164c);
            this.f17163b = true;
        }
    }

    public SideSheetBehavior() {
        this.f17154v = new d();
        this.f17156x = true;
        this.f17157y = 5;
        this.f17158z = 5;
        this.f17136C = 0.1f;
        this.f17143J = -1;
        this.f17147N = new LinkedHashSet();
        this.f17148O = new a();
    }

    private void A0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void D0(int i10) {
        com.google.android.material.sidesheet.c cVar = this.f17149q;
        if (cVar == null || cVar.j() != i10) {
            if (i10 == 0) {
                this.f17149q = new com.google.android.material.sidesheet.b(this);
                if (this.f17153u == null || s0()) {
                    return;
                }
                l.b bVarV = this.f17153u.v();
                bVarV.E(0.0f).w(0.0f);
                O0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f17149q = new com.google.android.material.sidesheet.a(this);
                if (this.f17153u == null || r0()) {
                    return;
                }
                l.b bVarV2 = this.f17153u.v();
                bVarV2.A(0.0f).s(0.0f);
                O0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void E0(View view, int i10) {
        D0(AbstractC1077i.b(((CoordinatorLayout.f) view.getLayoutParams()).f12133c, i10) == 3 ? 1 : 0);
    }

    private boolean H0() {
        if (this.f17134A != null) {
            return this.f17156x || this.f17157y == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, g.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f17141H.get();
        if (view != null) {
            sideSheetBehavior.L0(view, i10, false);
        }
    }

    private boolean J0(View view) {
        return (view.isShown() || H.l(view) != null) && this.f17156x;
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f17149q.o(marginLayoutParams, p235x4.a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z9) {
        if (!w0(view, i10, z9)) {
            G0(i10);
        } else {
            G0(2);
            this.f17154v.b(i10);
        }
    }

    private void M0() {
        View view;
        WeakReference weakReference = this.f17141H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H.a0(view, 262144);
        H.a0(view, 1048576);
        if (this.f17157y != 5) {
            y0(view, C0.d.a.f559y, 5);
        }
        if (this.f17157y != 3) {
            y0(view, C0.d.a.f557w, 3);
        }
    }

    private void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f17141H;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f17141H.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f17149q.o(marginLayoutParams, (int) ((this.f17137D * view.getScaleX()) + this.f17140G));
        viewF0.requestLayout();
    }

    private void O0(l lVar) {
        h hVar = this.f17151s;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
    }

    private void P0(View view) {
        int i10 = this.f17157y == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, View view) {
        int i11 = this.f17157y;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f17149q.h(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f17149q.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f17157y);
    }

    private float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            return (this.f17149q.m(f10, f11) || this.f17149q.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && com.google.android.material.sidesheet.d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f17149q.e()) ? 3 : 5;
    }

    private void X() {
        WeakReference weakReference = this.f17142I;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f17142I = null;
    }

    private g Y(final int i10) {
        return new g() { // from class: O4.a
            @Override // C0.g
            public final boolean perform(View view, g.a aVar) {
                return SideSheetBehavior.I(this.f5880a, i10, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.f17153u == null) {
            return;
        }
        h hVar = new h(this.f17153u);
        this.f17151s = hVar;
        hVar.K(context);
        ColorStateList colorStateList = this.f17152t;
        if (colorStateList != null) {
            this.f17151s.V(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f17151s.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(View view, int i10) {
        if (this.f17147N.isEmpty()) {
            return;
        }
        this.f17149q.b(i10);
        Iterator it = this.f17147N.iterator();
        if (it.hasNext()) {
            o.a(it.next());
            throw null;
        }
    }

    private void b0(View view) {
        if (H.l(view) == null) {
            H.j0(view, view.getResources().getString(f17132P));
        }
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), BasicMeasure.EXACTLY);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f17149q.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: O4.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f5884a, marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    private int h0() {
        com.google.android.material.sidesheet.c cVar = this.f17149q;
        return (cVar == null || cVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        View view;
        WeakReference weakReference = this.f17141H;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean r0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).rightMargin > 0;
    }

    private boolean t0(MotionEvent motionEvent) {
        return H0() && V((float) this.f17146M, motionEvent.getX()) > ((float) this.f17134A.z());
    }

    private boolean u0(float f10) {
        return this.f17149q.k(f10);
    }

    private boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && H.L(view);
    }

    private boolean w0(View view, int i10, boolean z9) {
        int iL0 = l0(i10);
        I0.c cVarP0 = p0();
        if (cVarP0 == null) {
            return false;
        }
        if (z9) {
            return cVarP0.N(iL0, view.getTop());
        }
        return cVarP0.P(view, iL0, view.getTop());
    }

    private void x0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f17142I != null || (i10 = this.f17143J) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f17142I = new WeakReference(viewFindViewById);
    }

    private void y0(View view, C0.d.a aVar, int i10) {
        H.c0(view, aVar, null, Y(i10));
    }

    private void z0() {
        VelocityTracker velocityTracker = this.f17144K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17144K = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.getSuperState() != null) {
            super.B(coordinatorLayout, view, cVar.getSuperState());
        }
        int i10 = cVar.f17161q;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f17157y = i10;
        this.f17158z = i10;
    }

    public void B0(int i10) {
        this.f17143J = i10;
        X();
        WeakReference weakReference = this.f17141H;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !H.M(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new c(super.C(coordinatorLayout, view), this);
    }

    public void C0(boolean z9) {
        this.f17156x = z9;
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f17141H;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0((View) this.f17141H.get(), new Runnable() { // from class: O4.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f5882q, i10);
                }
            });
        }
    }

    void G0(int i10) {
        View view;
        if (this.f17157y == i10) {
            return;
        }
        this.f17157y = i10;
        if (i10 == 3 || i10 == 5) {
            this.f17158z = i10;
        }
        WeakReference weakReference = this.f17141H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P0(view);
        Iterator it = this.f17147N.iterator();
        if (it.hasNext()) {
            o.a(it.next());
            throw null;
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f17157y == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f17134A.F(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f17144K == null) {
            this.f17144K = VelocityTracker.obtain();
        }
        this.f17144K.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f17135B && t0(motionEvent)) {
            this.f17134A.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f17135B;
    }

    boolean I0(View view, float f10) {
        return this.f17149q.n(view, f10);
    }

    public boolean K0() {
        return true;
    }

    @Override // I4.b
    public void a(p010b.b bVar) {
        I4.e eVar = this.f17145L;
        if (eVar == null) {
            return;
        }
        eVar.l(bVar, h0());
        N0();
    }

    @Override // I4.b
    public void b() {
        I4.e eVar = this.f17145L;
        if (eVar == null) {
            return;
        }
        p010b.b bVarC = eVar.c();
        if (bVarC != null) {
            this.f17145L.h(bVarC, h0(), new b(), e0());
        } else {
            F0(5);
        }
    }

    @Override // I4.b
    public void c(p010b.b bVar) {
        I4.e eVar = this.f17145L;
        if (eVar == null) {
            return;
        }
        eVar.j(bVar);
    }

    @Override // I4.b
    public void d() {
        I4.e eVar = this.f17145L;
        if (eVar == null) {
            return;
        }
        eVar.f();
    }

    int d0() {
        return this.f17137D;
    }

    public View f0() {
        WeakReference weakReference = this.f17142I;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f17149q.d();
    }

    public float i0() {
        return this.f17136C;
    }

    float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f17141H = null;
        this.f17134A = null;
        this.f17145L = null;
    }

    int k0() {
        return this.f17140G;
    }

    int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f17149q.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int m0() {
        return this.f17139F;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f17141H = null;
        this.f17134A = null;
        this.f17145L = null;
    }

    int n0() {
        return this.f17138E;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        I0.c cVar;
        if (!J0(view)) {
            this.f17135B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f17144K == null) {
            this.f17144K = VelocityTracker.obtain();
        }
        this.f17144K.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f17146M = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f17135B) {
            this.f17135B = false;
            return false;
        }
        return (this.f17135B || (cVar = this.f17134A) == null || !cVar.O(motionEvent)) ? false : true;
    }

    int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (H.s(coordinatorLayout) && !H.s(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f17141H == null) {
            this.f17141H = new WeakReference(view);
            this.f17145L = new I4.e(view);
            h hVar = this.f17151s;
            if (hVar != null) {
                H.k0(view, hVar);
                h hVar2 = this.f17151s;
                float fR = this.f17155w;
                if (fR == -1.0f) {
                    fR = H.r(view);
                }
                hVar2.U(fR);
            } else {
                ColorStateList colorStateList = this.f17152t;
                if (colorStateList != null) {
                    H.l0(view, colorStateList);
                }
            }
            P0(view);
            M0();
            if (H.t(view) == 0) {
                H.q0(view, 1);
            }
            b0(view);
        }
        E0(view, i10);
        if (this.f17134A == null) {
            this.f17134A = I0.c.p(coordinatorLayout, this.f17148O);
        }
        int iH = this.f17149q.h(view);
        coordinatorLayout.C(view, i10);
        this.f17138E = coordinatorLayout.getWidth();
        this.f17139F = this.f17149q.i(coordinatorLayout);
        this.f17137D = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f17140G = marginLayoutParams != null ? this.f17149q.a(marginLayoutParams) : 0;
        H.R(view, U(iH, view));
        x0(coordinatorLayout);
        Iterator it = this.f17147N.iterator();
        while (it.hasNext()) {
            o.a(it.next());
        }
        return true;
    }

    I0.c p0() {
        return this.f17134A;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    protected static class c extends H0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final int f17161q;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17161q = parcel.readInt();
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f17161q);
        }

        public c(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f17161q = sideSheetBehavior.f17157y;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17154v = new d();
        this.f17156x = true;
        this.f17157y = 5;
        this.f17158z = 5;
        this.f17136C = 0.1f;
        this.f17143J = -1;
        this.f17147N = new LinkedHashSet();
        this.f17148O = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f29005H5);
        int i10 = k.f29024J5;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f17152t = K4.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(k.f29051M5)) {
            this.f17153u = l.e(context, attributeSet, 0, f17133Q).m();
        }
        int i11 = k.f29042L5;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        Z(context);
        this.f17155w = typedArrayObtainStyledAttributes.getDimension(k.f29015I5, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(k.f29033K5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f17150r = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
