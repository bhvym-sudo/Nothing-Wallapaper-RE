package p223w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f28554a;

    public a(View view) {
        this.f28554a = view;
    }

    public static void a(View view) {
        b(view, 4);
    }

    public static void b(View view, int i10) {
        if (view.getAlpha() < 0.01f && view.getVisibility() != i10) {
            view.setVisibility(i10);
            return;
        }
        if (view.getAlpha() <= 0.01f || view.getVisibility() == 0) {
            return;
        }
        if (!(view instanceof ViewGroup)) {
            view.setVisibility(0);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int descendantFocusability = viewGroup.getDescendantFocusability();
        viewGroup.setDescendantFocusability(393216);
        viewGroup.setVisibility(0);
        viewGroup.setDescendantFocusability(descendantFocusability);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        a(this.f28554a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f28554a.setVisibility(0);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        a(this.f28554a);
    }
}
