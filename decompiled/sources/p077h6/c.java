package p077h6;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.nothing.wallpaper.NTPickerApplication;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;
import p087i6.q;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends com.android.wallpaper.asset.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f21803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f21806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Key f21807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RequestOptions f21809h;

    public static final class a implements Key {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f21812c;

        public a(String packageName, int i10, String resName) {
            n.h(packageName, "packageName");
            n.h(resName, "resName");
            this.f21810a = packageName;
            this.f21811b = i10;
            this.f21812c = resName;
        }

        private final String a() {
            return "ColorWallpaperThumbKey{packageName=" + this.f21810a + ",resId=" + this.f21811b + ",resName=" + this.f21812c + "}";
        }

        @Override // com.bumptech.glide.load.Key
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return n.d(a(), ((a) obj).a());
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
            n.h(messageDigest, "messageDigest");
            String strA = a();
            Charset CHARSET = Key.CHARSET;
            n.g(CHARSET, "CHARSET");
            byte[] bytes = strA.getBytes(CHARSET);
            n.g(bytes, "getBytes(...)");
            messageDigest.update(bytes);
        }
    }

    public c(Resources res, int i10, String resName) {
        n.h(res, "res");
        n.h(resName, "resName");
        this.f21803b = res;
        this.f21804c = i10;
        this.f21805d = resName;
        this.f21806e = Executors.newCachedThreadPool();
        this.f21808g = res.getColor(i10, null);
        RequestOptions requestOptionsCenterCropTransform = RequestOptions.centerCropTransform();
        n.g(requestOptionsCenterCropTransform, "centerCropTransform(...)");
        this.f21809h = requestOptionsCenterCropTransform;
    }

    private final Point v() {
        return q.d(NTPickerApplication.f18424q.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(int i10, int i11, c cVar, com.android.wallpaper.asset.a.d dVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.eraseColor(cVar.f21808g);
        cVar.h(dVar, bitmapCreateBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(int i10, int i11, c cVar, com.android.wallpaper.asset.a.d dVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.eraseColor(cVar.f21808g);
        cVar.h(dVar, bitmapCreateBitmap);
    }

    @Override // com.android.wallpaper.asset.a
    public void g(final int i10, final int i11, boolean z9, final com.android.wallpaper.asset.a.d receiver) {
        n.h(receiver, "receiver");
        this.f21806e.execute(new Runnable() { // from class: h6.b
            @Override // java.lang.Runnable
            public final void run() {
                c.w(i10, i11, this, receiver);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void i(Rect rect, final int i10, final int i11, boolean z9, final com.android.wallpaper.asset.a.d receiver) {
        n.h(receiver, "receiver");
        this.f21806e.execute(new Runnable() { // from class: h6.a
            @Override // java.lang.Runnable
            public final void run() {
                c.x(i10, i11, this, receiver);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void j(Activity activity, com.android.wallpaper.asset.a.e receiver) {
        n.h(receiver, "receiver");
        receiver.a(v());
    }

    @Override // com.android.wallpaper.asset.a
    public void n(Context context, ImageView imageView, int i10) {
        n.h(context, "context");
        n.h(imageView, "imageView");
        Glide.with(context).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) this.f21809h.placeholder(new ColorDrawable(i10))).transition(DrawableTransitionOptions.withCrossFade()).into(imageView);
    }

    @Override // com.android.wallpaper.asset.a
    public void q(Activity activity, ImageView imageView, int i10, BitmapTransformation transformation) {
        n.h(activity, "activity");
        n.h(imageView, "imageView");
        n.h(transformation, "transformation");
        Glide.with(activity).asDrawable().load((Object) this).apply((BaseRequestOptions<?>) RequestOptions.bitmapTransform(new MultiTransformation(new FitCenter(), transformation)).placeholder(new ColorDrawable(i10))).into(imageView);
    }

    public final Key y() {
        Key key = this.f21807f;
        if (key != null) {
            return key;
        }
        String resourcePackageName = this.f21803b.getResourcePackageName(this.f21804c);
        n.g(resourcePackageName, "getResourcePackageName(...)");
        a aVar = new a(resourcePackageName, this.f21804c, this.f21805d);
        this.f21807f = aVar;
        return aVar;
    }

    public final Drawable z() {
        return new ColorDrawable(this.f21808g);
    }
}
