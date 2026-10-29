package com.android.wallpaper.asset;

import H3.D;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class h extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f15886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WallpaperManager f15887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f15888i;

    class a implements RequestListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ImageView f15889q;

        a(ImageView imageView) {
            this.f15889q = imageView;
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable drawable, Object obj, Target target, DataSource dataSource, boolean z9) {
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z9) {
            com.nothing.wallpaper.common.log.c.f("CurrentWallpaperAssetVN", "onLoadFailed " + glideException);
            h.this.X(this.f15889q);
            return true;
        }
    }

    private static final class b implements Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WallpaperManager f15891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15892b;

        public b(WallpaperManager wallpaperManager, int i10) {
            this.f15891a = wallpaperManager;
            this.f15892b = i10;
        }

        private String a() {
            return "CurrentWallpaperKey{flag=" + this.f15892b + ",id=" + this.f15891a.getWallpaperId(this.f15892b) + '}';
        }

        @Override // com.bumptech.glide.load.Key
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return a().equals(((b) obj).a());
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

    public h(Context context, int i10) {
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context.getApplicationContext());
        this.f15887h = wallpaperManager;
        this.f15888i = i10;
        this.f15886g = wallpaperManager.getWallpaperId(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(final ImageView imageView) {
        BitmapFactory.Options options;
        ParcelFileDescriptor wallpaperFile = this.f15887h.getWallpaperFile(this.f15888i);
        if (wallpaperFile != null) {
            try {
                int measuredWidth = imageView.getMeasuredWidth();
                int measuredHeight = imageView.getMeasuredHeight();
                FileDescriptor fileDescriptor = wallpaperFile.getFileDescriptor();
                if (measuredWidth <= 0 || measuredHeight <= 0) {
                    options = null;
                } else {
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    options.inSampleSize = p014b3.f.b(options.outWidth, options.outHeight, measuredWidth, measuredHeight);
                    options.inJustDecodeBounds = false;
                }
                final Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                imageView.post(new Runnable() { // from class: b3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmapDecodeFileDescriptor);
                    }
                });
            } finally {
                try {
                    wallpaperFile.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(final ImageView imageView) {
        o.f15914f.execute(new Runnable() { // from class: b3.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f14846q.W(imageView);
            }
        });
    }

    @Override // com.android.wallpaper.asset.o
    public InputStream O() {
        ParcelFileDescriptor wallpaperFile = this.f15887h.getWallpaperFile(this.f15888i);
        if (wallpaperFile != null) {
            return new ParcelFileDescriptor.AutoCloseInputStream(wallpaperFile);
        }
        Log.e("CurrentWallpaperAssetVN", "ParcelFileDescriptor for wallpaper " + this.f15888i + " is null, unable to open InputStream.");
        return null;
    }

    public Key U() {
        return new b(this.f15887h, this.f15888i);
    }

    ParcelFileDescriptor V() {
        return this.f15887h.getWallpaperFile(this.f15888i);
    }

    @Override // com.android.wallpaper.asset.a
    protected void e(Context context, Point point, Rect rect, boolean z9) {
        if (z9) {
            rect.offsetTo(0, 0);
        }
        D.b(context, point, rect);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f15888i == this.f15888i && hVar.f15886g == this.f15886g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f15888i) * 31) + this.f15886g;
    }

    @Override // com.android.wallpaper.asset.a
    public Bitmap k(Context context) {
        try {
            return Glide.with(context).asBitmap().load((Object) this).submit().get();
        } catch (InterruptedException | ExecutionException e10) {
            Log.w("CurrentWallpaperAssetVN", "Couldn't obtain low res bitmap", e10);
            return null;
        }
    }

    @Override // com.android.wallpaper.asset.a
    public void n(Context context, ImageView imageView, int i10) {
        Glide.with(context).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) RequestOptions.centerCropTransform()).transition(DrawableTransitionOptions.withCrossFade()).addListener(new a(imageView)).into(imageView);
    }

    @Override // com.android.wallpaper.asset.a
    public void q(Activity activity, ImageView imageView, int i10, BitmapTransformation bitmapTransformation) {
        Glide.with(activity).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform(new MultiTransformation(new FitCenter(), bitmapTransformation)).placeholder(new ColorDrawable(i10))).into(imageView);
    }
}
