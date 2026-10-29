package p014b3;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static float a(Point point, Rect rect) {
        int i10 = rect.left;
        int i11 = point.x - rect.right;
        if (i10 + i11 == 0) {
            return 0.5f;
        }
        float f10 = i10;
        return f10 / (i11 + f10);
    }

    public static int b(int i10, int i11, int i12, int i13) {
        int i14 = i11 / 2;
        int i15 = i10 / 2;
        int i16 = 0;
        while ((i14 >> i16) >= i13 && (i15 >> i16) >= i12) {
            i16++;
        }
        return 1 << i16;
    }

    public static float c(Point point, Rect rect) {
        int i10 = rect.top;
        int i11 = point.y - rect.bottom;
        if (i10 + i11 == 0) {
            return 0.5f;
        }
        float f10 = i10;
        return f10 / (i11 + f10);
    }

    public static long d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        long pixel = ((527 + ((long) width)) * 31) + ((long) height);
        for (int i10 = 0; i10 < width; i10 = (i10 * 2) + 1) {
            for (int i11 = 0; i11 < height; i11 = (i11 * 2) + 1) {
                pixel = (pixel * 31) + ((long) bitmap.getPixel(i10, i11));
            }
        }
        return pixel;
    }
}
