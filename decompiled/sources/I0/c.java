package I0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.H;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Interpolator f2796x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2798b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f2800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f2801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f2802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f2803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f2804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f2805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f2806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f2808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f2809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f2812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f2814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC0101c f2815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f2816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f2818v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2799c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f2819w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    /* JADX INFO: renamed from: I0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0101c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0101c abstractC0101c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0101c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2818v = viewGroup;
        this.f2815s = abstractC0101c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2812p = i10;
        this.f2811o = i10;
        this.f2798b = viewConfiguration.getScaledTouchSlop();
        this.f2809m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2810n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2814r = new OverScroller(context, f2796x);
    }

    private boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f2808l.computeCurrentVelocity(1000, this.f2809m);
        q(h(this.f2808l.getXVelocity(this.f2799c), this.f2810n, this.f2809m), h(this.f2808l.getYVelocity(this.f2799c), this.f2810n, this.f2809m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [I0.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void H(float f10, float f11, int i10) {
        int i11;
        boolean zD = d(f10, f11, i10, 1);
        ?? r9 = zD;
        if (d(f11, f10, i10, 4)) {
            r9 = (zD ? 1 : 0) | 4;
        }
        ?? r10 = r9;
        if (d(f10, f11, i10, 2)) {
            r10 = (r9 == true ? 1 : 0) | 2;
        }
        ?? r11 = r10;
        if (d(f11, f10, i10, 8)) {
            i11 = (r10 == true ? 1 : 0) | 8;
        }
        if (r11 == 0) {
            r11 = i11;
            return;
        }
        r11 = i11;
        int[] iArr = this.f2805i;
        iArr[i10] = (iArr[i10] | r11) == true ? 1 : 0;
        this.f2815s.f(r11, i10);
    }

    private void I(float f10, float f11, int i10) {
        t(i10);
        float[] fArr = this.f2800d;
        this.f2802f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f2801e;
        this.f2803g[i10] = f11;
        fArr2[i10] = f11;
        this.f2804h[i10] = y((int) f10, (int) f11);
        this.f2807k |= 1 << i10;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x9 = motionEvent.getX(i10);
                float y9 = motionEvent.getY(i10);
                this.f2802f[pointerId] = x9;
                this.f2803g[pointerId] = y9;
            }
        }
    }

    private boolean d(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f2804h[i10] & i11) == i11 && (this.f2813q & i11) != 0 && (this.f2806j[i10] & i11) != i11 && (this.f2805i[i10] & i11) != i11) {
            int i12 = this.f2798b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f2815s.g(i11)) {
                    int[] iArr = this.f2806j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f2805i[i10] & i11) == 0 && fAbs > this.f2798b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean g(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z9 = this.f2815s.d(view) > 0;
        boolean z10 = this.f2815s.e(view) > 0;
        if (z9 && z10) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f2798b;
            return f12 > ((float) (i10 * i10));
        }
        if (z9) {
            return Math.abs(f10) > ((float) this.f2798b);
        }
        return z10 && Math.abs(f11) > ((float) this.f2798b);
    }

    private float h(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    private int i(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    private void j() {
        float[] fArr = this.f2800d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f2801e, 0.0f);
        Arrays.fill(this.f2802f, 0.0f);
        Arrays.fill(this.f2803g, 0.0f);
        Arrays.fill(this.f2804h, 0);
        Arrays.fill(this.f2805i, 0);
        Arrays.fill(this.f2806j, 0);
        this.f2807k = 0;
    }

    private void k(int i10) {
        if (this.f2800d == null || !C(i10)) {
            return;
        }
        this.f2800d[i10] = 0.0f;
        this.f2801e[i10] = 0.0f;
        this.f2802f[i10] = 0.0f;
        this.f2803g[i10] = 0.0f;
        this.f2804h[i10] = 0;
        this.f2805i[i10] = 0;
        this.f2806j[i10] = 0;
        this.f2807k = (~(1 << i10)) & this.f2807k;
    }

    private int l(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f2818v.getWidth();
        float f10 = width / 2;
        float fR = f10 + (r(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fR / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int m(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i14 = i(i12, (int) this.f2810n, (int) this.f2809m);
        int i15 = i(i13, (int) this.f2810n, (int) this.f2809m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int i16 = iAbs3 + iAbs4;
        int i17 = iAbs + iAbs2;
        if (i14 != 0) {
            f10 = iAbs3;
            f11 = i16;
        } else {
            f10 = iAbs;
            f11 = i17;
        }
        float f14 = f10 / f11;
        if (i15 != 0) {
            f12 = iAbs4;
            f13 = i16;
        } else {
            f12 = iAbs2;
            f13 = i17;
        }
        return (int) ((l(i10, i14, this.f2815s.d(view)) * f14) + (l(i11, i15, this.f2815s.e(view)) * (f12 / f13)));
    }

    public static c o(ViewGroup viewGroup, float f10, AbstractC0101c abstractC0101c) {
        c cVarP = p(viewGroup, abstractC0101c);
        cVarP.f2798b = (int) (cVarP.f2798b * (1.0f / f10));
        return cVarP;
    }

    public static c p(ViewGroup viewGroup, AbstractC0101c abstractC0101c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0101c);
    }

    private void q(float f10, float f11) {
        this.f2817u = true;
        this.f2815s.l(this.f2816t, f10, f11);
        this.f2817u = false;
        if (this.f2797a == 1) {
            K(0);
        }
    }

    private float r(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void s(int i10, int i11, int i12, int i13) {
        int left = this.f2816t.getLeft();
        int top = this.f2816t.getTop();
        if (i12 != 0) {
            i10 = this.f2815s.a(this.f2816t, i10, i12);
            H.R(this.f2816t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f2815s.b(this.f2816t, i11, i13);
            H.S(this.f2816t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f2815s.k(this.f2816t, i14, i15, i14 - left, i15 - top);
    }

    private void t(int i10) {
        float[] fArr = this.f2800d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2801e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2802f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2803g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2804h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2805i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2806j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2800d = fArr2;
            this.f2801e = fArr3;
            this.f2802f = fArr4;
            this.f2803g = fArr5;
            this.f2804h = iArr;
            this.f2805i = iArr2;
            this.f2806j = iArr3;
        }
    }

    private boolean v(int i10, int i11, int i12, int i13) {
        int left = this.f2816t.getLeft();
        int top = this.f2816t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f2814r.abortAnimation();
            K(0);
            return false;
        }
        this.f2814r.startScroll(left, top, i14, i15, m(this.f2816t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    private int y(int i10, int i11) {
        int i12 = i10 < this.f2818v.getLeft() + this.f2811o ? 1 : 0;
        if (i11 < this.f2818v.getTop() + this.f2811o) {
            i12 |= 4;
        }
        if (i10 > this.f2818v.getRight() - this.f2811o) {
            i12 |= 2;
        }
        return i11 > this.f2818v.getBottom() - this.f2811o ? i12 | 8 : i12;
    }

    public int A() {
        return this.f2797a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f2816t, i10, i11);
    }

    public boolean C(int i10) {
        return (this.f2807k & (1 << i10)) != 0;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f2808l == null) {
            this.f2808l = VelocityTracker.obtain();
        }
        this.f2808l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewU = u((int) x9, (int) y9);
            I(x9, y9, pointerId);
            Q(viewU, pointerId);
            int i12 = this.f2804h[pointerId];
            int i13 = this.f2813q;
            if ((i12 & i13) != 0) {
                this.f2815s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f2797a == 1) {
                G();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f2797a == 1) {
                if (D(this.f2799c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2799c);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f2802f;
                    int i14 = this.f2799c;
                    int i15 = (int) (x10 - fArr[i14]);
                    int i16 = (int) (y10 - this.f2803g[i14]);
                    s(this.f2816t.getLeft() + i15, this.f2816t.getTop() + i16, i15, i16);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (D(pointerId2)) {
                    float x11 = motionEvent.getX(i11);
                    float y11 = motionEvent.getY(i11);
                    float f10 = x11 - this.f2800d[pointerId2];
                    float f11 = y11 - this.f2801e[pointerId2];
                    H(f10, f11, pointerId2);
                    if (this.f2797a != 1) {
                        View viewU2 = u((int) x11, (int) y11);
                        if (g(viewU2, f10, f11) && Q(viewU2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f2797a == 1) {
                q(0.0f, 0.0f);
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x12 = motionEvent.getX(actionIndex);
            float y12 = motionEvent.getY(actionIndex);
            I(x12, y12, pointerId3);
            if (this.f2797a != 0) {
                if (B((int) x12, (int) y12)) {
                    Q(this.f2816t, pointerId3);
                    return;
                }
                return;
            } else {
                Q(u((int) x12, (int) y12), pointerId3);
                int i17 = this.f2804h[pointerId3];
                int i18 = this.f2813q;
                if ((i17 & i18) != 0) {
                    this.f2815s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f2797a == 1 && pointerId4 == this.f2799c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f2799c) {
                    View viewU3 = u((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f2816t;
                    if (viewU3 == view && Q(view, pointerId5)) {
                        i10 = this.f2799c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                G();
            }
        }
        k(pointerId4);
    }

    void K(int i10) {
        this.f2818v.removeCallbacks(this.f2819w);
        if (this.f2797a != i10) {
            this.f2797a = i10;
            this.f2815s.j(i10);
            if (this.f2797a == 0) {
                this.f2816t = null;
            }
        }
    }

    public void L(int i10) {
        this.f2811o = i10;
    }

    public void M(int i10) {
        this.f2813q = i10;
    }

    public boolean N(int i10, int i11) {
        if (this.f2817u) {
            return v(i10, i11, (int) this.f2808l.getXVelocity(this.f2799c), (int) this.f2808l.getYVelocity(this.f2799c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    public boolean O(MotionEvent motionEvent) {
        View viewU;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f2808l == null) {
            this.f2808l = VelocityTracker.obtain();
        }
        this.f2808l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            I(x9, y9, pointerId);
            View viewU2 = u((int) x9, (int) y9);
            if (viewU2 == this.f2816t && this.f2797a == 2) {
                Q(viewU2, pointerId);
            }
            int i10 = this.f2804h[pointerId];
            int i11 = this.f2813q;
            if ((i10 & i11) != 0) {
                this.f2815s.h(i10 & i11, pointerId);
            }
        } else if (actionMasked == 1) {
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                I(x10, y10, pointerId2);
                int i12 = this.f2797a;
                if (i12 == 0) {
                    int i13 = this.f2804h[pointerId2];
                    int i14 = this.f2813q;
                    if ((i13 & i14) != 0) {
                        this.f2815s.h(i13 & i14, pointerId2);
                    }
                } else if (i12 == 2 && (viewU = u((int) x10, (int) y10)) == this.f2816t) {
                    Q(viewU, pointerId2);
                }
            } else if (actionMasked == 6) {
                k(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f2800d != null && this.f2801e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount; i15++) {
                int pointerId3 = motionEvent.getPointerId(i15);
                if (D(pointerId3)) {
                    float x11 = motionEvent.getX(i15);
                    float y11 = motionEvent.getY(i15);
                    float f10 = x11 - this.f2800d[pointerId3];
                    float f11 = y11 - this.f2801e[pointerId3];
                    View viewU3 = u((int) x11, (int) y11);
                    boolean z9 = viewU3 != null && g(viewU3, f10, f11);
                    if (!z9) {
                        H(f10, f11, pointerId3);
                        if (this.f2797a != 1) {
                            break;
                        }
                    } else {
                        int left = viewU3.getLeft();
                        int i16 = (int) f10;
                        int iA = this.f2815s.a(viewU3, left + i16, i16);
                        int top = viewU3.getTop();
                        int i17 = (int) f11;
                        int iB = this.f2815s.b(viewU3, top + i17, i17);
                        int iD = this.f2815s.d(viewU3);
                        int iE = this.f2815s.e(viewU3);
                        if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                            break;
                        }
                        H(f10, f11, pointerId3);
                        if (this.f2797a != 1 || (z9 && Q(viewU3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            J(motionEvent);
        }
        return this.f2797a == 1;
    }

    public boolean P(View view, int i10, int i11) {
        this.f2816t = view;
        this.f2799c = -1;
        boolean zV = v(i10, i11, 0, 0);
        if (!zV && this.f2797a == 0 && this.f2816t != null) {
            this.f2816t = null;
        }
        return zV;
    }

    boolean Q(View view, int i10) {
        if (view == this.f2816t && this.f2799c == i10) {
            return true;
        }
        if (view == null || !this.f2815s.m(view, i10)) {
            return false;
        }
        this.f2799c = i10;
        c(view, i10);
        return true;
    }

    public void a() {
        b();
        if (this.f2797a == 2) {
            int currX = this.f2814r.getCurrX();
            int currY = this.f2814r.getCurrY();
            this.f2814r.abortAnimation();
            int currX2 = this.f2814r.getCurrX();
            int currY2 = this.f2814r.getCurrY();
            this.f2815s.k(this.f2816t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        K(0);
    }

    public void b() {
        this.f2799c = -1;
        j();
        VelocityTracker velocityTracker = this.f2808l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2808l = null;
        }
    }

    public void c(View view, int i10) {
        if (view.getParent() == this.f2818v) {
            this.f2816t = view;
            this.f2799c = i10;
            this.f2815s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2818v + ")");
    }

    public boolean e(int i10) {
        int length = this.f2800d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (f(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z9 = (i10 & 1) == 1;
        boolean z10 = (i10 & 2) == 2;
        float f10 = this.f2802f[i11] - this.f2800d[i11];
        float f11 = this.f2803g[i11] - this.f2801e[i11];
        if (z9 && z10) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i12 = this.f2798b;
            return f12 > ((float) (i12 * i12));
        }
        if (z9) {
            return Math.abs(f10) > ((float) this.f2798b);
        }
        return z10 && Math.abs(f11) > ((float) this.f2798b);
    }

    public boolean n(boolean z9) {
        if (this.f2797a == 2) {
            boolean zComputeScrollOffset = this.f2814r.computeScrollOffset();
            int currX = this.f2814r.getCurrX();
            int currY = this.f2814r.getCurrY();
            int left = currX - this.f2816t.getLeft();
            int top = currY - this.f2816t.getTop();
            if (left != 0) {
                H.R(this.f2816t, left);
            }
            if (top != 0) {
                H.S(this.f2816t, top);
            }
            if (left != 0 || top != 0) {
                this.f2815s.k(this.f2816t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f2814r.getFinalX() && currY == this.f2814r.getFinalY()) {
                this.f2814r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z9) {
                    this.f2818v.post(this.f2819w);
                } else {
                    K(0);
                }
            }
        }
        return this.f2797a == 2;
    }

    public View u(int i10, int i11) {
        for (int childCount = this.f2818v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2818v.getChildAt(this.f2815s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int w() {
        return this.f2812p;
    }

    public int x() {
        return this.f2811o;
    }

    public int z() {
        return this.f2798b;
    }
}
