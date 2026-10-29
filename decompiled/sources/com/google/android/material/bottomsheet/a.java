package com.google.android.material.bottomsheet;

import N4.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.T;
import androidx.core.view.V;
import com.google.android.material.internal.n;
import p225w4.g;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f16595A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f16596B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f16597C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private f f16598D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f16599E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private I4.c f16600F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private BottomSheetBehavior.g f16601G;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private BottomSheetBehavior f16602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private FrameLayout f16603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CoordinatorLayout f16604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private FrameLayout f16605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f16606z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0457a implements InterfaceC1090w {
        C0457a() {
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            if (a.this.f16598D != null) {
                a.this.f16602v.E0(a.this.f16598D);
            }
            if (v9 != null) {
                a aVar = a.this;
                aVar.f16598D = new f(aVar.f16605y, v9, null);
                a.this.f16598D.e(a.this.getWindow());
                a.this.f16602v.c0(a.this.f16598D);
            }
            return v9;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f16595A && aVar.isShowing() && a.this.s()) {
                a.this.cancel();
            }
        }
    }

    class c extends C1069a {
        c() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            if (!a.this.f16595A) {
                dVar.m0(false);
            } else {
                dVar.a(1048576);
                dVar.m0(true);
            }
        }

        @Override // androidx.core.view.C1069a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f16595A) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    private static class f extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f16612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f16613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Window f16614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16615d;

        /* synthetic */ f(View view, V v9, C0457a c0457a) {
            this(view, v9);
        }

        private void d(View view) {
            if (view.getTop() < this.f16613b.l()) {
                Window window = this.f16614c;
                if (window != null) {
                    Boolean bool = this.f16612a;
                    com.google.android.material.internal.c.f(window, bool == null ? this.f16615d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f16613b.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f16614c;
                if (window2 != null) {
                    com.google.android.material.internal.c.f(window2, this.f16615d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            d(view);
        }

        void e(Window window) {
            if (this.f16614c == window) {
                return;
            }
            this.f16614c = window;
            if (window != null) {
                this.f16615d = T.a(window, window.getDecorView()).b();
            }
        }

        private f(View view, V v9) {
            this.f16613b = v9;
            h hVarT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListV = hVarT0 != null ? hVarT0.v() : H.o(view);
            if (colorStateListV != null) {
                this.f16612a = Boolean.valueOf(D4.a.h(colorStateListV.getDefaultColor()));
                return;
            }
            Integer numD = n.d(view);
            if (numD != null) {
                this.f16612a = Boolean.valueOf(D4.a.h(numD.intValue()));
            } else {
                this.f16612a = null;
            }
        }
    }

    public a(Context context, int i10) {
        super(context, g(context, i10));
        this.f16595A = true;
        this.f16596B = true;
        this.f16601G = new e();
        l(1);
        this.f16599E = getContext().getTheme().obtainStyledAttributes(new int[]{p225w4.a.f28718u}).getBoolean(0, false);
    }

    private static int g(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(p225w4.a.f28698d, typedValue, true) ? typedValue.resourceId : j.f28909f;
    }

    private FrameLayout q() {
        if (this.f16603w == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), g.f28850a, null);
            this.f16603w = frameLayout;
            this.f16604x = (CoordinatorLayout) frameLayout.findViewById(p225w4.e.f28826e);
            FrameLayout frameLayout2 = (FrameLayout) this.f16603w.findViewById(p225w4.e.f28827f);
            this.f16605y = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f16602v = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f16601G);
            this.f16602v.P0(this.f16595A);
            this.f16600F = new I4.c(this.f16602v, this.f16605y);
        }
        return this.f16603w;
    }

    private void u() {
        I4.c cVar = this.f16600F;
        if (cVar == null) {
            return;
        }
        if (this.f16595A) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    private View v(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        q();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16603w.findViewById(p225w4.e.f28826e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f16599E) {
            H.u0(this.f16605y, new C0457a());
        }
        this.f16605y.removeAllViews();
        if (layoutParams == null) {
            this.f16605y.addView(view);
        } else {
            this.f16605y.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(p225w4.e.f28819S).setOnClickListener(new b());
        H.g0(this.f16605y, new c());
        this.f16605y.setOnTouchListener(new d());
        return this.f16603w;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior bottomSheetBehaviorR = r();
        if (!this.f16606z || bottomSheetBehaviorR.u0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorR.X0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z9 = this.f16599E && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f16603w;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z9);
            }
            CoordinatorLayout coordinatorLayout = this.f16604x;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z9);
            }
            T.b(window, !z9);
            f fVar = this.f16598D;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        u();
    }

    @Override // androidx.appcompat.app.k, p010b.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f16598D;
        if (fVar != null) {
            fVar.e(null);
        }
        I4.c cVar = this.f16600F;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // p010b.q, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f16602v;
        if (bottomSheetBehavior == null || bottomSheetBehavior.u0() != 5) {
            return;
        }
        this.f16602v.X0(4);
    }

    public BottomSheetBehavior r() {
        if (this.f16602v == null) {
            q();
        }
        return this.f16602v;
    }

    boolean s() {
        if (!this.f16597C) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f16596B = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f16597C = true;
        }
        return this.f16596B;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z9) {
        super.setCancelable(z9);
        if (this.f16595A != z9) {
            this.f16595A = z9;
            BottomSheetBehavior bottomSheetBehavior = this.f16602v;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.P0(z9);
            }
            if (getWindow() != null) {
                u();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z9) {
        super.setCanceledOnTouchOutside(z9);
        if (z9 && !this.f16595A) {
            this.f16595A = true;
        }
        this.f16596B = z9;
        this.f16597C = true;
    }

    @Override // androidx.appcompat.app.k, p010b.q, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(v(i10, null, null));
    }

    @Override // androidx.appcompat.app.k, p010b.q, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(v(0, view, null));
    }

    @Override // androidx.appcompat.app.k, p010b.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(v(0, view, layoutParams));
    }
}
