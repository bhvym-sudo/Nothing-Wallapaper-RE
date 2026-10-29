package H3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: renamed from: H3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0852b {
    public static Bitmap a(Bitmap bitmap, int i10, int i11) {
        try {
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            D.k(rect, i10 / 5, i11 / 5);
            return Bitmap.createScaledBitmap(bitmap, rect.width(), rect.height(), true);
        } catch (IllegalArgumentException e10) {
            Log.e("BitmapProcessor", "error while blurring bitmap", e10);
            return null;
        }
    }
}
