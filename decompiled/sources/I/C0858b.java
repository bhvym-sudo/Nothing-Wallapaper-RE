package I;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Region;

/* JADX INFO: renamed from: I.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0858b implements InterfaceC0869m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f2689a = AbstractC0859c.f2690a;

    @Override // I.InterfaceC0869m
    public void a(H h10, int i10) {
        Canvas canvas = this.f2689a;
        if (!(h10 instanceof C0865i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0865i) h10).a(), q(i10));
    }

    @Override // I.InterfaceC0869m
    public void c(float f10, float f11, float f12, float f13, F f14) {
        this.f2689a.drawRect(f10, f11, f12, f13, f14.z());
    }

    @Override // I.InterfaceC0869m
    public void e() {
        this.f2689a.save();
    }

    @Override // I.InterfaceC0869m
    public void f() {
        C0871o.f2735a.a(this.f2689a, false);
    }

    @Override // I.InterfaceC0869m
    public void g(float[] fArr) {
        if (D.c(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC0862f.a(matrix, fArr);
        this.f2689a.concat(matrix);
    }

    @Override // I.InterfaceC0869m
    public void k(float f10, float f11, float f12, float f13, int i10) {
        this.f2689a.clipRect(f10, f11, f12, f13, q(i10));
    }

    @Override // I.InterfaceC0869m
    public void l(float f10, float f11) {
        this.f2689a.translate(f10, f11);
    }

    @Override // I.InterfaceC0869m
    public void m() {
        this.f2689a.restore();
    }

    @Override // I.InterfaceC0869m
    public void n() {
        C0871o.f2735a.a(this.f2689a, true);
    }

    public final Canvas o() {
        return this.f2689a;
    }

    public final void p(Canvas canvas) {
        this.f2689a = canvas;
    }

    public final Region.Op q(int i10) {
        return AbstractC0873q.d(i10, AbstractC0873q.f2737a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
