package G6;

import C6.j;
import E8.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Rect f1970a = new Rect(-1, -1, -1, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Point f1971b = new Point(778, 1740);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p167q6.b f1972c = new p167q6.b("EffectUtils");

    public static final PointF a(String str) {
        if (str == null || i.f0(str)) {
            return null;
        }
        int iD0 = i.d0(str, "x", 0, false, 6, null);
        String strSubstring = str.substring(0, iD0);
        n.g(strSubstring, "substring(...)");
        float f10 = Float.parseFloat(strSubstring);
        String strSubstring2 = str.substring(iD0 + 1);
        n.g(strSubstring2, "substring(...)");
        return new PointF(f10, Float.parseFloat(strSubstring2));
    }

    public static final Point b(String str) {
        if (str == null || i.f0(str)) {
            return null;
        }
        int iD0 = i.d0(str, "x", 0, false, 6, null);
        String strSubstring = str.substring(0, iD0);
        n.g(strSubstring, "substring(...)");
        int i10 = Integer.parseInt(strSubstring);
        String strSubstring2 = str.substring(iD0 + 1);
        n.g(strSubstring2, "substring(...)");
        return new Point(i10, Integer.parseInt(strSubstring2));
    }

    public static final Rect c(Rect rect, float f10) {
        n.h(rect, "<this>");
        if (f10 == 1.0f) {
            return rect;
        }
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        float f11 = 2;
        float fWidth = (rect.width() * f10) / f11;
        float fHeight = (rect.height() * f10) / f11;
        float f12 = iCenterX;
        float f13 = f12 - fWidth;
        float f14 = iCenterY;
        float f15 = f14 - fHeight;
        float f16 = f12 + fWidth;
        float f17 = f14 + fHeight;
        int i10 = (int) (f17 - f15);
        int i11 = (int) f17;
        int i12 = (int) f15;
        if (i10 == i11 - i12) {
            rect.top = i12;
            rect.bottom = i11;
        } else {
            rect.top = (int) Math.ceil(f15);
            rect.bottom = i11;
        }
        int i13 = (int) (f16 - f13);
        int i14 = (int) f16;
        int i15 = (int) f13;
        if (i13 == i14 - i15) {
            rect.left = i15;
            rect.right = i14;
            return rect;
        }
        rect.left = (int) Math.ceil(f13);
        rect.right = i14;
        return rect;
    }

    public static final Bitmap d(Bitmap hardware) {
        n.h(hardware, "hardware");
        if (hardware.getConfig() != Bitmap.Config.HARDWARE) {
            return hardware;
        }
        int width = hardware.getWidth();
        int height = hardware.getHeight();
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(width, height);
        n.g(canvasBeginRecording, "beginRecording(...)");
        canvasBeginRecording.drawBitmap(hardware, 0.0f, 0.0f, (Paint) null);
        picture.endRecording();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(picture, width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static final String e(PointF pointF) {
        n.h(pointF, "<this>");
        return f(pointF.x) + "x" + f(pointF.y);
    }

    public static final String f(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        String plainString = new BigDecimal(String.valueOf(f10)).setScale(8, RoundingMode.DOWN).toPlainString();
        n.g(plainString, "toPlainString(...)");
        return plainString;
    }

    public static final File g(Context context) {
        n.h(context, "context");
        File file = new File(context.getDataDir(), "effect_data");
        file.mkdirs();
        return file;
    }

    public static final Rect h() {
        return f1970a;
    }

    public static final ViewScope i(C6.g gVar, Point viewSize) {
        j jVarF;
        n.h(viewSize, "viewSize");
        if (gVar == null || (jVarF = gVar.f()) == null) {
            return null;
        }
        if (jVarF.b() == null) {
            jVarF = null;
        }
        if (jVarF == null) {
            return null;
        }
        Point pointD = gVar.f().d();
        if (pointD == null) {
            pointD = f1971b;
        }
        float fC = jVarF.c() * Math.max((viewSize.x * 1.0f) / pointD.x, (viewSize.y * 1.0f) / pointD.y);
        PointF pointFB = jVarF.b();
        n.e(pointFB);
        return new ViewScope(fC, pointFB, viewSize);
    }

    public static final Rect j(Rect rect, float f10) {
        n.h(rect, "<this>");
        if (f10 == 1.0f) {
            return rect;
        }
        rect.left = (int) (rect.left * f10);
        rect.top = (int) (rect.top * f10);
        rect.right = (int) (rect.right * f10);
        rect.bottom = (int) (rect.bottom * f10);
        return rect;
    }

    public static final float k(String str) {
        n.h(str, "str");
        if (n.d(str, "NaN")) {
            return Float.NaN;
        }
        return new BigDecimal(str).floatValue();
    }

    public static final j l(C6.b bVar) {
        n.h(bVar, "<this>");
        return new j(bVar.b().f(), bVar.b().g(), bVar.d().getCenter(), bVar.d().getViewSize());
    }
}
