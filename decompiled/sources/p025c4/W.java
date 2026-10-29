package p025c4;

import Z3.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class W extends L {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f15086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC1189c f15087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC1189c abstractC1189c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC1189c, i10, bundle);
        this.f15087h = abstractC1189c;
        this.f15086g = iBinder;
    }

    @Override // p025c4.L
    protected final void f(a aVar) {
        if (this.f15087h.f15106L != null) {
            this.f15087h.f15106L.a(aVar);
        }
        this.f15087h.K(aVar);
    }

    @Override // p025c4.L
    protected final boolean g() {
        try {
            IBinder iBinder = this.f15086g;
            AbstractC1202p.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f15087h.D().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f15087h.D() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceR = this.f15087h.r(this.f15086g);
            if (iInterfaceR == null || !(AbstractC1189c.e0(this.f15087h, 2, 4, iInterfaceR) || AbstractC1189c.e0(this.f15087h, 3, 4, iInterfaceR))) {
                return false;
            }
            this.f15087h.f15110P = null;
            Bundle bundleW = this.f15087h.w();
            AbstractC1189c abstractC1189c = this.f15087h;
            if (abstractC1189c.f15105K == null) {
                return true;
            }
            abstractC1189c.f15105K.e(bundleW);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
