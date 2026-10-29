package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.C1022b;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p015b4.C1182b;
import p025c4.AbstractC1194h;
import p025c4.AbstractC1205t;
import p025c4.C1200n;
import p025c4.C1203q;
import p025c4.C1204s;
import p025c4.InterfaceC1206u;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1225b implements Handler.Callback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f16230r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Status f16231s = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f16232t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static C1225b f16233u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1204s f16238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC1206u f16239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f16240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Z3.d f16241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p025c4.F f16242i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f16249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f16250q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f16234a = 5000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16235b = 120000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16236c = 10000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16237d = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicInteger f16243j = new AtomicInteger(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f16244k = new AtomicInteger(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f16245l = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f16246m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f16247n = new C1022b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f16248o = new C1022b();

    private C1225b(Context context, Looper looper, Z3.d dVar) {
        this.f16250q = true;
        this.f16240g = context;
        p135n4.h hVar = new p135n4.h(looper, this);
        this.f16249p = hVar;
        this.f16241h = dVar;
        this.f16242i = new p025c4.F(dVar);
        if (p085i4.e.a(context)) {
            this.f16250q = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status h(C1182b c1182b, Z3.a aVar) {
        return new Status(aVar, "API: " + c1182b.b() + " is not available on this device. Connection failed with: " + String.valueOf(aVar));
    }

    private final q i(p005a4.d dVar) {
        C1182b c1182bJ = dVar.j();
        q qVar = (q) this.f16245l.get(c1182bJ);
        if (qVar == null) {
            qVar = new q(this, dVar);
            this.f16245l.put(c1182bJ, qVar);
        }
        if (qVar.L()) {
            this.f16248o.add(c1182bJ);
        }
        qVar.D();
        return qVar;
    }

    private final InterfaceC1206u j() {
        if (this.f16239f == null) {
            this.f16239f = AbstractC1205t.a(this.f16240g);
        }
        return this.f16239f;
    }

    private final void k() {
        C1204s c1204s = this.f16238e;
        if (c1204s != null) {
            if (c1204s.a() > 0 || f()) {
                j().c(c1204s);
            }
            this.f16238e = null;
        }
    }

    private final void l(p215v4.l lVar, int i10, p005a4.d dVar) {
        v vVarB;
        if (i10 == 0 || (vVarB = v.b(this, i10, dVar.j())) == null) {
            return;
        }
        p215v4.k kVarA = lVar.a();
        final Handler handler = this.f16249p;
        handler.getClass();
        kVarA.b(new Executor() { // from class: b4.m
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, vVarB);
    }

    public static C1225b x(Context context) {
        C1225b c1225b;
        synchronized (f16232t) {
            try {
                if (f16233u == null) {
                    f16233u = new C1225b(context.getApplicationContext(), AbstractC1194h.c().getLooper(), Z3.d.l());
                }
                c1225b = f16233u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1225b;
    }

    public final p215v4.k A(p005a4.d dVar, C1226c.a aVar, int i10) {
        p215v4.l lVar = new p215v4.l();
        l(lVar, i10, dVar);
        D d10 = new D(aVar, lVar);
        Handler handler = this.f16249p;
        handler.sendMessage(handler.obtainMessage(13, new p015b4.s(d10, this.f16244k.get(), dVar)));
        return lVar.a();
    }

    public final void F(p005a4.d dVar, int i10, AbstractC1230g abstractC1230g, p215v4.l lVar, p015b4.j jVar) {
        l(lVar, abstractC1230g.d(), dVar);
        C c10 = new C(i10, abstractC1230g, lVar, jVar);
        Handler handler = this.f16249p;
        handler.sendMessage(handler.obtainMessage(4, new p015b4.s(c10, this.f16244k.get(), dVar)));
    }

    final void G(C1200n c1200n, int i10, long j9, int i11) {
        Handler handler = this.f16249p;
        handler.sendMessage(handler.obtainMessage(18, new w(c1200n, i10, j9, i11)));
    }

    public final void H(Z3.a aVar, int i10) {
        if (g(aVar, i10)) {
            return;
        }
        Handler handler = this.f16249p;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, aVar));
    }

    public final void a() {
        Handler handler = this.f16249p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(p005a4.d dVar) {
        Handler handler = this.f16249p;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void c(k kVar) {
        synchronized (f16232t) {
            try {
                if (this.f16246m != kVar) {
                    this.f16246m = kVar;
                    this.f16247n.clear();
                }
                this.f16247n.addAll(kVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void d(k kVar) {
        synchronized (f16232t) {
            try {
                if (this.f16246m == kVar) {
                    this.f16246m = null;
                    this.f16247n.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean f() {
        if (this.f16237d) {
            return false;
        }
        p025c4.r rVarA = C1203q.b().a();
        if (rVarA != null && !rVarA.c()) {
            return false;
        }
        int iA = this.f16242i.a(this.f16240g, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean g(Z3.a aVar, int i10) {
        return this.f16241h.v(this.f16240g, aVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01c1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01ff, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        q qVar = null;
        switch (i10) {
            case 1:
                this.f16236c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f16249p.removeMessages(12);
                for (C1182b c1182b : this.f16245l.keySet()) {
                    Handler handler = this.f16249p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c1182b), this.f16236c);
                }
                return true;
            case 2:
                androidx.appcompat.app.o.a(message.obj);
                throw null;
            case 3:
                for (q qVar2 : this.f16245l.values()) {
                    qVar2.C();
                    qVar2.D();
                }
                return true;
            case 4:
            case 8:
            case 13:
                p015b4.s sVar = (p015b4.s) message.obj;
                q qVarI = (q) this.f16245l.get(sVar.f14911c.j());
                if (qVarI == null) {
                    qVarI = i(sVar.f14911c);
                }
                if (!qVarI.L() || this.f16244k.get() == sVar.f14910b) {
                    qVarI.E(sVar.f14909a);
                } else {
                    sVar.f14909a.a(f16230r);
                    qVarI.J();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                Z3.a aVar = (Z3.a) message.obj;
                for (q qVar3 : this.f16245l.values()) {
                    if (qVar3.r() == i11) {
                        qVar = qVar3;
                        if (qVar != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                        } else if (aVar.a() == 13) {
                            qVar.g(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f16241h.d(aVar.a()) + ": " + aVar.b()));
                        } else {
                            qVar.g(h(qVar.f16295s, aVar));
                        }
                        return true;
                    }
                }
                if (qVar != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (aVar.a() == 13) {
                    qVar.g(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f16241h.d(aVar.a()) + ": " + aVar.b()));
                } else {
                    qVar.g(h(qVar.f16295s, aVar));
                }
                return true;
            case 6:
                if (this.f16240g.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1224a.c((Application) this.f16240g.getApplicationContext());
                    ComponentCallbacks2C1224a.b().a(new l(this));
                    if (!ComponentCallbacks2C1224a.b().e(true)) {
                        this.f16236c = 300000L;
                    }
                }
                return true;
            case 7:
                i((p005a4.d) message.obj);
                return true;
            case 9:
                if (this.f16245l.containsKey(message.obj)) {
                    ((q) this.f16245l.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it = this.f16248o.iterator();
                while (it.hasNext()) {
                    q qVar4 = (q) this.f16245l.remove((C1182b) it.next());
                    if (qVar4 != null) {
                        qVar4.J();
                    }
                }
                this.f16248o.clear();
                return true;
            case 11:
                if (this.f16245l.containsKey(message.obj)) {
                    ((q) this.f16245l.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f16245l.containsKey(message.obj)) {
                    ((q) this.f16245l.get(message.obj)).b();
                }
                return true;
            case 14:
                androidx.appcompat.app.o.a(message.obj);
                throw null;
            case 15:
                r rVar = (r) message.obj;
                if (this.f16245l.containsKey(rVar.f16303a)) {
                    q.A((q) this.f16245l.get(rVar.f16303a), rVar);
                }
                return true;
            case 16:
                r rVar2 = (r) message.obj;
                if (this.f16245l.containsKey(rVar2.f16303a)) {
                    q.B((q) this.f16245l.get(rVar2.f16303a), rVar2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                w wVar = (w) message.obj;
                if (wVar.f16322c == 0) {
                    j().c(new C1204s(wVar.f16321b, Arrays.asList(wVar.f16320a)));
                } else {
                    C1204s c1204s = this.f16238e;
                    if (c1204s != null) {
                        List listB = c1204s.b();
                        if (c1204s.a() != wVar.f16321b || (listB != null && listB.size() >= wVar.f16323d)) {
                            this.f16249p.removeMessages(17);
                            k();
                        } else {
                            this.f16238e.c(wVar.f16320a);
                        }
                    }
                    if (this.f16238e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(wVar.f16320a);
                        this.f16238e = new C1204s(wVar.f16321b, arrayList);
                        Handler handler2 = this.f16249p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), wVar.f16322c);
                    }
                }
                return true;
            case 19:
                this.f16237d = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int m() {
        return this.f16243j.getAndIncrement();
    }

    final q w(C1182b c1182b) {
        return (q) this.f16245l.get(c1182b);
    }

    public final p215v4.k z(p005a4.d dVar, AbstractC1228e abstractC1228e, AbstractC1231h abstractC1231h, Runnable runnable) {
        p215v4.l lVar = new p215v4.l();
        l(lVar, abstractC1228e.e(), dVar);
        B b10 = new B(new p015b4.t(abstractC1228e, abstractC1231h, runnable), lVar);
        Handler handler = this.f16249p;
        handler.sendMessage(handler.obtainMessage(8, new p015b4.s(b10, this.f16244k.get(), dVar)));
        return lVar.a();
    }
}
