package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    static final int[] f14377v0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final Comparator f14378w0 = new a();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final Interpolator f14379x0 = new b();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final m f14380y0 = new m();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f14381A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Drawable f14382B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f14383C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f14384D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f14385E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float f14386F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f14387G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f14388H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f14389I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f14390J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f14391K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f14392L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f14393M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f14394N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14395O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f14396P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f14397Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f14398R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f14399S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f14400T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f14401U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f14402V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private VelocityTracker f14403W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f14404a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f14405b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f14406c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f14407d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f14408e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private EdgeEffect f14409f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private EdgeEffect f14410g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f14411h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f14412i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f14413j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f14414k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private List f14415l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private j f14416m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private j f14417n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private List f14418o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private k f14419p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14420q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f14421q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f14422r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f14423r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f f14424s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private ArrayList f14425s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f14426t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final Runnable f14427t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f14428u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f14429u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Parcelable f14431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ClassLoader f14432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Scroller f14433y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f14434z;

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f14439b - fVar2.f14439b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.z();
        }
    }

    class d implements InterfaceC1090w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f14436a = new Rect();

        d() {
        }

        @Override // androidx.core.view.InterfaceC1090w
        public V onApplyWindowInsets(View view, V v9) {
            V vT = H.T(view, v9);
            if (vT.o()) {
                return vT;
            }
            Rect rect = this.f14436a;
            rect.left = vT.j();
            rect.top = vT.l();
            rect.right = vT.k();
            rect.bottom = vT.i();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                V vF = H.f(ViewPager.this.getChildAt(i10), vT);
                rect.left = Math.min(vF.j(), rect.left);
                rect.top = Math.min(vF.l(), rect.top);
                rect.right = Math.min(vF.k(), rect.right);
                rect.bottom = Math.min(vF.i(), rect.bottom);
            }
            return vT.p(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f14440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f14441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f14442e;

        f() {
        }
    }

    class h extends C1069a {
        h() {
        }

        private boolean c() {
            ViewPager.this.getClass();
            return false;
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(c());
            if (accessibilityEvent.getEventType() == 4096) {
                ViewPager.this.getClass();
            }
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.g0(ViewPager.class.getName());
            dVar.H0(c());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.a(8192);
            }
        }

        @Override // androidx.core.view.C1069a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f14428u + 1);
                return true;
            }
            if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f14428u - 1);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    public interface k {
        void transformPage(View view, float f10);
    }

    public static class l extends H0.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f14450q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Parcelable f14451r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        ClassLoader f14452s;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f14450q + "}";
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f14450q);
            parcel.writeParcelable(this.f14451r, i10);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f14450q = parcel.readInt();
            this.f14451r = parcel.readParcelable(classLoader);
            this.f14452s = classLoader;
        }
    }

    static class m implements Comparator {
        m() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z9 = gVar.f14443a;
            if (z9 != gVar2.f14443a) {
                return z9 ? 1 : -1;
            }
            return gVar.f14447e - gVar2.f14447e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14422r = new ArrayList();
        this.f14424s = new f();
        this.f14426t = new Rect();
        this.f14430v = -1;
        this.f14431w = null;
        this.f14432x = null;
        this.f14385E = -3.4028235E38f;
        this.f14386F = Float.MAX_VALUE;
        this.f14392L = 1;
        this.f14402V = -1;
        this.f14411h0 = true;
        this.f14412i0 = false;
        this.f14427t0 = new c();
        this.f14429u0 = 0;
        q();
    }

    private void B(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f14422r.isEmpty()) {
            if (!this.f14433y.isFinished()) {
                this.f14433y.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f fVarP = p(this.f14428u);
        int iMin = (int) ((fVarP != null ? Math.min(fVarP.f14442e, this.f14386F) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void E(boolean z9) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z9);
        }
    }

    private boolean F() {
        this.f14402V = -1;
        k();
        this.f14409f0.onRelease();
        this.f14410g0.onRelease();
        return this.f14409f0.isFinished() || this.f14410g0.isFinished();
    }

    private void G(int i10, boolean z9, int i11, boolean z10) {
        f fVarP = p(i10);
        int clientWidth = fVarP != null ? (int) (getClientWidth() * Math.max(this.f14385E, Math.min(fVarP.f14442e, this.f14386F))) : 0;
        if (z9) {
            M(clientWidth, 0, i11);
            if (z10) {
                g(i10);
                return;
            }
            return;
        }
        if (z10) {
            g(i10);
        }
        e(false);
        scrollTo(clientWidth, 0);
        x(clientWidth);
    }

    private void N() {
        if (this.f14423r0 != 0) {
            ArrayList arrayList = this.f14425s0;
            if (arrayList == null) {
                this.f14425s0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f14425s0.add(getChildAt(i10));
            }
            Collections.sort(this.f14425s0, f14380y0);
        }
    }

    private void e(boolean z9) {
        boolean z10 = this.f14429u0 == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f14433y.isFinished()) {
                this.f14433y.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f14433y.getCurrX();
                int currY = this.f14433y.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        x(currX);
                    }
                }
            }
        }
        this.f14391K = false;
        for (int i10 = 0; i10 < this.f14422r.size(); i10++) {
            f fVar = (f) this.f14422r.get(i10);
            if (fVar.f14440c) {
                fVar.f14440c = false;
                z10 = true;
            }
        }
        if (z10) {
            if (z9) {
                H.Y(this, this.f14427t0);
            } else {
                this.f14427t0.run();
            }
        }
    }

    private void f(int i10, float f10, int i11) {
        j jVar = this.f14416m0;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List list = this.f14415l0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = (j) this.f14415l0.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f14417n0;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    private void g(int i10) {
        j jVar = this.f14416m0;
        if (jVar != null) {
            jVar.c(i10);
        }
        List list = this.f14415l0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f14415l0.get(i11);
                if (jVar2 != null) {
                    jVar2.c(i10);
                }
            }
        }
        j jVar3 = this.f14417n0;
        if (jVar3 != null) {
            jVar3.c(i10);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i10) {
        j jVar = this.f14416m0;
        if (jVar != null) {
            jVar.b(i10);
        }
        List list = this.f14415l0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f14415l0.get(i11);
                if (jVar2 != null) {
                    jVar2.b(i10);
                }
            }
        }
        j jVar3 = this.f14417n0;
        if (jVar3 != null) {
            jVar3.b(i10);
        }
    }

    private void j(boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z9 ? this.f14421q0 : 0, null);
        }
    }

    private void k() {
        this.f14393M = false;
        this.f14394N = false;
        VelocityTracker velocityTracker = this.f14403W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14403W = null;
        }
    }

    private Rect m(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f o() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f14381A / clientWidth : 0.0f;
        int i11 = 0;
        f fVar = null;
        boolean z9 = true;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f14422r.size()) {
            f fVar2 = (f) this.f14422r.get(i11);
            if (!z9 && fVar2.f14439b != (i10 = i12 + 1)) {
                f fVar3 = this.f14424s;
                fVar3.f14442e = f10 + f12 + f11;
                fVar3.f14439b = i10;
                throw null;
            }
            f10 = fVar2.f14442e;
            float f13 = fVar2.f14441d + f10 + f11;
            if (!z9 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.f14422r.size() - 1) {
                return fVar2;
            }
            i12 = fVar2.f14439b;
            f12 = fVar2.f14441d;
            i11++;
            z9 = false;
            fVar = fVar2;
        }
        return fVar;
    }

    private static boolean r(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean s(float f10, float f11) {
        if (f10 >= this.f14396P || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.f14396P)) && f11 < 0.0f;
        }
        return true;
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.f14390J != z9) {
            this.f14390J = z9;
        }
    }

    private void u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f14402V) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f14398R = motionEvent.getX(i10);
            this.f14402V = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f14403W;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean x(int i10) {
        if (this.f14422r.size() == 0) {
            if (this.f14411h0) {
                return false;
            }
            this.f14413j0 = false;
            t(0, 0.0f, 0);
            if (this.f14413j0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarO = o();
        int clientWidth = getClientWidth();
        int i11 = this.f14381A;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = fVarO.f14439b;
        float f11 = ((i10 / f10) - fVarO.f14442e) / (fVarO.f14441d + (i11 / f10));
        this.f14413j0 = false;
        t(i13, f11, (int) (i12 * f11));
        if (this.f14413j0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean y(float f10) {
        this.f14398R = f10;
        getScrollX();
        getClientWidth();
        f fVar = (f) this.f14422r.get(0);
        ArrayList arrayList = this.f14422r;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        int i10 = fVar.f14439b;
        int i11 = fVar2.f14439b;
        throw null;
    }

    void A(int i10) {
        int i11 = this.f14428u;
        if (i11 != i10) {
            p(i11);
            this.f14428u = i10;
        }
        N();
    }

    public void C(i iVar) {
        List list = this.f14418o0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void D(j jVar) {
        List list = this.f14415l0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void H(int i10, boolean z9) {
        this.f14391K = false;
        I(i10, z9, false);
    }

    void I(int i10, boolean z9, boolean z10) {
        J(i10, z9, z10, 0);
    }

    void J(int i10, boolean z9, boolean z10, int i11) {
        setScrollingCacheEnabled(false);
    }

    j K(j jVar) {
        j jVar2 = this.f14417n0;
        this.f14417n0 = jVar;
        return jVar2;
    }

    public void L(boolean z9, k kVar, int i10) {
        boolean z10 = kVar != null;
        boolean z11 = z10 != (this.f14419p0 != null);
        this.f14419p0 = kVar;
        setChildrenDrawingOrderEnabled(z10);
        if (z10) {
            this.f14423r0 = z9 ? 2 : 1;
            this.f14421q0 = i10;
        } else {
            this.f14423r0 = 0;
        }
        if (z11) {
            z();
        }
    }

    void M(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f14433y;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f14434z ? this.f14433y.getCurrX() : this.f14433y.getStartX();
            this.f14433y.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            e(false);
            z();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f10 = clientWidth / 2;
        float fI = f10 + (i(Math.min(1.0f, (Math.abs(i14) * 1.0f) / clientWidth)) * f10);
        int iAbs = Math.abs(i12);
        if (iAbs <= 0) {
            throw null;
        }
        int iMin = Math.min(Math.round(Math.abs(fI / iAbs) * 1000.0f) * 4, 600);
        this.f14434z = false;
        this.f14433y.startScroll(i13, scrollY, i14, i15, iMin);
        H.X(this);
    }

    public void a(i iVar) {
        if (this.f14418o0 == null) {
            this.f14418o0 = new ArrayList();
        }
        this.f14418o0.add(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        f fVarN;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f14439b == this.f14428u) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f fVarN;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f14439b == this.f14428u) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zR = gVar.f14443a | r(view);
        gVar.f14443a = zR;
        if (!this.f14389I) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zR) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f14446d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(j jVar) {
        if (this.f14415l0 == null) {
            this.f14415l0 = new ArrayList();
        }
        this.f14415l0.add(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    public boolean c(int i10) {
        boolean zV;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zV = v();
            } else if (i10 == 66 || i10 == 2) {
                zV = w();
            } else {
                zV = false;
            }
        } else if (i10 == 17) {
            zV = (viewFindFocus == null || m(this.f14426t, viewFindNextFocus).left < m(this.f14426t, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : v();
        } else if (i10 == 66) {
            zV = (viewFindFocus == null || m(this.f14426t, viewFindNextFocus).left > m(this.f14426t, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : w();
        } else {
            zV = false;
        }
        if (zV) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zV;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f14434z = true;
        if (this.f14433y.isFinished() || !this.f14433y.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f14433y.getCurrX();
        int currY = this.f14433y.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!x(currX)) {
                this.f14433y.abortAnimation();
                scrollTo(0, currY);
            }
        }
        H.X(this);
    }

    protected boolean d(View view, boolean z9, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z9 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || l(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarN;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f14439b == this.f14428u && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zDraw = false;
        if (getOverScrollMode() != 0) {
            this.f14409f0.finish();
            this.f14410g0.finish();
        } else {
            if (!this.f14409f0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f14385E * width);
                this.f14409f0.setSize(height, width);
                zDraw = this.f14409f0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f14410g0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f14386F + 1.0f)) * width2);
                this.f14410g0.setSize(height2, width2);
                zDraw |= this.f14410g0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            H.X(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14382B;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f14423r0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) ((View) this.f14425s0.get(i11)).getLayoutParams()).f14448f;
    }

    public int getCurrentItem() {
        return this.f14428u;
    }

    public int getOffscreenPageLimit() {
        return this.f14392L;
    }

    public int getPageMargin() {
        return this.f14381A;
    }

    float i(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public boolean l(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? v() : c(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? w() : c(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return c(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return c(1);
        }
        return false;
    }

    f n(View view) {
        if (this.f14422r.size() <= 0) {
            return null;
        }
        Object obj = ((f) this.f14422r.get(0)).f14438a;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14411h0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f14427t0);
        Scroller scroller = this.f14433y;
        if (scroller != null && !scroller.isFinished()) {
            this.f14433y.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f14381A <= 0 || this.f14382B == null) {
            return;
        }
        this.f14422r.size();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            F();
            return false;
        }
        if (action != 0) {
            if (this.f14393M) {
                return true;
            }
            if (this.f14394N) {
                return false;
            }
        }
        if (action == 0) {
            float x9 = motionEvent.getX();
            this.f14400T = x9;
            this.f14398R = x9;
            float y9 = motionEvent.getY();
            this.f14401U = y9;
            this.f14399S = y9;
            this.f14402V = motionEvent.getPointerId(0);
            this.f14394N = false;
            this.f14434z = true;
            this.f14433y.computeScrollOffset();
            if (this.f14429u0 != 2 || Math.abs(this.f14433y.getFinalX() - this.f14433y.getCurrX()) <= this.f14407d0) {
                e(false);
                this.f14393M = false;
            } else {
                this.f14433y.abortAnimation();
                this.f14391K = false;
                z();
                this.f14393M = true;
                E(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f14402V;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x10 = motionEvent.getX(iFindPointerIndex);
                float f10 = x10 - this.f14398R;
                float fAbs = Math.abs(f10);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y10 - this.f14401U);
                if (f10 != 0.0f && !s(this.f14398R, f10) && d(this, false, (int) f10, (int) x10, (int) y10)) {
                    this.f14398R = x10;
                    this.f14399S = y10;
                    this.f14394N = true;
                    return false;
                }
                int i11 = this.f14397Q;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f14393M = true;
                    E(true);
                    setScrollState(1);
                    float f11 = this.f14400T;
                    float f12 = this.f14397Q;
                    this.f14398R = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f14399S = y10;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.f14394N = true;
                }
                if (this.f14393M && y(x10)) {
                    H.X(this);
                }
            }
        } else if (action == 6) {
            u(motionEvent);
        }
        if (this.f14403W == null) {
            this.f14403W = VelocityTracker.obtain();
        }
        this.f14403W.addMovement(motionEvent);
        return this.f14393M;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        f fVarN;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f14443a) {
                    int i18 = gVar.f14444b;
                    int i19 = i18 & 7;
                    int i20 = i18 & 112;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f14443a && (fVarN = n(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (fVarN.f14442e * f10)) + paddingLeft;
                    if (gVar2.f14446d) {
                        gVar2.f14446d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * gVar2.f14445c), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, BasicMeasure.EXACTLY));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f14383C = paddingTop;
        this.f14384D = i15 - paddingBottom;
        this.f14414k0 = i16;
        if (this.f14411h0) {
            z10 = false;
            G(this.f14428u, false, 0, false);
        } else {
            z10 = false;
        }
        this.f14411h0 = z10;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f14396P = Math.min(measuredWidth / 10, this.f14395O);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z9 = true;
            int i14 = BasicMeasure.EXACTLY;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f14443a) {
                int i15 = gVar2.f14444b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z10 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z9 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z9 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z9) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f14387G = View.MeasureSpec.makeMeasureSpec(paddingLeft, BasicMeasure.EXACTLY);
        this.f14388H = View.MeasureSpec.makeMeasureSpec(measuredHeight, BasicMeasure.EXACTLY);
        this.f14389I = true;
        z();
        this.f14389I = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f14443a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f14445c), BasicMeasure.EXACTLY), this.f14388H);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f fVarN;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarN = n(childAt)) != null && fVarN.f14439b == this.f14428u && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f14430v = lVar.f14450q;
        this.f14431w = lVar.f14451r;
        this.f14432x = lVar.f14452s;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f14450q = this.f14428u;
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f14381A;
            B(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14408e0) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    f p(int i10) {
        for (int i11 = 0; i11 < this.f14422r.size(); i11++) {
            f fVar = (f) this.f14422r.get(i11);
            if (fVar.f14439b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void q() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f14433y = new Scroller(context, f14379x0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f14397Q = viewConfiguration.getScaledPagingTouchSlop();
        this.f14404a0 = (int) (400.0f * f10);
        this.f14405b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f14409f0 = new EdgeEffect(context);
        this.f14410g0 = new EdgeEffect(context);
        this.f14406c0 = (int) (25.0f * f10);
        this.f14407d0 = (int) (2.0f * f10);
        this.f14395O = (int) (f10 * 16.0f);
        H.g0(this, new h());
        if (H.t(this) == 0) {
            H.q0(this, 1);
        }
        H.u0(this, new d());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f14389I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        this.f14420q = 0;
        List list = this.f14418o0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f14418o0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i) this.f14418o0.get(i10)).a(this, null, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f14391K = false;
        I(i10, !this.f14411h0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f14392L) {
            this.f14392L = i10;
            z();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f14416m0 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f14381A;
        this.f14381A = i10;
        int width = getWidth();
        B(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f14382B = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.f14429u0 == i10) {
            return;
        }
        this.f14429u0 = i10;
        if (this.f14419p0 != null) {
            j(i10 != 0);
        }
        h(i10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    protected void t(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f14414k0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f14443a) {
                    int i13 = gVar.f14444b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        f(i10, f10, i11);
        if (this.f14419p0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((g) childAt2.getLayoutParams()).f14443a) {
                    this.f14419p0.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f14413j0 = true;
    }

    boolean v() {
        int i10 = this.f14428u;
        if (i10 <= 0) {
            return false;
        }
        H(i10 - 1, true);
        return true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14382B;
    }

    boolean w() {
        return false;
    }

    void z() {
        A(this.f14428u);
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f14445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f14446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f14448f;

        public g() {
            super(-1, -1);
            this.f14445c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14445c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f14377v0);
            this.f14444b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(p171r0.a.d(getContext(), i10));
    }
}
