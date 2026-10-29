package F5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f1647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p079h8.h f1648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q f1649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f1650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f1651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f1652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f1653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f1654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f1655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static CountDownLatch f1656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Handler f1657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static a f1658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C8.e f1659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C8.e f1660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C8.e f1661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final f f1662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Executor f1663q;

    private static final class a implements Runnable {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0067a f1664t = new C0067a(null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Handler f1665q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f1666r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final WeakReference f1667s;

        /* JADX INFO: renamed from: F5.j$a$a, reason: collision with other inner class name */
        public static final class C0067a {
            public /* synthetic */ C0067a(AbstractC1457h abstractC1457h) {
                this();
            }

            private C0067a() {
            }
        }

        public a(j bindServiceHandleClass, Handler callbackHandler) {
            kotlin.jvm.internal.n.h(bindServiceHandleClass, "bindServiceHandleClass");
            kotlin.jvm.internal.n.h(callbackHandler, "callbackHandler");
            this.f1665q = callbackHandler;
            this.f1667s = new WeakReference(bindServiceHandleClass);
        }

        public static /* synthetic */ void b(a aVar, long j9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j9 = 5000;
            }
            aVar.a(j9);
        }

        public final void a(long j9) {
            this.f1665q.removeCallbacks(this);
            this.f1665q.postDelayed(this, j9);
        }

        public final void c() {
            this.f1666r = 0;
        }

        public final void d() {
            this.f1665q.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f1666r + 1;
            this.f1666r = i10;
            if (i10 > 10) {
                G5.c.d("BindServiceHandler2", "Always connect system service fail, Retry count = " + i10 + ", Check current bindClass.");
                return;
            }
            j jVar = (j) this.f1667s.get();
            if (jVar != null) {
                if (jVar.x() != null) {
                    G5.c.f1948a.h("BindServiceHandler2", "Service connected, quit retry, retryCount = " + this.f1666r);
                    return;
                }
                this.f1665q.postDelayed(this, 5000L);
                jVar.K();
                jVar.v();
                G5.c.f1948a.h("BindServiceHandler2", "Waiting service connected timeout, begin connect service again. Retry count = " + this.f1666r);
            }
        }
    }

    public interface b {
        void a(q qVar);

        void onServiceUnbind();
    }

    /* synthetic */ class c extends kotlin.jvm.internal.l implements p219v8.a {
        c(Object obj) {
            super(0, obj, j.class, "retryConnectService", "retryConnectService()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            ((j) this.receiver).M();
        }
    }

    /* synthetic */ class d extends kotlin.jvm.internal.l implements p219v8.a {
        d(Object obj) {
            super(0, obj, j.class, "onServiceConnected", "onServiceConnected()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            ((j) this.receiver).H();
        }
    }

    /* synthetic */ class e extends kotlin.jvm.internal.l implements p219v8.a {
        e(Object obj) {
            super(0, obj, j.class, "onServiceDisconnected", "onServiceDisconnected()V", 0);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return A.f21846a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            ((j) this.receiver).I();
        }
    }

    public static final class f implements ServiceConnection {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C8.e tmp0) {
            kotlin.jvm.internal.n.h(tmp0, "$tmp0");
            ((p219v8.a) tmp0).invoke();
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            super.onBindingDied(componentName);
            G5.c.f1948a.h("BindServiceHandler2", "on card service onBindingDied, name = " + componentName);
            j jVar = j.f1647a;
            jVar.O(null);
            j.f1656j.countDown();
            jVar.M();
            jVar.B();
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            super.onNullBinding(componentName);
            G5.c.f1948a.h("BindServiceHandler2", "on card service onNullBinding, name = " + componentName + ".");
            j jVar = j.f1647a;
            jVar.O(null);
            j.f1656j.countDown();
            jVar.M();
            jVar.B();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Object objB;
            kotlin.jvm.internal.n.h(name, "name");
            kotlin.jvm.internal.n.h(service, "service");
            j.f1658l.d();
            try {
                h8.q.a aVar = p079h8.q.f21862r;
                final C8.e eVar = j.f1659m;
                service.linkToDeath(new IBinder.DeathRecipient() { // from class: F5.k
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        j.f.b(eVar);
                    }
                }, 0);
                objB = p079h8.q.b(A.f21846a);
            } catch (Throwable th) {
                h8.q.a aVar2 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.r.a(th));
            }
            if (p079h8.q.d(objB) != null) {
                j.f1647a.M();
                j.f1656j.countDown();
                return;
            }
            j jVar = j.f1647a;
            jVar.O(q.a.a(service));
            j.f1656j.countDown();
            jVar.E();
            synchronized (j.f1655i) {
                j.f1655i.notifyAll();
                A a10 = A.f21846a;
            }
            G5.c.f1948a.h("BindServiceHandler2", "on card service connected.");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            kotlin.jvm.internal.n.h(name, "name");
            G5.c.f1948a.h("BindServiceHandler2", "on card service disconnected.");
            j jVar = j.f1647a;
            jVar.O(null);
            j.f1656j.countDown();
            j.f1651e = false;
            jVar.M();
            jVar.B();
        }
    }

    static {
        j jVar = new j();
        f1647a = jVar;
        f1648b = p079h8.i.b(new p219v8.a() { // from class: F5.c
            @Override // p219v8.a
            public final Object invoke() {
                return j.h();
            }
        });
        f1653g = new ArrayList();
        f1654h = new Object();
        f1655i = new Object();
        f1656j = new CountDownLatch(1);
        Handler handler = new Handler(Looper.getMainLooper());
        f1657k = handler;
        f1658l = new a(jVar, handler);
        f1659m = new c(jVar);
        f1660n = new d(jVar);
        f1661o = new e(jVar);
        f1662p = new f();
        f1663q = new Executor() { // from class: F5.d
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                j.N(runnable);
            }
        };
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        Handler handler = f1657k;
        final C8.e eVar = f1661o;
        if (handler.hasCallbacks(new Runnable() { // from class: F5.e
            @Override // java.lang.Runnable
            public final void run() {
                j.C(eVar);
            }
        })) {
            return;
        }
        handler.post(new Runnable() { // from class: F5.f
            @Override // java.lang.Runnable
            public final void run() {
                j.D(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(C8.e tmp0) {
        kotlin.jvm.internal.n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(C8.e tmp0) {
        kotlin.jvm.internal.n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        Handler handler = f1657k;
        final C8.e eVar = f1660n;
        if (handler.hasCallbacks(new Runnable() { // from class: F5.g
            @Override // java.lang.Runnable
            public final void run() {
                j.F(eVar);
            }
        })) {
            return;
        }
        handler.post(new Runnable() { // from class: F5.h
            @Override // java.lang.Runnable
            public final void run() {
                j.G(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(C8.e tmp0) {
        kotlin.jvm.internal.n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(C8.e tmp0) {
        kotlin.jvm.internal.n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        synchronized (f1654h) {
            try {
                Iterator it = f1653g.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(f1649c);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        synchronized (f1654h) {
            try {
                Iterator it = f1653g.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).onServiceUnbind();
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        Boolean boolValueOf;
        IBinder iBinderAsBinder;
        if (f1651e) {
            Context context = f1652f;
            if (context == null) {
                kotlin.jvm.internal.n.r("appContext");
                context = null;
            }
            context.unbindService(f1662p);
            f1651e = false;
        }
        if (f1649c != null) {
            try {
                h8.q.a aVar = p079h8.q.f21862r;
                q qVar = f1649c;
                if (qVar == null || (iBinderAsBinder = qVar.asBinder()) == null) {
                    boolValueOf = null;
                } else {
                    final C8.e eVar = f1659m;
                    boolValueOf = Boolean.valueOf(iBinderAsBinder.unlinkToDeath(new IBinder.DeathRecipient() { // from class: F5.i
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            j.L(eVar);
                        }
                    }, 0));
                }
                p079h8.q.b(boolValueOf);
            } catch (Throwable th) {
                h8.q.a aVar2 = p079h8.q.f21862r;
                p079h8.q.b(p079h8.r.a(th));
            }
            f1649c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(C8.e tmp0) {
        kotlin.jvm.internal.n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        f1658l.a(0L);
        f1658l.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Runnable runnable) {
        G5.c.f1948a.h("BindServiceHandler2", "Run service connect callback.");
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent h() {
        Intent intent = new Intent("com.nothing.cardservice.BIND_SERVICE");
        intent.setPackage("com.nothing.cardservice");
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        Context context = f1652f;
        if (context == null) {
            kotlin.jvm.internal.n.r("appContext");
            context = null;
        }
        boolean zBindService = context.bindService(y(), 1, f1663q, f1662p);
        f1651e = zBindService;
        return zBindService;
    }

    private final void w() {
        Object objB;
        Object objB2;
        if (f1649c == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (f1656j.getCount() < 1) {
                f1656j = new CountDownLatch(1);
            }
            try {
                h8.q.a aVar = p079h8.q.f21862r;
                f1651e = f1647a.v();
                objB = p079h8.q.b(A.f21846a);
            } catch (Throwable th) {
                h8.q.a aVar2 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.r.a(th));
            }
            Throwable thD = p079h8.q.d(objB);
            if (thD != null) {
                Context context = f1652f;
                if (context == null) {
                    kotlin.jvm.internal.n.r("appContext");
                    context = null;
                }
                context.unbindService(f1662p);
                G5.c.e("BindServiceHandler2", "Bind card service error, release connection.", thD);
            }
            if (f1651e) {
                try {
                    objB2 = p079h8.q.b(Boolean.valueOf(f1656j.await(2L, TimeUnit.SECONDS)));
                } catch (Throwable th2) {
                    h8.q.a aVar3 = p079h8.q.f21862r;
                    objB2 = p079h8.q.b(p079h8.r.a(th2));
                }
                if (p079h8.q.d(objB2) != null) {
                    f1658l.a(0L);
                    G5.c.d("BindServiceHandler2", "Waiting connect time out, begin retry.");
                }
                p079h8.q.a(objB2);
            } else {
                a.b(f1658l, 0L, 1, null);
                G5.c.d("BindServiceHandler2", "Current service is not ready, delay retry.");
            }
            G5.c.f1948a.h("BindServiceHandler2", "Begin bind card service firstly, waiting time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
        G5.c.f1948a.h("BindServiceHandler2", "Call bind card service over, cardService = " + f1649c);
    }

    private final Intent y() {
        return (Intent) f1648b.getValue();
    }

    public final boolean A() {
        IBinder iBinderAsBinder;
        q qVar = f1649c;
        return (qVar == null || (iBinderAsBinder = qVar.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) ? false : true;
    }

    public final void J(b listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        synchronized (f1654h) {
            try {
                List list = f1653g;
                if (!list.contains(listener)) {
                    list.add(listener);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O(q qVar) {
        f1649c = qVar;
    }

    public final void P(b listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        synchronized (f1654h) {
            f1653g.remove(listener);
        }
    }

    public final boolean u(p219v8.l block) {
        Object objB;
        kotlin.jvm.internal.n.h(block, "block");
        if (A()) {
            return true;
        }
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            Object obj = f1655i;
            synchronized (obj) {
                try {
                    if (!f1657k.hasCallbacks(f1658l)) {
                        f1647a.v();
                    }
                    obj.wait(1000L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            objB = p079h8.q.b(A.f21846a);
        } catch (Throwable th2) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th2));
        }
        if (p079h8.q.d(objB) != null) {
            G5.c.d("BindServiceHandler2", "Binder Check waiting time out. Service = " + f1649c);
        }
        if (!A()) {
            return false;
        }
        q qVar = f1649c;
        kotlin.jvm.internal.n.e(qVar);
        block.f(qVar);
        return true;
    }

    public final q x() {
        return f1649c;
    }

    public final synchronized void z(Context context, b bindListener) {
        try {
            kotlin.jvm.internal.n.h(context, "context");
            kotlin.jvm.internal.n.h(bindListener, "bindListener");
            J(bindListener);
            if (f1650d) {
                boolean zA = A();
                if (zA) {
                    bindListener.a(f1649c);
                    G5.c.f1948a.h("BindServiceHandler2", "Service has connected, send notify.");
                } else {
                    G5.c.f1948a.h("BindServiceHandler2", "Service is dead?, check again.");
                    w();
                }
                G5.c.f1948a.h("BindServiceHandler2", "Current handler has initialed. cardService = " + f1649c + ", isAlive = " + zA);
            } else {
                f1652f = context.getApplicationContext();
                w();
                f1650d = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
