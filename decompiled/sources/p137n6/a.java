package p137n6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;
import p189s8.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f23275a = Uri.parse("content://com.nothing.blurwallpaper.AtmosphereProvider/final");

    public static final Drawable a(Context context) {
        Object objB;
        n.h(context, "context");
        try {
            q.a aVar = q.f21862r;
            BitmapDrawable bitmapDrawable = null;
            ParcelFileDescriptor parcelFileDescriptorOpenFile = context.getContentResolver().openFile(f23275a, "r", null);
            if (parcelFileDescriptorOpenFile != null) {
                try {
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFile.getFileDescriptor()));
                    b.a(parcelFileDescriptorOpenFile, null);
                    bitmapDrawable = bitmapDrawable2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.a(parcelFileDescriptorOpenFile, th);
                        throw th2;
                    }
                }
            }
            objB = q.b(bitmapDrawable);
        } catch (Throwable th3) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th3));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.f("LiveWallpaperThumbAssetExt", "loadBlurThumbnail error:" + thD);
        }
        Drawable drawable = context.getDrawable(p166q5.n.f25056a.l());
        if (q.f(objB)) {
            objB = drawable;
        }
        return (Drawable) objB;
    }

    public static final Bitmap b(Context context) {
        Object objB;
        Bitmap bitmapDecodeFileDescriptor;
        n.h(context, "context");
        try {
            q.a aVar = q.f21862r;
            ParcelFileDescriptor parcelFileDescriptorOpenFile = context.getContentResolver().openFile(f23275a, "r", null);
            if (parcelFileDescriptorOpenFile != null) {
                try {
                    bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFile.getFileDescriptor());
                    b.a(parcelFileDescriptorOpenFile, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.a(parcelFileDescriptorOpenFile, th);
                        throw th2;
                    }
                }
            } else {
                bitmapDecodeFileDescriptor = null;
            }
            objB = q.b(bitmapDecodeFileDescriptor);
        } catch (Throwable th3) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th3));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.f("LiveWallpaperThumbAssetExt", "loadBlurThumbnailBitmap error:" + thD);
        }
        Bitmap bitmap = (Bitmap) (q.f(objB) ? null : objB);
        return bitmap == null ? p166q5.n.f25056a.m(context) : bitmap;
    }
}
