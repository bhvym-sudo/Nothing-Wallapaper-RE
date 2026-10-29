package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final int f12316H = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f12318B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f12319C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f12320D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f12321E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f12322F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f12323G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final View f12326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Runnable f12327t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f12330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f12331x;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final C0382a f12324q = new C0382a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Interpolator f12325r = new AccelerateInterpolator();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float[] f12328u = {0.0f, 0.0f};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float[] f12329v = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float[] f12332y = {0.0f, 0.0f};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float[] f12333z = {0.0f, 0.0f};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float[] f12317A = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0382a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f12336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f12337d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f12343j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12344k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f12338e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f12342i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f12339f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f12340g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f12341h = 0;

        C0382a() {
        }

        private float e(long j9) {
            long j10 = this.f12338e;
            if (j9 < j10) {
                return 0.0f;
            }
            long j11 = this.f12342i;
            if (j11 < 0 || j9 < j11) {
                return a.e((j9 - j10) / this.f12334a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f12343j;
            return (1.0f - f10) + (f10 * a.e((j9 - j11) / this.f12344k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f12339f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j9 = jCurrentAnimationTimeMillis - this.f12339f;
            this.f12339f = jCurrentAnimationTimeMillis;
            float f10 = j9 * fG;
            this.f12340g = (int) (this.f12336c * f10);
            this.f12341h = (int) (f10 * this.f12337d);
        }

        public int b() {
            return this.f12340g;
        }

        public int c() {
            return this.f12341h;
        }

        public int d() {
            float f10 = this.f12336c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f12337d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f12342i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f12342i + ((long) this.f12344k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f12344k = a.f((int) (jCurrentAnimationTimeMillis - this.f12338e), 0, this.f12335b);
            this.f12343j = e(jCurrentAnimationTimeMillis);
            this.f12342i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f12335b = i10;
        }

        public void k(int i10) {
            this.f12334a = i10;
        }

        public void l(float f10, float f11) {
            this.f12336c = f10;
            this.f12337d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f12338e = jCurrentAnimationTimeMillis;
            this.f12342i = -1L;
            this.f12339f = jCurrentAnimationTimeMillis;
            this.f12343j = 0.5f;
            this.f12340g = 0;
            this.f12341h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f12321E) {
                if (aVar.f12319C) {
                    aVar.f12319C = false;
                    aVar.f12324q.m();
                }
                C0382a c0382a = a.this.f12324q;
                if (c0382a.h() || !a.this.u()) {
                    a.this.f12321E = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f12320D) {
                    aVar2.f12320D = false;
                    aVar2.c();
                }
                c0382a.a();
                a.this.j(c0382a.b(), c0382a.c());
                H.Y(a.this.f12326s, this);
            }
        }
    }

    public a(View view) {
        this.f12326s = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f12316H);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f12328u[i10], f11, this.f12329v[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f12332y[i10];
        float f14 = this.f12333z[i10];
        float f15 = this.f12317A[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f12330w;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f12321E && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f12325r.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f12325r.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f12319C) {
            this.f12321E = false;
        } else {
            this.f12324q.i();
        }
    }

    private void v() {
        int i10;
        if (this.f12327t == null) {
            this.f12327t = new b();
        }
        this.f12321E = true;
        this.f12319C = true;
        if (this.f12318B || (i10 = this.f12331x) <= 0) {
            this.f12327t.run();
        } else {
            H.Z(this.f12326s, this.f12327t, i10);
        }
        this.f12318B = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f12326s.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f12331x = i10;
        return this;
    }

    public a l(int i10) {
        this.f12330w = i10;
        return this;
    }

    public a m(boolean z9) {
        if (this.f12322F && !z9) {
            i();
        }
        this.f12322F = z9;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f12329v;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f12317A;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f12322F) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return !this.f12323G && this.f12321E;
        }
        this.f12320D = true;
        this.f12318B = false;
        this.f12324q.l(d(0, motionEvent.getX(), view.getWidth(), this.f12326s.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f12326s.getHeight()));
        if (!this.f12321E && u()) {
            v();
        }
        if (this.f12323G) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f12333z;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f12324q.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f12324q.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f12328u;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f12332y;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0382a c0382a = this.f12324q;
        int iF = c0382a.f();
        int iD = c0382a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
