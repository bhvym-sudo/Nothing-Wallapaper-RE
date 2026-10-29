package I;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: I.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0863g implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f2697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Shader f2699c;

    public C0863g(Paint paint) {
        this.f2697a = paint;
        this.f2698b = AbstractC0867k.f2708a.B();
    }

    @Override // I.F
    public void A(Shader shader) {
        this.f2699c = shader;
        AbstractC0864h.j(this.f2697a, shader);
    }

    @Override // I.F
    public Shader B() {
        return this.f2699c;
    }

    @Override // I.F
    public void C(int i10) {
        AbstractC0864h.i(this.f2697a, i10);
    }

    @Override // I.F
    public int D() {
        return AbstractC0864h.c(this.f2697a);
    }

    @Override // I.F
    public void E(int i10) {
        AbstractC0864h.l(this.f2697a, i10);
    }

    @Override // I.F
    public void F(long j9) {
        AbstractC0864h.g(this.f2697a, j9);
    }

    @Override // I.F
    public void G(float f10) {
        AbstractC0864h.k(this.f2697a, f10);
    }

    @Override // I.F
    public void a(float f10) {
        AbstractC0864h.e(this.f2697a, f10);
    }

    @Override // I.F
    public long c() {
        return AbstractC0864h.b(this.f2697a);
    }

    @Override // I.F
    public AbstractC0874s h() {
        return null;
    }

    @Override // I.F
    public int w() {
        return this.f2698b;
    }

    @Override // I.F
    public void x(AbstractC0874s abstractC0874s) {
        AbstractC0864h.h(this.f2697a, abstractC0874s);
    }

    @Override // I.F
    public void y(int i10) {
        if (AbstractC0867k.E(this.f2698b, i10)) {
            return;
        }
        this.f2698b = i10;
        AbstractC0864h.f(this.f2697a, i10);
    }

    @Override // I.F
    public Paint z() {
        return this.f2697a;
    }

    public C0863g() {
        this(AbstractC0864h.d());
    }
}
