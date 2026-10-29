package S7;

import android.animation.TypeEvaluator;
import android.graphics.RectF;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f7375a = new RectF();

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RectF evaluate(float f10, RectF startValue, RectF endValue) {
        n.h(startValue, "startValue");
        n.h(endValue, "endValue");
        float f11 = startValue.left;
        float f12 = f11 + ((endValue.left - f11) * f10);
        float f13 = startValue.top;
        float f14 = f13 + ((endValue.top - f13) * f10);
        float f15 = startValue.right;
        float f16 = f15 + ((endValue.right - f15) * f10);
        float f17 = startValue.bottom;
        this.f7375a.set(f12, f14, f16, f17 + ((endValue.bottom - f17) * f10));
        return this.f7375a;
    }
}
