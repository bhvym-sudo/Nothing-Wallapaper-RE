package O;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a(KeyEvent keyEvent) {
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? c.f5730a.c() : c.f5730a.b();
        }
        return c.f5730a.a();
    }

    public static final boolean c(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
