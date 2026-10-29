package G6;

import C6.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.InputStream;
import kotlin.jvm.internal.n;
import p079h8.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p167q6.b f1968a = new p167q6.b("BitmapCropUtils");

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1969a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1969a = iArr;
        }
    }

    public static final o a(i source, p107k6.c bitmapPool) {
        n.h(source, "source");
        n.h(bitmapPool, "bitmapPool");
        if (source.g()) {
            Point pointC = source.c();
            if (source.f()) {
                return new o(source.b(), Boolean.FALSE);
            }
            Bitmap bitmapQ = p107k6.c.q(bitmapPool, pointC.x, pointC.y, null, 4, null);
            new Canvas(bitmapQ).drawBitmap(source.b(), new Rect(0, 0, pointC.x, pointC.y), new Rect(0, 0, pointC.x, pointC.y), (Paint) null);
            return new o(bitmapQ, Boolean.TRUE);
        }
        f1968a.e("copyBitmapRegion, RegionBitmap rect is invalid. " + source);
        throw new IllegalArgumentException("RegionBitmap rect is invalid. " + source);
    }

    public static final void b(Bitmap source, Rect cropRect, float f10, i reusedBitmap) {
        n.h(source, "source");
        n.h(cropRect, "cropRect");
        n.h(reusedBitmap, "reusedBitmap");
        if (source.isRecycled()) {
            f1968a.e("cropAndScale2Bitmap source is recycled, return");
            return;
        }
        if (cropRect.left < 0 || cropRect.top < 0 || cropRect.right > source.getWidth() || cropRect.bottom > source.getHeight()) {
            f1968a.e("cropAndScaleB cropRect" + cropRect + " is invalid with " + p097j6.b.c(source) + ".");
            return;
        }
        Canvas canvas = new Canvas(reusedBitmap.b());
        canvas.save();
        canvas.scale(f10, f10);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(source, cropRect, new Rect(0, 0, cropRect.width(), cropRect.height()), paint);
        canvas.restore();
    }

    public static final Bitmap c(Bitmap source, int i10, int i11, Rect originCropRect, boolean z9, boolean z10) {
        n.h(source, "source");
        n.h(originCropRect, "originCropRect");
        if (z9 && originCropRect.left == 0 && originCropRect.right == source.getWidth() && originCropRect.top == 0 && originCropRect.height() == source.getHeight()) {
            return source;
        }
        if (z10) {
            i(originCropRect, source);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source, originCropRect.left, originCropRect.top, originCropRect.width(), originCropRect.height());
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        if (z9 && i10 == bitmapCreateBitmap.getWidth() && i11 == bitmapCreateBitmap.getHeight()) {
            return bitmapCreateBitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i10, i11, true);
        n.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    public static final Bitmap d(Bitmap source, Bitmap bitmap, float f10, Rect originCropRect, boolean z9, boolean z10) {
        Bitmap bitmapCreateBitmap;
        n.h(source, "source");
        n.h(originCropRect, "originCropRect");
        if (f10 == 1.0f && z9 && (n.d(originCropRect, c.h()) || (originCropRect.left == 0 && originCropRect.width() == source.getWidth() && originCropRect.top == 0 && originCropRect.height() == source.getHeight()))) {
            return source;
        }
        if (z10) {
            i(originCropRect, source);
        }
        int iWidth = (int) (originCropRect.width() * f10);
        int iHeight = (int) (originCropRect.height() * f10);
        if (bitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            n.g(bitmapCreateBitmap, "createBitmap(...)");
        } else {
            bitmapCreateBitmap = (bitmap.getWidth() < iWidth || bitmap.getHeight() < iHeight) ? null : bitmap;
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
                n.g(bitmapCreateBitmap, "createBitmap(...)");
            }
        }
        if (n.d(bitmapCreateBitmap, bitmap)) {
            f1968a.a("cropAndScaleBitmap reuse bitmap, source " + p097j6.b.c(source) + ", reusable " + (bitmap != null ? p097j6.b.c(bitmap) : null) + ".");
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        canvas.scale(f10, f10);
        canvas.drawBitmap(source, originCropRect, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (Paint) null);
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap e(Bitmap bitmap, int i10, int i11, Rect rect, boolean z9, boolean z10, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z9 = false;
        }
        boolean z11 = z9;
        if ((i12 & 32) != 0) {
            z10 = true;
        }
        return c(bitmap, i10, i11, rect, z11, z10);
    }

    public static final Bitmap f(Bitmap sourceBitmap, Rect srcRect, int i10, int i11, Bitmap reusableBitmap) {
        int iRound;
        int iWidth;
        n.h(sourceBitmap, "sourceBitmap");
        n.h(srcRect, "srcRect");
        n.h(reusableBitmap, "reusableBitmap");
        float f10 = i10;
        float f11 = i11;
        float f12 = f10 / f11;
        if (f12 > srcRect.width() / srcRect.height()) {
            iWidth = srcRect.width();
            iRound = Math.round(iWidth / f12);
        } else {
            int iHeight = srcRect.height();
            int iRound2 = Math.round(iHeight * f12);
            iRound = iHeight;
            iWidth = iRound2;
        }
        int iCenterX = srcRect.centerX() - (iWidth / 2);
        int iCenterY = srcRect.centerY() - (iRound / 2);
        Canvas canvas = new Canvas(reusableBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(iCenterX * 1.0f, iCenterY * 1.0f, (iCenterX + iWidth) * 1.0f, (iCenterY + iRound) * 1.0f), new RectF(0.0f, 0.0f, f10 * 1.0f, f11 * 1.0f), Matrix.ScaleToFit.FILL);
        canvas.drawBitmap(sourceBitmap, matrix, paint);
        return reusableBitmap;
    }

    public static final Bitmap g(i sourceBitmap, Bitmap bitmap, C6.d sourceCrop, C6.d dstCrop) {
        n.h(sourceBitmap, "sourceBitmap");
        n.h(sourceCrop, "sourceCrop");
        n.h(dstCrop, "dstCrop");
        Rect rectG = sourceCrop.g();
        Rect rectG2 = dstCrop.g();
        return d(sourceBitmap.b(), bitmap, 1.0f, new Rect(Math.max(0, rectG2.left - rectG.left), Math.max(0, rectG2.top - rectG.top), Integer.min(rectG2.right, rectG.right) - rectG.left, Integer.min(rectG2.bottom, rectG.bottom) - rectG.top), false, true);
    }

    public static final o h(com.android.wallpaper.asset.o oVar, long j9, Bitmap.Config config, Point point) {
        n.h(oVar, "<this>");
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        if (config == null || point == null) {
            options.inJustDecodeBounds = true;
            InputStream inputStreamO = oVar.O();
            if (inputStreamO != null) {
                try {
                    BitmapFactory.decodeStream(inputStreamO, null, options);
                    p189s8.b.a(inputStreamO, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p189s8.b.a(inputStreamO, th);
                        throw th2;
                    }
                }
            }
        } else {
            options.outConfig = config;
            options.outWidth = point.x;
            options.outHeight = point.y;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            f1968a.e("StreamableAsset decodeBitmap openInputStream got a null InputStream.");
            return null;
        }
        Bitmap.Config config2 = options.outConfig;
        int i11 = 4;
        switch (config2 == null ? -1 : a.f1969a[config2.ordinal()]) {
            case 1:
                i11 = 1;
                break;
            case 2:
            case 3:
                i11 = 2;
                break;
            case 6:
                i11 = 8;
                break;
            case 7:
                i11 = 0;
                break;
        }
        int i12 = options.outWidth * options.outHeight * i11;
        while (((double) i12) / Math.pow(i10, 2.0d) > j9) {
            i10 <<= 1;
        }
        options.inSampleSize = i10;
        options.inJustDecodeBounds = false;
        p167q6.b bVar = f1968a;
        bVar.a("original bytes " + i12 + ", maxBytes " + j9 + ", inSampleSize " + i10);
        InputStream inputStreamO2 = oVar.O();
        if (inputStreamO2 != null) {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamO2, null, options);
                o oVar2 = bitmapDecodeStream == null ? null : new o(Integer.valueOf(i10), bitmapDecodeStream);
                p189s8.b.a(inputStreamO2, null);
                if (oVar2 != null) {
                    return oVar2;
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    p189s8.b.a(inputStreamO2, th3);
                    throw th4;
                }
            }
        }
        bVar.e("StreamableAsset decodeBitmap openInputStream got a null InputStream.");
        return null;
    }

    private static final void i(Rect rect, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (rect.left + rect.width() > width) {
            f1968a.e("cropAndScaleBitmap suppressOutOfBounds cropRect=" + rect + ", source width=" + width + ", new right = " + width);
            rect.right = width;
        }
        if (rect.top + rect.height() > height) {
            f1968a.e("cropAndScaleBitmap suppressOutOfBounds cropRect=" + rect + ", source height=" + height + ", new bottom = " + height);
            rect.bottom = height;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:14:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:16:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:18:0x00e7 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x00b9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x00d2, please report this as an issue */
    public static final boolean j(float f10, Point viewSize, Point imageSize, PointF center) {
        boolean z9;
        float f11;
        n.h(viewSize, "viewSize");
        n.h(imageSize, "imageSize");
        n.h(center, "center");
        int i10 = viewSize.x;
        int i11 = viewSize.y;
        int i12 = imageSize.x;
        int i13 = imageSize.y;
        float f12 = (i10 / 2) / f10;
        float f13 = i12 - f12;
        float f14 = (i11 / 2) / f10;
        float f15 = i13 - f14;
        p167q6.b bVar = f1968a;
        bVar.a("normalizedCenter, scale=" + f10 + ", viewSize[" + i10 + "," + i11 + "], imageSize=[" + i12 + "," + i13 + "], centerX[" + f12 + "," + f13 + "], centerY[" + f14 + "," + f15 + "]");
        float f16 = center.x;
        if (f16 <= f13) {
            if (f16 < f12) {
                bVar.e("centerX out of range, currentX=" + f16);
                center.x = f12;
            } else {
                z9 = false;
            }
            f11 = center.y;
            if (f11 > f15) {
                bVar.e("centerY out of range, currentY=" + f11);
                center.y = f15;
                return true;
            }
            if (f11 < f14) {
                return z9;
            }
            bVar.e("centerY out of range, currentY=" + f11);
            center.y = f14;
            return true;
        }
        bVar.e("centerX out of range, currentX=" + f16);
        center.x = f13;
        z9 = true;
        f11 = center.y;
        if (f11 > f15) {
            bVar.e("centerY out of range, currentY=" + f11);
            center.y = f15;
            return true;
        }
        if (f11 < f14) {
            return z9;
        }
        bVar.e("centerY out of range, currentY=" + f11);
        center.y = f14;
        return true;
    }
}
