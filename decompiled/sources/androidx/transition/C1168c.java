package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1168c extends K {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f14108b = false;

        a(View view) {
            this.f14107a = view;
        }

        @Override // androidx.transition.m.h
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void c(m mVar) {
            this.f14107a.setTag(AbstractC1173h.f14131d, Float.valueOf(this.f14107a.getVisibility() == 0 ? E.b(this.f14107a) : 0.0f));
        }

        @Override // androidx.transition.m.h
        public void f(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void i(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void j(m mVar, boolean z9) {
        }

        @Override // androidx.transition.m.h
        public void k(m mVar) {
            this.f14107a.setTag(AbstractC1173h.f14131d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            E.e(this.f14107a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14107a.hasOverlappingRendering() && this.f14107a.getLayerType() == 0) {
                this.f14108b = true;
                this.f14107a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (this.f14108b) {
                this.f14107a.setLayerType(0, null);
            }
            if (z9) {
                return;
            }
            E.e(this.f14107a, 1.0f);
            E.a(this.f14107a);
        }
    }

    public C1168c(int i10) {
        B0(i10);
    }

    private Animator C0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        E.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) E.f14052b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        I().e(aVar);
        return objectAnimatorOfFloat;
    }

    private static float D0(z zVar, float f10) {
        Float f11;
        return (zVar == null || (f11 = (Float) zVar.f14230a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.m
    public boolean T() {
        return true;
    }

    @Override // androidx.transition.K, androidx.transition.m
    public void p(z zVar) {
        super.p(zVar);
        Float fValueOf = (Float) zVar.f14231b.getTag(AbstractC1173h.f14131d);
        if (fValueOf == null) {
            fValueOf = zVar.f14231b.getVisibility() == 0 ? Float.valueOf(E.b(zVar.f14231b)) : Float.valueOf(0.0f);
        }
        zVar.f14230a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.K
    public Animator x0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        E.c(view);
        return C0(view, D0(zVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.K
    public Animator z0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        E.c(view);
        Animator animatorC0 = C0(view, D0(zVar, 1.0f), 0.0f);
        if (animatorC0 == null) {
            E.e(view, D0(zVar2, 1.0f));
        }
        return animatorC0;
    }

    public C1168c() {
    }
}
