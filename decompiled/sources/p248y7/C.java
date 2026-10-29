package p248y7;

import D8.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.K;
import com.android.launcher3.CellLayout;
import com.android.launcher3.Workspace;
import com.android.launcher3.f;
import com.android.launcher3.u;
import com.android.launcher3.v;
import com.nothing.launcher.card.t;
import com.nothing.wallpaper.picker.lockscreen.ui.view.E;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p079h8.o;
import p219v8.l;
import p223w2.e;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f30355h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Interpolator f30356i = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f30357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f30358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Workspace f30359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CellLayout f30360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f30361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AnimatorSet f30362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f30363g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f30365c;

        b(boolean z9, View view) {
            this.f30364b = z9;
            this.f30365c = view;
        }

        @Override // p223w2.e
        public void a(Animator animator) {
            if (this.f30364b) {
                return;
            }
            this.f30365c.setVisibility(8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationStart(animation);
            this.f30365c.setVisibility(0);
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p233x2.b f30366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f30367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f30370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f30371g;

        c(p233x2.b bVar, t tVar, int i10, int i11, u uVar, View view) {
            this.f30366b = bVar;
            this.f30367c = tVar;
            this.f30368d = i10;
            this.f30369e = i11;
            this.f30370f = uVar;
            this.f30371g = view;
        }

        @Override // p223w2.e
        public void a(Animator animator) {
            this.f30366b.f29764h = true;
            t tVar = this.f30367c;
            tVar.f595s = this.f30368d;
            tVar.f596t = this.f30369e;
            this.f30370f.getTranslateDelegate().c(2, 0.0f, 0.0f);
            this.f30371g.requestLayout();
        }
    }

    public static final class d extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p219v8.a f30372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C f30373c;

        d(p219v8.a aVar, C c10) {
            this.f30372b = aVar;
            this.f30373c = c10;
        }

        @Override // p223w2.e
        public void a(Animator animator) {
            p219v8.a aVar = this.f30372b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // p223w2.e, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationEnd(animation);
            this.f30373c.f30360d.setTag(Boolean.FALSE);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            n.h(animation, "animation");
            super.onAnimationStart(animation);
            this.f30373c.f30360d.setTag(Boolean.TRUE);
        }
    }

    public C(com.android.launcher3.views.f activityContext, E clockHostView) {
        n.h(activityContext, "activityContext");
        n.h(clockHostView, "clockHostView");
        this.f30357a = clockHostView;
        this.f30358b = activityContext.K();
        Workspace workspaceM = activityContext.M();
        this.f30359c = workspaceM;
        CellLayout cellLayoutF = workspaceM.f(0);
        this.f30360d = cellLayoutF;
        this.f30361e = cellLayoutF.getShortcutsAndWidgets();
        this.f30363g = i.b(new p219v8.a() { // from class: y7.v
            @Override // p219v8.a
            public final Object invoke() {
                return Integer.valueOf(C.v(this.f30554q));
            }
        });
    }

    private final void A(boolean z9, boolean z10, p219v8.a aVar) {
        AnimatorSet animatorSet = this.f30362f;
        if (animatorSet != null) {
            if (!animatorSet.isRunning()) {
                animatorSet = null;
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(j(z9));
        animatorSet2.play(q(z9));
        animatorSet2.play(l(z9));
        if (z10) {
            CellLayout cellLayout = this.f30360d;
            n.g(cellLayout, "cellLayout");
            animatorSet2.play(s(z9, cellLayout));
        }
        if (z9) {
            animatorSet2.play(r());
        } else {
            animatorSet2.play(m());
        }
        animatorSet2.setDuration(400L);
        animatorSet2.setInterpolator(f30356i);
        animatorSet2.addListener(new d(aVar, this));
        animatorSet2.start();
        this.f30362f = animatorSet2;
    }

    private final ObjectAnimator i(View view, boolean z9) {
        float[] fArr = new float[2];
        if (z9) {
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
        } else {
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.addListener(new b(z9, view));
        n.g(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    private final Animator j(final boolean z9) {
        final Drawable animBackground = this.f30360d.getAnimBackground();
        f fVar = this.f30358b;
        final Rect rect = new Rect(0, 0, fVar.f15539H, fVar.f15540I);
        float[] fArr = new float[2];
        if (z9) {
            fArr[0] = 0.5f;
            fArr[1] = 1.0f;
        } else {
            fArr[0] = 1.0f;
            fArr[1] = 0.5f;
        }
        final int i10 = this.f30358b.f15569f0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C.k(this.f30555a, z9, i10, rect, animBackground, valueAnimator);
            }
        });
        n.g(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(C c10, boolean z9, int i10, Rect rect, Drawable drawable, ValueAnimator it) {
        n.h(it, "it");
        float f10 = c10.f30358b.f15539H;
        Object animatedValue = it.getAnimatedValue();
        n.g(animatedValue, "getAnimatedValue(...)");
        int iD = (int) (f10 * p206u5.a.d(animatedValue));
        int animatedFraction = (c10.f30358b.f15539H / 2) + ((int) (i10 * (z9 ? 1 - it.getAnimatedFraction() : it.getAnimatedFraction())));
        int i11 = iD / 2;
        rect.top = animatedFraction - i11;
        rect.bottom = animatedFraction + i11;
        drawable.setBounds(rect);
        c10.f30361e.setTranslationY(rect.top);
    }

    private final ObjectAnimator l(boolean z9) {
        return this.f30357a.f(z9 ? 0.0f : 1.0f);
    }

    private final AnimatorSet m() {
        V5.b occupied = this.f30360d.getOccupied();
        AnimatorSet animatorSet = new AnimatorSet();
        v shortcutsAndWidgets = this.f30361e;
        n.g(shortcutsAndWidgets, "shortcutsAndWidgets");
        for (o oVar : k.z(k.x(K.b(shortcutsAndWidgets), new l() { // from class: y7.y
            @Override // p219v8.l
            public final Object f(Object obj) {
                return C.o((View) obj);
            }
        }), p109k8.a.b(new l() { // from class: y7.z
            @Override // p219v8.l
            public final Object f(Object obj) {
                return C.p((o) obj);
            }
        }, new l() { // from class: y7.A
            @Override // p219v8.l
            public final Object f(Object obj) {
                return C.n((o) obj);
            }
        }))) {
            View view = (View) oVar.a();
            t tVar = (t) oVar.b();
            if (!occupied.g(tVar.f595s, tVar.f596t, tVar.f597u, tVar.f598v)) {
                int[] iArr = new int[2];
                occupied.j(tVar, false);
                if (occupied.c(iArr, tVar.f597u, tVar.f598v)) {
                    tVar.r(tVar.f595s);
                    tVar.s(tVar.f596t);
                    int i10 = iArr[0];
                    tVar.f595s = i10;
                    int i11 = iArr[1];
                    tVar.f596t = i11;
                    occupied.i(i10, i11, tVar.f597u, tVar.f598v, true);
                    animatorSet.play(y(view, iArr[0], iArr[1], tVar));
                } else {
                    tVar.t(true);
                    animatorSet.play(i(view, false));
                }
            }
        }
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable n(o it) {
        n.h(it, "it");
        return Integer.valueOf(((t) it.d()).f595s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o o(View it) {
        n.h(it, "it");
        Object tag = it.getTag();
        n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
        return p079h8.v.a(it, (t) tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable p(o it) {
        n.h(it, "it");
        return Integer.valueOf(((t) it.d()).f596t);
    }

    private final Animator q(boolean z9) {
        float f10 = this.f30358b.f15569f0;
        float[] fArr = z9 ? new float[]{f10, 0.0f} : new float[]{0.0f, f10};
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30360d.getEmptyView(), (Property<View, Float>) View.TRANSLATION_Y, Arrays.copyOf(fArr, fArr.length));
        n.g(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private final AnimatorSet r() {
        V5.b occupied = this.f30360d.getOccupied();
        AnimatorSet animatorSet = new AnimatorSet();
        occupied.a();
        v shortcutsAndWidgets = this.f30361e;
        n.g(shortcutsAndWidgets, "shortcutsAndWidgets");
        for (View view : K.b(shortcutsAndWidgets)) {
            Object tag = view.getTag();
            n.f(tag, "null cannot be cast to non-null type com.nothing.launcher.card.PickCardWidgetInfo");
            t tVar = (t) tag;
            if (tVar.k() != -1 || tVar.l() != -1) {
                tVar.f595s = tVar.k();
                tVar.f596t = tVar.l();
                tVar.r(-1);
                tVar.s(-1);
                animatorSet.play(y(view, tVar.f595s, tVar.f596t, tVar));
            } else if (tVar.n()) {
                tVar.t(false);
                animatorSet.play(i(view, true));
            }
            occupied.j(tVar, true);
        }
        return animatorSet;
    }

    private final Animator s(boolean z9, final CellLayout cellLayout) {
        final int iW = w() * (z9 ? 1 : -1);
        final float translationY = cellLayout.getTranslationY();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C.t(cellLayout, translationY, iW, valueAnimatorOfFloat, valueAnimator);
            }
        });
        n.g(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CellLayout cellLayout, float f10, int i10, ValueAnimator valueAnimator, ValueAnimator it) {
        n.h(it, "it");
        cellLayout.setTranslationY(f10 + (i10 * valueAnimator.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(C c10) {
        f fVar = c10.f30358b;
        return fVar.f15577n - fVar.f15578o;
    }

    private final int w() {
        return ((Number) this.f30363g.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ValueAnimator y(View view, int i10, int i11, t tVar) {
        n.f(view, "null cannot be cast to non-null type com.android.launcher3.Reorderable");
        final u uVar = (u) view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        n.f(layoutParams, "null cannot be cast to non-null type com.android.launcher3.celllayout.CellLayoutLayoutParams");
        p233x2.b bVar = (p233x2.b) layoutParams;
        bVar.f29764h = true;
        bVar.f29761e = false;
        bVar.e(i10);
        bVar.f(i11);
        int i12 = bVar.f29766j;
        int i13 = bVar.f29767k;
        this.f30361e.setupLp(view);
        int i14 = bVar.f29766j;
        int i15 = bVar.f29767k;
        bVar.f29766j = i12;
        bVar.f29767k = i13;
        bVar.f29764h = false;
        F2.o translateDelegate = uVar.getTranslateDelegate();
        n.g(translateDelegate, "getTranslateDelegate(...)");
        final float fB = translateDelegate.a(2).b();
        final float fB2 = translateDelegate.b(2).b();
        final float f10 = i14 - i12;
        final float f11 = i15 - i13;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7.B
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C.z(fB, f10, fB2, f11, uVar, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new c(bVar, tVar, i10, i11, uVar, view));
        n.g(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(float f10, float f11, float f12, float f13, u uVar, ValueAnimator animation) {
        n.h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f14 = 1 - fFloatValue;
        uVar.getTranslateDelegate().c(2, (f10 * f14) + (f11 * fFloatValue), (f14 * f12) + (fFloatValue * f13));
    }

    public final void u(boolean z9, boolean z10, p219v8.a onEnd) {
        n.h(onEnd, "onEnd");
        A(z9, z10, onEnd);
    }

    public final boolean x() {
        AnimatorSet animatorSet = this.f30362f;
        return animatorSet != null && animatorSet.isRunning();
    }
}
