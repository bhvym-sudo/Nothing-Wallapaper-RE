package com.nothing.wallpaper.picker.creative;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.core.view.K;
import androidx.databinding.f;
import androidx.databinding.g;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p044e3.AbstractC1335o;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractComponentCallbacksC1132q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0484a f18474r = new C0484a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AnimatorSet f18475q;

    /* JADX INFO: renamed from: com.nothing.wallpaper.picker.creative.a$a, reason: collision with other inner class name */
    public static final class C0484a {
        public /* synthetic */ C0484a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final a a() {
            return new a();
        }

        private C0484a() {
        }
    }

    public static final class b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f18476a;

        b(float f10) {
            this.f18476a = f10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            n.h(view, "view");
            n.h(outline, "outline");
            float width = view.getWidth();
            float height = view.getHeight();
            Path path = new Path();
            float f10 = this.f18476a * 2;
            path.arcTo(new RectF(0.0f, 0.0f, f10, f10), 180.0f, 90.0f);
            path.arcTo(new RectF(width - f10, 0.0f, width, f10), 270.0f, 90.0f);
            path.lineTo(width, height);
            path.lineTo(0.0f, height);
            path.close();
            outline.setPath(path);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(a aVar, AbstractC1335o abstractC1335o, float f10) {
        aVar.h0(abstractC1335o, f10);
    }

    private final void g0(ViewGroup viewGroup, float f10) {
        for (View view : K.b(viewGroup)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) (viewGroup.getWidth() - (2 * f10));
            view.setLayoutParams(layoutParams);
        }
    }

    private final void h0(AbstractC1335o abstractC1335o, float f10) {
        int width = (int) (abstractC1335o.f20040A.getWidth() - (2 * f10));
        LinearLayout topSection = abstractC1335o.f20040A;
        n.g(topSection, "topSection");
        g0(topSection, f10);
        LinearLayout bottomSection = abstractC1335o.f20041v;
        n.g(bottomSection, "bottomSection");
        g0(bottomSection, f10);
        abstractC1335o.f20040A.setScrollX(width);
        abstractC1335o.f20041v.setScrollX(-((int) f10));
        LinearLayout topSection2 = abstractC1335o.f20040A;
        n.g(topSection2, "topSection");
        ValueAnimator valueAnimatorI0 = i0(topSection2, width, 1 + (f10 / width), 0.0f);
        LinearLayout bottomSection2 = abstractC1335o.f20041v;
        n.g(bottomSection2, "bottomSection");
        ValueAnimator valueAnimatorI1 = i0(bottomSection2, width, 1.0f, f10);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(200L);
        animatorSet.setDuration(1000L);
        animatorSet.setInterpolator(new PathInterpolator(0.6f, 0.0f, 0.0f, 1.0f));
        animatorSet.playTogether(valueAnimatorI0, valueAnimatorI1);
        animatorSet.start();
        this.f18475q = animatorSet;
    }

    private final ValueAnimator i0(final ViewGroup viewGroup, final int i10, float f10, final float f11) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: S6.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.nothing.wallpaper.picker.creative.a.j0(valueAnimatorOfFloat, f11, i10, viewGroup, valueAnimator);
            }
        });
        n.g(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(ValueAnimator valueAnimator, float f10, int i10, ViewGroup viewGroup, ValueAnimator it) {
        n.h(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        viewGroup.scrollTo((int) (f10 == 0.0f ? i10 * (1 - fFloatValue) : ((i10 + f10) * fFloatValue) - f10), viewGroup.getScrollY());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        g gVarE = f.e(inflater, R.layout.fragment_ai_wallpaper_entrace, viewGroup, false);
        n.g(gVarE, "inflate(...)");
        final AbstractC1335o abstractC1335o = (AbstractC1335o) gVarE;
        final float dimension = getResources().getDimension(R.dimen.nt_ai_entrance_margin);
        abstractC1335o.f20040A.setOutlineProvider(new b(getResources().getDimension(R.dimen.nt_ai_entrance_corner)));
        abstractC1335o.f20040A.setClipToOutline(true);
        abstractC1335o.o().post(new Runnable() { // from class: S6.b
            @Override // java.lang.Runnable
            public final void run() {
                com.nothing.wallpaper.picker.creative.a.f0(this.f7361q, abstractC1335o, dimension);
            }
        });
        View viewO = abstractC1335o.o();
        n.g(viewO, "getRoot(...)");
        return viewO;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        AnimatorSet animatorSet = this.f18475q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
