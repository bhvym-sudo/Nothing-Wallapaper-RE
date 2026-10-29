package p223w2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.FloatProperty;
import android.util.Property;
import android.view.View;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AnimatorSet f28563c = new AnimatorSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ValueAnimator f28564d;

    public abstract void a(Animator animator);

    public void b(Consumer consumer) {
        if (this.f28564d == null) {
            this.f28564d = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        this.f28564d.addListener(f.b(consumer));
    }

    public void c(Animator.AnimatorListener animatorListener) {
        this.f28563c.addListener(animatorListener);
    }

    public AnimatorSet d() {
        ValueAnimator valueAnimator = this.f28564d;
        if (valueAnimator != null) {
            a(valueAnimator);
            this.f28564d = null;
        }
        return this.f28563c;
    }

    public Animator e(Object obj, FloatProperty floatProperty, float f10, TimeInterpolator timeInterpolator) {
        if (((Float) floatProperty.get(obj)).floatValue() == f10) {
            return s.f28627b;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, floatProperty, f10);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        a(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    public Animator f(View view, float f10, TimeInterpolator timeInterpolator) {
        if (view == null) {
            return s.f28627b;
        }
        if (Float.compare(view.getAlpha(), f10) == 0) {
            a.a(view);
            return s.f28627b;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f10);
        objectAnimatorOfFloat.addListener(new a(view));
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        a(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }
}
