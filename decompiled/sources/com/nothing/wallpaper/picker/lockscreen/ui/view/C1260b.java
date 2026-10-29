package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1260b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1260b f19081a = new C1260b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p107k6.c f19082b = new p107k6.c("BitmapRectUtil", 4);

    private C1260b() {
    }

    public final Bitmap a(View view, float f10) {
        kotlin.jvm.internal.n.h(view, "view");
        int width = (int) (view.getWidth() * f10);
        int height = (int) (view.getHeight() * f10);
        p079h8.o oVar = (width <= 0 || height <= 0) ? new p079h8.o(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight())) : new p079h8.o(Integer.valueOf(width), Integer.valueOf(height));
        Bitmap bitmapP = f19082b.p(((Number) oVar.a()).intValue(), ((Number) oVar.b()).intValue(), Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(bitmapP);
        if (width > 0 && height > 0 && f10 != 1.0f) {
            canvas.scale(f10, f10);
        }
        view.draw(canvas);
        return bitmapP;
    }

    public final void b(Bitmap bitmap) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        if (!bitmap.isMutable() || bitmap.isRecycled()) {
            return;
        }
        f19082b.m(bitmap);
    }
}
