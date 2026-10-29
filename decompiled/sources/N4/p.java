package N4;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    l f5365c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f5363a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f5364b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RectF f5366d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Path f5367e = new Path();

    public static p a(View view) {
        return new q(view);
    }

    private boolean d() {
        RectF rectF = this.f5366d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void j() {
        if (!d() || this.f5365c == null) {
            return;
        }
        m.k().e(this.f5365c, 1.0f, this.f5366d, this.f5367e);
    }

    abstract void b(View view);

    public boolean c() {
        return this.f5363a;
    }

    public void e(Canvas canvas, p255z4.a.InterfaceC0765a interfaceC0765a) {
        if (!i() || this.f5367e.isEmpty()) {
            interfaceC0765a.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f5367e);
        interfaceC0765a.a(canvas);
        canvas.restore();
    }

    public void f(View view, RectF rectF) {
        this.f5366d = rectF;
        j();
        b(view);
    }

    public void g(View view, l lVar) {
        this.f5365c = lVar;
        j();
        b(view);
    }

    public void h(View view, boolean z9) {
        if (z9 != this.f5363a) {
            this.f5363a = z9;
            b(view);
        }
    }

    abstract boolean i();
}
