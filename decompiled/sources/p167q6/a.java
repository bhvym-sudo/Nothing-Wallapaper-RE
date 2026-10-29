package p167q6;

import A3.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: q6.a$a, reason: collision with other inner class name */
    public static final class C0637a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25090b;

        C0637a(View view, boolean z9) {
            this.f25089a = view;
            this.f25090b = z9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationEnd(animation);
            if (this.f25090b) {
                return;
            }
            this.f25089a.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation, boolean z9) {
            n.h(animation, "animation");
            super.onAnimationStart(animation, z9);
            this.f25089a.setVisibility(0);
        }
    }

    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f25092b;

        b(View view, p219v8.a aVar) {
            this.f25091a = view;
            this.f25092b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationEnd(animation);
            this.f25091a.setVisibility(0);
            p219v8.a aVar = this.f25092b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f25094b;

        c(View view, p219v8.a aVar) {
            this.f25093a = view;
            this.f25094b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationEnd(animation);
            this.f25093a.setVisibility(4);
            p219v8.a aVar = this.f25094b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final void a(View view, boolean z9, float f10, float f11, boolean z10, boolean z11) {
        n.h(view, "view");
        ObjectAnimator objectAnimatorOfFloat = z9 ? ObjectAnimator.ofFloat(view, "scaleX", f11, f10) : ObjectAnimator.ofFloat(view, "scaleX", f10, f11);
        ObjectAnimator objectAnimatorOfFloat2 = z9 ? ObjectAnimator.ofFloat(view, "scaleY", f11, f10) : ObjectAnimator.ofFloat(view, "scaleY", f10, f11);
        objectAnimatorOfFloat.addListener(new C0637a(view, z11));
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat2.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        if (z10) {
            ObjectAnimator objectAnimatorOfFloat3 = z9 ? ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(200L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        } else {
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        animatorSet.start();
    }

    public static /* synthetic */ void b(View view, boolean z9, float f10, float f11, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 32) != 0) {
            z11 = true;
        }
        a(view, z9, f10, f11, z12, z11);
    }

    public static final void c(View view, boolean z9, p219v8.a aVar) {
        ObjectAnimator objectAnimatorOfFloat;
        n.h(view, "view");
        if (z9) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.addListener(new b(view, aVar));
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.addListener(new c(view, aVar));
        }
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.start();
    }

    public static final void d(View borderView, View contentView, boolean z9) {
        n.h(borderView, "borderView");
        n.h(contentView, "contentView");
        int dimensionPixelSize = borderView.getContext().getResources().getDimensionPixelSize(R.dimen.nt_option_item_border_size);
        int dimensionPixelSize2 = contentView.getContext().getResources().getDimensionPixelSize(R.dimen.nt_option_item_bg_size);
        float f10 = (dimensionPixelSize2 - dimensionPixelSize) / dimensionPixelSize2;
        if (z9) {
            borderView.setAlpha(1.0f);
            f.f167a.p(contentView, f10);
        } else {
            borderView.setAlpha(0.0f);
            f.f167a.p(contentView, 1.0f);
        }
    }
}
