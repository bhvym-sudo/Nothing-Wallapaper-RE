package com.android.launcher3;

import android.app.ActivityManager;
import android.app.Person;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f15757a = Pattern.compile("^[\\s|\\p{javaSpaceChar}]*(.*)[\\s|\\p{javaSpaceChar}]*$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Matrix f15758b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Matrix f15759c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f15760d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Person[] f15761e = new Person[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f15762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f15763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f15764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f15765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f15766j;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f15762f = true;
        f15763g = true;
        f15764h = true;
        f15765i = i10 >= 36;
        f15766j = ActivityManager.isRunningInTestHarness();
    }

    public static float a(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int b(float f10) {
        return (int) (f10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static float c(View view, View view2, float[] fArr, boolean z9) {
        return d(view, view2, fArr, z9, false);
    }

    public static float d(View view, View view2, float[] fArr, boolean z9, boolean z10) {
        float scaleX = 1.0f;
        View view3 = view;
        while (view3 != view2 && view3 != null) {
            if (view3 != view || z9) {
                j(fArr, -view3.getScrollX(), -view3.getScrollY());
            }
            if (!z10) {
                view3.getMatrix().mapPoints(fArr);
            }
            j(fArr, view3.getLeft(), view3.getTop());
            scaleX *= view3.getScaleX();
            view3 = view3.getParent() instanceof View ? (View) view3.getParent() : null;
        }
        return scaleX;
    }

    public static String e(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            return !TextUtils.isEmpty(str3) ? str3 : str2;
        } catch (Exception unused) {
            Log.d("Launcher.Utilities", "Unable to read system properties");
        }
    }

    public static boolean f() {
        return e("sys.ldu.enable", "0").equals("1") || e("persist.sys.livedemo.enable", "0").equals("1");
    }

    public static boolean g(Resources resources) {
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    public static void h(View view, View view2, float[] fArr) {
        f15758b.reset();
        while (view != view2) {
            Matrix matrix = f15758b;
            matrix.postTranslate(-view.getScrollX(), -view.getScrollY());
            matrix.postConcat(view.getMatrix());
            matrix.postTranslate(view.getLeft(), view.getTop());
            view = (View) view.getParent();
        }
        Matrix matrix2 = f15758b;
        matrix2.postTranslate(-view.getScrollX(), -view.getScrollY());
        Matrix matrix3 = f15759c;
        matrix2.invert(matrix3);
        matrix3.mapPoints(fArr);
    }

    public static float i(float f10, float f11, float f12) {
        return f11 + (f10 * (f12 - f11));
    }

    public static void j(float[] fArr, float f10, float f11) {
        for (int i10 = 0; i10 < fArr.length; i10 += 2) {
            fArr[i10] = fArr[i10] + f10;
            int i11 = i10 + 1;
            fArr[i11] = fArr[i11] + f11;
        }
    }

    public static void k(float[] fArr, int[] iArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = Math.round(fArr[i10]);
        }
    }
}
