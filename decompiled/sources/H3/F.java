package H3;

import android.R;
import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceControlViewHost;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p074h3.I;
import p074h3.O;

/* JADX INFO: loaded from: classes.dex */
public class F implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private O f2452A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f2453B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f2454C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f2455D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Surface f2456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SurfaceControlViewHost f2457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f2458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f2459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final View f2460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SurfaceView f2461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final a f2462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Future f2463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f2464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private O.a f2465z;

    public interface a {
        void a();
    }

    public F(Context context, View view, SurfaceView surfaceView, int i10, a aVar) {
        this(context, view, surfaceView, (Future) null, aVar);
        this.f2455D = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str, int i10) {
        if (i10 != 3) {
            g();
        }
    }

    private void f() {
        SurfaceControlViewHost surfaceControlViewHost = this.f2457r;
        if (surfaceControlViewHost != null) {
            surfaceControlViewHost.release();
            this.f2457r = null;
        }
    }

    private void g() {
        if (this.f2464y || this.f2457r == null) {
            return;
        }
        j(false);
    }

    private void h() {
        this.f2458s.measure(View.MeasureSpec.makeMeasureSpec(this.f2460u.getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f2460u.getHeight(), BasicMeasure.EXACTLY));
        this.f2458s.layout(0, 0, this.f2460u.getWidth(), this.f2460u.getHeight());
        this.f2457r.relayout(this.f2458s.getWidth(), this.f2458s.getHeight());
    }

    private void j(boolean z9) {
        int i10;
        this.f2458s = new ImageView(this.f2459t);
        Future future = this.f2463x;
        Integer numValueOf = null;
        if (future != null && future.isDone()) {
            try {
                g3.x.a aVar = (g3.x.a) this.f2463x.get();
                if (aVar != null) {
                    numValueOf = aVar.a();
                }
            } catch (InterruptedException | ExecutionException unused) {
                Log.e("WallpaperSurfaceCallback", "Couldn't get placeholder from ColorInfo.");
            }
        }
        if (numValueOf == null && (i10 = this.f2455D) != -1) {
            numValueOf = Integer.valueOf(i10);
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : r.a(this.f2459t, R.attr.colorSecondary);
        this.f2458s.setBackgroundColor(iIntValue);
        this.f2461v.setBackgroundColor(iIntValue);
        this.f2458s.measure(View.MeasureSpec.makeMeasureSpec(this.f2460u.getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f2460u.getHeight(), BasicMeasure.EXACTLY));
        this.f2458s.layout(0, 0, this.f2460u.getWidth(), this.f2460u.getHeight());
        if (z9) {
            f();
            this.f2457r = new SurfaceControlViewHost(this.f2459t, this.f2460u.getDisplay(), this.f2461v.getHostToken());
        }
        SurfaceControlViewHost surfaceControlViewHost = this.f2457r;
        ImageView imageView = this.f2458s;
        surfaceControlViewHost.setView(imageView, imageView.getWidth(), this.f2458s.getHeight());
        this.f2461v.setChildSurfacePackage(this.f2457r.getSurfacePackage());
    }

    public void b() {
        f();
        ImageView imageView = this.f2458s;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        this.f2452A.b(this.f2465z);
        if (this.f2461v.getSurfaceControl() != null) {
            this.f2461v.getSurfaceControl().release();
        }
    }

    public ImageView c() {
        return this.f2458s;
    }

    public boolean d() {
        return this.f2464y;
    }

    public void i(boolean z9) {
        ImageView imageView = this.f2458s;
        if (imageView == null) {
            return;
        }
        if (z9) {
            imageView.setRenderEffect(RenderEffect.createBlurEffect(150.0f, 150.0f, Shader.TileMode.CLAMP));
        } else {
            imageView.setRenderEffect(null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        int i13 = this.f2453B;
        if ((i13 != -1 || this.f2454C != -1) && (i13 != i11 || this.f2454C != i12)) {
            h();
        }
        this.f2453B = i11;
        this.f2454C = i12;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f2456q != surfaceHolder.getSurface()) {
            this.f2456q = surfaceHolder.getSurface();
            j(true);
        }
        a aVar = this.f2462w;
        if (aVar != null) {
            aVar.a();
        }
        SurfaceControlViewHost surfaceControlViewHost = this.f2457r;
        if (surfaceControlViewHost != null && surfaceControlViewHost.getView() != null) {
            this.f2453B = this.f2457r.getView().getWidth();
            this.f2454C = this.f2457r.getView().getHeight();
        }
        this.f2464y = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f2464y = false;
    }

    public F(Context context, View view, SurfaceView surfaceView, Future future, a aVar) {
        this.f2453B = -1;
        this.f2454C = -1;
        this.f2455D = -1;
        this.f2459t = context.getApplicationContext();
        this.f2460u = view;
        this.f2461v = surfaceView;
        this.f2462w = aVar;
        this.f2452A = I.a().s(context);
        O.a aVar2 = new O.a() { // from class: H3.E
            @Override // h3.O.a
            public final void a(String str, int i10) {
                this.f2451a.e(str, i10);
            }
        };
        this.f2465z = aVar2;
        this.f2452A.a(aVar2, "android.service.wallpaper.WallpaperService");
        this.f2463x = future;
    }
}
