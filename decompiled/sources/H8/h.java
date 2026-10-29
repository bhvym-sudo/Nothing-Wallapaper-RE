package H8;

import F8.AbstractC0800a;
import F8.C0848y0;
import F8.D0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends AbstractC0800a implements g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g f2622t;

    public h(p129m8.i iVar, g gVar, boolean z9, boolean z10) {
        super(iVar, z9, z10);
        this.f2622t = gVar;
    }

    @Override // F8.D0
    public void F(Throwable th) {
        CancellationException cancellationExceptionJ0 = D0.J0(this, th, null, 1, null);
        this.f2622t.f(cancellationExceptionJ0);
        D(cancellationExceptionJ0);
    }

    protected final g Y0() {
        return this.f2622t;
    }

    @Override // H8.v
    public Object c(p129m8.e eVar) {
        Object objC = this.f2622t.c(eVar);
        p139n8.b.e();
        return objC;
    }

    @Override // H8.v
    public N8.g d() {
        return this.f2622t.d();
    }

    @Override // H8.w
    public void e(p219v8.l lVar) {
        this.f2622t.e(lVar);
    }

    @Override // F8.D0, F8.InterfaceC0846x0
    public final void f(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0848y0(L(), null, this);
        }
        F(cancellationException);
    }

    @Override // H8.v
    public Object g() {
        return this.f2622t.g();
    }

    @Override // H8.w
    public boolean h(Throwable th) {
        return this.f2622t.h(th);
    }

    @Override // H8.v
    public i iterator() {
        return this.f2622t.iterator();
    }

    @Override // H8.v
    public Object l(p129m8.e eVar) {
        return this.f2622t.l(eVar);
    }

    @Override // H8.w
    public Object n(Object obj, p129m8.e eVar) {
        return this.f2622t.n(obj, eVar);
    }

    @Override // H8.w
    public Object p(Object obj) {
        return this.f2622t.p(obj);
    }

    @Override // H8.w
    public boolean s() {
        return this.f2622t.s();
    }
}
