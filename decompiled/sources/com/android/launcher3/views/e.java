package com.android.launcher3.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.window.BackEvent;
import com.android.launcher3.AbstractC1219a;
import com.android.launcher3.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import p223w2.j;
import p223w2.q;
import p223w2.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AbstractC1219a implements E2.g.d {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected static final FloatProperty f15718N = new a("translationShift");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Interpolator f15719O = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected float f15720A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected float f15721B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f15722C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f15723D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected c f15724E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected List f15725F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected final p223w2.c f15726G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected boolean f15727H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Drawable f15728I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private View f15729J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f15730K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected final ViewOutlineProvider f15731L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f15732M;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Context f15733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final E2.g f15734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected j f15735t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected ViewGroup f15736u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final View f15737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Interpolator f15738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f15739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f15740y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected float f15741z;

    class a extends FloatProperty {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.f15741z);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(e eVar, float f10) {
            eVar.setTranslationShift(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + e.this.getBottomOffsetPx());
        }
    }

    public interface c {
        void a();
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15741z = 1.0f;
        this.f15725F = new ArrayList();
        this.f15726G = new p223w2.c(new Runnable() { // from class: com.android.launcher3.views.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f15715q.Y();
            }
        }, 1.0f);
        this.f15730K = false;
        this.f15731L = new b();
        this.f15732M = 0.0f;
        this.f15733r = f.y(context);
        this.f15738w = q.f28597H;
        this.f15739x = 400L;
        this.f15734s = new E2.g(context, this, E2.g.f1272v);
        this.f15735t = new r(0L).j();
        int iR = R(context);
        this.f15737v = iR != -1 ? O(context, iR) : null;
    }

    private void Q(Canvas canvas) {
        View view;
        Drawable drawable = this.f15728I;
        if (drawable == null || (view = this.f15729J) == null) {
            return;
        }
        drawable.setBounds(view.getLeft(), this.f15729J.getTop() + ((int) this.f15736u.getTranslationY()), this.f15729J.getRight(), this.f15729J.getBottom() + (this.f15727H ? getBottomOffsetPx() : 0));
        this.f15728I.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(Boolean bool) {
        this.f15734s.d();
        A();
    }

    private j c0(float f10, float f11, long j9) {
        this.f15720A = f10;
        this.f15721B = f11;
        r rVar = new r(j9);
        rVar.b(new Consumer() { // from class: com.android.launcher3.views.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f15717a.V((Boolean) obj);
            }
        });
        rVar.i(this, f15718N, f10, f11, q.f28598a);
        X(rVar);
        j jVarJ = rVar.j();
        this.f15735t = jVarJ;
        return jVarJ;
    }

    protected void M() {
        this.f15726G.e(1.0f).setDuration(200L).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N() {
        if (this.f15737v != null) {
            getPopupContainer().addView(this.f15737v);
        }
        getPopupContainer().addView(this);
    }

    protected View O(Context context, int i10) {
        View view = new View(context);
        view.forceHasOverlappingRendering(false);
        view.setBackgroundColor(i10);
        view.setLayoutParams(new g.c(-1, -1));
        return view;
    }

    protected ValueAnimator P(long j9) {
        a0(j9);
        ValueAnimator valueAnimatorH = this.f15735t.h();
        valueAnimatorH.setInterpolator(getIdleInterpolator());
        return valueAnimatorH;
    }

    protected int R(Context context) {
        return -1;
    }

    protected void S(boolean z9, long j9) {
        ValueAnimator valueAnimatorH;
        if (this.f15492q) {
            Optional.ofNullable(this.f15724E).ifPresent(new com.android.launcher3.views.b());
            if (!z9) {
                this.f15735t.k();
                setTranslationShift(1.0f);
                W();
                return;
            }
            if (this.f15734s.i()) {
                valueAnimatorH = P(j9);
            } else {
                valueAnimatorH = this.f15735t.h();
                valueAnimatorH.setInterpolator(this.f15738w);
                valueAnimatorH.setDuration(this.f15739x);
                this.f15735t.h().setFloatValues(this.f15741z, this.f15740y);
            }
            valueAnimatorH.addListener(p223w2.f.a(new Runnable() { // from class: com.android.launcher3.views.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15716q.W();
                }
            }));
            valueAnimatorH.start();
        }
    }

    protected boolean T(MotionEvent motionEvent) {
        return getPopupContainer().n(this.f15736u, motionEvent);
    }

    protected boolean U() {
        return this.f15492q && this.f15735t.h().isRunning();
    }

    protected void W() {
        this.f15492q = false;
        getPopupContainer().removeView(this);
        if (this.f15737v != null) {
            getPopupContainer().removeView(this.f15737v);
        }
        this.f15725F.forEach(new com.android.launcher3.views.b());
    }

    protected void X(r rVar) {
    }

    protected void Y() {
        com.android.launcher3.j.f15619b.set(this, Float.valueOf(this.f15726G.f28560d));
        setClipChildren(!this.f15727H);
        setClipToPadding(!this.f15727H);
        this.f15736u.setClipChildren(!this.f15727H);
        this.f15736u.setClipToPadding(!this.f15727H);
        invalidate();
    }

    protected void Z(Drawable drawable, View view) {
        this.f15728I = drawable;
        this.f15729J = view;
    }

    protected j a0(long j9) {
        return c0(0.0f, 1.0f, j9);
    }

    protected final j b0() {
        j jVarC0 = c0(1.0f, 0.0f, 400L);
        jVarC0.h().setInterpolator(f15719O);
        return jVarC0;
    }

    protected boolean d0() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Q(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // E2.g.d
    public void f(float f10) {
        if ((!this.f15734s.h(f10) || f10 <= 0.0f) && this.f15741z <= 0.5f) {
            ValueAnimator valueAnimatorH = this.f15735t.h();
            valueAnimatorH.setInterpolator(q.f28604g);
            valueAnimatorH.setFloatValues(this.f15741z, this.f15721B != 0.0f ? 0.0f : 1.0f);
            valueAnimatorH.setDuration(E2.b.b(f10, this.f15741z)).start();
            return;
        }
        this.f15738w = q.h(f10);
        this.f15739x = E2.b.b(f10, 1.0f - this.f15741z);
        this.f15740y = this.f15721B == 0.0f ? 0.0f : 1.0f;
        D(true);
    }

    protected int getBottomOffsetPx() {
        return (int) (getMeasuredHeight() * 0.100000024f);
    }

    protected Interpolator getIdleInterpolator() {
        return f15719O;
    }

    protected g getPopupContainer() {
        return ((f) this.f15733r).J();
    }

    protected float getShiftRange() {
        return this.f15736u.getHeight();
    }

    @Override // F2.w
    public boolean h(MotionEvent motionEvent) {
        if (this.f15730K) {
            if (motionEvent.getAction() == 0) {
                this.f15732M = motionEvent.getY();
            }
            if (motionEvent.getAction() == 1 && this.f15734s.i() && !U() && motionEvent.getY() - this.f15732M == 0.0f) {
                D(true);
            }
        } else {
            this.f15734s.k(motionEvent);
        }
        return true;
    }

    @Override // F2.w
    public boolean k(MotionEvent motionEvent) {
        if (this.f15723D) {
            return false;
        }
        if (!T(motionEvent)) {
            this.f15730K = true;
            return true;
        }
        this.f15730K = false;
        int i10 = this.f15734s.i() ? 2 : 0;
        if (d0()) {
            i10 = 3;
        }
        this.f15734s.v(i10, false);
        this.f15734s.k(motionEvent);
        return this.f15734s.g();
    }

    @Override // E2.g.d
    public void m(boolean z9, float f10) {
        if (this.f15735t.h().isRunning()) {
            this.f15735t.k();
            this.f15722C = this.f15735t.i();
        } else {
            a0(400L);
            this.f15722C = this.f15741z;
        }
    }

    @Override // E2.g.d
    public boolean o(float f10) {
        this.f15735t.l(w.a(this.f15722C + (Math.signum(this.f15721B - this.f15720A) * (f10 / getShiftRange())), 0.0f, 1.0f));
        return true;
    }

    @Override // android.window.OnBackAnimationCallback
    public void onBackCancelled() {
        super.onBackCancelled();
        M();
    }

    @Override // android.window.OnBackAnimationCallback
    public void onBackProgressed(BackEvent backEvent) {
        float progress = backEvent.getProgress();
        float interpolation = q.f28616s.getInterpolation(progress);
        this.f15727H = progress > 0.0f;
        this.f15726G.h(((1.0f - interpolation) * 0.100000024f) + 0.9f);
    }

    public void setOnCloseBeginListener(c cVar) {
        this.f15724E = cVar;
    }

    protected void setTranslationShift(float f10) {
        this.f15741z = f10;
        this.f15736u.setTranslationY(f10 * getShiftRange());
        View view = this.f15737v;
        if (view != null) {
            view.setAlpha(1.0f - this.f15741z);
        }
        invalidate();
    }
}
