package p176r5;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.IntBuffer;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27526a = new a();

    private a() {
    }

    public final Bitmap a(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i13;
        int[] iArr = new int[i12 * i14];
        int[] iArr2 = new int[i12 * i13];
        IntBuffer intBufferWrap = IntBuffer.wrap(iArr);
        intBufferWrap.position(0);
        GLES20.glReadPixels(i10, 0, i12, i14, 6408, 5121, intBufferWrap);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            for (int i17 = 0; i17 < i12; i17++) {
                int i18 = iArr[(i15 * i12) + i17];
                iArr2[(((i13 - i16) - 1) * i12) + i17] = (i18 & (-16711936)) | ((i18 << 16) & 16711680) | ((i18 >> 16) & 255);
            }
            i15++;
            i16++;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, i12, i13, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
