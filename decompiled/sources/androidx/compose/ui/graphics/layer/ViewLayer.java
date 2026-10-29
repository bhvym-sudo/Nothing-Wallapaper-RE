package androidx.compose.ui.graphics.layer;

import H.n;
import I.C0858b;
import I.C0870n;
import I.InterfaceC0869m;
import L.c;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.AbstractC1457h;
import p111l0.d;
import p111l0.s;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f11455A = new b(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final ViewOutlineProvider f11456B = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f11457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C0870n f11458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final K.a f11459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11460t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Outline f11461u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f11462v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d f11463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private s f11464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private l f11465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private c f11466z;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).f11461u) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public final boolean b() {
        return this.f11460t;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C0870n c0870n = this.f11458r;
        Canvas canvasO = c0870n.a().o();
        c0870n.a().p(canvas);
        C0858b c0858bA = c0870n.a();
        K.a aVar = this.f11459s;
        d dVar = this.f11463w;
        s sVar = this.f11464x;
        long jA = n.a(getWidth(), getHeight());
        c cVar = this.f11466z;
        l lVar = this.f11465y;
        d density = aVar.E().getDensity();
        s layoutDirection = aVar.E().getLayoutDirection();
        InterfaceC0869m interfaceC0869mI = aVar.E().i();
        long jB = aVar.E().b();
        c cVarF = aVar.E().f();
        K.d dVarE = aVar.E();
        dVarE.g(dVar);
        dVarE.h(sVar);
        dVarE.j(c0858bA);
        dVarE.e(jA);
        dVarE.d(cVar);
        c0858bA.e();
        try {
            lVar.f(aVar);
            c0858bA.m();
            K.d dVarE2 = aVar.E();
            dVarE2.g(density);
            dVarE2.h(layoutDirection);
            dVarE2.j(interfaceC0869mI);
            dVarE2.e(jB);
            dVarE2.d(cVarF);
            c0870n.a().p(canvasO);
            this.f11460t = false;
        } catch (Throwable th) {
            c0858bA.m();
            K.d dVarE3 = aVar.E();
            dVarE3.g(density);
            dVarE3.h(layoutDirection);
            dVarE3.j(interfaceC0869mI);
            dVarE3.e(jB);
            dVarE3.d(cVarF);
            throw th;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f11462v;
    }

    public final C0870n getCanvasHolder() {
        return this.f11458r;
    }

    public final View getOwnerView() {
        return this.f11457q;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f11462v;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.f11460t) {
            return;
        }
        this.f11460t = true;
        super.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z9) {
        if (this.f11462v != z9) {
            this.f11462v = z9;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z9) {
        this.f11460t = z9;
    }
}
