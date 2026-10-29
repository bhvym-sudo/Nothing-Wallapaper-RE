package H3;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.nothing.wallpaper.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static void a(View view) {
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
        try {
            float[] cornerRadii = gradientDrawable.getCornerRadii();
            if (cornerRadii == null) {
                return;
            }
            for (int i10 = 0; i10 < cornerRadii.length; i10++) {
                cornerRadii[i10] = cornerRadii[i10] * 2.0f;
            }
            GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.mutate();
            gradientDrawable2.setCornerRadii(cornerRadii);
            view.setBackground(gradientDrawable2);
        } catch (NullPointerException unused) {
        }
    }

    private static int b(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static Point c(Activity activity) {
        Resources resources = activity.getResources();
        int iB = b(activity);
        return p(h(activity, iB), iB, resources.getDimensionPixelSize(R.dimen.grid_item_category_padding_horizontal), resources.getDimensionPixelSize(R.dimen.category_grid_edge_space));
    }

    public static Point d(Activity activity) {
        Resources resources = activity.getResources();
        int iB = b(activity);
        return p(j(activity, iB), iB, resources.getDimensionPixelSize(R.dimen.grid_item_category_padding_horizontal), resources.getDimensionPixelSize(R.dimen.category_grid_edge_space));
    }

    public static Point e(Activity activity) {
        Resources resources = activity.getResources();
        int iB = b(activity);
        return p(l(activity, iB), iB, resources.getDimensionPixelSize(R.dimen.grid_item_featured_individual_padding_horizontal), resources.getDimensionPixelSize(R.dimen.featured_wallpaper_grid_edge_space));
    }

    public static Point f(Activity activity) {
        Resources resources = activity.getResources();
        int iB = b(activity);
        return p(n(activity, iB), iB, resources.getDimensionPixelSize(R.dimen.grid_item_individual_padding_horizontal), resources.getDimensionPixelSize(R.dimen.wallpaper_grid_edge_space));
    }

    public static int g(Activity activity) {
        return h(activity, b(activity));
    }

    private static int h(Activity activity, int i10) {
        return i(activity, i10, 3, 3);
    }

    private static int i(Context context, int i10, int i11, int i12) {
        return ((int) (((float) i10) / g.b().a(context.getResources(), ((WindowManager) context.getSystemService("window")).getDefaultDisplay()).density)) < 732 ? i11 : i12;
    }

    private static int j(Activity activity, int i10) {
        return i(activity, i10, 2, 2);
    }

    public static int k(Activity activity) {
        return l(activity, b(activity));
    }

    private static int l(Activity activity, int i10) {
        return i(activity, i10, 2, 2);
    }

    public static int m(Activity activity) {
        return n(activity, b(activity));
    }

    private static int n(Activity activity, int i10) {
        return i(activity, i10, 3, 4);
    }

    public static float o(Activity activity, int i10) {
        return Y2.a.a(activity) / (s.a().e(activity.getWindowManager().getDefaultDisplay()).x / i10);
    }

    private static Point p(int i10, int i11, int i12, int i13) {
        int iRound = Math.round(((i11 - ((i12 * 2) * i10)) - (i13 * 2)) / i10);
        return new Point(iRound, iRound);
    }
}
