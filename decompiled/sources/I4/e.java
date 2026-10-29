package I4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1077i;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public class e extends I4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f3054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f3055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f3056i;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3058b;

        a(boolean z9, int i10) {
            this.f3057a = z9;
            this.f3058b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.f3040b.setTranslationX(0.0f);
            e.this.k(0.0f, this.f3057a, this.f3058b);
        }
    }

    public e(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f3054g = resources.getDimension(p225w4.c.f28776l);
        this.f3055h = resources.getDimension(p225w4.c.f28775k);
        this.f3056i = resources.getDimension(p225w4.c.f28777m);
    }

    private boolean g(int i10, int i11) {
        return (AbstractC1077i.b(i10, H.v(this.f3040b)) & i11) == i11;
    }

    private int i(boolean z9) {
        ViewGroup.LayoutParams layoutParams = this.f3040b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z9 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f3040b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f3040b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f3040b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f3043e);
        animatorSet.start();
    }

    public void h(p010b.b bVar, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z9 = bVar.b() == 0;
        boolean zG = g(i10, 3);
        float width = (this.f3040b.getWidth() * this.f3040b.getScaleX()) + i(zG);
        View view = this.f3040b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new W0.b());
        objectAnimatorOfFloat.setDuration(p235x4.a.c(this.f3041c, this.f3042d, bVar.a()));
        objectAnimatorOfFloat.addListener(new a(z9, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void j(p010b.b bVar) {
        super.d(bVar);
    }

    public void k(float f10, boolean z9, int i10) {
        float fA = a(f10);
        boolean zG = g(i10, 3);
        boolean z10 = z9 == zG;
        int width = this.f3040b.getWidth();
        int height = this.f3040b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f3054g / f11;
            float f14 = this.f3055h / f11;
            float f15 = this.f3056i / f12;
            View view = this.f3040b;
            if (zG) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z10) {
                f14 = -f13;
            }
            float fA2 = p235x4.a.a(0.0f, f14, fA);
            float f16 = fA2 + 1.0f;
            this.f3040b.setScaleX(f16);
            float fA3 = 1.0f - p235x4.a.a(0.0f, f15, fA);
            this.f3040b.setScaleY(fA3);
            View view2 = this.f3040b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z10 ? 1.0f - fA2 : 1.0f;
                    float f18 = fA3 != 0.0f ? (f16 / fA3) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }

    public void l(p010b.b bVar, int i10) {
        if (super.e(bVar) == null) {
            return;
        }
        k(bVar.a(), bVar.b() == 0, i10);
    }
}
