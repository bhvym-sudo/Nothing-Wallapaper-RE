package p087i6;

import android.content.Context;
import android.graphics.Point;
import android.provider.Settings;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f22209a = new q();

    private q() {
    }

    public static final int a(Context context, float f10) {
        n.h(context, "context");
        return (int) ((f10 / 1080) * d(context).x);
    }

    public static final int b(Context context) {
        n.h(context, "context");
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final int c(Context context, int i10) {
        n.h(context, "context");
        return a(context, context.getResources().getDimension(i10));
    }

    public static final Point d(Context context) {
        n.h(context, "context");
        Object systemService = context.getSystemService("window");
        n.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        n.g(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        return new Point(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
    }

    public static final boolean e(Context context) {
        n.h(context, "context");
        return Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1) == 2;
    }
}
