package p025c4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p085i4.g;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements ServiceConnection, h0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f15146q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f15147r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f15148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private IBinder f15149t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final c0 f15150u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ComponentName f15151v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final /* synthetic */ g0 f15152w;

    public d0(g0 g0Var, c0 c0Var) {
        this.f15152w = g0Var;
        this.f15150u = c0Var;
    }

    public final int a() {
        return this.f15147r;
    }

    public final ComponentName b() {
        return this.f15151v;
    }

    public final IBinder c() {
        return this.f15149t;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f15146q.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f15147r = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (g.i()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            g0 g0Var = this.f15152w;
            boolean zC = g0Var.f15183j.c(g0Var.f15180g, str, this.f15150u.c(g0Var.f15180g), this, this.f15150u.a(), executor);
            this.f15148s = zC;
            if (zC) {
                this.f15152w.f15181h.sendMessageDelayed(this.f15152w.f15181h.obtainMessage(1, this.f15150u), this.f15152w.f15185l);
            } else {
                this.f15147r = 2;
                try {
                    g0 g0Var2 = this.f15152w;
                    g0Var2.f15183j.b(g0Var2.f15180g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f15146q.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f15152w.f15181h.removeMessages(1, this.f15150u);
        g0 g0Var = this.f15152w;
        g0Var.f15183j.b(g0Var.f15180g, this);
        this.f15148s = false;
        this.f15147r = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f15146q.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f15146q.isEmpty();
    }

    public final boolean j() {
        return this.f15148s;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f15152w.f15179f) {
            try {
                this.f15152w.f15181h.removeMessages(1, this.f15150u);
                this.f15149t = iBinder;
                this.f15151v = componentName;
                Iterator it = this.f15146q.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f15147r = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f15152w.f15179f) {
            try {
                this.f15152w.f15181h.removeMessages(1, this.f15150u);
                this.f15149t = null;
                this.f15151v = componentName;
                Iterator it = this.f15146q.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f15147r = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
