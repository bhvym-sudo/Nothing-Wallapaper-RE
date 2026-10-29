package p097j6;

import android.graphics.Bitmap;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;
import p079h8.o;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f22329a = new d();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22330a;

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
            f22330a = iArr;
        }
    }

    private d() {
    }

    public static final long a(Bitmap bitmap) {
        n.h(bitmap, "bitmap");
        long width = ((long) (bitmap.getWidth() * bitmap.getHeight())) * ((long) c(bitmap.getConfig()));
        long j9 = Optimizer.OPTIMIZATION_GROUPING;
        c.d("BitmapScaleUtil", "calculateBitmapMemory: " + ((width / j9) / j9) + "M");
        return width;
    }

    public static final float b(long j9, long j10) {
        if (j9 <= 0 || j10 <= 0) {
            return 1.0f;
        }
        float fSqrt = (float) Math.sqrt(j10 / j9);
        c.d("BitmapScaleUtil", "calculateScaleFactor:" + fSqrt);
        return (float) Math.max(0.1d, Math.min(1.0d, fSqrt));
    }

    private static final int c(Bitmap.Config config) {
        switch (config == null ? -1 : a.f22330a[config.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
                return 4;
            case 6:
                return 8;
            case 7:
                return 0;
            default:
                return 4;
        }
    }

    public static final o d(Bitmap bitmap, int i10, int i11) {
        n.h(bitmap, "bitmap");
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return new o(bitmap, Boolean.TRUE);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        n.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return new o(bitmapCreateScaledBitmap, Boolean.FALSE);
    }

    public static final o e(Bitmap originalBitmap, long j9) {
        n.h(originalBitmap, "originalBitmap");
        try {
            long jA = a(originalBitmap);
            if (jA <= j9) {
                return new o(originalBitmap, Boolean.TRUE);
            }
            float fB = b(jA, j9);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(originalBitmap, Math.max(1, (int) (originalBitmap.getWidth() * fB)), Math.max(1, (int) (originalBitmap.getHeight() * fB)), true);
            n.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            return new o(bitmapCreateScaledBitmap, Boolean.FALSE);
        } catch (OutOfMemoryError e10) {
            c.f("BitmapScaleUtil", "scaleBitmapToMaxMemory, OutOfMemoryError:" + e10.getMessage());
            return null;
        }
    }
}
