package p084i3;

import H3.AbstractC0852b;
import H3.D;
import H3.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowManager;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class J0 extends BitmapTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Point f21990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21991c;

    public J0(Context context, boolean z9) {
        this.f21990b = s.a().e(((WindowManager) context.getSystemService("window")).getDefaultDisplay());
        this.f21991c = z9;
        this.f21989a = context;
    }

    private String a() {
        return "preview";
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i10, int i11) {
        float fI = D.i(new Point(bitmap.getWidth(), bitmap.getHeight()), this.f21990b);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Point pointC = D.c(new Point(Math.round(bitmap.getWidth() * fI), Math.round(bitmap.getHeight() * fI)), this.f21990b, false, this.f21991c);
        int iRound = Math.round(pointC.x / fI);
        int iRound2 = Math.round(pointC.y / fI);
        Rect rect2 = new Rect(iRound, iRound2, Math.round(this.f21990b.x / fI) + iRound, Math.round(this.f21990b.y / fI) + iRound2);
        if (rect.contains(rect2)) {
            bitmap = Bitmap.createBitmap(bitmap, rect2.left, rect2.top, rect2.width(), rect2.height());
        }
        return AbstractC0852b.a(bitmap, bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(a().getBytes());
    }
}
