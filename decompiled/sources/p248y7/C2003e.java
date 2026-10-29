package p248y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.android.launcher3.f;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p219v8.l;
import p219v8.p;

/* JADX INFO: renamed from: y7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2003e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30406c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Interpolator f30407d = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30409b;

    /* JADX INFO: renamed from: y7.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: y7.e$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30410a;

        static {
            int[] iArr = new int[N1.a.values().length];
            try {
                iArr[N1.a.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30410a = iArr;
        }
    }

    /* JADX INFO: renamed from: y7.e$c */
    public static final class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f30411a;

        public c(p219v8.a aVar) {
            this.f30411a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30411a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: y7.e$d */
    public static final class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f30412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f30413b;

        d(p219v8.a aVar, p219v8.a aVar2) {
            this.f30412a = aVar;
            this.f30413b = aVar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            this.f30413b.invoke();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            this.f30412a.invoke();
        }
    }

    /* JADX INFO: renamed from: y7.e$e, reason: collision with other inner class name */
    public static final class C0752e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.a f30414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f30415b;

        public C0752e(p219v8.a aVar, p219v8.a aVar2) {
            this.f30414a = aVar;
            this.f30415b = aVar2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f30414a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f30415b.invoke();
        }
    }

    public C2003e(f deviceProfile) {
        n.h(deviceProfile, "deviceProfile");
        this.f30408a = deviceProfile.f15578o;
        this.f30409b = deviceProfile.f15577n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p pVar, A7.a aVar, ValueAnimator it) {
        n.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (aVar != A7.a.LEFT) {
            fFloatValue = 1 - fFloatValue;
        }
        pVar.invoke(Float.valueOf(fFloatValue), Float.valueOf(it.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l lVar, ValueAnimator anim) {
        n.h(anim, "anim");
        lVar.f(Float.valueOf(anim.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l lVar, ValueAnimator anim) {
        n.h(anim, "anim");
        lVar.f(Float.valueOf(anim.getAnimatedFraction()));
    }

    private final ValueAnimator j() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(f30407d);
        n.g(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(p pVar, ValueAnimator it) {
        n.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        pVar.invoke((Integer) animatedValue, Float.valueOf(it.getAnimatedFraction()));
    }

    public final Animator e(final A7.a aVar, p219v8.a onEnd, final p update) {
        n.h(onEnd, "onEnd");
        n.h(update, "update");
        ValueAnimator valueAnimatorJ = j();
        valueAnimatorJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2003e.f(update, aVar, valueAnimator);
            }
        });
        valueAnimatorJ.addListener(new c(onEnd));
        return valueAnimatorJ;
    }

    public final Animator g(p219v8.a onExitStart, p219v8.a onExitEnd, final l onExitUpdate, final l onEnterUpdate) {
        n.h(onExitStart, "onExitStart");
        n.h(onExitEnd, "onExitEnd");
        n.h(onExitUpdate, "onExitUpdate");
        n.h(onEnterUpdate, "onEnterUpdate");
        ValueAnimator valueAnimatorJ = j();
        valueAnimatorJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2003e.h(onExitUpdate, valueAnimator);
            }
        });
        valueAnimatorJ.addListener(new d(onExitStart, onExitEnd));
        ValueAnimator valueAnimatorJ2 = j();
        valueAnimatorJ2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2003e.i(onEnterUpdate, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorJ, valueAnimatorJ2);
        return animatorSet;
    }

    public final AnimatorSet k() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(f30407d);
        return animatorSet;
    }

    public final Animator l(N1.a size, p219v8.a onStart, p219v8.a onEnd, final p update) {
        n.h(size, "size");
        n.h(onStart, "onStart");
        n.h(onEnd, "onEnd");
        n.h(update, "update");
        o oVar = b.f30410a[size.ordinal()] == 1 ? new o(Integer.valueOf(this.f30408a), Integer.valueOf(this.f30409b)) : new o(Integer.valueOf(this.f30409b), Integer.valueOf(this.f30408a));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((Number) oVar.a()).intValue(), ((Number) oVar.b()).intValue());
        valueAnimatorOfInt.setInterpolator(f30407d);
        valueAnimatorOfInt.setDuration(150L);
        n.e(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new C0752e(onEnd, onStart));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2003e.m(update, valueAnimator);
            }
        });
        return valueAnimatorOfInt;
    }
}
