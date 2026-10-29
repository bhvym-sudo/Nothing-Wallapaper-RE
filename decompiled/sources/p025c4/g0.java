package p025c4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p075h4.a;
import p145o4.e;

/* JADX INFO: loaded from: classes.dex */
final class g0 extends AbstractC1194h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f15179f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f15180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Handler f15181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f0 f15182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f15183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f15184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f15185l;

    g0(Context context, Looper looper) {
        f0 f0Var = new f0(this, null);
        this.f15182i = f0Var;
        this.f15180g = context.getApplicationContext();
        this.f15181h = new e(looper, f0Var);
        this.f15183j = a.a();
        this.f15184k = 5000L;
        this.f15185l = 300000L;
    }

    @Override // p025c4.AbstractC1194h
    protected final void d(c0 c0Var, ServiceConnection serviceConnection, String str) {
        AbstractC1202p.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f15179f) {
            try {
                d0 d0Var = (d0) this.f15179f.get(c0Var);
                if (d0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + c0Var.toString());
                }
                if (!d0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c0Var.toString());
                }
                d0Var.f(serviceConnection, str);
                if (d0Var.i()) {
                    this.f15181h.sendMessageDelayed(this.f15181h.obtainMessage(0, c0Var), this.f15184k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p025c4.AbstractC1194h
    protected final boolean f(c0 c0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        AbstractC1202p.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f15179f) {
            try {
                d0 d0Var = (d0) this.f15179f.get(c0Var);
                if (d0Var == null) {
                    d0Var = new d0(this, c0Var);
                    d0Var.d(serviceConnection, serviceConnection, str);
                    d0Var.e(str, executor);
                    this.f15179f.put(c0Var, d0Var);
                } else {
                    this.f15181h.removeMessages(0, c0Var);
                    if (d0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c0Var.toString());
                    }
                    d0Var.d(serviceConnection, serviceConnection, str);
                    int iA = d0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(d0Var.b(), d0Var.c());
                    } else if (iA == 2) {
                        d0Var.e(str, executor);
                    }
                }
                zJ = d0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
