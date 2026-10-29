package p025c4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class V implements ServiceConnection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f15084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AbstractC1189c f15085r;

    public V(AbstractC1189c abstractC1189c, int i10) {
        this.f15085r = abstractC1189c;
        this.f15084q = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            AbstractC1189c.b0(this.f15085r, 16);
            return;
        }
        synchronized (this.f15085r.f15098D) {
            try {
                AbstractC1189c abstractC1189c = this.f15085r;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1189c.f15099E = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1198l)) ? new N(iBinder) : (InterfaceC1198l) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15085r.c0(0, null, this.f15084q);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f15085r.f15098D) {
            this.f15085r.f15099E = null;
        }
        Handler handler = this.f15085r.f15096B;
        handler.sendMessage(handler.obtainMessage(6, this.f15084q, 1));
    }
}
