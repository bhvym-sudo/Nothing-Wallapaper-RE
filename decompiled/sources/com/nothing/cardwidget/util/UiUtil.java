package com.nothing.cardwidget.util;

import android.content.Context;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class UiUtil {
    public static final UiUtil INSTANCE = new UiUtil();

    private UiUtil() {
    }

    public final int dp2px(Context context, int i10) {
        n.h(context, "context");
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final boolean isDarkTheme(Context context) {
        n.h(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
