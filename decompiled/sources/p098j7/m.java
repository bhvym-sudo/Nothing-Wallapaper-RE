package p098j7;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f22528a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f22529b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Runnable f22530c = new Runnable() { // from class: j7.l
        @Override // java.lang.Runnable
        public final void run() {
            m.d();
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Bitmap f22531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile WeakReference f22532e;

    private m() {
    }

    public static final synchronized void c() {
        ImageView imageView;
        try {
            f22529b.removeCallbacks(f22530c);
            Bitmap bitmap = f22531d;
            if (bitmap == null) {
                return;
            }
            WeakReference weakReference = f22532e;
            if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
                imageView.setImageBitmap(null);
            }
            f22532e = null;
            f22531d = null;
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        c();
    }

    public static final void e() {
        if (f22531d == null) {
            return;
        }
        Handler handler = f22529b;
        Runnable runnable = f22530c;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000L);
    }

    public static final void f(ImageView imageView, Bitmap bitmap) {
        n.h(imageView, "imageView");
        n.h(bitmap, "bitmap");
        imageView.setImageBitmap(bitmap);
        f22532e = new WeakReference(imageView);
    }

    public final Bitmap b() {
        return f22531d;
    }

    public final void g(Bitmap bitmap) {
        f22531d = bitmap;
    }
}
