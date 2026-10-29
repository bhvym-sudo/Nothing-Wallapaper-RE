package p014b3;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static Rect a(Point point, Rect rect, int i10) {
        if (i10 == 1) {
            return new Rect(rect);
        }
        if (i10 == 3) {
            int i11 = point.x;
            int i12 = i11 - rect.right;
            int i13 = point.y;
            return new Rect(i12, i13 - rect.bottom, i11 - rect.left, i13 - rect.top);
        }
        if (i10 == 6) {
            int i14 = rect.top;
            int i15 = point.x;
            return new Rect(i14, i15 - rect.right, rect.bottom, i15 - rect.left);
        }
        if (i10 == 8) {
            int i16 = point.y;
            return new Rect(i16 - rect.bottom, rect.left, i16 - rect.top, rect.right);
        }
        Log.w("CropRectRotator", "Unsupported EXIF orientation " + i10);
        return new Rect(rect);
    }
}
