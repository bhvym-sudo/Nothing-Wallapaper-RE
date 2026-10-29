package com.nothing.effect.sdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class NTEffectFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18097a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static {
        System.loadLibrary("nt_effect");
    }

    private final Bitmap a(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config == config2) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(width, height);
        n.g(canvasBeginRecording, "beginRecording(...)");
        canvasBeginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        picture.endRecording();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(picture, width, height, config2);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private final native boolean doImageEffect(int i10, Bitmap bitmap, Bitmap bitmap2, Object obj);

    public final Bitmap b(Bitmap source, Bitmap out, GlassParam params) {
        n.h(source, "source");
        n.h(out, "out");
        n.h(params, "params");
        doImageEffect(0, out, a(source), params);
        return out;
    }
}
