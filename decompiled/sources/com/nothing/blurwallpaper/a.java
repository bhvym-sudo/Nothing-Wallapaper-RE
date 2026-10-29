package com.nothing.blurwallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.RemoteCallback;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Display;
import com.nothing.blurwallpaper.a;
import com.nothing.wallpaper.common.log.FileLog;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SimpleNativeRenderer implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f17713u = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f17714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0469a f17715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Display f17717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f17719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Point f17723n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17724o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f17725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RemoteCallback f17727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Point f17728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17729t;

    /* JADX INFO: renamed from: com.nothing.blurwallpaper.a$a, reason: collision with other inner class name */
    public interface InterfaceC0469a {
        void a();

        void c(p219v8.a aVar);

        void d(p219v8.a aVar);

        void notifyColorsChanged();
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public a(Context context, InterfaceC0469a callbacks, boolean z9, Display display) {
        n.h(context, "context");
        n.h(callbacks, "callbacks");
        this.f17714e = context;
        this.f17715f = callbacks;
        this.f17716g = z9;
        this.f17717h = display;
        this.f17719j = SystemClock.elapsedRealtime();
        this.f17723n = new Point(0, 0);
        this.f17725p = true;
        this.f17728s = new Point(0, 0);
    }

    private final boolean q() {
        boolean z9 = this.f17725p;
        if (z9) {
            return true;
        }
        return (z9 || this.f17722m) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A v(a aVar, RemoteCallback remoteCallback, Bitmap bitmap) {
        com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereRenderer", "onDrawFrame: " + aVar + " , send blur frame " + aVar.f17718i);
        Bundle bundle = new Bundle();
        bundle.putBinder("frame_bitmap_fetcher", new p097j6.c(bitmap));
        remoteCallback.sendResult(bundle);
        return A.f21846a;
    }

    private final void w() {
        this.f17715f.d(new p219v8.a() { // from class: q5.d
            @Override // p219v8.a
            public final Object invoke() {
                return a.x(this.f25040q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A x(a aVar) {
        if (!aVar.f17721l) {
            aVar.f17721l = true;
        }
        return A.f21846a;
    }

    public final void A(boolean z9) {
        com.nothing.wallpaper.common.log.c.c("setDebugFlag " + z9);
        native_setDebugFlag(z9);
    }

    public final void B(RemoteCallback remoteCallback) {
        this.f17727r = remoteCallback;
    }

    public final void C(int i10, int i11, int i12, byte[] bytes) {
        n.h(bytes, "bytes");
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereRenderer", "setImageData: " + this + " ," + i11 + "x" + i12);
        f(i10, i11, i12, bytes);
    }

    public final void D(boolean z9) {
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereRenderer", "setLockScreen: " + this + " ," + z9);
        this.f17722m = z9;
        g(z9);
    }

    public final void E(int i10, int i11, float f10, float f11, int i12, int i13) {
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereRenderer", "setParams: " + this + " ,maxBlurRadius=" + i10 + ", maxBlurOffset=" + i11 + ", maxNoise=" + f10 + ", animRatio=" + f11 + ", totalFrames" + i12 + ", animLevel=" + i13);
        h(i10, i11, f10, f11, i12, i13);
    }

    public final void F(boolean z9) {
        this.f17725p = z9;
    }

    public final void G(boolean z9) {
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereRenderer", "setPreview: " + this + " ," + z9);
        i(z9);
    }

    public final void H(Point point) {
        n.h(point, "<set-?>");
        this.f17728s = point;
    }

    public final void I(boolean z9) {
        this.f17726q = z9;
    }

    public final void J(List list) {
        n.h(list, "list");
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereRenderer", "setVertexInfos: " + this + " ," + list.size());
        j((VertexInfo[]) list.toArray(new VertexInfo[0]));
        y();
        w();
        this.f17729t = true;
    }

    @Override // com.nothing.blurwallpaper.SimpleNativeRenderer
    protected boolean b() {
        return this.f17716g;
    }

    public final void o() {
        FileLog.d("BLUR-AtmosphereRenderer", "create: " + this + ", isPreview=" + b());
        e();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        int i10;
        if (q()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f17719j;
            if (jElapsedRealtime < 16) {
                SystemClock.sleep(16 - jElapsedRealtime);
            }
            this.f17719j = SystemClock.elapsedRealtime();
            if (this.f17724o) {
                int iMax = Math.max(this.f17718i - 1, 0);
                this.f17718i = iMax;
                com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereRenderer", "onDrawFrame: " + this + " , screen rotated, restore frame " + iMax);
                this.f17724o = false;
                i10 = this.f17718i;
            } else if (this.f17725p) {
                i10 = -1;
            } else {
                i10 = 186;
                this.f17718i = 186;
            }
            try {
                Trace.beginSection("nativeDrawFrame");
                d(i10, this.f17726q);
                Trace.endSection();
                final RemoteCallback remoteCallback = this.f17727r;
                if (remoteCallback != null && n.d(this.f17723n, this.f17728s) && this.f17729t) {
                    com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereRenderer", "onDrawFrame: " + this + " , start capture the blur frame " + this.f17718i);
                    p176r5.a aVar = p176r5.a.f27526a;
                    Point point = this.f17723n;
                    final Bitmap bitmapA = aVar.a(0, 0, point.x, point.y);
                    p119l8.a.b(false, false, null, null, 0, new p219v8.a() { // from class: q5.c
                        @Override // p219v8.a
                        public final Object invoke() {
                            return a.v(this.f25037q, remoteCallback, bitmapA);
                        }
                    }, 31, null);
                }
                if (this.f17718i <= 185 && this.f17720k) {
                    this.f17715f.a();
                }
                this.f17718i++;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        Point point = this.f17723n;
        this.f17724o = i10 == point.y && i11 == point.x;
        Display display = this.f17717h;
        int rotation = display != null ? display.getRotation() : 0;
        FileLog.d("BLUR-AtmosphereRenderer", "AtmosphereRenderer.onSurfaceChanged: " + this + " ,isPreview=" + b() + ",size[" + i10 + " ," + i11 + "], lastScreenSize=" + point + ",isScreenRotated=" + this.f17724o + ", rotation=" + rotation + ", playAnimation=" + this.f17725p + ", sameAsHome=" + this.f17726q + ".");
        k(i10, i11);
        this.f17723n = new Point(i10, i11);
        this.f17715f.a();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        FileLog.d("BLUR-AtmosphereRenderer", "onSurfaceCreated: " + this);
        l();
    }

    public final void p() {
        FileLog.d("BLUR-AtmosphereRenderer", "destroy: " + this);
        this.f17720k = false;
        c();
    }

    public final boolean r() {
        return this.f17725p;
    }

    public final Point s() {
        return this.f17728s;
    }

    public final boolean t() {
        return this.f17726q;
    }

    public final boolean u() {
        return this.f17721l;
    }

    public final void y() {
        this.f17718i = 0;
        this.f17719j = SystemClock.elapsedRealtime();
    }

    public final void z(boolean z9) {
        this.f17720k = z9;
    }
}
