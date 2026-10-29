package p237x6;

import G6.b;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.android.wallpaper.asset.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f29987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f29989d;

    public c(Bitmap raw) {
        n.h(raw, "raw");
        this.f29987b = raw;
        this.f29988c = "BitmapAsset";
        this.f29989d = Executors.newCachedThreadPool();
    }

    private final Point v() {
        return new Point(this.f29987b.getWidth(), this.f29987b.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(c cVar, int i10, int i11, a.d dVar) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(cVar.f29987b, i10, i11, true);
        n.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        cVar.h(dVar, bitmapCreateScaledBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(c cVar, int i10, int i11, Rect rect, a.d dVar) {
        cVar.h(dVar, b.e(cVar.f29987b, i10, i11, rect, false, false, 32, null));
    }

    @Override // com.android.wallpaper.asset.a
    public void g(final int i10, final int i11, boolean z9, final a.d receiver) {
        n.h(receiver, "receiver");
        this.f29989d.execute(new Runnable() { // from class: x6.a
            @Override // java.lang.Runnable
            public final void run() {
                c.w(this.f29978q, i10, i11, receiver);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void i(final Rect rect, final int i10, final int i11, boolean z9, final a.d receiver) {
        n.h(rect, "rect");
        n.h(receiver, "receiver");
        String str = ", raw = (" + this.f29987b.getWidth() + ", " + this.f29987b.getHeight() + "), rect = " + rect;
        if (rect.left + rect.width() > this.f29987b.getWidth()) {
            rect.right = this.f29987b.getWidth();
            com.nothing.wallpaper.common.log.c.f(this.f29988c, "decodeBitmapRegion: before x + width has > bitmap.width() " + str + ", updatedRect = " + rect);
        }
        if (rect.top + rect.height() > this.f29987b.getHeight()) {
            rect.bottom = this.f29987b.getHeight();
            com.nothing.wallpaper.common.log.c.f(this.f29988c, "decodeBitmapRegion: before y + height has > bitmap.height() " + str + ",updatedRect = " + rect);
        }
        this.f29989d.execute(new Runnable() { // from class: x6.b
            @Override // java.lang.Runnable
            public final void run() {
                c.x(this.f29982q, i10, i11, rect, receiver);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void j(Activity activity, a.e receiver) {
        n.h(receiver, "receiver");
        receiver.a(v());
    }

    public final Bitmap y() {
        return this.f29987b;
    }
}
