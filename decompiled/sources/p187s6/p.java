package p187s6;

import H3.C;
import android.app.WallpaperColors;
import android.app.wallpaper.WallpaperDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperEngine;
import android.service.wallpaper.IWallpaperService;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import com.android.launcher3.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p079h8.A;
import p089i8.AbstractC1444s;
import p167q6.b;
import p177r6.h;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends IWallpaperConnection.Stub implements ServiceConnection {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final a f27796J = new a(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final b f27797K = new b("WallpaperConnectionInternal");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final HandlerThread f27798L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Handler f27799M;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile boolean f27800A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private IWallpaperService f27801B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private volatile IWallpaperEngine f27802C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f27803D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f27804E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Point f27805F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final List f27806G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f27807H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f27808I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ComponentName f27809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f27810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f27811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C.d f27812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final WallpaperDescription f27813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Intent f27814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final CopyOnWriteArraySet f27815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final b f27816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Runnable f27817y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f27818z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("shared_wallpaper_connection_worker");
        handlerThread.start();
        f27798L = handlerThread;
        f27799M = new Handler(handlerThread.getLooper());
    }

    public /* synthetic */ p(ComponentName componentName, Context context, int i10, C.d dVar, WallpaperDescription wallpaperDescription, int i11, AbstractC1457h abstractC1457h) {
        this(componentName, context, i10, dVar, (i11 & 16) != 0 ? null : wallpaperDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d0(b connM) {
        n.h(connM, "connM");
        return connM.c(s6.a.d.f27751r);
    }

    private final void e0(boolean z9) {
        if (this.f27800A) {
            return;
        }
        if (!z9) {
            r0();
            return;
        }
        Handler handler = f27799M;
        handler.removeCallbacks(this.f27817y);
        handler.postDelayed(this.f27817y, 5L);
    }

    static /* synthetic */ void f0(p pVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        pVar.e0(z9);
    }

    private final Point h0() {
        Point pointS = this.f27805F;
        if (pointS == null) {
            h hVar = (h) AbstractC1444s.T(this.f27815w);
            pointS = hVar != null ? hVar.s() : null;
            this.f27805F = pointS;
        }
        return pointS;
    }

    private final float[] j0(SurfaceView surfaceView) {
        Matrix matrix = new Matrix();
        float[] fArr = new float[9];
        Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
        if (this.f27807H == 0 || this.f27808I == 0) {
            return null;
        }
        float fWidth = surfaceFrame.width() / this.f27807H;
        float fHeight = surfaceFrame.height() / this.f27808I;
        matrix.postScale(fWidth, fHeight);
        f27797K.a("getScale " + fWidth + "," + fHeight + ".");
        matrix.getValues(fArr);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(b connMovement) {
        n.h(connMovement, "connMovement");
        return connMovement.d() instanceof s6.a.e.b;
    }

    private final void o0(boolean z9) {
        IWallpaperEngine iWallpaperEngine = this.f27802C;
        if (iWallpaperEngine == null || z9 == this.f27804E) {
            return;
        }
        try {
            iWallpaperEngine.setVisibility(z9);
            this.f27804E = z9;
            f27797K.a("conn internal setEngineVisibility " + z9 + ".");
        } catch (RemoteException e10) {
            f27797K.e("Failure setting wallpaper visibility " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q0(b connM) {
        n.h(connM, "connM");
        return connM.e();
    }

    private final void r0() {
        boolean z9;
        s6.a.e eVarD;
        final E e10 = new E();
        synchronized (this) {
            z9 = true;
            this.f27800A = true;
            this.f27818z = false;
            eVarD = this.f27816x.d();
            e10.f22779q = eVarD;
            A a10 = A.f21846a;
        }
        f27797K.a("sync, current state " + eVarD);
        for (h hVar : this.f27815w) {
            while (hVar.B(new l() { // from class: s6.o
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return Boolean.valueOf(p.s0(e10, (b) obj));
                }
            })) {
                f27797K.a("sync, moveState for " + hVar);
                if (!hVar.u((s6.a.e) e10.f22779q)) {
                    break;
                }
            }
        }
        synchronized (this) {
            if (!this.f27818z && n.d(this.f27816x.d(), e10.f22779q)) {
                z9 = false;
            }
        }
        if (z9) {
            r0();
            return;
        }
        synchronized (this) {
            this.f27800A = false;
            A a11 = A.f21846a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s0(E e10, b connMovement) {
        n.h(connMovement, "connMovement");
        return connMovement.d().compareTo((s6.a.e) e10.f22779q) < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(p pVar) {
        pVar.r0();
    }

    private final void u0(h hVar) {
        f27797K.a("unregister " + hVar);
        synchronized (this) {
            this.f27815w.remove(hVar);
            this.f27818z = true;
            A a10 = A.f21846a;
        }
    }

    public final boolean Z(int i10, IBinder windowToken, int i11, int i12) {
        n.h(windowToken, "windowToken");
        b bVar = this.f27816x;
        p187s6.a.C0670a c0670a = p187s6.a.C0670a.f27748r;
        s6.a.c cVar = s6.a.c.f27750r;
        if (!n.d(c0670a, cVar)) {
            synchronized (this) {
                if (bVar.c(cVar)) {
                    throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
                }
                A a10 = A.f21846a;
            }
        }
        kotlin.jvm.internal.A a11 = new kotlin.jvm.internal.A();
        synchronized (this) {
            if (bVar.c(c0670a)) {
                b.f27760e.a(bVar + " do event " + c0670a + " but already in state.");
                return true;
            }
            IWallpaperService iWallpaperService = this.f27801B;
            if (iWallpaperService == null) {
                return false;
            }
            boolean zB = w.f15765i ? h.b(iWallpaperService, this, i10, windowToken, i11, i12, this.f27811s, this.f27813u) : h.c(iWallpaperService, this, i10, windowToken, i11, i12);
            a11.f22775q = zB;
            if (zB) {
                bVar.f27762b = c0670a;
            }
            A a12 = A.f21846a;
            if (a11.f22775q) {
                f27797K.a("conn internal attachEngine success.");
                e0(true);
            }
            b.f27760e.a(bVar + " do event " + c0670a + ", success " + a11.f22775q + ".");
            return a11.f22775q;
        }
    }

    public final boolean a0() {
        b bVar = this.f27816x;
        s6.a.b bVar2 = s6.a.b.f27749r;
        s6.a.c cVar = s6.a.c.f27750r;
        if (!n.d(bVar2, cVar)) {
            synchronized (this) {
                if (bVar.c(cVar)) {
                    throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
                }
                A a10 = A.f21846a;
            }
        }
        synchronized (this) {
            if (bVar.c(bVar2)) {
                b.f27760e.a(bVar + " do event " + bVar2 + " but already in state.");
                return true;
            }
            boolean zBindService = this.f27810r.bindService(this.f27814v, this, 577);
            if (zBindService) {
                bVar.f27762b = bVar2;
            }
            A a11 = A.f21846a;
            if (zBindService) {
                f27797K.a("conn internal connect success.");
                e0(true);
            }
            b.f27760e.a(bVar + " do event " + bVar2 + ", success " + zBindService + ".");
            return zBindService;
        }
    }

    public void attachEngine(IWallpaperEngine engine, int i10) {
        Object next;
        n.h(engine, "engine");
        synchronized (this) {
            if (this.f27816x.c(s6.a.d.f27751r)) {
                try {
                    engine.destroy();
                } catch (RemoteException unused) {
                }
                return;
            }
            if (this.f27816x.f()) {
                this.f27802C = engine;
                if (this.f27803D) {
                    o0(true);
                }
                f27797K.a("conn internal attachEngine success. engine visible " + this.f27803D);
                try {
                    try {
                        Point pointH0 = h0();
                        if (this.f27807H == 0 && pointH0 != null) {
                            this.f27807H = pointH0.x;
                            this.f27808I = pointH0.y;
                        }
                        if (p177r6.a.a(this.f27809q)) {
                            CopyOnWriteArraySet copyOnWriteArraySet = this.f27815w;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = copyOnWriteArraySet.iterator();
                            while (it.hasNext()) {
                                Point pointT = ((h) it.next()).t();
                                if (pointT != null) {
                                    arrayList.add(pointT);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            Point point = null;
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    Point point2 = (Point) next;
                                    int i11 = point2.x * point2.y;
                                    do {
                                        Object next2 = it2.next();
                                        Point point3 = (Point) next2;
                                        int i12 = point3.x * point3.y;
                                        if (i11 < i12) {
                                            next = next2;
                                            i11 = i12;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Point point4 = (Point) next;
                            if (point4 != null) {
                                point = point4;
                            } else if (pointH0 != null) {
                                point = new Point(pointH0.x, pointH0.y);
                            }
                            if (point != null) {
                                this.f27807H = point.x;
                                this.f27808I = point.y;
                            }
                        }
                        f27797K.a("attachEngine resizePreview size=[" + this.f27807H + "," + this.f27808I + "].");
                        IWallpaperEngine iWallpaperEngine = this.f27802C;
                        if (iWallpaperEngine != null) {
                            iWallpaperEngine.resizePreview(new Rect(0, 0, this.f27807H, this.f27808I));
                            A a10 = A.f21846a;
                        }
                    } catch (RemoteException e10) {
                        f27797K.e("Failed calling WallpaperEngine APIs" + e10);
                        A a11 = A.f21846a;
                    }
                } catch (NullPointerException e11) {
                    f27797K.e("Failed calling WallpaperEngine APIs" + e11);
                    A a12 = A.f21846a;
                }
                e0(false);
            }
        }
    }

    public final void b0(h conn) {
        n.h(conn, "conn");
        u0(conn);
        synchronized (this) {
            if (this.f27815w.isEmpty()) {
                A a10 = A.f21846a;
                j.f27790a.f(this.f27809q);
                b bVar = this.f27816x;
                s6.a.c cVar = s6.a.c.f27750r;
                if (!n.d(cVar, cVar)) {
                    synchronized (this) {
                        if (bVar.c(cVar)) {
                            throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
                        }
                    }
                }
                synchronized (this) {
                    if (bVar.c(cVar)) {
                        b.f27760e.a(bVar + " do event " + cVar + " but already in state.");
                        return;
                    }
                    c0();
                    bVar.f27762b = cVar;
                    f27797K.a("conn internal destroy success.");
                    e0(true);
                    b.f27760e.a(bVar + " do event " + cVar + ", success true.");
                }
            }
        }
    }

    public final void c0() {
        boolean z9;
        kotlin.jvm.internal.A a10;
        synchronized (this) {
            try {
                CopyOnWriteArraySet copyOnWriteArraySet = this.f27815w;
                if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
                    z9 = true;
                    break;
                }
                Iterator it = copyOnWriteArraySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((h) it.next()).B(new l() { // from class: s6.n
                            @Override // p219v8.l
                            public final Object f(Object obj) {
                                return Boolean.valueOf(p.d0((b) obj));
                            }
                        })) {
                            z9 = false;
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                IWallpaperEngine iWallpaperEngine = this.f27802C;
                if (z9 && iWallpaperEngine != null) {
                    b bVar = this.f27816x;
                    s6.a.d dVar = s6.a.d.f27751r;
                    s6.a.c cVar = s6.a.c.f27750r;
                    if (!n.d(dVar, cVar)) {
                        synchronized (this) {
                            if (bVar.c(cVar)) {
                                throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
                            }
                            A a11 = A.f21846a;
                        }
                        this.f27807H = 0;
                        this.f27808I = 0;
                        f27797K.a("conn internal disconnect success.");
                        b.f27760e.a(bVar + " do event " + dVar + ", success " + a10.f22775q + ".");
                    }
                    a10 = new kotlin.jvm.internal.A();
                    synchronized (this) {
                        if (bVar.c(dVar)) {
                            b.f27760e.a(bVar + " do event " + dVar + " but already in state.");
                        } else {
                            try {
                                iWallpaperEngine.destroy();
                                for (Object obj : this.f27806G) {
                                    n.g(obj, "next(...)");
                                    ((SurfaceControl) obj).release();
                                }
                                this.f27806G.clear();
                            } catch (RemoteException unused) {
                            }
                            this.f27802C = null;
                            try {
                                this.f27810r.unbindService(this);
                            } catch (IllegalArgumentException unused2) {
                                f27797K.f("Can't unbind wallpaper service. It might have crashed, just ignoring.");
                            }
                            this.f27801B = null;
                            a10.f22775q = true;
                            bVar.f27762b = dVar;
                            A a12 = A.f21846a;
                            if (a10.f22775q) {
                                synchronized (this) {
                                    this.f27816x.f();
                                    this.f27807H = 0;
                                    this.f27808I = 0;
                                    f27797K.a("conn internal disconnect success.");
                                }
                            }
                            b.f27760e.a(bVar + " do event " + dVar + ", success " + a10.f22775q + ".");
                        }
                    }
                }
                A a13 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        f0(this, false, 1, null);
    }

    public void engineShown(IWallpaperEngine iWallpaperEngine) {
        synchronized (this) {
            this.f27816x.f();
        }
        f27797K.a("conn internal engineShown, " + this.f27816x + ".");
        e0(false);
    }

    public final int g0() {
        return this.f27811s;
    }

    public final IWallpaperEngine i0() {
        return this.f27802C;
    }

    public final C.d k0() {
        return this.f27812t;
    }

    public final void l0(SurfaceView parentSurface) {
        SurfaceControl surfaceControlMirrorSurfaceControl;
        float[] fArrJ0;
        n.h(parentSurface, "parentSurface");
        synchronized (this) {
            if (this.f27802C == null) {
                f27797K.a("Engine is null, was the service disconnected?");
                return;
            }
            IWallpaperEngine iWallpaperEngine = this.f27802C;
            n.e(iWallpaperEngine);
            A a10 = A.f21846a;
            try {
                Rect surfaceFrame = parentSurface.getHolder().getSurfaceFrame();
                SurfaceControl surfaceControl = parentSurface.getSurfaceControl();
                if (surfaceControl != null && (surfaceControlMirrorSurfaceControl = iWallpaperEngine.mirrorSurfaceControl()) != null && (fArrJ0 = j0(parentSurface)) != null) {
                    SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                    try {
                        transaction.setMatrix(surfaceControlMirrorSurfaceControl, fArrJ0[0], fArrJ0[3], fArrJ0[1], fArrJ0[4]);
                        transaction.reparent(surfaceControlMirrorSurfaceControl, surfaceControl);
                        transaction.show(surfaceControlMirrorSurfaceControl);
                        transaction.apply();
                        p189s8.b.a(transaction, null);
                        synchronized (this) {
                            this.f27806G.add(surfaceControlMirrorSurfaceControl);
                        }
                        f27797K.a("conn internal do mirrorAndReparent success, parentSurface size[" + surfaceFrame.width() + "," + surfaceFrame.height() + "], values[" + fArrJ0[0] + "," + fArrJ0[3] + "," + fArrJ0[1] + "," + fArrJ0[4] + "]");
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p189s8.b.a(transaction, th);
                            throw th2;
                        }
                    }
                }
            } catch (RemoteException e10) {
                f27797K.e("Couldn't reparent wallpaper surface " + e10);
            } catch (NullPointerException e11) {
                f27797K.e("Couldn't reparent wallpaper surface " + e11);
            }
        }
    }

    public final void n0(h conn) {
        n.h(conn, "conn");
        b bVar = f27797K;
        bVar.a("register " + conn);
        synchronized (this) {
            try {
                if (this.f27815w.add(conn)) {
                    this.f27818z = true;
                } else {
                    bVar.e(conn + " already added.");
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onLocalWallpaperColorsChanged(RectF rectF, WallpaperColors wallpaperColors, int i10) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f27797K.a("conn internal onServiceConnected.");
        this.f27801B = IWallpaperService.Stub.asInterface(iBinder);
        synchronized (this) {
            this.f27816x.g(s6.a.e.d.f27757s);
            A a10 = A.f21846a;
        }
        e0(false);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        f27797K.a("conn internal onServiceDisconnected " + componentName + ".");
        this.f27801B = null;
        this.f27802C = null;
        synchronized (this) {
            this.f27816x.g(new s6.a.e.C0672e(true));
            A a10 = A.f21846a;
        }
        e0(false);
    }

    public void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i10) {
        synchronized (this) {
            try {
                for (h hVar : this.f27815w) {
                    if (hVar.B(new l() { // from class: s6.k
                        @Override // p219v8.l
                        public final Object f(Object obj) {
                            return Boolean.valueOf(p.m0((b) obj));
                        }
                    })) {
                        hVar.x(wallpaperColors, i10);
                    }
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p0(boolean z9) {
        synchronized (this) {
            if (!z9) {
                try {
                    CopyOnWriteArraySet copyOnWriteArraySet = this.f27815w;
                    if (copyOnWriteArraySet == null || !copyOnWriteArraySet.isEmpty()) {
                        Iterator it = copyOnWriteArraySet.iterator();
                        while (it.hasNext()) {
                            if (((h) it.next()).B(new l() { // from class: s6.l
                                @Override // p219v8.l
                                public final Object f(Object obj) {
                                    return Boolean.valueOf(p.q0((b) obj));
                                }
                            })) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f27803D = z9;
            o0(z9);
            A a10 = A.f21846a;
        }
    }

    public ParcelFileDescriptor setWallpaper(String str) {
        return null;
    }

    public p(ComponentName componentName, Context appContext, int i10, C.d whichPreview, WallpaperDescription wallpaperDescription) {
        n.h(componentName, "componentName");
        n.h(appContext, "appContext");
        n.h(whichPreview, "whichPreview");
        this.f27809q = componentName;
        this.f27810r = appContext;
        this.f27811s = i10;
        this.f27812t = whichPreview;
        this.f27813u = wallpaperDescription;
        Intent intent = new Intent("android.service.wallpaper.WallpaperService");
        intent.setClassName(componentName.getPackageName(), componentName.getClassName());
        this.f27814v = intent;
        this.f27815w = new CopyOnWriteArraySet();
        this.f27816x = new b(null, null, false, 7, null);
        this.f27817y = new Runnable() { // from class: s6.m
            @Override // java.lang.Runnable
            public final void run() {
                p.t0(this.f27794q);
            }
        };
        this.f27806G = new ArrayList();
    }
}
