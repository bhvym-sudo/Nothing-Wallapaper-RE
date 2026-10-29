package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.view.Window;
import androidx.core.view.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(Window window, boolean z9, Integer num, Integer num2) {
        boolean z10 = num == null || num.intValue() == 0;
        boolean z11 = num2 == null || num2.intValue() == 0;
        if (z10 || z11) {
            int iB = D4.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z10) {
                num = Integer.valueOf(iB);
            }
            if (z11) {
                num2 = Integer.valueOf(iB);
            }
        }
        T.b(window, !z9);
        int iC = c(window.getContext(), z9);
        int iB2 = b(window.getContext(), z9);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, D4.a.h(num.intValue())));
        e(window, d(iB2, D4.a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z9) {
        if (z9) {
            return 0;
        }
        return D4.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z9) {
        if (z9) {
            return 0;
        }
        return D4.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i10, boolean z9) {
        if (D4.a.h(i10)) {
            return true;
        }
        return i10 == 0 && z9;
    }

    public static void e(Window window, boolean z9) {
        T.a(window, window.getDecorView()).c(z9);
    }

    public static void f(Window window, boolean z9) {
        T.a(window, window.getDecorView()).d(z9);
    }
}
