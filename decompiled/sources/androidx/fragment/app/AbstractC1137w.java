package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1137w {
    private static int a(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, boolean z9, boolean z10) {
        if (z10) {
            return z9 ? abstractComponentCallbacksC1132q.getPopEnterAnim() : abstractComponentCallbacksC1132q.getPopExitAnim();
        }
        return z9 ? abstractComponentCallbacksC1132q.getEnterAnim() : abstractComponentCallbacksC1132q.getExitAnim();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    static a b(Context context, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, boolean z9, boolean z10) {
        Animator animatorLoadAnimator;
        int nextTransition = abstractComponentCallbacksC1132q.getNextTransition();
        int iA = a(abstractComponentCallbacksC1132q, z9, z10);
        abstractComponentCallbacksC1132q.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC1132q.mContainer;
        if (viewGroup != null) {
            int i10 = T0.b.f7403c;
            if (viewGroup.getTag(i10) != null) {
                abstractComponentCallbacksC1132q.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC1132q.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = abstractComponentCallbacksC1132q.onCreateAnimation(nextTransition, z9, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = abstractComponentCallbacksC1132q.onCreateAnimator(nextTransition, z9, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z9);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (zEquals) {
                            throw e11;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z9) {
        if (i10 == 4097) {
            return z9 ? T0.a.f7399e : T0.a.f7400f;
        }
        if (i10 == 8194) {
            return z9 ? T0.a.f7395a : T0.a.f7396b;
        }
        if (i10 == 8197) {
            return z9 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z9 ? T0.a.f7397c : T0.a.f7398d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z9 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.w$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f13246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f13247b;

        a(Animation animation) {
            this.f13246a = animation;
            this.f13247b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f13246a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f13247b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.w$b */
    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final ViewGroup f13248q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final View f13249r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f13250s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f13251t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f13252u;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f13252u = true;
            this.f13248q = viewGroup;
            this.f13249r = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j9, Transformation transformation) {
            this.f13252u = true;
            if (this.f13250s) {
                return !this.f13251t;
            }
            if (!super.getTransformation(j9, transformation)) {
                this.f13250s = true;
                androidx.core.view.y.a(this.f13248q, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13250s || !this.f13252u) {
                this.f13248q.endViewTransition(this.f13249r);
                this.f13251t = true;
            } else {
                this.f13252u = false;
                this.f13248q.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j9, Transformation transformation, float f10) {
            this.f13252u = true;
            if (this.f13250s) {
                return !this.f13251t;
            }
            if (!super.getTransformation(j9, transformation, f10)) {
                this.f13250s = true;
                androidx.core.view.y.a(this.f13248q, this);
            }
            return true;
        }
    }
}
