package I5;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3121a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Interpolator a(int i10) {
            switch (i10) {
                case 0:
                    return new LinearInterpolator();
                case 1:
                    return new AccelerateDecelerateInterpolator();
                case 2:
                    return new AccelerateInterpolator();
                case 3:
                    return new AnticipateInterpolator();
                case 4:
                    return new AnticipateOvershootInterpolator();
                case 5:
                    return new BounceInterpolator();
                case 6:
                    return new DecelerateInterpolator();
                case 7:
                    return new W0.a();
                case 8:
                    return new W0.b();
                case 9:
                    return new W0.c();
                case 10:
                    return new OvershootInterpolator();
                default:
                    throw new UnsupportedOperationException("Error transformed TimeInterpolator type for parse.");
            }
        }

        private a() {
        }
    }
}
