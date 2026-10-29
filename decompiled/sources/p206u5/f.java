package p206u5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Trace;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f27995a;

        a(ViewPager2 viewPager2) {
            this.f27995a = viewPager2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            this.f27995a.endFakeDrag();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            this.f27995a.beginFakeDrag();
        }
    }

    public static final void b(final ViewPager2 viewPager2, long j9, int i10, TimeInterpolator interpolator) {
        int width;
        int paddingEnd;
        int i11;
        n.h(viewPager2, "<this>");
        n.h(interpolator, "interpolator");
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = 0;
            } else {
                width = viewPager2.getHeight() - viewPager2.getPaddingTop();
                paddingEnd = viewPager2.getPaddingBottom();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i11);
            final C c10 = new C();
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u5.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    f.d(c10, viewPager2, valueAnimator);
                }
            });
            valueAnimatorOfInt.addListener(new a(viewPager2));
            valueAnimatorOfInt.setInterpolator(interpolator);
            valueAnimatorOfInt.setDuration(j9);
            valueAnimatorOfInt.start();
        }
        width = viewPager2.getWidth() - viewPager2.getPaddingStart();
        paddingEnd = viewPager2.getPaddingEnd();
        i11 = width - paddingEnd;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i11);
        final C c11 = new C();
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u5.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.d(c11, viewPager2, valueAnimator);
            }
        });
        valueAnimatorOfInt2.addListener(new a(viewPager2));
        valueAnimatorOfInt2.setInterpolator(interpolator);
        valueAnimatorOfInt2.setDuration(j9);
        valueAnimatorOfInt2.start();
    }

    public static /* synthetic */ void c(ViewPager2 viewPager2, long j9, int i10, TimeInterpolator timeInterpolator, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            timeInterpolator = new AccelerateDecelerateInterpolator();
        }
        b(viewPager2, j9, i10, timeInterpolator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C previousValue, ViewPager2 this_scrollToNext, ValueAnimator valueAnimator) {
        n.h(previousValue, "$previousValue");
        n.h(this_scrollToNext, "$this_scrollToNext");
        n.h(valueAnimator, "valueAnimator");
        Trace.beginSection("ViewPager2:fakeDragBy");
        Object animatedValue = valueAnimator.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        this_scrollToNext.fakeDragBy(-(iIntValue - previousValue.f22777q));
        previousValue.f22777q = iIntValue;
        Trace.endSection();
    }
}
