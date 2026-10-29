package I;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: I.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0864h {
    public static final F a() {
        return new C0863g();
    }

    public static final long b(Paint paint) {
        return t.b(paint.getColor());
    }

    public static final int c(Paint paint) {
        return !paint.isFilterBitmap() ? v.f2759a.b() : v.f2759a.a();
    }

    public static final Paint d() {
        return new Paint(7);
    }

    public static final void e(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void f(Paint paint, int i10) {
        S.f2688a.a(paint, i10);
    }

    public static final void g(Paint paint, long j9) {
        paint.setColor(t.d(j9));
    }

    public static final void h(Paint paint, AbstractC0874s abstractC0874s) {
        paint.setColorFilter(null);
    }

    public static final void i(Paint paint, int i10) {
        paint.setFilterBitmap(!v.d(i10, v.f2759a.b()));
    }

    public static final void j(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void k(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void l(Paint paint, int i10) {
        paint.setStyle(G.d(i10, G.f2645a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
