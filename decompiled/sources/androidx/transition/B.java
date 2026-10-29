package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class B {
    static Animator a(View view, z zVar, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, m mVar) {
        float f14;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) zVar.f14231b.getTag(AbstractC1173h.f14132e);
        if (iArr != null) {
            f10 = (iArr[0] - i10) + translationX;
            f14 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f11;
        }
        view.setTranslationX(f10);
        view.setTranslationY(f14);
        if (f10 == f12 && f14 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f14, f13));
        a aVar = new a(view, zVar.f14231b, translationX, translationY);
        mVar.e(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static class a extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f14041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f14042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f14043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f14044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f14045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f14046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f14047h;

        a(View view, View view2, float f10, float f11) {
            this.f14041b = view;
            this.f14040a = view2;
            this.f14045f = f10;
            this.f14046g = f11;
            int i10 = AbstractC1173h.f14132e;
            int[] iArr = (int[]) view2.getTag(i10);
            this.f14042c = iArr;
            if (iArr != null) {
                view2.setTag(i10, null);
            }
        }

        private void b() {
            if (this.f14042c == null) {
                this.f14042c = new int[2];
            }
            this.f14041b.getLocationOnScreen(this.f14042c);
            this.f14040a.setTag(AbstractC1173h.f14132e, this.f14042c);
        }

        @Override // androidx.transition.m.h
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void c(m mVar) {
            b();
            this.f14043d = this.f14041b.getTranslationX();
            this.f14044e = this.f14041b.getTranslationY();
            this.f14041b.setTranslationX(this.f14045f);
            this.f14041b.setTranslationY(this.f14046g);
        }

        @Override // androidx.transition.m.h
        public void e(m mVar, boolean z9) {
            if (this.f14047h) {
                return;
            }
            this.f14040a.setTag(AbstractC1173h.f14132e, null);
        }

        @Override // androidx.transition.m.h
        public void f(m mVar) {
            e(mVar, false);
        }

        @Override // androidx.transition.m.h
        public void i(m mVar) {
            this.f14047h = true;
            this.f14041b.setTranslationX(this.f14045f);
            this.f14041b.setTranslationY(this.f14046g);
        }

        @Override // androidx.transition.m.h
        public void k(m mVar) {
            this.f14041b.setTranslationX(this.f14043d);
            this.f14041b.setTranslationY(this.f14044e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14047h = true;
            this.f14041b.setTranslationX(this.f14045f);
            this.f14041b.setTranslationY(this.f14046g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (z9) {
                return;
            }
            this.f14041b.setTranslationX(this.f14045f);
            this.f14041b.setTranslationY(this.f14046g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
