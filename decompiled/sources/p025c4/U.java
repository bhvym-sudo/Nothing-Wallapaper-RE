package p025c4;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class U extends M {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AbstractC1189c f15082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f15083r;

    public U(AbstractC1189c abstractC1189c, int i10) {
        this.f15082q = abstractC1189c;
        this.f15083r = i10;
    }

    @Override // p025c4.InterfaceC1197k
    public final void A(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC1202p.j(this.f15082q, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f15082q.M(i10, iBinder, bundle, this.f15083r);
        this.f15082q = null;
    }

    @Override // p025c4.InterfaceC1197k
    public final void t(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p025c4.InterfaceC1197k
    public final void y(int i10, IBinder iBinder, Y y9) {
        AbstractC1189c abstractC1189c = this.f15082q;
        AbstractC1202p.j(abstractC1189c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC1202p.i(y9);
        AbstractC1189c.a0(abstractC1189c, y9);
        A(i10, iBinder, y9.f15089q);
    }
}
