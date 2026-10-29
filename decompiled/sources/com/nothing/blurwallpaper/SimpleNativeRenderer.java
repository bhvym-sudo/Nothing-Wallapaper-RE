package com.nothing.blurwallpaper;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleNativeRenderer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f17707d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f17708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17710c = true;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static {
        System.loadLibrary("blurwallpaper");
    }

    private final boolean a(String str) {
        if (this.f17709b) {
            com.nothing.wallpaper.common.log.c.f("SimpleNativeRenderer", "The method " + str + " shouldn't be called after the render is destroyed.");
            return false;
        }
        if (this.f17708a != 0) {
            return true;
        }
        com.nothing.wallpaper.common.log.c.f("SimpleNativeRenderer", "Calling " + str + " when the native render is not yet initialized.");
        return false;
    }

    private final native void native_destroy(long j9);

    private final native long native_init(boolean z9);

    private final native void native_onDrawFrame(long j9, int i10, boolean z9);

    private final native void native_setImageData(long j9, int i10, int i11, int i12, byte[] bArr);

    private final native void native_setLockScreen(long j9, boolean z9);

    private final native void native_setParams(int i10, int i11, float f10, float f11, int i12, int i13);

    private final native void native_setPreview(long j9, boolean z9);

    private final native void native_setVertex(long j9, VertexInfo[] vertexInfoArr);

    private final native void native_surfaceChanged(long j9, int i10, int i11);

    private final native void native_surfaceCreated(long j9);

    protected abstract boolean b();

    public final void c() {
        if (this.f17709b) {
            return;
        }
        this.f17709b = true;
        native_destroy(this.f17708a);
        this.f17708a = 0L;
    }

    public final void d(int i10, boolean z9) {
        if (a("nativeDrawFrame")) {
            native_onDrawFrame(this.f17708a, i10, z9);
        }
    }

    public final void e() {
        if (this.f17708a == 0) {
            this.f17708a = native_init(b());
        }
    }

    public final void f(int i10, int i11, int i12, byte[] bytes) {
        n.h(bytes, "bytes");
        if (a("nativeSetImageData")) {
            native_setImageData(this.f17708a, i10, i11, i12, bytes);
        }
    }

    public final void g(boolean z9) {
        if (a("nativeSetLockScreen")) {
            native_setLockScreen(this.f17708a, z9);
        }
    }

    public final void h(int i10, int i11, float f10, float f11, int i12, int i13) {
        native_setParams(i10, i11, f10, f11, i12, i13);
    }

    public final void i(boolean z9) {
        if (a("nativeSetPreview")) {
            native_setPreview(this.f17708a, z9);
        }
    }

    public final void j(VertexInfo[] vertexInfoList) {
        n.h(vertexInfoList, "vertexInfoList");
        if (a("nativeSetVertex")) {
            native_setVertex(this.f17708a, vertexInfoList);
        }
    }

    public final void k(int i10, int i11) {
        if (a("nativeSurfaceChanged")) {
            native_surfaceChanged(this.f17708a, i10, i11);
        }
    }

    public final void l() {
        if (a("nativeSurfaceCreated")) {
            native_surfaceCreated(this.f17708a);
        }
    }

    public final native void native_setDebugFlag(boolean z9);
}
