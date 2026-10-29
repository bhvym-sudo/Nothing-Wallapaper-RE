package androidx.compose.ui.viewinterop;

import H.h;
import W.B;
import W.d0;
import W.e0;
import W.f0;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1089v;
import androidx.core.view.InterfaceC1088u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.o;
import p079h8.A;
import p082i1.f;
import p082i1.g;
import p111l0.d;
import p111l0.y;
import p170r.InterfaceC1686j;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements InterfaceC1088u, InterfaceC1686j, e0 {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final b f12020L = new b(null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f12021M = 8;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final l f12022N = a.f12044r;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private InterfaceC1163x f12023A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private f f12024B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p219v8.a f12025C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p219v8.a f12026D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private l f12027E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int[] f12028F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f12029G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f12030H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final C1089v f12031I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f12032J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final B f12033K;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f12034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d0 f12035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p219v8.a f12036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p219v8.a f12038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p219v8.a f12039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C.c f12040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l f12041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f12042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private l f12043z;

    static final class a extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f12044r = new a();

        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(p219v8.a aVar) {
            aVar.invoke();
        }

        public final void b(AndroidViewHolder androidViewHolder) {
            Handler handler = androidViewHolder.getHandler();
            final p219v8.a aVar = androidViewHolder.f12025C;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder.a.d(aVar);
                }
            });
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            b((AndroidViewHolder) obj);
            return A.f21846a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p219v8.a aVar) {
        aVar.invoke();
    }

    private final f0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            T.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f12035r.getSnapshotObserver();
    }

    @Override // p170r.InterfaceC1686j
    public void b() {
        this.f12038u.invoke();
        removeAllViewsInLayout();
    }

    public final void d() {
        if (!this.f12032J) {
            this.f12033K.m0();
            return;
        }
        View view = this.f12034q;
        final p219v8.a aVar = this.f12026D;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder.e(aVar);
            }
        });
    }

    public final void f() {
        int i10;
        int i11 = this.f12029G;
        if (i11 == Integer.MIN_VALUE || (i10 = this.f12030H) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // W.e0
    public boolean g() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f12028F);
        int[] iArr = this.f12028F;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f12028F[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final d getDensity() {
        return this.f12042y;
    }

    public final View getInteropView() {
        return this.f12034q;
    }

    public final B getLayoutNode() {
        return this.f12033K;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f12034q.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1163x getLifecycleOwner() {
        return this.f12023A;
    }

    public final C.c getModifier() {
        return this.f12040w;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f12031I.a();
    }

    public final l getOnDensityChanged$ui_release() {
        return this.f12043z;
    }

    public final l getOnModifierChanged$ui_release() {
        return this.f12041x;
    }

    public final l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f12027E;
    }

    public final p219v8.a getRelease() {
        return this.f12039v;
    }

    public final p219v8.a getReset() {
        return this.f12038u;
    }

    public final f getSavedStateRegistryOwner() {
        return this.f12024B;
    }

    public final p219v8.a getUpdate() {
        return this.f12036s;
    }

    public final View getView() {
        return this.f12034q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        d();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f12034q.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12025C.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        this.f12034q.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f12034q.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (this.f12034q.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f12034q.measure(i10, i11);
        setMeasuredDimension(this.f12034q.getMeasuredWidth(), this.f12034q.getMeasuredHeight());
        this.f12029G = i10;
        this.f12030H = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        y.a(c.e(f10), c.e(f11));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        y.a(c.e(f10), c.e(f11));
        throw null;
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            h.a(c.d(i10), c.d(i11));
            c.f(i12);
            throw null;
        }
    }

    @Override // androidx.core.view.InterfaceC1088u
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            h.a(c.d(i10), c.d(i11));
            h.a(c.d(i12), c.d(i13));
            c.f(i14);
            throw null;
        }
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f12031I.c(view, view2, i10, i11);
    }

    @Override // p170r.InterfaceC1686j
    public void onRelease() {
        this.f12039v.invoke();
    }

    @Override // androidx.core.view.InterfaceC1087t
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onStopNestedScroll(View view, int i10) {
        this.f12031I.d(view, i10);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        l lVar = this.f12027E;
        if (lVar != null) {
            lVar.f(Boolean.valueOf(z9));
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public final void setDensity(d dVar) {
        if (dVar != this.f12042y) {
            this.f12042y = dVar;
            l lVar = this.f12043z;
            if (lVar != null) {
                lVar.f(dVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC1163x interfaceC1163x) {
        if (interfaceC1163x != this.f12023A) {
            this.f12023A = interfaceC1163x;
            g0.b(this, interfaceC1163x);
        }
    }

    public final void setModifier(C.c cVar) {
        if (cVar != this.f12040w) {
            this.f12040w = cVar;
            l lVar = this.f12041x;
            if (lVar != null) {
                lVar.f(cVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(l lVar) {
        this.f12043z = lVar;
    }

    public final void setOnModifierChanged$ui_release(l lVar) {
        this.f12041x = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(l lVar) {
        this.f12027E = lVar;
    }

    protected final void setRelease(p219v8.a aVar) {
        this.f12039v = aVar;
    }

    protected final void setReset(p219v8.a aVar) {
        this.f12038u = aVar;
    }

    public final void setSavedStateRegistryOwner(f fVar) {
        if (fVar != this.f12024B) {
            this.f12024B = fVar;
            g.b(this, fVar);
        }
    }

    protected final void setUpdate(p219v8.a aVar) {
        this.f12036s = aVar;
        this.f12037t = true;
        this.f12025C.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.InterfaceC1087t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            h.a(c.d(i10), c.d(i11));
            h.a(c.d(i12), c.d(i13));
            c.f(i14);
            throw null;
        }
    }
}
