package p025c4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g0 f15175a;

    /* synthetic */ f0(g0 g0Var, e0 e0Var) {
        this.f15175a = g0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f15175a.f15179f) {
                try {
                    c0 c0Var = (c0) message.obj;
                    d0 d0Var = (d0) this.f15175a.f15179f.get(c0Var);
                    if (d0Var != null && d0Var.i()) {
                        if (d0Var.j()) {
                            d0Var.g("GmsClientSupervisor");
                        }
                        this.f15175a.f15179f.remove(c0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f15175a.f15179f) {
            try {
                c0 c0Var2 = (c0) message.obj;
                d0 d0Var2 = (d0) this.f15175a.f15179f.get(c0Var2);
                if (d0Var2 != null && d0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c0Var2), new Exception());
                    ComponentName componentNameB = d0Var2.b();
                    if (componentNameB == null) {
                        componentNameB = c0Var2.b();
                    }
                    if (componentNameB == null) {
                        String strD = c0Var2.d();
                        AbstractC1202p.i(strD);
                        componentNameB = new ComponentName(strD, "unknown");
                    }
                    d0Var2.onServiceDisconnected(componentNameB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
