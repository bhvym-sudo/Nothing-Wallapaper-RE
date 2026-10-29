package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap f12184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f12185b = {p151p0.b.f23585b, p151p0.b.f23586c, p151p0.b.f23597n, p151p0.b.f23608y, p151p0.b.f23571B, p151p0.b.f23572C, p151p0.b.f23573D, p151p0.b.f23574E, p151p0.b.f23575F, p151p0.b.f23576G, p151p0.b.f23587d, p151p0.b.f23588e, p151p0.b.f23589f, p151p0.b.f23590g, p151p0.b.f23591h, p151p0.b.f23592i, p151p0.b.f23593j, p151p0.b.f23594k, p151p0.b.f23595l, p151p0.b.f23596m, p151p0.b.f23598o, p151p0.b.f23599p, p151p0.b.f23600q, p151p0.b.f23601r, p151p0.b.f23602s, p151p0.b.f23603t, p151p0.b.f23604u, p151p0.b.f23605v, p151p0.b.f23606w, p151p0.b.f23607x, p151p0.b.f23609z, p151p0.b.f23570A};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x f12186c = new x() { // from class: androidx.core.view.G
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f12187d = new e();

    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final WeakHashMap f12188q = new WeakHashMap();

        e() {
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void d(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f12188q.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                b(view);
            }
        }

        void c(View view) {
            this.f12188q.remove(view);
            view.removeOnAttachStateChangeListener(this);
            d(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f12190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f12192d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f12191c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f12189a);
            if (this.f12190b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                H.h(view);
                view.setTag(this.f12189a, obj);
                H.Q(view, this.f12192d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f12189a = i10;
            this.f12190b = cls;
            this.f12192d = i11;
            this.f12191c = i12;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            V f12193a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f12194b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC1090w f12195c;

            a(View view, InterfaceC1090w interfaceC1090w) {
                this.f12194b = view;
                this.f12195c = interfaceC1090w;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                V v9 = V.v(windowInsets, view);
                this.f12193a = v9;
                return this.f12195c.onApplyWindowInsets(view, v9).t();
            }
        }

        static V a(View view, V v9, Rect rect) {
            WindowInsets windowInsetsT = v9.t();
            if (windowInsetsT != null) {
                return V.v(view.computeSystemWindowInsets(windowInsetsT, rect), view);
            }
            rect.setEmpty();
            return v9;
        }

        static ColorStateList b(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode c(View view) {
            return view.getBackgroundTintMode();
        }

        static float d(View view) {
            return view.getElevation();
        }

        static String e(View view) {
            return view.getTransitionName();
        }

        static float f(View view) {
            return view.getTranslationZ();
        }

        static float g(View view) {
            return view.getZ();
        }

        static boolean h(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void k(View view, float f10) {
            view.setElevation(f10);
        }

        static void l(View view, InterfaceC1090w interfaceC1090w) {
            if (interfaceC1090w == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(p151p0.b.f23583N));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC1090w));
            }
        }

        static void m(View view, String str) {
            view.setTransitionName(str);
        }

        static void n(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void o(View view, float f10) {
            view.setZ(f10);
        }

        static void p(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static V a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            V vU = V.u(rootWindowInsets);
            vU.s(vU);
            vU.d(view.getRootView());
            return vU;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z9) {
            view.setAccessibilityHeading(z9);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z9) {
            view.setScreenReaderFocusable(z9);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static class n {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static W b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return W.g(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static V A(View view) {
        return i.a(view);
    }

    public static void A0(View view, float f10) {
        h.n(view, f10);
    }

    public static CharSequence B(View view) {
        return (CharSequence) D0().e(view);
    }

    public static void B0(View view, U.b bVar) {
        U.c(view, bVar);
    }

    public static String C(View view) {
        return h.e(view);
    }

    public static void C0(View view, float f10) {
        h.o(view, f10);
    }

    public static float D(View view) {
        return h.f(view);
    }

    private static f D0() {
        return new c(p151p0.b.f23582M, CharSequence.class, 64, 30);
    }

    public static W E(View view) {
        return n.b(view);
    }

    public static void E0(View view) {
        h.p(view);
    }

    public static int F(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float G(View view) {
        return h.g(view);
    }

    public static boolean H(View view) {
        return k(view) != null;
    }

    public static boolean I(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean J(View view) {
        return view.hasTransientState();
    }

    public static boolean K(View view) {
        Boolean bool = (Boolean) a().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean L(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean M(View view) {
        return view.isLaidOut();
    }

    public static boolean N(View view) {
        return h.h(view);
    }

    public static boolean O(View view) {
        return view.isPaddingRelative();
    }

    public static boolean P(View view) {
        Boolean bool = (Boolean) f0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void Q(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z9 = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z9) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z9 ? 32 : RecyclerView.ItemAnimator.FLAG_MOVED);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z9) {
                    accessibilityEventObtain.getText().add(l(view));
                    r0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void R(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void S(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static V T(View view, V v9) {
        WindowInsets windowInsetsT = v9.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsT);
            if (!windowInsetsB.equals(windowInsetsT)) {
                return V.v(windowInsetsB, view);
            }
        }
        return v9;
    }

    public static void U(View view, C0.d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.T0());
    }

    private static f V() {
        return new b(p151p0.b.f23580K, CharSequence.class, 8, 28);
    }

    public static boolean W(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static void X(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void Y(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void Z(View view, Runnable runnable, long j9) {
        view.postOnAnimationDelayed(runnable, j9);
    }

    private static f a() {
        return new d(p151p0.b.f23579J, Boolean.class, 28);
    }

    public static void a0(View view, int i10) {
        b0(i10, view);
        Q(view, 0);
    }

    public static int b(View view, CharSequence charSequence, C0.g gVar) {
        int iN = n(view, charSequence);
        if (iN != -1) {
            c(view, new C0.d.a(iN, charSequence, gVar));
        }
        return iN;
    }

    private static void b0(int i10, View view) {
        List listM = m(view);
        for (int i11 = 0; i11 < listM.size(); i11++) {
            if (((C0.d.a) listM.get(i11)).b() == i10) {
                listM.remove(i11);
                return;
            }
        }
    }

    private static void c(View view, C0.d.a aVar) {
        h(view);
        b0(aVar.b(), view);
        m(view).add(aVar);
        Q(view, 0);
    }

    public static void c0(View view, C0.d.a aVar, CharSequence charSequence, C0.g gVar) {
        if (gVar == null && charSequence == null) {
            a0(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, gVar));
        }
    }

    public static O d(View view) {
        if (f12184a == null) {
            f12184a = new WeakHashMap();
        }
        O o9 = (O) f12184a.get(view);
        if (o9 != null) {
            return o9;
        }
        O o10 = new O(view);
        f12184a.put(view, o10);
        return o10;
    }

    public static void d0(View view) {
        g.c(view);
    }

    public static V e(View view, V v9, Rect rect) {
        return h.a(view, v9, rect);
    }

    public static void e0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
    }

    public static V f(View view, V v9) {
        WindowInsets windowInsetsT = v9.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsT);
            if (!windowInsetsA.equals(windowInsetsT)) {
                return V.v(windowInsetsA, view);
            }
        }
        return v9;
    }

    private static f f0() {
        return new a(p151p0.b.f23581L, Boolean.class, 28);
    }

    static boolean g(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void g0(View view, C1069a c1069a) {
        if (c1069a == null && (k(view) instanceof C1069a.C0380a)) {
            c1069a = new C1069a();
        }
        r0(view);
        view.setAccessibilityDelegate(c1069a == null ? null : c1069a.getBridge());
    }

    static void h(View view) {
        C1069a c1069aJ = j(view);
        if (c1069aJ == null) {
            c1069aJ = new C1069a();
        }
        g0(view, c1069aJ);
    }

    public static void h0(View view, boolean z9) {
        a().f(view, Boolean.valueOf(z9));
    }

    public static int i() {
        return View.generateViewId();
    }

    public static void i0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static C1069a j(View view) {
        View.AccessibilityDelegate accessibilityDelegateK = k(view);
        if (accessibilityDelegateK == null) {
            return null;
        }
        return accessibilityDelegateK instanceof C1069a.C0380a ? ((C1069a.C0380a) accessibilityDelegateK).f12246a : new C1069a(accessibilityDelegateK);
    }

    public static void j0(View view, CharSequence charSequence) {
        V().f(view, charSequence);
        if (charSequence != null) {
            f12187d.a(view);
        } else {
            f12187d.c(view);
        }
    }

    private static View.AccessibilityDelegate k(View view) {
        return m.a(view);
    }

    public static void k0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static CharSequence l(View view) {
        return (CharSequence) V().e(view);
    }

    public static void l0(View view, ColorStateList colorStateList) {
        h.i(view, colorStateList);
    }

    private static List m(View view) {
        int i10 = p151p0.b.f23577H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void m0(View view, PorterDuff.Mode mode) {
        h.j(view, mode);
    }

    private static int n(View view, CharSequence charSequence) {
        List listM = m(view);
        for (int i10 = 0; i10 < listM.size(); i10++) {
            if (TextUtils.equals(charSequence, ((C0.d.a) listM.get(i10)).c())) {
                return ((C0.d.a) listM.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f12185b;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z9 = true;
            for (int i14 = 0; i14 < listM.size(); i14++) {
                z9 &= ((C0.d.a) listM.get(i14)).b() != i13;
            }
            if (z9) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void n0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static ColorStateList o(View view) {
        return h.b(view);
    }

    public static void o0(View view, float f10) {
        h.k(view, f10);
    }

    public static PorterDuff.Mode p(View view) {
        return h.c(view);
    }

    public static void p0(View view, boolean z9) {
        view.setFitsSystemWindows(z9);
    }

    public static Display q(View view) {
        return view.getDisplay();
    }

    public static void q0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static float r(View view) {
        return h.d(view);
    }

    private static void r0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static boolean s(View view) {
        return view.getFitsSystemWindows();
    }

    public static void s0(View view, int i10) {
        k.b(view, i10);
    }

    public static int t(View view) {
        return view.getImportantForAccessibility();
    }

    public static void t0(View view, int i10) {
        view.setLabelFor(i10);
    }

    public static int u(View view) {
        return k.a(view);
    }

    public static void u0(View view, InterfaceC1090w interfaceC1090w) {
        h.l(view, interfaceC1090w);
    }

    public static int v(View view) {
        return view.getLayoutDirection();
    }

    public static void v0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static int w(View view) {
        return view.getMinimumHeight();
    }

    public static void w0(View view, z zVar) {
        j.a(view, (PointerIcon) (zVar != null ? zVar.a() : null));
    }

    public static int x(View view) {
        return view.getMinimumWidth();
    }

    public static void x0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static int y(View view) {
        return view.getPaddingEnd();
    }

    public static void y0(View view, CharSequence charSequence) {
        D0().f(view, charSequence);
    }

    public static int z(View view) {
        return view.getPaddingStart();
    }

    public static void z0(View view, String str) {
        h.m(view, str);
    }
}
