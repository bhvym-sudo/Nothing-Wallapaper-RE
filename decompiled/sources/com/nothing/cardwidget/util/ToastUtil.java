package com.nothing.cardwidget.util;

import android.content.Context;
import android.widget.Toast;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class ToastUtil {
    public static final ToastUtil INSTANCE = new ToastUtil();
    private static Toast toast;

    private ToastUtil() {
    }

    public final void showToast(Context context, CharSequence text) {
        n.h(context, "context");
        n.h(text, "text");
        Toast toast2 = toast;
        if (toast2 != null && toast2 != null) {
            toast2.cancel();
        }
        Toast toastMakeText = Toast.makeText(context, text, 0);
        toast = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
        }
    }
}
