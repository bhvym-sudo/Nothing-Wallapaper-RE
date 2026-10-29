package H3;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f2475c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DisplayMetrics f2476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DisplayMetrics f2477b;

    public static g b() {
        if (f2475c == null) {
            f2475c = new g();
        }
        return f2475c;
    }

    private DisplayMetrics c(Display display) {
        if (this.f2477b == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f2477b = displayMetrics;
            e(display, displayMetrics);
        }
        return this.f2477b;
    }

    private DisplayMetrics d(Display display) {
        if (this.f2476a == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f2476a = displayMetrics;
            e(display, displayMetrics);
        }
        return this.f2476a;
    }

    private void e(Display display, DisplayMetrics displayMetrics) {
        display.getMetrics(displayMetrics);
    }

    public DisplayMetrics a(Resources resources, Display display) {
        int i10 = resources.getConfiguration().orientation;
        if (i10 == 1) {
            return d(display);
        }
        if (i10 == 2) {
            return c(display);
        }
        Log.e("DisplayMetricsRetriever", "Unknown device orientation: " + resources.getConfiguration().orientation);
        return d(display);
    }
}
