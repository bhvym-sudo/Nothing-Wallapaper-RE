package androidx.core.view;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    static class a {
        static void a(Window window, boolean z9) {
            window.setDecorFitsSystemWindows(z9);
        }
    }

    public static W a(Window window, View view) {
        return new W(window, view);
    }

    public static void b(Window window, boolean z9) {
        a.a(window, z9);
    }
}
