package H3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static s f2527c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Point f2528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Point f2529b;

    public static s a() {
        if (f2527c == null) {
            f2527c = new s();
        }
        return f2527c;
    }

    private Point b(Display display) {
        if (this.f2529b == null) {
            this.f2529b = new Point();
        }
        f(display, this.f2529b);
        return new Point(this.f2529b);
    }

    private Point c(Display display) {
        if (this.f2528a == null) {
            this.f2528a = new Point();
        }
        f(display, this.f2528a);
        return new Point(this.f2528a);
    }

    private void f(Display display, Point point) {
        display.getRealSize(point);
    }

    public float d(Context context) {
        Point pointE = e(((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay());
        return pointE.y / pointE.x;
    }

    public Point e(Display display) {
        int i10 = Resources.getSystem().getConfiguration().orientation;
        if (i10 == 1) {
            return c(display);
        }
        if (i10 == 2) {
            return b(display);
        }
        Log.e("ScreenSizeCalculator", "Unknown device orientation: " + Resources.getSystem().getConfiguration().orientation);
        return c(display);
    }
}
