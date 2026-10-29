package p074h3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: h3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1371k implements InterfaceC1362b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f21693a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: h3.k$a */
    class a implements com.android.wallpaper.asset.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1362b.a f21694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rect f21695b;

        a(C1371k c1371k, InterfaceC1362b.a aVar, Rect rect) {
            this.f21694a = aVar;
            this.f21695b = rect;
        }

        public static /* synthetic */ void b(Bitmap bitmap, Rect rect, final InterfaceC1362b.a aVar) {
            try {
                final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, rect.width(), rect.height(), true);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: h3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.b(bitmapCreateScaledBitmap);
                    }
                });
            } catch (OutOfMemoryError e10) {
                Log.w("DefaultBitmapCropper", "Not enough memory to fit the final cropped and scaled bitmap to size", e10);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: h3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(e10);
                    }
                });
            }
        }

        @Override // com.android.wallpaper.asset.a.d
        public void a(final Bitmap bitmap) {
            if (bitmap == null) {
                this.f21694a.a(null);
                return;
            }
            ExecutorService executorService = C1371k.f21693a;
            final Rect rect = this.f21695b;
            final InterfaceC1362b.a aVar = this.f21694a;
            executorService.execute(new Runnable() { // from class: h3.h
                @Override // java.lang.Runnable
                public final void run() {
                    C1371k.a.b(bitmap, rect, aVar);
                }
            });
        }
    }

    @Override // p074h3.InterfaceC1362b
    public void a(com.android.wallpaper.asset.a aVar, float f10, Rect rect, boolean z9, InterfaceC1362b.a aVar2) {
        aVar.i(new Rect((int) Math.floor(rect.left / f10), (int) Math.floor(rect.top / f10), (int) Math.floor(rect.right / f10), (int) Math.floor(rect.bottom / f10)), rect.width(), rect.height(), z9, new a(this, aVar2, rect));
    }
}
