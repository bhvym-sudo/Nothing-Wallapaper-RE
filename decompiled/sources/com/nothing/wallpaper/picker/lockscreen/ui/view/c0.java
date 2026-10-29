package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c0 extends com.android.launcher3.views.e {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final a f19086b0 = new a(null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Interpolator f19087c0 = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final com.android.launcher3.f f19088P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final float f19089Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final float f19090R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Animator f19091S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f19092T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Interpolator f19093U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f19094V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private View f19095W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f19096a0;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Interpolator a() {
            return c0.f19087c0;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        com.android.launcher3.f fVarK = ((com.android.launcher3.views.f) this.f15733r).K();
        this.f19088P = fVarK;
        float f10 = 1;
        float f11 = fVarK.f15551T;
        this.f19089Q = f10 - f11;
        this.f19090R = f10 - (f11 / 2);
        this.f19094V = 400L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(c0 c0Var) {
        c0Var.f15734s.d();
    }

    private final void m0(float f10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, com.android.launcher3.views.e.f15718N, this.f15741z, 0.0f);
        objectAnimatorOfFloat.setDuration(E2.b.b(f10, Math.abs(0.0f - this.f15741z)));
        objectAnimatorOfFloat.setInterpolator(p223w2.q.f28604g);
        objectAnimatorOfFloat.addListener(p223w2.f.c(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.a0
            @Override // java.lang.Runnable
            public final void run() {
                c0.n0(this.f19080q);
            }
        }));
        objectAnimatorOfFloat.start();
        this.f19091S = objectAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(c0 c0Var) {
        c0Var.f15734s.d();
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected void I(boolean z9) {
        if (this.f15492q) {
            com.android.launcher3.views.e.c cVar = this.f15724E;
            if (cVar != null) {
                cVar.a();
            }
            if (!z9) {
                Animator animator = this.f19091S;
                if (animator != null) {
                    if (!animator.isRunning()) {
                        animator = null;
                    }
                    if (animator != null) {
                        animator.cancel();
                    }
                }
                setTranslationShift(1.0f);
                W();
                return;
            }
            p079h8.o oVarA = this.f15734s.i() ? p079h8.v.a(400L, f19087c0) : p079h8.v.a(Long.valueOf(this.f19094V), this.f19093U);
            long jLongValue = ((Number) oVarA.a()).longValue();
            Interpolator interpolator = (Interpolator) oVarA.b();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, com.android.launcher3.views.e.f15718N, this.f15741z, 1.0f);
            objectAnimatorOfFloat.setDuration(jLongValue);
            objectAnimatorOfFloat.setInterpolator(interpolator);
            objectAnimatorOfFloat.addListener(p223w2.f.a(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.Y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19077q.W();
                }
            }));
            objectAnimatorOfFloat.start();
            this.f19091S = objectAnimatorOfFloat;
        }
    }

    @Override // com.android.launcher3.views.e
    protected boolean U() {
        Animator animator;
        return this.f15492q && (animator = this.f19091S) != null && animator.isRunning();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // com.android.launcher3.views.e, E2.g.d
    public void f(float f10) {
        boolean z9;
        boolean zH = this.f15734s.h(f10);
        boolean z10 = f10 < 0.0f;
        if (zH) {
            z9 = false;
        } else {
            float f11 = this.f19089Q / 2;
            float f12 = this.f19090R;
            float f13 = this.f15741z;
            if (f11 > f13 || f13 > f12) {
                z9 = false;
            } else {
                z9 = true;
            }
        }
        boolean z11 = zH && ((z10 && this.f15741z >= this.f19089Q) || (!z10 && this.f15741z < this.f19089Q));
        boolean z12 = (zH && z10 && this.f15741z < this.f19089Q) || this.f15741z < this.f19089Q / ((float) 2);
        this.f19093U = null;
        if (z9 || z11) {
            k0(f10);
        } else {
            if (z12) {
                m0(f10);
                return;
            }
            this.f19093U = p223w2.q.h(f10);
            this.f19094V = E2.b.b(f10, Math.abs(1.0f - this.f15741z));
            D(true);
        }
    }

    protected final View getCurPageView() {
        return this.f19095W;
    }

    protected final Animator getOpenCloseAnimation() {
        return this.f19091S;
    }

    @Override // com.android.launcher3.views.e, F2.w
    public boolean h(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        if (this.f19096a0) {
            return true;
        }
        return super.h(ev);
    }

    protected final void j0(boolean z9) {
        this.f15721B = 0.0f;
        this.f15720A = 1.0f;
        if (!z9) {
            setTranslationShift(this.f19089Q);
            post(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.Z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19078q.A();
                }
            });
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, com.android.launcher3.views.e.f15718N, 1.0f, this.f19089Q);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(f19087c0);
        objectAnimatorOfFloat.start();
        this.f19091S = objectAnimatorOfFloat;
    }

    @Override // com.android.launcher3.views.e, F2.w
    public boolean k(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        if ((this.f19095W instanceof WidgetPickerGroupPage) && this.f15741z >= this.f19089Q && ev.getActionMasked() == 2 && this.f15734s.e()) {
            this.f19096a0 = true;
            return true;
        }
        if (U() && ev.getActionMasked() == 2 && this.f15734s.c(ev)) {
            this.f19096a0 = true;
            return true;
        }
        this.f19096a0 = false;
        return super.k(ev);
    }

    protected final void k0(float f10) {
        float f11 = this.f15741z;
        float f12 = this.f19089Q;
        if (f11 == f12) {
            this.f15734s.d();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, com.android.launcher3.views.e.f15718N, f11, f12);
        objectAnimatorOfFloat.setDuration(E2.b.b(f10, Math.abs(this.f19089Q - this.f15741z)));
        objectAnimatorOfFloat.setInterpolator(p223w2.q.f28604g);
        objectAnimatorOfFloat.addListener(p223w2.f.c(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.l0(this.f19083q);
            }
        }));
        objectAnimatorOfFloat.start();
        this.f19091S = objectAnimatorOfFloat;
    }

    @Override // com.android.launcher3.views.e, E2.g.d
    public void m(boolean z9, float f10) {
        Animator animator = this.f19091S;
        if (animator != null) {
            if (!animator.isRunning()) {
                animator = null;
            }
            if (animator != null) {
                animator.cancel();
            }
        }
        this.f19092T = this.f15741z;
    }

    @Override // com.android.launcher3.views.e, E2.g.d
    public boolean o(float f10) {
        setTranslationShift(Math.max(0.0f, Math.min(this.f19092T - (Math.signum(this.f15721B - this.f15720A) * (f10 / getShiftRange())), 1.0f)));
        return true;
    }

    protected final void setCurPageView(View view) {
        this.f19095W = view;
    }

    protected final void setOpenCloseAnimation(Animator animator) {
        this.f19091S = animator;
    }
}
