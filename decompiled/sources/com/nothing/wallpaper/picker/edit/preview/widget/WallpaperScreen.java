package com.nothing.wallpaper.picker.edit.preview.widget;

import G6.e;
import H3.F;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.ViewRootImpl;
import android.widget.ImageView;
import com.nothing.wallpaper.picker.edit.preview.widget.WallpaperScreen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p079h8.A;
import p189s8.b;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class WallpaperScreen extends SurfaceView {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private F f18548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f18549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f18550s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallpaperScreen(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WallpaperScreen wallpaperScreen) throws IOException {
        Iterator it = wallpaperScreen.f18549r.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        wallpaperScreen.f18549r.clear();
        wallpaperScreen.f(true);
    }

    private final void f(boolean z9) throws IOException {
        if ((z9 || this.f18550s != getAlpha()) && getSurfaceControl() != null && getSurfaceControl().isValid()) {
            SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
            try {
                transaction.setAlpha(getSurfaceControl(), getAlpha());
                ViewRootImpl viewRootImpl = getViewRootImpl();
                if (viewRootImpl != null) {
                    viewRootImpl.applyTransactionOnDraw(transaction);
                } else {
                    transaction.apply();
                    A a10 = A.f21846a;
                }
                b.a(transaction, null);
                this.f18550s = getAlpha();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(transaction, th);
                    throw th2;
                }
            }
        }
    }

    static /* synthetic */ void g(WallpaperScreen wallpaperScreen, boolean z9, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        wallpaperScreen.f(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l lVar, WallpaperScreen wallpaperScreen) {
        F f10 = wallpaperScreen.f18548q;
        ImageView imageViewC = f10 != null ? f10.c() : null;
        n.e(imageViewC);
        lVar.f(imageViewC);
    }

    public final void c() {
        Context context = getContext();
        Context context2 = getContext();
        n.g(context2, "getContext(...)");
        this.f18548q = new F(context, this, this, CompletableFuture.completedFuture(new x.a(null, Integer.valueOf(e.f(context2)))), new F.a() { // from class: t7.b
            @Override // H3.F.a
            public final void a() throws IOException {
                WallpaperScreen.d(this.f27940a);
            }
        });
        getHolder().addCallback(this.f18548q);
        setZOrderMediaOverlay(true);
    }

    public final void e() {
        F f10 = this.f18548q;
        if (f10 != null) {
            f10.b();
        }
        getHolder().removeCallback(this.f18548q);
        this.f18548q = null;
        this.f18549r.clear();
    }

    public final void h(final l callBackView) {
        n.h(callBackView, "callBackView");
        F f10 = this.f18548q;
        if (f10 != null) {
            if (!f10.d()) {
                f10 = null;
            }
            if (f10 != null) {
                ImageView imageViewC = f10.c();
                n.e(imageViewC);
                callBackView.f(imageViewC);
                return;
            }
        }
        this.f18549r.add(new Runnable() { // from class: t7.c
            @Override // java.lang.Runnable
            public final void run() {
                WallpaperScreen.i(callBackView, this);
            }
        });
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setAlpha(float f10) throws IOException {
        super.setAlpha(f10);
        g(this, false, 1, null);
    }

    public /* synthetic */ WallpaperScreen(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WallpaperScreen(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        this.f18549r = new ArrayList();
        this.f18550s = 1.0f;
        setZOrderOnTop(false);
    }
}
