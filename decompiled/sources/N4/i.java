package N4;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    static e a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? b() : new f();
        }
        return new k();
    }

    static e b() {
        return new k();
    }

    static g c() {
        return new g();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            ((h) background).U(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            f(view, (h) background);
        }
    }

    public static void f(View view, h hVar) {
        if (hVar.M()) {
            hVar.Y(com.google.android.material.internal.n.f(view));
        }
    }
}
