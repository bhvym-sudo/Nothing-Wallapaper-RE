package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    static class a {
        static void a(PopupWindow popupWindow, boolean z9) {
            popupWindow.setOverlapAnchor(z9);
        }

        static void b(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z9) {
        a.a(popupWindow, z9);
    }

    public static void b(PopupWindow popupWindow, int i10) {
        a.b(popupWindow, i10);
    }

    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
