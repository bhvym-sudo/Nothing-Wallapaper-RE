package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1078j {

    /* JADX INFO: renamed from: androidx.core.view.j$a */
    public interface a {
        boolean z(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return H.g(view, keyEvent);
    }

    public static boolean b(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return aVar.z(keyEvent);
    }
}
