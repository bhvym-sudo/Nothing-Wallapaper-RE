package H8;

import F8.K;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
final class s extends h implements t {
    public s(p129m8.i iVar, g gVar) {
        super(iVar, gVar, true, true);
    }

    @Override // F8.AbstractC0800a
    protected void T0(Throwable th, boolean z9) {
        if (Y0().h(th) || z9) {
            return;
        }
        K.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F8.AbstractC0800a
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public void V0(A a10) {
        w.a.a(Y0(), null, 1, null);
    }

    @Override // F8.AbstractC0800a, F8.D0, F8.InterfaceC0846x0
    public boolean a() {
        return super.a();
    }
}
