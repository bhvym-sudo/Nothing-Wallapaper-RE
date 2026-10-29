package p223w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.android.launcher3.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ValueAnimator f28571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AnimatorSet f28573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b[] f28574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected float f28575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f28576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f28577g = false;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            j.this.f28577g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f28577g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j.this.f28577g = false;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ValueAnimator f28579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f28580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeInterpolator f28581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f28582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f28583e = d.f28586a;

        b(Animator animator, float f10, t tVar) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            this.f28579a = valueAnimator;
            this.f28580b = tVar;
            this.f28581c = valueAnimator.getInterpolator();
            this.f28582d = animator.getDuration() / f10;
        }

        public void a() {
            this.f28579a.setInterpolator(this.f28581c);
            this.f28583e = d.f28586a;
        }

        public void b(float f10) {
            this.f28579a.setCurrentFraction(this.f28583e.b(f10, this.f28582d));
        }
    }

    private class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f28584b;

        @Override // p223w2.e
        public void a(Animator animator) {
            if (this.f28584b) {
                return;
            }
            j.this.g();
            if (j.this.f28576f != null) {
                j.this.f28576f.run();
            }
            this.f28584b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f28565a = false;
            this.f28584b = false;
        }

        private c() {
            this.f28584b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f28586a = new d() { // from class: w2.k
            @Override // w2.j.d
            public final float b(float f10, float f11) {
                return j.d.a(f10, f11);
            }
        };

        static /* synthetic */ float a(float f10, float f11) {
            if (f10 > f11) {
                return 1.0f;
            }
            return f10 / f11;
        }

        float b(float f10, float f11);
    }

    j(AnimatorSet animatorSet, long j9, ArrayList arrayList) {
        this.f28573c = animatorSet;
        this.f28572b = j9;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28571a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(q.f28598a);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(this);
        animatorSet.addListener(new a());
        this.f28574d = (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static /* synthetic */ void a(BiConsumer biConsumer, Animator animator) {
        Iterator it = j(animator.getListeners()).iterator();
        while (it.hasNext()) {
            biConsumer.accept((Animator.AnimatorListener) it.next(), animator);
        }
    }

    static void c(Animator animator, long j9, t tVar, ArrayList arrayList) {
        long duration = animator.getDuration();
        TimeInterpolator interpolator = animator.getInterpolator();
        if (animator instanceof ValueAnimator) {
            arrayList.add(new b(animator, j9, tVar));
            return;
        }
        if (!(animator instanceof AnimatorSet)) {
            throw new RuntimeException("Unknown animation type " + animator);
        }
        for (Animator animator2 : ((AnimatorSet) animator).getChildAnimations()) {
            if (duration > 0) {
                animator2.setDuration(duration);
            }
            if (interpolator != null) {
                animator2.setInterpolator(interpolator);
            }
            c(animator2, j9, tVar, arrayList);
        }
    }

    private static void d(Animator animator, Consumer consumer) {
        consumer.accept(animator);
        if (animator instanceof AnimatorSet) {
            Iterator it = j(((AnimatorSet) animator).getChildAnimations()).iterator();
            while (it.hasNext()) {
                d((Animator) it.next(), consumer);
            }
        }
    }

    public static void e(Animator animator, final BiConsumer biConsumer) {
        d(animator, new Consumer() { // from class: w2.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j.a(biConsumer, (Animator) obj);
            }
        });
    }

    private static List j(ArrayList arrayList) {
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    protected long f(float f10) {
        long j9 = this.f28572b;
        float f11 = j9 * f10;
        if (f11 <= 0.0f) {
            return 0L;
        }
        return Math.min((long) f11, j9);
    }

    public j g() {
        e(this.f28573c, new BiConsumer() { // from class: w2.h
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Animator.AnimatorListener) obj).onAnimationEnd((Animator) obj2);
            }
        });
        return this;
    }

    public ValueAnimator h() {
        return this.f28571a;
    }

    public float i() {
        return this.f28575e;
    }

    public void k() {
        for (b bVar : this.f28574d) {
            bVar.a();
        }
        this.f28571a.cancel();
    }

    public void l(float f10) {
        this.f28575e = f10;
        if (this.f28577g) {
            return;
        }
        float fA = w.a(f10, 0.0f, 1.0f);
        for (b bVar : this.f28574d) {
            bVar.b(fA);
        }
    }

    public void m() {
        this.f28571a.setFloatValues(this.f28575e, 1.0f);
        this.f28571a.setDuration(f(1.0f - this.f28575e));
        this.f28571a.start();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        l(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
