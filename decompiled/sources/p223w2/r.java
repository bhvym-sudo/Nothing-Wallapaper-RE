package p223w2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.FloatProperty;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class r extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f28624e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f28625f;

    public r(long j9) {
        this.f28625f = j9;
    }

    @Override // p223w2.d
    public void a(Animator animator) {
        h(animator, t.f28628d);
    }

    @Override // p223w2.d
    public AnimatorSet d() {
        if (this.f28624e.isEmpty()) {
            a(ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f28625f));
        }
        return super.d();
    }

    public void g(Animator animator, TimeInterpolator timeInterpolator, t tVar) {
        animator.setInterpolator(timeInterpolator);
        h(animator, tVar);
    }

    public void h(Animator animator, t tVar) {
        this.f28563c.play(animator.setDuration(this.f28625f));
        j.c(animator, this.f28625f, tVar, this.f28624e);
    }

    public void i(Object obj, FloatProperty floatProperty, float f10, float f11, TimeInterpolator timeInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, floatProperty, f10, f11);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        a(objectAnimatorOfFloat);
    }

    public j j() {
        return new j(d(), this.f28625f, this.f28624e);
    }
}
