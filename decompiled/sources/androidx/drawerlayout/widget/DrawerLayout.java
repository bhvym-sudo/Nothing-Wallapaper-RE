package androidx.drawerlayout.widget;

import C0.d;
import C0.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.app.o;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AbstractC1077i;
import androidx.core.view.H;
import androidx.core.view.V;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final int[] f12704V = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    static final int[] f12705W = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final boolean f12706a0 = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final boolean f12707b0 = true;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static boolean f12708c0 = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f12709A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f12710B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f12711C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f12712D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f12713E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private List f12714F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f12715G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f12716H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Drawable f12717I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Drawable f12718J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Drawable f12719K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Object f12720L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f12721M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Drawable f12722N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Drawable f12723O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Drawable f12724P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Drawable f12725Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final ArrayList f12726R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Rect f12727S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Matrix f12728T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final g f12729U;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f12730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f12732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f12733t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Paint f12734u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final I0.c f12735v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final I0.c f12736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f12737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f12738y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f12739z;

    public interface a {
    }

    private boolean A(float f10, float f11, View view) {
        if (this.f12727S == null) {
            this.f12727S = new Rect();
        }
        view.getHitRect(this.f12727S);
        return this.f12727S.contains((int) f10, (int) f11);
    }

    private void B(Drawable drawable, int i10) {
        if (drawable == null || !p201u0.a.h(drawable)) {
            return;
        }
        p201u0.a.m(drawable, i10);
    }

    private Drawable F() {
        int iV = H.v(this);
        if (iV == 0) {
            Drawable drawable = this.f12722N;
            if (drawable != null) {
                B(drawable, iV);
                return this.f12722N;
            }
        } else {
            Drawable drawable2 = this.f12723O;
            if (drawable2 != null) {
                B(drawable2, iV);
                return this.f12723O;
            }
        }
        return this.f12724P;
    }

    private Drawable G() {
        int iV = H.v(this);
        if (iV == 0) {
            Drawable drawable = this.f12723O;
            if (drawable != null) {
                B(drawable, iV);
                return this.f12723O;
            }
        } else {
            Drawable drawable2 = this.f12722N;
            if (drawable2 != null) {
                B(drawable2, iV);
                return this.f12722N;
            }
        }
        return this.f12725Q;
    }

    private void H() {
        if (f12707b0) {
            return;
        }
        this.f12718J = F();
        this.f12719K = G();
    }

    private void K(View view) {
        d.a aVar = d.a.f559y;
        H.a0(view, aVar.b());
        if (!x(view) || o(view) == 2) {
            return;
        }
        H.c0(view, aVar, null, this.f12729U);
    }

    private void L(View view, boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z9 || y(childAt)) && !(z9 && childAt == view)) {
                H.q0(childAt, 4);
            } else {
                H.q0(childAt, 1);
            }
        }
    }

    private boolean j(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventR = r(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventR);
            motionEventR.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent r(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f12728T == null) {
                this.f12728T = new Matrix();
            }
            matrix.invert(this.f12728T);
            motionEventObtain.transform(this.f12728T);
        }
        return motionEventObtain;
    }

    static String s(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean t(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean u() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((b) getChildAt(i10).getLayoutParams()).f12742c) {
                return true;
            }
        }
        return false;
    }

    private boolean v() {
        return m() != null;
    }

    void C(View view, float f10) {
        float fQ = q(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fQ * width));
        if (!b(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        J(view, f10);
    }

    public void D(View view) {
        E(view, true);
    }

    public void E(View view, boolean z9) {
        if (!y(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        b bVar = (b) view.getLayoutParams();
        if (this.f12739z) {
            bVar.f12741b = 1.0f;
            bVar.f12743d = 1;
            L(view, true);
            K(view);
        } else if (z9) {
            bVar.f12743d |= 2;
            if (b(view, 3)) {
                this.f12735v.P(view, 0, view.getTop());
            } else {
                this.f12736w.P(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            C(view, 1.0f);
            M(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void I(int i10, int i11) {
        View viewK;
        int iB = AbstractC1077i.b(i11, H.v(this));
        if (i11 == 3) {
            this.f12709A = i10;
        } else if (i11 == 5) {
            this.f12710B = i10;
        } else if (i11 == 8388611) {
            this.f12711C = i10;
        } else if (i11 == 8388613) {
            this.f12712D = i10;
        }
        if (i10 != 0) {
            (iB == 3 ? this.f12735v : this.f12736w).b();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewK = k(iB)) != null) {
                D(viewK);
                return;
            }
            return;
        }
        View viewK2 = k(iB);
        if (viewK2 != null) {
            c(viewK2);
        }
    }

    void J(View view, float f10) {
        b bVar = (b) view.getLayoutParams();
        if (f10 == bVar.f12741b) {
            return;
        }
        bVar.f12741b = f10;
        i(view, f10);
    }

    void M(int i10, View view) {
        int i11;
        int size;
        int iA = this.f12735v.A();
        int iA2 = this.f12736w.A();
        if (iA == 1 || iA2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iA != 2 && iA2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((b) view.getLayoutParams()).f12741b;
            if (f10 == 0.0f) {
                g(view);
            } else if (f10 == 1.0f) {
                h(view);
            }
        }
        if (i11 != this.f12737x) {
            this.f12737x = i11;
            List list = this.f12714F;
            if (list == null || (size = list.size() - 1) < 0) {
                return;
            }
            o.a(this.f12714F.get(size));
            throw null;
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f12714F == null) {
            this.f12714F = new ArrayList();
        }
        this.f12714F.add(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!y(childAt)) {
                this.f12726R.add(childAt);
            } else if (x(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z9 = true;
            }
        }
        if (!z9) {
            int size = this.f12726R.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) this.f12726R.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.f12726R.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (l() != null || y(view)) {
            H.q0(view, 4);
        } else {
            H.q0(view, 1);
        }
        if (f12706a0) {
            return;
        }
        H.g0(view, null);
    }

    boolean b(View view, int i10) {
        return (p(view) & i10) == i10;
    }

    public void c(View view) {
        d(view, true);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((b) getChildAt(i10).getLayoutParams()).f12741b);
        }
        this.f12733t = fMax;
        boolean zN = this.f12735v.n(true);
        boolean zN2 = this.f12736w.n(true);
        if (zN || zN2) {
            H.X(this);
        }
    }

    public void d(View view, boolean z9) {
        if (!y(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        b bVar = (b) view.getLayoutParams();
        if (this.f12739z) {
            bVar.f12741b = 0.0f;
            bVar.f12743d = 0;
        } else if (z9) {
            bVar.f12743d |= 4;
            if (b(view, 3)) {
                this.f12735v.P(view, -view.getWidth(), view.getTop());
            } else {
                this.f12736w.P(view, getWidth(), view.getTop());
            }
        } else {
            C(view, 0.0f);
            M(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f12733t <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (A(x9, y9, childAt) && !w(childAt) && j(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j9) {
        int height = getHeight();
        boolean zW = w(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zW) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && t(childAt) && y(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j9);
        canvas.restoreToCount(iSave);
        float f10 = this.f12733t;
        if (f10 > 0.0f && zW) {
            int i13 = this.f12732s;
            this.f12734u.setColor((i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f12734u);
            return zDrawChild;
        }
        if (this.f12718J != null && b(view, 3)) {
            int intrinsicWidth = this.f12718J.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f12735v.x(), 1.0f));
            this.f12718J.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f12718J.setAlpha((int) (fMax * 255.0f));
            this.f12718J.draw(canvas);
            return zDrawChild;
        }
        if (this.f12719K != null && b(view, 5)) {
            int intrinsicWidth2 = this.f12719K.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f12736w.x(), 1.0f));
            this.f12719K.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f12719K.setAlpha((int) (fMax2 * 255.0f));
            this.f12719K.draw(canvas);
        }
        return zDrawChild;
    }

    public void e() {
        f(false);
    }

    void f(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVar = (b) childAt.getLayoutParams();
            if (y(childAt) && (!z9 || bVar.f12742c)) {
                int width = childAt.getWidth();
                if (b(childAt, 3)) {
                    this.f12735v.P(childAt, -width, childAt.getTop());
                } else {
                    this.f12736w.P(childAt, getWidth(), childAt.getTop());
                }
                bVar.f12742c = false;
            }
        }
        throw null;
    }

    void g(View view) {
        View rootView;
        int size;
        b bVar = (b) view.getLayoutParams();
        if ((bVar.f12743d & 1) == 1) {
            bVar.f12743d = 0;
            List list = this.f12714F;
            if (list != null && (size = list.size() - 1) >= 0) {
                o.a(this.f12714F.get(size));
                throw null;
            }
            L(view, false);
            K(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public float getDrawerElevation() {
        if (f12707b0) {
            return this.f12730q;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f12717I;
    }

    void h(View view) {
        int size;
        b bVar = (b) view.getLayoutParams();
        if ((bVar.f12743d & 1) == 0) {
            bVar.f12743d = 1;
            List list = this.f12714F;
            if (list != null && (size = list.size() - 1) >= 0) {
                o.a(this.f12714F.get(size));
                throw null;
            }
            L(view, true);
            K(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void i(View view, float f10) {
        int size;
        List list = this.f12714F;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        o.a(this.f12714F.get(size));
        throw null;
    }

    View k(int i10) {
        int iB = AbstractC1077i.b(i10, H.v(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((p(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    View l() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((b) childAt.getLayoutParams()).f12743d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View m() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (y(childAt) && z(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int n(int i10) {
        int iV = H.v(this);
        if (i10 == 3) {
            int i11 = this.f12709A;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iV == 0 ? this.f12711C : this.f12712D;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f12710B;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iV == 0 ? this.f12712D : this.f12711C;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f12711C;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iV == 0 ? this.f12709A : this.f12710B;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f12712D;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iV == 0 ? this.f12710B : this.f12709A;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int o(View view) {
        if (y(view)) {
            return n(((b) view.getLayoutParams()).f12740a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12739z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12739z = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f12721M || this.f12717I == null) {
            return;
        }
        Object obj = this.f12720L;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f12717I.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f12717I.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        View viewU;
        int actionMasked = motionEvent.getActionMasked();
        boolean zO = this.f12735v.O(motionEvent) | this.f12736w.O(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                f(true);
                this.f12713E = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    f(true);
                    this.f12713E = false;
                }
            } else if (this.f12735v.e(3)) {
                throw null;
            }
            z9 = false;
        } else {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            this.f12715G = x9;
            this.f12716H = y9;
            z9 = this.f12733t > 0.0f && (viewU = this.f12735v.u((int) x9, (int) y9)) != null && w(viewU);
            this.f12713E = false;
        }
        return zO || z9 || u() || this.f12713E;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !v()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewM = m();
        if (viewM != null && o(viewM) == 0) {
            e();
        }
        return viewM != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z10 = true;
        this.f12738y = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (w(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) bVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) bVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (bVar.f12741b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i18 = i15 - ((int) (bVar.f12741b * f12));
                        f10 = (i15 - i18) / f12;
                        i14 = i18;
                    }
                    boolean z11 = f10 != bVar.f12741b ? z10 : false;
                    int i19 = bVar.f12740a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                            if (i23 > i20 - i24) {
                                i21 = (i20 - i24) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
                    }
                    if (z11) {
                        J(childAt, f10);
                    }
                    int i27 = bVar.f12741b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z10 = true;
        }
        if (f12708c0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            p191t0.b bVarH = V.u(rootWindowInsets).h();
            I0.c cVar = this.f12735v;
            cVar.L(Math.max(cVar.w(), bVarH.f27862a));
            I0.c cVar2 = this.f12736w;
            cVar2.L(Math.max(cVar2.w(), bVarH.f27864c));
        }
        this.f12738y = false;
        this.f12739z = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z9 = this.f12720L != null && H.s(this);
        int iV = H.v(this);
        int childCount = getChildCount();
        boolean z10 = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                if (z9) {
                    int iB = AbstractC1077i.b(bVar.f12740a, iV);
                    if (H.s(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f12720L;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f12720L;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) bVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (w(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) bVar).leftMargin) - ((ViewGroup.MarginLayoutParams) bVar).rightMargin, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) bVar).topMargin) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, BasicMeasure.EXACTLY));
                } else {
                    if (!y(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f12707b0) {
                        float fR = H.r(childAt);
                        float f10 = this.f12730q;
                        if (fR != f10) {
                            H.o0(childAt, f10);
                        }
                    }
                    int iP = p(childAt) & 7;
                    boolean z12 = iP == 3;
                    if ((z12 && z10) || (!z12 && z11)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + s(iP) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z12) {
                        z10 = true;
                    } else {
                        z11 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f12731r + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, ((ViewGroup.MarginLayoutParams) bVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewK;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        int i10 = cVar.f12744q;
        if (i10 != 0 && (viewK = k(i10)) != null) {
            D(viewK);
        }
        int i11 = cVar.f12745r;
        if (i11 != 3) {
            I(i11, 3);
        }
        int i12 = cVar.f12746s;
        if (i12 != 3) {
            I(i12, 5);
        }
        int i13 = cVar.f12747t;
        if (i13 != 3) {
            I(i13, 8388611);
        }
        int i14 = cVar.f12748u;
        if (i14 != 3) {
            I(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        H();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            b bVar = (b) getChildAt(i10).getLayoutParams();
            int i11 = bVar.f12743d;
            boolean z9 = i11 == 1;
            boolean z10 = i11 == 2;
            if (z9 || z10) {
                cVar.f12744q = bVar.f12740a;
                break;
            }
        }
        cVar.f12745r = this.f12709A;
        cVar.f12746s = this.f12710B;
        cVar.f12747t = this.f12711C;
        cVar.f12748u = this.f12712D;
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        View viewL;
        this.f12735v.F(motionEvent);
        this.f12736w.F(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            this.f12715G = x9;
            this.f12716H = y9;
            this.f12713E = false;
        } else if (action == 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            View viewU = this.f12735v.u((int) x10, (int) y10);
            if (viewU != null && w(viewU)) {
                float f10 = x10 - this.f12715G;
                float f11 = y10 - this.f12716H;
                int iZ = this.f12735v.z();
                z9 = (f10 * f10) + (f11 * f11) >= ((float) (iZ * iZ)) || (viewL = l()) == null || o(viewL) == 2;
            }
            f(z9);
        } else if (action == 3) {
            f(true);
            this.f12713E = false;
        }
        return true;
    }

    int p(View view) {
        return AbstractC1077i.b(((b) view.getLayoutParams()).f12740a, H.v(this));
    }

    float q(View view) {
        return ((b) view.getLayoutParams()).f12741b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9) {
            f(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f12738y) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.f12730q = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (y(childAt)) {
                H.o0(childAt, this.f12730q);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(a aVar) {
        if (aVar != null) {
            a(aVar);
        }
    }

    public void setDrawerLockMode(int i10) {
        I(i10, 3);
        I(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f12732s = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f12717I = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f12717I = new ColorDrawable(i10);
        invalidate();
    }

    boolean w(View view) {
        return ((b) view.getLayoutParams()).f12740a == 0;
    }

    public boolean x(View view) {
        if (y(view)) {
            return (((b) view.getLayoutParams()).f12743d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean y(View view) {
        int iB = AbstractC1077i.b(((b) view.getLayoutParams()).f12740a, H.v(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean z(View view) {
        if (y(view)) {
            return ((b) view.getLayoutParams()).f12741b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setStatusBarBackground(int i10) {
        this.f12717I = i10 != 0 ? p171r0.a.d(getContext(), i10) : null;
        invalidate();
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f12741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12743d;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12740a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f12705W);
            this.f12740a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f12740a = 0;
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f12740a = 0;
            this.f12740a = bVar.f12740a;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12740a = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12740a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    protected static class c extends H0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f12744q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f12745r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f12746s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f12747t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f12748u;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12744q = 0;
            this.f12744q = parcel.readInt();
            this.f12745r = parcel.readInt();
            this.f12746s = parcel.readInt();
            this.f12747t = parcel.readInt();
            this.f12748u = parcel.readInt();
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f12744q);
            parcel.writeInt(this.f12745r);
            parcel.writeInt(this.f12746s);
            parcel.writeInt(this.f12747t);
            parcel.writeInt(this.f12748u);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
            this.f12744q = 0;
        }
    }
}
