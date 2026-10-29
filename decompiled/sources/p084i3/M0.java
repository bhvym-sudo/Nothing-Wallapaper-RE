package p084i3;

import H3.q;
import H3.u;
import android.app.WallpaperColors;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceControlViewHost;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class M0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f21995A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Bundle f21996B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f21997C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f21998D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SurfaceView f21999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final q f22000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f22001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f22002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private WallpaperColors f22003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f22004v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f22005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Surface f22006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Message f22007y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Message f22008z;

    public M0(SurfaceView surfaceView, q qVar, boolean z9) {
        this(surfaceView, qVar, z9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Bundle bundle) {
        Message message;
        this.f22002t.set(false);
        if (bundle == null || this.f22006x == null) {
            return;
        }
        SurfaceControlViewHost.SurfacePackage surfacePackageC = u.c(bundle);
        if (surfacePackageC != null) {
            this.f21999q.setChildSurfacePackage(surfacePackageC);
        } else {
            Log.w("WsSurfaceHolderCallback", "Result bundle from rendering preview does not contain a child surface package.");
        }
        Message messageB = u.b(bundle);
        this.f22007y = messageB;
        if (messageB != null && (message = this.f22008z) != null) {
            try {
                messageB.replyTo.send(message);
            } catch (RemoteException e10) {
                Log.w("WsSurfaceHolderCallback", "Couldn't send message to workspace preview", e10);
            }
            this.f22008z = null;
        }
        if (this.f21995A) {
            b();
        }
    }

    public void b() {
        Message message = this.f22007y;
        if (message == null) {
            if (this.f22002t.get()) {
                this.f21995A = true;
            }
        } else {
            try {
                try {
                    message.replyTo.send(message);
                    this.f21995A = false;
                } catch (RemoteException e10) {
                    Log.w("WsSurfaceHolderCallback", "Couldn't call cleanup on workspace preview", e10);
                }
            } finally {
                this.f22007y = null;
            }
        }
    }

    public WallpaperColors c() {
        return this.f22003u;
    }

    public boolean d() {
        return this.f22001s;
    }

    public void f() {
        if ((!this.f22001s || this.f22005w) && this.f22006x != null) {
            this.f22002t.set(true);
            g(this.f21999q, new q.b() { // from class: i3.L0
                @Override // H3.q.b
                public final void a(Bundle bundle) {
                    this.f21993a.e(bundle);
                }
            });
        }
    }

    protected void g(SurfaceView surfaceView, q.b bVar) {
        if (surfaceView.getDisplay() == null) {
            Log.w("WsSurfaceHolderCallback", "No display ID, avoiding asking for workspace preview, lest WallpaperPicker crash");
            return;
        }
        Bundle bundleA = u.a(surfaceView, this.f21996B);
        WallpaperColors wallpaperColors = this.f22003u;
        if (wallpaperColors != null) {
            bundleA.putParcelable("wallpaper_colors", wallpaperColors);
        }
        bundleA.putBoolean("hide_bottom_row", this.f22004v);
        this.f22000r.f(bundleA, bVar);
    }

    public void h(int i10, Bundle bundle) {
        Message message = new Message();
        message.what = i10;
        message.setData(bundle);
        Message message2 = this.f22007y;
        if (message2 == null) {
            this.f22008z = message;
            return;
        }
        try {
            message2.replyTo.send(message);
        } catch (RemoteException e10) {
            Log.w("WsSurfaceHolderCallback", "Couldn't send message to workspace preview", e10);
        }
    }

    public void i(WallpaperColors wallpaperColors) {
        if (this.f22001s) {
            this.f22003u = wallpaperColors;
            this.f22005w = true;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        int i13 = this.f21997C;
        if ((i13 != -1 || this.f21998D != -1) && (i13 != i11 || this.f21998D != i12)) {
            f();
        }
        this.f21997C = i11;
        this.f21998D = i12;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!this.f22000r.i() || this.f22006x == surfaceHolder.getSurface()) {
            return;
        }
        this.f22006x = surfaceHolder.getSurface();
        f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public M0(SurfaceView surfaceView, q qVar, Bundle bundle) {
        this(surfaceView, qVar, false, bundle);
    }

    private M0(SurfaceView surfaceView, q qVar, boolean z9, Bundle bundle) {
        this.f22002t = new AtomicBoolean(false);
        this.f21997C = -1;
        this.f21998D = -1;
        this.f21999q = surfaceView;
        this.f22000r = qVar;
        this.f22001s = z9;
        this.f21996B = bundle;
    }
}
