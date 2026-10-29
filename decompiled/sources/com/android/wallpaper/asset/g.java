package com.android.wallpaper.asset;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ExecutorService f15876l = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f15877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f15878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RequestOptions f15879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j f15880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15881k;

    class a implements com.android.wallpaper.asset.a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.android.wallpaper.asset.a.d f15882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rect f15883b;

        /* JADX INFO: renamed from: com.android.wallpaper.asset.g$a$a, reason: collision with other inner class name */
        class C0447a implements com.android.wallpaper.asset.a.d {
            C0447a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void c(com.android.wallpaper.asset.a.d dVar, Bitmap bitmap, Rect rect) {
                g.this.h(dVar, Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height()));
            }

            @Override // com.android.wallpaper.asset.a.d
            public void a(final Bitmap bitmap) {
                if (bitmap != null) {
                    ExecutorService executorService = g.f15876l;
                    a aVar = a.this;
                    final com.android.wallpaper.asset.a.d dVar = aVar.f15882a;
                    final Rect rect = aVar.f15883b;
                    executorService.execute(new Runnable() { // from class: com.android.wallpaper.asset.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f15872q.c(dVar, bitmap, rect);
                        }
                    });
                    return;
                }
                Log.e("ContentUriAsset", "There was an error decoding the asset's full bitmap with content URI: " + g.this.f15878h);
                a aVar2 = a.this;
                g.this.h(aVar2.f15882a, null);
            }
        }

        a(com.android.wallpaper.asset.a.d dVar, Rect rect) {
            this.f15882a = dVar;
            this.f15883b = rect;
        }

        @Override // com.android.wallpaper.asset.a.e
        public void a(Point point) {
            if (point != null) {
                g.this.f(point.x, point.y, new C0447a());
                return;
            }
            Log.e("ContentUriAsset", "There was an error decoding the asset's raw dimensions with content URI: " + g.this.f15878h);
            this.f15882a.a(null);
        }
    }

    public g(Context context, Uri uri, RequestOptions requestOptions, boolean z9) {
        this.f15881k = -1;
        this.f15877g = context.getApplicationContext();
        this.f15878h = uri;
        if (z9) {
            this.f15879i = requestOptions.apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).skipMemoryCache(true));
        } else {
            this.f15879i = requestOptions;
        }
    }

    private void T() {
        if (this.f15880j == null) {
            try {
                InputStream inputStreamO = O();
                if (inputStreamO != null) {
                    try {
                        this.f15880j = new j(inputStreamO);
                    } catch (Throwable th) {
                        try {
                            inputStreamO.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (inputStreamO != null) {
                    inputStreamO.close();
                }
            } catch (IOException e10) {
                Log.w("ContentUriAsset", "Couldn't read stream for " + this.f15878h, e10);
            }
        }
    }

    private int X() {
        T();
        j jVar = this.f15880j;
        if (jVar != null) {
            return jVar.b("Orientation", 1);
        }
        Log.w("ContentUriAsset", "Unable to read EXIF rotation for content URI asset with content URI: " + this.f15878h);
        return 1;
    }

    @Override // com.android.wallpaper.asset.o
    public int G() {
        int i10 = this.f15881k;
        if (i10 != -1) {
            return i10;
        }
        int iX = X();
        this.f15881k = iX;
        return iX;
    }

    @Override // com.android.wallpaper.asset.o
    public InputStream O() {
        try {
            return this.f15877g.getContentResolver().openInputStream(this.f15878h);
        } catch (FileNotFoundException e10) {
            Log.w("ContentUriAsset", "Image file not found", e10);
            return null;
        } catch (IllegalStateException | NullPointerException e11) {
            com.nothing.wallpaper.common.log.c.g("ContentUriAsset", "openInputStream failed", e11);
            return null;
        } catch (SecurityException e12) {
            com.nothing.wallpaper.common.log.c.g("ContentUriAsset", "uri didn't have permission", e12);
            return null;
        }
    }

    public Uri U() {
        return this.f15878h;
    }

    public boolean V() {
        String type = this.f15877g.getContentResolver().getType(this.f15878h);
        return type != null && type.equals("image/jpeg");
    }

    public boolean W() {
        String type = this.f15877g.getContentResolver().getType(this.f15878h);
        return type != null && type.equals("image/png");
    }

    public String Y(String str) {
        T();
        j jVar = this.f15880j;
        if (jVar == null) {
            Log.w("ContentUriAsset", "Unable to read EXIF tags for content URI asset");
            return null;
        }
        String strA = jVar.a(str);
        if (strA == null || strA.trim().isEmpty()) {
            return null;
        }
        return strA.trim();
    }

    @Override // com.android.wallpaper.asset.o, com.android.wallpaper.asset.a
    public void i(Rect rect, int i10, int i11, boolean z9, com.android.wallpaper.asset.a.d dVar) {
        if (V() || W()) {
            super.i(rect, i10, i11, z9, dVar);
        } else {
            j(null, new a(dVar, rect));
        }
    }

    @Override // com.android.wallpaper.asset.a
    public void n(Context context, ImageView imageView, int i10) {
        Glide.with(context).asDrawable().load(this.f15878h).apply((BaseRequestOptions<?>) this.f15879i.placeholder(new ColorDrawable(i10))).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
    }

    @Override // com.android.wallpaper.asset.a
    public void q(Activity activity, ImageView imageView, int i10, BitmapTransformation bitmapTransformation) {
        Glide.with(activity).asDrawable().load(this.f15878h).apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform(new MultiTransformation(new FitCenter(), bitmapTransformation)).placeholder(new ColorDrawable(i10))).into(imageView);
    }

    public g(Context context, Uri uri, boolean z9) {
        this(context, uri, RequestOptions.centerCropTransform(), z9);
    }

    public g(Context context, Uri uri) {
        this(context, uri, false);
    }
}
