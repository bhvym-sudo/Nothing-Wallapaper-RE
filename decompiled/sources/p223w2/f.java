package p223w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f28566a;

        a(Runnable runnable) {
            this.f28566a = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28566a.run();
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Consumer f28567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28568b = false;

        b(Consumer consumer) {
            this.f28567a = consumer;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f28568b) {
                return;
            }
            this.f28568b = true;
            this.f28567a.accept(Boolean.FALSE);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f28568b) {
                return;
            }
            boolean z9 = true;
            this.f28568b = true;
            Consumer consumer = this.f28567a;
            if ((animator instanceof ValueAnimator) && ((ValueAnimator) animator).getAnimatedFraction() <= 0.5f) {
                z9 = false;
            }
            consumer.accept(Boolean.valueOf(z9));
        }
    }

    private static class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f28569b;

        @Override // p223w2.e
        public void a(Animator animator) {
            this.f28569b.run();
        }

        private c(Runnable runnable) {
            this.f28569b = runnable;
        }
    }

    public static Animator.AnimatorListener a(Runnable runnable) {
        return new a(runnable);
    }

    public static Animator.AnimatorListener b(Consumer consumer) {
        return new b(consumer);
    }

    public static Animator.AnimatorListener c(Runnable runnable) {
        return new c(runnable);
    }
}
