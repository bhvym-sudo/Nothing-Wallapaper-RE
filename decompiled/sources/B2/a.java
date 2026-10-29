package B2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f340a = true;

    static Bitmap a(int i10, int i11, a aVar) {
        c.b();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVar.b(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    static Bitmap c(int i10, int i11, a aVar) {
        if (!f340a) {
            return a(i10, i11, aVar);
        }
        c.b();
        Picture picture = new Picture();
        aVar.b(picture.beginRecording(i10, i11));
        picture.endRecording();
        return Bitmap.createBitmap(picture);
    }

    void b(Canvas canvas);
}
