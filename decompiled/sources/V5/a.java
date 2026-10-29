package V5;

import F5.l;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import com.android.launcher3.f;
import com.nothing.cardhost.g;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final Size a(Context context, int i10, int i11) {
        n.h(context, "context");
        f fVarK = ((com.android.launcher3.views.f) com.android.launcher3.views.f.y(context)).K();
        n.g(fVarK, "getDeviceProfile(...)");
        Rect rect = fVarK.f15538G;
        Size sizeC = c(fVarK, i10, i11, new Point());
        return new Size((sizeC.getWidth() - rect.left) - rect.right, (sizeC.getHeight() - rect.top) - rect.bottom);
    }

    public static final Bundle b(Context context, int i10, int i11) {
        n.h(context, "context");
        Size sizeA = a(context, i10, i11);
        Bundle bundle = new Bundle();
        bundle.putInt("span_x", i10);
        bundle.putInt("span_y", i11);
        bundle.putInt("width", sizeA.getWidth());
        bundle.putInt("height", sizeA.getHeight());
        return bundle;
    }

    private static final Size c(f fVar, int i10, int i11, Point point) {
        if (point == null) {
            point = new Point();
        }
        Point point2 = fVar.f15586w;
        int i12 = (i10 - 1) * point2.x;
        int i13 = (i11 - 1) * point2.y;
        Point point3 = fVar.f15542K;
        point.set(point3.x, point3.y);
        return new Size((i10 * point.x) + i12, (i11 * point.y) + i13);
    }

    private static final boolean d(Bundle bundle, Bundle bundle2) {
        String strE;
        if (bundle != null) {
            try {
                strE = e(bundle);
            } catch (Exception e10) {
                c.g("CardWidgetSizes", "sameOptions", e10);
                return false;
            }
        } else {
            strE = null;
        }
        return n.d(strE, e(bundle2));
    }

    private static final String e(Bundle bundle) {
        return "CardOption:" + bundle.getInt("span_x") + "," + bundle.getInt("span_y") + "," + bundle.getInt("width") + "," + bundle.getInt("height");
    }

    public static final void f(g gVar, Context context, int i10, int i11) {
        int appWidgetId;
        n.h(context, "context");
        if (gVar != null && (appWidgetId = gVar.getAppWidgetId()) > 0) {
            Bundle bundleB = b(context, i10, i11);
            l lVarA = l.f1669g.a(context);
            Bundle bundleM = lVarA.m(appWidgetId);
            if (bundleM == null || !d(bundleM, bundleB)) {
                lVarA.o(appWidgetId, bundleB);
            }
        }
    }
}
