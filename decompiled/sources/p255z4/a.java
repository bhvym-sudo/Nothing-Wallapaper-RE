package p255z4;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: z4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0765a {
        void a(Canvas canvas);
    }

    public static int a(Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }
}
