package p248y7;

import A3.f;
import H3.s;
import J7.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.K;
import androidx.viewpager2.widget.ViewPager2;
import com.android.launcher3.j;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p087i6.q;

/* JADX INFO: renamed from: y7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2013o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f30497o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Interpolator f30498p = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f30499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LockScreenFragment f30500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f30501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f30502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewPager2 f30503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f30504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f30505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f30506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f30507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final s f30508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f30509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f30510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f30511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Animator f30512n;

    /* JADX INFO: renamed from: y7.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public C2013o(View rootView, LockScreenFragment lockScreenFragment, b viewModel) {
        n.h(rootView, "rootView");
        n.h(lockScreenFragment, "lockScreenFragment");
        n.h(viewModel, "viewModel");
        this.f30499a = rootView;
        this.f30500b = lockScreenFragment;
        this.f30501c = viewModel;
        View viewRequireViewById = rootView.requireViewById(R.id.content_parent);
        n.g(viewRequireViewById, "requireViewById(...)");
        this.f30502d = (ViewGroup) viewRequireViewById;
        View viewRequireViewById2 = rootView.requireViewById(R.id.screen_preview_viewpager);
        n.g(viewRequireViewById2, "requireViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) viewRequireViewById2;
        this.f30503e = viewPager2;
        View viewRequireViewById3 = rootView.requireViewById(R.id.card);
        n.g(viewRequireViewById3, "requireViewById(...)");
        this.f30504f = (ViewGroup) viewRequireViewById3;
        View viewRequireViewById4 = rootView.requireViewById(R.id.previewSectionLayout);
        n.g(viewRequireViewById4, "requireViewById(...)");
        this.f30505g = (ViewGroup) viewRequireViewById4;
        View viewRequireViewById5 = rootView.requireViewById(R.id.page_indicator);
        n.g(viewRequireViewById5, "requireViewById(...)");
        this.f30506h = viewRequireViewById5;
        View viewRequireViewById6 = rootView.requireViewById(R.id.toolbar);
        n.g(viewRequireViewById6, "requireViewById(...)");
        this.f30507i = (ViewGroup) viewRequireViewById6;
        this.f30508j = s.a();
        Context context = rootView.getContext();
        n.g(context, "getContext(...)");
        this.f30509k = H6.a.d(context) ? -500.0f : 500.0f;
        View childAt = viewPager2.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup.getChildCount() >= 2 ? viewGroup : null;
            if (viewGroup2 != null) {
                this.f30510l = K.a(viewGroup2, 0);
                this.f30511m = K.a(viewGroup2, 1);
                g();
            }
        }
    }

    private final void c(boolean z9) {
        this.f30502d.requestDisallowInterceptTouchEvent(!z9);
        this.f30503e.setImportantForAccessibility(z9 ? 1 : 4);
        this.f30504f.setImportantForAccessibility(z9 ? 1 : 4);
        this.f30505g.setImportantForAccessibility(z9 ? 1 : 4);
        this.f30506h.setImportantForAccessibility(z9 ? 1 : 4);
        this.f30507i.setImportantForAccessibility(z9 ? 1 : 4);
    }

    private final void g() {
        if (this.f30501c.i()) {
            i(this, false, null, 2, null);
        }
    }

    public static /* synthetic */ void i(C2013o c2013o, boolean z9, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        c2013o.h(z9, aVar);
    }

    private final void j(final boolean z9, boolean z10, final p219v8.a aVar) {
        View view = this.f30511m;
        if (view == null) {
            return;
        }
        Animator animator = this.f30512n;
        if (animator != null) {
            if (!animator.isRunning()) {
                animator = null;
            }
            if (animator != null) {
                animator.cancel();
            }
        }
        c(false);
        p258z7.a aVarG = this.f30501c.g();
        n.e(aVarG);
        if (z9) {
            this.f30501c.v(view.getTranslationX());
        }
        float fH = z9 ? this.f30509k : this.f30501c.h();
        float f10 = z9 ? 0.95f : 1.0f;
        this.f30507i.setPivotY(aVarG.a().height() / 2.0f);
        this.f30505g.setPivotY((-aVarG.a().height()) / 2.0f);
        this.f30506h.setPivotY((-aVarG.a().height()) / 2.0f);
        this.f30504f.setPivotY((-aVarG.a().height()) / 2.0f);
        if (!z10) {
            view.setTranslationX(fH);
            f fVar = f.f167a;
            fVar.p(this.f30504f, f10);
            fVar.p(this.f30505g, f10);
            fVar.p(this.f30507i, f10);
            fVar.p(this.f30506h, f10);
            this.f30501c.w(z9);
            if (z9) {
                return;
            }
            c(true);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, fH);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f30504f, j.f15619b, f10);
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2013o.l(this.f30493a, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        AnimatorSet animatorSetG2 = this.f30500b.G2(z9);
        if (animatorSetG2 != null) {
            animatorSet.play(animatorSetG2);
        }
        animatorSet.play(objectAnimatorOfFloat2);
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(f30498p);
        animatorSet.addListener(p223w2.f.c(new Runnable() { // from class: y7.n
            @Override // java.lang.Runnable
            public final void run() {
                C2013o.m(aVar, this, z9);
            }
        }));
        animatorSet.start();
        this.f30512n = animatorSet;
    }

    static /* synthetic */ void k(C2013o c2013o, boolean z9, boolean z10, p219v8.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        c2013o.j(z9, z10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(C2013o c2013o, ValueAnimator animation) {
        n.h(animation, "animation");
        f fVar = f.f167a;
        ViewGroup viewGroup = c2013o.f30505g;
        Object animatedValue = animation.getAnimatedValue();
        n.g(animatedValue, "getAnimatedValue(...)");
        fVar.p(viewGroup, p206u5.a.d(animatedValue));
        ViewGroup viewGroup2 = c2013o.f30507i;
        Object animatedValue2 = animation.getAnimatedValue();
        n.g(animatedValue2, "getAnimatedValue(...)");
        fVar.p(viewGroup2, p206u5.a.d(animatedValue2));
        View view = c2013o.f30506h;
        Object animatedValue3 = animation.getAnimatedValue();
        n.g(animatedValue3, "getAnimatedValue(...)");
        fVar.p(view, p206u5.a.d(animatedValue3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(p219v8.a aVar, C2013o c2013o, boolean z9) {
        if (aVar != null) {
            aVar.invoke();
        }
        c2013o.f30501c.w(z9);
        if (z9) {
            return;
        }
        c2013o.c(true);
    }

    public final void d() {
        k(this, false, false, null, 6, null);
    }

    public final LockScreenFragment e() {
        return this.f30500b;
    }

    public final void f() {
        View view = this.f30510l;
        if (view == null) {
            return;
        }
        int paddingTop = view.requireViewById(R.id.screen_preview_click_view).getPaddingTop();
        RectF rectFA = r.f30516z.a(this.f30503e);
        float fD = this.f30508j.d(this.f30499a.getContext());
        Context context = this.f30499a.getContext();
        n.g(context, "getContext(...)");
        float fC = q.c(context, R.dimen.nt_screen_preview_width);
        float f10 = rectFA.top + paddingTop;
        rectFA.top = f10;
        rectFA.bottom = f10 + (fD * fC);
        Point pointE = this.f30508j.e(this.f30499a.getDisplay());
        int i10 = pointE.x;
        int i11 = pointE.y;
        float f11 = i10;
        float f12 = (f11 - fC) / 2;
        rectFA.left = f12;
        rectFA.right = f12 + fC;
        this.f30501c.u(new p258z7.a(rectFA, new RectF(0.0f, 0.0f, f11, i11)));
    }

    public final void h(boolean z9, p219v8.a aVar) {
        Animator animator = this.f30512n;
        if (animator == null || !animator.isRunning()) {
            j(true, z9, aVar);
        }
    }
}
