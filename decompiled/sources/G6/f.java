package G6;

import C6.i;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.n;
import p079h8.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1975a = 12544;

    public static final Bitmap a(i regionBitmap, p107k6.c bitmapPool) {
        n.h(regionBitmap, "regionBitmap");
        n.h(bitmapPool, "bitmapPool");
        int iE = regionBitmap.e();
        int iD = regionBitmap.d();
        if (iE * iD <= f1975a) {
            return regionBitmap.b();
        }
        o oVarB = b(iE, iD);
        float fFloatValue = ((Number) oVarB.a()).floatValue();
        Size size = (Size) oVarB.b();
        Bitmap bitmapQ = p107k6.c.q(bitmapPool, size.getWidth(), size.getHeight(), null, 4, null);
        b.b(regionBitmap.b(), new Rect(0, 0, iE, iD), fFloatValue, i.f653h.a(bitmapQ));
        return bitmapQ;
    }

    private static final o b(int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = f1975a;
        double dSqrt = i12 > i13 ? Math.sqrt(((double) i13) / ((double) i12)) : 1.0d;
        int i14 = (int) (((double) i10) * dSqrt);
        int i15 = (int) (((double) i11) * dSqrt);
        if (i14 == 0) {
            i14 = 1;
        }
        if (i15 == 0) {
            i15 = 1;
        }
        return new o(Float.valueOf((float) dSqrt), new Size(i14, i15));
    }

    public static final Bitmap c(Point viewSize) {
        n.h(viewSize, "viewSize");
        Size sizeE = e(viewSize);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeE.getWidth(), sizeE.getHeight(), Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static final Bitmap d(Point size) {
        n.h(size, "size");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.x, size.y, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static final Size e(Point viewSize) {
        n.h(viewSize, "viewSize");
        int iMax = Math.max(viewSize.x, viewSize.y);
        return new Size(iMax, iMax);
    }
}
