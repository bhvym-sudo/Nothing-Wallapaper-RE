package I4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class d extends I4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f3051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f3052h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f3040b.setTranslationY(0.0f);
            d.this.k(0.0f);
        }
    }

    public d(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f3051g = resources.getDimension(p225w4.c.f28772i);
        this.f3052h = resources.getDimension(p225w4.c.f28774j);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f3040b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f3040b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f3040b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new W0.b());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f3043e);
        animatorG.start();
    }

    public void h(p010b.b bVar, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3040b, (Property<View, Float>) View.TRANSLATION_Y, this.f3040b.getHeight() * this.f3040b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new W0.b());
        objectAnimatorOfFloat.setDuration(p235x4.a.c(this.f3041c, this.f3042d, bVar.a()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void i(p010b.b bVar, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(p235x4.a.c(this.f3041c, this.f3042d, bVar.a()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(p010b.b bVar) {
        super.d(bVar);
    }

    public void k(float f10) {
        float fA = a(f10);
        float width = this.f3040b.getWidth();
        float height = this.f3040b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f3051g / width;
        float f12 = this.f3052h / height;
        float fA2 = 1.0f - p235x4.a.a(0.0f, f11, fA);
        float fA3 = 1.0f - p235x4.a.a(0.0f, f12, fA);
        this.f3040b.setScaleX(fA2);
        this.f3040b.setPivotY(height);
        this.f3040b.setScaleY(fA3);
        View view = this.f3040b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA3 != 0.0f ? fA2 / fA3 : 1.0f);
            }
        }
    }

    public void l(p010b.b bVar) {
        if (super.e(bVar) == null) {
            return;
        }
        k(bVar.a());
    }
}
