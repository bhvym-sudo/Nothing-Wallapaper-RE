package Q7;

import android.content.Context;
import android.graphics.Bitmap;
import com.nothing.wallpaper.segmenter.Segmenter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC1457h;
import p036d5.C1310i;
import p079h8.A;
import p215v4.InterfaceC1995f;
import p215v4.InterfaceC1996g;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f6912h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p079h8.h f6913i = p079h8.i.b(new p219v8.a() { // from class: Q7.k
        @Override // p219v8.a
        public final Object invoke() {
            return s.J();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p055f4.d f6915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p076h5.d f6916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p079h8.h f6917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p079h8.h f6918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList f6919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Segmenter.ModuleState f6920g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ScheduledExecutorService b() {
            return (ScheduledExecutorService) s.f6913i.getValue();
        }

        private a() {
        }
    }

    public final class b implements p055f4.a {
        public b() {
        }

        @Override // p055f4.a
        public void a(p055f4.h update) {
            kotlin.jvm.internal.n.h(update, "update");
            com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "install state updated:" + update.b());
            int iB = update.b();
            if (iB != 2) {
                if (iB != 3) {
                    if (iB == 4) {
                        s.this.H();
                        p055f4.d dVar = s.this.f6915b;
                        if (dVar != null) {
                            dVar.a(this);
                            return;
                        }
                        return;
                    }
                    if (iB != 5) {
                        if (iB != 6) {
                            return;
                        }
                    }
                }
                s.this.P(Segmenter.ModuleState.UnaAvailable.INSTANCE);
                s.this.s();
                return;
            }
            s.this.P(Segmenter.ModuleState.Installing.INSTANCE);
            f4.h.a aVarC = update.c();
            if (aVarC != null) {
                com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "module downloading progress: " + ((int) ((aVarC.a() * ((long) 100)) / aVarC.b())));
            }
        }
    }

    public s(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f6914a = context;
        this.f6917d = p079h8.i.b(new p219v8.a() { // from class: Q7.g
            @Override // p219v8.a
            public final Object invoke() {
                return s.G(this.f6902q);
            }
        });
        this.f6918e = p079h8.i.b(new p219v8.a() { // from class: Q7.j
            @Override // p219v8.a
            public final Object invoke() {
                return s.F(this.f6905q);
            }
        });
        this.f6919f = new CopyOnWriteArrayList();
        this.f6920g = Segmenter.ModuleState.UnaAvailable.INSTANCE;
        if (A()) {
            return;
        }
        com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "initialize, failed to initialize");
    }

    private final boolean A() {
        Object objB;
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "initialize");
        if (this.f6916c != null) {
            return true;
        }
        try {
            C1310i.d(this.f6914a.getApplicationContext());
            try {
                p076h5.e eVarA = new h5.e.a().b().c().a();
                kotlin.jvm.internal.n.g(eVarA, "build(...)");
                this.f6916c = p076h5.b.a(eVarA);
                try {
                    this.f6915b = p055f4.c.a(this.f6914a);
                    s();
                    return true;
                } catch (Throwable th) {
                    com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "initialize, failed to create module installation, " + th.getMessage());
                    p076h5.d dVar = this.f6916c;
                    if (dVar != null) {
                        try {
                            h8.q.a aVar = p079h8.q.f21862r;
                            dVar.close();
                            objB = p079h8.q.b(A.f21846a);
                        } catch (Throwable th2) {
                            h8.q.a aVar2 = p079h8.q.f21862r;
                            objB = p079h8.q.b(p079h8.r.a(th2));
                        }
                        p079h8.q.a(objB);
                    }
                    this.f6916c = null;
                    return false;
                }
            } catch (Throwable th3) {
                com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "initialize, failed to create subject segmentation, " + th3.getMessage());
                return false;
            }
        } catch (Throwable th4) {
            com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "initialize, failed to init MLKit," + th4.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        Segmenter.ModuleState moduleState = this.f6920g;
        if ((moduleState instanceof Segmenter.ModuleState.Installing) || (moduleState instanceof Segmenter.ModuleState.Available)) {
            return;
        }
        if (!p087i6.m.a(this.f6914a)) {
            com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "installModule, network is not available");
            L();
            return;
        }
        p076h5.d dVar = this.f6916c;
        if (dVar == null) {
            com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "installModule, can't find segmenter");
            return;
        }
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "installModule, start installing module");
        P(Segmenter.ModuleState.Installing.INSTANCE);
        try {
            p055f4.f fVarB = p055f4.f.d().a(dVar).c(x()).b();
            kotlin.jvm.internal.n.g(fVarB, "build(...)");
            p055f4.d dVar2 = this.f6915b;
            if (dVar2 != null) {
                p215v4.k kVarB = dVar2.b(fVarB);
                final p219v8.l lVar = new p219v8.l() { // from class: Q7.q
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return s.C(this.f6910q, (p055f4.g) obj);
                    }
                };
                kVarB.g(new InterfaceC1996g() { // from class: Q7.r
                    @Override // p215v4.InterfaceC1996g
                    public final void b(Object obj) {
                        s.D(lVar, obj);
                    }
                }).e(new InterfaceC1995f() { // from class: Q7.h
                    @Override // p215v4.InterfaceC1995f
                    public final void d(Exception exc) {
                        s.E(this.f6903a, exc);
                    }
                });
            }
        } catch (Throwable th) {
            com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "installModule, error occurred while installing module, " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A C(s sVar, p055f4.g gVar) {
        if (gVar.a()) {
            sVar.H();
        } else {
            com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "installModule, module still not installed");
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(p219v8.l lVar, Object obj) {
        lVar.f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(s sVar, Exception ex) {
        kotlin.jvm.internal.n.h(ex, "ex");
        com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "installModule, failed to install module, " + ex.getMessage());
        sVar.P(Segmenter.ModuleState.UnaAvailable.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b F(s sVar) {
        return sVar.new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i6.k G(s sVar) {
        Context applicationContext = sVar.f6914a.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        return new p087i6.k(applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "onModuleInstalled");
        P(Segmenter.ModuleState.Available.INSTANCE);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScheduledExecutorService J() {
        return Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: Q7.l
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return s.K(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread K(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("MLKitSegmenter");
        return thread;
    }

    private final void L() {
        z().f(new p219v8.l() { // from class: Q7.i
            @Override // p219v8.l
            public final Object f(Object obj) {
                return s.M(this.f6904q, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A M(s sVar, boolean z9) {
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "network status changed, available: " + z9);
        if (z9) {
            sVar.B();
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Segmenter.ModuleState moduleState) {
        if (kotlin.jvm.internal.n.d(this.f6920g, moduleState)) {
            return;
        }
        this.f6920g = moduleState;
        Iterator it = this.f6919f.iterator();
        kotlin.jvm.internal.n.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((Segmenter.b) it.next()).a(moduleState);
        }
    }

    private final void Q() {
        z().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        p076h5.d dVar = this.f6916c;
        if (dVar == null) {
            com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "checkModule, can't find segmenter");
            return;
        }
        try {
            C1310i.d(this.f6914a.getApplicationContext());
            com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "checkModule, start checking module availability.");
            p055f4.d dVar2 = this.f6915b;
            if (dVar2 != null) {
                try {
                    p215v4.k kVarD = dVar2.d(dVar);
                    final p219v8.l lVar = new p219v8.l() { // from class: Q7.m
                        @Override // p219v8.l
                        public final Object f(Object obj) {
                            return s.t(this.f6906q, (p055f4.b) obj);
                        }
                    };
                    kotlin.jvm.internal.n.e(kVarD.g(new InterfaceC1996g() { // from class: Q7.n
                        @Override // p215v4.InterfaceC1996g
                        public final void b(Object obj) {
                            s.u(lVar, obj);
                        }
                    }).e(new InterfaceC1995f() { // from class: Q7.o
                        @Override // p215v4.InterfaceC1995f
                        public final void d(Exception exc) {
                            s.v(this.f6908a, exc);
                        }
                    }));
                } catch (Throwable th) {
                    com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "checkModule, failed to start checking module installation, " + th.getMessage());
                    A a10 = A.f21846a;
                }
            }
        } catch (Throwable th2) {
            com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "checkModule, failed to initialize MLKit," + th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A t(s sVar, p055f4.b bVar) {
        if (bVar.a()) {
            com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "checkModule, module is installed");
            sVar.H();
        } else {
            com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "checkModule, module is still not installed");
            f6912h.b().submit(new p(sVar));
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(p219v8.l lVar, Object obj) {
        lVar.f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(s sVar, Exception ex) {
        kotlin.jvm.internal.n.h(ex, "ex");
        com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "checkModule, failed to check module availability, " + ex.getMessage());
        f6912h.b().submit(new p(sVar));
    }

    private final b x() {
        return (b) this.f6918e.getValue();
    }

    private final p087i6.k z() {
        return (p087i6.k) this.f6917d.getValue();
    }

    public final boolean I(Bitmap bitmap, f.a listener) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        kotlin.jvm.internal.n.h(listener, "listener");
        Segmenter.ModuleState moduleState = this.f6920g;
        if (!(moduleState instanceof Segmenter.ModuleState.Available) || this.f6916c == null) {
            com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "processBitmap, module is not available, state:" + moduleState);
            return false;
        }
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "processBitmap start");
        p076h5.d dVar = this.f6916c;
        kotlin.jvm.internal.n.e(dVar);
        new f(dVar).j(bitmap, listener);
        return true;
    }

    public final void N(Segmenter.b listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f6919f.remove(listener);
    }

    public final void O() {
        this.f6919f.clear();
    }

    public final void r(Segmenter.b listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        this.f6919f.add(listener);
    }

    public final void w() {
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "close");
        p076h5.d dVar = this.f6916c;
        if (dVar != null) {
            dVar.close();
        }
    }

    public final Segmenter.ModuleState y() {
        return this.f6920g;
    }
}
