package p177r6;

import H3.C;
import H3.s;
import android.app.WallpaperColors;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperEngine;
import android.service.wallpaper.IWallpaperService;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceControl;
import android.view.View;
import com.android.launcher3.w;
import com.nothing.wallpaper.common.log.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends IWallpaperConnection.Stub implements ServiceConnection {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final a f27541I = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private IWallpaperService f27542A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Point f27543B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private IWallpaperEngine f27544C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f27545D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final ArrayList f27546E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Runnable f27547F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f27548G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f27549H;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Intent f27550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f27551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C.c f27552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f27553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ArrayList f27554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Context f27555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f27556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f27557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f27558y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f27559z;

    public static final class a {

        /* JADX INFO: renamed from: r6.g$a$a, reason: collision with other inner class name */
        public static final class C0663a implements C.c {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p219v8.a f27560q;

            C0663a(p219v8.a aVar) {
                this.f27560q = aVar;
            }

            @Override // H3.C.c
            public void m() {
                p219v8.a aVar = this.f27560q;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final g a(ComponentName componentName, View view, Context context, int i10, p219v8.a aVar) {
            n.h(componentName, "componentName");
            n.h(context, "context");
            Intent intent = new Intent("android.service.wallpaper.WallpaperService");
            intent.setClassName(componentName.getPackageName(), componentName.getClassName());
            return new g(intent, context, view, new C0663a(aVar), i10);
        }

        private a() {
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f27561q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g f27562r;

        public b(View view, g gVar) {
            this.f27561q = view;
            this.f27562r = gVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f27561q.removeOnAttachStateChangeListener(this);
            this.f27562r.a0(view.getDisplay().getDisplayId());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public g(Intent intent, Context context, View view, C.c cVar, int i10) {
        n.h(intent, "intent");
        n.h(context, "context");
        this.f27550q = intent;
        this.f27551r = view;
        this.f27552s = cVar;
        this.f27553t = i10;
        this.f27554u = new ArrayList();
        this.f27555v = context.getApplicationContext();
        this.f27546E = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(int i10) {
        View view;
        IWallpaperService iWallpaperService = this.f27542A;
        if (iWallpaperService == null || (view = this.f27551r) == null) {
            return;
        }
        if (w.f15765i) {
            IBinder windowToken = view.getWindowToken();
            n.g(windowToken, "getWindowToken(...)");
            h.b(iWallpaperService, this, i10, windowToken, view.getWidth(), view.getHeight(), this.f27553t, null);
        } else {
            IBinder windowToken2 = view.getWindowToken();
            n.g(windowToken2, "getWindowToken(...)");
            h.c(iWallpaperService, this, i10, windowToken2, view.getWidth(), view.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(g gVar, IWallpaperEngine iWallpaperEngine) {
        c.d("NTWallpaperConnection", "onAttachEngine");
        C.c cVar = gVar.f27552s;
        if (cVar != null) {
            cVar.e(iWallpaperEngine);
        }
        Runnable runnable = gVar.f27547F;
        if (runnable != null) {
            runnable.run();
        }
        gVar.f27547F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(g gVar, String str, Bundle bundle) {
        Bundle bundle2;
        try {
            IWallpaperEngine iWallpaperEngine = gVar.f27544C;
            if (iWallpaperEngine != null) {
                bundle2 = bundle;
                try {
                    iWallpaperEngine.dispatchWallpaperCommand(str, 0, 0, 0, bundle2);
                } catch (RemoteException unused) {
                    Log.e("NTWallpaperConnection", "Error dispatching wallpaper command: " + bundle2);
                }
            }
        } catch (RemoteException unused2) {
            bundle2 = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(g gVar) {
        C.c cVar = gVar.f27552s;
        if (cVar != null) {
            cVar.m();
        }
        gVar.p0();
    }

    private final Point i0() {
        Display display;
        Point point = this.f27543B;
        if (point != null) {
            return point;
        }
        s sVarA = s.a();
        View view = this.f27551r;
        if (view == null || (display = view.getDisplay()) == null) {
            throw new NullPointerException("Display is null due to the view not currently attached to a window.");
        }
        Point pointE = sVarA.e(display);
        this.f27543B = pointE;
        n.g(pointE, "also(...)");
        return pointE;
    }

    private final float[] k0(Rect rect) {
        Matrix matrix = new Matrix();
        float[] fArr = new float[9];
        c.d("NTWallpaperConnection", "getScale desired[" + rect.width() + "," + rect.height() + "], engineSize[" + this.f27548G + "," + this.f27549H + "]");
        matrix.postScale(((float) rect.width()) / ((float) this.f27548G), ((float) rect.height()) / ((float) this.f27549H));
        matrix.getValues(fArr);
        return fArr;
    }

    private final void l0(SurfaceControl surfaceControl, Rect rect) {
        Object objB;
        boolean zAdd;
        synchronized (this) {
            IWallpaperEngine iWallpaperEngine = this.f27544C;
            if (iWallpaperEngine == null) {
                c.k("NTWallpaperConnection", "Engine is null, was the service disconnected?");
                return;
            }
            n.e(iWallpaperEngine);
            A a10 = A.f21846a;
            try {
                q.a aVar = q.f21862r;
                SurfaceControl surfaceControlMirrorSurfaceControl = iWallpaperEngine.mirrorSurfaceControl();
                if (surfaceControlMirrorSurfaceControl == null) {
                    return;
                }
                float[] fArrK0 = k0(rect);
                SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                try {
                    transaction.setMatrix(surfaceControlMirrorSurfaceControl, fArrK0[0], fArrK0[3], fArrK0[1], fArrK0[4]);
                    transaction.reparent(surfaceControlMirrorSurfaceControl, surfaceControl);
                    transaction.show(surfaceControlMirrorSurfaceControl);
                    transaction.apply();
                    p189s8.b.a(transaction, null);
                    synchronized (this) {
                        zAdd = this.f27554u.add(surfaceControlMirrorSurfaceControl);
                    }
                    objB = q.b(Boolean.valueOf(zAdd));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p189s8.b.a(transaction, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th3));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                c.g("NTWallpaperConnection", "Couldn't reparent wallpaper surface", thD);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(g gVar, WallpaperColors wallpaperColors, int i10) {
        C.c cVar = gVar.f27552s;
        if (cVar != null) {
            cVar.onWallpaperColorsChanged(wallpaperColors, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(g gVar, SurfaceControl surfaceControl, Rect rect) {
        gVar.l0(surfaceControl, rect);
    }

    private final void p0() {
        Iterator it = this.f27546E.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f27546E.clear();
    }

    private final void q0(boolean z9) {
        IWallpaperEngine iWallpaperEngine = this.f27544C;
        if (iWallpaperEngine == null || z9 == this.f27559z) {
            return;
        }
        if (iWallpaperEngine != null) {
            try {
                iWallpaperEngine.setVisibility(z9);
            } catch (RemoteException e10) {
                c.o("NTWallpaperConnection", "Failure setting wallpaper visibility :" + e10);
                return;
            }
        }
        this.f27559z = z9;
    }

    public void attachEngine(final IWallpaperEngine iWallpaperEngine, int i10) {
        Object objB;
        View view;
        synchronized (this) {
            try {
                q.a aVar = q.f21862r;
                A a10 = null;
                if (this.f27557x) {
                    this.f27544C = iWallpaperEngine;
                    if (this.f27558y) {
                        q0(true);
                    }
                    View view2 = this.f27551r;
                    if (view2 != null) {
                        view2.postDelayed(new Runnable() { // from class: r6.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.b0(this.f27529q, iWallpaperEngine);
                            }
                        }, 16L);
                    }
                    Point pointI0 = i0();
                    this.f27548G = pointI0.x;
                    this.f27549H = pointI0.y;
                    ComponentName component = this.f27550q.getComponent();
                    n.e(component);
                    if (p177r6.a.a(component) && (view = this.f27551r) != null) {
                        this.f27548G = view.getWidth();
                        this.f27549H = view.getHeight();
                    }
                    c.d("NTWallpaperConnection", "attachEngine resizePreview size[" + this.f27548G + "," + this.f27549H + "]");
                    if (iWallpaperEngine != null) {
                        iWallpaperEngine.resizePreview(new Rect(0, 0, this.f27548G, this.f27549H));
                    }
                    if (iWallpaperEngine != null) {
                        iWallpaperEngine.requestWallpaperColors();
                        a10 = A.f21846a;
                    }
                } else if (iWallpaperEngine != null) {
                    iWallpaperEngine.destroy();
                    a10 = A.f21846a;
                }
                objB = q.b(a10);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                Log.w("NTWallpaperConnection", "Failed calling WallpaperEngine APIs:" + thD);
            }
        }
    }

    public final boolean c0() {
        if (this.f27556w) {
            throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
        }
        synchronized (this) {
            if (this.f27557x) {
                return true;
            }
            if (!this.f27555v.bindService(this.f27550q, this, 577)) {
                return false;
            }
            this.f27557x = true;
            A a10 = A.f21846a;
            C.c cVar = this.f27552s;
            if (cVar != null) {
                cVar.H();
            }
            return true;
        }
    }

    public final void d0() {
        e0();
        this.f27552s = null;
        this.f27551r = null;
        this.f27556w = true;
    }

    public final void e0() {
        synchronized (this) {
            try {
                this.f27557x = false;
                this.f27545D = false;
                IWallpaperEngine iWallpaperEngine = this.f27544C;
                if (iWallpaperEngine != null) {
                    if (iWallpaperEngine != null) {
                        try {
                            iWallpaperEngine.destroy();
                        } catch (RemoteException unused) {
                        }
                    }
                    Iterator it = this.f27554u.iterator();
                    n.g(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        n.g(next, "next(...)");
                        ((SurfaceControl) next).release();
                    }
                    this.f27554u.clear();
                    this.f27544C = null;
                }
                try {
                    this.f27555v.unbindService(this);
                    c.k("NTWallpaperConnection", "unbind wallpaper service.");
                } catch (IllegalArgumentException e10) {
                    c.k("NTWallpaperConnection", "Can't unbind wallpaper service. It might have crashed, just ignoring " + e10 + ".");
                }
                this.f27542A = null;
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f27548G = 0;
        this.f27549H = 0;
        C.c cVar = this.f27552s;
        if (cVar != null) {
            cVar.E();
        }
        this.f27546E.clear();
    }

    public void engineShown(IWallpaperEngine iWallpaperEngine) {
        if (this.f27557x) {
            this.f27545D = true;
            View view = this.f27551r;
            if (view != null) {
                view.post(new Runnable() { // from class: r6.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.h0(this.f27534q);
                    }
                });
            }
        }
    }

    public final void f0(final String action, final Bundle bundle) {
        n.h(action, "action");
        IWallpaperEngine iWallpaperEngine = this.f27544C;
        if (iWallpaperEngine != null) {
            iWallpaperEngine.dispatchWallpaperCommand(action, 0, 0, 0, bundle);
        } else {
            this.f27547F = new Runnable() { // from class: r6.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.g0(this.f27538q, action, bundle);
                }
            };
        }
    }

    public final IWallpaperEngine j0() {
        return this.f27544C;
    }

    public final void n0(final SurfaceControl surfaceControl, final Rect surfacePosition) {
        n.h(surfacePosition, "surfacePosition");
        if (surfaceControl == null) {
            return;
        }
        if (this.f27545D) {
            l0(surfaceControl, surfacePosition);
        } else {
            this.f27546E.add(new Runnable() { // from class: r6.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.o0(this.f27535q, surfaceControl, surfacePosition);
                }
            });
        }
    }

    public void onLocalWallpaperColorsChanged(RectF rectF, WallpaperColors wallpaperColors, int i10) {
        c.k("NTWallpaperConnection", "onLocalWallpaperColorsChanged");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f27542A = IWallpaperService.Stub.asInterface(iBinder);
        View view = this.f27551r;
        if (view != null) {
            if (view.getDisplay() != null) {
                a0(view.getDisplay().getDisplayId());
            } else if (view.isAttachedToWindow()) {
                a0(view.getDisplay().getDisplayId());
            } else {
                view.addOnAttachStateChangeListener(new b(view, this));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f27542A = null;
        this.f27544C = null;
        c.o("NTWallpaperConnection", "Wallpaper service gone: " + componentName);
    }

    public void onWallpaperColorsChanged(final WallpaperColors wallpaperColors, final int i10) {
        View view = this.f27551r;
        if (view != null) {
            view.post(new Runnable() { // from class: r6.c
                @Override // java.lang.Runnable
                public final void run() {
                    g.m0(this.f27531q, wallpaperColors, i10);
                }
            });
        }
    }

    public final void r0(boolean z9) {
        synchronized (this) {
            this.f27558y = z9;
            q0(z9);
            A a10 = A.f21846a;
        }
    }

    public ParcelFileDescriptor setWallpaper(String str) {
        return null;
    }
}
