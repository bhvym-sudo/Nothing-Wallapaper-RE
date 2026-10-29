package com.android.wallpaper.asset;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends com.android.wallpaper.asset.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final ExecutorService f15914f = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BitmapRegionDecoder f15915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Point f15916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap.Config f15917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f15918e = false;

    public interface a {
        void a(InputStream inputStream);
    }

    private void B(InputStream inputStream, String str) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
            Log.e("StreamableAsset", str);
        }
    }

    private Bitmap C(boolean z9) {
        int iG = G();
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z9) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
        }
        InputStream inputStreamO = O();
        if (inputStreamO == null) {
            return null;
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamO, null, options);
        B(inputStreamO, "Error closing the input stream used to decode the full bitmap");
        int iF = F(iG);
        if (iF <= 0 || bitmapDecodeStream == null) {
            return bitmapDecodeStream;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iF);
        return Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
    }

    private static int F(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 3) {
            return SubsamplingScaleImageView.ORIENTATION_180;
        }
        if (i10 == 6) {
            return 90;
        }
        if (i10 == 8) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        Log.w("StreamableAsset", "Unsupported EXIF orientation " + i10);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(int i10, int i11, com.android.wallpaper.asset.a.d dVar, boolean z9) {
        int i12;
        int iG = G();
        if (iG == 6 || iG == 8) {
            i12 = i10;
            i10 = i11;
        } else {
            i12 = i11;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        Point pointA = A();
        Bitmap bitmapCreateBitmap = null;
        if (pointA == null) {
            h(dVar, null);
            return;
        }
        options.inSampleSize = p014b3.f.b(pointA.x, pointA.y, i10, i12);
        if (z9) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
        }
        InputStream inputStreamO = O();
        if (inputStreamO != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamO, null, options);
            B(inputStreamO, "Error closing the input stream used to decode the full bitmap");
            int iF = F(iG);
            if (iF <= 0 || bitmapDecodeStream == null) {
                bitmapCreateBitmap = bitmapDecodeStream;
            } else {
                Matrix matrix = new Matrix();
                matrix.setRotate(iF);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
            }
        }
        h(dVar, bitmapCreateBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(final com.android.wallpaper.asset.a.e eVar) {
        final Point pointA = A();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b3.z
            @Override // java.lang.Runnable
            public final void run() {
                eVar.a(pointA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(boolean z9, com.android.wallpaper.asset.a.d dVar) {
        Bitmap bitmapC = C(z9);
        if (bitmapC == null) {
            h(dVar, null);
            return;
        }
        p079h8.o oVarE = p097j6.d.e(bitmapC, p087i6.e.l() ? 62914560L : 31457280L);
        if (oVarE == null) {
            h(dVar, bitmapC);
            return;
        }
        if (!((Boolean) oVarE.d()).booleanValue()) {
            bitmapC.recycle();
        }
        Bitmap bitmap = (Bitmap) oVarE.c();
        com.nothing.wallpaper.common.log.c.d("StreamableAsset", "decodeSuitableBitmap newSize:" + bitmap.getWidth() + "x" + bitmap.getHeight() + " originSize:" + bitmapC.getWidth() + "x" + bitmapC.getHeight());
        h(dVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(final a aVar) {
        final InputStream inputStreamO = O();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b3.A
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(inputStreamO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(int i10, int i11, Rect rect, com.android.wallpaper.asset.a.d dVar, boolean z9) {
        int i12;
        int i13;
        int iG = G();
        if (iG == 6 || iG == 8) {
            i12 = i10;
            i13 = i11;
        } else {
            i13 = i10;
            i12 = i11;
        }
        Point pointA = A();
        if (pointA == null) {
            h(dVar, null);
            return;
        }
        Rect rectA = p014b3.k.a(pointA, rect, iG);
        if (z9) {
            int i14 = pointA.x;
            rectA.set(i14 - rectA.right, rectA.top, i14 - rectA.left, rectA.bottom);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = p014b3.f.b(rectA.width(), rectA.height(), i13, i12);
        if (this.f15915b == null) {
            this.f15915b = N();
        }
        BitmapRegionDecoder bitmapRegionDecoder = this.f15915b;
        if (bitmapRegionDecoder != null) {
            try {
                Bitmap bitmapDecodeRegion = bitmapRegionDecoder.decodeRegion(rectA, options);
                int iF = F(iG);
                if (iF > 0) {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(iF);
                    bitmapDecodeRegion = Bitmap.createBitmap(bitmapDecodeRegion, 0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight(), matrix, false);
                }
                h(dVar, bitmapDecodeRegion);
                return;
            } catch (IllegalArgumentException e10) {
                Log.e("StreamableAsset", "Illegal argument for decoding bitmap region", e10);
            } catch (OutOfMemoryError e11) {
                Log.e("StreamableAsset", "Out of memory and unable to decode bitmap region", e11);
            }
        } else {
            try {
                p079h8.o oVarH = G6.b.h(this, 31457280L, this.f15917d, this.f15916c);
                if (oVarH != null) {
                    int iIntValue = ((Integer) oVarH.c()).intValue();
                    Bitmap bitmap = (Bitmap) oVarH.d();
                    Bitmap bitmapC = G6.b.c(bitmap, i10, i11, G6.c.j(rect, 1.0f / iIntValue), false, true);
                    bitmap.recycle();
                    com.nothing.wallpaper.common.log.c.d("StreamableAsset", "runDecodeBitmapRegionTask: BitmapRegionDecoder didn't support this image, so crop a bitmap from original.");
                    h(dVar, bitmapC);
                    return;
                }
            } catch (OutOfMemoryError e12) {
                com.nothing.wallpaper.common.log.c.g("StreamableAsset", "runDecodeBitmapRegionTask: Out of memory and unable to cropped a bitmap from original.", e12);
            }
        }
        h(dVar, null);
    }

    private BitmapRegionDecoder N() throws Throwable {
        InputStream inputStreamO;
        Throwable th;
        try {
            inputStreamO = O();
            if (inputStreamO == null) {
                B(inputStreamO, "Unable to close input stream used to create BitmapRegionDecoder");
                return null;
            }
            try {
                try {
                    BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamO, true);
                    B(inputStreamO, "Unable to close input stream used to create BitmapRegionDecoder");
                    return bitmapRegionDecoderNewInstance;
                } catch (IOException e10) {
                    e = e10;
                    Log.w("StreamableAsset", "Unable to open BitmapRegionDecoder", e);
                    B(inputStreamO, "Unable to close input stream used to create BitmapRegionDecoder");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                B(inputStreamO, "Unable to close input stream used to create BitmapRegionDecoder");
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            inputStreamO = null;
        } catch (Throwable th3) {
            inputStreamO = null;
            th = th3;
            B(inputStreamO, "Unable to close input stream used to create BitmapRegionDecoder");
            throw th;
        }
    }

    public Point A() {
        Point point = this.f15916c;
        if (point != null) {
            return point;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamO = O();
        if (inputStreamO == null) {
            return null;
        }
        BitmapFactory.decodeStream(inputStreamO, null, options);
        B(inputStreamO, "There was an error closing the input stream used to calculate the image's raw dimensions");
        this.f15917d = options.outConfig;
        int iG = G();
        if (iG == 6 || iG == 8) {
            this.f15916c = new Point(options.outHeight, options.outWidth);
        } else {
            this.f15916c = new Point(options.outWidth, options.outHeight);
        }
        return this.f15916c;
    }

    public void D(final boolean z9, final com.android.wallpaper.asset.a.d dVar) {
        f15914f.execute(new Runnable() { // from class: b3.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f14808q.K(z9, dVar);
            }
        });
    }

    public void E(final a aVar) {
        f15914f.execute(new Runnable() { // from class: b3.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f14873q.L(aVar);
            }
        });
    }

    public int G() {
        return 1;
    }

    public Boolean H() {
        return Boolean.valueOf(this.f15918e);
    }

    public abstract InputStream O();

    public void P(final Rect rect, final int i10, final int i11, final boolean z9, final com.android.wallpaper.asset.a.d dVar) {
        f15914f.execute(new Runnable() { // from class: b3.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f14860q.M(i10, i11, rect, dVar, z9);
            }
        });
    }

    public void Q(boolean z9) {
        this.f15918e = z9;
    }

    @Override // com.android.wallpaper.asset.a
    public void g(final int i10, final int i11, final boolean z9, final com.android.wallpaper.asset.a.d dVar) {
        f15914f.execute(new Runnable() { // from class: b3.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f14868q.I(i10, i11, dVar, z9);
            }
        });
    }

    @Override // com.android.wallpaper.asset.a
    public void i(Rect rect, int i10, int i11, boolean z9, com.android.wallpaper.asset.a.d dVar) {
        P(rect, i10, i11, z9, dVar);
    }

    @Override // com.android.wallpaper.asset.a
    public void j(Activity activity, final com.android.wallpaper.asset.a.e eVar) {
        f15914f.execute(new Runnable() { // from class: b3.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f14866q.J(eVar);
            }
        });
    }
}
