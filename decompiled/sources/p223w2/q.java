package p223w2;

import android.graphics.Path;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Interpolator f28590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Interpolator f28591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Interpolator f28592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Interpolator f28593D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Interpolator f28594E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Interpolator f28595F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Interpolator f28596G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Interpolator f28597H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Interpolator f28620w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Interpolator f28623z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f28598a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Interpolator f28599b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Interpolator f28600c = new AccelerateInterpolator(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Interpolator f28601d = new AccelerateInterpolator(0.75f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Interpolator f28602e = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Interpolator f28603f = new AccelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Interpolator f28604g = new DecelerateInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f28605h = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Interpolator f28606i = new DecelerateInterpolator(1.7f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Interpolator f28607j = new DecelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Interpolator f28608k = new DecelerateInterpolator(2.5f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Interpolator f28609l = new DecelerateInterpolator(3.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Interpolator f28610m = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Interpolator f28611n = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Interpolator f28612o = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Interpolator f28613p = new PathInterpolator(0.6f, 0.0f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Interpolator f28614q = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Interpolator f28615r = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Interpolator f28616s = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Interpolator f28617t = g();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Interpolator f28618u = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Interpolator f28619v = new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Interpolator f28621x = new Interpolator() { // from class: w2.m
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            return q.a(f10);
        }
    };

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Interpolator f28622y = new Interpolator() { // from class: w2.n
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            return q.c(f10);
        }
    };

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return q.f28609l.getInterpolation(1.0f - q.f28595F.getInterpolation(1.0f - f10));
        }
    }

    class b implements Interpolator {
        b() {
        }

        private float a(float f10) {
            return (1.0f - (0.35f / (f10 + 0.35f))) / 0.7407408f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return a(f10);
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class d implements Interpolator {
        d() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11) + 1.0f;
        }
    }

    static {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.05f, 0.0f, 0.133333f, 0.08f, 0.166666f, 0.4f);
        path.cubicTo(0.225f, 0.94f, 0.5f, 1.0f, 1.0f, 1.0f);
        f28620w = new PathInterpolator(path);
        f28623z = new OvershootInterpolator(0.75f);
        f28590A = new OvershootInterpolator(1.2f);
        f28591B = new OvershootInterpolator(1.7f);
        f28592C = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
        f28593D = new Interpolator() { // from class: w2.o
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return q.f28610m.getInterpolation(q.f28592C.getInterpolation(f10));
            }
        };
        f28594E = new a();
        f28595F = new b();
        f28596G = new c();
        f28597H = new d();
    }

    public static /* synthetic */ float a(float f10) {
        return 1.0f;
    }

    public static /* synthetic */ float c(float f10) {
        return f10 < 1.0f ? 0.0f : 1.0f;
    }

    public static float e(Interpolator interpolator, float f10, float f11, float f12) {
        if (f12 < f11) {
            throw new IllegalArgumentException(String.format("upperBound (%f) must be greater than lowerBound (%f)", Float.valueOf(f12), Float.valueOf(f11)));
        }
        if (f10 == f11 && f10 == f12) {
            return f10 == 0.0f ? 0.0f : 1.0f;
        }
        if (f10 < f11) {
            return 0.0f;
        }
        if (f10 > f12) {
            return 1.0f;
        }
        return interpolator.getInterpolation((f10 - f11) / (f12 - f11));
    }

    public static Interpolator f(final Interpolator interpolator, final float f10, final float f11) {
        if (f11 >= f10) {
            return new Interpolator() { // from class: w2.p
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f12) {
                    return q.e(interpolator, f12, f10, f11);
                }
            };
        }
        throw new IllegalArgumentException(String.format("upperBound (%f) must be greater than lowerBound (%f)", Float.valueOf(f11), Float.valueOf(f10)));
    }

    private static PathInterpolator g() {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.05f, 0.0f, 0.133333f, 0.06f, 0.166666f, 0.4f);
        path.cubicTo(0.208333f, 0.82f, 0.25f, 1.0f, 1.0f, 1.0f);
        return new PathInterpolator(path);
    }

    public static Interpolator h(float f10) {
        return Math.abs(f10) > 10.0f ? f28596G : f28597H;
    }
}
