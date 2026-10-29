package H3;

import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.wallpaper.WallpaperDescription;
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
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperEngine;
import android.service.wallpaper.IWallpaperService;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class C extends IWallpaperConnection.Stub implements ServiceConnection {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Looper f2422K = Looper.getMainLooper();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f2423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f2424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f2425C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f2426D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f2427E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private d f2428F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final WallpaperDescription f2429G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private IBinder f2430H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f2431I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f2432J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f2433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Intent f2434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f2435s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f2436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private SurfaceView f2437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private SurfaceView f2438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private IWallpaperService f2439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IWallpaperEngine f2440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Point f2441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2442z;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C.this.c0(view.getDisplay().getDisplayId());
            C.this.f2437u.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    class b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ SurfaceView f2444q;

        b(SurfaceView surfaceView) {
            this.f2444q = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C.this.r0(this.f2444q);
            this.f2444q.getHolder().removeCallback(this);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    public interface c {
        default void E() {
        }

        default void H() {
        }

        default void e(IWallpaperEngine iWallpaperEngine) {
        }

        void m();

        default void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i10) {
        }
    }

    public enum d {
        PREVIEW_CURRENT(0),
        EDIT_CURRENT(1),
        EDIT_NON_CURRENT(2);


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f2450q;

        d(int i10) {
            this.f2450q = i10;
        }

        public int e() {
            return this.f2450q;
        }
    }

    public C(Intent intent, Context context, c cVar, SurfaceView surfaceView, SurfaceView surfaceView2, Integer num, d dVar, WallpaperDescription wallpaperDescription) {
        this.f2433q = context.getApplicationContext();
        this.f2434r = intent;
        this.f2436t = cVar;
        this.f2437u = surfaceView;
        this.f2438v = surfaceView2;
        this.f2427E = num == null ? 1 : num.intValue();
        this.f2428F = dVar;
        this.f2429G = wallpaperDescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i10) {
        IBinder windowToken = this.f2437u.getWindowToken();
        this.f2430H = windowToken;
        try {
            if (com.android.launcher3.w.f15765i) {
                this.f2439w.attach(this, windowToken, 1001, true, this.f2437u.getWidth(), this.f2437u.getHeight(), new Rect(0, 0, 0, 0), i10, this.f2427E, (WallpaperInfo) null, this.f2429G);
            } else {
                v0(i10);
            }
        } catch (RemoteException e10) {
            Log.w("WallpaperConnection", "Failed attaching wallpaper; clearing", e10);
        }
    }

    private synchronized void f0() {
        try {
            IWallpaperEngine iWallpaperEngine = this.f2440x;
            if (iWallpaperEngine == null) {
                return;
            }
            try {
                iWallpaperEngine.destroy();
                Iterator it = this.f2435s.iterator();
                while (it.hasNext()) {
                    ((SurfaceControl) it.next()).release();
                }
                this.f2435s.clear();
            } catch (RemoteException unused) {
            }
            this.f2440x = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private Point h0() {
        Point point = this.f2441y;
        if (point != null) {
            return point;
        }
        s sVarA = s.a();
        Display display = this.f2437u.getDisplay();
        if (display == null) {
            throw new NullPointerException("Display is null due to the view not currently attached to a window.");
        }
        Point pointE = sVarA.e(display);
        this.f2441y = pointE;
        return pointE;
    }

    private float[] j0(SurfaceView surfaceView) {
        Matrix matrix = new Matrix();
        float[] fArr = new float[9];
        Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
        matrix.postScale(surfaceFrame.width() / this.f2431I, surfaceFrame.height() / this.f2432J);
        matrix.getValues(fArr);
        return fArr;
    }

    public static boolean l0() {
        try {
            return IWallpaperEngine.class.getMethod("mirrorSurfaceControl", new Class[0]) != null;
        } catch (NoSuchMethodException | SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(IWallpaperEngine iWallpaperEngine) {
        c cVar = this.f2436t;
        if (cVar != null) {
            cVar.e(iWallpaperEngine);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0() {
        s0(this.f2437u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0() {
        s0(this.f2438v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0() {
        c cVar = this.f2436t;
        if (cVar != null) {
            cVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(WallpaperColors wallpaperColors, int i10) {
        c cVar = this.f2436t;
        if (cVar != null) {
            cVar.onWallpaperColorsChanged(wallpaperColors, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(SurfaceView surfaceView) {
        synchronized (this) {
            try {
                IWallpaperEngine iWallpaperEngine = this.f2440x;
                if (iWallpaperEngine == null) {
                    Log.i("WallpaperConnection", "Engine is null, was the service disconnected?");
                    return;
                }
                try {
                    SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
                    SurfaceControl surfaceControlMirrorSurfaceControl = iWallpaperEngine.mirrorSurfaceControl();
                    if (surfaceControlMirrorSurfaceControl == null) {
                        return;
                    }
                    float[] fArrJ0 = j0(surfaceView);
                    SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
                    try {
                        transaction.setMatrix(surfaceControlMirrorSurfaceControl, fArrJ0[0], fArrJ0[3], fArrJ0[1], fArrJ0[4]);
                        transaction.reparent(surfaceControlMirrorSurfaceControl, surfaceControl);
                        transaction.show(surfaceControlMirrorSurfaceControl);
                        transaction.apply();
                        transaction.close();
                        synchronized (this) {
                            this.f2435s.add(surfaceControlMirrorSurfaceControl);
                        }
                    } catch (Throwable th) {
                        try {
                            transaction.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (RemoteException | NullPointerException e10) {
                    Log.e("WallpaperConnection", "Couldn't reparent wallpaper surface", e10);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void s0(SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f2440x == null) {
                    Log.i("WallpaperConnection", "Engine is null, was the service disconnected?");
                } else if (surfaceView.getSurfaceControl() != null) {
                    r0(surfaceView);
                } else {
                    Log.d("WallpaperConnection", "SurfaceView not initialized yet, adding callback");
                    surfaceView.getHolder().addCallback(new b(surfaceView));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void t0(boolean z9) {
        IWallpaperEngine iWallpaperEngine = this.f2440x;
        if (iWallpaperEngine == null || z9 == this.f2424B) {
            return;
        }
        try {
            iWallpaperEngine.setVisibility(z9);
            this.f2424B = z9;
        } catch (RemoteException e10) {
            Log.w("WallpaperConnection", "Failure setting wallpaper visibility ", e10);
        }
    }

    private boolean v0(int i10) {
        try {
            Class<?> cls = this.f2439w.getClass();
            Class cls2 = Integer.TYPE;
            cls.getMethod("attach", IWallpaperConnection.class, IBinder.class, cls2, Boolean.TYPE, cls2, cls2, Rect.class, cls2, cls2, WallpaperInfo.class).invoke(this.f2439w, this, this.f2430H, 1001, Boolean.TRUE, Integer.valueOf(this.f2437u.getWidth()), Integer.valueOf(this.f2437u.getHeight()), new Rect(0, 0, 0, 0), Integer.valueOf(i10), 1, null);
            Log.d("WallpaperConnection", "Using pre-B version of IWallpaperService#attach");
            return true;
        } catch (IllegalAccessException | NoSuchMethodError | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    private synchronized void w0() {
        try {
            this.f2433q.unbindService(this);
        } catch (IllegalArgumentException unused) {
            Log.i("WallpaperConnection", "Can't unbind wallpaper service. It might have crashed, just ignoring.");
        }
        this.f2439w = null;
    }

    public void attachEngine(final IWallpaperEngine iWallpaperEngine, int i10) {
        synchronized (this) {
            try {
                if (this.f2442z) {
                    this.f2440x = iWallpaperEngine;
                    if (this.f2423A) {
                        t0(true);
                    }
                    SurfaceView surfaceView = this.f2437u;
                    if (surfaceView != null) {
                        surfaceView.postDelayed(new Runnable() { // from class: H3.x
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f2532q.m0(iWallpaperEngine);
                            }
                        }, 16L);
                    }
                    try {
                        Point pointH0 = h0();
                        SurfaceView surfaceView2 = this.f2437u;
                        this.f2431I = surfaceView2 != null ? surfaceView2.getWidth() : pointH0.x;
                        SurfaceView surfaceView3 = this.f2437u;
                        this.f2432J = surfaceView3 != null ? surfaceView3.getHeight() : pointH0.y;
                        com.nothing.wallpaper.common.log.c.d("WallpaperConnection", "attachEngine resizePreview size[" + this.f2431I + "," + this.f2432J + "].");
                        this.f2440x.resizePreview(new Rect(0, 0, this.f2431I, this.f2432J));
                        this.f2440x.requestWallpaperColors();
                    } catch (RemoteException | NullPointerException e10) {
                        Log.w("WallpaperConnection", "Failed calling WallpaperEngine APIs", e10);
                    }
                } else {
                    try {
                        iWallpaperEngine.destroy();
                    } catch (RemoteException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d0() {
        if (this.f2426D) {
            throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
        }
        synchronized (this) {
            try {
                if (this.f2442z) {
                    return true;
                }
                if (!this.f2433q.bindService(this.f2434r, this, 577)) {
                    return false;
                }
                this.f2442z = true;
                c cVar = this.f2436t;
                if (cVar != null) {
                    cVar.H();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e0() {
        g0();
        this.f2437u = null;
        this.f2438v = null;
        this.f2436t = null;
        this.f2426D = true;
    }

    public void engineShown(IWallpaperEngine iWallpaperEngine) {
        this.f2425C = true;
        Bundle bundle = new Bundle();
        bundle.putInt("which_preview", this.f2428F.e());
        try {
            iWallpaperEngine.dispatchWallpaperCommand("android.wallpaper.previewinfo", 0, 0, 0, bundle);
        } catch (RemoteException unused) {
            Log.e("WallpaperConnection", "Error dispatching wallpaper command: " + this.f2428F.toString());
        }
        SurfaceView surfaceView = this.f2437u;
        if (surfaceView != null) {
            surfaceView.post(new Runnable() { // from class: H3.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2537q.n0();
                }
            });
        }
        SurfaceView surfaceView2 = this.f2438v;
        if (surfaceView2 != null) {
            surfaceView2.post(new Runnable() { // from class: H3.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2420q.o0();
                }
            });
        }
        SurfaceView surfaceView3 = this.f2437u;
        if (surfaceView3 != null) {
            surfaceView3.post(new Runnable() { // from class: H3.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2421q.p0();
                }
            });
        }
    }

    public void g0() {
        this.f2442z = false;
        f0();
        w0();
        c cVar = this.f2436t;
        if (cVar != null) {
            cVar.E();
        }
        this.f2432J = 0;
        this.f2431I = 0;
    }

    public IWallpaperEngine i0() {
        return this.f2440x;
    }

    public boolean k0() {
        return this.f2425C;
    }

    public void onLocalWallpaperColorsChanged(RectF rectF, WallpaperColors wallpaperColors, int i10) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f2437u == null) {
            return;
        }
        this.f2439w = IWallpaperService.Stub.asInterface(iBinder);
        if (this.f2437u.getDisplay() == null) {
            this.f2437u.addOnAttachStateChangeListener(new a());
        } else {
            c0(this.f2437u.getDisplay().getDisplayId());
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f2439w = null;
        this.f2440x = null;
        Log.w("WallpaperConnection", "Wallpaper service gone: " + componentName);
    }

    public void onWallpaperColorsChanged(final WallpaperColors wallpaperColors, final int i10) {
        SurfaceView surfaceView = this.f2437u;
        if (surfaceView != null) {
            surfaceView.post(new Runnable() { // from class: H3.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2534q.q0(wallpaperColors, i10);
                }
            });
        }
    }

    public ParcelFileDescriptor setWallpaper(String str) {
        return null;
    }

    public void u0(boolean z9) {
        synchronized (this) {
            this.f2423A = z9;
            t0(z9);
        }
    }

    public C(Intent intent, Context context, c cVar, SurfaceView surfaceView, SurfaceView surfaceView2, Integer num, d dVar) {
        this.f2433q = context.getApplicationContext();
        this.f2434r = intent;
        this.f2436t = cVar;
        this.f2437u = surfaceView;
        this.f2438v = surfaceView2;
        this.f2427E = num == null ? 1 : num.intValue();
        this.f2428F = dVar;
        this.f2429G = null;
    }
}
