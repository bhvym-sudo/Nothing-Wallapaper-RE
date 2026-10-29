package p097j6;

import android.graphics.Bitmap;
import android.graphics.Point;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final Point a(Bitmap bitmap) {
        n.h(bitmap, "<this>");
        return new Point(bitmap.getWidth(), bitmap.getHeight());
    }

    public static final void b(Bitmap bitmap, int i10, int i11, Bitmap.Config config) {
        n.h(bitmap, "<this>");
        n.h(config, "config");
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11 && bitmap.getConfig() == config) {
            return;
        }
        bitmap.reconfigure(i10, i11, config);
    }

    public static final String c(Bitmap bitmap) {
        n.h(bitmap, "<this>");
        return "[" + bitmap.hashCode() + ",size=" + a(bitmap) + ",mem=" + g.a(bitmap.getAllocationByteCount()) + "]";
    }
}
