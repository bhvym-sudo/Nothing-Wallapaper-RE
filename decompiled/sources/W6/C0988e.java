package W6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.nothing.wallpaper.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: renamed from: W6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0988e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f8769j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f8770k = 600;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f8771l = 800;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f8772m = 4000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f8776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ObjectAnimator f8777e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p219v8.a f8780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8781i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f8773a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f8774b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f8775c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PathInterpolator f8778f = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PathInterpolator f8779g = new PathInterpolator(0.4f, 0.0f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: W6.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: W6.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f8782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Animation f8783b;

        public b(boolean z9, Animation animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            this.f8782a = z9;
            this.f8783b = animation;
        }

        public final Animation a() {
            return this.f8783b;
        }

        public final boolean b() {
            return this.f8782a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8782a == bVar.f8782a && kotlin.jvm.internal.n.d(this.f8783b, bVar.f8783b);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f8782a) * 31) + this.f8783b.hashCode();
        }

        public String toString() {
            return "ViewAnimation(visible=" + this.f8782a + ", animation=" + this.f8783b + ")";
        }
    }

    /* JADX INFO: renamed from: W6.e$c */
    public static final class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f8786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f8787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p219v8.a f8788e;

        c(View view, AlphaAnimation alphaAnimation, AlphaAnimation alphaAnimation2, p219v8.a aVar) {
            this.f8785b = view;
            this.f8786c = alphaAnimation;
            this.f8787d = alphaAnimation2;
            this.f8788e = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f8787d.getStartTime() != Long.MIN_VALUE) {
                this.f8785b.setVisibility(4);
                p219v8.a aVar = this.f8788e;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            C0988e.this.f8773a.remove(this.f8785b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C0988e.this.f8773a.put(this.f8785b, new b(false, this.f8786c));
        }
    }

    /* JADX INFO: renamed from: W6.e$d */
    public static final class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Animation f8791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f8793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f8794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f8795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ View f8796h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f8797i;

        d(View view, Animation animation, boolean z9, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, View view2, View view3, int i10) {
            this.f8790b = view;
            this.f8791c = animation;
            this.f8792d = z9;
            this.f8793e = lottieAnimationView;
            this.f8794f = lottieAnimationView2;
            this.f8795g = view2;
            this.f8796h = view3;
            this.f8797i = i10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            p219v8.a aVarR;
            C0988e.this.f8775c.remove(this.f8790b);
            if (this.f8792d && (aVarR = C0988e.this.r()) != null && ((Boolean) aVarR.invoke()).booleanValue()) {
                C0988e.this.D(this.f8793e, this.f8794f, true);
                C0988e.this.t(this.f8795g, this.f8796h, this.f8797i);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C0988e.this.f8775c.put(this.f8790b, this.f8791c);
        }
    }

    /* JADX INFO: renamed from: W6.e$e, reason: collision with other inner class name */
    public static final class C0308e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8800c;

        C0308e(View view, View view2) {
            this.f8799b = view;
            this.f8800c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            C0988e.this.w(this.f8799b, this.f8800c);
        }
    }

    /* JADX INFO: renamed from: W6.e$f */
    public static final class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f8801a;

        f(LottieAnimationView lottieAnimationView) {
            this.f8801a = lottieAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            this.f8801a.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: W6.e$g */
    public static final class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f8804c;

        g(View view, ValueAnimator valueAnimator) {
            this.f8803b = view;
            this.f8804c = valueAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            super.onAnimationCancel(animation);
            C0988e.this.f8774b.remove(this.f8803b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            super.onAnimationEnd(animation);
            C0988e.this.f8774b.remove(this.f8803b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            C0988e.this.f8774b.put(this.f8803b, this.f8804c);
        }
    }

    /* JADX INFO: renamed from: W6.e$h */
    public static final class h implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0988e f8806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f8807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f8808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p219v8.a f8809e;

        h(View view, C0988e c0988e, AlphaAnimation alphaAnimation, AlphaAnimation alphaAnimation2, p219v8.a aVar) {
            this.f8805a = view;
            this.f8806b = c0988e;
            this.f8807c = alphaAnimation;
            this.f8808d = alphaAnimation2;
            this.f8809e = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            p219v8.a aVar;
            if (this.f8808d.getStartTime() != Long.MIN_VALUE && (aVar = this.f8809e) != null) {
                aVar.invoke();
            }
            this.f8806b.f8773a.remove(this.f8805a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f8805a.setVisibility(0);
            this.f8806b.f8773a.put(this.f8805a, new b(true, this.f8807c));
        }
    }

    /* JADX INFO: renamed from: W6.e$i */
    public static final class i implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Animation f8812c;

        i(View view, Animation animation) {
            this.f8811b = view;
            this.f8812c = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0988e.this.f8775c.remove(this.f8811b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C0988e.this.f8775c.put(this.f8811b, this.f8812c);
        }
    }

    private final void E(final View view, p219v8.a aVar) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(f8770k);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setAnimationListener(new h(view, this, alphaAnimation, alphaAnimation, aVar));
        view.post(new Runnable() { // from class: W6.b
            @Override // java.lang.Runnable
            public final void run() {
                C0988e.F(view, alphaAnimation);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(View view, AlphaAnimation alphaAnimation) {
        view.startAnimation(alphaAnimation);
    }

    private final void j(View view, boolean z9, Animation animation) {
        b bVar;
        if (!animation.hasStarted() || (bVar = (b) this.f8773a.get(view)) == null || z9 == bVar.b()) {
            return;
        }
        animation.cancel();
    }

    private final void k(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.removeAllUpdateListeners();
        if (lottieAnimationView.isAnimating()) {
            lottieAnimationView.cancelAnimation();
        }
        lottieAnimationView2.removeAllAnimatorListeners();
        lottieAnimationView2.removeAllUpdateListeners();
        if (lottieAnimationView2.isAnimating()) {
            lottieAnimationView2.cancelAnimation();
        }
    }

    private final void m() {
        Collection collectionValues = this.f8775c.values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = AbstractC1444s.o0(collectionValues, collectionValues.size()).iterator();
        while (it.hasNext()) {
            ((Animation) it.next()).cancel();
        }
        this.f8775c.clear();
    }

    private final void n() {
        Collection collectionValues = this.f8774b.values();
        kotlin.jvm.internal.n.g(collectionValues, "<get-values>(...)");
        Iterator it = AbstractC1444s.o0(collectionValues, collectionValues.size()).iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        this.f8774b.clear();
    }

    private final void p(final View view, p219v8.a aVar) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(f8770k);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setAnimationListener(new c(view, alphaAnimation, alphaAnimation, aVar));
        view.post(new Runnable() { // from class: W6.c
            @Override // java.lang.Runnable
            public final void run() {
                C0988e.q(view, alphaAnimation);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(View view, AlphaAnimation alphaAnimation) {
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(View view, View view2, float f10) {
        l();
        float f11 = -f10;
        float f12 = view.getTranslationY() > 0.0f ? f11 : f10;
        if (view2.getTranslationY() >= 0.0f) {
            f10 = f11;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), f12);
        this.f8776d = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setInterpolator(this.f8779g);
            objectAnimatorOfFloat.setDuration(f8772m);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), f10);
        this.f8777e = objectAnimatorOfFloat2;
        if (objectAnimatorOfFloat2 != null) {
            objectAnimatorOfFloat2.setInterpolator(this.f8779g);
            objectAnimatorOfFloat2.setDuration(f8772m);
            objectAnimatorOfFloat2.setRepeatMode(2);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.addListener(new C0308e(view, view2));
        }
        ObjectAnimator objectAnimator = this.f8777e;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        ObjectAnimator objectAnimator2 = this.f8776d;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    private final void u(LottieAnimationView lottieAnimationView, final LottieAnimationView lottieAnimationView2) {
        lottieAnimationView2.addAnimatorListener(new f(lottieAnimationView));
        lottieAnimationView.playAnimation();
        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: W6.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0988e.v(lottieAnimationView2, valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(LottieAnimationView lottieAnimationView, ValueAnimator it) {
        kotlin.jvm.internal.n.h(it, "it");
        if (it.getAnimatedFraction() >= 0.99d) {
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.playAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(View view, ValueAnimator animation) {
        kotlin.jvm.internal.n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        view.setRenderEffect(RenderEffect.createBlurEffect(fFloatValue, fFloatValue, Shader.TileMode.CLAMP));
    }

    public final void A(p219v8.a aVar) {
        this.f8780h = aVar;
    }

    public final void B(View view, boolean z9, boolean z10, boolean z11, p219v8.a aVar) {
        C(view, z9, z10, z11, true, aVar);
    }

    public final void C(View view, boolean z9, boolean z10, boolean z11, boolean z12, p219v8.a aVar) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        int i10 = z9 ? 0 : 4;
        b bVar = (b) this.f8773a.get(view);
        Animation animationA = bVar != null ? bVar.a() : null;
        if (view.getVisibility() == i10 && z12) {
            if (animationA != null) {
                j(view, z9, animationA);
                return;
            }
            return;
        }
        if (animationA != null) {
            j(view, z9, animationA);
        }
        if (z9) {
            if (z10) {
                E(view, aVar);
                return;
            } else {
                view.setVisibility(0);
                return;
            }
        }
        if (z10) {
            p(view, aVar);
        } else {
            view.setVisibility(4);
        }
    }

    public final void D(LottieAnimationView lavProcessing, LottieAnimationView lavProcessingLoop, boolean z9) {
        kotlin.jvm.internal.n.h(lavProcessing, "lavProcessing");
        kotlin.jvm.internal.n.h(lavProcessingLoop, "lavProcessingLoop");
        lavProcessing.setVisibility(z9 ? 0 : 4);
        lavProcessingLoop.setVisibility(4);
        if (z9) {
            u(lavProcessing, lavProcessingLoop);
        } else {
            k(lavProcessing, lavProcessingLoop);
        }
    }

    public final void G(ImageView ivSelectedFrame, boolean z9) {
        kotlin.jvm.internal.n.h(ivSelectedFrame, "ivSelectedFrame");
        if (this.f8781i != z9) {
            Drawable drawable = ivSelectedFrame.getDrawable();
            kotlin.jvm.internal.n.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
            TransitionDrawable transitionDrawable = (TransitionDrawable) drawable;
            if (z9) {
                transitionDrawable.startTransition((int) f8771l);
            } else {
                transitionDrawable.reverseTransition((int) f8771l);
            }
            this.f8781i = z9;
        }
    }

    public final void H(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.anim_unselected_prompt);
        animationLoadAnimation.setAnimationListener(new i(view, animationLoadAnimation));
        view.startAnimation(animationLoadAnimation);
    }

    public final void i() {
        n();
        m();
        l();
        this.f8776d = null;
        this.f8777e = null;
    }

    public final void l() {
        ObjectAnimator objectAnimator = this.f8776d;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f8777e;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            objectAnimator2.cancel();
        }
    }

    public final void o() {
        this.f8773a.clear();
    }

    public final p219v8.a r() {
        return this.f8780h;
    }

    public final void s(View layoutSubject, View layoutStyle, LottieAnimationView lavProcessing, LottieAnimationView lavProcessingLoop, View imgPromptView, int i10, boolean z9) {
        kotlin.jvm.internal.n.h(layoutSubject, "layoutSubject");
        kotlin.jvm.internal.n.h(layoutStyle, "layoutStyle");
        kotlin.jvm.internal.n.h(lavProcessing, "lavProcessing");
        kotlin.jvm.internal.n.h(lavProcessingLoop, "lavProcessingLoop");
        kotlin.jvm.internal.n.h(imgPromptView, "imgPromptView");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(layoutSubject.getContext(), R.anim.anim_selected_prompt);
        animationLoadAnimation.setFillAfter(true);
        animationLoadAnimation.setAnimationListener(new d(imgPromptView, animationLoadAnimation, z9, lavProcessing, lavProcessingLoop, layoutSubject, layoutStyle, i10));
        imgPromptView.startAnimation(animationLoadAnimation);
    }

    public final void w(View layoutSubject, View layoutStyle) {
        kotlin.jvm.internal.n.h(layoutSubject, "layoutSubject");
        kotlin.jvm.internal.n.h(layoutStyle, "layoutStyle");
        layoutSubject.setTranslationY(0.0f);
        layoutStyle.setTranslationY(0.0f);
    }

    public final void x(final View view, float f10, float f11, long j9) {
        kotlin.jvm.internal.n.h(view, "view");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        valueAnimatorOfFloat.setInterpolator(this.f8778f);
        valueAnimatorOfFloat.setDuration(j9);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: W6.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0988e.y(view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new g(view, valueAnimatorOfFloat));
        valueAnimatorOfFloat.start();
    }

    public final void z(View view, float f10, float f11) {
        kotlin.jvm.internal.n.h(view, "view");
        view.setRenderEffect(RenderEffect.createBlurEffect(f10, f11, Shader.TileMode.CLAMP));
    }
}
