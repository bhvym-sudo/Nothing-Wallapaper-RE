package p233x2;

import android.animation.ValueAnimator;
import android.util.ArrayMap;
import android.view.View;
import com.android.launcher3.CellLayout;
import com.android.launcher3.u;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p223w2.q;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f29789m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f29790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayMap f29792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f29794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f29795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f29796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f29797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f29798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f29799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f29800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ValueAnimator f29801l;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(View child, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, CellLayout cellLayout, ArrayMap shakeAnimators) {
        n.h(child, "child");
        n.h(cellLayout, "cellLayout");
        n.h(shakeAnimators, "shakeAnimators");
        this.f29790a = child;
        this.f29791b = i10;
        this.f29792c = shakeAnimators;
        this.f29793d = "ReorderPreviewAnimation";
        this.f29796g = ((u) child).getTranslateDelegate().a(0).b();
        this.f29797h = ((u) child).getTranslateDelegate().b(0).b();
        this.f29798i = ((u) child).getReorderBounceScale();
        this.f29799j = 1.0f - ((4.0f / child.getWidth()) * this.f29798i);
        int i17 = i10 == 0 ? -1 : 1;
        this.f29800k = i17;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(this);
        valueAnimatorOfFloat.setDuration(i10 == 0 ? 650 : 300);
        valueAnimatorOfFloat.setStartDelay((long) (Math.random() * ((double) 60)));
        if (ValueAnimator.areAnimatorsEnabled() && i10 == 1) {
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(2);
        }
        n.g(valueAnimatorOfFloat, "also(...)");
        this.f29801l = valueAnimatorOfFloat;
        int[] iArr = {0, 0};
        cellLayout.N(i11, i12, i15, i16, iArr);
        int i18 = iArr[0];
        int i19 = iArr[1];
        cellLayout.N(i13, i14, i15, i16, iArr);
        int i20 = iArr[0] - i18;
        int i21 = iArr[1] - i19;
        if (i20 == 0 && i21 == 0) {
            return;
        }
        if (i21 == 0) {
            this.f29794e = (-i17) * Math.signum(i20) * f10;
            return;
        }
        if (i20 == 0) {
            this.f29795f = (-i17) * Math.signum(i21) * f10;
            return;
        }
        float f11 = i21;
        float f12 = i20;
        float fAtan = (float) Math.atan(f11 / f12);
        float fSignum = (-i17) * Math.signum(f12);
        double d10 = fAtan;
        this.f29794e = fSignum * Math.abs(((float) Math.cos(d10)) * f10);
        this.f29795f = (-i17) * Math.signum(f11) * Math.abs(((float) Math.sin(d10)) * f10);
    }

    private final void b() {
        this.f29801l.cancel();
    }

    private final boolean d(float f10) {
        return f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE;
    }

    private final void e() {
        this.f29798i = 1.0f;
        this.f29796g = 0.0f;
        this.f29797h = 0.0f;
    }

    public final void a() {
        boolean z9 = this.f29794e == 0.0f && this.f29795f == 0.0f;
        if (this.f29792c.containsKey(this.f29790a)) {
            l lVar = (l) this.f29792c.remove(this.f29790a);
            if (z9) {
                n.e(lVar);
                lVar.c();
                return;
            } else {
                n.e(lVar);
                lVar.b();
            }
        }
        if (z9) {
            return;
        }
        this.f29792c.put(this.f29790a, this);
        this.f29801l.start();
    }

    public final void c() {
        this.f29801l.cancel();
        e();
        Object animatedValue = this.f29801l.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) animatedValue).floatValue(), 0.0f);
        this.f29801l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(this);
        this.f29801l.setInterpolator(q.f28605h);
        this.f29801l.setDuration(150L);
        this.f29801l.start();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator updatedAnimation) {
        n.h(updatedAnimation, "updatedAnimation");
        Object animatedValue = updatedAnimation.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f10 = 1 - fFloatValue;
        ((u) this.f29790a).getTranslateDelegate().c(0, (this.f29794e * fFloatValue) + (this.f29796g * f10), (this.f29795f * fFloatValue) + (this.f29797h * f10));
        float f11 = (this.f29799j * fFloatValue) + (f10 * this.f29798i);
        if (d(f11)) {
            ((u) this.f29790a).setReorderBounceScale(f11);
            return;
        }
        c.k(this.f29793d, "s is NaN, s=" + f11 + ", animationProgress=" + fFloatValue + ",  finalScale=" + this.f29799j + ", initScale=" + this.f29798i);
    }
}
