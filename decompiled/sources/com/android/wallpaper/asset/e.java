package com.android.wallpaper.asset;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p014b3.C;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ExecutorService f15868e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f15869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Point f15870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C f15871d;

    public e(Context context) {
        this.f15869b = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(final a.e eVar) {
        final Point pointX = x();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b3.j
            @Override // java.lang.Runnable
            public final void run() {
                eVar.a(pointX);
            }
        });
    }

    private Point x() {
        Point point = this.f15870c;
        if (point != null) {
            return point;
        }
        Bitmap bitmap = ((BitmapDrawable) WallpaperManager.getInstance(this.f15869b).getBuiltInDrawable()).getBitmap();
        Point point2 = new Point(bitmap.getWidth(), bitmap.getHeight());
        this.f15870c = point2;
        return point2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(int i10, int i11, a.d dVar) {
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(this.f15869b);
        Drawable builtInDrawable = (i10 <= 0 || i11 <= 0) ? wallpaperManager.getBuiltInDrawable() : wallpaperManager.getBuiltInDrawable(i10, i11, true, 0.5f, 0.5f);
        wallpaperManager.forgetLoadedWallpaper();
        h(dVar, ((BitmapDrawable) builtInDrawable).getBitmap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Rect rect, a.d dVar) {
        Point pointX = x();
        h(dVar, ((BitmapDrawable) WallpaperManager.getInstance(this.f15869b).getBuiltInDrawable(rect.width(), rect.height(), false, p014b3.f.a(pointX, rect), p014b3.f.c(pointX, rect))).getBitmap());
    }

    @Override // com.android.wallpaper.asset.a
    public void g(final int i10, final int i11, boolean z9, final a.d dVar) {
        f15868e.execute(new Runnable() { // from class: b3.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f14840q.y(i10, i11, dVar);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void i(final Rect rect, int i10, int i11, boolean z9, final a.d dVar) {
        f15868e.execute(new Runnable() { // from class: b3.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f14835q.z(rect, dVar);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void j(Activity activity, final a.e eVar) {
        f15868e.execute(new Runnable() { // from class: b3.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f14838q.A(eVar);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void n(Context context, ImageView imageView, int i10) {
        if (this.f15871d == null) {
            this.f15871d = new C(context.getApplicationContext(), 0);
        }
        Glide.with(context).asDrawable().load((Object) this.f15871d).apply((BaseRequestOptions<?>) RequestOptions.centerCropTransform().placeholder(new ColorDrawable(i10))).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
    }
}
