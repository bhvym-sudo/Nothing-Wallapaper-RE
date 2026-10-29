package androidx.compose.ui.platform;

import I.C0858b;
import I.C0870n;
import I.InterfaceC0869m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View implements W.c0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final c f11813F = new c(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f11814G = 8;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p219v8.p f11815H = b.f11836r;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final ViewOutlineProvider f11816I = new a();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static Method f11817J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static Field f11818K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static boolean f11819L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static boolean f11820M;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Z f11821A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f11822B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f11823C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f11824D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f11825E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AndroidComposeView f11826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final DrawChildContainer f11827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p219v8.p f11828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p219v8.a f11829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C1044c0 f11830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f11831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Rect f11832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f11833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11834y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final C0870n f11835z;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.n.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((ViewLayer) view).f11830u.b();
            kotlin.jvm.internal.n.e(outlineB);
            outline.set(outlineB);
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f11836r = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return p079h8.A.f21846a;
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a() {
            return ViewLayer.f11819L;
        }

        public final boolean b() {
            return ViewLayer.f11820M;
        }

        public final void c(boolean z9) {
            ViewLayer.f11820M = z9;
        }

        public final void d(View view) {
            try {
                if (!a()) {
                    ViewLayer.f11819L = true;
                    ViewLayer.f11817J = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    ViewLayer.f11818K = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = ViewLayer.f11817J;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f11818K;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f11818K;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f11817J;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private c() {
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f11837a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, p219v8.p pVar, p219v8.a aVar) {
        super(androidComposeView.getContext());
        this.f11826q = androidComposeView;
        this.f11827r = drawChildContainer;
        this.f11828s = pVar;
        this.f11829t = aVar;
        this.f11830u = new C1044c0();
        this.f11835z = new C0870n();
        this.f11821A = new Z(f11815H);
        this.f11822B = I.P.f2686a.a();
        this.f11823C = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.f11824D = View.generateViewId();
    }

    private final I.H getManualClipPath() {
        if (!getClipToOutline() || this.f11830u.e()) {
            return null;
        }
        return this.f11830u.d();
    }

    private final void setInvalidated(boolean z9) {
        if (z9 != this.f11833x) {
            this.f11833x = z9;
            this.f11826q.m0(this, z9);
        }
    }

    private final void u() {
        Rect rect;
        if (this.f11831v) {
            Rect rect2 = this.f11832w;
            if (rect2 == null) {
                this.f11832w = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.n.e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f11832w;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void v() {
        setOutlineProvider(this.f11830u.b() != null ? f11816I : null);
    }

    @Override // W.c0
    public void a() {
        setInvalidated(false);
        this.f11826q.y0();
        this.f11828s = null;
        this.f11829t = null;
        this.f11826q.w0(this);
        this.f11827r.removeViewInLayout(this);
    }

    @Override // W.c0
    public void b(p219v8.p pVar, p219v8.a aVar) {
        this.f11827r.addView(this);
        this.f11831v = false;
        this.f11834y = false;
        this.f11822B = I.P.f2686a.a();
        this.f11828s = pVar;
        this.f11829t = aVar;
    }

    @Override // W.c0
    public boolean c(long j9) {
        float fK = H.g.k(j9);
        float fL = H.g.l(j9);
        if (this.f11831v) {
            return 0.0f <= fK && fK < ((float) getWidth()) && 0.0f <= fL && fL < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f11830u.f(j9);
        }
        return true;
    }

    @Override // W.c0
    public void d(InterfaceC0869m interfaceC0869m, L.c cVar) {
        boolean z9 = getElevation() > 0.0f;
        this.f11834y = z9;
        if (z9) {
            interfaceC0869m.n();
        }
        this.f11827r.a(interfaceC0869m, this, getDrawingTime());
        if (this.f11834y) {
            interfaceC0869m.f();
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z9;
        C0870n c0870n = this.f11835z;
        Canvas canvasO = c0870n.a().o();
        c0870n.a().p(canvas);
        C0858b c0858bA = c0870n.a();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z9 = false;
        } else {
            c0858bA.e();
            this.f11830u.a(c0858bA);
            z9 = true;
        }
        p219v8.p pVar = this.f11828s;
        if (pVar != null) {
            pVar.invoke(c0858bA, null);
        }
        if (z9) {
            c0858bA.m();
        }
        c0870n.a().p(canvasO);
        setInvalidated(false);
    }

    @Override // W.c0
    public long e(long j9, boolean z9) {
        if (!z9) {
            return I.C.f(this.f11821A.b(this), j9);
        }
        float[] fArrA = this.f11821A.a(this);
        return fArrA != null ? I.C.f(fArrA, j9) : H.g.f2287b.a();
    }

    @Override // W.c0
    public void f(long j9) {
        int iE = p111l0.q.e(j9);
        int iD = p111l0.q.d(j9);
        if (iE == getWidth() && iD == getHeight()) {
            return;
        }
        setPivotX(I.P.d(this.f11822B) * iE);
        setPivotY(I.P.e(this.f11822B) * iD);
        v();
        layout(getLeft(), getTop(), getLeft() + iE, getTop() + iD);
        u();
        this.f11821A.c();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // W.c0
    public void g(H.e eVar, boolean z9) {
        if (!z9) {
            I.C.g(this.f11821A.b(this), eVar);
            return;
        }
        float[] fArrA = this.f11821A.a(this);
        if (fArrA != null) {
            I.C.g(fArrA, eVar);
        } else {
            eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.f11827r;
    }

    public long getLayerId() {
        return this.f11824D;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f11826q;
    }

    public long getOwnerViewId() {
        return d.a(this.f11826q);
    }

    @Override // W.c0
    public void h(long j9) {
        int iD = p111l0.m.d(j9);
        if (iD != getLeft()) {
            offsetLeftAndRight(iD - getLeft());
            this.f11821A.c();
        }
        int iE = p111l0.m.e(j9);
        if (iE != getTop()) {
            offsetTopAndBottom(iE - getTop());
            this.f11821A.c();
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f11823C;
    }

    @Override // W.c0
    public void i() {
        if (!this.f11833x || f11820M) {
            return;
        }
        f11813F.d(this);
        setInvalidated(false);
    }

    @Override // android.view.View, W.c0
    public void invalidate() {
        if (this.f11833x) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f11826q.invalidate();
    }

    @Override // W.c0
    public void j(I.M m9) {
        p219v8.a aVar;
        int i10 = m9.i() | this.f11825E;
        if ((i10 & 4096) != 0) {
            long jG = m9.G();
            this.f11822B = jG;
            setPivotX(I.P.d(jG) * getWidth());
            setPivotY(I.P.e(this.f11822B) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(m9.d());
        }
        if ((i10 & 2) != 0) {
            setScaleY(m9.u());
        }
        if ((i10 & 4) != 0) {
            setAlpha(m9.a());
        }
        if ((i10 & 8) != 0) {
            setTranslationX(m9.q());
        }
        if ((i10 & 16) != 0) {
            setTranslationY(m9.n());
        }
        if ((i10 & 32) != 0) {
            setElevation(m9.v());
        }
        if ((i10 & Optimizer.OPTIMIZATION_GROUPING) != 0) {
            setRotation(m9.m());
        }
        if ((i10 & 256) != 0) {
            setRotationX(m9.r());
        }
        if ((i10 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0) {
            setRotationY(m9.k());
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
            setCameraDistancePx(m9.p());
        }
        boolean z9 = false;
        boolean z10 = getManualClipPath() != null;
        boolean z11 = m9.e() && m9.y() != I.K.a();
        if ((i10 & 24576) != 0) {
            this.f11831v = m9.e() && m9.y() == I.K.a();
            u();
            setClipToOutline(z11);
        }
        boolean zH = this.f11830u.h(m9.s(), m9.a(), z11, m9.v(), m9.b());
        if (this.f11830u.c()) {
            v();
        }
        boolean z12 = getManualClipPath() != null;
        if (z10 != z12 || (z12 && zH)) {
            invalidate();
        }
        if (!this.f11834y && getElevation() > 0.0f && (aVar = this.f11829t) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f11821A.c();
        }
        if ((i10 & 64) != 0) {
            r0.f11996a.a(this, I.t.d(m9.c()));
        }
        if ((i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            r0.f11996a.b(this, I.t.d(m9.z()));
        }
        if ((131072 & i10) != 0) {
            s0 s0Var = s0.f11999a;
            m9.t();
            s0Var.a(this, null);
        }
        if ((i10 & 32768) != 0) {
            int iF = m9.f();
            I.u.a aVar2 = I.u.f2755a;
            if (I.u.e(iF, aVar2.c())) {
                setLayerType(2, null);
            } else {
                if (I.u.e(iF, aVar2.b())) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.f11823C = z9;
            }
            z9 = true;
            this.f11823C = z9;
        }
        this.f11825E = m9.i();
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    public final boolean t() {
        return this.f11833x;
    }
}
