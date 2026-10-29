package p025c4;

import Z3.c;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: c4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1189c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Z3.e f15095A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final Handler f15096B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private InterfaceC1198l f15099E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected InterfaceC0435c f15100F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private IInterface f15101G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private V f15103I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final a f15105K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final b f15106L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final int f15107M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final String f15108N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile String f15109O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f15114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f15115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f15116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f15118u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    j0 f15120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Context f15121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Looper f15122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AbstractC1194h f15123z;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final c[] f15094U = new c[0];

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String[] f15093T = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile String f15119v = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Object f15097C = new Object();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Object f15098D = new Object();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final ArrayList f15102H = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f15104J = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Z3.a f15110P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f15111Q = false;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private volatile Y f15112R = null;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected AtomicInteger f15113S = new AtomicInteger(0);

    /* JADX INFO: renamed from: c4.c$a */
    public interface a {
        void c(int i10);

        void e(Bundle bundle);
    }

    /* JADX INFO: renamed from: c4.c$b */
    public interface b {
        void a(Z3.a aVar);
    }

    /* JADX INFO: renamed from: c4.c$c, reason: collision with other inner class name */
    public interface InterfaceC0435c {
        void c(Z3.a aVar);
    }

    /* JADX INFO: renamed from: c4.c$d */
    protected class d implements InterfaceC0435c {
        public d() {
        }

        @Override // p025c4.AbstractC1189c.InterfaceC0435c
        public final void c(Z3.a aVar) {
            if (aVar.e()) {
                AbstractC1189c abstractC1189c = AbstractC1189c.this;
                abstractC1189c.i(null, abstractC1189c.B());
            } else if (AbstractC1189c.this.f15106L != null) {
                AbstractC1189c.this.f15106L.a(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: c4.c$e */
    public interface e {
        void a();
    }

    protected AbstractC1189c(Context context, Looper looper, AbstractC1194h abstractC1194h, Z3.e eVar, int i10, a aVar, b bVar, String str) {
        AbstractC1202p.j(context, "Context must not be null");
        this.f15121x = context;
        AbstractC1202p.j(looper, "Looper must not be null");
        this.f15122y = looper;
        AbstractC1202p.j(abstractC1194h, "Supervisor must not be null");
        this.f15123z = abstractC1194h;
        AbstractC1202p.j(eVar, "API availability must not be null");
        this.f15095A = eVar;
        this.f15096B = new S(this, looper);
        this.f15107M = i10;
        this.f15105K = aVar;
        this.f15106L = bVar;
        this.f15108N = str;
    }

    static /* bridge */ /* synthetic */ void a0(AbstractC1189c abstractC1189c, Y y9) {
        abstractC1189c.f15112R = y9;
        if (abstractC1189c.Q()) {
            C1191e c1191e = y9.f15092t;
            C1203q.b().c(c1191e == null ? null : c1191e.f());
        }
    }

    static /* bridge */ /* synthetic */ void b0(AbstractC1189c abstractC1189c, int i10) {
        int i11;
        int i12;
        synchronized (abstractC1189c.f15097C) {
            i11 = abstractC1189c.f15104J;
        }
        if (i11 == 3) {
            abstractC1189c.f15111Q = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC1189c.f15096B;
        handler.sendMessage(handler.obtainMessage(i12, abstractC1189c.f15113S.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(AbstractC1189c abstractC1189c, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC1189c.f15097C) {
            try {
                if (abstractC1189c.f15104J != i10) {
                    return false;
                }
                abstractC1189c.g0(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(AbstractC1189c abstractC1189c) {
        if (abstractC1189c.f15111Q || TextUtils.isEmpty(abstractC1189c.D()) || TextUtils.isEmpty(abstractC1189c.A())) {
            return false;
        }
        try {
            Class.forName(abstractC1189c.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(int i10, IInterface iInterface) {
        j0 j0Var;
        AbstractC1202p.a((i10 == 4) == (iInterface != null));
        synchronized (this.f15097C) {
            try {
                this.f15104J = i10;
                this.f15101G = iInterface;
                if (i10 == 1) {
                    V v9 = this.f15103I;
                    if (v9 != null) {
                        AbstractC1194h abstractC1194h = this.f15123z;
                        String strC = this.f15120w.c();
                        AbstractC1202p.i(strC);
                        abstractC1194h.e(strC, this.f15120w.b(), this.f15120w.a(), v9, V(), this.f15120w.d());
                        this.f15103I = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    V v10 = this.f15103I;
                    if (v10 != null && (j0Var = this.f15120w) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + j0Var.c() + " on " + j0Var.b());
                        AbstractC1194h abstractC1194h2 = this.f15123z;
                        String strC2 = this.f15120w.c();
                        AbstractC1202p.i(strC2);
                        abstractC1194h2.e(strC2, this.f15120w.b(), this.f15120w.a(), v10, V(), this.f15120w.d());
                        this.f15113S.incrementAndGet();
                    }
                    V v11 = new V(this, this.f15113S.get());
                    this.f15103I = v11;
                    j0 j0Var2 = (this.f15104J != 3 || A() == null) ? new j0(F(), E(), false, AbstractC1194h.a(), H()) : new j0(x().getPackageName(), A(), true, AbstractC1194h.a(), false);
                    this.f15120w = j0Var2;
                    if (j0Var2.d() && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f15120w.c())));
                    }
                    AbstractC1194h abstractC1194h3 = this.f15123z;
                    String strC3 = this.f15120w.c();
                    AbstractC1202p.i(strC3);
                    if (!abstractC1194h3.f(new c0(strC3, this.f15120w.b(), this.f15120w.a(), this.f15120w.d()), v11, V(), v())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f15120w.c() + " on " + this.f15120w.b());
                        c0(16, null, this.f15113S.get());
                    }
                } else if (i10 == 4) {
                    AbstractC1202p.i(iInterface);
                    J(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected String A() {
        return null;
    }

    protected abstract Set B();

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f15097C) {
            try {
                if (this.f15104J == 5) {
                    throw new DeadObjectException();
                }
                q();
                iInterface = this.f15101G;
                AbstractC1202p.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    protected abstract String D();

    protected abstract String E();

    protected String F() {
        return "com.google.android.gms";
    }

    public C1191e G() {
        Y y9 = this.f15112R;
        if (y9 == null) {
            return null;
        }
        return y9.f15092t;
    }

    protected boolean H() {
        return l() >= 211700000;
    }

    public boolean I() {
        return this.f15112R != null;
    }

    protected void J(IInterface iInterface) {
        this.f15116s = System.currentTimeMillis();
    }

    protected void K(Z3.a aVar) {
        this.f15117t = aVar.a();
        this.f15118u = System.currentTimeMillis();
    }

    protected void L(int i10) {
        this.f15114q = i10;
        this.f15115r = System.currentTimeMillis();
    }

    protected void M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.f15096B;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new W(this, i10, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f15109O = str;
    }

    public void P(int i10) {
        Handler handler = this.f15096B;
        handler.sendMessage(handler.obtainMessage(6, this.f15113S.get(), i10));
    }

    public boolean Q() {
        return false;
    }

    protected final String V() {
        String str = this.f15108N;
        return str == null ? this.f15121x.getClass().getName() : str;
    }

    public void a(InterfaceC0435c interfaceC0435c) {
        AbstractC1202p.j(interfaceC0435c, "Connection progress callbacks cannot be null.");
        this.f15100F = interfaceC0435c;
        g0(2, null);
    }

    public void c(String str) {
        this.f15119v = str;
        f();
    }

    protected final void c0(int i10, Bundle bundle, int i11) {
        Handler handler = this.f15096B;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new X(this, i10, null)));
    }

    public boolean d() {
        boolean z9;
        synchronized (this.f15097C) {
            int i10 = this.f15104J;
            z9 = true;
            if (i10 != 2 && i10 != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public String e() {
        j0 j0Var;
        if (!g() || (j0Var = this.f15120w) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return j0Var.b();
    }

    public void f() {
        this.f15113S.incrementAndGet();
        synchronized (this.f15102H) {
            try {
                int size = this.f15102H.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((T) this.f15102H.get(i10)).d();
                }
                this.f15102H.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f15098D) {
            this.f15099E = null;
        }
        g0(1, null);
    }

    public boolean g() {
        boolean z9;
        synchronized (this.f15097C) {
            z9 = this.f15104J == 4;
        }
        return z9;
    }

    public void i(InterfaceC1196j interfaceC1196j, Set set) {
        Bundle bundleZ = z();
        int i10 = this.f15107M;
        String str = this.f15109O;
        int i11 = Z3.e.f9456a;
        Scope[] scopeArr = C1192f.f15159E;
        Bundle bundle = new Bundle();
        c[] cVarArr = C1192f.f15160F;
        C1192f c1192f = new C1192f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        c1192f.f15168t = this.f15121x.getPackageName();
        c1192f.f15171w = bundleZ;
        if (set != null) {
            c1192f.f15170v = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountT = t();
            if (accountT == null) {
                accountT = new Account("<<default account>>", "com.google");
            }
            c1192f.f15172x = accountT;
            if (interfaceC1196j != null) {
                c1192f.f15169u = interfaceC1196j.asBinder();
            }
        } else if (N()) {
            c1192f.f15172x = t();
        }
        c1192f.f15173y = f15094U;
        c1192f.f15174z = u();
        if (Q()) {
            c1192f.f15163C = true;
        }
        try {
            try {
                synchronized (this.f15098D) {
                    try {
                        InterfaceC1198l interfaceC1198l = this.f15099E;
                        if (interfaceC1198l != null) {
                            interfaceC1198l.Q(new U(this, this.f15113S.get()), c1192f);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException e10) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
                M(8, null, null, this.f15113S.get());
            }
        } catch (DeadObjectException e11) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e11);
            P(3);
        } catch (SecurityException e12) {
            throw e12;
        }
    }

    public void j(e eVar) {
        eVar.a();
    }

    public boolean k() {
        return true;
    }

    public abstract int l();

    public final c[] m() {
        Y y9 = this.f15112R;
        if (y9 == null) {
            return null;
        }
        return y9.f15090r;
    }

    public String n() {
        return this.f15119v;
    }

    public boolean o() {
        return false;
    }

    protected final void q() {
        if (!g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface r(IBinder iBinder);

    protected boolean s() {
        return false;
    }

    public abstract Account t();

    public c[] u() {
        return f15094U;
    }

    protected abstract Executor v();

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f15121x;
    }

    public int y() {
        return this.f15107M;
    }

    protected Bundle z() {
        return new Bundle();
    }
}
