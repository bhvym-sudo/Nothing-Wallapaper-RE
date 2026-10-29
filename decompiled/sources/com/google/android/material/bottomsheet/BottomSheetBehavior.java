package com.google.android.material.bottomsheet;

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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import androidx.core.view.V;
import com.google.android.material.internal.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c implements I4.b {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f16513y0 = j.f28912i;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ColorStateList f16514A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f16515B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f16516C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f16517D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f16518E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f16519F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f16520G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f16521H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f16522I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f16523J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f16524K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f16525L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f16526M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f16527N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f16528O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private l f16529P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f16530Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final i f16531R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ValueAnimator f16532S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f16533T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f16534U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f16535V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    float f16536W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f16537X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    float f16538Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    boolean f16539Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f16540a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f16541b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f16542c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    int f16543d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    I0.c f16544e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f16545f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f16546g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f16547h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f16548i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f16549j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    int f16550k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    int f16551l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    WeakReference f16552m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    WeakReference f16553n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    WeakReference f16554o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final ArrayList f16555p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16556q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private VelocityTracker f16557q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16558r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    I4.d f16559r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f16560s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    int f16561s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f16562t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f16563t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f16564u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    boolean f16565u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16566v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private Map f16567v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16568w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    final SparseIntArray f16569w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16570x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final I0.c.AbstractC0101c f16571x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16572y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private N4.h f16573z;

    class a implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f16574q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f16575r;

        a(View view, int i10) {
            this.f16574q = view;
            this.f16575r = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.f1(this.f16574q, this.f16575r, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Y0(5);
            WeakReference weakReference = BottomSheetBehavior.this.f16552m0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.f16552m0.get()).requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f16573z != null) {
                BottomSheetBehavior.this.f16573z.W(fFloatValue);
            }
        }
    }

    class d implements n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16579a;

        d(boolean z9) {
            this.f16579a = z9;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.n.c
        public V a(View view, V v9, n.d dVar) {
            boolean z9;
            p191t0.b bVarF = v9.f(V.k.f());
            p191t0.b bVarF2 = v9.f(V.k.c());
            BottomSheetBehavior.this.f16527N = bVarF.f27863b;
            boolean zG = n.g(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f16519F) {
                BottomSheetBehavior.this.f16526M = v9.i();
                paddingBottom = dVar.f17130d + BottomSheetBehavior.this.f16526M;
            }
            if (BottomSheetBehavior.this.f16520G) {
                paddingLeft = (zG ? dVar.f17129c : dVar.f17127a) + bVarF.f27862a;
            }
            if (BottomSheetBehavior.this.f16521H) {
                paddingRight = (zG ? dVar.f17127a : dVar.f17129c) + bVarF.f27864c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z10 = true;
            if (BottomSheetBehavior.this.f16523J) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = bVarF.f27862a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                z9 = false;
            }
            if (BottomSheetBehavior.this.f16524K) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = bVarF.f27864c;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z9 = true;
                }
            }
            if (BottomSheetBehavior.this.f16525L) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = bVarF.f27863b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z10 = z9;
                }
            } else {
                z10 = z9;
            }
            if (z10) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f16579a) {
                BottomSheetBehavior.this.f16517D = bVarF2.f27865d;
            }
            if (!BottomSheetBehavior.this.f16519F && !this.f16579a) {
                return v9;
            }
            BottomSheetBehavior.this.k1(false);
            return v9;
        }
    }

    class e extends I0.c.AbstractC0101c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f16581a;

        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f16551l0 + bottomSheetBehavior.s0()) / 2;
        }

        @Override // I0.c.AbstractC0101c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // I0.c.AbstractC0101c
        public int b(View view, int i10, int i11) {
            return p221w0.a.b(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // I0.c.AbstractC0101c
        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.f16551l0 : BottomSheetBehavior.this.f16537X;
        }

        @Override // I0.c.AbstractC0101c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f16541b0) {
                BottomSheetBehavior.this.Y0(1);
            }
        }

        @Override // I0.c.AbstractC0101c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // I0.c.AbstractC0101c
        public void l(View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16539Z && bottomSheetBehavior.c1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f16564u) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f16558r || Math.abs(view.getTop() - BottomSheetBehavior.this.s0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f16535V)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f16558r) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f16535V;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f16537X)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.d1()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.f16537X) || BottomSheetBehavior.this.d1()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f16534U) < Math.abs(top - BottomSheetBehavior.this.f16537X)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.f16558r) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f16535V) >= Math.abs(top2 - BottomSheetBehavior.this.f16537X) || BottomSheetBehavior.this.d1()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f16558r) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f16581a;
                if (BottomSheetBehavior.this.d1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.a1(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f16551l0)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f16535V) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.f1(view, i10, bottomSheetBehavior4.e1());
        }

        @Override // I0.c.AbstractC0101c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f16542c0;
            if (i11 == 1 || bottomSheetBehavior.f16565u0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f16561s0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f16554o0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f16581a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f16552m0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements C0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16583a;

        f(int i10) {
            this.f16583a = i10;
        }

        @Override // C0.g
        public boolean perform(View view, C0.g.a aVar) {
            BottomSheetBehavior.this.X0(this.f16583a);
            return true;
        }
    }

    public static abstract class g {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f16556q = 0;
        this.f16558r = true;
        this.f16560s = false;
        this.f16515B = -1;
        this.f16516C = -1;
        this.f16531R = new i(this, null);
        this.f16536W = 0.5f;
        this.f16538Y = -1.0f;
        this.f16541b0 = true;
        this.f16542c0 = 4;
        this.f16543d0 = 4;
        this.f16548i0 = 0.1f;
        this.f16555p0 = new ArrayList();
        this.f16563t0 = -1;
        this.f16569w0 = new SparseIntArray();
        this.f16571x0 = new e();
    }

    private boolean C0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && H.L(view);
    }

    private void F0(View view, C0.d.a aVar, int i10) {
        H.c0(view, aVar, null, l0(i10));
    }

    private void G0() {
        this.f16561s0 = -1;
        this.f16563t0 = -1;
        VelocityTracker velocityTracker = this.f16557q0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16557q0 = null;
        }
    }

    private void H0(h hVar) {
        int i10 = this.f16556q;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f16566v = hVar.f16586r;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f16558r = hVar.f16587s;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f16539Z = hVar.f16588t;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f16540a0 = hVar.f16589u;
        }
    }

    private void I0(View view, Runnable runnable) {
        if (C0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void Z0(View view) {
        boolean z9 = (z0() || this.f16568w) ? false : true;
        if (this.f16519F || this.f16520G || this.f16521H || this.f16523J || this.f16524K || this.f16525L || z9) {
            n.b(view, new d(z9));
        }
    }

    private int b0(View view, int i10, int i11) {
        return H.b(view, view.getResources().getString(i10), l0(i11));
    }

    private boolean b1() {
        if (this.f16544e0 != null) {
            return this.f16541b0 || this.f16542c0 == 1;
        }
        return false;
    }

    private void d0() {
        int iH0 = h0();
        if (this.f16558r) {
            this.f16537X = Math.max(this.f16551l0 - iH0, this.f16534U);
        } else {
            this.f16537X = this.f16551l0 - iH0;
        }
    }

    private float e0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private void f0() {
        this.f16535V = (int) (this.f16551l0 * (1.0f - this.f16536W));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(View view, int i10, boolean z9) {
        int iV0 = v0(i10);
        I0.c cVar = this.f16544e0;
        if (cVar == null || (!z9 ? cVar.P(view, view.getLeft(), iV0) : cVar.N(view.getLeft(), iV0))) {
            Y0(i10);
            return;
        }
        Y0(2);
        i1(i10, true);
        this.f16531R.c(i10);
    }

    private float g0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f16573z == null || (weakReference = this.f16552m0) == null || weakReference.get() == null) {
            return 0.0f;
        }
        View view = (View) this.f16552m0.get();
        if (!x0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f16573z.D(), rootWindowInsets.getRoundedCorner(0)), e0(this.f16573z.E(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void g1() {
        WeakReference weakReference = this.f16552m0;
        if (weakReference != null) {
            h1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f16553n0;
        if (weakReference2 != null) {
            h1((View) weakReference2.get(), 1);
        }
    }

    private int h0() {
        int iMin;
        int i10;
        int i11;
        if (this.f16568w) {
            iMin = Math.min(Math.max(this.f16570x, this.f16551l0 - ((this.f16550k0 * 9) / 16)), this.f16549j0);
            i10 = this.f16526M;
        } else {
            if (!this.f16518E && !this.f16519F && (i11 = this.f16517D) > 0) {
                return Math.max(this.f16566v, i11 + this.f16572y);
            }
            iMin = this.f16566v;
            i10 = this.f16526M;
        }
        return iMin + i10;
    }

    private void h1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.f16558r && this.f16542c0 != 6) {
            this.f16569w0.put(i10, b0(view, p225w4.i.f28878a, 6));
        }
        if (this.f16539Z && B0() && this.f16542c0 != 5) {
            F0(view, C0.d.a.f559y, 5);
        }
        int i11 = this.f16542c0;
        if (i11 == 3) {
            F0(view, C0.d.a.f558x, this.f16558r ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            F0(view, C0.d.a.f557w, this.f16558r ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            F0(view, C0.d.a.f558x, 4);
            F0(view, C0.d.a.f557w, 3);
        }
    }

    private float i0(int i10) {
        float f10;
        float fS0;
        int i11 = this.f16537X;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.f16537X;
            f10 = i12 - i10;
            fS0 = this.f16551l0 - i12;
        } else {
            int i13 = this.f16537X;
            f10 = i13 - i10;
            fS0 = i13 - s0();
        }
        return f10 / fS0;
    }

    private void i1(int i10, boolean z9) {
        boolean zY0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f16530Q == (zY0 = y0()) || this.f16573z == null) {
            return;
        }
        this.f16530Q = zY0;
        if (!z9 || (valueAnimator = this.f16532S) == null) {
            ValueAnimator valueAnimator2 = this.f16532S;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f16532S.cancel();
            }
            this.f16573z.W(this.f16530Q ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f16532S.reverse();
        } else {
            this.f16532S.setFloatValues(this.f16573z.w(), zY0 ? g0() : 1.0f);
            this.f16532S.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        return A0() && B0();
    }

    private void j1(boolean z9) {
        Map map;
        WeakReference weakReference = this.f16552m0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                if (this.f16567v0 != null) {
                    return;
                } else {
                    this.f16567v0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f16552m0.get()) {
                    if (z9) {
                        this.f16567v0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f16560s) {
                            H.q0(childAt, 4);
                        }
                    } else if (this.f16560s && (map = this.f16567v0) != null && map.containsKey(childAt)) {
                        H.q0(childAt, ((Integer) this.f16567v0.get(childAt)).intValue());
                    }
                }
            }
            if (!z9) {
                this.f16567v0 = null;
            } else if (this.f16560s) {
                ((View) this.f16552m0.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        H.a0(view, 524288);
        H.a0(view, 262144);
        H.a0(view, 1048576);
        int i11 = this.f16569w0.get(i10, -1);
        if (i11 != -1) {
            H.a0(view, i11);
            this.f16569w0.delete(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1(boolean z9) {
        View view;
        if (this.f16552m0 != null) {
            d0();
            if (this.f16542c0 != 4 || (view = (View) this.f16552m0.get()) == null) {
                return;
            }
            if (z9) {
                X0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private C0.g l0(int i10) {
        return new f(i10);
    }

    private void m0(Context context) {
        if (this.f16529P == null) {
            return;
        }
        N4.h hVar = new N4.h(this.f16529P);
        this.f16573z = hVar;
        hVar.K(context);
        ColorStateList colorStateList = this.f16514A;
        if (colorStateList != null) {
            this.f16573z.V(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f16573z.setTint(typedValue.data);
    }

    private void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.f16532S = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f16532S.addUpdateListener(new c());
    }

    public static BottomSheetBehavior q0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) layoutParams).e();
        if (cVarE instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarE;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int r0(int i10, int i11, int i12, int i13) {
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

    private int v0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.f16537X;
        }
        if (i10 == 5) {
            return this.f16551l0;
        }
        if (i10 == 6) {
            return this.f16535V;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float w0() {
        VelocityTracker velocityTracker = this.f16557q0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f16562t);
        return this.f16557q0.getYVelocity(this.f16561s0);
    }

    private boolean x0() {
        WeakReference weakReference = this.f16552m0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f16552m0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean y0() {
        if (this.f16542c0 == 3) {
            return this.f16528O || x0();
        }
        return false;
    }

    public boolean A0() {
        return this.f16539Z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, view, hVar.getSuperState());
        H0(hVar);
        int i10 = hVar.f16585q;
        if (i10 == 1 || i10 == 2) {
            this.f16542c0 = 4;
            this.f16543d0 = 4;
        } else {
            this.f16542c0 = i10;
            this.f16543d0 = i10;
        }
    }

    public boolean B0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new h(super.C(coordinatorLayout, view), this);
    }

    public boolean D0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f16546g0 = 0;
        this.f16547h0 = false;
        return (i10 & 2) != 0;
    }

    public void E0(g gVar) {
        this.f16555p0.remove(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void G(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        WeakReference weakReference;
        int i11 = 3;
        if (view.getTop() == s0()) {
            Y0(3);
            return;
        }
        if (!D0() || ((weakReference = this.f16554o0) != null && view2 == weakReference.get() && this.f16547h0)) {
            if (this.f16546g0 > 0) {
                if (!this.f16558r && view.getTop() > this.f16535V) {
                    i11 = 6;
                }
            } else if (this.f16539Z && c1(view, w0())) {
                i11 = 5;
            } else if (this.f16546g0 == 0) {
                int top = view.getTop();
                if (!this.f16558r) {
                    int i12 = this.f16535V;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f16537X)) {
                            if (d1()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.f16537X)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.f16534U) >= Math.abs(top - this.f16537X)) {
                    i11 = 4;
                }
            } else {
                if (!this.f16558r) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f16535V) < Math.abs(top2 - this.f16537X)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            f1(view, i11, false);
            this.f16547h0 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f16542c0 == 1 && actionMasked == 0) {
            return true;
        }
        if (b1()) {
            this.f16544e0.F(motionEvent);
        }
        if (actionMasked == 0) {
            G0();
        }
        if (this.f16557q0 == null) {
            this.f16557q0 = VelocityTracker.obtain();
        }
        this.f16557q0.addMovement(motionEvent);
        if (b1() && actionMasked == 2 && !this.f16545f0 && Math.abs(this.f16563t0 - motionEvent.getY()) > this.f16544e0.z()) {
            this.f16544e0.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f16545f0;
    }

    public void J0(g gVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f16555p0.clear();
        if (gVar != null) {
            this.f16555p0.add(gVar);
        }
    }

    public void K0(boolean z9) {
        this.f16541b0 = z9;
    }

    public void L0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f16533T = i10;
        i1(this.f16542c0, true);
    }

    public void M0(boolean z9) {
        if (this.f16558r == z9) {
            return;
        }
        this.f16558r = z9;
        if (this.f16552m0 != null) {
            d0();
        }
        Y0((this.f16558r && this.f16542c0 == 6) ? 3 : this.f16542c0);
        i1(this.f16542c0, true);
        g1();
    }

    public void N0(boolean z9) {
        this.f16518E = z9;
    }

    public void O0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f16536W = f10;
        if (this.f16552m0 != null) {
            f0();
        }
    }

    public void P0(boolean z9) {
        if (this.f16539Z != z9) {
            this.f16539Z = z9;
            if (!z9 && this.f16542c0 == 5) {
                X0(4);
            }
            g1();
        }
    }

    public void Q0(int i10) {
        this.f16516C = i10;
    }

    public void R0(int i10) {
        this.f16515B = i10;
    }

    public void S0(int i10) {
        T0(i10, false);
    }

    public final void T0(int i10, boolean z9) {
        if (i10 == -1) {
            if (this.f16568w) {
                return;
            } else {
                this.f16568w = true;
            }
        } else {
            if (!this.f16568w && this.f16566v == i10) {
                return;
            }
            this.f16568w = false;
            this.f16566v = Math.max(0, i10);
        }
        k1(z9);
    }

    public void U0(int i10) {
        this.f16556q = i10;
    }

    public void V0(int i10) {
        this.f16564u = i10;
    }

    public void W0(boolean z9) {
        this.f16540a0 = z9;
    }

    public void X0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f16539Z && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f16558r && v0(i10) <= this.f16534U) ? 3 : i10;
        WeakReference weakReference = this.f16552m0;
        if (weakReference == null || weakReference.get() == null) {
            Y0(i10);
        } else {
            View view = (View) this.f16552m0.get();
            I0(view, new a(view, i11));
        }
    }

    void Y0(int i10) {
        View view;
        if (this.f16542c0 == i10) {
            return;
        }
        this.f16542c0 = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f16539Z && i10 == 5)) {
            this.f16543d0 = i10;
        }
        WeakReference weakReference = this.f16552m0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            j1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            j1(false);
        }
        i1(i10, true);
        for (int i11 = 0; i11 < this.f16555p0.size(); i11++) {
            ((g) this.f16555p0.get(i11)).c(view, i10);
        }
        g1();
    }

    @Override // I4.b
    public void a(p010b.b bVar) {
        I4.d dVar = this.f16559r0;
        if (dVar == null) {
            return;
        }
        dVar.l(bVar);
    }

    public boolean a1(long j9, float f10) {
        return false;
    }

    @Override // I4.b
    public void b() {
        I4.d dVar = this.f16559r0;
        if (dVar == null) {
            return;
        }
        p010b.b bVarC = dVar.c();
        if (bVarC == null) {
            X0(this.f16539Z ? 5 : 4);
        } else if (this.f16539Z) {
            this.f16559r0.h(bVarC, new b());
        } else {
            this.f16559r0.i(bVarC, null);
            X0(4);
        }
    }

    @Override // I4.b
    public void c(p010b.b bVar) {
        I4.d dVar = this.f16559r0;
        if (dVar == null) {
            return;
        }
        dVar.j(bVar);
    }

    public void c0(g gVar) {
        if (this.f16555p0.contains(gVar)) {
            return;
        }
        this.f16555p0.add(gVar);
    }

    boolean c1(View view, float f10) {
        if (this.f16540a0) {
            return true;
        }
        if (B0() && view.getTop() >= this.f16537X) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f16548i0)) - ((float) this.f16537X)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    @Override // I4.b
    public void d() {
        I4.d dVar = this.f16559r0;
        if (dVar == null) {
            return;
        }
        dVar.f();
    }

    public boolean d1() {
        return false;
    }

    public boolean e1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f16552m0 = null;
        this.f16544e0 = null;
        this.f16559r0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f16552m0 = null;
        this.f16544e0 = null;
        this.f16559r0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        I0.c cVar;
        if (!view.isShown() || !this.f16541b0) {
            this.f16545f0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            G0();
        }
        if (this.f16557q0 == null) {
            this.f16557q0 = VelocityTracker.obtain();
        }
        this.f16557q0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.f16563t0 = (int) motionEvent.getY();
            if (this.f16542c0 != 2) {
                WeakReference weakReference = this.f16554o0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.v(view2, x9, this.f16563t0)) {
                    this.f16561s0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f16565u0 = true;
                }
            }
            this.f16545f0 = this.f16561s0 == -1 && !coordinatorLayout.v(view, x9, this.f16563t0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16565u0 = false;
            this.f16561s0 = -1;
            if (this.f16545f0) {
                this.f16545f0 = false;
                return false;
            }
        }
        if (!this.f16545f0 && (cVar = this.f16544e0) != null && cVar.O(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f16554o0;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f16545f0 || this.f16542c0 == 1 || coordinatorLayout.v(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f16544e0 == null || (i10 = this.f16563t0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f16544e0.z())) ? false : true;
    }

    void o0(int i10) {
        View view = (View) this.f16552m0.get();
        if (view == null || this.f16555p0.isEmpty()) {
            return;
        }
        float fI0 = i0(i10);
        for (int i11 = 0; i11 < this.f16555p0.size(); i11++) {
            ((g) this.f16555p0.get(i11)).b(view, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (H.s(coordinatorLayout) && !H.s(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f16552m0 == null) {
            this.f16570x = coordinatorLayout.getResources().getDimensionPixelSize(p225w4.c.f28758b);
            Z0(view);
            H.B0(view, new com.google.android.material.bottomsheet.b(view));
            this.f16552m0 = new WeakReference(view);
            this.f16559r0 = new I4.d(view);
            N4.h hVar = this.f16573z;
            if (hVar != null) {
                H.k0(view, hVar);
                N4.h hVar2 = this.f16573z;
                float fR = this.f16538Y;
                if (fR == -1.0f) {
                    fR = H.r(view);
                }
                hVar2.U(fR);
            } else {
                ColorStateList colorStateList = this.f16514A;
                if (colorStateList != null) {
                    H.l0(view, colorStateList);
                }
            }
            g1();
            if (H.t(view) == 0) {
                H.q0(view, 1);
            }
        }
        if (this.f16544e0 == null) {
            this.f16544e0 = I0.c.p(coordinatorLayout, this.f16571x0);
        }
        int top = view.getTop();
        coordinatorLayout.C(view, i10);
        this.f16550k0 = coordinatorLayout.getWidth();
        this.f16551l0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f16549j0 = height;
        int iMin = this.f16551l0;
        int i11 = iMin - height;
        int i12 = this.f16527N;
        if (i11 < i12) {
            if (this.f16522I) {
                int i13 = this.f16516C;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f16549j0 = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f16516C;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f16549j0 = iMin2;
            }
        }
        this.f16534U = Math.max(0, this.f16551l0 - this.f16549j0);
        f0();
        d0();
        int i15 = this.f16542c0;
        if (i15 == 3) {
            H.S(view, s0());
        } else if (i15 == 6) {
            H.S(view, this.f16535V);
        } else if (this.f16539Z && i15 == 5) {
            H.S(view, this.f16551l0);
        } else if (i15 == 4) {
            H.S(view, this.f16537X);
        } else if (i15 == 1 || i15 == 2) {
            H.S(view, top - view.getTop());
        }
        i1(this.f16542c0, false);
        this.f16554o0 = new WeakReference(p0(view));
        for (int i16 = 0; i16 < this.f16555p0.size(); i16++) {
            ((g) this.f16555p0.get(i16)).a(view);
        }
        return true;
    }

    View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (H.N(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewP0 = p0(viewGroup.getChildAt(i10));
                if (viewP0 != null) {
                    return viewP0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f16515B, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f16516C, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return D0() && (weakReference = this.f16554o0) != null && view2 == weakReference.get() && (this.f16542c0 != 3 || super.s(coordinatorLayout, view, view2, f10, f11));
    }

    public int s0() {
        if (this.f16558r) {
            return this.f16534U;
        }
        return Math.max(this.f16533T, this.f16522I ? 0 : this.f16527N);
    }

    N4.h t0() {
        return this.f16573z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f16554o0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!D0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    H.S(view, -iS0);
                    Y0(3);
                } else {
                    if (!this.f16541b0) {
                        return;
                    }
                    iArr[1] = i11;
                    H.S(view, -i11);
                    Y0(1);
                }
            } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                if (i13 > this.f16537X && !j0()) {
                    int i14 = top - this.f16537X;
                    iArr[1] = i14;
                    H.S(view, -i14);
                    Y0(4);
                } else {
                    if (!this.f16541b0) {
                        return;
                    }
                    iArr[1] = i11;
                    H.S(view, -i11);
                    Y0(1);
                }
            }
            o0(view.getTop());
            this.f16546g0 = i11;
            this.f16547h0 = true;
        }
    }

    public int u0() {
        return this.f16542c0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean z0() {
        return this.f16518E;
    }

    private class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f16592c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f16591b = false;
                I0.c cVar = BottomSheetBehavior.this.f16544e0;
                if (cVar != null && cVar.n(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f16590a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16542c0 == 2) {
                    bottomSheetBehavior.Y0(iVar2.f16590a);
                }
            }
        }

        private i() {
            this.f16592c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f16552m0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f16590a = i10;
            if (this.f16591b) {
                return;
            }
            H.Y((View) BottomSheetBehavior.this.f16552m0.get(), this.f16592c);
            this.f16591b = true;
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class h extends H0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final int f16585q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f16586r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f16587s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f16588t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f16589u;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16585q = parcel.readInt();
            this.f16586r = parcel.readInt();
            this.f16587s = parcel.readInt() == 1;
            this.f16588t = parcel.readInt() == 1;
            this.f16589u = parcel.readInt() == 1;
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16585q);
            parcel.writeInt(this.f16586r);
            parcel.writeInt(this.f16587s ? 1 : 0);
            parcel.writeInt(this.f16588t ? 1 : 0);
            parcel.writeInt(this.f16589u ? 1 : 0);
        }

        public h(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f16585q = bottomSheetBehavior.f16542c0;
            this.f16586r = bottomSheetBehavior.f16566v;
            this.f16587s = bottomSheetBehavior.f16558r;
            this.f16588t = bottomSheetBehavior.f16539Z;
            this.f16589u = bottomSheetBehavior.f16540a0;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f16556q = 0;
        this.f16558r = true;
        this.f16560s = false;
        this.f16515B = -1;
        this.f16516C = -1;
        this.f16531R = new i(this, null);
        this.f16536W = 0.5f;
        this.f16538Y = -1.0f;
        this.f16541b0 = true;
        this.f16542c0 = 4;
        this.f16543d0 = 4;
        this.f16548i0 = 0.1f;
        this.f16555p0 = new ArrayList();
        this.f16563t0 = -1;
        this.f16569w0 = new SparseIntArray();
        this.f16571x0 = new e();
        this.f16572y = context.getResources().getDimensionPixelSize(p225w4.c.f28759b0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f29272k0);
        int i11 = k.f29312o0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f16514A = K4.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(k.f28990G0)) {
            this.f16529P = l.e(context, attributeSet, p225w4.a.f28700e, f16513y0).m();
        }
        m0(context);
        n0();
        this.f16538Y = typedArrayObtainStyledAttributes.getDimension(k.f29302n0, -1.0f);
        int i12 = k.f29282l0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = k.f29292m0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = k.f29372u0;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            S0(i10);
        } else {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        P0(typedArrayObtainStyledAttributes.getBoolean(k.f29362t0, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(k.f29412y0, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(k.f29342r0, true));
        W0(typedArrayObtainStyledAttributes.getBoolean(k.f29402x0, false));
        K0(typedArrayObtainStyledAttributes.getBoolean(k.f29322p0, true));
        U0(typedArrayObtainStyledAttributes.getInt(k.f29382v0, 0));
        O0(typedArrayObtainStyledAttributes.getFloat(k.f29352s0, 0.5f));
        int i15 = k.f29332q0;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            L0(typedValuePeekValue2.data);
        } else {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        V0(typedArrayObtainStyledAttributes.getInt(k.f29392w0, 500));
        this.f16519F = typedArrayObtainStyledAttributes.getBoolean(k.f28950C0, false);
        this.f16520G = typedArrayObtainStyledAttributes.getBoolean(k.f28960D0, false);
        this.f16521H = typedArrayObtainStyledAttributes.getBoolean(k.f28970E0, false);
        this.f16522I = typedArrayObtainStyledAttributes.getBoolean(k.f28980F0, true);
        this.f16523J = typedArrayObtainStyledAttributes.getBoolean(k.f29422z0, false);
        this.f16524K = typedArrayObtainStyledAttributes.getBoolean(k.f28930A0, false);
        this.f16525L = typedArrayObtainStyledAttributes.getBoolean(k.f28940B0, false);
        this.f16528O = typedArrayObtainStyledAttributes.getBoolean(k.f29000H0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f16562t = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
