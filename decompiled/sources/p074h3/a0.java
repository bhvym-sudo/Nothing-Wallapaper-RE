package p074h3;

import H3.D;
import H3.s;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.app.wallpaper.WallpaperDescription;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Display;
import androidx.fragment.app.J;
import com.android.launcher3.w;
import com.bumptech.glide.Glide;
import com.nothing.wallpaper.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Optional;
import java.util.function.Consumer;
import p064g3.k;
import p064g3.x;
import p084i3.w0;
import p098j7.j;
import p137n6.e;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U f21660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W f21661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f21662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1363c f21663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressDialog f21664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Optional f21665f = Optional.empty();

    class a implements U.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f21666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ U.a f21668c;

        a(x xVar, Activity activity, U.a aVar) {
            this.f21666a = xVar;
            this.f21667b = activity;
            this.f21668c = aVar;
        }

        @Override // h3.U.a
        public void a(Throwable th) {
            a0.this.k(this.f21667b);
            U.a aVar = this.f21668c;
            if (aVar != null) {
                aVar.a(th);
            }
        }

        @Override // h3.U.a
        public void b(x xVar, int i10) {
            a0.this.j(this.f21666a, this.f21667b);
            U.a aVar = this.f21668c;
            if (aVar != null) {
                aVar.b(this.f21666a, i10);
            }
        }
    }

    class b implements w0.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ w0.a f21670q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Activity f21671r;

        b(w0.a aVar, Activity activity) {
            this.f21670q = aVar;
            this.f21671r = activity;
        }

        @Override // i3.w0.a
        public void n(int i10) {
            w0.a aVar = this.f21670q;
            if (aVar != null) {
                aVar.n(i10);
            }
        }

        @Override // i3.w0.a
        public void u(boolean z9) {
            if (!z9) {
                a0.this.n(this.f21671r);
            }
            w0.a aVar = this.f21670q;
            if (aVar != null) {
                aVar.u(z9);
            }
        }
    }

    private class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WallpaperManager f21673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f21674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference f21675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f21676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f21677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final k f21678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f21679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final U.a f21680h;

        c(WallpaperManager wallpaperManager, Activity activity, Bitmap bitmap, k kVar, int i10, U.a aVar) {
            this.f21673a = wallpaperManager;
            this.f21675c = new WeakReference(activity);
            this.f21676d = activity.getApplicationContext();
            this.f21677e = activity.getUserId();
            this.f21674b = bitmap;
            this.f21678f = kVar;
            this.f21679g = i10;
            this.f21680h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            try {
                com.nothing.wallpaper.common.log.c.d("WallpaperSetter", "setDepthEffectWallpaper in background");
                boolean z9 = true;
                int iC = e.c(this.f21673a, this.f21674b, true, this.f21677e, U.d(this.f21679g), this.f21673a.getWallpaperIdForUser(1, this.f21677e));
                if (iC == 0) {
                    z9 = false;
                }
                j.Q0(this.f21676d, z9);
                com.nothing.wallpaper.common.log.c.d("WallpaperSetter", "setDepthEffectWallpaper wallpaper state:" + z9 + " depth id:" + iC);
                return null;
            } catch (Exception e10) {
                j.Q0(this.f21676d, false);
                com.nothing.wallpaper.common.log.c.f("WallpaperSetter", "Failed to set depth wallpaper in background: " + e10.getMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            Activity activity = (Activity) this.f21675c.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                com.nothing.wallpaper.common.log.c.d("WallpaperSetter", "SetLiveWallpaperTask onError");
                U.a aVar = this.f21680h;
                if (aVar != null) {
                    aVar.a(new Throwable());
                    return;
                }
                return;
            }
            com.nothing.wallpaper.common.log.c.d("WallpaperSetter", "SetLiveWallpaperTask onSuccess");
            a0.this.j(this.f21678f, (Activity) this.f21675c.get());
            U.a aVar2 = this.f21680h;
            if (aVar2 != null) {
                aVar2.b(this.f21678f, this.f21679g);
            }
            a0.this.f21660a.a(this.f21679g);
        }
    }

    public a0(U u9, W w9, S s9, InterfaceC1363c interfaceC1363c) {
        this.f21660a = u9;
        this.f21661b = w9;
        this.f21662c = s9;
        this.f21663d = interfaceC1363c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Activity activity, Integer num) {
        if (activity.getRequestedOrientation() != num.intValue()) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.f21665f = Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Activity activity, x xVar, com.android.wallpaper.asset.a aVar, int i10, U.a aVar2, Point point) {
        if (point == null) {
            Log.e("WallpaperSetter", "Raw wallpaper's dimensions are null");
            return;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point pointE = s.a().e(defaultDisplay);
        Rect rectJ = D.j(point, pointE);
        float fI = D.i(point, pointE);
        u(activity, xVar, aVar, i10, fI, D.g(activity.getApplicationContext(), defaultDisplay, point, rectJ, fI), null, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(x xVar, Activity activity) {
        this.f21662c.d(xVar.g(activity), xVar.r(), xVar.l());
        this.f21661b.p(0);
        this.f21662c.f(0);
        g();
        n(activity);
        this.f21660a.e(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Activity activity) {
        this.f21661b.p(0);
        g();
        n(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final Activity activity) {
        this.f21665f.ifPresent(new Consumer() { // from class: h3.Z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f21658a.h(activity, (Integer) obj);
            }
        });
    }

    private void o(Activity activity) {
        if (this.f21665f.isPresent()) {
            return;
        }
        this.f21665f = Optional.of(Integer.valueOf(activity.getRequestedOrientation()));
        activity.setRequestedOrientation(14);
    }

    private void p(Activity activity, k kVar, Bitmap bitmap, int i10, WallpaperColors wallpaperColors, U.a aVar) {
        com.nothing.wallpaper.common.log.c.d("WallpaperSetter", "setCurrentLiveWallpaper destination: " + i10);
        try {
            o(activity);
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(activity);
            k kVarB = kVar.B(activity.getApplicationContext(), i10);
            k kVar2 = kVarB != null ? kVarB : kVar;
            v(wallpaperManager, kVar2, i10);
            wallpaperManager.setWallpaperOffsetSteps(0.5f, 0.0f);
            wallpaperManager.setWallpaperOffsets(activity.getWindow().getDecorView().getRootView().getWindowToken(), 0.5f, 0.0f);
            this.f21661b.l0(U.d(i10), kVar2.r(), kVar2, wallpaperColors);
            this.f21663d.c();
            com.nothing.wallpaper.common.log.c.d("WallpaperSetter", "setDepthEffectWallpaper depthBitmap = " + bitmap);
            if (bitmap != null) {
                new c(wallpaperManager, activity, bitmap, kVar2, i10, aVar).execute(new Void[0]);
                return;
            }
            j(kVar2, activity);
            if (aVar != null) {
                aVar.b(kVar2, i10);
            }
            this.f21660a.a(i10);
            if (i10 != 0) {
                j.Q0(activity, false);
            }
        } catch (IOException | RuntimeException e10) {
            k(activity);
            if (aVar != null) {
                aVar.a(e10);
            }
        }
    }

    private void v(WallpaperManager wallpaperManager, k kVar, int i10) throws IOException {
        if ((!w.f15765i || !w(wallpaperManager, kVar, i10)) && !x(wallpaperManager, kVar, i10)) {
            com.nothing.wallpaper.common.log.c.d("WallpaperSetter", "setWallpaperComponent");
            wallpaperManager.setWallpaperComponent(kVar.q().getComponent());
        }
        if (i10 == 2) {
            if (G6.e.i(kVar) || !p024c3.a.b()) {
                wallpaperManager.clear(2);
            }
        }
    }

    private boolean w(WallpaperManager wallpaperManager, k kVar, int i10) {
        try {
            wallpaperManager.getClass().getMethod("setWallpaperComponentWithDescription", WallpaperDescription.class, Integer.TYPE);
            wallpaperManager.setWallpaperComponentWithDescription(kVar.A(), U.d(i10));
            return true;
        } catch (NoSuchMethodException unused) {
            com.nothing.wallpaper.common.log.c.o("WallpaperSetter", "setWallpaperComponentWithDescription not available");
            return false;
        }
    }

    private boolean x(WallpaperManager wallpaperManager, k kVar, int i10) {
        try {
            wallpaperManager.getClass().getMethod("setWallpaperComponentWithFlags", ComponentName.class, Integer.TYPE);
            wallpaperManager.setWallpaperComponentWithFlags(kVar.q().getComponent(), U.d(i10));
            return true;
        } catch (NoSuchMethodException unused) {
            com.nothing.wallpaper.common.log.c.o("WallpaperSetter", "setWallpaperComponentWithFlags not available");
            return false;
        }
    }

    public void g() {
        ProgressDialog progressDialog = this.f21664e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f21664e = null;
        }
    }

    public void l(Activity activity, J j9, int i10, w0.a aVar, boolean z9, boolean z10, boolean z11) {
        if (j9.k0("set_wallpaper_dialog") != null) {
            return;
        }
        o(activity);
        b bVar = new b(aVar, activity);
        WallpaperManager.getInstance(activity);
        w0 w0Var = new w0();
        w0Var.C0(i10);
        w0Var.A0(bVar);
        if (z9) {
            w0Var.z0(z10);
            w0Var.B0(z11);
        }
        w0Var.r0(j9, "set_wallpaper_dialog");
    }

    public void m(Activity activity, J j9, w0.a aVar, boolean z9, boolean z10, boolean z11) {
        l(activity, j9, R.string.set_wallpaper_dialog_message, aVar, z9, z10, z11);
    }

    public void q(Activity activity, x xVar, int i10, Bitmap bitmap, J6.e eVar, WallpaperColors wallpaperColors, U.a aVar) {
        r(activity, xVar, i10, bitmap, null, eVar, wallpaperColors, aVar);
    }

    public void r(Activity activity, x xVar, int i10, Bitmap bitmap, Bitmap bitmap2, J6.e eVar, WallpaperColors wallpaperColors, U.a aVar) {
        this.f21661b.p(1);
        if (activity != null) {
            o(activity);
            Glide.get(activity).clearMemory();
            if (!activity.isFinishing() && aVar != null) {
                aVar.c();
            }
        }
        this.f21660a.b(xVar, bitmap, bitmap2, eVar, wallpaperColors, i10, aVar);
        this.f21663d.c();
    }

    public void s(final Activity activity, final x xVar, final int i10, final U.a aVar) {
        final com.android.wallpaper.asset.a aVarD = xVar.d(activity.getApplicationContext());
        aVarD.j(activity, new com.android.wallpaper.asset.a.e() { // from class: h3.Y
            @Override // com.android.wallpaper.asset.a.e
            public final void a(Point point) {
                this.f21652a.i(activity, xVar, aVarD, i10, aVar, point);
            }
        });
    }

    public void t(Activity activity, x xVar, Bitmap bitmap, com.android.wallpaper.asset.a aVar, int i10, float f10, Rect rect, WallpaperColors wallpaperColors, U.a aVar2) {
        if (xVar instanceof k) {
            p(activity, (k) xVar, bitmap, i10, wallpaperColors, aVar2);
            return;
        }
        this.f21661b.p(1);
        o(activity);
        Glide.get(activity).clearMemory();
        if (!activity.isFinishing() && aVar2 != null) {
            aVar2.c();
        }
        this.f21660a.c(xVar, aVar, rect, f10, i10, new a(xVar, activity, aVar2));
        this.f21663d.c();
    }

    public void u(Activity activity, x xVar, com.android.wallpaper.asset.a aVar, int i10, float f10, Rect rect, WallpaperColors wallpaperColors, U.a aVar2) {
        t(activity, xVar, null, aVar, i10, f10, rect, wallpaperColors, aVar2);
    }
}
