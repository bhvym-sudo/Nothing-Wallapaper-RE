package S7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1177l;
import androidx.transition.z;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC1177l {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f7370s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private l f7371t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private l f7372u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private p219v8.a f7373v0;

    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationEnd(animation);
            p219v8.a aVarF0 = c.this.F0();
            if (aVarF0 != null) {
                aVarF0.invoke();
            }
        }
    }

    public c(int i10) {
        super(i10);
        this.f7370s0 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(c cVar, ValueAnimator animation) {
        n.h(animation, "animation");
        l lVar = cVar.f7371t0;
        if (lVar != null) {
            lVar.f(Float.valueOf(animation.getAnimatedFraction()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(c cVar, ValueAnimator animation) {
        n.h(animation, "animation");
        l lVar = cVar.f7372u0;
        if (lVar != null) {
            lVar.f(Float.valueOf(animation.getAnimatedFraction()));
        }
    }

    public final p219v8.a F0() {
        return this.f7373v0;
    }

    public final void I0(l lVar) {
        this.f7371t0 = lVar;
    }

    public final void J0(p219v8.a aVar) {
        this.f7373v0 = aVar;
    }

    public final void K0(l lVar) {
        this.f7372u0 = lVar;
    }

    public final void L0(int i10) {
        this.f7370s0 = i10;
    }

    @Override // androidx.transition.AbstractC1177l, androidx.transition.K
    public Animator x0(ViewGroup sceneRoot, View view, z zVar, z zVar2) {
        n.h(sceneRoot, "sceneRoot");
        n.h(view, "view");
        View viewFindViewById = view.findViewById(this.f7370s0);
        if (viewFindViewById != null) {
            view = viewFindViewById;
        }
        Animator animatorX0 = super.x0(sceneRoot, view, zVar, zVar2);
        if (animatorX0 instanceof ValueAnimator) {
            ((ValueAnimator) animatorX0).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: S7.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c.G0(this.f7368a, valueAnimator);
                }
            });
        }
        return animatorX0;
    }

    @Override // androidx.transition.AbstractC1177l, androidx.transition.K
    public Animator z0(ViewGroup sceneRoot, View view, z zVar, z zVar2) {
        n.h(sceneRoot, "sceneRoot");
        n.h(view, "view");
        View viewFindViewById = view.findViewById(this.f7370s0);
        if (viewFindViewById != null) {
            view = viewFindViewById;
        }
        Animator animatorZ0 = super.z0(sceneRoot, view, zVar, zVar2);
        if (animatorZ0 instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animatorZ0;
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: S7.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    c.H0(this.f7369a, valueAnimator2);
                }
            });
            valueAnimator.addListener(new a());
        }
        return animatorZ0;
    }

    public /* synthetic */ c(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 80 : i10);
    }
}
