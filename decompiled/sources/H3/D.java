package H3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static void a(Context context, Rect rect, boolean z9) {
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        float fWidth = rect.width();
        float fHeight = rect.height();
        float fN = n(context);
        if (!z9) {
            fN = 1.0f / fN;
        }
        float f10 = (fWidth / 2.0f) / fN;
        float f11 = (fHeight / 2.0f) / fN;
        rect.set((int) (fCenterX - f10), (int) (fCenterY - f11), (int) (fCenterX + f10), (int) (fCenterY + f11));
    }

    public static void b(Context context, Point point, Rect rect) {
        a(context, rect, true);
    }

    public static Point c(Point point, Point point2, boolean z9, boolean z10) {
        if (point2.x <= point.x && point2.y <= point.y) {
            Point point3 = new Point();
            if (z9) {
                point3.x = z10 ? point.x - point2.x : 0;
            } else {
                point3.x = Math.round((point.x - point2.x) / 2.0f);
            }
            point3.y = Math.round((point.y - point2.y) / 2.0f);
            return point3;
        }
        throw new IllegalArgumentException("Inner rectangle " + point2 + " should be contained completely within the outer rectangle " + point + ".");
    }

    public static Rect d(Context context, float f10, Point point, Point point2, Point point3, int i10, int i11, boolean z9) {
        int iRound = Math.round(point.x * f10);
        int iRound2 = Math.round(point.y * f10);
        Rect rect = new Rect();
        rect.set(0, 0, iRound, iRound2);
        Rect rect2 = new Rect(i10, i11, point3.x + i10, point3.y + i11);
        int i12 = point2.x - point3.x;
        int i13 = (int) ((point2.y - point3.y) / 2.0f);
        if (z9) {
            if (o(context)) {
                rect2.left = Math.max(rect2.left - i12, rect.left);
            } else {
                rect2.right = Math.min(rect2.right + i12, rect.right);
            }
        }
        int i14 = rect2.top;
        int iMin = Math.min(i14 - Math.max(rect.top, i14 - i13), Math.min(rect.bottom, rect2.bottom + i13) - rect2.bottom);
        rect2.top -= iMin;
        rect2.bottom += iMin;
        return rect2;
    }

    public static Rect e(Context context, Point point, Point point2, Point point3, Rect rect, float f10) {
        return f(context, point, point2, point3, rect, f10, true);
    }

    public static Rect f(Context context, Point point, Point point2, Point point3, Rect rect, float f10, boolean z9) {
        return d(context, f10, point3, point2, point, (int) (rect.left * f10), (int) (rect.top * f10), z9);
    }

    public static Rect g(Context context, Display display, Point point, Rect rect, float f10) {
        return e(context, s.a().e(display), l(context.getResources(), display), point, rect, f10);
    }

    public static Point h(Resources resources, int i10, int i11, int i12, int i13) {
        int iP = resources.getConfiguration().smallestScreenWidthDp >= 720 ? (int) (i10 * p(i10, i11)) : Math.max((int) (i11 * 2.0f), i10);
        if (i12 >= i13) {
            i10 = i11;
        }
        return new Point(iP, i10);
    }

    public static float i(Point point, Point point2) {
        int i10 = point2.x;
        int i11 = point2.y;
        float f10 = i10 / i11;
        int i12 = point.x;
        int i13 = point.y;
        return f10 > ((float) i12) / ((float) i13) ? i10 / i12 : i11 / i13;
    }

    public static Rect j(Point point, Point point2) {
        PointF pointF = new PointF(point.x / 2.0f, point.y / 2.0f);
        int i10 = point2.x;
        int i11 = point2.y;
        float f10 = i10 / i11;
        int i12 = point.x;
        int i13 = point.y;
        if (f10 > i12 / i13) {
            float f11 = pointF.y;
            float f12 = (i11 / (i10 / i12)) / 2.0f;
            return new Rect(0, (int) (f11 - f12), point.x, (int) (f11 + f12));
        }
        float f13 = pointF.x;
        float f14 = (i10 / (i11 / i13)) / 2.0f;
        return new Rect((int) (f13 - f14), 0, (int) (f13 + f14), point.y);
    }

    public static void k(Rect rect, int i10, int i11) {
        if (rect.isEmpty()) {
            return;
        }
        float fMax = Math.max(i10, i11) / Math.max(rect.width(), rect.height());
        if (fMax != 1.0f) {
            rect.left = (int) ((rect.left * fMax) + 0.5f);
            rect.top = (int) ((rect.top * fMax) + 0.5f);
            rect.right = (int) ((rect.right * fMax) + 0.5f);
            rect.bottom = (int) ((rect.bottom * fMax) + 0.5f);
        }
    }

    public static Point l(Resources resources, Display display) {
        Point point = new Point();
        Point point2 = new Point();
        display.getCurrentSizeRange(point, point2);
        Math.max(point2.x, point2.y);
        Math.max(point.x, point.y);
        Point point3 = new Point();
        display.getRealSize(point3);
        return h(resources, Math.max(point3.x, point3.y), Math.min(point3.x, point3.y), display.getWidth(), display.getHeight());
    }

    public static float m(float f10, Rect rect, int i10, int i11) {
        int iRound = Math.round(rect.width() / f10);
        int iRound2 = Math.round(rect.height() / f10);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (iWidth >= i10 || iHeight >= i11) {
            return 1.0f;
        }
        if (i10 > iRound || i11 > iRound2) {
            i10 = iRound;
            i11 = i10;
        }
        float fMin = Math.min(i10 / iWidth, i11 / iHeight);
        if (fMin < 1.0f) {
            return 1.0f;
        }
        return fMin;
    }

    public static float n(Context context) {
        return context.getResources().getFloat(Resources.getSystem().getIdentifier("config_wallpaperMaxScale", "dimen", "android"));
    }

    public static boolean o(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static float p(int i10, int i11) {
        return ((i10 / i11) * (-0.30769226f)) + 1.6923077f;
    }
}
