package p212v1;

import android.graphics.Path;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Interpolator f28084A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Interpolator f28085B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Interpolator f28086C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Interpolator f28087D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Interpolator f28088E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Interpolator f28089F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Interpolator f28090G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Interpolator f28091H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Interpolator f28092I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Interpolator f28093J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Interpolator f28094K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Interpolator f28095L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Interpolator f28096M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Interpolator f28097N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Interpolator f28098O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Interpolator f28099P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Interpolator f28100Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Interpolator f28101R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Interpolator f28102S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Interpolator f28103T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Interpolator f28104U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final Interpolator f28105V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final Interpolator f28106W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Interpolator f28107X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Interpolator f28108Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Interpolator f28109Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Interpolator f28111a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Interpolator f28113b0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Interpolator f28116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Interpolator f28117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Interpolator f28118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f28119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Interpolator f28120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Interpolator f28121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Interpolator f28122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Interpolator f28123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Interpolator f28124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Interpolator f28125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Interpolator f28126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Interpolator f28127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Interpolator f28128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Interpolator f28129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Interpolator f28130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Interpolator f28131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Interpolator f28132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Interpolator f28133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Interpolator f28134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Interpolator f28135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Interpolator f28136y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Interpolator f28137z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f28110a = e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Interpolator f28112b = d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Interpolator f28114c = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Interpolator f28115d = new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return d.f28097N.getInterpolation(1.0f - d.f28108Y.getInterpolation(1.0f - f10));
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

    /* JADX INFO: renamed from: v1.d$d, reason: collision with other inner class name */
    class InterpolatorC0693d implements Interpolator {
        InterpolatorC0693d() {
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
        f28116e = new PathInterpolator(path);
        f28117f = new Interpolator() { // from class: v1.a
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return d.c(f10);
            }
        };
        f28118g = new Interpolator() { // from class: v1.b
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return d.a(f10);
            }
        };
        f28119h = new OvershootInterpolator(0.75f);
        f28120i = new OvershootInterpolator(1.2f);
        f28121j = new OvershootInterpolator(1.7f);
        f28122k = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
        f28123l = new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f);
        f28124m = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
        f28125n = pathInterpolator;
        PathInterpolator pathInterpolator2 = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
        f28126o = pathInterpolator2;
        PathInterpolator pathInterpolator3 = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        f28127p = pathInterpolator3;
        f28128q = new LinearInterpolator();
        f28129r = pathInterpolator;
        f28130s = pathInterpolator2;
        f28131t = pathInterpolator3;
        f28132u = new PathInterpolator(0.8f, 0.0f, 0.6f, 1.0f);
        f28133v = new PathInterpolator(0.8f, 0.0f, 1.0f, 1.0f);
        f28134w = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
        f28135x = new PathInterpolator(0.6f, 0.0f, 0.4f, 1.0f);
        f28136y = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        f28137z = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
        f28084A = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
        f28085B = new PathInterpolator(0.0f, 0.0f, 0.8f, 1.0f);
        f28086C = new AccelerateInterpolator();
        f28087D = new AccelerateInterpolator(0.5f);
        f28088E = new AccelerateInterpolator(0.75f);
        f28089F = new AccelerateInterpolator(1.5f);
        f28090G = new AccelerateInterpolator(2.0f);
        f28091H = new AccelerateDecelerateInterpolator();
        f28092I = new DecelerateInterpolator();
        f28093J = new DecelerateInterpolator(1.5f);
        f28094K = new DecelerateInterpolator(1.7f);
        f28095L = new DecelerateInterpolator(2.0f);
        f28096M = new DecelerateInterpolator(2.5f);
        f28097N = new DecelerateInterpolator(3.0f);
        f28098O = new PathInterpolator(0.4f, 0.0f, 0.6f, 1.0f);
        f28099P = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.4f);
        f28100Q = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.1f);
        f28101R = new PathInterpolator(0.3f, 0.0f, 0.5f, 1.0f);
        f28102S = new BounceInterpolator();
        f28103T = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
        f28104U = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
        f28105V = new PathInterpolator(0.9f, 0.0f, 0.7f, 1.0f);
        f28106W = new Interpolator() { // from class: v1.c
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return d.f28091H.getInterpolation(d.f28104U.getInterpolation(f10));
            }
        };
        f28107X = new a();
        f28108Y = new b();
        f28109Z = new c();
        f28111a0 = new InterpolatorC0693d();
        f28113b0 = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    }

    public static /* synthetic */ float a(float f10) {
        return f10 < 1.0f ? 0.0f : 1.0f;
    }

    public static /* synthetic */ float c(float f10) {
        return 1.0f;
    }

    private static PathInterpolator d() {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.1217f, 0.0462f, 0.15f, 0.4686f, 0.1667f, 0.66f);
        path.cubicTo(0.1834f, 0.8878f, 0.1667f, 1.0f, 1.0f, 1.0f);
        return new PathInterpolator(path);
    }

    private static PathInterpolator e() {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.05f, 0.0f, 0.133333f, 0.06f, 0.166666f, 0.4f);
        path.cubicTo(0.208333f, 0.82f, 0.25f, 1.0f, 1.0f, 1.0f);
        return new PathInterpolator(path);
    }
}
