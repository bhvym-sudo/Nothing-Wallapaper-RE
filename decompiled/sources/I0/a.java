package I0;

import C0.d;
import C0.e;
import C0.f;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.Q;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C1069a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Rect f2778A = new Rect(SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final I0.b.a f2779B = new C0099a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final I0.b.InterfaceC0100b f2780C = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AccessibilityManager f2785u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View f2786v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c f2787w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f2781q = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f2782r = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f2783s = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f2784t = new int[2];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f2788x = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f2789y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f2790z = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: I0.a$a, reason: collision with other inner class name */
    class C0099a implements I0.b.a {
        C0099a() {
        }

        @Override // I0.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, Rect rect) {
            dVar.k(rect);
        }
    }

    class b implements I0.b.InterfaceC0100b {
        b() {
        }

        @Override // I0.b.InterfaceC0100b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(Q q9, int i10) {
            return (d) q9.o(i10);
        }

        @Override // I0.b.InterfaceC0100b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(Q q9) {
            return q9.n();
        }
    }

    private class c extends e {
        c() {
        }

        @Override // C0.e
        public d b(int i10) {
            return d.V(a.this.x(i10));
        }

        @Override // C0.e
        public d d(int i10) {
            int i11 = i10 == 2 ? a.this.f2788x : a.this.f2789y;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // C0.e
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.F(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2786v = view;
        this.f2785u = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (H.t(view) == 0) {
            H.q0(view, 1);
        }
    }

    private boolean G(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return J(i10);
        }
        if (i11 == 2) {
            return d(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? z(i10, i11, bundle) : c(i10);
        }
        return I(i10);
    }

    private boolean H(int i10, Bundle bundle) {
        return H.W(this.f2786v, i10, bundle);
    }

    private boolean I(int i10) {
        int i11;
        if (!this.f2785u.isEnabled() || !this.f2785u.isTouchExplorationEnabled() || (i11 = this.f2788x) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            c(i11);
        }
        this.f2788x = i10;
        this.f2786v.invalidate();
        K(i10, 32768);
        return true;
    }

    private void L(int i10) {
        int i11 = this.f2790z;
        if (i11 == i10) {
            return;
        }
        this.f2790z = i10;
        K(i10, Optimizer.OPTIMIZATION_GRAPH_WRAP);
        K(i11, 256);
    }

    private boolean c(int i10) {
        if (this.f2788x != i10) {
            return false;
        }
        this.f2788x = Integer.MIN_VALUE;
        this.f2786v.invalidate();
        K(i10, ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
        return true;
    }

    private boolean e() {
        int i10 = this.f2789y;
        return i10 != Integer.MIN_VALUE && z(i10, 16, null);
    }

    private AccessibilityEvent f(int i10, int i11) {
        return i10 != -1 ? g(i10, i11) : h(i11);
    }

    private AccessibilityEvent g(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        d dVarX = x(i10);
        accessibilityEventObtain.getText().add(dVarX.y());
        accessibilityEventObtain.setContentDescription(dVarX.r());
        accessibilityEventObtain.setScrollable(dVarX.P());
        accessibilityEventObtain.setPassword(dVarX.O());
        accessibilityEventObtain.setEnabled(dVarX.I());
        accessibilityEventObtain.setChecked(dVarX.F());
        B(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(dVarX.o());
        f.c(accessibilityEventObtain, this.f2786v, i10);
        accessibilityEventObtain.setPackageName(this.f2786v.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent h(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f2786v.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private d i(int i10) {
        d dVarU = d.U();
        dVarU.o0(true);
        dVarU.q0(true);
        dVarU.g0("android.view.View");
        Rect rect = f2778A;
        dVarU.c0(rect);
        dVarU.d0(rect);
        dVarU.B0(this.f2786v);
        D(i10, dVarU);
        if (dVarU.y() == null && dVarU.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        dVarU.k(this.f2782r);
        if (this.f2782r.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i11 = dVarU.i();
        if ((i11 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i11 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        dVarU.z0(this.f2786v.getContext().getPackageName());
        dVarU.K0(this.f2786v, i10);
        if (this.f2788x == i10) {
            dVarU.a0(true);
            dVarU.a(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        } else {
            dVarU.a0(false);
            dVarU.a(64);
        }
        boolean z9 = this.f2789y == i10;
        if (z9) {
            dVarU.a(2);
        } else if (dVarU.J()) {
            dVarU.a(1);
        }
        dVarU.r0(z9);
        this.f2786v.getLocationOnScreen(this.f2784t);
        dVarU.l(this.f2781q);
        if (this.f2781q.equals(rect)) {
            dVarU.k(this.f2781q);
            if (dVarU.f515b != -1) {
                d dVarU2 = d.U();
                for (int i12 = dVarU.f515b; i12 != -1; i12 = dVarU2.f515b) {
                    dVarU2.C0(this.f2786v, -1);
                    dVarU2.c0(f2778A);
                    D(i12, dVarU2);
                    dVarU2.k(this.f2782r);
                    Rect rect2 = this.f2781q;
                    Rect rect3 = this.f2782r;
                    rect2.offset(rect3.left, rect3.top);
                }
                dVarU2.Y();
            }
            this.f2781q.offset(this.f2784t[0] - this.f2786v.getScrollX(), this.f2784t[1] - this.f2786v.getScrollY());
        }
        if (this.f2786v.getLocalVisibleRect(this.f2783s)) {
            this.f2783s.offset(this.f2784t[0] - this.f2786v.getScrollX(), this.f2784t[1] - this.f2786v.getScrollY());
            if (this.f2781q.intersect(this.f2783s)) {
                dVarU.d0(this.f2781q);
                if (u(this.f2781q)) {
                    dVarU.S0(true);
                }
            }
        }
        return dVarU;
    }

    private d j() {
        d dVarW = d.W(this.f2786v);
        H.U(this.f2786v, dVarW);
        ArrayList arrayList = new ArrayList();
        s(arrayList);
        if (dVarW.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            dVarW.d(this.f2786v, ((Integer) arrayList.get(i10)).intValue());
        }
        return dVarW;
    }

    private Q n() {
        ArrayList arrayList = new ArrayList();
        s(arrayList);
        Q q9 = new Q();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q9.m(((Integer) arrayList.get(i10)).intValue(), i(((Integer) arrayList.get(i10)).intValue()));
        }
        return q9;
    }

    private void o(int i10, Rect rect) {
        x(i10).k(rect);
    }

    private static Rect t(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean u(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f2786v.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f2786v.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int v(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean w(int i10, Rect rect) {
        d dVar;
        Q qN = n();
        int i11 = this.f2789y;
        d dVar2 = i11 == Integer.MIN_VALUE ? null : (d) qN.i(i11);
        if (i10 == 1 || i10 == 2) {
            dVar = (d) I0.b.d(qN, f2780C, f2779B, dVar2, i10, H.v(this.f2786v) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f2789y;
            if (i12 != Integer.MIN_VALUE) {
                o(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                t(this.f2786v, i10, rect2);
            }
            dVar = (d) I0.b.c(qN, f2780C, f2779B, dVar2, rect2, i10);
        }
        return J(dVar != null ? qN.l(qN.k(dVar)) : Integer.MIN_VALUE);
    }

    protected void A(AccessibilityEvent accessibilityEvent) {
    }

    protected void B(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected void C(d dVar) {
    }

    protected abstract void D(int i10, d dVar);

    protected void E(int i10, boolean z9) {
    }

    boolean F(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? G(i10, i11, bundle) : H(i11, bundle);
    }

    public final boolean J(int i10) {
        int i11;
        if ((!this.f2786v.isFocused() && !this.f2786v.requestFocus()) || (i11 = this.f2789y) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            d(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2789y = i10;
        E(i10, true);
        K(i10, 8);
        return true;
    }

    public final boolean K(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f2785u.isEnabled() || (parent = this.f2786v.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f2786v, f(i10, i11));
    }

    public final boolean d(int i10) {
        if (this.f2789y != i10) {
            return false;
        }
        this.f2789y = Integer.MIN_VALUE;
        E(i10, false);
        K(i10, 8);
        return true;
    }

    @Override // androidx.core.view.C1069a
    public e getAccessibilityNodeProvider(View view) {
        if (this.f2787w == null) {
            this.f2787w = new c();
        }
        return this.f2787w;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (this.f2785u.isEnabled() && this.f2785u.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f2790z == Integer.MIN_VALUE) {
                    return false;
                }
                L(Integer.MIN_VALUE);
                return true;
            }
            int iR = r(motionEvent.getX(), motionEvent.getY());
            L(iR);
            if (iR != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean l(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iV = v(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z9 = false;
                                while (i10 < repeatCount && w(iV, null)) {
                                    i10++;
                                    z9 = true;
                                }
                                return z9;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                e();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    e();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return w(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return w(1, null);
                }
            }
        }
        return false;
    }

    public final int m() {
        return this.f2788x;
    }

    @Override // androidx.core.view.C1069a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        A(accessibilityEvent);
    }

    @Override // androidx.core.view.C1069a
    public void onInitializeAccessibilityNodeInfo(View view, d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        C(dVar);
    }

    public int p() {
        return m();
    }

    public final int q() {
        return this.f2789y;
    }

    protected abstract int r(float f10, float f11);

    protected abstract void s(List list);

    d x(int i10) {
        return i10 == -1 ? j() : i(i10);
    }

    public final void y(boolean z9, int i10, Rect rect) {
        int i11 = this.f2789y;
        if (i11 != Integer.MIN_VALUE) {
            d(i11);
        }
        if (z9) {
            w(i10, rect);
        }
    }

    protected abstract boolean z(int i10, int i11, Bundle bundle);
}
