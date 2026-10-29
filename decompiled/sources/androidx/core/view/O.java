package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f12206a;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f12207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f12208b;

        a(P p9, View view) {
            this.f12207a = p9;
            this.f12208b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12207a.a(this.f12208b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12207a.b(this.f12208b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f12207a.c(this.f12208b);
        }
    }

    O(View view) {
        this.f12206a = new WeakReference(view);
    }

    private void h(View view, P p9) {
        if (p9 != null) {
            view.animate().setListener(new a(p9, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public O b(float f10) {
        View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f12206a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public O e(long j9) {
        View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().setDuration(j9);
        }
        return this;
    }

    public O f(Interpolator interpolator) {
        View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public O g(P p9) {
        View view = (View) this.f12206a.get();
        if (view != null) {
            h(view, p9);
        }
        return this;
    }

    public O i(long j9) {
        View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().setStartDelay(j9);
        }
        return this;
    }

    public O j(final S s9) {
        final View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().setUpdateListener(s9 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.N
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    s9.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public O l(float f10) {
        View view = (View) this.f12206a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
