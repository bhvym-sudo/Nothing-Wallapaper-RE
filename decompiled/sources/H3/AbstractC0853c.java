package H3;

import android.graphics.Bitmap;
import android.graphics.Point;

/* JADX INFO: renamed from: H3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0853c {
    public static Bitmap a(Bitmap bitmap, Point point) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-16777216);
        int width = (bitmap.getWidth() - bitmapCreateBitmap.getWidth()) / 2;
        int height = (bitmap.getHeight() - bitmapCreateBitmap.getHeight()) / 2;
        int[] iArr = new int[Math.min(bitmapCreateBitmap.getWidth(), bitmap.getWidth()) * Math.min(bitmapCreateBitmap.getHeight(), bitmap.getHeight())];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), Math.max(0, width), Math.max(0, height), Math.min(bitmapCreateBitmap.getWidth(), bitmap.getWidth()), Math.min(bitmapCreateBitmap.getHeight(), bitmap.getHeight()));
        bitmapCreateBitmap.setPixels(iArr, 0, bitmap.getWidth(), Math.max(0, width * (-1)), Math.max(0, height * (-1)), Math.min(bitmapCreateBitmap.getWidth(), bitmap.getWidth()), Math.min(bitmapCreateBitmap.getHeight(), bitmap.getHeight()));
        return bitmapCreateBitmap;
    }
}
