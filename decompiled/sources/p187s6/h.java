package p187s6;

import H3.C;
import H3.s;
import android.app.WallpaperColors;
import android.app.wallpaper.WallpaperDescription;
import android.content.ComponentName;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperEngine;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.android.launcher3.w;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.k;
import p079h8.A;
import p079h8.i;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f27775j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p167q6.b f27776k = new p167q6.b("SharedWallpaperConnection");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C.c f27777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C.d f27779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WallpaperDescription f27780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SurfaceView f27781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SurfaceView f27782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f27783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p079h8.h f27784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p187s6.b f27785i;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f27786q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ h f27787r;

        public b(View view, h hVar) {
            this.f27786q = view;
            this.f27787r = hVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f27786q.removeOnAttachStateChangeListener(this);
            this.f27787r.v();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static final class c implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SurfaceView f27789r;

        c(SurfaceView surfaceView) {
            this.f27789r = surfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            n.h(surfaceHolder, "surfaceHolder");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            n.h(surfaceHolder, "surfaceHolder");
            h.this.r().l0(this.f27789r);
            this.f27789r.getHolder().removeCallback(this);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            n.h(surfaceHolder, "surfaceHolder");
        }
    }

    public h(final k liveWallpaperInfo, SurfaceView view, SurfaceView surfaceView, C.c cVar, int i10, C.d whichPreview, final boolean z9, WallpaperDescription wallpaperDescription) {
        n.h(liveWallpaperInfo, "liveWallpaperInfo");
        n.h(view, "view");
        n.h(whichPreview, "whichPreview");
        this.f27777a = cVar;
        this.f27778b = i10;
        this.f27779c = whichPreview;
        this.f27780d = wallpaperDescription;
        j.f27790a.g(view.getContext().getApplicationContext());
        this.f27781e = view;
        this.f27782f = surfaceView;
        this.f27783g = true;
        this.f27784h = i.b(new p219v8.a() { // from class: s6.c
            @Override // p219v8.a
            public final Object invoke() {
                return h.m(z9, liveWallpaperInfo, this);
            }
        });
        r().n0(this);
        this.f27785i = new p187s6.b(null, null, false, 7, null);
    }

    private final void k() {
        SurfaceView surfaceView = this.f27781e;
        if (surfaceView != null) {
            surfaceView.postDelayed(new Runnable() { // from class: s6.e
                @Override // java.lang.Runnable
                public final void run() {
                    h.l(this.f27770q);
                }
            }, 16L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(h hVar) {
        C.c cVar = hVar.f27777a;
        if (cVar != null) {
            cVar.e(hVar.r().i0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p m(boolean z9, k kVar, h hVar) {
        if (w.f15765i) {
            if (z9) {
                j jVar = j.f27790a;
                ComponentName component = kVar.q().getComponent();
                n.g(component, "getComponent(...)");
                return jVar.a(component, hVar.f27778b, hVar.f27779c, hVar.f27780d);
            }
            j jVar2 = j.f27790a;
            ComponentName component2 = kVar.q().getComponent();
            n.g(component2, "getComponent(...)");
            return jVar2.d(component2, hVar.f27778b, hVar.f27779c, hVar.f27780d);
        }
        if (z9) {
            j jVar3 = j.f27790a;
            ComponentName component3 = kVar.q().getComponent();
            n.g(component3, "getComponent(...)");
            return j.b(jVar3, component3, hVar.f27778b, hVar.f27779c, null, 8, null);
        }
        j jVar4 = j.f27790a;
        ComponentName component4 = kVar.q().getComponent();
        n.g(component4, "getComponent(...)");
        return j.e(jVar4, component4, hVar.f27778b, hVar.f27779c, null, 8, null);
    }

    private final void o() {
        final SurfaceView surfaceView = this.f27781e;
        if (surfaceView != null) {
            surfaceView.post(new Runnable() { // from class: s6.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.q(this.f27771q, surfaceView);
                }
            });
        }
        final SurfaceView surfaceView2 = this.f27782f;
        if (surfaceView2 != null) {
            surfaceView2.post(new Runnable() { // from class: s6.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.p(this.f27773q, surfaceView2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar, SurfaceView surfaceView) {
        hVar.z(surfaceView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(h hVar, SurfaceView surfaceView) {
        Bundle bundle = new Bundle();
        bundle.putInt("which_preview", hVar.f27779c.e());
        try {
            IWallpaperEngine iWallpaperEngineI0 = hVar.r().i0();
            if (iWallpaperEngineI0 != null) {
                iWallpaperEngineI0.dispatchWallpaperCommand("android.wallpaper.previewinfo", 0, 0, 0, bundle);
            }
        } catch (RemoteException unused) {
            f27776k.e("Error dispatching wallpaper command:" + hVar.f27779c);
        }
        hVar.z(surfaceView);
        C.c cVar = hVar.f27777a;
        if (cVar != null) {
            cVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p r() {
        return (p) this.f27784h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        boolean Z9;
        p187s6.b bVar = this.f27785i;
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
                p187s6.b.f27760e.a(bVar + " do event " + c0670a + " but already in state.");
                return;
            }
            SurfaceView surfaceView = this.f27781e;
            if (surfaceView == null) {
                return;
            }
            if (surfaceView.getDisplay() == null) {
                if (surfaceView.isAttachedToWindow()) {
                    v();
                } else {
                    surfaceView.addOnAttachStateChangeListener(new b(surfaceView, this));
                }
                Z9 = false;
            } else {
                p pVarR = r();
                int displayId = surfaceView.getDisplay().getDisplayId();
                IBinder windowToken = surfaceView.getWindowToken();
                n.g(windowToken, "getWindowToken(...)");
                Z9 = pVarR.Z(displayId, windowToken, surfaceView.getWidth(), surfaceView.getHeight());
            }
            a11.f22775q = Z9;
            if (Z9) {
                bVar.f27762b = c0670a;
            }
            A a12 = A.f21846a;
            p187s6.b.f27760e.a(bVar + " do event " + c0670a + ", success " + a11.f22775q + ".");
        }
    }

    private final void w() {
        synchronized (this) {
            if (this.f27785i.c(s6.a.b.f27749r)) {
                this.f27785i.g(new s6.a.e.C0672e(false, 1, null));
                A a10 = A.f21846a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(h hVar, WallpaperColors wallpaperColors, int i10) {
        C.c cVar = hVar.f27777a;
        if (cVar != null) {
            cVar.onWallpaperColorsChanged(wallpaperColors, i10);
        }
    }

    private final void z(SurfaceView surfaceView) {
        if (!this.f27783g) {
            f27776k.f("not allow mirror, skip it.");
        } else if (surfaceView.getSurfaceControl() != null) {
            r().l0(surfaceView);
        } else {
            f27776k.a("SurfaceView not initialized yet, adding callback");
            surfaceView.getHolder().addCallback(new c(surfaceView));
        }
    }

    public final void A(boolean z9) {
        this.f27783g = z9;
    }

    public final boolean B(l predicate) {
        boolean zBooleanValue;
        n.h(predicate, "predicate");
        synchronized (this) {
            zBooleanValue = ((Boolean) predicate.f(this.f27785i)).booleanValue();
        }
        return zBooleanValue;
    }

    @Override // p187s6.i
    public void a() {
        p187s6.b bVar = this.f27785i;
        s6.a.c cVar = s6.a.c.f27750r;
        if (!n.d(cVar, cVar)) {
            synchronized (this) {
                if (bVar.c(cVar)) {
                    throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
                }
                A a10 = A.f21846a;
            }
        }
        synchronized (this) {
            if (bVar.c(cVar)) {
                p187s6.b.f27760e.a(bVar + " do event " + cVar + " but already in state.");
                return;
            }
            n();
            r().b0(this);
            bVar.f27762b = cVar;
            A a11 = A.f21846a;
            synchronized (this) {
                this.f27785i.f();
            }
            this.f27781e = null;
            this.f27782f = null;
            this.f27777a = null;
            p187s6.b.f27760e.a(bVar + " do event " + cVar + ", success true.");
        }
    }

    @Override // p187s6.i
    public boolean b() {
        C.c cVar;
        p187s6.b bVar = this.f27785i;
        s6.a.b bVar2 = s6.a.b.f27749r;
        s6.a.c cVar2 = s6.a.c.f27750r;
        if (!n.d(bVar2, cVar2)) {
            synchronized (this) {
                if (bVar.c(cVar2)) {
                    throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
                }
                A a10 = A.f21846a;
            }
        }
        synchronized (this) {
            if (bVar.c(bVar2)) {
                p187s6.b.f27760e.a(bVar + " do event " + bVar2 + " but already in state.");
                return true;
            }
            boolean zA0 = r().a0();
            if (zA0) {
                bVar.f27762b = bVar2;
            }
            A a11 = A.f21846a;
            if (zA0 && (cVar = this.f27777a) != null) {
                cVar.H();
            }
            p187s6.b.f27760e.a(bVar + " do event " + bVar2 + ", success " + zA0 + ".");
            return zA0;
        }
    }

    @Override // p187s6.i
    public void c(boolean z9) {
        synchronized (this) {
            this.f27785i.h(z9);
            r().p0(z9);
            A a10 = A.f21846a;
        }
    }

    public final void n() {
        p187s6.b bVar = this.f27785i;
        s6.a.d dVar = s6.a.d.f27751r;
        s6.a.c cVar = s6.a.c.f27750r;
        if (!n.d(dVar, cVar)) {
            synchronized (this) {
                if (bVar.c(cVar)) {
                    throw new IllegalStateException("Cannot connect on a destroyed WallpaperConnection");
                }
                A a10 = A.f21846a;
            }
        }
        synchronized (this) {
            if (bVar.c(dVar)) {
                p187s6.b.f27760e.a(bVar + " do event " + dVar + " but already in state.");
                return;
            }
            r().c0();
            bVar.f27762b = dVar;
            A a11 = A.f21846a;
            synchronized (this) {
                this.f27785i.f();
            }
            C.c cVar2 = this.f27777a;
            if (cVar2 != null) {
                cVar2.E();
            }
            p187s6.b.f27760e.a(bVar + " do event " + dVar + ", success true.");
        }
    }

    public final Point s() {
        Display display;
        SurfaceView surfaceView = this.f27781e;
        if (surfaceView == null || (display = surfaceView.getDisplay()) == null) {
            throw new NullPointerException("Display is null due to the view not currently attached to a window.");
        }
        Point pointE = s.a().e(display);
        n.g(pointE, "getScreenSize(...)");
        return pointE;
    }

    public final Point t() {
        SurfaceView surfaceView = this.f27781e;
        if (surfaceView != null) {
            return new Point(surfaceView.getWidth(), surfaceView.getHeight());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x0003, B:13:0x001f, B:9:0x000f, B:11:0x0017), top: B:35:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x000f A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x0003, B:13:0x001f, B:9:0x000f, B:11:0x0017), top: B:35:0x0003 }] */
    public final boolean u(s6.a.e eVar) {
        boolean zF;
        synchronized (this) {
            if (eVar != null) {
                try {
                    if (this.f27785i.i(eVar)) {
                        zF = false;
                    } else {
                        zF = this.f27785i.f();
                        if (zF) {
                            eVar = this.f27785i.d();
                        } else {
                            eVar = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                zF = this.f27785i.f();
                if (zF) {
                    eVar = this.f27785i.d();
                } else {
                    eVar = null;
                }
            }
            A a10 = A.f21846a;
        }
        f27776k.a(this + " moveState moved " + zF + ", newState " + eVar + ".");
        if (eVar != null) {
            if (n.d(eVar, s6.a.e.d.f27757s)) {
                v();
                return zF;
            }
            if (eVar instanceof s6.a.e.b) {
                if (((s6.a.e.b) eVar).k()) {
                    o();
                    return zF;
                }
                k();
                return zF;
            }
            if (eVar instanceof s6.a.e.C0672e) {
                w();
            }
        }
        return zF;
    }

    public final void x(final WallpaperColors wallpaperColors, final int i10) {
        SurfaceView surfaceView = this.f27781e;
        if (surfaceView != null) {
            surfaceView.post(new Runnable() { // from class: s6.d
                @Override // java.lang.Runnable
                public final void run() {
                    h.y(this.f27767q, wallpaperColors, i10);
                }
            });
        }
    }

    public /* synthetic */ h(k kVar, SurfaceView surfaceView, SurfaceView surfaceView2, C.c cVar, int i10, C.d dVar, boolean z9, WallpaperDescription wallpaperDescription, int i11, AbstractC1457h abstractC1457h) {
        this(kVar, surfaceView, surfaceView2, cVar, i10, dVar, (i11 & 64) != 0 ? true : z9, (i11 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : wallpaperDescription);
    }
}
