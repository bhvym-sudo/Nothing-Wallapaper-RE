package com.android.launcher3.dragndrop;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import com.android.launcher3.j;
import com.android.launcher3.r;
import com.android.launcher3.v;
import com.android.launcher3.views.g;
import com.android.launcher3.w;
import p223w2.f;
import p223w2.q;
import p223w2.t;
import p253z2.h;

/* JADX INFO: loaded from: classes.dex */
public class DragLayer extends g {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final boolean f15501B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private a f15502C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Animator f15503D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private h f15504E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f15505F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f15506G;

    public DragLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
        this.f15503D = null;
        this.f15504E = null;
        this.f15506G = -1;
        setMotionEventSplittingEnabled(false);
        setChildrenDrawingOrderEnabled(true);
        this.f15501B = w.g(getResources());
    }

    private void C() {
        this.f15505F = -1;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10) instanceof h) {
                this.f15505F = i10;
            }
        }
        this.f15506G = childCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f15503D = null;
    }

    public void A(h hVar, Animator animator, int i10) {
        Animator animator2 = this.f15503D;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f15504E = hVar;
        this.f15503D = animator;
        animator.addListener(f.a(new Runnable() { // from class: z2.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f30651q.z();
            }
        }));
        if (i10 == 0) {
            this.f15503D.addListener(f.a(new Runnable() { // from class: z2.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30652q.x();
                }
            }));
        }
        this.f15503D.start();
    }

    public void B() {
        this.f15752x = this.f15750v.x();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f15502C.n(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.android.launcher3.views.g, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.offsetLocation(getTranslationX(), 0.0f);
        try {
            return super.dispatchTouchEvent(motionEvent);
        } finally {
            motionEvent.offsetLocation(-getTranslationX(), 0.0f);
        }
    }

    public View getAnimatedView() {
        return this.f15504E;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f15506G != i10) {
            C();
        }
        int i12 = this.f15505F;
        if (i12 != -1) {
            if (i11 == i10 - 1) {
                return i12;
            }
            if (i11 >= i12) {
                return i11 + 1;
            }
        }
        return i11;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        C();
    }

    public void setup(a aVar) {
        this.f15502C = aVar;
        B();
    }

    public void t(h hVar, Rect rect, float f10, float f11, float f12, int i10, Interpolator interpolator, Runnable runnable, int i11, final View view) {
        int iMax;
        hVar.h();
        hVar.requestLayout();
        int[] iArrK = k(hVar);
        float fHypot = (float) Math.hypot(rect.left - iArrK[0], rect.top - iArrK[1]);
        Resources resources = getResources();
        float integer = resources.getInteger(r.f15692d);
        if (i10 < 0) {
            int integer2 = resources.getInteger(r.f15693e);
            if (fHypot < integer) {
                integer2 = (int) (integer2 * q.f28605h.getInterpolation(fHypot / integer));
            }
            iMax = Math.max(integer2, resources.getInteger(r.f15694f));
        } else {
            iMax = i10;
        }
        Interpolator interpolator2 = interpolator == null ? q.f28605h : interpolator;
        p223w2.r rVar = new p223w2.r(iMax);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hVar, (Property<h, Float>) View.SCALE_X, f11);
        t tVar = t.f28628d;
        rVar.g(objectAnimatorOfFloat, interpolator2, tVar);
        rVar.g(ObjectAnimator.ofFloat(hVar, (Property<h, Float>) View.SCALE_Y, f12), interpolator2, tVar);
        rVar.f(hVar, f10, interpolator2);
        rVar.e(hVar, j.f15625h, rect.top, interpolator2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(hVar, j.f15624g, rect.left);
        if (view != null) {
            final int scrollX = view.getScrollX();
            objectAnimatorOfFloat2.setEvaluator(new TypeEvaluator() { // from class: z2.a
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f13, Object obj, Object obj2) {
                    View view2 = view;
                    return Float.valueOf(w.i(f13, ((Float) obj).floatValue(), ((Float) obj2).floatValue()) + (view2.getScaleX() * (scrollX - view2.getScrollX())));
                }
            });
        }
        rVar.g(objectAnimatorOfFloat2, interpolator2, tVar);
        if (runnable != null) {
            rVar.c(f.a(runnable));
        }
        A(hVar, rVar.d(), i11);
    }

    public void u(h hVar, int i10, int i11, float f10, float f11, float f12, Runnable runnable, int i12, int i13, View view) {
        t(hVar, new Rect(i10, i11, hVar.getMeasuredWidth() + i10, hVar.getMeasuredHeight() + i11), f10, f11, f12, i13, null, runnable, i12, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v(h hVar, final View view, int i10, View view2) {
        float f10;
        v vVar = (v) view.getParent();
        p233x2.b bVar = (p233x2.b) view.getLayoutParams();
        vVar.d(view);
        vVar.c(view);
        float scaleX = view.getScaleX();
        float f11 = 1.0f - scaleX;
        float[] fArr = {bVar.f29766j + ((view.getMeasuredWidth() * f11) / 2.0f), bVar.f29767k + ((view.getMeasuredHeight() * f11) / 2.0f)};
        float f12 = f((View) view.getParent(), fArr) * scaleX;
        int iRound = Math.round(fArr[0]);
        int iRound2 = Math.round(fArr[1]);
        if (view instanceof p253z2.j) {
            Rect rect = new Rect();
            ((p253z2.j) view).d(rect);
            float fWidth = ((rect.width() * 1.0f) / (hVar.getMeasuredWidth() - hVar.getBlurSizeOutline())) * f12;
            float f13 = 1.0f - fWidth;
            float measuredWidth = (hVar.getMeasuredWidth() * f13) / 2.0f;
            float measuredHeight = (hVar.getMeasuredHeight() * f13) / 2.0f;
            iRound = (int) (iRound + (((rect.left * f12) - ((hVar.getBlurSizeOutline() * fWidth) / 2.0f)) - measuredWidth));
            iRound2 = (int) (iRound2 + (((f12 * rect.top) - ((hVar.getBlurSizeOutline() * fWidth) / 2.0f)) - measuredHeight));
            f10 = fWidth;
        } else {
            f10 = f12;
        }
        int i11 = iRound;
        int i12 = iRound2;
        view.setVisibility(4);
        u(hVar, i11, i12, 1.0f, f10, f10, new Runnable() { // from class: z2.d
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(0);
            }
        }, 0, i10, view2);
    }

    public void w(h hVar, int[] iArr, float f10, float f11, float f12, int i10, Runnable runnable, int i11) {
        u(hVar, iArr[0], iArr[1], f10, f11, f12, runnable, i10, i11, null);
    }

    public h x() {
        Animator animator = this.f15503D;
        if (animator != null) {
            animator.cancel();
        }
        this.f15503D = null;
        h hVar = this.f15504E;
        if (hVar != null) {
            this.f15502C.z(hVar);
        }
        h hVar2 = this.f15504E;
        this.f15504E = null;
        invalidate();
        return hVar2;
    }

    public boolean y() {
        return this.f15504E == null || this.f15503D == null;
    }
}
