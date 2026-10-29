package p137n6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.n;
import p087i6.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f23279a;

        a(ViewPager2 viewPager2) {
            this.f23279a = viewPager2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            n.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            this.f23279a.endFakeDrag();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            n.h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            this.f23279a.beginFakeDrag();
        }
    }

    private static final int b(Context context, Resources resources, int i10) {
        return (int) (((resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density) - q.c(context, i10)) / 2);
    }

    public static final Animator c(final ViewPager2 viewPager2, int i10, long j9, TimeInterpolator interpolator, int i11, int i12) {
        n.h(viewPager2, "<this>");
        n.h(interpolator, "interpolator");
        final boolean z9 = viewPager2.getLayoutDirection() == 1;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (i12 + i11) * (i10 - viewPager2.getCurrentItem()));
        final C c10 = new C();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n6.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.e(c10, viewPager2, z9, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new a(viewPager2));
        valueAnimatorOfInt.setInterpolator(interpolator);
        valueAnimatorOfInt.setDuration(j9);
        valueAnimatorOfInt.start();
        n.e(valueAnimatorOfInt);
        return valueAnimatorOfInt;
    }

    public static /* synthetic */ Animator d(ViewPager2 viewPager2, int i10, long j9, TimeInterpolator timeInterpolator, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j9 = 400;
        }
        long j10 = j9;
        if ((i13 & 4) != 0) {
            timeInterpolator = p212v1.d.f28122k;
        }
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        if ((i13 & 8) != 0) {
            i11 = viewPager2.getWidth();
        }
        int i14 = i11;
        if ((i13 & 16) != 0) {
            i12 = 0;
        }
        return c(viewPager2, i10, j10, timeInterpolator2, i14, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C c10, ViewPager2 viewPager2, boolean z9, ValueAnimator valueAnimator) {
        n.h(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        float f10 = iIntValue - c10.f22777q;
        if (!z9) {
            f10 = -f10;
        }
        viewPager2.fakeDragBy(f10);
        c10.f22777q = iIntValue;
    }

    public static final void f(ViewPager2 viewPager2, Resources resource, int i10, int i11, int i12, FragmentStateAdapter adapter) {
        n.h(viewPager2, "<this>");
        n.h(resource, "resource");
        n.h(adapter, "adapter");
        viewPager2.setOffscreenPageLimit(i12);
        viewPager2.setAdapter(adapter);
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            Context context = viewPager2.getContext();
            n.g(context, "getContext(...)");
            int iB = b(context, resource, i10);
            recyclerView.setPaddingRelative(iB, 0, iB, 0);
            recyclerView.setClipToPadding(false);
            recyclerView.setOverScrollMode(2);
        }
        viewPager2.setPageTransformer(new MarginPageTransformer(viewPager2.getResources().getDimensionPixelSize(i11)));
    }
}
