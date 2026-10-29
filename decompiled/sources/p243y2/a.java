package p243y2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static AccessibilityManager a(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static boolean b(Context context) {
        return a(context).isEnabled();
    }

    public static boolean c(Context context, int i10) {
        return b(context);
    }

    public static void d(View view, int i10, String str) {
        if (view == null || !c(view.getContext(), i10)) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        if (!TextUtils.isEmpty(str)) {
            accessibilityEventObtain.getText().add(str);
        }
        a(view.getContext()).sendAccessibilityEvent(accessibilityEventObtain);
    }
}
