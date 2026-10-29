package androidx.compose.ui.platform;

import I.C0858b;
import I.C0870n;
import I.InterfaceC0869m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046d0 implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidComposeView f11875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RenderNode f11876b = new RenderNode("Compose");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11877c = I.u.f2755a.a();

    public C1046d0(AndroidComposeView androidComposeView) {
        this.f11875a = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.O
    public void A(C0870n c0870n, I.H h10, p219v8.l lVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f11876b.beginRecording();
        Canvas canvasO = c0870n.a().o();
        c0870n.a().p(recordingCanvasBeginRecording);
        C0858b c0858bA = c0870n.a();
        if (h10 != null) {
            c0858bA.e();
            InterfaceC0869m.d(c0858bA, h10, 0, 2, null);
        }
        lVar.f(c0858bA);
        if (h10 != null) {
            c0858bA.m();
        }
        c0870n.a().p(canvasO);
        this.f11876b.endRecording();
    }

    @Override // androidx.compose.ui.platform.O
    public boolean B() {
        return this.f11876b.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.O
    public int C() {
        return this.f11876b.getTop();
    }

    @Override // androidx.compose.ui.platform.O
    public void D(int i10) {
        this.f11876b.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.O
    public boolean E() {
        return this.f11876b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.O
    public void F(boolean z9) {
        this.f11876b.setClipToOutline(z9);
    }

    @Override // androidx.compose.ui.platform.O
    public boolean G(boolean z9) {
        return this.f11876b.setHasOverlappingRendering(z9);
    }

    @Override // androidx.compose.ui.platform.O
    public void H(int i10) {
        this.f11876b.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.O
    public void I(Matrix matrix) {
        this.f11876b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.O
    public float J() {
        return this.f11876b.getElevation();
    }

    @Override // androidx.compose.ui.platform.O
    public void a(float f10) {
        this.f11876b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public float b() {
        return this.f11876b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.O
    public void c(float f10) {
        this.f11876b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public int d() {
        return this.f11876b.getLeft();
    }

    @Override // androidx.compose.ui.platform.O
    public void e(float f10) {
        this.f11876b.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void f(float f10) {
        this.f11876b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void g() {
        this.f11876b.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.O
    public int getHeight() {
        return this.f11876b.getHeight();
    }

    @Override // androidx.compose.ui.platform.O
    public int getWidth() {
        return this.f11876b.getWidth();
    }

    @Override // androidx.compose.ui.platform.O
    public int h() {
        return this.f11876b.getRight();
    }

    @Override // androidx.compose.ui.platform.O
    public void i(float f10) {
        this.f11876b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void j(I.L l9) {
        C1048e0.f11882a.a(this.f11876b, l9);
    }

    @Override // androidx.compose.ui.platform.O
    public void k(int i10) {
        this.f11876b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.O
    public boolean l() {
        return this.f11876b.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.O
    public int m() {
        return this.f11876b.getBottom();
    }

    @Override // androidx.compose.ui.platform.O
    public void n(Canvas canvas) {
        canvas.drawRenderNode(this.f11876b);
    }

    @Override // androidx.compose.ui.platform.O
    public void o(float f10) {
        this.f11876b.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void p(float f10) {
        this.f11876b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void q(boolean z9) {
        this.f11876b.setClipToBounds(z9);
    }

    @Override // androidx.compose.ui.platform.O
    public boolean r(int i10, int i11, int i12, int i13) {
        return this.f11876b.setPosition(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.O
    public void s(float f10) {
        this.f11876b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void t(float f10) {
        this.f11876b.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void u(float f10) {
        this.f11876b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void v(float f10) {
        this.f11876b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void w(float f10) {
        this.f11876b.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.O
    public void x(int i10) {
        this.f11876b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.O
    public void y(int i10) {
        RenderNode renderNode = this.f11876b;
        I.u.a aVar = I.u.f2755a;
        if (I.u.e(i10, aVar.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (I.u.e(i10, aVar.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f11877c = i10;
    }

    @Override // androidx.compose.ui.platform.O
    public void z(Outline outline) {
        this.f11876b.setOutline(outline);
    }
}
