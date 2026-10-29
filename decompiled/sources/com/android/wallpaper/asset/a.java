package com.android.wallpaper.asset;

import H3.D;
import H3.s;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.wallpaper.asset.a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p074h3.I;
import p074h3.InterfaceC1362b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f15837a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.android.wallpaper.asset.a$a, reason: collision with other inner class name */
    class C0446a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f15838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f15840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f15841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Drawable f15842e;

        C0446a(a aVar, f fVar, boolean z9, ImageView imageView, Context context, Drawable drawable) {
            this.f15838a = fVar;
            this.f15839b = z9;
            this.f15840c = imageView;
            this.f15841d = context;
            this.f15842e = drawable;
        }

        @Override // com.android.wallpaper.asset.a.d
        public void a(Bitmap bitmap) {
            f fVar = this.f15838a;
            if (fVar != null) {
                fVar.b(bitmap);
            }
            if (!this.f15839b) {
                this.f15840c.setImageBitmap(bitmap);
                return;
            }
            Context context = this.f15841d;
            if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
                return;
            }
            Resources resources = this.f15841d.getResources();
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.f15842e, new BitmapDrawable(resources, bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            this.f15840c.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(resources.getInteger(R.integer.config_shortAnimTime));
        }
    }

    class b implements InterfaceC1362b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f15843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f15844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f15845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Drawable f15846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15847e;

        b(Activity activity, ImageView imageView, boolean z9, Drawable drawable, int i10) {
            this.f15843a = activity;
            this.f15844b = imageView;
            this.f15845c = z9;
            this.f15846d = drawable;
            this.f15847e = i10;
        }

        @Override // p074h3.InterfaceC1362b.a
        public void a(Throwable th) {
            if (this.f15843a.isDestroyed()) {
                return;
            }
            a.this.n(this.f15843a, this.f15844b, this.f15847e);
        }

        @Override // p074h3.InterfaceC1362b.a
        public void b(Bitmap bitmap) {
            if (this.f15843a.isDestroyed()) {
                return;
            }
            this.f15844b.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (!this.f15845c) {
                this.f15844b.setImageBitmap(bitmap);
                return;
            }
            Resources resources = this.f15843a.getResources();
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.f15846d, new BitmapDrawable(resources, bitmap)});
            transitionDrawable.setCrossFadeEnabled(true);
            this.f15844b.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(resources.getInteger(R.integer.config_shortAnimTime));
        }
    }

    class c implements InterfaceC1362b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f15849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f15850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f15851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f15853e;

        c(Activity activity, ImageView imageView, boolean z9, int i10, f fVar) {
            this.f15849a = activity;
            this.f15850b = imageView;
            this.f15851c = z9;
            this.f15852d = i10;
            this.f15853e = fVar;
        }

        @Override // p074h3.InterfaceC1362b.a
        public void a(Throwable th) {
            if (this.f15849a.isDestroyed()) {
                return;
            }
            a.this.o(this.f15849a, this.f15850b, this.f15852d, this.f15853e);
        }

        @Override // p074h3.InterfaceC1362b.a
        public void b(Bitmap bitmap) {
            if (!this.f15849a.isDestroyed()) {
                this.f15850b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (this.f15851c) {
                    Resources resources = this.f15849a.getResources();
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(this.f15852d), new BitmapDrawable(resources, bitmap)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    this.f15850b.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(resources.getInteger(R.integer.config_shortAnimTime));
                } else {
                    Glide.with(this.f15849a).asDrawable().load(bitmap).transition(DrawableTransitionOptions.withCrossFade(500)).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(this.f15850b);
                }
            }
            f fVar = this.f15853e;
            if (fVar != null) {
                fVar.b(bitmap);
            }
        }
    }

    public interface d {
        void a(Bitmap bitmap);
    }

    public interface e {
        void a(Point point);
    }

    public interface f {
        void a(Throwable th);

        void b(Bitmap bitmap);
    }

    public static /* synthetic */ void a(f fVar, Context context, boolean z9, int i10, ImageView imageView, Bitmap bitmap) {
        if (fVar != null) {
            fVar.b(bitmap);
        }
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            return;
        }
        if (!z9) {
            Glide.with(context).asDrawable().load(bitmap).transition(DrawableTransitionOptions.withCrossFade()).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(imageView);
            return;
        }
        Resources resources = context.getResources();
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(i10), new BitmapDrawable(resources, bitmap)});
        transitionDrawable.setCrossFadeEnabled(true);
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(resources.getInteger(R.integer.config_shortAnimTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Activity activity, ImageView imageView, int i10, boolean z9, boolean z10, Drawable drawable, Point point) {
        if (activity.isDestroyed()) {
            return;
        }
        if (point == null) {
            n(activity, imageView, i10);
            return;
        }
        Rect rectJ = D.j(point, s.a().e(activity.getWindowManager().getDefaultDisplay()));
        e(activity, point, rectJ, z9);
        I.a().t().a(this, 1.0f, rectJ, D.o(activity), new b(activity, imageView, z10, drawable, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Activity activity, f fVar, ImageView imageView, int i10, boolean z9, boolean z10, Point point) {
        if (activity.isDestroyed()) {
            if (fVar != null) {
                fVar.a(null);
            }
        } else {
            if (point == null) {
                p(activity, imageView, i10, z9, fVar);
                return;
            }
            Rect rectJ = D.j(point, s.a().e(activity.getWindowManager().getDefaultDisplay()));
            e(activity, point, rectJ, z10);
            I.a().t().a(this, 1.0f, rectJ, D.o(activity), new c(activity, imageView, z9, i10, fVar));
        }
    }

    protected void e(Context context, Point point, Rect rect, boolean z9) {
        D.a(context, rect, true);
    }

    public final void f(int i10, int i11, d dVar) {
        g(i10, i11, true, dVar);
    }

    public abstract void g(int i10, int i11, boolean z9, d dVar);

    protected void h(final d dVar, final Bitmap bitmap) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b3.a
            @Override // java.lang.Runnable
            public final void run() {
                dVar.a(bitmap);
            }
        });
    }

    public abstract void i(Rect rect, int i10, int i11, boolean z9, d dVar);

    public abstract void j(Activity activity, e eVar);

    public Bitmap k(Context context) {
        return null;
    }

    public void n(Context context, ImageView imageView, int i10) {
        o(context, imageView, i10, null);
    }

    public void o(Context context, ImageView imageView, int i10, f fVar) {
        boolean z9 = imageView.getDrawable() == null;
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        if (z9) {
            imageView.setImageDrawable(colorDrawable);
        }
        f(imageView.getWidth() > 0 ? imageView.getWidth() : Math.abs(imageView.getLayoutParams().width), imageView.getHeight() > 0 ? imageView.getHeight() : Math.abs(imageView.getLayoutParams().height), new C0446a(this, fVar, z9, imageView, context, colorDrawable));
    }

    public void p(final Context context, final ImageView imageView, final int i10, final boolean z9, final f fVar) {
        if (z9) {
            imageView.setImageDrawable(new ColorDrawable(i10));
        }
        f(imageView.getWidth() > 0 ? imageView.getWidth() : Math.abs(imageView.getLayoutParams().width), imageView.getHeight() > 0 ? imageView.getHeight() : Math.abs(imageView.getLayoutParams().height), new d() { // from class: b3.d
            @Override // com.android.wallpaper.asset.a.d
            public final void a(Bitmap bitmap) {
                a.a(fVar, context, z9, i10, imageView, bitmap);
            }
        });
    }

    public void q(Activity activity, ImageView imageView, int i10, BitmapTransformation bitmapTransformation) {
    }

    public void r(final Activity activity, final ImageView imageView, final int i10, final boolean z9) {
        final boolean z10 = imageView.getDrawable() == null;
        final ColorDrawable colorDrawable = new ColorDrawable(i10);
        if (z10) {
            imageView.setImageDrawable(colorDrawable);
        }
        j(activity, new e() { // from class: b3.c
            @Override // com.android.wallpaper.asset.a.e
            public final void a(Point point) {
                this.f14822a.l(activity, imageView, i10, z9, z10, colorDrawable, point);
            }
        });
    }

    public void s(final Activity activity, final ImageView imageView, final int i10, final boolean z9, final boolean z10, final f fVar) {
        if (z10) {
            imageView.setImageDrawable(new ColorDrawable(i10));
        }
        j(activity, new e() { // from class: b3.b
            @Override // com.android.wallpaper.asset.a.e
            public final void a(Point point) {
                this.f14815a.m(activity, fVar, imageView, i10, z10, z9, point);
            }
        });
    }
}
