package U6;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7982c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f7983d = i.b(new p219v8.a() { // from class: U6.c
        @Override // p219v8.a
        public final Object invoke() {
            return e.j();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7984a = "ImageDiskCache";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f7985b = i.b(new p219v8.a() { // from class: U6.d
        @Override // p219v8.a
        public final Object invoke() {
            return e.f();
        }
    });

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final e a() {
            return (e) e.f7983d.getValue();
        }

        public final e b() {
            return a();
        }

        private a() {
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p127m6.a f() {
        return b.f7980a.b();
    }

    private final p127m6.a i() {
        return (p127m6.a) this.f7985b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e j() {
        return new e();
    }

    public final void d(String imageUrl) {
        n.h(imageUrl, "imageUrl");
        i().c(imageUrl);
    }

    public final void e() {
        i().a(99);
    }

    public final String g(String key) {
        n.h(key, "key");
        return i().get(key);
    }

    public final int h() {
        return i().b();
    }

    public final boolean k(String key, Bitmap bitmap) {
        n.h(key, "key");
        n.h(bitmap, "bitmap");
        return i().d(key, bitmap);
    }

    public final void l(Context context, String imageUrl) {
        Bitmap bitmap;
        n.h(context, "context");
        n.h(imageUrl, "imageUrl");
        try {
            bitmap = Glide.with(context).asBitmap().load(imageUrl).submit(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.f(this.f7984a, "load image failed, msg:" + e10.getMessage());
            bitmap = null;
        }
        if (bitmap != null) {
            i().d(imageUrl, bitmap);
        }
    }
}
