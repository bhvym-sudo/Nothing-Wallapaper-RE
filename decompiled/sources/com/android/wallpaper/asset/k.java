package com.android.wallpaper.asset;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import com.android.wallpaper.asset.a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p074h3.E;
import p074h3.I;

/* JADX INFO: loaded from: classes.dex */
public class k extends com.android.wallpaper.asset.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ExecutorService f15896h = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f15897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final WallpaperInfo f15898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final E f15899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Uri f15900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f15901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f15902g;

    private static final class a implements Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WallpaperInfo f15903a;

        public a(WallpaperInfo wallpaperInfo) {
            this.f15903a = wallpaperInfo;
        }

        private String a() {
            return "LiveWallpaperThumbKey{packageName=" + this.f15903a.getPackageName() + ",serviceName=" + this.f15903a.getServiceName() + '}';
        }

        @Override // com.bumptech.glide.load.Key
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return a().equals(((a) obj).a());
            }
            return false;
        }

        @Override // com.bumptech.glide.load.Key
        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return a();
        }

        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(MessageDigest messageDigest) {
            messageDigest.update(a().getBytes(Key.CHARSET));
        }
    }

    public k(Context context, WallpaperInfo wallpaperInfo) {
        this(context, wallpaperInfo, null);
    }

    private Drawable A() {
        return this.f15898c.loadThumbnail(this.f15897b.getPackageManager());
    }

    private Drawable B() {
        if (this.f15900e == null) {
            return null;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f15897b.getContentResolver().openAssetFileDescriptor(this.f15900e, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    return null;
                }
                assetFileDescriptorOpenAssetFileDescriptor.close();
                return null;
            }
            try {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f15897b.getResources(), BitmapFactory.decodeStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream()));
                assetFileDescriptorOpenAssetFileDescriptor.close();
                return bitmapDrawable;
            } catch (Throwable th) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            Log.w("LiveWallpaperThumbAsset", "Not found thumbnail from URI.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(int i10, int i11, com.android.wallpaper.asset.a.d dVar) {
        double d10;
        double d11;
        Drawable drawableX = x();
        if (!(drawableX instanceof BitmapDrawable)) {
            if (drawableX == null) {
                h(dVar, null);
                return;
            }
            if (drawableX.getIntrinsicWidth() <= 0 || drawableX.getIntrinsicHeight() <= 0) {
                h(dVar, null);
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableX.getIntrinsicWidth(), drawableX.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableX.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableX.draw(canvas);
            h(dVar, Bitmap.createScaledBitmap(bitmapCreateBitmap, i11, i10, true));
            return;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawableX;
        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
        int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
        if (intrinsicHeight > 0 && intrinsicWidth > 0) {
            if (intrinsicHeight > intrinsicWidth) {
                d10 = i10;
                d11 = intrinsicHeight;
            } else {
                d10 = i11;
                d11 = intrinsicWidth;
            }
            double d12 = d10 / d11;
            i11 = (int) (((double) intrinsicWidth) * d12);
            i10 = (int) (((double) intrinsicHeight) * d12);
        }
        if (i11 <= 0 || i10 <= 0) {
            h(dVar, null);
        } else {
            h(dVar, Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i11, i10, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    public /* synthetic */ void z(final com.android.wallpaper.asset.a.e eVar) {
        final Bitmap bitmap;
        Drawable drawableLoadThumbnail = this.f15898c.loadThumbnail(this.f15897b.getPackageManager());
        if (drawableLoadThumbnail instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawableLoadThumbnail).getBitmap();
        } else if (drawableLoadThumbnail instanceof LayerDrawable) {
            Drawable drawableA = this.f15899d.a((LayerDrawable) drawableLoadThumbnail);
            if (drawableA instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawableA).getBitmap();
            } else {
                bitmap = null;
            }
        } else {
            bitmap = null;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b3.u
            @Override // java.lang.Runnable
            public final void run() {
                a.e eVar2 = eVar;
                Bitmap bitmap2 = bitmap;
                eVar2.a(bitmap2 == null ? null : new Point(bitmap2.getWidth(), bitmap2.getHeight()));
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void g(final int i10, final int i11, boolean z9, final com.android.wallpaper.asset.a.d dVar) {
        f15896h.execute(new Runnable() { // from class: b3.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f14852q.y(i11, i10, dVar);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void i(Rect rect, int i10, int i11, boolean z9, com.android.wallpaper.asset.a.d dVar) {
        dVar.a(null);
    }

    @Override // com.android.wallpaper.asset.a
    public void j(Activity activity, final com.android.wallpaper.asset.a.e eVar) {
        f15896h.execute(new Runnable() { // from class: b3.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f14856q.z(eVar);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public Bitmap k(Context context) {
        Bitmap bitmap;
        try {
            Drawable drawable = Glide.with(context).asDrawable().load((Object) this).submit().get(2L, TimeUnit.SECONDS);
            if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                return bitmap;
            }
            if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            }
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Log.w("LiveWallpaperThumbAsset", "Couldn't obtain low res bitmap", e10);
            return null;
        }
    }

    @Override // com.android.wallpaper.asset.a
    public void n(Context context, ImageView imageView, int i10) {
        RequestOptions requestOptionsPlaceholder = this.f15900e != null ? RequestOptions.centerCropTransform().apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).skipMemoryCache(true)).placeholder(new ColorDrawable(i10)) : RequestOptions.centerCropTransform().placeholder(new ColorDrawable(i10));
        imageView.setBackgroundColor(i10);
        Glide.with(context).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) requestOptionsPlaceholder).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
    }

    @Override // com.android.wallpaper.asset.a
    public void p(Context context, ImageView imageView, int i10, boolean z9, com.android.wallpaper.asset.a.f fVar) {
        if (z9) {
            n(context, imageView, i10);
        } else {
            Glide.with(context).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) (this.f15900e != null ? RequestOptions.centerCropTransform().apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).skipMemoryCache(true)) : RequestOptions.centerCropTransform())).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
        }
        if (fVar != null) {
            fVar.b(null);
        }
    }

    @Override // com.android.wallpaper.asset.a
    public void q(Activity activity, ImageView imageView, int i10, BitmapTransformation bitmapTransformation) {
        Glide.with(activity).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform(bitmapTransformation == null ? new FitCenter() : new MultiTransformation(new FitCenter(), bitmapTransformation)).placeholder(new ColorDrawable(i10))).into(imageView);
    }

    Key w() {
        return new a(this.f15898c);
    }

    protected Drawable x() {
        if (!this.f15901f) {
            return B();
        }
        Drawable drawable = this.f15902g;
        if (drawable != null) {
            return drawable;
        }
        if (G6.e.h(this.f15898c)) {
            this.f15902g = p137n6.a.a(this.f15897b);
        } else {
            Drawable drawableB = B();
            this.f15902g = drawableB;
            if (drawableB == null) {
                this.f15902g = A();
            }
        }
        return this.f15902g;
    }

    public k(Context context, WallpaperInfo wallpaperInfo, Uri uri) {
        this(context, wallpaperInfo, uri, true);
    }

    public k(Context context, WallpaperInfo wallpaperInfo, Uri uri, boolean z9) {
        this.f15897b = context.getApplicationContext();
        this.f15898c = wallpaperInfo;
        this.f15900e = uri;
        this.f15901f = z9;
        this.f15899d = I.a().z();
    }
}
