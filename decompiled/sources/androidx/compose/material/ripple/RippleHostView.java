package androidx.compose.material.ripple;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.material.ripple.RippleHostView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f11372t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f11373u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int[] f11374v = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f11375w = new int[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f11376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f11377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p219v8.a f11378s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private final void setRippleState(boolean z9) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f11377r;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l9 = this.f11376q;
        long jLongValue = jCurrentAnimationTimeMillis - (l9 != null ? l9.longValue() : 0L);
        if (!z9 && jLongValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: q.a
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(this.f23792q);
                }
            };
            this.f11377r = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f11376q = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        rippleHostView.getClass();
        rippleHostView.f11377r = null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        p219v8.a aVar = this.f11378s;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
