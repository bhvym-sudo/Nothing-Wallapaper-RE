package F8;

import K8.C0922o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C0 extends C0922o implements InterfaceC0807d0, InterfaceC0838t0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public D0 f1788t;

    @Override // F8.InterfaceC0838t0
    public boolean a() {
        return true;
    }

    @Override // F8.InterfaceC0838t0
    public I0 b() {
        return null;
    }

    @Override // F8.InterfaceC0807d0
    public void dispose() {
        u().D0(this);
    }

    @Override // K8.C0922o
    public String toString() {
        return P.a(this) + '@' + P.b(this) + "[job@" + P.b(u()) + ']';
    }

    public final D0 u() {
        D0 d10 = this.f1788t;
        if (d10 != null) {
            return d10;
        }
        kotlin.jvm.internal.n.r("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th);

    public final void x(D0 d10) {
        this.f1788t = d10;
    }
}
