package L;

import H.m;
import I.AbstractC0859c;
import I.AbstractC0867k;
import I.AbstractC0874s;
import I.C0858b;
import I.C0870n;
import I.InterfaceC0869m;
import I.L;
import I.r;
import I.t;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import kotlin.jvm.internal.AbstractC1457h;
import p111l0.q;
import p111l0.s;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class e implements androidx.compose.ui.graphics.layer.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f4235A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f4236B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0870n f4238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K.a f4239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RenderNode f4240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f4241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f4242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f4243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f4245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f4247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f4248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f4249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f4250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f4251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f4252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f4253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f4255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f4256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f4257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f4258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f4260y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f4261z;

    public e(long j9, C0870n c0870n, K.a aVar) {
        this.f4237b = j9;
        this.f4238c = c0870n;
        this.f4239d = aVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f4240e = renderNode;
        this.f4241f = m.f2308a.b();
        renderNode.setClipToBounds(false);
        b.a aVar2 = b.f4204a;
        P(renderNode, aVar2.a());
        this.f4245j = 1.0f;
        this.f4246k = AbstractC0867k.f2708a.B();
        this.f4247l = H.g.f2287b.b();
        this.f4248m = 1.0f;
        this.f4249n = 1.0f;
        r.a aVar3 = r.f2740b;
        this.f4253r = aVar3.a();
        this.f4254s = aVar3.a();
        this.f4258w = 8.0f;
        this.f4235A = aVar2.a();
        this.f4236B = true;
    }

    private final void O() {
        boolean z9 = false;
        boolean z10 = Q() && !this.f4244i;
        if (Q() && this.f4244i) {
            z9 = true;
        }
        if (z10 != this.f4260y) {
            this.f4260y = z10;
            this.f4240e.setClipToBounds(z10);
        }
        if (z9 != this.f4261z) {
            this.f4261z = z9;
            this.f4240e.setClipToOutline(z9);
        }
    }

    private final void P(RenderNode renderNode, int i10) {
        b.a aVar = b.f4204a;
        if (b.e(i10, aVar.c())) {
            renderNode.setUseCompositingLayer(true, this.f4242g);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.e(i10, aVar.b())) {
            renderNode.setUseCompositingLayer(false, this.f4242g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f4242g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean R() {
        if (b.e(B(), b.f4204a.c()) || S()) {
            return true;
        }
        z();
        return false;
    }

    private final boolean S() {
        if (!AbstractC0867k.E(w(), AbstractC0867k.f2708a.B())) {
            return true;
        }
        h();
        return false;
    }

    private final void T() {
        if (R()) {
            P(this.f4240e, b.f4204a.c());
        } else {
            P(this.f4240e, B());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void A(Outline outline, long j9) {
        this.f4240e.setOutline(outline);
        this.f4244i = outline != null;
        O();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public int B() {
        return this.f4235A;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void C(int i10, int i11, long j9) {
        this.f4240e.setPosition(i10, i11, q.e(j9) + i10, q.d(j9) + i11);
        this.f4241f = p111l0.r.c(j9);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void D(long j9) {
        this.f4247l = j9;
        if (H.h.d(j9)) {
            this.f4240e.resetPivot();
        } else {
            this.f4240e.setPivotX(H.g.k(j9));
            this.f4240e.setPivotY(H.g.l(j9));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public long E() {
        return this.f4253r;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void F(InterfaceC0869m interfaceC0869m) {
        AbstractC0859c.c(interfaceC0869m).drawRenderNode(this.f4240e);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void G(p111l0.d dVar, s sVar, c cVar, l lVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f4240e.beginRecording();
        try {
            C0870n c0870n = this.f4238c;
            Canvas canvasO = c0870n.a().o();
            c0870n.a().p(recordingCanvasBeginRecording);
            C0858b c0858bA = c0870n.a();
            K.d dVarE = this.f4239d.E();
            dVarE.g(dVar);
            dVarE.h(sVar);
            dVarE.d(cVar);
            dVarE.e(this.f4241f);
            dVarE.j(c0858bA);
            lVar.f(this.f4239d);
            c0870n.a().p(canvasO);
            this.f4240e.endRecording();
            x(false);
        } catch (Throwable th) {
            this.f4240e.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public long H() {
        return this.f4254s;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void I(long j9) {
        this.f4253r = j9;
        this.f4240e.setAmbientShadowColor(t.d(j9));
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void J(boolean z9) {
        this.f4259x = z9;
        O();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void K(int i10) {
        this.f4235A = i10;
        T();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void L(long j9) {
        this.f4254s = j9;
        this.f4240e.setSpotShadowColor(t.d(j9));
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public Matrix M() {
        Matrix matrix = this.f4243h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4243h = matrix;
        }
        this.f4240e.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float N() {
        return this.f4252q;
    }

    public boolean Q() {
        return this.f4259x;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void a(float f10) {
        this.f4245j = f10;
        this.f4240e.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float b() {
        return this.f4245j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void c(float f10) {
        this.f4256u = f10;
        this.f4240e.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float d() {
        return this.f4248m;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void e(float f10) {
        this.f4257v = f10;
        this.f4240e.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void f(float f10) {
        this.f4251p = f10;
        this.f4240e.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void g() {
        this.f4240e.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public AbstractC0874s h() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void i(float f10) {
        this.f4249n = f10;
        this.f4240e.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void j(L l9) {
        k.f4267a.a(this.f4240e, l9);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float k() {
        return this.f4256u;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public boolean l() {
        return this.f4240e.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float m() {
        return this.f4257v;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float n() {
        return this.f4251p;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void o(float f10) {
        this.f4248m = f10;
        this.f4240e.setScaleX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float p() {
        return this.f4258w;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float q() {
        return this.f4250o;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float r() {
        return this.f4255t;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void s(float f10) {
        this.f4250o = f10;
        this.f4240e.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void t(float f10) {
        this.f4258w = f10;
        this.f4240e.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public float u() {
        return this.f4249n;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void v(float f10) {
        this.f4255t = f10;
        this.f4240e.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public int w() {
        return this.f4246k;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void x(boolean z9) {
        this.f4236B = z9;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public void y(float f10) {
        this.f4252q = f10;
        this.f4240e.setElevation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public L z() {
        return null;
    }

    public /* synthetic */ e(long j9, C0870n c0870n, K.a aVar, int i10, AbstractC1457h abstractC1457h) {
        this(j9, (i10 & 2) != 0 ? new C0870n() : c0870n, (i10 & 4) != 0 ? new K.a() : aVar);
    }
}
